package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C9537m implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f34451a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f34452b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f34453c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f34454d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Pi2NavigationBar f34455e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ThemeableLottieAnimationView f34456f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f34457g;

    public C9537m(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f34451a = constraintLayout;
        this.f34452b = constraintLayout2;
        this.f34453c = textView;
        this.f34454d = constraintLayout3;
        this.f34455e = pi2NavigationBar;
        this.f34456f = themeableLottieAnimationView;
        this.f34457g = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9537m m37647a(@NonNull View view) {
        int i10 = C6895n2.f27057b;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout != null) {
            i10 = C6895n2.f27061d;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C6895n2.f27093t;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = C6895n2.f27062d0;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = C6895n2.f27076k0;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = C6895n2.f27036L0;
                            TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                            if (textView2 != null) {
                                return new C9537m((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
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
    public static C9537m m37648c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27122n, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37647a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f34451a;
    }
}
