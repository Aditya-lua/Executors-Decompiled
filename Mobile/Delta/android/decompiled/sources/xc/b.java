package xc;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f35160a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35161c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f35160a = (View) aVar;
    }

    public final void a() {
        ViewParent parent = this.f35160a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f35160a);
        }
    }

    public int b() {
        return this.f35161c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(@NonNull Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.f35161c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.f35161c);
        return bundle;
    }

    public void f(int i10) {
        this.f35161c = i10;
    }
}
