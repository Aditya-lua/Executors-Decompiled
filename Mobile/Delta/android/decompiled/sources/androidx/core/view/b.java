package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1660a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0023b f1661c;

    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0023b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f1660a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f1661c = null;
        this.b = null;
    }

    public void i(a aVar) {
        this.b = aVar;
    }

    public void j(InterfaceC0023b interfaceC0023b) {
        if (this.f1661c != null && interfaceC0023b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1661c = interfaceC0023b;
    }

    public void k(boolean z10) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
