package eb;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f15284c;

    public j1(k1 k1Var) {
        this.f15284c = k1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return new AbstractMap.SimpleImmutableEntry(this.f15284c.f15287c.f15292c.f15417e.get(i10), this.f15284c.f15287c.f15293d.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15284c.f15287c.size();
    }
}
