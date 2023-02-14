public enum NotesOnKeyboard {
    C5(523.25),
    D5(587.33),
    E5(695.255),
    G5(783.99),
    A5(880d);

    final double hertz;

    NotesOnKeyboard(double hertz) {
        this.hertz = hertz;
    }
}
