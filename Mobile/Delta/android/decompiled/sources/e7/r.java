package e7;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u000e"}, d2 = {"Le7/r;", "", "", "first", "second", "a", "(II)J", "", "value", "b", "(J)J", "c", "(J)I", "d", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r {
    public static long a(int i10, int i11) {
        return b((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static long b(long j10) {
        return j10;
    }

    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int d(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
