package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import hq.t;
import hq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23921a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f23923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f23924e;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view) {
        this.f23921a = coordinatorLayout;
        this.b = constraintLayout;
        this.f23922c = frameLayout;
        this.f23923d = nestedScrollView;
        this.f23924e = view;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = t.f19663c;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = t.f19666f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = t.f19667g;
                NestedScrollView nestedScrollView = (NestedScrollView) r5.b.a(view, i10);
                if (nestedScrollView != null && (viewA = r5.b.a(view, (i10 = t.f19685y))) != null) {
                    return new a((CoordinatorLayout) view, constraintLayout, frameLayout, nestedScrollView, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(u.f19687a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23921a;
    }
}
