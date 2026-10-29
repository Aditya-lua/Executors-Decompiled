package p136ft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ft.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5836j<T> implements InterfaceC5830d<Set<T>> {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5830d<Set<Object>> f22235c = C5831e.m26182a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC5835i<T>> f22236a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC5835i<Collection<T>>> f22237b;

    /* JADX INFO: renamed from: ft.j$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC5835i<T>> f22238a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC5835i<Collection<T>>> f22239b;

        /* JADX INFO: renamed from: a */
        public b<T> m26197a(InterfaceC5835i<? extends Collection<? extends T>> interfaceC5835i) {
            this.f22239b.add(interfaceC5835i);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b<T> m26198b(InterfaceC5835i<? extends T> interfaceC5835i) {
            this.f22238a.add(interfaceC5835i);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C5836j<T> m26199c() {
            return new C5836j<>(this.f22238a, this.f22239b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(int i10, int i11) {
            this.f22238a = C5828b.m26177d(i10);
            this.f22239b = C5828b.m26177d(i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> b<T> m26195a(int i10, int i11) {
        return new b<>(i10, i11);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f22236a.size();
        ArrayList arrayList = new ArrayList(this.f22237b.size());
        int size2 = this.f22237b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> collection = this.f22237b.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetM26175b = C5828b.m26175b(size);
        int size3 = this.f22236a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            hashSetM26175b.add(C5834h.m26191b(this.f22236a.get(i11).get()));
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Iterator it = ((Collection) arrayList.get(i12)).iterator();
            while (it.hasNext()) {
                hashSetM26175b.add(C5834h.m26191b(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetM26175b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5836j(List<InterfaceC5835i<T>> list, List<InterfaceC5835i<Collection<T>>> list2) {
        this.f22236a = list;
        this.f22237b = list2;
    }
}
