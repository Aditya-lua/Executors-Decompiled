package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.h0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0011R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R&\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010'¨\u0006/"}, m31665d2 = {"Lkotlin/collections/h0;", "K", "V", "Lkotlin/collections/g0;", "", "map", "Lkotlin/Function1;", "default", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "containsKey", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "z", "a", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "b", "Lkotlin/jvm/functions/Function1;", "c", "size", "", "()Ljava/util/Set;", "keys", "", "d", "()Ljava/util/Collection;", "values", "", "entries", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7684h0<K, V> implements InterfaceC7682g0<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<K, V> map;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<K, V> default;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7684h0(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.map = map;
        this.default = function1;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Map.Entry<K, V>> m31766a() {
        return mo31763h().entrySet();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public Set<K> m31767b() {
        return mo31763h().keySet();
    }

    /* JADX INFO: renamed from: c */
    public int m31768c() {
        return mo31763h().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return mo31763h().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return mo31763h().containsValue(value);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public Collection<V> m31769d() {
        return mo31763h().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m31766a();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return mo31763h().equals(other);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return mo31763h().get(key);
    }

    @Override // kotlin.collections.InterfaceC7682g0
    @NotNull
    /* JADX INFO: renamed from: h */
    public Map<K, V> mo31763h() {
        return this.map;
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo31763h().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo31763h().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m31767b();
    }

    @Override // java.util.Map
    public V put(K k10, V v5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m31768c();
    }

    @NotNull
    public String toString() {
        return mo31763h().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m31769d();
    }

    @Override // kotlin.collections.InterfaceC7682g0
    /* JADX INFO: renamed from: z */
    public V mo31764z(K key) {
        Map<K, V> mapMo31763h = mo31763h();
        V v5 = mapMo31763h.get(key);
        return (v5 != null || mapMo31763h.containsKey(key)) ? v5 : this.default.invoke(key);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
