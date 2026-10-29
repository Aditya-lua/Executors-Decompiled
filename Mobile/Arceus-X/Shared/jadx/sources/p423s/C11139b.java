package p423s;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s.b */
/* JADX INFO: loaded from: classes.dex */
public class C11139b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public c<K, V> f39323a;

    /* JADX INFO: renamed from: b */
    public c<K, V> f39324b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap<f<K, V>, Boolean> f39325c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f39326d = 0;

    /* JADX INFO: renamed from: s.b$a */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p423s.C11139b.e
        /* JADX INFO: renamed from: b */
        public c<K, V> mo41925b(c<K, V> cVar) {
            return cVar.f39330d;
        }

        @Override // p423s.C11139b.e
        /* JADX INFO: renamed from: d */
        public c<K, V> mo41926d(c<K, V> cVar) {
            return cVar.f39329c;
        }
    }

    /* JADX INFO: renamed from: s.b$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p423s.C11139b.e
        /* JADX INFO: renamed from: b */
        public c<K, V> mo41925b(c<K, V> cVar) {
            return cVar.f39329c;
        }

        @Override // p423s.C11139b.e
        /* JADX INFO: renamed from: d */
        public c<K, V> mo41926d(c<K, V> cVar) {
            return cVar.f39330d;
        }
    }

    /* JADX INFO: renamed from: s.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final K f39327a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final V f39328b;

        /* JADX INFO: renamed from: c */
        public c<K, V> f39329c;

        /* JADX INFO: renamed from: d */
        public c<K, V> f39330d;

        public c(@NonNull K k10, @NonNull V v5) {
            this.f39327a = k10;
            this.f39328b = v5;
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
            return this.f39327a.equals(cVar.f39327a) && this.f39328b.equals(cVar.f39328b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f39327a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f39328b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f39327a.hashCode() ^ this.f39328b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f39327a + "=" + this.f39328b;
        }
    }

    /* JADX INFO: renamed from: s.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public c<K, V> f39331a;

        /* JADX INFO: renamed from: b */
        public boolean f39332b = true;

        public d() {
        }

        @Override // p423s.C11139b.f
        /* JADX INFO: renamed from: a */
        public void mo41927a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f39331a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f39330d;
                this.f39331a = cVar3;
                this.f39332b = cVar3 == null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f39332b) {
                this.f39332b = false;
                this.f39331a = C11139b.this.f39323a;
            } else {
                c<K, V> cVar = this.f39331a;
                this.f39331a = cVar != null ? cVar.f39329c : null;
            }
            return this.f39331a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f39332b) {
                return C11139b.this.f39323a != null;
            }
            c<K, V> cVar = this.f39331a;
            return (cVar == null || cVar.f39329c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: s.b$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public c<K, V> f39334a;

        /* JADX INFO: renamed from: b */
        public c<K, V> f39335b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f39334a = cVar2;
            this.f39335b = cVar;
        }

        @Override // p423s.C11139b.f
        /* JADX INFO: renamed from: a */
        public void mo41927a(@NonNull c<K, V> cVar) {
            if (this.f39334a == cVar && cVar == this.f39335b) {
                this.f39335b = null;
                this.f39334a = null;
            }
            c<K, V> cVar2 = this.f39334a;
            if (cVar2 == cVar) {
                this.f39334a = mo41925b(cVar2);
            }
            if (this.f39335b == cVar) {
                this.f39335b = m41930f();
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract c<K, V> mo41925b(c<K, V> cVar);

        /* JADX INFO: renamed from: d */
        public abstract c<K, V> mo41926d(c<K, V> cVar);

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f39335b;
            this.f39335b = m41930f();
            return cVar;
        }

        /* JADX INFO: renamed from: f */
        public final c<K, V> m41930f() {
            c<K, V> cVar = this.f39335b;
            c<K, V> cVar2 = this.f39334a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo41926d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39335b != null;
        }
    }

    /* JADX INFO: renamed from: s.b$f */
    public static abstract class f<K, V> {
        /* JADX INFO: renamed from: a */
        public abstract void mo41927a(@NonNull c<K, V> cVar);
    }

    /* JADX INFO: renamed from: a */
    public Map.Entry<K, V> m41921a() {
        return this.f39323a;
    }

    /* JADX INFO: renamed from: b */
    public c<K, V> mo41917b(K k10) {
        c<K, V> cVar = this.f39323a;
        while (cVar != null && !cVar.f39327a.equals(k10)) {
            cVar = cVar.f39329c;
        }
        return cVar;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C11139b<K, V>.d m41922c() {
        C11139b<K, V>.d dVar = new d();
        this.f39325c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX INFO: renamed from: d */
    public Map.Entry<K, V> m41923d() {
        return this.f39324b;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f39324b, this.f39323a);
        this.f39325c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public c<K, V> m41924e(@NonNull K k10, @NonNull V v5) {
        c<K, V> cVar = new c<>(k10, v5);
        this.f39326d++;
        c<K, V> cVar2 = this.f39324b;
        if (cVar2 == null) {
            this.f39323a = cVar;
            this.f39324b = cVar;
            return cVar;
        }
        cVar2.f39329c = cVar;
        cVar.f39330d = cVar2;
        this.f39324b = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11139b)) {
            return false;
        }
        C11139b c11139b = (C11139b) obj;
        if (size() != c11139b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c11139b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public V mo41918f(@NonNull K k10, @NonNull V v5) {
        c<K, V> cVarMo41917b = mo41917b(k10);
        if (cVarMo41917b != null) {
            return cVarMo41917b.f39328b;
        }
        m41924e(k10, v5);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public V mo41919g(@NonNull K k10) {
        c<K, V> cVarMo41917b = mo41917b(k10);
        if (cVarMo41917b == null) {
            return null;
        }
        this.f39326d--;
        if (!this.f39325c.isEmpty()) {
            Iterator<f<K, V>> it = this.f39325c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo41927a(cVarMo41917b);
            }
        }
        c<K, V> cVar = cVarMo41917b.f39330d;
        if (cVar != null) {
            cVar.f39329c = cVarMo41917b.f39329c;
        } else {
            this.f39323a = cVarMo41917b.f39329c;
        }
        c<K, V> cVar2 = cVarMo41917b.f39329c;
        if (cVar2 != null) {
            cVar2.f39330d = cVar;
        } else {
            this.f39324b = cVar;
        }
        cVarMo41917b.f39329c = null;
        cVarMo41917b.f39330d = null;
        return cVarMo41917b.f39328b;
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
        a aVar = new a(this.f39323a, this.f39324b);
        this.f39325c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f39326d;
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
