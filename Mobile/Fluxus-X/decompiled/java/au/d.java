package au;

import com.github.luben.zstd.BuildConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006afghcdBG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010\"J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0004\b,\u0010\"J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0013J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u001f\u00103\u001a\u00020\u00192\u000e\u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0002¢\u0006\u0004\b7\u00108J)\u0010;\u001a\u00020\u00192\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010509H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0019H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00192\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bC\u0010BJ\u001a\u0010D\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\u00142\u0014\u0010:\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\bJ\u0010EJ\u000f\u0010K\u001a\u00020\u0014H\u0016¢\u0006\u0004\bK\u0010\u0011J\u001a\u0010M\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u00010LH\u0096\u0002¢\u0006\u0004\bM\u0010BJ\u000f\u0010N\u001a\u00020\fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0014H\u0000¢\u0006\u0004\bS\u0010\u0011J\u0017\u0010(\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\b(\u0010\"J\u0017\u0010T\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010BJ#\u0010U\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bU\u00108J\u001b\u0010\u0016\u001a\u00020\u00192\n\u0010$\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\b\u0016\u0010<J#\u0010\u0001\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\b\u0001\u00108J\u0017\u0010W\u001a\u00020\u00192\u0006\u0010V\u001a\u00028\u0001H\u0000¢\u0006\u0004\bW\u0010BJ\u001b\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010XH\u0000¢\u0006\u0004\bY\u0010ZJ\u001b\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[H\u0000¢\u0006\u0004\b\\\u0010]J\u001b\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010^H\u0000¢\u0006\u0004\b_\u0010`R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010\u0015R\u0016\u0010j\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\u0015R\u0016\u0010l\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010\u0015R$\u0010n\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\bm\u0010OR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010pR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010sR$\u0010w\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010vR$\u0010z\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010x\u001a\u0004\by\u0010@R\u0014\u0010|\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010OR\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u0087\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0085\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u007fR\u0016\u0010\u0089\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010O¨\u0006\u008a\u0001"}, d2 = {"Lau/d;", "K", "V", BuildConfig.FLAVOR, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "keysArray", "valuesArray", BuildConfig.FLAVOR, "presenceArray", "hashArray", BuildConfig.FLAVOR, "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", BuildConfig.FLAVOR, "I", "n", "s", "extraCapacity", BuildConfig.FLAVOR, "P", "(I)Z", "minCapacity", "r", "j", "()[Ljava/lang/Object;", "key", "D", "(Ljava/lang/Object;)I", "updateHashArray", "m", "(Z)V", "newHashSize", "J", "i", "H", "u", "value", "w", "index", "L", "removedHash", "M", BuildConfig.FLAVOR, "other", "p", "(Ljava/util/Map;)Z", BuildConfig.FLAVOR, "entry", "G", "(Ljava/util/Map$Entry;)Z", BuildConfig.FLAVOR, "from", "F", "(Ljava/util/Collection;)Z", "k", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", BuildConfig.FLAVOR, "equals", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "l", "N", "o", "element", "O", "Lau/d$e;", "E", "()Lau/d$e;", "Lau/d$f;", "Q", "()Lau/d$f;", "Lau/d$b;", "t", "()Lau/d$b;", "a", "[Ljava/lang/Object;", "b", "c", "[I", "d", "e", "f", "g", "hashShift", "h", "modCount", "B", "size", "Lau/f;", "Lau/f;", "keysView", "Lau/g;", "Lau/g;", "valuesView", "Lau/e;", "Lau/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "z", "hashSize", BuildConfig.FLAVOR, "A", "()Ljava/util/Set;", "keys", BuildConfig.FLAVOR, "C", "()Ljava/util/Collection;", "values", BuildConfig.FLAVOR, "y", "entries", "x", "capacity", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d<K, V> implements Map<K, V>, Serializable, qu.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final d f3350o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public K[] keysArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public V[] valuesArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] presenceArray;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] hashArray;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxProbeDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int length;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int hashShift;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int modCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public au.f<K> keysView;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g<V> valuesView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public au.e<K, V> entriesView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isReadOnly;

    /* JADX INFO: renamed from: au.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lau/d$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "capacity", "c", "(I)I", "hashSize", "d", "Lau/d;", BuildConfig.FLAVOR, "Empty", "Lau/d;", "e", "()Lau/d;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int c(int capacity) {
            return Integer.highestOneBit(p001kotlin.ranges.d.c(capacity, 1) * 3);
        }

        public final int d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        @NotNull
        public final d e() {
            return d.f3350o;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lau/d$b;", "K", "V", "Lau/d$d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lau/d;", "map", "<init>", "(Lau/d;)V", "Lau/d$c;", "j", "()Lau/d$c;", BuildConfig.FLAVOR, "l", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", BuildConfig.FLAVOR, "k", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<K, V> extends C0075d<K, V> implements Iterator<Map.Entry<K, V>>, qu.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            if (getIndex() >= f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            c<K, V> cVar = new c<>(f(), getLastIndex());
            g();
            return cVar;
        }

        public final void k(@NotNull StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (getIndex() >= f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            Object obj = f().keysArray[getLastIndex()];
            if (obj == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = f().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            g();
        }

        public final int l() {
            if (getIndex() >= f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            Object obj = f().keysArray[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f().valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lau/d$c;", "K", "V", BuildConfig.FLAVOR, "Lau/d;", "map", BuildConfig.FLAVOR, "index", "<init>", "(Lau/d;I)V", BuildConfig.FLAVOR, "a", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lau/d;", "b", "I", "c", "expectedModCount", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c<K, V> implements Map.Entry<K, V>, qu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d<K, V> map;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int expectedModCount;

        public c(@NotNull d<K, V> map, int i10) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i10;
            this.expectedModCount = map.modCount;
        }

        private final void a() {
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
            return Intrinsics.c(entry.getKey(), getKey()) && Intrinsics.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) this.map.keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
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
            a();
            this.map.l();
            Object[] objArrJ = this.map.j();
            int i10 = this.index;
            V v8 = (V) objArrJ[i10];
            objArrJ[i10] = newValue;
            return v8;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: au.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006 "}, d2 = {"Lau/d$d;", "K", "V", BuildConfig.FLAVOR, "Lau/d;", "map", "<init>", "(Lau/d;)V", BuildConfig.FLAVOR, "g", "()V", BuildConfig.FLAVOR, "hasNext", "()Z", "remove", "b", "a", "Lau/d;", "f", "()Lau/d;", BuildConfig.FLAVOR, "I", "d", "()I", "h", "(I)V", "index", "c", "e", "i", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class C0075d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d<K, V> map;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int expectedModCount;

        public C0075d(@NotNull d<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = map.modCount;
            g();
        }

        public final void b() {
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
        public final d<K, V> f() {
            return this.map;
        }

        public final void g() {
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

        public final void h(int i10) {
            this.index = i10;
        }

        public final boolean hasNext() {
            return this.index < this.map.length;
        }

        public final void i(int i10) {
            this.lastIndex = i10;
        }

        public final void remove() {
            b();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.l();
            this.map.L(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = this.map.modCount;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/d$e;", "K", "V", "Lau/d$d;", BuildConfig.FLAVOR, "Lau/d;", "map", "<init>", "(Lau/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e<K, V> extends C0075d<K, V> implements Iterator<K>, qu.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (getIndex() >= f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            K k10 = (K) f().keysArray[getLastIndex()];
            g();
            return k10;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/d$f;", "K", "V", "Lau/d$d;", BuildConfig.FLAVOR, "Lau/d;", "map", "<init>", "(Lau/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f<K, V> extends C0075d<K, V> implements Iterator<V>, qu.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (getIndex() >= f().length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            Object[] objArr = f().valuesArray;
            Intrinsics.checkNotNull(objArr);
            V v8 = (V) objArr[getLastIndex()];
            g();
            return v8;
        }
    }

    static {
        d dVar = new d(0);
        dVar.isReadOnly = true;
        f3350o = dVar;
    }

    public d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = INSTANCE.d(z());
    }

    private final void I() {
        this.modCount++;
    }

    private final void r(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > x()) {
            int iE = p001kotlin.collections.d.INSTANCE.e(x(), minCapacity);
            this.keysArray = (K[]) au.c.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) au.c.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = INSTANCE.c(iE);
            if (iC > z()) {
                J(iC);
            }
        }
    }

    private final void s(int n10) {
        if (P(n10)) {
            m(true);
        } else {
            r(this.length + n10);
        }
    }

    @NotNull
    public Set<K> A() {
        au.f<K> fVar = this.keysView;
        if (fVar != null) {
            return fVar;
        }
        au.f<K> fVar2 = new au.f<>(this);
        this.keysView = fVar2;
        return fVar2;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @NotNull
    public Collection<V> C() {
        g<V> gVar = this.valuesView;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.valuesView = gVar2;
        return gVar2;
    }

    public final int D(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @NotNull
    public final e<K, V> E() {
        return new e<>(this);
    }

    public final boolean F(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z10 = false;
        if (from.isEmpty()) {
            return false;
        }
        s(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (G(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean G(Map.Entry<? extends K, ? extends V> entry) {
        int i10 = i(entry.getKey());
        V[] vArrJ = j();
        if (i10 >= 0) {
            vArrJ[i10] = entry.getValue();
            return true;
        }
        int i11 = (-i10) - 1;
        if (Intrinsics.c(entry.getValue(), vArrJ[i11])) {
            return false;
        }
        vArrJ[i11] = entry.getValue();
        return true;
    }

    public final boolean H(int i10) {
        int iD = D(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iD] == 0) {
                iArr[iD] = i10 + 1;
                this.presenceArray[i10] = iD;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iD = iD == 0 ? z() - 1 : iD - 1;
        }
    }

    public final void J(int newHashSize) {
        I();
        int i10 = 0;
        if (this.length > size()) {
            m(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.d(newHashSize);
        while (i10 < this.length) {
            int i11 = i10 + 1;
            if (!H(i10)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i10 = i11;
        }
    }

    public final boolean K(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        l();
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.c(vArr[iU], entry.getValue())) {
            return false;
        }
        L(iU);
        return true;
    }

    public final void L(int index) {
        au.c.f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            au.c.f(vArr, index);
        }
        M(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        I();
    }

    public final void M(int removedHash) {
        int iF = p001kotlin.ranges.d.f(this.maxProbeDistance * 2, z() / 2);
        int i10 = 0;
        int i11 = removedHash;
        do {
            removedHash = removedHash == 0 ? z() - 1 : removedHash - 1;
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
                if (((D(this.keysArray[i13]) - removedHash) & (z() - 1)) >= i10) {
                    this.hashArray[i11] = i12;
                    this.presenceArray[i13] = i11;
                }
                iF--;
            }
            i11 = removedHash;
            i10 = 0;
            iF--;
        } while (iF >= 0);
        this.hashArray[i11] = -1;
    }

    public final boolean N(K key) {
        l();
        int iU = u(key);
        if (iU < 0) {
            return false;
        }
        L(iU);
        return true;
    }

    public final boolean O(V element) {
        l();
        int iW = w(element);
        if (iW < 0) {
            return false;
        }
        L(iW);
        return true;
    }

    public final boolean P(int extraCapacity) {
        int iX = x();
        int i10 = this.length;
        int i11 = iX - i10;
        int size = i10 - size();
        return i11 < extraCapacity && i11 + size >= extraCapacity && size >= x() / 4;
    }

    @NotNull
    public final f<K, V> Q() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        l();
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
        au.c.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            au.c.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return u(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return w(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return y();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof Map) && p((Map) other);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        int iU = u(key);
        if (iU < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[iU];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarT = t();
        int iL = 0;
        while (bVarT.hasNext()) {
            iL += bVarT.l();
        }
        return iL;
    }

    public final int i(K key) {
        l();
        while (true) {
            int iD = D(key);
            int iF = p001kotlin.ranges.d.f(this.maxProbeDistance * 2, z() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iD];
                if (i11 <= 0) {
                    if (this.length >= x()) {
                        s(1);
                        break;
                    }
                    int i12 = this.length;
                    int i13 = i12 + 1;
                    this.length = i13;
                    this.keysArray[i12] = key;
                    this.presenceArray[i12] = iD;
                    this.hashArray[iD] = i13;
                    this.size = size() + 1;
                    I();
                    if (i10 > this.maxProbeDistance) {
                        this.maxProbeDistance = i10;
                    }
                    return i12;
                }
                if (Intrinsics.c(this.keysArray[i11 - 1], key)) {
                    return -i11;
                }
                i10++;
                if (i10 > iF) {
                    J(z() * 2);
                    break;
                }
                iD = iD == 0 ? z() - 1 : iD - 1;
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final V[] j() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) au.c.d(x());
        this.valuesArray = vArr2;
        return vArr2;
    }

    @NotNull
    public final Map<K, V> k() {
        l();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f3350o;
        Intrinsics.d(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return A();
    }

    public final void l() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final void m(boolean updateHashArray) {
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
        au.c.g(this.keysArray, i12, i10);
        if (vArr != null) {
            au.c.g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    public final boolean n(@NotNull Collection<?> m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.c(vArr[iU], entry.getValue());
    }

    public final boolean p(Map<?, ?> other) {
        return size() == other.size() && n(other.entrySet());
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        l();
        int i10 = i(key);
        V[] vArrJ = j();
        if (i10 >= 0) {
            vArrJ[i10] = value;
            return null;
        }
        int i11 = (-i10) - 1;
        V v8 = vArrJ[i11];
        vArrJ[i11] = value;
        return v8;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        l();
        F(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        l();
        int iU = u(key);
        if (iU < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v8 = vArr[iU];
        L(iU);
        return v8;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public final b<K, V> t() {
        return new b<>(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarT = t();
        int i10 = 0;
        while (bVarT.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarT.k(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final int u(K key) {
        int iD = D(key);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iD];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.c(this.keysArray[i12], key)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iD = iD == 0 ? z() - 1 : iD - 1;
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return C();
    }

    public final int w(V value) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.c(vArr[i10], value)) {
                    return i10;
                }
            }
        }
    }

    public final int x() {
        return this.keysArray.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> y() {
        au.e<K, V> eVar = this.entriesView;
        if (eVar != null) {
            return eVar;
        }
        au.e<K, V> eVar2 = new au.e<>(this);
        this.entriesView = eVar2;
        return eVar2;
    }

    public final int z() {
        return this.hashArray.length;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(au.c.d(i10), null, new int[i10], new int[INSTANCE.c(i10)], 2, 0);
    }
}
