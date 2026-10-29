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
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.C0546c;
import aq.C1138b;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lr.C8243c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p121f7.C5452i;
import p121f7.InterfaceC5463n0;
import p194ic.C6738b;
import p226jq.C7265j;
import p226jq.C7288z;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.InterfaceC7341h;
import p261l2.C7975b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p497vp.C12238a;
import p584yp.C13382q;
import p584yp.C13400t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001_B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\f*\u00020$2\b\b\u0001\u0010%\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\f*\u00020$2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020,*\u00020\n2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020,*\u00020\n2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010.J\u001d\u00103\u001a\u00020\f*\u0002002\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010CR$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010R\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR \u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0018\u0010^\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006`"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "previewView", "", "setPreviewView", "(Landroid/view/View;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "W", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "viewState", "", "showProgress", "Lkotlin/Function0;", "onAnimationEnd", "e0", "(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a0", "()Z", "onComplete", "X", "(Lkotlin/jvm/functions/Function0;)V", "Laq/b;", "rawRes", "i0", "(Laq/b;ILkotlin/jvm/functions/Function0;)V", "b0", "(Laq/b;Lkotlin/jvm/functions/Function0;)V", "", "duration", "Landroid/view/ViewPropertyAnimator;", "R", "(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;", "U", "Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "drawable", "n0", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V", "p0", "(Landroid/content/Context;)Z", "z", "Laq/b;", "binding", "A", "Ljt/h;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft", "B", "getDrawableRight", "drawableRight", "C", "I", "leftPoseAnimation", "D", "rightPoseAnimation", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "setLeftPoseImage", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "leftPoseImage", "F", "getRightPoseImage", "setRightPoseImage", "rightPoseImage", "G", "Landroid/view/View;", "", "H", "Ljava/util/List;", "oneShotOnCompositionLoadedListeners", "oneShotOnAnimationCompleteListeners", "J", "remoteImageView", "K", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "currentViewState", "b", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class OldSelfieOverlayView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h drawableLeft;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h drawableRight;

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
    public EnumC3986b currentViewState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final C1138b binding;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3985a extends AnimatorListenerAdapter {
        public C3985a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            List listM0 = CollectionsKt.m31687M0(OldSelfieOverlayView.this.oneShotOnAnimationCompleteListeners);
            OldSelfieOverlayView.this.oneShotOnAnimationCompleteListeners.clear();
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3986b {
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


        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC10707a f16788t = C10708b.m40805a(m20306a());
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3987c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16789a;

        static {
            int[] iArr = new int[EnumC3986b.values().length];
            try {
                iArr[EnumC3986b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3986b.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3986b.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3986b.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3986b.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3986b.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3986b.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3986b.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3986b.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3986b.FINALIZING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC3986b.COMPLETE_WITH_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC3986b.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC3986b.LOOK_UP_HINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC3986b.LOOK_UP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC3986b.LOOK_UP_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC3986b.LOOK_DOWN_HINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC3986b.LOOK_DOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC3986b.LOOK_DOWN_COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f16789a = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: I */
    public static void m20272I(OldSelfieOverlayView oldSelfieOverlayView, C5452i c5452i) {
        List listM0 = CollectionsKt.m31687M0(oldSelfieOverlayView.oneShotOnCompositionLoadedListeners);
        oldSelfieOverlayView.oneShotOnCompositionLoadedListeners.clear();
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ ViewPropertyAnimator m20281S(OldSelfieOverlayView oldSelfieOverlayView, View view, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 200;
        }
        return oldSelfieOverlayView.m20296R(view, j10);
    }

    /* JADX INFO: renamed from: T */
    public static final void m20282T(View view) {
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ ViewPropertyAnimator m20283V(OldSelfieOverlayView oldSelfieOverlayView, View view, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 200;
        }
        return oldSelfieOverlayView.m20297U(view, j10);
    }

    /* JADX INFO: renamed from: Y */
    public static final Drawable m20284Y(Context context) {
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43184q, null, false, 6, null);
        return numM30330f != null ? C7975b.m33008f(context, numM30330f.intValue()) : C7975b.m33008f(context, C13382q.f46869c);
    }

    /* JADX INFO: renamed from: Z */
    public static final Drawable m20285Z(Context context) {
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43186s, null, false, 6, null);
        return numM30330f != null ? C7975b.m33008f(context, numM30330f.intValue()) : C7975b.m33008f(context, C13382q.f46870d);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m20286c0(OldSelfieOverlayView oldSelfieOverlayView, C1138b c1138b, final Function0 function0) {
        View blindsView = c1138b.f4684b;
        Intrinsics.checkNotNullExpressionValue(blindsView, "blindsView");
        oldSelfieOverlayView.m20296R(blindsView, 80L).withEndAction(new Runnable() { // from class: iq.l
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.m20287d0(function0);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m20287d0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m20288f0(OldSelfieOverlayView oldSelfieOverlayView, EnumC3986b enumC3986b, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        oldSelfieOverlayView.m20302e0(enumC3986b, z10, function0);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m20289g0(OldSelfieOverlayView oldSelfieOverlayView, Function0 function0) {
        oldSelfieOverlayView.m20303i0(oldSelfieOverlayView.binding, C13400t.f46976d, function0);
        return Unit.f29331a;
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.drawableLeft.getValue();
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.drawableRight.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m20290h0(OldSelfieOverlayView oldSelfieOverlayView, Function0 function0) {
        oldSelfieOverlayView.m20303i0(oldSelfieOverlayView.binding, C13400t.f46976d, function0);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m20291j0(final C1138b c1138b, final OldSelfieOverlayView oldSelfieOverlayView, final Function0 function0) {
        c1138b.f4686d.setFrame(0);
        ThemeableLottieAnimationView hintAnimation = c1138b.f4686d;
        Intrinsics.checkNotNullExpressionValue(hintAnimation, "hintAnimation");
        m20283V(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: iq.b
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.m20292k0(this.f27193a, c1138b, function0);
            }
        });
        View hintOverlayView = c1138b.f4688f;
        Intrinsics.checkNotNullExpressionValue(hintOverlayView, "hintOverlayView");
        m20283V(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m20292k0(final OldSelfieOverlayView oldSelfieOverlayView, final C1138b c1138b, final Function0 function0) {
        oldSelfieOverlayView.oneShotOnAnimationCompleteListeners.add(new Function0() { // from class: iq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.m20293l0(this.f27196a, c1138b, function0);
            }
        });
        c1138b.f4686d.m8434v();
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m20293l0(OldSelfieOverlayView oldSelfieOverlayView, C1138b c1138b, final Function0 function0) {
        ThemeableLottieAnimationView hintAnimation = c1138b.f4686d;
        Intrinsics.checkNotNullExpressionValue(hintAnimation, "hintAnimation");
        m20281S(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: iq.d
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.m20294m0(function0);
            }
        });
        View hintOverlayView = c1138b.f4688f;
        Intrinsics.checkNotNullExpressionValue(hintOverlayView, "hintOverlayView");
        m20281S(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m20294m0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m20295o0(ImageView imageView) {
        imageView.setImageDrawable(null);
    }

    /* JADX INFO: renamed from: R */
    public final ViewPropertyAnimator m20296R(final View view, long j10) {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(0.0f).setDuration(j10).withEndAction(new Runnable() { // from class: iq.m
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.m20282T(view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    /* JADX INFO: renamed from: U */
    public final ViewPropertyAnimator m20297U(View view, long j10) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j10);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    /* JADX INFO: renamed from: W */
    public final void m20298W(@NotNull StepStyles.SelfieStepStyle styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer selfieCaptureFeedBoxBorderColorValue = styles.getSelfieCaptureFeedBoxBorderColorValue();
        if (selfieCaptureFeedBoxBorderColorValue != null) {
            this.binding.f4690h.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
        }
        Double selfieCaptureFeedBoxBorderWidthValue = styles.getSelfieCaptureFeedBoxBorderWidthValue();
        if (selfieCaptureFeedBoxBorderWidthValue != null) {
            this.binding.f4690h.setStrokeWidth((float) C7265j.m30285a(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
        }
        Integer selfieCaptureIconStrokeColor = styles.getSelfieCaptureIconStrokeColor();
        if (selfieCaptureIconStrokeColor != null) {
            int iIntValue = selfieCaptureIconStrokeColor.intValue();
            this.binding.f4686d.m20474F(Color.parseColor("#022050"), iIntValue);
            this.binding.f4686d.m20474F(Color.parseColor("#280087"), iIntValue);
        }
        Integer captureCompleteIconStrokeColor = styles.getCaptureCompleteIconStrokeColor();
        if (captureCompleteIconStrokeColor != null) {
            this.binding.f4686d.m20474F(Color.parseColor("#3BC170"), captureCompleteIconStrokeColor.intValue());
        }
        Integer selfieCaptureIconFillColor = styles.getSelfieCaptureIconFillColor();
        if (selfieCaptureIconFillColor != null) {
            int iIntValue2 = selfieCaptureIconFillColor.intValue();
            this.binding.f4686d.m20474F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f4686d.m20474F(Color.parseColor("#8552FF"), iIntValue2);
        }
        Integer selfieCaptureIconBackgroundFillColor = styles.getSelfieCaptureIconBackgroundFillColor();
        if (selfieCaptureIconBackgroundFillColor != null) {
            this.binding.f4686d.m20474F(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m20299X(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Pi2CircleMaskView.m20308e(this.binding.f4685c, false, onComplete, 1, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m20300a0() {
        return this.binding.f4685c.m20313g();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m20301b0(final C1138b c1138b, final Function0<Unit> function0) {
        View blindsView = c1138b.f4684b;
        Intrinsics.checkNotNullExpressionValue(blindsView, "blindsView");
        m20297U(blindsView, 80L).withEndAction(new Runnable() { // from class: iq.k
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.m20286c0(this.f27210a, c1138b, function0);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m20302e0(@NotNull EnumC3986b viewState, boolean showProgress, @Nullable final Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (this.currentViewState == viewState) {
            return;
        }
        this.currentViewState = viewState;
        removeView(this.remoteImageView);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zM20305p0 = m20305p0(context);
        C1138b c1138b = this.binding;
        if (showProgress) {
            c1138b.f4690h.setVisibility(0);
        } else {
            c1138b.f4690h.setVisibility(8);
        }
        switch (C3987c.f16789a[viewState.ordinal()]) {
            case 1:
                c1138b.f4685c.m20314h();
                c1138b.f4690h.m20322f(0.0f, onAnimationEnd);
                return;
            case 2:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                c1138b.f4690h.m20322f(0.0f, onAnimationEnd);
                return;
            case 3:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                Pi2ProgressArcView.m20318g(c1138b.f4690h, 0.0f, null, 2, null);
                m20301b0(this.binding, onAnimationEnd);
                return;
            case 4:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                Pi2ProgressArcView.m20318g(c1138b.f4690h, 0.0f, null, 2, null);
                if (zM20305p0) {
                    m20303i0(this.binding, this.leftPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 5:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                c1138b.f4690h.m20322f(0.0f, onAnimationEnd);
                if (zM20305p0) {
                    return;
                }
                RemoteImage remoteImage = this.leftPoseImage;
                if (remoteImage != null) {
                    this.remoteImageView = C8243c.m33617e(remoteImage, this, true);
                    return;
                }
                c1138b.f4689g.setVisibility(0);
                ImageView hintImage = c1138b.f4687e;
                Intrinsics.checkNotNullExpressionValue(hintImage, "hintImage");
                m20304n0(hintImage, getDrawableLeft());
                return;
            case 6:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                Pi2ProgressArcView.m20318g(c1138b.f4690h, 50.0f, null, 2, null);
                m20301b0(this.binding, onAnimationEnd);
                return;
            case 7:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                Pi2ProgressArcView.m20318g(c1138b.f4690h, 50.0f, null, 2, null);
                if (zM20305p0) {
                    m20303i0(this.binding, this.rightPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 8:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                c1138b.f4690h.m20322f(50.0f, onAnimationEnd);
                if (zM20305p0) {
                    return;
                }
                RemoteImage remoteImage2 = this.rightPoseImage;
                if (remoteImage2 != null) {
                    this.remoteImageView = C8243c.m33617e(remoteImage2, this, true);
                    return;
                }
                c1138b.f4689g.setVisibility(0);
                ImageView hintImage2 = c1138b.f4687e;
                Intrinsics.checkNotNullExpressionValue(hintImage2, "hintImage");
                m20304n0(hintImage2, getDrawableRight());
                return;
            case 9:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                Pi2ProgressArcView.m20318g(c1138b.f4690h, 100.0f, null, 2, null);
                m20301b0(this.binding, onAnimationEnd);
                return;
            case 10:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                c1138b.f4690h.m20321e();
                return;
            case 11:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                Pi2ProgressArcView.m20318g(c1138b.f4690h, 100.0f, null, 2, null);
                m20301b0(this.binding, new Function0() { // from class: iq.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldSelfieOverlayView.m20289g0(this.f27202a, onAnimationEnd);
                    }
                });
                return;
            case 12:
                Pi2CircleMaskView.m20308e(c1138b.f4685c, false, null, 3, null);
                c1138b.f4690h.m20322f(100.0f, new Function0() { // from class: iq.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldSelfieOverlayView.m20290h0(this.f27204a, onAnimationEnd);
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
                throw new C7345l();
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

    /* JADX INFO: renamed from: i0 */
    public final void m20303i0(final C1138b c1138b, int i10, final Function0<Unit> function0) {
        this.oneShotOnCompositionLoadedListeners.add(new Function0() { // from class: iq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.m20291j0(c1138b, this, function0);
            }
        });
        c1138b.f4686d.setAnimation(i10);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m20304n0(final ImageView imageView, Drawable drawable) {
        if (Intrinsics.m31980c(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            m20281S(this, imageView, 0L, 1, null).withEndAction(new Runnable() { // from class: iq.j
                @Override // java.lang.Runnable
                public final void run() {
                    OldSelfieOverlayView.m20295o0(imageView);
                }
            });
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(0.0f);
        m20283V(this, imageView, 0L, 1, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m20305p0(Context context) {
        return (C7288z.m30330f(context, C12238a.f43184q, null, false, 6, null) == null || C7288z.m30330f(context, C12238a.f43186s, null, false, 6, null) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ OldSelfieOverlayView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        C1138b c1138bM6466b = C1138b.m6466b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c1138bM6466b, "inflate(...)");
        this.binding = c1138bM6466b;
        this.drawableLeft = C7342i.m30456b(new Function0() { // from class: iq.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.m20284Y(context);
            }
        });
        this.drawableRight = C7342i.m30456b(new Function0() { // from class: iq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldSelfieOverlayView.m20285Z(context);
            }
        });
        int i11 = C12238a.f43185r;
        Integer numM30330f = C7288z.m30330f(context, i11, null, false, 6, null);
        this.leftPoseAnimation = numM30330f != null ? numM30330f.intValue() : C13400t.f46977e;
        Integer numM30330f2 = C7288z.m30330f(context, i11, null, false, 6, null);
        this.rightPoseAnimation = numM30330f2 != null ? numM30330f2.intValue() : C13400t.f46979g;
        this.oneShotOnCompositionLoadedListeners = new ArrayList();
        this.oneShotOnAnimationCompleteListeners = new ArrayList();
        ThemeableLottieAnimationView themeableLottieAnimationView = c1138bM6466b.f4686d;
        themeableLottieAnimationView.m8422j(new InterfaceC5463n0() { // from class: iq.f
            @Override // p121f7.InterfaceC5463n0
            /* JADX INFO: renamed from: a */
            public final void mo21732a(C5452i c5452i) {
                OldSelfieOverlayView.m20272I(this.f27201a, c5452i);
            }
        });
        themeableLottieAnimationView.m8421i(new C3985a());
        int color = Color.parseColor("#022050");
        Context context2 = c1138bM6466b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i12 = C6738b.f25906m;
        themeableLottieAnimationView.m20474F(color, C7288z.m30328d(context2, i12, null, false, 6, null));
        int color2 = Color.parseColor("#AA85FF");
        Context context3 = c1138bM6466b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int i13 = C6738b.f25907n;
        themeableLottieAnimationView.m20474F(color2, C7288z.m30328d(context3, i13, null, false, 6, null));
        int color3 = Color.parseColor("#280087");
        Context context4 = c1138bM6466b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        themeableLottieAnimationView.m20474F(color3, C7288z.m30328d(context4, i12, null, false, 6, null));
        int color4 = Color.parseColor("#8552FF");
        Context context5 = c1138bM6466b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        themeableLottieAnimationView.m20474F(color4, C7288z.m30328d(context5, i13, null, false, 6, null));
        Context context6 = c1138bM6466b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int iM30328d = C7288z.m30328d(context6, i13, null, false, 6, null);
        Context context7 = c1138bM6466b.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        themeableLottieAnimationView.m20474F(Color.parseColor("#DBCCFF"), C0546c.m2669c(iM30328d, C7288z.m30328d(context7, C6738b.f25908o, null, false, 6, null), 0.66f));
    }
}
