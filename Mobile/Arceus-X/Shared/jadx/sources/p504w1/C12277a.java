package p504w1;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p532x1.C12627a;

/* JADX INFO: renamed from: w1.a */
/* JADX INFO: loaded from: classes.dex */
public class C12277a<K, V> extends C12286j<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d */
    public C12277a<K, V>.a f43489d;

    /* JADX INFO: renamed from: e */
    public C12277a<K, V>.c f43490e;

    /* JADX INFO: renamed from: f */
    public C12277a<K, V>.e f43491f;

    /* JADX INFO: renamed from: w1.a$a */
    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C12277a.this.getSize();
        }
    }

    /* JADX INFO: renamed from: w1.a$b */
    public final class b extends AbstractC12282f<K> {
        public b() {
            super(C12277a.this.getSize());
        }

        @Override // p504w1.AbstractC12282f
        /* JADX INFO: renamed from: a */
        public K mo45580a(int i10) {
            return C12277a.this.m45625f(i10);
        }

        @Override // p504w1.AbstractC12282f
        /* JADX INFO: renamed from: b */
        public void mo45581b(int i10) {
            C12277a.this.m45627i(i10);
        }
    }

    /* JADX INFO: renamed from: w1.a$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f43495a;

        /* JADX INFO: renamed from: b */
        public int f43496b = -1;

        /* JADX INFO: renamed from: c */
        public boolean f43497c;

        public d() {
            this.f43495a = C12277a.this.getSize() - 1;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f43496b++;
            this.f43497c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f43497c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C12627a.m47049c(entry.getKey(), C12277a.this.m45625f(this.f43496b)) && C12627a.m47049c(entry.getValue(), C12277a.this.m45629k(this.f43496b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f43497c) {
                return C12277a.this.m45625f(this.f43496b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f43497c) {
                return C12277a.this.m45629k(this.f43496b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43496b < this.f43495a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f43497c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kM45625f = C12277a.this.m45625f(this.f43496b);
            V vM45629k = C12277a.this.m45629k(this.f43496b);
            return (kM45625f == null ? 0 : kM45625f.hashCode()) ^ (vM45629k != null ? vM45629k.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f43497c) {
                throw new IllegalStateException();
            }
            C12277a.this.m45627i(this.f43496b);
            this.f43496b--;
            this.f43495a--;
            this.f43497c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            if (this.f43497c) {
                return C12277a.this.m45628j(this.f43496b, v5);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: w1.a$f */
    public final class f extends AbstractC12282f<V> {
        public f() {
            super(C12277a.this.getSize());
        }

        @Override // p504w1.AbstractC12282f
        /* JADX INFO: renamed from: a */
        public V mo45580a(int i10) {
            return C12277a.this.m45629k(i10);
        }

        @Override // p504w1.AbstractC12282f
        /* JADX INFO: renamed from: b */
        public void mo45581b(int i10) {
            C12277a.this.m45627i(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12277a() {
    }

    /* JADX INFO: renamed from: m */
    public static <T> boolean m45576m(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p504w1.C12286j, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p504w1.C12286j, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        C12277a<K, V>.a aVar = this.f43489d;
        if (aVar != null) {
            return aVar;
        }
        C12277a<K, V>.a aVar2 = new a();
        this.f43489d = aVar2;
        return aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p504w1.C12286j, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        C12277a<K, V>.c cVar = this.f43490e;
        if (cVar != null) {
            return cVar;
        }
        C12277a<K, V>.c cVar2 = new c();
        this.f43490e = cVar2;
        return cVar2;
    }

    /* JADX INFO: renamed from: l */
    public boolean m45577l(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m45578n(@NonNull Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    /* JADX INFO: renamed from: o */
    public boolean m45579o(@NonNull Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m45625f(size2))) {
                m45627i(size2);
            }
        }
        return size != getSize();
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        m45621b(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p504w1.C12286j, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        C12277a<K, V>.e eVar = this.f43491f;
        if (eVar != null) {
            return eVar;
        }
        C12277a<K, V>.e eVar2 = new e();
        this.f43491f = eVar2;
        return eVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12277a(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: w1.a$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C12277a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C12277a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NonNull Collection<?> collection) {
            return C12277a.this.m45577l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C12277a.m45576m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C12277a.this.getSize() - 1; size >= 0; size--) {
                K kM45625f = C12277a.this.m45625f(size);
                iHashCode += kM45625f == null ? 0 : kM45625f.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C12277a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iM45623d = C12277a.this.m45623d(obj);
            if (iM45623d < 0) {
                return false;
            }
            C12277a.this.m45627i(iM45623d);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            return C12277a.this.m45578n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            return C12277a.this.m45579o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C12277a.this.getSize();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Set, java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = C12277a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C12277a.this.m45625f(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C12277a.this.m45625f(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: renamed from: w1.a$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C12277a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C12277a.this.m45620a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C12277a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iM45620a = C12277a.this.m45620a(obj);
            if (iM45620a < 0) {
                return false;
            }
            C12277a.this.m45627i(iM45620a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            int size = C12277a.this.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C12277a.this.m45629k(i10))) {
                    C12277a.this.m45627i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            int size = C12277a.this.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C12277a.this.m45629k(i10))) {
                    C12277a.this.m45627i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C12277a.this.getSize();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = C12277a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C12277a.this.m45629k(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C12277a.this.m45629k(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public C12277a(C12286j c12286j) {
        super(c12286j);
    }
}
