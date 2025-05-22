public class TicketService {
    public String generateTicket(int bookingId, int userId, int vehicleId, String date, int seatNumber) {
        DatabaseManager.getInstance().connect();
        return "TICKET-" + bookingId;
    }
}

