package no;

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
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f26471a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f26472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f26476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f26477h;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView) {
        this.f26471a = coordinatorLayout;
        this.b = linearLayout;
        this.f26472c = button;
        this.f26473d = linearLayout2;
        this.f26474e = themeableLottieAnimationView;
        this.f26475f = constraintLayout;
        this.f26476g = pi2NavigationBar;
        this.f26477h = textView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = n2.f20742u;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n2.f20744v;
            Button button = (Button) r5.b.a(view, i10);
            if (button != null) {
                i10 = n2.J;
                LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                if (linearLayout2 != null) {
                    i10 = n2.T;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                    if (themeableLottieAnimationView != null) {
                        i10 = n2.Y;
                        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                        if (constraintLayout != null) {
                            i10 = n2.f20709d0;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = n2.L0;
                                TextView textView = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f20756a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f26471a;
    }
}
