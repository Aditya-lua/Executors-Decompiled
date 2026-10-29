package p100eb;

import java.util.AbstractMap;

/* JADX INFO: renamed from: eb.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4950j1 extends AbstractC4920e1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4956k1 f19674c;

    public C4950j1(C4956k1 c4956k1) {
        this.f19674c = c4956k1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return new AbstractMap.SimpleImmutableEntry(this.f19674c.f19678c.f19684c.f19831e.get(i10), this.f19674c.f19678c.f19685d.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19674c.f19678c.size();
    }
}
