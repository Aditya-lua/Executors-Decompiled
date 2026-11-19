package nv;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import ew.j0;
import ew.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001d\u001a\u00020\f*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\f*\u00020\u001bH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010(\u001a\u00020\f*\u00020&2\u0006\u0010'\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010+\u001a\u00020\f*\u00020*2\u0006\u0010'\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010.\u001a\u00020-*\u00020\f2\u0006\u0010'\u001a\u00020-H\u0080\u0004¢\u0006\u0004\b.\u0010/\u001a\u001b\u00103\u001a\u000202*\u0002002\u0006\u00101\u001a\u00020\fH\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00106\u001a\u00020\f*\u000205H\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u00109\u001a\u00020\f*\u0002082\u0006\u0010(\u001a\u00020&H\u0000¢\u0006\u0004\b9\u0010:\u001a\u001d\u0010;\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010<\u001a\u0019\u0010>\u001a\u00020-*\u00020\u00012\u0006\u0010=\u001a\u00020-¢\u0006\u0004\b>\u0010?\u001a\u001d\u0010@\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b@\u0010<\u001a\u0015\u0010C\u001a\u000202*\u00060Aj\u0002`B¢\u0006\u0004\bC\u0010D\u001a\u001b\u0010H\u001a\u00020\b*\u00020E2\u0006\u0010G\u001a\u00020FH\u0000¢\u0006\u0004\bH\u0010I\u001a\u001b\u0010K\u001a\u000202*\u00020E2\u0006\u0010J\u001a\u00020FH\u0000¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010N\u001a\u000202*\u00020E2\u0006\u0010M\u001a\u00020FH\u0000¢\u0006\u0004\bN\u0010L\u001a'\u0010Q\u001a\u000202\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010P\u001a\u00028\u0000H\u0000¢\u0006\u0004\bQ\u0010R\u001a)\u0010X\u001a\u00020W*\u00060Sj\u0002`T2\u0010\u0010V\u001a\f\u0012\b\u0012\u00060Sj\u0002`T0UH\u0000¢\u0006\u0004\bX\u0010Y\u001a'\u0010]\u001a\u0002022\u0006\u0010Z\u001a\u00020-2\u0006\u0010[\u001a\u00020-2\u0006\u0010\\\u001a\u00020-H\u0000¢\u0006\u0004\b]\u0010^\u001a7\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\u0004\b\u0000\u0010_2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000`2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000`H\u0000¢\u0006\u0004\ba\u0010b\"\u0014\u0010e\u001a\u00020c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bQ\u0010d\"\u001a\u0010j\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010g\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", BuildConfig.FLAVOR, "n", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", BuildConfig.FLAVOR, "o", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "g", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "q", "(Ljava/lang/String;II)I", "s", "E", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "k", "(Ljava/lang/String;Ljava/lang/String;II)I", BuildConfig.FLAVOR, "delimiter", "j", "(Ljava/lang/String;CII)I", "p", "(Ljava/lang/String;)I", "name", "y", "(Ljava/lang/String;)Z", "z", "(C)I", BuildConfig.FLAVOR, "mask", "b", "(BI)I", BuildConfig.FLAVOR, "c", "(SI)I", BuildConfig.FLAVOR, "d", "(IJ)J", "Lew/f;", "medium", BuildConfig.FLAVOR, "H", "(Lew/f;I)V", "Lew/g;", "A", "(Lew/g;)I", "Lew/e;", "B", "(Lew/e;B)I", "u", "(Ljava/lang/String;I)I", "defaultValue", "C", "(Ljava/lang/String;J)J", "D", "Ljava/io/Closeable;", "Lokio/Closeable;", "f", "(Ljava/io/Closeable;)V", "Lew/k;", "Lew/b0;", "file", "x", "(Lew/k;Lew/b0;)Z", "path", "i", "(Lew/k;Lew/b0;)V", "directory", "h", BuildConfig.FLAVOR, "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "suppressed", BuildConfig.FLAVOR, "G", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "arrayLength", "offset", "count", "e", "(JJJ)V", "T", BuildConfig.FLAVOR, "v", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", BuildConfig.FLAVOR, "[B", "EMPTY_BYTE_ARRAY", "Lew/z;", "Lew/z;", "m", "()Lew/z;", "UNICODE_BOMS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f26636a = new byte[0];

    @NotNull
    public static final z b;

    static {
        z.Companion companion = z.INSTANCE;
        ew.h.Companion companion2 = ew.h.INSTANCE;
        b = companion.d(companion2.b("efbbbf"), companion2.b("feff"), companion2.b("fffe0000"), companion2.b("fffe"), companion2.b("0000feff"));
    }

    public static final int A(@NotNull ew.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return b(gVar.readByte(), 255) | (b(gVar.readByte(), 255) << 16) | (b(gVar.readByte(), 255) << 8);
    }

    public static final int B(@NotNull ew.e eVar, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i10 = 0;
        while (!eVar.c2() && eVar.o(0L) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final long C(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int D(@Nullable String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    @NotNull
    public static final String E(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iQ = q(str, i10, i11);
        String strSubstring = str.substring(iQ, s(str, iQ, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String F(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return E(str, i10, i11);
    }

    @NotNull
    public static final Throwable G(@NotNull Exception exc, @NotNull List<? extends Exception> suppressed) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            zt.a.a(exc, it.next());
        }
        return exc;
    }

    public static final void H(@NotNull ew.f fVar, int i10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
    }

    public static final <E> void a(@NotNull List<E> list, E e10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s8, int i10) {
        return s8 & i10;
    }

    public static final long d(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void f(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] g(@NotNull String[] strArr, @NotNull String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[p001kotlin.collections.m.M(strArr2)] = value;
        return strArr2;
    }

    public static final void h(@NotNull ew.k kVar, @NotNull b0 directory) throws IOException {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(directory, "directory");
        try {
            IOException iOException = null;
            for (b0 b0Var : kVar.n(directory)) {
                try {
                    if (kVar.o(b0Var).getIsDirectory()) {
                        h(kVar, b0Var);
                    }
                    kVar.h(b0Var);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(@NotNull ew.k kVar, @NotNull b0 path) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            kVar.h(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(@NotNull String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int k(@NotNull String str, @NotNull String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.Z(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int l(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return j(str, c10, i10, i11);
    }

    @NotNull
    public static final z m() {
        return b;
    }

    public static final boolean n(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int o(@NotNull String[] strArr, @NotNull String value, @NotNull Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int p(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.f(cCharAt, 31) <= 0 || Intrinsics.f(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int q(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return q(str, i10, i11);
    }

    public static final int s(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int t(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return s(str, i10, i11);
    }

    public static final int u(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    @NotNull
    public static final <T> List<T> v(@NotNull Iterable<? extends T> a10, @NotNull Iterable<? extends T> b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Iterator<? extends T> it = a10.iterator();
        Iterator<? extends T> it2 = b10.iterator();
        List listC = p001kotlin.collections.o.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return p001kotlin.collections.o.a(listC);
            }
            if (it.hasNext()) {
                listC.add(it.next());
            }
            if (it2.hasNext()) {
                listC.add(it2.next());
            }
        }
    }

    @NotNull
    public static final String[] w(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038  */
    public static final boolean x(@NotNull ew.k kVar, @NotNull b0 file) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        j0 j0VarS = kVar.s(file);
        try {
            try {
                kVar.h(file);
                if (j0VarS != null) {
                    try {
                        j0VarS.close();
                    } catch (Throwable unused) {
                    }
                }
                return true;
            } catch (IOException unused2) {
                Unit unit = Unit.f21506a;
                if (j0VarS != null) {
                    try {
                        j0VarS.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (th2 != null) {
                            throw th2;
                        }
                        kVar.h(file);
                        return false;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    throw th2;
                }
                kVar.h(file);
                return false;
            }
        } catch (Throwable th4) {
            if (j0VarS != null) {
                try {
                    j0VarS.close();
                } catch (Throwable th5) {
                    zt.a.a(th4, th5);
                }
            }
            th2 = th4;
            if (th2 != null) {
                throw th2;
            }
            kVar.h(file);
            return false;
        }
    }

    public static final boolean y(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return x.E(name, "Authorization", true) || x.E(name, "Cookie", true) || x.E(name, "Proxy-Authorization", true) || x.E(name, "Set-Cookie", true);
    }

    public static final int z(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }
}
