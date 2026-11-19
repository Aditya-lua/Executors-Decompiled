package backtraceio.library.enums;

/* JADX INFO: loaded from: classes.dex */
public enum NfcStatus {
    NOT_AVAILABLE("NotAvailable"),
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    NfcStatus(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
