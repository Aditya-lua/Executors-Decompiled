package uw;

import ew.g;
import hn.j;
import hn.m;
import mv.i0;
import sw.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements h<i0, T> {
    public static final ew.h b = ew.h.c("EFBBBF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn.h<T> f34123a;

    public c(hn.h<T> hVar) {
        this.f34123a = hVar;
    }

    @Override // sw.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(i0 i0Var) {
        g source = i0Var.getSource();
        try {
            ew.h hVar = b;
            if (source.V1(0L, hVar)) {
                source.skip(hVar.I());
            }
            m mVarU = m.u(source);
            T tFromJson = this.f34123a.fromJson(mVarU);
            if (mVarU.w() != m.c.END_DOCUMENT) {
                throw new j("JSON document was not fully consumed.");
            }
            i0Var.close();
            return tFromJson;
        } catch (Throwable th2) {
            i0Var.close();
            throw th2;
        }
    }
}
