package eb;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f15287c;

    public k1(l1 l1Var) {
        this.f15287c = l1Var;
    }

    @Override // eb.h1, eb.z0
    public final c2 d() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // eb.h1
    public final e1 k() {
        return new j1(this);
    }

    @Override // eb.g1
    public final f1 t() {
        return this.f15287c;
    }
}
