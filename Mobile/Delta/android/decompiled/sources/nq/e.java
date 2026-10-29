package nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import jq.t;
import jq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26655a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26656c;

    public e(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f26655a = linearLayout;
        this.b = textView;
        this.f26656c = themeableLottieAnimationView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = t.f21660h;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = t.f21664l;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
            if (themeableLottieAnimationView != null) {
                return new e((LinearLayout) view, textView, themeableLottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(u.f21682e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f26655a;
    }
}
