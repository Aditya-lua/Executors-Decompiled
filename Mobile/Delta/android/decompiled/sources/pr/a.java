package pr;

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
import or.r1;
import or.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f28842a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialDivider f28844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f28845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f28846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f28847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f28848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ShadowedNestedScrollView f28850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28852l;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialDivider materialDivider, @NonNull LinearLayout linearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ShadowedNestedScrollView shadowedNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2) {
        this.f28842a = coordinatorLayout;
        this.b = constraintLayout;
        this.f28843c = frameLayout;
        this.f28844d = materialDivider;
        this.f28845e = linearLayout;
        this.f28846f = coordinatorLayout2;
        this.f28847g = view;
        this.f28848h = nestedScrollView;
        this.f28849i = pi2NavigationBar;
        this.f28850j = shadowedNestedScrollView;
        this.f28851k = constraintLayout2;
        this.f28852l = frameLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = r1.f27810d;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = r1.f27812f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = r1.f27813g;
                MaterialDivider materialDivider = (MaterialDivider) r5.b.a(view, i10);
                if (materialDivider != null) {
                    i10 = r1.f27814h;
                    LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = r1.f27815i;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r5.b.a(view, i10);
                        if (coordinatorLayout != null && (viewA = r5.b.a(view, (i10 = r1.f27816j))) != null) {
                            i10 = r1.f27818l;
                            NestedScrollView nestedScrollView = (NestedScrollView) r5.b.a(view, i10);
                            if (nestedScrollView != null) {
                                i10 = r1.f27819m;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = r1.f27820n;
                                    ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) r5.b.a(view, i10);
                                    if (shadowedNestedScrollView != null) {
                                        i10 = r1.f27821o;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                        if (constraintLayout2 != null) {
                                            i10 = r1.f27828v;
                                            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(s1.f27837a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f28842a;
    }
}
