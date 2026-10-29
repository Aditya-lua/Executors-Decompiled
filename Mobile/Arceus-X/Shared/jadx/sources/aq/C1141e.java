package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1141e implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f4725a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Guideline f4726b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f4727c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Guideline f4728d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4729e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ThemeableLottieAnimationView f4730f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Pi2NavigationBar f4731g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f4732h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final PersonaMaterialButton f4733i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Guideline f4734j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f4735k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f4736l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f4737m;

    public C1141e(@NonNull ScrollView scrollView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ConstraintLayout constraintLayout2, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f4725a = scrollView;
        this.f4726b = guideline;
        this.f4727c = constraintLayout;
        this.f4728d = guideline2;
        this.f4729e = imageView;
        this.f4730f = themeableLottieAnimationView;
        this.f4731g = pi2NavigationBar;
        this.f4732h = constraintLayout2;
        this.f4733i = personaMaterialButton;
        this.f4734j = guideline3;
        this.f4735k = textView;
        this.f4736l = textView2;
        this.f4737m = textView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1141e m6473a(@NonNull View view) {
        int i10 = C13388r.f46916f;
        Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
        if (guideline != null) {
            i10 = C13388r.f46926n;
            ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
            if (constraintLayout != null) {
                i10 = C13388r.f46929q;
                Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                if (guideline2 != null) {
                    i10 = C13388r.f46881B;
                    ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                    if (imageView != null) {
                        i10 = C13388r.f46883D;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = C13388r.f46885F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = C13388r.f46886G;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = C13388r.f46902W;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = C13388r.f46903X;
                                        Guideline guideline3 = (Guideline) C10785b.m41116a(view, i10);
                                        if (guideline3 != null) {
                                            i10 = C13388r.f46904Y;
                                            TextView textView = (TextView) C10785b.m41116a(view, i10);
                                            if (textView != null) {
                                                i10 = C13388r.f46905Z;
                                                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                                if (textView2 != null) {
                                                    i10 = C13388r.f46907a0;
                                                    TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                                    if (textView3 != null) {
                                                        return new C1141e((ScrollView) view, guideline, constraintLayout, guideline2, imageView, themeableLottieAnimationView, pi2NavigationBar, constraintLayout2, personaMaterialButton, guideline3, textView, textView2, textView3);
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
    /* JADX INFO: renamed from: c */
    public static C1141e m6474c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46954e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6473a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f4725a;
    }
}
