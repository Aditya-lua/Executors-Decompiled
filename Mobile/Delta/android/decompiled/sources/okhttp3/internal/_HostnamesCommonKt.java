package okhttp3.internal;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.x;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a0\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0000\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "canParseAsIpAddress", "", "", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "decodeIpv6", "", "input", "pos", "", "limit", "decodeIpv4Suffix", "address", "addressOffset", "inet6AddressToAscii", "canonicalizeInetAddress", "isMappedIpv4Address", "inet4AddressToAscii", "toCanonicalHost", "idnToAscii", "host", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class _HostnamesCommonKt {

    @NotNull
    private static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.f(str);
    }

    @NotNull
    public static final byte[] canonicalizeInetAddress(@NotNull byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return isMappedIpv4Address(address) ? m.d0(address, kotlin.ranges.d.q(12, 16)) : address;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(@NotNull String str) {
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

    public static final boolean containsInvalidLabelLengths(@NotNull String str) {
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

    public static final boolean decodeIpv4Suffix(@NotNull String input, int i10, int i11, @NotNull byte[] address, int i12) {
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
    public static final byte[] decodeIpv6(@NotNull String input, int i10, int i11) {
        int i12;
        int i13;
        int hexDigit;
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
                    hexDigit = _UtilCommonKt.parseHexDigit(input.charAt(i14));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + hexDigit;
                    i14++;
                }
                i13 = i14 - i17;
                if (i13 != 0) {
                }
                return null;
            }
            if (i15 != 0) {
                if (!x.S(input, ":", i14, false, 4, null)) {
                    if (!x.S(input, ".", i14, false, 4, null) || !decodeIpv4Suffix(input, i17, i11, bArr, i15 - 2)) {
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
                hexDigit = _UtilCommonKt.parseHexDigit(input.charAt(i14));
                if (hexDigit != -1) {
                    break;
                }
                i12 = (i12 << 4) + hexDigit;
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
            l.f(bArr, bArr, 16 - (i15 - i16), i16, i15);
            l.o(bArr, (byte) 0, i16, (16 - i15) + i16);
        }
        return bArr;
    }

    @Nullable
    public static final String idnToAscii(@NotNull String host) throws EOFException {
        Intrinsics.checkNotNullParameter(host, "host");
        e eVarC0 = new e().C0(host);
        e eVar = new e();
        while (!eVarC0.Z1()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(eVarC0.A2(), eVar)) {
                return null;
            }
        }
        eVarC0.C0(_NormalizeJvmKt.normalizeNfc(eVar.R2()));
        Punycode punycode = Punycode.INSTANCE;
        String strDecode = punycode.decode(eVarC0.R2());
        if (strDecode != null && Intrinsics.c(strDecode, _NormalizeJvmKt.normalizeNfc(strDecode))) {
            return punycode.encode(strDecode);
        }
        return null;
    }

    @NotNull
    public static final String inet4AddressToAscii(@NotNull byte[] address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (address.length == 4) {
            return new e().z1(_UtilCommonKt.and(address[0], 255)).writeByte(46).z1(_UtilCommonKt.and(address[1], 255)).writeByte(46).z1(_UtilCommonKt.and(address[2], 255)).writeByte(46).z1(_UtilCommonKt.and(address[3], 255)).R2();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @NotNull
    public static final String inet6AddressToAscii(@NotNull byte[] address) {
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
        e eVar = new e();
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
                eVar.D2((_UtilCommonKt.and(address[i11], 255) << 8) | _UtilCommonKt.and(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return eVar.R2();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
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
    public static final String toCanonicalHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.a0(str, ":", false, 2, null)) {
            String strIdnToAscii = idnToAscii(str);
            if (strIdnToAscii == null || strIdnToAscii.length() == 0 || containsInvalidHostnameAsciiCodes(strIdnToAscii) || containsInvalidLabelLengths(strIdnToAscii)) {
                return null;
            }
            return strIdnToAscii;
        }
        byte[] bArrDecodeIpv6 = (x.T(str, "[", false, 2, null) && x.D(str, "]", false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (bArrDecodeIpv6 == null) {
            return null;
        }
        byte[] bArrCanonicalizeInetAddress = canonicalizeInetAddress(bArrDecodeIpv6);
        if (bArrCanonicalizeInetAddress.length == 16) {
            return inet6AddressToAscii(bArrCanonicalizeInetAddress);
        }
        if (bArrCanonicalizeInetAddress.length == 4) {
            return inet4AddressToAscii(bArrCanonicalizeInetAddress);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
