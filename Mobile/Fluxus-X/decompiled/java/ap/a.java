package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3163a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f3164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f3169h;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView) {
        this.f3163a = coordinatorLayout;
        this.b = linearLayout;
        this.f3164c = button;
        this.f3165d = linearLayout2;
        this.f3166e = themeableLottieAnimationView;
        this.f3167f = constraintLayout;
        this.f3168g = pi2NavigationBar;
        this.f3169h = textView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = n3.f34895u;
        LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n3.f34897v;
            Button button = (Button) s5.b.a(view, i10);
            if (button != null) {
                i10 = n3.J;
                LinearLayout linearLayout2 = (LinearLayout) s5.b.a(view, i10);
                if (linearLayout2 != null) {
                    i10 = n3.T;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                    if (themeableLottieAnimationView != null) {
                        i10 = n3.Y;
                        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                        if (constraintLayout != null) {
                            i10 = n3.f34862d0;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = n3.L0;
                                TextView textView = (TextView) s5.b.a(view, i10);
                                if (textView != null) {
                                    return new a((CoordinatorLayout) view, linearLayout, button, linearLayout2, themeableLottieAnimationView, constraintLayout, pi2NavigationBar, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34930a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3163a;
    }
}
