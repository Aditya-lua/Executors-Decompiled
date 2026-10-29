package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"", "", "r", "(Ljava/lang/String;)Ljava/lang/Double;", "s", "", "q", "(Ljava/lang/String;)Z", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/text/StringsKt")
public class C7796w extends C7795v {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX INFO: renamed from: q */
    public static final boolean m32288q(String str) {
        char c10;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        String str2;
        boolean z13;
        boolean z14 = true;
        int length = str.length() - 1;
        int i11 = 0;
        while (true) {
            c10 = ' ';
            if (i11 > length || str.charAt(i11) > ' ') {
                break;
            }
            i11++;
        }
        if (i11 > length) {
            return false;
        }
        while (length > i11 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i11) == '+' || str.charAt(i11) == '-') {
            i11++;
        }
        if (i11 > length) {
            return false;
        }
        if (str.charAt(i11) != '0') {
            z10 = true;
            z11 = false;
        } else {
            int i12 = i11 + 1;
            if (i12 > length) {
                return true;
            }
            if ((str.charAt(i12) | ' ') == 120) {
                int i13 = i11 + 2;
                int i14 = i13;
                while (true) {
                    if (i14 > length) {
                        z10 = z14;
                        break;
                    }
                    char cCharAt = str.charAt(i14);
                    z10 = z14;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i14++;
                    z14 = z10;
                }
                boolean z15 = i13 != i14 ? z10 : false;
                if (i14 <= length) {
                    if (str.charAt(i14) == '.') {
                        int i15 = i14 + 1;
                        int i16 = i15;
                        while (i16 <= length) {
                            char cCharAt2 = str.charAt(i16);
                            char c11 = c10;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i16++;
                            c10 = c11;
                        }
                        z13 = i15 != i16 ? z10 : false;
                        i14 = i16;
                    } else {
                        z13 = false;
                    }
                    if (z15 || z13) {
                        i11 = i14;
                    }
                    if (i11 != -1 || i11 > length) {
                        return false;
                    }
                    z11 = z10;
                }
                i11 = -1;
                if (i11 != -1) {
                }
                return false;
            }
            z10 = true;
            z11 = false;
        }
        if (!z11) {
            int i17 = i11;
            while (i17 <= length && ((str.charAt(i17) - '0') & 65535) < 10) {
                i17++;
            }
            boolean z16 = i11 != i17 ? z10 : false;
            if (i17 > length) {
                i11 = i17;
            } else {
                if (str.charAt(i17) == '.') {
                    int i18 = i17 + 1;
                    i10 = i18;
                    while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
                        i10++;
                    }
                    if (i18 != i10) {
                        z12 = z10;
                    }
                    if (!z16 || z12) {
                        i11 = i10;
                    } else {
                        if (length == i10 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i10 + 7 ? "Infinity" : null;
                        }
                        i11 = (str2 != null && StringsKt__StringsKt.m32170j0(str, str2, i10, false) == i10) ? length + 1 : -1;
                    }
                } else {
                    i10 = i17;
                }
                z12 = false;
                if (z16) {
                    i11 = i10;
                } else {
                    i11 = i10;
                }
            }
            if (i11 == -1) {
                return false;
            }
            if (i11 > length) {
                return z10;
            }
        }
        int i19 = i11 + 1;
        int iCharAt = str.charAt(i11) | ' ';
        if (iCharAt != (z11 ? 112 : 101)) {
            if (z11 || (!(iCharAt == 102 || iCharAt == 100) || i19 <= length)) {
                return false;
            }
            return z10;
        }
        if (i19 > length) {
            return false;
        }
        if ((str.charAt(i19) == '+' || str.charAt(i19) == '-') && (i19 = i11 + 2) > length) {
            return false;
        }
        while (i19 <= length && ((str.charAt(i19) - '0') & 65535) < 10) {
            i19++;
        }
        if (i19 > length) {
            return z10;
        }
        if (i19 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i19) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z10;
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static Double m32289r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (m32288q(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
