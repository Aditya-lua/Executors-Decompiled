package fq;

import android.content.Context;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vr.TimerWorker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002:\u0004¯\u0001°\u0001B\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020NH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020dH\u0002¢\u0006\u0004\be\u0010fJ9\u0010m\u001a\u00020\u0004\"\f\b\u0000\u0010h*\u00020\u0004*\u00020g*\b\u0012\u0004\u0012\u00020\u00040i2\u0006\u0010j\u001a\u00028\u00002\b\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020^H\u0002¢\u0006\u0004\bo\u0010`J\u0017\u0010q\u001a\u00020^2\u0006\u0010p\u001a\u00020\u0005H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020^2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\u0003¢\u0006\u0004\bx\u0010yJ\u001d\u0010z\u001a\u00020^2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{J-\u0010~\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020|2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040iH\u0000¢\u0006\u0004\b~\u0010\u007fJ(\u0010\u0082\u0001\u001a\u00020^*\b\u0012\u0004\u0012\u00020\u00040i2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J9\u0010\u0087\u0001\u001a\u0014\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020^0\u0085\u0001j\u0003`\u0086\u0001*\b\u0012\u0004\u0012\u00020\u00040i2\t\b\u0002\u0010\u0084\u0001\u001a\u00020WH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001¨\u0006±\u0001"}, d2 = {"Lfq/k2;", "", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcq/b$a;", "submitVerificationWorker", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lln/a;", "cameraStatsManager", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Lku/p0;", "coroutineScope", "Ldq/a$b;", "selfiePoseManagerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lgo/e;", "featureFlagManager", "Lqq/c;", "sdkFilesManager", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lcq/b$a;Ltr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lln/a;Luq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lku/p0;Ldq/a$b;Lcom/withpersona/sdk2/inquiry/selfie/g;Lgo/e;Lqq/c;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "renderState", "g1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "e2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "X1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "R2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "j2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "o2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "w2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "A1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "F1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "o1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "v1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "R1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "a3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "k3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "e1", "Lmn/a;", "j3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;", "", "i3", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "C2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "T", "Lvr/f;", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "f1", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "f3", "output", "h3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V", "", "error", "g3", "(Ljava/lang/Throwable;)V", "props", "b1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "d1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "workflowContext", "Q1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lvr/f;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lur/a;", "webRtcManagerBridge", "c1", "(Lvr/f;Lur/a;)V", "inRecoverableState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "Z0", "(Lvr/f;Z)Lkotlin/jvm/functions/Function1;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcq/b$a;", "h", "Ltr/b$a;", "i", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "j", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "k", "Lcom/withpersona/sdk2/camera/e$a;", "l", "Lhn/c$a;", "m", "Lln/a;", "n", "Luq/a;", "o", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "p", "Ldq/a$b;", "q", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "r", "Lgo/e;", "s", "Lqq/c;", "t", "Lur/a;", "webRtcManager", "Ldq/a;", "u", "Ldq/a;", "selfiePoseManager", "v", "c", "d", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k2 extends vr.c<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.b, SelfieWorkflow.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cq.b.a submitVerificationWorker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tr.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.selfie.e.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ln.a cameraStatsManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dq.a.b selfiePoseManagerFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ur.a webRtcManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dq.a selfiePoseManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$1$1", f = "SelfieStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17109t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieState f17111v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelfieState selfieState, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f17111v = selfieState;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return k2.this.new a(this.f17111v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f17109t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            k2 k2Var = k2.this;
            k2Var.d1(k2Var.b().getValue(), this.f17111v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$2", f = "SelfieStepStateManager.kt", l = {173}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17112t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k2 f17114a;

            public a(k2 k2Var) {
                this.f17114a = k2Var;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SelfieWorkflow.Input input, nt.b<? super Unit> bVar) {
                k2 k2Var = this.f17114a;
                SelfieState selfieState = (SelfieState) k2Var.d().i();
                if (selfieState == null) {
                    return Unit.f22483a;
                }
                k2Var.d1(input, selfieState);
                return Unit.f22483a;
            }
        }

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return k2.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17112t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.c0<SelfieWorkflow.Input> c0VarB = k2.this.b();
                a aVar = new a(k2.this);
                this.f17112t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            throw new jt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lfq/k2$d;", "", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lfq/k2;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Lfq/k2;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        @NotNull
        k2 a(@NotNull SelfieWorkflow.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17115a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[kn.a.values().length];
            try {
                iArr[kn.a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kn.a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kn.a.Up.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kn.a.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kn.a.Center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17115a = iArr;
            int[] iArr2 = new int[yp.x.values().length];
            try {
                iArr2[yp.x.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[yp.x.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[yp.x.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[yp.x.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[yp.x.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$1", f = "SelfieStepStateManager.kt", l = {MlKitException.CODE_SCANNER_CANCELLED}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17116t;

        public f(nt.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new f(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17116t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.j jVar = fn.j.f16915a;
                Context context = k2.this.applicationContext;
                this.f17116t = 1;
                if (jVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            ur.a aVar = k2.this.webRtcManager;
            if (aVar != null) {
                aVar.d();
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$2", f = "SelfieStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class g extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17118t;

        public g(nt.b<? super g> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new g(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f17118t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            k2.this.i3();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderAcquireNextPose$1", f = "SelfieStepStateManager.kt", l = {270}, m = "invokeSuspend")
    public static final class h extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17120t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f17122v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, nt.b<? super h> bVar) {
            super(1, bVar);
            this.f17122v = i10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new h(this.f17122v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objE = ot.c.e();
            int i10 = this.f17120t;
            if (i10 == 0) {
                jt.o.b(obj);
                dq.a aVar = k2.this.selfiePoseManager;
                int i11 = this.f17122v;
                this.f17120t = 1;
                Object objK = aVar.k(i11, this);
                if (objK == objE) {
                    return objE;
                }
                value = objK;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                value = ((jt.n) obj).getValue();
            }
            k2 k2Var = k2.this;
            if (jt.n.h(value)) {
                PoseInfo poseInfo = (PoseInfo) value;
                WorkflowState workflowStateI = k2Var.d().i();
                SelfieState.AcquireNextPose acquireNextPose = workflowStateI instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) workflowStateI : null;
                if (acquireNextPose != null) {
                    k2Var.d().p(k2Var.f1(k2Var.d(), SelfieState.AcquireNextPose.A(acquireNextPose, null, 0L, null, null, null, false, kotlin.collections.o.d(poseInfo), null, false, 447, null), null));
                }
            }
            k2 k2Var2 = k2.this;
            Throwable thE = jt.n.e(value);
            if (thE != null) {
                k2Var2.g3(thE);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$1", f = "SelfieStepStateManager.kt", l = {1368, 1376}, m = "invokeSuspend")
    public static final class i extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f17123t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17124u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17125v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieState.Capture f17126w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k2 f17127x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.Input f17128y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SelfieState.Capture capture, k2 k2Var, SelfieWorkflow.Input input, nt.b<? super i> bVar) {
            super(1, bVar);
            this.f17126w = capture;
            this.f17127x = k2Var;
            this.f17128y = input;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new i(this.f17126w, this.f17127x, this.f17128y, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            long j10;
            SelfieState.Capture capture;
            Object objE = ot.c.e();
            int i10 = this.f17125v;
            if (i10 == 0) {
                jt.o.b(obj);
                long jLongValue = this.f17126w.getCaptureDeadlineEpochMs().longValue() - System.currentTimeMillis();
                kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                long jQ = kotlin.time.b.q(jLongValue, ju.b.MILLISECONDS);
                this.f17123t = jLongValue;
                this.f17125v = 1;
                if (ku.z0.c(jQ, this) != objE) {
                    j10 = jLongValue;
                }
                return objE;
            }
            if (i10 == 1) {
                j10 = this.f17123t;
                jt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                capture = (SelfieState.Capture) this.f17124u;
                jt.o.b(obj);
            }
            this.f17127x.selfieEventLogger.n();
            if (this.f17127x.b().getValue().getSkipPromptPage()) {
                this.f17127x.d().p(new SelfieState.AcquireNextPose(capture.getCameraProperties(), capture.getStartSelfieTimestamp(), kotlin.collections.p.k(), l2.a(this.f17127x.d(), false), capture.getCameraFacingMode(), capture.getIsFlashEnabled(), this.f17126w.g(), this.f17128y.getPoseConfigs(), capture.getAutoCaptureSupported()));
            } else {
                this.f17127x.d().p(new SelfieState.ShowInstructions(null, null, this.f17128y.getStrings().getSelfieHintPoseTimeout(), 2, null));
            }
            return Unit.f22483a;
            WorkflowState workflowStateI = this.f17127x.d().i();
            SelfieState.Capture capture2 = workflowStateI instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateI : null;
            if (capture2 != null && Intrinsics.c(capture2.getCaptureDeadlineEpochMs(), this.f17126w.getCaptureDeadlineEpochMs())) {
                l2.c(capture2);
                dq.a aVar = this.f17127x.selfiePoseManager;
                this.f17124u = capture2;
                this.f17123t = j10;
                this.f17125v = 2;
                if (aVar.o(this) != objE) {
                    capture = capture2;
                    this.f17127x.selfieEventLogger.n();
                    if (this.f17127x.b().getValue().getSkipPromptPage()) {
                        this.f17127x.d().p(new SelfieState.AcquireNextPose(capture.getCameraProperties(), capture.getStartSelfieTimestamp(), kotlin.collections.p.k(), l2.a(this.f17127x.d(), false), capture.getCameraFacingMode(), capture.getIsFlashEnabled(), this.f17126w.g(), this.f17128y.getPoseConfigs(), capture.getAutoCaptureSupported()));
                    } else {
                        this.f17127x.d().p(new SelfieState.ShowInstructions(null, null, this.f17128y.getStrings().getSelfieHintPoseTimeout(), 2, null));
                    }
                    return Unit.f22483a;
                }
                return objE;
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$3", f = "SelfieStepStateManager.kt", l = {1533}, m = "invokeSuspend")
    public static final class j extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17129t;

        public j(nt.b<? super j> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new j(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17129t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f17129t = 1;
                if (ku.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = k2.this.d().i();
            SelfieState.Capture capture = workflowStateI instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateI : null;
            if (capture == null) {
                return Unit.f22483a;
            }
            k2.this.d().p(capture.z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.a.ReadyToCapture, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$4", f = "SelfieStepStateManager.kt", l = {1545}, m = "invokeSuspend")
    public static final class k extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17131t;

        public k(nt.b<? super k> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new k(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17131t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f17131t = 1;
                if (ku.z0.b(3000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = k2.this.d().i();
            SelfieState.Capture capture = workflowStateI instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateI : null;
            if (capture == null) {
                return Unit.f22483a;
            }
            k2.this.d().p(capture.z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.a.Enabled, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToCapture$2", f = "SelfieStepStateManager.kt", l = {1180}, m = "invokeSuspend")
    public static final class l extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f17133t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f17134u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.Input f17135v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k2 f17136w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieState.CountdownToCapture f17137x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(SelfieWorkflow.Input input, k2 k2Var, SelfieState.CountdownToCapture countdownToCapture, nt.b<? super l> bVar) {
            super(1, bVar);
            this.f17135v = input;
            this.f17136w = k2Var;
            this.f17137x = countdownToCapture;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new l(this.f17135v, this.f17136w, this.f17137x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            long j10;
            Object objE = ot.c.e();
            int i10 = this.f17134u;
            if (i10 == 0) {
                jt.o.b(obj);
                long jA = com.withpersona.sdk2.inquiry.selfie.n.a(this.f17135v);
                this.f17133t = jA;
                this.f17134u = 1;
                if (ku.z0.b(jA, this) == objE) {
                    return objE;
                }
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f17133t;
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = this.f17136w.d().i();
            SelfieState.CountdownToCapture countdownToCapture = workflowStateI instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) workflowStateI : null;
            if (countdownToCapture == null) {
                return Unit.f22483a;
            }
            int countDown = countdownToCapture.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                this.f17136w.d().p(new SelfieState.Capture(countdownToCapture.getSelfieError(), this.f17137x.getPoseScore(), this.f17137x.getBrightnessInfo(), null, countdownToCapture.g(), countdownToCapture.getStartCaptureTimestamp(), false, this.f17137x.getStartSelfieTimestamp(), countdownToCapture.getCameraProperties(), l2.a(this.f17136w.d(), false), this.f17135v.getPoseConfigs(), this.f17137x.getCameraFacingMode(), this.f17137x.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24648, null));
            } else {
                this.f17136w.d().p(countdownToCapture.z((32764 & 1) != 0 ? countdownToCapture.countDown : countDown - 1, (32764 & 2) != 0 ? countdownToCapture.selfieError : countdownToCapture.getSelfieError(), (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : false, (32764 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? countdownToCapture.isDimLightConditions : false));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToManualCapture$1", f = "SelfieStepStateManager.kt", l = {1275}, m = "invokeSuspend")
    public static final class m extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17138t;

        public m(nt.b<? super m> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new m(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17138t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f17138t = 1;
                if (ku.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = k2.this.d().i();
            SelfieState.CountdownToManualCapture countdownToManualCapture = workflowStateI instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) workflowStateI : null;
            if (countdownToManualCapture == null) {
                return Unit.f22483a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                k2.this.d().p(countdownToManualCapture.z((4092 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : false, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderFinalizeVideoCapture$1", f = "SelfieStepStateManager.kt", l = {1995}, m = "invokeSuspend")
    public static final class n extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17140t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SelfieState.FinalizeLocalVideoCapture f17141u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vr.f<SelfieState> f17142v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, vr.f<SelfieState> fVar, nt.b<? super n> bVar) {
            super(1, bVar);
            this.f17141u = finalizeLocalVideoCapture;
            this.f17142v = fVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new n(this.f17141u, this.f17142v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17140t;
            if (i10 == 0) {
                jt.o.b(obj);
                long minDurationMs = this.f17141u.getMinDurationMs();
                this.f17140t = 1;
                if (ku.z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = this.f17142v.i();
            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateI instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) workflowStateI : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f22483a;
            }
            this.f17142v.p(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderShowInstructions$1", f = "SelfieStepStateManager.kt", l = {373}, m = "invokeSuspend")
    public static final class o extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17143t;

        public o(nt.b<? super o> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return k2.this.new o(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f17143t;
            if (i10 == 0) {
                jt.o.b(obj);
                kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                long jP = kotlin.time.b.p(3, ju.b.SECONDS);
                this.f17143t = 1;
                if (ku.z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = k2.this.d().i();
            SelfieState.ShowInstructions showInstructions = workflowStateI instanceof SelfieState.ShowInstructions ? (SelfieState.ShowInstructions) workflowStateI : null;
            if (showInstructions == null) {
                return Unit.f22483a;
            }
            k2.this.d().p(SelfieState.ShowInstructions.A(showInstructions, null, null, null, 3, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$runManualCaptureEnabledChecker$1", f = "SelfieStepStateManager.kt", l = {2216}, m = "invokeSuspend")
    public static final class p extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17145t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.y f17146u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k2 f17147v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.jvm.internal.y yVar, k2 k2Var, nt.b<? super p> bVar) {
            super(1, bVar);
            this.f17146u = yVar;
            this.f17147v = k2Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new p(this.f17146u, this.f17147v, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0020
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r5.f17145t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jt.o.b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jt.o.b(r6)
            L1a:
                kotlin.jvm.internal.y r6 = r5.f17146u
                boolean r6 = r6.f22568a
                if (r6 == 0) goto L53
                r5.f17145t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = ku.z0.b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                fq.k2 r6 = r5.f17147v
                vr.f r6 = r6.d()
                com.withpersona.sdk2.inquiry.workflows.WorkflowState r6 = r6.i()
                com.withpersona.sdk2.inquiry.selfie.SelfieState r6 = (com.withpersona.sdk2.inquiry.selfie.SelfieState) r6
                boolean r1 = r6 instanceof com.withpersona.sdk2.inquiry.selfie.b
                if (r1 == 0) goto L1a
                r1 = r6
                com.withpersona.sdk2.inquiry.selfie.b r1 = (com.withpersona.sdk2.inquiry.selfie.b) r1
                boolean r1 = r1.o()
                if (r1 == 0) goto L1a
                fq.k2 r1 = r5.f17147v
                vr.f r1 = r1.d()
                r1.p(r6)
                kotlin.jvm.internal.y r6 = r5.f17146u
                r1 = 0
                r6.f22568a = r1
                goto L1a
            L53:
                kotlin.Unit r6 = kotlin.Unit.f22483a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fq.k2.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(@NotNull SelfieWorkflow.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull cq.b.a submitVerificationWorker, @NotNull tr.b.a webRtcWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.selfie.e.b selfieAnalyzeWorker, @NotNull com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorkerFactory, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull ln.a cameraStatsManager, @NotNull uq.a navigationStateManager, @NotNull DirectFileUploader directFileUploader, @NotNull final ku.p0 coroutineScope, @NotNull dq.a.b selfiePoseManagerFactory, @NotNull com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger, @NotNull go.e featureFlagManager, @NotNull qq.c sdkFilesManager) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(submitVerificationWorker, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(selfiePoseManagerFactory, "selfiePoseManagerFactory");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManagerFactory = selfiePoseManagerFactory;
        this.selfieEventLogger = selfieEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.sdkFilesManager = sdkFilesManager;
        this.webRtcManager = ur.c.b();
        this.selfiePoseManager = selfiePoseManagerFactory.a(b().getValue().getInquiryId(), b().getValue().getSessionToken(), b().getValue().getFromStep(), b().getValue().C(), b().getValue().getPoseTimeoutMs());
        selfieEventLogger.o(b().getValue().getUsePerPoseReveal());
        if (d().i() == null) {
            d().p(b1(b().getValue()));
        }
        d().o(new Function1() { // from class: fq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.Q0(coroutineScope, this, (SelfieState) obj);
            }
        });
        ku.k.d(coroutineScope, ku.g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit B1(k2 k2Var, SelfieState.CountdownToCapture countdownToCapture, SelfieWorkflow.Input input, com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.CountdownToCapture countdownToCapture2 = workflowStateI instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) workflowStateI : null;
        if (countdownToCapture2 == null) {
            return Unit.f22483a;
        }
        if (!(output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a)) {
            if (output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b) {
                k2Var.g3(((com.withpersona.sdk2.inquiry.selfie.e.c.b) output).getError());
            } else {
                if (!(output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c)) {
                    throw new jt.l();
                }
                k2Var.d().p(new SelfieState.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.g(), null, countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) output).getIsDimLightConditions(), 163, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit B2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit C1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit D1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public static final Unit D2(k2 k2Var, boolean z10, cq.b.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof cq.b.d.C0260b) {
            k2Var.h3(SelfieWorkflow.b.d.f12636a);
        } else {
            if (!(it instanceof cq.b.d.Error)) {
                throw new jt.l();
            }
            WorkflowState workflowStateI = k2Var.d().i();
            SelfieState.Submit submit = workflowStateI instanceof SelfieState.Submit ? (SelfieState.Submit) workflowStateI : null;
            if (submit == null) {
                return Unit.f22483a;
            }
            if (z10) {
                cq.b.d.Error error = (cq.b.d.Error) it;
                if (com.withpersona.sdk2.inquiry.selfie.p.B(error.getCause())) {
                    k2Var.d().p(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
                } else {
                    k2Var.h3(new SelfieWorkflow.b.Error(((cq.b.d.Error) it).getCause()));
                }
            } else {
                k2Var.h3(new SelfieWorkflow.b.Error(((cq.b.d.Error) it).getCause()));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit E1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit E2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit F2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit G1(PoseInfo poseInfo, kn.a aVar, k2 k2Var, SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), countdownToManualCapture, new Selfie.SelfieImage(absolutePath, Selfie.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f22483a;
    }

    public static final Unit G2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit H1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f22483a;
    }

    public static final Unit H2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit I1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit I2(k2 k2Var) {
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.Submit submit = workflowStateI instanceof SelfieState.Submit ? (SelfieState.Submit) workflowStateI : null;
        if (submit == null) {
            return Unit.f22483a;
        }
        k2Var.d().p(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f22483a;
    }

    public static final Unit J1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit K1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit K2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, long j10, CameraProperties cameraProperties) {
        SelfieState showPoseHint;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        k2Var.selfieEventLogger.n();
        if (k2Var.j3(input) == mn.a.Stream) {
            k2Var.selfieEventLogger.k();
            k2Var.d().p(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, l2.a(k2Var.d(), false), waitForCameraFeed.g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            k2Var.selfieEventLogger.b((SelfieState) k2Var.d().i());
            kn.a pose = ((PoseInfo) CollectionsKt.d0(waitForCameraFeed.g())).getPose();
            vr.f<SelfieState> fVarD = k2Var.d();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new SelfieState.AcquireNextPose(cameraProperties, j10, kotlin.collections.p.k(), l2.a(k2Var.d(), false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.g(), input.getPoseConfigs(), true);
            } else if (pose == kn.a.Center) {
                showPoseHint = new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.g(), null, System.currentTimeMillis(), false, j10, cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new SelfieState.ShowPoseHint(kotlin.collections.p.k(), waitForCameraFeed.g(), true, cameraProperties, j10, l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            fVarD.p(showPoseHint);
        }
        return Unit.f22483a;
    }

    public static final Unit L1(vr.f fVar, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.a.MANUAL));
        WorkflowState workflowStateI = fVar.i();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateI instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) workflowStateI : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f22483a;
        }
        fVar.p(SelfieState.FinalizeLocalVideoCapture.A(finalizeLocalVideoCapture, CollectionsKt.w0(finalizeLocalVideoCapture.w(), arrayList), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f22483a;
    }

    public static final Unit L2(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a1(k2Var, k2Var.d(), false, 1, null).invoke(it);
        return Unit.f22483a;
    }

    public static final Unit M1(vr.f fVar, SelfieWorkflow.Input input, SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        WorkflowState workflowStateI = fVar.i();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = workflowStateI instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) workflowStateI : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            fVar.p(l2.e(fVar, input.getPoseConfigs(), finalizeLocalVideoCapture2.w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), l2.a(fVar, false)));
            return Unit.f22483a;
        }
        return Unit.f22483a;
    }

    public static final Unit M2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit N1(k2 k2Var, vr.f fVar) {
        k2Var.c1(fVar, null);
        return Unit.f22483a;
    }

    public static final Unit N2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit O1(k2 k2Var) {
        k2Var.e(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit O2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit P1(k2 k2Var, vr.f fVar, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, fVar, input, true);
        return Unit.f22483a;
    }

    public static final Unit P2(k2 k2Var, SelfieState.WaitForCameraFeed waitForCameraFeed, SelfieWorkflow.Input input, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == rp.j1.PermissionGranted) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            k2Var.d().p(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            k2Var.h3(SelfieWorkflow.b.a.f12633a);
        } else if (it.getPermissionState().getResult() == rp.j1.SettingsLaunched) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else {
            k2Var.h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22483a;
    }

    public static final Unit Q0(ku.p0 p0Var, k2 k2Var, SelfieState selfieState) {
        if (selfieState == null) {
            return Unit.f22483a;
        }
        ku.k.d(p0Var, ku.g1.d(), null, k2Var.new a(selfieState, null), 2, null);
        return Unit.f22483a;
    }

    public static final Unit Q2(k2 k2Var, SelfieState.WaitForCameraFeed waitForCameraFeed, SelfieWorkflow.Input input, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == rp.j1.PermissionGranted) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            k2Var.d().p(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            k2Var.h3(SelfieWorkflow.b.a.f12633a);
        } else if (it.getPermissionState().getResult() == rp.j1.SettingsLaunched) {
            k2Var.d().p(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else {
            k2Var.h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22483a;
    }

    public static final Unit S1(k2 k2Var, SelfieWorkflow.Input input, SelfieState.FinalizeWebRtc finalizeWebRtc, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.selfieEventLogger.m(input.getFromStep());
        k2Var.d().p(new SelfieState.WebRtcFinished(finalizeWebRtc.w(), it, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), l2.a(k2Var.d(), false), finalizeWebRtc.getCameraFacingMode()));
        k2Var.webRtcManager.d();
        return Unit.f22483a;
    }

    public static final Unit S2(final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final k2 k2Var, final SelfieWorkflow.Input input, tr.b.AbstractC0578b it) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof tr.b.AbstractC0578b.C0579b) {
            CameraProperties cameraProperties = waitForWebRtcSetup.getCameraProperties();
            ur.a aVar = k2Var.webRtcManager;
            if (aVar != null) {
                aVar.h(k2Var.webRtcWorkerFactory.getService());
            }
            ur.a aVar2 = k2Var.webRtcManager;
            if (aVar2 != null) {
                aVar2.i(k2Var.applicationContext);
            }
            int width = cameraProperties.getSize().getWidth();
            int height = cameraProperties.getSize().getHeight();
            if (cameraProperties.getRotation() == 90 || cameraProperties.getRotation() == 270) {
                i10 = width;
                i11 = height;
            } else {
                i11 = width;
                i10 = height;
            }
            ur.a aVar3 = k2Var.webRtcManager;
            if (aVar3 != null) {
                tr.b.AbstractC0578b.C0579b c0579b = (tr.b.AbstractC0578b.C0579b) it;
                aVar3.e(c0579b.getResult().getUsername(), c0579b.getResult().getCredential(), c0579b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: fq.e2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k2.T2(this.f17061a, input, waitForWebRtcSetup);
                    }
                }, new Function0() { // from class: fq.f2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k2.U2(this.f17067a, waitForWebRtcSetup);
                    }
                }, new Function0() { // from class: fq.g2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k2.V2(this.f17072a, input);
                    }
                }, new Function1() { // from class: fq.h2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k2.W2(this.f17077a, (String) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof tr.b.AbstractC0578b.Error)) {
                throw new jt.l();
            }
            ur.a aVar4 = k2Var.webRtcManager;
            if (aVar4 != null) {
                aVar4.a();
            }
            k2Var.d().p(new SelfieState.RestartCamera(false, false, l2.a(k2Var.d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        }
        return Unit.f22483a;
    }

    public static final Unit T1() {
        return Unit.f22483a;
    }

    public static final Unit T2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        k2Var.selfieEventLogger.l(input.getFromStep());
        k2Var.selfieEventLogger.b((SelfieState) k2Var.d().i());
        k2Var.d().p(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.g(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit U1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit U2(k2 k2Var, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        k2Var.webRtcManager.a();
        k2Var.d().p(new SelfieState.RestartCamera(false, false, l2.a(k2Var.d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f22483a;
    }

    public static final Unit V1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit V2(k2 k2Var, SelfieWorkflow.Input input) {
        k2Var.selfieEventLogger.j(input.getFromStep());
        return Unit.f22483a;
    }

    public static final Unit W1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit W2(k2 k2Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        k2Var.selfieEventLogger.i(step);
        return Unit.f22483a;
    }

    public static final Unit X2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit Y0(vr.f fVar, k2 k2Var, boolean z10, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        SelfieState selfieState = (SelfieState) fVar.i();
        if (selfieState == null) {
            return Unit.f22483a;
        }
        if (!(cameraError instanceof fn.h)) {
            k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f22483a;
        }
        fn.h hVar = (fn.h) cameraError;
        if (!(hVar instanceof fn.h0)) {
            if (hVar instanceof fn.i0) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (hVar instanceof fn.d0) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else if (hVar instanceof fn.m0) {
                if (z10) {
                    l2.c(selfieState);
                    if (com.withpersona.sdk2.inquiry.selfie.p.H(selfieState)) {
                        fVar.p(new SelfieState.RestartCamera(false, false, l2.a(fVar, false), selfieState.getCameraFacingMode(), 3, null));
                    }
                } else {
                    k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                }
            } else if (hVar instanceof fn.v) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
            } else if (hVar instanceof fn.v0) {
                k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
            } else {
                if (!(hVar instanceof fn.l0)) {
                    throw new jt.l();
                }
                if (z10) {
                    l2.c(selfieState);
                    if (com.withpersona.sdk2.inquiry.selfie.p.H(selfieState)) {
                        fVar.p(new SelfieState.RestartCamera(false, false, l2.a(fVar, false), selfieState.getCameraFacingMode(), 3, null));
                    }
                } else {
                    k2Var.e(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                }
            }
        }
        return Unit.f22483a;
    }

    public static final Unit Y1(k2 k2Var, SelfieWorkflow.Input input, SelfieState.RestartCamera restartCamera) {
        k2Var.d().p(new SelfieState.WaitForCameraFeed(false, false, l2.a(k2Var.d(), false), input.A(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit Y2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit Z2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static /* synthetic */ Function1 a1(k2 k2Var, vr.f fVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k2Var.Z0(fVar, z10);
    }

    public static final Unit a2(k2 k2Var, SelfieState.ReviewCaptures reviewCaptures) {
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.ReviewCaptures reviewCaptures2 = workflowStateI instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) workflowStateI : null;
        if (reviewCaptures2 == null) {
            return Unit.f22483a;
        }
        k2Var.d().p(new SelfieState.Submit(reviewCaptures2.w(), reviewCaptures2.getWebRtcObjectId(), reviewCaptures2.getCameraProperties(), reviewCaptures2.getStartSelfieTimestamp(), l2.a(k2Var.d(), true), reviewCaptures.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f22483a;
    }

    public static final Unit b2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.ReviewCaptures reviewCaptures) {
        k2Var.d().p(new SelfieState.WaitForCameraFeed(false, false, l2.a(k2Var.d(), false), input.A(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit b3(k2 k2Var, SelfieState.WebRtcFinished webRtcFinished) {
        k2Var.d().p(l2.e(k2Var.d(), k2Var.b().getValue().getPoseConfigs(), webRtcFinished.w(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), l2.a(k2Var.d(), false)));
        return Unit.f22483a;
    }

    public static final Unit c2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit c3(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit d2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit d3(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit e3(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit f2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit g2(k2 k2Var, SelfieState.ShowInstructions showInstructions) {
        k2Var.f(SelfieState.ShowInstructions.A(showInstructions, null, null, null, 3, null));
        return Unit.f22483a;
    }

    public static final Unit h1(kn.a pose, boolean z10) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        return Unit.f22483a;
    }

    public static final Unit h2(k2 k2Var, SelfieWorkflow.Input input, SelfieState.ShowInstructions showInstructions) {
        k2Var.selfieEventLogger.c();
        k2Var.d().p(new SelfieState.WaitForCameraFeed(false, false, l2.b(k2Var.d(), false, 1, null), input.A(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit i1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.AcquireNextPose acquireNextPose = workflowStateI instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) workflowStateI : null;
        if (acquireNextPose == null) {
            return Unit.f22483a;
        }
        l2.c(acquireNextPose);
        k2Var.d().p(new SelfieState.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), kotlin.collections.p.k(), l2.a(k2Var.d(), false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), kotlin.collections.p.k(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f22483a;
    }

    public static final Unit i2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit j1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit k1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit k2(k2 k2Var, SelfieState.ShowPoseHint showPoseHint, SelfieWorkflow.Input input) {
        vr.f<SelfieState> fVarD = k2Var.d();
        List<PoseInfo> listG = showPoseHint.g();
        fVarD.p(new SelfieState.Capture(null, 0.0f, null, showPoseHint.w(), listG, System.currentTimeMillis(), showPoseHint.getAutoCaptureSupported(), showPoseHint.getStartSelfieTimestamp(), showPoseHint.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), showPoseHint.getCameraFacingMode(), showPoseHint.getIsFlashEnabled(), null, k2Var.b().getValue().getUsePerPoseReveal() ? Long.valueOf(System.currentTimeMillis() + k2Var.selfiePoseManager.getPerPoseTimeoutMs()) : null, false, 8193, null));
        return Unit.f22483a;
    }

    public static final Unit l1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit l2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit m1(k2 k2Var, CameraProperties.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.d().p(new SelfieState.RestartCamera(false, false, l2.a(k2Var.d(), false), it, 3, null));
        return Unit.f22483a;
    }

    public static final Unit m2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit n1(boolean z10) {
        return Unit.f22483a;
    }

    public static final Unit n2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit p1(k2 k2Var, SelfieState.Capture capture, com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.Capture capture2 = workflowStateI instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateI : null;
        if (capture2 == null) {
            return Unit.f22483a;
        }
        if (output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a) {
            com.withpersona.sdk2.inquiry.selfie.e.c.a aVar = (com.withpersona.sdk2.inquiry.selfie.e.c.a) output;
            if (aVar.getSelfie() != null) {
                Selfie selfie = aVar.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                k2Var.selfieEventLogger.g(capture2, selfie);
                k2Var.d().p(k2Var.f1(k2Var.d(), capture, selfie));
            } else {
                k2Var.d().p(capture2.z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : 0.0f, (57343 & 4) != 0 ? capture2.brightnessInfo : null, (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : SelfieState.a.FlashOn, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : false));
            }
        } else if (output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) {
            com.withpersona.sdk2.inquiry.selfie.e.c.C0240c c0240c = (com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) output;
            if (c0240c.getError() == kn.b.FaceDetectionUnsupported) {
                k2Var.d().p(capture2.z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : c0240c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0240c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0240c.getIsDimLightConditions()));
            } else {
                k2Var.d().p(capture2.z((57343 & 1) != 0 ? capture2.selfieError : c0240c.getError(), (57343 & 2) != 0 ? capture2.poseScore : c0240c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0240c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0240c.getIsDimLightConditions()));
            }
        } else {
            if (!(output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b)) {
                throw new jt.l();
            }
            k2Var.g3(((com.withpersona.sdk2.inquiry.selfie.e.c.b) output).getError());
        }
        return Unit.f22483a;
    }

    public static final Unit p2(k2 k2Var, SelfieState.StartCapture startCapture, SelfieWorkflow.Input input, com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.StartCapture startCapture2 = workflowStateI instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) workflowStateI : null;
        if (startCapture2 == null) {
            return Unit.f22483a;
        }
        if (output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a) {
            com.withpersona.sdk2.inquiry.selfie.e.c.a aVar = (com.withpersona.sdk2.inquiry.selfie.e.c.a) output;
            k2Var.d().p(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar.getPoseScore(), aVar.getBrightnessInfo(), startCapture.g(), startCapture.w(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar.getIsDimLightConditions()));
        } else if (output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b) {
            k2Var.g3(((com.withpersona.sdk2.inquiry.selfie.e.c.b) output).getError());
        } else {
            if (!(output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c)) {
                throw new jt.l();
            }
            com.withpersona.sdk2.inquiry.selfie.e.c.C0240c c0240c = (com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) output;
            k2Var.d().p(c0240c.getError() == kn.b.FaceDetectionUnsupported ? startCapture2.z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : null, (16242 & 4) != 0 ? startCapture2.poseScore : c0240c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0240c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? startCapture2.isDimLightConditions : c0240c.getIsDimLightConditions()) : startCapture2.z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : c0240c.getError(), (16242 & 4) != 0 ? startCapture2.poseScore : c0240c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0240c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? startCapture2.isDimLightConditions : c0240c.getIsDimLightConditions()));
        }
        return Unit.f22483a;
    }

    public static final Unit q1(PoseInfo poseInfo, kn.a aVar, k2 k2Var, SelfieState.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), capture, new Selfie.SelfieImage(absolutePath, Selfie.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f22483a;
    }

    public static final Unit q2(k2 k2Var, SelfieState.StartCapture startCapture, SelfieWorkflow.Input input) {
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.StartCapture startCapture2 = workflowStateI instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) workflowStateI : null;
        if (startCapture2 == null) {
            return Unit.f22483a;
        }
        k2Var.d().p(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        k2Var.selfieEventLogger.d(startCapture2);
        return Unit.f22483a;
    }

    public static final Unit r1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f22483a;
    }

    public static final Unit r2(PoseInfo poseInfo, k2 k2Var, SelfieState.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), startCapture, new Selfie.SelfieImage(absolutePath, Selfie.a.MANUAL, poseInfo.getPose(), System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f22483a;
    }

    public static final Unit s1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit s2(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f22483a;
    }

    public static final Unit t1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit t2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit u1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit u2(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit v2(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit w1(k2 k2Var) {
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.CaptureTransition captureTransition = workflowStateI instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) workflowStateI : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            k2Var.d().p(nextState);
        }
        return Unit.f22483a;
    }

    public static final Unit x1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit x2(k2 k2Var, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, SelfieWorkflow.Input input, com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (!(output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a)) {
            if (output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b) {
                k2Var.g3(((com.withpersona.sdk2.inquiry.selfie.e.c.b) output).getError());
            } else {
                if (!(output instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c)) {
                    throw new jt.l();
                }
                vr.f<SelfieState> fVarD = k2Var.d();
                com.withpersona.sdk2.inquiry.selfie.e.c.C0240c c0240c = (com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) output;
                kn.b error = c0240c.getError();
                List<PoseInfo> listG = startCaptureFaceDetected.g();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                fVarD.p(new SelfieState.StartCapture(false, error, c0240c.getPoseScore(), c0240c.getBrightnessInfo(), listG, null, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c0240c.getIsDimLightConditions(), 161, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit y1(k2 k2Var) {
        k2Var.h3(SelfieWorkflow.b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit y2(k2 k2Var, SelfieWorkflow.Input input, Unit it) {
        SelfieState countdownToCapture;
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateI = k2Var.d().i();
        SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = workflowStateI instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) workflowStateI : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f22483a;
        }
        k2Var.selfieEventLogger.a(startCaptureFaceDetected);
        boolean z10 = input.getDesignVersion() == yp.a.K0000 && startCaptureFaceDetected.j() == kn.a.Center;
        vr.f<SelfieState> fVarD = k2Var.d();
        if (z10) {
            List<PoseInfo> listG = startCaptureFaceDetected.g();
            List<Selfie> listW = startCaptureFaceDetected.w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new SelfieState.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listW, listG, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.g(), startCaptureFaceDetected.w(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        fVarD.p(countdownToCapture);
        return Unit.f22483a;
    }

    public static final Unit z1(k2 k2Var, SelfieWorkflow.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f22483a;
    }

    public static final Unit z2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f22483a;
    }

    public final SelfieWorkflow.c A1(final SelfieWorkflow.Input renderProps, final SelfieState.CountdownToCapture renderState) {
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: fq.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.B1(this.f17183a, renderState, renderProps, (com.withpersona.sdk2.inquiry.selfie.e.c) obj);
                }
            });
        }
        d().m("countdown_" + renderState.getCountDown(), new l(renderProps, this, renderState, null));
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.c.C0235c.b.C0236b c0236b = new SelfieWorkflow.c.C0235c.b.C0236b(renderState.getCountDown(), SelfieWorkflow.c.C0235c.EnumC0238c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        mn.a aVarJ3 = j3(renderProps);
        ur.a aVar = this.webRtcManager;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strB, renderState.getAutoCaptureSupported(), c0236b, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.C1(this.f17187a);
            }
        }, new Function0() { // from class: fq.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.D1(this.f17190a);
            }
        }, function1A1, new Function0() { // from class: fq.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.E1(this.f17194a, renderProps);
            }
        }, aVarJ3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c C2(SelfieWorkflow.Input renderProps, SelfieState.Submit renderState) {
        final boolean z10 = renderProps.getDesignVersion() == yp.a.K0000;
        if (renderState.getRecoverableSubmitError() == null) {
            d().n(this.submitVerificationWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.w(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp(), renderProps.getFileUploadUrl(), this.selfiePoseManager), new Function1() { // from class: fq.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.D2(this.f17153a, z10, (cq.b.d) obj);
                }
            });
        }
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
        if (customPendingPage != null && renderState.getRecoverableSubmitError() == null) {
            return new SelfieWorkflow.c.d(ar.b.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: fq.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k2.E2(this.f17156a);
                }
            }, new Function0() { // from class: fq.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k2.F2(this.f17174a);
                }
            }, renderProps.getStrings().getPendingPageNavBarTitle());
        }
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        qq.c cVar = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: fq.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.G2(this.f17182a);
            }
        };
        Function0 function1 = new Function0() { // from class: fq.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.H2(this.f17186a);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.c.g(processingTitle, cVar, processingDescription, pendingPageTextVerticalPosition, styles, navigationStateB, function0, function1, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), com.withpersona.sdk2.inquiry.selfie.p.w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: fq.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.I2(this.f17189a);
            }
        });
    }

    public final SelfieWorkflow.c F1(final SelfieWorkflow.Input renderProps, SelfieState.CountdownToManualCapture renderState) {
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c;
        final SelfieState.CountdownToManualCapture countdownToManualCapture;
        SelfieWorkflow.c.C0235c.b c0236b;
        final PoseInfo poseInfoP = renderState.p();
        final kn.a pose = poseInfoP.getPose();
        int i10 = e.f17115a[pose.ordinal()];
        if (i10 == 1) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new jt.l();
            }
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.CENTER;
        }
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c2 = enumC0238c;
        d().m("countdown_to_manual_capture_" + renderState.getCountDown(), new m(null));
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            countdownToManualCapture = renderState;
            c0236b = new SelfieWorkflow.c.C0235c.b.d(new Function1() { // from class: fq.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.G1(poseInfoP, pose, this, countdownToManualCapture, (String) obj);
                }
            }, new Function1() { // from class: fq.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.H1(this.f17215a, (Throwable) obj);
                }
            }, true, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        } else {
            countdownToManualCapture = renderState;
            c0236b = new SelfieWorkflow.c.C0235c.b.C0236b(countdownToManualCapture.getCountDown(), enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        }
        SelfieWorkflow.c.C0235c.b bVar = c0236b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        mn.a aVarJ3 = j3(renderProps);
        ur.a aVar = this.webRtcManager;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, countdownToManualCapture.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strB, countdownToManualCapture.getAutoCaptureSupported(), bVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.I1(this.f17042a);
            }
        }, new Function0() { // from class: fq.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.J1(this.f17047a);
            }
        }, function1A1, new Function0() { // from class: fq.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.K1(this.f17052a, renderProps);
            }
        }, aVarJ3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, countdownToManualCapture.getCameraFacingMode(), countdownToManualCapture.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), countdownToManualCapture.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c J2(final SelfieWorkflow.Input renderProps, final SelfieState.WaitForCameraFeed renderState) {
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, rp.i0.Camera)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && e1(renderProps) && jq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, rp.i0.RecordAudio);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        vr.f<SelfieState> fVarD = d();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.g());
        SelfieWorkflow.c cVarG = com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0235c.b.g(new Function1() { // from class: fq.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.K2(this.f17148a, renderProps, renderState, jCurrentTimeMillis, (CameraProperties) obj);
            }
        }, SelfieWorkflow.c.C0235c.EnumC0238c.CLEAR, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), j3(renderProps) == mn.a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: fq.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.L2(this.f17204a, (Throwable) obj);
            }
        }), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: fq.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.M2(this.f17074a);
            }
        }, new Function0() { // from class: fq.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.N2(this.f17191a);
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: fq.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.O2(this.f17055a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : z10 || z11, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
        if (z10) {
            vr.f<SelfieState> fVarD2 = d();
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar = this.permissionRequestWorkerFactory;
            rp.i0 i0Var = rp.i0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle == null ? "" : cameraPermissionsTitle;
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(vp.g.H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            String str2 = cameraPermissionsRationale;
            Context context = this.applicationContext;
            String string = context.getString(vp.g.G, jq.g.b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fVarD2.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, false, str, str2, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: fq.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.P2(this.f17178a, renderState, renderProps, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                }
            });
            return cVarG;
        }
        if (z11) {
            vr.f<SelfieState> fVarD3 = d();
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar2 = this.permissionRequestWorkerFactory;
            rp.i0 i0Var2 = rp.i0.RecordAudio;
            String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
            if (microphonePermissionsRationale == null) {
                microphonePermissionsRationale = this.applicationContext.getString(vp.g.S);
                Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
            }
            String str3 = microphonePermissionsRationale;
            Context context2 = this.applicationContext;
            String string2 = context2.getString(vp.g.R, jq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
            String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
            String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
            fVarD3.n(aVar2.a(new PermissionRequestWorkflow.Props(i0Var2, false, microphonePermissionsTitle == null ? "" : microphonePermissionsTitle, str3, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: fq.z1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.Q2(this.f17217a, renderState, renderProps, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                }
            });
        }
        return cVarG;
    }

    @NotNull
    public final SelfieWorkflow.c Q1(@NotNull final SelfieWorkflow.Input renderProps, @NotNull final SelfieState.FinalizeLocalVideoCapture renderState, @NotNull final vr.f<SelfieState> workflowContext) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        workflowContext.m("finalize_delay", new n(renderState, workflowContext, null));
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, workflowContext, null, null, (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0235c.b.C0237c(new Function1() { // from class: fq.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.L1(workflowContext, (File) obj);
            }
        }, new Function0() { // from class: fq.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.M1(workflowContext, renderProps, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE : SelfieWorkflow.c.C0235c.EnumC0238c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a)), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: fq.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.N1(this.f17060a, workflowContext);
            }
        }, new Function0() { // from class: fq.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.O1(this.f17066a);
            }
        }, Z0(workflowContext, false), new Function0() { // from class: fq.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.P1(this.f17070a, workflowContext, renderProps);
            }
        }, mn.a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c R1(final SelfieWorkflow.Input renderProps, SelfieState.FinalizeWebRtc renderState) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        ur.a aVar = this.webRtcManager;
        if (aVar != null) {
            finalizeWebRtc = renderState;
            aVar.f(renderProps.getFromStep(), new Function1() { // from class: fq.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.S1(this.f17087a, renderProps, finalizeWebRtc, (String) obj);
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, d(), null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0235c.b.h(new Function0() { // from class: fq.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.T1();
            }
        }, false, SelfieWorkflow.c.C0235c.EnumC0238c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a)), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: fq.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.U1(this.f17171a);
            }
        }, new Function0() { // from class: fq.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.V1(this.f17176a);
            }
        }, Z0(d(), false), new Function0() { // from class: fq.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.W1(this.f17180a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c R2(final SelfieWorkflow.Input renderProps, final SelfieState.WaitForWebRtcSetup renderState) {
        d().n(this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: fq.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.S2(renderState, this, renderProps, (tr.b.AbstractC0578b) obj);
            }
        });
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.c.C0235c.b.i iVar = new SelfieWorkflow.c.C0235c.b.i(SelfieWorkflow.c.C0235c.EnumC0238c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        mn.a aVarJ3 = j3(renderProps);
        ur.a aVar = this.webRtcManager;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, iVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.X2(this.f17201a);
            }
        }, new Function0() { // from class: fq.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.Y2(this.f17207a);
            }
        }, function1A1, new Function0() { // from class: fq.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.Z2(this.f17213a, renderProps);
            }
        }, aVarJ3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c X1(final SelfieWorkflow.Input renderProps, final SelfieState.RestartCamera renderState) {
        ur.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.d();
        }
        return new SelfieWorkflow.c.e(new Function0() { // from class: fq.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.Y1(this.f17081a, renderProps, renderState);
            }
        });
    }

    @NotNull
    public final Function1<Throwable, Unit> Z0(@NotNull final vr.f<SelfieState> fVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new Function1() { // from class: fq.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.Y0(fVar, this, z10, (Throwable) obj);
            }
        };
    }

    public final SelfieWorkflow.c Z1(final SelfieWorkflow.Input renderProps, final SelfieState.ReviewCaptures renderState) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(vp.g.Q);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(vp.g.I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(vp.g.M);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(vp.g.N);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(vp.g.O);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageLabelUp = renderProps.getStrings().getSelfieCheckPageLabelUp();
        if (selfieCheckPageLabelUp == null) {
            selfieCheckPageLabelUp = this.applicationContext.getString(vp.g.P);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelUp, "getString(...)");
        }
        String selfieCheckPageLabelDown = renderProps.getStrings().getSelfieCheckPageLabelDown();
        if (selfieCheckPageLabelDown == null) {
            selfieCheckPageLabelDown = this.applicationContext.getString(vp.g.L);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelDown, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(vp.g.K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(vp.g.J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new SelfieWorkflow.c.f(new SelfieWorkflow.c.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.z(), renderProps.getStyles(), this.navigationStateManager.b(), new Function0() { // from class: fq.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.a2(this.f17086a, renderState);
            }
        }, new Function0() { // from class: fq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.b2(this.f17043a, renderProps, renderState);
            }
        }, new Function0() { // from class: fq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.c2(this.f17048a);
            }
        }, new Function0() { // from class: fq.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.d2(this.f17053a);
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    public final SelfieWorkflow.c a3(final SelfieWorkflow.Input renderProps, final SelfieState.WebRtcFinished renderState) {
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.c.C0235c.b.h hVar = new SelfieWorkflow.c.C0235c.b.h(new Function0() { // from class: fq.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.b3(this.f17069a, renderState);
            }
        }, false, SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        ur.a aVar = this.webRtcManager;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, hVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.c3(this.f17079a);
            }
        }, new Function0() { // from class: fq.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.d3(this.f17084a);
            }
        }, function1A1, new Function0() { // from class: fq.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.e3(this.f17089a, renderProps);
            }
        }, j3(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    @NotNull
    public final SelfieState b1(@NotNull SelfieWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.A(), props.getPoseConfigs(), false, CameraProperties.b.User, false, 163, null) : new SelfieState.ShowInstructions(null, null, null, 6, null);
    }

    public final void c1(@NotNull vr.f<SelfieState> fVar, @Nullable ur.a aVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        SelfieState selfieState = (SelfieState) fVar.i();
        SelfieState backState = selfieState != null ? selfieState.getBackState() : null;
        if (aVar != null) {
            aVar.d();
        }
        if (backState != null) {
            backState.x(true);
            fVar.p(backState);
        } else if (b().getValue().getBackStepEnabled()) {
            e(SelfieWorkflow.b.a.f12633a);
        } else {
            e(SelfieWorkflow.b.C0231b.f12634a);
        }
    }

    public final void d1(@NotNull SelfieWorkflow.Input renderProps, @NotNull SelfieState renderState) {
        SelfieWorkflow.c cVarG1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        pq.j jVarF = l2.f(renderState);
        if (!com.withpersona.sdk2.inquiry.selfie.p.H(renderState)) {
            d().m("close_camera", new f(null));
        }
        if (!k3(renderProps)) {
            d().m("output_webrtc_error", new g(null));
        }
        boolean z10 = renderState instanceof SelfieState.Submit;
        uq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.e(renderProps.getFromStep(), jVarF);
        if (renderState instanceof SelfieState.ShowInstructions) {
            cVarG1 = e2(renderProps, (SelfieState.ShowInstructions) renderState);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            cVarG1 = R2(renderProps, (SelfieState.WaitForWebRtcSetup) renderState);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            cVarG1 = J2(renderProps, (SelfieState.WaitForCameraFeed) renderState);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            cVarG1 = X1(renderProps, (SelfieState.RestartCamera) renderState);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            cVarG1 = j2(renderProps, (SelfieState.ShowPoseHint) renderState);
        } else if (renderState instanceof SelfieState.StartCapture) {
            cVarG1 = o2(renderProps, (SelfieState.StartCapture) renderState);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            cVarG1 = w2(renderProps, (SelfieState.StartCaptureFaceDetected) renderState);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            cVarG1 = A1(renderProps, (SelfieState.CountdownToCapture) renderState);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            cVarG1 = F1(renderProps, (SelfieState.CountdownToManualCapture) renderState);
        } else if (renderState instanceof SelfieState.Capture) {
            cVarG1 = o1(renderProps, (SelfieState.Capture) renderState);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            cVarG1 = v1(renderProps, (SelfieState.CaptureTransition) renderState);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            cVarG1 = Q1(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, d());
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            cVarG1 = R1(renderProps, (SelfieState.FinalizeWebRtc) renderState);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            cVarG1 = a3(renderProps, (SelfieState.WebRtcFinished) renderState);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            cVarG1 = Z1(renderProps, (SelfieState.ReviewCaptures) renderState);
        } else if (z10) {
            cVarG1 = C2(renderProps, (SelfieState.Submit) renderState);
        } else {
            if (!(renderState instanceof SelfieState.AcquireNextPose)) {
                throw new jt.l();
            }
            cVarG1 = g1(renderProps, (SelfieState.AcquireNextPose) renderState);
        }
        c().setValue(cVarG1);
    }

    public final boolean e1(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ur.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c()) : null;
        ur.a aVar2 = this.webRtcManager;
        Object objI = videoCaptureConfig.i(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.g()) : null, this.applicationContext);
        if (jt.n.e(objI) == null) {
            return ((Boolean) objI).booleanValue();
        }
        return false;
    }

    public final SelfieWorkflow.c.b e2(final SelfieWorkflow.Input renderProps, final SelfieState.ShowInstructions renderState) {
        RemoteImage selfiePictograph = null;
        if (renderState.getErrorMessage() != null) {
            d().m("toast_message_timeout", new o(null));
        }
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState navigationStateB = this.navigationStateManager.b();
        SelfieType selfieType = renderProps.getSelfieType();
        if (Intrinsics.c(selfieType, SelfieType.CenterOnly.f12562a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.c(selfieType, SelfieType.ThreePhotos.f12564a) && !Intrinsics.c(selfieType, SelfieType.ConfigurablePoses.f12563a)) {
                throw new jt.l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new SelfieWorkflow.c.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, navigationStateB, renderProps.getSelfieType(), renderProps.A(), renderProps.getStrings().getPromptPageNavBarTitle(), renderState.getErrorMessage(), new Function0() { // from class: fq.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.h2(this.f17075a, renderProps, renderState);
            }
        }, new Function0() { // from class: fq.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.i2(this.f17080a);
            }
        }, new Function0() { // from class: fq.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.f2(this.f17085a);
            }
        }, new Function0() { // from class: fq.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.g2(this.f17090a, renderState);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124  */
    /* JADX WARN: Code duplicated, block: B:35:0x015b  */
    /* JADX WARN: Code duplicated, block: B:37:0x016d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0181  */
    /* JADX WARN: Code duplicated, block: B:40:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d1  */
    public final <T extends SelfieState & com.withpersona.sdk2.inquiry.selfie.a> SelfieState f1(vr.f<SelfieState> fVar, T t8, Selfie selfie) {
        SelfieState selfieStateE;
        long j10;
        if (selfie != null) {
            this.selfieEventLogger.f(t8, selfie);
        }
        String fileUploadUrl = b().getValue().getFileUploadUrl();
        if (fileUploadUrl != null && (selfie instanceof Selfie.SelfieImage)) {
            this.directFileUploader.j(((Selfie.SelfieImage) selfie).getAbsoluteFilePath(), fileUploadUrl);
        }
        List<Selfie> listX0 = selfie != null ? CollectionsKt.x0(t8.w(), selfie) : t8.w();
        List<PoseInfo> listY = selfie != null ? CollectionsKt.Y(t8.g(), 1) : t8.g();
        if (b().getValue().getUsePerPoseReveal()) {
            this.selfiePoseManager.n(listX0.size() + 1);
        }
        if (b().getValue().getUsePerPoseReveal() && selfie != null) {
            T t10 = t8;
            if (!((PoseInfo) CollectionsKt.d0(t10.g())).getIsLast()) {
                T t11 = t8;
                selfieStateE = new SelfieState.AcquireNextPose(t10.getCameraProperties(), t10.getStartSelfieTimestamp(), listX0, t8.getBackState(), t8.getCameraFacingMode(), t11.getIsFlashEnabled(), listY, t11.getPoseConfigs(), t11.getAutoCaptureSupported());
            } else if (listY.isEmpty()) {
                if (j3(b().getValue()) == mn.a.Upload) {
                    if (b().getValue().getDesignVersion() == yp.a.K0000) {
                        j10 = 0;
                    } else {
                        j10 = 3000;
                    }
                    T t12 = t8;
                    selfieStateE = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
                } else if (j3(b().getValue()) == mn.a.Stream) {
                    T t13 = t8;
                    selfieStateE = new SelfieState.FinalizeWebRtc(listX0, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
                } else {
                    T t14 = t8;
                    selfieStateE = l2.e(fVar, b().getValue().getPoseConfigs(), listX0, null, t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t8.getBackState());
                }
            } else if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == kn.a.Center) {
                T t15 = t8;
                selfieStateE = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t15.getStartSelfieTimestamp(), t15.getCameraProperties(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t16 = t8;
                selfieStateE = new SelfieState.ShowPoseHint(listX0, listY, t16.getAutoCaptureSupported(), t16.getCameraProperties(), t16.getStartSelfieTimestamp(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (listY.isEmpty()) {
            if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == kn.a.Center) {
                T t17 = t8;
                selfieStateE = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t17.getStartSelfieTimestamp(), t17.getCameraProperties(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t18 = t8;
                selfieStateE = new SelfieState.ShowPoseHint(listX0, listY, t18.getAutoCaptureSupported(), t18.getCameraProperties(), t18.getStartSelfieTimestamp(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (j3(b().getValue()) == mn.a.Upload) {
            if (b().getValue().getDesignVersion() == yp.a.K0000) {
                j10 = 0;
            } else {
                j10 = 3000;
            }
            T t19 = t8;
            selfieStateE = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t19.getCameraProperties(), t19.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
        } else if (j3(b().getValue()) == mn.a.Stream) {
            T t110 = t8;
            selfieStateE = new SelfieState.FinalizeWebRtc(listX0, t110.getCameraProperties(), t110.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
        } else {
            T t111 = t8;
            selfieStateE = l2.e(fVar, b().getValue().getPoseConfigs(), listX0, null, t111.getCameraProperties(), t111.getStartSelfieTimestamp(), t8.getBackState());
        }
        SelfieState selfieState = selfieStateE;
        return selfie == null ? selfieState : new SelfieState.CaptureTransition(selfieState, t8.j(), t8.getBackState(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
    }

    public final void f3() {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f22568a = true;
        d().m("check_if_manual_capture_enabled", new p(yVar, this, null));
    }

    public final SelfieWorkflow.c g1(final SelfieWorkflow.Input renderProps, SelfieState.AcquireNextPose renderState) {
        int size = renderState.w().size();
        d().m("fetch_pose_" + size, new h(size, null));
        return new SelfieWorkflow.c.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new SelfieWorkflow.c.a.AbstractC0232a.C0233a(SelfieWorkflow.c.a.b.CLEAR, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: fq.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return k2.h1((kn.a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: fq.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.i1(this.f17040a, (Throwable) obj);
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: fq.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.j1(this.f17045a);
            }
        }, new Function0() { // from class: fq.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.k1(this.f17049a);
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: fq.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.l1(this.f17054a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: fq.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.m1(this.f17059a, (CameraProperties.b) obj);
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, false, new Function1() { // from class: fq.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.n1(((Boolean) obj).booleanValue());
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }

    public final void g3(Throwable error) {
        String message;
        String message2 = error.getMessage();
        if (message2 != null && StringsKt.a0(message2, "ENOSPC", false, 2, null)) {
            h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(error instanceof g0.h1)) {
            if (error instanceof InternalErrorException) {
                h3(new SelfieWorkflow.b.Error(((InternalErrorException) error).getErrorInfo()));
                return;
            }
            h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = error.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        h3(new SelfieWorkflow.b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
    }

    public final void h3(SelfieWorkflow.b output) {
        ur.a aVar;
        if (((output instanceof SelfieWorkflow.b.d) || (output instanceof SelfieWorkflow.b.a) || (output instanceof SelfieWorkflow.b.Error) || (output instanceof SelfieWorkflow.b.C0231b)) && (aVar = this.webRtcManager) != null) {
            aVar.d();
        }
        e(output);
    }

    public final void i3() {
        e(new SelfieWorkflow.b.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final SelfieWorkflow.c j2(final SelfieWorkflow.Input renderProps, final SelfieState.ShowPoseHint renderState) {
        yp.x xVar;
        String selfieHintLookLeft;
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c;
        int i10 = e.f17115a[renderState.j().ordinal()];
        if (i10 == 1) {
            xVar = yp.x.Left;
        } else if (i10 == 2) {
            xVar = yp.x.Right;
        } else if (i10 == 3) {
            xVar = yp.x.Up;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new jt.l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            xVar = yp.x.Down;
        }
        int[] iArr = e.b;
        int i11 = iArr[xVar.ordinal()];
        if (i11 == 1) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i11 == 2) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookRight();
        } else if (i11 == 3) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintPoseNotCentered();
        } else if (i11 == 4) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookUp();
        } else {
            if (i11 != 5) {
                throw new jt.l();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookDown();
        }
        yp.x xVar2 = xVar;
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[xVar2.ordinal()];
        if (i12 == 1) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT_HINT;
        } else if (i12 == 2) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT_HINT;
        } else if (i12 == 3) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.CENTER;
        } else if (i12 == 4) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP_HINT;
        } else {
            if (i12 != 5) {
                throw new jt.l();
            }
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN_HINT;
        }
        SelfieWorkflow.c.C0235c.b.f fVar = new SelfieWorkflow.c.C0235c.b.f(new Function0() { // from class: fq.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.k2(this.f17208a, renderState, renderProps);
            }
        }, enumC0238c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        mn.a aVarJ3 = j3(renderProps);
        ur.a aVar = this.webRtcManager;
        String str = selfieHintLookLeft;
        SelfieWorkflow.c.C0235c.AssetOverrides assetOverridesC = com.withpersona.sdk2.inquiry.selfie.p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        com.withpersona.sdk2.camera.e.a aVar2 = this.cameraXControllerFactory;
        hn.c.a aVar3 = this.camera2ControllerFactory;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesC, requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.l2(this.f17214a);
            }
        }, new Function0() { // from class: fq.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.m2(this.f17216a);
            }
        }, function1A1, new Function0() { // from class: fq.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.n2(this.f17041a, renderProps);
            }
        }, aVarJ3, aVar, recordAudio, aVar2, aVar3, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final mn.a j3(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ur.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c()) : null;
        ur.a aVar2 = this.webRtcManager;
        Object objK = videoCaptureConfig.k(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.g()) : null, this.applicationContext);
        return jt.n.e(objK) == null ? (mn.a) objK : mn.a.None;
    }

    public final boolean k3(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ur.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c()) : null;
        ur.a aVar2 = this.webRtcManager;
        Object objI = videoCaptureConfig.i(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.g()) : null, this.applicationContext);
        if (jt.n.e(objI) != null) {
            return false;
        }
        ((Boolean) objI).getClass();
        return true;
    }

    public final SelfieWorkflow.c o1(final SelfieWorkflow.Input renderProps, final SelfieState.Capture renderState) {
        SelfieState.a flashState;
        String selfieHintCenterFace;
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c;
        SelfieWorkflow.c.C0235c.b aVar;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            d().m("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new i(renderState, this, renderProps, null));
        }
        final PoseInfo poseInfoP = renderState.p();
        final kn.a pose = poseInfoP.getPose();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == SelfieState.a.Disabled ? SelfieState.a.Enabled : renderState.getFlashState();
        } else {
            flashState = SelfieState.a.Disabled;
        }
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), flashState == SelfieState.a.Disabled || flashState == SelfieState.a.ReadyToCapture), new Function1() { // from class: fq.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.p1(this.f17058a, renderState, (com.withpersona.sdk2.inquiry.selfie.e.c) obj);
                }
            });
        }
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        if (pose == kn.a.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (pose == kn.a.Right) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        } else if (renderState.getSelfieError() != null) {
            selfieHintCenterFace = strB;
        } else {
            selfieHintCenterFace = pose == kn.a.Center ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        }
        int i10 = e.f17115a[pose.ordinal()];
        if (i10 == 1) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new jt.l();
            }
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.CENTER;
        }
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c2 = enumC0238c;
        if (!renderState.o() || flashState == SelfieState.a.FlashOn || flashState == SelfieState.a.ReadyToCapture) {
            aVar = new SelfieWorkflow.c.C0235c.b.a(enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        } else {
            aVar = new SelfieWorkflow.c.C0235c.b.d(new Function1() { // from class: fq.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.q1(poseInfoP, pose, this, renderState, (String) obj);
                }
            }, new Function1() { // from class: fq.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.r1(this.f17068a, (Throwable) obj);
                }
            }, false, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false, 4, null);
        }
        if (!renderState.o()) {
            f3();
        }
        SelfieState.a aVar2 = SelfieState.a.FlashOn;
        if (flashState == aVar2) {
            d().m("wait_to_capture_with_flash_on", new j(null));
        }
        SelfieState.a aVar3 = SelfieState.a.ReadyToCapture;
        if (flashState == aVar3) {
            d().m("turn_off_flash", new k(null));
        }
        mn.a aVarJ3 = j3(renderProps);
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String str = selfieHintCenterFace;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        ur.a aVar4 = this.webRtcManager;
        SelfieWorkflow.c.C0235c.AssetOverrides assetOverridesC = com.withpersona.sdk2.inquiry.selfie.p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        com.withpersona.sdk2.camera.e.a aVar5 = this.cameraXControllerFactory;
        hn.c.a aVar6 = this.camera2ControllerFactory;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, strB, renderState.getAutoCaptureSupported(), aVar, assetOverridesC, requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.s1(this.f17073a);
            }
        }, new Function0() { // from class: fq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.t1(this.f17078a);
            }
        }, function1A1, new Function0() { // from class: fq.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.u1(this.f17083a, renderProps);
            }
        }, aVarJ3, aVar4, recordAudio, aVar5, aVar6, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : renderState.getFlashState() == aVar2 || renderState.getFlashState() == aVar3, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : j3(renderProps) == mn.a.Upload, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c o2(final SelfieWorkflow.Input renderProps, final SelfieState.StartCapture renderState) {
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c;
        Object obj;
        SelfieWorkflow.c.C0235c.b aVar;
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: fq.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k2.p2(this.f17151a, renderState, renderProps, (com.withpersona.sdk2.inquiry.selfie.e.c) obj2);
                }
            });
        }
        final PoseInfo poseInfoP = renderState.p();
        boolean zO = renderState.o();
        if (!zO) {
            f3();
        }
        int i10 = e.f17115a[poseInfoP.getPose().ordinal()];
        if (i10 == 1) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new jt.l();
            }
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.CENTER;
        }
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c2 = enumC0238c;
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? com.withpersona.sdk2.inquiry.selfie.n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintTakePhoto = strB == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strB;
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!zO) {
            obj = null;
            aVar = new SelfieWorkflow.c.C0235c.b.a(enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        } else if (e1(renderProps)) {
            aVar = new SelfieWorkflow.c.C0235c.b.e(new Function0() { // from class: fq.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k2.q2(this.f17154a, renderState, renderProps);
                }
            }, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: fq.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k2.r2(poseInfoP, this, renderState, (String) obj2);
                }
            };
            obj = null;
            aVar = new SelfieWorkflow.c.C0235c.b.d(function1, new Function1() { // from class: fq.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k2.s2(this.f17177a, (Throwable) obj2);
                }
            }, false, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, obj);
        mn.a aVarJ3 = j3(renderProps);
        ur.a aVar2 = this.webRtcManager;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintTakePhoto, strB, renderState.getAutoCaptureSupported(), aVar, com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.t2(this.f17181a);
            }
        }, new Function0() { // from class: fq.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.u2(this.f17185a);
            }
        }, function1A1, new Function0() { // from class: fq.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.v2(this.f17188a, renderProps);
            }
        }, aVarJ3, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c v1(final SelfieWorkflow.Input renderProps, SelfieState.CaptureTransition renderState) {
        SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c;
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE_WITH_CAPTURE;
        } else {
            int i10 = e.f17115a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT_COMPLETE;
            } else if (i10 == 2) {
                enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT_COMPLETE;
            } else if (i10 == 3) {
                enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP_COMPLETE;
            } else if (i10 == 4) {
                enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN_COMPLETE;
            } else {
                if (i10 != 5) {
                    throw new jt.l();
                }
                enumC0238c = SelfieWorkflow.c.C0235c.EnumC0238c.CENTER_COMPLETE;
            }
        }
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.c.C0235c.b.h(new Function0() { // from class: fq.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.w1(this.f17195a);
            }
        }, true, enumC0238c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a)), com.withpersona.sdk2.inquiry.selfie.p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: fq.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.x1(this.f17199a);
            }
        }, new Function0() { // from class: fq.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.y1(this.f17202a);
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: fq.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.z1(this.f17205a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final SelfieWorkflow.c w2(final SelfieWorkflow.Input renderProps, final SelfieState.StartCaptureFaceDetected renderState) {
        if (renderState.k().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: fq.s1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.x2(this.f17192a, renderState, renderProps, (com.withpersona.sdk2.inquiry.selfie.e.c) obj);
                }
            });
        }
        d().n(new TimerWorker(1000L), new Function1() { // from class: fq.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.y2(this.f17196a, renderProps, (Unit) obj);
            }
        });
        vr.f<SelfieState> fVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        SelfieWorkflow.c.C0235c.b.a aVar = new SelfieWorkflow.c.C0235c.b.a(SelfieWorkflow.c.C0235c.EnumC0238c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        mn.a aVarJ3 = j3(renderProps);
        ur.a aVar2 = this.webRtcManager;
        SelfieWorkflow.c.C0235c.AssetOverrides assetOverridesC = com.withpersona.sdk2.inquiry.selfie.p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        com.withpersona.sdk2.camera.e.a aVar3 = this.cameraXControllerFactory;
        hn.c.a aVar4 = this.camera2ControllerFactory;
        return com.withpersona.sdk2.inquiry.selfie.o.g(renderProps, fVarD, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesC, requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: fq.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.z2(this.f17200a);
            }
        }, new Function0() { // from class: fq.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.A2(this.f17203a);
            }
        }, function1A1, new Function0() { // from class: fq.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.B2(this.f17206a, renderProps);
            }
        }, aVarJ3, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }
}
