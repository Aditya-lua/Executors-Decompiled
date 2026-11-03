package lo;

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
import go.n2;
import go.o2;

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
    public final FrameLayout f23767a;

    @NonNull
    public final Space b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f23768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f23769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f23771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f23772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f23773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f23774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f23775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Guideline f23777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ToggleButton f23778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f23779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final View f23782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final ImageView f23783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f23787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final Barrier f23788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f23790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final Barrier f23791z;

    public b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull ToggleButton toggleButton, @NonNull TextView textView4, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView5, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull StaticCaptureTipsView staticCaptureTipsView, @NonNull TextView textView6, @NonNull Space space3, @NonNull TextView textView7) {
        this.f23767a = frameLayout;
        this.b = space;
        this.f23768c = camera2PreviewView;
        this.f23769d = progressBar;
        this.f23770e = constraintLayout;
        this.f23771f = button;
        this.f23772g = space2;
        this.f23773h = textView;
        this.f23774i = textView2;
        this.f23775j = textView3;
        this.f23776k = linearLayout;
        this.f23777l = guideline;
        this.f23778m = toggleButton;
        this.f23779n = textView4;
        this.f23780o = frameLayout2;
        this.f23781p = pi2NavigationBar;
        this.f23782q = view;
        this.f23783r = imageView;
        this.f23784s = constraintLayout2;
        this.f23785t = themeableLottieAnimationView;
        this.f23786u = constraintLayout3;
        this.f23787v = textView5;
        this.f23788w = barrier;
        this.f23789x = frameLayout3;
        this.f23790y = view2;
        this.f23791z = barrier2;
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
        int i10 = n2.f18773h;
        Space space = (Space) r5.b.a(view, i10);
        if (space != null) {
            i10 = n2.f18775i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
            if (camera2PreviewView != null) {
                i10 = n2.f18779k;
                ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                if (progressBar != null) {
                    i10 = n2.f18783m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f18785n;
                        Button button = (Button) r5.b.a(view, i10);
                        if (button != null) {
                            i10 = n2.f18787o;
                            Space space2 = (Space) r5.b.a(view, i10);
                            if (space2 != null) {
                                i10 = n2.f18789p;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = n2.f18807y;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n2.f18809z;
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
                                                                i10 = n2.f18766d0;
                                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                                                if (pi2NavigationBar != null && (viewA = r5.b.a(view, (i10 = n2.f18768e0))) != null) {
                                                                    i10 = n2.f18770f0;
                                                                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                                                                    if (imageView != null) {
                                                                        i10 = n2.f18772g0;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = n2.f18774h0;
                                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                                                            if (themeableLottieAnimationView != null) {
                                                                                i10 = n2.f18776i0;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                                                                if (constraintLayout3 != null) {
                                                                                    i10 = n2.f18778j0;
                                                                                    TextView textView5 = (TextView) r5.b.a(view, i10);
                                                                                    if (textView5 != null) {
                                                                                        i10 = n2.f18786n0;
                                                                                        Barrier barrier = (Barrier) r5.b.a(view, i10);
                                                                                        if (barrier != null) {
                                                                                            i10 = n2.f18788o0;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                                                                                            if (frameLayout2 != null && (viewA2 = r5.b.a(view, (i10 = n2.f18790p0))) != null) {
                                                                                                i10 = n2.f18792q0;
                                                                                                Barrier barrier2 = (Barrier) r5.b.a(view, i10);
                                                                                                if (barrier2 != null) {
                                                                                                    i10 = n2.f18794r0;
                                                                                                    PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                                                                                    if (previewView != null) {
                                                                                                        i10 = n2.f18798t0;
                                                                                                        ProgressBar progressBar2 = (ProgressBar) r5.b.a(view, i10);
                                                                                                        if (progressBar2 != null) {
                                                                                                            i10 = n2.f18808y0;
                                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) r5.b.a(view, i10);
                                                                                                            if (lottieAnimationView != null) {
                                                                                                                i10 = n2.f18810z0;
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
        return this.f23767a;
    }
}
