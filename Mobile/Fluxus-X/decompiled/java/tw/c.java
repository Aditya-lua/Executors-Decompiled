package tw;

import lg.a0;
import lg.f;
import lg.m;
import mv.i0;
import sw.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> implements h<i0, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f32871a;
    public final a0<T> b;

    public c(f fVar, a0<T> a0Var) {
        this.f32871a = fVar;
        this.b = a0Var;
    }

    @Override // sw.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(i0 i0Var) {
        tg.a aVarP = this.f32871a.p(i0Var.c());
        try {
            T t8 = this.b.read(aVarP);
            if (aVarP.Q() != tg.b.END_DOCUMENT) {
                throw new m("JSON document was not fully consumed.");
            }
            i0Var.close();
            return t8;
        } catch (Throwable th2) {
            i0Var.close();
            throw th2;
        }
    }
}
