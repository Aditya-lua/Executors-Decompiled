package jg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<l> f21438a;

    public i() {
        this.f21438a = new ArrayList<>();
    }

    public l A(int i10) {
        return this.f21438a.get(i10);
    }

    public final l B() {
        int size = this.f21438a.size();
        if (size == 1) {
            return this.f21438a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // jg.l
    public boolean b() {
        return B().b();
    }

    @Override // jg.l
    public double c() {
        return B().c();
    }

    @Override // jg.l
    public float d() {
        return B().d();
    }

    @Override // jg.l
    public int e() {
        return B().e();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f21438a.equals(this.f21438a);
        }
        return true;
    }

    public int hashCode() {
        return this.f21438a.hashCode();
    }

    @Override // jg.l
    public long i() {
        return B().i();
    }

    public boolean isEmpty() {
        return this.f21438a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f21438a.iterator();
    }

    @Override // jg.l
    public Number k() {
        return B().k();
    }

    @Override // jg.l
    public String l() {
        return B().l();
    }

    public int size() {
        return this.f21438a.size();
    }

    public void x(String str) {
        this.f21438a.add(str == null ? n.f21439a : new r(str));
    }

    public void y(l lVar) {
        if (lVar == null) {
            lVar = n.f21439a;
        }
        this.f21438a.add(lVar);
    }

    @Override // jg.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public i a() {
        if (this.f21438a.isEmpty()) {
            return new i();
        }
        i iVar = new i(this.f21438a.size());
        ArrayList<l> arrayList = this.f21438a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = arrayList.get(i10);
            i10++;
            iVar.y(lVar.a());
        }
        return iVar;
    }

    public i(int i10) {
        this.f21438a = new ArrayList<>(i10);
    }
}
