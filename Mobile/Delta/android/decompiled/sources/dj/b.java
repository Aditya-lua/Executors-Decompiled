package dj;

import android.app.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.android.billingclient.api.a f14846a;

    public static Long i(v7.k kVar) {
        if (kVar.a() != null && kVar.a().b() != null) {
            try {
                return Long.valueOf(Long.parseLong(kVar.a().b()));
            } catch (NumberFormatException e10) {
                ek.q.k("rbx.purchaseflow", "parsing obfuscatedProfileId failed: " + e10);
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

    @Override // dj.h0
    public void a(com.android.billingclient.api.f fVar, v7.j jVar) {
        this.f14846a.g(fVar, jVar);
    }

    @Override // dj.h0
    public void b(v7.d dVar) {
        this.f14846a.i(dVar);
    }

    @Override // dj.h0
    public void c(v7.e eVar, v7.f fVar) {
        this.f14846a.b(eVar, fVar);
    }

    @Override // dj.h0
    public void d(v7.b bVar, v7.c cVar) {
        this.f14846a.a(bVar, cVar);
    }

    @Override // dj.h0
    public com.android.billingclient.api.d e(String str) {
        return this.f14846a.c(str);
    }

    @Override // dj.h0
    public void f(com.android.billingclient.api.a aVar) {
        this.f14846a = aVar;
    }

    @Override // dj.h0
    public void g(v7.o oVar, v7.l lVar) {
        this.f14846a.h(oVar, lVar);
    }

    @Override // dj.h0
    public com.android.billingclient.api.d h(Activity activity, com.android.billingclient.api.c cVar) {
        return this.f14846a.e(activity, cVar);
    }

    @Override // dj.h0
    public boolean isReady() {
        return this.f14846a.d();
    }
}
