package com.Restaurant.Restaurant_Api.service;

import com.Restaurant.Restaurant_Api.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurantList = new ArrayList<>();


    static{
        restaurantList.add(new Restaurant("Grovers", "Dwarka Mor", "9283717131", "grover@gmail.com", "Veg/NonVeg/Italian/Thai", "10", "4.5","Very Good", "20", true, true));
        restaurantList.add(new Restaurant("Aggarwal", "Uttam Nagar Mor", "92834517131", "Agr@gmail.com", "Veg/NonVeg/Italian/Thai", "15", "4.5","Very Good", "10", true, true));
        restaurantList.add(new Restaurant("KaliGhata", "Uttam Nagar", "9834517131", "KG@gmail.com", "Veg/NonVeg/Gujrati/Thai", "25", "4.5","Very Good", "30", true, true));
        restaurantList.add(new Restaurant("Picadily", "Janakpuri", "9834518931", "Picadily@gmail.com", "Veg/NonVeg/Gujrati/Thai/Chienese", "55", "4.0","Good", "40", true, true));
        restaurantList.add(new Restaurant("ShivaDhabha", "Kashmiri Gate", "9834517001", "SD@gmail.com", "Veg/NonVeg/Gujrati/", "5", "3.5","Decent", "10", true, true));

    }

    public List<Restaurant> findAll(){
        return restaurantList;
    }

    public Restaurant findRestaurantName(String restaurantName) {
        return restaurantList.stream().filter(t -> t.getRestaurantName().equals(restaurantName)).findFirst().get();
    }

    public void postRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }
}
