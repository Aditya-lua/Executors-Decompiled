package backtraceio.library.enums;

/* JADX INFO: loaded from: classes.dex */
public enum BluetoothStatus {
    NOT_PERMITTED("NotPermitted"),
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    BluetoothStatus(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
