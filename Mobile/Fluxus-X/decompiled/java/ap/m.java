package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3284a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f3285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f3289g;

    public m(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f3284a = constraintLayout;
        this.b = constraintLayout2;
        this.f3285c = textView;
        this.f3286d = constraintLayout3;
        this.f3287e = pi2NavigationBar;
        this.f3288f = themeableLottieAnimationView;
        this.f3289g = textView2;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = n3.b;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = n3.f34861d;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = n3.f34893t;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = n3.f34862d0;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = n3.f34876k0;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = n3.L0;
                            TextView textView2 = (TextView) s5.b.a(view, i10);
                            if (textView2 != null) {
                                return new m((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34942n, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3284a;
    }
}
