package oo;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import no.c3;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28311a;

    @NonNull
    public final MaterialCardView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f28312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f28313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f28314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f28315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f28316g;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f28311a = constraintLayout;
        this.b = materialCardView;
        this.f28312c = textView;
        this.f28313d = imageView;
        this.f28314e = linearLayout;
        this.f28315f = circularProgressIndicator;
        this.f28316g = themeableLottieAnimationView;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = c3.f25945f;
        MaterialCardView materialCardView = (MaterialCardView) s5.b.a(view, i10);
        if (materialCardView != null) {
            i10 = c3.f25950k;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = c3.f25951l;
                ImageView imageView = (ImageView) s5.b.a(view, i10);
                if (imageView != null) {
                    i10 = c3.f25952m;
                    LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = c3.f25953n;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) s5.b.a(view, i10);
                        if (circularProgressIndicator != null) {
                            i10 = c3.f25956q;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                return new d((ConstraintLayout) view, materialCardView, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28311a;
    }
}
