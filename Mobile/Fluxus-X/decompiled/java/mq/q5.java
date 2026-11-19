package mq;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln.Snapshot;
import or.UiComponentScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.reflect.KTypeProjection;
import p001kotlin.text.StringsKt;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00ad\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0085\u0001\u0087\u0001\u0089\u0001\u008b\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JC\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b.\u0010/JC\u00101\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002002\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JC\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b5\u00106JC\u00108\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002072\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b8\u00109JC\u0010;\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020:2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b;\u0010<JC\u0010>\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020=2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b>\u0010?JC\u0010A\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020@2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bA\u0010BJC\u0010D\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020C2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020F2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bG\u0010HJC\u0010J\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020I2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bJ\u0010KJC\u0010M\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020L2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bM\u0010NJC\u0010P\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020O2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bP\u0010QJC\u0010S\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020R2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bS\u0010TJC\u0010V\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020U2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^J-\u0010c\u001a\u00020b2\u001c\u0010a\u001a\u00180_R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040`H\u0002¢\u0006\u0004\bc\u0010dJC\u0010f\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020e2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bf\u0010gJC\u0010i\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020h2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bi\u0010jJG\u0010p\u001a\u00020\u0003\"\f\b\u0000\u0010l*\u00020\u0003*\u00020k*\u00160_R\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030`2\u0006\u0010m\u001a\u00028\u00002\b\u0010o\u001a\u0004\u0018\u00010nH\u0002¢\u0006\u0004\bp\u0010qJ3\u0010r\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\br\u0010sJ;\u0010u\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010t\u001a\u00020\u0004H\u0002¢\u0006\u0004\bu\u0010vJ7\u0010y\u001a\u00020b*\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ!\u0010~\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010|H\u0016¢\u0006\u0004\b~\u0010\u007fJF\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020|2\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001¨\u0006®\u0001"}, d2 = {"Lmq/q5;", "Lln/k;", "Lmq/q5$b;", "Lmq/y0;", "Lmq/q5$c;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lqq/c$a;", "submitVerificationWorker", "Ljs/b$a;", "webRtcWorkerFactory", "Lmq/c0$b;", "selfieAnalyzeWorker", "Lfq/n1;", "permissionRequestWorkflow", "Lvq/j;", "localVideoCaptureRenderer", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lyn/a;", "cameraStatsManager", "Lir/b;", "navigationStateManager", "Lpq/a;", "directFileUploader", "Lrq/b$b;", "selfiePoseManagerFactory", "Lgr/b;", "inquiryThemeManager", "Lmq/f0;", "selfieEventLogger", "Ler/c;", "sdkFilesManager", "Lto/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lqq/c$a;Ljs/b$a;Lmq/c0$b;Lfq/n1;Lvq/j;Lsn/a0$a;Lun/c$a;Lyn/a;Lir/b;Lpq/a;Lrq/b$b;Lgr/b;Lmq/f0;Ler/c;Lto/e;)V", "renderProps", "Lmq/y0$k;", "renderState", "Lln/k$a;", "context", "Lmq/q5$d$b;", "D2", "(Lmq/q5$b;Lmq/y0$k;Lln/k$a;)Lmq/q5$d$b;", "Lmq/y0$p;", "q3", "(Lmq/q5$b;Lmq/y0$p;Lln/k$a;)Ljava/lang/Object;", "Lmq/y0$a;", "Lmq/q5$d;", "z1", "(Lmq/q5$b;Lmq/y0$a;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$i;", "t2", "(Lmq/q5$b;Lmq/y0$i;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$q;", "B3", "(Lmq/q5$b;Lmq/y0$q;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$l;", "J2", "(Lmq/q5$b;Lmq/y0$l;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$m;", "P2", "(Lmq/q5$b;Lmq/y0$m;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$n;", "a3", "(Lmq/q5$b;Lmq/y0$n;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$d;", "Z1", "(Lmq/q5$b;Lmq/y0$d;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$e;", "f2", "(Lmq/q5$b;Lmq/y0$e;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$b;", "K1", "(Lmq/q5$b;Lmq/y0$b;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$c;", "T1", "(Lmq/q5$b;Lmq/y0$c;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$g;", "m2", "(Lmq/q5$b;Lmq/y0$g;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$r;", "P3", "(Lmq/q5$b;Lmq/y0$r;Lln/k$a;)Lmq/q5$d;", BuildConfig.FLAVOR, "c4", "(Lmq/q5$b;)Z", "w1", "Lzn/a;", "b4", "(Lmq/q5$b;)Lzn/a;", "Lln/r$c;", "Lln/r;", "updater", BuildConfig.FLAVOR, "Z3", "(Lln/r$c;)V", "Lmq/y0$j;", "w2", "(Lmq/q5$b;Lmq/y0$j;Lln/k$a;)Lmq/q5$d;", "Lmq/y0$o;", "i3", "(Lmq/q5$b;Lmq/y0$o;Lln/k$a;)Lmq/q5$d;", "Lmq/a;", "T", "currentState", "Lmq/b0;", "capturedSelfie", "x1", "(Lln/r$c;Lmq/y0;Lmq/b0;)Lmq/y0;", "V3", "(Lln/k$a;)V", "output", "X3", "(Lln/k$a;Lmq/q5$c;)V", BuildConfig.FLAVOR, "error", "W3", "(Lln/k$a;Ljava/lang/Throwable;)V", "props", "Lln/i;", "snapshot", "v1", "(Lmq/q5$b;Lln/i;)Lmq/y0;", "y1", "(Lmq/q5$b;Lmq/y0;Lln/k$a;)Ljava/lang/Object;", "state", "a4", "(Lmq/y0;)Lln/i;", "a", "Landroid/content/Context;", "b", "Lqq/c$a;", "c", "Ljs/b$a;", "d", "Lmq/c0$b;", "e", "Lfq/n1;", "f", "Lvq/j;", "g", "Lsn/a0$a;", "h", "Lun/c$a;", "i", "Lyn/a;", "j", "Lir/b;", "k", "Lpq/a;", "l", "Lrq/b$b;", "m", "Lgr/b;", "n", "Lmq/f0;", "o", "Ler/c;", "p", "Lto/e;", "Lks/a;", "q", "Lks/a;", "webRtcManager", "Lrq/b;", "r", "Lrq/b;", "selfiePoseManager", "s", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q5 extends ln.k<Input, y0, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final qq.c.a submitVerificationWorker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final js.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fq.n1 permissionRequestWorkflow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final vq.j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.a0.a cameraXControllerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.a directFileUploader;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rq.b.InterfaceC0610b selfiePoseManagerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gr.b inquiryThemeManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f0 selfieEventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ks.a webRtcManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public rq.b selfiePoseManager;

    /* JADX INFO: renamed from: mq.q5$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001:\u0001EBµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000202¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000202HÖ\u0001¢\u0006\u0004\b=\u00104J\u001a\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010<R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bO\u0010NR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010<R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010NR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bU\u0010NR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bO\u0010^\u001a\u0004\b_\u0010`R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bb\u0010`R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bZ\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bV\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bT\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\bP\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bj\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bk\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bl\u0010<R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bm\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bl\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bk\u0010q\u001a\u0004\br\u0010sR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bj\u0010t\u001a\u0004\bB\u0010uR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b_\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bD\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bb\u0010|\u001a\u0004\bg\u0010}R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010C\u001a\u0004\bh\u0010<R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bz\u0010C\u001a\u0004\bi\u0010<R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b~\u0010L\u001a\u0004\b\u007f\u0010NR\u001b\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000e\n\u0005\be\u0010\u0080\u0001\u001a\u0005\bc\u0010\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lmq/q5$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromComponent", "fromStep", BuildConfig.FLAVOR, "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lmq/q5$b$b;", "strings", "Lmq/z0;", "selfieType", BuildConfig.FLAVOR, "Lrq/a;", "orderedPoses", "orderedPosesBuffered", BuildConfig.FLAVOR, "poseTimeoutMs", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lmq/t;", "poseConfigs", "Lmq/c;", "designVersion", "fileUploadUrl", "flowWatermarkText", "usePerPoseReveal", "Lor/b;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLmq/q5$b$b;Lmq/z0;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lmq/t;Lmq/c;Ljava/lang/String;Ljava/lang/String;ZLor/b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "A", "b", "u", "c", "s", "d", "t", "e", "Z", "f", "()Z", "l", "g", "p", "h", "G", "i", "J", "j", "Lmq/q5$b$b;", "L", "()Lmq/q5$b$b;", "k", "Lmq/z0;", "H", "()Lmq/z0;", "Ljava/util/List;", "z", "()Ljava/util/List;", "m", "B", "n", "Ljava/lang/Long;", "F", "()Ljava/lang/Long;", "o", "q", "r", "y", "x", "w", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "M", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "O", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lmq/t;", "D", "()Lmq/t;", "Lmq/c;", "()Lmq/c;", "E", "N", "Lor/b;", "()Lor/b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        @NotNull
        public final mq.c designVersion;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String fileUploadUrl;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        public final boolean usePerPoseReveal;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        @Nullable
        public final or.b customPendingPage;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeySelfie;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean requireStrictSelfieCapture;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean skipPromptPage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Strings strings;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final z0 selfieType;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> orderedPoses;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<PoseInfo> orderedPosesBuffered;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Long poseTimeoutMs;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsTitle;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsRationale;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalPositiveButton;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalNegativeButton;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsTitle;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsRationale;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalPositiveButton;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalNegativeButton;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.SelfieStepStyle styles;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.AssetConfig assetConfig;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: mq.q5$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                boolean z11 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                boolean z12 = parcel.readInt() != 0 ? z10 : false;
                boolean z13 = parcel.readInt() != 0 ? z10 : false;
                Strings stringsCreateFromParcel = Strings.CREATOR.createFromParcel(parcel);
                z0 z0Var = (z0) parcel.readParcelable(Input.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int i13 = 0;
                    while (i13 != i12) {
                        arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                        i13++;
                        i12 = i12;
                    }
                }
                return new Input(string, string2, string3, string4, z10, z11, string5, z12, z13, stringsCreateFromParcel, z0Var, arrayList2, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.SelfieStepStyle) parcel.readParcelable(Input.class.getClassLoader()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.Selfie.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), PoseConfigs.CREATOR.createFromParcel(parcel), mq.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (or.b) parcel.readParcelable(Input.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        /* JADX INFO: renamed from: mq.q5$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000201¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000201HÖ\u0001¢\u0006\u0004\b<\u00103J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010;R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010;R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010;R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010;R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bR\u0010;R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010;R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bU\u0010;R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010;R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010;R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bZ\u0010;R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\b[\u0010;R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010;R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\b_\u0010;R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\b`\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\ba\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bc\u0010;R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010;R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\b^\u0010;R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\b\\\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bk\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bf\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bi\u0010;R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bj\u0010;R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bl\u0010;R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bn\u0010;R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bh\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bd\u0010;R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010C\u001a\u0004\bb\u0010;R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\bB\u0010;R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bS\u0010;R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bq\u0010;R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bt\u0010;R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bu\u0010;R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u0010C\u001a\u0004\bv\u0010;R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bw\u0010;R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010C\u001a\u0004\bM\u0010;R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010C\u001a\u0004\bx\u0010;R\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\by\u0010C\u001a\u0004\bo\u0010;R\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010C\u001a\u0004\bV\u0010;¨\u0006z"}, d2 = {"Lmq/q5$b$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, Title.type, "prompt", "disclosure", "startButton", "capturePageTitle", "capturePageNavBarTitle", "promptPageNavBarTitle", "pendingPageNavBarTitle", "checkPageNavBarTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintLookUp", "selfieHintLookDown", "selfieHintHoldStill", "selfieHintPoseTimeout", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageLabelUp", "selfieCheckPageLabelDown", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "selfieHintLookUpDescription", "selfieHintLookDownDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "r", "c", "n", "d", "f0", "e", "i", "f", "g", "s", "h", "o", "k", "j", "Z", "F", "l", "J", "m", "L", "W", "H", "p", "X", "q", "P", "S", "U", "t", "N", "u", "M", "v", "Y", "w", "x", "y", "C", "z", "A", "B", "D", "E", "G", "I", "K", "R", "T", "V", "O", "a0", "Q", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new a();

            /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelFront;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelLeft;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelRight;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelUp;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelDown;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageBtnSubmit;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageBtnRetake;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
            @Nullable
            public final String autoCaptureOn;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
            @Nullable
            public final String captureSuccess;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintCenterFaceDescription;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookLeftDescription;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookRightDescription;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUpDescription;

            /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDownDescription;

            /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraLoadingTitle;

            /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintVerifying;

            /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintAutoCaptureTimeout;

            /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
            @Nullable
            public final String disclaimer;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String disclosure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String startButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String capturePageTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String promptPageNavBarTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintTakePhoto;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintCenterFace;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooClose;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooFar;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintMultipleFaces;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceIncomplete;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintPoseNotCentered;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookLeft;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookRight;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUp;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDown;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintHoldStill;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintPoseTimeout;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageTitle;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageDescription;

            /* JADX INFO: renamed from: mq.q5$b$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Strings> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Strings createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Strings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Strings[] newArray(int i10) {
                    return new Strings[i10];
                }
            }

            public Strings(@NotNull String title, @NotNull String prompt, @NotNull String disclosure, @NotNull String startButton, @NotNull String capturePageTitle, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String selfieHintTakePhoto, @NotNull String selfieHintCenterFace, @NotNull String selfieHintFaceTooClose, @NotNull String selfieHintFaceTooFar, @NotNull String selfieHintMultipleFaces, @NotNull String selfieHintFaceIncomplete, @NotNull String selfieHintPoseNotCentered, @NotNull String selfieHintLookLeft, @NotNull String selfieHintLookRight, @Nullable String str5, @Nullable String str6, @NotNull String selfieHintHoldStill, @Nullable String str7, @NotNull String processingTitle, @NotNull String processingDescription, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(startButton, "startButton");
                Intrinsics.checkNotNullParameter(capturePageTitle, "capturePageTitle");
                Intrinsics.checkNotNullParameter(selfieHintTakePhoto, "selfieHintTakePhoto");
                Intrinsics.checkNotNullParameter(selfieHintCenterFace, "selfieHintCenterFace");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooClose, "selfieHintFaceTooClose");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooFar, "selfieHintFaceTooFar");
                Intrinsics.checkNotNullParameter(selfieHintMultipleFaces, "selfieHintMultipleFaces");
                Intrinsics.checkNotNullParameter(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
                Intrinsics.checkNotNullParameter(selfieHintPoseNotCentered, "selfieHintPoseNotCentered");
                Intrinsics.checkNotNullParameter(selfieHintLookLeft, "selfieHintLookLeft");
                Intrinsics.checkNotNullParameter(selfieHintLookRight, "selfieHintLookRight");
                Intrinsics.checkNotNullParameter(selfieHintHoldStill, "selfieHintHoldStill");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.startButton = startButton;
                this.capturePageTitle = capturePageTitle;
                this.capturePageNavBarTitle = str;
                this.promptPageNavBarTitle = str2;
                this.pendingPageNavBarTitle = str3;
                this.checkPageNavBarTitle = str4;
                this.selfieHintTakePhoto = selfieHintTakePhoto;
                this.selfieHintCenterFace = selfieHintCenterFace;
                this.selfieHintFaceTooClose = selfieHintFaceTooClose;
                this.selfieHintFaceTooFar = selfieHintFaceTooFar;
                this.selfieHintMultipleFaces = selfieHintMultipleFaces;
                this.selfieHintFaceIncomplete = selfieHintFaceIncomplete;
                this.selfieHintPoseNotCentered = selfieHintPoseNotCentered;
                this.selfieHintLookLeft = selfieHintLookLeft;
                this.selfieHintLookRight = selfieHintLookRight;
                this.selfieHintLookUp = str5;
                this.selfieHintLookDown = str6;
                this.selfieHintHoldStill = selfieHintHoldStill;
                this.selfieHintPoseTimeout = str7;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.selfieCheckPageTitle = str8;
                this.selfieCheckPageDescription = str9;
                this.selfieCheckPageLabelFront = str10;
                this.selfieCheckPageLabelLeft = str11;
                this.selfieCheckPageLabelRight = str12;
                this.selfieCheckPageLabelUp = str13;
                this.selfieCheckPageLabelDown = str14;
                this.selfieCheckPageBtnSubmit = str15;
                this.selfieCheckPageBtnRetake = str16;
                this.autoCaptureOn = str17;
                this.captureSuccess = str18;
                this.selfieHintCenterFaceDescription = str19;
                this.selfieHintLookLeftDescription = str20;
                this.selfieHintLookRightDescription = str21;
                this.selfieHintLookUpDescription = str22;
                this.selfieHintLookDownDescription = str23;
                this.cameraLoadingTitle = str24;
                this.selfieHintVerifying = str25;
                this.selfieHintAutoCaptureTimeout = str26;
                this.disclaimer = str27;
            }

            @Nullable
            /* JADX INFO: renamed from: B, reason: from getter */
            public final String getSelfieCheckPageLabelUp() {
                return this.selfieCheckPageLabelUp;
            }

            @Nullable
            /* JADX INFO: renamed from: C, reason: from getter */
            public final String getSelfieCheckPageTitle() {
                return this.selfieCheckPageTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: D, reason: from getter */
            public final String getSelfieHintAutoCaptureTimeout() {
                return this.selfieHintAutoCaptureTimeout;
            }

            @NotNull
            /* JADX INFO: renamed from: F, reason: from getter */
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            @Nullable
            /* JADX INFO: renamed from: G, reason: from getter */
            public final String getSelfieHintCenterFaceDescription() {
                return this.selfieHintCenterFaceDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: H, reason: from getter */
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            @NotNull
            /* JADX INFO: renamed from: J, reason: from getter */
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            @NotNull
            /* JADX INFO: renamed from: L, reason: from getter */
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            @NotNull
            /* JADX INFO: renamed from: M, reason: from getter */
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            @Nullable
            /* JADX INFO: renamed from: N, reason: from getter */
            public final String getSelfieHintLookDown() {
                return this.selfieHintLookDown;
            }

            @Nullable
            /* JADX INFO: renamed from: O, reason: from getter */
            public final String getSelfieHintLookDownDescription() {
                return this.selfieHintLookDownDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: P, reason: from getter */
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            @Nullable
            /* JADX INFO: renamed from: R, reason: from getter */
            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: S, reason: from getter */
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            @Nullable
            /* JADX INFO: renamed from: T, reason: from getter */
            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            @Nullable
            /* JADX INFO: renamed from: U, reason: from getter */
            public final String getSelfieHintLookUp() {
                return this.selfieHintLookUp;
            }

            @Nullable
            /* JADX INFO: renamed from: V, reason: from getter */
            public final String getSelfieHintLookUpDescription() {
                return this.selfieHintLookUpDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: W, reason: from getter */
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            @NotNull
            /* JADX INFO: renamed from: X, reason: from getter */
            public final String getSelfieHintPoseNotCentered() {
                return this.selfieHintPoseNotCentered;
            }

            @Nullable
            /* JADX INFO: renamed from: Y, reason: from getter */
            public final String getSelfieHintPoseTimeout() {
                return this.selfieHintPoseTimeout;
            }

            @NotNull
            /* JADX INFO: renamed from: Z, reason: from getter */
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            @Nullable
            /* JADX INFO: renamed from: a0, reason: from getter */
            public final String getSelfieHintVerifying() {
                return this.selfieHintVerifying;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.prompt, strings.prompt) && Intrinsics.c(this.disclosure, strings.disclosure) && Intrinsics.c(this.startButton, strings.startButton) && Intrinsics.c(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.c(this.promptPageNavBarTitle, strings.promptPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.c(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.c(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.c(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.c(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.c(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.c(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.c(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.c(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.c(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.c(this.selfieHintLookUp, strings.selfieHintLookUp) && Intrinsics.c(this.selfieHintLookDown, strings.selfieHintLookDown) && Intrinsics.c(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.c(this.selfieHintPoseTimeout, strings.selfieHintPoseTimeout) && Intrinsics.c(this.processingTitle, strings.processingTitle) && Intrinsics.c(this.processingDescription, strings.processingDescription) && Intrinsics.c(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.c(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.c(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.c(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.c(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.c(this.selfieCheckPageLabelUp, strings.selfieCheckPageLabelUp) && Intrinsics.c(this.selfieCheckPageLabelDown, strings.selfieCheckPageLabelDown) && Intrinsics.c(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.c(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && Intrinsics.c(this.autoCaptureOn, strings.autoCaptureOn) && Intrinsics.c(this.captureSuccess, strings.captureSuccess) && Intrinsics.c(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && Intrinsics.c(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && Intrinsics.c(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && Intrinsics.c(this.selfieHintLookUpDescription, strings.selfieHintLookUpDescription) && Intrinsics.c(this.selfieHintLookDownDescription, strings.selfieHintLookDownDescription) && Intrinsics.c(this.cameraLoadingTitle, strings.cameraLoadingTitle) && Intrinsics.c(this.selfieHintVerifying, strings.selfieHintVerifying) && Intrinsics.c(this.selfieHintAutoCaptureTimeout, strings.selfieHintAutoCaptureTimeout) && Intrinsics.c(this.disclaimer, strings.disclaimer);
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: f0, reason: from getter */
            public final String getStartButton() {
                return this.startButton;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getCapturePageNavBarTitle() {
                return this.capturePageNavBarTitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.startButton.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31;
                String str = this.capturePageNavBarTitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.promptPageNavBarTitle;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.pendingPageNavBarTitle;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.checkPageNavBarTitle;
                int iHashCode5 = (((((((((((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.selfieHintTakePhoto.hashCode()) * 31) + this.selfieHintCenterFace.hashCode()) * 31) + this.selfieHintFaceTooClose.hashCode()) * 31) + this.selfieHintFaceTooFar.hashCode()) * 31) + this.selfieHintMultipleFaces.hashCode()) * 31) + this.selfieHintFaceIncomplete.hashCode()) * 31) + this.selfieHintPoseNotCentered.hashCode()) * 31) + this.selfieHintLookLeft.hashCode()) * 31) + this.selfieHintLookRight.hashCode()) * 31;
                String str5 = this.selfieHintLookUp;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieHintLookDown;
                int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.selfieHintHoldStill.hashCode()) * 31;
                String str7 = this.selfieHintPoseTimeout;
                int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31;
                String str8 = this.selfieCheckPageTitle;
                int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.selfieCheckPageDescription;
                int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.selfieCheckPageLabelFront;
                int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.selfieCheckPageLabelLeft;
                int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.selfieCheckPageLabelRight;
                int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.selfieCheckPageLabelUp;
                int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.selfieCheckPageLabelDown;
                int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.selfieCheckPageBtnSubmit;
                int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.selfieCheckPageBtnRetake;
                int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.autoCaptureOn;
                int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
                String str18 = this.captureSuccess;
                int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
                String str19 = this.selfieHintCenterFaceDescription;
                int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
                String str20 = this.selfieHintLookLeftDescription;
                int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
                String str21 = this.selfieHintLookRightDescription;
                int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
                String str22 = this.selfieHintLookUpDescription;
                int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
                String str23 = this.selfieHintLookDownDescription;
                int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
                String str24 = this.cameraLoadingTitle;
                int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
                String str25 = this.selfieHintVerifying;
                int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
                String str26 = this.selfieHintAutoCaptureTimeout;
                int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
                String str27 = this.disclaimer;
                return iHashCode27 + (str27 != null ? str27.hashCode() : 0);
            }

            @NotNull
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getCapturePageTitle() {
                return this.capturePageTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getCheckPageNavBarTitle() {
                return this.checkPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getPendingPageNavBarTitle() {
                return this.pendingPageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: r, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getPromptPageNavBarTitle() {
                return this.promptPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getSelfieCheckPageBtnRetake() {
                return this.selfieCheckPageBtnRetake;
            }

            @NotNull
            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", disclosure=" + this.disclosure + ", startButton=" + this.startButton + ", capturePageTitle=" + this.capturePageTitle + ", capturePageNavBarTitle=" + this.capturePageNavBarTitle + ", promptPageNavBarTitle=" + this.promptPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", selfieHintTakePhoto=" + this.selfieHintTakePhoto + ", selfieHintCenterFace=" + this.selfieHintCenterFace + ", selfieHintFaceTooClose=" + this.selfieHintFaceTooClose + ", selfieHintFaceTooFar=" + this.selfieHintFaceTooFar + ", selfieHintMultipleFaces=" + this.selfieHintMultipleFaces + ", selfieHintFaceIncomplete=" + this.selfieHintFaceIncomplete + ", selfieHintPoseNotCentered=" + this.selfieHintPoseNotCentered + ", selfieHintLookLeft=" + this.selfieHintLookLeft + ", selfieHintLookRight=" + this.selfieHintLookRight + ", selfieHintLookUp=" + this.selfieHintLookUp + ", selfieHintLookDown=" + this.selfieHintLookDown + ", selfieHintHoldStill=" + this.selfieHintHoldStill + ", selfieHintPoseTimeout=" + this.selfieHintPoseTimeout + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", selfieCheckPageTitle=" + this.selfieCheckPageTitle + ", selfieCheckPageDescription=" + this.selfieCheckPageDescription + ", selfieCheckPageLabelFront=" + this.selfieCheckPageLabelFront + ", selfieCheckPageLabelLeft=" + this.selfieCheckPageLabelLeft + ", selfieCheckPageLabelRight=" + this.selfieCheckPageLabelRight + ", selfieCheckPageLabelUp=" + this.selfieCheckPageLabelUp + ", selfieCheckPageLabelDown=" + this.selfieCheckPageLabelDown + ", selfieCheckPageBtnSubmit=" + this.selfieCheckPageBtnSubmit + ", selfieCheckPageBtnRetake=" + this.selfieCheckPageBtnRetake + ", autoCaptureOn=" + this.autoCaptureOn + ", captureSuccess=" + this.captureSuccess + ", selfieHintCenterFaceDescription=" + this.selfieHintCenterFaceDescription + ", selfieHintLookLeftDescription=" + this.selfieHintLookLeftDescription + ", selfieHintLookRightDescription=" + this.selfieHintLookRightDescription + ", selfieHintLookUpDescription=" + this.selfieHintLookUpDescription + ", selfieHintLookDownDescription=" + this.selfieHintLookDownDescription + ", cameraLoadingTitle=" + this.cameraLoadingTitle + ", selfieHintVerifying=" + this.selfieHintVerifying + ", selfieHintAutoCaptureTimeout=" + this.selfieHintAutoCaptureTimeout + ", disclaimer=" + this.disclaimer + ")";
            }

            @Nullable
            /* JADX INFO: renamed from: u, reason: from getter */
            public final String getSelfieCheckPageBtnSubmit() {
                return this.selfieCheckPageBtnSubmit;
            }

            @Nullable
            /* JADX INFO: renamed from: v, reason: from getter */
            public final String getSelfieCheckPageDescription() {
                return this.selfieCheckPageDescription;
            }

            @Nullable
            /* JADX INFO: renamed from: w, reason: from getter */
            public final String getSelfieCheckPageLabelDown() {
                return this.selfieCheckPageLabelDown;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.disclosure);
                dest.writeString(this.startButton);
                dest.writeString(this.capturePageTitle);
                dest.writeString(this.capturePageNavBarTitle);
                dest.writeString(this.promptPageNavBarTitle);
                dest.writeString(this.pendingPageNavBarTitle);
                dest.writeString(this.checkPageNavBarTitle);
                dest.writeString(this.selfieHintTakePhoto);
                dest.writeString(this.selfieHintCenterFace);
                dest.writeString(this.selfieHintFaceTooClose);
                dest.writeString(this.selfieHintFaceTooFar);
                dest.writeString(this.selfieHintMultipleFaces);
                dest.writeString(this.selfieHintFaceIncomplete);
                dest.writeString(this.selfieHintPoseNotCentered);
                dest.writeString(this.selfieHintLookLeft);
                dest.writeString(this.selfieHintLookRight);
                dest.writeString(this.selfieHintLookUp);
                dest.writeString(this.selfieHintLookDown);
                dest.writeString(this.selfieHintHoldStill);
                dest.writeString(this.selfieHintPoseTimeout);
                dest.writeString(this.processingTitle);
                dest.writeString(this.processingDescription);
                dest.writeString(this.selfieCheckPageTitle);
                dest.writeString(this.selfieCheckPageDescription);
                dest.writeString(this.selfieCheckPageLabelFront);
                dest.writeString(this.selfieCheckPageLabelLeft);
                dest.writeString(this.selfieCheckPageLabelRight);
                dest.writeString(this.selfieCheckPageLabelUp);
                dest.writeString(this.selfieCheckPageLabelDown);
                dest.writeString(this.selfieCheckPageBtnSubmit);
                dest.writeString(this.selfieCheckPageBtnRetake);
                dest.writeString(this.autoCaptureOn);
                dest.writeString(this.captureSuccess);
                dest.writeString(this.selfieHintCenterFaceDescription);
                dest.writeString(this.selfieHintLookLeftDescription);
                dest.writeString(this.selfieHintLookRightDescription);
                dest.writeString(this.selfieHintLookUpDescription);
                dest.writeString(this.selfieHintLookDownDescription);
                dest.writeString(this.cameraLoadingTitle);
                dest.writeString(this.selfieHintVerifying);
                dest.writeString(this.selfieHintAutoCaptureTimeout);
                dest.writeString(this.disclaimer);
            }

            @Nullable
            /* JADX INFO: renamed from: x, reason: from getter */
            public final String getSelfieCheckPageLabelFront() {
                return this.selfieCheckPageLabelFront;
            }

            @Nullable
            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getSelfieCheckPageLabelLeft() {
                return this.selfieCheckPageLabelLeft;
            }

            @Nullable
            /* JADX INFO: renamed from: z, reason: from getter */
            public final String getSelfieCheckPageLabelRight() {
                return this.selfieCheckPageLabelRight;
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull String fieldKeySelfie, boolean z12, boolean z13, @NotNull Strings strings, @NotNull z0 selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable List<PoseInfo> list, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.Selfie.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @NotNull PoseConfigs poseConfigs, @NotNull mq.c designVersion, @Nullable String str9, @Nullable String str10, boolean z14, @Nullable or.b bVar) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z12;
            this.skipPromptPage = z13;
            this.strings = strings;
            this.selfieType = selfieType;
            this.orderedPoses = orderedPoses;
            this.orderedPosesBuffered = list;
            this.poseTimeoutMs = l10;
            this.cameraPermissionsTitle = str;
            this.cameraPermissionsRationale = str2;
            this.cameraPermissionsModalPositiveButton = str3;
            this.cameraPermissionsModalNegativeButton = str4;
            this.microphonePermissionsTitle = str5;
            this.microphonePermissionsRationale = str6;
            this.microphonePermissionsModalPositiveButton = str7;
            this.microphonePermissionsModalNegativeButton = str8;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.fileUploadUrl = str9;
            this.flowWatermarkText = str10;
            this.usePerPoseReveal = z14;
            this.customPendingPage = bVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        public final List<PoseInfo> B() {
            return this.orderedPosesBuffered;
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: D, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final Long getPoseTimeoutMs() {
            return this.poseTimeoutMs;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        @NotNull
        /* JADX INFO: renamed from: H, reason: from getter */
        public final z0 getSelfieType() {
            return this.selfieType;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final boolean getUsePerPoseReveal() {
            return this.usePerPoseReveal;
        }

        @NotNull
        /* JADX INFO: renamed from: O, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.fromComponent, input.fromComponent) && Intrinsics.c(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.c(this.strings, input.strings) && Intrinsics.c(this.selfieType, input.selfieType) && Intrinsics.c(this.orderedPoses, input.orderedPoses) && Intrinsics.c(this.orderedPosesBuffered, input.orderedPosesBuffered) && Intrinsics.c(this.poseTimeoutMs, input.poseTimeoutMs) && Intrinsics.c(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.c(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.c(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.c(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.c(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.c(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.c(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.c(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.c(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion && Intrinsics.c(this.fileUploadUrl, input.fileUploadUrl) && Intrinsics.c(this.flowWatermarkText, input.flowWatermarkText) && this.usePerPoseReveal == input.usePerPoseReveal && Intrinsics.c(this.customPendingPage, input.customPendingPage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getCameraPermissionsModalNegativeButton() {
            return this.cameraPermissionsModalNegativeButton;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.strings.hashCode()) * 31) + this.selfieType.hashCode()) * 31) + this.orderedPoses.hashCode()) * 31;
            List<PoseInfo> list = this.orderedPosesBuffered;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Long l10 = this.poseTimeoutMs;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.cameraPermissionsTitle;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int iHashCode12 = (((((((((((iHashCode11 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31) + this.videoCaptureConfig.hashCode()) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode()) * 31;
            String str9 = this.fileUploadUrl;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.flowWatermarkText;
            int iHashCode14 = (((iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.usePerPoseReveal)) * 31;
            or.b bVar = this.customPendingPage;
            return iHashCode14 + (bVar != null ? bVar.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getCameraPermissionsModalPositiveButton() {
            return this.cameraPermissionsModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getCameraPermissionsRationale() {
            return this.cameraPermissionsRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getCameraPermissionsTitle() {
            return this.cameraPermissionsTitle;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final or.b getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final mq.c getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getFileUploadUrl() {
            return this.fileUploadUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", strings=" + this.strings + ", selfieType=" + this.selfieType + ", orderedPoses=" + this.orderedPoses + ", orderedPosesBuffered=" + this.orderedPosesBuffered + ", poseTimeoutMs=" + this.poseTimeoutMs + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsRationale=" + this.cameraPermissionsRationale + ", cameraPermissionsModalPositiveButton=" + this.cameraPermissionsModalPositiveButton + ", cameraPermissionsModalNegativeButton=" + this.cameraPermissionsModalNegativeButton + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsRationale=" + this.microphonePermissionsRationale + ", microphonePermissionsModalPositiveButton=" + this.microphonePermissionsModalPositiveButton + ", microphonePermissionsModalNegativeButton=" + this.microphonePermissionsModalNegativeButton + ", styles=" + this.styles + ", videoCaptureConfig=" + this.videoCaptureConfig + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ", fileUploadUrl=" + this.fileUploadUrl + ", flowWatermarkText=" + this.flowWatermarkText + ", usePerPoseReveal=" + this.usePerPoseReveal + ", customPendingPage=" + this.customPendingPage + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getMicrophonePermissionsModalNegativeButton() {
            return this.microphonePermissionsModalNegativeButton;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getMicrophonePermissionsModalPositiveButton() {
            return this.microphonePermissionsModalPositiveButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            this.strings.writeToParcel(dest, flags);
            dest.writeParcelable(this.selfieType, flags);
            List<PoseInfo> list = this.orderedPoses;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<PoseInfo> list2 = this.orderedPosesBuffered;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<PoseInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            Long l10 = this.poseTimeoutMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
            dest.writeString(this.cameraPermissionsTitle);
            dest.writeString(this.cameraPermissionsRationale);
            dest.writeString(this.cameraPermissionsModalPositiveButton);
            dest.writeString(this.cameraPermissionsModalNegativeButton);
            dest.writeString(this.microphonePermissionsTitle);
            dest.writeString(this.microphonePermissionsRationale);
            dest.writeString(this.microphonePermissionsModalPositiveButton);
            dest.writeString(this.microphonePermissionsModalNegativeButton);
            dest.writeParcelable(this.styles, flags);
            this.videoCaptureConfig.writeToParcel(dest, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.designVersion.name());
            dest.writeString(this.fileUploadUrl);
            dest.writeString(this.flowWatermarkText);
            dest.writeInt(this.usePerPoseReveal ? 1 : 0);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getMicrophonePermissionsRationale() {
            return this.microphonePermissionsRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getMicrophonePermissionsTitle() {
            return this.microphonePermissionsTitle;
        }

        @NotNull
        public final List<PoseInfo> z() {
            return this.orderedPoses;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lmq/q5$c;", BuildConfig.FLAVOR, "<init>", "()V", "b", "d", "a", "c", "Lmq/q5$c$a;", "Lmq/q5$c$b;", "Lmq/q5$c$c;", "Lmq/q5$c$d;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/q5$c$a;", "Lmq/q5$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f23851a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 869674411;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/q5$c$b;", "Lmq/q5$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f23852a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1455860573;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: mq.q5$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmq/q5$c$c;", "Lmq/q5$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/q5$c$d;", "Lmq/q5$c;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f23854a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 905373494;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmq/q5$d;", BuildConfig.FLAVOR, "<init>", "()V", "b", "e", "c", "a", "f", "g", "d", "Lmq/q5$d$a;", "Lmq/q5$d$b;", "Lmq/q5$d$c;", "Lmq/q5$d$d;", "Lmq/q5$d$e;", "Lmq/q5$d$f;", "Lmq/q5$d$g;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bL\u0018\u00002\u00020\u0001:\u0002>BB\u009d\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020\f\u0012\u0006\u0010/\u001a\u00020\f\u0012\u0006\u00100\u001a\u00020\f\u0012\u0006\u00101\u001a\u00020\f\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0019\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00105\u001a\u00020\f\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u00107\u001a\u00020\f\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010AR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bJ\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bM\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010O\u001a\u0004\bX\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bS\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bZ\u0010]\u001a\u0004\b`\u0010_R'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b8\u0006¢\u0006\f\n\u0004\b^\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bd\u0010_R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b`\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bd\u0010n\u001a\u0004\bG\u0010oR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bF\u0010rR#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bs\u0010a\u001a\u0004\be\u0010cR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bJ\u0010t\u001a\u0004\bs\u0010uR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bD\u0010xR\u0017\u0010-\u001a\u00020'8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bN\u0010{R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\b|\u0010QR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\b}\u0010QR\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\b~\u0010QR\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\b\u007f\u0010QR#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bt\u0010a\u001a\u0004\bl\u0010cR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\bj\u0010\u0080\u0001\u001a\u0005\bp\u0010\u0081\u0001R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bm\u0010O\u001a\u0004\by\u0010QR\u0017\u00106\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\bv\u0010QR\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b}\u0010O\u001a\u0004\b>\u0010QR\u0019\u00109\u001a\u0002088\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0082\u0001\u001a\u0005\bK\u0010\u0083\u0001R\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010?\u001a\u0004\bt\u0010AR\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b~\u0010?\u001a\u0004\b\\\u0010A¨\u0006\u0084\u0001"}, d2 = {"Lmq/q5$d$a;", "Lmq/q5$d;", BuildConfig.FLAVOR, Title.type, "message", "description", "autoCaptureText", "captureSuccessText", "disclaimerText", "realTimeHint", "hintAutoCaptureTimeoutText", "hintVerifyingText", BuildConfig.FLAVOR, "isAutoCaptureOn", "Lmq/q5$d$a$a;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "requireStrictSelfieCapture", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lzn/a;", "videoCaptureMethod", "Lks/a;", "webRtcManager", "isAudioRequired", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lsn/v$b;", "onCameraFacingModeSelected", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isFlashOn", "isDimLightConditions", "onFlashSet", "Lxn/a;", "pose", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lmq/c;", "designVersion", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmq/q5$d$a$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lzn/a;Lks/a;ZLsn/a0$a;Lun/c$a;Lkotlin/jvm/functions/Function1;FLxn/b;Lsn/v$b;ZZZZLkotlin/jvm/functions/Function1;Lxn/a;ZZZLmq/c;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "b", "m", "c", "g", "d", "e", "f", "i", "y", "h", "k", "l", "j", "Z", "I", "()Z", "Lmq/q5$d$a$a;", "n", "()Lmq/q5$d$a$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "B", "Lir/a;", "p", "()Lir/a;", "o", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", "t", "Lkotlin/jvm/functions/Function1;", "r", "()Lkotlin/jvm/functions/Function1;", "v", "s", "Lzn/a;", "E", "()Lzn/a;", "Lks/a;", "G", "()Lks/a;", "u", "H", "Lsn/a0$a;", "()Lsn/a0$a;", "w", "Lun/c$a;", "()Lun/c$a;", "x", "F", "()F", "z", "Lxn/b;", "()Lxn/b;", "A", "Lsn/v$b;", "()Lsn/v$b;", "L", "J", "M", "K", "Lxn/a;", "()Lxn/a;", "Lmq/c;", "()Lmq/c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends d {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            @NotNull
            public final sn.v.b facingMode;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            public final boolean isFlashEnabled;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            public final boolean isAutoFlashOnManualCaptureEnabled;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            public final boolean isFlashOn;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            public final boolean isDimLightConditions;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            @NotNull
            public final Function1<Boolean, Unit> onFlashSet;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            @Nullable
            public final xn.a pose;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            public final boolean requestingPermissions;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            public final boolean allowSwitchCamera;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata */
            @NotNull
            public final mq.c designVersion;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String autoCaptureText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String captureSuccessText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String disclaimerText;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String realTimeHint;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String hintAutoCaptureTimeoutText;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String hintVerifyingText;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            public final boolean isAutoCaptureOn;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AbstractC0467a mode;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final zn.a videoCaptureMethod;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final ks.a webRtcManager;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
            public final boolean isAudioRequired;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final sn.a0.a cameraXControllerFactory;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final un.c.a camera2ControllerFactory;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<sn.v.b, Unit> onCameraFacingModeSelected;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final xn.b brightnessInfo;

            /* JADX INFO: renamed from: mq.q5$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\b\t\n\u000b\f\u0005\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lmq/q5$d$a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmq/q5$d$a$b;", "a", "()Lmq/q5$d$a$b;", "overlay", "h", "j", "g", "c", "i", "e", "f", "b", "d", "Lmq/q5$d$a$a$a;", "Lmq/q5$d$a$a$b;", "Lmq/q5$d$a$a$c;", "Lmq/q5$d$a$a$d;", "Lmq/q5$d$a$a$e;", "Lmq/q5$d$a$a$f;", "Lmq/q5$d$a$a$g;", "Lmq/q5$d$a$a$h;", "Lmq/q5$d$a$a$i;", "Lmq/q5$d$a$a$j;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static abstract class AbstractC0467a {

                /* JADX INFO: renamed from: mq.q5$d$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lmq/q5$d$a$a$a;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "stepName", "Lkotlin/Function2;", "Lxn/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "onComplete", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onError", "<init>", "(Lmq/q5$d$a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Ljava/lang/String;", "getSessionToken", "()Ljava/lang/String;", "c", "getInquiryId", "d", "getStepName", "e", "Lkotlin/jvm/functions/Function2;", "getOnComplete", "()Lkotlin/jvm/functions/Function2;", "f", "Lkotlin/jvm/functions/Function1;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0468a extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final String sessionToken;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final String inquiryId;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final String stepName;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function2<xn.a, Boolean, Unit> onComplete;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0468a(@NotNull b overlay, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull Function2<? super xn.a, ? super Boolean, Unit> onComplete, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
                        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                        Intrinsics.checkNotNullParameter(stepName, "stepName");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.sessionToken = sessionToken;
                        this.inquiryId = inquiryId;
                        this.stepName = stepName;
                        this.onComplete = onComplete;
                        this.onError = onError;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$b */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lmq/q5$d$a$a$b;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", BuildConfig.FLAVOR, "isCapturing", "<init>", "(Lmq/q5$d$a$b;Z)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class b extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(@NotNull b overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.isCapturing = z10;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$c */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lmq/q5$d$a$a$c;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", BuildConfig.FLAVOR, "countDown", "<init>", "(Lmq/q5$d$a$b;I)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "I", "()I", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class c extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final int countDown;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(@NotNull b overlay, int i10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.countDown = i10;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$d, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmq/q5$d$a$a$d;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", "Lkotlin/Function1;", "Ljava/io/File;", BuildConfig.FLAVOR, "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", BuildConfig.FLAVOR, "startFinalize", "<init>", "(Lmq/q5$d$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "d", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0469d extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean startFinalize;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0469d(@NotNull b overlay, @NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        this.overlay = overlay;
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z10;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function1<File, Unit> b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$e */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmq/q5$d$a$a$e;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "processImage", BuildConfig.FLAVOR, "onError", BuildConfig.FLAVOR, "forceCapture", "isCapturing", "<init>", "(Lmq/q5$d$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "c", "Z", "()Z", "e", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class e extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean forceCapture;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public e(@NotNull b overlay, @NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z10;
                        this.isCapturing = z11;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> d() {
                        return this.processImage;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$f */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/q5$d$a$a$f;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onCaptureClicked", "<init>", "(Lmq/q5$d$a$b;Lkotlin/jvm/functions/Function0;)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class f extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull b overlay, @NotNull Function0<Unit> onCaptureClicked) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        this.overlay = overlay;
                        this.onCaptureClicked = onCaptureClicked;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.onCaptureClicked;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$g */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/q5$d$a$a$g;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", "Lkotlin/Function0;", BuildConfig.FLAVOR, "poseHintComplete", "<init>", "(Lmq/q5$d$a$b;Lkotlin/jvm/functions/Function0;)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class g extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(@NotNull b overlay, @NotNull Function0<Unit> poseHintComplete) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        this.overlay = overlay;
                        this.poseHintComplete = poseHintComplete;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.poseHintComplete;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$h */
                @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lmq/q5$d$a$a$h;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", BuildConfig.FLAVOR, "recordLocalVideo", BuildConfig.FLAVOR, "maxRecordingLengthMs", "Lkotlin/Function1;", "Lsn/v;", BuildConfig.FLAVOR, "previewReady", BuildConfig.FLAVOR, "onError", "<init>", "(Lmq/q5$d$a$b;ZJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Z", "e", "()Z", "c", "J", "()J", "d", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class h extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<sn.v, Unit> previewReady;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public h(@NotNull b overlay, boolean z10, long j10, @NotNull Function1<? super sn.v, Unit> previewReady, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.recordLocalVideo = z10;
                        this.maxRecordingLengthMs = j10;
                        this.previewReady = previewReady;
                        this.onError = onError;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<sn.v, Unit> d() {
                        return this.previewReady;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$i */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmq/q5$d$a$a$i;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onComplete", BuildConfig.FLAVOR, "imageCaptured", "<init>", "(Lmq/q5$d$a$b;Lkotlin/jvm/functions/Function0;Z)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class i extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean imageCaptured;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull b overlay, @NotNull Function0<Unit> onComplete, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        this.overlay = overlay;
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onComplete;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$a$a$j */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lmq/q5$d$a$a$j;", "Lmq/q5$d$a$a;", "Lmq/q5$d$a$b;", "overlay", BuildConfig.FLAVOR, "maxRecordingLengthMs", "<init>", "(Lmq/q5$d$a$b;J)V", "a", "Lmq/q5$d$a$b;", "()Lmq/q5$d$a$b;", "b", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class j extends AbstractC0467a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(@NotNull b overlay, long j10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                    }

                    @Override // mq.q5.d.a.AbstractC0467a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ AbstractC0467a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public abstract b getOverlay();

                public AbstractC0467a() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lmq/q5$d$a$b;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum b {
                CLEAR,
                CENTER,
                LOOK_LEFT,
                LOOK_RIGHT,
                LOOK_UP,
                LOOK_DOWN,
                FINALIZING;


                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static final /* synthetic */ hu.a f23910i = hu.b.a(a());
            }

            public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, AbstractC0467a abstractC0467a, StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, ir.a aVar, Function0 function0, Function0 function1, Function1 function2, Function0 function3, zn.a aVar2, ks.a aVar3, boolean z12, sn.a0.a aVar4, un.c.a aVar5, Function1 function4, float f10, xn.b bVar, sn.v.b bVar2, boolean z13, boolean z14, boolean z15, boolean z16, Function1 function5, xn.a aVar6, boolean z17, boolean z18, boolean z19, mq.c cVar, String str10, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, z10, abstractC0467a, selfieStepStyle, z11, aVar, function0, function1, function2, function3, aVar2, aVar3, z12, aVar4, aVar5, function4, f10, bVar, bVar2, z13, z14, z15, z16, function5, aVar6, z17, z18, z19, cVar, (i11 & 32) != 0 ? null : str10, (i11 & 64) != 0 ? null : str11);
            }

            /* JADX INFO: renamed from: A, reason: from getter */
            public final boolean getRequestingPermissions() {
                return this.requestingPermissions;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @Nullable
            /* JADX INFO: renamed from: C, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @Nullable
            /* JADX INFO: renamed from: D, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* JADX INFO: renamed from: E, reason: from getter */
            public final zn.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* JADX INFO: renamed from: F, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* JADX INFO: renamed from: G, reason: from getter */
            public final ks.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: H, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }

            /* JADX INFO: renamed from: I, reason: from getter */
            public final boolean getIsAutoCaptureOn() {
                return this.isAutoCaptureOn;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public final boolean getIsAutoFlashOnManualCaptureEnabled() {
                return this.isAutoFlashOnManualCaptureEnabled;
            }

            /* JADX INFO: renamed from: K, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }

            /* JADX INFO: renamed from: L, reason: from getter */
            public final boolean getIsFlashEnabled() {
                return this.isFlashEnabled;
            }

            /* JADX INFO: renamed from: M, reason: from getter */
            public final boolean getIsFlashOn() {
                return this.isFlashOn;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAllowSwitchCamera() {
                return this.allowSwitchCamera;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getAutoCaptureText() {
                return this.autoCaptureText;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final xn.b getBrightnessInfo() {
                return this.brightnessInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final un.c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public final sn.a0.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getCaptureSuccessText() {
                return this.captureSuccessText;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* JADX INFO: renamed from: h, reason: from getter */
            public final mq.c getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getDisclaimerText() {
                return this.disclaimerText;
            }

            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public final sn.v.b getFacingMode() {
                return this.facingMode;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getHintAutoCaptureTimeoutText() {
                return this.hintAutoCaptureTimeoutText;
            }

            @Nullable
            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getHintVerifyingText() {
                return this.hintVerifyingText;
            }

            @Nullable
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final AbstractC0467a getMode() {
                return this.mode;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> q() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> r() {
                return this.onCameraError;
            }

            @NotNull
            public final Function1<sn.v.b, Unit> s() {
                return this.onCameraFacingModeSelected;
            }

            @NotNull
            public final Function0<Unit> t() {
                return this.onCancel;
            }

            @NotNull
            public final Function1<Boolean, Unit> u() {
                return this.onFlashSet;
            }

            @NotNull
            public final Function0<Unit> v() {
                return this.onPermissionChanged;
            }

            @Nullable
            /* JADX INFO: renamed from: w, reason: from getter */
            public final xn.a getPose() {
                return this.pose;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            @Nullable
            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getRealTimeHint() {
                return this.realTimeHint;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z10, @NotNull AbstractC0467a mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull zn.a videoCaptureMethod, @Nullable ks.a aVar, boolean z12, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull Function1<? super sn.v.b, Unit> onCameraFacingModeSelected, float f10, @Nullable xn.b bVar, @NotNull sn.v.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull Function1<? super Boolean, Unit> onFlashSet, @Nullable xn.a aVar2, boolean z17, boolean z18, boolean z19, @NotNull mq.c designVersion, @Nullable String str10, @Nullable String str11) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
                Intrinsics.checkNotNullParameter(onCameraFacingModeSelected, "onCameraFacingModeSelected");
                Intrinsics.checkNotNullParameter(facingMode, "facingMode");
                Intrinsics.checkNotNullParameter(onFlashSet, "onFlashSet");
                Intrinsics.checkNotNullParameter(designVersion, "designVersion");
                this.title = str;
                this.message = str2;
                this.description = str3;
                this.autoCaptureText = str4;
                this.captureSuccessText = str5;
                this.disclaimerText = str6;
                this.realTimeHint = str7;
                this.hintAutoCaptureTimeoutText = str8;
                this.hintVerifyingText = str9;
                this.isAutoCaptureOn = z10;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.requireStrictSelfieCapture = z11;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = aVar;
                this.isAudioRequired = z12;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ControllerFactory = camera2ControllerFactory;
                this.onCameraFacingModeSelected = onCameraFacingModeSelected;
                this.poseScore = f10;
                this.brightnessInfo = bVar;
                this.facingMode = facingMode;
                this.isFlashEnabled = z13;
                this.isAutoFlashOnManualCaptureEnabled = z14;
                this.isFlashOn = z15;
                this.isDimLightConditions = z16;
                this.onFlashSet = onFlashSet;
                this.pose = aVar2;
                this.requestingPermissions = z17;
                this.recordingLocallyRequired = z18;
                this.allowSwitchCamera = z19;
                this.designVersion = designVersion;
                this.watermarkText = str10;
                this.navBarTitle = str11;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b/\u00108R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b)\u00108R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b,\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b3\u00108¨\u00069"}, d2 = {"Lmq/q5$d$b;", "Lmq/q5$d;", BuildConfig.FLAVOR, Title.type, "prompt", "disclosure", "start", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "instructionAsset", "Lir/a;", "navigationState", "Lmq/z0;", "selfieType", BuildConfig.FLAVOR, "Lrq/a;", "orderedPoses", "navBarTitle", "errorMessage", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onClick", "onBack", "onCancel", "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lir/a;Lmq/z0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "k", "c", "d", "m", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "g", "Lir/a;", "()Lir/a;", "h", "Lmq/z0;", "l", "()Lmq/z0;", "i", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String disclosure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String start;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final RemoteImage instructionAsset;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final z0 selfieType;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<PoseInfo> orderedPoses;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String errorMessage;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onClick;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String title, @NotNull String prompt, @NotNull String disclosure, @NotNull String start, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @Nullable RemoteImage remoteImage, @NotNull ir.a navigationState, @NotNull z0 selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable String str, @Nullable String str2, @NotNull Function0<Unit> onClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onErrorDismissed) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(start, "start");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(selfieType, "selfieType");
                Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.start = start;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.selfieType = selfieType;
                this.orderedPoses = orderedPoses;
                this.navBarTitle = str;
                this.errorMessage = str2;
                this.onClick = onClick;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onErrorDismissed = onErrorDismissed;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final RemoteImage getInstructionAsset() {
                return this.instructionAsset;
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
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> g() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> i() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final List<PoseInfo> j() {
                return this.orderedPoses;
            }

            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            /* JADX INFO: renamed from: l, reason: from getter */
            public final z0 getSelfieType() {
                return this.selfieType;
            }

            @NotNull
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getStart() {
                return this.start;
            }

            @Nullable
            /* JADX INFO: renamed from: n, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\u0018\u00002\u00020\u0001:\u0003*,&BÓ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b&\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010>R'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00158\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b?\u0010BR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bC\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\bK\u00108R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b(\u0010L\u001a\u0004\b,\u0010MR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b*\u0010OR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bD\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010'\u001a\u0004\bP\u0010)R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\b5\u0010)¨\u0006Q"}, d2 = {"Lmq/q5$d$c;", "Lmq/q5$d;", BuildConfig.FLAVOR, Title.type, "message", "Lmq/q5$d$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lmq/q5$d$c$a;", "assetOverrides", BuildConfig.FLAVOR, "requireStrictSelfieCapture", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lzn/a;", "videoCaptureMethod", "Lks/a;", "webRtcManager", "isAudioRequired", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "recordingLocallyRequired", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq/q5$d$c$b;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lmq/q5$d$c$a;ZLir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lzn/a;Lks/a;ZLsn/a0$a;Lun/c$a;ZLjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "d", "c", "Lmq/q5$d$c$b;", "e", "()Lmq/q5$d$c$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lmq/q5$d$c$a;", "()Lmq/q5$d$c$a;", "f", "Z", "m", "()Z", "g", "Lir/a;", "()Lir/a;", "h", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "i", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "l", "Lzn/a;", "p", "()Lzn/a;", "Lks/a;", "r", "()Lks/a;", "s", "Lsn/a0$a;", "()Lsn/a0$a;", "Lun/c$a;", "()Lun/c$a;", "q", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final b mode;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AssetOverrides assetOverrides;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final zn.a videoCaptureMethod;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final ks.a webRtcManager;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            public final boolean isAudioRequired;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final sn.a0.a cameraXControllerFactory;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final un.c.a camera2ControllerFactory;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: mq.q5$d$c$a, reason: from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmq/q5$d$c$a;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "b", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AssetOverrides {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @Nullable
                public final RemoteImage leftPoseImage;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final RemoteImage rightPoseImage;

                public AssetOverrides(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                @Nullable
                /* JADX INFO: renamed from: a, reason: from getter */
                public final RemoteImage getLeftPoseImage() {
                    return this.leftPoseImage;
                }

                @Nullable
                /* JADX INFO: renamed from: b, reason: from getter */
                public final RemoteImage getRightPoseImage() {
                    return this.rightPoseImage;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) other;
                    return Intrinsics.c(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.c(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u0005\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lmq/q5$d$c$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lmq/q5$d$c$c;", "a", "()Lmq/q5$d$c$c;", "overlay", "g", "i", "f", "b", "h", "d", "e", "c", "Lmq/q5$d$c$b$a;", "Lmq/q5$d$c$b$b;", "Lmq/q5$d$c$b$c;", "Lmq/q5$d$c$b$d;", "Lmq/q5$d$c$b$e;", "Lmq/q5$d$c$b$f;", "Lmq/q5$d$c$b$g;", "Lmq/q5$d$c$b$h;", "Lmq/q5$d$c$b$i;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static abstract class b {

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmq/q5$d$c$b$a;", "Lmq/q5$d$c$b;", "Lmq/q5$d$c$c;", "overlay", BuildConfig.FLAVOR, "showProgress", "isCapturing", "<init>", "(Lmq/q5$d$c$c;ZZ)V", "a", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "b", "Z", "()Z", "c", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class a extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(@NotNull EnumC0473c overlay, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.isCapturing = z11;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$c$b$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmq/q5$d$c$b$b;", "Lmq/q5$d$c$b;", BuildConfig.FLAVOR, "countDown", "Lmq/q5$d$c$c;", "overlay", BuildConfig.FLAVOR, "showProgress", "<init>", "(ILmq/q5$d$c$c;Z)V", "a", "I", "b", "()I", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0470b extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    public final int countDown;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0470b(int i10, @NotNull EnumC0473c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.countDown = i10;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$c$b$c, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lmq/q5$d$c$b$c;", "Lmq/q5$d$c$b;", "Lkotlin/Function1;", "Ljava/io/File;", BuildConfig.FLAVOR, "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", BuildConfig.FLAVOR, "startFinalize", "Lmq/q5$d$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLmq/q5$d$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "e", "()Z", "d", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0471c extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean startFinalize;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0471c(@NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10, @NotNull EnumC0473c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function1<File, Unit> b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: mq.q5$d$c$b$d, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BQ\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lmq/q5$d$c$b$d;", "Lmq/q5$d$c$b;", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "processImage", BuildConfig.FLAVOR, "onError", BuildConfig.FLAVOR, "forceCapture", "Lmq/q5$d$c$c;", "overlay", "showProgress", "isCapturing", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLmq/q5$d$c$c;ZZ)V", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "c", "Z", "()Z", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "e", "f", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0472d extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean forceCapture;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    public /* synthetic */ C0472d(Function1 function1, Function1 function2, boolean z10, EnumC0473c enumC0473c, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(function1, function2, (i10 & 4) != 0 ? false : z10, enumC0473c, z11, z12);
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> d() {
                        return this.processImage;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0472d(@NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, @NotNull EnumC0473c overlay, boolean z11, boolean z12) {
                        super(null);
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                        this.isCapturing = z12;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmq/q5$d$c$b$e;", "Lmq/q5$d$c$b;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onCaptureClicked", "Lmq/q5$d$c$c;", "overlay", BuildConfig.FLAVOR, "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lmq/q5$d$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class e extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(@NotNull Function0<Unit> onCaptureClicked, @NotNull EnumC0473c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onCaptureClicked = onCaptureClicked;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.onCaptureClicked;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmq/q5$d$c$b$f;", "Lmq/q5$d$c$b;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "poseHintComplete", "Lmq/q5$d$c$c;", "overlay", BuildConfig.FLAVOR, "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lmq/q5$d$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class f extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull Function0<Unit> poseHintComplete, @NotNull EnumC0473c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.poseHintComplete = poseHintComplete;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.poseHintComplete;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001f"}, d2 = {"Lmq/q5$d$c$b$g;", "Lmq/q5$d$c$b;", "Lkotlin/Function1;", "Lsn/v;", BuildConfig.FLAVOR, "previewReady", "Lmq/q5$d$c$c;", "overlay", BuildConfig.FLAVOR, "showProgress", "recordLocalVideo", BuildConfig.FLAVOR, "maxRecordingLengthMs", BuildConfig.FLAVOR, "onError", "<init>", "(Lkotlin/jvm/functions/Function1;Lmq/q5$d$c$c;ZZJLkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "c", "Z", "f", "()Z", "e", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class g extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<sn.v, Unit> previewReady;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public g(@NotNull Function1<? super sn.v, Unit> previewReady, @NotNull EnumC0473c overlay, boolean z10, boolean z11, long j10, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.previewReady = previewReady;
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.recordLocalVideo = z11;
                        this.maxRecordingLengthMs = j10;
                        this.onError = onError;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<sn.v, Unit> d() {
                        return this.previewReady;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lmq/q5$d$c$b$h;", "Lmq/q5$d$c$b;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onComplete", BuildConfig.FLAVOR, "imageCaptured", "Lmq/q5$d$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;ZLmq/q5$d$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "b", "Z", "()Z", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "d", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class h extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean imageCaptured;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(@NotNull Function0<Unit> onComplete, boolean z10, @NotNull EnumC0473c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmq/q5$d$c$b$i;", "Lmq/q5$d$c$b;", "Lmq/q5$d$c$c;", "overlay", BuildConfig.FLAVOR, "maxRecordingLengthMs", BuildConfig.FLAVOR, "showProgress", "<init>", "(Lmq/q5$d$c$c;JZ)V", "a", "Lmq/q5$d$c$c;", "()Lmq/q5$d$c$c;", "b", "J", "()J", "c", "Z", "getShowProgress", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class i extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0473c overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull EnumC0473c overlay, long j10, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                        this.showProgress = z10;
                    }

                    @Override // mq.q5.d.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0473c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public abstract EnumC0473c getOverlay();

                public b() {
                }
            }

            /* JADX INFO: renamed from: mq.q5$d$c$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lmq/q5$d$c$c;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum EnumC0473c {
                CLEAR,
                CENTER,
                CENTER_COMPLETE,
                LOOK_LEFT_HINT,
                LOOK_LEFT,
                LOOK_LEFT_COMPLETE,
                LOOK_RIGHT_HINT,
                LOOK_RIGHT,
                LOOK_RIGHT_COMPLETE,
                LOOK_UP_HINT,
                LOOK_UP,
                LOOK_UP_COMPLETE,
                LOOK_DOWN_HINT,
                LOOK_DOWN,
                LOOK_DOWN_COMPLETE,
                FINALIZING,
                COMPLETE_WITH_CAPTURE,
                COMPLETE;


                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public static final /* synthetic */ hu.a f23989t = hu.b.a(a());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(@Nullable String str, @Nullable String str2, @NotNull b mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull AssetOverrides assetOverrides, boolean z10, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull zn.a videoCaptureMethod, @Nullable ks.a aVar, boolean z11, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, boolean z12, @Nullable String str3, @Nullable String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
                this.title = str;
                this.message = str2;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z10;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = aVar;
                this.isAudioRequired = z11;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ControllerFactory = camera2ControllerFactory;
                this.recordingLocallyRequired = z12;
                this.watermarkText = str3;
                this.navBarTitle = str4;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AssetOverrides getAssetOverrides() {
                return this.assetOverrides;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final un.c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final sn.a0.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            @Nullable
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public final b getMode() {
                return this.mode;
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: g, reason: from getter */
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> i() {
                return this.onCameraError;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> k() {
                return this.onPermissionChanged;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @Nullable
            /* JADX INFO: renamed from: n, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public final zn.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* JADX INFO: renamed from: r, reason: from getter */
            public final ks.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }
        }

        /* JADX INFO: renamed from: mq.q5$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0010\u0010\u001f¨\u0006 "}, d2 = {"Lmq/q5$d$d;", "Lmq/q5$d;", "Lor/i;", "uiScreen", "Lir/a;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", BuildConfig.FLAVOR, "navBarTitle", "<init>", "(Lor/i;Lir/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "a", "Lor/i;", "f", "()Lor/i;", "b", "Lir/a;", "()Lir/a;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "e", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0474d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0474d(@NotNull UiComponentScreen uiScreen, @NotNull ir.a navigationState, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.uiScreen = uiScreen;
                this.navigationState = navigationState;
                this.styles = selfieStepStyle;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onCancel;
            }

            @Nullable
            /* JADX INFO: renamed from: e, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final UiComponentScreen getUiScreen() {
                return this.uiScreen;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lmq/q5$d$e;", "Lmq/q5$d;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "rendered", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> rendered;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Function0<Unit> rendered) {
                super(null);
                Intrinsics.checkNotNullParameter(rendered, "rendered");
                this.rendered = rendered;
            }

            @NotNull
            public final Function0<Unit> a() {
                return this.rendered;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u0015Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001d\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b!\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b\u0015\u0010)¨\u0006*"}, d2 = {"Lmq/q5$d$f;", "Lmq/q5$d;", "Lmq/q5$d$f$a;", "strings", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onUsePhotos", "onRetakePhotos", "onBack", "onCancel", BuildConfig.FLAVOR, "navBarTitle", "<init>", "(Lmq/q5$d$f$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "a", "Lmq/q5$d$f$a;", "h", "()Lmq/q5$d$f$a;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lir/a;", "()Lir/a;", "e", "Lkotlin/jvm/functions/Function0;", "f", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Strings strings;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final List<b0> selfies;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onUsePhotos;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetakePhotos;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: mq.q5$d$f$a, reason: from toString */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006!"}, d2 = {"Lmq/q5$d$f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, Title.type, "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "selfieLabelUp", "selfieLabelDown", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "c", "d", "e", "f", "g", "h", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Strings {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String title;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @NotNull
                public final String description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelFront;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelLeft;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelRight;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelUp;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelDown;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String submitButton;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String retakeButton;

                public Strings(@NotNull String title, @NotNull String description, @NotNull String selfieLabelFront, @NotNull String selfieLabelLeft, @NotNull String selfieLabelRight, @NotNull String selfieLabelUp, @NotNull String selfieLabelDown, @NotNull String submitButton, @NotNull String retakeButton) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(selfieLabelFront, "selfieLabelFront");
                    Intrinsics.checkNotNullParameter(selfieLabelLeft, "selfieLabelLeft");
                    Intrinsics.checkNotNullParameter(selfieLabelRight, "selfieLabelRight");
                    Intrinsics.checkNotNullParameter(selfieLabelUp, "selfieLabelUp");
                    Intrinsics.checkNotNullParameter(selfieLabelDown, "selfieLabelDown");
                    Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                    Intrinsics.checkNotNullParameter(retakeButton, "retakeButton");
                    this.title = title;
                    this.description = description;
                    this.selfieLabelFront = selfieLabelFront;
                    this.selfieLabelLeft = selfieLabelLeft;
                    this.selfieLabelRight = selfieLabelRight;
                    this.selfieLabelUp = selfieLabelUp;
                    this.selfieLabelDown = selfieLabelDown;
                    this.submitButton = submitButton;
                    this.retakeButton = retakeButton;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                @NotNull
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getRetakeButton() {
                    return this.retakeButton;
                }

                @NotNull
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getSelfieLabelDown() {
                    return this.selfieLabelDown;
                }

                @NotNull
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getSelfieLabelFront() {
                    return this.selfieLabelFront;
                }

                @NotNull
                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getSelfieLabelLeft() {
                    return this.selfieLabelLeft;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) other;
                    return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.description, strings.description) && Intrinsics.c(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.c(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.c(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.c(this.selfieLabelUp, strings.selfieLabelUp) && Intrinsics.c(this.selfieLabelDown, strings.selfieLabelDown) && Intrinsics.c(this.submitButton, strings.submitButton) && Intrinsics.c(this.retakeButton, strings.retakeButton);
                }

                @NotNull
                /* JADX INFO: renamed from: f, reason: from getter */
                public final String getSelfieLabelRight() {
                    return this.selfieLabelRight;
                }

                @NotNull
                /* JADX INFO: renamed from: g, reason: from getter */
                public final String getSelfieLabelUp() {
                    return this.selfieLabelUp;
                }

                @NotNull
                /* JADX INFO: renamed from: h, reason: from getter */
                public final String getSubmitButton() {
                    return this.submitButton;
                }

                public int hashCode() {
                    return (((((((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.selfieLabelFront.hashCode()) * 31) + this.selfieLabelLeft.hashCode()) * 31) + this.selfieLabelRight.hashCode()) * 31) + this.selfieLabelUp.hashCode()) * 31) + this.selfieLabelDown.hashCode()) * 31) + this.submitButton.hashCode()) * 31) + this.retakeButton.hashCode();
                }

                @NotNull
                /* JADX INFO: renamed from: i, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public String toString() {
                    return "Strings(title=" + this.title + ", description=" + this.description + ", selfieLabelFront=" + this.selfieLabelFront + ", selfieLabelLeft=" + this.selfieLabelLeft + ", selfieLabelRight=" + this.selfieLabelRight + ", selfieLabelUp=" + this.selfieLabelUp + ", selfieLabelDown=" + this.selfieLabelDown + ", submitButton=" + this.submitButton + ", retakeButton=" + this.retakeButton + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(@NotNull Strings strings, @NotNull List<? extends b0> selfies, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull ir.a navigationState, @NotNull Function0<Unit> onUsePhotos, @NotNull Function0<Unit> onRetakePhotos, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(strings, "strings");
                Intrinsics.checkNotNullParameter(selfies, "selfies");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onUsePhotos, "onUsePhotos");
                Intrinsics.checkNotNullParameter(onRetakePhotos, "onRetakePhotos");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.strings = strings;
                this.selfies = selfies;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = onUsePhotos;
                this.onRetakePhotos = onRetakePhotos;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final ir.a getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onRetakePhotos;
            }

            @NotNull
            public final Function0<Unit> f() {
                return this.onUsePhotos;
            }

            @NotNull
            public final List<b0> g() {
                return this.selfies;
            }

            @NotNull
            /* JADX INFO: renamed from: h, reason: from getter */
            public final Strings getStrings() {
                return this.strings;
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b!\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b&\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b;\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b8\u0010=R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b5\u00103¨\u0006>"}, d2 = {"Lmq/q5$d$g;", "Lmq/q5$d;", BuildConfig.FLAVOR, Title.type, "Ler/c;", "sdkFilesManager", "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lmq/c;", "designVersion", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "<init>", "(Ljava/lang/String;Ler/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lmq/c;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "b", "Ler/c;", "l", "()Ler/c;", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "m", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lir/a;", "()Lir/a;", "g", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "h", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "k", "Lmq/c;", "()Lmq/c;", "o", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final er.c sdkFilesManager;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ir.a navigationState;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final RemoteImage customLoadingAsset;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final mq.c designVersion;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String centerSelfieFilePath;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String uploadScanningHintText;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final InternalErrorInfo recoverableSubmitError;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetrySubmit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@NotNull String title, @NotNull er.c sdkFilesManager, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable RemoteImage remoteImage, @Nullable String str, @NotNull mq.c designVersion, @Nullable String str2, @Nullable String str3, @Nullable InternalErrorInfo internalErrorInfo, @NotNull Function0<Unit> onRetrySubmit) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(designVersion, "designVersion");
                Intrinsics.checkNotNullParameter(onRetrySubmit, "onRetrySubmit");
                this.title = title;
                this.sdkFilesManager = sdkFilesManager;
                this.description = description;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.customLoadingAsset = remoteImage;
                this.navBarTitle = str;
                this.designVersion = designVersion;
                this.centerSelfieFilePath = str2;
                this.uploadScanningHintText = str3;
                this.recoverableSubmitError = internalErrorInfo;
                this.onRetrySubmit = onRetrySubmit;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCenterSelfieFilePath() {
                return this.centerSelfieFilePath;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final RemoteImage getCustomLoadingAsset() {
                return this.customLoadingAsset;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final mq.c getDesignVersion() {
                return this.designVersion;
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
            public final Function0<Unit> i() {
                return this.onRetrySubmit;
            }

            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final InternalErrorInfo getRecoverableSubmitError() {
                return this.recoverableSubmitError;
            }

            @NotNull
            /* JADX INFO: renamed from: l, reason: from getter */
            public final er.c getSdkFilesManager() {
                return this.sdkFilesManager;
            }

            @Nullable
            /* JADX INFO: renamed from: m, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getUploadScanningHintText() {
                return this.uploadScanningHintText;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24026a;
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
            f24026a = iArr;
            int[] iArr2 = new int[h0.values().length];
            try {
                iArr2[h0.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h0.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h0.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h0.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[h0.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", f = "SelfieWorkflow.kt", l = {165}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24027t;

        public f(eu.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return q5.this.new f(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f24027t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.m mVar = sn.m.f31643a;
                Context context = q5.this.applicationContext;
                this.f24027t = 1;
                if (mVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ks.a aVar = q5.this.webRtcManager;
            if (aVar != null) {
                aVar.e();
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", f = "SelfieWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24029t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24030u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5 f24031v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, q5 q5Var, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f24030u = aVar;
            this.f24031v = q5Var;
        }

        public static final Unit p(q5 q5Var, ln.r.c cVar) {
            q5Var.Z3(cVar);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f24030u, this.f24031v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f24029t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super Input, y0, ? extends c>> hVarD = this.f24030u.d();
            final q5 q5Var = this.f24031v;
            hVarD.a(ln.z.d(q5Var, null, new Function1() { // from class: mq.r5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.g.p(q5Var, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderAcquireNextPose$1", f = "SelfieWorkflow.kt", l = {493}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24032t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f24034v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24035w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(int i10, ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f24034v = i10;
            this.f24035w = aVar;
        }

        public static final Unit p(q5 q5Var, PoseInfo poseInfo, ln.r.c cVar) {
            Object objC = cVar.c();
            y0.AcquireNextPose acquireNextPose = objC instanceof y0.AcquireNextPose ? (y0.AcquireNextPose) objC : null;
            if (acquireNextPose == null) {
                return Unit.f21506a;
            }
            cVar.e(q5Var.x1(cVar, y0.AcquireNextPose.z(acquireNextPose, null, 0L, null, null, null, false, p001kotlin.collections.o.d(poseInfo), null, false, 447, null), null));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return q5.this.new h(this.f24034v, this.f24035w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = fu.c.e();
            int i10 = this.f24032t;
            if (i10 == 0) {
                zt.o.b(obj);
                rq.b bVar = q5.this.selfiePoseManager;
                if (bVar == null) {
                    Intrinsics.u("selfiePoseManager");
                    bVar = null;
                }
                int i11 = this.f24034v;
                this.f24032t = 1;
                objK = bVar.k(i11, this);
                if (objK == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                objK = ((zt.n) obj).getValue();
            }
            ln.k<Input, y0, c, Object>.a aVar = this.f24035w;
            final q5 q5Var = q5.this;
            if (zt.n.h(objK)) {
                final PoseInfo poseInfo = (PoseInfo) objK;
                aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.s5
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return q5.h.p(q5Var, poseInfo, (ln.r.c) obj2);
                    }
                }, 1, null));
            }
            q5 q5Var2 = q5.this;
            ln.k<Input, y0, c, Object>.a aVar2 = this.f24035w;
            Throwable thE = zt.n.e(objK);
            if (thE != null) {
                q5Var2.W3(aVar2, thE);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$1", f = "SelfieWorkflow.kt", l = {1379, 1381}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f24036t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f24037u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y0.Capture f24038v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q5 f24039w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24040x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(y0.Capture capture, q5 q5Var, ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, eu.b<? super i> bVar) {
            super(2, bVar);
            this.f24038v = capture;
            this.f24039w = q5Var;
            this.f24040x = aVar;
        }

        public static final Unit p(y0.Capture capture, ln.r.c cVar) {
            Object objC = cVar.c();
            y0.Capture capture2 = objC instanceof y0.Capture ? (y0.Capture) objC : null;
            if (capture2 != null && Intrinsics.c(capture2.getCaptureDeadlineEpochMs(), capture.getCaptureDeadlineEpochMs())) {
                tq.l2.c(capture2);
                if (((Input) cVar.b()).getSkipPromptPage()) {
                    cVar.e(new y0.AcquireNextPose(capture2.getCameraProperties(), capture2.getStartSelfieTimestamp(), p001kotlin.collections.p.k(), j6.k(cVar, false), capture2.getCameraFacingMode(), capture2.getIsFlashEnabled(), capture2.i(), capture2.getPoseConfigs(), capture2.getAutoCaptureSupported()));
                } else {
                    cVar.e(new y0.ShowInstructions(null, null, null, 6, null));
                }
                return Unit.f21506a;
            }
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new i(this.f24038v, this.f24039w, this.f24040x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            if (r10.o(r9) == r0) goto L18;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            Object objE = fu.c.e();
            int i10 = this.f24037u;
            if (i10 == 0) {
                zt.o.b(obj);
                jLongValue = this.f24038v.getCaptureDeadlineEpochMs().longValue() - System.currentTimeMillis();
                p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                long jQ = p001kotlin.time.b.q(jLongValue, zu.b.MILLISECONDS);
                this.f24036t = jLongValue;
                this.f24037u = 1;
                if (av.z0.c(jQ, this) != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                jLongValue = this.f24036t;
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f24039w.selfieEventLogger.n();
            ln.h<ln.r<? super Input, y0, ? extends c>> hVarD = this.f24040x.d();
            q5 q5Var = this.f24039w;
            final y0.Capture capture = this.f24038v;
            hVarD.a(ln.z.d(q5Var, null, new Function1() { // from class: mq.t5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.i.p(capture, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
            rq.b bVar = this.f24039w.selfiePoseManager;
            if (bVar == null) {
                Intrinsics.u("selfiePoseManager");
                bVar = null;
            }
            this.f24036t = jLongValue;
            this.f24037u = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3", f = "SelfieWorkflow.kt", l = {1537}, m = "invokeSuspend")
    public static final class j extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24041t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24042u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5 f24043v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, q5 q5Var, eu.b<? super j> bVar) {
            super(2, bVar);
            this.f24042u = aVar;
            this.f24043v = q5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(ln.r.c cVar) {
            Object objC = cVar.c();
            y0.Capture capture = objC instanceof y0.Capture ? (y0.Capture) objC : null;
            if (capture == null) {
                return Unit.f21506a;
            }
            cVar.e(capture.y((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : y0.h.ReadyToCapture, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new j(this.f24042u, this.f24043v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f24041t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f24041t = 1;
                if (av.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f24042u.d().a(ln.z.d(this.f24043v, null, new Function1() { // from class: mq.u5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.j.p((ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$4", f = "SelfieWorkflow.kt", l = {1551}, m = "invokeSuspend")
    public static final class k extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24044t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24045u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5 f24046v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, q5 q5Var, eu.b<? super k> bVar) {
            super(2, bVar);
            this.f24045u = aVar;
            this.f24046v = q5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(ln.r.c cVar) {
            Object objC = cVar.c();
            y0.Capture capture = objC instanceof y0.Capture ? (y0.Capture) objC : null;
            if (capture == null) {
                return Unit.f21506a;
            }
            cVar.e(capture.y((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : y0.h.Enabled, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new k(this.f24045u, this.f24046v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f24044t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f24044t = 1;
                if (av.z0.b(3000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f24045u.d().a(ln.z.d(this.f24046v, null, new Function1() { // from class: mq.v5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.k.p((ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", f = "SelfieWorkflow.kt", l = {1187}, m = "invokeSuspend")
    public static final class l extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f24047t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f24048u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Input f24049v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24050w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ q5 f24051x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ y0.CountdownToCapture f24052y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Input input, ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, q5 q5Var, y0.CountdownToCapture countdownToCapture, eu.b<? super l> bVar) {
            super(2, bVar);
            this.f24049v = input;
            this.f24050w = aVar;
            this.f24051x = q5Var;
            this.f24052y = countdownToCapture;
        }

        public static final Unit p(long j10, y0.CountdownToCapture countdownToCapture, Input input, ln.r.c cVar) {
            Object objC = cVar.c();
            y0.CountdownToCapture countdownToCapture2 = objC instanceof y0.CountdownToCapture ? (y0.CountdownToCapture) objC : null;
            if (countdownToCapture2 == null) {
                return Unit.f21506a;
            }
            int countDown = countdownToCapture2.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                cVar.e(new y0.Capture(countdownToCapture2.getSelfieError(), countdownToCapture.getPoseScore(), countdownToCapture.getBrightnessInfo(), countdownToCapture2.w(), countdownToCapture2.i(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), j6.k(cVar, false), input.getPoseConfigs(), countdownToCapture.getCameraFacingMode(), countdownToCapture.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24640, null));
            } else {
                cVar.e(countdownToCapture2.y((32764 & 1) != 0 ? countdownToCapture2.countDown : countDown - 1, (32764 & 2) != 0 ? countdownToCapture2.selfieError : countdownToCapture2.getSelfieError(), (32764 & 4) != 0 ? countdownToCapture2.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture2.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture2.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture2.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture2.brightnessInfo : null, (32764 & Barcode.FORMAT_ITF) != 0 ? countdownToCapture2.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture2.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture2.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture2.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture2.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture2.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture2.isFlashEnabled : false, (32764 & 16384) != 0 ? countdownToCapture2.isDimLightConditions : false));
            }
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new l(this.f24049v, this.f24050w, this.f24051x, this.f24052y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            final long j10;
            Object objE = fu.c.e();
            int i10 = this.f24048u;
            if (i10 == 0) {
                zt.o.b(obj);
                long jA = b1.a(this.f24049v);
                this.f24047t = jA;
                this.f24048u = 1;
                if (av.z0.b(jA, this) == objE) {
                    return objE;
                }
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f24047t;
                zt.o.b(obj);
            }
            ln.h<ln.r<? super Input, y0, ? extends c>> hVarD = this.f24050w.d();
            q5 q5Var = this.f24051x;
            final y0.CountdownToCapture countdownToCapture = this.f24052y;
            final Input input = this.f24049v;
            hVarD.a(ln.z.d(q5Var, null, new Function1() { // from class: mq.w5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.l.p(j10, countdownToCapture, input, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", f = "SelfieWorkflow.kt", l = {1282}, m = "invokeSuspend")
    public static final class m extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24053t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24054u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q5 f24055v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, q5 q5Var, eu.b<? super m> bVar) {
            super(2, bVar);
            this.f24054u = aVar;
            this.f24055v = q5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(ln.r.c cVar) {
            Object objC = cVar.c();
            y0.CountdownToManualCapture countdownToManualCapture = objC instanceof y0.CountdownToManualCapture ? (y0.CountdownToManualCapture) objC : null;
            if (countdownToManualCapture == null) {
                return Unit.f21506a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                cVar.e(countdownToManualCapture.y((4092 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & Barcode.FORMAT_ITF) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : false, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false));
            }
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new m(this.f24054u, this.f24055v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((m) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f24053t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f24053t = 1;
                if (av.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            this.f24054u.d().a(ln.z.d(this.f24055v, null, new Function1() { // from class: mq.x5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.m.p((ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", f = "SelfieWorkflow.kt", l = {2130}, m = "invokeSuspend")
    public static final class n extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24056t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.y f24057u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ln.k<Input, y0, c, Object>.a f24058v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q5 f24059w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(p001kotlin.jvm.internal.y yVar, ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, q5 q5Var, eu.b<? super n> bVar) {
            super(2, bVar);
            this.f24057u = yVar;
            this.f24058v = aVar;
            this.f24059w = q5Var;
        }

        public static final Unit p(p001kotlin.jvm.internal.y yVar, ln.r.c cVar) {
            Parcelable parcelable = (y0) cVar.c();
            if ((parcelable instanceof b) && ((b) parcelable).o()) {
                cVar.e(parcelable);
                yVar.f21591a = false;
            }
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new n(this.f24057u, this.f24058v, this.f24059w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r5.f24056t
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
                kotlin.jvm.internal.y r6 = r5.f24057u
                boolean r6 = r6.f21591a
                if (r6 == 0) goto L43
                r5.f24056t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = av.z0.b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                ln.k<mq.q5$b, mq.y0, mq.q5$c, java.lang.Object>$a r6 = r5.f24058v
                ln.h r6 = r6.d()
                mq.q5 r1 = r5.f24059w
                kotlin.jvm.internal.y r3 = r5.f24057u
                mq.y5 r4 = new mq.y5
                r4.<init>()
                r3 = 0
                ln.r r1 = ln.w.g(r1, r3, r4, r2, r3)
                r6.a(r1)
                goto L1a
            L43:
                kotlin.Unit r6 = p001kotlin.Unit.f21506a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mq.q5.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public q5(@NotNull Context applicationContext, @NotNull qq.c.a submitVerificationWorker, @NotNull js.b.a webRtcWorkerFactory, @NotNull c0.b selfieAnalyzeWorker, @NotNull fq.n1 permissionRequestWorkflow, @NotNull vq.j localVideoCaptureRenderer, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull yn.a cameraStatsManager, @NotNull ir.b navigationStateManager, @NotNull pq.a directFileUploader, @NotNull rq.b.InterfaceC0610b selfiePoseManagerFactory, @NotNull gr.b inquiryThemeManager, @NotNull f0 selfieEventLogger, @NotNull er.c sdkFilesManager, @NotNull to.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(submitVerificationWorker, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(selfiePoseManagerFactory, "selfiePoseManagerFactory");
        Intrinsics.checkNotNullParameter(inquiryThemeManager, "inquiryThemeManager");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManagerFactory = selfiePoseManagerFactory;
        this.inquiryThemeManager = inquiryThemeManager;
        this.selfieEventLogger = selfieEventLogger;
        this.sdkFilesManager = sdkFilesManager;
        this.featureFlagManager = featureFlagManager;
        this.webRtcManager = ks.c.b();
    }

    public static final Unit A1(ln.k.a aVar, final q5 q5Var, xn.a aVar2, boolean z10) {
        Intrinsics.checkNotNullParameter(aVar2, "<unused var>");
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.k1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.B1(this.f23646a, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit A2(Input input, y0.j jVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new y0.WaitForCameraFeed(false, false, j6.k(action, false), input.z(), input.getPoseConfigs(), false, jVar.getCameraFacingMode(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit A3(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit B1(q5 q5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.AcquireNextPose acquireNextPose = objC instanceof y0.AcquireNextPose ? (y0.AcquireNextPose) objC : null;
        if (acquireNextPose == null) {
            return Unit.f21506a;
        }
        action.e(q5Var.x1(action, acquireNextPose, null));
        return Unit.f21506a;
    }

    public static final Unit B2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit C1(ln.k.a aVar, q5 q5Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.k5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.D1((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit C2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final ln.r C3(final q5 q5Var, final y0.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final ln.k.a aVar, final js.b.AbstractC0389b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof js.b.AbstractC0389b.C0390b) {
            return ln.z.d(q5Var, null, new Function1() { // from class: mq.a5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.D3(waitForWebRtcSetup, q5Var, it, input, aVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof js.b.AbstractC0389b.Error) {
            return ln.z.d(q5Var, null, new Function1() { // from class: mq.b5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.K3(aVar, q5Var, waitForWebRtcSetup, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit D1(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.AcquireNextPose acquireNextPose = objC instanceof y0.AcquireNextPose ? (y0.AcquireNextPose) objC : null;
        if (acquireNextPose == null) {
            return Unit.f21506a;
        }
        tq.l2.c(acquireNextPose);
        action.e(new y0.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), p001kotlin.collections.p.k(), j6.k(action, false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), acquireNextPose.i(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f21506a;
    }

    public static final Unit D3(final y0.WaitForWebRtcSetup waitForWebRtcSetup, final q5 q5Var, js.b.AbstractC0389b abstractC0389b, final Input input, final ln.k.a aVar, ln.r.c action) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        sn.v cameraProperties = waitForWebRtcSetup.getCameraProperties();
        ks.a aVar2 = q5Var.webRtcManager;
        if (aVar2 != null) {
            aVar2.b(q5Var.webRtcWorkerFactory.getService());
        }
        ks.a aVar3 = q5Var.webRtcManager;
        if (aVar3 != null) {
            aVar3.i(q5Var.applicationContext);
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
        ks.a aVar4 = q5Var.webRtcManager;
        if (aVar4 != null) {
            js.b.AbstractC0389b.C0390b c0390b = (js.b.AbstractC0389b.C0390b) abstractC0389b;
            aVar4.f(c0390b.getResult().getUsername(), c0390b.getResult().getCredential(), c0390b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: mq.o1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q5.E3(aVar, q5Var, input, waitForWebRtcSetup);
                }
            }, new Function0() { // from class: mq.p1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q5.G3(aVar, q5Var, waitForWebRtcSetup);
                }
            }, new Function0() { // from class: mq.q1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q5.I3(this.f23780a, input);
                }
            }, new Function1() { // from class: mq.r1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.J3(this.f24064a, (String) obj);
                }
            });
        }
        return Unit.f21506a;
    }

    public static final Unit E1(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit E2(ln.k.a aVar, final q5 q5Var, final Input input, final y0.ShowInstructions showInstructions) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.z4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.F2(this.f24359a, input, showInstructions, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit E3(ln.k.a aVar, final q5 q5Var, final Input input, final y0.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.t1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.F3(this.f24089a, input, waitForWebRtcSetup, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit F1(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit F2(q5 q5Var, Input input, y0.ShowInstructions showInstructions, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        q5Var.selfieEventLogger.c();
        action.e(new y0.WaitForCameraFeed(false, false, j6.l(action, false, 1, null), input.z(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit F3(q5 q5Var, Input input, y0.WaitForWebRtcSetup waitForWebRtcSetup, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        q5Var.selfieEventLogger.l(input.getFromStep());
        q5Var.selfieEventLogger.b((y0) action.c());
        action.e(new y0.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.i(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), j6.k(action, false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f21506a;
    }

    public static final Unit G1(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit G2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit G3(ln.k.a aVar, final q5 q5Var, final y0.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.v1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.H3(this.f24121a, waitForWebRtcSetup, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit H1(ln.k.a aVar, q5 q5Var, final sn.v.b facingMode) {
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.j5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.I1(facingMode, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit H2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit H3(q5 q5Var, y0.WaitForWebRtcSetup waitForWebRtcSetup, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        q5Var.webRtcManager.a();
        action.e(new y0.RestartCamera(false, false, j6.k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f21506a;
    }

    public static final Unit I1(sn.v.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new y0.RestartCamera(false, false, j6.k(action, false), bVar, 3, null));
        return Unit.f21506a;
    }

    public static final Unit I2() {
        return Unit.f21506a;
    }

    public static final Unit I3(q5 q5Var, Input input) {
        q5Var.selfieEventLogger.j(input.getFromStep());
        return Unit.f21506a;
    }

    public static final Unit J1(boolean z10) {
        return Unit.f21506a;
    }

    public static final Unit J3(q5 q5Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        q5Var.selfieEventLogger.i(step);
        return Unit.f21506a;
    }

    public static final Unit K2(ln.k.a aVar, final q5 q5Var, final y0.ShowPoseHint showPoseHint, final Input input) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.s4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.L2(showPoseHint, input, q5Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit K3(ln.k.a aVar, final q5 q5Var, final y0.WaitForWebRtcSetup waitForWebRtcSetup, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.s1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.L3(this.f24079a, waitForWebRtcSetup, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final ln.r L1(final q5 q5Var, final y0.Capture capture, final ln.k.a aVar, final c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.u4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.M1(output, q5Var, capture, aVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit L2(y0.ShowPoseHint showPoseHint, Input input, q5 q5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<PoseInfo> listI = showPoseHint.i();
        List<b0> listW = showPoseHint.w();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean autoCaptureSupported = showPoseHint.getAutoCaptureSupported();
        sn.v cameraProperties = showPoseHint.getCameraProperties();
        long startSelfieTimestamp = showPoseHint.getStartSelfieTimestamp();
        y0 y0VarK = j6.k(action, false);
        PoseConfigs poseConfigs = input.getPoseConfigs();
        sn.v.b cameraFacingMode = showPoseHint.getCameraFacingMode();
        boolean isFlashEnabled = showPoseHint.getIsFlashEnabled();
        Long lValueOf = null;
        rq.b bVar = null;
        if (input.getUsePerPoseReveal()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            rq.b bVar2 = q5Var.selfiePoseManager;
            if (bVar2 == null) {
                Intrinsics.u("selfiePoseManager");
            } else {
                bVar = bVar2;
            }
            lValueOf = Long.valueOf(jCurrentTimeMillis2 + bVar.getPerPoseTimeoutMs());
        }
        action.e(new y0.Capture(null, 0.0f, null, listW, listI, jCurrentTimeMillis, autoCaptureSupported, startSelfieTimestamp, cameraProperties, y0VarK, poseConfigs, cameraFacingMode, isFlashEnabled, null, lValueOf, false, 8193, null));
        return Unit.f21506a;
    }

    public static final Unit L3(q5 q5Var, y0.WaitForWebRtcSetup waitForWebRtcSetup, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        ks.a aVar = q5Var.webRtcManager;
        if (aVar != null) {
            aVar.a();
        }
        action.e(new y0.RestartCamera(false, false, j6.k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f21506a;
    }

    public static final Unit M1(c0.c cVar, q5 q5Var, y0.Capture capture, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.Capture capture2 = objC instanceof y0.Capture ? (y0.Capture) objC : null;
        if (capture2 == null) {
            return Unit.f21506a;
        }
        if (cVar instanceof c0.c.a) {
            c0.c.a aVar2 = (c0.c.a) cVar;
            if (aVar2.getSelfie() != null) {
                b0 selfie = aVar2.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                q5Var.selfieEventLogger.g(capture2, selfie);
                action.e(q5Var.x1(action, capture, selfie));
            } else {
                action.e(capture2.y((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : 0.0f, (57343 & 4) != 0 ? capture2.brightnessInfo : null, (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : y0.h.FlashOn, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : false));
            }
        } else if (cVar instanceof c0.c.C0461c) {
            c0.c.C0461c c0461c = (c0.c.C0461c) cVar;
            if (c0461c.getError() == xn.c.FaceDetectionUnsupported) {
                action.e(capture2.y((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : c0461c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0461c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0461c.getIsDimLightConditions()));
            } else {
                action.e(capture2.y((57343 & 1) != 0 ? capture2.selfieError : c0461c.getError(), (57343 & 2) != 0 ? capture2.poseScore : c0461c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0461c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0461c.getIsDimLightConditions()));
            }
        } else {
            if (!(cVar instanceof c0.c.b)) {
                throw new zt.l();
            }
            q5Var.W3(aVar, ((c0.c.b) cVar).getError());
        }
        return Unit.f21506a;
    }

    public static final Unit M2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit M3(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit N1(PoseInfo poseInfo, xn.a aVar, ln.k.a aVar2, final q5 q5Var, final y0.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final b0.SelfieImage selfieImage = new b0.SelfieImage(absolutePath, b0.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken());
        aVar2.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.o4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.O1(this.f23756a, capture, selfieImage, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit N2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit N3(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit O1(q5 q5Var, y0.Capture capture, b0.SelfieImage selfieImage, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(q5Var.x1(action, capture, selfieImage));
        return Unit.f21506a;
    }

    public static final Unit O2(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit O3(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit P1(q5 q5Var, ln.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        q5Var.W3(aVar, it);
        return Unit.f21506a;
    }

    public static final Unit Q1(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final ln.r Q2(final q5 q5Var, final y0.StartCapture startCapture, final Input input, final ln.k.a aVar, final c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.d5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.R2(output, startCapture, input, q5Var, aVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Q3(ln.k.a aVar, q5 q5Var, final y0.r rVar) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.g5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.R3(rVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit R1(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit R2(c0.c cVar, y0.StartCapture startCapture, Input input, q5 q5Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.StartCapture startCapture2 = objC instanceof y0.StartCapture ? (y0.StartCapture) objC : null;
        if (startCapture2 == null) {
            return Unit.f21506a;
        }
        if (cVar instanceof c0.c.a) {
            c0.c.a aVar2 = (c0.c.a) cVar;
            action.e(new y0.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar2.getPoseScore(), aVar2.getBrightnessInfo(), startCapture.i(), startCapture.w(), j6.k(action, false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar2.getIsDimLightConditions()));
        } else if (cVar instanceof c0.c.b) {
            q5Var.W3(aVar, ((c0.c.b) cVar).getError());
        } else {
            if (!(cVar instanceof c0.c.C0461c)) {
                throw new zt.l();
            }
            c0.c.C0461c c0461c = (c0.c.C0461c) cVar;
            action.e(c0461c.getError() == xn.c.FaceDetectionUnsupported ? startCapture2.y((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : null, (16242 & 4) != 0 ? startCapture2.poseScore : c0461c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0461c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & Barcode.FORMAT_ITF) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c0461c.getIsDimLightConditions()) : startCapture2.y((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : c0461c.getError(), (16242 & 4) != 0 ? startCapture2.poseScore : c0461c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0461c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & Barcode.FORMAT_ITF) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c0461c.getIsDimLightConditions()));
        }
        return Unit.f21506a;
    }

    public static final Unit R3(y0.r rVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(j6.D(action, rVar.w(), rVar.getWebRtcObjectId(), rVar.getCameraProperties(), rVar.getStartSelfieTimestamp(), j6.k(action, false)));
        return Unit.f21506a;
    }

    public static final Unit S1(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit S2(ln.k.a aVar, final q5 q5Var, final y0.StartCapture startCapture, final Input input) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.l1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.T2(startCapture, input, q5Var, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit S3(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit T2(y0.StartCapture startCapture, Input input, q5 q5Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.StartCapture startCapture2 = objC instanceof y0.StartCapture ? (y0.StartCapture) objC : null;
        if (startCapture2 == null) {
            return Unit.f21506a;
        }
        action.e(new y0.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.i(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), j6.k(action, false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        q5Var.selfieEventLogger.d(startCapture2);
        return Unit.f21506a;
    }

    public static final Unit T3(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit U1(ln.k.a aVar, q5 q5Var) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.q4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.V1((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit U2(PoseInfo poseInfo, xn.a aVar, ln.k.a aVar2, final q5 q5Var, final y0.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final b0.SelfieImage selfieImage = new b0.SelfieImage(absolutePath, b0.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken());
        aVar2.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.m1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.V2(this.f23686a, startCapture, selfieImage, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit U3(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit V1(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.c cVar = objC instanceof y0.c ? (y0.c) objC : null;
        y0 nextState = cVar != null ? cVar.getNextState() : null;
        if (nextState != null) {
            action.e(nextState);
        }
        return Unit.f21506a;
    }

    public static final Unit V2(q5 q5Var, y0.StartCapture startCapture, b0.SelfieImage selfieImage, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(q5Var.x1(action, startCapture, selfieImage));
        return Unit.f21506a;
    }

    public static final Unit W1(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit W2(q5 q5Var, ln.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        q5Var.W3(aVar, it);
        return Unit.f21506a;
    }

    public static final Unit X1(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit X2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit Y1(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit Y2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit Y3(c cVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(cVar);
        return Unit.f21506a;
    }

    public static final Unit Z2(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final ln.r a2(final q5 q5Var, final ln.k.a aVar, final y0.CountdownToCapture countdownToCapture, final Input input, final c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.o5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.b2(output, q5Var, aVar, countdownToCapture, input, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit b2(c0.c cVar, q5 q5Var, ln.k.a aVar, y0.CountdownToCapture countdownToCapture, Input input, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.CountdownToCapture countdownToCapture2 = objC instanceof y0.CountdownToCapture ? (y0.CountdownToCapture) objC : null;
        if (countdownToCapture2 == null) {
            return Unit.f21506a;
        }
        if (!(cVar instanceof c0.c.a)) {
            if (cVar instanceof c0.c.b) {
                q5Var.W3(aVar, ((c0.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof c0.c.C0461c)) {
                    throw new zt.l();
                }
                action.e(new y0.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.i(), countdownToCapture.w(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), j6.k(action, false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((c0.c.C0461c) cVar).getIsDimLightConditions(), 131, null));
            }
        }
        return Unit.f21506a;
    }

    public static final ln.r b3(final q5 q5Var, final ln.k.a aVar, final y0.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, final c0.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.w4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.c3(output, q5Var, aVar, startCaptureFaceDetected, input, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit c2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit c3(c0.c cVar, q5 q5Var, ln.k.a aVar, y0.StartCaptureFaceDetected startCaptureFaceDetected, Input input, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(cVar instanceof c0.c.a)) {
            if (cVar instanceof c0.c.b) {
                q5Var.W3(aVar, ((c0.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof c0.c.C0461c)) {
                    throw new zt.l();
                }
                c0.c.C0461c c0461c = (c0.c.C0461c) cVar;
                xn.c error = c0461c.getError();
                List<PoseInfo> listI = startCaptureFaceDetected.i();
                List<b0> listW = startCaptureFaceDetected.w();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                sn.v cameraProperties = startCaptureFaceDetected.getCameraProperties();
                action.e(new y0.StartCapture(false, error, c0461c.getPoseScore(), c0461c.getBrightnessInfo(), listI, listW, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, j6.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c0461c.getIsDimLightConditions(), 129, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit d2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final ln.r d3(final q5 q5Var, final Input input, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.i5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.e3(this.f23627a, input, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit e2(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit e3(q5 q5Var, Input input, ln.r.c action) {
        Parcelable countdownToCapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.StartCaptureFaceDetected startCaptureFaceDetected = objC instanceof y0.StartCaptureFaceDetected ? (y0.StartCaptureFaceDetected) objC : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f21506a;
        }
        q5Var.selfieEventLogger.a(startCaptureFaceDetected);
        if (input.getDesignVersion() == mq.c.K0000 && startCaptureFaceDetected.k() == xn.a.Center) {
            List<PoseInfo> listI = startCaptureFaceDetected.i();
            List<b0> listW = startCaptureFaceDetected.w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            sn.v cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new y0.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listW, listI, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, j6.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new y0.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.i(), startCaptureFaceDetected.w(), j6.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        action.e(countdownToCapture);
        return Unit.f21506a;
    }

    public static final Unit f3(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit g2(PoseInfo poseInfo, xn.a aVar, ln.k.a aVar2, final q5 q5Var, final y0.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final b0.SelfieImage selfieImage = new b0.SelfieImage(absolutePath, b0.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken());
        aVar2.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.n1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.h2(this.f23733a, countdownToManualCapture, selfieImage, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit g3(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit h2(q5 q5Var, y0.CountdownToManualCapture countdownToManualCapture, b0.SelfieImage selfieImage, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(q5Var.x1(action, countdownToManualCapture, selfieImage));
        return Unit.f21506a;
    }

    public static final Unit h3(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit i2(q5 q5Var, ln.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        q5Var.W3(aVar, it);
        return Unit.f21506a;
    }

    public static final Unit j2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final ln.r j3(final q5 q5Var, final ln.k.a aVar, final boolean z10, final qq.c.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof qq.c.d.b) {
            return ln.z.d(q5Var, null, new Function1() { // from class: mq.l5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.k3(this.f23683a, aVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof qq.c.d.Error) {
            return ln.z.d(q5Var, null, new Function1() { // from class: mq.m5
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.l3(z10, it, q5Var, aVar, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit k2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit k3(q5 q5Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        q5Var.X3(aVar, c.d.f23854a);
        return Unit.f21506a;
    }

    public static final Unit l2(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    public static final Unit l3(boolean z10, qq.c.d dVar, q5 q5Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.Submit submit = objC instanceof y0.Submit ? (y0.Submit) objC : null;
        if (submit == null) {
            return Unit.f21506a;
        }
        if (z10) {
            qq.c.d.Error error = (qq.c.d.Error) dVar;
            if (j6.B(error.getCause())) {
                action.e(y0.Submit.z(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
            } else {
                q5Var.X3(aVar, new c.Error(((qq.c.d.Error) dVar).getCause()));
            }
        } else {
            q5Var.X3(aVar, new c.Error(((qq.c.d.Error) dVar).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit m3(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit n2(ln.k.a aVar, final q5 q5Var, final Input input, final y0.g gVar, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.f5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.o2(this.f23589a, input, gVar, it, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit n3(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit o2(q5 q5Var, Input input, y0.g gVar, String str, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        q5Var.selfieEventLogger.m(input.getFromStep());
        action.e(new y0.r(gVar.w(), str, gVar.getCameraProperties(), gVar.getStartSelfieTimestamp(), j6.k(action, false), gVar.getCameraFacingMode()));
        q5Var.webRtcManager.e();
        return Unit.f21506a;
    }

    public static final Unit o3(ln.k.a aVar, q5 q5Var) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.h5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.p3((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit p2() {
        return Unit.f21506a;
    }

    public static final Unit p3(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.Submit submit = objC instanceof y0.Submit ? (y0.Submit) objC : null;
        if (submit == null) {
            return Unit.f21506a;
        }
        action.e(y0.Submit.z(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f21506a;
    }

    public static final Unit q2(ln.k.a aVar, q5 q5Var) {
        j6.x(aVar, q5Var.webRtcManager);
        return Unit.f21506a;
    }

    public static final Unit r2(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit r3(q5 q5Var, ln.k.a aVar) {
        q5Var.X3(aVar, c.b.f23852a);
        return Unit.f21506a;
    }

    public static final Unit s2(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final Unit s3(q5 q5Var, ln.k.a aVar, Input input) {
        j6.z(q5Var.applicationContext, aVar, input, q5Var.w1(input));
        return Unit.f21506a;
    }

    public static final ln.r t3(final q5 q5Var, final y0.WaitForCameraFeed waitForCameraFeed, final Input input, final ln.k.a aVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.r4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.u3(it, waitForCameraFeed, input, q5Var, aVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit u2(ln.k.a aVar, q5 q5Var, final Input input, final y0.RestartCamera restartCamera) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.c5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.v2(input, restartCamera, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit u3(fq.n1.Output output, y0.WaitForCameraFeed waitForCameraFeed, Input input, q5 q5Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == fq.s1.PermissionGranted) {
            action.e(y0.WaitForCameraFeed.z(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new y0.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            q5Var.X3(aVar, c.a.f23851a);
        } else {
            q5Var.X3(aVar, new c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f21506a;
    }

    public static final Unit v2(Input input, y0.RestartCamera restartCamera, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new y0.WaitForCameraFeed(false, false, j6.k(action, false), input.z(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f21506a;
    }

    public static final ln.r v3(final q5 q5Var, final y0.WaitForCameraFeed waitForCameraFeed, final Input input, final ln.k.a aVar, final fq.n1.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(q5Var, null, new Function1() { // from class: mq.n5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.w3(it, waitForCameraFeed, input, q5Var, aVar, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit w3(fq.n1.Output output, y0.WaitForCameraFeed waitForCameraFeed, Input input, q5 q5Var, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == fq.s1.PermissionGranted) {
            action.e(y0.WaitForCameraFeed.z(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new y0.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            q5Var.X3(aVar, c.a.f23851a);
        } else {
            q5Var.X3(aVar, new c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f21506a;
    }

    public static final Unit x2(ln.k.a aVar, q5 q5Var, final y0.j jVar) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.p4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.y2(jVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit x3(final q5 q5Var, ln.k.a aVar, final Input input, final y0.WaitForCameraFeed waitForCameraFeed, final long j10, final sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        q5Var.selfieEventLogger.n();
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.v4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.y3(this.f24124a, input, waitForCameraFeed, cameraProperties, j10, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit y2(y0.j jVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        y0.j jVar2 = objC instanceof y0.j ? (y0.j) objC : null;
        if (jVar2 == null) {
            return Unit.f21506a;
        }
        y0.j jVar3 = jVar2;
        action.e(new y0.Submit(jVar3.w(), jVar3.getWebRtcObjectId(), jVar3.getCameraProperties(), jVar3.getStartSelfieTimestamp(), j6.k(action, true), jVar.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f21506a;
    }

    public static final Unit y3(q5 q5Var, Input input, y0.WaitForCameraFeed waitForCameraFeed, sn.v vVar, long j10, ln.r.c action) {
        Parcelable showPoseHint;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (q5Var.b4(input) == zn.a.Stream) {
            q5Var.selfieEventLogger.k();
            action.e(new y0.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), vVar, j10, j6.k(action, false), waitForCameraFeed.i(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            q5Var.selfieEventLogger.b((y0) action.c());
            xn.a pose = ((PoseInfo) CollectionsKt.d0(waitForCameraFeed.i())).getPose();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new y0.AcquireNextPose(vVar, j10, p001kotlin.collections.p.k(), j6.k(action, false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.i(), input.getPoseConfigs(), true);
            } else if (pose == xn.a.Center) {
                showPoseHint = new y0.StartCapture(false, null, 0.0f, null, waitForCameraFeed.i(), null, System.currentTimeMillis(), false, j10, vVar, j6.k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new y0.ShowPoseHint(p001kotlin.collections.p.k(), waitForCameraFeed.i(), true, vVar, j10, j6.k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            action.e(showPoseHint);
        }
        return Unit.f21506a;
    }

    public static final Unit z2(ln.k.a aVar, q5 q5Var, final Input input, final y0.j jVar) {
        aVar.d().a(ln.z.d(q5Var, null, new Function1() { // from class: mq.y4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.A2(input, jVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit z3(ln.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        j6.n(aVar, false, 1, null).invoke(it);
        return Unit.f21506a;
    }

    public final d B3(final Input renderProps, final y0.WaitForWebRtcSetup renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        ln.w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), p001kotlin.jvm.internal.d0.k(js.b.class), BuildConfig.FLAVOR, new Function1() { // from class: mq.t4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.C3(this.f24093a, renderState, renderProps, context, (js.b.AbstractC0389b) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        d.c.b.i iVar = new d.c.b.i(d.c.EnumC0473c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1N = j6.n(context, false, 1, null);
        zn.a aVarB4 = b4(renderProps);
        ks.a aVar = this.webRtcManager;
        return i1.m(renderProps, context, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, iVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.e5
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.M3(context, this);
            }
        }, new Function0() { // from class: mq.p5
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.N3(this.f23774a, context);
            }
        }, function1N, new Function0() { // from class: mq.u1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.O3(this.f24099a, context, renderProps);
            }
        }, aVarB4, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final d.b D2(final Input renderProps, final y0.ShowInstructions renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        ir.a aVarB = this.navigationStateManager.b();
        z0 selfieType = renderProps.getSelfieType();
        RemoteImage selfiePictograph = null;
        if (Intrinsics.c(selfieType, z0.a.f24351a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.c(selfieType, z0.c.f24353a) && !Intrinsics.c(selfieType, z0.b.f24352a)) {
                throw new zt.l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new d.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, aVarB, renderProps.getSelfieType(), renderProps.z(), renderProps.getStrings().getPromptPageNavBarTitle(), null, new Function0() { // from class: mq.d3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.E2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: mq.e3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.G2(context, this);
            }
        }, new Function0() { // from class: mq.f3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.H2(this.f23587a, context);
            }
        }, new Function0() { // from class: mq.g3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.I2();
            }
        });
    }

    public final d J2(final Input renderProps, final y0.ShowPoseHint renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        h0 h0Var;
        String selfieHintPoseNotCentered;
        d.c.EnumC0473c enumC0473c;
        int i10 = e.f24026a[renderState.k().ordinal()];
        if (i10 == 1) {
            h0Var = h0.Left;
        } else if (i10 == 2) {
            h0Var = h0.Right;
        } else if (i10 == 3) {
            h0Var = h0.Up;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new zt.l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            h0Var = h0.Down;
        }
        int[] iArr = e.b;
        int i11 = iArr[h0Var.ordinal()];
        if (i11 == 1) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintPoseNotCentered();
        } else if (i11 == 2) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i11 == 3) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookRight();
        } else if (i11 == 4) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookUp();
        } else {
            if (i11 != 5) {
                throw new zt.l();
            }
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookDown();
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[h0Var.ordinal()];
        if (i12 == 1) {
            enumC0473c = d.c.EnumC0473c.CENTER;
        } else if (i12 == 2) {
            enumC0473c = d.c.EnumC0473c.LOOK_LEFT_HINT;
        } else if (i12 == 3) {
            enumC0473c = d.c.EnumC0473c.LOOK_RIGHT_HINT;
        } else if (i12 == 4) {
            enumC0473c = d.c.EnumC0473c.LOOK_UP_HINT;
        } else {
            if (i12 != 5) {
                throw new zt.l();
            }
            enumC0473c = d.c.EnumC0473c.LOOK_DOWN_HINT;
        }
        d.c.b.f fVar = new d.c.b.f(new Function0() { // from class: mq.c2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.K2(context, this, renderState, renderProps);
            }
        }, enumC0473c, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a));
        String str = selfieHintPoseNotCentered;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1N = j6.n(context, false, 1, null);
        zn.a aVarB4 = b4(renderProps);
        ks.a aVar = this.webRtcManager;
        d.c.AssetOverrides assetOverridesC = j6.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        sn.a0.a aVar2 = this.cameraXControllerFactory;
        un.c.a aVar3 = this.camera2ControllerFactory;
        return i1.m(renderProps, context, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesC, requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.d2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.M2(context, this);
            }
        }, new Function0() { // from class: mq.e2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.N2(this.f23576a, context);
            }
        }, function1N, new Function0() { // from class: mq.g2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.O2(this.f23596a, context, renderProps);
            }
        }, aVarB4, aVar, recordAudio, aVar2, aVar3, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    public final d K1(final Input renderProps, final y0.Capture renderState, ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        y0.h flashState;
        String str;
        String selfieHintCenterFace;
        int i10;
        d.c.EnumC0473c enumC0473c;
        d.c.EnumC0473c enumC0473c2;
        final q5 q5Var;
        d.c.b aVar;
        y0.h hVar;
        y0.h hVar2;
        boolean z10;
        boolean z11;
        final ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar2 = context;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            aVar2.b("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new i(renderState, this, aVar2, null));
        }
        final PoseInfo poseInfoP = renderState.p();
        final xn.a pose = poseInfoP.getPose();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == y0.h.Disabled ? y0.h.Enabled : renderState.getFlashState();
        } else {
            flashState = y0.h.Disabled;
        }
        y0.h hVar3 = flashState;
        if (renderState.l().getAutoCaptureEnabled()) {
            ln.w.l(aVar2, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), hVar3 == y0.h.Disabled || hVar3 == y0.h.ReadyToCapture), p001kotlin.jvm.internal.d0.k(c0.class), BuildConfig.FLAVOR, new Function1() { // from class: mq.h3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.L1(this.f23612a, renderState, aVar2, (c0.c) obj);
                }
            });
        }
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        if (pose == xn.a.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else {
            if (pose != xn.a.Right) {
                if (renderState.getSelfieError() != null) {
                    str = strB;
                } else if (pose == xn.a.Center) {
                    selfieHintCenterFace = renderProps.getStrings().getSelfieHintCenterFace();
                } else {
                    str = null;
                }
                i10 = e.f24026a[pose.ordinal()];
                if (i10 != 1) {
                    enumC0473c = d.c.EnumC0473c.LOOK_LEFT;
                } else if (i10 != 2) {
                    enumC0473c = d.c.EnumC0473c.LOOK_RIGHT;
                } else if (i10 != 3) {
                    enumC0473c = d.c.EnumC0473c.LOOK_UP;
                } else if (i10 != 4) {
                    enumC0473c = d.c.EnumC0473c.LOOK_DOWN;
                } else {
                    if (i10 == 5) {
                        throw new zt.l();
                    }
                    enumC0473c = d.c.EnumC0473c.CENTER;
                }
                enumC0473c2 = enumC0473c;
                if (renderState.o() || hVar3 == y0.h.FlashOn || hVar3 == y0.h.ReadyToCapture) {
                    q5Var = this;
                    aVar = new d.c.b.a(enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false);
                } else {
                    Function1 function1 = new Function1() { // from class: mq.i3
                        @Override // p001kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return q5.N1(poseInfoP, pose, aVar2, this, renderState, (String) obj);
                        }
                    };
                    aVar2 = aVar2;
                    q5Var = this;
                    aVar = new d.c.b.C0472d(function1, new Function1() { // from class: mq.j3
                        @Override // p001kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return q5.P1(this.f23636a, aVar2, (Throwable) obj);
                        }
                    }, false, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false, 4, null);
                }
                if (!renderState.o()) {
                    q5Var.V3(aVar2);
                }
                hVar = y0.h.FlashOn;
                if (hVar3 == hVar) {
                    aVar2.b("wait_to_capture_with_flash_on", new j(aVar2, q5Var, null));
                }
                hVar2 = y0.h.ReadyToCapture;
                if (hVar3 == hVar2) {
                    aVar2.b("turn_off_flash", new k(aVar2, q5Var, null));
                }
                zn.a aVarB4 = b4(renderProps);
                String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
                String str2 = strB;
                boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
                ir.a aVarB = q5Var.navigationStateManager.b();
                Function1 function1N = j6.n(aVar2, false, 1, null);
                ks.a aVar3 = q5Var.webRtcManager;
                d.c.AssetOverrides assetOverridesC = j6.C(renderProps);
                boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
                sn.a0.a aVar4 = q5Var.cameraXControllerFactory;
                un.c.a aVar5 = q5Var.camera2ControllerFactory;
                String str3 = str;
                boolean autoCaptureSupported = renderState.getAutoCaptureSupported();
                xn.a aVarK = renderState.k();
                float poseScore = renderState.getPoseScore();
                xn.b brightnessInfo = renderState.getBrightnessInfo();
                sn.v.b cameraFacingMode = renderState.getCameraFacingMode();
                boolean isFlashEnabled = renderState.getIsFlashEnabled();
                boolean zA = q5Var.featureFlagManager.a(to.a.f32600a);
                if (renderState.getFlashState() != hVar || renderState.getFlashState() == hVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isDimLightConditions = renderState.getIsDimLightConditions();
                if (b4(renderProps) == zn.a.Upload) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return i1.m(renderProps, aVar2, aVarK, capturePageTitle, (1006632960 & 16) != 0 ? null : str3, str2, autoCaptureSupported, aVar, assetOverridesC, requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.k3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q5.Q1(aVar2, q5Var);
                    }
                }, new Function0() { // from class: mq.l3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q5.R1(this.f23681a, aVar2);
                    }
                }, function1N, new Function0() { // from class: mq.n3
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q5.S1(this.f23737a, aVar2, renderProps);
                    }
                }, aVarB4, aVar3, recordAudio, aVar4, aVar5, poseScore, brightnessInfo, cameraFacingMode, isFlashEnabled, zA, isDimLightConditions, (1006632960 & 67108864) != 0 ? false : z10, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : z11, (1006632960 & 536870912) != 0);
            }
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        }
        str = selfieHintCenterFace;
        i10 = e.f24026a[pose.ordinal()];
        if (i10 != 1) {
            enumC0473c = d.c.EnumC0473c.LOOK_LEFT;
        } else if (i10 != 2) {
            enumC0473c = d.c.EnumC0473c.LOOK_RIGHT;
        } else if (i10 != 3) {
            enumC0473c = d.c.EnumC0473c.LOOK_UP;
        } else if (i10 != 4) {
            enumC0473c = d.c.EnumC0473c.LOOK_DOWN;
        } else {
            if (i10 == 5) {
                throw new zt.l();
            }
            enumC0473c = d.c.EnumC0473c.CENTER;
        }
        enumC0473c2 = enumC0473c;
        if (renderState.o()) {
            q5Var = this;
            aVar = new d.c.b.a(enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false);
        } else {
            q5Var = this;
            aVar = new d.c.b.a(enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false);
        }
        if (!renderState.o()) {
            q5Var.V3(aVar2);
        }
        hVar = y0.h.FlashOn;
        if (hVar3 == hVar) {
            aVar2.b("wait_to_capture_with_flash_on", new j(aVar2, q5Var, null));
        }
        hVar2 = y0.h.ReadyToCapture;
        if (hVar3 == hVar2) {
            aVar2.b("turn_off_flash", new k(aVar2, q5Var, null));
        }
        zn.a aVarB5 = b4(renderProps);
        String capturePageTitle2 = renderProps.getStrings().getCapturePageTitle();
        String str4 = strB;
        boolean requireStrictSelfieCapture2 = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB2 = q5Var.navigationStateManager.b();
        Function1 function1N2 = j6.n(aVar2, false, 1, null);
        ks.a aVar6 = q5Var.webRtcManager;
        d.c.AssetOverrides assetOverridesC2 = j6.C(renderProps);
        boolean recordAudio2 = renderProps.getVideoCaptureConfig().getRecordAudio();
        sn.a0.a aVar7 = q5Var.cameraXControllerFactory;
        un.c.a aVar8 = q5Var.camera2ControllerFactory;
        String str5 = str;
        boolean autoCaptureSupported2 = renderState.getAutoCaptureSupported();
        xn.a aVarK2 = renderState.k();
        float poseScore2 = renderState.getPoseScore();
        xn.b brightnessInfo2 = renderState.getBrightnessInfo();
        sn.v.b cameraFacingMode2 = renderState.getCameraFacingMode();
        boolean isFlashEnabled2 = renderState.getIsFlashEnabled();
        boolean zA2 = q5Var.featureFlagManager.a(to.a.f32600a);
        if (renderState.getFlashState() != hVar) {
            z10 = true;
        } else {
            z10 = true;
        }
        boolean isDimLightConditions2 = renderState.getIsDimLightConditions();
        if (b4(renderProps) == zn.a.Upload) {
            z11 = true;
        } else {
            z11 = false;
        }
        return i1.m(renderProps, aVar2, aVarK2, capturePageTitle2, (1006632960 & 16) != 0 ? null : str5, str4, autoCaptureSupported2, aVar, assetOverridesC2, requireStrictSelfieCapture2, aVarB2, new Function0() { // from class: mq.k3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.Q1(aVar2, q5Var);
            }
        }, new Function0() { // from class: mq.l3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.R1(this.f23681a, aVar2);
            }
        }, function1N2, new Function0() { // from class: mq.n3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.S1(this.f23737a, aVar2, renderProps);
            }
        }, aVarB5, aVar6, recordAudio2, aVar7, aVar8, poseScore2, brightnessInfo2, cameraFacingMode2, isFlashEnabled2, zA2, isDimLightConditions2, (1006632960 & 67108864) != 0 ? false : z10, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : z11, (1006632960 & 536870912) != 0);
    }

    public final d P2(final Input renderProps, final y0.StartCapture renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        d.c.EnumC0473c enumC0473c;
        final q5 q5Var;
        Object obj;
        d.c.b aVar;
        final ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar2 = context;
        if (renderState.l().getAutoCaptureEnabled()) {
            ln.w.l(aVar2, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), p001kotlin.jvm.internal.d0.k(c0.class), BuildConfig.FLAVOR, new Function1() { // from class: mq.h2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.Q2(this.f23609a, renderState, renderProps, aVar2, (c0.c) obj2);
                }
            });
        }
        final PoseInfo poseInfoP = renderState.p();
        final xn.a pose = poseInfoP.getPose();
        boolean zO = renderState.o();
        if (!zO) {
            V3(aVar2);
        }
        int i10 = e.f24026a[pose.ordinal()];
        if (i10 == 1) {
            enumC0473c = d.c.EnumC0473c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0473c = d.c.EnumC0473c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0473c = d.c.EnumC0473c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0473c = d.c.EnumC0473c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new zt.l();
            }
            enumC0473c = d.c.EnumC0473c.CENTER;
        }
        d.c.EnumC0473c enumC0473c2 = enumC0473c;
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        String selfieHintTakePhoto = strB == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strB;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!zO) {
            q5Var = this;
            obj = null;
            aVar = new d.c.b.a(enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false);
        } else if (w1(renderProps)) {
            aVar = new d.c.b.e(new Function0() { // from class: mq.i2
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q5.S2(aVar2, this, renderState, renderProps);
                }
            }, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a));
            q5Var = this;
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: mq.j2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.U2(poseInfoP, pose, context, this, renderState, (String) obj2);
                }
            };
            aVar2 = context;
            obj = null;
            q5Var = this;
            aVar = new d.c.b.C0472d(function1, new Function1() { // from class: mq.k2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q5.W2(this.f23647a, aVar2, (Throwable) obj2);
                }
            }, false, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = q5Var.navigationStateManager.b();
        Function1 function1N = j6.n(aVar2, false, 1, obj);
        zn.a aVarB4 = b4(renderProps);
        ks.a aVar3 = q5Var.webRtcManager;
        return i1.m(renderProps, aVar2, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintTakePhoto, strB, renderState.getAutoCaptureSupported(), aVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.l2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.X2(aVar2, q5Var);
            }
        }, new Function0() { // from class: mq.m2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.Y2(this.f23688a, aVar2);
            }
        }, function1N, new Function0() { // from class: mq.n2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.Z2(this.f23735a, aVar2, renderProps);
            }
        }, aVarB4, aVar3, renderProps.getVideoCaptureConfig().getRecordAudio(), q5Var.cameraXControllerFactory, q5Var.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), q5Var.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final d P3(final Input renderProps, final y0.r renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        d.c.b.h hVar = new d.c.b.h(new Function0() { // from class: mq.o3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.Q3(context, this, renderState);
            }
        }, false, d.c.EnumC0473c.COMPLETE, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1N = j6.n(context, false, 1, null);
        ks.a aVar = this.webRtcManager;
        return i1.m(renderProps, context, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, hVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.p3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.S3(context, this);
            }
        }, new Function0() { // from class: mq.q3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.T3(this.f23782a, context);
            }
        }, function1N, new Function0() { // from class: mq.r3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.U3(this.f24066a, context, renderProps);
            }
        }, b4(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final d T1(final Input renderProps, y0.c renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        d.c.EnumC0473c enumC0473c;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof y0.Submit) {
            enumC0473c = d.c.EnumC0473c.COMPLETE_WITH_CAPTURE;
        } else {
            int i10 = e.f24026a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC0473c = d.c.EnumC0473c.LOOK_LEFT_COMPLETE;
            } else if (i10 == 2) {
                enumC0473c = d.c.EnumC0473c.LOOK_RIGHT_COMPLETE;
            } else if (i10 == 3) {
                enumC0473c = d.c.EnumC0473c.LOOK_UP_COMPLETE;
            } else if (i10 == 4) {
                enumC0473c = d.c.EnumC0473c.LOOK_DOWN_COMPLETE;
            } else {
                if (i10 != 5) {
                    throw new zt.l();
                }
                enumC0473c = d.c.EnumC0473c.CENTER_COMPLETE;
            }
        }
        return i1.m(renderProps, context, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, new d.c.b.h(new Function0() { // from class: mq.u2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.U1(context, this);
            }
        }, true, enumC0473c, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a)), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: mq.v2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.W1(context, this);
            }
        }, new Function0() { // from class: mq.w2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.X1(this.f24134a, context);
            }
        }, j6.n(context, false, 1, null), new Function0() { // from class: mq.x2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.Y1(this.f24180a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final void V3(ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        p001kotlin.jvm.internal.y yVar = new p001kotlin.jvm.internal.y();
        yVar.f21591a = true;
        context.b("check_if_manual_capture_enabled", new n(yVar, context, this, null));
    }

    public final void W3(ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar, Throwable th2) {
        String message;
        String message2 = th2.getMessage();
        if (message2 != null && StringsKt.a0(message2, "ENOSPC", false, 2, null)) {
            X3(aVar, new c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th2 instanceof g0.h1)) {
            if (th2 instanceof InternalErrorException) {
                X3(aVar, new c.Error(((InternalErrorException) th2).getErrorInfo()));
                return;
            }
            X3(aVar, new c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = th2.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            X3(aVar, new c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        X3(aVar, new c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
    }

    public final void X3(ln.k<? super Input, y0, ? extends c, ? extends Object>.a context, final c output) {
        ks.a aVar;
        if (((output instanceof c.d) || (output instanceof c.a) || (output instanceof c.Error) || (output instanceof c.b)) && (aVar = this.webRtcManager) != null) {
            aVar.e();
        }
        context.d().a(ln.z.d(this, null, new Function1() { // from class: mq.x4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.Y3(output, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public final d Z1(final Input renderProps, y0.CountdownToCapture renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        final y0.CountdownToCapture countdownToCapture;
        if (renderState.l().getAutoCaptureEnabled()) {
            countdownToCapture = renderState;
            ln.w.l(context, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), p001kotlin.jvm.internal.d0.k(c0.class), BuildConfig.FLAVOR, new Function1() { // from class: mq.k4
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.a2(this.f23649a, context, countdownToCapture, renderProps, (c0.c) obj);
                }
            });
        } else {
            countdownToCapture = renderState;
        }
        context.b("countdown_" + countdownToCapture.getCountDown(), new l(renderProps, context, this, renderState, null));
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        d.c.b.C0470b c0470b = new d.c.b.C0470b(renderState.getCountDown(), d.c.EnumC0473c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1N = j6.n(context, false, 1, null);
        zn.a aVarB4 = b4(renderProps);
        ks.a aVar = this.webRtcManager;
        return i1.m(renderProps, context, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strB, renderState.getAutoCaptureSupported(), c0470b, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.l4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.c2(context, this);
            }
        }, new Function0() { // from class: mq.m4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.d2(this.f23691a, context);
            }
        }, function1N, new Function0() { // from class: mq.n4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.e2(this.f23739a, context, renderProps);
            }
        }, aVarB4, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final void Z3(ln.r<? super Input, y0, ? extends c>.c updater) {
        updater.d(new c.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final d a3(final Input renderProps, final y0.StartCaptureFaceDetected renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        if (renderState.l().getAutoCaptureEnabled()) {
            ln.w.l(context, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), p001kotlin.jvm.internal.d0.k(c0.class), BuildConfig.FLAVOR, new Function1() { // from class: mq.o2
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.b3(this.f23751a, context, renderState, renderProps, (c0.c) obj);
                }
            });
        }
        ln.w.l(context, ln.o.Companion.b(ln.o.INSTANCE, 1000L, null, 2, null), p001kotlin.jvm.internal.d0.l(ln.o.class, KTypeProjection.INSTANCE.a(p001kotlin.jvm.internal.d0.k(Unit.class))), BuildConfig.FLAVOR, new Function1() { // from class: mq.p2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.d3(this.f23771a, renderProps, (Unit) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        d.c.b.a aVar = new d.c.b.a(d.c.EnumC0473c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = this.navigationStateManager.b();
        Function1 function1N = j6.n(context, false, 1, null);
        zn.a aVarB4 = b4(renderProps);
        ks.a aVar2 = this.webRtcManager;
        d.c.AssetOverrides assetOverridesC = j6.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        sn.a0.a aVar3 = this.cameraXControllerFactory;
        un.c.a aVar4 = this.camera2ControllerFactory;
        return i1.m(renderProps, context, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesC, requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.r2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.f3(context, this);
            }
        }, new Function0() { // from class: mq.s2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.g3(this.f24080a, context);
            }
        }, function1N, new Function0() { // from class: mq.t2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.h3(this.f24091a, context, renderProps);
            }
        }, aVarB4, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull y0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return nn.r.a(state);
    }

    public final zn.a b4(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ks.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.d()) : null;
        ks.a aVar2 = this.webRtcManager;
        Object objK = videoCaptureConfig.k(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.h()) : null, this.applicationContext);
        return zt.n.e(objK) == null ? (zn.a) objK : zn.a.None;
    }

    public final boolean c4(Input renderProps) {
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

    public final d f2(final Input renderProps, final y0.CountdownToManualCapture renderState, ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        d.c.EnumC0473c enumC0473c;
        final q5 q5Var;
        d.c.b c0470b;
        final ln.k<? super Input, y0, ? extends c, ? extends Object>.a aVar = context;
        final PoseInfo poseInfoP = renderState.p();
        final xn.a pose = poseInfoP.getPose();
        int i10 = e.f24026a[pose.ordinal()];
        if (i10 == 1) {
            enumC0473c = d.c.EnumC0473c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0473c = d.c.EnumC0473c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0473c = d.c.EnumC0473c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0473c = d.c.EnumC0473c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new zt.l();
            }
            enumC0473c = d.c.EnumC0473c.CENTER;
        }
        d.c.EnumC0473c enumC0473c2 = enumC0473c;
        aVar.b("countdown_to_manual_capture_" + renderState.getCountDown(), new m(aVar, this, null));
        xn.c selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? b1.b(selfieError, renderProps.getStrings(), renderState.k()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            Function1 function1 = new Function1() { // from class: mq.x1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.g2(poseInfoP, pose, aVar, this, renderState, (String) obj);
                }
            };
            aVar = aVar;
            q5Var = this;
            c0470b = new d.c.b.C0472d(function1, new Function1() { // from class: mq.y1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.i2(this.f24338a, aVar, (Throwable) obj);
                }
            }, true, enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), false);
        } else {
            q5Var = this;
            c0470b = new d.c.b.C0470b(renderState.getCountDown(), enumC0473c2, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a));
        }
        d.c.b bVar = c0470b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ir.a aVarB = q5Var.navigationStateManager.b();
        Function1 function1N = j6.n(aVar, false, 1, null);
        String str = selfieHintCenterFace;
        zn.a aVarB4 = b4(renderProps);
        ks.a aVar2 = q5Var.webRtcManager;
        return i1.m(renderProps, aVar, renderState.k(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, strB, renderState.getAutoCaptureSupported(), bVar, j6.C(renderProps), requireStrictSelfieCapture, aVarB, new Function0() { // from class: mq.z1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.j2(aVar, q5Var);
            }
        }, new Function0() { // from class: mq.a2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.k2(this.f23496a, aVar);
            }
        }, function1N, new Function0() { // from class: mq.b2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.l2(this.f23514a, aVar, renderProps);
            }
        }, aVarB4, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), q5Var.cameraXControllerFactory, q5Var.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), q5Var.featureFlagManager.a(to.a.f32600a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final d i3(Input renderProps, y0.Submit renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        rq.b bVar;
        final boolean z10 = renderProps.getDesignVersion() == mq.c.K0000;
        if (renderState.getRecoverableSubmitError() == null) {
            qq.c.a aVar = this.submitVerificationWorker;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            String fromComponent = renderProps.getFromComponent();
            String fromStep = renderProps.getFromStep();
            List<b0> listW = renderState.w();
            z0 selfieType = renderProps.getSelfieType();
            String fieldKeySelfie = renderProps.getFieldKeySelfie();
            String webRtcObjectId = renderState.getWebRtcObjectId();
            sn.v cameraProperties = renderState.getCameraProperties();
            long startSelfieTimestamp = renderState.getStartSelfieTimestamp();
            String fileUploadUrl = renderProps.getFileUploadUrl();
            rq.b bVar2 = this.selfiePoseManager;
            if (bVar2 == null) {
                Intrinsics.u("selfiePoseManager");
                bVar = null;
            } else {
                bVar = bVar2;
            }
            ln.w.l(context, aVar.a(sessionToken, inquiryId, fromComponent, fromStep, selfieType, fieldKeySelfie, listW, webRtcObjectId, cameraProperties, startSelfieTimestamp, fileUploadUrl, bVar), p001kotlin.jvm.internal.d0.k(qq.c.class), "submit_" + renderState.getSubmitAttempt(), new Function1() { // from class: mq.y3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.j3(this.f24341a, context, z10, (qq.c.d) obj);
                }
            });
        }
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        er.c cVar = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        ir.a aVarB = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: mq.z3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.m3(this.f24358a, context);
            }
        };
        Function0 function1 = new Function0() { // from class: mq.a4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.n3(this.f23498a, context);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new d.g(processingTitle, cVar, processingDescription, pendingPageTextVerticalPosition, styles, aVarB, function0, function1, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), j6.w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: mq.b4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.o3(context, this);
            }
        });
    }

    public final d m2(final Input renderProps, y0.g renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        final y0.g gVar;
        ks.a aVar = this.webRtcManager;
        if (aVar != null) {
            gVar = renderState;
            aVar.g(renderProps.getFromStep(), new Function1() { // from class: mq.s3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.n2(context, this, renderProps, gVar, (String) obj);
                }
            });
        } else {
            gVar = renderState;
        }
        return i1.m(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new d.c.b.h(new Function0() { // from class: mq.t3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.p2();
            }
        }, false, d.c.EnumC0473c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a)), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: mq.u3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.q2(context, this);
            }
        }, new Function0() { // from class: mq.v3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.r2(this.f24123a, context);
            }
        }, j6.m(context, false), new Function0() { // from class: mq.w3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.s2(this.f24135a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, gVar.getCameraFacingMode(), false, this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final Object q3(final Input renderProps, final y0.WaitForCameraFeed renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || fq.y1.b(this.applicationContext, fq.n0.Camera)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && w1(renderProps) && xq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !fq.y1.b(this.applicationContext, fq.n0.RecordAudio);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.i());
        d dVarM = i1.m(renderProps, context, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new d.c.b.g(new Function1() { // from class: mq.c4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.x3(this.f23553a, context, renderProps, renderState, jCurrentTimeMillis, (sn.v) obj);
            }
        }, d.c.EnumC0473c.CLEAR, !Intrinsics.c(renderProps.getSelfieType(), z0.b.f24352a), b4(renderProps) == zn.a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: mq.d4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.z3(context, (Throwable) obj);
            }
        }), j6.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: mq.e4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.A3(context, this);
            }
        }, new Function0() { // from class: mq.f4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.r3(this.f23588a, context);
            }
        }, j6.n(context, false, 1, null), new Function0() { // from class: mq.g4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.s3(this.f23598a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : z10 || z11, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
        if (z10) {
            String str = BuildConfig.FLAVOR;
            fq.n0 n0Var = fq.n0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            if (cameraPermissionsTitle != null) {
                str = cameraPermissionsTitle;
            }
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(jq.g.H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(jq.g.G, xq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return fq.y1.d(dVarM, context, true, n0Var, (3592 & 8) != 0 ? false : false, str, cameraPermissionsRationale, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : null, new Function1() { // from class: mq.h4
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.t3(this.f23614a, renderState, renderProps, context, (fq.n1.Output) obj);
                }
            });
        }
        String str2 = BuildConfig.FLAVOR;
        if (!z11) {
            return dVarM;
        }
        fq.n0 n0Var2 = fq.n0.RecordAudio;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(jq.g.S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
        }
        Context context3 = this.applicationContext;
        String string2 = context3.getString(jq.g.R, xq.g.b(context3));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        fq.n1 n1Var = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle != null) {
            str2 = microphonePermissionsTitle;
        }
        return fq.y1.d(dVarM, context, true, n0Var2, (3592 & 8) != 0 ? false : false, str2, microphonePermissionsRationale, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, n1Var, renderProps.getStyles(), (3592 & 16384) != 0 ? BuildConfig.FLAVOR : "video_capture_mic_permission_request", new Function1() { // from class: mq.j4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.v3(this.f23637a, renderState, renderProps, context, (fq.n1.Output) obj);
            }
        });
    }

    public final d t2(final Input renderProps, final y0.RestartCamera renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        ks.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.e();
        }
        return new d.e(new Function0() { // from class: mq.w1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.u2(context, this, renderProps, renderState);
            }
        });
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public y0 d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.selfiePoseManager = this.selfiePoseManagerFactory.a(props.getInquiryId(), props.getSessionToken(), props.getFromStep(), props.B(), props.getPoseTimeoutMs());
        this.selfieEventLogger.o(props.getUsePerPoseReveal());
        if (snapshot != null) {
            ew.h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.I() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrO = hVarB.O();
                parcelObtain.unmarshall(bArrO, 0, bArrO.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            y0 y0Var = (y0) parcelable;
            if (y0Var != null) {
                return y0Var;
            }
        }
        return props.getSkipPromptPage() ? new y0.WaitForCameraFeed(false, false, null, props.z(), props.getPoseConfigs(), false, sn.v.b.User, false, 163, null) : new y0.ShowInstructions(null, null, null, 6, null);
    }

    public final boolean w1(Input renderProps) {
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

    public final d w2(final Input renderProps, final y0.j renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
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
        return new d.f(new d.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.y(), renderProps.getStyles(), this.navigationStateManager.b(), new Function0() { // from class: mq.y2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.x2(context, this, renderState);
            }
        }, new Function0() { // from class: mq.z2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.z2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: mq.a3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.B2(context, this);
            }
        }, new Function0() { // from class: mq.c3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.C2(this.f23552a, context);
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x011c  */
    /* JADX WARN: Code duplicated, block: B:38:0x014f  */
    /* JADX WARN: Code duplicated, block: B:40:0x015d  */
    /* JADX WARN: Code duplicated, block: B:42:0x016d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0170  */
    /* JADX WARN: Code duplicated, block: B:45:0x0190  */
    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b9  */
    public final <T extends y0 & a> y0 x1(ln.r<? super Input, y0, ?>.c cVar, T t8, b0 b0Var) {
        y0 y0VarD;
        long j10;
        if (b0Var != null) {
            this.selfieEventLogger.f(t8, b0Var);
        }
        String fileUploadUrl = cVar.b().getFileUploadUrl();
        if (fileUploadUrl != null && (b0Var instanceof b0.SelfieImage)) {
            this.directFileUploader.j(((b0.SelfieImage) b0Var).getAbsoluteFilePath(), fileUploadUrl);
        }
        List<b0> listX0 = b0Var != null ? CollectionsKt.x0(t8.w(), b0Var) : t8.w();
        List<PoseInfo> listY = b0Var != null ? CollectionsKt.Y(t8.i(), 1) : t8.i();
        if (cVar.b().getUsePerPoseReveal()) {
            rq.b bVar = this.selfiePoseManager;
            if (bVar == null) {
                Intrinsics.u("selfiePoseManager");
                bVar = null;
            }
            bVar.n(listX0.size() + 1);
        }
        if (cVar.b().getUsePerPoseReveal() && b0Var != null) {
            T t10 = t8;
            if (!((PoseInfo) CollectionsKt.d0(t10.i())).getIsLast()) {
                T t11 = t8;
                y0VarD = new y0.AcquireNextPose(t10.getCameraProperties(), t10.getStartSelfieTimestamp(), listX0, t8.getBackState(), t8.getCameraFacingMode(), t11.getIsFlashEnabled(), listY, t11.getPoseConfigs(), t11.getAutoCaptureSupported());
            } else if (listY.isEmpty()) {
                if (b4(cVar.b()) == zn.a.Upload) {
                    if (cVar.b().getDesignVersion() == mq.c.K0000) {
                        j10 = 0;
                    } else {
                        j10 = 3000;
                    }
                    T t12 = t8;
                    y0VarD = new y0.FinalizeLocalVideoCapture(listX0, j10, false, false, t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
                } else if (b4(cVar.b()) == zn.a.Stream) {
                    T t13 = t8;
                    y0VarD = new y0.g(listX0, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
                } else {
                    T t14 = t8;
                    y0VarD = j6.D(cVar, listX0, null, t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t8.getBackState());
                }
            } else if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == xn.a.Center) {
                T t15 = t8;
                y0VarD = new y0.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t15.getStartSelfieTimestamp(), t15.getCameraProperties(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t16 = t8;
                y0VarD = new y0.ShowPoseHint(listX0, listY, t16.getAutoCaptureSupported(), t16.getCameraProperties(), t16.getStartSelfieTimestamp(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (listY.isEmpty()) {
            if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == xn.a.Center) {
                T t17 = t8;
                y0VarD = new y0.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t17.getStartSelfieTimestamp(), t17.getCameraProperties(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t18 = t8;
                y0VarD = new y0.ShowPoseHint(listX0, listY, t18.getAutoCaptureSupported(), t18.getCameraProperties(), t18.getStartSelfieTimestamp(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (b4(cVar.b()) == zn.a.Upload) {
            if (cVar.b().getDesignVersion() == mq.c.K0000) {
                j10 = 0;
            } else {
                j10 = 3000;
            }
            T t19 = t8;
            y0VarD = new y0.FinalizeLocalVideoCapture(listX0, j10, false, false, t19.getCameraProperties(), t19.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
        } else if (b4(cVar.b()) == zn.a.Stream) {
            T t110 = t8;
            y0VarD = new y0.g(listX0, t110.getCameraProperties(), t110.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
        } else {
            T t111 = t8;
            y0VarD = j6.D(cVar, listX0, null, t111.getCameraProperties(), t111.getStartSelfieTimestamp(), t8.getBackState());
        }
        y0 y0Var = y0VarD;
        return b0Var == null ? y0Var : new y0.c(y0Var, t8.k(), t8.getBackState(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull y0 renderState, @NotNull ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        Object objZ1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!j6.H(renderState)) {
            context.b("close_camera", new f(null));
        }
        if (!c4(renderProps)) {
            context.b("output_webrtc_error", new g(context, this, null));
        }
        boolean z10 = renderState instanceof y0.Submit;
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.e(renderProps.getFromStep(), tq.l2.f(renderState));
        if (renderState instanceof y0.ShowInstructions) {
            objZ1 = D2(renderProps, (y0.ShowInstructions) renderState, context);
        } else if (renderState instanceof y0.WaitForWebRtcSetup) {
            objZ1 = B3(renderProps, (y0.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof y0.WaitForCameraFeed) {
            objZ1 = q3(renderProps, (y0.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof y0.RestartCamera) {
            objZ1 = t2(renderProps, (y0.RestartCamera) renderState, context);
        } else if (renderState instanceof y0.ShowPoseHint) {
            objZ1 = J2(renderProps, (y0.ShowPoseHint) renderState, context);
        } else if (renderState instanceof y0.StartCapture) {
            objZ1 = P2(renderProps, (y0.StartCapture) renderState, context);
        } else if (renderState instanceof y0.StartCaptureFaceDetected) {
            objZ1 = a3(renderProps, (y0.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof y0.CountdownToCapture) {
            objZ1 = Z1(renderProps, (y0.CountdownToCapture) renderState, context);
        } else if (renderState instanceof y0.CountdownToManualCapture) {
            objZ1 = f2(renderProps, (y0.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof y0.Capture) {
            objZ1 = K1(renderProps, (y0.Capture) renderState, context);
        } else if (renderState instanceof y0.c) {
            objZ1 = T1(renderProps, (y0.c) renderState, context);
        } else if (renderState instanceof y0.FinalizeLocalVideoCapture) {
            objZ1 = this.localVideoCaptureRenderer.q(renderProps, (y0.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof y0.g) {
            objZ1 = m2(renderProps, (y0.g) renderState, context);
        } else if (renderState instanceof y0.r) {
            objZ1 = P3(renderProps, (y0.r) renderState, context);
        } else if (renderState instanceof y0.j) {
            objZ1 = w2(renderProps, (y0.j) renderState, context);
        } else if (z10) {
            objZ1 = i3(renderProps, (y0.Submit) renderState, context);
        } else {
            if (!(renderState instanceof y0.AcquireNextPose)) {
                throw new zt.l();
            }
            objZ1 = z1(renderProps, (y0.AcquireNextPose) renderState, context);
        }
        return objZ1 instanceof d.c ? fq.y1.c(objZ1) : objZ1;
    }

    public final d z1(final Input renderProps, y0.AcquireNextPose renderState, final ln.k<? super Input, y0, ? extends c, ? extends Object>.a context) {
        int size = renderState.w().size();
        context.b("fetch_pose_" + size, new h(size, context, null));
        return new d.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new d.a.AbstractC0467a.C0468a(d.a.b.CLEAR, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: mq.j1
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return q5.A1(context, this, (xn.a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: mq.f2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.C1(context, this, (Throwable) obj);
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: mq.q2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.E1(context, this);
            }
        }, new Function0() { // from class: mq.b3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.F1(this.f23516a, context);
            }
        }, j6.n(context, false, 1, null), new Function0() { // from class: mq.m3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q5.G1(this.f23689a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: mq.x3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.H1(context, this, (sn.v.b) obj);
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(to.a.f32600a), false, false, new Function1() { // from class: mq.i4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5.J1(((Boolean) obj).booleanValue());
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }
}
