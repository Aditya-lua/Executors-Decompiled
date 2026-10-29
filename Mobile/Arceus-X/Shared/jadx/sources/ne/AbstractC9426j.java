package ne;

import ie.AbstractC6792r;
import ie.C6765d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ne.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9426j<V, C> extends AbstractC9421g<V, C> {

    /* JADX INFO: renamed from: p */
    public List<b<V>> f33948p;

    /* JADX INFO: renamed from: ne.j$a */
    public static final class a<V> extends AbstractC9426j<V, List<V>> {
        public a(AbstractC6792r<? extends InterfaceFutureC9440x<? extends V>> abstractC6792r, boolean z10) {
            super(abstractC6792r, z10);
            m37223W();
        }

        /* JADX DEBUG: Method merged with bridge method: a0(Ljava/util/List;)Ljava/lang/Object; */
        @Override // ne.AbstractC9426j
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public List<V> mo37243a0(List<b<V>> list) {
            ArrayList arrayListM28897h = C6765d0.m28897h(list.size());
            Iterator<b<V>> it = list.iterator();
            while (it.hasNext()) {
                b<V> next = it.next();
                arrayListM28897h.add(next != null ? next.f33949a : null);
            }
            return Collections.unmodifiableList(arrayListM28897h);
        }
    }

    /* JADX INFO: renamed from: ne.j$b */
    public static final class b<V> {

        /* JADX INFO: renamed from: a */
        public V f33949a;

        public b(V v5) {
            this.f33949a = v5;
        }
    }

    public AbstractC9426j(AbstractC6792r<? extends InterfaceFutureC9440x<? extends V>> abstractC6792r, boolean z10) {
        super(abstractC6792r, z10, true);
        List<b<V>> listM28897h = abstractC6792r.isEmpty() ? Collections.EMPTY_LIST : C6765d0.m28897h(abstractC6792r.size());
        for (int i10 = 0; i10 < abstractC6792r.size(); i10++) {
            listM28897h.add(null);
        }
        this.f33948p = listM28897h;
    }

    @Override // ne.AbstractC9421g
    /* JADX INFO: renamed from: R */
    public final void mo37218R(int i10, V v5) {
        List<b<V>> list = this.f33948p;
        if (list != null) {
            list.set(i10, new b<>(v5));
        }
    }

    @Override // ne.AbstractC9421g
    /* JADX INFO: renamed from: U */
    public final void mo37221U() {
        List<b<V>> list = this.f33948p;
        if (list != null) {
            mo37169D(mo37243a0(list));
        }
    }

    @Override // ne.AbstractC9421g
    /* JADX INFO: renamed from: Z */
    public void mo37225Z(AbstractC9421g.a aVar) {
        super.mo37225Z(aVar);
        this.f33948p = null;
    }

    /* JADX INFO: renamed from: a0 */
    public abstract C mo37243a0(List<b<V>> list);
}
