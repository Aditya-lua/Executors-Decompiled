package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import wp.r;
import wp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    @NonNull
    public final SpotlightView A;

    @NonNull
    public final Guideline B;

    @NonNull
    public final TextView C;

    @NonNull
    public final Space D;

    @NonNull
    public final ImageView E;

    @NonNull
    public final Space F;

    @NonNull
    public final TextView G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36954a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f36955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f36956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f36957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f36958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f36959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f36960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f36961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f36962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Guideline f36963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f36965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f36966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ProgressBar f36967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f36969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final Barrier f36970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final PreviewView f36972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f36973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f36974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f36976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f36977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final SelfieOverlayView f36978z;

    public c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull Space space, @NonNull ImageView imageView, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view2, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ImageView imageView2, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout2, @NonNull PreviewView previewView, @NonNull CircularProgressIndicator circularProgressIndicator2, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView7, @NonNull View view3, @NonNull SelfieOverlayView selfieOverlayView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull TextView textView8, @NonNull Space space2, @NonNull ImageView imageView3, @NonNull Space space3, @NonNull TextView textView9) {
        this.f36954a = constraintLayout;
        this.b = textView;
        this.f36955c = circularProgressIndicator;
        this.f36956d = space;
        this.f36957e = imageView;
        this.f36958f = camera2PreviewView;
        this.f36959g = view;
        this.f36960h = textView2;
        this.f36961i = textView3;
        this.f36962j = view2;
        this.f36963k = guideline;
        this.f36964l = frameLayout;
        this.f36965m = textView4;
        this.f36966n = textView5;
        this.f36967o = progressBar;
        this.f36968p = pi2NavigationBar;
        this.f36969q = imageView2;
        this.f36970r = barrier;
        this.f36971s = frameLayout2;
        this.f36972t = previewView;
        this.f36973u = circularProgressIndicator2;
        this.f36974v = textView6;
        this.f36975w = constraintLayout2;
        this.f36976x = textView7;
        this.f36977y = view3;
        this.f36978z = selfieOverlayView;
        this.A = spotlightView;
        this.B = guideline2;
        this.C = textView8;
        this.D = space2;
        this.E = imageView3;
        this.F = space3;
        this.G = textView9;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        View viewA2;
        View viewA3;
        int i10 = r.b;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = r.f34839c;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) r5.b.a(view, i10);
            if (circularProgressIndicator != null) {
                i10 = r.f34847g;
                Space space = (Space) r5.b.a(view, i10);
                if (space != null) {
                    i10 = r.f34849h;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = r.f34850i;
                        Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
                        if (camera2PreviewView != null && (viewA = r5.b.a(view, (i10 = r.f34851j))) != null) {
                            i10 = r.f34852k;
                            TextView textView2 = (TextView) r5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = r.f34856o;
                                TextView textView3 = (TextView) r5.b.a(view, i10);
                                if (textView3 != null && (viewA2 = r5.b.a(view, (i10 = r.f34857p))) != null) {
                                    i10 = r.f34858q;
                                    Guideline guideline = (Guideline) r5.b.a(view, i10);
                                    if (guideline != null) {
                                        i10 = r.f34859r;
                                        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = r.f34864w;
                                            TextView textView4 = (TextView) r5.b.a(view, i10);
                                            if (textView4 != null) {
                                                i10 = r.f34865x;
                                                TextView textView5 = (TextView) r5.b.a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = r.C;
                                                    ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                                                    if (progressBar != null) {
                                                        i10 = r.F;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                                        if (pi2NavigationBar != null) {
                                                            i10 = r.H;
                                                            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                                                            if (imageView2 != null) {
                                                                i10 = r.J;
                                                                Barrier barrier = (Barrier) r5.b.a(view, i10);
                                                                if (barrier != null) {
                                                                    i10 = r.K;
                                                                    FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                                                                    if (frameLayout2 != null) {
                                                                        i10 = r.L;
                                                                        PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                                                        if (previewView != null) {
                                                                            i10 = r.N;
                                                                            CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) r5.b.a(view, i10);
                                                                            if (circularProgressIndicator2 != null) {
                                                                                i10 = r.O;
                                                                                TextView textView6 = (TextView) r5.b.a(view, i10);
                                                                                if (textView6 != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                    i10 = r.R;
                                                                                    TextView textView7 = (TextView) r5.b.a(view, i10);
                                                                                    if (textView7 != null && (viewA3 = r5.b.a(view, (i10 = r.S))) != null) {
                                                                                        i10 = r.T;
                                                                                        SelfieOverlayView selfieOverlayView = (SelfieOverlayView) r5.b.a(view, i10);
                                                                                        if (selfieOverlayView != null) {
                                                                                            i10 = r.V;
                                                                                            SpotlightView spotlightView = (SpotlightView) r5.b.a(view, i10);
                                                                                            if (spotlightView != null) {
                                                                                                i10 = r.X;
                                                                                                Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                                                                                if (guideline2 != null) {
                                                                                                    i10 = r.f34838b0;
                                                                                                    TextView textView8 = (TextView) r5.b.a(view, i10);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = r.f34840c0;
                                                                                                        Space space2 = (Space) r5.b.a(view, i10);
                                                                                                        if (space2 != null) {
                                                                                                            i10 = r.f34842d0;
                                                                                                            ImageView imageView3 = (ImageView) r5.b.a(view, i10);
                                                                                                            if (imageView3 != null) {
                                                                                                                i10 = r.f34844e0;
                                                                                                                Space space3 = (Space) r5.b.a(view, i10);
                                                                                                                if (space3 != null) {
                                                                                                                    i10 = r.f34848g0;
                                                                                                                    TextView textView9 = (TextView) r5.b.a(view, i10);
                                                                                                                    if (textView9 != null) {
                                                                                                                        return new c(constraintLayout, textView, circularProgressIndicator, space, imageView, camera2PreviewView, viewA, textView2, textView3, viewA2, guideline, frameLayout, textView4, textView5, progressBar, pi2NavigationBar, imageView2, barrier, frameLayout2, previewView, circularProgressIndicator2, textView6, constraintLayout, textView7, viewA3, selfieOverlayView, spotlightView, guideline2, textView8, space2, imageView3, space3, textView9);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(s.f34875c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36954a;
    }
}
