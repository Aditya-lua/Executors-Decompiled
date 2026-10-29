package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import io.n2;
import io.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    @NonNull
    public final PreviewView A;

    @NonNull
    public final ProgressBar B;

    @NonNull
    public final LottieAnimationView C;

    @NonNull
    public final ScanningView D;

    @NonNull
    public final SpotlightView E;

    @NonNull
    public final Guideline F;

    @NonNull
    public final StaticCaptureTipsView G;

    @NonNull
    public final TextView H;

    @NonNull
    public final Space I;

    @NonNull
    public final TextView J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26478a;

    @NonNull
    public final Space b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f26479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f26480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f26482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f26483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f26484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f26485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f26486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f26487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Guideline f26488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ToggleButton f26489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f26490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f26492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final View f26493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final ImageView f26494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f26496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f26497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f26498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final Barrier f26499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final FrameLayout f26500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f26501y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final Barrier f26502z;

    public b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull ToggleButton toggleButton, @NonNull TextView textView4, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView5, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull StaticCaptureTipsView staticCaptureTipsView, @NonNull TextView textView6, @NonNull Space space3, @NonNull TextView textView7) {
        this.f26478a = frameLayout;
        this.b = space;
        this.f26479c = camera2PreviewView;
        this.f26480d = progressBar;
        this.f26481e = constraintLayout;
        this.f26482f = button;
        this.f26483g = space2;
        this.f26484h = textView;
        this.f26485i = textView2;
        this.f26486j = textView3;
        this.f26487k = linearLayout;
        this.f26488l = guideline;
        this.f26489m = toggleButton;
        this.f26490n = textView4;
        this.f26491o = frameLayout2;
        this.f26492p = pi2NavigationBar;
        this.f26493q = view;
        this.f26494r = imageView;
        this.f26495s = constraintLayout2;
        this.f26496t = themeableLottieAnimationView;
        this.f26497u = constraintLayout3;
        this.f26498v = textView5;
        this.f26499w = barrier;
        this.f26500x = frameLayout3;
        this.f26501y = view2;
        this.f26502z = barrier2;
        this.A = previewView;
        this.B = progressBar2;
        this.C = lottieAnimationView;
        this.D = scanningView;
        this.E = spotlightView;
        this.F = guideline2;
        this.G = staticCaptureTipsView;
        this.H = textView6;
        this.I = space3;
        this.J = textView7;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = n2.f20716h;
        Space space = (Space) r5.b.a(view, i10);
        if (space != null) {
            i10 = n2.f20718i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
            if (camera2PreviewView != null) {
                i10 = n2.f20722k;
                ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                if (progressBar != null) {
                    i10 = n2.f20726m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f20728n;
                        Button button = (Button) r5.b.a(view, i10);
                        if (button != null) {
                            i10 = n2.f20730o;
                            Space space2 = (Space) r5.b.a(view, i10);
                            if (space2 != null) {
                                i10 = n2.f20732p;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = n2.f20750y;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n2.f20752z;
                                        TextView textView3 = (TextView) r5.b.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = n2.B;
                                            LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = n2.D;
                                                Guideline guideline = (Guideline) r5.b.a(view, i10);
                                                if (guideline != null) {
                                                    i10 = n2.H;
                                                    ToggleButton toggleButton = (ToggleButton) r5.b.a(view, i10);
                                                    if (toggleButton != null) {
                                                        i10 = n2.M;
                                                        TextView textView4 = (TextView) r5.b.a(view, i10);
                                                        if (textView4 != null) {
                                                            i10 = n2.Z;
                                                            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                                            if (frameLayout != null) {
                                                                i10 = n2.f20709d0;
                                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                                                if (pi2NavigationBar != null && (viewA = r5.b.a(view, (i10 = n2.f20711e0))) != null) {
                                                                    i10 = n2.f20713f0;
                                                                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                                                                    if (imageView != null) {
                                                                        i10 = n2.f20715g0;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = n2.f20717h0;
                                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                                                            if (themeableLottieAnimationView != null) {
                                                                                i10 = n2.f20719i0;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                                                                if (constraintLayout3 != null) {
                                                                                    i10 = n2.f20721j0;
                                                                                    TextView textView5 = (TextView) r5.b.a(view, i10);
                                                                                    if (textView5 != null) {
                                                                                        i10 = n2.f20729n0;
                                                                                        Barrier barrier = (Barrier) r5.b.a(view, i10);
                                                                                        if (barrier != null) {
                                                                                            i10 = n2.f20731o0;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                                                                                            if (frameLayout2 != null && (viewA2 = r5.b.a(view, (i10 = n2.f20733p0))) != null) {
                                                                                                i10 = n2.f20735q0;
                                                                                                Barrier barrier2 = (Barrier) r5.b.a(view, i10);
                                                                                                if (barrier2 != null) {
                                                                                                    i10 = n2.f20737r0;
                                                                                                    PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                                                                                    if (previewView != null) {
                                                                                                        i10 = n2.f20741t0;
                                                                                                        ProgressBar progressBar2 = (ProgressBar) r5.b.a(view, i10);
                                                                                                        if (progressBar2 != null) {
                                                                                                            i10 = n2.f20751y0;
                                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) r5.b.a(view, i10);
                                                                                                            if (lottieAnimationView != null) {
                                                                                                                i10 = n2.f20753z0;
                                                                                                                ScanningView scanningView = (ScanningView) r5.b.a(view, i10);
                                                                                                                if (scanningView != null) {
                                                                                                                    i10 = n2.B0;
                                                                                                                    SpotlightView spotlightView = (SpotlightView) r5.b.a(view, i10);
                                                                                                                    if (spotlightView != null) {
                                                                                                                        i10 = n2.D0;
                                                                                                                        Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                                                                                                        if (guideline2 != null) {
                                                                                                                            i10 = n2.E0;
                                                                                                                            StaticCaptureTipsView staticCaptureTipsView = (StaticCaptureTipsView) r5.b.a(view, i10);
                                                                                                                            if (staticCaptureTipsView != null) {
                                                                                                                                i10 = n2.L0;
                                                                                                                                TextView textView6 = (TextView) r5.b.a(view, i10);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i10 = n2.M0;
                                                                                                                                    Space space3 = (Space) r5.b.a(view, i10);
                                                                                                                                    if (space3 != null) {
                                                                                                                                        i10 = n2.P0;
                                                                                                                                        TextView textView7 = (TextView) r5.b.a(view, i10);
                                                                                                                                        if (textView7 != null) {
                                                                                                                                            return new b((FrameLayout) view, space, camera2PreviewView, progressBar, constraintLayout, button, space2, textView, textView2, textView3, linearLayout, guideline, toggleButton, textView4, frameLayout, pi2NavigationBar, viewA, imageView, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView5, barrier, frameLayout2, viewA2, barrier2, previewView, progressBar2, lottieAnimationView, scanningView, spotlightView, guideline2, staticCaptureTipsView, textView6, space3, textView7);
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
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o2.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f26478a;
    }
}
