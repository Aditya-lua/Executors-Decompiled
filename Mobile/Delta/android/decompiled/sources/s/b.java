package s;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<K, V> f30936a;
    public c<K, V> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f30937c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30938d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // s.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f30941d;
        }

        @Override // s.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f30940c;
        }
    }

    /* JADX INFO: renamed from: s.b$b, reason: collision with other inner class name */
    public static class C0544b<K, V> extends e<K, V> {
        public C0544b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // s.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f30940c;
        }

        @Override // s.b.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f30941d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final K f30939a;

        @NonNull
        public final V b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f30940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f30941d;

        public c(@NonNull K k10, @NonNull V v5) {
            this.f30939a = k10;
            this.b = v5;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30939a.equals(cVar.f30939a) && this.b.equals(cVar.b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f30939a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f30939a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f30939a + "=" + this.b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f30942a;
        public boolean b = true;

        public d() {
        }

        @Override // s.b.f
        public void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f30942a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f30941d;
                this.f30942a = cVar3;
                this.b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.b) {
                this.b = false;
                this.f30942a = b.this.f30936a;
            } else {
                c<K, V> cVar = this.f30942a;
                this.f30942a = cVar != null ? cVar.f30940c : null;
            }
            return this.f30942a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b) {
                return b.this.f30936a != null;
            }
            c<K, V> cVar = this.f30942a;
            return (cVar == null || cVar.f30940c == null) ? false : true;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f30944a;
        public c<K, V> b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f30944a = cVar2;
            this.b = cVar;
        }

        @Override // s.b.f
        public void a(@NonNull c<K, V> cVar) {
            if (this.f30944a == cVar && cVar == this.b) {
                this.b = null;
                this.f30944a = null;
            }
            c<K, V> cVar2 = this.f30944a;
            if (cVar2 == cVar) {
                this.f30944a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = f();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = f();
            return cVar;
        }

        public final c<K, V> f() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.f30944a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f30936a;
    }

    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f30936a;
        while (cVar != null && !cVar.f30939a.equals(k10)) {
            cVar = cVar.f30940c;
        }
        return cVar;
    }

    @NonNull
    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f30937c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.b;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0544b c0544b = new C0544b(this.b, this.f30936a);
        this.f30937c.put(c0544b, Boolean.FALSE);
        return c0544b;
    }

    public c<K, V> e(@NonNull K k10, @NonNull V v5) {
        c<K, V> cVar = new c<>(k10, v5);
        this.f30938d++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.f30936a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.f30940c = cVar;
        cVar.f30941d = cVar2;
        this.b = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public V f(@NonNull K k10, @NonNull V v5) {
        c<K, V> cVarB = b(k10);
        if (cVarB != null) {
            return cVarB.b;
        }
        e(k10, v5);
        return null;
    }

    public V g(@NonNull K k10) {
        c<K, V> cVarB = b(k10);
        if (cVarB == null) {
            return null;
        }
        this.f30938d--;
        if (!this.f30937c.isEmpty()) {
            Iterator<f<K, V>> it = this.f30937c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarB);
            }
        }
        c<K, V> cVar = cVarB.f30941d;
        if (cVar != null) {
            cVar.f30940c = cVarB.f30940c;
        } else {
            this.f30936a = cVarB.f30940c;
        }
        c<K, V> cVar2 = cVarB.f30940c;
        if (cVar2 != null) {
            cVar2.f30941d = cVar;
        } else {
            this.b = cVar;
        }
        cVarB.f30940c = null;
        cVarB.f30941d = null;
        return cVarB.b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f30936a, this.b);
        this.f30937c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f30938d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
