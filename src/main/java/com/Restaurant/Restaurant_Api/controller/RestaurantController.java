package com.Restaurant.Restaurant_Api.controller;

import com.Restaurant.Restaurant_Api.model.Restaurant;
import com.Restaurant.Restaurant_Api.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/restaurant_api")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("getAll")
    public List<Restaurant> findAllRestaurant(){
        return restaurantService.findAll();
    }
    @GetMapping("/getByRestaurantName/{restaurantName}")
    public Restaurant getRestaurantByName(@PathVariable String restaurantName){
        return restaurantService.findRestaurantName(restaurantName);
    }
    @PostMapping("/postingRestaurant")
    public void postRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.postRestaurant(restaurant);
    }

}
