class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 800;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    void showRentalDetails() {
        System.out.println(customerName + " rented " + carModel + " for " +
                rentalDays + " days. Total Cost: Rs." + calculateTotalCost());
    }
}
