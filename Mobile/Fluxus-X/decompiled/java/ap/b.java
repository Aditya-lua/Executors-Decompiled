package ap;

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
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

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
    public final FrameLayout f3170a;

    @NonNull
    public final Space b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f3171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f3172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f3174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f3175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f3176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f3177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f3178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Guideline f3180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ToggleButton f3181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f3182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final View f3185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final ImageView f3186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f3188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3189u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f3190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final Barrier f3191w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3192x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f3193y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final Barrier f3194z;

    public b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull ToggleButton toggleButton, @NonNull TextView textView4, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView5, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull StaticCaptureTipsView staticCaptureTipsView, @NonNull TextView textView6, @NonNull Space space3, @NonNull TextView textView7) {
        this.f3170a = frameLayout;
        this.b = space;
        this.f3171c = camera2PreviewView;
        this.f3172d = progressBar;
        this.f3173e = constraintLayout;
        this.f3174f = button;
        this.f3175g = space2;
        this.f3176h = textView;
        this.f3177i = textView2;
        this.f3178j = textView3;
        this.f3179k = linearLayout;
        this.f3180l = guideline;
        this.f3181m = toggleButton;
        this.f3182n = textView4;
        this.f3183o = frameLayout2;
        this.f3184p = pi2NavigationBar;
        this.f3185q = view;
        this.f3186r = imageView;
        this.f3187s = constraintLayout2;
        this.f3188t = themeableLottieAnimationView;
        this.f3189u = constraintLayout3;
        this.f3190v = textView5;
        this.f3191w = barrier;
        this.f3192x = frameLayout3;
        this.f3193y = view2;
        this.f3194z = barrier2;
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
        int i10 = n3.f34869h;
        Space space = (Space) s5.b.a(view, i10);
        if (space != null) {
            i10 = n3.f34871i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) s5.b.a(view, i10);
            if (camera2PreviewView != null) {
                i10 = n3.f34875k;
                ProgressBar progressBar = (ProgressBar) s5.b.a(view, i10);
                if (progressBar != null) {
                    i10 = n3.f34879m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n3.f34881n;
                        Button button = (Button) s5.b.a(view, i10);
                        if (button != null) {
                            i10 = n3.f34883o;
                            Space space2 = (Space) s5.b.a(view, i10);
                            if (space2 != null) {
                                i10 = n3.f34885p;
                                TextView textView = (TextView) s5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = n3.f34903y;
                                    TextView textView2 = (TextView) s5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n3.f34905z;
                                        TextView textView3 = (TextView) s5.b.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = n3.B;
                                            LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = n3.D;
                                                Guideline guideline = (Guideline) s5.b.a(view, i10);
                                                if (guideline != null) {
                                                    i10 = n3.H;
                                                    ToggleButton toggleButton = (ToggleButton) s5.b.a(view, i10);
                                                    if (toggleButton != null) {
                                                        i10 = n3.M;
                                                        TextView textView4 = (TextView) s5.b.a(view, i10);
                                                        if (textView4 != null) {
                                                            i10 = n3.Z;
                                                            FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
                                                            if (frameLayout != null) {
                                                                i10 = n3.f34862d0;
                                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                                                if (pi2NavigationBar != null && (viewA = s5.b.a(view, (i10 = n3.f34864e0))) != null) {
                                                                    i10 = n3.f34866f0;
                                                                    ImageView imageView = (ImageView) s5.b.a(view, i10);
                                                                    if (imageView != null) {
                                                                        i10 = n3.f34868g0;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = n3.f34870h0;
                                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) s5.b.a(view, i10);
                                                                            if (themeableLottieAnimationView != null) {
                                                                                i10 = n3.f34872i0;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) s5.b.a(view, i10);
                                                                                if (constraintLayout3 != null) {
                                                                                    i10 = n3.f34874j0;
                                                                                    TextView textView5 = (TextView) s5.b.a(view, i10);
                                                                                    if (textView5 != null) {
                                                                                        i10 = n3.f34882n0;
                                                                                        Barrier barrier = (Barrier) s5.b.a(view, i10);
                                                                                        if (barrier != null) {
                                                                                            i10 = n3.f34884o0;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) s5.b.a(view, i10);
                                                                                            if (frameLayout2 != null && (viewA2 = s5.b.a(view, (i10 = n3.f34886p0))) != null) {
                                                                                                i10 = n3.f34888q0;
                                                                                                Barrier barrier2 = (Barrier) s5.b.a(view, i10);
                                                                                                if (barrier2 != null) {
                                                                                                    i10 = n3.f34890r0;
                                                                                                    PreviewView previewView = (PreviewView) s5.b.a(view, i10);
                                                                                                    if (previewView != null) {
                                                                                                        i10 = n3.f34894t0;
                                                                                                        ProgressBar progressBar2 = (ProgressBar) s5.b.a(view, i10);
                                                                                                        if (progressBar2 != null) {
                                                                                                            i10 = n3.f34904y0;
                                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) s5.b.a(view, i10);
                                                                                                            if (lottieAnimationView != null) {
                                                                                                                i10 = n3.f34906z0;
                                                                                                                ScanningView scanningView = (ScanningView) s5.b.a(view, i10);
                                                                                                                if (scanningView != null) {
                                                                                                                    i10 = n3.B0;
                                                                                                                    SpotlightView spotlightView = (SpotlightView) s5.b.a(view, i10);
                                                                                                                    if (spotlightView != null) {
                                                                                                                        i10 = n3.D0;
                                                                                                                        Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                                                                                                                        if (guideline2 != null) {
                                                                                                                            i10 = n3.E0;
                                                                                                                            StaticCaptureTipsView staticCaptureTipsView = (StaticCaptureTipsView) s5.b.a(view, i10);
                                                                                                                            if (staticCaptureTipsView != null) {
                                                                                                                                i10 = n3.L0;
                                                                                                                                TextView textView6 = (TextView) s5.b.a(view, i10);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i10 = n3.M0;
                                                                                                                                    Space space3 = (Space) s5.b.a(view, i10);
                                                                                                                                    if (space3 != null) {
                                                                                                                                        i10 = n3.P0;
                                                                                                                                        TextView textView7 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o3.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f3170a;
    }
}
