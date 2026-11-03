package um;

import sm.h;
import sm.j;
import sm.m;
import sm.t;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f33126a;

    public a(h<T> hVar) {
        this.f33126a = hVar;
    }

    @Override // sm.h
    public T fromJson(m mVar) {
        if (mVar.u() != m.c.NULL) {
            return this.f33126a.fromJson(mVar);
        }
        throw new j("Unexpected null at " + mVar.getPath());
    }

    @Override // sm.h
    public void toJson(t tVar, T t8) {
        if (t8 != null) {
            this.f33126a.toJson(tVar, t8);
            return;
        }
        throw new j("Unexpected null at " + tVar.getPath());
    }

    public String toString() {
        return this.f33126a + ".nonNull()";
    }
}
