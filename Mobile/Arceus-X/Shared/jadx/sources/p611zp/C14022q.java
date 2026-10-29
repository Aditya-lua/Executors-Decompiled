package p611zp;

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
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import aq.C1139c;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import er.C5199h;
import ir.C6966c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lr.C8244d;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7259g;
import p226jq.C7265j;
import p227jr.C7304h0;
import p227jr.EnumC7298e0;
import p229jt.C7348o;
import p229jt.C7353t;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p497vp.C12241d;
import p497vp.C12244g;
import p498vq.C12247a;
import p526wq.C12524g;
import p584yp.C13382q;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zp.q */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJÿ\u0002\u0010K\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\t2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010B\u001a\u0004\u0018\u00010\t2\b\u0010D\u001a\u0004\u0018\u00010C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0E2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010EH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\rH\u0016¢\u0006\u0004\bM\u0010\u001eJ\u000f\u0010N\u001a\u00020\rH\u0016¢\u0006\u0004\bN\u0010\u001eJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010RJ!\u0010S\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010WJ1\u0010[\u001a\u00020\r2\b\u0010X\u001a\u0004\u0018\u00010\t2\b\u0010Y\u001a\u0004\u0018\u00010\t2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b_\u0010^J\u001d\u0010`\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b`\u0010^J\u001d\u0010a\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\ba\u0010^J\u001d\u0010b\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\bb\u0010^R\u0014\u0010d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010jR\u0014\u0010n\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010mR\u0016\u0010o\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\u0019R\u0016\u0010p\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0016\u0010q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0016\u0010r\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0016\u0010t\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010\u0019R\u0016\u0010v\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010\u0019R\u0016\u0010w\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0016\u0010x\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\u0019R\u0014\u0010|\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bu\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, m31665d2 = {"Lzp/q;", "Lzp/r0;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "Landroid/widget/TextView;", "", Text.type, "", "hideVisibility", "", "c0", "(Landroid/widget/TextView;Ljava/lang/String;I)V", "", "finalizingCoverVisible", "T", "(Z)V", "hintMessage", "hintDescription", "e0", "(Ljava/lang/String;Ljava/lang/String;)V", "messageTitle", "Z", "(Ljava/lang/String;)V", "messageBody", "W", "a", "()V", "Lvq/a;", "systemUiController", "titleText", "autoCaptureText", "realTimeHintText", "captureSuccessText", "disclaimerText", "hintAutoCaptureTimeoutText", "hintVerifyingText", "isAutoCaptureOn", "isFlashEnabled", "mirrorPreview", "isInitializing", "showCameraCover", "isFinalizing", "nextCameraContentDescription", "isNextCameraButtonVisible", "isNextCameraButtonEnabled", "isToggleFlashButtonVisible", "isToggleFlashButtonEnabled", "isCaptureButtonVisible", "isCaptureButtonEnabled", "isCountingDown", "isCapturing", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "overlayState", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "watermarkText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onNextCameraClick", "onToggleFlashClick", "onBackClick", "onCancelClick", "onCaptureClick", "d", "(Lvq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;ZZZZZZZZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "c", "l", "strictSelfie", "Lzp/s0;", "o", "(Z)Lzp/s0;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;)V", "countdownNumber", "f", "(I)V", "nextHintMessage", "nextHintDescription", "onComplete", "e", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "k", "(Lkotlin/jvm/functions/Function0;)V", "g", "p", "m", "h", "I", "confirmHapticFeedbackConst", "Laq/c;", "b", "Laq/c;", "binding", "Lnu/c0;", "Lnu/c0;", "realTimeHintFlow", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "lifecycleScope", "isPlayingSuccessAnimation", "isCameraCoverAnimatingOut", "isHintTitleAnimatingOut", "isHintTitleAnimatingIn", "i", "isHintBodyAnimatingOut", "j", "isHintBodyAnimatingIn", "isFinalizingCoverAnimatingIn", "isFinalizingCoverAnimatingOut", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2PreviewView", "Landroidx/camera/view/PreviewView;", "()Landroidx/camera/view/PreviewView;", "cameraXPreviewView", "M", "pointOfInterestView", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C14022q implements InterfaceC14025r0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int confirmHapticFeedbackConst;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1139c binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<String> realTimeHintFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC0968m lifecycleScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isPlayingSuccessAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isCameraCoverAnimatingOut;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isHintTitleAnimatingOut;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isHintTitleAnimatingIn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isHintBodyAnimatingOut;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isHintBodyAnimatingIn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isFinalizingCoverAnimatingIn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isFinalizingCoverAnimatingOut;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isFlashEnabled;

    /* JADX INFO: renamed from: zp.q$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController$onViewCreated$3", m39664f = "BasicSelfieCaptureViewController.kt", m39665l = {105}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f49025t;

        /* JADX INFO: renamed from: zp.q$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14300a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C14022q f49027a;

            public C14300a(C14022q c14022q) {
                this.f49027a = c14022q;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14022q c14022q = this.f49027a;
                TextView realTimeHint = c14022q.binding.f4719v;
                Intrinsics.checkNotNullExpressionValue(realTimeHint, "realTimeHint");
                C14022q.m50660d0(c14022q, realTimeHint, str, 0, 2, null);
                return Unit.f29331a;
            }
        }

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C14022q.this.new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f49025t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37795l = C9579j.m37795l(C14022q.this.realTimeHintFlow, 300L);
                C14300a c14300a = new C14300a(C14022q.this);
                this.f49025t = 1;
                if (interfaceC9575hM37795l.collect(c14300a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C14022q(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.confirmHapticFeedbackConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
        C1139c c1139cM6468c = C1139c.m6468c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c1139cM6468c, "inflate(...)");
        this.binding = c1139cM6468c;
        this.realTimeHintFlow = C9596r0.m37859a(null);
        Context context2 = c1139cM6468c.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.lifecycleScope = C0982t.m4979a(C7259g.m30275i(context2));
    }

    /* JADX INFO: renamed from: I */
    public static final void m50644I(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: J */
    public static final void m50645J(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: K */
    public static final void m50646K(C14022q c14022q, C1139c c1139c) {
        c14022q.isCameraCoverAnimatingOut = false;
        c1139c.f4704g.setVisibility(8);
    }

    /* JADX INFO: renamed from: L */
    public static final void m50647L(C1139c c1139c, Function0 function0, View view) {
        c1139c.f4702e.setEnabled(false);
        function0.invoke();
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m50648N(C14022q c14022q, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space topSpace = c14022q.binding.f4696F;
        Intrinsics.checkNotNullExpressionValue(topSpace, "topSpace");
        ViewGroup.LayoutParams layoutParams = topSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new C7353t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.top;
        topSpace.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m50649O(C14022q c14022q, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomSpace = c14022q.binding.f4701d;
        Intrinsics.checkNotNullExpressionValue(bottomSpace, "bottomSpace");
        ViewGroup.LayoutParams layoutParams = bottomSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new C7353t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomSpace.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m50650P(C1139c c1139c) {
        c1139c.f4723z.setIntensity(0.0f);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m50651Q(C14022q c14022q, String str, String str2, Function0 function0) {
        c14022q.isPlayingSuccessAnimation = false;
        c14022q.m50681e0(str, str2);
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m50652R() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m50653S() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final void m50654U(C14022q c14022q) {
        c14022q.isFinalizingCoverAnimatingIn = false;
    }

    /* JADX INFO: renamed from: V */
    public static final void m50655V(C14022q c14022q, FrameLayout frameLayout) {
        c14022q.isFinalizingCoverAnimatingOut = false;
        frameLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: X */
    public static final void m50656X(C14022q c14022q) {
        c14022q.isHintBodyAnimatingOut = false;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m50657Y(C14022q c14022q) {
        c14022q.isHintBodyAnimatingIn = false;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m50658a0(C14022q c14022q) {
        c14022q.isHintTitleAnimatingOut = false;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m50659b0(C14022q c14022q) {
        c14022q.isHintTitleAnimatingIn = false;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m50660d0(C14022q c14022q, TextView textView, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        c14022q.m50678c0(textView, str, i10);
    }

    /* JADX DEBUG: Method merged with bridge method: b()Landroid/view/View; */
    @Override // p611zp.InterfaceC14025r0
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public PreviewView mo50676b() {
        PreviewView previewviewSelfieCamera = this.binding.f4717t;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        return previewviewSelfieCamera;
    }

    /* JADX INFO: renamed from: T */
    public final void m50672T(boolean finalizingCoverVisible) {
        final FrameLayout finalizingCover = this.binding.f4709l;
        Intrinsics.checkNotNullExpressionValue(finalizingCover, "finalizingCover");
        if (!finalizingCoverVisible) {
            if (finalizingCover.getVisibility() == 8 || this.isFinalizingCoverAnimatingOut) {
                return;
            }
            this.isFinalizingCoverAnimatingIn = false;
            this.isFinalizingCoverAnimatingOut = true;
            finalizingCover.animate().cancel();
            finalizingCover.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: zp.e
                @Override // java.lang.Runnable
                public final void run() {
                    C14022q.m50655V(this.f48913a, finalizingCover);
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
        finalizingCover.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: zp.d
            @Override // java.lang.Runnable
            public final void run() {
                C14022q.m50654U(this.f48910a);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m50673W(String messageBody) {
        C1139c c1139c = this.binding;
        if (messageBody == null || StringsKt.m32182p0(messageBody)) {
            if (c1139c.f4710m.getAlpha() == 0.0f || this.isHintBodyAnimatingOut) {
                return;
            }
            this.isHintBodyAnimatingIn = false;
            this.isHintBodyAnimatingOut = true;
            c1139c.f4710m.animate().cancel();
            c1139c.f4710m.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: zp.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14022q.m50656X(this.f48906a);
                }
            });
            return;
        }
        c1139c.f4710m.setText(messageBody);
        if (c1139c.f4710m.getAlpha() == 1.0f || this.isHintBodyAnimatingIn) {
            return;
        }
        this.isHintBodyAnimatingIn = true;
        this.isHintBodyAnimatingOut = false;
        c1139c.f4710m.animate().cancel();
        c1139c.f4710m.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: zp.c
            @Override // java.lang.Runnable
            public final void run() {
                C14022q.m50657Y(this.f48908a);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m50674Z(String messageTitle) {
        C1139c c1139c = this.binding;
        if (messageTitle == null || StringsKt.m32182p0(messageTitle)) {
            if (c1139c.f4711n.getAlpha() == 0.0f || this.isHintTitleAnimatingOut) {
                return;
            }
            this.isHintTitleAnimatingIn = false;
            this.isHintTitleAnimatingOut = true;
            c1139c.f4711n.animate().cancel();
            c1139c.f4711n.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: zp.f
                @Override // java.lang.Runnable
                public final void run() {
                    C14022q.m50658a0(this.f48917a);
                }
            });
            return;
        }
        c1139c.f4711n.setText(messageTitle);
        if (c1139c.f4711n.getAlpha() == 1.0f || this.isHintTitleAnimatingIn) {
            return;
        }
        this.isHintTitleAnimatingIn = true;
        this.isHintTitleAnimatingOut = false;
        c1139c.f4711n.animate().cancel();
        c1139c.f4711n.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: zp.g
            @Override // java.lang.Runnable
            public final void run() {
                C14022q.m50659b0(this.f48919a);
            }
        });
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: a */
    public void mo50675a() {
        Space topSpace = this.binding.f4696F;
        Intrinsics.checkNotNullExpressionValue(topSpace, "topSpace");
        C12524g.m46876g(topSpace, new Function1() { // from class: zp.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14022q.m50648N(this.f48928a, (WindowInsetsCompat) obj);
            }
        });
        Space bottomSpace = this.binding.f4701d;
        Intrinsics.checkNotNullExpressionValue(bottomSpace, "bottomSpace");
        C12524g.m46876g(bottomSpace, new Function1() { // from class: zp.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14022q.m50649O(this.f48992a, (WindowInsetsCompat) obj);
            }
        });
        C7882k.m32780d(this.lifecycleScope, null, null, new a(null), 3, null);
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: c */
    public void mo50677c() {
        this.binding.f4722y.setVisibility(0);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m50678c0(TextView textView, String str, int i10) {
        if (str == null || StringsKt.m32182p0(str)) {
            textView.setVisibility(i10);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: d */
    public void mo50679d(@Nullable C12247a systemUiController, @Nullable String titleText, @Nullable String autoCaptureText, @Nullable String realTimeHintText, @Nullable String hintMessage, @Nullable String hintDescription, @Nullable String captureSuccessText, @Nullable String disclaimerText, @Nullable String hintAutoCaptureTimeoutText, @Nullable String hintVerifyingText, boolean isAutoCaptureOn, boolean isFlashEnabled, boolean mirrorPreview, boolean isInitializing, boolean showCameraCover, boolean isFinalizing, @Nullable String nextCameraContentDescription, boolean isNextCameraButtonVisible, boolean isNextCameraButtonEnabled, boolean isToggleFlashButtonVisible, boolean isToggleFlashButtonEnabled, boolean isCaptureButtonVisible, boolean isCaptureButtonEnabled, boolean isCountingDown, boolean isCapturing, @NotNull NavigationState navigationState, @Nullable String navBarTitle, @Nullable TextBasedComponentStyle navBarTitleStyle, @NotNull SelfieOverlayView.EnumC3998e overlayState, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @Nullable String watermarkText, @Nullable StepStyles.SelfieStepStyle styles, @NotNull final Function0<Unit> onNextCameraClick, @NotNull final Function0<Unit> onToggleFlashClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @Nullable final Function0<Unit> onCaptureClick) {
        int i10;
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(overlayState, "overlayState");
        Intrinsics.checkNotNullParameter(onNextCameraClick, "onNextCameraClick");
        Intrinsics.checkNotNullParameter(onToggleFlashClick, "onToggleFlashClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        final C1139c c1139c = this.binding;
        TextView title = c1139c.f4693C;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        m50660d0(this, title, titleText, 0, 2, null);
        TextView autoCaptureDisclaimer = c1139c.f4699b;
        Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
        m50678c0(autoCaptureDisclaimer, autoCaptureText, 4);
        TextView selfieCaptureDisclaimer = c1139c.f4721x;
        Intrinsics.checkNotNullExpressionValue(selfieCaptureDisclaimer, "selfieCaptureDisclaimer");
        m50660d0(this, selfieCaptureDisclaimer, disclaimerText, 0, 2, null);
        this.realTimeHintFlow.setValue(realTimeHintText);
        m50681e0(hintMessage, hintDescription);
        if (isAutoCaptureOn) {
            c1139c.f4699b.setCompoundDrawablesRelativeWithIntrinsicBounds(C13382q.f46868b, 0, 0, 0);
            c1139c.f4700c.setVisibility(0);
        } else {
            c1139c.f4699b.setCompoundDrawablesRelativeWithIntrinsicBounds(C13382q.f46867a, 0, 0, 0);
            c1139c.f4700c.setVisibility(8);
        }
        if (captureSuccessText == null || StringsKt.m32182p0(captureSuccessText)) {
            c1139c.f4705h.setCompoundDrawablePadding(0);
            c1139c.f4705h.setText((CharSequence) null);
        } else {
            c1139c.f4705h.setCompoundDrawablePadding((int) C7265j.m30285a(16.0d));
            c1139c.f4705h.setText(captureSuccessText);
        }
        if (this.isFlashEnabled != isFlashEnabled || c1139c.f4695E.getContentDescription() == null) {
            this.isFlashEnabled = isFlashEnabled;
            if (isFlashEnabled) {
                c1139c.f4695E.setImageResource(C12241d.f43200b);
                c1139c.f4695E.setContentDescription(c1139c.getRoot().getContext().getString(C12244g.f43239X));
            } else {
                c1139c.f4695E.setImageResource(C12241d.f43199a);
                c1139c.f4695E.setContentDescription(c1139c.getRoot().getContext().getString(C12244g.f43240Y));
            }
        }
        if (nextCameraContentDescription != null) {
            c1139c.f4714q.setContentDescription(nextCameraContentDescription);
        }
        c1139c.f4714q.setOnClickListener(new View.OnClickListener() { // from class: zp.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14022q.m50644I(onNextCameraClick, view);
            }
        });
        c1139c.f4695E.setOnClickListener(new View.OnClickListener() { // from class: zp.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14022q.m50645J(onToggleFlashClick, view);
            }
        });
        c1139c.f4723z.setIsPreviewMirrored(mirrorPreview);
        c1139c.f4723z.setCameraStreamBrightnessInfo(brightnessInfo);
        if (!this.isPlayingSuccessAnimation) {
            c1139c.f4723z.setIntensity(poseScore);
        }
        SelfieOverlayView.m20326E(c1139c.f4723z, overlayState, false, 2, null);
        if (isInitializing) {
            c1139c.f4712o.setVisibility(0);
        } else {
            c1139c.f4712o.setVisibility(8);
        }
        Pi2NavigationBar navigationBar = c1139c.f4713p;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutM6469b = c1139c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM6469b, "getRoot(...)");
        C6966c.m29335e(navigationState, onBackClick, onCancelClick, null, navigationBar, constraintLayoutM6469b, styles != null ? C5199h.m24132h(styles) : null, navBarTitle, navBarTitleStyle, 8, null);
        if (showCameraCover) {
            c1139c.f4704g.setVisibility(0);
            c1139c.f4704g.setAlpha(1.0f);
        } else if (!this.isCameraCoverAnimatingOut) {
            this.isCameraCoverAnimatingOut = true;
            c1139c.f4704g.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: zp.o
                @Override // java.lang.Runnable
                public final void run() {
                    C14022q.m50646K(this.f49002a, c1139c);
                }
            });
        }
        m50672T(isFinalizing);
        if (isNextCameraButtonVisible) {
            i10 = 0;
            c1139c.f4714q.setVisibility(0);
        } else {
            i10 = 0;
            c1139c.f4714q.setVisibility(4);
        }
        if (isToggleFlashButtonVisible) {
            c1139c.f4695E.setVisibility(i10);
        } else {
            c1139c.f4695E.setVisibility(4);
        }
        if (isCaptureButtonVisible) {
            c1139c.f4702e.setVisibility(i10);
        } else {
            c1139c.f4702e.setVisibility(4);
        }
        c1139c.f4714q.setEnabled(isNextCameraButtonEnabled);
        c1139c.f4695E.setEnabled(isToggleFlashButtonEnabled);
        c1139c.f4702e.setEnabled(isCaptureButtonEnabled);
        if (onCaptureClick != null) {
            c1139c.f4702e.setOnClickListener(new View.OnClickListener() { // from class: zp.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14022q.m50647L(c1139c, onCaptureClick, view);
                }
            });
        }
        if (watermarkText == null || StringsKt.m32182p0(watermarkText)) {
            c1139c.f4697G.setVisibility(8);
        } else {
            c1139c.f4697G.setText(watermarkText);
            c1139c.f4697G.setVisibility(0);
        }
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: e */
    public void mo50680e(@Nullable final String nextHintMessage, @Nullable final String nextHintDescription, @NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        final C1139c c1139c = this.binding;
        ConstraintLayout constraintLayoutM6469b = c1139c.getRoot();
        constraintLayoutM6469b.setHapticFeedbackEnabled(true);
        constraintLayoutM6469b.performHapticFeedback(this.confirmHapticFeedbackConst, 2);
        c1139c.f4723z.setIntensity(1.0f);
        this.isPlayingSuccessAnimation = true;
        View cover = c1139c.f4707j;
        Intrinsics.checkNotNullExpressionValue(cover, "cover");
        C14030v.m50705g(cover, new Function0() { // from class: zp.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14022q.m50650P(c1139c);
            }
        }, new Function0() { // from class: zp.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14022q.m50651Q(this.f48921a, nextHintMessage, nextHintDescription, onComplete);
            }
        });
        TextView captureSuccess = c1139c.f4705h;
        Intrinsics.checkNotNullExpressionValue(captureSuccess, "captureSuccess");
        C14030v.m50705g(captureSuccess, new Function0() { // from class: zp.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14022q.m50652R();
            }
        }, new Function0() { // from class: zp.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14022q.m50653S();
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m50681e0(String hintMessage, String hintDescription) {
        if (this.isPlayingSuccessAnimation) {
            m50674Z(null);
            m50673W(null);
        } else {
            m50674Z(hintMessage);
            m50673W(hintDescription);
        }
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: f */
    public void mo50682f(int countdownNumber) {
        C1139c c1139c = this.binding;
        if (Intrinsics.m31980c(c1139c.f4706i.getTag(), Integer.valueOf(countdownNumber))) {
            return;
        }
        TextView countdown = c1139c.f4706i;
        Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
        C14030v.m50703e(countdown);
        c1139c.f4706i.setText(String.valueOf(countdownNumber));
        c1139c.f4706i.setTag(Integer.valueOf(countdownNumber));
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: g */
    public void mo50683g(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // p611zp.InterfaceC14025r0
    @NotNull
    public View getRoot() {
        ConstraintLayout constraintLayoutM6469b = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM6469b, "getRoot(...)");
        return constraintLayoutM6469b;
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: h */
    public void mo50684h(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // p611zp.InterfaceC14025r0
    @NotNull
    /* JADX INFO: renamed from: i */
    public Camera2PreviewView mo50685i() {
        Camera2PreviewView camera2Preview = this.binding.f4703f;
        Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
        return camera2Preview;
    }

    @Override // p611zp.InterfaceC14025r0
    @NotNull
    /* JADX INFO: renamed from: j */
    public PreviewView mo50686j() {
        PreviewView previewviewSelfieCamera = this.binding.f4717t;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        return previewviewSelfieCamera;
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: k */
    public void mo50687k(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: l */
    public void mo50688l() {
        this.binding.f4722y.setVisibility(8);
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: m */
    public void mo50689m(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: n */
    public void mo50690n(@NotNull StepStyles.SelfieStepStyle styles, @Nullable C12247a systemUiController) {
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
        C1139c c1139c = this.binding;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView hintMessageTitle = c1139c.f4711n;
            Intrinsics.checkNotNullExpressionValue(hintMessageTitle, "hintMessageTitle");
            C7304h0.m30391k(hintMessageTitle, titleStyleValue, C7700p0.m31904c(EnumC7298e0.Margin));
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView hintMessageBody = c1139c.f4710m;
            Intrinsics.checkNotNullExpressionValue(hintMessageBody, "hintMessageBody");
            C7304h0.m30391k(hintMessageBody, textStyleValue, C7700p0.m31904c(EnumC7298e0.Margin));
            Integer textColorValue = textStyleValue.getTextColorValue();
            if (textColorValue != null) {
                int iIntValue = textColorValue.intValue();
                c1139c.f4695E.setImageTintList(ColorStateList.valueOf(iIntValue));
                c1139c.f4714q.setImageTintList(ColorStateList.valueOf(iIntValue));
            }
        }
        TextBasedComponentStyle selfieSmallText = styles.getSelfieSmallText();
        if (selfieSmallText != null) {
            TextView autoCaptureDisclaimer = c1139c.f4699b;
            Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
            C7304h0.m30391k(autoCaptureDisclaimer, selfieSmallText, C7700p0.m31904c(EnumC7298e0.Margin));
            AttributeStyles.TextBasedTextColorStyle textColor = selfieSmallText.getTextColor();
            if (textColor != null && (base3 = textColor.getBase()) != null && (base4 = base3.getBase()) != null && (value = base4.getValue()) != null) {
                c1139c.f4699b.setCompoundDrawableTintList(ColorStateList.valueOf(value.intValue()));
            }
        }
        TextBasedComponentStyle selfieCaptureDisclaimerTextStyle = styles.getSelfieCaptureDisclaimerTextStyle();
        if (selfieCaptureDisclaimerTextStyle != null) {
            TextView selfieCaptureDisclaimer = c1139c.f4721x;
            Intrinsics.checkNotNullExpressionValue(selfieCaptureDisclaimer, "selfieCaptureDisclaimer");
            C7304h0.m30392l(selfieCaptureDisclaimer, selfieCaptureDisclaimerTextStyle, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue2 = backgroundColorValue.intValue();
            c1139c.f4691A.setBackgroundColor(iIntValue2);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.m45389a(context, iIntValue2);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            c1139c.f4691A.setBackground(drawableM33622a);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f4713p.setControlsColor(headerButtonColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f4692B.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f4708k.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
    }

    @Override // p611zp.InterfaceC14025r0
    @NotNull
    /* JADX INFO: renamed from: o */
    public C14027s0 mo50691o(boolean strictSelfie) {
        return new C14027s0(strictSelfie ? 0.45d : 0.35d, 0.8d);
    }

    @Override // p611zp.InterfaceC14025r0
    /* JADX INFO: renamed from: p */
    public void mo50692p(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }
}
