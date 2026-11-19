package nj;

import android.app.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.android.billingclient.api.a f25662a;

    public static Long j(w7.k kVar) {
        if (kVar.a() != null && kVar.a().b() != null) {
            try {
                return Long.valueOf(Long.parseLong(kVar.a().b()));
            } catch (NumberFormatException e10) {
                ok.q.k("rbx.purchaseflow", "parsing obfuscatedProfileId failed: " + e10);
            }
        }
        return null;
    }

    public static String k(w7.k kVar) {
        List<String> listE = kVar.e();
        if (listE.size() > 0) {
            return listE.get(0);
        }
        return null;
    }

    @Override // nj.h0
    public boolean a() {
        return this.f25662a.d();
    }

    @Override // nj.h0
    public com.android.billingclient.api.d b(String str) {
        return this.f25662a.c(str);
    }

    @Override // nj.h0
    public void c(com.android.billingclient.api.f fVar, w7.j jVar) {
        this.f25662a.g(fVar, jVar);
    }

    @Override // nj.h0
    public void d(w7.b bVar, w7.c cVar) {
        this.f25662a.a(bVar, cVar);
    }

    @Override // nj.h0
    public void e(com.android.billingclient.api.a aVar) {
        this.f25662a = aVar;
    }

    @Override // nj.h0
    public void f(w7.o oVar, w7.l lVar) {
        this.f25662a.h(oVar, lVar);
    }

    @Override // nj.h0
    public void g(w7.e eVar, w7.f fVar) {
        this.f25662a.b(eVar, fVar);
    }

    @Override // nj.h0
    public com.android.billingclient.api.d h(Activity activity, com.android.billingclient.api.c cVar) {
        return this.f25662a.e(activity, cVar);
    }

    @Override // nj.h0
    public void i(w7.d dVar) {
        this.f25662a.i(dVar);
    }
}
