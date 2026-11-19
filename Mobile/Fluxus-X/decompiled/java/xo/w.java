package xo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import sn.h0;
import vo.IdConfig;
import vo.OverlayAssets;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0097\u0002\u0010,\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020!2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010\u0004J\u0010\u0010/\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;À\u0006\u0003"}, d2 = {"Lxo/w;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "()V", BuildConfig.FLAVOR, "messageText", "scanInstructionsText", "disclaimerText", "titleText", "descriptionText", "hintText", "Lvo/y3$b$a;", "captureButtonState", "Lvo/d3$e;", "captureSide", "Lvo/y3$f;", "overlayImage", "Lvo/j3;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", BuildConfig.FLAVOR, "waitingOnWebRtcSetup", "showFinalizeUi", "Lir/a;", "navigationState", "navBarTitle", "Lzo/i;", "captureTipsViewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "playSideTransition", "Lkotlin/Function0;", "onBackClick", "onCancelClick", "Lkotlin/Function1;", "onFlashlightToggleClick", "onCaptureClick", "onCaptureTipsClick", "onViewfinderClick", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "watermarkText", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$b$a;Lvo/d3$e;Lvo/y3$f;Lvo/j3;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ZZLir/a;Ljava/lang/String;Lzo/i;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;)V", "f", "d", "(Leu/b;)Ljava/lang/Object;", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "b", "pointOfInterestView", "Lsn/i;", "g", "()Lsn/i;", "cameraController", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lxo/w$a;", "Lko/c;", "Lsn/h0;", "governmentIdFeed", "Lsn/t;", "cameraPreview", "Lto/e;", "featureFlagManager", "Lvo/y3$b;", "initialRendering", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lxo/w;", "b", "(Lsn/h0;Lsn/t;Lto/e;Lvo/y3$b;Landroid/content/Context;Landroid/view/ViewGroup;)Lxo/w;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends ko.c {
        @NotNull
        w b(@NotNull h0 governmentIdFeed, @NotNull sn.t cameraPreview, @NotNull to.e featureFlagManager, @NotNull y3.b initialRendering, @NotNull Context context, @Nullable ViewGroup container);
    }

    static /* synthetic */ Object c(w wVar, eu.b<? super Unit> bVar) {
        return Unit.f21506a;
    }

    void a();

    @NotNull
    View b();

    @Nullable
    default Object d(@NotNull eu.b<? super Unit> bVar) {
        return c(this, bVar);
    }

    void e(@NotNull String messageText, @NotNull String scanInstructionsText, @NotNull String disclaimerText, @NotNull String titleText, @NotNull String descriptionText, @Nullable String hintText, @NotNull y3.b.a captureButtonState, @NotNull IdConfig.e captureSide, @NotNull y3.f overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, boolean waitingOnWebRtcSetup, boolean showFinalizeUi, @NotNull ir.a navigationState, @Nullable String navBarTitle, @Nullable zo.i captureTipsViewModel, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage assetConfig, boolean playSideTransition, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @NotNull Function1<? super Boolean, Unit> onFlashlightToggleClick, @NotNull Function0<Unit> onCaptureClick, @NotNull Function0<Unit> onCaptureTipsClick, @NotNull Function0<Unit> onViewfinderClick, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String watermarkText);

    void f();

    @NotNull
    /* JADX INFO: renamed from: g */
    sn.i getCameraController();

    @NotNull
    View getRoot();
}
