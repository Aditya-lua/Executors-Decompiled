package o9;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }
}
