package jc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f21252a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21253c;

    public c() {
        this.b = 0;
        this.f21253c = 0;
    }

    public int I() {
        d dVar = this.f21252a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        coordinatorLayout.I(v5, i10);
    }

    public boolean K(int i10) {
        d dVar = this.f21252a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        J(coordinatorLayout, v5, i10);
        if (this.f21252a == null) {
            this.f21252a = new d(v5);
        }
        this.f21252a.c();
        this.f21252a.a();
        int i11 = this.b;
        if (i11 != 0) {
            this.f21252a.e(i11);
            this.b = 0;
        }
        int i12 = this.f21253c;
        if (i12 == 0) {
            return true;
        }
        this.f21252a.d(i12);
        this.f21253c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f21253c = 0;
    }
}
