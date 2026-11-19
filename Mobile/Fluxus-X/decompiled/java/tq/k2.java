package tq;

import android.content.Context;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import ls.TimerWorker;
import mq.j6;
import mq.q5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002:\u0004¯\u0001°\u0001B\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020NH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020W2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020dH\u0002¢\u0006\u0004\be\u0010fJ9\u0010m\u001a\u00020\u0004\"\f\b\u0000\u0010h*\u00020\u0004*\u00020g*\b\u0012\u0004\u0012\u00020\u00040i2\u0006\u0010j\u001a\u00028\u00002\b\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020^H\u0002¢\u0006\u0004\bo\u0010`J\u0017\u0010q\u001a\u00020^2\u0006\u0010p\u001a\u00020\u0005H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020^2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\u0003¢\u0006\u0004\bx\u0010yJ\u001d\u0010z\u001a\u00020^2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{J-\u0010~\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020|2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040iH\u0000¢\u0006\u0004\b~\u0010\u007fJ(\u0010\u0082\u0001\u001a\u00020^*\b\u0012\u0004\u0012\u00020\u00040i2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J9\u0010\u0087\u0001\u001a\u0014\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020^0\u0085\u0001j\u0003`\u0086\u0001*\b\u0012\u0004\u0012\u00020\u00040i2\t\b\u0002\u0010\u0084\u0001\u001a\u00020WH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001¨\u0006±\u0001"}, d2 = {"Ltq/k2;", BuildConfig.FLAVOR, "Lls/d;", "Lmq/q5$b;", "Lmq/y0;", "Lmq/q5$c;", "Lmq/q5$d;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lqq/c$a;", "submitVerificationWorker", "Ljs/b$a;", "webRtcWorkerFactory", "Lmq/c0$b;", "selfieAnalyzeWorker", "Lhq/i$a;", "permissionRequestWorkerFactory", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lyn/a;", "cameraStatsManager", "Lir/b;", "navigationStateManager", "Lpq/a;", "directFileUploader", "Lav/p0;", "coroutineScope", "Lrq/b$b;", "selfiePoseManagerFactory", "Lmq/f0;", "selfieEventLogger", "Lto/e;", "featureFlagManager", "Ler/c;", "sdkFilesManager", "<init>", "(Lmq/q5$b;Landroidx/lifecycle/l0;Landroid/content/Context;Lqq/c$a;Ljs/b$a;Lmq/c0$b;Lhq/i$a;Lsn/a0$a;Lun/c$a;Lyn/a;Lir/b;Lpq/a;Lav/p0;Lrq/b$b;Lmq/f0;Lto/e;Ler/c;)V", "renderProps", "Lmq/y0$a;", "renderState", "g1", "(Lmq/q5$b;Lmq/y0$a;)Lmq/q5$d;", "Lmq/y0$k;", "Lmq/q5$d$b;", "e2", "(Lmq/q5$b;Lmq/y0$k;)Lmq/q5$d$b;", "Lmq/y0$p;", "J2", "(Lmq/q5$b;Lmq/y0$p;)Lmq/q5$d;", "Lmq/y0$i;", "X1", "(Lmq/q5$b;Lmq/y0$i;)Lmq/q5$d;", "Lmq/y0$q;", "R2", "(Lmq/q5$b;Lmq/y0$q;)Lmq/q5$d;", "Lmq/y0$l;", "j2", "(Lmq/q5$b;Lmq/y0$l;)Lmq/q5$d;", "Lmq/y0$m;", "o2", "(Lmq/q5$b;Lmq/y0$m;)Lmq/q5$d;", "Lmq/y0$n;", "w2", "(Lmq/q5$b;Lmq/y0$n;)Lmq/q5$d;", "Lmq/y0$d;", "A1", "(Lmq/q5$b;Lmq/y0$d;)Lmq/q5$d;", "Lmq/y0$e;", "F1", "(Lmq/q5$b;Lmq/y0$e;)Lmq/q5$d;", "Lmq/y0$b;", "o1", "(Lmq/q5$b;Lmq/y0$b;)Lmq/q5$d;", "Lmq/y0$c;", "v1", "(Lmq/q5$b;Lmq/y0$c;)Lmq/q5$d;", "Lmq/y0$g;", "R1", "(Lmq/q5$b;Lmq/y0$g;)Lmq/q5$d;", "Lmq/y0$r;", "a3", "(Lmq/q5$b;Lmq/y0$r;)Lmq/q5$d;", BuildConfig.FLAVOR, "k3", "(Lmq/q5$b;)Z", "e1", "Lzn/a;", "j3", "(Lmq/q5$b;)Lzn/a;", BuildConfig.FLAVOR, "i3", "()V", "Lmq/y0$j;", "Z1", "(Lmq/q5$b;Lmq/y0$j;)Lmq/q5$d;", "Lmq/y0$o;", "C2", "(Lmq/q5$b;Lmq/y0$o;)Lmq/q5$d;", "Lmq/a;", "T", "Lls/g;", "currentState", "Lmq/b0;", "capturedSelfie", "f1", "(Lls/g;Lmq/y0;Lmq/b0;)Lmq/y0;", "f3", "output", "h3", "(Lmq/q5$c;)V", BuildConfig.FLAVOR, "error", "g3", "(Ljava/lang/Throwable;)V", "props", "b1", "(Lmq/q5$b;)Lmq/y0;", "d1", "(Lmq/q5$b;Lmq/y0;)V", "Lmq/y0$f;", "workflowContext", "Q1", "(Lmq/q5$b;Lmq/y0$f;Lls/g;)Lmq/q5$d;", "Lks/a;", "webRtcManagerBridge", "c1", "(Lls/g;Lks/a;)V", "inRecoverableState", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "Z0", "(Lls/g;Z)Lkotlin/jvm/functions/Function1;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lqq/c$a;", "h", "Ljs/b$a;", "i", "Lmq/c0$b;", "j", "Lhq/i$a;", "k", "Lsn/a0$a;", "l", "Lun/c$a;", "m", "Lyn/a;", "n", "Lir/b;", "o", "Lpq/a;", "p", "Lrq/b$b;", "q", "Lmq/f0;", "r", "Lto/e;", "s", "Ler/c;", "t", "Lks/a;", "webRtcManager", "Lrq/b;", "u", "Lrq/b;", "selfiePoseManager", "v", "c", "d", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k2 extends ls.d<q5.Input, mq.y0, q5.c, q5.d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c.a submitVerificationWorker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final js.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mq.c0.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hq.i.a permissionRequestWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.a0.a cameraXControllerFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.a directFileUploader;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rq.b.InterfaceC0610b selfiePoseManagerFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mq.f0 selfieEventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ks.a webRtcManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rq.b selfiePoseManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$1$1", f = "SelfieStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32726t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ mq.y0 f32728v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mq.y0 y0Var, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f32728v = y0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return k2.this.new a(this.f32728v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32726t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            k2 k2Var = k2.this;
            k2Var.d1(k2Var.b().getValue(), this.f32728v);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$2", f = "SelfieStepStateManager.kt", l = {173}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32729t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k2 f32731a;

            public a(k2 k2Var) {
                this.f32731a = k2Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(q5.Input input, eu.b<? super Unit> bVar) {
                k2 k2Var = this.f32731a;
                mq.y0 y0Var = (mq.y0) k2Var.d().i();
                if (y0Var == null) {
                    return Unit.f21506a;
                }
                k2Var.d1(input, y0Var);
                return Unit.f21506a;
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return k2.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32729t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<q5.Input> c0VarB = k2.this.b();
                a aVar = new a(k2.this);
                this.f32729t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ltq/k2$d;", BuildConfig.FLAVOR, "Lmq/q5$b;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Ltq/k2;", "a", "(Lmq/q5$b;Landroidx/lifecycle/l0;)Ltq/k2;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        @NotNull
        k2 a(@NotNull q5.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32732a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[xn.a.values().length];
            try {
                iArr[xn.a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn.a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xn.a.Up.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xn.a.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xn.a.Center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f32732a = iArr;
            int[] iArr2 = new int[mq.h0.values().length];
            try {
                iArr2[mq.h0.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[mq.h0.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[mq.h0.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[mq.h0.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[mq.h0.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$1", f = "SelfieStepStateManager.kt", l = {MlKitException.CODE_SCANNER_CANCELLED}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32733t;

        public f(eu.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new f(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32733t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.m mVar = sn.m.f31643a;
                Context context = k2.this.applicationContext;
                this.f32733t = 1;
                if (mVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ks.a aVar = k2.this.webRtcManager;
            if (aVar != null) {
                aVar.e();
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$handleState$2", f = "SelfieStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32735t;

        public g(eu.b<? super g> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new g(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32735t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            k2.this.i3();
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderAcquireNextPose$1", f = "SelfieStepStateManager.kt", l = {270}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32737t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f32739v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, eu.b<? super h> bVar) {
            super(1, bVar);
            this.f32739v = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new h(this.f32739v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objE = fu.c.e();
            int i10 = this.f32737t;
            if (i10 == 0) {
                zt.o.b(obj);
                rq.b bVar = k2.this.selfiePoseManager;
                int i11 = this.f32739v;
                this.f32737t = 1;
                Object objK = bVar.k(i11, this);
                if (objK == objE) {
                    return objE;
                }
                value = objK;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                value = ((zt.n) obj).getValue();
            }
            k2 k2Var = k2.this;
            if (zt.n.h(value)) {
                PoseInfo poseInfo = (PoseInfo) value;
                ls.h hVarI = k2Var.d().i();
                mq.y0.AcquireNextPose acquireNextPose = hVarI instanceof mq.y0.AcquireNextPose ? (mq.y0.AcquireNextPose) hVarI : null;
                if (acquireNextPose != null) {
                    k2Var.d().p(k2Var.f1(k2Var.d(), mq.y0.AcquireNextPose.z(acquireNextPose, null, 0L, null, null, null, false, p001kotlin.collections.o.d(poseInfo), null, false, 447, null), null));
                }
            }
            k2 k2Var2 = k2.this;
            Throwable thE = zt.n.e(value);
            if (thE != null) {
                k2Var2.g3(thE);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$1", f = "SelfieStepStateManager.kt", l = {1368, 1376}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f32740t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32741u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f32742v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ mq.y0.Capture f32743w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ k2 f32744x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ q5.Input f32745y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(mq.y0.Capture capture, k2 k2Var, q5.Input input, eu.b<? super i> bVar) {
            super(1, bVar);
            this.f32743w = capture;
            this.f32744x = k2Var;
            this.f32745y = input;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new i(this.f32743w, this.f32744x, this.f32745y, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            long j10;
            mq.y0.Capture capture;
            Object objE = fu.c.e();
            int i10 = this.f32742v;
            if (i10 == 0) {
                zt.o.b(obj);
                long jLongValue = this.f32743w.getCaptureDeadlineEpochMs().longValue() - System.currentTimeMillis();
                p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                long jQ = p001kotlin.time.b.q(jLongValue, zu.b.MILLISECONDS);
                this.f32740t = jLongValue;
                this.f32742v = 1;
                if (av.z0.c(jQ, this) != objE) {
                    j10 = jLongValue;
                }
                return objE;
            }
            if (i10 == 1) {
                j10 = this.f32740t;
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                capture = (mq.y0.Capture) this.f32741u;
                zt.o.b(obj);
            }
            this.f32744x.selfieEventLogger.n();
            if (this.f32744x.b().getValue().getSkipPromptPage()) {
                this.f32744x.d().p(new mq.y0.AcquireNextPose(capture.getCameraProperties(), capture.getStartSelfieTimestamp(), p001kotlin.collections.p.k(), l2.a(this.f32744x.d(), false), capture.getCameraFacingMode(), capture.getIsFlashEnabled(), this.f32743w.i(), this.f32745y.getPoseConfigs(), capture.getAutoCaptureSupported()));
            } else {
                this.f32744x.d().p(new mq.y0.ShowInstructions(null, null, this.f32745y.getStrings().getSelfieHintPoseTimeout(), 2, null));
            }
            return Unit.f21506a;
            ls.h hVarI = this.f32744x.d().i();
            mq.y0.Capture capture2 = hVarI instanceof mq.y0.Capture ? (mq.y0.Capture) hVarI : null;
            if (capture2 != null && Intrinsics.c(capture2.getCaptureDeadlineEpochMs(), this.f32743w.getCaptureDeadlineEpochMs())) {
                l2.c(capture2);
                rq.b bVar = this.f32744x.selfiePoseManager;
                this.f32741u = capture2;
                this.f32740t = j10;
                this.f32742v = 2;
                if (bVar.o(this) != objE) {
                    capture = capture2;
                    this.f32744x.selfieEventLogger.n();
                    if (this.f32744x.b().getValue().getSkipPromptPage()) {
                        this.f32744x.d().p(new mq.y0.AcquireNextPose(capture.getCameraProperties(), capture.getStartSelfieTimestamp(), p001kotlin.collections.p.k(), l2.a(this.f32744x.d(), false), capture.getCameraFacingMode(), capture.getIsFlashEnabled(), this.f32743w.i(), this.f32745y.getPoseConfigs(), capture.getAutoCaptureSupported()));
                    } else {
                        this.f32744x.d().p(new mq.y0.ShowInstructions(null, null, this.f32745y.getStrings().getSelfieHintPoseTimeout(), 2, null));
                    }
                    return Unit.f21506a;
                }
                return objE;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$3", f = "SelfieStepStateManager.kt", l = {1533}, m = "invokeSuspend")
    public static final class j extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32746t;

        public j(eu.b<? super j> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new j(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32746t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f32746t = 1;
                if (av.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = k2.this.d().i();
            mq.y0.Capture capture = hVarI instanceof mq.y0.Capture ? (mq.y0.Capture) hVarI : null;
            if (capture == null) {
                return Unit.f21506a;
            }
            k2.this.d().p(capture.y((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : mq.y0.h.ReadyToCapture, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$4", f = "SelfieStepStateManager.kt", l = {1545}, m = "invokeSuspend")
    public static final class k extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32748t;

        public k(eu.b<? super k> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new k(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32748t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f32748t = 1;
                if (av.z0.b(3000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = k2.this.d().i();
            mq.y0.Capture capture = hVarI instanceof mq.y0.Capture ? (mq.y0.Capture) hVarI : null;
            if (capture == null) {
                return Unit.f21506a;
            }
            k2.this.d().p(capture.y((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : mq.y0.h.Enabled, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToCapture$2", f = "SelfieStepStateManager.kt", l = {1180}, m = "invokeSuspend")
    public static final class l extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f32750t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32751u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5.Input f32752v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k2 f32753w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ mq.y0.CountdownToCapture f32754x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(q5.Input input, k2 k2Var, mq.y0.CountdownToCapture countdownToCapture, eu.b<? super l> bVar) {
            super(1, bVar);
            this.f32752v = input;
            this.f32753w = k2Var;
            this.f32754x = countdownToCapture;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new l(this.f32752v, this.f32753w, this.f32754x, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            long j10;
            Object objE = fu.c.e();
            int i10 = this.f32751u;
            if (i10 == 0) {
                zt.o.b(obj);
                long jA = mq.b1.a(this.f32752v);
                this.f32750t = jA;
                this.f32751u = 1;
                if (av.z0.b(jA, this) == objE) {
                    return objE;
                }
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f32750t;
                zt.o.b(obj);
            }
            ls.h hVarI = this.f32753w.d().i();
            mq.y0.CountdownToCapture countdownToCapture = hVarI instanceof mq.y0.CountdownToCapture ? (mq.y0.CountdownToCapture) hVarI : null;
            if (countdownToCapture == null) {
                return Unit.f21506a;
            }
            int countDown = countdownToCapture.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                this.f32753w.d().p(new mq.y0.Capture(countdownToCapture.getSelfieError(), this.f32754x.getPoseScore(), this.f32754x.getBrightnessInfo(), null, countdownToCapture.i(), countdownToCapture.getStartCaptureTimestamp(), false, this.f32754x.getStartSelfieTimestamp(), countdownToCapture.getCameraProperties(), l2.a(this.f32753w.d(), false), this.f32752v.getPoseConfigs(), this.f32754x.getCameraFacingMode(), this.f32754x.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24648, null));
            } else {
                this.f32753w.d().p(countdownToCapture.y((32764 & 1) != 0 ? countdownToCapture.countDown : countDown - 1, (32764 & 2) != 0 ? countdownToCapture.selfieError : countdownToCapture.getSelfieError(), (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & Barcode.FORMAT_ITF) != 0 ? countdownToCapture.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : false, (32764 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false));
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToManualCapture$1", f = "SelfieStepStateManager.kt", l = {1275}, m = "invokeSuspend")
    public static final class m extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32755t;

        public m(eu.b<? super m> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new m(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32755t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f32755t = 1;
                if (av.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = k2.this.d().i();
            mq.y0.CountdownToManualCapture countdownToManualCapture = hVarI instanceof mq.y0.CountdownToManualCapture ? (mq.y0.CountdownToManualCapture) hVarI : null;
            if (countdownToManualCapture == null) {
                return Unit.f21506a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                k2.this.d().p(countdownToManualCapture.y((4092 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & Barcode.FORMAT_ITF) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : false, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false));
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderFinalizeVideoCapture$1", f = "SelfieStepStateManager.kt", l = {1995}, m = "invokeSuspend")
    public static final class n extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32757t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ mq.y0.FinalizeLocalVideoCapture f32758u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ls.g<mq.y0> f32759v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(mq.y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture, ls.g<mq.y0> gVar, eu.b<? super n> bVar) {
            super(1, bVar);
            this.f32758u = finalizeLocalVideoCapture;
            this.f32759v = gVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new n(this.f32758u, this.f32759v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32757t;
            if (i10 == 0) {
                zt.o.b(obj);
                long minDurationMs = this.f32758u.getMinDurationMs();
                this.f32757t = 1;
                if (av.z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = this.f32759v.i();
            mq.y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = hVarI instanceof mq.y0.FinalizeLocalVideoCapture ? (mq.y0.FinalizeLocalVideoCapture) hVarI : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.f21506a;
            }
            this.f32759v.p(mq.y0.FinalizeLocalVideoCapture.z(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, 251, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderShowInstructions$1", f = "SelfieStepStateManager.kt", l = {373}, m = "invokeSuspend")
    public static final class o extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32760t;

        public o(eu.b<? super o> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return k2.this.new o(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f32760t;
            if (i10 == 0) {
                zt.o.b(obj);
                p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                long jP = p001kotlin.time.b.p(3, zu.b.SECONDS);
                this.f32760t = 1;
                if (av.z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = k2.this.d().i();
            mq.y0.ShowInstructions showInstructions = hVarI instanceof mq.y0.ShowInstructions ? (mq.y0.ShowInstructions) hVarI : null;
            if (showInstructions == null) {
                return Unit.f21506a;
            }
            k2.this.d().p(mq.y0.ShowInstructions.z(showInstructions, null, null, null, 3, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$runManualCaptureEnabledChecker$1", f = "SelfieStepStateManager.kt", l = {2216}, m = "invokeSuspend")
    public static final class p extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32762t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.y f32763u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k2 f32764v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(p001kotlin.jvm.internal.y yVar, k2 k2Var, eu.b<? super p> bVar) {
            super(1, bVar);
            this.f32763u = yVar;
            this.f32764v = k2Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new p(this.f32763u, this.f32764v, bVar);
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
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r5.f32762t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                zt.o.b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                zt.o.b(r6)
            L1a:
                kotlin.jvm.internal.y r6 = r5.f32763u
                boolean r6 = r6.f21591a
                if (r6 == 0) goto L53
                r5.f32762t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = av.z0.b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                tq.k2 r6 = r5.f32764v
                ls.g r6 = r6.d()
                ls.h r6 = r6.i()
                mq.y0 r6 = (mq.y0) r6
                boolean r1 = r6 instanceof mq.b
                if (r1 == 0) goto L1a
                r1 = r6
                mq.b r1 = (mq.b) r1
                boolean r1 = r1.o()
                if (r1 == 0) goto L1a
                tq.k2 r1 = r5.f32764v
                ls.g r1 = r1.d()
                r1.p(r6)
                kotlin.jvm.internal.y r6 = r5.f32763u
                r1 = 0
                r6.f21591a = r1
                goto L1a
            L53:
                kotlin.Unit r6 = p001kotlin.Unit.f21506a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tq.k2.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(@NotNull q5.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull qq.c.a submitVerificationWorker, @NotNull js.b.a webRtcWorkerFactory, @NotNull mq.c0.b selfieAnalyzeWorker, @NotNull hq.i.a permissionRequestWorkerFactory, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull yn.a cameraStatsManager, @NotNull ir.b navigationStateManager, @NotNull pq.a directFileUploader, @NotNull final av.p0 coroutineScope, @NotNull rq.b.InterfaceC0610b selfiePoseManagerFactory, @NotNull mq.f0 selfieEventLogger, @NotNull to.e featureFlagManager, @NotNull er.c sdkFilesManager) {
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
        this.webRtcManager = ks.c.b();
        this.selfiePoseManager = selfiePoseManagerFactory.a(b().getValue().getInquiryId(), b().getValue().getSessionToken(), b().getValue().getFromStep(), b().getValue().B(), b().getValue().getPoseTimeoutMs());
        selfieEventLogger.o(b().getValue().getUsePerPoseReveal());
        if (d().i() == null) {
            d().p(b1(b().getValue()));
        }
        d().o(new Function1() { // from class: tq.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.Q0(coroutineScope, this, (mq.y0) obj);
            }
        });
        av.k.d(coroutineScope, av.g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit B1(k2 k2Var, mq.y0.CountdownToCapture countdownToCapture, q5.Input input, mq.c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        ls.h hVarI = k2Var.d().i();
        mq.y0.CountdownToCapture countdownToCapture2 = hVarI instanceof mq.y0.CountdownToCapture ? (mq.y0.CountdownToCapture) hVarI : null;
        if (countdownToCapture2 == null) {
            return Unit.f21506a;
        }
        if (!(output instanceof mq.c0.c.a)) {
            if (output instanceof mq.c0.c.b) {
                k2Var.g3(((mq.c0.c.b) output).getError());
            } else {
                if (!(output instanceof mq.c0.c.C0461c)) {
                    throw new zt.l();
                }
                k2Var.d().p(new mq.y0.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.i(), null, countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((mq.c0.c.C0461c) output).getIsDimLightConditions(), 163, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit B2(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit C1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit D1(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public static final Unit D2(k2 k2Var, boolean z10, qq.c.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof qq.c.d.b) {
            k2Var.h3(q5.c.d.f23854a);
        } else {
            if (!(it instanceof qq.c.d.Error)) {
                throw new zt.l();
            }
            ls.h hVarI = k2Var.d().i();
            mq.y0.Submit submit = hVarI instanceof mq.y0.Submit ? (mq.y0.Submit) hVarI : null;
            if (submit == null) {
                return Unit.f21506a;
            }
            if (z10) {
                qq.c.d.Error error = (qq.c.d.Error) it;
                if (j6.B(error.getCause())) {
                    k2Var.d().p(mq.y0.Submit.z(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
                } else {
                    k2Var.h3(new q5.c.Error(((qq.c.d.Error) it).getCause()));
                }
            } else {
                k2Var.h3(new q5.c.Error(((qq.c.d.Error) it).getCause()));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit E1(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit E2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit F2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit G1(PoseInfo poseInfo, xn.a aVar, k2 k2Var, mq.y0.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), countdownToManualCapture, new mq.b0.SelfieImage(absolutePath, mq.b0.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f21506a;
    }

    public static final Unit G2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit H1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f21506a;
    }

    public static final Unit H2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit I1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit I2(k2 k2Var) {
        ls.h hVarI = k2Var.d().i();
        mq.y0.Submit submit = hVarI instanceof mq.y0.Submit ? (mq.y0.Submit) hVarI : null;
        if (submit == null) {
            return Unit.f21506a;
        }
        k2Var.d().p(mq.y0.Submit.z(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f21506a;
    }

    public static final Unit J1(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit K1(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit K2(k2 k2Var, q5.Input input, mq.y0.WaitForCameraFeed waitForCameraFeed, long j10, sn.v cameraProperties) {
        Parcelable showPoseHint;
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        k2Var.selfieEventLogger.n();
        if (k2Var.j3(input) == zn.a.Stream) {
            k2Var.selfieEventLogger.k();
            k2Var.d().p(new mq.y0.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, l2.a(k2Var.d(), false), waitForCameraFeed.i(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            k2Var.selfieEventLogger.b((mq.y0) k2Var.d().i());
            xn.a pose = ((PoseInfo) CollectionsKt.d0(waitForCameraFeed.i())).getPose();
            ls.g<mq.y0> gVarD = k2Var.d();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new mq.y0.AcquireNextPose(cameraProperties, j10, p001kotlin.collections.p.k(), l2.a(k2Var.d(), false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.i(), input.getPoseConfigs(), true);
            } else if (pose == xn.a.Center) {
                showPoseHint = new mq.y0.StartCapture(false, null, 0.0f, null, waitForCameraFeed.i(), null, System.currentTimeMillis(), false, j10, cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new mq.y0.ShowPoseHint(p001kotlin.collections.p.k(), waitForCameraFeed.i(), true, cameraProperties, j10, l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            gVarD.p(showPoseHint);
        }
        return Unit.f21506a;
    }

    public static final Unit L1(ls.g gVar, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new mq.b0.SelfieVideo(absolutePath, mq.b0.a.MANUAL));
        ls.h hVarI = gVar.i();
        mq.y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = hVarI instanceof mq.y0.FinalizeLocalVideoCapture ? (mq.y0.FinalizeLocalVideoCapture) hVarI : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.f21506a;
        }
        gVar.p(mq.y0.FinalizeLocalVideoCapture.z(finalizeLocalVideoCapture, CollectionsKt.w0(finalizeLocalVideoCapture.w(), arrayList), 0L, false, true, null, 0L, null, null, 246, null));
        return Unit.f21506a;
    }

    public static final Unit L2(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a1(k2Var, k2Var.d(), false, 1, null).invoke(it);
        return Unit.f21506a;
    }

    public static final Unit M1(ls.g gVar, q5.Input input, mq.y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        ls.h hVarI = gVar.i();
        mq.y0.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = hVarI instanceof mq.y0.FinalizeLocalVideoCapture ? (mq.y0.FinalizeLocalVideoCapture) hVarI : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            gVar.p(l2.e(gVar, input.getPoseConfigs(), finalizeLocalVideoCapture2.w(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), l2.a(gVar, false)));
            return Unit.f21506a;
        }
        return Unit.f21506a;
    }

    public static final Unit M2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit N1(k2 k2Var, ls.g gVar) {
        k2Var.c1(gVar, null);
        return Unit.f21506a;
    }

    public static final Unit N2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit O1(k2 k2Var) {
        k2Var.e(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit O2(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit P1(k2 k2Var, ls.g gVar, q5.Input input) {
        l2.d(k2Var.applicationContext, gVar, input, true);
        return Unit.f21506a;
    }

    public static final Unit P2(k2 k2Var, mq.y0.WaitForCameraFeed waitForCameraFeed, q5.Input input, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == fq.s1.PermissionGranted) {
            k2Var.d().p(mq.y0.WaitForCameraFeed.z(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            k2Var.d().p(new mq.y0.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            k2Var.h3(q5.c.a.f23851a);
        } else if (it.getPermissionState().getResult() == fq.s1.SettingsLaunched) {
            k2Var.d().p(mq.y0.WaitForCameraFeed.z(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else {
            k2Var.h3(new q5.c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f21506a;
    }

    public static final Unit Q0(av.p0 p0Var, k2 k2Var, mq.y0 y0Var) {
        if (y0Var == null) {
            return Unit.f21506a;
        }
        av.k.d(p0Var, av.g1.d(), null, k2Var.new a(y0Var, null), 2, null);
        return Unit.f21506a;
    }

    public static final Unit Q2(k2 k2Var, mq.y0.WaitForCameraFeed waitForCameraFeed, q5.Input input, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPermissionState().getResult() == fq.s1.PermissionGranted) {
            k2Var.d().p(mq.y0.WaitForCameraFeed.z(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            k2Var.d().p(new mq.y0.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            k2Var.h3(q5.c.a.f23851a);
        } else if (it.getPermissionState().getResult() == fq.s1.SettingsLaunched) {
            k2Var.d().p(mq.y0.WaitForCameraFeed.z(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else {
            k2Var.h3(new q5.c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f21506a;
    }

    public static final Unit S1(k2 k2Var, q5.Input input, mq.y0.g gVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.selfieEventLogger.m(input.getFromStep());
        k2Var.d().p(new mq.y0.r(gVar.w(), it, gVar.getCameraProperties(), gVar.getStartSelfieTimestamp(), l2.a(k2Var.d(), false), gVar.getCameraFacingMode()));
        k2Var.webRtcManager.e();
        return Unit.f21506a;
    }

    public static final Unit S2(final mq.y0.WaitForWebRtcSetup waitForWebRtcSetup, final k2 k2Var, final q5.Input input, js.b.AbstractC0389b it) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof js.b.AbstractC0389b.C0390b) {
            sn.v cameraProperties = waitForWebRtcSetup.getCameraProperties();
            ks.a aVar = k2Var.webRtcManager;
            if (aVar != null) {
                aVar.b(k2Var.webRtcWorkerFactory.getService());
            }
            ks.a aVar2 = k2Var.webRtcManager;
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
            ks.a aVar3 = k2Var.webRtcManager;
            if (aVar3 != null) {
                js.b.AbstractC0389b.C0390b c0390b = (js.b.AbstractC0389b.C0390b) it;
                aVar3.f(c0390b.getResult().getUsername(), c0390b.getResult().getCredential(), c0390b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: tq.e2
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k2.T2(this.f32678a, input, waitForWebRtcSetup);
                    }
                }, new Function0() { // from class: tq.f2
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k2.U2(this.f32684a, waitForWebRtcSetup);
                    }
                }, new Function0() { // from class: tq.g2
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k2.V2(this.f32689a, input);
                    }
                }, new Function1() { // from class: tq.h2
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k2.W2(this.f32694a, (String) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof js.b.AbstractC0389b.Error)) {
                throw new zt.l();
            }
            ks.a aVar4 = k2Var.webRtcManager;
            if (aVar4 != null) {
                aVar4.a();
            }
            k2Var.d().p(new mq.y0.RestartCamera(false, false, l2.a(k2Var.d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        }
        return Unit.f21506a;
    }

    public static final Unit T1() {
        return Unit.f21506a;
    }

    public static final Unit T2(k2 k2Var, q5.Input input, mq.y0.WaitForWebRtcSetup waitForWebRtcSetup) {
        k2Var.selfieEventLogger.l(input.getFromStep());
        k2Var.selfieEventLogger.b((mq.y0) k2Var.d().i());
        k2Var.d().p(new mq.y0.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.i(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit U1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit U2(k2 k2Var, mq.y0.WaitForWebRtcSetup waitForWebRtcSetup) {
        k2Var.webRtcManager.a();
        k2Var.d().p(new mq.y0.RestartCamera(false, false, l2.a(k2Var.d(), false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f21506a;
    }

    public static final Unit V1(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit V2(k2 k2Var, q5.Input input) {
        k2Var.selfieEventLogger.j(input.getFromStep());
        return Unit.f21506a;
    }

    public static final Unit W1(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit W2(k2 k2Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        k2Var.selfieEventLogger.i(step);
        return Unit.f21506a;
    }

    public static final Unit X2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit Y0(ls.g gVar, k2 k2Var, boolean z10, Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        mq.y0 y0Var = (mq.y0) gVar.i();
        if (y0Var == null) {
            return Unit.f21506a;
        }
        if (!(cameraError instanceof sn.k)) {
            k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + cameraError.getClass().getCanonicalName())));
            return Unit.f21506a;
        }
        sn.k kVar = (sn.k) cameraError;
        if (!(kVar instanceof sn.t0)) {
            if (kVar instanceof sn.v0) {
                k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            } else if (kVar instanceof sn.p0) {
                k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
            } else if (kVar instanceof sn.a1) {
                if (z10) {
                    l2.c(y0Var);
                    if (j6.H(y0Var)) {
                        gVar.p(new mq.y0.RestartCamera(false, false, l2.a(gVar, false), y0Var.getCameraFacingMode(), 3, null));
                    }
                } else {
                    k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
                }
            } else if (kVar instanceof sn.f0) {
                k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
            } else if (kVar instanceof sn.j1) {
                k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
            } else {
                if (!(kVar instanceof sn.z0)) {
                    throw new zt.l();
                }
                if (z10) {
                    l2.c(y0Var);
                    if (j6.H(y0Var)) {
                        gVar.p(new mq.y0.RestartCamera(false, false, l2.a(gVar, false), y0Var.getCameraFacingMode(), 3, null));
                    }
                } else {
                    k2Var.e(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
                }
            }
        }
        return Unit.f21506a;
    }

    public static final Unit Y1(k2 k2Var, q5.Input input, mq.y0.RestartCamera restartCamera) {
        k2Var.d().p(new mq.y0.WaitForCameraFeed(false, false, l2.a(k2Var.d(), false), input.z(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit Y2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit Z2(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static /* synthetic */ Function1 a1(k2 k2Var, ls.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k2Var.Z0(gVar, z10);
    }

    public static final Unit a2(k2 k2Var, mq.y0.j jVar) {
        ls.h hVarI = k2Var.d().i();
        mq.y0.j jVar2 = hVarI instanceof mq.y0.j ? (mq.y0.j) hVarI : null;
        if (jVar2 == null) {
            return Unit.f21506a;
        }
        k2Var.d().p(new mq.y0.Submit(jVar2.w(), jVar2.getWebRtcObjectId(), jVar2.getCameraProperties(), jVar2.getStartSelfieTimestamp(), l2.a(k2Var.d(), true), jVar.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f21506a;
    }

    public static final Unit b2(k2 k2Var, q5.Input input, mq.y0.j jVar) {
        k2Var.d().p(new mq.y0.WaitForCameraFeed(false, false, l2.a(k2Var.d(), false), input.z(), input.getPoseConfigs(), false, jVar.getCameraFacingMode(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit b3(k2 k2Var, mq.y0.r rVar) {
        k2Var.d().p(l2.e(k2Var.d(), k2Var.b().getValue().getPoseConfigs(), rVar.w(), rVar.getWebRtcObjectId(), rVar.getCameraProperties(), rVar.getStartSelfieTimestamp(), l2.a(k2Var.d(), false)));
        return Unit.f21506a;
    }

    public static final Unit c2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit c3(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit d2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit d3(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit e3(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit f2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit g2(k2 k2Var, mq.y0.ShowInstructions showInstructions) {
        k2Var.f(mq.y0.ShowInstructions.z(showInstructions, null, null, null, 3, null));
        return Unit.f21506a;
    }

    public static final Unit h1(xn.a pose, boolean z10) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        return Unit.f21506a;
    }

    public static final Unit h2(k2 k2Var, q5.Input input, mq.y0.ShowInstructions showInstructions) {
        k2Var.selfieEventLogger.c();
        k2Var.d().p(new mq.y0.WaitForCameraFeed(false, false, l2.b(k2Var.d(), false, 1, null), input.z(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit i1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ls.h hVarI = k2Var.d().i();
        mq.y0.AcquireNextPose acquireNextPose = hVarI instanceof mq.y0.AcquireNextPose ? (mq.y0.AcquireNextPose) hVarI : null;
        if (acquireNextPose == null) {
            return Unit.f21506a;
        }
        l2.c(acquireNextPose);
        k2Var.d().p(new mq.y0.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), p001kotlin.collections.p.k(), l2.a(k2Var.d(), false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), p001kotlin.collections.p.k(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f21506a;
    }

    public static final Unit i2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit j1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit k1(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit k2(k2 k2Var, mq.y0.ShowPoseHint showPoseHint, q5.Input input) {
        ls.g<mq.y0> gVarD = k2Var.d();
        List<PoseInfo> listI = showPoseHint.i();
        gVarD.p(new mq.y0.Capture(null, 0.0f, null, showPoseHint.w(), listI, System.currentTimeMillis(), showPoseHint.getAutoCaptureSupported(), showPoseHint.getStartSelfieTimestamp(), showPoseHint.getCameraProperties(), l2.a(k2Var.d(), false), input.getPoseConfigs(), showPoseHint.getCameraFacingMode(), showPoseHint.getIsFlashEnabled(), null, k2Var.b().getValue().getUsePerPoseReveal() ? Long.valueOf(System.currentTimeMillis() + k2Var.selfiePoseManager.getPerPoseTimeoutMs()) : null, false, 8193, null));
        return Unit.f21506a;
    }

    public static final Unit l1(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit l2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit m1(k2 k2Var, sn.v.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.d().p(new mq.y0.RestartCamera(false, false, l2.a(k2Var.d(), false), it, 3, null));
        return Unit.f21506a;
    }

    public static final Unit m2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit n1(boolean z10) {
        return Unit.f21506a;
    }

    public static final Unit n2(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit p1(k2 k2Var, mq.y0.Capture capture, mq.c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        ls.h hVarI = k2Var.d().i();
        mq.y0.Capture capture2 = hVarI instanceof mq.y0.Capture ? (mq.y0.Capture) hVarI : null;
        if (capture2 == null) {
            return Unit.f21506a;
        }
        if (output instanceof mq.c0.c.a) {
            mq.c0.c.a aVar = (mq.c0.c.a) output;
            if (aVar.getSelfie() != null) {
                mq.b0 selfie = aVar.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                k2Var.selfieEventLogger.g(capture2, selfie);
                k2Var.d().p(k2Var.f1(k2Var.d(), capture, selfie));
            } else {
                k2Var.d().p(capture2.y((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : 0.0f, (57343 & 4) != 0 ? capture2.brightnessInfo : null, (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : mq.y0.h.FlashOn, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : false));
            }
        } else if (output instanceof mq.c0.c.C0461c) {
            mq.c0.c.C0461c c0461c = (mq.c0.c.C0461c) output;
            if (c0461c.getError() == xn.c.FaceDetectionUnsupported) {
                k2Var.d().p(capture2.y((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : c0461c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0461c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0461c.getIsDimLightConditions()));
            } else {
                k2Var.d().p(capture2.y((57343 & 1) != 0 ? capture2.selfieError : c0461c.getError(), (57343 & 2) != 0 ? capture2.poseScore : c0461c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0461c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0461c.getIsDimLightConditions()));
            }
        } else {
            if (!(output instanceof mq.c0.c.b)) {
                throw new zt.l();
            }
            k2Var.g3(((mq.c0.c.b) output).getError());
        }
        return Unit.f21506a;
    }

    public static final Unit p2(k2 k2Var, mq.y0.StartCapture startCapture, q5.Input input, mq.c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        ls.h hVarI = k2Var.d().i();
        mq.y0.StartCapture startCapture2 = hVarI instanceof mq.y0.StartCapture ? (mq.y0.StartCapture) hVarI : null;
        if (startCapture2 == null) {
            return Unit.f21506a;
        }
        if (output instanceof mq.c0.c.a) {
            mq.c0.c.a aVar = (mq.c0.c.a) output;
            k2Var.d().p(new mq.y0.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar.getPoseScore(), aVar.getBrightnessInfo(), startCapture.i(), startCapture.w(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar.getIsDimLightConditions()));
        } else if (output instanceof mq.c0.c.b) {
            k2Var.g3(((mq.c0.c.b) output).getError());
        } else {
            if (!(output instanceof mq.c0.c.C0461c)) {
                throw new zt.l();
            }
            mq.c0.c.C0461c c0461c = (mq.c0.c.C0461c) output;
            k2Var.d().p(c0461c.getError() == xn.c.FaceDetectionUnsupported ? startCapture2.y((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : null, (16242 & 4) != 0 ? startCapture2.poseScore : c0461c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0461c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & Barcode.FORMAT_ITF) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c0461c.getIsDimLightConditions()) : startCapture2.y((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : c0461c.getError(), (16242 & 4) != 0 ? startCapture2.poseScore : c0461c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0461c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & Barcode.FORMAT_ITF) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c0461c.getIsDimLightConditions()));
        }
        return Unit.f21506a;
    }

    public static final Unit q1(PoseInfo poseInfo, xn.a aVar, k2 k2Var, mq.y0.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), capture, new mq.b0.SelfieImage(absolutePath, mq.b0.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f21506a;
    }

    public static final Unit q2(k2 k2Var, mq.y0.StartCapture startCapture, q5.Input input) {
        ls.h hVarI = k2Var.d().i();
        mq.y0.StartCapture startCapture2 = hVarI instanceof mq.y0.StartCapture ? (mq.y0.StartCapture) hVarI : null;
        if (startCapture2 == null) {
            return Unit.f21506a;
        }
        k2Var.d().p(new mq.y0.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.i(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        k2Var.selfieEventLogger.d(startCapture2);
        return Unit.f21506a;
    }

    public static final Unit r1(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f21506a;
    }

    public static final Unit r2(PoseInfo poseInfo, k2 k2Var, mq.y0.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        k2Var.d().p(k2Var.f1(k2Var.d(), startCapture, new mq.b0.SelfieImage(absolutePath, mq.b0.a.MANUAL, poseInfo.getPose(), System.currentTimeMillis(), poseInfo.getToken())));
        return Unit.f21506a;
    }

    public static final Unit s1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit s2(k2 k2Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k2Var.g3(it);
        return Unit.f21506a;
    }

    public static final Unit t1(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit t2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit u1(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit u2(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit v2(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit w1(k2 k2Var) {
        ls.h hVarI = k2Var.d().i();
        mq.y0.c cVar = hVarI instanceof mq.y0.c ? (mq.y0.c) hVarI : null;
        mq.y0 nextState = cVar != null ? cVar.getNextState() : null;
        if (nextState != null) {
            k2Var.d().p(nextState);
        }
        return Unit.f21506a;
    }

    public static final Unit x1(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit x2(k2 k2Var, mq.y0.StartCaptureFaceDetected startCaptureFaceDetected, q5.Input input, mq.c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (!(output instanceof mq.c0.c.a)) {
            if (output instanceof mq.c0.c.b) {
                k2Var.g3(((mq.c0.c.b) output).getError());
            } else {
                if (!(output instanceof mq.c0.c.C0461c)) {
                    throw new zt.l();
                }
                ls.g<mq.y0> gVarD = k2Var.d();
                mq.c0.c.C0461c c0461c = (mq.c0.c.C0461c) output;
                xn.c error = c0461c.getError();
                List<PoseInfo> listI = startCaptureFaceDetected.i();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                sn.v cameraProperties = startCaptureFaceDetected.getCameraProperties();
                gVarD.p(new mq.y0.StartCapture(false, error, c0461c.getPoseScore(), c0461c.getBrightnessInfo(), listI, null, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c0461c.getIsDimLightConditions(), 161, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit y1(k2 k2Var) {
        k2Var.h3(q5.c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit y2(k2 k2Var, q5.Input input, Unit it) {
        Parcelable countdownToCapture;
        Intrinsics.checkNotNullParameter(it, "it");
        ls.h hVarI = k2Var.d().i();
        mq.y0.StartCaptureFaceDetected startCaptureFaceDetected = hVarI instanceof mq.y0.StartCaptureFaceDetected ? (mq.y0.StartCaptureFaceDetected) hVarI : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f21506a;
        }
        k2Var.selfieEventLogger.a(startCaptureFaceDetected);
        boolean z10 = input.getDesignVersion() == mq.c.K0000 && startCaptureFaceDetected.k() == xn.a.Center;
        ls.g<mq.y0> gVarD = k2Var.d();
        if (z10) {
            List<PoseInfo> listI = startCaptureFaceDetected.i();
            List<mq.b0> listW = startCaptureFaceDetected.w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            sn.v cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new mq.y0.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listW, listI, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new mq.y0.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.i(), startCaptureFaceDetected.w(), l2.a(k2Var.d(), false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        gVarD.p(countdownToCapture);
        return Unit.f21506a;
    }

    public static final Unit z1(k2 k2Var, q5.Input input) {
        l2.d(k2Var.applicationContext, k2Var.d(), input, k2Var.e1(input));
        return Unit.f21506a;
    }

    public static final Unit z2(k2 k2Var) {
        k2Var.c1(k2Var.d(), k2Var.webRtcManager);
        return Unit.f21506a;
    }

    public final q5.d A1(final q5.Input renderProps, final mq.y0.CountdownToCapture renderState) {
        if (renderState.l().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: tq.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.B1(this.f32800a, renderState, renderProps, (mq.c0.c) obj);
                }
            });
        }
        d().m("countdown_" + renderState.getCountDown(), new l(renderProps, this, renderState, null));
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? mq.b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        q5.d.c.b.C0470b c0470b = new q5.d.c.b.C0470b(renderState.getCountDown(), q5.d.c.EnumC0473c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        zn.a aVarJ3 = j3(renderProps);
        ks.a aVar = this.webRtcManager;
        return mq.i1.g(renderProps, gVarD, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strB, renderState.getAutoCaptureSupported(), c0470b, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.r
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.C1(this.f32804a);
            }
        }, new Function0() { // from class: tq.s
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.D1(this.f32807a);
            }
        }, function1A1, new Function0() { // from class: tq.t
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.E1(this.f32811a, renderProps);
            }
        }, aVarJ3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d C2(q5.Input renderProps, mq.y0.Submit renderState) {
        final boolean z10 = renderProps.getDesignVersion() == mq.c.K0000;
        if (renderState.getRecoverableSubmitError() == null) {
            d().n(this.submitVerificationWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.w(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp(), renderProps.getFileUploadUrl(), this.selfiePoseManager), new Function1() { // from class: tq.l1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.D2(this.f32770a, z10, (qq.c.d) obj);
                }
            });
        }
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        or.b customPendingPage = renderProps.getCustomPendingPage();
        if (customPendingPage != null && renderState.getRecoverableSubmitError() == null) {
            return new q5.d.C0474d(or.d.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: tq.m1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k2.E2(this.f32773a);
                }
            }, new Function0() { // from class: tq.n1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k2.F2(this.f32791a);
                }
            }, renderProps.getStrings().getPendingPageNavBarTitle());
        }
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        er.c cVar = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        ir.a aVarB = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: tq.p1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.G2(this.f32799a);
            }
        };
        Function0 function1 = new Function0() { // from class: tq.q1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.H2(this.f32803a);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new q5.d.g(processingTitle, cVar, processingDescription, pendingPageTextVerticalPosition, styles, aVarB, function0, function1, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), j6.w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: tq.r1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.I2(this.f32806a);
            }
        });
    }

    public final q5.d F1(final q5.Input renderProps, mq.y0.CountdownToManualCapture renderState) {
        q5.d.c.EnumC0473c enumC0473c;
        final mq.y0.CountdownToManualCapture countdownToManualCapture;
        q5.d.c.b c0470b;
        final PoseInfo poseInfoP = renderState.p();
        final xn.a pose = poseInfoP.getPose();
        int i10 = e.f32732a[pose.ordinal()];
        if (i10 == 1) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new zt.l();
            }
            enumC0473c = q5.d.c.EnumC0473c.CENTER;
        }
        q5.d.c.EnumC0473c enumC0473c2 = enumC0473c;
        d().m("countdown_to_manual_capture_" + renderState.getCountDown(), new m(null));
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? mq.b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            countdownToManualCapture = renderState;
            c0470b = new q5.d.c.b.C0472d(new Function1() { // from class: tq.x1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.G1(poseInfoP, pose, this, countdownToManualCapture, (String) obj);
                }
            }, new Function1() { // from class: tq.y1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.H1(this.f32832a, (Throwable) obj);
                }
            }, true, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), false);
        } else {
            countdownToManualCapture = renderState;
            c0470b = new q5.d.c.b.C0470b(countdownToManualCapture.getCountDown(), enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a));
        }
        q5.d.c.b bVar = c0470b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        zn.a aVarJ3 = j3(renderProps);
        ks.a aVar = this.webRtcManager;
        return mq.i1.g(renderProps, gVarD, countdownToManualCapture.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strB, countdownToManualCapture.getAutoCaptureSupported(), bVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.a2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.I1(this.f32659a);
            }
        }, new Function0() { // from class: tq.b2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.J1(this.f32664a);
            }
        }, function1A1, new Function0() { // from class: tq.c2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.K1(this.f32669a, renderProps);
            }
        }, aVarJ3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, countdownToManualCapture.getCameraFacingMode(), countdownToManualCapture.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), countdownToManualCapture.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d J2(final q5.Input renderProps, final mq.y0.WaitForCameraFeed renderState) {
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || fq.y1.b(this.applicationContext, fq.n0.Camera)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && e1(renderProps) && xq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !fq.y1.b(this.applicationContext, fq.n0.RecordAudio);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ls.g<mq.y0> gVarD = d();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.i());
        q5.d dVarG = mq.i1.g(renderProps, gVarD, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new q5.d.c.b.g(new Function1() { // from class: tq.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.K2(this.f32765a, renderProps, renderState, jCurrentTimeMillis, (sn.v) obj);
            }
        }, q5.d.c.EnumC0473c.CLEAR, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), j3(renderProps) == zn.a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: tq.w
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.L2(this.f32821a, (Throwable) obj);
            }
        }), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: tq.h0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.M2(this.f32691a);
            }
        }, new Function0() { // from class: tq.s0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.N2(this.f32808a);
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: tq.d1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.O2(this.f32672a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : z10 || z11, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
        if (z10) {
            ls.g<mq.y0> gVarD2 = d();
            hq.i.a aVar = this.permissionRequestWorkerFactory;
            fq.n0 n0Var = fq.n0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle == null ? BuildConfig.FLAVOR : cameraPermissionsTitle;
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(jq.g.H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            String str2 = cameraPermissionsRationale;
            Context context = this.applicationContext;
            String string = context.getString(jq.g.G, xq.g.b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gVarD2.n(aVar.a(new fq.n1.Props(n0Var, false, str, str2, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: tq.o1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.P2(this.f32795a, renderState, renderProps, (hq.i.b) obj);
                }
            });
            return dVarG;
        }
        if (z11) {
            ls.g<mq.y0> gVarD3 = d();
            hq.i.a aVar2 = this.permissionRequestWorkerFactory;
            fq.n0 n0Var2 = fq.n0.RecordAudio;
            String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
            if (microphonePermissionsRationale == null) {
                microphonePermissionsRationale = this.applicationContext.getString(jq.g.S);
                Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
            }
            String str3 = microphonePermissionsRationale;
            Context context2 = this.applicationContext;
            String string2 = context2.getString(jq.g.R, xq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
            String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
            String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
            gVarD3.n(aVar2.a(new fq.n1.Props(n0Var2, false, microphonePermissionsTitle == null ? BuildConfig.FLAVOR : microphonePermissionsTitle, str3, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: tq.z1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.Q2(this.f32834a, renderState, renderProps, (hq.i.b) obj);
                }
            });
        }
        return dVarG;
    }

    @NotNull
    public final q5.d Q1(@NotNull final q5.Input renderProps, @NotNull final mq.y0.FinalizeLocalVideoCapture renderState, @NotNull final ls.g<mq.y0> workflowContext) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        workflowContext.m("finalize_delay", new n(renderState, workflowContext, null));
        return mq.i1.g(renderProps, workflowContext, null, null, (1006632960 & 16) != 0 ? null : null, null, false, new q5.d.c.b.C0471c(new Function1() { // from class: tq.b1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.L1(workflowContext, (File) obj);
            }
        }, new Function0() { // from class: tq.c1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.M1(workflowContext, renderProps, renderState);
            }
        }, renderState.getIsDelayComplete(), renderState.getIsFinalizeComplete() ? q5.d.c.EnumC0473c.COMPLETE : q5.d.c.EnumC0473c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a)), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: tq.e1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.N1(this.f32677a, workflowContext);
            }
        }, new Function0() { // from class: tq.f1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.O1(this.f32683a);
            }
        }, Z0(workflowContext, false), new Function0() { // from class: tq.g1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.P1(this.f32687a, workflowContext, renderProps);
            }
        }, zn.a.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d R1(final q5.Input renderProps, mq.y0.g renderState) {
        final mq.y0.g gVar;
        ks.a aVar = this.webRtcManager;
        if (aVar != null) {
            gVar = renderState;
            aVar.g(renderProps.getFromStep(), new Function1() { // from class: tq.k
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.S1(this.f32704a, renderProps, gVar, (String) obj);
                }
            });
        } else {
            gVar = renderState;
        }
        return mq.i1.g(renderProps, d(), null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new q5.d.c.b.h(new Function0() { // from class: tq.m
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.T1();
            }
        }, false, q5.d.c.EnumC0473c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a)), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: tq.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.U1(this.f32788a);
            }
        }, new Function0() { // from class: tq.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.V1(this.f32793a);
            }
        }, Z0(d(), false), new Function0() { // from class: tq.p
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.W1(this.f32797a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, gVar.getCameraFacingMode(), false, this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d R2(final q5.Input renderProps, final mq.y0.WaitForWebRtcSetup renderState) {
        d().n(this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: tq.u
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.S2(renderState, this, renderProps, (js.b.AbstractC0389b) obj);
            }
        });
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        q5.d.c.b.i iVar = new q5.d.c.b.i(q5.d.c.EnumC0473c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        zn.a aVarJ3 = j3(renderProps);
        ks.a aVar = this.webRtcManager;
        return mq.i1.g(renderProps, gVarD, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, iVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.v
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.X2(this.f32818a);
            }
        }, new Function0() { // from class: tq.x
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.Y2(this.f32824a);
            }
        }, function1A1, new Function0() { // from class: tq.y
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.Z2(this.f32830a, renderProps);
            }
        }, aVarJ3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d X1(final q5.Input renderProps, final mq.y0.RestartCamera renderState) {
        ks.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.e();
        }
        return new q5.d.e(new Function0() { // from class: tq.i2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.Y1(this.f32698a, renderProps, renderState);
            }
        });
    }

    @NotNull
    public final Function1<Throwable, Unit> Z0(@NotNull final ls.g<mq.y0> gVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new Function1() { // from class: tq.d2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.Y0(gVar, this, z10, (Throwable) obj);
            }
        };
    }

    public final q5.d Z1(final q5.Input renderProps, final mq.y0.j renderState) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(jq.g.Q);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(jq.g.I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(jq.g.M);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(jq.g.N);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(jq.g.O);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageLabelUp = renderProps.getStrings().getSelfieCheckPageLabelUp();
        if (selfieCheckPageLabelUp == null) {
            selfieCheckPageLabelUp = this.applicationContext.getString(jq.g.P);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelUp, "getString(...)");
        }
        String selfieCheckPageLabelDown = renderProps.getStrings().getSelfieCheckPageLabelDown();
        if (selfieCheckPageLabelDown == null) {
            selfieCheckPageLabelDown = this.applicationContext.getString(jq.g.L);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelDown, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(jq.g.K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(jq.g.J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new q5.d.f(new q5.d.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.y(), renderProps.getStyles(), this.navigationStateManager.b(), new Function0() { // from class: tq.j2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.a2(this.f32703a, renderState);
            }
        }, new Function0() { // from class: tq.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.b2(this.f32660a, renderProps, renderState);
            }
        }, new Function0() { // from class: tq.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.c2(this.f32665a);
            }
        }, new Function0() { // from class: tq.d
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.d2(this.f32670a);
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    public final q5.d a3(final q5.Input renderProps, final mq.y0.r renderState) {
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        q5.d.c.b.h hVar = new q5.d.c.b.h(new Function0() { // from class: tq.g0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.b3(this.f32686a, renderState);
            }
        }, false, q5.d.c.EnumC0473c.COMPLETE, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        ks.a aVar = this.webRtcManager;
        return mq.i1.g(renderProps, gVarD, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, hVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.i0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.c3(this.f32696a);
            }
        }, new Function0() { // from class: tq.j0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.d3(this.f32701a);
            }
        }, function1A1, new Function0() { // from class: tq.k0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.e3(this.f32706a, renderProps);
            }
        }, j3(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    @NotNull
    public final mq.y0 b1(@NotNull q5.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return props.getSkipPromptPage() ? new mq.y0.WaitForCameraFeed(false, false, null, props.z(), props.getPoseConfigs(), false, sn.v.b.User, false, 163, null) : new mq.y0.ShowInstructions(null, null, null, 6, null);
    }

    public final void c1(@NotNull ls.g<mq.y0> gVar, @Nullable ks.a aVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        mq.y0 y0Var = (mq.y0) gVar.i();
        mq.y0 backState = y0Var != null ? y0Var.getBackState() : null;
        if (aVar != null) {
            aVar.e();
        }
        if (backState != null) {
            backState.x(true);
            gVar.p(backState);
        } else if (b().getValue().getBackStepEnabled()) {
            e(q5.c.a.f23851a);
        } else {
            e(q5.c.b.f23852a);
        }
    }

    public final void d1(@NotNull q5.Input renderProps, @NotNull mq.y0 renderState) {
        q5.d dVarG1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        dr.j jVarF = l2.f(renderState);
        if (!j6.H(renderState)) {
            d().m("close_camera", new f(null));
        }
        if (!k3(renderProps)) {
            d().m("output_webrtc_error", new g(null));
        }
        boolean z10 = renderState instanceof mq.y0.Submit;
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.e(renderProps.getFromStep(), jVarF);
        if (renderState instanceof mq.y0.ShowInstructions) {
            dVarG1 = e2(renderProps, (mq.y0.ShowInstructions) renderState);
        } else if (renderState instanceof mq.y0.WaitForWebRtcSetup) {
            dVarG1 = R2(renderProps, (mq.y0.WaitForWebRtcSetup) renderState);
        } else if (renderState instanceof mq.y0.WaitForCameraFeed) {
            dVarG1 = J2(renderProps, (mq.y0.WaitForCameraFeed) renderState);
        } else if (renderState instanceof mq.y0.RestartCamera) {
            dVarG1 = X1(renderProps, (mq.y0.RestartCamera) renderState);
        } else if (renderState instanceof mq.y0.ShowPoseHint) {
            dVarG1 = j2(renderProps, (mq.y0.ShowPoseHint) renderState);
        } else if (renderState instanceof mq.y0.StartCapture) {
            dVarG1 = o2(renderProps, (mq.y0.StartCapture) renderState);
        } else if (renderState instanceof mq.y0.StartCaptureFaceDetected) {
            dVarG1 = w2(renderProps, (mq.y0.StartCaptureFaceDetected) renderState);
        } else if (renderState instanceof mq.y0.CountdownToCapture) {
            dVarG1 = A1(renderProps, (mq.y0.CountdownToCapture) renderState);
        } else if (renderState instanceof mq.y0.CountdownToManualCapture) {
            dVarG1 = F1(renderProps, (mq.y0.CountdownToManualCapture) renderState);
        } else if (renderState instanceof mq.y0.Capture) {
            dVarG1 = o1(renderProps, (mq.y0.Capture) renderState);
        } else if (renderState instanceof mq.y0.c) {
            dVarG1 = v1(renderProps, (mq.y0.c) renderState);
        } else if (renderState instanceof mq.y0.FinalizeLocalVideoCapture) {
            dVarG1 = Q1(renderProps, (mq.y0.FinalizeLocalVideoCapture) renderState, d());
        } else if (renderState instanceof mq.y0.g) {
            dVarG1 = R1(renderProps, (mq.y0.g) renderState);
        } else if (renderState instanceof mq.y0.r) {
            dVarG1 = a3(renderProps, (mq.y0.r) renderState);
        } else if (renderState instanceof mq.y0.j) {
            dVarG1 = Z1(renderProps, (mq.y0.j) renderState);
        } else if (z10) {
            dVarG1 = C2(renderProps, (mq.y0.Submit) renderState);
        } else {
            if (!(renderState instanceof mq.y0.AcquireNextPose)) {
                throw new zt.l();
            }
            dVarG1 = g1(renderProps, (mq.y0.AcquireNextPose) renderState);
        }
        c().setValue(dVarG1);
    }

    public final boolean e1(q5.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ks.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        ks.a aVar2 = this.webRtcManager;
        Object objI = videoCaptureConfig.i(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        if (zt.n.e(objI) == null) {
            return ((Boolean) objI).booleanValue();
        }
        return false;
    }

    public final q5.d.b e2(final q5.Input renderProps, final mq.y0.ShowInstructions renderState) {
        RemoteImage selfiePictograph = null;
        if (renderState.getErrorMessage() != null) {
            d().m("toast_message_timeout", new o(null));
        }
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        ir.a aVarB = this.navigationStateManager.b();
        mq.z0 selfieType = renderProps.getSelfieType();
        if (Intrinsics.c(selfieType, mq.z0.a.f24351a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.c(selfieType, mq.z0.c.f24353a) && !Intrinsics.c(selfieType, mq.z0.b.f24352a)) {
                throw new zt.l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new q5.d.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, aVarB, renderProps.getSelfieType(), renderProps.z(), renderProps.getStrings().getPromptPageNavBarTitle(), renderState.getErrorMessage(), new Function0() { // from class: tq.h1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.h2(this.f32692a, renderProps, renderState);
            }
        }, new Function0() { // from class: tq.i1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.i2(this.f32697a);
            }
        }, new Function0() { // from class: tq.j1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.f2(this.f32702a);
            }
        }, new Function0() { // from class: tq.k1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.g2(this.f32707a, renderState);
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
    public final <T extends mq.y0 & mq.a> mq.y0 f1(ls.g<mq.y0> gVar, T t8, mq.b0 b0Var) {
        mq.y0 y0VarE;
        long j10;
        if (b0Var != null) {
            this.selfieEventLogger.f(t8, b0Var);
        }
        String fileUploadUrl = b().getValue().getFileUploadUrl();
        if (fileUploadUrl != null && (b0Var instanceof mq.b0.SelfieImage)) {
            this.directFileUploader.j(((mq.b0.SelfieImage) b0Var).getAbsoluteFilePath(), fileUploadUrl);
        }
        List<mq.b0> listX0 = b0Var != null ? CollectionsKt.x0(t8.w(), b0Var) : t8.w();
        List<PoseInfo> listY = b0Var != null ? CollectionsKt.Y(t8.i(), 1) : t8.i();
        if (b().getValue().getUsePerPoseReveal()) {
            this.selfiePoseManager.n(listX0.size() + 1);
        }
        if (b().getValue().getUsePerPoseReveal() && b0Var != null) {
            T t10 = t8;
            if (!((PoseInfo) CollectionsKt.d0(t10.i())).getIsLast()) {
                T t11 = t8;
                y0VarE = new mq.y0.AcquireNextPose(t10.getCameraProperties(), t10.getStartSelfieTimestamp(), listX0, t8.getBackState(), t8.getCameraFacingMode(), t11.getIsFlashEnabled(), listY, t11.getPoseConfigs(), t11.getAutoCaptureSupported());
            } else if (listY.isEmpty()) {
                if (j3(b().getValue()) == zn.a.Upload) {
                    if (b().getValue().getDesignVersion() == mq.c.K0000) {
                        j10 = 0;
                    } else {
                        j10 = 3000;
                    }
                    T t12 = t8;
                    y0VarE = new mq.y0.FinalizeLocalVideoCapture(listX0, j10, false, false, t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
                } else if (j3(b().getValue()) == zn.a.Stream) {
                    T t13 = t8;
                    y0VarE = new mq.y0.g(listX0, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
                } else {
                    T t14 = t8;
                    y0VarE = l2.e(gVar, b().getValue().getPoseConfigs(), listX0, null, t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t8.getBackState());
                }
            } else if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == xn.a.Center) {
                T t15 = t8;
                y0VarE = new mq.y0.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t15.getStartSelfieTimestamp(), t15.getCameraProperties(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t16 = t8;
                y0VarE = new mq.y0.ShowPoseHint(listX0, listY, t16.getAutoCaptureSupported(), t16.getCameraProperties(), t16.getStartSelfieTimestamp(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (listY.isEmpty()) {
            if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == xn.a.Center) {
                T t17 = t8;
                y0VarE = new mq.y0.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t17.getStartSelfieTimestamp(), t17.getCameraProperties(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t18 = t8;
                y0VarE = new mq.y0.ShowPoseHint(listX0, listY, t18.getAutoCaptureSupported(), t18.getCameraProperties(), t18.getStartSelfieTimestamp(), t8.getBackState(), b().getValue().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (j3(b().getValue()) == zn.a.Upload) {
            if (b().getValue().getDesignVersion() == mq.c.K0000) {
                j10 = 0;
            } else {
                j10 = 3000;
            }
            T t19 = t8;
            y0VarE = new mq.y0.FinalizeLocalVideoCapture(listX0, j10, false, false, t19.getCameraProperties(), t19.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
        } else if (j3(b().getValue()) == zn.a.Stream) {
            T t110 = t8;
            y0VarE = new mq.y0.g(listX0, t110.getCameraProperties(), t110.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
        } else {
            T t111 = t8;
            y0VarE = l2.e(gVar, b().getValue().getPoseConfigs(), listX0, null, t111.getCameraProperties(), t111.getStartSelfieTimestamp(), t8.getBackState());
        }
        mq.y0 y0Var = y0VarE;
        return b0Var == null ? y0Var : new mq.y0.c(y0Var, t8.k(), t8.getBackState(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
    }

    public final void f3() {
        p001kotlin.jvm.internal.y yVar = new p001kotlin.jvm.internal.y();
        yVar.f21591a = true;
        d().m("check_if_manual_capture_enabled", new p(yVar, this, null));
    }

    public final q5.d g1(final q5.Input renderProps, mq.y0.AcquireNextPose renderState) {
        int size = renderState.w().size();
        d().m("fetch_pose_" + size, new h(size, null));
        return new q5.d.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new q5.d.a.AbstractC0467a.C0468a(q5.d.a.b.CLEAR, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: tq.z
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return k2.h1((xn.a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: tq.a0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.i1(this.f32657a, (Throwable) obj);
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: tq.b0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.j1(this.f32662a);
            }
        }, new Function0() { // from class: tq.c0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.k1(this.f32666a);
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: tq.d0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.l1(this.f32671a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: tq.e0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.m1(this.f32676a, (sn.v.b) obj);
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, false, new Function1() { // from class: tq.f0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.n1(((Boolean) obj).booleanValue());
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }

    public final void g3(Throwable error) {
        String message;
        String message2 = error.getMessage();
        if (message2 != null && StringsKt.a0(message2, "ENOSPC", false, 2, null)) {
            h3(new q5.c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(error instanceof g0.h1)) {
            if (error instanceof InternalErrorException) {
                h3(new q5.c.Error(((InternalErrorException) error).getErrorInfo()));
                return;
            }
            h3(new q5.c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = error.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            h3(new q5.c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        h3(new q5.c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + error.getClass().getCanonicalName())));
    }

    public final void h3(q5.c output) {
        ks.a aVar;
        if (((output instanceof q5.c.d) || (output instanceof q5.c.a) || (output instanceof q5.c.Error) || (output instanceof q5.c.b)) && (aVar = this.webRtcManager) != null) {
            aVar.e();
        }
        e(output);
    }

    public final void i3() {
        e(new q5.c.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final q5.d j2(final q5.Input renderProps, final mq.y0.ShowPoseHint renderState) {
        mq.h0 h0Var;
        String selfieHintLookLeft;
        q5.d.c.EnumC0473c enumC0473c;
        int i10 = e.f32732a[renderState.k().ordinal()];
        if (i10 == 1) {
            h0Var = mq.h0.Left;
        } else if (i10 == 2) {
            h0Var = mq.h0.Right;
        } else if (i10 == 3) {
            h0Var = mq.h0.Up;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new zt.l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            h0Var = mq.h0.Down;
        }
        int[] iArr = e.b;
        int i11 = iArr[h0Var.ordinal()];
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
                throw new zt.l();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookDown();
        }
        mq.h0 h0Var2 = h0Var;
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[h0Var2.ordinal()];
        if (i12 == 1) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_LEFT_HINT;
        } else if (i12 == 2) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_RIGHT_HINT;
        } else if (i12 == 3) {
            enumC0473c = q5.d.c.EnumC0473c.CENTER;
        } else if (i12 == 4) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_UP_HINT;
        } else {
            if (i12 != 5) {
                throw new zt.l();
            }
            enumC0473c = q5.d.c.EnumC0473c.LOOK_DOWN_HINT;
        }
        q5.d.c.b.f fVar = new q5.d.c.b.f(new Function0() { // from class: tq.x0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.k2(this.f32825a, renderState, renderProps);
            }
        }, enumC0473c, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        zn.a aVarJ3 = j3(renderProps);
        ks.a aVar = this.webRtcManager;
        String str = selfieHintLookLeft;
        q5.d.c.AssetOverrides assetOverridesC = j6.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        sn.a0.a aVar2 = this.cameraXControllerFactory;
        un.c.a aVar3 = this.camera2ControllerFactory;
        return mq.i1.g(renderProps, gVarD, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesC, requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.y0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.l2(this.f32831a);
            }
        }, new Function0() { // from class: tq.z0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.m2(this.f32833a);
            }
        }, function1A1, new Function0() { // from class: tq.a1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.n2(this.f32658a, renderProps);
            }
        }, aVarJ3, aVar, recordAudio, aVar2, aVar3, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final zn.a j3(q5.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ks.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        ks.a aVar2 = this.webRtcManager;
        Object objK = videoCaptureConfig.k(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        return zt.n.e(objK) == null ? (zn.a) objK : zn.a.None;
    }

    public final boolean k3(q5.Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ks.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        ks.a aVar2 = this.webRtcManager;
        Object objI = videoCaptureConfig.i(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        if (zt.n.e(objI) != null) {
            return false;
        }
        ((Boolean) objI).getClass();
        return true;
    }

    public final q5.d o1(final q5.Input renderProps, final mq.y0.Capture renderState) {
        mq.y0.h flashState;
        String selfieHintCenterFace;
        q5.d.c.EnumC0473c enumC0473c;
        q5.d.c.b aVar;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            d().m("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new i(renderState, this, renderProps, null));
        }
        final PoseInfo poseInfoP = renderState.p();
        final xn.a pose = poseInfoP.getPose();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == mq.y0.h.Disabled ? mq.y0.h.Enabled : renderState.getFlashState();
        } else {
            flashState = mq.y0.h.Disabled;
        }
        if (renderState.l().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), flashState == mq.y0.h.Disabled || flashState == mq.y0.h.ReadyToCapture), new Function1() { // from class: tq.e
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.p1(this.f32675a, renderState, (mq.c0.c) obj);
                }
            });
        }
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? mq.b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        if (pose == xn.a.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (pose == xn.a.Right) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        } else if (renderState.getSelfieError() != null) {
            selfieHintCenterFace = strB;
        } else {
            selfieHintCenterFace = pose == xn.a.Center ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        }
        int i10 = e.f32732a[pose.ordinal()];
        if (i10 == 1) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new zt.l();
            }
            enumC0473c = q5.d.c.EnumC0473c.CENTER;
        }
        q5.d.c.EnumC0473c enumC0473c2 = enumC0473c;
        if (!renderState.o() || flashState == mq.y0.h.FlashOn || flashState == mq.y0.h.ReadyToCapture) {
            aVar = new q5.d.c.b.a(enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), false);
        } else {
            aVar = new q5.d.c.b.C0472d(new Function1() { // from class: tq.f
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.q1(poseInfoP, pose, this, renderState, (String) obj);
                }
            }, new Function1() { // from class: tq.g
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.r1(this.f32685a, (Throwable) obj);
                }
            }, false, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), false, 4, null);
        }
        if (!renderState.o()) {
            f3();
        }
        mq.y0.h hVar = mq.y0.h.FlashOn;
        if (flashState == hVar) {
            d().m("wait_to_capture_with_flash_on", new j(null));
        }
        mq.y0.h hVar2 = mq.y0.h.ReadyToCapture;
        if (flashState == hVar2) {
            d().m("turn_off_flash", new k(null));
        }
        zn.a aVarJ3 = j3(renderProps);
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String str = selfieHintCenterFace;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        ks.a aVar2 = this.webRtcManager;
        q5.d.c.AssetOverrides assetOverridesC = j6.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        sn.a0.a aVar3 = this.cameraXControllerFactory;
        un.c.a aVar4 = this.camera2ControllerFactory;
        return mq.i1.g(renderProps, gVarD, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, strB, renderState.getAutoCaptureSupported(), aVar, assetOverridesC, requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.s1(this.f32690a);
            }
        }, new Function0() { // from class: tq.i
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.t1(this.f32695a);
            }
        }, function1A1, new Function0() { // from class: tq.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.u1(this.f32700a, renderProps);
            }
        }, aVarJ3, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : renderState.getFlashState() == hVar || renderState.getFlashState() == hVar2, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : j3(renderProps) == zn.a.Upload, (1006632960 & 536870912) != 0);
    }

    public final q5.d o2(final q5.Input renderProps, final mq.y0.StartCapture renderState) {
        q5.d.c.EnumC0473c enumC0473c;
        Object obj;
        q5.d.c.b aVar;
        if (renderState.l().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: tq.l0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k2.p2(this.f32768a, renderState, renderProps, (mq.c0.c) obj2);
                }
            });
        }
        final PoseInfo poseInfoP = renderState.p();
        boolean zO = renderState.o();
        if (!zO) {
            f3();
        }
        int i10 = e.f32732a[poseInfoP.getPose().ordinal()];
        if (i10 == 1) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0473c = q5.d.c.EnumC0473c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new zt.l();
            }
            enumC0473c = q5.d.c.EnumC0473c.CENTER;
        }
        q5.d.c.EnumC0473c enumC0473c2 = enumC0473c;
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? mq.b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        String selfieHintTakePhoto = strB == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strB;
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!zO) {
            obj = null;
            aVar = new q5.d.c.b.a(enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), false);
        } else if (e1(renderProps)) {
            aVar = new q5.d.c.b.e(new Function0() { // from class: tq.m0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k2.q2(this.f32771a, renderState, renderProps);
                }
            }, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a));
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: tq.n0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k2.r2(poseInfoP, this, renderState, (String) obj2);
                }
            };
            obj = null;
            aVar = new q5.d.c.b.C0472d(function1, new Function1() { // from class: tq.o0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k2.s2(this.f32794a, (Throwable) obj2);
                }
            }, false, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, obj);
        zn.a aVarJ3 = j3(renderProps);
        ks.a aVar2 = this.webRtcManager;
        return mq.i1.g(renderProps, gVarD, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintTakePhoto, strB, renderState.getAutoCaptureSupported(), aVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.p0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.t2(this.f32798a);
            }
        }, new Function0() { // from class: tq.q0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.u2(this.f32802a);
            }
        }, function1A1, new Function0() { // from class: tq.r0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.v2(this.f32805a, renderProps);
            }
        }, aVarJ3, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d v1(final q5.Input renderProps, mq.y0.c renderState) {
        q5.d.c.EnumC0473c enumC0473c;
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof mq.y0.Submit) {
            enumC0473c = q5.d.c.EnumC0473c.COMPLETE_WITH_CAPTURE;
        } else {
            int i10 = e.f32732a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC0473c = q5.d.c.EnumC0473c.LOOK_LEFT_COMPLETE;
            } else if (i10 == 2) {
                enumC0473c = q5.d.c.EnumC0473c.LOOK_RIGHT_COMPLETE;
            } else if (i10 == 3) {
                enumC0473c = q5.d.c.EnumC0473c.LOOK_UP_COMPLETE;
            } else if (i10 == 4) {
                enumC0473c = q5.d.c.EnumC0473c.LOOK_DOWN_COMPLETE;
            } else {
                if (i10 != 5) {
                    throw new zt.l();
                }
                enumC0473c = q5.d.c.EnumC0473c.CENTER_COMPLETE;
            }
        }
        return mq.i1.g(renderProps, gVarD, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, new q5.d.c.b.h(new Function0() { // from class: tq.t0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.w1(this.f32812a);
            }
        }, true, enumC0473c, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a)), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: tq.u0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.x1(this.f32816a);
            }
        }, new Function0() { // from class: tq.v0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.y1(this.f32819a);
            }
        }, a1(this, d(), false, 1, null), new Function0() { // from class: tq.w0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.z1(this.f32822a, renderProps);
            }
        }, j3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final q5.d w2(final q5.Input renderProps, final mq.y0.StartCaptureFaceDetected renderState) {
        if (renderState.l().getAutoCaptureEnabled()) {
            d().n(this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), new Function1() { // from class: tq.s1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.x2(this.f32809a, renderState, renderProps, (mq.c0.c) obj);
                }
            });
        }
        d().n(new TimerWorker(1000L), new Function1() { // from class: tq.t1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.y2(this.f32813a, renderProps, (Unit) obj);
            }
        });
        ls.g<mq.y0> gVarD = d();
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        q5.d.c.b.a aVar = new q5.d.c.b.a(q5.d.c.EnumC0473c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), mq.z0.b.f24352a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1A1 = a1(this, d(), false, 1, null);
        zn.a aVarJ3 = j3(renderProps);
        ks.a aVar2 = this.webRtcManager;
        q5.d.c.AssetOverrides assetOverridesC = j6.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        sn.a0.a aVar3 = this.cameraXControllerFactory;
        un.c.a aVar4 = this.camera2ControllerFactory;
        return mq.i1.g(renderProps, gVarD, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesC, requireStrictSelfieCapture, aVarB, new Function0() { // from class: tq.u1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.z2(this.f32817a);
            }
        }, new Function0() { // from class: tq.v1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.A2(this.f32820a);
            }
        }, function1A1, new Function0() { // from class: tq.w1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.B2(this.f32823a, renderProps);
            }
        }, aVarJ3, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }
}
