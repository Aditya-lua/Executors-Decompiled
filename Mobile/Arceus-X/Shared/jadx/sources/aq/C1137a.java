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
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1137a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4669a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f4670b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Camera2PreviewView f4671c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f4672d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f4673e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f4674f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ProgressBar f4675g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Pi2NavigationBar f4676h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Barrier f4677i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f4678j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final PreviewView f4679k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final OldSelfieOverlayView f4680l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f4681m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f4682n;

    public C1137a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull PreviewView previewView, @NonNull OldSelfieOverlayView oldSelfieOverlayView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f4669a = constraintLayout;
        this.f4670b = button;
        this.f4671c = camera2PreviewView;
        this.f4672d = view;
        this.f4673e = textView;
        this.f4674f = textView2;
        this.f4675g = progressBar;
        this.f4676h = pi2NavigationBar;
        this.f4677i = barrier;
        this.f4678j = frameLayout;
        this.f4679k = previewView;
        this.f4680l = oldSelfieOverlayView;
        this.f4681m = textView3;
        this.f4682n = textView4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1137a m6461a(@NonNull View view) {
        View viewM41116a;
        int i10 = C13388r.f46920h;
        Button button = (Button) C10785b.m41116a(view, i10);
        if (button != null) {
            i10 = C13388r.f46921i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) C10785b.m41116a(view, i10);
            if (camera2PreviewView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C13388r.f46922j))) != null) {
                i10 = C13388r.f46927o;
                TextView textView = (TextView) C10785b.m41116a(view, i10);
                if (textView != null) {
                    i10 = C13388r.f46934v;
                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                    if (textView2 != null) {
                        i10 = C13388r.f46882C;
                        ProgressBar progressBar = (ProgressBar) C10785b.m41116a(view, i10);
                        if (progressBar != null) {
                            i10 = C13388r.f46885F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = C13388r.f46889J;
                                Barrier barrier = (Barrier) C10785b.m41116a(view, i10);
                                if (barrier != null) {
                                    i10 = C13388r.f46890K;
                                    FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
                                    if (frameLayout != null) {
                                        i10 = C13388r.f46891L;
                                        PreviewView previewView = (PreviewView) C10785b.m41116a(view, i10);
                                        if (previewView != null) {
                                            i10 = C13388r.f46900U;
                                            OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) C10785b.m41116a(view, i10);
                                            if (oldSelfieOverlayView != null) {
                                                i10 = C13388r.f46909b0;
                                                TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                                if (textView3 != null) {
                                                    i10 = C13388r.f46919g0;
                                                    TextView textView4 = (TextView) C10785b.m41116a(view, i10);
                                                    if (textView4 != null) {
                                                        return new C1137a((ConstraintLayout) view, button, camera2PreviewView, viewM41116a, textView, textView2, progressBar, pi2NavigationBar, barrier, frameLayout, previewView, oldSelfieOverlayView, textView3, textView4);
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
    public static C1137a m6462c(@NonNull LayoutInflater layoutInflater) {
        return m6463d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C1137a m6463d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46950a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6461a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4669a;
    }
}
