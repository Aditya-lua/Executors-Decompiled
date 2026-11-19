package oq;

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
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

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
    public final ConstraintLayout f28346a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f28347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f28348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f28349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f28350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f28351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f28352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f28353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f28354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Guideline f28355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f28357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f28358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ProgressBar f28359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f28361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final Barrier f28362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final PreviewView f28364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f28365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f28366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f28368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f28369y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final SelfieOverlayView f28370z;

    public c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull Space space, @NonNull ImageView imageView, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view2, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ImageView imageView2, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout2, @NonNull PreviewView previewView, @NonNull CircularProgressIndicator circularProgressIndicator2, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView7, @NonNull View view3, @NonNull SelfieOverlayView selfieOverlayView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull TextView textView8, @NonNull Space space2, @NonNull ImageView imageView3, @NonNull Space space3, @NonNull TextView textView9) {
        this.f28346a = constraintLayout;
        this.b = textView;
        this.f28347c = circularProgressIndicator;
        this.f28348d = space;
        this.f28349e = imageView;
        this.f28350f = camera2PreviewView;
        this.f28351g = view;
        this.f28352h = textView2;
        this.f28353i = textView3;
        this.f28354j = view2;
        this.f28355k = guideline;
        this.f28356l = frameLayout;
        this.f28357m = textView4;
        this.f28358n = textView5;
        this.f28359o = progressBar;
        this.f28360p = pi2NavigationBar;
        this.f28361q = imageView2;
        this.f28362r = barrier;
        this.f28363s = frameLayout2;
        this.f28364t = previewView;
        this.f28365u = circularProgressIndicator2;
        this.f28366v = textView6;
        this.f28367w = constraintLayout2;
        this.f28368x = textView7;
        this.f28369y = view3;
        this.f28370z = selfieOverlayView;
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
        int i10 = x.b;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = x.f24146c;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) s5.b.a(view, i10);
            if (circularProgressIndicator != null) {
                i10 = x.f24154g;
                Space space = (Space) s5.b.a(view, i10);
                if (space != null) {
                    i10 = x.f24156h;
                    ImageView imageView = (ImageView) s5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = x.f24157i;
                        Camera2PreviewView camera2PreviewView = (Camera2PreviewView) s5.b.a(view, i10);
                        if (camera2PreviewView != null && (viewA = s5.b.a(view, (i10 = x.f24158j))) != null) {
                            i10 = x.f24159k;
                            TextView textView2 = (TextView) s5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = x.f24163o;
                                TextView textView3 = (TextView) s5.b.a(view, i10);
                                if (textView3 != null && (viewA2 = s5.b.a(view, (i10 = x.f24164p))) != null) {
                                    i10 = x.f24165q;
                                    Guideline guideline = (Guideline) s5.b.a(view, i10);
                                    if (guideline != null) {
                                        i10 = x.f24166r;
                                        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = x.f24171w;
                                            TextView textView4 = (TextView) s5.b.a(view, i10);
                                            if (textView4 != null) {
                                                i10 = x.f24172x;
                                                TextView textView5 = (TextView) s5.b.a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = x.C;
                                                    ProgressBar progressBar = (ProgressBar) s5.b.a(view, i10);
                                                    if (progressBar != null) {
                                                        i10 = x.F;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                                                        if (pi2NavigationBar != null) {
                                                            i10 = x.H;
                                                            ImageView imageView2 = (ImageView) s5.b.a(view, i10);
                                                            if (imageView2 != null) {
                                                                i10 = x.J;
                                                                Barrier barrier = (Barrier) s5.b.a(view, i10);
                                                                if (barrier != null) {
                                                                    i10 = x.K;
                                                                    FrameLayout frameLayout2 = (FrameLayout) s5.b.a(view, i10);
                                                                    if (frameLayout2 != null) {
                                                                        i10 = x.L;
                                                                        PreviewView previewView = (PreviewView) s5.b.a(view, i10);
                                                                        if (previewView != null) {
                                                                            i10 = x.N;
                                                                            CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) s5.b.a(view, i10);
                                                                            if (circularProgressIndicator2 != null) {
                                                                                i10 = x.O;
                                                                                TextView textView6 = (TextView) s5.b.a(view, i10);
                                                                                if (textView6 != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                    i10 = x.R;
                                                                                    TextView textView7 = (TextView) s5.b.a(view, i10);
                                                                                    if (textView7 != null && (viewA3 = s5.b.a(view, (i10 = x.S))) != null) {
                                                                                        i10 = x.T;
                                                                                        SelfieOverlayView selfieOverlayView = (SelfieOverlayView) s5.b.a(view, i10);
                                                                                        if (selfieOverlayView != null) {
                                                                                            i10 = x.V;
                                                                                            SpotlightView spotlightView = (SpotlightView) s5.b.a(view, i10);
                                                                                            if (spotlightView != null) {
                                                                                                i10 = x.X;
                                                                                                Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                                                                                                if (guideline2 != null) {
                                                                                                    i10 = x.f24145b0;
                                                                                                    TextView textView8 = (TextView) s5.b.a(view, i10);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = x.f24147c0;
                                                                                                        Space space2 = (Space) s5.b.a(view, i10);
                                                                                                        if (space2 != null) {
                                                                                                            i10 = x.f24149d0;
                                                                                                            ImageView imageView3 = (ImageView) s5.b.a(view, i10);
                                                                                                            if (imageView3 != null) {
                                                                                                                i10 = x.f24151e0;
                                                                                                                Space space3 = (Space) s5.b.a(view, i10);
                                                                                                                if (space3 != null) {
                                                                                                                    i10 = x.f24155g0;
                                                                                                                    TextView textView9 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(y.f24185c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28346a;
    }
}
