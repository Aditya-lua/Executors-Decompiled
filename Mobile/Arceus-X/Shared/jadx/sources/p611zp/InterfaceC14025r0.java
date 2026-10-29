package p611zp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498vq.C12247a;
import p523wn.InterfaceC12497c;

/* JADX INFO: renamed from: zp.r0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004Jÿ\u0002\u00105\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010.\u001a\u0004\u0018\u00010-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020/2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010/H&¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J1\u0010>\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u00072\b\u0010<\u001a\u0004\u0018\u00010\u00072\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020/H&¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020/H&¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020/H&¢\u0006\u0004\bB\u0010AJ\u001d\u0010C\u001a\u00020\u00022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020/H&¢\u0006\u0004\bC\u0010AJ\u001d\u0010D\u001a\u00020\u00022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020/H&¢\u0006\u0004\bD\u0010AJ\u001d\u0010E\u001a\u00020\u00022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020/H&¢\u0006\u0004\bE\u0010AJ\u000f\u0010F\u001a\u00020\u0002H&¢\u0006\u0004\bF\u0010\u0004J\u000f\u0010G\u001a\u00020\u0002H&¢\u0006\u0004\bG\u0010\u0004J\u0017\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020\u0011H&¢\u0006\u0004\bJ\u0010KJ!\u0010L\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010P¨\u0006\\À\u0006\u0003"}, m31665d2 = {"Lzp/r0;", "", "", "a", "()V", "Lvq/a;", "systemUiController", "", "titleText", "autoCaptureText", "realTimeHintText", "hintMessage", "hintDescription", "captureSuccessText", "disclaimerText", "hintAutoCaptureTimeoutText", "hintVerifyingText", "", "isAutoCaptureOn", "isFlashEnabled", "mirrorPreview", "isInitializing", "showCameraCover", "isFinalizing", "nextCameraContentDescription", "isNextCameraButtonVisible", "isNextCameraButtonEnabled", "isToggleFlashButtonVisible", "isToggleFlashButtonEnabled", "isCaptureButtonVisible", "isCaptureButtonEnabled", "isCountingDown", "isCapturing", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "overlayState", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "watermarkText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onNextCameraClick", "onToggleFlashClick", "onBackClick", "onCancelClick", "onCaptureClick", "d", "(Lvq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;ZZZZZZZZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "countdownNumber", "f", "(I)V", "nextHintMessage", "nextHintDescription", "onComplete", "e", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "k", "(Lkotlin/jvm/functions/Function0;)V", "g", "p", "m", "h", "c", "l", "strictSelfie", "Lzp/s0;", "o", "(Z)Lzp/s0;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;)V", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "i", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2PreviewView", "Landroidx/camera/view/PreviewView;", "j", "()Landroidx/camera/view/PreviewView;", "cameraXPreviewView", "b", "pointOfInterestView", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC14025r0 {

    /* JADX INFO: renamed from: zp.r0$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lzp/r0$a;", "Lwn/c;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lzp/r0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lzp/r0;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a extends InterfaceC12497c {
        @NotNull
        /* JADX INFO: renamed from: a */
        InterfaceC14025r0 mo24078a(@NotNull Context context, @Nullable ViewGroup container);
    }

    /* JADX INFO: renamed from: a */
    void mo50675a();

    @NotNull
    /* JADX INFO: renamed from: b */
    View mo50676b();

    /* JADX INFO: renamed from: c */
    void mo50677c();

    /* JADX INFO: renamed from: d */
    void mo50679d(@Nullable C12247a systemUiController, @Nullable String titleText, @Nullable String autoCaptureText, @Nullable String realTimeHintText, @Nullable String hintMessage, @Nullable String hintDescription, @Nullable String captureSuccessText, @Nullable String disclaimerText, @Nullable String hintAutoCaptureTimeoutText, @Nullable String hintVerifyingText, boolean isAutoCaptureOn, boolean isFlashEnabled, boolean mirrorPreview, boolean isInitializing, boolean showCameraCover, boolean isFinalizing, @Nullable String nextCameraContentDescription, boolean isNextCameraButtonVisible, boolean isNextCameraButtonEnabled, boolean isToggleFlashButtonVisible, boolean isToggleFlashButtonEnabled, boolean isCaptureButtonVisible, boolean isCaptureButtonEnabled, boolean isCountingDown, boolean isCapturing, @NotNull NavigationState navigationState, @Nullable String navBarTitle, @Nullable TextBasedComponentStyle navBarTitleStyle, @NotNull SelfieOverlayView.EnumC3998e overlayState, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @Nullable String watermarkText, @Nullable StepStyles.SelfieStepStyle styles, @NotNull Function0<Unit> onNextCameraClick, @NotNull Function0<Unit> onToggleFlashClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @Nullable Function0<Unit> onCaptureClick);

    /* JADX INFO: renamed from: e */
    void mo50680e(@Nullable String nextHintMessage, @Nullable String nextHintDescription, @NotNull Function0<Unit> onComplete);

    /* JADX INFO: renamed from: f */
    void mo50682f(int countdownNumber);

    /* JADX INFO: renamed from: g */
    void mo50683g(@NotNull Function0<Unit> onComplete);

    @NotNull
    View getRoot();

    /* JADX INFO: renamed from: h */
    void mo50684h(@NotNull Function0<Unit> onComplete);

    @NotNull
    /* JADX INFO: renamed from: i */
    Camera2PreviewView mo50685i();

    @NotNull
    /* JADX INFO: renamed from: j */
    PreviewView mo50686j();

    /* JADX INFO: renamed from: k */
    void mo50687k(@NotNull Function0<Unit> onComplete);

    /* JADX INFO: renamed from: l */
    void mo50688l();

    /* JADX INFO: renamed from: m */
    void mo50689m(@NotNull Function0<Unit> onComplete);

    /* JADX INFO: renamed from: n */
    void mo50690n(@NotNull StepStyles.SelfieStepStyle styles, @Nullable C12247a systemUiController);

    @NotNull
    /* JADX INFO: renamed from: o */
    C14027s0 mo50691o(boolean strictSelfie);

    /* JADX INFO: renamed from: p */
    void mo50692p(@NotNull Function0<Unit> onComplete);
}
