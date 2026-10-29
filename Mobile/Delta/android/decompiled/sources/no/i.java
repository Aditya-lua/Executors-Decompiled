package no;

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
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26542a;

    @NonNull
    public final PersonaMaterialButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckBox f26543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f26544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f26546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f26547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f26549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f26550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Flow f26551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f26552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final View f26553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f26554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f26558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final ProgressBar f26560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f26561u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final ImageView f26562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final SpotlightView f26563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final SpotlightView f26564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final Guideline f26565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final TextView f26566z;

    public i(@NonNull FrameLayout frameLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull CheckBox checkBox, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull Flow flow, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view2, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull ImageView imageView3, @NonNull SpotlightView spotlightView, @NonNull SpotlightView spotlightView2, @NonNull Guideline guideline2, @NonNull TextView textView3) {
        this.f26542a = frameLayout;
        this.b = personaMaterialButton;
        this.f26543c = checkBox;
        this.f26544d = coordinatorLayout;
        this.f26545e = constraintLayout;
        this.f26546f = textView;
        this.f26547g = imageView;
        this.f26548h = linearLayout;
        this.f26549i = guideline;
        this.f26550j = view;
        this.f26551k = flow;
        this.f26552l = pi2NavigationBar;
        this.f26553m = view2;
        this.f26554n = imageView2;
        this.f26555o = constraintLayout2;
        this.f26556p = themeableLottieAnimationView;
        this.f26557q = constraintLayout3;
        this.f26558r = textView2;
        this.f26559s = frameLayout2;
        this.f26560t = progressBar;
        this.f26561u = personaMaterialButton2;
        this.f26562v = imageView3;
        this.f26563w = spotlightView;
        this.f26564x = spotlightView2;
        this.f26565y = guideline2;
        this.f26566z = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = n2.f20703a;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = n2.f20706c;
            CheckBox checkBox = (CheckBox) r5.b.a(view, i10);
            if (checkBox != null) {
                i10 = n2.f20724l;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r5.b.a(view, i10);
                if (coordinatorLayout != null) {
                    i10 = n2.f20726m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f20752z;
                        TextView textView = (TextView) r5.b.a(view, i10);
                        if (textView != null) {
                            i10 = n2.A;
                            ImageView imageView = (ImageView) r5.b.a(view, i10);
                            if (imageView != null) {
                                i10 = n2.C;
                                LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = n2.D;
                                    Guideline guideline = (Guideline) r5.b.a(view, i10);
                                    if (guideline != null && (viewA = r5.b.a(view, (i10 = n2.G))) != null) {
                                        i10 = n2.I;
                                        Flow flow = (Flow) r5.b.a(view, i10);
                                        if (flow != null) {
                                            i10 = n2.f20709d0;
                                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                            if (pi2NavigationBar != null && (viewA2 = r5.b.a(view, (i10 = n2.f20711e0))) != null) {
                                                i10 = n2.f20713f0;
                                                ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                                                if (imageView2 != null) {
                                                    i10 = n2.f20715g0;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                                    if (constraintLayout2 != null) {
                                                        i10 = n2.f20717h0;
                                                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                                        if (themeableLottieAnimationView != null) {
                                                            i10 = n2.f20719i0;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                                            if (constraintLayout3 != null) {
                                                                i10 = n2.f20721j0;
                                                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                                                if (textView2 != null) {
                                                                    i10 = n2.f20739s0;
                                                                    FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                                                    if (frameLayout != null) {
                                                                        i10 = n2.f20741t0;
                                                                        ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                                                                        if (progressBar != null) {
                                                                            i10 = n2.f20747w0;
                                                                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                                                                            if (personaMaterialButton2 != null) {
                                                                                i10 = n2.f20749x0;
                                                                                ImageView imageView3 = (ImageView) r5.b.a(view, i10);
                                                                                if (imageView3 != null) {
                                                                                    i10 = n2.B0;
                                                                                    SpotlightView spotlightView = (SpotlightView) r5.b.a(view, i10);
                                                                                    if (spotlightView != null) {
                                                                                        i10 = n2.C0;
                                                                                        SpotlightView spotlightView2 = (SpotlightView) r5.b.a(view, i10);
                                                                                        if (spotlightView2 != null) {
                                                                                            i10 = n2.D0;
                                                                                            Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                                                                            if (guideline2 != null) {
                                                                                                i10 = n2.L0;
                                                                                                TextView textView3 = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f20763i, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f26542a;
    }
}
