package nv;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mv.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.collections.u;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.CharsKt;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010!\u001a\u001b\u0010&\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010!\u001a\u001d\u0010)\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0000*\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\u0003*\u000202H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\u00020\u00002\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\"\u00020\u0003H\u0000¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lmv/y;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "l", "(Lmv/y;I)Ljava/lang/String;", "q", "name", BuildConfig.FLAVOR, "r", "(Lmv/y;Ljava/lang/String;)Ljava/util/List;", BuildConfig.FLAVOR, "Lkotlin/Pair;", "k", "(Lmv/y;)Ljava/util/Iterator;", "Lmv/y$a;", "m", "(Lmv/y;)Lmv/y$a;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "f", "(Lmv/y;Ljava/lang/Object;)Z", "h", "(Lmv/y;)I", "p", "(Lmv/y;)Ljava/lang/String;", BuildConfig.FLAVOR, "namesAndValues", "i", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "b", "(Lmv/y$a;Ljava/lang/String;Ljava/lang/String;)Lmv/y$a;", "headers", "c", "(Lmv/y$a;Lmv/y;)Lmv/y$a;", "d", "n", "(Lmv/y$a;Ljava/lang/String;)Lmv/y$a;", "o", "g", "(Lmv/y$a;Ljava/lang/String;)Ljava/lang/String;", "e", "(Lmv/y$a;)Lmv/y;", BuildConfig.FLAVOR, "s", "(Ljava/lang/String;)V", "t", "(Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "a", "(C)Ljava/lang/String;", "inputNamesAndValues", "j", "([Ljava/lang/String;)Lmv/y;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final String a(char c10) {
        String string = Integer.toString(c10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    @NotNull
    public static final y.a b(@NotNull y.a aVar, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s(name);
        t(value, name);
        d(aVar, name, value);
        return aVar;
    }

    @NotNull
    public static final y.a c(@NotNull y.a aVar, @NotNull y headers) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            d(aVar, headers.c(i10), headers.g(i10));
        }
        return aVar;
    }

    @NotNull
    public static final y.a d(@NotNull y.a aVar, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.h().add(name);
        aVar.h().add(StringsKt.n1(value).toString());
        return aVar;
    }

    @NotNull
    public static final y e(@NotNull y.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new y((String[]) aVar.h().toArray(new String[0]));
    }

    public static final boolean f(@NotNull y yVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return (obj instanceof y) && Arrays.equals(yVar.getNamesAndValues(), ((y) obj).getNamesAndValues());
    }

    @Nullable
    public static final String g(@NotNull y.a aVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = aVar.h().size() - 2;
        int iC = iu.c.c(size, 0, -2);
        if (iC > size) {
            return null;
        }
        while (!x.E(name, aVar.h().get(size), true)) {
            if (size == iC) {
                return null;
            }
            size -= 2;
        }
        return aVar.h().get(size + 1);
    }

    public static final int h(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Arrays.hashCode(yVar.getNamesAndValues());
    }

    @Nullable
    public static final String i(@NotNull String[] namesAndValues, @NotNull String name) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int iC = iu.c.c(length, 0, -2);
        if (iC > length) {
            return null;
        }
        while (!x.E(name, namesAndValues[length], true)) {
            if (length == iC) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    @NotNull
    public static final y j(@NotNull String... inputNamesAndValues) {
        Intrinsics.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = StringsKt.n1(inputNamesAndValues[i11]).toString();
        }
        int iC = iu.c.c(0, strArr.length - 1, 2);
        if (iC >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                s(str);
                t(str2, str);
                if (i10 == iC) {
                    break;
                }
                i10 += 2;
            }
        }
        return new y(strArr);
    }

    @NotNull
    public static final Iterator<Pair<String, String>> k(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        int size = yVar.size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = s.a(yVar.c(i10), yVar.g(i10));
        }
        return p001kotlin.jvm.internal.c.a(pairArr);
    }

    @NotNull
    public static final String l(@NotNull y yVar, int i10) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        String str = (String) p001kotlin.collections.m.O(yVar.getNamesAndValues(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    @NotNull
    public static final y.a m(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        y.a aVar = new y.a();
        u.A(aVar.h(), yVar.getNamesAndValues());
        return aVar;
    }

    @NotNull
    public static final y.a n(@NotNull y.a aVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        while (i10 < aVar.h().size()) {
            if (x.E(name, aVar.h().get(i10), true)) {
                aVar.h().remove(i10);
                aVar.h().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    @NotNull
    public static final y.a o(@NotNull y.a aVar, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s(name);
        t(value, name);
        aVar.i(name);
        d(aVar, name, value);
        return aVar;
    }

    @NotNull
    public static final String p(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = yVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = yVar.c(i10);
            String strG = yVar.g(i10);
            sb2.append(strC);
            sb2.append(": ");
            if (n.y(strC)) {
                strG = "██";
            }
            sb2.append(strG);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @NotNull
    public static final String q(@NotNull y yVar, int i10) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        String str = (String) p001kotlin.collections.m.O(yVar.getNamesAndValues(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    @NotNull
    public static final List<String> r(@NotNull y yVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = yVar.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (x.E(name, yVar.c(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(yVar.g(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? p001kotlin.collections.p.k() : listUnmodifiableList;
    }

    public static final void s(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + a(cCharAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    public static final void t(@NotNull String value, @NotNull String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(a(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(n.y(name) ? BuildConfig.FLAVOR : ": " + value);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
