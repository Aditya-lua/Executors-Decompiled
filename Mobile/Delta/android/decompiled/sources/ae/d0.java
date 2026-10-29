package ae;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends RuntimeException {
    public d0(String str) {
        super(str);
    }

    public d0(String str, Throwable th2) {
        super("Failed to initialize FileStorage", th2);
    }
}
