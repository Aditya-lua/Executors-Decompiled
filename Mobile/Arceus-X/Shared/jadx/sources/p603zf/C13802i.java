package p603zf;

import androidx.annotation.NonNull;
import p128ff.C5595j;

/* JADX INFO: renamed from: zf.i */
/* JADX INFO: loaded from: classes2.dex */
public class C13802i extends C5595j {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final a f48417a;

    /* JADX INFO: renamed from: zf.i$a */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13802i(@NonNull a aVar) {
        this.f48417a = aVar;
    }

    public C13802i(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f48417a = aVar;
    }
}
