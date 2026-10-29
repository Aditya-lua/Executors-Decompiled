package nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import jq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26658a;

    @NonNull
    public final ThemeableLottieAnimationView b;

    public g(@NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView2) {
        this.f26658a = themeableLottieAnimationView;
        this.b = themeableLottieAnimationView2;
    }

    @NonNull
    public static g a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) view;
        return new g(themeableLottieAnimationView, themeableLottieAnimationView);
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(u.f21684g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ThemeableLottieAnimationView getRoot() {
        return this.f26658a;
    }
}
