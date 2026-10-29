package p588yu;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.C12918b;
import p560xu.C12924e;
import p560xu.C12927f0;
import p560xu.C12930h;
import p560xu.C12941m0;
import p560xu.C12959v0;

/* JADX INFO: renamed from: yu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001d\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006+"}, m31665d2 = {"Lxu/m0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "g", "(Lxu/m0;I[BII)Z", "Lxu/e;", "", "newline", "", "h", "(Lxu/e;J)Ljava/lang/String;", "Lxu/f0;", "options", "selectTruncated", "i", "(Lxu/e;Lxu/f0;Z)I", "v", "e", "(J)I", "Lxu/h;", "fromIndex", "toIndex", "byteCount", "b", "(Lxu/e;Lxu/h;JJII)J", "Lxu/e$a;", "unsafeCursor", "d", "(Lxu/e;Lxu/e$a;)Lxu/e$a;", "a", "[B", "f", "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13452a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final byte[] f47096a = C12959v0.m48202a("0123456789abcdef");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final long[] f47097b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX INFO: renamed from: b */
    public static final long m49052b(@NotNull C12924e c12924e, @NotNull C12930h bytes, long j10, long j11, int i10, int i11) {
        C12941m0 c12941m0;
        int i12;
        long j12 = j10;
        long size = j11;
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j13 = i11;
        C12918b.m47948b(bytes.m48089I(), i10, j13);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        if (j12 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j12 + " > " + size).toString());
        }
        if (size > c12924e.getSize()) {
            size = c12924e.getSize();
        }
        long j14 = -1;
        if (j12 == size || (c12941m0 = c12924e.head) == null) {
            return -1L;
        }
        if (c12924e.getSize() - j12 >= j12) {
            while (true) {
                long j15 = ((long) (c12941m0.limit - c12941m0.pos)) + size2;
                if (j15 > j12) {
                    break;
                }
                c12941m0 = c12941m0.next;
                Intrinsics.checkNotNull(c12941m0);
                size2 = j15;
            }
            byte[] bArrMo48109w = bytes.mo48109w();
            byte b = bArrMo48109w[i10];
            long jMin = Math.min(size, (c12924e.getSize() - j13) + 1);
            while (size2 < jMin) {
                byte[] bArr = c12941m0.data;
                int iMin = (int) Math.min(c12941m0.limit, (((long) c12941m0.pos) + jMin) - size2);
                i12 = (int) ((((long) c12941m0.pos) + j12) - size2);
                while (i12 < iMin) {
                    if (bArr[i12] != b || !m49057g(c12941m0, i12 + 1, bArrMo48109w, i10 + 1, i11)) {
                        i12++;
                    }
                }
                size2 += (long) (c12941m0.limit - c12941m0.pos);
                c12941m0 = c12941m0.next;
                Intrinsics.checkNotNull(c12941m0);
                j12 = size2;
            }
            return -1L;
        }
        size2 = c12924e.getSize();
        while (size2 > j12) {
            c12941m0 = c12941m0.prev;
            Intrinsics.checkNotNull(c12941m0);
            size2 -= (long) (c12941m0.limit - c12941m0.pos);
            j14 = j14;
        }
        long j16 = j14;
        byte[] bArrMo48109w2 = bytes.mo48109w();
        byte b10 = bArrMo48109w2[i10];
        long jMin2 = Math.min(size, (c12924e.getSize() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = c12941m0.data;
            int iMin2 = (int) Math.min(c12941m0.limit, (((long) c12941m0.pos) + jMin2) - size2);
            i12 = (int) ((((long) c12941m0.pos) + j12) - size2);
            while (i12 < iMin2) {
                if (bArr2[i12] != b10 || !m49057g(c12941m0, i12 + 1, bArrMo48109w2, i10 + 1, i11)) {
                    i12++;
                }
            }
            size2 += (long) (c12941m0.limit - c12941m0.pos);
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
            j12 = size2;
        }
        return j16;
        return ((long) (i12 - c12941m0.pos)) + size2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m49053c(C12924e c12924e, C12930h c12930h, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return m49052b(c12924e, c12930h, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? c12930h.m48089I() : i11);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C12924e.a m49054d(@NotNull C12924e c12924e, @NotNull C12924e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C12924e.a aVarM47953g = C12918b.m47953g(unsafeCursor);
        if (aVarM47953g.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarM47953g.buffer = c12924e;
        aVarM47953g.readWrite = true;
        return aVarM47953g;
    }

    /* JADX INFO: renamed from: e */
    public static final int m49055e(long j10) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j10 > f47097b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final byte[] m49056f() {
        return f47096a;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m49057g(@NotNull C12941m0 segment, int i10, @NotNull byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m49058h(@NotNull C12924e c12924e, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c12924e.m48033j(j11) == 13) {
                String strMo47998G1 = c12924e.mo47998G1(j11);
                c12924e.skip(2L);
                return strMo47998G1;
            }
        }
        String strMo47998G2 = c12924e.mo47998G1(j10);
        c12924e.skip(1L);
        return strMo47998G2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final int m49059i(@NotNull C12924e c12924e, @NotNull C12927f0 options, boolean z10) {
        int i10;
        int i11;
        C12941m0 c12941m0;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        C12941m0 c12941m1 = c12924e.head;
        if (c12941m1 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = c12941m1.data;
        int i14 = c12941m1.pos;
        int i15 = c12941m1.limit;
        int[] iArrM48070g = options.getTrie();
        C12941m0 c12941m2 = c12941m1;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrM48070g[i17];
            int i20 = i17 + 2;
            int i21 = iArrM48070g[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c12941m2 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrM48070g[i20]) {
                        i11 = iArrM48070g[i20 + i19];
                        if (i10 == i15) {
                            c12941m2 = c12941m2.next;
                            Intrinsics.checkNotNull(c12941m2);
                            i10 = c12941m2.pos;
                            bArr = c12941m2.data;
                            i15 = c12941m2.limit;
                            if (c12941m2 == c12941m1) {
                                c12941m2 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) == iArrM48070g[i20]) {
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        Intrinsics.checkNotNull(c12941m2);
                        C12941m0 c12941m3 = c12941m2.next;
                        Intrinsics.checkNotNull(c12941m3);
                        i13 = c12941m3.pos;
                        byte[] bArr2 = c12941m3.data;
                        i12 = c12941m3.limit;
                        if (c12941m3 != c12941m1) {
                            c12941m0 = c12941m3;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            c12941m0 = null;
                        }
                    } else {
                        c12941m0 = c12941m2;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = iArrM48070g[i26];
                        i10 = i13;
                        i15 = i12;
                        c12941m2 = c12941m0;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    c12941m2 = c12941m0;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m49060j(C12924e c12924e, C12927f0 c12927f0, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m49059i(c12924e, c12927f0, z10);
    }
}
