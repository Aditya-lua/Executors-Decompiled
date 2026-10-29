package yu;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu.f0;
import xu.m0;
import xu.v0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001d\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006+"}, d2 = {"Lxu/m0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "g", "(Lxu/m0;I[BII)Z", "Lxu/e;", "", "newline", "", "h", "(Lxu/e;J)Ljava/lang/String;", "Lxu/f0;", "options", "selectTruncated", "i", "(Lxu/e;Lxu/f0;Z)I", "v", "e", "(J)I", "Lxu/h;", "fromIndex", "toIndex", "byteCount", "b", "(Lxu/e;Lxu/h;JJII)J", "Lxu/e$a;", "unsafeCursor", "d", "(Lxu/e;Lxu/e$a;)Lxu/e$a;", "a", "[B", "f", "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f36351a = v0.a("0123456789abcdef");

    @NotNull
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long b(@NotNull xu.e eVar, @NotNull xu.h bytes, long j10, long j11, int i10, int i11) {
        m0 m0Var;
        int i12;
        long j12 = j10;
        long size = j11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j13 = i11;
        xu.b.b(bytes.I(), i10, j13);
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
        if (size > eVar.getSize()) {
            size = eVar.getSize();
        }
        long j14 = -1;
        if (j12 == size || (m0Var = eVar.head) == null) {
            return -1L;
        }
        if (eVar.getSize() - j12 >= j12) {
            while (true) {
                long j15 = ((long) (m0Var.limit - m0Var.pos)) + size2;
                if (j15 > j12) {
                    break;
                }
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                size2 = j15;
            }
            byte[] bArrW = bytes.w();
            byte b10 = bArrW[i10];
            long jMin = Math.min(size, (eVar.getSize() - j13) + 1);
            while (size2 < jMin) {
                byte[] bArr = m0Var.data;
                int iMin = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + jMin) - size2);
                i12 = (int) ((((long) m0Var.pos) + j12) - size2);
                while (i12 < iMin) {
                    if (bArr[i12] != b10 || !g(m0Var, i12 + 1, bArrW, i10 + 1, i11)) {
                        i12++;
                    }
                }
                size2 += (long) (m0Var.limit - m0Var.pos);
                m0Var = m0Var.next;
                Intrinsics.checkNotNull(m0Var);
                j12 = size2;
            }
            return -1L;
        }
        size2 = eVar.getSize();
        while (size2 > j12) {
            m0Var = m0Var.prev;
            Intrinsics.checkNotNull(m0Var);
            size2 -= (long) (m0Var.limit - m0Var.pos);
            j14 = j14;
        }
        long j16 = j14;
        byte[] bArrW2 = bytes.w();
        byte b11 = bArrW2[i10];
        long jMin2 = Math.min(size, (eVar.getSize() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = m0Var.data;
            int iMin2 = (int) Math.min(m0Var.limit, (((long) m0Var.pos) + jMin2) - size2);
            i12 = (int) ((((long) m0Var.pos) + j12) - size2);
            while (i12 < iMin2) {
                if (bArr2[i12] != b11 || !g(m0Var, i12 + 1, bArrW2, i10 + 1, i11)) {
                    i12++;
                }
            }
            size2 += (long) (m0Var.limit - m0Var.pos);
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
            j12 = size2;
        }
        return j16;
        return ((long) (i12 - m0Var.pos)) + size2;
    }

    public static /* synthetic */ long c(xu.e eVar, xu.h hVar, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return b(eVar, hVar, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? hVar.I() : i11);
    }

    @NotNull
    public static final xu.e.a d(@NotNull xu.e eVar, @NotNull xu.e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        xu.e.a aVarG = xu.b.g(unsafeCursor);
        if (aVarG.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.buffer = eVar;
        aVarG.readWrite = true;
        return aVarG;
    }

    public static final int e(long j10) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j10 > b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    @NotNull
    public static final byte[] f() {
        return f36351a;
    }

    public static final boolean g(@NotNull m0 segment, int i10, @NotNull byte[] bytes, int i11, int i12) {
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
    public static final String h(@NotNull xu.e eVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.j(j11) == 13) {
                String strG1 = eVar.G1(j11);
                eVar.skip(2L);
                return strG1;
            }
        }
        String strG2 = eVar.G1(j10);
        eVar.skip(1L);
        return strG2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int i(@NotNull xu.e eVar, @NotNull f0 options, boolean z10) {
        int i10;
        int i11;
        m0 m0Var;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        m0 m0Var2 = eVar.head;
        if (m0Var2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = m0Var2.data;
        int i14 = m0Var2.pos;
        int i15 = m0Var2.limit;
        int[] iArrG = options.getTrie();
        m0 m0Var3 = m0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrG[i17];
            int i20 = i17 + 2;
            int i21 = iArrG[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (m0Var3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrG[i20]) {
                        i11 = iArrG[i20 + i19];
                        if (i10 == i15) {
                            m0Var3 = m0Var3.next;
                            Intrinsics.checkNotNull(m0Var3);
                            i10 = m0Var3.pos;
                            bArr = m0Var3.data;
                            i15 = m0Var3.limit;
                            if (m0Var3 == m0Var2) {
                                m0Var3 = null;
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
                if ((bArr[i14] & 255) == iArrG[i20]) {
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        Intrinsics.checkNotNull(m0Var3);
                        m0 m0Var4 = m0Var3.next;
                        Intrinsics.checkNotNull(m0Var4);
                        i13 = m0Var4.pos;
                        byte[] bArr2 = m0Var4.data;
                        i12 = m0Var4.limit;
                        if (m0Var4 != m0Var2) {
                            m0Var = m0Var4;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            m0Var = null;
                        }
                    } else {
                        m0Var = m0Var3;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = iArrG[i26];
                        i10 = i13;
                        i15 = i12;
                        m0Var3 = m0Var;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    m0Var3 = m0Var;
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

    public static /* synthetic */ int j(xu.e eVar, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(eVar, f0Var, z10);
    }
}
