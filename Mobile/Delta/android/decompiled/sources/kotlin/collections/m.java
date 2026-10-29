package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"\u001a'\u0010\u0000\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0000\u0010#\u001a\u0019\u0010$\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010&\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010,\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b.\u0010/\u001a!\u00100\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b0\u0010\u001d\u001a+\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002\"\b\b\u0000\u0010\u0000*\u000201*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b3\u00104\u001a?\u00107\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u000105\"\b\b\u0001\u0010\u0000*\u000201*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u00106\u001a\u00028\u0000¢\u0006\u0004\b7\u00108\u001a\u0019\u0010;\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001aC\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010?\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000=j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`>¢\u0006\u0004\b@\u0010A\u001aA\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010?\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000=j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`>¢\u0006\u0004\bB\u0010C\u001a9\u0010D\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u000005*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u00106\u001a\u00028\u0001¢\u0006\u0004\bD\u00108\u001a%\u0010E\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bE\u00104\u001a\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001302*\u00020\u0012¢\u0006\u0004\bF\u0010G\u001a%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bI\u00104\u001a\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130H*\u00020\u0012¢\u0006\u0004\bJ\u0010G\u001a%\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000K\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bL\u0010M\u001aJ\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O02\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010(*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bP\u0010Q\u001a\u007f\u0010^\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010T*\u00060Rj\u0002`S*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010U\u001a\u00028\u00012\b\b\u0002\u0010W\u001a\u00020V2\b\b\u0002\u0010X\u001a\u00020V2\b\b\u0002\u0010Y\u001a\u00020V2\b\b\u0002\u0010Z\u001a\u00020\u000f2\b\b\u0002\u0010[\u001a\u00020V2\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020V\u0018\u00010\\¢\u0006\u0004\b^\u0010_\u001aq\u0010`\u001a\u00028\u0000\"\f\b\u0000\u0010T*\u00060Rj\u0002`S*\u00020\u00062\u0006\u0010U\u001a\u00028\u00002\b\b\u0002\u0010W\u001a\u00020V2\b\b\u0002\u0010X\u001a\u00020V2\b\b\u0002\u0010Y\u001a\u00020V2\b\b\u0002\u0010Z\u001a\u00020\u000f2\b\b\u0002\u0010[\u001a\u00020V2\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020V\u0018\u00010\\¢\u0006\u0004\b`\u0010a\u001ai\u0010c\u001a\u00020b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010W\u001a\u00020V2\b\b\u0002\u0010X\u001a\u00020V2\b\b\u0002\u0010Y\u001a\u00020V2\b\b\u0002\u0010Z\u001a\u00020\u000f2\b\b\u0002\u0010[\u001a\u00020V2\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020V\u0018\u00010\\¢\u0006\u0004\bc\u0010d\u001a[\u0010e\u001a\u00020b*\u00020\u00062\b\b\u0002\u0010W\u001a\u00020V2\b\b\u0002\u0010X\u001a\u00020V2\b\b\u0002\u0010Y\u001a\u00020V2\b\b\u0002\u0010Z\u001a\u00020\u000f2\b\b\u0002\u0010[\u001a\u00020V2\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020V\u0018\u00010\\¢\u0006\u0004\be\u0010f\u001a%\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000g\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bT\u0010h\u001a%\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000i\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bj\u0010k\u001a\u0011\u0010l\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\bl\u0010\u001b\"#\u0010o\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"T", "", "element", "", "G", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "C", "([BB)Z", "", "", "H", "([SS)Z", "", "", "E", "([II)Z", "", "", "F", "([JJ)Z", "", "", "D", "([CC)Z", "K", "([I)I", "L", "([Ljava/lang/Object;)Ljava/lang/Object;", "index", "O", "([Ljava/lang/Object;I)Ljava/lang/Object;", "N", "([II)Ljava/lang/Integer;", "([Ljava/lang/Object;Ljava/lang/Object;)I", "P", "([BB)I", "U", "([SS)I", "R", "([II)I", "S", "([JJ)I", "Q", "([CC)I", "b0", "([C)C", "c0", "", "", "I", "([Ljava/lang/Object;)Ljava/util/List;", "", "destination", "J", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "d0", "([BLkotlin/ranges/IntRange;)[B", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "e0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "f0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "h0", "j0", "i0", "([J)Ljava/util/List;", "", "l0", "k0", "", "m0", "([Ljava/lang/Object;)Ljava/util/Set;", "other", "Lkotlin/Pair;", "n0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "W", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "V", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "Y", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "X", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "Lkotlin/sequences/Sequence;", "B", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "g0", "M", "([Ljava/lang/Object;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class m extends l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/m$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Iterable<T>, au.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f22503a;

        public a(Object[] objArr) {
            this.f22503a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.c.a(this.f22503a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/m$b", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f22504a;

        public b(Object[] objArr) {
            this.f22504a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.c.a(this.f22504a);
        }
    }

    @NotNull
    public static <T> Iterable<T> A(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? p.k() : new a(tArr);
    }

    @NotNull
    public static <T> Sequence<T> B(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? iu.m.g() : new b(tArr);
    }

    public static boolean C(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return P(bArr, b10) >= 0;
    }

    public static boolean D(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Q(cArr, c10) >= 0;
    }

    public static boolean E(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return R(iArr, i10) >= 0;
    }

    public static boolean F(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return S(jArr, j10) >= 0;
    }

    public static <T> boolean G(@NotNull T[] tArr, T t8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return T(tArr, t8) >= 0;
    }

    public static boolean H(@NotNull short[] sArr, short s8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return U(sArr, s8) >= 0;
    }

    @NotNull
    public static <T> List<T> I(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) J(tArr, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C J(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t8 : tArr) {
            if (t8 != null) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static int K(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static <T> T L(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static <T> int M(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    @Nullable
    public static Integer N(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    @Nullable
    public static <T> T O(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static final int P(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int Q(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int R(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int S(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int T(@NotNull T[] tArr, T t8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i10 = 0;
        if (t8 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (Intrinsics.c(t8, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int U(@NotNull short[] sArr, short s8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s8 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A V(@NotNull byte[] bArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final <T, A extends Appendable> A W(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t8 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.n.a(buffer, t8, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final String X(@NotNull byte[] bArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) V(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    @NotNull
    public static final <T> String Y(@NotNull T[] tArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) W(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String Z(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return X(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static /* synthetic */ String a0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return Y(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static char b0(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static <T> T c0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    public static byte[] d0(@NotNull byte[] bArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : l.m(bArr, indices.b().intValue(), indices.c().intValue() + 1);
    }

    @NotNull
    public static final <T> T[] e0(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        l.z(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    public static <T> List<T> f0(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return l.e(e0(tArr, comparator));
    }

    public static int g0(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C h0(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t8 : tArr) {
            destination.add(t8);
        }
        return destination;
    }

    @NotNull
    public static List<Long> i0(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? k0(jArr) : o.d(Long.valueOf(jArr[0]));
        }
        return p.k();
    }

    @NotNull
    public static <T> List<T> j0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? l0(tArr) : o.d(tArr[0]);
        }
        return p.k();
    }

    @NotNull
    public static final List<Long> k0(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> l0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(p.h(tArr, false, 1, null));
    }

    @NotNull
    public static <T> Set<T> m0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) h0(tArr, new LinkedHashSet(j0.f(tArr.length))) : p0.c(tArr[0]);
        }
        return q0.d();
    }

    @NotNull
    public static <T, R> List<Pair<T, R>> n0(@NotNull T[] tArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(jt.s.a(tArr[i10], other[i10]));
        }
        return arrayList;
    }
}
