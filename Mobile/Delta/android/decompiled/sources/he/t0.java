package he;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f19284a;
        public final /* synthetic */ Set b;

        /* JADX INFO: renamed from: he.t0$a$a, reason: collision with other inner class name */
        public class C0341a extends he.b<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Iterator<? extends E> f19285c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<? extends E> f19286d;

            public C0341a() {
                this.f19285c = a.this.f19284a.iterator();
                this.f19286d = a.this.b.iterator();
            }

            @Override // he.b
            public E b() {
                if (this.f19285c.hasNext()) {
                    return this.f19285c.next();
                }
                while (this.f19286d.hasNext()) {
                    E next = this.f19286d.next();
                    if (!a.this.f19284a.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f19284a = set;
            this.b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0<E> iterator() {
            return new C0341a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f19284a.contains(obj) || this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f19284a.isEmpty() && this.b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f19284a.size();
            Iterator<E> it = this.b.iterator();
            while (it.hasNext()) {
                if (!this.f19284a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b<E> extends AbstractSet<E> {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract y0<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public b() {
        }
    }

    public static boolean a(Set<?> set, Object obj) {
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

    public static int b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> Set<E> c() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> b<E> d(Set<? extends E> set, Set<? extends E> set2) {
        ge.n.m(set, "set1");
        ge.n.m(set2, "set2");
        return new a(set, set2);
    }
}
