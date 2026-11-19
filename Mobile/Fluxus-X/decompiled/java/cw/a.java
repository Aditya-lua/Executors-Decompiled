package cw;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import ew.e;
import java.io.EOFException;
import java.nio.charset.Charset;
import nv.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lew/e;", BuildConfig.FLAVOR, "input", BuildConfig.FLAVOR, "pos", "limit", "encodeSet", BuildConfig.FLAVOR, "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", BuildConfig.FLAVOR, "h", "(Lew/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "c", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encoded", "i", "(Lew/e;Ljava/lang/String;IIZ)V", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "f", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;II)Z", BuildConfig.FLAVOR, "[C", "getHEX_DIGITS", "()[C", "HEX_DIGITS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final char[] f11607a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @NotNull
    public static final String a(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        return d(str, i10, i11, encodeSet, z10, z11, z12, z13, null, Barcode.FORMAT_ITF, null);
    }

    public static /* synthetic */ String b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return a(str, i10, i11, str2, z10, z11, z12, z13);
    }

    @NotNull
    public static final String c(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.Z(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                e eVar = new e();
                eVar.L0(str, i10, iCharCount);
                h(eVar, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return eVar.V2();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & Barcode.FORMAT_ITF) != 0) {
            charset = null;
        }
        return c(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    public static final boolean e(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && n.z(str.charAt(i10 + 1)) != -1 && n.z(str.charAt(i12)) != -1;
    }

    @NotNull
    public static final String f(@NotNull String str, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                e eVar = new e();
                eVar.L0(str, i10, i12);
                i(eVar, str, i12, i11, z10);
                return eVar.V2();
            }
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return f(str, i10, i11, z10);
    }

    public static final void h(@NotNull e eVar, @NotNull String input, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        e eVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (z10 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                Unit unit = Unit.f21506a;
            } else {
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    eVar.D0("+");
                } else if (iCodePointAt == 43 && z12) {
                    eVar.D0(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.Z(encodeSet, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !e(input, i10, i11)))))) {
                    if (eVar2 == null) {
                        eVar2 = new e();
                    }
                    if (charset == null || Intrinsics.c(charset, Charsets.UTF_8)) {
                        eVar2.X(iCodePointAt);
                    } else {
                        eVar2.A0(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!eVar2.c2()) {
                        byte b = eVar2.readByte();
                        eVar.writeByte(37);
                        char[] cArr = f11607a;
                        eVar.writeByte(cArr[((b & 255) >> 4) & 15]);
                        eVar.writeByte(cArr[b & 15]);
                    }
                    Unit unit2 = Unit.f21506a;
                } else {
                    eVar.X(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void i(@NotNull e eVar, @NotNull String encoded, int i10, int i11, boolean z10) {
        int i12;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iZ = n.z(encoded.charAt(i10 + 1));
                int iZ2 = n.z(encoded.charAt(i12));
                if (iZ == -1 || iZ2 == -1) {
                    eVar.X(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    eVar.writeByte((iZ << 4) + iZ2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                eVar.writeByte(32);
                i10++;
            } else {
                eVar.X(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
