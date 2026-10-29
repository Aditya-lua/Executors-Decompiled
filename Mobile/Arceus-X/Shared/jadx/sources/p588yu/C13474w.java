package p588yu;

import java.util.GregorianCalendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yu.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011*\f\b\u0000\u0010\u0014\"\u00020\u00132\u00020\u0013¨\u0006\u0015"}, m31665d2 = {"", "year", "month", "day", "hour", "minute", "second", "", "a", "(IIIIII)J", "I", "b", "()I", "DEFAULT_COMPRESSION", "", "[B", "c", "()[B", "EMPTY_BYTE_ARRAY", "Ljava/util/zip/CRC32;", "CRC32", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13474w {

    /* JADX INFO: renamed from: a */
    public static final int f47187a = -1;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final byte[] f47188b = new byte[0];

    /* JADX INFO: renamed from: a */
    public static final long m49159a(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    /* JADX INFO: renamed from: b */
    public static final int m49160b() {
        return f47187a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final byte[] m49161c() {
        return f47188b;
    }
}
