package ao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p609zn.C13909n2;
import p609zn.C13913o2;

/* JADX INFO: renamed from: ao.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1127a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4629a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f4630b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f4631c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f4632d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Pi2NavigationBar f4633e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ThemeableLottieAnimationView f4634f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f4635g;

    public C1127a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f4629a = constraintLayout;
        this.f4630b = constraintLayout2;
        this.f4631c = textView;
        this.f4632d = constraintLayout3;
        this.f4633e = pi2NavigationBar;
        this.f4634f = themeableLottieAnimationView;
        this.f4635g = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1127a m6432a(@NonNull View view) {
        int i10 = C13909n2.f48628b;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
        if (constraintLayout != null) {
            i10 = C13909n2.f48629c;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C13909n2.f48634h;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = C13909n2.f48641o;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = C13909n2.f48642p;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = C13909n2.f48647u;
                            TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                            if (textView2 != null) {
                                return new C1127a((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
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
    public static C1127a m6433c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13913o2.f48651a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6432a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4629a;
    }
}
