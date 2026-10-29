package wm;

import um.h;
import um.j;
import um.m;
import um.t;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<T> f34442a;

    public a(h<T> hVar) {
        this.f34442a = hVar;
    }

    @Override // um.h
    public T fromJson(m mVar) {
        if (mVar.u() != m.c.NULL) {
            return this.f34442a.fromJson(mVar);
        }
        throw new j("Unexpected null at " + mVar.getPath());
    }

    @Override // um.h
    public void toJson(t tVar, T t8) {
        if (t8 != null) {
            this.f34442a.toJson(tVar, t8);
            return;
        }
        throw new j("Unexpected null at " + tVar.getPath());
    }

    public String toString() {
        return this.f34442a + ".nonNull()";
    }
}
