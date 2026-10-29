package p245kc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: kc.c */
/* JADX INFO: loaded from: classes2.dex */
public class C7540c<V extends View> extends CoordinatorLayout.AbstractC0524c<V> {

    /* JADX INFO: renamed from: a */
    public C7541d f28903a;

    /* JADX INFO: renamed from: b */
    public int f28904b;

    /* JADX INFO: renamed from: c */
    public int f28905c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7540c() {
        this.f28904b = 0;
        this.f28905c = 0;
    }

    /* JADX INFO: renamed from: I */
    public int mo11968I() {
        C7541d c7541d = this.f28903a;
        if (c7541d != null) {
            return c7541d.m31191b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public void mo31185J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        coordinatorLayout.m2565I(v5, i10);
    }

    /* JADX INFO: renamed from: K */
    public boolean mo11969K(int i10) {
        C7541d c7541d = this.f28903a;
        if (c7541d != null) {
            return c7541d.m31194e(i10);
        }
        this.f28904b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: p */
    public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        mo31185J(coordinatorLayout, v5, i10);
        if (this.f28903a == null) {
            this.f28903a = new C7541d(v5);
        }
        this.f28903a.m31192c();
        this.f28903a.m31190a();
        int i11 = this.f28904b;
        if (i11 != 0) {
            this.f28903a.m31194e(i11);
            this.f28904b = 0;
        }
        int i12 = this.f28905c;
        if (i12 == 0) {
            return true;
        }
        this.f28903a.m31193d(i12);
        this.f28905c = 0;
        return true;
    }

    public C7540c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28904b = 0;
        this.f28905c = 0;
    }
}
