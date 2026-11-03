package um;

import sm.h;
import sm.m;
import sm.t;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f33127a;

    public b(h<T> hVar) {
        this.f33127a = hVar;
    }

    @Override // sm.h
    public T fromJson(m mVar) {
        return mVar.u() == m.c.NULL ? (T) mVar.o() : this.f33127a.fromJson(mVar);
    }

    @Override // sm.h
    public void toJson(t tVar, T t8) {
        if (t8 == null) {
            tVar.o();
        } else {
            this.f33127a.toJson(tVar, t8);
        }
    }

    public String toString() {
        return this.f33127a + ".nullSafe()";
    }
}
