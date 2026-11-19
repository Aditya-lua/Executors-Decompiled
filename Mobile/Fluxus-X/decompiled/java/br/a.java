package br;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import xq.t;
import xq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f4554a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f4556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f4557e;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view) {
        this.f4554a = coordinatorLayout;
        this.b = constraintLayout;
        this.f4555c = frameLayout;
        this.f4556d = nestedScrollView;
        this.f4557e = view;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = t.f37022c;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = t.f37025f;
            FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = t.f37026g;
                NestedScrollView nestedScrollView = (NestedScrollView) s5.b.a(view, i10);
                if (nestedScrollView != null && (viewA = s5.b.a(view, (i10 = t.f37044y))) != null) {
                    return new a((CoordinatorLayout) view, constraintLayout, frameLayout, nestedScrollView, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(u.f37046a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f4554a;
    }
}
