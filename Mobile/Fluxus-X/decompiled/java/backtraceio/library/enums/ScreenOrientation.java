package backtraceio.library.enums;

/* JADX INFO: loaded from: classes.dex */
public enum ScreenOrientation {
    PORTRAIT("Portrait"),
    LANDSCAPE("Landscape"),
    UNDEFINED("Unknown");

    private final String text;

    ScreenOrientation(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
