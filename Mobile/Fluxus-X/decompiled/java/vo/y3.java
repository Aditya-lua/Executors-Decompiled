package vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import gr.InquiryTheme;
import java.io.File;
import java.util.List;
import or.UiComponentScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.Option;
import qr.RemoteImageComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u000e\u0007\u000f\u0010\u0011\u0012\u0004\u0013\u0014\u0015\u0016J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\n\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!À\u0006\u0003"}, d2 = {"Lvo/y3;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "a", "(Lvo/y3;)Z", "Lkr/l;", "b", "()Lkr/l;", "transition", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "name", "e", "f", "i", "k", "g", "c", "j", "d", "h", "Lvo/y3$a;", "Lvo/y3$b;", "Lvo/y3$c;", "Lvo/y3$d;", "Lvo/y3$e;", "Lvo/y3$g;", "Lvo/y3$h;", "Lvo/y3$i;", "Lvo/y3$j;", "Lvo/y3$k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y3 {

    @Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b]\u0018\u00002\u00020\u0001:\u0001MB\u0093\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012 \b\u0002\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012 \b\u0002\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%\u0012\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%j\u0002`(\u0012\u0006\u0010*\u001a\u00020 \u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u0010/\u001a\u00020\u001a\u0012\u001a\b\u0002\u00101\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012\u0012\b\b\u0002\u00102\u001a\u00020\u001a\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00105\u001a\u00020\u001a\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u0006\u0010>\u001a\u00020\u001a\u0012\u0006\u0010?\u001a\u00020\u001a\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020\u001a\u0012\b\b\u0002\u0010G\u001a\u00020\u001a\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010PR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010N\u001a\u0004\bX\u0010PR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR/\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\f\n\u0004\b[\u0010m\u001a\u0004\bn\u0010oR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\f\n\u0004\bg\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\f\n\u0004\bs\u0010p\u001a\u0004\ba\u0010rR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\b]\u0010vR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138\u0006¢\u0006\f\n\u0004\bq\u0010w\u001a\u0004\bW\u0010xR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bR\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bY\u0010~R\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0004\bX\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R0\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010m\u001a\u0004\bU\u0010oR'\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%8\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%j\u0002`(8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0018\u0010*\u001a\u00020 8\u0006¢\u0006\r\n\u0005\b\u0089\u0001\u0010}\u001a\u0004\b}\u0010~R\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\r\n\u0004\bc\u0010p\u001a\u0005\b\u008a\u0001\u0010rR\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\r\n\u0005\b\u008a\u0001\u0010p\u001a\u0004\bt\u0010rR\u001a\u0010.\u001a\u00020-8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010/\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010u\u001a\u0005\b\u0083\u0001\u0010vR*\u00101\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\r\n\u0004\bT\u0010m\u001a\u0005\b\u008f\u0001\u0010oR\u0019\u00102\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010u\u001a\u0005\b\u0082\u0001\u0010vR\u0019\u00104\u001a\u0002038\u0006¢\u0006\u000e\n\u0004\bk\u0010V\u001a\u0006\b\u008e\u0001\u0010\u0091\u0001R\u0019\u00105\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010u\u001a\u0005\b\u0092\u0001\u0010vR\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010N\u001a\u0005\b\u0087\u0001\u0010PR\u001b\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010N\u001a\u0005\b\u0090\u0001\u0010PR\u001b\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000e\n\u0005\b_\u0010\u0093\u0001\u001a\u0005\bs\u0010\u0094\u0001R\u001d\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000e\n\u0005\b}\u0010\u0099\u0001\u001a\u0005\bS\u0010\u009a\u0001R\u0018\u0010>\u001a\u00020\u001a8\u0006¢\u0006\r\n\u0004\bV\u0010u\u001a\u0005\b\u009b\u0001\u0010vR\u0019\u0010?\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010u\u001a\u0005\b\u009c\u0001\u0010vR\u0019\u0010A\u001a\u00020@8\u0006¢\u0006\u000e\n\u0005\bz\u0010\u009d\u0001\u001a\u0005\bi\u0010\u009e\u0001R\u001a\u0010C\u001a\u00020B8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u009f\u0001\u001a\u0005\be\u0010 \u0001R\u0019\u0010E\u001a\u00020D8\u0006¢\u0006\u000e\n\u0005\bO\u0010¡\u0001\u001a\u0005\b|\u0010¢\u0001R\u0019\u0010F\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010u\u001a\u0005\b\u0095\u0001\u0010vR\u0019\u0010G\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010u\u001a\u0005\b\u0089\u0001\u0010vR\u001b\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010N\u001a\u0005\b£\u0001\u0010PR\u001d\u0010J\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010¤\u0001\u001a\u0005\bQ\u0010¥\u0001¨\u0006¦\u0001"}, d2 = {"Lvo/y3$b;", "Lvo/y3;", BuildConfig.FLAVOR, Title.type, "description", "message", "scanInstructions", "disclaimer", "Lvo/y3$b$a;", "captureButtonState", "Lvo/y3$f;", "overlay", "Ldp/e;", "idClass", "Lvo/d3$e;", "captureSide", "Lir/a;", "navigationState", "Lkotlin/Function2;", BuildConfig.FLAVOR, "Lsn/v;", BuildConfig.FLAVOR, "manuallyCapture", "Lkotlin/Function0;", "close", "back", BuildConfig.FLAVOR, "autoCapturing", "Lsn/e;", "autoCaptureRules", "Lvo/j0;", "state", BuildConfig.FLAVOR, "autoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "autoCapture", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "remainingCaptureCount", "manualCaptureClicked", "checkPermissions", "Lzn/a;", "videoCaptureMethod", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "enableAnalyzer", BuildConfig.FLAVOR, "maxRecordingLengthMs", "showFinalizeUi", "hintText", "navBarTitle", "Lzo/i;", "captureTips", "Lks/a;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "isEnabled", "isAudioRequired", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lvo/i;", "designVersion", "playSideTransition", "holographicTorchEnabled", "watermarkText", "Lkr/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$b$a;Lvo/y3$f;Ldp/e;Lvo/d3$e;Lir/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lvo/j0;ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lzn/a;ZLkotlin/jvm/functions/Function2;ZJZLjava/lang/String;Ljava/lang/String;Lzo/i;Lks/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLsn/a0$a;Lun/c$a;Lvo/i;ZZLjava/lang/String;Lkr/l;)V", "a", "Ljava/lang/String;", "N", "()Ljava/lang/String;", "b", "p", "c", "A", "d", "J", "e", "r", "f", "Lvo/y3$b$a;", "k", "()Lvo/y3$b$a;", "g", "Lvo/y3$f;", "G", "()Lvo/y3$f;", "h", "Ldp/e;", "w", "()Ldp/e;", "i", "Lvo/d3$e;", "l", "()Lvo/d3$e;", "j", "Lir/a;", "C", "()Lir/a;", "Lkotlin/jvm/functions/Function2;", "y", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "o", "()Lkotlin/jvm/functions/Function0;", "m", "n", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "Lvo/j0;", "L", "()Lvo/j0;", "q", "I", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "M", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "s", "t", "Lkotlin/jvm/functions/Function1;", "E", "()Lkotlin/jvm/functions/Function1;", "u", "D", "v", "x", "Lzn/a;", "O", "()Lzn/a;", "z", "F", "B", "()J", "K", "Lzo/i;", "()Lzo/i;", "H", "Lks/a;", "Q", "()Lks/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "S", "R", "Lsn/a0$a;", "()Lsn/a0$a;", "Lun/c$a;", "()Lun/c$a;", "Lvo/i;", "()Lvo/i;", "P", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements y3 {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @NotNull
        public final Function2<File, sn.v, Unit> onLocalVideoFinalized;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        public final boolean enableAnalyzer;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        public final long maxRecordingLengthMs;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        public final boolean showFinalizeUi;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public final String hintText;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @Nullable
        public final zo.i captureTips;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @Nullable
        public final ks.a webRtcManager;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        public final boolean isAudioRequired;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @NotNull
        public final sn.a0.a cameraXControllerFactory;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @NotNull
        public final un.c.a camera2ControllerFactory;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @NotNull
        public final vo.i designVersion;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        public final boolean playSideTransition;

        /* JADX INFO: renamed from: P, reason: from kotlin metadata */
        public final boolean holographicTorchEnabled;

        /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
        @Nullable
        public final String watermarkText;

        /* JADX INFO: renamed from: R, reason: from kotlin metadata */
        @NotNull
        public final kr.l transition;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String scanInstructions;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String disclaimer;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final a captureButtonState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f overlay;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final dp.e idClass;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final IdConfig.e captureSide;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function2<List<String>, sn.v, Unit> manuallyCapture;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> close;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> back;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final boolean autoCapturing;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<sn.e> autoCaptureRules;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j0 state;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final int autoCaptureRulesId;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function2<List<String>, sn.v, Unit> autoCapture;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function1<Throwable, Unit> onCaptureError;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function1<Throwable, Unit> onCameraError;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        public final int remainingCaptureCount;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> manualCaptureClicked;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> checkPermissions;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.a videoCaptureMethod;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        public final boolean finalizeLocalVideo;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lvo/y3$b$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum a {
            Disabled,
            Enabled,
            Hidden;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ hu.a f35076e = hu.b.a(a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull String title, @NotNull String description, @NotNull String message, @NotNull String scanInstructions, @NotNull String disclaimer, @NotNull a captureButtonState, @NotNull f overlay, @NotNull dp.e idClass, @NotNull IdConfig.e captureSide, @NotNull ir.a navigationState, @NotNull Function2<? super List<String>, ? super sn.v, Unit> manuallyCapture, @NotNull Function0<Unit> close, @NotNull Function0<Unit> back, boolean z10, @NotNull List<? extends sn.e> autoCaptureRules, @NotNull j0 state, int i10, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Function2<? super List<String>, ? super sn.v, Unit> autoCapture, @NotNull Function1<? super Throwable, Unit> onCaptureError, @NotNull Function1<? super Throwable, Unit> onCameraError, int i11, @NotNull Function0<Unit> manualCaptureClicked, @NotNull Function0<Unit> checkPermissions, @NotNull zn.a videoCaptureMethod, boolean z11, @NotNull Function2<? super File, ? super sn.v, Unit> onLocalVideoFinalized, boolean z12, long j10, boolean z13, @Nullable String str, @Nullable String str2, @Nullable zo.i iVar, @Nullable ks.a aVar, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z14, boolean z15, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull vo.i designVersion, boolean z16, boolean z17, @Nullable String str3, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(captureButtonState, "captureButtonState");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(manuallyCapture, "manuallyCapture");
            Intrinsics.checkNotNullParameter(close, "close");
            Intrinsics.checkNotNullParameter(back, "back");
            Intrinsics.checkNotNullParameter(autoCaptureRules, "autoCaptureRules");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(autoCapture, "autoCapture");
            Intrinsics.checkNotNullParameter(onCaptureError, "onCaptureError");
            Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
            Intrinsics.checkNotNullParameter(manualCaptureClicked, "manualCaptureClicked");
            Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
            Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
            Intrinsics.checkNotNullParameter(onLocalVideoFinalized, "onLocalVideoFinalized");
            Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
            Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.title = title;
            this.description = description;
            this.message = message;
            this.scanInstructions = scanInstructions;
            this.disclaimer = disclaimer;
            this.captureButtonState = captureButtonState;
            this.overlay = overlay;
            this.idClass = idClass;
            this.captureSide = captureSide;
            this.navigationState = navigationState;
            this.manuallyCapture = manuallyCapture;
            this.close = close;
            this.back = back;
            this.autoCapturing = z10;
            this.autoCaptureRules = autoCaptureRules;
            this.state = state;
            this.autoCaptureRulesId = i10;
            this.styles = governmentIdStepStyle;
            this.autoCapture = autoCapture;
            this.onCaptureError = onCaptureError;
            this.onCameraError = onCameraError;
            this.remainingCaptureCount = i11;
            this.manualCaptureClicked = manualCaptureClicked;
            this.checkPermissions = checkPermissions;
            this.videoCaptureMethod = videoCaptureMethod;
            this.finalizeLocalVideo = z11;
            this.onLocalVideoFinalized = onLocalVideoFinalized;
            this.enableAnalyzer = z12;
            this.maxRecordingLengthMs = j10;
            this.showFinalizeUi = z13;
            this.hintText = str;
            this.navBarTitle = str2;
            this.captureTips = iVar;
            this.webRtcManager = aVar;
            this.assetConfig = capturePage;
            this.isEnabled = z14;
            this.isAudioRequired = z15;
            this.cameraXControllerFactory = cameraXControllerFactory;
            this.camera2ControllerFactory = camera2ControllerFactory;
            this.designVersion = designVersion;
            this.playSideTransition = z16;
            this.holographicTorchEnabled = z17;
            this.watermarkText = str3;
            this.transition = transition;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function1<Throwable, Unit> D() {
            return this.onCameraError;
        }

        @NotNull
        public final Function1<Throwable, Unit> E() {
            return this.onCaptureError;
        }

        @NotNull
        public final Function2<File, sn.v, Unit> F() {
            return this.onLocalVideoFinalized;
        }

        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public final f getOverlay() {
            return this.overlay;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getPlaySideTransition() {
            return this.playSideTransition;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getRemainingCaptureCount() {
            return this.remainingCaptureCount;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final String getScanInstructions() {
            return this.scanInstructions;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final boolean getShowFinalizeUi() {
            return this.showFinalizeUi;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final j0 getState() {
            return this.state;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: O, reason: from getter */
        public final zn.a getVideoCaptureMethod() {
            return this.videoCaptureMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final String getWatermarkText() {
            return this.watermarkText;
        }

        @Nullable
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final ks.a getWebRtcManager() {
            return this.webRtcManager;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public final boolean getIsAudioRequired() {
            return this.isAudioRequired;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        public final Function2<List<String>, sn.v, Unit> d() {
            return this.autoCapture;
        }

        @NotNull
        public final List<sn.e> e() {
            return this.autoCaptureRules;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getAutoCaptureRulesId() {
            return this.autoCaptureRulesId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getAutoCapturing() {
            return this.autoCapturing;
        }

        @NotNull
        public final Function0<Unit> h() {
            return this.back;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final un.c.a getCamera2ControllerFactory() {
            return this.camera2ControllerFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final sn.a0.a getCameraXControllerFactory() {
            return this.cameraXControllerFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final a getCaptureButtonState() {
            return this.captureButtonState;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final IdConfig.e getCaptureSide() {
            return this.captureSide;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final zo.i getCaptureTips() {
            return this.captureTips;
        }

        @NotNull
        public final Function0<Unit> n() {
            return this.checkPermissions;
        }

        @NotNull
        public final Function0<Unit> o() {
            return this.close;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final vo.i getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getEnableAnalyzer() {
            return this.enableAnalyzer;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getFinalizeLocalVideo() {
            return this.finalizeLocalVideo;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getHintText() {
            return this.hintText;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getHolographicTorchEnabled() {
            return this.holographicTorchEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final dp.e getIdClass() {
            return this.idClass;
        }

        @NotNull
        public final Function0<Unit> x() {
            return this.manualCaptureClicked;
        }

        @NotNull
        public final Function2<List<String>, sn.v, Unit> y() {
            return this.manuallyCapture;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final long getMaxRecordingLengthMs() {
            return this.maxRecordingLengthMs;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lvo/y3$f;", "Landroid/os/Parcelable;", "<init>", "()V", "f", "e", "a", "b", "d", "c", "Lvo/y3$f$a;", "Lvo/y3$f$b;", "Lvo/y3$f$c;", "Lvo/y3$f$d;", "Lvo/y3$f$e;", "Lvo/y3$f$f;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class f implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvo/y3$f$a;", "Lvo/y3$f;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f35118a = new a();

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0720a();

            /* JADX INFO: renamed from: vo.y3$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0720a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f35118a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1779545178;
            }

            @NotNull
            public String toString() {
                return "Barcode";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvo/y3$f$b;", "Lvo/y3$f;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f35119a = new b();

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return b.f35119a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1450323044;
            }

            @NotNull
            public String toString() {
                return "CornersOnly";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvo/y3$f$c;", "Lvo/y3$f;", "Lqr/t4;", "customImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "<init>", "(Lqr/t4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lqr/t4;", "f", "()Lqr/t4;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends f {

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final RemoteImageComponent customImage;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final RemoteImage config;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new c((RemoteImageComponent) parcel.readParcelable(c.class.getClassLoader()), (RemoteImage) parcel.readParcelable(c.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull RemoteImageComponent customImage, @NotNull RemoteImage config) {
                super(null);
                Intrinsics.checkNotNullParameter(customImage, "customImage");
                Intrinsics.checkNotNullParameter(config, "config");
                this.customImage = customImage;
                this.config = config;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final RemoteImage getConfig() {
                return this.config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final RemoteImageComponent getCustomImage() {
                return this.customImage;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.customImage, flags);
                dest.writeParcelable(this.config, flags);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public c(@NotNull RemoteImage config) {
                this(new RemoteImageComponent(config), config);
                Intrinsics.checkNotNullParameter(config, "config");
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvo/y3$f$d;", "Lvo/y3$f;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f35121a = new d();

            @NotNull
            public static final Parcelable.Creator<d> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return d.f35121a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            public d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 212467448;
            }

            @NotNull
            public String toString() {
                return "GenericFront";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvo/y3$f$e;", "Lvo/y3$f;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f35122a = new e();

            @NotNull
            public static final Parcelable.Creator<e> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return e.f35122a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            public e() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1995687048;
            }

            @NotNull
            public String toString() {
                return "Passport";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: vo.y3$f$f, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvo/y3$f$f;", "Lvo/y3$f;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0721f extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0721f f35123a = new C0721f();

            @NotNull
            public static final Parcelable.Creator<C0721f> CREATOR = new a();

            /* JADX INFO: renamed from: vo.y3$f$f$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0721f> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0721f createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0721f.f35123a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0721f[] newArray(int i10) {
                    return new C0721f[i10];
                }
            }

            public C0721f() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0721f);
            }

            public int hashCode() {
                return 319154889;
            }

            @NotNull
            public String toString() {
                return "Rectangle";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public f() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvo/y3$h;", "Lvo/y3;", "Lkr/l;", "transition", "<init>", "(Lkr/l;)V", "a", "Lkr/l;", "b", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        /* JADX WARN: Multi-variable type inference failed */
        public h() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        public h(@NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.transition = transition;
        }

        public /* synthetic */ h(kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? kr.l.NONE : lVar);
        }
    }

    default boolean a(@Nullable y3 other) {
        if (other == null) {
            return false;
        }
        if (Intrinsics.c(getClass(), other.getClass())) {
            return true;
        }
        if (getName() == null || other.getName() == null) {
            return false;
        }
        return Intrinsics.c(getName(), other.getName());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    kr.l getTransition();

    default String getName() {
        if ((this instanceof b) || (this instanceof i)) {
            return "camera_screen";
        }
        if ((this instanceof a) || (this instanceof c) || (this instanceof d) || (this instanceof e) || (this instanceof j) || (this instanceof k) || (this instanceof h) || (this instanceof g)) {
            return null;
        }
        throw new zt.l();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b\u0018\u0010*¨\u0006+"}, d2 = {"Lvo/y3$g;", "Lvo/y3;", "Lor/i;", "uiScreen", "Lir/a;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", BuildConfig.FLAVOR, "navBarTitle", BuildConfig.FLAVOR, "isFinalizingVideoCapture", "Lkr/l;", "transition", "<init>", "(Lor/i;Lir/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkr/l;)V", "a", "Lor/i;", "h", "()Lor/i;", "b", "Lir/a;", "d", "()Lir/a;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "Z", "i", "()Z", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UiComponentScreen uiScreen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final boolean isFinalizingVideoCapture;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        public g(@NotNull UiComponentScreen uiScreen, @NotNull ir.a navigationState, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, boolean z10, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.uiScreen = uiScreen;
            this.navigationState = navigationState;
            this.styles = governmentIdStepStyle;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.navBarTitle = str;
            this.isFinalizingVideoCapture = z10;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> e() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> f() {
            return this.onCancel;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final UiComponentScreen getUiScreen() {
            return this.uiScreen;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsFinalizingVideoCapture() {
            return this.isFinalizingVideoCapture;
        }

        public /* synthetic */ g(UiComponentScreen uiComponentScreen, ir.a aVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, Function0 function0, Function0 function1, String str, boolean z10, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiComponentScreen, aVar, governmentIdStepStyle, function0, function1, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? false : z10, (i10 & Barcode.FORMAT_ITF) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b\u0019\u0010+¨\u0006,"}, d2 = {"Lvo/y3$d;", "Lvo/y3;", BuildConfig.FLAVOR, "titleText", "continueButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onContinueClick", "onBackClick", "onCancelClick", BuildConfig.FLAVOR, "videoCaptureEnabled", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkr/l;)V", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "d", "Lir/a;", "e", "()Lir/a;", "Lkotlin/jvm/functions/Function0;", "h", "()Lkotlin/jvm/functions/Function0;", "f", "g", "Z", "k", "()Z", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String titleText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String continueButtonText;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onContinueClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBackClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancelClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final boolean videoCaptureEnabled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        public d(@Nullable String str, @Nullable String str2, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull ir.a navigationState, @NotNull Function0<Unit> onContinueClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, boolean z10, @Nullable String str3, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
            Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
            Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.titleText = str;
            this.continueButtonText = str2;
            this.styles = governmentIdStepStyle;
            this.navigationState = navigationState;
            this.onContinueClick = onContinueClick;
            this.onBackClick = onBackClick;
            this.onCancelClick = onCancelClick;
            this.videoCaptureEnabled = z10;
            this.navBarTitle = str3;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> f() {
            return this.onBackClick;
        }

        @NotNull
        public final Function0<Unit> g() {
            return this.onCancelClick;
        }

        @NotNull
        public final Function0<Unit> h() {
            return this.onContinueClick;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getVideoCaptureEnabled() {
            return this.videoCaptureEnabled;
        }

        public /* synthetic */ d(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ir.a aVar, Function0 function0, Function0 function1, Function0 function2, boolean z10, String str3, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, governmentIdStepStyle, aVar, function0, function1, function2, (i10 & Barcode.FORMAT_ITF) != 0 ? false : z10, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str3, (i10 & Barcode.FORMAT_UPC_A) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b\u001c\u00103¨\u00064"}, d2 = {"Lvo/y3$k;", "Lvo/y3;", BuildConfig.FLAVOR, Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "assetConfig", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", BuildConfig.FLAVOR, "isFinalizingVideoCapture", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLjava/lang/String;Lkr/l;)V", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "e", "Lir/a;", "f", "()Lir/a;", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Z", "l", "()Z", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.PendingPage assetConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final boolean isFinalizingVideoCapture;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        public k(@NotNull String title, @NotNull String description, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean z10, @Nullable String str, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.title = title;
            this.description = description;
            this.styles = governmentIdStepStyle;
            this.assetConfig = pendingPage;
            this.navigationState = navigationState;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.isFinalizingVideoCapture = z10;
            this.navBarTitle = str;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.PendingPage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> g() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> h() {
            return this.onCancel;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsFinalizingVideoCapture() {
            return this.isFinalizingVideoCapture;
        }

        public /* synthetic */ k(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, ir.a aVar, Function0 function0, Function0 function1, PendingPageTextPosition pendingPageTextPosition, boolean z10, String str3, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, governmentIdStepStyle, pendingPage, aVar, function0, function1, pendingPageTextPosition, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? false : z10, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str3, (i10 & Barcode.FORMAT_UPC_E) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B¿\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b4\u00101R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b*\u0010&R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b.\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b2\u0010&R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b#\u0010@¨\u0006A"}, d2 = {"Lvo/y3$c;", "Lvo/y3;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "captureOptions", BuildConfig.FLAVOR, Title.type, "body", "cameraText", "uploadButtonText", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onCameraCaptureClick", "onUploadClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "pictographAsset", BuildConfig.FLAVOR, "localAsset", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ILjava/lang/String;Lkr/l;)V", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "c", "d", "r", "f", "Lir/a;", "i", "()Lir/a;", "g", "Lkotlin/jvm/functions/Function0;", "k", "()Lkotlin/jvm/functions/Function0;", "h", "n", "j", "l", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "o", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "I", "()I", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<CaptureOptionNativeMobile> captureOptions;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String body;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String cameraText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String uploadButtonText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCameraCaptureClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onUploadClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final RemoteImage pictographAsset;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final int localAsset;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull List<? extends CaptureOptionNativeMobile> captureOptions, @NotNull String title, @NotNull String body, @NotNull String cameraText, @NotNull String uploadButtonText, @NotNull ir.a navigationState, @NotNull Function0<Unit> onCameraCaptureClick, @NotNull Function0<Unit> onUploadClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable RemoteImage remoteImage, int i10, @Nullable String str2, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(captureOptions, "captureOptions");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(cameraText, "cameraText");
            Intrinsics.checkNotNullParameter(uploadButtonText, "uploadButtonText");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onCameraCaptureClick, "onCameraCaptureClick");
            Intrinsics.checkNotNullParameter(onUploadClick, "onUploadClick");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.captureOptions = captureOptions;
            this.title = title;
            this.body = body;
            this.cameraText = cameraText;
            this.uploadButtonText = uploadButtonText;
            this.navigationState = navigationState;
            this.onCameraCaptureClick = onCameraCaptureClick;
            this.onUploadClick = onUploadClick;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.styles = governmentIdStepStyle;
            this.pictographAsset = remoteImage;
            this.localAsset = i10;
            this.navBarTitle = str2;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCameraText() {
            return this.cameraText;
        }

        @NotNull
        public final List<CaptureOptionNativeMobile> e() {
            return this.captureOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getLocalAsset() {
            return this.localAsset;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> j() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> k() {
            return this.onCameraCaptureClick;
        }

        @NotNull
        public final Function0<Unit> l() {
            return this.onCancel;
        }

        @NotNull
        public final Function0<Unit> m() {
            return this.onErrorDismissed;
        }

        @NotNull
        public final Function0<Unit> n() {
            return this.onUploadClick;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final RemoteImage getPictographAsset() {
            return this.pictographAsset;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getUploadButtonText() {
            return this.uploadButtonText;
        }

        public /* synthetic */ c(List list, String str, String str2, String str3, String str4, ir.a aVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, String str5, Function0 function4, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i10, String str6, kr.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, str2, str3, str4, aVar, function0, function1, function2, function3, str5, function4, governmentIdStepStyle, remoteImage, i10, (i11 & 32768) != 0 ? null : str6, (i11 & 65536) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b(\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bB\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\b1\u0010%R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b'\u0010@\u001a\u0004\bC\u0010AR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\b5\u0010ER\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b9\u0010%R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010F\u001a\u0004\b&\u0010G¨\u0006H"}, d2 = {"Lvo/y3$e;", "Lvo/y3;", BuildConfig.FLAVOR, Title.type, "prompt", "chooseText", "disclaimer", BuildConfig.FLAVOR, "Lvo/l;", "enabledIdClasses", "Lir/a;", "navigationState", "Lkotlin/Function1;", "Lvo/d3;", BuildConfig.FLAVOR, "selectIdClass", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", BuildConfig.FLAVOR, "isEnabled", "Lkotlin/Function0;", "onBack", "onCancel", "error", "onErrorDismissed", "Lgr/a$c;", "iconStyle", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lir/a;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lgr/a$c;Ljava/lang/String;Lkr/l;)V", "a", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "b", "n", "c", "d", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lir/a;", "j", "()Lir/a;", "g", "Lkotlin/jvm/functions/Function1;", "o", "()Lkotlin/jvm/functions/Function1;", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Z", "r", "()Z", "k", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "l", "m", "Lgr/a$c;", "()Lgr/a$c;", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String prompt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String chooseText;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String disclaimer;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<EnabledIdClass> enabledIdClasses;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function1<IdConfig, Unit> selectIdClass;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final InquiryTheme.c iconStyle;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull String title, @NotNull String prompt, @NotNull String chooseText, @NotNull String disclaimer, @NotNull List<EnabledIdClass> enabledIdClasses, @NotNull ir.a navigationState, @NotNull Function1<? super IdConfig, Unit> selectIdClass, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z10, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str, @NotNull Function0<Unit> onErrorDismissed, @NotNull InquiryTheme.c iconStyle, @Nullable String str2, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(chooseText, "chooseText");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(selectIdClass, "selectIdClass");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.title = title;
            this.prompt = prompt;
            this.chooseText = chooseText;
            this.disclaimer = disclaimer;
            this.enabledIdClasses = enabledIdClasses;
            this.navigationState = navigationState;
            this.selectIdClass = selectIdClass;
            this.styles = governmentIdStepStyle;
            this.assetConfig = selectPage;
            this.isEnabled = z10;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.iconStyle = iconStyle;
            this.navBarTitle = str2;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.SelectPage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getChooseText() {
            return this.chooseText;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final List<EnabledIdClass> f() {
            return this.enabledIdClasses;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final InquiryTheme.c getIconStyle() {
            return this.iconStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> k() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> l() {
            return this.onCancel;
        }

        @NotNull
        public final Function0<Unit> m() {
            return this.onErrorDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getPrompt() {
            return this.prompt;
        }

        @NotNull
        public final Function1<IdConfig, Unit> o() {
            return this.selectIdClass;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, List list, ir.a aVar, Function1 function1, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z10, Function0 function0, Function0 function2, String str5, Function0 function3, InquiryTheme.c cVar, String str6, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, list, aVar, function1, governmentIdStepStyle, selectPage, z10, function0, function2, str5, function3, cVar, (i10 & 32768) != 0 ? null : str6, (i10 & 65536) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b6\u00103R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b*\u0010&R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b8\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b4\u0010&R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b#\u0010@¨\u0006A"}, d2 = {"Lvo/y3$j;", "Lvo/y3;", "Ll6/s;", "imageLoader", BuildConfig.FLAVOR, Title.type, "body", "confirmButtonText", "chooseNewPhotoText", "fileToReviewPath", "fileMimeType", "fileName", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onUsePhotoClick", "onChooseNewPhotoClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", BuildConfig.FLAVOR, "isAutoClassifying", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ll6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;ZLjava/lang/String;Lkr/l;)V", "a", "Ll6/s;", "j", "()Ll6/s;", "b", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "c", "d", "e", "f", "i", "g", "h", "Lir/a;", "l", "()Lir/a;", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", "k", "o", "m", "n", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "r", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Z", "t", "()Z", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final l6.s imageLoader;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String body;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String confirmButtonText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String chooseNewPhotoText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fileToReviewPath;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fileMimeType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String fileName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onUsePhotoClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onChooseNewPhotoClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancel;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final boolean isAutoClassifying;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        public j(@NotNull l6.s imageLoader, @NotNull String title, @NotNull String body, @NotNull String confirmButtonText, @NotNull String chooseNewPhotoText, @NotNull String fileToReviewPath, @NotNull String fileMimeType, @Nullable String str, @NotNull ir.a navigationState, @NotNull Function0<Unit> onUsePhotoClick, @NotNull Function0<Unit> onChooseNewPhotoClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str2, @NotNull Function0<Unit> onErrorDismissed, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z10, @Nullable String str3, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
            Intrinsics.checkNotNullParameter(chooseNewPhotoText, "chooseNewPhotoText");
            Intrinsics.checkNotNullParameter(fileToReviewPath, "fileToReviewPath");
            Intrinsics.checkNotNullParameter(fileMimeType, "fileMimeType");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onUsePhotoClick, "onUsePhotoClick");
            Intrinsics.checkNotNullParameter(onChooseNewPhotoClick, "onChooseNewPhotoClick");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.imageLoader = imageLoader;
            this.title = title;
            this.body = body;
            this.confirmButtonText = confirmButtonText;
            this.chooseNewPhotoText = chooseNewPhotoText;
            this.fileToReviewPath = fileToReviewPath;
            this.fileMimeType = fileMimeType;
            this.fileName = str;
            this.navigationState = navigationState;
            this.onUsePhotoClick = onUsePhotoClick;
            this.onChooseNewPhotoClick = onChooseNewPhotoClick;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str2;
            this.onErrorDismissed = onErrorDismissed;
            this.styles = governmentIdStepStyle;
            this.isAutoClassifying = z10;
            this.navBarTitle = str3;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getChooseNewPhotoText() {
            return this.chooseNewPhotoText;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getConfirmButtonText() {
            return this.confirmButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFileMimeType() {
            return this.fileMimeType;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getFileToReviewPath() {
            return this.fileToReviewPath;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final l6.s getImageLoader() {
            return this.imageLoader;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> m() {
            return this.onBack;
        }

        @NotNull
        public final Function0<Unit> n() {
            return this.onCancel;
        }

        @NotNull
        public final Function0<Unit> o() {
            return this.onChooseNewPhotoClick;
        }

        @NotNull
        public final Function0<Unit> p() {
            return this.onErrorDismissed;
        }

        @NotNull
        public final Function0<Unit> q() {
            return this.onUsePhotoClick;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        public /* synthetic */ j(l6.s sVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, ir.a aVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, String str8, Function0 function4, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z10, String str9, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(sVar, str, str2, str3, str4, str5, str6, str7, aVar, function0, function1, function2, function3, str8, function4, governmentIdStepStyle, z10, (i10 & 131072) != 0 ? null : str9, (i10 & 262144) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\u0018\u00002\u00020\u0001:\u0001$Bó\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b2\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b.\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b*\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b8\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b3\u0010AR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bF\u0010ER\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010HR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\b2\u0010G\u001a\u0004\b<\u0010HR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\b?\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b7\u0010'R\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010I\u001a\u0004\b(\u0010J¨\u0006K"}, d2 = {"Lvo/y3$a;", "Lvo/y3;", BuildConfig.FLAVOR, "manualClassificationTitle", "unableToClassifyDocumentTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", BuildConfig.FLAVOR, "Lvo/y3$a$a;", "countryOptions", "selectedCountryCode", "Lqr/l4;", "idClassOptions", "selectedIdClass", "countryInputTitle", "idClassInputTitle", "continueButtonText", BuildConfig.FLAVOR, "isContinueEnabled", "Lir/a;", "navigationState", "Lvo/i;", "designVersion", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onCountrySelected", "onIdClassSelected", "Lkotlin/Function0;", "onContinueClick", "onBackClick", "onCancelClick", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLir/a;Lvo/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkr/l;)V", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "getUnableToClassifyDocumentTitle", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "q", "f", "h", "g", "r", "j", "k", "Z", "t", "()Z", "l", "Lir/a;", "()Lir/a;", "m", "Lvo/i;", "()Lvo/i;", "n", "Lkotlin/jvm/functions/Function1;", "o", "()Lkotlin/jvm/functions/Function1;", "p", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String manualClassificationTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String unableToClassifyDocumentTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<CountryOption> countryOptions;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String selectedCountryCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Option> idClassOptions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String selectedIdClass;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String countryInputTitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String idClassInputTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String continueButtonText;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final boolean isContinueEnabled;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final vo.i designVersion;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function1<Option, Unit> onCountrySelected;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function1<Option, Unit> onIdClassSelected;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onContinueClick;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBackClick;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onCancelClick;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        /* JADX INFO: renamed from: vo.y3$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lvo/y3$a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "countryCode", "countryName", "flagEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getFlagEmoji", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CountryOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String countryCode;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String countryName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String flagEmoji;

            public CountryOption(@NotNull String countryCode, @NotNull String countryName, @NotNull String flagEmoji) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(countryName, "countryName");
                Intrinsics.checkNotNullParameter(flagEmoji, "flagEmoji");
                this.countryCode = countryCode;
                this.countryName = countryName;
                this.flagEmoji = flagEmoji;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getCountryName() {
                return this.countryName;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CountryOption)) {
                    return false;
                }
                CountryOption countryOption = (CountryOption) other;
                return Intrinsics.c(this.countryCode, countryOption.countryCode) && Intrinsics.c(this.countryName, countryOption.countryName) && Intrinsics.c(this.flagEmoji, countryOption.flagEmoji);
            }

            public int hashCode() {
                return (((this.countryCode.hashCode() * 31) + this.countryName.hashCode()) * 31) + this.flagEmoji.hashCode();
            }

            @NotNull
            public String toString() {
                return "CountryOption(countryCode=" + this.countryCode + ", countryName=" + this.countryName + ", flagEmoji=" + this.flagEmoji + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable String str, @Nullable String str2, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull List<CountryOption> countryOptions, @Nullable String str3, @NotNull List<Option> idClassOptions, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z10, @NotNull ir.a navigationState, @NotNull vo.i designVersion, @NotNull Function1<? super Option, Unit> onCountrySelected, @NotNull Function1<? super Option, Unit> onIdClassSelected, @NotNull Function0<Unit> onContinueClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @Nullable String str8, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(countryOptions, "countryOptions");
            Intrinsics.checkNotNullParameter(idClassOptions, "idClassOptions");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(onCountrySelected, "onCountrySelected");
            Intrinsics.checkNotNullParameter(onIdClassSelected, "onIdClassSelected");
            Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
            Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
            Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.manualClassificationTitle = str;
            this.unableToClassifyDocumentTitle = str2;
            this.styles = governmentIdStepStyle;
            this.countryOptions = countryOptions;
            this.selectedCountryCode = str3;
            this.idClassOptions = idClassOptions;
            this.selectedIdClass = str4;
            this.countryInputTitle = str5;
            this.idClassInputTitle = str6;
            this.continueButtonText = str7;
            this.isContinueEnabled = z10;
            this.navigationState = navigationState;
            this.designVersion = designVersion;
            this.onCountrySelected = onCountrySelected;
            this.onIdClassSelected = onIdClassSelected;
            this.onContinueClick = onContinueClick;
            this.onBackClick = onBackClick;
            this.onCancelClick = onCancelClick;
            this.navBarTitle = str8;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCountryInputTitle() {
            return this.countryInputTitle;
        }

        @NotNull
        public final List<CountryOption> e() {
            return this.countryOptions;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final vo.i getDesignVersion() {
            return this.designVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getIdClassInputTitle() {
            return this.idClassInputTitle;
        }

        @NotNull
        public final List<Option> h() {
            return this.idClassOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getManualClassificationTitle() {
            return this.manualClassificationTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> l() {
            return this.onBackClick;
        }

        @NotNull
        public final Function0<Unit> m() {
            return this.onCancelClick;
        }

        @NotNull
        public final Function0<Unit> n() {
            return this.onContinueClick;
        }

        @NotNull
        public final Function1<Option, Unit> o() {
            return this.onCountrySelected;
        }

        @NotNull
        public final Function1<Option, Unit> p() {
            return this.onIdClassSelected;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getSelectedIdClass() {
            return this.selectedIdClass;
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsContinueEnabled() {
            return this.isContinueEnabled;
        }

        public /* synthetic */ a(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, List list, String str3, List list2, String str4, String str5, String str6, String str7, boolean z10, ir.a aVar, vo.i iVar, Function1 function1, Function1 function2, Function0 function0, Function0 function3, Function0 function4, String str8, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, governmentIdStepStyle, list, str3, list2, str4, str5, str6, str7, z10, aVar, iVar, function1, function2, function0, function3, function4, (i10 & 262144) != 0 ? null : str8, (i10 & 524288) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b3\u0010HR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010HR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bK\u00102R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\bB\u00102R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\b>\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\bI\u00102R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010HR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bD\u0010R\u001a\u0004\b9\u0010SR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bQ\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010 \u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b7\u0010T\u001a\u0004\bW\u0010VR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bJ\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bK\u0010[\u001a\u0004\bF\u0010\\R\u0017\u0010%\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bL\u0010VR\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bP\u00102R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010]\u001a\u0004\b/\u0010^¨\u0006_"}, d2 = {"Lvo/y3$i;", "Lvo/y3;", "Ll6/s;", "imageLoader", BuildConfig.FLAVOR, "message", "disclaimer", "Lvo/y3$f;", "overlay", "imagePath", "Lvo/d3$e;", "captureSide", "Ldp/e;", "idClass", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "acceptImage", "acceptText", "retryImage", "retryText", "confirmCaptureTitle", "close", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", BuildConfig.FLAVOR, "isEnabled", "isAutoClassifying", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lvo/i;", "designVersion", "keepCameraAlive", "navBarTitle", "Lkr/l;", "transition", "<init>", "(Ll6/s;Ljava/lang/String;Ljava/lang/String;Lvo/y3$f;Ljava/lang/String;Lvo/d3$e;Ldp/e;Lir/a;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lvo/i;ZLjava/lang/String;Lkr/l;)V", "a", "Ll6/s;", "m", "()Ll6/s;", "b", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "c", "j", "d", "Lvo/y3$f;", "t", "()Lvo/y3$f;", "e", "n", "f", "Lvo/d3$e;", "()Lvo/d3$e;", "g", "Ldp/e;", "l", "()Ldp/e;", "h", "Lir/a;", "r", "()Lir/a;", "i", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "k", "u", "v", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "q", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Z", "z", "()Z", "y", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "w", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lvo/i;", "()Lvo/i;", "Lkr/l;", "()Lkr/l;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final l6.s imageLoader;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String disclaimer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f overlay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String imagePath;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final IdConfig.e captureSide;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final dp.e idClass;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ir.a navigationState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> acceptImage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String acceptText;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> retryImage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String retryText;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String confirmCaptureTitle;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> close;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Unit> onErrorDismissed;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final boolean isAutoClassifying;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final vo.i designVersion;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        public final boolean keepCameraAlive;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String navBarTitle;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kr.l transition;

        public i(@NotNull l6.s imageLoader, @NotNull String message, @NotNull String disclaimer, @NotNull f overlay, @NotNull String imagePath, @NotNull IdConfig.e captureSide, @NotNull dp.e idClass, @NotNull ir.a navigationState, @NotNull Function0<Unit> acceptImage, @NotNull String acceptText, @NotNull Function0<Unit> retryImage, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull Function0<Unit> close, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable String str, @NotNull Function0<Unit> onErrorDismissed, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z10, boolean z11, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull vo.i designVersion, boolean z12, @Nullable String str2, @NotNull kr.l transition) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(acceptImage, "acceptImage");
            Intrinsics.checkNotNullParameter(acceptText, "acceptText");
            Intrinsics.checkNotNullParameter(retryImage, "retryImage");
            Intrinsics.checkNotNullParameter(retryText, "retryText");
            Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
            Intrinsics.checkNotNullParameter(close, "close");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.imageLoader = imageLoader;
            this.message = message;
            this.disclaimer = disclaimer;
            this.overlay = overlay;
            this.imagePath = imagePath;
            this.captureSide = captureSide;
            this.idClass = idClass;
            this.navigationState = navigationState;
            this.acceptImage = acceptImage;
            this.acceptText = acceptText;
            this.retryImage = retryImage;
            this.retryText = retryText;
            this.confirmCaptureTitle = confirmCaptureTitle;
            this.close = close;
            this.styles = governmentIdStepStyle;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.assetConfig = capturePage;
            this.isEnabled = z10;
            this.isAutoClassifying = z11;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.designVersion = designVersion;
            this.keepCameraAlive = z12;
            this.navBarTitle = str2;
            this.transition = transition;
        }

        @Override // vo.y3
        public boolean a(@Nullable y3 y3Var) {
            return super.a(y3Var);
        }

        @Override // vo.y3
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public kr.l getTransition() {
            return this.transition;
        }

        @NotNull
        public final Function0<Unit> c() {
            return this.acceptImage;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAcceptText() {
            return this.acceptText;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final IdConfig.e getCaptureSide() {
            return this.captureSide;
        }

        @NotNull
        public final Function0<Unit> g() {
            return this.close;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getConfirmCaptureTitle() {
            return this.confirmCaptureTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final vo.i getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final dp.e getIdClass() {
            return this.idClass;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final l6.s getImageLoader() {
            return this.imageLoader;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getKeepCameraAlive() {
            return this.keepCameraAlive;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final ir.a getNavigationState() {
            return this.navigationState;
        }

        @NotNull
        public final Function0<Unit> s() {
            return this.onErrorDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final f getOverlay() {
            return this.overlay;
        }

        @NotNull
        public final Function0<Unit> u() {
            return this.retryImage;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getRetryText() {
            return this.retryText;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public /* synthetic */ i(l6.s sVar, String str, String str2, f fVar, String str3, IdConfig.e eVar, dp.e eVar2, ir.a aVar, Function0 function0, String str4, Function0 function1, String str5, String str6, Function0 function2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, String str7, Function0 function3, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z10, boolean z11, StyleElements.Axis axis, vo.i iVar, boolean z12, String str8, kr.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(sVar, str, str2, fVar, str3, eVar, eVar2, aVar, function0, str4, function1, str5, str6, function2, governmentIdStepStyle, str7, function3, capturePage, z10, z11, axis, iVar, (i10 & 4194304) != 0 ? false : z12, (i10 & 8388608) != 0 ? null : str8, (i10 & 16777216) != 0 ? kr.l.SLIDE_IN : lVar);
        }
    }
}
