package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9527c implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f34353a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Space f34354b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f34355c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f34356d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f34357e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PersonaMaterialButton f34358f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ThemeableLottieAnimationView f34359g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f34360h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f34361i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f34362j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f34363k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f34364l;

    public C9527c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f34353a = frameLayout;
        this.f34354b = space;
        this.f34355c = frameLayout2;
        this.f34356d = linearLayout;
        this.f34357e = constraintLayout;
        this.f34358f = personaMaterialButton;
        this.f34359g = themeableLottieAnimationView;
        this.f34360h = constraintLayout2;
        this.f34361i = textView;
        this.f34362j = view;
        this.f34363k = linearLayout2;
        this.f34364l = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9527c m37617a(@NonNull View view) {
        View viewM41116a;
        int i10 = C6895n2.f27063e;
        Space space = (Space) C10785b.m41116a(view, i10);
        if (space != null) {
            i10 = C6895n2.f27065f;
            FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
            if (frameLayout != null) {
                i10 = C6895n2.f27067g;
                LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
                if (linearLayout != null) {
                    i10 = C6895n2.f27093t;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                    if (constraintLayout != null) {
                        i10 = C6895n2.f27097v;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = C6895n2.f27048T;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                i10 = C6895n2.f27049U;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = C6895n2.f27096u0;
                                    TextView textView = (TextView) C10785b.m41116a(view, i10);
                                    if (textView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C6895n2.f27014A0))) != null) {
                                        i10 = C6895n2.f27034K0;
                                        LinearLayout linearLayout2 = (LinearLayout) C10785b.m41116a(view, i10);
                                        if (linearLayout2 != null) {
                                            i10 = C6895n2.f27036L0;
                                            TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                            if (textView2 != null) {
                                                return new C9527c((FrameLayout) view, space, frameLayout, linearLayout, constraintLayout, personaMaterialButton, themeableLottieAnimationView, constraintLayout2, textView, viewM41116a, linearLayout2, textView2);
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
    public static C9527c m37618c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27111c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37617a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f34353a;
    }
}
