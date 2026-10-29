package xi;

import androidx.appcompat.widget.SearchView;
import ph.k;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.roblox.client.c f35218a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dk.c f35223g = new dk.f();

    public i(com.roblox.client.c cVar) {
        this.f35218a = cVar;
        this.f35219c = cVar.e0(q0.f30989z1);
        this.f35220d = this.f35218a.e0(q0.B1);
        this.f35221e = this.f35218a.e0(q0.f30986y1);
        this.f35222f = this.f35218a.e0(q0.A1);
    }

    @Override // xi.f.e
    public boolean a(String str) {
        return false;
    }

    @Override // xi.f.e
    public boolean b(SearchView searchView, String str) {
        fv.c.d().j(new k(d(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    @Override // xi.f.e
    public String c() {
        int iD = d();
        if (iD != 1) {
            if (iD == 3) {
                return this.f35221e;
            }
            if (iD != 4) {
                return iD != 5 ? this.f35219c : this.f35222f;
            }
        }
        return this.f35220d;
    }

    @Override // xi.f.e
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
        return str != null ? str : this.f35218a.d3();
    }

    public void f(String str) {
        this.b = str;
    }

    @Override // dk.c
    public ol.a getTheme() {
        return this.f35223g.getTheme();
    }
}
