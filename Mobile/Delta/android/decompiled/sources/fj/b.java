package fj;

import android.app.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.android.billingclient.api.a f16650a;

    public static Long i(v7.k kVar) {
        if (kVar.a() != null && kVar.a().b() != null) {
            try {
                return Long.valueOf(Long.parseLong(kVar.a().b()));
            } catch (NumberFormatException e10) {
                gk.p.k("rbx.purchaseflow", "parsing obfuscatedProfileId failed: " + e10);
            }
        }
        return null;
    }

    public static String j(v7.k kVar) {
        List<String> listE = kVar.e();
        if (listE.size() > 0) {
            return listE.get(0);
        }
        return null;
    }

    @Override // fj.h0
    public void a(com.android.billingclient.api.f fVar, v7.j jVar) {
        this.f16650a.g(fVar, jVar);
    }

    @Override // fj.h0
    public void b(v7.d dVar) {
        this.f16650a.i(dVar);
    }

    @Override // fj.h0
    public void c(v7.e eVar, v7.f fVar) {
        this.f16650a.b(eVar, fVar);
    }

    @Override // fj.h0
    public void d(v7.b bVar, v7.c cVar) {
        this.f16650a.a(bVar, cVar);
    }

    @Override // fj.h0
    public com.android.billingclient.api.d e(String str) {
        return this.f16650a.c(str);
    }

    @Override // fj.h0
    public void f(com.android.billingclient.api.a aVar) {
        this.f16650a = aVar;
    }

    @Override // fj.h0
    public void g(v7.o oVar, v7.l lVar) {
        this.f16650a.h(oVar, lVar);
    }

    @Override // fj.h0
    public com.android.billingclient.api.d h(Activity activity, com.android.billingclient.api.c cVar) {
        return this.f16650a.e(activity, cVar);
    }

    @Override // fj.h0
    public boolean isReady() {
        return this.f16650a.d();
    }
}
