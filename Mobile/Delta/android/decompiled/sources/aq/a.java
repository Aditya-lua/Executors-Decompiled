package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import yp.r;
import yp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3575a;

    @NonNull
    public final Button b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f3576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f3577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f3578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f3579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f3580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Barrier f3582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f3583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PreviewView f3584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final OldSelfieOverlayView f3585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f3586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f3587n;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull PreviewView previewView, @NonNull OldSelfieOverlayView oldSelfieOverlayView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f3575a = constraintLayout;
        this.b = button;
        this.f3576c = camera2PreviewView;
        this.f3577d = view;
        this.f3578e = textView;
        this.f3579f = textView2;
        this.f3580g = progressBar;
        this.f3581h = pi2NavigationBar;
        this.f3582i = barrier;
        this.f3583j = frameLayout;
        this.f3584k = previewView;
        this.f3585l = oldSelfieOverlayView;
        this.f3586m = textView3;
        this.f3587n = textView4;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = r.f36220h;
        Button button = (Button) r5.b.a(view, i10);
        if (button != null) {
            i10 = r.f36221i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
            if (camera2PreviewView != null && (viewA = r5.b.a(view, (i10 = r.f36222j))) != null) {
                i10 = r.f36227o;
                TextView textView = (TextView) r5.b.a(view, i10);
                if (textView != null) {
                    i10 = r.f36234v;
                    TextView textView2 = (TextView) r5.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = r.C;
                        ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                        if (progressBar != null) {
                            i10 = r.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = r.J;
                                Barrier barrier = (Barrier) r5.b.a(view, i10);
                                if (barrier != null) {
                                    i10 = r.K;
                                    FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                    if (frameLayout != null) {
                                        i10 = r.L;
                                        PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                        if (previewView != null) {
                                            i10 = r.U;
                                            OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) r5.b.a(view, i10);
                                            if (oldSelfieOverlayView != null) {
                                                i10 = r.f36209b0;
                                                TextView textView3 = (TextView) r5.b.a(view, i10);
                                                if (textView3 != null) {
                                                    i10 = r.f36219g0;
                                                    TextView textView4 = (TextView) r5.b.a(view, i10);
                                                    if (textView4 != null) {
                                                        return new a((ConstraintLayout) view, button, camera2PreviewView, viewA, textView, textView2, progressBar, pi2NavigationBar, barrier, frameLayout, previewView, oldSelfieOverlayView, textView3, textView4);
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(s.f36245a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3575a;
    }
}
