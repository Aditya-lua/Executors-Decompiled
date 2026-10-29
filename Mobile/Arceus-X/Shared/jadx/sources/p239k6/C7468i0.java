package p239k6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12931h0;

/* JADX INFO: renamed from: k6.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m31665d2 = {"", "scheme", "authority", "path", "query", "fragment", "separator", "Lk6/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk6/h0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "(Ljava/lang/String;Ljava/lang/String;)Lk6/h0;", "data", "original", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk6/h0;", "", "bytes", "h", "(Ljava/lang/String;[B)Ljava/lang/String;", "", "f", "(Lk6/h0;)Ljava/util/List;", "pathSegments", "d", "(Lk6/h0;)Ljava/lang/String;", "filePath", "", "e", "(Ljava/lang/String;)I", "length", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7468i0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C7466h0 m31022a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new C7466h0(m31024c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C7466h0 m31023b(String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            str6 = C12931h0.f45835c;
        }
        return m31022a(str, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: renamed from: c */
    public static final String m31024c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
            sb2.append(':');
        }
        if (str2 != null) {
            sb2.append("//");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append('?');
            sb2.append(str4);
        }
        if (str5 != null) {
            sb2.append('#');
            sb2.append(str5);
        }
        return sb2.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m31025d(@NotNull C7466h0 c7466h0) {
        List<String> listM31027f = m31027f(c7466h0);
        if (listM31027f.isEmpty()) {
            return null;
        }
        String path = c7466h0.getPath();
        Intrinsics.checkNotNull(path);
        return CollectionsKt.m31715m0(listM31027f, c7466h0.getSeparator(), C7797x.m32309T(path, c7466h0.getSeparator(), false, 2, null) ? c7466h0.getSeparator() : "", null, 0, null, null, 60, null);
    }

    /* JADX INFO: renamed from: e */
    public static final int m31026e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<String> m31027f(@NotNull C7466h0 c7466h0) {
        String path = c7466h0.getPath();
        if (path == null) {
            return C7699p.m31892k();
        }
        ArrayList arrayList = new ArrayList();
        int iM0 = -1;
        while (iM0 < path.length()) {
            int i10 = iM0 + 1;
            iM0 = StringsKt.m32176m0(path, '/', i10, false, 4, null);
            if (iM0 == -1) {
                iM0 = path.length();
            }
            String strSubstring = path.substring(i10, iM0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final C7466h0 m31028g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z10 = true;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        while (i15 < str.length()) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i12 == -1 && i10 == -1) {
                            i12 = i15 + 1;
                        }
                    } else if (z10 && i12 == -1 && i10 == -1) {
                        int i16 = i15 + 2;
                        if (i16 < str2.length() && str2.charAt(i15 + 1) == '/' && str2.charAt(i16) == '/') {
                            i13 = i15 + 3;
                            z10 = false;
                            i14 = i15;
                            i15 = i16;
                        } else if (Intrinsics.m31980c(str, str2)) {
                            i11 = i15 + 1;
                            i14 = i15;
                            i15 = i11;
                            i13 = i15;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i15;
                    z10 = false;
                }
            } else if (i10 == -1) {
                i10 = i15 + 1;
            }
            i15++;
        }
        int iMin = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, str.length());
        int iMin2 = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, iMin);
        if (i13 != -1) {
            strSubstring2 = str.substring(0, i14);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            strSubstring = str.substring(i13, Math.min(i11 != -1 ? i11 : Integer.MAX_VALUE, iMin2));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i11 != -1) {
            strSubstring3 = str.substring(i11, iMin2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i12 != -1) {
            strSubstring4 = str.substring(i12, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i10 != -1) {
            strSubstring5 = str.substring(i10, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(m31026e(strSubstring2), Math.max(m31026e(strSubstring), Math.max(m31026e(strSubstring3), Math.max(m31026e(strSubstring4), m31026e(strSubstring5))))) - 2)];
        return new C7466h0(str, str3, strSubstring2 != null ? m31029h(strSubstring2, bArr) : null, strSubstring != null ? m31029h(strSubstring, bArr) : null, strSubstring3 != null ? m31029h(strSubstring3, bArr) : null, strSubstring4 != null ? m31029h(strSubstring4, bArr) : null, strSubstring5 != null ? m31029h(strSubstring5, bArr) : null);
    }

    /* JADX INFO: renamed from: h */
    public static final String m31029h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i10 = 0;
        int iMax = Math.max(0, length - 2);
        int i11 = 0;
        while (true) {
            if (i10 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i10) == '%') {
                    int i12 = i10 + 3;
                    try {
                        String strSubstring = str.substring(i10 + 1, i12);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        bArr2[i11] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
                        i11++;
                        bArr = bArr2;
                        i10 = i12;
                    } catch (NumberFormatException unused) {
                        bArr2[i11] = (byte) str.charAt(i10);
                        i11++;
                        i10++;
                        bArr = bArr2;
                    }
                }
            } else {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    return C7797x.m32290A(bArr, 0, i11, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
            bArr = bArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final C7466h0 m31030i(@NotNull String str, @NotNull String str2) {
        String str3;
        String str4;
        if (Intrinsics.m31980c(str2, "/")) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = C7797x.m32303N(str3, str4, "/", false, 4, null);
        }
        return m31028g(str, str3, str4);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C7466h0 m31031j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = C12931h0.f45835c;
        }
        return m31030i(str, str2);
    }
}
