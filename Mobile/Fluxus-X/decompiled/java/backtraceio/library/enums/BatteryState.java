package backtraceio.library.enums;

/* JADX INFO: loaded from: classes.dex */
public enum BatteryState {
    CHARGING("Charging"),
    UNKNOWN("Unknown"),
    FULL("Full"),
    UNPLUGGED("Unplugged");

    private final String text;

    BatteryState(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
