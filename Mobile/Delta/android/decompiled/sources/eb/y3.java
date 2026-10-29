package eb;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends IOException {
    public y3(String str) {
        super(str);
    }

    public y3(String str, Throwable th2) {
        super("Error in decoding CborValue from bytes", th2);
    }
}
