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
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p056ui.view.ShadowedNestedScrollView;
import p342or.C9978r1;
import p342or.C9985s1;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: pr.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10317a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f37143a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f37144b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f37145c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final MaterialDivider f37146d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f37147e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CoordinatorLayout f37148f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f37149g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final NestedScrollView f37150h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Pi2NavigationBar f37151i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShadowedNestedScrollView f37152j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f37153k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f37154l;

    public C10317a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialDivider materialDivider, @NonNull LinearLayout linearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ShadowedNestedScrollView shadowedNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2) {
        this.f37143a = coordinatorLayout;
        this.f37144b = constraintLayout;
        this.f37145c = frameLayout;
        this.f37146d = materialDivider;
        this.f37147e = linearLayout;
        this.f37148f = coordinatorLayout2;
        this.f37149g = view;
        this.f37150h = nestedScrollView;
        this.f37151i = pi2NavigationBar;
        this.f37152j = shadowedNestedScrollView;
        this.f37153k = constraintLayout2;
        this.f37154l = frameLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C10317a m39622a(@NonNull View view) {
        View viewM41116a;
        int i10 = C9978r1.f36012d;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout != null) {
            i10 = C9978r1.f36014f;
            FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
            if (frameLayout != null) {
                i10 = C9978r1.f36015g;
                MaterialDivider materialDivider = (MaterialDivider) C10785b.m41116a(view, i10);
                if (materialDivider != null) {
                    i10 = C9978r1.f36016h;
                    LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
                    if (linearLayout != null) {
                        i10 = C9978r1.f36017i;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10785b.m41116a(view, i10);
                        if (coordinatorLayout != null && (viewM41116a = C10785b.m41116a(view, (i10 = C9978r1.f36018j))) != null) {
                            i10 = C9978r1.f36020l;
                            NestedScrollView nestedScrollView = (NestedScrollView) C10785b.m41116a(view, i10);
                            if (nestedScrollView != null) {
                                i10 = C9978r1.f36021m;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = C9978r1.f36022n;
                                    ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) C10785b.m41116a(view, i10);
                                    if (shadowedNestedScrollView != null) {
                                        i10 = C9978r1.f36023o;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                        if (constraintLayout2 != null) {
                                            i10 = C9978r1.f36030v;
                                            FrameLayout frameLayout2 = (FrameLayout) C10785b.m41116a(view, i10);
                                            if (frameLayout2 != null) {
                                                return new C10317a((CoordinatorLayout) view, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, viewM41116a, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
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
    /* JADX INFO: renamed from: c */
    public static C10317a m39623c(@NonNull LayoutInflater layoutInflater) {
        return m39624d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C10317a m39624d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C9985s1.f36044a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m39622a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f37143a;
    }
}
