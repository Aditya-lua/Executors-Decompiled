package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p226jq.C7283u;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9551g implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ThemeableLottieAnimationView f34528a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ThemeableLottieAnimationView f34529b;

    public C9551g(@NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView2) {
        this.f34528a = themeableLottieAnimationView;
        this.f34529b = themeableLottieAnimationView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9551g m37688a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) view;
        return new C9551g(themeableLottieAnimationView, themeableLottieAnimationView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9551g m37689c(@NonNull LayoutInflater layoutInflater) {
        return m37690d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C9551g m37690d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C7283u.f28095g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37688a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ThemeableLottieAnimationView getRoot() {
        return this.f34528a;
    }
}
