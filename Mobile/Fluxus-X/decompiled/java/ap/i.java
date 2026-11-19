package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3234a;

    @NonNull
    public final PersonaMaterialButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckBox f3235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f3238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f3239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f3241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f3242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Flow f3243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final View f3245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f3246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f3250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final ProgressBar f3252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final ImageView f3254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final SpotlightView f3255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final SpotlightView f3256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final Guideline f3257y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final TextView f3258z;

    public i(@NonNull FrameLayout frameLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull CheckBox checkBox, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull Flow flow, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view2, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull ImageView imageView3, @NonNull SpotlightView spotlightView, @NonNull SpotlightView spotlightView2, @NonNull Guideline guideline2, @NonNull TextView textView3) {
        this.f3234a = frameLayout;
        this.b = personaMaterialButton;
        this.f3235c = checkBox;
        this.f3236d = coordinatorLayout;
        this.f3237e = constraintLayout;
        this.f3238f = textView;
        this.f3239g = imageView;
        this.f3240h = linearLayout;
        this.f3241i = guideline;
        this.f3242j = view;
        this.f3243k = flow;
        this.f3244l = pi2NavigationBar;
        this.f3245m = view2;
        this.f3246n = imageView2;
        this.f3247o = constraintLayout2;
        this.f3248p = themeableLottieAnimationView;
        this.f3249q = constraintLayout3;
        this.f3250r = textView2;
        this.f3251s = frameLayout2;
        this.f3252t = progressBar;
        this.f3253u = personaMaterialButton2;
        this.f3254v = imageView3;
        this.f3255w = spotlightView;
        this.f3256x = spotlightView2;
        this.f3257y = guideline2;
        this.f3258z = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = n3.f34856a;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = n3.f34859c;
            CheckBox checkBox = (CheckBox) s5.b.a(view, i10);
            if (checkBox != null) {
                i10 = n3.f34877l;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) s5.b.a(view, i10);
                if (coordinatorLayout != null) {
                    i10 = n3.f34879m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n3.f34905z;
                        TextView textView = (TextView) s5.b.a(view, i10);
                        if (textView != null) {
                            i10 = n3.A;
                            ImageView imageView = (ImageView) s5.b.a(view, i10);
                            if (imageView != null) {
                                i10 = n3.C;
                                LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = n3.D;
                                    Guideline guideline = (Guideline) s5.b.a(view, i10);
                                    if (guideline != null && (viewA = s5.b.a(view, (i10 = n3.G))) != null) {
                                        i10 = n3.I;
                                        Flow flow = (Flow) s5.b.a(view, i10);
                                        if (flow != null) {
                                            i10 = n3.f34862d0;
                                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                            if (pi2NavigationBar != null && (viewA2 = s5.b.a(view, (i10 = n3.f34864e0))) != null) {
                                                i10 = n3.f34866f0;
                                                ImageView imageView2 = (ImageView) s5.b.a(view, i10);
                                                if (imageView2 != null) {
                                                    i10 = n3.f34868g0;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                                                    if (constraintLayout2 != null) {
                                                        i10 = n3.f34870h0;
                                                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                                                        if (themeableLottieAnimationView != null) {
                                                            i10 = n3.f34872i0;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) s5.b.a(view, i10);
                                                            if (constraintLayout3 != null) {
                                                                i10 = n3.f34874j0;
                                                                TextView textView2 = (TextView) s5.b.a(view, i10);
                                                                if (textView2 != null) {
                                                                    i10 = n3.f34892s0;
                                                                    FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
                                                                    if (frameLayout != null) {
                                                                        i10 = n3.f34894t0;
                                                                        ProgressBar progressBar = (ProgressBar) s5.b.a(view, i10);
                                                                        if (progressBar != null) {
                                                                            i10 = n3.f34900w0;
                                                                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) s5.b.a(view, i10);
                                                                            if (personaMaterialButton2 != null) {
                                                                                i10 = n3.f34902x0;
                                                                                ImageView imageView3 = (ImageView) s5.b.a(view, i10);
                                                                                if (imageView3 != null) {
                                                                                    i10 = n3.B0;
                                                                                    SpotlightView spotlightView = (SpotlightView) s5.b.a(view, i10);
                                                                                    if (spotlightView != null) {
                                                                                        i10 = n3.C0;
                                                                                        SpotlightView spotlightView2 = (SpotlightView) s5.b.a(view, i10);
                                                                                        if (spotlightView2 != null) {
                                                                                            i10 = n3.D0;
                                                                                            Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                                                                                            if (guideline2 != null) {
                                                                                                i10 = n3.L0;
                                                                                                TextView textView3 = (TextView) s5.b.a(view, i10);
                                                                                                if (textView3 != null) {
                                                                                                    return new i((FrameLayout) view, personaMaterialButton, checkBox, coordinatorLayout, constraintLayout, textView, imageView, linearLayout, guideline, viewA, flow, pi2NavigationBar, viewA2, imageView2, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView2, frameLayout, progressBar, personaMaterialButton2, imageView3, spotlightView, spotlightView2, guideline2, textView3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34937i, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f3234a;
    }
}
