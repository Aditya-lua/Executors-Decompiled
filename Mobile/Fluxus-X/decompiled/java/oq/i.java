package oq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28396a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f28397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f28398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f28400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f28402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f28403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f28404j;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull Space space, @NonNull ConstraintLayout constraintLayout3, @NonNull Guideline guideline, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Guideline guideline2, @NonNull TextView textView2) {
        this.f28396a = constraintLayout;
        this.b = constraintLayout2;
        this.f28397c = textView;
        this.f28398d = space;
        this.f28399e = constraintLayout3;
        this.f28400f = guideline;
        this.f28401g = pi2NavigationBar;
        this.f28402h = themeableLottieAnimationView;
        this.f28403i = guideline2;
        this.f28404j = textView2;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = x.f24143a;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = x.f24150e;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = x.f24154g;
                Space space = (Space) s5.b.a(view, i10);
                if (space != null) {
                    i10 = x.f24161m;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                    if (constraintLayout2 != null) {
                        i10 = x.f24165q;
                        Guideline guideline = (Guideline) s5.b.a(view, i10);
                        if (guideline != null) {
                            i10 = x.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = x.I;
                                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                                if (themeableLottieAnimationView != null) {
                                    i10 = x.X;
                                    Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                                    if (guideline2 != null) {
                                        i10 = x.f24145b0;
                                        TextView textView2 = (TextView) s5.b.a(view, i10);
                                        if (textView2 != null) {
                                            return new i((ConstraintLayout) view, constraintLayout, textView, space, constraintLayout2, guideline, pi2NavigationBar, themeableLottieAnimationView, guideline2, textView2);
                                        }
                                    }
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
    public static i c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(y.f24191i, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28396a;
    }
}
