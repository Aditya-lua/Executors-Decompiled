package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0585b {

    /* JADX INFO: renamed from: a */
    public final Context f2355a;

    /* JADX INFO: renamed from: b */
    public a f2356b;

    /* JADX INFO: renamed from: c */
    public b f2357c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1965a(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC0585b(Context context) {
        this.f2355a = context;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo1866a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo2807b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract View mo1867c();

    /* JADX INFO: renamed from: d */
    public View mo2808d(MenuItem menuItem) {
        return mo1867c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2809e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo1868f(SubMenu subMenu) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo2810g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m2811h() {
        this.f2357c = null;
        this.f2356b = null;
    }

    /* JADX INFO: renamed from: i */
    public void m2812i(a aVar) {
        this.f2356b = aVar;
    }

    /* JADX INFO: renamed from: j */
    public void mo2813j(b bVar) {
        if (this.f2357c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2357c = bVar;
    }

    /* JADX INFO: renamed from: k */
    public void m2814k(boolean z10) {
        a aVar = this.f2356b;
        if (aVar != null) {
            aVar.mo1965a(z10);
        }
    }
}
