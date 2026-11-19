package fb;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f15757c;

    public k1(l1 l1Var) {
        this.f15757c = l1Var;
    }

    @Override // fb.h1, fb.z0
    public final c2 d() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // fb.h1
    public final e1 j() {
        return new j1(this);
    }

    @Override // fb.g1
    public final f1 q() {
        return this.f15757c;
    }
}
