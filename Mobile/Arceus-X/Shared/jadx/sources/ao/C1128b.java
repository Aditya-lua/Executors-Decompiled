package ao;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p609zn.C13909n2;

/* JADX INFO: renamed from: ao.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1128b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4636a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ThemeableLottieAnimationView f4637b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f4638c;

    public C1128b(@NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull MaterialCardView materialCardView) {
        this.f4636a = constraintLayout;
        this.f4637b = themeableLottieAnimationView;
        this.f4638c = materialCardView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1128b m6435a(@NonNull View view) {
        int i10 = C13909n2.f48627a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
        if (themeableLottieAnimationView != null) {
            i10 = C13909n2.f48632f;
            MaterialCardView materialCardView = (MaterialCardView) C10785b.m41116a(view, i10);
            if (materialCardView != null) {
                return new C1128b((ConstraintLayout) view, themeableLottieAnimationView, materialCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4636a;
    }
}
