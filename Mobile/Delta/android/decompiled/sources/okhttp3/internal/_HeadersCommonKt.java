package okhttp3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.x;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000b0\n*\u00020\u0002H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a%\u0010\u0014\u001a\u0004\u0018\u00010\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002H\u0000\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u001e\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0001*\u00020\r2\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\f\u0010 \u001a\u00020\u0002*\u00020\rH\u0000\u001a\u0010\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\f\u0010$\u001a\u00020\u0001*\u00020%H\u0002\u001a!\u0010&\u001a\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001H\u0000¢\u0006\u0002\u0010(\u001a\u0018\u0010)\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010*H\u0000¨\u0006+"}, d2 = {"commonName", "", "Lokhttp3/Headers;", "index", "", "commonValue", "commonValues", "", "name", "commonIterator", "", "Lkotlin/Pair;", "commonNewBuilder", "Lokhttp3/Headers$Builder;", "commonEquals", "", "other", "", "commonHashCode", "commonToString", "commonHeadersGet", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "commonAdd", "value", "commonAddAll", "headers", "commonAddLenient", "commonRemoveAll", "commonSet", "commonGet", "commonBuild", "headersCheckName", "", "headersCheckValue", "charCode", "", "commonHeadersOf", "inputNamesAndValues", "([Ljava/lang/String;)Lokhttp3/Headers;", "commonToHeaders", "", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class _HeadersCommonKt {
    private static final String charCode(char c10) {
        String string = Integer.toString(c10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    @NotNull
    public static final Headers.Builder commonAdd(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        headersCheckName(name);
        headersCheckValue(value, name);
        commonAddLenient(builder, name, value);
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonAddAll(@NotNull Headers.Builder builder, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            commonAddLenient(builder, headers.name(i10), headers.value(i10));
        }
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonAddLenient(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.getNamesAndValues$okhttp().add(name);
        builder.getNamesAndValues$okhttp().add(StringsKt.p1(value).toString());
        return builder;
    }

    @NotNull
    public static final Headers commonBuild(@NotNull Headers.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return new Headers((String[]) builder.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final boolean commonEquals(@NotNull Headers headers, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        return (obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues(), ((Headers) obj).getNamesAndValues());
    }

    @Nullable
    public static final String commonGet(@NotNull Headers.Builder builder, @NotNull String name) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int iC = rt.c.c(size, 0, -2);
        if (iC > size) {
            return null;
        }
        while (!x.E(name, builder.getNamesAndValues$okhttp().get(size), true)) {
            if (size == iC) {
                return null;
            }
            size -= 2;
        }
        return builder.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final int commonHashCode(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        return Arrays.hashCode(headers.getNamesAndValues());
    }

    @Nullable
    public static final String commonHeadersGet(@NotNull String[] namesAndValues, @NotNull String name) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int iC = rt.c.c(length, 0, -2);
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
    public static final Headers commonHeadersOf(@NotNull String... inputNamesAndValues) {
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
            strArr[i11] = StringsKt.p1(inputNamesAndValues[i11]).toString();
        }
        int iC = rt.c.c(0, strArr.length - 1, 2);
        if (iC >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i10 == iC) {
                    break;
                }
                i10 += 2;
            }
        }
        return new Headers(strArr);
    }

    @NotNull
    public static final Iterator<Pair<String, String>> commonIterator(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        int size = headers.size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = s.a(headers.name(i10), headers.value(i10));
        }
        return kotlin.jvm.internal.c.a(pairArr);
    }

    @NotNull
    public static final String commonName(@NotNull Headers headers, int i10) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        String str = (String) m.O(headers.getNamesAndValues(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    @NotNull
    public static final Headers.Builder commonNewBuilder(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Headers.Builder builder = new Headers.Builder();
        u.A(builder.getNamesAndValues$okhttp(), headers.getNamesAndValues());
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonRemoveAll(@NotNull Headers.Builder builder, @NotNull String name) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        while (i10 < builder.getNamesAndValues$okhttp().size()) {
            if (x.E(name, builder.getNamesAndValues$okhttp().get(i10), true)) {
                builder.getNamesAndValues$okhttp().remove(i10);
                builder.getNamesAndValues$okhttp().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonSet(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        headersCheckName(name);
        headersCheckValue(value, name);
        builder.removeAll(name);
        commonAddLenient(builder, name, value);
        return builder;
    }

    @NotNull
    public static final Headers commonToHeaders(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = StringsKt.p1(key).toString();
            String string2 = StringsKt.p1(value).toString();
            headersCheckName(string);
            headersCheckValue(string2, string);
            strArr[i10] = string;
            strArr[i10 + 1] = string2;
            i10 += 2;
        }
        return new Headers(strArr);
    }

    @NotNull
    public static final String commonToString(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = headers.name(i10);
            String strValue = headers.value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @NotNull
    public static final String commonValue(@NotNull Headers headers, int i10) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        String str = (String) m.O(headers.getNamesAndValues(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    @NotNull
    public static final List<String> commonValues(@NotNull Headers headers, @NotNull String name) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = headers.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (x.E(name, headers.name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.value(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? p.k() : listUnmodifiableList;
    }

    public static final void headersCheckName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + charCode(cCharAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    public static final void headersCheckValue(@NotNull String value, @NotNull String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(charCode(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(_UtilCommonKt.isSensitiveHeader(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
