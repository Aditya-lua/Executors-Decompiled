package p573yc;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: yc.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13171b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f46429a;

    /* JADX INFO: renamed from: b */
    public boolean f46430b = false;

    /* JADX INFO: renamed from: c */
    public int f46431c = 0;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: yc.a */
    /* JADX WARN: Multi-variable type inference failed */
    public C13171b(InterfaceC13170a interfaceC13170a) {
        this.f46429a = (View) interfaceC13170a;
    }

    /* JADX INFO: renamed from: a */
    public final void m48769a() {
        ViewParent parent = this.f46429a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m2579f(this.f46429a);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m48770b() {
        return this.f46431c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m48771c() {
        return this.f46430b;
    }

    /* JADX INFO: renamed from: d */
    public void m48772d(@NonNull Bundle bundle) {
        this.f46430b = bundle.getBoolean("expanded", false);
        this.f46431c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f46430b) {
            m48769a();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public Bundle m48773e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f46430b);
        bundle.putInt("expandedComponentIdHint", this.f46431c);
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public void m48774f(int i10) {
        this.f46431c = i10;
    }
}
