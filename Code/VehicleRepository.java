public class VehicleRepository {
    public boolean fetchAvailability(int vehicleId, String date, int seatNumber) {
        DatabaseManager.getInstance().connect();
        return true; // I've assumed that the vehicle is always available for this code only
    }
}
