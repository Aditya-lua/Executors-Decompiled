package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import p226jq.C7282t;
import p226jq.C7283u;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9545a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f34496a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f34497b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f34498c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NestedScrollView f34499d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f34500e;

    public C9545a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view) {
        this.f34496a = coordinatorLayout;
        this.f34497b = constraintLayout;
        this.f34498c = frameLayout;
        this.f34499d = nestedScrollView;
        this.f34500e = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9545a m37672a(@NonNull View view) {
        View viewM41116a;
        int i10 = C7282t.f28065c;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout != null) {
            i10 = C7282t.f28068f;
            FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
            if (frameLayout != null) {
                i10 = C7282t.f28069g;
                NestedScrollView nestedScrollView = (NestedScrollView) C10785b.m41116a(view, i10);
                if (nestedScrollView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C7282t.f28087y))) != null) {
                    return new C9545a((CoordinatorLayout) view, constraintLayout, frameLayout, nestedScrollView, viewM41116a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9545a m37673c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C7283u.f28089a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37672a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f34496a;
    }
}
