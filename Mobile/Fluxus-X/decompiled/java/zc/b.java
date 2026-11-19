package zc;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f39212a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39213c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f39212a = (View) aVar;
    }

    public final void a() {
        ViewParent parent = this.f39212a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f39212a);
        }
    }

    public int b() {
        return this.f39213c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(@NonNull Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.f39213c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.f39213c);
        return bundle;
    }

    public void f(int i10) {
        this.f39213c = i10;
    }
}
