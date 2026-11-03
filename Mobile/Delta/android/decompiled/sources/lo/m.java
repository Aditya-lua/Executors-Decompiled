package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23881a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f23882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f23886g;

    public m(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f23881a = constraintLayout;
        this.b = constraintLayout2;
        this.f23882c = textView;
        this.f23883d = constraintLayout3;
        this.f23884e = pi2NavigationBar;
        this.f23885f = themeableLottieAnimationView;
        this.f23886g = textView2;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = n2.b;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = n2.f18765d;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = n2.f18797t;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = n2.f18766d0;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = n2.f18780k0;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = n2.L0;
                            TextView textView2 = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f18825n, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f23881a;
    }
}
