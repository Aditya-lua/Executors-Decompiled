package p251ko;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import io.OverlayAssets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mo.InterfaceC8607i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5717x;
import p132fn.InterfaceC5683g;
import p152go.C6159e;
import p315nt.InterfaceC9557b;
import p523wn.InterfaceC12497c;

/* JADX INFO: renamed from: ko.w */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0097\u0002\u0010,\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020!2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010\u0004J\u0010\u0010/\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;À\u0006\u0003"}, m31665d2 = {"Lko/w;", "", "", "a", "()V", "", "messageText", "scanInstructionsText", "disclaimerText", "titleText", "descriptionText", "hintText", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlayImage", "Lio/k2;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "", "waitingOnWebRtcSetup", "showFinalizeUi", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "navBarTitle", "Lmo/i;", "captureTipsViewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "playSideTransition", "Lkotlin/Function0;", "onBackClick", "onCancelClick", "Lkotlin/Function1;", "onFlashlightToggleClick", "onCaptureClick", "onCaptureTipsClick", "onViewfinderClick", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "watermarkText", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ZZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lmo/i;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;)V", "e", "g", "(Lnt/b;)Ljava/lang/Object;", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "b", "pointOfInterestView", "Lfn/g;", "f", "()Lfn/g;", "cameraController", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7664w {

    /* JADX INFO: renamed from: ko.w$a */
    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m31665d2 = {"Lko/w$a;", "Lwn/c;", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lko/w;", "b", "(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Landroid/view/ViewGroup;)Lko/w;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a extends InterfaceC12497c {
        @NotNull
        /* JADX INFO: renamed from: b */
        InterfaceC7664w mo31656b(@NotNull C5717x governmentIdFeed, @NotNull C3402b cameraPreview, @NotNull C6159e featureFlagManager, @NotNull Screen.C3527b initialRendering, @NotNull Context context, @Nullable ViewGroup container);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m31655d(InterfaceC7664w interfaceC7664w, InterfaceC9557b<? super Unit> interfaceC9557b) {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a */
    void mo31615a();

    @NotNull
    /* JADX INFO: renamed from: b */
    View mo31616b();

    /* JADX INFO: renamed from: c */
    void mo31617c(@NotNull String messageText, @NotNull String scanInstructionsText, @NotNull String disclaimerText, @NotNull String titleText, @NotNull String descriptionText, @Nullable String hintText, @NotNull Screen.C3527b.a captureButtonState, @NotNull IdConfig.EnumC3514b captureSide, @NotNull Screen.Overlay overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, boolean waitingOnWebRtcSetup, boolean showFinalizeUi, @NotNull NavigationState navigationState, @Nullable String navBarTitle, @Nullable InterfaceC8607i captureTipsViewModel, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage assetConfig, boolean playSideTransition, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @NotNull Function1<? super Boolean, Unit> onFlashlightToggleClick, @NotNull Function0<Unit> onCaptureClick, @NotNull Function0<Unit> onCaptureTipsClick, @NotNull Function0<Unit> onViewfinderClick, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String watermarkText);

    /* JADX INFO: renamed from: e */
    void mo31618e();

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC5683g getCameraController();

    @Nullable
    /* JADX INFO: renamed from: g */
    default Object mo31620g(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m31655d(this, interfaceC9557b);
    }

    @NotNull
    View getRoot();
}
