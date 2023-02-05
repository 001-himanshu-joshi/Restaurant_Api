package com.Restaurant.Restaurant_Api.model;

import java.util.Locale;

public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private String restaurantEmailAddress;
    private String foodCategory;
    private String publicRating;
    private String publicReviews;
    private String numberOfTables;
    private String numberOfStaff;
    private Boolean homeDelivery;
    private Boolean parkingAvailability;

    public Restaurant(String restaurantName, String restaurantAddress, String restaurantNumber, String restaurantEmailAddress, String foodCategory, String numberOfTables, String publicRating, String publicReviews, String numberOfStaff, Boolean homeDelivery, Boolean parkingAvailability) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.restaurantEmailAddress = restaurantEmailAddress;
        this.foodCategory = foodCategory;
        this.numberOfTables = numberOfTables;
        this.publicRating = publicRating;
        this.publicReviews = publicReviews;
        this.numberOfStaff = numberOfStaff;
        this.homeDelivery = homeDelivery;
        this.parkingAvailability = parkingAvailability;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getRestaurantEmailAddress() {
        return restaurantEmailAddress;
    }

    public void setRestaurantEmailAddress(String restaurantEmailAddress) {
        this.restaurantEmailAddress = restaurantEmailAddress;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(String numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public String getPublicRating() {
        return publicRating;
    }

    public void setPublicRating(String publicRating) {
        this.publicRating = publicRating;
    }

    public String getPublicReviews() {
        return publicReviews;
    }

    public void setPublicReviews(String publicReviews) {
        this.publicReviews = publicReviews;
    }

    public String getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(String numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public Boolean getHomeDelivery() {
        return homeDelivery;
    }

    public void setHomeDelivery(Boolean homeDelivery) {
        this.homeDelivery = homeDelivery;
    }

    public Boolean getParkingAvailability() {
        return parkingAvailability;
    }

    public void setParkingAvailability(Boolean parkingAvailability) {
        this.parkingAvailability = parkingAvailability;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantNumber='" + restaurantNumber + '\'' +
                ", restaurantEmailAddress='" + restaurantEmailAddress + '\'' +
                ", foodCategory='" + foodCategory + '\'' +
                ", publicRating='" + publicRating + '\'' +
                ", publicReviews='" + publicReviews + '\'' +
                ", numberOfTables='" + numberOfTables + '\'' +
                ", numberOfStaff='" + numberOfStaff + '\'' +
                ", homeDelivery=" + homeDelivery +
                ", parkingAvailability=" + parkingAvailability +
                '}';
    }
}
