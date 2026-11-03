package ne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j<V, C> extends g<V, C> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<b<V>> f27135p;

    public static final class a<V> extends j<V, List<V>> {
        public a(ie.r<? extends x<? extends V>> rVar, boolean z10) {
            super(rVar, z10);
            W();
        }

        @Override // ne.j
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public List<V> a0(List<b<V>> list) {
            ArrayList arrayListH = ie.d0.h(list.size());
            Iterator<b<V>> it = list.iterator();
            while (it.hasNext()) {
                b<V> next = it.next();
                arrayListH.add(next != null ? next.f27136a : null);
            }
            return Collections.unmodifiableList(arrayListH);
        }
    }

    public static final class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public V f27136a;

        public b(V v5) {
            this.f27136a = v5;
        }
    }

    public j(ie.r<? extends x<? extends V>> rVar, boolean z10) {
        super(rVar, z10, true);
        List<b<V>> listH = rVar.isEmpty() ? Collections.EMPTY_LIST : ie.d0.h(rVar.size());
        for (int i10 = 0; i10 < rVar.size(); i10++) {
            listH.add(null);
        }
        this.f27135p = listH;
    }

    @Override // ne.g
    public final void R(int i10, V v5) {
        List<b<V>> list = this.f27135p;
        if (list != null) {
            list.set(i10, new b<>(v5));
        }
    }

    @Override // ne.g
    public final void U() {
        List<b<V>> list = this.f27135p;
        if (list != null) {
            D(a0(list));
        }
    }

    @Override // ne.g
    public void Z(g.a aVar) {
        super.Z(aVar);
        this.f27135p = null;
    }

    public abstract C a0(List<b<V>> list);
}
