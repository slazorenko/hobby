public class HobbyException extends Throwable {
    private String message;
    HobbyException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
