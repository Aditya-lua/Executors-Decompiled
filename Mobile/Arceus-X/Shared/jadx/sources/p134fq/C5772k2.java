package p134fq;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import ar.C1147b;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.selfie.C3953e;
import com.withpersona.sdk2.inquiry.selfie.C3955g;
import com.withpersona.sdk2.inquiry.selfie.C3962n;
import com.withpersona.sdk2.inquiry.selfie.C3964o;
import com.withpersona.sdk2.inquiry.selfie.C3965p;
import com.withpersona.sdk2.inquiry.selfie.InterfaceC3939a;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import hn.C6434c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kn.EnumC7638a;
import kn.EnumC7639b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import mn.EnumC8598a;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059cq.C4197b;
import p083dq.C4658a;
import p132fn.AbstractC5685h;
import p132fn.C5678d0;
import p132fn.C5686h0;
import p132fn.C5688i0;
import p132fn.C5689j;
import p132fn.C5694l0;
import p132fn.C5696m0;
import p132fn.C5713v;
import p132fn.C5714v0;
import p140g0.C5891h1;
import p152go.C6152a;
import p152go.C6159e;
import p226jq.C7259g;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p276ln.InterfaceC8169a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p363pq.InterfaceC10316j;
import p391qq.C10700c;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p475uq.C11930a;
import p476ur.C11934c;
import p476ur.InterfaceC11932a;
import p497vp.C12244g;
import p499vr.AbstractC12252c;
import p499vr.C12255f;
import p499vr.TimerWorker;
import p584yp.EnumC13272a;
import p584yp.EnumC13424x;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import tr.C11742b;

/* JADX INFO: renamed from: fq.k2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002:\u0004¯\u0001°\u0001B\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020NH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020dH\u0002¢\u0006\u0004\be\u0010fJ9\u0010m\u001a\u00020\u0004\"\f\b\u0000\u0010h*\u00020\u0004*\u00020g*\b\u0012\u0004\u0012\u00020\u00040i2\u0006\u0010j\u001a\u00028\u00002\b\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020^H\u0002¢\u0006\u0004\bo\u0010`J\u0017\u0010q\u001a\u00020^2\u0006\u0010p\u001a\u00020\u0005H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020^2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\u0003¢\u0006\u0004\bx\u0010yJ\u001d\u0010z\u001a\u00020^2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{J-\u0010~\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020|2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040iH\u0000¢\u0006\u0004\b~\u0010\u007fJ(\u0010\u0082\u0001\u001a\u00020^*\b\u0012\u0004\u0012\u00020\u00040i2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J9\u0010\u0087\u0001\u001a\u0014\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020^0\u0085\u0001j\u0003`\u0086\u0001*\b\u0012\u0004\u0012\u00020\u00040i2\t\b\u0002\u0010\u0084\u0001\u001a\u00020WH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001¨\u0006±\u0001"}, m31665d2 = {"Lfq/k2;", "", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcq/b$a;", "submitVerificationWorker", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lln/a;", "cameraStatsManager", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Lku/p0;", "coroutineScope", "Ldq/a$b;", "selfiePoseManagerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lgo/e;", "featureFlagManager", "Lqq/c;", "sdkFilesManager", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lcq/b$a;Ltr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lln/a;Luq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lku/p0;Ldq/a$b;Lcom/withpersona/sdk2/inquiry/selfie/g;Lgo/e;Lqq/c;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "renderState", "g1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "e2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "X1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "R2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "j2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "o2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "w2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "A1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "F1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "o1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "v1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "R1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "a3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "k3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "e1", "Lmn/a;", "j3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;", "", "i3", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "C2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "T", "Lvr/f;", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "f1", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "f3", "output", "h3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V", "", "error", "g3", "(Ljava/lang/Throwable;)V", "props", "b1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "d1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "workflowContext", "Q1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lvr/f;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lur/a;", "webRtcManagerBridge", "c1", "(Lvr/f;Lur/a;)V", "inRecoverableState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "Z0", "(Lvr/f;Z)Lkotlin/jvm/functions/Function1;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcq/b$a;", "h", "Ltr/b$a;", "i", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "j", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "k", "Lcom/withpersona/sdk2/camera/e$a;", "l", "Lhn/c$a;", "m", "Lln/a;", "n", "Luq/a;", "o", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "p", "Ldq/a$b;", "q", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "r", "Lgo/e;", "s", "Lqq/c;", "t", "Lur/a;", "webRtcManager", "Ldq/a;", "u", "Ldq/a;", "selfiePoseManager", "v", "c", "d", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5772k2 extends AbstractC12252c<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.AbstractC3927b, SelfieWorkflow.AbstractC3928c> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C4197b.a submitVerificationWorker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C11742b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C3953e.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C3875e.a permissionRequestWorkerFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C3405e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C6434c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final C4658a.b selfiePoseManagerFactory;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final C3955g selfieEventLogger;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC11932a webRtcManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final C4658a selfiePoseManager;

    /* JADX INFO: renamed from: fq.k2$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$1$1", m39664f = "SelfieStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22090t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieState f22092v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelfieState selfieState, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f22092v = selfieState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new a(this.f22092v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f22090t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C5772k2 c5772k2 = C5772k2.this;
            c5772k2.m26120d1(c5772k2.m45395b().getValue(), this.f22092v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$2", m39664f = "SelfieStepStateManager.kt", m39665l = {173}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22093t;

        /* JADX INFO: renamed from: fq.k2$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5772k2 f22095a;

            public a(C5772k2 c5772k2) {
                this.f22095a = c5772k2;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SelfieWorkflow.Input input, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C5772k2 c5772k2 = this.f22095a;
                SelfieState selfieState = (SelfieState) c5772k2.m45397d().m45411i();
                if (selfieState == null) {
                    return Unit.f29331a;
                }
                c5772k2.m26120d1(input, selfieState);
                return Unit.f29331a;
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22093t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<SelfieWorkflow.Input> interfaceC9566c0M45395b = C5772k2.this.m45395b();
                a aVar = new a(C5772k2.this);
                this.f22093t = 1;
                if (interfaceC9566c0M45395b.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$d */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lfq/k2$d;", "", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lfq/k2;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Lfq/k2;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface d {
        @NotNull
        /* JADX INFO: renamed from: a */
        C5772k2 mo26137a(@NotNull SelfieWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX INFO: renamed from: fq.k2$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22096a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f22097b;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Up.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7638a.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7638a.Center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f22096a = iArr;
            int[] iArr2 = new int[EnumC13424x.values().length];
            try {
                iArr2[EnumC13424x.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC13424x.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC13424x.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC13424x.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC13424x.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f22097b = iArr2;
        }
    }

    /* JADX INFO: renamed from: fq.k2$f */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$1", m39664f = "SelfieStepStateManager.kt", m39665l = {MlKitException.CODE_SCANNER_CANCELLED}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22098t;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22098t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5689j c5689j = C5689j.f21847a;
                Context context = C5772k2.this.applicationContext;
                this.f22098t = 1;
                if (c5689j.m25813b(context, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            InterfaceC11932a interfaceC11932a = C5772k2.this.webRtcManager;
            if (interfaceC11932a != null) {
                interfaceC11932a.m44538d();
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$g */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$2", m39664f = "SelfieStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class g extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22100t;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new g(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f22100t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C5772k2.this.m26128i3();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$h */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderAcquireNextPose$1", m39664f = "SelfieStepStateManager.kt", m39665l = {270}, m39666m = "invokeSuspend")
    public static final class h extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22102t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f22104v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, InterfaceC9557b<? super h> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f22104v = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new h(this.f22104v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22102t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C4658a c4658a = C5772k2.this.selfiePoseManager;
                int i11 = this.f22104v;
                this.f22102t = 1;
                Object objM22913k = c4658a.m22913k(i11, this);
                if (objM22913k == objM38805e) {
                    return objM38805e;
                }
                value = objM22913k;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                value = ((C7347n) obj).getValue();
            }
            C5772k2 c5772k2 = C5772k2.this;
            if (C7347n.m30466h(value)) {
                PoseInfo poseInfo = (PoseInfo) value;
                WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
                SelfieState.AcquireNextPose acquireNextPose = workflowStateM45411i instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) workflowStateM45411i : null;
                if (acquireNextPose != null) {
                    c5772k2.m45397d().m45417p(c5772k2.m26123f1(c5772k2.m45397d(), SelfieState.AcquireNextPose.m19299A(acquireNextPose, null, 0L, null, null, null, false, C7697o.m31878d(poseInfo), null, false, 447, null), null));
                }
            }
            C5772k2 c5772k3 = C5772k2.this;
            Throwable thM30463e = C7347n.m30463e(value);
            if (thM30463e != null) {
                c5772k3.m26126g3(thM30463e);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$i */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$1", m39664f = "SelfieStepStateManager.kt", m39665l = {1368, 1376}, m39666m = "invokeSuspend")
    public static final class i extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f22105t;

        /* JADX INFO: renamed from: u */
        public Object f22106u;

        /* JADX INFO: renamed from: v */
        public int f22107v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieState.Capture f22108w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C5772k2 f22109x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ SelfieWorkflow.Input f22110y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SelfieState.Capture capture, C5772k2 c5772k2, SelfieWorkflow.Input input, InterfaceC9557b<? super i> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f22108w = capture;
            this.f22109x = c5772k2;
            this.f22110y = input;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new i(this.f22108w, this.f22109x, this.f22110y, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            long j10;
            SelfieState.Capture capture;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22107v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long jLongValue = this.f22108w.getCaptureDeadlineEpochMs().longValue() - System.currentTimeMillis();
                C7800a.Companion companion = C7800a.INSTANCE;
                long jM32372q = C7801b.m32372q(jLongValue, EnumC7361b.MILLISECONDS);
                this.f22105t = jLongValue;
                this.f22107v = 1;
                if (C7946z0.m32939c(jM32372q, this) != objM38805e) {
                    j10 = jLongValue;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                j10 = this.f22105t;
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                capture = (SelfieState.Capture) this.f22106u;
                C7348o.m30470b(obj);
            }
            this.f22109x.selfieEventLogger.m20063n();
            if (this.f22109x.m45395b().getValue().getSkipPromptPage()) {
                this.f22109x.m45397d().m45417p(new SelfieState.AcquireNextPose(capture.getCameraProperties(), capture.getStartSelfieTimestamp(), C7699p.m31892k(), C5776l2.m26149a(this.f22109x.m45397d(), false), capture.getCameraFacingMode(), capture.getIsFlashEnabled(), this.f22108w.mo19302g(), this.f22110y.getPoseConfigs(), capture.getAutoCaptureSupported()));
            } else {
                this.f22109x.m45397d().m45417p(new SelfieState.ShowInstructions(null, null, this.f22110y.getStrings().getSelfieHintPoseTimeout(), 2, null));
            }
            return Unit.f29331a;
            WorkflowState workflowStateM45411i = this.f22109x.m45397d().m45411i();
            SelfieState.Capture capture2 = workflowStateM45411i instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateM45411i : null;
            if (capture2 != null && Intrinsics.m31980c(capture2.getCaptureDeadlineEpochMs(), this.f22108w.getCaptureDeadlineEpochMs())) {
                C5776l2.m26151c(capture2);
                C4658a c4658a = this.f22109x.selfiePoseManager;
                this.f22106u = capture2;
                this.f22105t = j10;
                this.f22107v = 2;
                if (c4658a.m22917o(this) != objM38805e) {
                    capture = capture2;
                    this.f22109x.selfieEventLogger.m20063n();
                    if (this.f22109x.m45395b().getValue().getSkipPromptPage()) {
                        this.f22109x.m45397d().m45417p(new SelfieState.AcquireNextPose(capture.getCameraProperties(), capture.getStartSelfieTimestamp(), C7699p.m31892k(), C5776l2.m26149a(this.f22109x.m45397d(), false), capture.getCameraFacingMode(), capture.getIsFlashEnabled(), this.f22108w.mo19302g(), this.f22110y.getPoseConfigs(), capture.getAutoCaptureSupported()));
                    } else {
                        this.f22109x.m45397d().m45417p(new SelfieState.ShowInstructions(null, null, this.f22110y.getStrings().getSelfieHintPoseTimeout(), 2, null));
                    }
                    return Unit.f29331a;
                }
                return objM38805e;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((i) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$j */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$3", m39664f = "SelfieStepStateManager.kt", m39665l = {1533}, m39666m = "invokeSuspend")
    public static final class j extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22111t;

        public j(InterfaceC9557b<? super j> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new j(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22111t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f22111t = 1;
                if (C7946z0.m32938b(1000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = C5772k2.this.m45397d().m45411i();
            SelfieState.Capture capture = workflowStateM45411i instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateM45411i : null;
            if (capture == null) {
                return Unit.f29331a;
            }
            C5772k2.this.m45397d().m45417p(capture.m19322z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture.cameraProperties : null, (57343 & 512) != 0 ? capture.backState : null, (57343 & 1024) != 0 ? capture.poseConfigs : null, (57343 & 2048) != 0 ? capture.cameraFacingMode : null, (57343 & 4096) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.EnumC3920a.ReadyToCapture, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$k */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$4", m39664f = "SelfieStepStateManager.kt", m39665l = {1545}, m39666m = "invokeSuspend")
    public static final class k extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22113t;

        public k(InterfaceC9557b<? super k> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new k(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22113t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f22113t = 1;
                if (C7946z0.m32938b(3000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = C5772k2.this.m45397d().m45411i();
            SelfieState.Capture capture = workflowStateM45411i instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateM45411i : null;
            if (capture == null) {
                return Unit.f29331a;
            }
            C5772k2.this.m45397d().m45417p(capture.m19322z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture.cameraProperties : null, (57343 & 512) != 0 ? capture.backState : null, (57343 & 1024) != 0 ? capture.poseConfigs : null, (57343 & 2048) != 0 ? capture.cameraFacingMode : null, (57343 & 4096) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.EnumC3920a.Enabled, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((k) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$l */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToCapture$2", m39664f = "SelfieStepStateManager.kt", m39665l = {1180}, m39666m = "invokeSuspend")
    public static final class l extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f22115t;

        /* JADX INFO: renamed from: u */
        public int f22116u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow.Input f22117v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C5772k2 f22118w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ SelfieState.CountdownToCapture f22119x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(SelfieWorkflow.Input input, C5772k2 c5772k2, SelfieState.CountdownToCapture countdownToCapture, InterfaceC9557b<? super l> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f22117v = input;
            this.f22118w = c5772k2;
            this.f22119x = countdownToCapture;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new l(this.f22117v, this.f22118w, this.f22119x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            long j10;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22116u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long jM20115a = C3962n.m20115a(this.f22117v);
                this.f22115t = jM20115a;
                this.f22116u = 1;
                if (C7946z0.m32938b(jM20115a, this) == objM38805e) {
                    return objM38805e;
                }
                j10 = jM20115a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f22115t;
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = this.f22118w.m45397d().m45411i();
            SelfieState.CountdownToCapture countdownToCapture = workflowStateM45411i instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) workflowStateM45411i : null;
            if (countdownToCapture == null) {
                return Unit.f29331a;
            }
            int countDown = countdownToCapture.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                this.f22118w.m45397d().m45417p(new SelfieState.Capture(countdownToCapture.getSelfieError(), this.f22119x.getPoseScore(), this.f22119x.getBrightnessInfo(), null, countdownToCapture.mo19302g(), countdownToCapture.getStartCaptureTimestamp(), false, this.f22119x.getStartSelfieTimestamp(), countdownToCapture.getCameraProperties(), C5776l2.m26149a(this.f22118w.m45397d(), false), this.f22117v.getPoseConfigs(), this.f22119x.getCameraFacingMode(), this.f22119x.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24648, null));
            } else {
                this.f22118w.m45397d().m45417p(countdownToCapture.m19337z((32764 & 1) != 0 ? countdownToCapture.countDown : countDown - 1, (32764 & 2) != 0 ? countdownToCapture.selfieError : countdownToCapture.getSelfieError(), (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture.posesNeeded : null, (32764 & 256) != 0 ? countdownToCapture.selfies : null, (32764 & 512) != 0 ? countdownToCapture.backState : null, (32764 & 1024) != 0 ? countdownToCapture.poseConfigs : null, (32764 & 2048) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & 4096) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : false, (32764 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false));
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((l) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$m */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToManualCapture$1", m39664f = "SelfieStepStateManager.kt", m39665l = {1275}, m39666m = "invokeSuspend")
    public static final class m extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22120t;

        public m(InterfaceC9557b<? super m> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new m(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22120t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f22120t = 1;
                if (C7946z0.m32938b(1000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = C5772k2.this.m45397d().m45411i();
            SelfieState.CountdownToManualCapture countdownToManualCapture = workflowStateM45411i instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) workflowStateM45411i : null;
            if (countdownToManualCapture == null) {
                return Unit.f29331a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                C5772k2.this.m45397d().m45417p(countdownToManualCapture.m19344z((4092 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & 256) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : false, (4092 & 2048) != 0 ? countdownToManualCapture.isDimLightConditions : false));
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((m) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$n */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderFinalizeVideoCapture$1", m39664f = "SelfieStepStateManager.kt", m39665l = {1995}, m39666m = "invokeSuspend")
    public static final class n extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22122t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ SelfieState.FinalizeLocalVideoCapture f22123u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C12255f<SelfieState> f22124v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, C12255f<SelfieState> c12255f, InterfaceC9557b<? super n> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f22123u = finalizeLocalVideoCapture;
            this.f22124v = c12255f;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new n(this.f22123u, this.f22124v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22122t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long minDurationMs = this.f22123u.getMinDurationMs();
                this.f22122t = 1;
                if (C7946z0.m32938b(minDurationMs, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = this.f22124v.m45411i();
            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateM45411i instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) workflowStateM45411i : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f29331a;
            }
            this.f22124v.m45417p(SelfieState.FinalizeLocalVideoCapture.m19347A(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((n) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$o */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderShowInstructions$1", m39664f = "SelfieStepStateManager.kt", m39665l = {373}, m39666m = "invokeSuspend")
    public static final class o extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22125t;

        public o(InterfaceC9557b<? super o> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C5772k2.this.new o(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f22125t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C7800a.Companion companion = C7800a.INSTANCE;
                long jM32371p = C7801b.m32371p(3, EnumC7361b.SECONDS);
                this.f22125t = 1;
                if (C7946z0.m32939c(jM32371p, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = C5772k2.this.m45397d().m45411i();
            SelfieState.ShowInstructions showInstructions = workflowStateM45411i instanceof SelfieState.ShowInstructions ? (SelfieState.ShowInstructions) workflowStateM45411i : null;
            if (showInstructions == null) {
                return Unit.f29331a;
            }
            C5772k2.this.m45397d().m45417p(SelfieState.ShowInstructions.m19368A(showInstructions, null, null, null, 3, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((o) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fq.k2$p */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$runManualCaptureEnabledChecker$1", m39664f = "SelfieStepStateManager.kt", m39665l = {2216}, m39666m = "invokeSuspend")
    public static final class p extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f22127t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C7758y f22128u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C5772k2 f22129v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C7758y c7758y, C5772k2 c5772k2, InterfaceC9557b<? super p> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f22128u = c7758y;
            this.f22129v = c5772k2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new p(this.f22128u, this.f22129v, interfaceC9557b);
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
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r5.f22127t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p229jt.C7348o.m30470b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p229jt.C7348o.m30470b(r6)
            L1a:
                kotlin.jvm.internal.y r6 = r5.f22128u
                boolean r6 = r6.f29445a
                if (r6 == 0) goto L53
                r5.f22127t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = p256ku.C7946z0.m32938b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                fq.k2 r6 = r5.f22129v
                vr.f r6 = r6.m45397d()
                com.withpersona.sdk2.inquiry.workflows.WorkflowState r6 = r6.m45411i()
                com.withpersona.sdk2.inquiry.selfie.SelfieState r6 = (com.withpersona.sdk2.inquiry.selfie.SelfieState) r6
                boolean r1 = r6 instanceof com.withpersona.sdk2.inquiry.selfie.InterfaceC3940b
                if (r1 == 0) goto L1a
                r1 = r6
                com.withpersona.sdk2.inquiry.selfie.b r1 = (com.withpersona.sdk2.inquiry.selfie.InterfaceC3940b) r1
                boolean r1 = r1.mo19320o()
                if (r1 == 0) goto L1a
                fq.k2 r1 = r5.f22129v
                vr.f r1 = r1.m45397d()
                r1.m45417p(r6)
                kotlin.jvm.internal.y r6 = r5.f22128u
                r1 = 0
                r6.f29445a = r1
                goto L1a
            L53:
                kotlin.Unit r6 = kotlin.Unit.f29331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p134fq.C5772k2.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((p) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5772k2(@NotNull SelfieWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle, @NotNull Context applicationContext, @NotNull C4197b.a submitVerificationWorker, @NotNull C11742b.a webRtcWorkerFactory, @NotNull C3953e.b selfieAnalyzeWorker, @NotNull C3875e.a permissionRequestWorkerFactory, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C11930a navigationStateManager, @NotNull DirectFileUploader directFileUploader, @NotNull final InterfaceC7906p0 coroutineScope, @NotNull C4658a.b selfiePoseManagerFactory, @NotNull C3955g selfieEventLogger, @NotNull C6159e featureFlagManager, @NotNull C10700c sdkFilesManager) {
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
        this.webRtcManager = C11934c.m44545b();
        this.selfiePoseManager = selfiePoseManagerFactory.mo22918a(m45395b().getValue().getInquiryId(), m45395b().getValue().getSessionToken(), m45395b().getValue().getFromStep(), m45395b().getValue().m19684C(), m45395b().getValue().getPoseTimeoutMs());
        selfieEventLogger.m20064o(m45395b().getValue().getUsePerPoseReveal());
        if (m45397d().m45411i() == null) {
            m45397d().m45417p(m26118b1(m45395b().getValue()));
        }
        m45397d().m45416o(new Function1() { // from class: fq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m25984Q0(coroutineScope, this, (SelfieState) obj);
            }
        });
        C7882k.m32780d(coroutineScope, C7864g1.m32646d(), null, new b(null), 2, null);
    }

    /* JADX INFO: renamed from: A2 */
    public static final Unit m25925A2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B1 */
    public static final Unit m25928B1(C5772k2 c5772k2, SelfieState.CountdownToCapture countdownToCapture, SelfieWorkflow.Input input, C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.CountdownToCapture countdownToCapture2 = workflowStateM45411i instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) workflowStateM45411i : null;
        if (countdownToCapture2 == null) {
            return Unit.f29331a;
        }
        if (!(output instanceof C3953e.c.a)) {
            if (output instanceof C3953e.c.b) {
                c5772k2.m26126g3(((C3953e.c.b) output).getError());
            } else {
                if (!(output instanceof C3953e.c.C14143c)) {
                    throw new C7345l();
                }
                c5772k2.m45397d().m45417p(new SelfieState.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.mo19302g(), null, countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((C3953e.c.C14143c) output).getIsDimLightConditions(), 163, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B2 */
    public static final Unit m25929B2(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C1 */
    public static final Unit m25932C1(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m25935D1(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX INFO: renamed from: D2 */
    public static final Unit m25936D2(C5772k2 c5772k2, boolean z10, C4197b.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C4197b.d.b) {
            c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.d.f16226a);
        } else {
            if (!(it instanceof C4197b.d.Error)) {
                throw new C7345l();
            }
            WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
            SelfieState.Submit submit = workflowStateM45411i instanceof SelfieState.Submit ? (SelfieState.Submit) workflowStateM45411i : null;
            if (submit == null) {
                return Unit.f29331a;
            }
            if (z10) {
                C4197b.d.Error error = (C4197b.d.Error) it;
                if (C3965p.m20162B(error.getCause())) {
                    c5772k2.m45397d().m45417p(SelfieState.Submit.m19393A(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
                } else {
                    c5772k2.m26127h3(new SelfieWorkflow.AbstractC3927b.Error(((C4197b.d.Error) it).getCause()));
                }
            } else {
                c5772k2.m26127h3(new SelfieWorkflow.AbstractC3927b.Error(((C4197b.d.Error) it).getCause()));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E1 */
    public static final Unit m25939E1(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E2 */
    public static final Unit m25940E2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F2 */
    public static final Unit m25943F2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G1 */
    public static final Unit m25946G1(PoseInfo poseInfo, EnumC7638a enumC7638a, C5772k2 c5772k2, SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        c5772k2.m45397d().m45417p(c5772k2.m26123f1(c5772k2.m45397d(), countdownToManualCapture, new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.MANUAL, enumC7638a, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G2 */
    public static final Unit m25947G2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H1 */
    public static final Unit m25950H1(C5772k2 c5772k2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c5772k2.m26126g3(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H2 */
    public static final Unit m25951H2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m25954I1(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I2 */
    public static final Unit m25955I2(C5772k2 c5772k2) {
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.Submit submit = workflowStateM45411i instanceof SelfieState.Submit ? (SelfieState.Submit) workflowStateM45411i : null;
        if (submit == null) {
            return Unit.f29331a;
        }
        c5772k2.m45397d().m45417p(SelfieState.Submit.m19393A(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J1 */
    public static final Unit m25958J1(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K1 */
    public static final Unit m25961K1(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K2 */
    public static final Unit m25962K2(C5772k2 c5772k2, SelfieWorkflow.Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, long j10, CameraProperties cameraProperties) {
        SelfieState showPoseHint;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        c5772k2.selfieEventLogger.m20063n();
        if (c5772k2.m26130j3(input) == EnumC8598a.Stream) {
            c5772k2.selfieEventLogger.m20060k();
            c5772k2.m45397d().m45417p(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, C5776l2.m26149a(c5772k2.m45397d(), false), waitForCameraFeed.m19405g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            c5772k2.selfieEventLogger.m20051b((SelfieState) c5772k2.m45397d().m45411i());
            EnumC7638a pose = ((PoseInfo) CollectionsKt.m31706d0(waitForCameraFeed.m19405g())).getPose();
            C12255f<SelfieState> c12255fM45397d = c5772k2.m45397d();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new SelfieState.AcquireNextPose(cameraProperties, j10, C7699p.m31892k(), C5776l2.m26149a(c5772k2.m45397d(), false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.m19405g(), input.getPoseConfigs(), true);
            } else if (pose == EnumC7638a.Center) {
                showPoseHint = new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.m19405g(), null, System.currentTimeMillis(), false, j10, cameraProperties, C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new SelfieState.ShowPoseHint(C7699p.m31892k(), waitForCameraFeed.m19405g(), true, cameraProperties, j10, C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            c12255fM45397d.m45417p(showPoseHint);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L1 */
    public static final Unit m25965L1(C12255f c12255f, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.EnumC3902a.MANUAL));
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateM45411i instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) workflowStateM45411i : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f29331a;
        }
        c12255f.m45417p(SelfieState.FinalizeLocalVideoCapture.m19347A(finalizeLocalVideoCapture, CollectionsKt.m31725w0(finalizeLocalVideoCapture.mo19297w(), arrayList), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L2 */
    public static final Unit m25966L2(C5772k2 c5772k2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m26018a1(c5772k2, c5772k2.m45397d(), false, 1, null).invoke(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M1 */
    public static final Unit m25969M1(C12255f c12255f, SelfieWorkflow.Input input, SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        WorkflowState workflowStateM45411i = c12255f.m45411i();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = workflowStateM45411i instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) workflowStateM45411i : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            c12255f.m45417p(C5776l2.m26153e(c12255f, input.getPoseConfigs(), finalizeLocalVideoCapture2.mo19297w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), C5776l2.m26149a(c12255f, false)));
            return Unit.f29331a;
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M2 */
    public static final Unit m25970M2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N1 */
    public static final Unit m25973N1(C5772k2 c5772k2, C12255f c12255f) {
        c5772k2.m26119c1(c12255f, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N2 */
    public static final Unit m25974N2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O1 */
    public static final Unit m25977O1(C5772k2 c5772k2) {
        c5772k2.m45398e(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O2 */
    public static final Unit m25978O2(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P1 */
    public static final Unit m25981P1(C5772k2 c5772k2, C12255f c12255f, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c12255f, input, true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P2 */
    public static final Unit m25982P2(C5772k2 c5772k2, SelfieState.WaitForCameraFeed waitForCameraFeed, SelfieWorkflow.Input input, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == EnumC11028j1.PermissionGranted) {
            c5772k2.m45397d().m45417p(SelfieState.WaitForCameraFeed.m19402A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            c5772k2.m45397d().m45417p(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.a.f16223a);
        } else if (it.getPermissionState().getResult() == EnumC11028j1.SettingsLaunched) {
            c5772k2.m45397d().m45417p(SelfieState.WaitForCameraFeed.m19402A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else {
            c5772k2.m26127h3(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m25984Q0(InterfaceC7906p0 interfaceC7906p0, C5772k2 c5772k2, SelfieState selfieState) {
        if (selfieState == null) {
            return Unit.f29331a;
        }
        C7882k.m32780d(interfaceC7906p0, C7864g1.m32646d(), null, c5772k2.new a(selfieState, null), 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q2 */
    public static final Unit m25985Q2(C5772k2 c5772k2, SelfieState.WaitForCameraFeed waitForCameraFeed, SelfieWorkflow.Input input, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == EnumC11028j1.PermissionGranted) {
            c5772k2.m45397d().m45417p(SelfieState.WaitForCameraFeed.m19402A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            c5772k2.m45397d().m45417p(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.a.f16223a);
        } else if (it.getPermissionState().getResult() == EnumC11028j1.SettingsLaunched) {
            c5772k2.m45397d().m45417p(SelfieState.WaitForCameraFeed.m19402A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else {
            c5772k2.m26127h3(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m25990S1(C5772k2 c5772k2, SelfieWorkflow.Input input, SelfieState.FinalizeWebRtc finalizeWebRtc, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c5772k2.selfieEventLogger.m20062m(input.getFromStep());
        c5772k2.m45397d().m45417p(new SelfieState.WebRtcFinished(finalizeWebRtc.mo19297w(), it, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), C5776l2.m26149a(c5772k2.m45397d(), false), finalizeWebRtc.getCameraFacingMode()));
        c5772k2.webRtcManager.m44538d();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S2 */
    public static final Unit m25991S2(final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final C5772k2 c5772k2, final SelfieWorkflow.Input input, C11742b.b it) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C11742b.b.C14265b) {
            CameraProperties cameraProperties = waitForWebRtcSetup.getCameraProperties();
            InterfaceC11932a interfaceC11932a = c5772k2.webRtcManager;
            if (interfaceC11932a != null) {
                interfaceC11932a.m44542h(c5772k2.webRtcWorkerFactory.getAndroidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String());
            }
            InterfaceC11932a interfaceC11932a2 = c5772k2.webRtcManager;
            if (interfaceC11932a2 != null) {
                interfaceC11932a2.m44543i(c5772k2.applicationContext);
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
            InterfaceC11932a interfaceC11932a3 = c5772k2.webRtcManager;
            if (interfaceC11932a3 != null) {
                C11742b.b.C14265b c14265b = (C11742b.b.C14265b) it;
                interfaceC11932a3.m44539e(c14265b.getResult().getUsername(), c14265b.getResult().getCredential(), c14265b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: fq.e2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5772k2.m25995T2(this.f22029a, input, waitForWebRtcSetup);
                    }
                }, new Function0() { // from class: fq.f2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5772k2.m25999U2(this.f22037a, waitForWebRtcSetup);
                    }
                }, new Function0() { // from class: fq.g2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C5772k2.m26003V2(this.f22045a, input);
                    }
                }, new Function1() { // from class: fq.h2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5772k2.m26007W2(this.f22052a, (String) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof C11742b.b.Error)) {
                throw new C7345l();
            }
            InterfaceC11932a interfaceC11932a4 = c5772k2.webRtcManager;
            if (interfaceC11932a4 != null) {
                interfaceC11932a4.m44535a();
            }
            c5772k2.m45397d().m45417p(new SelfieState.RestartCamera(false, false, C5776l2.m26149a(c5772k2.m45397d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T1 */
    public static final Unit m25994T1() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T2 */
    public static final Unit m25995T2(C5772k2 c5772k2, SelfieWorkflow.Input input, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        c5772k2.selfieEventLogger.m20061l(input.getFromStep());
        c5772k2.selfieEventLogger.m20051b((SelfieState) c5772k2.m45397d().m45411i());
        c5772k2.m45397d().m45417p(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.mo19302g(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m25998U1(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U2 */
    public static final Unit m25999U2(C5772k2 c5772k2, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        c5772k2.webRtcManager.m44535a();
        c5772k2.m45397d().m45417p(new SelfieState.RestartCamera(false, false, C5776l2.m26149a(c5772k2.m45397d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V1 */
    public static final Unit m26002V1(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V2 */
    public static final Unit m26003V2(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        c5772k2.selfieEventLogger.m20059j(input.getFromStep());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W1 */
    public static final Unit m26006W1(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W2 */
    public static final Unit m26007W2(C5772k2 c5772k2, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        c5772k2.selfieEventLogger.m20058i(step);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X2 */
    public static final Unit m26010X2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m26012Y0(C12255f c12255f, C5772k2 c5772k2, boolean z10, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        SelfieState selfieState = (SelfieState) c12255f.m45411i();
        if (selfieState == null) {
            return Unit.f29331a;
        }
        if (!(cameraError instanceof AbstractC5685h)) {
            c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f29331a;
        }
        AbstractC5685h abstractC5685h = (AbstractC5685h) cameraError;
        if (!(abstractC5685h instanceof C5686h0)) {
            if (abstractC5685h instanceof C5688i0) {
                c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (abstractC5685h instanceof C5678d0) {
                c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else if (abstractC5685h instanceof C5696m0) {
                if (z10) {
                    C5776l2.m26151c(selfieState);
                    if (C3965p.m20168H(selfieState)) {
                        c12255f.m45417p(new SelfieState.RestartCamera(false, false, C5776l2.m26149a(c12255f, false), selfieState.getCameraFacingMode(), 3, null));
                    }
                } else {
                    c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                }
            } else if (abstractC5685h instanceof C5713v) {
                c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
            } else if (abstractC5685h instanceof C5714v0) {
                c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
            } else {
                if (!(abstractC5685h instanceof C5694l0)) {
                    throw new C7345l();
                }
                if (z10) {
                    C5776l2.m26151c(selfieState);
                    if (C3965p.m20168H(selfieState)) {
                        c12255f.m45417p(new SelfieState.RestartCamera(false, false, C5776l2.m26149a(c12255f, false), selfieState.getCameraFacingMode(), 3, null));
                    }
                } else {
                    c5772k2.m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                }
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final Unit m26013Y1(C5772k2 c5772k2, SelfieWorkflow.Input input, SelfieState.RestartCamera restartCamera) {
        c5772k2.m45397d().m45417p(new SelfieState.WaitForCameraFeed(false, false, C5776l2.m26149a(c5772k2.m45397d(), false), input.m19683A(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y2 */
    public static final Unit m26014Y2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z2 */
    public static final Unit m26016Z2(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Function1 m26018a1(C5772k2 c5772k2, C12255f c12255f, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c5772k2.m26115Z0(c12255f, z10);
    }

    /* JADX INFO: renamed from: a2 */
    public static final Unit m26019a2(C5772k2 c5772k2, SelfieState.ReviewCaptures reviewCaptures) {
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.ReviewCaptures reviewCaptures2 = workflowStateM45411i instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) workflowStateM45411i : null;
        if (reviewCaptures2 == null) {
            return Unit.f29331a;
        }
        c5772k2.m45397d().m45417p(new SelfieState.Submit(reviewCaptures2.mo19297w(), reviewCaptures2.getWebRtcObjectId(), reviewCaptures2.getCameraProperties(), reviewCaptures2.getStartSelfieTimestamp(), C5776l2.m26149a(c5772k2.m45397d(), true), reviewCaptures.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b2 */
    public static final Unit m26021b2(C5772k2 c5772k2, SelfieWorkflow.Input input, SelfieState.ReviewCaptures reviewCaptures) {
        c5772k2.m45397d().m45417p(new SelfieState.WaitForCameraFeed(false, false, C5776l2.m26149a(c5772k2.m45397d(), false), input.m19683A(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b3 */
    public static final Unit m26022b3(C5772k2 c5772k2, SelfieState.WebRtcFinished webRtcFinished) {
        c5772k2.m45397d().m45417p(C5776l2.m26153e(c5772k2.m45397d(), c5772k2.m45395b().getValue().getPoseConfigs(), webRtcFinished.mo19297w(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), C5776l2.m26149a(c5772k2.m45397d(), false)));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c2 */
    public static final Unit m26024c2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c3 */
    public static final Unit m26025c3(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d2 */
    public static final Unit m26027d2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d3 */
    public static final Unit m26028d3(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e3 */
    public static final Unit m26030e3(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f2 */
    public static final Unit m26032f2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m26035g2(C5772k2 c5772k2, SelfieState.ShowInstructions showInstructions) {
        c5772k2.m45399f(SelfieState.ShowInstructions.m19368A(showInstructions, null, null, null, 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m26038h1(EnumC7638a pose, boolean z10) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        return Unit.f29331a;
    }

    /* JADX DEBUG: Class process forced to load method for inline: fq.l2.b(vr.f, boolean, int, java.lang.Object):com.withpersona.sdk2.inquiry.selfie.SelfieState */
    /* JADX INFO: renamed from: h2 */
    public static final Unit m26039h2(C5772k2 c5772k2, SelfieWorkflow.Input input, SelfieState.ShowInstructions showInstructions) {
        c5772k2.selfieEventLogger.m20052c();
        c5772k2.m45397d().m45417p(new SelfieState.WaitForCameraFeed(false, false, C5776l2.m26150b(c5772k2.m45397d(), false, 1, null), input.m19683A(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i1 */
    public static final Unit m26042i1(C5772k2 c5772k2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.AcquireNextPose acquireNextPose = workflowStateM45411i instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) workflowStateM45411i : null;
        if (acquireNextPose == null) {
            return Unit.f29331a;
        }
        C5776l2.m26151c(acquireNextPose);
        c5772k2.m45397d().m45417p(new SelfieState.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), C7699p.m31892k(), C5776l2.m26149a(c5772k2.m45397d(), false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), C7699p.m31892k(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i2 */
    public static final Unit m26043i2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Unit m26046j1(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m26049k1(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k2 */
    public static final Unit m26050k2(C5772k2 c5772k2, SelfieState.ShowPoseHint showPoseHint, SelfieWorkflow.Input input) {
        C12255f<SelfieState> c12255fM45397d = c5772k2.m45397d();
        List<PoseInfo> listMo19302g = showPoseHint.mo19302g();
        c12255fM45397d.m45417p(new SelfieState.Capture(null, 0.0f, null, showPoseHint.mo19297w(), listMo19302g, System.currentTimeMillis(), showPoseHint.getAutoCaptureSupported(), showPoseHint.getStartSelfieTimestamp(), showPoseHint.getCameraProperties(), C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), showPoseHint.getCameraFacingMode(), showPoseHint.getIsFlashEnabled(), null, c5772k2.m45395b().getValue().getUsePerPoseReveal() ? Long.valueOf(System.currentTimeMillis() + c5772k2.selfiePoseManager.getPerPoseTimeoutMs()) : null, false, 8193, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m26053l1(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l2 */
    public static final Unit m26054l2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m26057m1(C5772k2 c5772k2, CameraProperties.EnumC3397b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c5772k2.m45397d().m45417p(new SelfieState.RestartCamera(false, false, C5776l2.m26149a(c5772k2.m45397d(), false), it, 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m26058m2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m26061n1(boolean z10) {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n2 */
    public static final Unit m26062n2(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p1 */
    public static final Unit m26067p1(C5772k2 c5772k2, SelfieState.Capture capture, C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.Capture capture2 = workflowStateM45411i instanceof SelfieState.Capture ? (SelfieState.Capture) workflowStateM45411i : null;
        if (capture2 == null) {
            return Unit.f29331a;
        }
        if (output instanceof C3953e.c.a) {
            C3953e.c.a aVar = (C3953e.c.a) output;
            if (aVar.getSelfie() != null) {
                Selfie selfie = aVar.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                c5772k2.selfieEventLogger.m20056g(capture2, selfie);
                c5772k2.m45397d().m45417p(c5772k2.m26123f1(c5772k2.m45397d(), capture, selfie));
            } else {
                c5772k2.m45397d().m45417p(capture2.m19322z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : 0.0f, (57343 & 4) != 0 ? capture2.brightnessInfo : null, (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture2.cameraProperties : null, (57343 & 512) != 0 ? capture2.backState : null, (57343 & 1024) != 0 ? capture2.poseConfigs : null, (57343 & 2048) != 0 ? capture2.cameraFacingMode : null, (57343 & 4096) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : SelfieState.EnumC3920a.FlashOn, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : false));
            }
        } else if (output instanceof C3953e.c.C14143c) {
            C3953e.c.C14143c c14143c = (C3953e.c.C14143c) output;
            if (c14143c.getError() == EnumC7639b.FaceDetectionUnsupported) {
                c5772k2.m45397d().m45417p(capture2.m19322z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : c14143c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c14143c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture2.cameraProperties : null, (57343 & 512) != 0 ? capture2.backState : null, (57343 & 1024) != 0 ? capture2.poseConfigs : null, (57343 & 2048) != 0 ? capture2.cameraFacingMode : null, (57343 & 4096) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c14143c.getIsDimLightConditions()));
            } else {
                c5772k2.m45397d().m45417p(capture2.m19322z((57343 & 1) != 0 ? capture2.selfieError : c14143c.getError(), (57343 & 2) != 0 ? capture2.poseScore : c14143c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c14143c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture2.cameraProperties : null, (57343 & 512) != 0 ? capture2.backState : null, (57343 & 1024) != 0 ? capture2.poseConfigs : null, (57343 & 2048) != 0 ? capture2.cameraFacingMode : null, (57343 & 4096) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c14143c.getIsDimLightConditions()));
            }
        } else {
            if (!(output instanceof C3953e.c.b)) {
                throw new C7345l();
            }
            c5772k2.m26126g3(((C3953e.c.b) output).getError());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p2 */
    public static final Unit m26068p2(C5772k2 c5772k2, SelfieState.StartCapture startCapture, SelfieWorkflow.Input input, C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.StartCapture startCapture2 = workflowStateM45411i instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) workflowStateM45411i : null;
        if (startCapture2 == null) {
            return Unit.f29331a;
        }
        if (output instanceof C3953e.c.a) {
            C3953e.c.a aVar = (C3953e.c.a) output;
            c5772k2.m45397d().m45417p(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar.getPoseScore(), aVar.getBrightnessInfo(), startCapture.mo19302g(), startCapture.mo19297w(), C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar.getIsDimLightConditions()));
        } else if (output instanceof C3953e.c.b) {
            c5772k2.m26126g3(((C3953e.c.b) output).getError());
        } else {
            if (!(output instanceof C3953e.c.C14143c)) {
                throw new C7345l();
            }
            C3953e.c.C14143c c14143c = (C3953e.c.C14143c) output;
            c5772k2.m45397d().m45417p(c14143c.getError() == EnumC7639b.FaceDetectionUnsupported ? startCapture2.m19382z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : null, (16242 & 4) != 0 ? startCapture2.poseScore : c14143c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c14143c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & 512) != 0 ? startCapture2.cameraProperties : null, (16242 & 1024) != 0 ? startCapture2.backState : null, (16242 & 2048) != 0 ? startCapture2.poseConfigs : null, (16242 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c14143c.getIsDimLightConditions()) : startCapture2.m19382z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : c14143c.getError(), (16242 & 4) != 0 ? startCapture2.poseScore : c14143c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c14143c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & 512) != 0 ? startCapture2.cameraProperties : null, (16242 & 1024) != 0 ? startCapture2.backState : null, (16242 & 2048) != 0 ? startCapture2.poseConfigs : null, (16242 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c14143c.getIsDimLightConditions()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m26071q1(PoseInfo poseInfo, EnumC7638a enumC7638a, C5772k2 c5772k2, SelfieState.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        c5772k2.m45397d().m45417p(c5772k2.m26123f1(c5772k2.m45397d(), capture, new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.MANUAL, enumC7638a, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q2 */
    public static final Unit m26072q2(C5772k2 c5772k2, SelfieState.StartCapture startCapture, SelfieWorkflow.Input input) {
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.StartCapture startCapture2 = workflowStateM45411i instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) workflowStateM45411i : null;
        if (startCapture2 == null) {
            return Unit.f29331a;
        }
        c5772k2.m45397d().m45417p(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.mo19302g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        c5772k2.selfieEventLogger.m20053d(startCapture2);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r1 */
    public static final Unit m26075r1(C5772k2 c5772k2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c5772k2.m26126g3(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r2 */
    public static final Unit m26076r2(PoseInfo poseInfo, C5772k2 c5772k2, SelfieState.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        c5772k2.m45397d().m45417p(c5772k2.m26123f1(c5772k2.m45397d(), startCapture, new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.MANUAL, poseInfo.getPose(), System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m26079s1(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s2 */
    public static final Unit m26080s2(C5772k2 c5772k2, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c5772k2.m26126g3(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m26083t1(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t2 */
    public static final Unit m26084t2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m26087u1(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m26088u2(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m26091v2(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w1 */
    public static final Unit m26094w1(C5772k2 c5772k2) {
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.CaptureTransition captureTransition = workflowStateM45411i instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) workflowStateM45411i : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            c5772k2.m45397d().m45417p(nextState);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m26097x1(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x2 */
    public static final Unit m26098x2(C5772k2 c5772k2, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, SelfieWorkflow.Input input, C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (!(output instanceof C3953e.c.a)) {
            if (output instanceof C3953e.c.b) {
                c5772k2.m26126g3(((C3953e.c.b) output).getError());
            } else {
                if (!(output instanceof C3953e.c.C14143c)) {
                    throw new C7345l();
                }
                C12255f<SelfieState> c12255fM45397d = c5772k2.m45397d();
                C3953e.c.C14143c c14143c = (C3953e.c.C14143c) output;
                EnumC7639b error = c14143c.getError();
                List<PoseInfo> listMo19302g = startCaptureFaceDetected.mo19302g();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                c12255fM45397d.m45417p(new SelfieState.StartCapture(false, error, c14143c.getPoseScore(), c14143c.getBrightnessInfo(), listMo19302g, null, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c14143c.getIsDimLightConditions(), 161, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y1 */
    public static final Unit m26101y1(C5772k2 c5772k2) {
        c5772k2.m26127h3(SelfieWorkflow.AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y2 */
    public static final Unit m26102y2(C5772k2 c5772k2, SelfieWorkflow.Input input, Unit it) {
        SelfieState countdownToCapture;
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateM45411i = c5772k2.m45397d().m45411i();
        SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = workflowStateM45411i instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) workflowStateM45411i : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f29331a;
        }
        c5772k2.selfieEventLogger.m20050a(startCaptureFaceDetected);
        boolean z10 = input.getDesignVersion() == EnumC13272a.K0000 && startCaptureFaceDetected.mo19304j() == EnumC7638a.Center;
        C12255f<SelfieState> c12255fM45397d = c5772k2.m45397d();
        if (z10) {
            List<PoseInfo> listMo19302g = startCaptureFaceDetected.mo19302g();
            List<Selfie> listMo19297w = startCaptureFaceDetected.mo19297w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new SelfieState.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listMo19297w, listMo19302g, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.mo19302g(), startCaptureFaceDetected.mo19297w(), C5776l2.m26149a(c5772k2.m45397d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        c12255fM45397d.m45417p(countdownToCapture);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z1 */
    public static final Unit m26105z1(C5772k2 c5772k2, SelfieWorkflow.Input input) {
        C5776l2.m26152d(c5772k2.applicationContext, c5772k2.m45397d(), input, c5772k2.m26121e1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z2 */
    public static final Unit m26106z2(C5772k2 c5772k2) {
        c5772k2.m26119c1(c5772k2.m45397d(), c5772k2.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: A1 */
    public final SelfieWorkflow.AbstractC3928c m26107A1(final SelfieWorkflow.Input renderProps, final SelfieState.CountdownToCapture renderState) {
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            m45397d().m45415n(this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), false), new Function1() { // from class: fq.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25928B1(this.f22173a, renderState, renderProps, (C3953e.c) obj);
                }
            });
        }
        m45397d().m45414m("countdown_" + renderState.getCountDown(), new l(renderProps, this, renderState, null));
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        String selfieHintCenterFace = strM20116b == null ? renderProps.getStrings().getSelfieHintCenterFace() : strM20116b;
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.AbstractC3928c.c.b.C14140b c14140b = new SelfieWorkflow.AbstractC3928c.c.b.C14140b(renderState.getCountDown(), SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20148g(renderProps, c12255fM45397d, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strM20116b, renderState.getAutoCaptureSupported(), c14140b, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25932C1(this.f22178a);
            }
        }, new Function0() { // from class: fq.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25935D1(this.f22182a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25939E1(this.f22187a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: C2 */
    public final SelfieWorkflow.AbstractC3928c m26108C2(SelfieWorkflow.Input renderProps, SelfieState.Submit renderState) {
        final boolean z10 = renderProps.getDesignVersion() == EnumC13272a.K0000;
        if (renderState.getRecoverableSubmitError() == null) {
            m45397d().m45415n(this.submitVerificationWorker.mo21719a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.mo19297w(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp(), renderProps.getFileUploadUrl(), this.selfiePoseManager), new Function1() { // from class: fq.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25936D2(this.f22137a, z10, (C4197b.d) obj);
                }
            });
        }
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
        if (customPendingPage != null && renderState.getRecoverableSubmitError() == null) {
            return new SelfieWorkflow.AbstractC3928c.d(C1147b.m6492a(customPendingPage), this.navigationStateManager.m44528b(), renderProps.getStyles(), new Function0() { // from class: fq.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5772k2.m25940E2(this.f22142a);
                }
            }, new Function0() { // from class: fq.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5772k2.m25943F2(this.f22162a);
                }
            }, renderProps.getStrings().getPendingPageNavBarTitle());
        }
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        C10700c c10700c = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function0 function0 = new Function0() { // from class: fq.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25947G2(this.f22172a);
            }
        };
        Function0 function1 = new Function0() { // from class: fq.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25951H2(this.f22177a);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.AbstractC3928c.g(processingTitle, c10700c, processingDescription, pendingPageTextVerticalPosition, styles, navigationStateM44528b, function0, function1, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), C3965p.m20191w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: fq.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25955I2(this.f22181a);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final SelfieWorkflow.AbstractC3928c m26109F1(final SelfieWorkflow.Input renderProps, SelfieState.CountdownToManualCapture renderState) {
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c;
        final SelfieState.CountdownToManualCapture countdownToManualCapture;
        SelfieWorkflow.AbstractC3928c.c.b c14140b;
        final PoseInfo poseInfoMo19321p = renderState.mo19321p();
        final EnumC7638a pose = poseInfoMo19321p.getPose();
        int i10 = e.f22096a[pose.ordinal()];
        if (i10 == 1) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP;
        } else if (i10 == 4) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new C7345l();
            }
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER;
        }
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c2 = enumC14142c;
        m45397d().m45414m("countdown_to_manual_capture_" + renderState.getCountDown(), new m(null));
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        String selfieHintCenterFace = strM20116b == null ? renderProps.getStrings().getSelfieHintCenterFace() : strM20116b;
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            countdownToManualCapture = renderState;
            c14140b = new SelfieWorkflow.AbstractC3928c.c.b.d(new Function1() { // from class: fq.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25946G1(poseInfoMo19321p, pose, this, countdownToManualCapture, (String) obj);
                }
            }, new Function1() { // from class: fq.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25950H1(this.f22216a, (Throwable) obj);
                }
            }, true, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        } else {
            countdownToManualCapture = renderState;
            c14140b = new SelfieWorkflow.AbstractC3928c.c.b.C14140b(countdownToManualCapture.getCountDown(), enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        }
        SelfieWorkflow.AbstractC3928c.c.b bVar = c14140b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20148g(renderProps, c12255fM45397d, countdownToManualCapture.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strM20116b, countdownToManualCapture.getAutoCaptureSupported(), bVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25954I1(this.f22002a);
            }
        }, new Function0() { // from class: fq.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25958J1(this.f22008a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25961K1(this.f22014a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, countdownToManualCapture.getCameraFacingMode(), countdownToManualCapture.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), countdownToManualCapture.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: J2 */
    public final SelfieWorkflow.AbstractC3928c m26110J2(final SelfieWorkflow.Input renderProps, final SelfieState.WaitForCameraFeed renderState) {
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || C3858g.m19164b(this.applicationContext, EnumC11024i0.Camera)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && m26121e1(renderProps) && C7259g.m30272f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !C3858g.m19164b(this.applicationContext, EnumC11024i0.RecordAudio);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C12255f<SelfieState> c12255fM45397d = m45397d();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.m19405g());
        SelfieWorkflow.AbstractC3928c abstractC3928cM20148g = C3964o.m20148g(renderProps, c12255fM45397d, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.AbstractC3928c.c.b.g(new Function1() { // from class: fq.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m25962K2(this.f22130a, renderProps, renderState, jCurrentTimeMillis, (CameraProperties) obj);
            }
        }, SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CLEAR, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), m26130j3(renderProps) == EnumC8598a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: fq.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m25966L2(this.f22200a, (Throwable) obj);
            }
        }), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: fq.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25970M2(this.f22048a);
            }
        }, new Function0() { // from class: fq.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25974N2(this.f22183a);
            }
        }, m26018a1(this, m45397d(), false, 1, null), new Function0() { // from class: fq.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25978O2(this.f22019a, renderProps);
            }
        }, m26130j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : z10 || z11, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
        if (z10) {
            C12255f<SelfieState> c12255fM45397d2 = m45397d();
            C3875e.a aVar = this.permissionRequestWorkerFactory;
            EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle == null ? "" : cameraPermissionsTitle;
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(C12244g.f43223H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            String str2 = cameraPermissionsRationale;
            Context context = this.applicationContext;
            String string = context.getString(C12244g.f43222G, C7259g.m30268b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c12255fM45397d2.m45415n(aVar.mo19201a(new PermissionRequestWorkflow.Props(enumC11024i0, false, str, str2, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: fq.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25982P2(this.f22166a, renderState, renderProps, (C3875e.b) obj);
                }
            });
            return abstractC3928cM20148g;
        }
        if (z11) {
            C12255f<SelfieState> c12255fM45397d3 = m45397d();
            C3875e.a aVar2 = this.permissionRequestWorkerFactory;
            EnumC11024i0 enumC11024i1 = EnumC11024i0.RecordAudio;
            String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
            if (microphonePermissionsRationale == null) {
                microphonePermissionsRationale = this.applicationContext.getString(C12244g.f43234S);
                Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
            }
            String str3 = microphonePermissionsRationale;
            Context context2 = this.applicationContext;
            String string2 = context2.getString(C12244g.f43233R, C7259g.m30268b(context2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
            String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
            String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
            c12255fM45397d3.m45415n(aVar2.mo19201a(new PermissionRequestWorkflow.Props(enumC11024i1, false, microphonePermissionsTitle == null ? "" : microphonePermissionsTitle, str3, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: fq.z1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25985Q2(this.f22218a, renderState, renderProps, (C3875e.b) obj);
                }
            });
        }
        return abstractC3928cM20148g;
    }

    @NotNull
    /* JADX INFO: renamed from: Q1 */
    public final SelfieWorkflow.AbstractC3928c m26111Q1(@NotNull final SelfieWorkflow.Input renderProps, @NotNull final SelfieState.FinalizeLocalVideoCapture renderState, @NotNull final C12255f<SelfieState> workflowContext) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        workflowContext.m45414m("finalize_delay", new n(renderState, workflowContext, null));
        return C3964o.m20148g(renderProps, workflowContext, null, null, (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.AbstractC3928c.c.b.C14141c(new Function1() { // from class: fq.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m25965L1(workflowContext, (File) obj);
            }
        }, new Function0() { // from class: fq.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25969M1(workflowContext, renderProps, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE : SelfieWorkflow.AbstractC3928c.c.EnumC14142c.FINALIZING, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a)), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: fq.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25973N1(this.f22027a, workflowContext);
            }
        }, new Function0() { // from class: fq.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25977O1(this.f22036a);
            }
        }, m26115Z0(workflowContext, false), new Function0() { // from class: fq.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25981P1(this.f22042a, workflowContext, renderProps);
            }
        }, EnumC8598a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: R1 */
    public final SelfieWorkflow.AbstractC3928c m26112R1(final SelfieWorkflow.Input renderProps, SelfieState.FinalizeWebRtc renderState) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        if (interfaceC11932a != null) {
            finalizeWebRtc = renderState;
            interfaceC11932a.m44540f(renderProps.getFromStep(), new Function1() { // from class: fq.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m25990S1(this.f22065a, renderProps, finalizeWebRtc, (String) obj);
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        return C3964o.m20148g(renderProps, m45397d(), null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.AbstractC3928c.c.b.h(new Function0() { // from class: fq.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25994T1();
            }
        }, false, SelfieWorkflow.AbstractC3928c.c.EnumC14142c.FINALIZING, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a)), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: fq.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25998U1(this.f22158a);
            }
        }, new Function0() { // from class: fq.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26002V1(this.f22164a);
            }
        }, m26115Z0(m45397d(), false), new Function0() { // from class: fq.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26006W1(this.f22169a, renderProps);
            }
        }, m26130j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: R2 */
    public final SelfieWorkflow.AbstractC3928c m26113R2(final SelfieWorkflow.Input renderProps, final SelfieState.WaitForWebRtcSetup renderState) {
        m45397d().m45415n(this.webRtcWorkerFactory.m43961a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: fq.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m25991S2(renderState, this, renderProps, (C11742b.b) obj);
            }
        });
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.AbstractC3928c.c.b.i iVar = new SelfieWorkflow.AbstractC3928c.c.b.i(SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20148g(renderProps, c12255fM45397d, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, iVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26010X2(this.f22197a);
            }
        }, new Function0() { // from class: fq.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26014Y2(this.f22205a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26016Z2(this.f22213a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: X1 */
    public final SelfieWorkflow.AbstractC3928c m26114X1(final SelfieWorkflow.Input renderProps, final SelfieState.RestartCamera renderState) {
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        if (interfaceC11932a != null) {
            interfaceC11932a.m44538d();
        }
        return new SelfieWorkflow.AbstractC3928c.e(new Function0() { // from class: fq.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26013Y1(this.f22056a, renderProps, renderState);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final Function1<Throwable, Unit> m26115Z0(@NotNull final C12255f<SelfieState> c12255f, final boolean z10) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        return new Function1() { // from class: fq.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m26012Y0(c12255f, this, z10, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: renamed from: Z1 */
    public final SelfieWorkflow.AbstractC3928c m26116Z1(final SelfieWorkflow.Input renderProps, final SelfieState.ReviewCaptures renderState) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(C12244g.f43232Q);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(C12244g.f43224I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(C12244g.f43228M);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(C12244g.f43229N);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(C12244g.f43230O);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageLabelUp = renderProps.getStrings().getSelfieCheckPageLabelUp();
        if (selfieCheckPageLabelUp == null) {
            selfieCheckPageLabelUp = this.applicationContext.getString(C12244g.f43231P);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelUp, "getString(...)");
        }
        String selfieCheckPageLabelDown = renderProps.getStrings().getSelfieCheckPageLabelDown();
        if (selfieCheckPageLabelDown == null) {
            selfieCheckPageLabelDown = this.applicationContext.getString(C12244g.f43227L);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelDown, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(C12244g.f43226K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(C12244g.f43225J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new SelfieWorkflow.AbstractC3928c.f(new SelfieWorkflow.AbstractC3928c.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.m19365z(), renderProps.getStyles(), this.navigationStateManager.m44528b(), new Function0() { // from class: fq.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26019a2(this.f22063a, renderState);
            }
        }, new Function0() { // from class: fq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26021b2(this.f22003a, renderProps, renderState);
            }
        }, new Function0() { // from class: fq.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26024c2(this.f22009a);
            }
        }, new Function0() { // from class: fq.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26027d2(this.f22016a);
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    /* JADX INFO: renamed from: a3 */
    public final SelfieWorkflow.AbstractC3928c m26117a3(final SelfieWorkflow.Input renderProps, final SelfieState.WebRtcFinished renderState) {
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        SelfieWorkflow.AbstractC3928c.c.b.h hVar = new SelfieWorkflow.AbstractC3928c.c.b.h(new Function0() { // from class: fq.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26022b3(this.f22040a, renderState);
            }
        }, false, SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20148g(renderProps, c12255fM45397d, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, hVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26025c3(this.f22054a);
            }
        }, new Function0() { // from class: fq.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26028d3(this.f22061a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26030e3(this.f22068a, renderProps);
            }
        }, m26130j3(renderProps), interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final SelfieState m26118b1(@NotNull SelfieWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.m19683A(), props.getPoseConfigs(), false, CameraProperties.EnumC3397b.User, false, 163, null) : new SelfieState.ShowInstructions(null, null, null, 6, null);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m26119c1(@NotNull C12255f<SelfieState> c12255f, @Nullable InterfaceC11932a interfaceC11932a) {
        Intrinsics.checkNotNullParameter(c12255f, "<this>");
        SelfieState selfieState = (SelfieState) c12255f.m45411i();
        SelfieState backState = selfieState != null ? selfieState.getBackState() : null;
        if (interfaceC11932a != null) {
            interfaceC11932a.m44538d();
        }
        if (backState != null) {
            backState.m19298x(true);
            c12255f.m45417p(backState);
        } else if (m45395b().getValue().getBackStepEnabled()) {
            m45398e(SelfieWorkflow.AbstractC3927b.a.f16223a);
        } else {
            m45398e(SelfieWorkflow.AbstractC3927b.b.f16224a);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m26120d1(@NotNull SelfieWorkflow.Input renderProps, @NotNull SelfieState renderState) {
        SelfieWorkflow.AbstractC3928c abstractC3928cM26125g1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        InterfaceC10316j interfaceC10316jM26154f = C5776l2.m26154f(renderState);
        if (!C3965p.m20168H(renderState)) {
            m45397d().m45414m("close_camera", new f(null));
        }
        if (!m26131k3(renderProps)) {
            m45397d().m45414m("output_webrtc_error", new g(null));
        }
        boolean z10 = renderState instanceof SelfieState.Submit;
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.m20054e(renderProps.getFromStep(), interfaceC10316jM26154f);
        if (renderState instanceof SelfieState.ShowInstructions) {
            abstractC3928cM26125g1 = m26122e2(renderProps, (SelfieState.ShowInstructions) renderState);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            abstractC3928cM26125g1 = m26113R2(renderProps, (SelfieState.WaitForWebRtcSetup) renderState);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            abstractC3928cM26125g1 = m26110J2(renderProps, (SelfieState.WaitForCameraFeed) renderState);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            abstractC3928cM26125g1 = m26114X1(renderProps, (SelfieState.RestartCamera) renderState);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            abstractC3928cM26125g1 = m26129j2(renderProps, (SelfieState.ShowPoseHint) renderState);
        } else if (renderState instanceof SelfieState.StartCapture) {
            abstractC3928cM26125g1 = m26133o2(renderProps, (SelfieState.StartCapture) renderState);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            abstractC3928cM26125g1 = m26135w2(renderProps, (SelfieState.StartCaptureFaceDetected) renderState);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            abstractC3928cM26125g1 = m26107A1(renderProps, (SelfieState.CountdownToCapture) renderState);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            abstractC3928cM26125g1 = m26109F1(renderProps, (SelfieState.CountdownToManualCapture) renderState);
        } else if (renderState instanceof SelfieState.Capture) {
            abstractC3928cM26125g1 = m26132o1(renderProps, (SelfieState.Capture) renderState);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            abstractC3928cM26125g1 = m26134v1(renderProps, (SelfieState.CaptureTransition) renderState);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            abstractC3928cM26125g1 = m26111Q1(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, m45397d());
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            abstractC3928cM26125g1 = m26112R1(renderProps, (SelfieState.FinalizeWebRtc) renderState);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            abstractC3928cM26125g1 = m26117a3(renderProps, (SelfieState.WebRtcFinished) renderState);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            abstractC3928cM26125g1 = m26116Z1(renderProps, (SelfieState.ReviewCaptures) renderState);
        } else if (z10) {
            abstractC3928cM26125g1 = m26108C2(renderProps, (SelfieState.Submit) renderState);
        } else {
            if (!(renderState instanceof SelfieState.AcquireNextPose)) {
                throw new C7345l();
            }
            abstractC3928cM26125g1 = m26125g1(renderProps, (SelfieState.AcquireNextPose) renderState);
        }
        m45396c().setValue(abstractC3928cM26125g1);
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m26121e1(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        Boolean boolValueOf = interfaceC11932a != null ? Boolean.valueOf(interfaceC11932a.m44537c()) : null;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        Object objM20262i = videoCaptureConfig.m20262i(boolValueOf, interfaceC11932a2 != null ? Boolean.valueOf(interfaceC11932a2.m44541g()) : null, this.applicationContext);
        if (C7347n.m30463e(objM20262i) == null) {
            return ((Boolean) objM20262i).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e2 */
    public final SelfieWorkflow.AbstractC3928c.b m26122e2(final SelfieWorkflow.Input renderProps, final SelfieState.ShowInstructions renderState) {
        RemoteImage selfiePictograph = null;
        if (renderState.getErrorMessage() != null) {
            m45397d().m45414m("toast_message_timeout", new o(null));
        }
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        SelfieType selfieType = renderProps.getSelfieType();
        if (Intrinsics.m31980c(selfieType, SelfieType.CenterOnly.f16125a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.m31980c(selfieType, SelfieType.ThreePhotos.f16127a) && !Intrinsics.m31980c(selfieType, SelfieType.ConfigurablePoses.f16126a)) {
                throw new C7345l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new SelfieWorkflow.AbstractC3928c.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, navigationStateM44528b, renderProps.getSelfieType(), renderProps.m19683A(), renderProps.getStrings().getPromptPageNavBarTitle(), renderState.getErrorMessage(), new Function0() { // from class: fq.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26039h2(this.f22049a, renderProps, renderState);
            }
        }, new Function0() { // from class: fq.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26043i2(this.f22055a);
            }
        }, new Function0() { // from class: fq.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26032f2(this.f22062a);
            }
        }, new Function0() { // from class: fq.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26035g2(this.f22070a, renderState);
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
    /* JADX INFO: renamed from: f1 */
    public final <T extends SelfieState & InterfaceC3939a> SelfieState m26123f1(C12255f<SelfieState> c12255f, T t8, Selfie selfie) {
        SelfieState selfieStateM26153e;
        long j10;
        if (selfie != null) {
            this.selfieEventLogger.m20055f(t8, selfie);
        }
        String fileUploadUrl = m45395b().getValue().getFileUploadUrl();
        if (fileUploadUrl != null && (selfie instanceof Selfie.SelfieImage)) {
            this.directFileUploader.m19994j(((Selfie.SelfieImage) selfie).getAbsoluteFilePath(), fileUploadUrl);
        }
        List<Selfie> listX0 = selfie != null ? CollectionsKt.m31726x0(t8.mo19297w(), selfie) : t8.mo19297w();
        List<PoseInfo> listY = selfie != null ? CollectionsKt.m31701Y(t8.mo19302g(), 1) : t8.mo19302g();
        if (m45395b().getValue().getUsePerPoseReveal()) {
            this.selfiePoseManager.m22916n(listX0.size() + 1);
        }
        if (m45395b().getValue().getUsePerPoseReveal() && selfie != null) {
            T t10 = t8;
            if (!((PoseInfo) CollectionsKt.m31706d0(t10.mo19302g())).getIsLast()) {
                T t11 = t8;
                selfieStateM26153e = new SelfieState.AcquireNextPose(t10.getCameraProperties(), t10.getStartSelfieTimestamp(), listX0, t8.getBackState(), t8.getCameraFacingMode(), t11.getIsFlashEnabled(), listY, t11.getPoseConfigs(), t11.getAutoCaptureSupported());
            } else if (listY.isEmpty()) {
                if (m26130j3(m45395b().getValue()) == EnumC8598a.Upload) {
                    if (m45395b().getValue().getDesignVersion() == EnumC13272a.K0000) {
                        j10 = 0;
                    } else {
                        j10 = 3000;
                    }
                    T t12 = t8;
                    selfieStateM26153e = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
                } else if (m26130j3(m45395b().getValue()) == EnumC8598a.Stream) {
                    T t13 = t8;
                    selfieStateM26153e = new SelfieState.FinalizeWebRtc(listX0, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
                } else {
                    T t14 = t8;
                    selfieStateM26153e = C5776l2.m26153e(c12255f, m45395b().getValue().getPoseConfigs(), listX0, null, t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t8.getBackState());
                }
            } else if (((PoseInfo) CollectionsKt.m31706d0(listY)).getPose() == EnumC7638a.Center) {
                T t15 = t8;
                selfieStateM26153e = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t15.getStartSelfieTimestamp(), t15.getCameraProperties(), t8.getBackState(), m45395b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t16 = t8;
                selfieStateM26153e = new SelfieState.ShowPoseHint(listX0, listY, t16.getAutoCaptureSupported(), t16.getCameraProperties(), t16.getStartSelfieTimestamp(), t8.getBackState(), m45395b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (listY.isEmpty()) {
            if (((PoseInfo) CollectionsKt.m31706d0(listY)).getPose() == EnumC7638a.Center) {
                T t17 = t8;
                selfieStateM26153e = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t17.getStartSelfieTimestamp(), t17.getCameraProperties(), t8.getBackState(), m45395b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t18 = t8;
                selfieStateM26153e = new SelfieState.ShowPoseHint(listX0, listY, t18.getAutoCaptureSupported(), t18.getCameraProperties(), t18.getStartSelfieTimestamp(), t8.getBackState(), m45395b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (m26130j3(m45395b().getValue()) == EnumC8598a.Upload) {
            if (m45395b().getValue().getDesignVersion() == EnumC13272a.K0000) {
                j10 = 0;
            } else {
                j10 = 3000;
            }
            T t19 = t8;
            selfieStateM26153e = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t19.getCameraProperties(), t19.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
        } else if (m26130j3(m45395b().getValue()) == EnumC8598a.Stream) {
            T t110 = t8;
            selfieStateM26153e = new SelfieState.FinalizeWebRtc(listX0, t110.getCameraProperties(), t110.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
        } else {
            T t111 = t8;
            selfieStateM26153e = C5776l2.m26153e(c12255f, m45395b().getValue().getPoseConfigs(), listX0, null, t111.getCameraProperties(), t111.getStartSelfieTimestamp(), t8.getBackState());
        }
        SelfieState selfieState = selfieStateM26153e;
        return selfie == null ? selfieState : new SelfieState.CaptureTransition(selfieState, t8.mo19304j(), t8.getBackState(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
    }

    /* JADX INFO: renamed from: f3 */
    public final void m26124f3() {
        C7758y c7758y = new C7758y();
        c7758y.f29445a = true;
        m45397d().m45414m("check_if_manual_capture_enabled", new p(c7758y, this, null));
    }

    /* JADX INFO: renamed from: g1 */
    public final SelfieWorkflow.AbstractC3928c m26125g1(final SelfieWorkflow.Input renderProps, SelfieState.AcquireNextPose renderState) {
        int size = renderState.mo19297w().size();
        m45397d().m45414m("fetch_pose_" + size, new h(size, null));
        return new SelfieWorkflow.AbstractC3928c.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.C14139a(SelfieWorkflow.AbstractC3928c.a.b.CLEAR, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: fq.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C5772k2.m26038h1((EnumC7638a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: fq.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m26042i1(this.f21999a, (Throwable) obj);
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: fq.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26046j1(this.f22006a);
            }
        }, new Function0() { // from class: fq.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26049k1(this.f22010a);
            }
        }, m26018a1(this, m45397d(), false, 1, null), new Function0() { // from class: fq.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26053l1(this.f22017a, renderProps);
            }
        }, m26130j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: fq.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m26057m1(this.f22026a, (CameraProperties.EnumC3397b) obj);
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, false, new Function1() { // from class: fq.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m26061n1(((Boolean) obj).booleanValue());
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m26126g3(Throwable error) {
        String message;
        String message2 = error.getMessage();
        if (message2 != null && StringsKt.m32152a0(message2, "ENOSPC", false, 2, null)) {
            m26127h3(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(error instanceof C5891h1)) {
            if (error instanceof InternalErrorException) {
                m26127h3(new SelfieWorkflow.AbstractC3927b.Error(((InternalErrorException) error).getErrorInfo()));
                return;
            }
            m26127h3(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = error.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.m32152a0(message, "ENOSPC", false, 2, null)) {
            m26127h3(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        m26127h3(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
    }

    /* JADX INFO: renamed from: h3 */
    public final void m26127h3(SelfieWorkflow.AbstractC3927b output) {
        InterfaceC11932a interfaceC11932a;
        if (((output instanceof SelfieWorkflow.AbstractC3927b.d) || (output instanceof SelfieWorkflow.AbstractC3927b.a) || (output instanceof SelfieWorkflow.AbstractC3927b.Error) || (output instanceof SelfieWorkflow.AbstractC3927b.b)) && (interfaceC11932a = this.webRtcManager) != null) {
            interfaceC11932a.m44538d();
        }
        m45398e(output);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m26128i3() {
        m45398e(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    /* JADX INFO: renamed from: j2 */
    public final SelfieWorkflow.AbstractC3928c m26129j2(final SelfieWorkflow.Input renderProps, final SelfieState.ShowPoseHint renderState) {
        EnumC13424x enumC13424x;
        String selfieHintLookLeft;
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c;
        int i10 = e.f22096a[renderState.mo19304j().ordinal()];
        if (i10 == 1) {
            enumC13424x = EnumC13424x.Left;
        } else if (i10 == 2) {
            enumC13424x = EnumC13424x.Right;
        } else if (i10 == 3) {
            enumC13424x = EnumC13424x.Up;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new C7345l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            enumC13424x = EnumC13424x.Down;
        }
        int[] iArr = e.f22097b;
        int i11 = iArr[enumC13424x.ordinal()];
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
                throw new C7345l();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookDown();
        }
        EnumC13424x enumC13424x2 = enumC13424x;
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[enumC13424x2.ordinal()];
        if (i12 == 1) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT_HINT;
        } else if (i12 == 2) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_HINT;
        } else if (i12 == 3) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER;
        } else if (i12 == 4) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP_HINT;
        } else {
            if (i12 != 5) {
                throw new C7345l();
            }
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN_HINT;
        }
        SelfieWorkflow.AbstractC3928c.c.b.f fVar = new SelfieWorkflow.AbstractC3928c.c.b.f(new Function0() { // from class: fq.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26050k2(this.f22206a, renderState, renderProps);
            }
        }, enumC14142c, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        String str = selfieHintLookLeft;
        SelfieWorkflow.AbstractC3928c.c.AssetOverrides assetOverridesM20163C = C3965p.m20163C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        C3405e.a aVar = this.cameraXControllerFactory;
        C6434c.a aVar2 = this.camera2ControllerFactory;
        return C3964o.m20148g(renderProps, c12255fM45397d, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesM20163C, requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26054l2(this.f22215a);
            }
        }, new Function0() { // from class: fq.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26058m2(this.f22217a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26062n2(this.f22000a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, recordAudio, aVar, aVar2, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: j3 */
    public final EnumC8598a m26130j3(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        Boolean boolValueOf = interfaceC11932a != null ? Boolean.valueOf(interfaceC11932a.m44537c()) : null;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        Object objM20264k = videoCaptureConfig.m20264k(boolValueOf, interfaceC11932a2 != null ? Boolean.valueOf(interfaceC11932a2.m44541g()) : null, this.applicationContext);
        return C7347n.m30463e(objM20264k) == null ? (EnumC8598a) objM20264k : EnumC8598a.None;
    }

    /* JADX INFO: renamed from: k3 */
    public final boolean m26131k3(SelfieWorkflow.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        Boolean boolValueOf = interfaceC11932a != null ? Boolean.valueOf(interfaceC11932a.m44537c()) : null;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        Object objM20262i = videoCaptureConfig.m20262i(boolValueOf, interfaceC11932a2 != null ? Boolean.valueOf(interfaceC11932a2.m44541g()) : null, this.applicationContext);
        if (C7347n.m30463e(objM20262i) != null) {
            return false;
        }
        ((Boolean) objM20262i).getClass();
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public final SelfieWorkflow.AbstractC3928c m26132o1(final SelfieWorkflow.Input renderProps, final SelfieState.Capture renderState) {
        SelfieState.EnumC3920a flashState;
        String selfieHintCenterFace;
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c;
        SelfieWorkflow.AbstractC3928c.c.b aVar;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            m45397d().m45414m("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new i(renderState, this, renderProps, null));
        }
        final PoseInfo poseInfoMo19321p = renderState.mo19321p();
        final EnumC7638a pose = poseInfoMo19321p.getPose();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == SelfieState.EnumC3920a.Disabled ? SelfieState.EnumC3920a.Enabled : renderState.getFlashState();
        } else {
            flashState = SelfieState.EnumC3920a.Disabled;
        }
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            m45397d().m45415n(this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), flashState == SelfieState.EnumC3920a.Disabled || flashState == SelfieState.EnumC3920a.ReadyToCapture), new Function1() { // from class: fq.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m26067p1(this.f22024a, renderState, (C3953e.c) obj);
                }
            });
        }
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        if (pose == EnumC7638a.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (pose == EnumC7638a.Right) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        } else if (renderState.getSelfieError() != null) {
            selfieHintCenterFace = strM20116b;
        } else {
            selfieHintCenterFace = pose == EnumC7638a.Center ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        }
        int i10 = e.f22096a[pose.ordinal()];
        if (i10 == 1) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP;
        } else if (i10 == 4) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new C7345l();
            }
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER;
        }
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c2 = enumC14142c;
        if (!renderState.mo19320o() || flashState == SelfieState.EnumC3920a.FlashOn || flashState == SelfieState.EnumC3920a.ReadyToCapture) {
            aVar = new SelfieWorkflow.AbstractC3928c.c.b.a(enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        } else {
            aVar = new SelfieWorkflow.AbstractC3928c.c.b.d(new Function1() { // from class: fq.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m26071q1(poseInfoMo19321p, pose, this, renderState, (String) obj);
                }
            }, new Function1() { // from class: fq.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m26075r1(this.f22039a, (Throwable) obj);
                }
            }, false, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false, 4, null);
        }
        if (!renderState.mo19320o()) {
            m26124f3();
        }
        SelfieState.EnumC3920a enumC3920a = SelfieState.EnumC3920a.FlashOn;
        if (flashState == enumC3920a) {
            m45397d().m45414m("wait_to_capture_with_flash_on", new j(null));
        }
        SelfieState.EnumC3920a enumC3920a2 = SelfieState.EnumC3920a.ReadyToCapture;
        if (flashState == enumC3920a2) {
            m45397d().m45414m("turn_off_flash", new k(null));
        }
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String str = selfieHintCenterFace;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        SelfieWorkflow.AbstractC3928c.c.AssetOverrides assetOverridesM20163C = C3965p.m20163C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        C3405e.a aVar2 = this.cameraXControllerFactory;
        C6434c.a aVar3 = this.camera2ControllerFactory;
        return C3964o.m20148g(renderProps, c12255fM45397d, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, strM20116b, renderState.getAutoCaptureSupported(), aVar, assetOverridesM20163C, requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26079s1(this.f22047a);
            }
        }, new Function0() { // from class: fq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26083t1(this.f22053a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26087u1(this.f22059a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, recordAudio, aVar2, aVar3, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : renderState.getFlashState() == enumC3920a || renderState.getFlashState() == enumC3920a2, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : m26130j3(renderProps) == EnumC8598a.Upload, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: o2 */
    public final SelfieWorkflow.AbstractC3928c m26133o2(final SelfieWorkflow.Input renderProps, final SelfieState.StartCapture renderState) {
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c;
        Object obj;
        SelfieWorkflow.AbstractC3928c.c.b aVar;
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            m45397d().m45415n(this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), false), new Function1() { // from class: fq.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C5772k2.m26068p2(this.f22134a, renderState, renderProps, (C3953e.c) obj2);
                }
            });
        }
        final PoseInfo poseInfoMo19321p = renderState.mo19321p();
        boolean zMo19320o = renderState.mo19320o();
        if (!zMo19320o) {
            m26124f3();
        }
        int i10 = e.f22096a[poseInfoMo19321p.getPose().ordinal()];
        if (i10 == 1) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP;
        } else if (i10 == 4) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new C7345l();
            }
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER;
        }
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c2 = enumC14142c;
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        String selfieHintTakePhoto = strM20116b == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strM20116b;
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!zMo19320o) {
            obj = null;
            aVar = new SelfieWorkflow.AbstractC3928c.c.b.a(enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        } else if (m26121e1(renderProps)) {
            aVar = new SelfieWorkflow.AbstractC3928c.c.b.e(new Function0() { // from class: fq.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5772k2.m26072q2(this.f22139a, renderState, renderProps);
                }
            }, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: fq.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C5772k2.m26076r2(poseInfoMo19321p, this, renderState, (String) obj2);
                }
            };
            obj = null;
            aVar = new SelfieWorkflow.AbstractC3928c.c.b.d(function1, new Function1() { // from class: fq.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C5772k2.m26080s2(this.f22165a, (Throwable) obj2);
                }
            }, false, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, obj);
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20148g(renderProps, c12255fM45397d, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintTakePhoto, strM20116b, renderState.getAutoCaptureSupported(), aVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26084t2(this.f22171a);
            }
        }, new Function0() { // from class: fq.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26088u2(this.f22176a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26091v2(this.f22179a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: v1 */
    public final SelfieWorkflow.AbstractC3928c m26134v1(final SelfieWorkflow.Input renderProps, SelfieState.CaptureTransition renderState) {
        SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c;
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE_WITH_CAPTURE;
        } else {
            int i10 = e.f22096a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT_COMPLETE;
            } else if (i10 == 2) {
                enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_COMPLETE;
            } else if (i10 == 3) {
                enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP_COMPLETE;
            } else if (i10 == 4) {
                enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN_COMPLETE;
            } else {
                if (i10 != 5) {
                    throw new C7345l();
                }
                enumC14142c = SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER_COMPLETE;
            }
        }
        return C3964o.m20148g(renderProps, c12255fM45397d, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, new SelfieWorkflow.AbstractC3928c.c.b.h(new Function0() { // from class: fq.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26094w1(this.f22189a);
            }
        }, true, enumC14142c, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a)), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: fq.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26097x1(this.f22195a);
            }
        }, new Function0() { // from class: fq.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26101y1(this.f22198a);
            }
        }, m26018a1(this, m45397d(), false, 1, null), new Function0() { // from class: fq.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26105z1(this.f22201a, renderProps);
            }
        }, m26130j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: w2 */
    public final SelfieWorkflow.AbstractC3928c m26135w2(final SelfieWorkflow.Input renderProps, final SelfieState.StartCaptureFaceDetected renderState) {
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            m45397d().m45415n(this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), false), new Function1() { // from class: fq.s1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5772k2.m26098x2(this.f22184a, renderState, renderProps, (C3953e.c) obj);
                }
            });
        }
        m45397d().m45415n(new TimerWorker(1000L), new Function1() { // from class: fq.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5772k2.m26102y2(this.f22190a, renderProps, (Unit) obj);
            }
        });
        C12255f<SelfieState> c12255fM45397d = m45397d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        SelfieWorkflow.AbstractC3928c.c.b.a aVar = new SelfieWorkflow.AbstractC3928c.c.b.a(SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M26018a1 = m26018a1(this, m45397d(), false, 1, null);
        EnumC8598a enumC8598aM26130j3 = m26130j3(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        SelfieWorkflow.AbstractC3928c.c.AssetOverrides assetOverridesM20163C = C3965p.m20163C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        C3405e.a aVar2 = this.cameraXControllerFactory;
        C6434c.a aVar3 = this.camera2ControllerFactory;
        return C3964o.m20148g(renderProps, c12255fM45397d, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesM20163C, requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: fq.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m26106z2(this.f22196a);
            }
        }, new Function0() { // from class: fq.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25925A2(this.f22199a);
            }
        }, function1M26018a1, new Function0() { // from class: fq.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5772k2.m25929B2(this.f22203a, renderProps);
            }
        }, enumC8598aM26130j3, interfaceC11932a, recordAudio, aVar2, aVar3, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }
}
