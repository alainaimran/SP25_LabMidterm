public class VehicleService {
    private VehicleRepository repository = new VehicleRepository();

    public boolean isVehicleAvailable(int vehicleId, String date, int seatNumber) {
        return repository.fetchAvailability(vehicleId, date, seatNumber);
    }
}
