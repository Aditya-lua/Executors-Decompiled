package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.C0546c;
import androidx.core.view.ViewCompat;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p229jt.C7345l;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ¬\u00012\u00020\u0001:\u0006MUPWSJB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J'\u0010/\u001a\n .*\u0004\u0018\u00010-0-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u0011JS\u0010;\u001a\u00020\r*\u0002022\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u001fH\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0002¢\u0006\u0004\b=\u0010\u0011J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020>H\u0002¢\u0006\u0004\bA\u0010@J\u000f\u0010\t\u001a\u00020>H\u0002¢\u0006\u0004\b\t\u0010@J+\u0010E\u001a\u00020\r*\u00020*2\u0006\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020\u001fH\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u00020**\u00020*2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\rH\u0002¢\u0006\u0004\bI\u0010\u0011R\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010QR\u0014\u0010V\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bU\u0010QR\u0014\u0010X\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010QR\u0014\u0010Z\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010QR\u0014\u0010[\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0014\u0010]\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010NR\u0014\u0010_\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010NR\u0014\u0010a\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010NR\u0014\u0010c\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010NR\u0014\u0010e\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010dR\u0014\u0010f\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010dR\u0014\u0010g\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010dR\u0014\u0010i\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010dR\u0014\u0010j\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010dR\u0014\u0010l\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010dR\u0014\u0010m\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010dR\u0014\u0010n\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010dR\u0014\u0010o\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010dR\u0014\u0010q\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010dR\u0014\u0010r\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010dR\u0014\u0010s\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010dR\u0014\u0010v\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR\u0014\u0010z\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010uR\u0014\u0010|\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010uR\u0014\u0010~\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010uR\u0014\u0010\u007f\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010uR\u0016\u0010\u0081\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010uR\u0015\u0010\u0082\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010uR\u0015\u0010\u0083\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010uR\u0015\u0010\u0084\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010uR\u0017\u0010\u0085\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010NR\u0018\u0010\u0087\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010NR\u0018\u0010\u0089\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010NR\u0018\u0010\u008b\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010NR\u0017\u0010\u008e\u0001\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0090\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0090\u0001R\u0018\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010,\u001a\u00030£\u0001*\u00020\u00168BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bh\u0010¤\u0001R\u001a\u0010¦\u0001\u001a\u00020\u0012*\u00020*8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bk\u0010¥\u0001R-\u0010«\u0001\u001a\u00020\b*\u00020>2\u0007\u0010§\u0001\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\u000f\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0005\b}\u0010ª\u0001¨\u0006\u00ad\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "()V", "", "mirrored", "setIsPreviewMirrored", "(Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "newState", "animate", "D", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Z)V", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "setCameraStreamBrightnessInfo", "(Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V", "", "intensity", "setIntensity", "(F)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "oldState", "x", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "startState", "endState", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "u", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;", "H", "Landroid/graphics/Path;", "left", "top", "right", "bottom", "startAngle", "sweepAngle", "numTicks", "tickLength", "m", "(Landroid/graphics/Path;FFFFFFIF)V", "n", "Landroid/graphics/Paint;", "t", "()Landroid/graphics/Paint;", "s", "start", "end", "percent", "q", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V", "o", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "G", "a", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "state", "b", "F", "currentIntensity", "c", "I", "colorOnSurface", "d", "shadowColor", "e", "accentColor", "f", "arcBaseColor", "g", "arcHighlightColor", "arcInset", "i", "arcGapDegrees", "j", "arcStrokeWidth", "k", "arcDialStrokeWidth", "l", "arcTickLength", "Landroid/graphics/Path;", "arcTop", "arcBottom", "arcLeft", "p", "arcRight", "arcDialLeft", "r", "arcDialRight", "arcDialTop", "arcDialBottom", "arcDialHighlightClipPathRight", "v", "arcDialHighlightClipPathLeft", "arcDialHighlightClipPathTop", "arcDialHighlightClipPathBottom", "y", "Landroid/graphics/Paint;", "arcTopPaint", "z", "arcBottomPaint", "A", "arcLeftPaint", "B", "arcRightPaint", "C", "shadowPaint", "arcDialLeftPaint", "E", "arcDialRightPaint", "arcDialTopPaint", "arcDialBottomPaint", "filledArcDialPaint", "arcDialLeftIntensity", "J", "arcDialRightIntensity", "K", "arcDialTopIntensity", "L", "arcDialBottomIntensity", "M", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "arcHoverState", "N", "Landroid/animation/ValueAnimator;", "stateAnimator", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;", "O", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;", "stateAnimationState", "P", "intensityAnimator", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;", "Q", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;", "intensityAnimationState", "R", "directionHintAnimator", "S", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "T", "Z", "isPreviewMirrored", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Z", "isIdentity", "value", "getShadowAlpha", "(Landroid/graphics/Paint;)I", "(Landroid/graphics/Paint;I)V", "shadowAlpha", "U", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SelfieOverlayView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Paint arcLeftPaint;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Paint arcRightPaint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Paint shadowPaint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Paint arcDialLeftPaint;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Paint arcDialRightPaint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Paint arcDialTopPaint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Paint arcDialBottomPaint;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Paint filledArcDialPaint;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public float arcDialLeftIntensity;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public float arcDialRightIntensity;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public float arcDialTopIntensity;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public float arcDialBottomIntensity;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final ArcHoverState arcHoverState;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator stateAnimator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    public StateAnimationState stateAnimationState;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator intensityAnimator;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public IntensityAnimationState intensityAnimationState;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator directionHintAnimator;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public SelfieBrightnessInfo brightnessInfo;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean isPreviewMirrored;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public EnumC3998e state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float currentIntensity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int colorOnSurface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int shadowColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int accentColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int arcBaseColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int arcHighlightColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float arcInset;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float arcGapDegrees;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final float arcStrokeWidth;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float arcDialStrokeWidth;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final float arcTickLength;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Path arcTop;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Path arcBottom;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Path arcLeft;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Path arcRight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialLeft;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialRight;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialTop;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialBottom;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialHighlightClipPathRight;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialHighlightClipPathLeft;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialHighlightClipPathTop;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Path arcDialHighlightClipPathBottom;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Paint arcTopPaint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Paint arcBottomPaint;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u001aj\u0002\b\u0013j\u0002\b\u001bj\u0002\b\u0015j\u0002\b\u001cj\u0002\b\u000fj\u0002\b\u001d¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;", "", "", "arcTopAlpha", "arcBottomAlpha", "arcLeftAlpha", "arcRightAlpha", "arcDialLeftAlpha", "arcDialRightAlpha", "arcDialTopAlpha", "arcDialBottomAlpha", "<init>", "(Ljava/lang/String;IFFFFFFFF)V", "a", "F", "n", "()F", "b", "c", "j", "d", "l", "e", "f", "g", "h", "i", "k", "m", "o", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3996c {
        Center(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f),
        Left(0.1f, 0.1f, 0.0f, 0.1f, 1.0f, 0.0f, 0.0f, 0.0f),
        Right(0.1f, 0.1f, 0.1f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f),
        Up(0.0f, 0.1f, 0.1f, 0.1f, 0.0f, 0.0f, 1.0f, 0.0f),
        Down(0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.0f, 0.0f, 1.0f),
        None(0.1f, 0.1f, 0.1f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f),
        Finalizing(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);


        /* JADX INFO: renamed from: q */
        public static final /* synthetic */ InterfaceC10707a f16878q = C10708b.m40805a(m20378a());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final float arcTopAlpha;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final float arcBottomAlpha;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final float arcLeftAlpha;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final float arcRightAlpha;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final float arcDialLeftAlpha;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final float arcDialRightAlpha;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final float arcDialTopAlpha;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final float arcDialBottomAlpha;

        EnumC3996c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.arcTopAlpha = f10;
            this.arcBottomAlpha = f11;
            this.arcLeftAlpha = f12;
            this.arcRightAlpha = f13;
            this.arcDialLeftAlpha = f14;
            this.arcDialRightAlpha = f15;
            this.arcDialTopAlpha = f16;
            this.arcDialBottomAlpha = f17;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getArcBottomAlpha() {
            return this.arcBottomAlpha;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getArcDialBottomAlpha() {
            return this.arcDialBottomAlpha;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getArcDialLeftAlpha() {
            return this.arcDialLeftAlpha;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getArcDialRightAlpha() {
            return this.arcDialRightAlpha;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getArcDialTopAlpha() {
            return this.arcDialTopAlpha;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getArcLeftAlpha() {
            return this.arcLeftAlpha;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final float getArcRightAlpha() {
            return this.arcRightAlpha;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final float getArcTopAlpha() {
            return this.arcTopAlpha;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$d, reason: from toString */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;", "", "", NotificationCompat.CATEGORY_PROGRESS, "startIntensity", "endIntensity", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "d", "(F)V", "c", "setStartIntensity", "setEndIntensity", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class IntensityAnimationState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public float progress;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public float startIntensity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public float endIntensity;

        public IntensityAnimationState(float f10, float f11, float f12) {
            this.progress = f10;
            this.startIntensity = f11;
            this.endIntensity = f12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getEndIntensity() {
            return this.endIntensity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getStartIntensity() {
            return this.startIntensity;
        }

        /* JADX INFO: renamed from: d */
        public final void m20390d(float f10) {
            this.progress = f10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntensityAnimationState)) {
                return false;
            }
            IntensityAnimationState intensityAnimationState = (IntensityAnimationState) other;
            return Float.compare(this.progress, intensityAnimationState.progress) == 0 && Float.compare(this.startIntensity, intensityAnimationState.startIntensity) == 0 && Float.compare(this.endIntensity, intensityAnimationState.endIntensity) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.progress) * 31) + Float.hashCode(this.startIntensity)) * 31) + Float.hashCode(this.endIntensity);
        }

        @NotNull
        public String toString() {
            return "IntensityAnimationState(progress=" + this.progress + ", startIntensity=" + this.startIntensity + ", endIntensity=" + this.endIntensity + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3998e {
        Center,
        Left,
        Right,
        Up,
        Down,
        None,
        Finalizing;


        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ InterfaceC10707a f16898i = C10708b.m40805a(m20391a());
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$f, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0082\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010&\u001a\u0004\b$\u0010(\"\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b/\u0010(R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b)\u0010(¨\u00062"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;", "", "", "animating", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "startState", "endState", "", "startIntensity", NotificationCompat.CATEGORY_PROGRESS, "startArcTopAlpha", "startArcBottomAlpha", "startArcLeftAlpha", "startArcRightAlpha", "startArcDialLeftAlpha", "startArcDialRightAlpha", "startArcDialTopAlpha", "startArcDialBottomAlpha", "<init>", "(ZLcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FFFFFFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "m", "()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "c", "d", "F", "l", "()F", "e", "n", "(F)V", "f", "k", "g", "h", "i", "j", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class StateAnimationState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final boolean animating;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC3998e startState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC3998e endState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final float startIntensity;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public float progress;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final float startArcTopAlpha;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public final float startArcBottomAlpha;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public final float startArcLeftAlpha;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public final float startArcRightAlpha;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        public final float startArcDialLeftAlpha;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        public final float startArcDialRightAlpha;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        public final float startArcDialTopAlpha;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        public final float startArcDialBottomAlpha;

        public StateAnimationState(boolean z10, @NotNull EnumC3998e startState, @NotNull EnumC3998e endState, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
            Intrinsics.checkNotNullParameter(startState, "startState");
            Intrinsics.checkNotNullParameter(endState, "endState");
            this.animating = z10;
            this.startState = startState;
            this.endState = endState;
            this.startIntensity = f10;
            this.progress = f11;
            this.startArcTopAlpha = f12;
            this.startArcBottomAlpha = f13;
            this.startArcLeftAlpha = f14;
            this.startArcRightAlpha = f15;
            this.startArcDialLeftAlpha = f16;
            this.startArcDialRightAlpha = f17;
            this.startArcDialTopAlpha = f18;
            this.startArcDialBottomAlpha = f19;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAnimating() {
            return this.animating;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC3998e getEndState() {
            return this.endState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getStartArcBottomAlpha() {
            return this.startArcBottomAlpha;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getStartArcDialBottomAlpha() {
            return this.startArcDialBottomAlpha;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateAnimationState)) {
                return false;
            }
            StateAnimationState stateAnimationState = (StateAnimationState) other;
            return this.animating == stateAnimationState.animating && this.startState == stateAnimationState.startState && this.endState == stateAnimationState.endState && Float.compare(this.startIntensity, stateAnimationState.startIntensity) == 0 && Float.compare(this.progress, stateAnimationState.progress) == 0 && Float.compare(this.startArcTopAlpha, stateAnimationState.startArcTopAlpha) == 0 && Float.compare(this.startArcBottomAlpha, stateAnimationState.startArcBottomAlpha) == 0 && Float.compare(this.startArcLeftAlpha, stateAnimationState.startArcLeftAlpha) == 0 && Float.compare(this.startArcRightAlpha, stateAnimationState.startArcRightAlpha) == 0 && Float.compare(this.startArcDialLeftAlpha, stateAnimationState.startArcDialLeftAlpha) == 0 && Float.compare(this.startArcDialRightAlpha, stateAnimationState.startArcDialRightAlpha) == 0 && Float.compare(this.startArcDialTopAlpha, stateAnimationState.startArcDialTopAlpha) == 0 && Float.compare(this.startArcDialBottomAlpha, stateAnimationState.startArcDialBottomAlpha) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getStartArcDialLeftAlpha() {
            return this.startArcDialLeftAlpha;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getStartArcDialRightAlpha() {
            return this.startArcDialRightAlpha;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getStartArcDialTopAlpha() {
            return this.startArcDialTopAlpha;
        }

        public int hashCode() {
            return (((((((((((((((((((((((Boolean.hashCode(this.animating) * 31) + this.startState.hashCode()) * 31) + this.endState.hashCode()) * 31) + Float.hashCode(this.startIntensity)) * 31) + Float.hashCode(this.progress)) * 31) + Float.hashCode(this.startArcTopAlpha)) * 31) + Float.hashCode(this.startArcBottomAlpha)) * 31) + Float.hashCode(this.startArcLeftAlpha)) * 31) + Float.hashCode(this.startArcRightAlpha)) * 31) + Float.hashCode(this.startArcDialLeftAlpha)) * 31) + Float.hashCode(this.startArcDialRightAlpha)) * 31) + Float.hashCode(this.startArcDialTopAlpha)) * 31) + Float.hashCode(this.startArcDialBottomAlpha);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getStartArcLeftAlpha() {
            return this.startArcLeftAlpha;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getStartArcRightAlpha() {
            return this.startArcRightAlpha;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final float getStartArcTopAlpha() {
            return this.startArcTopAlpha;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final float getStartIntensity() {
            return this.startIntensity;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final EnumC3998e getStartState() {
            return this.startState;
        }

        /* JADX INFO: renamed from: n */
        public final void m20405n(float f10) {
            this.progress = f10;
        }

        @NotNull
        public String toString() {
            return "StateAnimationState(animating=" + this.animating + ", startState=" + this.startState + ", endState=" + this.endState + ", startIntensity=" + this.startIntensity + ", progress=" + this.progress + ", startArcTopAlpha=" + this.startArcTopAlpha + ", startArcBottomAlpha=" + this.startArcBottomAlpha + ", startArcLeftAlpha=" + this.startArcLeftAlpha + ", startArcRightAlpha=" + this.startArcRightAlpha + ", startArcDialLeftAlpha=" + this.startArcDialLeftAlpha + ", startArcDialRightAlpha=" + this.startArcDialRightAlpha + ", startArcDialTopAlpha=" + this.startArcDialTopAlpha + ", startArcDialBottomAlpha=" + this.startArcDialBottomAlpha + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$g */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C4000g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16912a;

        static {
            int[] iArr = new int[EnumC3998e.values().length];
            try {
                iArr[EnumC3998e.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3998e.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3998e.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3998e.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3998e.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3998e.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3998e.Finalizing.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f16912a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$h */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$h", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 2, 0})
    public static final class C4001h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7758y f16913a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EnumC3998e f16914b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SelfieOverlayView f16915c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C7758y f16916d;

        public C4001h(C7758y c7758y, EnumC3998e enumC3998e, SelfieOverlayView selfieOverlayView, C7758y c7758y2) {
            this.f16913a = c7758y;
            this.f16914b = enumC3998e;
            this.f16915c = selfieOverlayView;
            this.f16916d = c7758y2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
            this.f16916d.f29445a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
            if (this.f16913a.f29445a) {
                return;
            }
            SelfieOverlayView.m20342z(this.f16914b, this.f16915c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$i */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, m31665d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 2, 0})
    public static final class C4002i implements Animator.AnimatorListener {
        public C4002i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
            SelfieOverlayView.this.intensityAnimationState = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$j */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, m31665d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 2, 0})
    public static final class C4003j implements Animator.AnimatorListener {
        public C4003j() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
            StateAnimationState stateAnimationState = SelfieOverlayView.this.stateAnimationState;
            if (stateAnimationState != null) {
                EnumC3998e enumC3998e = SelfieOverlayView.this.state;
                SelfieOverlayView.this.state = stateAnimationState.getEndState();
                SelfieOverlayView.this.m20357x(enumC3998e, stateAnimationState.getEndState());
            }
            SelfieOverlayView.this.stateAnimationState = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.m31982e(animator, "animator");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = EnumC3998e.Center;
        this.colorOnSurface = -1;
        this.shadowColor = ViewCompat.MEASURED_STATE_MASK;
        this.accentColor = -13910906;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) C7265j.m30285a(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) C7265j.m30285a(4.0d);
        this.arcDialStrokeWidth = (float) C7265j.m30285a(2.0d);
        this.arcTickLength = (float) C7265j.m30285a(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialTop = new Path();
        this.arcDialBottom = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcDialHighlightClipPathTop = new Path();
        this.arcDialHighlightClipPathBottom = new Path();
        this.arcTopPaint = m20354t();
        this.arcBottomPaint = m20354t();
        this.arcLeftPaint = m20354t();
        this.arcRightPaint = m20354t();
        this.shadowPaint = m20356w();
        Paint paintM20353s = m20353s();
        paintM20353s.setAlpha(0);
        this.arcDialLeftPaint = paintM20353s;
        Paint paintM20353s2 = m20353s();
        paintM20353s2.setAlpha(0);
        this.arcDialRightPaint = paintM20353s2;
        Paint paintM20353s3 = m20353s();
        paintM20353s3.setAlpha(0);
        this.arcDialTopPaint = paintM20353s3;
        Paint paintM20353s4 = m20353s();
        paintM20353s4.setAlpha(0);
        this.arcDialBottomPaint = paintM20353s4;
        Paint paintM20353s5 = m20353s();
        paintM20353s5.setColor(-13910906);
        this.filledArcDialPaint = paintM20353s5;
        this.arcHoverState = m20349o(new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null), this.currentIntensity);
        this.brightnessInfo = new SelfieBrightnessInfo(null, 1, null);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: A */
    public static final void m20324A(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.m20351q(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
        if (intensityAnimationState != null) {
            intensityAnimationState.m20390d(it.getAnimatedFraction());
        }
        selfieOverlayView.m20348n();
    }

    /* JADX INFO: renamed from: B */
    public static final void m20325B(SelfieOverlayView selfieOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IntensityAnimationState intensityAnimationState = selfieOverlayView.intensityAnimationState;
        if (intensityAnimationState != null) {
            intensityAnimationState.m20390d(it.getAnimatedFraction());
        }
        selfieOverlayView.m20348n();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m20326E(SelfieOverlayView selfieOverlayView, EnumC3998e enumC3998e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        selfieOverlayView.m20344D(enumC3998e, z10);
    }

    /* JADX INFO: renamed from: F */
    public static final void m20327F(SelfieOverlayView selfieOverlayView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StateAnimationState stateAnimationState = selfieOverlayView.stateAnimationState;
        if (stateAnimationState != null) {
            stateAnimationState.m20405n(it.getAnimatedFraction());
        }
        selfieOverlayView.m20348n();
    }

    /* JADX INFO: renamed from: v */
    public static final void m20340v(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.m20351q(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.m20348n();
    }

    /* JADX INFO: renamed from: y */
    public static final void m20341y(SelfieOverlayView selfieOverlayView, ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieOverlayView.m20351q(selfieOverlayView.arcHoverState, arcHoverState, arcHoverState2, it.getAnimatedFraction());
        selfieOverlayView.invalidate();
    }

    /* JADX INFO: renamed from: z */
    public static final void m20342z(EnumC3998e enumC3998e, SelfieOverlayView selfieOverlayView) {
        switch (C4000g.f16912a[enumC3998e.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return;
            case 2:
                ArcHoverState arcHoverStateM20358b = ArcHoverState.m20358b(selfieOverlayView.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                ArcHoverState arcHoverState = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                arcHoverState.m20371n(-((float) C7265j.m30287c(48.0d)));
                Unit unit = Unit.f29331a;
                ValueAnimator valueAnimatorM20355u = selfieOverlayView.m20355u(arcHoverStateM20358b, arcHoverState);
                valueAnimatorM20355u.start();
                selfieOverlayView.directionHintAnimator = valueAnimatorM20355u;
                return;
            case 3:
                ArcHoverState arcHoverStateM20358b2 = ArcHoverState.m20358b(selfieOverlayView.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                ArcHoverState arcHoverState2 = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                arcHoverState2.m20373p((float) C7265j.m30287c(48.0d));
                Unit unit2 = Unit.f29331a;
                ValueAnimator valueAnimatorM20355u2 = selfieOverlayView.m20355u(arcHoverStateM20358b2, arcHoverState2);
                valueAnimatorM20355u2.start();
                selfieOverlayView.directionHintAnimator = valueAnimatorM20355u2;
                return;
            case 4:
                ArcHoverState arcHoverStateM20358b3 = ArcHoverState.m20358b(selfieOverlayView.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                ArcHoverState arcHoverState3 = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                arcHoverState3.m20377t(-((float) C7265j.m30287c(48.0d)));
                Unit unit3 = Unit.f29331a;
                ValueAnimator valueAnimatorM20355u3 = selfieOverlayView.m20355u(arcHoverStateM20358b3, arcHoverState3);
                valueAnimatorM20355u3.start();
                selfieOverlayView.directionHintAnimator = valueAnimatorM20355u3;
                return;
            case 5:
                ArcHoverState arcHoverStateM20358b4 = ArcHoverState.m20358b(selfieOverlayView.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                ArcHoverState arcHoverState4 = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
                arcHoverState4.m20370m((float) C7265j.m30287c(48.0d));
                Unit unit4 = Unit.f29331a;
                ValueAnimator valueAnimatorM20355u4 = selfieOverlayView.m20355u(arcHoverStateM20358b4, arcHoverState4);
                valueAnimatorM20355u4.start();
                selfieOverlayView.directionHintAnimator = valueAnimatorM20355u4;
                return;
            default:
                throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m20343C(Paint paint, int i10) {
        if (paint.getAlpha() == i10) {
            return;
        }
        paint.setShadowLayer(this.arcStrokeWidth * 2, 0.0f, 0.0f, C0546c.m2678l(this.shadowColor, i10));
        paint.setAlpha(i10);
    }

    /* JADX INFO: renamed from: D */
    public final void m20344D(@NotNull EnumC3998e newState, boolean animate) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        StateAnimationState stateAnimationState = this.stateAnimationState;
        if (stateAnimationState != null && stateAnimationState.getAnimating()) {
            StateAnimationState stateAnimationState2 = this.stateAnimationState;
            if ((stateAnimationState2 != null ? stateAnimationState2.getEndState() : null) == newState) {
                return;
            }
        }
        StateAnimationState stateAnimationState3 = this.stateAnimationState;
        if ((stateAnimationState3 == null || !stateAnimationState3.getAnimating()) && this.state == newState) {
            return;
        }
        ValueAnimator valueAnimator = this.stateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if (!animate) {
            EnumC3998e enumC3998e = this.state;
            this.state = newState;
            this.stateAnimationState = null;
            m20348n();
            m20357x(enumC3998e, newState);
            return;
        }
        this.stateAnimationState = new StateAnimationState(true, this.state, newState, this.currentIntensity, 0.0f, this.arcTopPaint.getAlpha() / 255.0f, this.arcBottomPaint.getAlpha() / 255.0f, this.arcLeftPaint.getAlpha() / 255.0f, this.arcRightPaint.getAlpha() / 255.0f, this.arcDialLeftPaint.getAlpha() / 255.0f, this.arcDialRightPaint.getAlpha() / 255.0f, this.arcDialTopPaint.getAlpha() / 255.0f, this.arcDialBottomPaint.getAlpha() / 255.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelfieOverlayView.m20327F(this.f27222a, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C4003j());
        valueAnimatorOfFloat.start();
        this.stateAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: G */
    public final void m20345G() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth / 2.0f;
        float f11 = measuredHeight / 2.0f;
        Path path = this.arcDialHighlightClipPathLeft;
        float f12 = this.arcDialLeftIntensity * 45.0f;
        path.reset();
        path.moveTo(f10, f11);
        path.arcTo(0.0f, 0.0f, measuredWidth, measuredHeight, 180.0f - f12, f12 * 2.0f, false);
        path.close();
        Path path2 = this.arcDialHighlightClipPathRight;
        float f13 = this.arcDialRightIntensity * 45.0f;
        path2.reset();
        path2.moveTo(f10, f11);
        path2.arcTo(0.0f, 0.0f, measuredWidth, measuredHeight, -f13, f13 * 2.0f, false);
        path2.close();
        Path path3 = this.arcDialHighlightClipPathTop;
        float f14 = this.arcDialTopIntensity * 45.0f;
        path3.reset();
        path3.moveTo(f10, f11);
        path3.arcTo(0.0f, 0.0f, measuredWidth, measuredHeight, 270.0f - f14, f14 * 2.0f, false);
        path3.close();
        Path path4 = this.arcDialHighlightClipPathBottom;
        float f15 = this.arcDialBottomIntensity * 45.0f;
        path4.reset();
        path4.moveTo(f10, f11);
        path4.arcTo(0.0f, 0.0f, measuredWidth, measuredHeight, 90.0f - f15, f15 * 2.0f, false);
        path4.close();
    }

    /* JADX INFO: renamed from: H */
    public final void m20346H() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.arcGapDegrees / 2.0f;
        this.arcTop.reset();
        Path path = this.arcTop;
        float f11 = this.arcInset;
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f10 + 225.0f;
        path.addArc(f11, f11, f12 - f11, f13 - f11, f14, 90.0f - this.arcGapDegrees);
        this.arcBottom.reset();
        Path path2 = this.arcBottom;
        float f15 = this.arcInset;
        float f16 = f10 + 45.0f;
        path2.addArc(f15, f15, f12 - f15, f13 - f15, f16, 90.0f - this.arcGapDegrees);
        this.arcLeft.reset();
        Path path3 = this.arcLeft;
        float f17 = this.arcInset;
        float f18 = f10 + 135.0f;
        path3.addArc(f17, f17, f12 - f17, f13 - f17, f18, 90.0f - this.arcGapDegrees);
        this.arcRight.reset();
        Path path4 = this.arcRight;
        float f19 = this.arcInset;
        float f20 = f10 + 315.0f;
        path4.addArc(f19, f19, f12 - f19, f13 - f19, f20, 90.0f - this.arcGapDegrees);
        this.arcDialLeft.reset();
        Path path5 = this.arcDialLeft;
        float f21 = this.arcInset;
        m20347m(path5, f21, f21, f12 - f21, f13 - f21, f18, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        this.arcDialRight.reset();
        Path path6 = this.arcDialRight;
        float f22 = this.arcInset;
        m20347m(path6, f22, f22, f12 - f22, f13 - f22, f20, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        this.arcDialTop.reset();
        Path path7 = this.arcDialTop;
        float f23 = this.arcInset;
        m20347m(path7, f23, f23, f12 - f23, f13 - f23, f14, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        this.arcDialBottom.reset();
        Path path8 = this.arcDialBottom;
        float f24 = this.arcInset;
        m20347m(path8, f24, f24, f12 - f24, f13 - f24, f16, 90.0f - this.arcGapDegrees, 30, this.arcTickLength);
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public final void m20347m(Path path, float f10, float f11, float f12, float f13, float f14, float f15, int i10, float f16) {
        int i11 = i10;
        float f17 = (f12 - f10) / 2.0f;
        float f18 = f17 + f10;
        float f19 = f17 + f11;
        float f20 = f16 / 2;
        double radians = Math.toRadians(f14);
        double radians2 = Math.toRadians(f15) / ((double) (i11 - 1));
        int i12 = 0;
        while (i12 < i11) {
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d10 = f17 - f20;
            float f21 = f18;
            float f22 = f19;
            float f23 = f20;
            double d11 = f17 + f20;
            path.moveTo(((float) (d10 * dCos)) + f21, ((float) (d10 * dSin)) + f22);
            path.lineTo(((float) (dCos * d11)) + f21, ((float) (d11 * dSin)) + f22);
            radians += radians2;
            i12++;
            f20 = f23;
            f17 = f17;
            f18 = f21;
            i11 = i10;
            f19 = f22;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m20348n() {
        float arcTopAlpha;
        float arcBottomAlpha;
        float arcLeftAlpha;
        float arcRightAlpha;
        float arcDialLeftAlpha;
        float arcDialRightAlpha;
        float arcDialTopAlpha;
        float arcDialBottomAlpha;
        EnumC3998e endState;
        float startIntensity;
        StateAnimationState stateAnimationState = this.stateAnimationState;
        IntensityAnimationState intensityAnimationState = this.intensityAnimationState;
        if (stateAnimationState != null) {
            float progress = stateAnimationState.getProgress();
            EnumC3996c enumC3996cM20350p = m20350p(stateAnimationState.getEndState());
            float startArcTopAlpha = stateAnimationState.getStartArcTopAlpha();
            arcTopAlpha = ((enumC3996cM20350p.getArcTopAlpha() - startArcTopAlpha) * progress) + startArcTopAlpha;
            float startArcBottomAlpha = stateAnimationState.getStartArcBottomAlpha();
            arcBottomAlpha = ((enumC3996cM20350p.getArcBottomAlpha() - startArcBottomAlpha) * progress) + startArcBottomAlpha;
            float startArcLeftAlpha = stateAnimationState.getStartArcLeftAlpha();
            arcLeftAlpha = ((enumC3996cM20350p.getArcLeftAlpha() - startArcLeftAlpha) * progress) + startArcLeftAlpha;
            float startArcRightAlpha = stateAnimationState.getStartArcRightAlpha();
            arcRightAlpha = ((enumC3996cM20350p.getArcRightAlpha() - startArcRightAlpha) * progress) + startArcRightAlpha;
            float startArcDialLeftAlpha = stateAnimationState.getStartArcDialLeftAlpha();
            arcDialLeftAlpha = ((enumC3996cM20350p.getArcDialLeftAlpha() - startArcDialLeftAlpha) * progress) + startArcDialLeftAlpha;
            float startArcDialRightAlpha = stateAnimationState.getStartArcDialRightAlpha();
            arcDialRightAlpha = ((enumC3996cM20350p.getArcDialRightAlpha() - startArcDialRightAlpha) * progress) + startArcDialRightAlpha;
            float startArcDialTopAlpha = stateAnimationState.getStartArcDialTopAlpha();
            arcDialTopAlpha = ((enumC3996cM20350p.getArcDialTopAlpha() - startArcDialTopAlpha) * progress) + startArcDialTopAlpha;
            float startArcDialBottomAlpha = stateAnimationState.getStartArcDialBottomAlpha();
            arcDialBottomAlpha = ((enumC3996cM20350p.getArcDialBottomAlpha() - startArcDialBottomAlpha) * progress) + startArcDialBottomAlpha;
        } else {
            arcTopAlpha = m20350p(this.state).getArcTopAlpha();
            arcBottomAlpha = m20350p(this.state).getArcBottomAlpha();
            arcLeftAlpha = m20350p(this.state).getArcLeftAlpha();
            arcRightAlpha = m20350p(this.state).getArcRightAlpha();
            arcDialLeftAlpha = m20350p(this.state).getArcDialLeftAlpha();
            arcDialRightAlpha = m20350p(this.state).getArcDialRightAlpha();
            arcDialTopAlpha = m20350p(this.state).getArcDialTopAlpha();
            arcDialBottomAlpha = m20350p(this.state).getArcDialBottomAlpha();
        }
        EnumC3998e startState = stateAnimationState != null ? stateAnimationState.getStartState() : null;
        if (stateAnimationState == null || (endState = stateAnimationState.getEndState()) == null) {
            endState = this.state;
        }
        float endIntensity = intensityAnimationState != null ? ((intensityAnimationState.getEndIntensity() - intensityAnimationState.getStartIntensity()) * intensityAnimationState.getProgress()) + intensityAnimationState.getStartIntensity() : this.currentIntensity;
        this.currentIntensity = endIntensity;
        EnumC3998e enumC3998e = EnumC3998e.Center;
        if (endState == enumC3998e) {
            startIntensity = endIntensity;
        } else {
            startIntensity = startState == enumC3998e ? stateAnimationState.getStartIntensity() : 0.0f;
        }
        EnumC3998e enumC3998e2 = EnumC3998e.Left;
        float f10 = endState == enumC3998e2 ? endIntensity : 0.0f;
        EnumC3998e enumC3998e3 = EnumC3998e.Right;
        float f11 = endState == enumC3998e3 ? endIntensity : 0.0f;
        EnumC3998e enumC3998e4 = EnumC3998e.Up;
        float f12 = endState == enumC3998e4 ? endIntensity : 0.0f;
        float f13 = startIntensity;
        EnumC3998e enumC3998e5 = EnumC3998e.Down;
        if (endState != enumC3998e5) {
            endIntensity = 0.0f;
        }
        float f14 = ((arcTopAlpha - 0.1f) / 1.0f) * f13;
        float f15 = arcDialBottomAlpha;
        float f16 = ((arcBottomAlpha - 0.1f) / 1.0f) * f13;
        float f17 = arcTopAlpha;
        float f18 = ((arcLeftAlpha - 0.1f) / 1.0f) * f13;
        float f19 = arcBottomAlpha;
        float f20 = ((arcRightAlpha - 0.1f) / 1.0f) * f13;
        float startIntensity2 = ((arcDialLeftAlpha - 0.1f) / 1.0f) * f10;
        float startIntensity3 = ((arcDialRightAlpha - 0.1f) / 1.0f) * f11;
        float startIntensity4 = ((arcDialTopAlpha - 0.1f) / 1.0f) * f12;
        float startIntensity5 = ((f15 - 0.1f) / 1.0f) * endIntensity;
        float f21 = arcLeftAlpha;
        float f22 = arcRightAlpha;
        this.arcTopPaint.setColor(C0546c.m2669c(this.arcBaseColor, this.arcHighlightColor, f14));
        this.arcBottomPaint.setColor(C0546c.m2669c(this.arcBaseColor, this.arcHighlightColor, f16));
        this.arcLeftPaint.setColor(C0546c.m2669c(this.arcBaseColor, this.arcHighlightColor, f18));
        this.arcRightPaint.setColor(C0546c.m2669c(this.arcBaseColor, this.arcHighlightColor, f20));
        if (startState == enumC3998e4) {
            startIntensity4 = stateAnimationState.getStartIntensity();
        } else if (startState == enumC3998e5) {
            startIntensity5 = stateAnimationState.getStartIntensity();
        } else if (startState == enumC3998e2) {
            startIntensity2 = stateAnimationState.getStartIntensity();
        } else if (startState == enumC3998e3) {
            startIntensity3 = stateAnimationState.getStartIntensity();
        }
        float f23 = startIntensity3;
        float f24 = startIntensity2;
        float f25 = startIntensity4;
        float f26 = startIntensity5;
        boolean z10 = (this.arcDialLeftIntensity == f24 && this.arcDialRightIntensity == f23 && this.arcDialTopIntensity == f25 && this.arcDialBottomIntensity == f26) ? false : true;
        this.arcDialLeftIntensity = f24;
        this.arcDialRightIntensity = f23;
        this.arcDialTopIntensity = f25;
        this.arcDialBottomIntensity = f26;
        float f27 = 255;
        this.arcTopPaint.setAlpha((int) (f17 * f27));
        this.arcBottomPaint.setAlpha((int) (f19 * f27));
        this.arcLeftPaint.setAlpha((int) (f21 * f27));
        this.arcRightPaint.setAlpha((int) (f22 * f27));
        this.arcDialLeftPaint.setAlpha((int) (arcDialLeftAlpha * f27));
        this.arcDialRightPaint.setAlpha((int) (arcDialRightAlpha * f27));
        this.arcDialTopPaint.setAlpha((int) (arcDialTopAlpha * f27));
        this.arcDialBottomPaint.setAlpha((int) (f15 * f27));
        this.arcTopPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcBottomPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcLeftPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        this.arcRightPaint.setStrokeWidth(this.arcStrokeWidth * this.arcHoverState.getArcThicknessMultiplier());
        if (z10) {
            m20345G();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public final ArcHoverState m20349o(ArcHoverState arcHoverState, float f10) {
        float fM30287c = (float) C7265j.m30287c(48.0d);
        arcHoverState.m20376s(0.0f);
        float f11 = fM30287c * f10;
        arcHoverState.m20377t(f11);
        arcHoverState.m20369l(0.0f);
        float f12 = (-fM30287c) * f10;
        arcHoverState.m20370m(f12);
        arcHoverState.m20371n(f11);
        arcHoverState.m20372o(0.0f);
        arcHoverState.m20373p(f12);
        arcHoverState.m20374q(0.0f);
        arcHoverState.m20375r(f10 + 1.0f);
        return arcHoverState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.stateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.intensityAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.directionHintAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.arcDialTopPaint.getAlpha() > 0) {
            int iSave = canvas.save();
            try {
                canvas.translate(this.arcHoverState.getArcTopTranslateX(), this.arcHoverState.getArcTopTranslateY());
                if (this.brightnessInfo.m16248i() > 0.5f) {
                    m20343C(this.shadowPaint, (int) (this.arcDialTopPaint.getAlpha() * (((this.brightnessInfo.m16248i() - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcDialTop, this.shadowPaint);
                }
                canvas.drawPath(this.arcDialTop, this.arcDialTopPaint);
                canvas.clipPath(this.arcDialHighlightClipPathTop);
                canvas.drawPath(this.arcDialTop, this.filledArcDialPaint);
                canvas.restoreToCount(iSave);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave);
                throw th2;
            }
        }
        if (this.arcTopPaint.getAlpha() > 0) {
            float arcTopTranslateX = this.arcHoverState.getArcTopTranslateX();
            float arcTopTranslateY = this.arcHoverState.getArcTopTranslateY();
            int iSave2 = canvas.save();
            canvas.translate(arcTopTranslateX, arcTopTranslateY);
            try {
                if (this.brightnessInfo.m16248i() > 0.5f) {
                    m20343C(this.shadowPaint, (int) (this.arcTopPaint.getAlpha() * (((this.brightnessInfo.m16248i() - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcTop, this.shadowPaint);
                }
                canvas.drawPath(this.arcTop, this.arcTopPaint);
                canvas.restoreToCount(iSave2);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave2);
                throw th3;
            }
        }
        if (this.arcDialBottomPaint.getAlpha() > 0) {
            int iSave3 = canvas.save();
            try {
                canvas.translate(this.arcHoverState.getArcBottomTranslateX(), this.arcHoverState.getArcBottomTranslateY());
                if (this.brightnessInfo.m16245a() > 0.5f) {
                    m20343C(this.shadowPaint, (int) (this.arcDialBottomPaint.getAlpha() * (((this.brightnessInfo.m16245a() - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcDialBottom, this.shadowPaint);
                }
                canvas.drawPath(this.arcDialBottom, this.arcDialBottomPaint);
                canvas.clipPath(this.arcDialHighlightClipPathBottom);
                canvas.drawPath(this.arcDialBottom, this.filledArcDialPaint);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th4) {
                canvas.restoreToCount(iSave3);
                throw th4;
            }
        }
        if (this.arcBottomPaint.getAlpha() > 0) {
            float arcBottomTranslateX = this.arcHoverState.getArcBottomTranslateX();
            float arcBottomTranslateY = this.arcHoverState.getArcBottomTranslateY();
            int iSave4 = canvas.save();
            canvas.translate(arcBottomTranslateX, arcBottomTranslateY);
            try {
                if (this.brightnessInfo.m16245a() > 0.5f) {
                    m20343C(this.shadowPaint, (int) (this.arcBottomPaint.getAlpha() * (((this.brightnessInfo.m16245a() - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcBottom, this.shadowPaint);
                }
                canvas.drawPath(this.arcBottom, this.arcBottomPaint);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th5) {
                canvas.restoreToCount(iSave4);
                throw th5;
            }
        }
        float fM16247g = this.isPreviewMirrored ? this.brightnessInfo.m16247g() : this.brightnessInfo.m16246f();
        float fM16246f = this.isPreviewMirrored ? this.brightnessInfo.m16246f() : this.brightnessInfo.m16247g();
        if (this.arcDialLeftPaint.getAlpha() > 0) {
            int iSave5 = canvas.save();
            try {
                canvas.translate(this.arcHoverState.getArcLeftTranslateX(), this.arcHoverState.getArcLeftTranslateY());
                if (fM16247g > 0.5f) {
                    m20343C(this.shadowPaint, (int) (this.arcDialLeftPaint.getAlpha() * (((fM16247g - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcDialLeft, this.shadowPaint);
                }
                canvas.drawPath(this.arcDialLeft, this.arcDialLeftPaint);
                canvas.clipPath(this.arcDialHighlightClipPathLeft);
                canvas.drawPath(this.arcDialLeft, this.filledArcDialPaint);
                canvas.restoreToCount(iSave5);
            } catch (Throwable th6) {
                canvas.restoreToCount(iSave5);
                throw th6;
            }
        }
        if (this.arcLeftPaint.getAlpha() > 0) {
            float arcLeftTranslateX = this.arcHoverState.getArcLeftTranslateX();
            float arcLeftTranslateY = this.arcHoverState.getArcLeftTranslateY();
            int iSave6 = canvas.save();
            canvas.translate(arcLeftTranslateX, arcLeftTranslateY);
            if (fM16247g > 0.5f) {
                try {
                    m20343C(this.shadowPaint, (int) (this.arcLeftPaint.getAlpha() * (((fM16247g - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcLeft, this.shadowPaint);
                } catch (Throwable th7) {
                    canvas.restoreToCount(iSave6);
                    throw th7;
                }
            }
            canvas.drawPath(this.arcLeft, this.arcLeftPaint);
            canvas.restoreToCount(iSave6);
        }
        if (this.arcDialRightPaint.getAlpha() > 0) {
            int iSave7 = canvas.save();
            try {
                canvas.translate(this.arcHoverState.getArcRightTranslateX(), this.arcHoverState.getArcRightTranslateY());
                if (fM16246f > 0.5f) {
                    m20343C(this.shadowPaint, (int) (this.arcDialRightPaint.getAlpha() * (((fM16246f - 0.5f) * 0.66f) + 0.0f)));
                    canvas.drawPath(this.arcDialRight, this.shadowPaint);
                }
                canvas.drawPath(this.arcDialRight, this.arcDialRightPaint);
                canvas.clipPath(this.arcDialHighlightClipPathRight);
                canvas.drawPath(this.arcDialRight, this.filledArcDialPaint);
                canvas.restoreToCount(iSave7);
            } catch (Throwable th8) {
                canvas.restoreToCount(iSave7);
                throw th8;
            }
        }
        if (this.arcRightPaint.getAlpha() > 0) {
            float arcRightTranslateX = this.arcHoverState.getArcRightTranslateX();
            float arcRightTranslateY = this.arcHoverState.getArcRightTranslateY();
            int iSave8 = canvas.save();
            canvas.translate(arcRightTranslateX, arcRightTranslateY);
            if (fM16246f > 0.5f) {
                try {
                    m20343C(this.shadowPaint, (int) (this.arcRightPaint.getAlpha() * ((0.66f * (fM16246f - 0.5f)) + 0.0f)));
                    canvas.drawPath(this.arcRight, this.shadowPaint);
                } finally {
                    canvas.restoreToCount(iSave8);
                }
            }
            canvas.drawPath(this.arcRight, this.arcRightPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w5, int h10, int oldw, int oldh) {
        super.onSizeChanged(w5, h10, oldw, oldh);
        m20346H();
    }

    /* JADX INFO: renamed from: p */
    public final EnumC3996c m20350p(EnumC3998e enumC3998e) {
        switch (C4000g.f16912a[enumC3998e.ordinal()]) {
            case 1:
                return EnumC3996c.Center;
            case 2:
                return EnumC3996c.Left;
            case 3:
                return EnumC3996c.Right;
            case 4:
                return EnumC3996c.Up;
            case 5:
                return EnumC3996c.Down;
            case 6:
                return EnumC3996c.None;
            case 7:
                return EnumC3996c.Finalizing;
            default:
                throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m20351q(ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ArcHoverState arcHoverState3, float f10) {
        float arcTopTranslateX = arcHoverState2.getArcTopTranslateX();
        arcHoverState.m20376s(((arcHoverState3.getArcTopTranslateX() - arcTopTranslateX) * f10) + arcTopTranslateX);
        float arcTopTranslateY = arcHoverState2.getArcTopTranslateY();
        arcHoverState.m20377t(((arcHoverState3.getArcTopTranslateY() - arcTopTranslateY) * f10) + arcTopTranslateY);
        float arcBottomTranslateX = arcHoverState2.getArcBottomTranslateX();
        arcHoverState.m20369l(((arcHoverState3.getArcBottomTranslateX() - arcBottomTranslateX) * f10) + arcBottomTranslateX);
        float arcBottomTranslateY = arcHoverState2.getArcBottomTranslateY();
        arcHoverState.m20370m(((arcHoverState3.getArcBottomTranslateY() - arcBottomTranslateY) * f10) + arcBottomTranslateY);
        float arcLeftTranslateX = arcHoverState2.getArcLeftTranslateX();
        arcHoverState.m20371n(((arcHoverState3.getArcLeftTranslateX() - arcLeftTranslateX) * f10) + arcLeftTranslateX);
        float arcLeftTranslateY = arcHoverState2.getArcLeftTranslateY();
        arcHoverState.m20372o(((arcHoverState3.getArcLeftTranslateY() - arcLeftTranslateY) * f10) + arcLeftTranslateY);
        float arcRightTranslateX = arcHoverState2.getArcRightTranslateX();
        arcHoverState.m20373p(((arcHoverState3.getArcRightTranslateX() - arcRightTranslateX) * f10) + arcRightTranslateX);
        float arcRightTranslateY = arcHoverState2.getArcRightTranslateY();
        arcHoverState.m20374q(((arcHoverState3.getArcRightTranslateY() - arcRightTranslateY) * f10) + arcRightTranslateY);
        float arcThicknessMultiplier = arcHoverState2.getArcThicknessMultiplier();
        arcHoverState.m20375r(((arcHoverState3.getArcThicknessMultiplier() - arcThicknessMultiplier) * f10) + arcThicknessMultiplier);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20352r(ArcHoverState arcHoverState) {
        return arcHoverState.getArcTopTranslateX() == 0.0f && arcHoverState.getArcTopTranslateY() == 0.0f && arcHoverState.getArcBottomTranslateX() == 0.0f && arcHoverState.getArcBottomTranslateY() == 0.0f && arcHoverState.getArcLeftTranslateX() == 0.0f && arcHoverState.getArcLeftTranslateY() == 0.0f && arcHoverState.getArcRightTranslateX() == 0.0f && arcHoverState.getArcRightTranslateY() == 0.0f && arcHoverState.getArcThicknessMultiplier() == 1.0f;
    }

    /* JADX INFO: renamed from: s */
    public final Paint m20353s() {
        Paint paintM20354t = m20354t();
        paintM20354t.setStrokeWidth(this.arcDialStrokeWidth);
        return paintM20354t;
    }

    public final void setCameraStreamBrightnessInfo(@Nullable SelfieBrightnessInfo brightnessInfo) {
        if (brightnessInfo == null) {
            brightnessInfo = new SelfieBrightnessInfo(null, 1, null);
        }
        this.brightnessInfo = brightnessInfo;
        invalidate();
    }

    public final void setIntensity(float intensity) {
        if (this.currentIntensity == intensity) {
            return;
        }
        float fM32084i = C7764d.m32084i(intensity, 0.0f, 1.0f);
        ValueAnimator valueAnimator = this.intensityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        this.intensityAnimationState = new IntensityAnimationState(0.0f, this.currentIntensity, fM32084i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(200L);
        if (this.state == EnumC3998e.Center) {
            final ArcHoverState arcHoverStateM20358b = ArcHoverState.m20358b(this.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
            final ArcHoverState arcHoverStateM20349o = m20349o(new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null), fM32084i);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq.p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.m20324A(this.f27218a, arcHoverStateM20358b, arcHoverStateM20349o, valueAnimator2);
                }
            });
        } else {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq.q
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfieOverlayView.m20325B(this.f27221a, valueAnimator2);
                }
            });
        }
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C4002i());
        valueAnimatorOfFloat.start();
        this.intensityAnimator = valueAnimatorOfFloat;
    }

    public final void setIsPreviewMirrored(boolean mirrored) {
        if (this.isPreviewMirrored == mirrored) {
            return;
        }
        this.isPreviewMirrored = mirrored;
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public final Paint m20354t() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.colorOnSurface);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.arcStrokeWidth);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    /* JADX INFO: renamed from: u */
    public final ValueAnimator m20355u(final ArcHoverState startState, final ArcHoverState endState) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SelfieOverlayView.m20340v(this.f27226a, startState, endState, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: w */
    public final Paint m20356w() {
        Paint paintM20354t = m20354t();
        paintM20354t.setStrokeWidth(this.arcStrokeWidth);
        paintM20354t.setColor(this.shadowColor);
        paintM20354t.setShadowLayer(this.arcStrokeWidth * 2, 0.0f, 0.0f, this.shadowColor);
        return paintM20354t;
    }

    /* JADX INFO: renamed from: x */
    public final void m20357x(EnumC3998e oldState, EnumC3998e newState) {
        if (oldState == newState) {
            return;
        }
        ValueAnimator valueAnimator = this.directionHintAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if (m20352r(this.arcHoverState)) {
            m20342z(newState, this);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setDuration(250L);
        final ArcHoverState arcHoverStateM20358b = ArcHoverState.m20358b(this.arcHoverState, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
        final ArcHoverState arcHoverState = new ArcHoverState(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null);
        C7758y c7758y = new C7758y();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iq.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelfieOverlayView.m20341y(this.f27223a, arcHoverStateM20358b, arcHoverState, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new C4001h(c7758y, newState, this, c7758y));
        valueAnimatorOfFloat.start();
        this.directionHintAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0082\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJj\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001e¨\u00060"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "", "", "arcTopTranslateX", "arcTopTranslateY", "arcBottomTranslateX", "arcBottomTranslateY", "arcLeftTranslateX", "arcLeftTranslateY", "arcRightTranslateX", "arcRightTranslateY", "arcThicknessMultiplier", "<init>", "(FFFFFFFFF)V", "a", "(FFFFFFFFF)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "j", "()F", "s", "(F)V", "b", "k", "t", "c", "l", "d", "m", "e", "n", "f", "o", "g", "p", "h", "q", "i", "r", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ArcHoverState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public float arcTopTranslateX;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public float arcTopTranslateY;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public float arcBottomTranslateX;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public float arcBottomTranslateY;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public float arcLeftTranslateX;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public float arcLeftTranslateY;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public float arcRightTranslateX;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public float arcRightTranslateY;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public float arcThicknessMultiplier;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ArcHoverState(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            this.arcTopTranslateX = f10;
            this.arcTopTranslateY = f11;
            this.arcBottomTranslateX = f12;
            this.arcBottomTranslateY = f13;
            this.arcLeftTranslateX = f14;
            this.arcLeftTranslateY = f15;
            this.arcRightTranslateX = f16;
            this.arcRightTranslateY = f17;
            this.arcThicknessMultiplier = f18;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ArcHoverState m20358b(ArcHoverState arcHoverState, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = arcHoverState.arcTopTranslateX;
            }
            if ((i10 & 2) != 0) {
                f11 = arcHoverState.arcTopTranslateY;
            }
            if ((i10 & 4) != 0) {
                f12 = arcHoverState.arcBottomTranslateX;
            }
            if ((i10 & 8) != 0) {
                f13 = arcHoverState.arcBottomTranslateY;
            }
            if ((i10 & 16) != 0) {
                f14 = arcHoverState.arcLeftTranslateX;
            }
            if ((i10 & 32) != 0) {
                f15 = arcHoverState.arcLeftTranslateY;
            }
            if ((i10 & 64) != 0) {
                f16 = arcHoverState.arcRightTranslateX;
            }
            if ((i10 & 128) != 0) {
                f17 = arcHoverState.arcRightTranslateY;
            }
            if ((i10 & 256) != 0) {
                f18 = arcHoverState.arcThicknessMultiplier;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f15;
            float f22 = f16;
            float f23 = f14;
            float f24 = f12;
            return arcHoverState.m20359a(f10, f11, f24, f13, f23, f21, f22, f19, f20);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ArcHoverState m20359a(float arcTopTranslateX, float arcTopTranslateY, float arcBottomTranslateX, float arcBottomTranslateY, float arcLeftTranslateX, float arcLeftTranslateY, float arcRightTranslateX, float arcRightTranslateY, float arcThicknessMultiplier) {
            return new ArcHoverState(arcTopTranslateX, arcTopTranslateY, arcBottomTranslateX, arcBottomTranslateY, arcLeftTranslateX, arcLeftTranslateY, arcRightTranslateX, arcRightTranslateY, arcThicknessMultiplier);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getArcBottomTranslateX() {
            return this.arcBottomTranslateX;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getArcBottomTranslateY() {
            return this.arcBottomTranslateY;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getArcLeftTranslateX() {
            return this.arcLeftTranslateX;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArcHoverState)) {
                return false;
            }
            ArcHoverState arcHoverState = (ArcHoverState) other;
            return Float.compare(this.arcTopTranslateX, arcHoverState.arcTopTranslateX) == 0 && Float.compare(this.arcTopTranslateY, arcHoverState.arcTopTranslateY) == 0 && Float.compare(this.arcBottomTranslateX, arcHoverState.arcBottomTranslateX) == 0 && Float.compare(this.arcBottomTranslateY, arcHoverState.arcBottomTranslateY) == 0 && Float.compare(this.arcLeftTranslateX, arcHoverState.arcLeftTranslateX) == 0 && Float.compare(this.arcLeftTranslateY, arcHoverState.arcLeftTranslateY) == 0 && Float.compare(this.arcRightTranslateX, arcHoverState.arcRightTranslateX) == 0 && Float.compare(this.arcRightTranslateY, arcHoverState.arcRightTranslateY) == 0 && Float.compare(this.arcThicknessMultiplier, arcHoverState.arcThicknessMultiplier) == 0;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getArcLeftTranslateY() {
            return this.arcLeftTranslateY;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getArcRightTranslateX() {
            return this.arcRightTranslateX;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getArcRightTranslateY() {
            return this.arcRightTranslateY;
        }

        public int hashCode() {
            return (((((((((((((((Float.hashCode(this.arcTopTranslateX) * 31) + Float.hashCode(this.arcTopTranslateY)) * 31) + Float.hashCode(this.arcBottomTranslateX)) * 31) + Float.hashCode(this.arcBottomTranslateY)) * 31) + Float.hashCode(this.arcLeftTranslateX)) * 31) + Float.hashCode(this.arcLeftTranslateY)) * 31) + Float.hashCode(this.arcRightTranslateX)) * 31) + Float.hashCode(this.arcRightTranslateY)) * 31) + Float.hashCode(this.arcThicknessMultiplier);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getArcThicknessMultiplier() {
            return this.arcThicknessMultiplier;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getArcTopTranslateX() {
            return this.arcTopTranslateX;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final float getArcTopTranslateY() {
            return this.arcTopTranslateY;
        }

        /* JADX INFO: renamed from: l */
        public final void m20369l(float f10) {
            this.arcBottomTranslateX = f10;
        }

        /* JADX INFO: renamed from: m */
        public final void m20370m(float f10) {
            this.arcBottomTranslateY = f10;
        }

        /* JADX INFO: renamed from: n */
        public final void m20371n(float f10) {
            this.arcLeftTranslateX = f10;
        }

        /* JADX INFO: renamed from: o */
        public final void m20372o(float f10) {
            this.arcLeftTranslateY = f10;
        }

        /* JADX INFO: renamed from: p */
        public final void m20373p(float f10) {
            this.arcRightTranslateX = f10;
        }

        /* JADX INFO: renamed from: q */
        public final void m20374q(float f10) {
            this.arcRightTranslateY = f10;
        }

        /* JADX INFO: renamed from: r */
        public final void m20375r(float f10) {
            this.arcThicknessMultiplier = f10;
        }

        /* JADX INFO: renamed from: s */
        public final void m20376s(float f10) {
            this.arcTopTranslateX = f10;
        }

        /* JADX INFO: renamed from: t */
        public final void m20377t(float f10) {
            this.arcTopTranslateY = f10;
        }

        @NotNull
        public String toString() {
            return "ArcHoverState(arcTopTranslateX=" + this.arcTopTranslateX + ", arcTopTranslateY=" + this.arcTopTranslateY + ", arcBottomTranslateX=" + this.arcBottomTranslateX + ", arcBottomTranslateY=" + this.arcBottomTranslateY + ", arcLeftTranslateX=" + this.arcLeftTranslateX + ", arcLeftTranslateY=" + this.arcLeftTranslateY + ", arcRightTranslateX=" + this.arcRightTranslateX + ", arcRightTranslateY=" + this.arcRightTranslateY + ", arcThicknessMultiplier=" + this.arcThicknessMultiplier + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
          (wrap float:?: TERNARY null = ((wrap int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r2v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r3v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x000b: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r4v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x0010: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r5v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x0015: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r6v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x001a: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r7v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x001f: ARITH (r11v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r8v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x0024: ARITH (r11v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r9v0 float))
          (wrap float:?: TERNARY null = ((wrap int:0x0029: ARITH (r11v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r10v0 float))
         A[MD:(float, float, float, float, float, float, float, float, float):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView.a.<init>(float, float, float, float, float, float, float, float, float):void type: THIS */
        public /* synthetic */ ArcHoverState(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & 256) != 0 ? 1.0f : f18);
        }
    }
}
