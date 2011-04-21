package controllers;

import play.*;
import play.cache.CacheFor;
import play.mvc.*;
import play.test.Fixtures;
import util.Constant;
import util.ConvertUtil;
import util.DataBaseLoader;
import util.ItemCollection;

import java.util.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import models.*;

public class Application extends Controller {

	
    public static void index() {
    	if (Product.all().count() == 0){
    		new DataBaseLoader().load();
    	}
    	List<Product> vegetablesList = Product.all().filter("type", Constant.VEGETABLE).filter("available", Boolean.TRUE).fetch();
    	ItemCollection vegetables = ConvertUtil.toTable(vegetablesList);
    	
    	List<Product> fruitsList = Product.all().filter("type", Constant.FRUIT).filter("available", Boolean.TRUE).fetch();
    	ItemCollection fruits = ConvertUtil.toTable(fruitsList);
    	
    	List<Product> miscellaneousList = Product.all().filter("type", Constant.MISCELLANY).filter("available", Boolean.TRUE).fetch();
    	ItemCollection miscellaneous = ConvertUtil.toTable(miscellaneousList);
    	Date now = new Date();
    	render(vegetables, fruits, miscellaneous, now);
    }
    
    public static void test(){
    	List<Product> productsList = Product.all().filter("available", Boolean.TRUE).fetch();
    	ItemCollection products= ConvertUtil.toTable(productsList);
    	render(products);
    }
    public  static void newPage(){
    	render();
    }

}