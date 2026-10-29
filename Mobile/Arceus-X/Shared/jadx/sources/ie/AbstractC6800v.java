package ie;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ie.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6800v<K, V> extends AbstractC6766e<K, V> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final transient AbstractC6798u<K, ? extends AbstractC6792r<V>> f26735a;

    /* JADX INFO: renamed from: b */
    public final transient int f26736b;

    /* JADX INFO: renamed from: ie.v$a */
    public class a extends AbstractC6807y0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends Map.Entry<K, ? extends AbstractC6792r<V>>> f26737a;

        /* JADX INFO: renamed from: b */
        public K f26738b = null;

        /* JADX INFO: renamed from: c */
        public Iterator<V> f26739c = C6761b0.m28883c();

        public a() {
            this.f26737a = AbstractC6800v.this.f26735a.entrySet().iterator();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f26739c.hasNext()) {
                Map.Entry<K, ? extends AbstractC6792r<V>> next = this.f26737a.next();
                this.f26738b = next.getKey();
                this.f26739c = next.getValue().iterator();
            }
            K k10 = this.f26738b;
            Objects.requireNonNull(k10);
            return C6769f0.m28899b(k10, this.f26739c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26739c.hasNext() || this.f26737a.hasNext();
        }
    }

    /* JADX INFO: renamed from: ie.v$b */
    public static class b<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, Collection<V>> f26741a = C6785n0.m29024d();

        /* JADX INFO: renamed from: b */
        public Comparator<? super K> f26742b;

        /* JADX INFO: renamed from: c */
        public Comparator<? super V> f26743c;

        /* JADX INFO: renamed from: a */
        public Collection<V> mo29134a() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public b<K, V> m29135b(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                String strValueOf = String.valueOf(C6759a0.m28876c(iterable));
                throw new NullPointerException(strValueOf.length() != 0 ? "null key in entry: null=".concat(strValueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f26741a.get(k10);
            if (collection != null) {
                for (V v5 : iterable) {
                    C6770g.m28906a(k10, v5);
                    collection.add(v5);
                }
            } else {
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    Collection<V> collectionMo29134a = mo29134a();
                    while (it.hasNext()) {
                        V next = it.next();
                        C6770g.m28906a(k10, next);
                        collectionMo29134a.add(next);
                    }
                    this.f26741a.put(k10, collectionMo29134a);
                    return this;
                }
            }
            return this;
        }
    }

    public AbstractC6800v(AbstractC6798u<K, ? extends AbstractC6792r<V>> abstractC6798u, int i10) {
        this.f26735a = abstractC6798u;
        this.f26736b = i10;
    }

    @Override // ie.AbstractC6764d
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo28889b(Object obj, Object obj2) {
        return super.mo28889b(obj, obj2);
    }

    /* JADX DEBUG: Method merged with bridge method: a()Ljava/util/Map; */
    @Override // ie.AbstractC6764d, ie.InterfaceC6771g0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC6798u<K, Collection<V>> mo28888a() {
        return this.f26735a;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC6807y0<Map.Entry<K, V>> m29131d() {
        return new a();
    }

    /* JADX INFO: renamed from: e */
    public int m29132e() {
        return this.f26736b;
    }

    @Override // ie.AbstractC6764d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ie.AbstractC6764d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // ie.AbstractC6764d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
