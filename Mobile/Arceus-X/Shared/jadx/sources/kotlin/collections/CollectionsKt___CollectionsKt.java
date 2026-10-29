package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.C7787n;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0017\u0010\n\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0018\u0010\u0007\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0019\u0010\n\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020 *\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b!\u0010\"\u001a=\u0010&\u001a\u00028\u0000\"\u0010\b\u0000\u0010$*\n\u0012\u0006\b\u0000\u0012\u00028\u00010#\"\b\b\u0001\u0010\u0000*\u00020 *\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'\u001a+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+\u001a+\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b,\u0010\u001d\u001a+\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b-\u0010\u001f\u001a#\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b.\u0010\"\u001a-\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000/*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b0\u0010\"\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000/*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b1\u0010\"\u001a?\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00104\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`3¢\u0006\u0004\b5\u00106\u001a\u0017\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020\r07¢\u0006\u0004\b9\u0010:\u001a7\u0010;\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010$*\n\u0012\u0006\b\u0000\u0012\u00028\u00000#*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0004\b;\u0010'\u001a-\u0010>\u001a\u0012\u0012\u0004\u0012\u00028\u00000<j\b\u0012\u0004\u0012\u00028\u0000`=\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b>\u0010?\u001a#\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b@\u0010\"\u001a#\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bB\u0010\"\u001a#\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000007¢\u0006\u0004\bC\u0010D\u001a#\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bF\u0010G\u001a)\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000H0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bI\u0010J\u001a#\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bK\u0010\"\u001a4\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\bM\u0010N\u001a#\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000O\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bP\u0010G\u001a)\u0010Q\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000/*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bQ\u0010R\u001a\u001b\u0010T\u001a\u0004\u0018\u00010S*\b\u0012\u0004\u0012\u00020S0\u0001H\u0007¢\u0006\u0004\bT\u0010U\u001a\u001b\u0010V\u001a\u0004\u0018\u00010S*\b\u0012\u0004\u0012\u00020S0\u0001H\u0007¢\u0006\u0004\bV\u0010U\u001a+\u0010W\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000/*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bW\u0010R\u001a3\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010X\u001a\u00020\rH\u0007¢\u0006\u0004\bY\u0010\u001d\u001a.\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bZ\u0010[\u001a4\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b]\u0010^\u001a.\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b_\u0010`\u001a4\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000072\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\ba\u0010b\u001aG\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010X\u001a\u00020\r2\b\b\u0002\u0010c\u001a\u00020\r2\b\b\u0002\u0010d\u001a\u00020\u0003H\u0007¢\u0006\u0004\be\u0010f\u001aF\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010h0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010g*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bi\u0010^\u001a}\u0010v\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010l*\u00060jj\u0002`k*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010m\u001a\u00028\u00012\b\b\u0002\u0010o\u001a\u00020n2\b\b\u0002\u0010p\u001a\u00020n2\b\b\u0002\u0010q\u001a\u00020n2\b\b\u0002\u0010r\u001a\u00020\r2\b\b\u0002\u0010s\u001a\u00020n2\u0016\b\u0002\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020n\u0018\u00010t¢\u0006\u0004\bv\u0010w\u001ag\u0010y\u001a\u00020x\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010o\u001a\u00020n2\b\b\u0002\u0010p\u001a\u00020n2\b\b\u0002\u0010q\u001a\u00020n2\b\b\u0002\u0010r\u001a\u00020\r2\b\b\u0002\u0010s\u001a\u00020n2\u0016\b\u0002\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020n\u0018\u00010t¢\u0006\u0004\by\u0010z\u001a#\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000{\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b|\u0010}\u001a\u0019\u0010~\u001a\u00020S*\b\u0012\u0004\u0012\u00020S0\u0001H\u0007¢\u0006\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, m31665d2 = {"T", "", "element", "", "W", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "c0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "d0", "(Ljava/util/List;)Ljava/lang/Object;", "e0", "firstOrNull", "", "index", "f0", "(Ljava/util/List;I)Ljava/lang/Object;", "g0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "h0", "(Ljava/util/List;Ljava/lang/Object;)I", "n0", "o0", "p0", "z0", "A0", "B0", "n", "Y", "(Ljava/lang/Iterable;I)Ljava/util/List;", "Z", "(Ljava/util/List;I)Ljava/util/List;", "", "a0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "b0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "C0", "(Ljava/util/List;Lkotlin/ranges/IntRange;)Ljava/util/List;", "H0", "I0", "y0", "", "D0", "E0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "F0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "", "L0", "(Ljava/util/Collection;)[I", "J0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "K0", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "M0", "", "N0", "O0", "(Ljava/util/Collection;)Ljava/util/List;", "", "Q0", "(Ljava/lang/Iterable;)Ljava/util/Set;", "Lkotlin/collections/IndexedValue;", "S0", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "X", "other", "i0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "", "P0", "r0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "", "q0", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "t0", "s0", "size", "V", "v0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "u0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "x0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "w0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "step", "partialWindows", "R0", "(Ljava/lang/Iterable;IIZ)Ljava/util/List;", "R", "Lkotlin/Pair;", "U0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "j0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "l0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "U", "(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "G0", "(Ljava/lang/Iterable;)D", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt___CollectionsKt extends C7710w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt___CollectionsKt$a */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$a", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C7668a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f29332a;

        public C7668a(Iterable iterable) {
            this.f29332a = iterable;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f29332a.iterator();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static <T> T m31675A0(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @Nullable
    /* JADX INFO: renamed from: B0 */
    public static <T> T m31676B0(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public static <T> List<T> m31677C0(@NotNull List<? extends T> list, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? C7699p.m31892k() : m31687M0(list.subList(indices.mo27446b().intValue(), indices.mo27447c().intValue() + 1));
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public static <T extends Comparable<? super T>> List<T> m31678D0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listM31688N0 = m31688N0(iterable);
            C7707t.m31918x(listM31688N0);
            return listM31688N0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m31687M0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C7691l.m31830y((Comparable[]) array);
        return C7691l.m31810e(array);
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public static <T extends Comparable<? super T>> List<T> m31679E0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m31680F0(iterable, C8662a.m34745c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public static <T> List<T> m31680F0(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listM31688N0 = m31688N0(iterable);
            C7707t.m31919y(listM31688N0, comparator);
            return listM31688N0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m31687M0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C7691l.m31831z(array, comparator);
        return C7691l.m31810e(array);
    }

    /* JADX INFO: renamed from: G0 */
    public static double m31681G0(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public static <T> List<T> m31682H0(@NotNull Iterable<? extends T> iterable, int i10) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C7699p.m31892k();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m31687M0(iterable);
            }
            if (i10 == 1) {
                return C7697o.m31878d(m31705c0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return C7699p.m31898q(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public static <T> List<T> m31683I0(@NotNull List<? extends T> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C7699p.m31892k();
        }
        int size = list.size();
        if (i10 >= size) {
            return m31687M0(list);
        }
        if (i10 == 1) {
            return C7697o.m31878d(m31717o0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public static final <T, C extends Collection<? super T>> C m31684J0(@NotNull Iterable<? extends T> iterable, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public static <T> HashSet<T> m31685K0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) m31684J0(iterable, new HashSet(C7688j0.m31790f(C7701q.m31905u(iterable, 12))));
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public static int[] m31686L0(@NotNull Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public static <T> List<T> m31687M0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C7699p.m31898q(m31688N0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C7699p.m31892k();
        }
        if (size != 1) {
            return m31689O0(collection);
        }
        return C7697o.m31878d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public static final <T> List<T> m31688N0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? m31689O0((Collection) iterable) : (List) m31684J0(iterable, new ArrayList());
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public static <T> List<T> m31689O0(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public static <T> Set<T> m31690P0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m31684J0(iterable, new LinkedHashSet());
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public static <T> Set<T> m31691Q0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C7702q0.m31910f((Set) m31684J0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C7702q0.m31908d();
        }
        if (size != 1) {
            return (Set) m31684J0(iterable, new LinkedHashSet(C7688j0.m31790f(collection.size())));
        }
        return C7700p0.m31904c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public static final <T> List<List<T>> m31692R0(@NotNull Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        C7706s0.m31915a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM31916b = C7706s0.m31916b(iterable.iterator(), i10, i11, z10, false);
            while (itM31916b.hasNext()) {
                arrayList.add((List) itM31916b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int iM32081f = C7764d.m32081f(i10, size - i12);
            if (iM32081f < i10 && !z10) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(iM32081f);
            for (int i13 = 0; i13 < iM32081f; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public static <T> Iterable<IndexedValue<T>> m31693S0(@NotNull final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new C7674c0(new Function0() { // from class: kotlin.collections.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt___CollectionsKt.m31695T0(iterable);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static final Iterator m31695T0(Iterable iterable) {
        return iterable.iterator();
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public static <T> Sequence<T> m31696U(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new C7668a(iterable);
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public static <T, R> List<Pair<T, R>> m31697U0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C7701q.m31905u(iterable, 10), C7701q.m31905u(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C7352s.m30477a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public static <T> List<List<T>> m31698V(@NotNull Iterable<? extends T> iterable, int i10) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m31692R0(iterable, i10, i10, true);
    }

    /* JADX INFO: renamed from: W */
    public static <T> boolean m31699W(@NotNull Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t8);
        }
        return m31709g0(iterable, t8) >= 0;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public static <T> List<T> m31700X(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m31687M0(m31690P0(iterable));
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public static <T> List<T> m31701Y(@NotNull Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return m31687M0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return C7699p.m31892k();
            }
            if (size == 1) {
                return C7697o.m31878d(m31716n0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (T t8 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t8);
            } else {
                i11++;
            }
        }
        return C7699p.m31898q(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public static <T> List<T> m31702Z(@NotNull List<? extends T> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 >= 0) {
            return m31682H0(list, C7764d.m32078c(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public static <T> List<T> m31703a0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) m31704b0(iterable, new ArrayList());
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public static final <C extends Collection<? super T>, T> C m31704b0(@NotNull Iterable<? extends T> iterable, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t8 : iterable) {
            if (t8 != null) {
                destination.add(t8);
            }
        }
        return destination;
    }

    /* JADX INFO: renamed from: c0 */
    public static <T> T m31705c0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m31706d0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: d0 */
    public static <T> T m31706d0(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Nullable
    /* JADX INFO: renamed from: e0 */
    public static <T> T m31707e0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f0 */
    public static <T> T m31708f0(@NotNull List<? extends T> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: g0 */
    public static final <T> int m31709g0(@NotNull Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t8);
        }
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 < 0) {
                C7699p.m31901t();
            }
            if (Intrinsics.m31980c(t8, t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h0 */
    public static <T> int m31710h0(@NotNull List<? extends T> list, T t8) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t8);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public static <T> Set<T> m31711i0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> setM31690P0 = m31690P0(iterable);
        C7708u.m31930K(setM31690P0, other);
        return setM31690P0;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public static final <T, A extends Appendable> A m31712j0(@NotNull Iterable<? extends T> iterable, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t8 : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C7787n.m32272a(buffer, t8, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public static final <T> String m31714l0(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) m31712j0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ String m31715m0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        return m31714l0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    /* JADX INFO: renamed from: n0 */
    public static final <T> T m31716n0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m31717o0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: o0 */
    public static <T> T m31717o0(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C7699p.m31894m(list));
    }

    @Nullable
    /* JADX INFO: renamed from: p0 */
    public static <T> T m31718p0(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Nullable
    /* JADX INFO: renamed from: q0 */
    public static Double m31719q0(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public static <T extends Comparable<? super T>> T m31720r0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @Nullable
    /* JADX INFO: renamed from: s0 */
    public static <T extends Comparable<? super T>> T m31721s0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @Nullable
    /* JADX INFO: renamed from: t0 */
    public static Double m31722t0(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    /* JADX INFO: renamed from: u0 */
    public static <T> List<T> m31723u0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collectionM31921B = C7708u.m31921B(elements);
        if (collectionM31921B.isEmpty()) {
            return m31687M0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (!collectionM31921B.contains(t8)) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public static <T> List<T> m31724v0(@NotNull Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C7701q.m31905u(iterable, 10));
        boolean z10 = false;
        for (T t10 : iterable) {
            boolean z11 = true;
            if (!z10 && Intrinsics.m31980c(t10, t8)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public static <T> List<T> m31725w0(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C7708u.m31931z(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public static <T> List<T> m31726x0(@NotNull Collection<? extends T> collection, T t8) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t8);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public static <T> List<T> m31727y0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m31687M0(iterable);
        }
        List<T> listM31688N0 = m31688N0(iterable);
        C7710w.m31939S(listM31688N0);
        return listM31688N0;
    }

    /* JADX INFO: renamed from: z0 */
    public static <T> T m31728z0(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m31675A0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }
}
