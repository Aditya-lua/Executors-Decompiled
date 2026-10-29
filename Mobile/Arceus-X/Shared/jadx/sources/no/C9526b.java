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
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9526b implements InterfaceC10784a {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final PreviewView f34317A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final ProgressBar f34318B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final LottieAnimationView f34319C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final ScanningView f34320D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public final SpotlightView f34321E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public final Guideline f34322F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public final StaticCaptureTipsView f34323G;

    /* JADX INFO: renamed from: H */
    @NonNull
    public final TextView f34324H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public final Space f34325I;

    /* JADX INFO: renamed from: J */
    @NonNull
    public final TextView f34326J;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f34327a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Space f34328b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Camera2PreviewView f34329c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ProgressBar f34330d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f34331e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Button f34332f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Space f34333g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f34334h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f34335i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f34336j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f34337k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final Guideline f34338l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ToggleButton f34339m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f34340n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FrameLayout f34341o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final Pi2NavigationBar f34342p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final View f34343q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ImageView f34344r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ConstraintLayout f34345s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ThemeableLottieAnimationView f34346t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final ConstraintLayout f34347u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final TextView f34348v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final Barrier f34349w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final FrameLayout f34350x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final View f34351y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final Barrier f34352z;

    public C9526b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull ToggleButton toggleButton, @NonNull TextView textView4, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView5, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull StaticCaptureTipsView staticCaptureTipsView, @NonNull TextView textView6, @NonNull Space space3, @NonNull TextView textView7) {
        this.f34327a = frameLayout;
        this.f34328b = space;
        this.f34329c = camera2PreviewView;
        this.f34330d = progressBar;
        this.f34331e = constraintLayout;
        this.f34332f = button;
        this.f34333g = space2;
        this.f34334h = textView;
        this.f34335i = textView2;
        this.f34336j = textView3;
        this.f34337k = linearLayout;
        this.f34338l = guideline;
        this.f34339m = toggleButton;
        this.f34340n = textView4;
        this.f34341o = frameLayout2;
        this.f34342p = pi2NavigationBar;
        this.f34343q = view;
        this.f34344r = imageView;
        this.f34345s = constraintLayout2;
        this.f34346t = themeableLottieAnimationView;
        this.f34347u = constraintLayout3;
        this.f34348v = textView5;
        this.f34349w = barrier;
        this.f34350x = frameLayout3;
        this.f34351y = view2;
        this.f34352z = barrier2;
        this.f34317A = previewView;
        this.f34318B = progressBar2;
        this.f34319C = lottieAnimationView;
        this.f34320D = scanningView;
        this.f34321E = spotlightView;
        this.f34322F = guideline2;
        this.f34323G = staticCaptureTipsView;
        this.f34324H = textView6;
        this.f34325I = space3;
        this.f34326J = textView7;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9526b m37613a(@NonNull View view) {
        View viewM41116a;
        View viewM41116a2;
        int i10 = C6895n2.f27069h;
        Space space = (Space) C10785b.m41116a(view, i10);
        if (space != null) {
            i10 = C6895n2.f27071i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) C10785b.m41116a(view, i10);
            if (camera2PreviewView != null) {
                i10 = C6895n2.f27075k;
                ProgressBar progressBar = (ProgressBar) C10785b.m41116a(view, i10);
                if (progressBar != null) {
                    i10 = C6895n2.f27079m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                    if (constraintLayout != null) {
                        i10 = C6895n2.f27081n;
                        Button button = (Button) C10785b.m41116a(view, i10);
                        if (button != null) {
                            i10 = C6895n2.f27083o;
                            Space space2 = (Space) C10785b.m41116a(view, i10);
                            if (space2 != null) {
                                i10 = C6895n2.f27085p;
                                TextView textView = (TextView) C10785b.m41116a(view, i10);
                                if (textView != null) {
                                    i10 = C6895n2.f27103y;
                                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                    if (textView2 != null) {
                                        i10 = C6895n2.f27105z;
                                        TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                        if (textView3 != null) {
                                            i10 = C6895n2.f27015B;
                                            LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = C6895n2.f27019D;
                                                Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
                                                if (guideline != null) {
                                                    i10 = C6895n2.f27027H;
                                                    ToggleButton toggleButton = (ToggleButton) C10785b.m41116a(view, i10);
                                                    if (toggleButton != null) {
                                                        i10 = C6895n2.f27037M;
                                                        TextView textView4 = (TextView) C10785b.m41116a(view, i10);
                                                        if (textView4 != null) {
                                                            i10 = C6895n2.f27054Z;
                                                            FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
                                                            if (frameLayout != null) {
                                                                i10 = C6895n2.f27062d0;
                                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                                                                if (pi2NavigationBar != null && (viewM41116a = C10785b.m41116a(view, (i10 = C6895n2.f27064e0))) != null) {
                                                                    i10 = C6895n2.f27066f0;
                                                                    ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                                                                    if (imageView != null) {
                                                                        i10 = C6895n2.f27068g0;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = C6895n2.f27070h0;
                                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                                                                            if (themeableLottieAnimationView != null) {
                                                                                i10 = C6895n2.f27072i0;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) C10785b.m41116a(view, i10);
                                                                                if (constraintLayout3 != null) {
                                                                                    i10 = C6895n2.f27074j0;
                                                                                    TextView textView5 = (TextView) C10785b.m41116a(view, i10);
                                                                                    if (textView5 != null) {
                                                                                        i10 = C6895n2.f27082n0;
                                                                                        Barrier barrier = (Barrier) C10785b.m41116a(view, i10);
                                                                                        if (barrier != null) {
                                                                                            i10 = C6895n2.f27084o0;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) C10785b.m41116a(view, i10);
                                                                                            if (frameLayout2 != null && (viewM41116a2 = C10785b.m41116a(view, (i10 = C6895n2.f27086p0))) != null) {
                                                                                                i10 = C6895n2.f27088q0;
                                                                                                Barrier barrier2 = (Barrier) C10785b.m41116a(view, i10);
                                                                                                if (barrier2 != null) {
                                                                                                    i10 = C6895n2.f27090r0;
                                                                                                    PreviewView previewView = (PreviewView) C10785b.m41116a(view, i10);
                                                                                                    if (previewView != null) {
                                                                                                        i10 = C6895n2.f27094t0;
                                                                                                        ProgressBar progressBar2 = (ProgressBar) C10785b.m41116a(view, i10);
                                                                                                        if (progressBar2 != null) {
                                                                                                            i10 = C6895n2.f27104y0;
                                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C10785b.m41116a(view, i10);
                                                                                                            if (lottieAnimationView != null) {
                                                                                                                i10 = C6895n2.f27106z0;
                                                                                                                ScanningView scanningView = (ScanningView) C10785b.m41116a(view, i10);
                                                                                                                if (scanningView != null) {
                                                                                                                    i10 = C6895n2.f27016B0;
                                                                                                                    SpotlightView spotlightView = (SpotlightView) C10785b.m41116a(view, i10);
                                                                                                                    if (spotlightView != null) {
                                                                                                                        i10 = C6895n2.f27020D0;
                                                                                                                        Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                                                                                                                        if (guideline2 != null) {
                                                                                                                            i10 = C6895n2.f27022E0;
                                                                                                                            StaticCaptureTipsView staticCaptureTipsView = (StaticCaptureTipsView) C10785b.m41116a(view, i10);
                                                                                                                            if (staticCaptureTipsView != null) {
                                                                                                                                i10 = C6895n2.f27036L0;
                                                                                                                                TextView textView6 = (TextView) C10785b.m41116a(view, i10);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i10 = C6895n2.f27038M0;
                                                                                                                                    Space space3 = (Space) C10785b.m41116a(view, i10);
                                                                                                                                    if (space3 != null) {
                                                                                                                                        i10 = C6895n2.f27044P0;
                                                                                                                                        TextView textView7 = (TextView) C10785b.m41116a(view, i10);
                                                                                                                                        if (textView7 != null) {
                                                                                                                                            return new C9526b((FrameLayout) view, space, camera2PreviewView, progressBar, constraintLayout, button, space2, textView, textView2, textView3, linearLayout, guideline, toggleButton, textView4, frameLayout, pi2NavigationBar, viewM41116a, imageView, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView5, barrier, frameLayout2, viewM41116a2, barrier2, previewView, progressBar2, lottieAnimationView, scanningView, spotlightView, guideline2, staticCaptureTipsView, textView6, space3, textView7);
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
    /* JADX INFO: renamed from: c */
    public static C9526b m37614c(@NonNull LayoutInflater layoutInflater) {
        return m37615d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C9526b m37615d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27110b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37613a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f34327a;
    }
}
