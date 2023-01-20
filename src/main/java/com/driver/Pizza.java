package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int Cheese;
    private int Topping;
    boolean isExtraToppingsAdded;
    boolean isExtraCheeseAdded;
    boolean isBagTakeAway;
    boolean isBillgenrated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBagTakeAway=false;
        this.isBillgenrated=false;
        this.isBagTakeAway=false;
        this.isExtraCheeseAdded=false;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.Topping=70;
        }
        else {
            this.price=400;
            this.Topping=120;
        }
        this.Cheese=80;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price+=Cheese;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
              this.price+=Topping;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBagTakeAway){
            this.price+=20;
            isBagTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillgenrated) {
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: " +this.Cheese+ "\n";
            if(isExtraToppingsAdded)
                this.bill += "Extra Toppings Added: "+this.Topping+ "\n";
            if(isBagTakeAway)
                this.bill+= "Paperbag Added: "+"20"+"\n";
            this.bill+= "Total Price: "+this.price+"\n";
            isBillgenrated=true;
        }
        return this.bill;
    }
}
