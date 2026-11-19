package fj;

import androidx.appcompat.widget.SearchView;
import bh.q0;
import yh.k;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.roblox.client.c f16146a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lk.c f16151g = new lk.f();

    public i(com.roblox.client.c cVar) {
        this.f16146a = cVar;
        this.f16147c = cVar.d0(q0.J1);
        this.f16148d = this.f16146a.d0(q0.L1);
        this.f16149e = this.f16146a.d0(q0.I1);
        this.f16150f = this.f16146a.d0(q0.K1);
    }

    @Override // fj.f.e
    public boolean a(String str) {
        return false;
    }

    @Override // fj.f.e
    public boolean b(SearchView searchView, String str) {
        mw.c.d().j(new k(d(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    @Override // fj.f.e
    public String c() {
        int iD = d();
        if (iD != 1) {
            if (iD == 3) {
                return this.f16149e;
            }
            if (iD != 4) {
                return iD != 5 ? this.f16147c : this.f16150f;
            }
        }
        return this.f16148d;
    }

    @Override // fj.f.e
    public int d() {
        String strE = e();
        if (strE != null) {
            if (strE.contains("profile") || strE.contains("friends") || strE.contains("users")) {
                return 1;
            }
            if (strE.contains("games")) {
                return 2;
            }
            if (strE.contains("catalog")) {
                return 3;
            }
            if (strE.contains("groups")) {
                return 5;
            }
        }
        return 2;
    }

    public final String e() {
        String str = this.b;
        return str != null ? str : this.f16146a.d3();
    }

    public void f(String str) {
        this.b = str;
    }

    @Override // lk.c
    public cm.a getTheme() {
        return this.f16151g.getTheme();
    }
}
