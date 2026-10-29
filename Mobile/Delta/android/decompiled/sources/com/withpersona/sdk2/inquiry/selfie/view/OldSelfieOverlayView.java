package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import f7.i;
import f7.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq.j;
import jq.z;
import jt.h;
import jt.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yp.q;
import yp.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001_B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\f*\u00020$2\b\b\u0001\u0010%\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\f*\u00020$2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020,*\u00020\n2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020,*\u00020\n2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010.J\u001d\u00103\u001a\u00020\f*\u0002002\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010CR$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010R\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR \u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0018\u0010^\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "previewView", "", "setPreviewView", "(Landroid/view/View;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "W", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "viewState", "", "showProgress", "Lkotlin/Function0;", "onAnimationEnd", "e0", "(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a0", "()Z", "onComplete", "X", "(Lkotlin/jvm/functions/Function0;)V", "Laq/b;", "rawRes", "i0", "(Laq/b;ILkotlin/jvm/functions/Function0;)V", "b0", "(Laq/b;Lkotlin/jvm/functions/Function0;)V", "", "duration", "Landroid/view/ViewPropertyAnimator;", "R", "(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;", "U", "Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "drawable", "n0", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V", "p0", "(Landroid/content/Context;)Z", "z", "Laq/b;", "binding", "A", "Ljt/h;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft", "B", "getDrawableRight", "drawableRight", "C", "I", "leftPoseAnimation", "D", "rightPoseAnimation", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "setLeftPoseImage", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "leftPoseImage", "F", "getRightPoseImage", "setRightPoseImage", "rightPoseImage", "G", "Landroid/view/View;", "", "H", "Ljava/util/List;", "oneShotOnCompositionLoadedListeners", "oneShotOnAnimationCompleteListeners", "J", "remoteImageView", "K", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "currentViewState", "b", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OldSelfieOverlayView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final h drawableLeft;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final h drawableRight;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int leftPoseAnimation;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final int rightPoseAnimation;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public RemoteImage leftPoseImage;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public RemoteImage rightPoseImage;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public View previewView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final List<Function0<Unit>> oneShotOnCompositionLoadedListeners;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final List<Function0<Unit>> oneShotOnAnimationCompleteListeners;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public View remoteImageView;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public b currentViewState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.b binding;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            List listM0 = CollectionsKt.M0(OldSelfieOverlayView.this.oneShotOnAnimationCompleteListeners);
            OldSelfieOverlayView.this.oneShotOnAnimationCompleteListeners.clear();
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        CLEAR,
        CENTER,
        CENTER_COMPLETE,
        LOOK_LEFT_HINT,
        LOOK_LEFT,
        LOOK_LEFT_COMPLETE,
        LOOK_RIGHT_HINT,
        LOOK_RIGHT,
        LOOK_RIGHT_COMPLETE,
        LOOK_UP_HINT,
        LOOK_UP,
        LOOK_UP_COMPLETE,
        LOOK_DOWN_HINT,
        LOOK_DOWN,
        LOOK_DOWN_COMPLETE,
        FINALIZING,
        COMPLETE_WITH_CAPTURE,
        COMPLETE;


        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ qt.a f13093t = qt.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13094a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.FINALIZING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.COMPLETE_WITH_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.LOOK_UP_HINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.LOOK_UP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[b.LOOK_UP_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[b.LOOK_DOWN_HINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[b.LOOK_DOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[b.LOOK_DOWN_COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f13094a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void I(OldSelfieOverlayView oldSelfieOverlayView, i iVar) {
        List listM0 = CollectionsKt.M0(oldSelfieOverlayView.oneShotOnCompositionLoadedListeners);
        oldSelfieOverlayView.oneShotOnCompositionLoadedListeners.clear();
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public static /* synthetic */ ViewPropertyAnimator S(OldSelfieOverlayView oldSelfieOverlayView, View view, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 200;
        }
        return oldSelfieOverlayView.R(view, j10);
    }

    public static final void T(View view) {
        view.setVisibility(4);
    }

    public static /* synthetic */ ViewPropertyAnimator V(OldSelfieOverlayView oldSelfieOverlayView, View view, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 200;
        }
        return oldSelfieOverlayView.U(view, j10);
    }

    public static final Drawable Y(Context context) {
        Integer numF = z.f(context, vp.a.f33356q, null, false, 6, null);
        return numF != null ? l2.b.f(context, numF.intValue()) : l2.b.f(context, q.f36199c);
    }

    public static final Drawable Z(Context context) {
        Integer numF = z.f(context, vp.a.f33358s, null, false, 6, null);
        return numF != null ? l2.b.f(context, numF.intValue()) : l2.b.f(context, q.f36200d);
    }

    public static final void c0(OldSelfieOverlayView oldSelfieOverlayView, aq.b bVar, final Function0 function0) {
        View blindsView = bVar.b;
        Intrinsics.checkNotNullExpressionValue(blindsView, "blindsView");
        oldSelfieOverlayView.R(blindsView, 80L).withEndAction(new Runnable() { // from class: iq.l
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.d0(function0);
            }
        });
    }

    public static final void d0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f0(OldSelfieOverlayView oldSelfieOverlayView, b bVar, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        oldSelfieOverlayView.e0(bVar, z10, function0);
    }

    public static final Unit g0(OldSelfieOverlayView oldSelfieOverlayView, Function0 function0) {
        oldSelfieOverlayView.i0(oldSelfieOverlayView.binding, t.f36264d, function0);
        return Unit.f22483a;
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.drawableLeft.getValue();
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.drawableRight.getValue();
    }

    public static final Unit h0(OldSelfieOverlayView oldSelfieOverlayView, Function0 function0) {
        oldSelfieOverlayView.i0(oldSelfieOverlayView.binding, t.f36264d, function0);
        return Unit.f22483a;
    }

    public static final Unit j0(final aq.b bVar, final OldSelfieOverlayView oldSelfieOverlayView, final Function0 function0) {
        bVar.f3590d.setFrame(0);
        ThemeableLottieAnimationView hintAnimation = bVar.f3590d;
        Intrinsics.checkNotNullExpressionValue(hintAnimation, "hintAnimation");
        V(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: iq.b
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.k0(this.f20820a, bVar, function0);
            }
        });
        View hintOverlayView = bVar.f3592f;
        Intrinsics.checkNotNullExpressionValue(hintOverlayView, "hintOverlayView");
        V(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return Unit.f22483a;
    }

    public static final void k0(final OldSelfieOverlayView oldSelfieOverlayView, final aq.b bVar, final Function0 function0) {
        oldSelfieOverlayView.oneShotOnAnimationCompleteListeners.add(new Function0() { // from class: iq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.l0(this.f20822a, bVar, function0);
            }
        });
        bVar.f3590d.v();
    }

    public static final Unit l0(OldSelfieOverlayView oldSelfieOverlayView, aq.b bVar, final Function0 function0) {
        ThemeableLottieAnimationView hintAnimation = bVar.f3590d;
        Intrinsics.checkNotNullExpressionValue(hintAnimation, "hintAnimation");
        S(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: iq.d
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.m0(function0);
            }
        });
        View hintOverlayView = bVar.f3592f;
        Intrinsics.checkNotNullExpressionValue(hintOverlayView, "hintOverlayView");
        S(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return Unit.f22483a;
    }

    public static final void m0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void o0(ImageView imageView) {
        imageView.setImageDrawable(null);
    }

    public final ViewPropertyAnimator R(final View view, long j10) {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(0.0f).setDuration(j10).withEndAction(new Runnable() { // from class: iq.m
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.T(view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    public final ViewPropertyAnimator U(View view, long j10) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j10);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    public final void W(@NotNull StepStyles.SelfieStepStyle styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer selfieCaptureFeedBoxBorderColorValue = styles.getSelfieCaptureFeedBoxBorderColorValue();
        if (selfieCaptureFeedBoxBorderColorValue != null) {
            this.binding.f3594h.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
        }
        Double selfieCaptureFeedBoxBorderWidthValue = styles.getSelfieCaptureFeedBoxBorderWidthValue();
        if (selfieCaptureFeedBoxBorderWidthValue != null) {
            this.binding.f3594h.setStrokeWidth((float) j.a(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
        }
        Integer selfieCaptureIconStrokeColor = styles.getSelfieCaptureIconStrokeColor();
        if (selfieCaptureIconStrokeColor != null) {
            int iIntValue = selfieCaptureIconStrokeColor.intValue();
            this.binding.f3590d.F(Color.parseColor("#022050"), iIntValue);
            this.binding.f3590d.F(Color.parseColor("#280087"), iIntValue);
        }
        Integer captureCompleteIconStrokeColor = styles.getCaptureCompleteIconStrokeColor();
        if (captureCompleteIconStrokeColor != null) {
            this.binding.f3590d.F(Color.parseColor("#3BC170"), captureCompleteIconStrokeColor.intValue());
        }
        Integer selfieCaptureIconFillColor = styles.getSelfieCaptureIconFillColor();
        if (selfieCaptureIconFillColor != null) {
            int iIntValue2 = selfieCaptureIconFillColor.intValue();
            this.binding.f3590d.F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f3590d.F(Color.parseColor("#8552FF"), iIntValue2);
        }
        Integer selfieCaptureIconBackgroundFillColor = styles.getSelfieCaptureIconBackgroundFillColor();
        if (selfieCaptureIconBackgroundFillColor != null) {
            this.binding.f3590d.F(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
        }
    }

    public final void X(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Pi2CircleMaskView.e(this.binding.f3589c, false, onComplete, 1, null);
    }

    public final boolean a0() {
        return this.binding.f3589c.g();
    }

    public final void b0(final aq.b bVar, final Function0<Unit> function0) {
        View blindsView = bVar.b;
        Intrinsics.checkNotNullExpressionValue(blindsView, "blindsView");
        U(blindsView, 80L).withEndAction(new Runnable() { // from class: iq.k
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.c0(this.f20832a, bVar, function0);
            }
        });
    }

    public final void e0(@NotNull b viewState, boolean showProgress, @Nullable final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (this.currentViewState == viewState) {
            return;
        }
        this.currentViewState = viewState;
        removeView(this.remoteImageView);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zP0 = p0(context);
        aq.b bVar = this.binding;
        if (showProgress) {
            bVar.f3594h.setVisibility(0);
        } else {
            bVar.f3594h.setVisibility(8);
        }
        switch (c.f13094a[viewState.ordinal()]) {
            case 1:
                bVar.f3589c.h();
                bVar.f3594h.f(0.0f, onAnimationEnd);
                return;
            case 2:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                bVar.f3594h.f(0.0f, onAnimationEnd);
                return;
            case 3:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                Pi2ProgressArcView.g(bVar.f3594h, 0.0f, null, 2, null);
                b0(this.binding, onAnimationEnd);
                return;
            case 4:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                Pi2ProgressArcView.g(bVar.f3594h, 0.0f, null, 2, null);
                if (zP0) {
                    i0(this.binding, this.leftPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 5:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                bVar.f3594h.f(0.0f, onAnimationEnd);
                if (zP0) {
                    return;
                }
                RemoteImage remoteImage = this.leftPoseImage;
                if (remoteImage != null) {
                    this.remoteImageView = lr.c.e(remoteImage, this, true);
                    return;
                }
                bVar.f3593g.setVisibility(0);
                ImageView hintImage = bVar.f3591e;
                Intrinsics.checkNotNullExpressionValue(hintImage, "hintImage");
                n0(hintImage, getDrawableLeft());
                return;
            case 6:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                Pi2ProgressArcView.g(bVar.f3594h, 50.0f, null, 2, null);
                b0(this.binding, onAnimationEnd);
                return;
            case 7:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                Pi2ProgressArcView.g(bVar.f3594h, 50.0f, null, 2, null);
                if (zP0) {
                    i0(this.binding, this.rightPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 8:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                bVar.f3594h.f(50.0f, onAnimationEnd);
                if (zP0) {
                    return;
                }
                RemoteImage remoteImage2 = this.rightPoseImage;
                if (remoteImage2 != null) {
                    this.remoteImageView = lr.c.e(remoteImage2, this, true);
                    return;
                }
                bVar.f3593g.setVisibility(0);
                ImageView hintImage2 = bVar.f3591e;
                Intrinsics.checkNotNullExpressionValue(hintImage2, "hintImage");
                n0(hintImage2, getDrawableRight());
                return;
            case 9:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                Pi2ProgressArcView.g(bVar.f3594h, 100.0f, null, 2, null);
                b0(this.binding, onAnimationEnd);
                return;
            case 10:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                bVar.f3594h.e();
                return;
            case 11:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                Pi2ProgressArcView.g(bVar.f3594h, 100.0f, null, 2, null);
                b0(this.binding, new Function0() { // from class: iq.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldSelfieOverlayView.g0(this.f20827a, onAnimationEnd);
                    }
                });
                return;
            case 12:
                Pi2CircleMaskView.e(bVar.f3589c, false, null, 3, null);
                bVar.f3594h.f(100.0f, new Function0() { // from class: iq.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldSelfieOverlayView.h0(this.f20828a, onAnimationEnd);
                    }
                });
                return;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                throw new IllegalStateException("Up or down pose is not supported in legacy Selfie flow.");
            default:
                throw new l();
        }
    }

    @Nullable
    public final RemoteImage getLeftPoseImage() {
        return this.leftPoseImage;
    }

    @Nullable
    public final RemoteImage getRightPoseImage() {
        return this.rightPoseImage;
    }

    public final void i0(final aq.b bVar, int i10, final Function0<Unit> function0) {
        this.oneShotOnCompositionLoadedListeners.add(new Function0() { // from class: iq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.j0(bVar, this, function0);
            }
        });
        bVar.f3590d.setAnimation(i10);
    }

    public final void n0(final ImageView imageView, Drawable drawable) {
        if (Intrinsics.c(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            S(this, imageView, 0L, 1, null).withEndAction(new Runnable() { // from class: iq.j
                @Override // java.lang.Runnable
                public final void run() {
                    OldSelfieOverlayView.o0(imageView);
                }
            });
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(0.0f);
        V(this, imageView, 0L, 1, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        return false;
    }

    public final boolean p0(Context context) {
        return (z.f(context, vp.a.f33356q, null, false, 6, null) == null || z.f(context, vp.a.f33358s, null, false, 6, null) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
    }

    public final void setLeftPoseImage(@Nullable RemoteImage remoteImage) {
        this.leftPoseImage = remoteImage;
    }

    public final void setPreviewView(@NotNull View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    public final void setRightPoseImage(@Nullable RemoteImage remoteImage) {
        this.rightPoseImage = remoteImage;
    }

    public /* synthetic */ OldSelfieOverlayView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        aq.b bVarB = aq.b.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(bVarB, "inflate(...)");
        this.binding = bVarB;
        this.drawableLeft = jt.i.b(new Function0() { // from class: iq.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.Y(context);
            }
        });
        this.drawableRight = jt.i.b(new Function0() { // from class: iq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.Z(context);
            }
        });
        int i11 = vp.a.f33357r;
        Integer numF = z.f(context, i11, null, false, 6, null);
        this.leftPoseAnimation = numF != null ? numF.intValue() : t.f36265e;
        Integer numF2 = z.f(context, i11, null, false, 6, null);
        this.rightPoseAnimation = numF2 != null ? numF2.intValue() : t.f36267g;
        this.oneShotOnCompositionLoadedListeners = new ArrayList();
        this.oneShotOnAnimationCompleteListeners = new ArrayList();
        ThemeableLottieAnimationView themeableLottieAnimationView = bVarB.f3590d;
        themeableLottieAnimationView.j(new n0() { // from class: iq.f
            @Override // f7.n0
            public final void a(f7.i iVar) {
                OldSelfieOverlayView.I(this.f20826a, iVar);
            }
        });
        themeableLottieAnimationView.i(new a());
        int color = Color.parseColor("#022050");
        Context context2 = bVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i12 = hc.b.f18788m;
        themeableLottieAnimationView.F(color, z.d(context2, i12, null, false, 6, null));
        int color2 = Color.parseColor("#AA85FF");
        Context context3 = bVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int i13 = hc.b.f18789n;
        themeableLottieAnimationView.F(color2, z.d(context3, i13, null, false, 6, null));
        int color3 = Color.parseColor("#280087");
        Context context4 = bVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        themeableLottieAnimationView.F(color3, z.d(context4, i12, null, false, 6, null));
        int color4 = Color.parseColor("#8552FF");
        Context context5 = bVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        themeableLottieAnimationView.F(color4, z.d(context5, i13, null, false, 6, null));
        Context context6 = bVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int iD = z.d(context6, i13, null, false, 6, null);
        Context context7 = bVarB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        themeableLottieAnimationView.F(Color.parseColor("#DBCCFF"), androidx.core.graphics.c.c(iD, z.d(context7, hc.b.f18790o, null, false, 6, null), 0.66f));
    }
}
