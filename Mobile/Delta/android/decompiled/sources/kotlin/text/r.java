package kotlin.text;

import com.appsflyer.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "marginPrefix", "o", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "l", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "e", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class r extends n {
    public static final Function1<String, String> e(final String str) {
        return str.length() == 0 ? new Function1() { // from class: kotlin.text.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.f((String) obj);
            }
        } : new Function1() { // from class: kotlin.text.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.g(str, (String) obj);
            }
        };
    }

    public static final String f(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    public static final String g(String str, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    public static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!CharsKt__CharJVMKt.c(str.charAt(i10))) {
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

    @NotNull
    public static final String i(@NotNull String str, @NotNull final String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return iu.p.w(iu.p.x(StringsKt__StringsKt.v0(str), new Function1() { // from class: kotlin.text.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.k(indent, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    public static final String k(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (StringsKt__StringsKt.p0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    @NotNull
    public static final String l(@NotNull String str, @NotNull String newIndent) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listW0 = StringsKt__StringsKt.w0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (!StringsKt__StringsKt.p0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Integer.valueOf(h((String) obj2)));
        }
        Integer num = (Integer) CollectionsKt.s0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listW0.size());
        Function1<String, String> function1E = e(newIndent);
        int iM = kotlin.collections.p.m(listW0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listW0) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.p.t();
            }
            String str2 = (String) obj3;
            if ((i10 == 0 || i10 == iM) && StringsKt__StringsKt.p0(str2)) {
                str2 = null;
            } else {
                String strU1 = c0.u1(str2, iIntValue);
                if (strU1 != null && (strInvoke = function1E.invoke(strU1)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i12;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.j0(arrayList3, new StringBuilder(length), (R.styleable.AppCompatTheme_windowMinWidthMajor & 2) != 0 ? ", " : "\n", (R.styleable.AppCompatTheme_windowMinWidthMajor & 4) != 0 ? "" : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 8) == 0 ? null : "", (R.styleable.AppCompatTheme_windowMinWidthMajor & 16) != 0 ? -1 : 0, (R.styleable.AppCompatTheme_windowMinWidthMajor & 32) != 0 ? "..." : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 64) != 0 ? null : null)).toString();
    }

    @NotNull
    public static final String m(@NotNull String str, @NotNull String newIndent, @NotNull String marginPrefix) {
        String str2;
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.p0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listW0 = StringsKt__StringsKt.w0(str);
        int length = str.length() + (newIndent.length() * listW0.size());
        Function1<String, String> function1E = e(newIndent);
        int iM = kotlin.collections.p.m(listW0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listW0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.p.t();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM) && StringsKt__StringsKt.p0(str3)) {
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
                    if (!CharsKt__CharJVMKt.c(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (x.S(str3, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        Intrinsics.d(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = function1E.invoke(strSubstring)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.j0(arrayList, new StringBuilder(length), (R.styleable.AppCompatTheme_windowMinWidthMajor & 2) != 0 ? ", " : "\n", (R.styleable.AppCompatTheme_windowMinWidthMajor & 4) != 0 ? "" : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 8) == 0 ? null : "", (R.styleable.AppCompatTheme_windowMinWidthMajor & 16) != 0 ? -1 : 0, (R.styleable.AppCompatTheme_windowMinWidthMajor & 32) != 0 ? "..." : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 64) != 0 ? null : null)).toString();
    }

    @NotNull
    public static String n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, "");
    }

    @NotNull
    public static final String o(@NotNull String str, @NotNull String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return m(str, "", marginPrefix);
    }

    public static /* synthetic */ String p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return o(str, str2);
    }
}
