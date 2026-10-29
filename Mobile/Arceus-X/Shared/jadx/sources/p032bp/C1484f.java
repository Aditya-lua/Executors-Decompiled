package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p402r5.InterfaceC10784a;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1484f implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f5762a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoordinatorLayout f5763b;

    public C1484f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CoordinatorLayout coordinatorLayout2) {
        this.f5762a = coordinatorLayout;
        this.f5763b = coordinatorLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1484f m7604a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        return new C1484f(coordinatorLayout, coordinatorLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1484f m7605c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13959f0.f48769f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m7604a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f5762a;
    }
}
