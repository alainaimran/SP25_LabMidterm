public class BookingValidator {
    public boolean validateUser(int userId) {
        return userId > 0;
    }
    public boolean validateDate(String date) {
        return date != null && !date.isEmpty();
    }
    public boolean validateSeatNumber(int seatNumber) {
        return seatNumber > 0;
    }
}
