public class BookingService {
    public int createBookingRecord(int vehicleId, int userId, String date, int seatNumber) {
        DatabaseManager.getInstance().connect();
        return (int) (Math.random() * 10000); // Return random booking ID
    }
}

