package jn;

import hn.h;
import hn.m;
import hn.t;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f20814a;

    public b(h<T> hVar) {
        this.f20814a = hVar;
    }

    @Override // hn.h
    public T fromJson(m mVar) {
        return mVar.w() == m.c.NULL ? (T) mVar.p() : this.f20814a.fromJson(mVar);
    }

    @Override // hn.h
    public void toJson(t tVar, T t8) {
        if (t8 == null) {
            tVar.p();
        } else {
            this.f20814a.toJson(tVar, t8);
        }
    }

    public String toString() {
        return this.f20814a + ".nullSafe()";
    }
}
