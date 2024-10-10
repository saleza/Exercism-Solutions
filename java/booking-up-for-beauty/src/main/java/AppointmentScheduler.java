import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription, formatter);
        return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return (appointmentDate.isBefore(LocalDateTime.now())) ? true : false;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18) ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        String period = (hour >= 12) ? " PM." : " AM.";
        if (hour == 0) {
            hour = 12; // minuit devient 12 AM
        } else if (hour > 12) {
            hour -= 12; // convertir au format 12 heures
        }

        String minutes = String.format("%02d", appointmentDate.getMinute());
        String dayOfWeek = appointmentDate.getDayOfWeek().toString().toLowerCase();
        dayOfWeek = dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1);
        String month = appointmentDate.getMonth().toString().toLowerCase();
        month = month.substring(0, 1).toUpperCase() + month.substring(1);

        return "You have an appointment on " + dayOfWeek + ", " + month + " " + appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", at " + hour + ":" + minutes + period;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(2024, 9, 15);
    }
}
