package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import wp.r;
import wp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ScrollView f36980a;

    @NonNull
    public final Guideline b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f36982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f36983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f36984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f36987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Guideline f36988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f36989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f36990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f36991m;

    public e(@NonNull ScrollView scrollView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ConstraintLayout constraintLayout2, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f36980a = scrollView;
        this.b = guideline;
        this.f36981c = constraintLayout;
        this.f36982d = guideline2;
        this.f36983e = imageView;
        this.f36984f = themeableLottieAnimationView;
        this.f36985g = pi2NavigationBar;
        this.f36986h = constraintLayout2;
        this.f36987i = personaMaterialButton;
        this.f36988j = guideline3;
        this.f36989k = textView;
        this.f36990l = textView2;
        this.f36991m = textView3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = r.f34845f;
        Guideline guideline = (Guideline) r5.b.a(view, i10);
        if (guideline != null) {
            i10 = r.f34855n;
            ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = r.f34858q;
                Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                if (guideline2 != null) {
                    i10 = r.B;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = r.D;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = r.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = r.G;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = r.W;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = r.X;
                                        Guideline guideline3 = (Guideline) r5.b.a(view, i10);
                                        if (guideline3 != null) {
                                            i10 = r.Y;
                                            TextView textView = (TextView) r5.b.a(view, i10);
                                            if (textView != null) {
                                                i10 = r.Z;
                                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                                if (textView2 != null) {
                                                    i10 = r.f34837a0;
                                                    TextView textView3 = (TextView) r5.b.a(view, i10);
                                                    if (textView3 != null) {
                                                        return new e((ScrollView) view, guideline, constraintLayout, guideline2, imageView, themeableLottieAnimationView, pi2NavigationBar, constraintLayout2, personaMaterialButton, guideline3, textView, textView2, textView3);
                                                    }
                                                }
                                            }
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
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(s.f34877e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f36980a;
    }
}
