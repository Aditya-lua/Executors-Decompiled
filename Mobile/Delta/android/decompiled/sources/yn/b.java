package yn;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import xn.n2;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36908a;

    @NonNull
    public final ThemeableLottieAnimationView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f36909c;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull MaterialCardView materialCardView) {
        this.f36908a = constraintLayout;
        this.b = themeableLottieAnimationView;
        this.f36909c = materialCardView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = n2.f35895a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
        if (themeableLottieAnimationView != null) {
            i10 = n2.f35899f;
            MaterialCardView materialCardView = (MaterialCardView) r5.b.a(view, i10);
            if (materialCardView != null) {
                return new b((ConstraintLayout) view, themeableLottieAnimationView, materialCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36908a;
    }
}
