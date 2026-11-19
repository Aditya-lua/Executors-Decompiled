package oq;

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
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ScrollView f28372a;

    @NonNull
    public final Guideline b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f28374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f28375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f28376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f28379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Guideline f28380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f28381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f28382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f28383m;

    public e(@NonNull ScrollView scrollView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ConstraintLayout constraintLayout2, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f28372a = scrollView;
        this.b = guideline;
        this.f28373c = constraintLayout;
        this.f28374d = guideline2;
        this.f28375e = imageView;
        this.f28376f = themeableLottieAnimationView;
        this.f28377g = pi2NavigationBar;
        this.f28378h = constraintLayout2;
        this.f28379i = personaMaterialButton;
        this.f28380j = guideline3;
        this.f28381k = textView;
        this.f28382l = textView2;
        this.f28383m = textView3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = x.f24152f;
        Guideline guideline = (Guideline) s5.b.a(view, i10);
        if (guideline != null) {
            i10 = x.f24162n;
            ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = x.f24165q;
                Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                if (guideline2 != null) {
                    i10 = x.B;
                    ImageView imageView = (ImageView) s5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = x.D;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                        if (themeableLottieAnimationView != null) {
                            i10 = x.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = x.G;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = x.W;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = x.X;
                                        Guideline guideline3 = (Guideline) s5.b.a(view, i10);
                                        if (guideline3 != null) {
                                            i10 = x.Y;
                                            TextView textView = (TextView) s5.b.a(view, i10);
                                            if (textView != null) {
                                                i10 = x.Z;
                                                TextView textView2 = (TextView) s5.b.a(view, i10);
                                                if (textView2 != null) {
                                                    i10 = x.f24144a0;
                                                    TextView textView3 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(y.f24187e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f28372a;
    }
}
