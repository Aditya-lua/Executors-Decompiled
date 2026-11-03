package yp;

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
import wp.r;
import wp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f37004a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f37005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f37006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f37007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f37008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f37009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f37010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f37011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f37012j;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull Space space, @NonNull ConstraintLayout constraintLayout3, @NonNull Guideline guideline, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Guideline guideline2, @NonNull TextView textView2) {
        this.f37004a = constraintLayout;
        this.b = constraintLayout2;
        this.f37005c = textView;
        this.f37006d = space;
        this.f37007e = constraintLayout3;
        this.f37008f = guideline;
        this.f37009g = pi2NavigationBar;
        this.f37010h = themeableLottieAnimationView;
        this.f37011i = guideline2;
        this.f37012j = textView2;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = r.f34836a;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = r.f34843e;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = r.f34847g;
                Space space = (Space) r5.b.a(view, i10);
                if (space != null) {
                    i10 = r.f34854m;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout2 != null) {
                        i10 = r.f34858q;
                        Guideline guideline = (Guideline) r5.b.a(view, i10);
                        if (guideline != null) {
                            i10 = r.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = r.I;
                                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                if (themeableLottieAnimationView != null) {
                                    i10 = r.X;
                                    Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                    if (guideline2 != null) {
                                        i10 = r.f34838b0;
                                        TextView textView2 = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(s.f34881i, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37004a;
    }
}
