package lg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<l> f22139a;

    public i() {
        this.f22139a = new ArrayList<>();
    }

    public l A(int i10) {
        return this.f22139a.get(i10);
    }

    public final l B() {
        int size = this.f22139a.size();
        if (size == 1) {
            return this.f22139a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // lg.l
    public boolean b() {
        return B().b();
    }

    @Override // lg.l
    public double c() {
        return B().c();
    }

    @Override // lg.l
    public float d() {
        return B().d();
    }

    @Override // lg.l
    public int e() {
        return B().e();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f22139a.equals(this.f22139a);
        }
        return true;
    }

    public int hashCode() {
        return this.f22139a.hashCode();
    }

    @Override // lg.l
    public long i() {
        return B().i();
    }

    public boolean isEmpty() {
        return this.f22139a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f22139a.iterator();
    }

    @Override // lg.l
    public Number j() {
        return B().j();
    }

    @Override // lg.l
    public String l() {
        return B().l();
    }

    public int size() {
        return this.f22139a.size();
    }

    public void v(String str) {
        this.f22139a.add(str == null ? n.f22140a : new r(str));
    }

    public void w(l lVar) {
        if (lVar == null) {
            lVar = n.f22140a;
        }
        this.f22139a.add(lVar);
    }

    @Override // lg.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public i a() {
        if (this.f22139a.isEmpty()) {
            return new i();
        }
        i iVar = new i(this.f22139a.size());
        ArrayList<l> arrayList = this.f22139a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = arrayList.get(i10);
            i10++;
            iVar.w(lVar.a());
        }
        return iVar;
    }

    public i(int i10) {
        this.f22139a = new ArrayList<>(i10);
    }
}
