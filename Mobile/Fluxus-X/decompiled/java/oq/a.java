package oq;

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
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28326a;

    @NonNull
    public final Button b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f28327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f28328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f28329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f28330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f28331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Barrier f28333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PreviewView f28335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final OldSelfieOverlayView f28336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f28337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f28338n;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull PreviewView previewView, @NonNull OldSelfieOverlayView oldSelfieOverlayView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f28326a = constraintLayout;
        this.b = button;
        this.f28327c = camera2PreviewView;
        this.f28328d = view;
        this.f28329e = textView;
        this.f28330f = textView2;
        this.f28331g = progressBar;
        this.f28332h = pi2NavigationBar;
        this.f28333i = barrier;
        this.f28334j = frameLayout;
        this.f28335k = previewView;
        this.f28336l = oldSelfieOverlayView;
        this.f28337m = textView3;
        this.f28338n = textView4;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = x.f24156h;
        Button button = (Button) s5.b.a(view, i10);
        if (button != null) {
            i10 = x.f24157i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) s5.b.a(view, i10);
            if (camera2PreviewView != null && (viewA = s5.b.a(view, (i10 = x.f24158j))) != null) {
                i10 = x.f24163o;
                TextView textView = (TextView) s5.b.a(view, i10);
                if (textView != null) {
                    i10 = x.f24170v;
                    TextView textView2 = (TextView) s5.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = x.C;
                        ProgressBar progressBar = (ProgressBar) s5.b.a(view, i10);
                        if (progressBar != null) {
                            i10 = x.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = x.J;
                                Barrier barrier = (Barrier) s5.b.a(view, i10);
                                if (barrier != null) {
                                    i10 = x.K;
                                    FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
                                    if (frameLayout != null) {
                                        i10 = x.L;
                                        PreviewView previewView = (PreviewView) s5.b.a(view, i10);
                                        if (previewView != null) {
                                            i10 = x.U;
                                            OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) s5.b.a(view, i10);
                                            if (oldSelfieOverlayView != null) {
                                                i10 = x.f24145b0;
                                                TextView textView3 = (TextView) s5.b.a(view, i10);
                                                if (textView3 != null) {
                                                    i10 = x.f24155g0;
                                                    TextView textView4 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(y.f24184a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28326a;
    }
}
