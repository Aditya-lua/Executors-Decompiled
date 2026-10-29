package p548xi;

import androidx.appcompat.widget.SearchView;
import com.roblox.client.C3161c;
import dk.C4637f;
import dk.InterfaceC4634c;
import p138fv.C5840c;
import p337ol.EnumC9799a;
import ph.C10262k;
import sg.C11347q0;

/* JADX INFO: renamed from: xi.i */
/* JADX INFO: loaded from: classes2.dex */
public class C12842i implements C12839f.e {

    /* JADX INFO: renamed from: a */
    public C3161c f45664a;

    /* JADX INFO: renamed from: b */
    public String f45665b;

    /* JADX INFO: renamed from: c */
    public final String f45666c;

    /* JADX INFO: renamed from: d */
    public final String f45667d;

    /* JADX INFO: renamed from: e */
    public final String f45668e;

    /* JADX INFO: renamed from: f */
    public final String f45669f;

    /* JADX INFO: renamed from: g */
    public InterfaceC4634c f45670g = new C4637f();

    public C12842i(C3161c c3161c) {
        this.f45664a = c3161c;
        this.f45666c = c3161c.m4666e0(C11347q0.f40030z1);
        this.f45667d = this.f45664a.m4666e0(C11347q0.f39901B1);
        this.f45668e = this.f45664a.m4666e0(C11347q0.f40027y1);
        this.f45669f = this.f45664a.m4666e0(C11347q0.f39898A1);
    }

    @Override // p548xi.C12839f.e
    /* JADX INFO: renamed from: a */
    public boolean mo47811a(String str) {
        return false;
    }

    @Override // p548xi.C12839f.e
    /* JADX INFO: renamed from: b */
    public boolean mo47812b(SearchView searchView, String str) {
        C5840c.m26204d().m26211j(new C10262k(mo47814d(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    @Override // p548xi.C12839f.e
    /* JADX INFO: renamed from: c */
    public String mo47813c() {
        int iMo47814d = mo47814d();
        if (iMo47814d != 1) {
            if (iMo47814d == 3) {
                return this.f45668e;
            }
            if (iMo47814d != 4) {
                return iMo47814d != 5 ? this.f45666c : this.f45669f;
            }
        }
        return this.f45667d;
    }

    @Override // p548xi.C12839f.e
    /* JADX INFO: renamed from: d */
    public int mo47814d() {
        String strM47819e = m47819e();
        if (strM47819e != null) {
            if (strM47819e.contains("profile") || strM47819e.contains("friends") || strM47819e.contains("users")) {
                return 1;
            }
            if (strM47819e.contains("games")) {
                return 2;
            }
            if (strM47819e.contains("catalog")) {
                return 3;
            }
            if (strM47819e.contains("groups")) {
                return 5;
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: e */
    public final String m47819e() {
        String str = this.f45665b;
        return str != null ? str : this.f45664a.m15008d3();
    }

    /* JADX INFO: renamed from: f */
    public void m47820f(String str) {
        this.f45665b = str;
    }

    @Override // dk.InterfaceC4634c
    public EnumC9799a getTheme() {
        return this.f45670g.getTheme();
    }
}
