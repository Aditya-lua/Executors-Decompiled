package p100eb;

import java.io.IOException;

/* JADX INFO: renamed from: eb.y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5042y3 extends IOException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5042y3(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5042y3(String str, Throwable th2) {
        super("Error in decoding CborValue from bytes", th2);
    }
}
