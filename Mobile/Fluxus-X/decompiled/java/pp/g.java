package pp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import np.g0;
import np.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f29266a;

    @NonNull
    public final LottieAnimationView b;

    public g(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView) {
        this.f29266a = constraintLayout;
        this.b = lottieAnimationView;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = g0.f26308a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) s5.b.a(view, i10);
        if (lottieAnimationView != null) {
            return new g((ConstraintLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(h0.f26328g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f29266a;
    }
}
