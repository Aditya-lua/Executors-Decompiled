package eb;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient i f13311c;

    public g(i iVar) {
        this.f13311c = iVar;
    }

    @Override // eb.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13311c.contains(obj);
    }

    @Override // eb.i
    public final i e() {
        return this.f13311c;
    }

    @Override // eb.i
    /* JADX INFO: renamed from: f */
    public final i subList(int i10, int i11) {
        i iVar = this.f13311c;
        s.d(i10, i11, iVar.size());
        return iVar.subList(iVar.size() - i11, iVar.size() - i10).e();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i iVar = this.f13311c;
        s.b(i10, iVar.size(), "index");
        return iVar.get(n(i10));
    }

    @Override // eb.i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f13311c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return n(iLastIndexOf);
        }
        return -1;
    }

    @Override // eb.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f13311c.indexOf(obj);
        if (iIndexOf >= 0) {
            return n(iIndexOf);
        }
        return -1;
    }

    public final int n(int i10) {
        return (this.f13311c.size() - 1) - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13311c.size();
    }

    @Override // eb.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
