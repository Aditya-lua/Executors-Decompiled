package ie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: ie.x */
/* JADX INFO: loaded from: classes2.dex */
public class C6804x<K, V> extends AbstractC6800v<K, V> implements InterfaceC6771g0 {

    /* JADX INFO: renamed from: c */
    public final transient AbstractC6802w<V> f26745c;

    /* JADX INFO: renamed from: d */
    public transient AbstractC6802w<Map.Entry<K, V>> f26746d;

    /* JADX INFO: renamed from: ie.x$a */
    public static final class a<K, V> extends AbstractC6800v.b<K, V> {
        @Override // ie.AbstractC6800v.b
        /* JADX INFO: renamed from: a */
        public Collection<V> mo29134a() {
            return C6785n0.m29023c();
        }

        /* JADX INFO: renamed from: c */
        public C6804x<K, V> m29153c() {
            Collection collectionEntrySet = this.f26741a.entrySet();
            Comparator<? super K> comparator = this.f26742b;
            if (comparator != null) {
                collectionEntrySet = AbstractC6783m0.m29016a(comparator).m29019d().m29018b(collectionEntrySet);
            }
            return C6804x.m29149i(collectionEntrySet, this.f26743c);
        }

        /* JADX INFO: renamed from: d */
        public a<K, V> m29154d(K k10, Iterable<? extends V> iterable) {
            super.m29135b(k10, iterable);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a<K, V> m29155e(K k10, V... vArr) {
            return m29154d(k10, Arrays.asList(vArr));
        }
    }

    /* JADX INFO: renamed from: ie.x$b */
    public static final class b<K, V> extends AbstractC6802w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c */
        public final transient C6804x<K, V> f26747c;

        public b(C6804x<K, V> c6804x) {
            this.f26747c = c6804x;
        }

        @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f26747c.mo28889b(entry.getKey(), entry.getValue());
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: f */
        public boolean mo29035f() {
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
        @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public AbstractC6807y0<Map.Entry<K, V>> iterator() {
            return this.f26747c.m29131d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26747c.m29132e();
        }
    }

    public C6804x(AbstractC6798u<K, AbstractC6802w<V>> abstractC6798u, int i10, Comparator<? super V> comparator) {
        super(abstractC6798u, i10);
        this.f26745c = m29148g(comparator);
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> a<K, V> m29147f() {
        return new a<>();
    }

    /* JADX INFO: renamed from: g */
    public static <V> AbstractC6802w<V> m29148g(Comparator<? super V> comparator) {
        return comparator == null ? AbstractC6802w.m29140t() : AbstractC6806y.m29159F(comparator);
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> C6804x<K, V> m29149i(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m29150j();
        }
        AbstractC6798u.a aVar = new AbstractC6798u.a(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            AbstractC6802w abstractC6802wM29151k = m29151k(comparator, entry.getValue());
            if (!abstractC6802wM29151k.isEmpty()) {
                aVar.mo29043f(key, abstractC6802wM29151k);
                size += abstractC6802wM29151k.size();
            }
        }
        return new C6804x<>(aVar.mo29042c(), size, comparator);
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> C6804x<K, V> m29150j() {
        return C6784n.f26672e;
    }

    /* JADX INFO: renamed from: k */
    public static <V> AbstractC6802w<V> m29151k(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? AbstractC6802w.m29138k(collection) : AbstractC6806y.m29158C(comparator, collection);
    }

    /* JADX INFO: renamed from: h */
    public AbstractC6802w<Map.Entry<K, V>> m29152h() {
        AbstractC6802w<Map.Entry<K, V>> abstractC6802w = this.f26746d;
        if (abstractC6802w != null) {
            return abstractC6802w;
        }
        b bVar = new b(this);
        this.f26746d = bVar;
        return bVar;
    }
}
