package hp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import l6.s;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import vo.OverlayAssets;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004Jß\u0001\u0010&\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020!H&¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,À\u0006\u0003"}, d2 = {"Lhp/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "()V", "Lnn/z;", "viewEnvironment", "Ll6/s;", "imageLoader", BuildConfig.FLAVOR, "imagePath", "messageText", "disclaimerText", "acceptText", "retryText", "confirmCaptureTitle", "Lvo/y3$f;", "overlayImage", "Lvo/j3;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "Lir/a;", "navigationState", BuildConfig.FLAVOR, "isEnabled", "isProcessing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "navBarTitle", "Lkotlin/Function0;", "onAcceptImageClick", "onRetryClick", "onCancelClick", "onErrorDismissed", "b", "(Lnn/z;Ll6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$f;Lvo/j3;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lir/a;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lhp/k$a;", "Lko/c;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lhp/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lhp/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends ko.c {
        @NotNull
        k a(@NotNull Context context, @Nullable ViewGroup container);
    }

    void a();

    void b(@NotNull ViewEnvironment viewEnvironment, @NotNull s imageLoader, @NotNull String imagePath, @NotNull String messageText, @NotNull String disclaimerText, @NotNull String acceptText, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull y3.f overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, @NotNull ir.a navigationState, boolean isEnabled, boolean isProcessing, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String error, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @Nullable String navBarTitle, @NotNull Function0<Unit> onAcceptImageClick, @NotNull Function0<Unit> onRetryClick, @NotNull Function0<Unit> onCancelClick, @NotNull Function0<Unit> onErrorDismissed);

    @NotNull
    View getRoot();
}
