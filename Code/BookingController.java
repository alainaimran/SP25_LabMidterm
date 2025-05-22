public class BookingController {
    private BookingValidator validator = new BookingValidator();
    private VehicleService vehicleService = new VehicleService();
    private BookingService bookingService = new BookingService();
    private PaymentController paymentController = new PaymentController();
    private TicketService ticketService = new TicketService();

    public void createBooking(int vehicleId, int userId, String date, int seatNumber) {
    if (validator.validateUser(userId) && validator.validateDate(date) && validator.validateSeatNumber(seatNumber)) {
            if (vehicleService.isVehicleAvailable(vehicleId, date, seatNumber)) {
                int bookingId = bookingService.createBookingRecord(vehicleId, userId, date, seatNumber);
                boolean paymentStatus = paymentController.processPayment(userId, 5000.0); // sample amount

                String ticket = ticketService.generateTicket(bookingId, userId, vehicleId, date, seatNumber);
                System.out.println("Booking Confirmation: Ticket ID - " + ticket + ", Payment Success: " + paymentStatus);
            } else {
                System.out.println("Vehicle not available.");
            }
        } else {
            System.out.println("Validation failed.");
        }
    }
}
