package p534x3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.collections.C7693m;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x3.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001c\u001a\u00020\n2\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019\"\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010\u0014R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+¨\u0006-"}, m31665d2 = {"Lx3/c;", "Lx3/f;", "", "Lx3/f$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "", "e", "()V", "f", "T", "key", "b", "(Lx3/f$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "i", "(Lx3/f$a;Ljava/lang/Object;)V", "j", "", "Lx3/f$b;", "pairs", "g", "([Lx3/f$b;)V", "h", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core_release", "Lx3/b;", "Lx3/b;", "frozen", "datastore-preferences-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12642c extends AbstractC12645f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<AbstractC12645f.a<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12641b frozen;

    /* JADX INFO: renamed from: x3.c$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"", "Lx3/f$a;", "", "entry", "", "b", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function1<Map.Entry<AbstractC12645f.a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: i */
        public static final a f44963i = new a();

        public a() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<AbstractC12645f.a<?>, Object> entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? C7693m.m31857Z((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C12642c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // p534x3.AbstractC12645f
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<AbstractC12645f.a<?>, Object> mo47088a() {
        Pair pair;
        Set<Map.Entry<AbstractC12645f.a<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.m31673c(), pair.m31674d());
        }
        return C12640a.m47085b(linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: byte[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p534x3.AbstractC12645f
    @Nullable
    /* JADX INFO: renamed from: b */
    public <T> T mo47089b(@NotNull AbstractC12645f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t8 = (T) this.preferencesMap.get(key);
        if (!(t8 instanceof byte[])) {
            return t8;
        }
        byte[] bArr = (byte[]) t8;
        T t10 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(t10, "copyOf(this, size)");
        return t10;
    }

    /* JADX INFO: renamed from: e */
    public final void m47090e() {
        if (this.frozen.m47086a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(@Nullable Object other) {
        boolean zM31980c;
        if (!(other instanceof C12642c)) {
            return false;
        }
        C12642c c12642c = (C12642c) other;
        Map<AbstractC12645f.a<?>, Object> map = c12642c.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        Map<AbstractC12645f.a<?>, Object> map2 = c12642c.preferencesMap;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<AbstractC12645f.a<?>, Object> entry : map2.entrySet()) {
            Object obj = this.preferencesMap.get(entry.getKey());
            if (obj != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zM31980c = Intrinsics.m31980c(value, obj);
                } else if ((obj instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj)) {
                    zM31980c = true;
                } else {
                    zM31980c = false;
                }
            } else {
                zM31980c = false;
            }
            if (!zM31980c) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m47091f() {
        this.frozen.m47087b(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m47092g(@NotNull AbstractC12645f.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        m47090e();
        for (AbstractC12645f.b<?> bVar : pairs) {
            m47095j(bVar.m47104a(), bVar.m47105b());
        }
    }

    /* JADX INFO: renamed from: h */
    public final <T> T m47093h(@NotNull AbstractC12645f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        m47090e();
        return (T) this.preferencesMap.remove(key);
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final <T> void m47094i(@NotNull AbstractC12645f.a<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        m47095j(key, value);
    }

    /* JADX INFO: renamed from: j */
    public final void m47095j(@NotNull AbstractC12645f.a<?> key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        m47090e();
        if (value == null) {
            m47093h(key);
            return;
        }
        if (value instanceof Set) {
            this.preferencesMap.put(key, C12640a.m47084a((Set) value));
            return;
        }
        if (!(value instanceof byte[])) {
            this.preferencesMap.put(key, value);
            return;
        }
        Map<AbstractC12645f.a<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) value;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    @NotNull
    public String toString() {
        return CollectionsKt.m31715m0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f44963i, 24, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:2) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.Map))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
     A[MD:(java.util.Map<x3.f$a<?>, java.lang.Object>, boolean):void (m)] (LINE:3) call: x3.c.<init>(java.util.Map, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C12642c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public C12642c(@NotNull Map<AbstractC12645f.a<?>, Object> preferencesMap, boolean z10) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new C12641b(z10);
    }
}
