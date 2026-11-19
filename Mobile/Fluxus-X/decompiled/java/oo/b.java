package oo;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import no.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28300a;

    @NonNull
    public final ThemeableLottieAnimationView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f28301c;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull MaterialCardView materialCardView) {
        this.f28300a = constraintLayout;
        this.b = themeableLottieAnimationView;
        this.f28301c = materialCardView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = c3.f25941a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
        if (themeableLottieAnimationView != null) {
            i10 = c3.f25945f;
            MaterialCardView materialCardView = (MaterialCardView) s5.b.a(view, i10);
            if (materialCardView != null) {
                return new b((ConstraintLayout) view, themeableLottieAnimationView, materialCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28300a;
    }
}
