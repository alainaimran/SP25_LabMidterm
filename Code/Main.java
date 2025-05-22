public class Main {
    public static void main(String[] args) {
     
        BookingController bookingController = new BookingController();

        
        int vehicleId = 101;
        int userId = 501;
        String date = "2025-05-23";
        int seatNumber = 2;

        
        bookingController.createBooking(vehicleId, userId, date, seatNumber);
    }
}
