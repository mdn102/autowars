# Java Car Dealership App

## Overview:

The purpose of this assignment is to create a car dealership console application. Through the commands line, you'll be able to create a Factory that will ingest orders for vehicles from a JSON file and build the vehicles. You'll be able to create a Dealership, purchase cars from the Factory, and sell them from your Dealership for a profit.

## Factory (String name):

### Properties:

- String name

  - The name of the Factory

- Vehicle[] readyToShip
  - A list of Vehicles that have been built and are ready to be shipped to the Dealership

### Methods:

- String loadJson()

  - This method reads a JSON file and returns a JSON String that you can then convert to Java objects using a library such as Gson.

- Vehicle[] buildVehicles(String json)

  - This method takes a JSON string containing an array of orders and processes each order, building the Vehicles and returning a list of manufactured Vehicles.

    You will need to also replace the value of the costToDealership key to 80% of the value of the price key.

## Dealership (String name, BigDecimal startingBalance)

### Properties

- String name

  - The name of the Dealership

- BigDecimal balance

  - The amount of money that the Dealership currently has

- Vehicle[] carLot

  - A list of Vehicles that the Dealership currently owns

- Receipt[] salesHistory
  - A list of sales receipts from Vehicles sold to customers

### Methods

- void purchaseVehicles(Factory factory)

  - Purchase Vehicles from the Factory and add them to the Dealership's inventory

    - a vehicle should not be added to the dealership's carLot if 3 of that vehicle's model are already in the lot

    - for each vehicle that gets added to the carLot, the dealership's balance should be reduced by the value of that vehicle's costToDealership property

- boolean checkInsurance(Vehicle vehicle)

  - Check the insurance of a Vehicle in the lot to make sure it's up to date
    - if the lastInsured Date on the Vehicle is older than 30 days, the insurance should be renewed

- boolean checkMaintenance(Vehicle vehicle)

  - Check the maintenance of a Vehicle in the lot to see if it needs to be serviced
    - if the lastServiced Date on the Vehicle is older than 90 days, the vehicle should be serviced

- void renewInsurance(Vehicle vehicle)

  - Renew insurance on a Vehicle if the insurance is expired
    - update the value on the provided vehicle's lastInsured property to today's current date
    - generate a random number between 100-300 and use it as the insuranceCost
    - the cost of renewing the insurance should be taken out of the dealership's balance
    - the value of the vehicle's costToDealership property should be increased by the cost of renewing the insurance

- void serviceVehicle(Vehicle vehicle)

  - Service a Vehicle if it is due for maintenance
    - update the value on the provided vehicle's lastServiced property to today's current date
    - generate a random number between 100-2000 and use it as the maintenanceCost
    - the cost of maintenance should be taken out of the dealership's balance
    - the cost of maintenance should be added to the vehicle's costToDealership property

- void refuelVehicle(Vehicle vehicle)

  - Refuel a Vehicle if it's low on fuel
    - the vehicle's fuel property should be increased to equal the fuelCapacity property
    - for electric vehicles, the fuel capacity is always 100

- void washVehicle(Vehicle vehicle)

  - Wash a Vehicle if it's dirty
    - set the value of the vehicle's clean property to true
    - increase the value vehicle's costToDealership property by 10
    - decrease the value of the dealership's balance property by 10

- void testDriveVehicle(Vehicle vehicle)

  - Let a customer take a Vehicle for a test drive (make sure it's clean fueled, insured, and serviced first!)

- void sellVehicle(Vehicle vehicle, Customer customer)
  - Sell a Vehicle from the Dealership
    - the vehicle to be sold should be washed using the dealership's wash method if it's property clean is false
    - the dealership's balance should be increased by the value of the vehicle's price property
    - the customer should have a property added to it called vehicle and its value will be the vehicle being sold
    - a Receipt containing the details of the sale should be created and added to the Dealership's salesHistory
    - finally, the vehicle that has been sold should be removed from the carLot array

## Vehicle (JsonObject order)

The Vehicle class constructor takes a JsonObject as a parameter and sets all the necessary properties on the Vehicle based on the properties found on the JsonObject

- String type - the value of this string will represent what kind of vehicle it is.
- String vin - a vehicle identification number (it's still a string datatype).
- String make - a string representing the make of the vehicle.
- String model - a string representing the model of the vehicle.
- String color - a string representing the color of the vehicle.
- int year - a number representing the year the vehicle was created.
- int wheels - a number representing the number of wheels a vehicle has
- int mileage - a number representing how many miles a vehicle has travelled.
- int fuel - the amount of fuel currently in the vehicle
  - for gasoline vehicles this is the number of gallons
  - for electric vehicles it will be battery percentage
- int fuelCapacity - the amount of fuel the vehicle can hold
  - for gasoline vehicles this is the number of gallons
  - for electric vehicles it will always be `100`
- BigDecimal price - a number displaying the price that the vehicle will be sold at to customers of the dealership.
- String description - a brief description of the vehicle using the vehicles color, year, make, model and mileage.
- BigDecimal costToDealership - this number represents the overall amount of money a dealership has invested in a vehicle.
- boolean clean - this boolean represents if a car is clean or not. (true === clean)
- Date lastInsured - a date reflecting the last time the vehicle's insurance was renewed
- Date lastServiced - a date reflecting the last time the vehicle had maintenance done

## Vehicle Subclasses

## Car

int mpg - the gas mileage of the Car

## Motorcycle

int mpg - the gas mileage of the Motorcycle

## Truck

int mpg - the gas mileage of the Truck
int towingCapacity - the towing capacity (in pounds) of the Truck

## EV (electric vehicle)

int range: the range (in miles) of the EV

## Customer

### Properties

- String name
- String address
- String phone
- Vehicle vehicle
  - the vehicle property should be null until the Customer has purchased a Vehicle

## Receipt

### Properties

- Vehicle vehicle
  - the details of the Vehicle that was purchased
- Customer customer
  - the details of the Customer who made the purchase
