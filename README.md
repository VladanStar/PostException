
# PostException
Create a hierarchy of exceptions related to the entry of Shipments. Each shipment has a name, weight, address, city, zip code and phone number. If it happens that the city has less than 2 characters, the CityNot ValidException should happen. If the zip code does not have 5 numbers, the Zip Code is not valid. All Exception related to a shipment should inherit ShipmentException. Test the operation of exceptions through the startup class.
