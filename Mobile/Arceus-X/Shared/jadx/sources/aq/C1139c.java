package aq;

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
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p055ui.SpotlightView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1139c implements InterfaceC10784a {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final SpotlightView f4691A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final Guideline f4692B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final TextView f4693C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final Space f4694D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public final ImageView f4695E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public final Space f4696F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public final TextView f4697G;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4698a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f4699b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CircularProgressIndicator f4700c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Space f4701d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4702e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Camera2PreviewView f4703f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f4704g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f4705h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f4706i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f4707j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final Guideline f4708k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f4709l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f4710m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f4711n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ProgressBar f4712o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final Pi2NavigationBar f4713p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ImageView f4714q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final Barrier f4715r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final FrameLayout f4716s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final PreviewView f4717t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final CircularProgressIndicator f4718u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final TextView f4719v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ConstraintLayout f4720w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final TextView f4721x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final View f4722y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final SelfieOverlayView f4723z;

    public C1139c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull Space space, @NonNull ImageView imageView, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view2, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ImageView imageView2, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout2, @NonNull PreviewView previewView, @NonNull CircularProgressIndicator circularProgressIndicator2, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView7, @NonNull View view3, @NonNull SelfieOverlayView selfieOverlayView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull TextView textView8, @NonNull Space space2, @NonNull ImageView imageView3, @NonNull Space space3, @NonNull TextView textView9) {
        this.f4698a = constraintLayout;
        this.f4699b = textView;
        this.f4700c = circularProgressIndicator;
        this.f4701d = space;
        this.f4702e = imageView;
        this.f4703f = camera2PreviewView;
        this.f4704g = view;
        this.f4705h = textView2;
        this.f4706i = textView3;
        this.f4707j = view2;
        this.f4708k = guideline;
        this.f4709l = frameLayout;
        this.f4710m = textView4;
        this.f4711n = textView5;
        this.f4712o = progressBar;
        this.f4713p = pi2NavigationBar;
        this.f4714q = imageView2;
        this.f4715r = barrier;
        this.f4716s = frameLayout2;
        this.f4717t = previewView;
        this.f4718u = circularProgressIndicator2;
        this.f4719v = textView6;
        this.f4720w = constraintLayout2;
        this.f4721x = textView7;
        this.f4722y = view3;
        this.f4723z = selfieOverlayView;
        this.f4691A = spotlightView;
        this.f4692B = guideline2;
        this.f4693C = textView8;
        this.f4694D = space2;
        this.f4695E = imageView3;
        this.f4696F = space3;
        this.f4697G = textView9;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1139c m6467a(@NonNull View view) {
        View viewM41116a;
        View viewM41116a2;
        View viewM41116a3;
        int i10 = C13388r.f46908b;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C13388r.f46910c;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C10785b.m41116a(view, i10);
            if (circularProgressIndicator != null) {
                i10 = C13388r.f46918g;
                Space space = (Space) C10785b.m41116a(view, i10);
                if (space != null) {
                    i10 = C13388r.f46920h;
                    ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                    if (imageView != null) {
                        i10 = C13388r.f46921i;
                        Camera2PreviewView camera2PreviewView = (Camera2PreviewView) C10785b.m41116a(view, i10);
                        if (camera2PreviewView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C13388r.f46922j))) != null) {
                            i10 = C13388r.f46923k;
                            TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                            if (textView2 != null) {
                                i10 = C13388r.f46927o;
                                TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                if (textView3 != null && (viewM41116a2 = C10785b.m41116a(view, (i10 = C13388r.f46928p))) != null) {
                                    i10 = C13388r.f46929q;
                                    Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
                                    if (guideline != null) {
                                        i10 = C13388r.f46930r;
                                        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = C13388r.f46935w;
                                            TextView textView4 = (TextView) C10785b.m41116a(view, i10);
                                            if (textView4 != null) {
                                                i10 = C13388r.f46936x;
                                                TextView textView5 = (TextView) C10785b.m41116a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = C13388r.f46882C;
                                                    ProgressBar progressBar = (ProgressBar) C10785b.m41116a(view, i10);
                                                    if (progressBar != null) {
                                                        i10 = C13388r.f46885F;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                                                        if (pi2NavigationBar != null) {
                                                            i10 = C13388r.f46887H;
                                                            ImageView imageView2 = (ImageView) C10785b.m41116a(view, i10);
                                                            if (imageView2 != null) {
                                                                i10 = C13388r.f46889J;
                                                                Barrier barrier = (Barrier) C10785b.m41116a(view, i10);
                                                                if (barrier != null) {
                                                                    i10 = C13388r.f46890K;
                                                                    FrameLayout frameLayout2 = (FrameLayout) C10785b.m41116a(view, i10);
                                                                    if (frameLayout2 != null) {
                                                                        i10 = C13388r.f46891L;
                                                                        PreviewView previewView = (PreviewView) C10785b.m41116a(view, i10);
                                                                        if (previewView != null) {
                                                                            i10 = C13388r.f46893N;
                                                                            CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) C10785b.m41116a(view, i10);
                                                                            if (circularProgressIndicator2 != null) {
                                                                                i10 = C13388r.f46894O;
                                                                                TextView textView6 = (TextView) C10785b.m41116a(view, i10);
                                                                                if (textView6 != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                    i10 = C13388r.f46897R;
                                                                                    TextView textView7 = (TextView) C10785b.m41116a(view, i10);
                                                                                    if (textView7 != null && (viewM41116a3 = C10785b.m41116a(view, (i10 = C13388r.f46898S))) != null) {
                                                                                        i10 = C13388r.f46899T;
                                                                                        SelfieOverlayView selfieOverlayView = (SelfieOverlayView) C10785b.m41116a(view, i10);
                                                                                        if (selfieOverlayView != null) {
                                                                                            i10 = C13388r.f46901V;
                                                                                            SpotlightView spotlightView = (SpotlightView) C10785b.m41116a(view, i10);
                                                                                            if (spotlightView != null) {
                                                                                                i10 = C13388r.f46903X;
                                                                                                Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                                                                                                if (guideline2 != null) {
                                                                                                    i10 = C13388r.f46909b0;
                                                                                                    TextView textView8 = (TextView) C10785b.m41116a(view, i10);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = C13388r.f46911c0;
                                                                                                        Space space2 = (Space) C10785b.m41116a(view, i10);
                                                                                                        if (space2 != null) {
                                                                                                            i10 = C13388r.f46913d0;
                                                                                                            ImageView imageView3 = (ImageView) C10785b.m41116a(view, i10);
                                                                                                            if (imageView3 != null) {
                                                                                                                i10 = C13388r.f46915e0;
                                                                                                                Space space3 = (Space) C10785b.m41116a(view, i10);
                                                                                                                if (space3 != null) {
                                                                                                                    i10 = C13388r.f46919g0;
                                                                                                                    TextView textView9 = (TextView) C10785b.m41116a(view, i10);
                                                                                                                    if (textView9 != null) {
                                                                                                                        return new C1139c(constraintLayout, textView, circularProgressIndicator, space, imageView, camera2PreviewView, viewM41116a, textView2, textView3, viewM41116a2, guideline, frameLayout, textView4, textView5, progressBar, pi2NavigationBar, imageView2, barrier, frameLayout2, previewView, circularProgressIndicator2, textView6, constraintLayout, textView7, viewM41116a3, selfieOverlayView, spotlightView, guideline2, textView8, space2, imageView3, space3, textView9);
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
    public static C1139c m6468c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46952c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6467a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4698a;
    }
}
