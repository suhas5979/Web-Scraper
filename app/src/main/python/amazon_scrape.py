from bs4 import BeautifulSoup as bs
import requests as req

base_url = 'https://www.amazon.in'

# this fuction return product name from given product page
def get_product_name(content):
    block = content.find('div',{'id':'title_feature_div'})
    if block.h1 != None :
        h1 =block.h1
        if h1.find('span') :
            return h1.find('span').text.strip()

# this fuction return product MRP and price from given product page
def get_product_prices(content):
    block = content.find('div',{'id':'desktop_unifiedPrice'})
    try:
        if block.find('table'):
            table = block.find('table')
            table_rows = table.find_all('tr')

            prices = []
            for row in table_rows:
                 if row.find('td'):
                    row_data = row.find_all('td')
                    if len(row_data) ==2:
                        price_key =""
                        for data in row_data:
                            if data.find('span') and price_key !='':
                                 prices.append({price_key:data.span.text})
                            else :
                                price_key = data.text
            return prices
    except :
        return

# this function takes product page url and return product name and MRP and price
def get_product_details(product_page_url):
    page_content = req.get(product_page_url,headers={"User-Agent": "Requests"}).content
    bsoup_object = bs(page_content)
    image_url = ''
    if bsoup_object.find('img',{'id':'landingImage'}):
        image_url = bsoup_object.find('img',{'id':'landingImage'})['data-old-hires']
    useful_content = bsoup_object.find('div',{'id':'centerCol'})
    return { get_product_name(useful_content):get_product_prices(useful_content),"image":image_url,"url":product_page_url}

# this function takes a string we want to search and return a query for url
def get_search_query(search):
    template = '/s?k={}'
    query = search.replace(' ','+')
    return template.format(query)

# this function return all possible product urls that you want to search
## Helper Function
def filter_product_url(card):
    product = card.find('h2')
    if product != None and product.find('a'):
        url = product.find('a').get('href')
        return url

# this function return all possible product urls that you want to search using url that contains search query
def get_all_products_url(url):
    page_content = req.get(url,headers={"User-Agent": "Requests"}).content
    # convert into beautiful soup object
    bsoup = bs(page_content)
    product_cards = bsoup.find_all('div' , {'class': 'sg-col-inner'})
    products = []
    for card in product_cards:
        product_name = filter_product_url(card)
        if product_name is not None and product_name not in products:
            products.append(product_name)
    return products

# this function contains all logic.
# This function takes product name as parameter and written top 10 results from amazon with mrp and price
def get_products_by_name(product_name,resultNum =5):
    products_pages = get_all_products_url(base_url+get_search_query(product_name))
    products_price_details =[]
    for index ,product in enumerate(products_pages):
        if index == resultNum : break
        products_price_details.append(get_product_details(base_url+product))
    return products_price_details

# callable function
def scrape_on_amazon(name,resultNum =5) :
    return get_products_by_name(name,resultNum)
