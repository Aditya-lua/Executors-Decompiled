package nq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJÿ\u0002\u0010K\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\t2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010B\u001a\u0004\u0018\u00010\t2\b\u0010D\u001a\u0004\u0018\u00010C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0E2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010EH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\rH\u0016¢\u0006\u0004\bM\u0010\u001eJ\u000f\u0010N\u001a\u00020\rH\u0016¢\u0006\u0004\bN\u0010\u001eJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010RJ!\u0010S\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010WJ1\u0010[\u001a\u00020\r2\b\u0010X\u001a\u0004\u0018\u00010\t2\b\u0010Y\u001a\u0004\u0018\u00010\t2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b_\u0010^J\u001d\u0010`\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b`\u0010^J\u001d\u0010a\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\ba\u0010^J\u001d\u0010b\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\bb\u0010^R\u0014\u0010d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010jR\u0014\u0010n\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010mR\u0016\u0010o\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\u0019R\u0016\u0010p\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0016\u0010q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0016\u0010r\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0016\u0010s\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u0019R\u0016\u0010u\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010\u0019R\u0016\u0010w\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010\u0019R\u0016\u0010x\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0014\u0010|\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bv\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, d2 = {"Lnq/q;", "Lnq/r0;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "Landroid/widget/TextView;", BuildConfig.FLAVOR, Text.type, BuildConfig.FLAVOR, "hideVisibility", BuildConfig.FLAVOR, "c0", "(Landroid/widget/TextView;Ljava/lang/String;I)V", BuildConfig.FLAVOR, "finalizingCoverVisible", "T", "(Z)V", "hintMessage", "hintDescription", "e0", "(Ljava/lang/String;Ljava/lang/String;)V", "messageTitle", "Z", "(Ljava/lang/String;)V", "messageBody", "W", "a", "()V", "Ljr/a;", "systemUiController", "titleText", "autoCaptureText", "realTimeHintText", "captureSuccessText", "disclaimerText", "hintAutoCaptureTimeoutText", "hintVerifyingText", "isAutoCaptureOn", "isFlashEnabled", "mirrorPreview", "isInitializing", "showCameraCover", "isFinalizing", "nextCameraContentDescription", "isNextCameraButtonVisible", "isNextCameraButtonEnabled", "isToggleFlashButtonVisible", "isToggleFlashButtonEnabled", "isCaptureButtonVisible", "isCaptureButtonEnabled", "isCountingDown", "isCapturing", "Lir/a;", "navigationState", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "overlayState", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", "watermarkText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onNextCameraClick", "onToggleFlashClick", "onBackClick", "onCancelClick", "onCaptureClick", "e", "(Ljr/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;ZZZZZZZZLir/a;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FLxn/b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "c", "m", "strictSelfie", "Lnq/s0;", "o", "(Z)Lnq/s0;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ljr/a;)V", "countdownNumber", "f", "(I)V", "nextHintMessage", "nextHintDescription", "onComplete", "d", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "l", "(Lkotlin/jvm/functions/Function0;)V", "g", "p", "n", "h", "I", "confirmHapticFeedbackConst", "Loq/c;", "b", "Loq/c;", "binding", "Ldv/c0;", "Ldv/c0;", "realTimeHintFlow", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "lifecycleScope", "isPlayingSuccessAnimation", "isCameraCoverAnimatingOut", "isHintTitleAnimatingOut", "isHintTitleAnimatingIn", "isHintBodyAnimatingOut", "j", "isHintBodyAnimatingIn", "k", "isFinalizingCoverAnimatingIn", "isFinalizingCoverAnimatingOut", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2PreviewView", "Landroidx/camera/view/PreviewView;", "()Landroidx/camera/view/PreviewView;", "cameraXPreviewView", "M", "pointOfInterestView", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int confirmHapticFeedbackConst;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oq.c binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.c0<String> realTimeHintFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.m lifecycleScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isPlayingSuccessAnimation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isCameraCoverAnimatingOut;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isHintTitleAnimatingOut;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isHintTitleAnimatingIn;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isHintBodyAnimatingOut;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isHintBodyAnimatingIn;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isFinalizingCoverAnimatingIn;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isFinalizingCoverAnimatingOut;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isFlashEnabled;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController$onViewCreated$3", f = "BasicSelfieCaptureViewController.kt", l = {105}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26575t;

        /* JADX INFO: renamed from: nq.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0529a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f26577a;

            public C0529a(q qVar) {
                this.f26577a = qVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, eu.b<? super Unit> bVar) {
                q qVar = this.f26577a;
                TextView realTimeHint = qVar.binding.f28366v;
                Intrinsics.checkNotNullExpressionValue(realTimeHint, "realTimeHint");
                q.d0(qVar, realTimeHint, str, 0, 2, null);
                return Unit.f21506a;
            }
        }

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return q.this.new a(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26575t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarL = dv.j.l(q.this.realTimeHintFlow, 300L);
                C0529a c0529a = new C0529a(q.this);
                this.f26575t = 1;
                if (hVarL.collect(c0529a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public q(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.confirmHapticFeedbackConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
        oq.c cVarC = oq.c.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
        this.binding = cVarC;
        this.realTimeHintFlow = dv.r0.a(null);
        Context context2 = cVarC.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.lifecycleScope = androidx.p000lifecycle.t.a(xq.g.i(context2));
    }

    public static final void I(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void J(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void K(q qVar, oq.c cVar) {
        qVar.isCameraCoverAnimatingOut = false;
        cVar.f28351g.setVisibility(8);
    }

    public static final void L(oq.c cVar, Function0 function0, View view) {
        cVar.f28349e.setEnabled(false);
        function0.invoke();
    }

    public static final Unit N(q qVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space topSpace = qVar.binding.F;
        Intrinsics.checkNotNullExpressionValue(topSpace, "topSpace");
        ViewGroup.LayoutParams layoutParams = topSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new zt.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.top;
        topSpace.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit O(q qVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomSpace = qVar.binding.f28348d;
        Intrinsics.checkNotNullExpressionValue(bottomSpace, "bottomSpace");
        ViewGroup.LayoutParams layoutParams = bottomSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new zt.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomSpace.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public static final Unit P(oq.c cVar) {
        cVar.f28370z.setIntensity(0.0f);
        return Unit.f21506a;
    }

    public static final Unit Q(q qVar, String str, String str2, Function0 function0) {
        qVar.isPlayingSuccessAnimation = false;
        qVar.e0(str, str2);
        function0.invoke();
        return Unit.f21506a;
    }

    public static final Unit R() {
        return Unit.f21506a;
    }

    public static final Unit S() {
        return Unit.f21506a;
    }

    public static final void U(q qVar) {
        qVar.isFinalizingCoverAnimatingIn = false;
    }

    public static final void V(q qVar, FrameLayout frameLayout) {
        qVar.isFinalizingCoverAnimatingOut = false;
        frameLayout.setVisibility(8);
    }

    public static final void X(q qVar) {
        qVar.isHintBodyAnimatingOut = false;
    }

    public static final void Y(q qVar) {
        qVar.isHintBodyAnimatingIn = false;
    }

    public static final void a0(q qVar) {
        qVar.isHintTitleAnimatingOut = false;
    }

    public static final void b0(q qVar) {
        qVar.isHintTitleAnimatingIn = false;
    }

    public static /* synthetic */ void d0(q qVar, TextView textView, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        qVar.c0(textView, str, i10);
    }

    @Override // nq.r0
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public PreviewView b() {
        PreviewView previewviewSelfieCamera = this.binding.f28364t;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        return previewviewSelfieCamera;
    }

    public final void T(boolean finalizingCoverVisible) {
        final FrameLayout finalizingCover = this.binding.f28356l;
        Intrinsics.checkNotNullExpressionValue(finalizingCover, "finalizingCover");
        if (!finalizingCoverVisible) {
            if (finalizingCover.getVisibility() == 8 || this.isFinalizingCoverAnimatingOut) {
                return;
            }
            this.isFinalizingCoverAnimatingIn = false;
            this.isFinalizingCoverAnimatingOut = true;
            finalizingCover.animate().cancel();
            finalizingCover.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: nq.e
                @Override // java.lang.Runnable
                public final void run() {
                    q.V(this.f26476a, finalizingCover);
                }
            });
            return;
        }
        if (finalizingCover.getVisibility() == 0 || this.isFinalizingCoverAnimatingIn) {
            return;
        }
        this.isFinalizingCoverAnimatingIn = true;
        this.isFinalizingCoverAnimatingOut = false;
        finalizingCover.setVisibility(0);
        finalizingCover.setAlpha(0.0f);
        finalizingCover.animate().cancel();
        finalizingCover.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: nq.d
            @Override // java.lang.Runnable
            public final void run() {
                q.U(this.f26474a);
            }
        });
    }

    public final void W(String messageBody) {
        oq.c cVar = this.binding;
        if (messageBody == null || StringsKt.p0(messageBody)) {
            if (cVar.f28357m.getAlpha() == 0.0f || this.isHintBodyAnimatingOut) {
                return;
            }
            this.isHintBodyAnimatingIn = false;
            this.isHintBodyAnimatingOut = true;
            cVar.f28357m.animate().cancel();
            cVar.f28357m.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: nq.b
                @Override // java.lang.Runnable
                public final void run() {
                    q.X(this.f26470a);
                }
            });
            return;
        }
        cVar.f28357m.setText(messageBody);
        if (cVar.f28357m.getAlpha() == 1.0f || this.isHintBodyAnimatingIn) {
            return;
        }
        this.isHintBodyAnimatingIn = true;
        this.isHintBodyAnimatingOut = false;
        cVar.f28357m.animate().cancel();
        cVar.f28357m.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: nq.c
            @Override // java.lang.Runnable
            public final void run() {
                q.Y(this.f26472a);
            }
        });
    }

    public final void Z(String messageTitle) {
        oq.c cVar = this.binding;
        if (messageTitle == null || StringsKt.p0(messageTitle)) {
            if (cVar.f28358n.getAlpha() == 0.0f || this.isHintTitleAnimatingOut) {
                return;
            }
            this.isHintTitleAnimatingIn = false;
            this.isHintTitleAnimatingOut = true;
            cVar.f28358n.animate().cancel();
            cVar.f28358n.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: nq.f
                @Override // java.lang.Runnable
                public final void run() {
                    q.a0(this.f26478a);
                }
            });
            return;
        }
        cVar.f28358n.setText(messageTitle);
        if (cVar.f28358n.getAlpha() == 1.0f || this.isHintTitleAnimatingIn) {
            return;
        }
        this.isHintTitleAnimatingIn = true;
        this.isHintTitleAnimatingOut = false;
        cVar.f28358n.animate().cancel();
        cVar.f28358n.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: nq.g
            @Override // java.lang.Runnable
            public final void run() {
                q.b0(this.f26480a);
            }
        });
    }

    @Override // nq.r0
    public void a() {
        Space topSpace = this.binding.F;
        Intrinsics.checkNotNullExpressionValue(topSpace, "topSpace");
        kr.g.g(topSpace, new Function1() { // from class: nq.k
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.N(this.f26488a, (WindowInsetsCompat) obj);
            }
        });
        Space bottomSpace = this.binding.f28348d;
        Intrinsics.checkNotNullExpressionValue(bottomSpace, "bottomSpace");
        kr.g.g(bottomSpace, new Function1() { // from class: nq.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.O(this.f26548a, (WindowInsetsCompat) obj);
            }
        });
        av.k.d(this.lifecycleScope, null, null, new a(null), 3, null);
    }

    @Override // nq.r0
    public void c() {
        this.binding.f28369y.setVisibility(0);
    }

    public final void c0(TextView textView, String str, int i10) {
        if (str == null || StringsKt.p0(str)) {
            textView.setVisibility(i10);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // nq.r0
    public void d(@Nullable final String nextHintMessage, @Nullable final String nextHintDescription, @NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        final oq.c cVar = this.binding;
        ConstraintLayout constraintLayoutB = cVar.getRoot();
        constraintLayoutB.setHapticFeedbackEnabled(true);
        constraintLayoutB.performHapticFeedback(this.confirmHapticFeedbackConst, 2);
        cVar.f28370z.setIntensity(1.0f);
        this.isPlayingSuccessAnimation = true;
        View cover = cVar.f28354j;
        Intrinsics.checkNotNullExpressionValue(cover, "cover");
        v.g(cover, new Function0() { // from class: nq.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.P(cVar);
            }
        }, new Function0() { // from class: nq.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.Q(this.f26482a, nextHintMessage, nextHintDescription, onComplete);
            }
        });
        TextView captureSuccess = cVar.f28352h;
        Intrinsics.checkNotNullExpressionValue(captureSuccess, "captureSuccess");
        v.g(captureSuccess, new Function0() { // from class: nq.i
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.R();
            }
        }, new Function0() { // from class: nq.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.S();
            }
        });
    }

    @Override // nq.r0
    public void e(@Nullable jr.a systemUiController, @Nullable String titleText, @Nullable String autoCaptureText, @Nullable String realTimeHintText, @Nullable String hintMessage, @Nullable String hintDescription, @Nullable String captureSuccessText, @Nullable String disclaimerText, @Nullable String hintAutoCaptureTimeoutText, @Nullable String hintVerifyingText, boolean isAutoCaptureOn, boolean isFlashEnabled, boolean mirrorPreview, boolean isInitializing, boolean showCameraCover, boolean isFinalizing, @Nullable String nextCameraContentDescription, boolean isNextCameraButtonVisible, boolean isNextCameraButtonEnabled, boolean isToggleFlashButtonVisible, boolean isToggleFlashButtonEnabled, boolean isCaptureButtonVisible, boolean isCaptureButtonEnabled, boolean isCountingDown, boolean isCapturing, @NotNull ir.a navigationState, @Nullable String navBarTitle, @Nullable TextBasedComponentStyle navBarTitleStyle, @NotNull SelfieOverlayView.e overlayState, float poseScore, @Nullable xn.b brightnessInfo, @Nullable String watermarkText, @Nullable StepStyles.SelfieStepStyle styles, @NotNull final Function0<Unit> onNextCameraClick, @NotNull final Function0<Unit> onToggleFlashClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @Nullable final Function0<Unit> onCaptureClick) {
        int i10;
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(overlayState, "overlayState");
        Intrinsics.checkNotNullParameter(onNextCameraClick, "onNextCameraClick");
        Intrinsics.checkNotNullParameter(onToggleFlashClick, "onToggleFlashClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        final oq.c cVar = this.binding;
        TextView title = cVar.C;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        d0(this, title, titleText, 0, 2, null);
        TextView autoCaptureDisclaimer = cVar.b;
        Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
        c0(autoCaptureDisclaimer, autoCaptureText, 4);
        TextView selfieCaptureDisclaimer = cVar.f28368x;
        Intrinsics.checkNotNullExpressionValue(selfieCaptureDisclaimer, "selfieCaptureDisclaimer");
        d0(this, selfieCaptureDisclaimer, disclaimerText, 0, 2, null);
        this.realTimeHintFlow.setValue(realTimeHintText);
        e0(hintMessage, hintDescription);
        if (isAutoCaptureOn) {
            cVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(mq.w.b, 0, 0, 0);
            cVar.f28347c.setVisibility(0);
        } else {
            cVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(mq.w.f24128a, 0, 0, 0);
            cVar.f28347c.setVisibility(8);
        }
        if (captureSuccessText == null || StringsKt.p0(captureSuccessText)) {
            cVar.f28352h.setCompoundDrawablePadding(0);
            cVar.f28352h.setText((CharSequence) null);
        } else {
            cVar.f28352h.setCompoundDrawablePadding((int) xq.j.a(16.0d));
            cVar.f28352h.setText(captureSuccessText);
        }
        if (this.isFlashEnabled != isFlashEnabled || cVar.E.getContentDescription() == null) {
            this.isFlashEnabled = isFlashEnabled;
            if (isFlashEnabled) {
                cVar.E.setImageResource(jq.d.b);
                cVar.E.setContentDescription(cVar.getRoot().getContext().getString(jq.g.X));
            } else {
                cVar.E.setImageResource(jq.d.f20854a);
                cVar.E.setContentDescription(cVar.getRoot().getContext().getString(jq.g.Y));
            }
        }
        if (nextCameraContentDescription != null) {
            cVar.f28361q.setContentDescription(nextCameraContentDescription);
        }
        cVar.f28361q.setOnClickListener(new View.OnClickListener() { // from class: nq.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.I(onNextCameraClick, view);
            }
        });
        cVar.E.setOnClickListener(new View.OnClickListener() { // from class: nq.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.J(onToggleFlashClick, view);
            }
        });
        cVar.f28370z.setIsPreviewMirrored(mirrorPreview);
        cVar.f28370z.setCameraStreamBrightnessInfo(brightnessInfo);
        if (!this.isPlayingSuccessAnimation) {
            cVar.f28370z.setIntensity(poseScore);
        }
        SelfieOverlayView.E(cVar.f28370z, overlayState, false, 2, null);
        if (isInitializing) {
            cVar.f28359o.setVisibility(0);
        } else {
            cVar.f28359o.setVisibility(8);
        }
        Pi2NavigationBar navigationBar = cVar.f28360p;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        xr.c.e(navigationState, onBackClick, onCancelClick, null, navigationBar, constraintLayoutB, styles != null ? sr.h.h(styles) : null, navBarTitle, navBarTitleStyle, 8, null);
        if (showCameraCover) {
            cVar.f28351g.setVisibility(0);
            cVar.f28351g.setAlpha(1.0f);
        } else if (!this.isCameraCoverAnimatingOut) {
            this.isCameraCoverAnimatingOut = true;
            cVar.f28351g.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: nq.o
                @Override // java.lang.Runnable
                public final void run() {
                    q.K(this.f26556a, cVar);
                }
            });
        }
        T(isFinalizing);
        if (isNextCameraButtonVisible) {
            i10 = 0;
            cVar.f28361q.setVisibility(0);
        } else {
            i10 = 0;
            cVar.f28361q.setVisibility(4);
        }
        if (isToggleFlashButtonVisible) {
            cVar.E.setVisibility(i10);
        } else {
            cVar.E.setVisibility(4);
        }
        if (isCaptureButtonVisible) {
            cVar.f28349e.setVisibility(i10);
        } else {
            cVar.f28349e.setVisibility(4);
        }
        cVar.f28361q.setEnabled(isNextCameraButtonEnabled);
        cVar.E.setEnabled(isToggleFlashButtonEnabled);
        cVar.f28349e.setEnabled(isCaptureButtonEnabled);
        if (onCaptureClick != null) {
            cVar.f28349e.setOnClickListener(new View.OnClickListener() { // from class: nq.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q.L(cVar, onCaptureClick, view);
                }
            });
        }
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            cVar.G.setVisibility(8);
        } else {
            cVar.G.setText(watermarkText);
            cVar.G.setVisibility(0);
        }
    }

    public final void e0(String hintMessage, String hintDescription) {
        if (this.isPlayingSuccessAnimation) {
            Z(null);
            W(null);
        } else {
            Z(hintMessage);
            W(hintDescription);
        }
    }

    @Override // nq.r0
    public void f(int countdownNumber) {
        oq.c cVar = this.binding;
        if (Intrinsics.c(cVar.f28353i.getTag(), Integer.valueOf(countdownNumber))) {
            return;
        }
        TextView countdown = cVar.f28353i;
        Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
        v.e(countdown);
        cVar.f28353i.setText(String.valueOf(countdownNumber));
        cVar.f28353i.setTag(Integer.valueOf(countdownNumber));
    }

    @Override // nq.r0
    public void g(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // nq.r0
    @NotNull
    public View getRoot() {
        ConstraintLayout constraintLayoutB = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // nq.r0
    public void h(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // nq.r0
    public void i(@NotNull StepStyles.SelfieStepStyle styles, @Nullable jr.a systemUiController) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value;
        Intrinsics.checkNotNullParameter(styles, "styles");
        oq.c cVar = this.binding;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView hintMessageTitle = cVar.f28358n;
            Intrinsics.checkNotNullExpressionValue(hintMessageTitle, "hintMessageTitle");
            yr.h0.k(hintMessageTitle, titleStyleValue, p001kotlin.collections.p0.c(yr.e0.Margin));
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView hintMessageBody = cVar.f28357m;
            Intrinsics.checkNotNullExpressionValue(hintMessageBody, "hintMessageBody");
            yr.h0.k(hintMessageBody, textStyleValue, p001kotlin.collections.p0.c(yr.e0.Margin));
            Integer textColorValue = textStyleValue.getTextColorValue();
            if (textColorValue != null) {
                int iIntValue = textColorValue.intValue();
                cVar.E.setImageTintList(ColorStateList.valueOf(iIntValue));
                cVar.f28361q.setImageTintList(ColorStateList.valueOf(iIntValue));
            }
        }
        TextBasedComponentStyle selfieSmallText = styles.getSelfieSmallText();
        if (selfieSmallText != null) {
            TextView autoCaptureDisclaimer = cVar.b;
            Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
            yr.h0.k(autoCaptureDisclaimer, selfieSmallText, p001kotlin.collections.p0.c(yr.e0.Margin));
            AttributeStyles.TextBasedTextColorStyle textColor = selfieSmallText.getTextColor();
            if (textColor != null && (base3 = textColor.getBase()) != null && (base4 = base3.getBase()) != null && (value = base4.getValue()) != null) {
                cVar.b.setCompoundDrawableTintList(ColorStateList.valueOf(value.intValue()));
            }
        }
        TextBasedComponentStyle selfieCaptureDisclaimerTextStyle = styles.getSelfieCaptureDisclaimerTextStyle();
        if (selfieCaptureDisclaimerTextStyle != null) {
            TextView selfieCaptureDisclaimer = cVar.f28368x;
            Intrinsics.checkNotNullExpressionValue(selfieCaptureDisclaimer, "selfieCaptureDisclaimer");
            yr.h0.l(selfieCaptureDisclaimer, selfieCaptureDisclaimerTextStyle, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue2 = backgroundColorValue.intValue();
            cVar.A.setBackgroundColor(iIntValue2);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, iIntValue2);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = as.d.a(styles, context2);
        if (drawableA != null) {
            cVar.A.setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f28360p.setControlsColor(headerButtonColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.B.setGuidelineBegin((int) xq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f28355k.setGuidelineEnd((int) xq.j.a(dp2.doubleValue()));
    }

    @Override // nq.r0
    @NotNull
    public Camera2PreviewView j() {
        Camera2PreviewView camera2Preview = this.binding.f28350f;
        Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
        return camera2Preview;
    }

    @Override // nq.r0
    @NotNull
    public PreviewView k() {
        PreviewView previewviewSelfieCamera = this.binding.f28364t;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        return previewviewSelfieCamera;
    }

    @Override // nq.r0
    public void l(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // nq.r0
    public void m() {
        this.binding.f28369y.setVisibility(8);
    }

    @Override // nq.r0
    public void n(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // nq.r0
    @NotNull
    public s0 o(boolean strictSelfie) {
        return new s0(strictSelfie ? 0.45d : 0.35d, 0.8d);
    }

    @Override // nq.r0
    public void p(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }
}
