package ft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> implements d<Set<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d<Set<Object>> f17230c = e.a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i<T>> f17231a;
    public final List<i<Collection<T>>> b;

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<i<T>> f17232a;
        public final List<i<Collection<T>>> b;

        public b<T> a(i<? extends Collection<? extends T>> iVar) {
            this.b.add(iVar);
            return this;
        }

        public b<T> b(i<? extends T> iVar) {
            this.f17232a.add(iVar);
            return this;
        }

        public j<T> c() {
            return new j<>(this.f17232a, this.b);
        }

        public b(int i10, int i11) {
            this.f17232a = ft.b.d(i10);
            this.b = ft.b.d(i11);
        }
    }

    public static <T> b<T> a(int i10, int i11) {
        return new b<>(i10, i11);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f17231a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> collection = this.b.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetB = ft.b.b(size);
        int size3 = this.f17231a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            hashSetB.add(h.b(this.f17231a.get(i11).get()));
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Iterator it = ((Collection) arrayList.get(i12)).iterator();
            while (it.hasNext()) {
                hashSetB.add(h.b(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }

    public j(List<i<T>> list, List<i<Collection<T>>> list2) {
        this.f17231a = list;
        this.b = list2;
    }
}
