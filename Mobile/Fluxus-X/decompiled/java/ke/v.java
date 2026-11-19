package ke;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient u<K, ? extends r<V>> f21442a;
    public final transient int b;

    public class a extends y0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends r<V>>> f21443a;
        public K b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<V> f21444c = b0.c();

        public a() {
            this.f21443a = v.this.f21442a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f21444c.hasNext()) {
                Map.Entry<K, ? extends r<V>> next = this.f21443a.next();
                this.b = next.getKey();
                this.f21444c = next.getValue().iterator();
            }
            K k10 = this.b;
            Objects.requireNonNull(k10);
            return f0.b(k10, this.f21444c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21444c.hasNext() || this.f21443a.hasNext();
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, Collection<V>> f21446a = n0.d();
        public Comparator<? super K> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Comparator<? super V> f21447c;

        public Collection<V> a() {
            throw null;
        }

        public b<K, V> b(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                String strValueOf = String.valueOf(a0.c(iterable));
                throw new NullPointerException(strValueOf.length() != 0 ? "null key in entry: null=".concat(strValueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f21446a.get(k10);
            if (collection != null) {
                for (V v8 : iterable) {
                    g.a(k10, v8);
                    collection.add(v8);
                }
            } else {
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    Collection<V> collectionA = a();
                    while (it.hasNext()) {
                        V next = it.next();
                        g.a(k10, next);
                        collectionA.add(next);
                    }
                    this.f21446a.put(k10, collectionA);
                    return this;
                }
            }
            return this;
        }
    }

    public v(u<K, ? extends r<V>> uVar, int i10) {
        this.f21442a = uVar;
        this.b = i10;
    }

    @Override // ke.d
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // ke.d, ke.g0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<K, Collection<V>> a() {
        return this.f21442a;
    }

    public y0<Map.Entry<K, V>> d() {
        return new a();
    }

    public int e() {
        return this.b;
    }

    @Override // ke.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ke.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // ke.d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
