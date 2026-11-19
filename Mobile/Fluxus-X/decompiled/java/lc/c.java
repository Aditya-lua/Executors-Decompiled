package lc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f22061a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22062c;

    public c() {
        this.b = 0;
        this.f22062c = 0;
    }

    public int I() {
        d dVar = this.f22061a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10) {
        coordinatorLayout.I(v8, i10);
    }

    public boolean K(int i10) {
        d dVar = this.f22061a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10) {
        J(coordinatorLayout, v8, i10);
        if (this.f22061a == null) {
            this.f22061a = new d(v8);
        }
        this.f22061a.c();
        this.f22061a.a();
        int i11 = this.b;
        if (i11 != 0) {
            this.f22061a.e(i11);
            this.b = 0;
        }
        int i12 = this.f22062c;
        if (i12 == 0) {
            return true;
        }
        this.f22061a.d(i12);
        this.f22062c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f22062c = 0;
    }
}
