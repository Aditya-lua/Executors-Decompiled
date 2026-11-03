package vi;

import androidx.appcompat.widget.SearchView;
import oh.k;
import rg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.roblox.client.c f33540a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f33543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bk.c f33545g = new bk.f();

    public i(com.roblox.client.c cVar) {
        this.f33540a = cVar;
        this.f33541c = cVar.e0(q0.f30594z1);
        this.f33542d = this.f33540a.e0(q0.B1);
        this.f33543e = this.f33540a.e0(q0.f30591y1);
        this.f33544f = this.f33540a.e0(q0.A1);
    }

    @Override // vi.f.e
    public boolean a(String str) {
        return false;
    }

    @Override // vi.f.e
    public boolean b(SearchView searchView, String str) {
        dv.c.d().j(new k(d(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    @Override // vi.f.e
    public String c() {
        int iD = d();
        if (iD != 1) {
            if (iD == 3) {
                return this.f33543e;
            }
            if (iD != 4) {
                return iD != 5 ? this.f33541c : this.f33544f;
            }
        }
        return this.f33542d;
    }

    @Override // vi.f.e
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
        return str != null ? str : this.f33540a.d3();
    }

    public void f(String str) {
        this.b = str;
    }

    @Override // bk.c
    public ml.a getTheme() {
        return this.f33545g.getTheme();
    }
}
