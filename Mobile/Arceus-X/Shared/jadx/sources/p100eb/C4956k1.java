package p100eb;

import java.util.Iterator;

/* JADX INFO: renamed from: eb.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4956k1 extends AbstractC4932g1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4962l1 f19678c;

    public C4956k1(C4962l1 c4962l1) {
        this.f19678c = c4962l1;
    }

    @Override // p100eb.AbstractC4938h1, p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: d */
    public final AbstractC4909c2 mo23575d() {
        return mo23611i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo23611i().listIterator(0);
    }

    @Override // p100eb.AbstractC4938h1
    /* JADX INFO: renamed from: k */
    public final AbstractC4920e1 mo23612k() {
        return new C4950j1(this);
    }

    @Override // p100eb.AbstractC4932g1
    /* JADX INFO: renamed from: t */
    public final AbstractC4926f1 mo23597t() {
        return this.f19678c;
    }
}
