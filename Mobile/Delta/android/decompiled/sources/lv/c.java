package lv;

import jv.h;
import okhttp3.ResponseBody;
import um.j;
import um.m;
import xu.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements h<ResponseBody, T> {
    public static final xu.h b = xu.h.c("EFBBBF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final um.h<T> f23561a;

    public c(um.h<T> hVar) {
        this.f23561a = hVar;
    }

    @Override // jv.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(ResponseBody responseBody) {
        g source = responseBody.getSource();
        try {
            xu.h hVar = b;
            if (source.o0(0L, hVar)) {
                source.skip(hVar.I());
            }
            m mVarS = m.s(source);
            T tFromJson = this.f23561a.fromJson(mVarS);
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
