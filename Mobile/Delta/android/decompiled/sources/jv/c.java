package jv;

import hv.h;
import okhttp3.ResponseBody;
import sm.j;
import sm.m;
import vu.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements h<ResponseBody, T> {
    public static final vu.h b = vu.h.c("EFBBBF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sm.h<T> f22214a;

    public c(sm.h<T> hVar) {
        this.f22214a = hVar;
    }

    @Override // hv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(ResponseBody responseBody) {
        g source = responseBody.getSource();
        try {
            vu.h hVar = b;
            if (source.m1(0L, hVar)) {
                source.skip(hVar.I());
            }
            m mVarS = m.s(source);
            T tFromJson = this.f22214a.fromJson(mVarS);
            if (mVarS.u() != m.c.END_DOCUMENT) {
                throw new j("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tFromJson;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
