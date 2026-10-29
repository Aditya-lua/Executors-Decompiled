package p560xu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import p588yu.C13453b;

/* JADX INFO: renamed from: xu.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\n*\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\n*\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010)\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u001a\u0010-\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m31665d2 = {"", "size", "offset", "byteCount", "", "b", "(JJJ)V", "", "j", "(S)S", "", "h", "(I)I", "i", "(J)J", "", "a", "aOffset", "bOffset", "", "([BI[BII)Z", "", "", "k", "(B)Ljava/lang/String;", "l", "(I)Ljava/lang/String;", "Lxu/e$a;", "unsafeCursor", "g", "(Lxu/e$a;)Lxu/e$a;", "Lxu/h;", "position", "e", "(Lxu/h;I)I", "sizeParam", "f", "([BI)I", "Lxu/e$a;", "d", "()Lxu/e$a;", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12918b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12924e.a f45807a = new C12924e.a();

    /* JADX INFO: renamed from: b */
    public static final int f45808b = -1234567890;

    /* JADX INFO: renamed from: a */
    public static final boolean m47947a(@NotNull byte[] a10, int i10, @NotNull byte[] b, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final void m47948b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m47949c() {
        return f45808b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C12924e.a m47950d() {
        return f45807a;
    }

    /* JADX INFO: renamed from: e */
    public static final int m47951e(@NotNull C12930h c12930h, int i10) {
        Intrinsics.checkNotNullParameter(c12930h, "<this>");
        return i10 == f45808b ? c12930h.m48089I() : i10;
    }

    /* JADX INFO: renamed from: f */
    public static final int m47952f(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i10 == f45808b ? bArr.length : i10;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C12924e.a m47953g(@NotNull C12924e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f45807a ? new C12924e.a() : unsafeCursor;
    }

    /* JADX INFO: renamed from: h */
    public static final int m47954h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* JADX INFO: renamed from: i */
    public static final long m47955i(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    /* JADX INFO: renamed from: j */
    public static final short m47956j(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m47957k(byte b) {
        return C7797x.m32310v(new char[]{C13453b.m49064d()[(b >> 4) & 15], C13453b.m49064d()[b & 15]});
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m47958l(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {C13453b.m49064d()[(i10 >> 28) & 15], C13453b.m49064d()[(i10 >> 24) & 15], C13453b.m49064d()[(i10 >> 20) & 15], C13453b.m49064d()[(i10 >> 16) & 15], C13453b.m49064d()[(i10 >> 12) & 15], C13453b.m49064d()[(i10 >> 8) & 15], C13453b.m49064d()[(i10 >> 4) & 15], C13453b.m49064d()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return C7797x.m32311w(cArr, i11, 8);
    }
}
