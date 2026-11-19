package fs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import es.w1;
import es.x1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f16575a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f16576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialDivider f16577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f16579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f16580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f16581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f16582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ShadowedNestedScrollView f16583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f16585l;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialDivider materialDivider, @NonNull LinearLayout linearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ShadowedNestedScrollView shadowedNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2) {
        this.f16575a = coordinatorLayout;
        this.b = constraintLayout;
        this.f16576c = frameLayout;
        this.f16577d = materialDivider;
        this.f16578e = linearLayout;
        this.f16579f = coordinatorLayout2;
        this.f16580g = view;
        this.f16581h = nestedScrollView;
        this.f16582i = pi2NavigationBar;
        this.f16583j = shadowedNestedScrollView;
        this.f16584k = constraintLayout2;
        this.f16585l = frameLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = w1.f14579d;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = w1.f14581f;
            FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = w1.f14582g;
                MaterialDivider materialDivider = (MaterialDivider) s5.b.a(view, i10);
                if (materialDivider != null) {
                    i10 = w1.f14583h;
                    LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = w1.f14584i;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) s5.b.a(view, i10);
                        if (coordinatorLayout != null && (viewA = s5.b.a(view, (i10 = w1.f14585j))) != null) {
                            i10 = w1.f14587l;
                            NestedScrollView nestedScrollView = (NestedScrollView) s5.b.a(view, i10);
                            if (nestedScrollView != null) {
                                i10 = w1.f14588m;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = w1.f14589n;
                                    ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) s5.b.a(view, i10);
                                    if (shadowedNestedScrollView != null) {
                                        i10 = w1.f14590o;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                                        if (constraintLayout2 != null) {
                                            i10 = w1.f14597v;
                                            FrameLayout frameLayout2 = (FrameLayout) s5.b.a(view, i10);
                                            if (frameLayout2 != null) {
                                                return new a((CoordinatorLayout) view, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, viewA, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(x1.f14627a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f16575a;
    }
}
