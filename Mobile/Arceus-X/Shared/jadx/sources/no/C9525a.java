package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9525a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f34309a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f34310b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Button f34311c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f34312d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ThemeableLottieAnimationView f34313e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f34314f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Pi2NavigationBar f34315g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f34316h;

    public C9525a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView) {
        this.f34309a = coordinatorLayout;
        this.f34310b = linearLayout;
        this.f34311c = button;
        this.f34312d = linearLayout2;
        this.f34313e = themeableLottieAnimationView;
        this.f34314f = constraintLayout;
        this.f34315g = pi2NavigationBar;
        this.f34316h = textView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9525a m37610a(@NonNull View view) {
        int i10 = C6895n2.f27095u;
        LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
        if (linearLayout != null) {
            i10 = C6895n2.f27097v;
            Button button = (Button) C10785b.m41116a(view, i10);
            if (button != null) {
                i10 = C6895n2.f27031J;
                LinearLayout linearLayout2 = (LinearLayout) C10785b.m41116a(view, i10);
                if (linearLayout2 != null) {
                    i10 = C6895n2.f27048T;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                    if (themeableLottieAnimationView != null) {
                        i10 = C6895n2.f27053Y;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                        if (constraintLayout != null) {
                            i10 = C6895n2.f27062d0;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = C6895n2.f27036L0;
                                TextView textView = (TextView) C10785b.m41116a(view, i10);
                                if (textView != null) {
                                    return new C9525a((CoordinatorLayout) view, linearLayout, button, linearLayout2, themeableLottieAnimationView, constraintLayout, pi2NavigationBar, textView);
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
    public static C9525a m37611c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27109a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37610a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f34309a;
    }
}
