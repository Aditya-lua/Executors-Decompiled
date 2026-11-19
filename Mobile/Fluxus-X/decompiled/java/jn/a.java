package jn;

import hn.h;
import hn.j;
import hn.m;
import hn.t;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f20813a;

    public a(h<T> hVar) {
        this.f20813a = hVar;
    }

    @Override // hn.h
    public T fromJson(m mVar) {
        if (mVar.w() != m.c.NULL) {
            return this.f20813a.fromJson(mVar);
        }
        throw new j("Unexpected null at " + mVar.x());
    }

    @Override // hn.h
    public void toJson(t tVar, T t8) {
        if (t8 != null) {
            this.f20813a.toJson(tVar, t8);
            return;
        }
        throw new j("Unexpected null at " + tVar.x());
    }

    public String toString() {
        return this.f20813a + ".nonNull()";
    }
}
