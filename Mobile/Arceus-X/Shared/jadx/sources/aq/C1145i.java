package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1145i implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4753a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f4754b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f4755c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Space f4756d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4757e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Guideline f4758f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Pi2NavigationBar f4759g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ThemeableLottieAnimationView f4760h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Guideline f4761i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f4762j;

    public C1145i(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull Space space, @NonNull ConstraintLayout constraintLayout3, @NonNull Guideline guideline, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Guideline guideline2, @NonNull TextView textView2) {
        this.f4753a = constraintLayout;
        this.f4754b = constraintLayout2;
        this.f4755c = textView;
        this.f4756d = space;
        this.f4757e = constraintLayout3;
        this.f4758f = guideline;
        this.f4759g = pi2NavigationBar;
        this.f4760h = themeableLottieAnimationView;
        this.f4761i = guideline2;
        this.f4762j = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1145i m6485a(@NonNull View view) {
        int i10 = C13388r.f46906a;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout != null) {
            i10 = C13388r.f46914e;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C13388r.f46918g;
                Space space = (Space) C10785b.m41116a(view, i10);
                if (space != null) {
                    i10 = C13388r.f46925m;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                    if (constraintLayout2 != null) {
                        i10 = C13388r.f46929q;
                        Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
                        if (guideline != null) {
                            i10 = C13388r.f46885F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = C13388r.f46888I;
                                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                                if (themeableLottieAnimationView != null) {
                                    i10 = C13388r.f46903X;
                                    Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                                    if (guideline2 != null) {
                                        i10 = C13388r.f46909b0;
                                        TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                        if (textView2 != null) {
                                            return new C1145i((ConstraintLayout) view, constraintLayout, textView, space, constraintLayout2, guideline, pi2NavigationBar, themeableLottieAnimationView, guideline2, textView2);
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
    public static C1145i m6486c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46958i, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6485a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4753a;
    }
}
