package ao;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p609zn.C13909n2;

/* JADX INFO: renamed from: ao.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1130d implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4649a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialCardView f4650b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f4651c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4652d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f4653e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CircularProgressIndicator f4654f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ThemeableLottieAnimationView f4655g;

    public C1130d(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f4649a = constraintLayout;
        this.f4650b = materialCardView;
        this.f4651c = textView;
        this.f4652d = imageView;
        this.f4653e = linearLayout;
        this.f4654f = circularProgressIndicator;
        this.f4655g = themeableLottieAnimationView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1130d m6440a(@NonNull View view) {
        int i10 = C13909n2.f48632f;
        MaterialCardView materialCardView = (MaterialCardView) C10785b.m41116a(view, i10);
        if (materialCardView != null) {
            i10 = C13909n2.f48637k;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C13909n2.f48638l;
                ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                if (imageView != null) {
                    i10 = C13909n2.f48639m;
                    LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
                    if (linearLayout != null) {
                        i10 = C13909n2.f48640n;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C10785b.m41116a(view, i10);
                        if (circularProgressIndicator != null) {
                            i10 = C13909n2.f48643q;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                return new C1130d((ConstraintLayout) view, materialCardView, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4649a;
    }
}
