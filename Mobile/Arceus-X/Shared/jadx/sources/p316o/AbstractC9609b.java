package p316o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: o.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9609b {

    /* JADX INFO: renamed from: a */
    public Object f34829a;

    /* JADX INFO: renamed from: b */
    public boolean f34830b;

    /* JADX INFO: renamed from: o.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo29572a(AbstractC9609b abstractC9609b, Menu menu);

        /* JADX INFO: renamed from: b */
        void mo29573b(AbstractC9609b abstractC9609b);

        /* JADX INFO: renamed from: c */
        boolean mo29574c(AbstractC9609b abstractC9609b, MenuItem menuItem);

        /* JADX INFO: renamed from: d */
        boolean mo29575d(AbstractC9609b abstractC9609b, Menu menu);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo29658c();

    /* JADX INFO: renamed from: d */
    public abstract View mo29659d();

    /* JADX INFO: renamed from: e */
    public abstract Menu mo29660e();

    /* JADX INFO: renamed from: f */
    public abstract MenuInflater mo29661f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo29662g();

    /* JADX INFO: renamed from: h */
    public Object m37918h() {
        return this.f34829a;
    }

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo29663i();

    /* JADX INFO: renamed from: j */
    public boolean m37919j() {
        return this.f34830b;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo29664k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo29665l();

    /* JADX INFO: renamed from: m */
    public abstract void mo29666m(View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo29667n(int i10);

    /* JADX INFO: renamed from: o */
    public abstract void mo29668o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public void m37920p(Object obj) {
        this.f34829a = obj;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo29669q(int i10);

    /* JADX INFO: renamed from: r */
    public abstract void mo29670r(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public void mo29671s(boolean z10) {
        this.f34830b = z10;
    }
}
