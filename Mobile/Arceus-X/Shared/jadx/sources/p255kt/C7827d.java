package p255kt;

import au.InterfaceC1170a;
import au.InterfaceC1174e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC7675d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kt.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006bghideBG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0016\u0010$J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010\"J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u0001H\u0002¢\u0006\u0004\b+\u0010\"J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u0013J\u001f\u00102\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b2\u00103J#\u00106\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0002¢\u0006\u0004\b6\u00107J)\u0010:\u001a\u00020\u00192\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010408H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0019H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00192\u0006\u0010*\u001a\u00028\u0001H\u0016¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010FJ%\u0010G\u001a\u00020\u00142\u0014\u00109\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010DJ\u000f\u0010J\u001a\u00020\u0014H\u0016¢\u0006\u0004\bJ\u0010\u0011J\u001a\u0010L\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010KH\u0096\u0002¢\u0006\u0004\bL\u0010AJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0014H\u0000¢\u0006\u0004\bR\u0010\u0011J\u0017\u0010S\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\bS\u0010\"J\u0017\u0010T\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010AJ#\u0010U\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0000¢\u0006\u0004\bU\u00107J\u001b\u0010V\u001a\u00020\u00192\n\u0010R\u001a\u0006\u0012\u0002\b\u000308H\u0000¢\u0006\u0004\bV\u0010;J#\u0010\u0001\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0000¢\u0006\u0004\b\u0001\u00107J\u0017\u0010X\u001a\u00020\u00192\u0006\u0010W\u001a\u00028\u0001H\u0000¢\u0006\u0004\bX\u0010AJ\u001b\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010YH\u0000¢\u0006\u0004\bZ\u0010[J\u001b\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\\H\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_H\u0000¢\u0006\u0004\b`\u0010aR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\u0015R\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010\u0015R\u0016\u0010m\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010\u0015R$\u0010o\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\bn\u0010NR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010qR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010tR$\u0010x\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010wR$\u0010{\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010y\u001a\u0004\bz\u0010?R\u0014\u0010}\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010NR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0088\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0086\u00010~8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0080\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010N¨\u0006\u008b\u0001"}, m31665d2 = {"Lkt/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "I", "n", "s", "extraCapacity", "", "P", "(I)Z", "minCapacity", "r", "k", "()[Ljava/lang/Object;", "key", "D", "(Ljava/lang/Object;)I", "updateHashArray", "(Z)V", "newHashSize", "J", "i", "H", "u", "value", "v", "index", "L", "removedHash", "M", "", "other", "q", "(Ljava/util/Map;)Z", "", "entry", "G", "(Ljava/util/Map$Entry;)Z", "", "from", "F", "(Ljava/util/Collection;)Z", "l", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "m", "j", "N", "p", "o", "element", "O", "Lkt/d$e;", "E", "()Lkt/d$e;", "Lkt/d$f;", "Q", "()Lkt/d$f;", "Lkt/d$b;", "t", "()Lkt/d$b;", "a", "[Ljava/lang/Object;", "b", "c", "[I", "d", "e", "f", "g", "hashShift", "h", "modCount", "B", "size", "Lkt/f;", "Lkt/f;", "keysView", "Lkt/g;", "Lkt/g;", "valuesView", "Lkt/e;", "Lkt/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "y", "hashSize", "", "A", "()Ljava/util/Set;", "keys", "", "C", "()Ljava/util/Collection;", "values", "", "x", "entries", "w", "capacity", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7827d<K, V> implements Map<K, V>, Serializable, InterfaceC1174e {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final C7827d f29653o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public K[] keysArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public V[] valuesArray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public int[] presenceArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public int[] hashArray;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int maxProbeDistance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int length;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int hashShift;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int modCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C7829f<K> keysView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public C7830g<V> valuesView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public C7828e<K, V> entriesView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isReadOnly;

    /* JADX INFO: renamed from: kt.d$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, m31665d2 = {"Lkt/d$a;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", "d", "Lkt/d;", "", "Empty", "Lkt/d;", "e", "()Lkt/d;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kt.d.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final int m32534c(int capacity) {
            return Integer.highestOneBit(C7764d.m32078c(capacity, 1) * 3);
        }

        /* JADX INFO: renamed from: d */
        public final int m32535d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C7827d m32536e() {
            return C7827d.f29653o;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: kt.d$b */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lkt/d$b;", "K", "V", "Lkt/d$d;", "", "", "Lkt/d;", "map", "<init>", "(Lkt/d;)V", "Lkt/d$c;", "k", "()Lkt/d$c;", "", "m", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "l", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC1170a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C7827d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            m32541b();
            if (getIndex() >= m32544f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            m32546i(index + 1);
            m32547j(index);
            c<K, V> cVar = new c<>(m32544f(), getLastIndex());
            m32545g();
            return cVar;
        }

        /* JADX INFO: renamed from: l */
        public final void m32538l(@NotNull StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (getIndex() >= m32544f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            m32546i(index + 1);
            m32547j(index);
            Object obj = m32544f().keysArray[getLastIndex()];
            if (obj == m32544f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = m32544f().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == m32544f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            m32545g();
        }

        /* JADX INFO: renamed from: m */
        public final int m32539m() {
            if (getIndex() >= m32544f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            m32546i(index + 1);
            m32547j(index);
            Object obj = m32544f().keysArray[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m32544f().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m32545g();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: kt.d$c */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, m31665d2 = {"Lkt/d$c;", "K", "V", "", "Lkt/d;", "map", "", "index", "<init>", "(Lkt/d;I)V", "", "a", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkt/d;", "b", "I", "c", "expectedModCount", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c<K, V> implements Map.Entry<K, V>, InterfaceC1170a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C7827d<K, V> map;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int expectedModCount;

        public c(@NotNull C7827d<K, V> map, int i10) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i10;
            this.expectedModCount = map.modCount;
        }

        /* JADX INFO: renamed from: a */
        private final void m32540a() {
            if (this.map.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return Intrinsics.m31980c(entry.getKey(), getKey()) && Intrinsics.m31980c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            m32540a();
            return (K) this.map.keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            m32540a();
            Object[] objArr = this.map.valuesArray;
            Intrinsics.checkNotNull(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            m32540a();
            this.map.m32521m();
            Object[] objArrM32519k = this.map.m32519k();
            int i10 = this.index;
            V v5 = (V) objArrM32519k[i10];
            objArrM32519k[i10] = newValue;
            return v5;
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap K:INVOKE), 61, (wrap V:INVOKE) */
        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: kt.d$d */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006 "}, m31665d2 = {"Lkt/d$d;", "K", "V", "", "Lkt/d;", "map", "<init>", "(Lkt/d;)V", "", "g", "()V", "", "hasNext", "()Z", "remove", "b", "a", "Lkt/d;", "f", "()Lkt/d;", "", "I", "d", "()I", "i", "(I)V", "index", "c", "e", "j", "lastIndex", "expectedModCount", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static class d<K, V> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C7827d<K, V> map;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int expectedModCount;

        public d(@NotNull C7827d<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = map.modCount;
            m32545g();
        }

        /* JADX INFO: renamed from: b */
        public final void m32541b() {
            if (this.map.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C7827d<K, V> m32544f() {
            return this.map;
        }

        /* JADX INFO: renamed from: g */
        public final void m32545g() {
            while (this.index < this.map.length) {
                int[] iArr = this.map.presenceArray;
                int i10 = this.index;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.index = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.index < this.map.length;
        }

        /* JADX INFO: renamed from: i */
        public final void m32546i(int i10) {
            this.index = i10;
        }

        /* JADX INFO: renamed from: j */
        public final void m32547j(int i10) {
            this.lastIndex = i10;
        }

        public final void remove() {
            m32541b();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.m32521m();
            this.map.m32512L(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = this.map.modCount;
        }
    }

    /* JADX INFO: renamed from: kt.d$e */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lkt/d$e;", "K", "V", "Lkt/d$d;", "", "Lkt/d;", "map", "<init>", "(Lkt/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, InterfaceC1170a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull C7827d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            m32541b();
            if (getIndex() >= m32544f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            m32546i(index + 1);
            m32547j(index);
            K k10 = (K) m32544f().keysArray[getLastIndex()];
            m32545g();
            return k10;
        }
    }

    /* JADX INFO: renamed from: kt.d$f */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lkt/d$f;", "K", "V", "Lkt/d$d;", "", "Lkt/d;", "map", "<init>", "(Lkt/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, InterfaceC1170a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull C7827d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            m32541b();
            if (getIndex() >= m32544f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            m32546i(index + 1);
            m32547j(index);
            Object[] objArr = m32544f().valuesArray;
            Intrinsics.checkNotNull(objArr);
            V v5 = (V) objArr[getLastIndex()];
            m32545g();
            return v5;
        }
    }

    static {
        C7827d c7827d = new C7827d(0);
        c7827d.isReadOnly = true;
        f29653o = c7827d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7827d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = INSTANCE.m32535d(m32531y());
    }

    /* JADX INFO: renamed from: I */
    private final void m32491I() {
        this.modCount++;
    }

    /* JADX INFO: renamed from: r */
    private final void m32500r(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > m32529w()) {
            int iM31753e = AbstractC7675d.INSTANCE.m31753e(m32529w(), minCapacity);
            this.keysArray = (K[]) C7826c.m32485e(this.keysArray, iM31753e);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) C7826c.m32485e(vArr, iM31753e) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iM31753e);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iM32534c = INSTANCE.m32534c(iM31753e);
            if (iM32534c > m32531y()) {
                m32510J(iM32534c);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m32501s(int n10) {
        if (m32516P(n10)) {
            m32522n(true);
        } else {
            m32500r(this.length + n10);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public Set<K> m32502A() {
        C7829f<K> c7829f = this.keysView;
        if (c7829f != null) {
            return c7829f;
        }
        C7829f<K> c7829f2 = new C7829f<>(this);
        this.keysView = c7829f2;
        return c7829f2;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public Collection<V> m32504C() {
        C7830g<V> c7830g = this.valuesView;
        if (c7830g != null) {
            return c7830g;
        }
        C7830g<V> c7830g2 = new C7830g<>(this);
        this.valuesView = c7830g2;
        return c7830g2;
    }

    /* JADX INFO: renamed from: D */
    public final int m32505D(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final e<K, V> m32506E() {
        return new e<>(this);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m32507F(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z10 = false;
        if (from.isEmpty()) {
            return false;
        }
        m32501s(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (m32508G(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m32508G(Map.Entry<? extends K, ? extends V> entry) {
        int iM32518j = m32518j(entry.getKey());
        V[] vArrM32519k = m32519k();
        if (iM32518j >= 0) {
            vArrM32519k[iM32518j] = entry.getValue();
            return true;
        }
        int i10 = (-iM32518j) - 1;
        if (Intrinsics.m31980c(entry.getValue(), vArrM32519k[i10])) {
            return false;
        }
        vArrM32519k[i10] = entry.getValue();
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m32509H(int i10) {
        int iM32505D = m32505D(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iM32505D] == 0) {
                iArr[iM32505D] = i10 + 1;
                this.presenceArray[i10] = iM32505D;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iM32505D = iM32505D == 0 ? m32531y() - 1 : iM32505D - 1;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m32510J(int newHashSize) {
        m32491I();
        int i10 = 0;
        if (this.length > size()) {
            m32522n(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.m32535d(newHashSize);
        while (i10 < this.length) {
            int i11 = i10 + 1;
            if (!m32509H(i10)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m32511K(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        m32521m();
        int iM32527u = m32527u(entry.getKey());
        if (iM32527u < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.m31980c(vArr[iM32527u], entry.getValue())) {
            return false;
        }
        m32512L(iM32527u);
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final void m32512L(int index) {
        C7826c.m32486f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C7826c.m32486f(vArr, index);
        }
        m32513M(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        m32491I();
    }

    /* JADX INFO: renamed from: M */
    public final void m32513M(int removedHash) {
        int iM32081f = C7764d.m32081f(this.maxProbeDistance * 2, m32531y() / 2);
        int i10 = 0;
        int i11 = removedHash;
        do {
            removedHash = removedHash == 0 ? m32531y() - 1 : removedHash - 1;
            i10++;
            if (i10 > this.maxProbeDistance) {
                this.hashArray[i11] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i12 = iArr[removedHash];
            if (i12 == 0) {
                iArr[i11] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                if (((m32505D(this.keysArray[i13]) - removedHash) & (m32531y() - 1)) >= i10) {
                    this.hashArray[i11] = i12;
                    this.presenceArray[i13] = i11;
                }
                iM32081f--;
            }
            i11 = removedHash;
            i10 = 0;
            iM32081f--;
        } while (iM32081f >= 0);
        this.hashArray[i11] = -1;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m32514N(K key) {
        m32521m();
        int iM32527u = m32527u(key);
        if (iM32527u < 0) {
            return false;
        }
        m32512L(iM32527u);
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m32515O(V element) {
        m32521m();
        int iM32528v = m32528v(element);
        if (iM32528v < 0) {
            return false;
        }
        m32512L(iM32528v);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m32516P(int extraCapacity) {
        int iM32529w = m32529w();
        int i10 = this.length;
        int i11 = iM32529w - i10;
        int size = i10 - size();
        return i11 < extraCapacity && i11 + size >= extraCapacity && size >= m32529w() / 4;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final f<K, V> m32517Q() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m32521m();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        C7826c.m32487g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C7826c.m32487g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        m32491I();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return m32527u(key) >= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return m32528v(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m32530x();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof Map) && m32525q((Map) other);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        int iM32527u = m32527u(key);
        if (iM32527u < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[iM32527u];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarM32526t = m32526t();
        int iM32539m = 0;
        while (bVarM32526t.hasNext()) {
            iM32539m += bVarM32526t.m32539m();
        }
        return iM32539m;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m32518j(K key) {
        m32521m();
        while (true) {
            int iM32505D = m32505D(key);
            int iM32081f = C7764d.m32081f(this.maxProbeDistance * 2, m32531y() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iM32505D];
                if (i11 <= 0) {
                    if (this.length >= m32529w()) {
                        m32501s(1);
                        break;
                    }
                    int i12 = this.length;
                    int i13 = i12 + 1;
                    this.length = i13;
                    this.keysArray[i12] = key;
                    this.presenceArray[i12] = iM32505D;
                    this.hashArray[iM32505D] = i13;
                    this.size = size() + 1;
                    m32491I();
                    if (i10 > this.maxProbeDistance) {
                        this.maxProbeDistance = i10;
                    }
                    return i12;
                }
                if (Intrinsics.m31980c(this.keysArray[i11 - 1], key)) {
                    return -i11;
                }
                i10++;
                if (i10 > iM32081f) {
                    m32510J(m32531y() * 2);
                    break;
                }
                iM32505D = iM32505D == 0 ? m32531y() - 1 : iM32505D - 1;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final V[] m32519k() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C7826c.m32484d(m32529w());
        this.valuesArray = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m32502A();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Map<K, V> m32520l() {
        m32521m();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        C7827d c7827d = f29653o;
        Intrinsics.m31981d(c7827d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c7827d;
    }

    /* JADX INFO: renamed from: m */
    public final void m32521m() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m32522n(boolean updateHashArray) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (updateHashArray) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        C7826c.m32487g(this.keysArray, i12, i10);
        if (vArr != null) {
            C7826c.m32487g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m32523o(@NotNull Collection<?> m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!m32524p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m32524p(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iM32527u = m32527u(entry.getKey());
        if (iM32527u < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.m31980c(vArr[iM32527u], entry.getValue());
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        m32521m();
        int iM32518j = m32518j(key);
        V[] vArrM32519k = m32519k();
        if (iM32518j >= 0) {
            vArrM32519k[iM32518j] = value;
            return null;
        }
        int i10 = (-iM32518j) - 1;
        V v5 = vArrM32519k[i10];
        vArrM32519k[i10] = value;
        return v5;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        m32521m();
        m32507F(from.entrySet());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m32525q(Map<?, ?> other) {
        return size() == other.size() && m32523o(other.entrySet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        m32521m();
        int iM32527u = m32527u(key);
        if (iM32527u < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v5 = vArr[iM32527u];
        m32512L(iM32527u);
        return v5;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final b<K, V> m32526t() {
        return new b<>(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarM32526t = m32526t();
        int i10 = 0;
        while (bVarM32526t.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarM32526t.m32538l(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public final int m32527u(K key) {
        int iM32505D = m32505D(key);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iM32505D];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.m31980c(this.keysArray[i12], key)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM32505D = iM32505D == 0 ? m32531y() - 1 : iM32505D - 1;
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m32528v(V value) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.m31980c(vArr[i10], value)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m32504C();
    }

    /* JADX INFO: renamed from: w */
    public final int m32529w() {
        return this.keysArray.length;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Map.Entry<K, V>> m32530x() {
        C7828e<K, V> c7828e = this.entriesView;
        if (c7828e != null) {
            return c7828e;
        }
        C7828e<K, V> c7828e2 = new C7828e<>(this);
        this.entriesView = c7828e2;
        return c7828e2;
    }

    /* JADX INFO: renamed from: y */
    public final int m32531y() {
        return this.hashArray.length;
    }

    public C7827d() {
        this(8);
    }

    public C7827d(int i10) {
        this(C7826c.m32484d(i10), null, new int[i10], new int[INSTANCE.m32534c(i10)], 2, 0);
    }
}
