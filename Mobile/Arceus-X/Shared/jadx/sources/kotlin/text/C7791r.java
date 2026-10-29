package kotlin.text;

import com.appsflyer.C1759R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p201iu.C6988p;

/* JADX INFO: renamed from: kotlin.text.r */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"", "marginPrefix", "o", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "l", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "e", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/text/StringsKt")
public class C7791r extends C7787n {
    /* JADX INFO: renamed from: e */
    public static final Function1<String, String> m32276e(final String str) {
        return str.length() == 0 ? new Function1() { // from class: kotlin.text.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7791r.m32277f((String) obj);
            }
        } : new Function1() { // from class: kotlin.text.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7791r.m32278g(str, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static final String m32277f(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    /* JADX INFO: renamed from: g */
    public static final String m32278g(String str, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX INFO: renamed from: h */
    public static final int m32279h(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!CharsKt__CharJVMKt.m32098c(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    /* JADX DEBUG: Class process forced to load method for inline: iu.p.w(kotlin.sequences.Sequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String */
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m32280i(@NotNull String str, @NotNull final String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return C6988p.m29395w(C6988p.m29396x(StringsKt__StringsKt.m32192v0(str), new Function1() { // from class: kotlin.text.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7791r.m32282k(indent, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m32281j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return m32280i(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static final String m32282k(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (StringsKt__StringsKt.m32182p0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.collections.CollectionsKt___CollectionsKt.k0(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.Appendable */
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m32283l(@NotNull String str, @NotNull String newIndent) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listM32193w0 = StringsKt__StringsKt.m32193w0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM32193w0) {
            if (!StringsKt__StringsKt.m32182p0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Integer.valueOf(m32279h((String) obj2)));
        }
        Integer num = (Integer) CollectionsKt.m31721s0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM32193w0.size());
        Function1<String, String> function1M32276e = m32276e(newIndent);
        int iM31894m = C7699p.m31894m(listM32193w0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM32193w0) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                C7699p.m31901t();
            }
            String str2 = (String) obj3;
            if ((i10 == 0 || i10 == iM31894m) && StringsKt__StringsKt.m32182p0(str2)) {
                str2 = null;
            } else {
                String strM32212u1 = C7776c0.m32212u1(str2, iIntValue);
                if (strM32212u1 != null && (strInvoke = function1M32276e.invoke(strM32212u1)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i12;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.m31712j0(arrayList3, new StringBuilder(length), (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 2) != 0 ? ", " : "\n", (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 4) != 0 ? "" : null, (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 8) == 0 ? null : "", (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 16) != 0 ? -1 : 0, (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 32) != 0 ? "..." : null, (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 64) != 0 ? null : null)).toString();
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.text.x.S(java.lang.String, java.lang.String, int, boolean, int, java.lang.Object):boolean */
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m32284m(@NotNull String str, @NotNull String newIndent, @NotNull String marginPrefix) {
        String str2;
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.m32182p0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listM32193w0 = StringsKt__StringsKt.m32193w0(str);
        int length = str.length() + (newIndent.length() * listM32193w0.size());
        Function1<String, String> function1M32276e = m32276e(newIndent);
        int iM31894m = C7699p.m31894m(listM32193w0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM32193w0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C7699p.m31901t();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM31894m) && StringsKt__StringsKt.m32182p0(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length2 = str3.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.m32098c(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (C7797x.m32308S(str3, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        Intrinsics.m31981d(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = function1M32276e.invoke(strSubstring)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.m31712j0(arrayList, new StringBuilder(length), (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 2) != 0 ? ", " : "\n", (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 4) != 0 ? "" : null, (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 8) == 0 ? null : "", (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 16) != 0 ? -1 : 0, (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 32) != 0 ? "..." : null, (C1759R.styleable.AppCompatTheme_windowMinWidthMajor & 64) != 0 ? null : null)).toString();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static String m32285n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m32283l(str, "");
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m32286o(@NotNull String str, @NotNull String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return m32284m(str, "", marginPrefix);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m32287p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return m32286o(str, str2);
    }
}
