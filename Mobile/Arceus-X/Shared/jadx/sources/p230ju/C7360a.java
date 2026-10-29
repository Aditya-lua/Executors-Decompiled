package p230ju;

import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ju.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\" \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"", "a", "Z", "()Z", "durationAssertionsEnabled", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "b", "[Ljava/lang/ThreadLocal;", "precisionFormats", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7360a {

    /* JADX INFO: renamed from: a */
    public static final boolean f28266a = false;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ThreadLocal<DecimalFormat>[] f28267b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f28267b = threadLocalArr;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m30532a() {
        return f28266a;
    }
}
