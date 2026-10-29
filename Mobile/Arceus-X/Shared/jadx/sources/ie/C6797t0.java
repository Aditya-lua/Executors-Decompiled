package ie;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6797t0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: ie.t0$a */
    public class a<E> extends b<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f26717a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f26718b;

        /* JADX INFO: renamed from: ie.t0$a$a, reason: collision with other inner class name */
        public class C14187a extends AbstractC6760b<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends E> f26719c;

            /* JADX INFO: renamed from: d */
            public final Iterator<? extends E> f26720d;

            public C14187a() {
                this.f26719c = a.this.f26717a.iterator();
                this.f26720d = a.this.f26718b.iterator();
            }

            @Override // ie.AbstractC6760b
            /* JADX INFO: renamed from: b */
            public E mo28877b() {
                if (this.f26719c.hasNext()) {
                    return this.f26719c.next();
                }
                while (this.f26720d.hasNext()) {
                    E next = this.f26720d.next();
                    if (!a.this.f26717a.contains(next)) {
                        return next;
                    }
                }
                return m28878d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f26717a = set;
            this.f26718b = set2;
        }

        /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6807y0<E> iterator() {
            return new C14187a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26717a.contains(obj) || this.f26718b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f26717a.isEmpty() && this.f26718b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f26717a.size();
            Iterator<E> it = this.f26718b.iterator();
            while (it.hasNext()) {
                if (!this.f26717a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: renamed from: ie.t0$b */
    public static abstract class b<E> extends AbstractSet<E> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ie.t0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract AbstractC6807y0<E> iterator();

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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m29109a(Set<?> set, Object obj) {
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

    /* JADX INFO: renamed from: b */
    public static int m29110b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static <E> Set<E> m29111c() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX INFO: renamed from: d */
    public static <E> b<E> m29112d(Set<? extends E> set, Set<? extends E> set2) {
        C6384n.m27929m(set, "set1");
        C6384n.m27929m(set2, "set2");
        return new a(set, set2);
    }
}
