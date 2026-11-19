package backtraceio.library.enums;

/* JADX INFO: loaded from: classes.dex */
public enum LocationStatus {
    DISABLED("Disabled"),
    ENABLED("Enabled");

    private final String text;

    LocationStatus(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
