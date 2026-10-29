package wm;

import um.h;
import um.m;
import um.t;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f34443a;

    public b(h<T> hVar) {
        this.f34443a = hVar;
    }

    @Override // um.h
    public T fromJson(m mVar) {
        return mVar.u() == m.c.NULL ? (T) mVar.o() : this.f34443a.fromJson(mVar);
    }

    @Override // um.h
    public void toJson(t tVar, T t8) {
        if (t8 == null) {
            tVar.o();
        } else {
            this.f34443a.toJson(tVar, t8);
        }
    }

    public String toString() {
        return this.f34443a + ".nullSafe()";
    }
}
