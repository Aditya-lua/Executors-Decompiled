package nv;

import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001d¨\u0006\u001f"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)Z", "d", "c", "input", BuildConfig.FLAVOR, "pos", "limit", BuildConfig.FLAVOR, "f", "(Ljava/lang/String;II)[B", "address", "addressOffset", "e", "(Ljava/lang/String;II[BI)Z", "i", "([B)Ljava/lang/String;", "b", "([B)[B", "j", "([B)Z", "h", "k", "(Ljava/lang/String;)Ljava/lang/String;", "host", "g", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f26635a = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f26635a.f(str);
    }

    @NotNull
    public static final byte[] b(@NotNull byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return j(address) ? p001kotlin.collections.m.d0(address, p001kotlin.ranges.d.q(12, 16)) : address;
    }

    public static final boolean c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.f(cCharAt, 31) <= 0 || Intrinsics.f(cCharAt, 127) >= 0 || StringsKt.m0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iM0 = StringsKt.m0(str2, '.', i10, false, 4, null);
                int length2 = iM0 == -1 ? str2.length() - i10 : iM0 - i10;
                if (1 <= length2 && length2 < 64) {
                    if (iM0 == -1 || iM0 == str2.length() - 1) {
                        break;
                    }
                    i10 = iM0 + 1;
                    str = str2;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean e(@NotNull String input, int i10, int i11, @NotNull byte[] address, int i12) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = input.charAt(i14);
                if (Intrinsics.f(cCharAt, 48) < 0 || Intrinsics.f(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:1: B:30:0x0069->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x007b A[EDGE_INSN: B:53:0x007b->B:34:0x007b BREAK  A[LOOP:1: B:30:0x0069->B:33:0x0075], SYNTHETIC] */
    @Nullable
    public static final byte[] f(@NotNull String input, int i10, int i11) {
        int i12;
        int i13;
        int iZ;
        input = input;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i14 < i11) {
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && x.S(input, "::", i14, false, 4, null)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                if (i18 == i11) {
                    i16 = i15;
                    break;
                }
                i16 = i15;
                i17 = i18;
                i12 = 0;
                i14 = i17;
                while (i14 < i11) {
                    iZ = n.z(input.charAt(i14));
                    if (iZ != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iZ;
                    i14++;
                }
                i13 = i14 - i17;
                if (i13 != 0) {
                }
                return null;
            }
            if (i15 != 0) {
                if (!x.S(input, ":", i14, false, 4, null)) {
                    if (!x.S(input, ".", i14, false, 4, null) || !e(input, i17, i11, bArr, i15 - 2)) {
                        return null;
                    }
                    i15 += 2;
                    break;
                }
                i14++;
            }
            i17 = i14;
            i12 = 0;
            i14 = i17;
            while (i14 < i11) {
                iZ = n.z(input.charAt(i14));
                if (iZ != -1) {
                    break;
                }
                i12 = (i12 << 4) + iZ;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i19 = i15 + 1;
            bArr[i15] = (byte) ((i12 >>> 8) & 255);
            i15 += 2;
            bArr[i19] = (byte) (i12 & 255);
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            p001kotlin.collections.l.f(bArr, bArr, 16 - (i15 - i16), i16, i15);
            p001kotlin.collections.l.o(bArr, (byte) 0, i16, (16 - i15) + i16);
        }
        return bArr;
    }

    @Nullable
    public static final String g(@NotNull String host) throws EOFException {
        Intrinsics.checkNotNullParameter(host, "host");
        ew.e eVarD0 = new ew.e().D0(host);
        ew.e eVar = new ew.e();
        while (!eVarD0.c2()) {
            if (!wv.b.a().c(eVarD0.E2(), eVar)) {
                return null;
            }
        }
        eVarD0.D0(m.a(eVar.V2()));
        wv.d dVar = wv.d.f36016a;
        String strC = dVar.c(eVarD0.V2());
        if (strC != null && Intrinsics.c(strC, m.a(strC))) {
            return dVar.e(strC);
        }
        return null;
    }

    @NotNull
    public static final String h(@NotNull byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (address.length == 4) {
            return new ew.e().A1(n.b(address[0], 255)).writeByte(46).A1(n.b(address[1], 255)).writeByte(46).A1(n.b(address[2], 255)).writeByte(46).A1(n.b(address[3], 255)).V2();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @NotNull
    public static final String i(@NotNull byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        ew.e eVar = new ew.e();
        while (i11 < address.length) {
            if (i11 == i10) {
                eVar.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    eVar.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    eVar.writeByte(58);
                }
                eVar.H2((n.b(address[i11], 255) << 8) | n.b(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return eVar.V2();
    }

    public static final boolean j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    @Nullable
    public static final String k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.a0(str, ":", false, 2, null)) {
            String strG = g(str);
            if (strG == null || strG.length() == 0 || c(strG) || d(strG)) {
                return null;
            }
            return strG;
        }
        byte[] bArrF = (x.T(str, "[", false, 2, null) && x.D(str, "]", false, 2, null)) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (bArrF == null) {
            return null;
        }
        byte[] bArrB = b(bArrF);
        if (bArrB.length == 16) {
            return i(bArrB);
        }
        if (bArrB.length == 4) {
            return h(bArrB);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
