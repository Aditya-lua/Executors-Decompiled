package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p610zo.C13957e0;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1485g implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5764a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LottieAnimationView f5765b;

    public C1485g(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView) {
        this.f5764a = constraintLayout;
        this.f5765b = lottieAnimationView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1485g m7607a(@NonNull View view) {
        int i10 = C13957e0.f48738a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C10785b.m41116a(view, i10);
        if (lottieAnimationView != null) {
            return new C1485g((ConstraintLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1485g m7608c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13959f0.f48770g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m7607a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f5764a;
    }
}
