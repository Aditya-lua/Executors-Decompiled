package p096e7;

import kotlin.Metadata;

/* JADX INFO: renamed from: e7.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u000e"}, m31665d2 = {"Le7/r;", "", "", "first", "second", "a", "(II)J", "", "value", "b", "(J)J", "c", "(J)I", "d", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4872r {
    /* JADX INFO: renamed from: a */
    public static long m23478a(int i10, int i11) {
        return m23479b((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: renamed from: b */
    public static long m23479b(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: c */
    public static final int m23480c(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: d */
    public static final int m23481d(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
