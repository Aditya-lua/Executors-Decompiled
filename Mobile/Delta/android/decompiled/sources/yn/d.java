package yn;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import xn.n2;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36919a;

    @NonNull
    public final MaterialCardView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f36920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f36921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f36923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f36924g;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f36919a = constraintLayout;
        this.b = materialCardView;
        this.f36920c = textView;
        this.f36921d = imageView;
        this.f36922e = linearLayout;
        this.f36923f = circularProgressIndicator;
        this.f36924g = themeableLottieAnimationView;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = n2.f35899f;
        MaterialCardView materialCardView = (MaterialCardView) r5.b.a(view, i10);
        if (materialCardView != null) {
            i10 = n2.f35904k;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = n2.f35905l;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = n2.f35906m;
                    LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = n2.f35907n;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) r5.b.a(view, i10);
                        if (circularProgressIndicator != null) {
                            i10 = n2.f35910q;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
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

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36919a;
    }
}
