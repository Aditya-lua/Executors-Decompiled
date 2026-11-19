package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import no.c3;
import no.d3;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28294a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f28295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f28298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f28299g;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f28294a = constraintLayout;
        this.b = constraintLayout2;
        this.f28295c = textView;
        this.f28296d = constraintLayout3;
        this.f28297e = pi2NavigationBar;
        this.f28298f = themeableLottieAnimationView;
        this.f28299g = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = c3.b;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = c3.f25942c;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = c3.f25947h;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = c3.f25954o;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = c3.f25955p;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = c3.f25960u;
                            TextView textView2 = (TextView) s5.b.a(view, i10);
                            if (textView2 != null) {
                                return new a((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
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
        View viewInflate = layoutInflater.inflate(d3.f25966a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28294a;
    }
}
