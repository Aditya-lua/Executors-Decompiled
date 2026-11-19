package vp;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.protocols.calling.CallingHandler;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.model.UiFramework;
import es.g2;
import es.s6;
import hr.InquirySessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mq.PoseConfigs;
import mq.q5;
import no.u2;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.IndexedValue;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import rq.PoseInfo;
import up.InquiryAttributes;
import vo.IdConfig;
import vo.d2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\b\u0000\u0018\u0000 ¿\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004À\u0001Á\u0001Bç\u0001\b\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\b\b\u0001\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@J-\u0010F\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020K2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020N2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00052\u0006\u0010C\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00052\u0006\u0010C\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ-\u0010[\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020Z2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b[\u0010\\J-\u0010^\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020]2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b^\u0010_J-\u0010a\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020`2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\ba\u0010bJ%\u0010d\u001a\u00020\u00052\u0006\u0010C\u001a\u00020c2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bd\u0010eJ-\u0010g\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020i2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bj\u0010kJ?\u0010r\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010m\u001a\u00020l2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00032\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00030tH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020>H\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020B2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u0014\u0010\u007f\u001a\u00020p*\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J5\u0010\u0085\u0001\u001a\u00020>2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020~2\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020>2\u0007\u0010\u0087\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020>¢\u0006\u0005\b\u008c\u0001\u0010yR\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0016\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001¨\u0006Â\u0001"}, d2 = {"Lvp/e0;", "Lls/d;", "Lcom/withpersona/sdk2/inquiry/internal/m;", "Lcom/withpersona/sdk2/inquiry/internal/j;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lvp/s0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/n$b;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/u$a;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/x$a;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/a0$a;", "updateInquirySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "exchangeOneTimeCodeWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/p$a;", "redeemRelaySessionWorkerFactory", "Lvo/d2;", "governmentIdWorkflow", "Lmq/q5;", "selfieWorkflow", "Les/s6;", "uiWorkflow", "Lno/u2;", "documentWorkflow", "Llp/v;", "integrationWorkflow", "Ldr/e;", "externalInquiryController", "Lir/b;", "navigationStateManager", "Ldr/c;", "externalEventLogger", "Lnp/q0;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "restoreUiStepStateWorkerFactory", "Luo/c$a;", "featureFlagWorkerFactory", "Lto/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "trackingMetadataProvider", "Lcom/withpersona/sdk2/inquiry/internal/t;", "silentNetworkAuthenticationManager", "Lnp/f;", "deviceMetricsOrchestrator", "Lav/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/m;Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/internal/c$a;Lcom/withpersona/sdk2/inquiry/internal/a$a;Lcom/withpersona/sdk2/inquiry/internal/n$b;Lcom/withpersona/sdk2/inquiry/internal/u$a;Lcom/withpersona/sdk2/inquiry/internal/x$a;Lcom/withpersona/sdk2/inquiry/internal/a0$a;Lcom/withpersona/sdk2/inquiry/internal/f$a;Lcom/withpersona/sdk2/inquiry/internal/p$a;Lvo/d2;Lmq/q5;Les/s6;Lno/u2;Llp/v;Ldr/e;Lir/b;Ldr/c;Lnp/q0;Lcom/withpersona/sdk2/inquiry/internal/r$a;Luo/c$a;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lcom/withpersona/sdk2/inquiry/internal/t;Lnp/f;Lav/p0;)V", "state", BuildConfig.FLAVOR, "G", "(Lcom/withpersona/sdk2/inquiry/internal/j;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/internal/j$l;", "renderState", "Lkotlin/Function0;", "backAction", "k0", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$l;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$f;", "U", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$f;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$k;", "h0", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$k;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$m;", "l0", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$m;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$d;", "Q", "(Lcom/withpersona/sdk2/inquiry/internal/j$d;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$a;", "M", "(Lcom/withpersona/sdk2/inquiry/internal/j$a;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$g;", "Z", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$g;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$c;", "O", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$c;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$e;", "S", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$e;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$i;", "e0", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$i;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$h;", "c0", "(Lcom/withpersona/sdk2/inquiry/internal/j$h;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$b;", "N", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$b;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/j$j;", "g0", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lcom/withpersona/sdk2/inquiry/internal/j$j;Lkotlin/jvm/functions/Function0;)Lvp/s0;", "Lup/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", BuildConfig.FLAVOR, "didGoBack", "X", "(Lcom/withpersona/sdk2/inquiry/internal/m;Lup/e;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)Lvp/s0;", "Lls/g;", "context", "q0", "(Lcom/withpersona/sdk2/inquiry/internal/j;Lls/g;)V", "w0", "()V", "Lnp/o0;", "stepState", "p0", "(Lnp/o0;)Lcom/withpersona/sdk2/inquiry/internal/j$l;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "K", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", BuildConfig.FLAVOR, "sessionToken", "error", "errorMessage", "x0", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "output", "z0", "(Lcom/withpersona/sdk2/inquiry/internal/l;)V", "F", "(Lcom/withpersona/sdk2/inquiry/internal/m;)Lcom/withpersona/sdk2/inquiry/internal/j;", "L", "e", "Landroidx/lifecycle/l0;", "f", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "g", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "h", "Lcom/withpersona/sdk2/inquiry/internal/n$b;", "i", "Lcom/withpersona/sdk2/inquiry/internal/u$a;", "j", "Lcom/withpersona/sdk2/inquiry/internal/x$a;", "k", "Lcom/withpersona/sdk2/inquiry/internal/a0$a;", "l", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "m", "Lcom/withpersona/sdk2/inquiry/internal/p$a;", "n", "Lvo/d2;", "o", "Lmq/q5;", "p", "Les/s6;", "q", "Lno/u2;", "r", "Llp/v;", "s", "Ldr/e;", "t", "Lir/b;", "u", "Ldr/c;", "v", "Lnp/q0;", "w", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "x", "Luo/c$a;", "y", "Lto/e;", "z", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "A", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "B", "Lcom/withpersona/sdk2/inquiry/internal/t;", "C", "Lnp/f;", "D", "a", "b", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends ls.d<com.withpersona.sdk2.inquiry.internal.m, com.withpersona.sdk2.inquiry.internal.j, com.withpersona.sdk2.inquiry.internal.l, s0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final TrackingMetadataProvider trackingMetadataProvider;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.t silentNetworkAuthenticationManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final np.f deviceMetricsOrchestrator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.c.a createInquiryWorker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.a.InterfaceC0176a inquirySessionWorker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.n.b pollingWorker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.u.a transitionBackWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.x.a transitionWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.a0.a updateInquirySessionWorkerFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.f.a exchangeOneTimeCodeWorkerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.p.a redeemRelaySessionWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d2 governmentIdWorkflow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q5 selfieWorkflow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s6 uiWorkflow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u2 documentWorkflow;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.v integrationWorkflow;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.e externalInquiryController;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final np.q0 uiStepSavedStateHelper;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.r.a restoreUiStepStateWorkerFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uo.c.a featureFlagWorkerFactory;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lvp/e0$b;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/internal/m;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lvp/e0;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/m;Landroidx/lifecycle/l0;)Lvp/e0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        e0 a(@NotNull com.withpersona.sdk2.inquiry.internal.m props, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35245a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f35246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f35247d;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35245a = iArr;
            int[] iArr2 = new int[mq.c.values().length];
            try {
                iArr2[mq.c.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[mq.c.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[np.c0.values().length];
            try {
                iArr3[np.c0.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[np.c0.Blocking.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f35246c = iArr3;
            int[] iArr4 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr4[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f35247d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$handleState$5", f = "InquiryStateManager.kt", l = {211}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35248t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f35250a;

            public a(e0 e0Var) {
                this.f35250a = e0Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(dr.a aVar, eu.b<? super Unit> bVar) {
                if (!(aVar instanceof dr.a.CancelRequest)) {
                    throw new zt.l();
                }
                dr.a.CancelRequest cancelRequest = (dr.a.CancelRequest) aVar;
                e0.I(this.f35250a, cancelRequest.getForce(), cancelRequest.getSkipBackendCall());
                return Unit.f21506a;
            }
        }

        public d(eu.b<? super d> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e0.this.new d(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35248t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h<dr.a> hVarC = e0.this.externalInquiryController.c();
                a aVar = new a(e0.this);
                this.f35248t = 1;
                if (hVarC.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderComplete$1", f = "InquiryStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35251t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.withpersona.sdk2.inquiry.internal.j.Complete f35253v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.withpersona.sdk2.inquiry.internal.j.Complete complete, eu.b<? super e> bVar) {
            super(1, bVar);
            this.f35253v = complete;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e0.this.new e(this.f35253v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f35251t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            e0.this.z0(new com.withpersona.sdk2.inquiry.internal.l.Complete(this.f35253v.getInquiryId(), this.f35253v.getInquiryStatus(), this.f35253v.s(), this.f35253v.getSessionToken(), this.f35253v.getRedirectUri()));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderUiStep$2", f = "InquiryStateManager.kt", l = {846}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35254t;

        public f(eu.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e0.this.new f(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35254t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f35254t = 1;
                if (av.z0.b(CallingHandler.AVATAR_TIMEOUT_MS, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = e0.this.d().i();
            com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning = hVarI instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning ? (com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) hVarI : null;
            if (uiStepRunning == null) {
                return Unit.f21506a;
            }
            e0.this.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 1966079, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull com.withpersona.sdk2.inquiry.internal.m props, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull com.withpersona.sdk2.inquiry.internal.c.a createInquiryWorker, @NotNull com.withpersona.sdk2.inquiry.internal.a.InterfaceC0176a inquirySessionWorker, @NotNull com.withpersona.sdk2.inquiry.internal.n.b pollingWorker, @NotNull com.withpersona.sdk2.inquiry.internal.u.a transitionBackWorker, @NotNull com.withpersona.sdk2.inquiry.internal.x.a transitionWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.internal.a0.a updateInquirySessionWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.internal.f.a exchangeOneTimeCodeWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.internal.p.a redeemRelaySessionWorkerFactory, @NotNull d2 governmentIdWorkflow, @NotNull q5 selfieWorkflow, @NotNull s6 uiWorkflow, @NotNull u2 documentWorkflow, @NotNull lp.v integrationWorkflow, @NotNull dr.e externalInquiryController, @NotNull ir.b navigationStateManager, @NotNull dr.c externalEventLogger, @NotNull np.q0 uiStepSavedStateHelper, @NotNull com.withpersona.sdk2.inquiry.internal.r.a restoreUiStepStateWorkerFactory, @NotNull uo.c.a featureFlagWorkerFactory, @NotNull to.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull com.withpersona.sdk2.inquiry.internal.t silentNetworkAuthenticationManager, @NotNull np.f deviceMetricsOrchestrator, @NotNull av.p0 coroutineScope) {
        super(props, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(createInquiryWorker, "createInquiryWorker");
        Intrinsics.checkNotNullParameter(inquirySessionWorker, "inquirySessionWorker");
        Intrinsics.checkNotNullParameter(pollingWorker, "pollingWorker");
        Intrinsics.checkNotNullParameter(transitionBackWorker, "transitionBackWorker");
        Intrinsics.checkNotNullParameter(transitionWorkerFactory, "transitionWorkerFactory");
        Intrinsics.checkNotNullParameter(updateInquirySessionWorkerFactory, "updateInquirySessionWorkerFactory");
        Intrinsics.checkNotNullParameter(exchangeOneTimeCodeWorkerFactory, "exchangeOneTimeCodeWorkerFactory");
        Intrinsics.checkNotNullParameter(redeemRelaySessionWorkerFactory, "redeemRelaySessionWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdWorkflow, "governmentIdWorkflow");
        Intrinsics.checkNotNullParameter(selfieWorkflow, "selfieWorkflow");
        Intrinsics.checkNotNullParameter(uiWorkflow, "uiWorkflow");
        Intrinsics.checkNotNullParameter(documentWorkflow, "documentWorkflow");
        Intrinsics.checkNotNullParameter(integrationWorkflow, "integrationWorkflow");
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        Intrinsics.checkNotNullParameter(restoreUiStepStateWorkerFactory, "restoreUiStepStateWorkerFactory");
        Intrinsics.checkNotNullParameter(featureFlagWorkerFactory, "featureFlagWorkerFactory");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(trackingMetadataProvider, "trackingMetadataProvider");
        Intrinsics.checkNotNullParameter(silentNetworkAuthenticationManager, "silentNetworkAuthenticationManager");
        Intrinsics.checkNotNullParameter(deviceMetricsOrchestrator, "deviceMetricsOrchestrator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.createInquiryWorker = createInquiryWorker;
        this.inquirySessionWorker = inquirySessionWorker;
        this.pollingWorker = pollingWorker;
        this.transitionBackWorker = transitionBackWorker;
        this.transitionWorkerFactory = transitionWorkerFactory;
        this.updateInquirySessionWorkerFactory = updateInquirySessionWorkerFactory;
        this.exchangeOneTimeCodeWorkerFactory = exchangeOneTimeCodeWorkerFactory;
        this.redeemRelaySessionWorkerFactory = redeemRelaySessionWorkerFactory;
        this.governmentIdWorkflow = governmentIdWorkflow;
        this.selfieWorkflow = selfieWorkflow;
        this.uiWorkflow = uiWorkflow;
        this.documentWorkflow = documentWorkflow;
        this.integrationWorkflow = integrationWorkflow;
        this.externalInquiryController = externalInquiryController;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.restoreUiStepStateWorkerFactory = restoreUiStepStateWorkerFactory;
        this.featureFlagWorkerFactory = featureFlagWorkerFactory;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.trackingMetadataProvider = trackingMetadataProvider;
        this.silentNetworkAuthenticationManager = silentNetworkAuthenticationManager;
        this.deviceMetricsOrchestrator = deviceMetricsOrchestrator;
        if (d().i() == null) {
            f(F(props));
        } else {
            com.withpersona.sdk2.inquiry.internal.j jVar = (com.withpersona.sdk2.inquiry.internal.j) d().i();
            if (jVar instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) {
                f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r((com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) jVar, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, true, null, 1572863, null));
            }
        }
        d().o(new Function1() { // from class: vp.j
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.B(this.f35294a, (com.withpersona.sdk2.inquiry.internal.j) obj);
            }
        });
    }

    public static final Unit B(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j jVar) {
        if (jVar == null) {
            return Unit.f21506a;
        }
        e0Var.G(jVar);
        return Unit.f21506a;
    }

    public static final Unit H(e0 e0Var) {
        J(e0Var, false, false, 4, null);
        return Unit.f21506a;
    }

    public static final void I(e0 e0Var, boolean z10, boolean z11) {
        com.withpersona.sdk2.inquiry.internal.j jVar = (com.withpersona.sdk2.inquiry.internal.j) e0Var.d().i();
        if (jVar == null) {
            return;
        }
        String inquiryId = jVar.getInquiryId();
        String sessionToken = jVar.getSessionToken();
        StepStyle styles = jVar.getStyles();
        NextStep.CancelDialog cancelDialog = jVar.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = jVar.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = jVar.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = jVar.getCancelDialog();
        e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z10, z11, null, Barcode.FORMAT_UPC_A, null));
    }

    public static /* synthetic */ void J(e0 e0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        I(e0Var, z10, z11);
    }

    public static final Unit P(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession createInquirySession, com.withpersona.sdk2.inquiry.internal.network.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.b.Success) {
            com.withpersona.sdk2.inquiry.internal.network.b.Success success = (com.withpersona.sdk2.inquiry.internal.network.b.Success) it;
            e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession(createInquirySession.getInquiryId(), success.getSessionToken(), success.getTrackingEventsUrl(), success.getInquirySessionConfig()));
            e0Var.externalEventLogger.b(new kp.d.StartEvent(createInquirySession.getInquiryId(), com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(success.getSessionToken())));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.b.Error)) {
                throw new zt.l();
            }
            y0(e0Var, createInquirySession.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.b.Error) it).getCause(), null, 4, null);
        }
        return Unit.f21506a;
    }

    public static final Unit R(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.DocumentStepRunning documentStepRunning, u2.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, u2.c.b.f26121a)) {
            String inquiryId = documentStepRunning.getInquiryId();
            String sessionToken = documentStepRunning.getSessionToken();
            StepStyles.DocumentStepStyle styles = documentStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = documentStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = documentStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = documentStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = documentStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, u2.c.a.f26120a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.DocumentStepRunning.r(documentStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, null, null, null, null, 16375, null));
        } else if (it instanceof u2.c.Errored) {
            u2.c.Errored c0516c = (u2.c.Errored) it;
            if (e0Var.K(c0516c.getCause())) {
                e0Var.f(e0Var.p0(documentStepRunning));
            } else {
                y0(e0Var, documentStepRunning.getSessionToken(), c0516c.getCause(), null, 4, null);
            }
        } else {
            if (!Intrinsics.c(it, u2.c.d.f26123a)) {
                throw new zt.l();
            }
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.DocumentStepRunning.r(documentStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, null, 16375, null));
        }
        return Unit.f21506a;
    }

    public static final Unit T(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.ExchangeOneTimeCode exchangeOneTimeCode, com.withpersona.sdk2.inquiry.internal.network.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.d.Success) {
            com.withpersona.sdk2.inquiry.internal.network.d.Success success = (com.withpersona.sdk2.inquiry.internal.network.d.Success) it;
            if (success.getSessionToken() == null) {
                e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                String trackingEventsUrl = success.getTrackingEventsUrl();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.a();
                }
                e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession(inquiryId, sessionToken, trackingEventsUrl, inquirySessionConfig));
            }
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.d.Error)) {
                throw new zt.l();
            }
            y0(e0Var, exchangeOneTimeCode.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.d.Error) it).getCause(), null, 4, null);
        }
        return Unit.f21506a;
    }

    public static final Unit V(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning governmentIdStepRunning, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, d2.b.C0708b.f34600a)) {
            String inquiryId = governmentIdStepRunning.getInquiryId();
            String sessionToken = governmentIdStepRunning.getSessionToken();
            StepStyles.GovernmentIdStepStyle styles = governmentIdStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = governmentIdStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = governmentIdStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = governmentIdStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof d2.b.c) {
            d2.b.c cVar = (d2.b.c) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(governmentIdStepRunning));
            } else {
                y0(e0Var, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.c(it, d2.b.d.f34602a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.c(it, d2.b.a.f34599a)) {
                throw new zt.l();
            }
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f21506a;
    }

    public static final Unit W(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning governmentIdStepRunning, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, d2.b.C0708b.f34600a)) {
            String inquiryId = governmentIdStepRunning.getInquiryId();
            String sessionToken = governmentIdStepRunning.getSessionToken();
            StepStyles.GovernmentIdStepStyle styles = governmentIdStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = governmentIdStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = governmentIdStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = governmentIdStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof d2.b.c) {
            d2.b.c cVar = (d2.b.c) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(governmentIdStepRunning));
            } else {
                y0(e0Var, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.c(it, d2.b.d.f34602a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.c(it, d2.b.a.f34599a)) {
                throw new zt.l();
            }
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f21506a;
    }

    public static final Unit Y(e0 e0Var, InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.a.Success) {
            com.withpersona.sdk2.inquiry.internal.network.a.Success success = (com.withpersona.sdk2.inquiry.internal.network.a.Success) it;
            String redirectUri = success.getRedirectUri();
            if (redirectUri != null) {
                e0Var.savedStateHandle.i("redirect_uri", redirectUri);
            }
            if (xq.j.e(success.getInquiryId())) {
                e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.ReinitializeWithFallbackMode(success.getInquiryId(), success.getFallbackSessionToken()));
            } else {
                e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession(success.getInquiryId(), null, success.getInquirySession(), 2, null));
            }
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.a.Error)) {
                throw new zt.l();
            }
            com.withpersona.sdk2.inquiry.internal.network.a.Error error = (com.withpersona.sdk2.inquiry.internal.network.a.Error) it;
            e0Var.x0(inquiryAttributes.getSessionToken(), error.getCause(), error.getDebugMessage());
        }
        return Unit.f21506a;
    }

    public static final Unit a0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning integrationStepRunning, lp.v.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.c(it, lp.v.c.C0443c.f22449a)) {
            if (Intrinsics.c(it, lp.v.c.d.f22450a)) {
                e0Var.f(com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning.r(integrationStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.c(it, lp.v.c.a.f22447a)) {
                e0Var.f(com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning.r(integrationStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.c(it, lp.v.c.b.f22448a)) {
                    throw new zt.l();
                }
                String inquiryId = integrationStepRunning.getInquiryId();
                String sessionToken = integrationStepRunning.getSessionToken();
                StepStyles.IntegrationStepStyle styles = integrationStepRunning.getStyles();
                NextStep.CancelDialog cancelDialog = integrationStepRunning.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = integrationStepRunning.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = integrationStepRunning.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = integrationStepRunning.getCancelDialog();
                e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit b0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning integrationStepRunning, lp.v.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.c(it, lp.v.c.C0443c.f22449a)) {
            if (Intrinsics.c(it, lp.v.c.d.f22450a)) {
                e0Var.f(com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning.r(integrationStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.c(it, lp.v.c.a.f22447a)) {
                e0Var.f(com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning.r(integrationStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.c(it, lp.v.c.b.f22448a)) {
                    throw new zt.l();
                }
                String inquiryId = integrationStepRunning.getInquiryId();
                String sessionToken = integrationStepRunning.getSessionToken();
                StepStyles.IntegrationStepStyle styles = integrationStepRunning.getStyles();
                NextStep.CancelDialog cancelDialog = integrationStepRunning.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = integrationStepRunning.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = integrationStepRunning.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = integrationStepRunning.getCancelDialog();
                e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit d0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession loadFeatureFlagSession, uo.c.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof uo.c.b.Success) && !(it instanceof uo.c.b.a)) {
            throw new zt.l();
        }
        e0Var.trackingEventsLogger.setIsEnabled(!e0Var.b().getValue().Q());
        e0Var.trackingMetadataProvider.setFeatureFlags(e0Var.featureFlagManager.b());
        TrackingEventsLogger.logInquiryStartEvent$default(e0Var.trackingEventsLogger, com.withpersona.sdk2.inquiry.internal.k.a(e0Var.b().getValue(), e0Var.featureFlagManager.a(to.w.f32636a) ? UiFramework.PersonaWorkflow : UiFramework.SquareWorkflow), false, 2, null);
        if (e0Var.featureFlagManager.a(to.b.f32604a)) {
            e0Var.deviceMetricsOrchestrator.a(loadFeatureFlagSession.getSessionToken());
        }
        e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.ShowLoadingSpinner(loadFeatureFlagSession.getSessionToken(), loadFeatureFlagSession.getTrackingEventsUrl(), null, loadFeatureFlagSession.getInquiryId(), null, true, loadFeatureFlagSession.getInquirySessionConfig(), 4, null));
        return Unit.f21506a;
    }

    public static final Unit f0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.RedeemRelaySession redeemRelaySession, com.withpersona.sdk2.inquiry.internal.network.g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.g.Success) {
            com.withpersona.sdk2.inquiry.internal.network.g.Success success = (com.withpersona.sdk2.inquiry.internal.network.g.Success) it;
            if (success.getSessionToken() == null) {
                e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.a();
                }
                e0Var.f(new com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession(inquiryId, sessionToken, null, inquirySessionConfig, 4, null));
            }
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.g.Error)) {
                throw new zt.l();
            }
            y0(e0Var, redeemRelaySession.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.g.Error) it).getCause(), null, 4, null);
        }
        return Unit.f21506a;
    }

    public static final Unit i0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning selfieStepRunning, q5.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, q5.c.b.f23852a)) {
            String inquiryId = selfieStepRunning.getInquiryId();
            String sessionToken = selfieStepRunning.getSessionToken();
            StepStyles.SelfieStepStyle styles = selfieStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = selfieStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = selfieStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = selfieStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = selfieStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, q5.c.d.f23854a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning.r(selfieStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.c(it, q5.c.a.f23851a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning.r(selfieStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof q5.c.Error)) {
                throw new zt.l();
            }
            q5.c.Error c0466c = (q5.c.Error) it;
            if (e0Var.K(c0466c.getCause())) {
                e0Var.f(e0Var.p0(selfieStepRunning));
            } else {
                y0(e0Var, selfieStepRunning.getSessionToken(), c0466c.getCause(), null, 4, null);
            }
        }
        return Unit.f21506a;
    }

    public static final Unit j0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning selfieStepRunning, q5.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, q5.c.b.f23852a)) {
            String inquiryId = selfieStepRunning.getInquiryId();
            String sessionToken = selfieStepRunning.getSessionToken();
            StepStyles.SelfieStepStyle styles = selfieStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = selfieStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = selfieStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = selfieStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = selfieStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, q5.c.d.f23854a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning.r(selfieStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.c(it, q5.c.a.f23851a)) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning.r(selfieStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof q5.c.Error)) {
                throw new zt.l();
            }
            q5.c.Error c0466c = (q5.c.Error) it;
            if (e0Var.K(c0466c.getCause())) {
                e0Var.f(e0Var.p0(selfieStepRunning));
            } else {
                y0(e0Var, selfieStepRunning.getSessionToken(), c0466c.getCause(), null, 4, null);
            }
        }
        return Unit.f21506a;
    }

    public static final Unit m0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning, s6.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, s6.c.b.f14483a)) {
            String inquiryId = uiStepRunning.getInquiryId();
            String sessionToken = uiStepRunning.getSessionToken();
            StepStyles.UiStepStyle styles = uiStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = uiStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = uiStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = uiStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = uiStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof s6.c.d) {
            s6.c.d dVar = (s6.c.d) it;
            if (e0Var.K(dVar.getCause())) {
                e0Var.f(e0Var.p0(uiStepRunning));
            } else {
                e0Var.x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof s6.c.FinishedWithoutTransition) {
            s6.c.FinishedWithoutTransition fVar = (s6.c.FinishedWithoutTransition) it;
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.Transitioning(new com.withpersona.sdk2.inquiry.internal.x.TransitionData(fVar.getFromComponent(), fVar.a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof s6.c.FinishedWithTransition) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, ((s6.c.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof s6.c.a) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof s6.c.C0279c)) {
                throw new zt.l();
            }
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f21506a;
    }

    public static final Unit n0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning, s6.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, s6.c.b.f14483a)) {
            String inquiryId = uiStepRunning.getInquiryId();
            String sessionToken = uiStepRunning.getSessionToken();
            StepStyles.UiStepStyle styles = uiStepRunning.getStyles();
            NextStep.CancelDialog cancelDialog = uiStepRunning.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = uiStepRunning.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = uiStepRunning.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = uiStepRunning.getCancelDialog();
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof s6.c.d) {
            s6.c.d dVar = (s6.c.d) it;
            if (e0Var.K(dVar.getCause())) {
                e0Var.f(e0Var.p0(uiStepRunning));
            } else {
                e0Var.x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof s6.c.FinishedWithoutTransition) {
            s6.c.FinishedWithoutTransition fVar = (s6.c.FinishedWithoutTransition) it;
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.Transitioning(new com.withpersona.sdk2.inquiry.internal.x.TransitionData(fVar.getFromComponent(), fVar.a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof s6.c.FinishedWithTransition) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(null, ((s6.c.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof s6.c.a) {
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, com.withpersona.sdk2.inquiry.internal.w.c.f10906a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof s6.c.C0279c)) {
                throw new zt.l();
            }
            e0Var.z0(new com.withpersona.sdk2.inquiry.internal.l.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f21506a;
    }

    public static final Unit o0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning, com.withpersona.sdk2.inquiry.internal.r.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.internal.r.b.a.f10878a)) {
            if (!(e0Var.d().i() instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning)) {
                return Unit.f21506a;
            }
            e0Var.f(e0Var.p0(uiStepRunning));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.r.b.C0188b)) {
                throw new zt.l();
            }
            ls.h hVarI = e0Var.d().i();
            com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning2 = hVarI instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning ? (com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) hVarI : null;
            if (uiStepRunning2 == null) {
                return Unit.f21506a;
            }
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning2, null, null, null, null, null, null, null, null, null, ((com.withpersona.sdk2.inquiry.internal.r.b.C0188b) it).a(), false, false, false, null, null, null, null, null, null, false, null, 1572351, null));
        }
        return Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j jVar, String str, InternalErrorInfo internalErrorInfo) {
        Collection<UiComponentError> collectionValues;
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (!(internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                throw new zt.l();
            }
            y0(e0Var, str, internalErrorInfo, null, 4, null);
            return;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        arrayList = null;
        ArrayList arrayList = null;
        if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
            ls.h hVarI = e0Var.d().i();
            com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning = hVarI instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning ? (com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) hVarI : null;
            if (uiStepRunning == null) {
                return;
            }
            Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
            if (details != null && (collectionValues = details.values()) != null) {
                Collection<UiComponentError> collection = collectionValues;
                arrayList = new ArrayList(p001kotlin.collections.q.u(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(new g2((UiComponentError) it.next(), 0L, 2, null));
                }
            }
            e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, arrayList, null, null, false, null, 2031607, null));
            return;
        }
        if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
            if (jVar instanceof np.o0) {
                e0Var.f(e0Var.p0((np.o0) jVar));
                return;
            } else {
                y0(e0Var, str, internalErrorInfo, null, 4, null);
                return;
            }
        }
        if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
            throw new zt.l();
        }
        if (!networkErrorInfo.isRecoverable()) {
            y0(e0Var, str, internalErrorInfo, null, 4, null);
            return;
        }
        ls.h hVarI2 = e0Var.d().i();
        com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning2 = hVarI2 instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning ? (com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) hVarI2 : null;
        if (uiStepRunning2 == null) {
            return;
        }
        e0Var.f(com.withpersona.sdk2.inquiry.internal.j.UiStepRunning.r(uiStepRunning2, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, networkErrorInfo, null, false, null, 1966071, null));
    }

    public static final Unit s0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j jVar, String str, com.withpersona.sdk2.inquiry.internal.x.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.x.b.Error) {
            r0(e0Var, jVar, str, ((com.withpersona.sdk2.inquiry.internal.x.b.Error) it).getCause());
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.x.b.Success)) {
                throw new zt.l();
            }
            com.withpersona.sdk2.inquiry.internal.j jVar2 = (com.withpersona.sdk2.inquiry.internal.j) e0Var.d().i();
            if (jVar2 == null) {
                return Unit.f21506a;
            }
            e0Var.f(jVar2.p(new com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession(((com.withpersona.sdk2.inquiry.internal.x.b.Success) it).getNextState(), false)));
        }
        return Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit t0(e0 e0Var, String str, com.withpersona.sdk2.inquiry.internal.w wVar, com.withpersona.sdk2.inquiry.internal.network.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.i.Error) {
            y0(e0Var, str, ((com.withpersona.sdk2.inquiry.internal.network.i.Error) it).getCause(), null, 4, null);
        } else {
            if (!Intrinsics.c(it, com.withpersona.sdk2.inquiry.internal.network.i.b.f10865a)) {
                throw new zt.l();
            }
            com.withpersona.sdk2.inquiry.internal.j jVar = (com.withpersona.sdk2.inquiry.internal.j) e0Var.d().i();
            if (jVar == null) {
                return Unit.f21506a;
            }
            com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession dVar = (com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession) wVar;
            if (dVar.getNextStep() != null) {
                e0Var.f(dVar.getNextStep());
            } else {
                e0Var.f(jVar.p(new com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState(null, dVar.getCanReuseWorkflow(), 1, 0 == true ? 1 : 0)));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit u0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.w wVar, com.withpersona.sdk2.inquiry.internal.j jVar, String str, com.withpersona.sdk2.inquiry.internal.n.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.n.c.Success) {
            e0Var.f(((com.withpersona.sdk2.inquiry.internal.n.c.Success) it).a((com.withpersona.sdk2.inquiry.internal.j) e0Var.d().i(), ((com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) wVar).getCanReuseWorkflow()));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.n.c.Error)) {
                throw new zt.l();
            }
            r0(e0Var, jVar, str, ((com.withpersona.sdk2.inquiry.internal.n.c.Error) it).getCause());
        }
        return Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit v0(e0 e0Var, com.withpersona.sdk2.inquiry.internal.j jVar, String str, com.withpersona.sdk2.inquiry.internal.network.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.h.Success) {
            com.withpersona.sdk2.inquiry.internal.network.h.Success success = (com.withpersona.sdk2.inquiry.internal.network.h.Success) it;
            success.getNextState().o(true);
            e0Var.f(success.getNextState());
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.h.Error)) {
                throw new zt.l();
            }
            com.withpersona.sdk2.inquiry.internal.network.h.Error error = (com.withpersona.sdk2.inquiry.internal.network.h.Error) it;
            if (e0Var.K(error.getCause()) && (jVar instanceof np.o0)) {
                e0Var.f(e0Var.p0((np.o0) jVar));
            } else {
                y0(e0Var, str, error.getCause(), null, 4, null);
            }
        }
        return Unit.f21506a;
    }

    public static /* synthetic */ void y0(e0 e0Var, String str, InternalErrorInfo internalErrorInfo, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        e0Var.x0(str, internalErrorInfo, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.j F(@NotNull com.withpersona.sdk2.inquiry.internal.m props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (props instanceof com.withpersona.sdk2.inquiry.internal.m.TemplateProps) {
            com.withpersona.sdk2.inquiry.internal.m.TemplateProps templateProps = (com.withpersona.sdk2.inquiry.internal.m.TemplateProps) props;
            return new com.withpersona.sdk2.inquiry.internal.j.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.g(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate(), null, templateProps.getRedirectUri(), Barcode.FORMAT_QR_CODE, null);
        }
        int i10 = 2;
        InquirySessionConfig inquirySessionConfig = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (props instanceof com.withpersona.sdk2.inquiry.internal.m.OneTimeCodeProps) {
            return new com.withpersona.sdk2.inquiry.internal.j.ExchangeOneTimeCode(((com.withpersona.sdk2.inquiry.internal.m.OneTimeCodeProps) props).getOneTimeLinkCode(), inquirySessionConfig, i10, objArr3 == true ? 1 : 0);
        }
        if (props instanceof com.withpersona.sdk2.inquiry.internal.m.RelaySessionProps) {
            return new com.withpersona.sdk2.inquiry.internal.j.RedeemRelaySession(((com.withpersona.sdk2.inquiry.internal.m.RelaySessionProps) props).getRelaySessionToken(), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        if (!(props instanceof com.withpersona.sdk2.inquiry.internal.m.InquiryProps)) {
            throw new zt.l();
        }
        com.withpersona.sdk2.inquiry.internal.m.InquiryProps inquiryProps = (com.withpersona.sdk2.inquiry.internal.m.InquiryProps) props;
        if (xq.j.e(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new com.withpersona.sdk2.inquiry.internal.j.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, 4, null);
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken != null && sessionToken.length() != 0) {
            return new com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, InquirySessionConfig.INSTANCE.a(), 4, null);
        }
        return new com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession(inquiryProps.getInquiryId(), null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(com.withpersona.sdk2.inquiry.internal.j state) {
        s0 s0VarC0;
        String redirectUri;
        String sessionToken = state.getSessionToken();
        if (sessionToken != null) {
            if (StringsKt.p0(sessionToken)) {
                sessionToken = null;
            }
            if (sessionToken != null) {
                this.trackingEventsLogger.setSessionToken(sessionToken);
            }
        }
        String trackingEventsUrl = state.getTrackingEventsUrl();
        if (trackingEventsUrl != null) {
            this.trackingEventsLogger.setTrackingEventsUrl(trackingEventsUrl);
        }
        np.o0 o0Var = state instanceof np.o0 ? (np.o0) state : null;
        if (o0Var != null && (redirectUri = o0Var.getRedirectUri()) != null) {
            this.savedStateHandle.i("redirect_uri", redirectUri);
        }
        q0(state, d());
        this.silentNetworkAuthenticationManager.d(state);
        com.withpersona.sdk2.inquiry.internal.w transitionStatus = state.getTransitionStatus();
        com.withpersona.sdk2.inquiry.internal.w.c cVar = com.withpersona.sdk2.inquiry.internal.w.c.f10906a;
        if (Intrinsics.c(transitionStatus, cVar)) {
            this.silentNetworkAuthenticationManager.b();
        }
        this.navigationStateManager.e(Intrinsics.c(state.getTransitionStatus(), cVar));
        Function0<Unit> function0 = new Function0() { // from class: vp.u
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.H(this.f35328a);
            }
        };
        d().m("controllerRequestCollector", new d(null));
        com.withpersona.sdk2.inquiry.internal.m value = b().getValue();
        if (state instanceof com.withpersona.sdk2.inquiry.internal.j.CreateInquiryFromTemplate) {
            s0VarC0 = N(value, (com.withpersona.sdk2.inquiry.internal.j.CreateInquiryFromTemplate) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.ResumeFallbackInquiry) {
            s0VarC0 = g0(value, (com.withpersona.sdk2.inquiry.internal.j.ResumeFallbackInquiry) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession) {
            s0VarC0 = O(value, (com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.ExchangeOneTimeCode) {
            s0VarC0 = S(value, (com.withpersona.sdk2.inquiry.internal.j.ExchangeOneTimeCode) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.RedeemRelaySession) {
            s0VarC0 = e0(value, (com.withpersona.sdk2.inquiry.internal.j.RedeemRelaySession) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.ShowLoadingSpinner) {
            s0VarC0 = k0(value, (com.withpersona.sdk2.inquiry.internal.j.ShowLoadingSpinner) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning) {
            s0VarC0 = U(value, (com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning) state);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning) {
            s0VarC0 = h0(value, (com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) {
            s0VarC0 = l0(value, (com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) state, function0);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.DocumentStepRunning) {
            s0VarC0 = Q((com.withpersona.sdk2.inquiry.internal.j.DocumentStepRunning) state);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.Complete) {
            s0VarC0 = M((com.withpersona.sdk2.inquiry.internal.j.Complete) state);
        } else if (state instanceof com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning) {
            s0VarC0 = Z(value, (com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning) state);
        } else {
            if (!(state instanceof com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession)) {
                throw new zt.l();
            }
            s0VarC0 = c0((com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession) state, function0);
        }
        c().setValue(s0VarC0);
    }

    public final boolean K(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    public final void L() {
        w0();
        this.silentNetworkAuthenticationManager.c();
        this.deviceMetricsOrchestrator.b();
    }

    public final s0 M(com.withpersona.sdk2.inquiry.internal.j.Complete renderState) {
        d().m("complete", new e(renderState, null));
        return new a();
    }

    public final s0 N(com.withpersona.sdk2.inquiry.internal.m renderProps, com.withpersona.sdk2.inquiry.internal.j.CreateInquiryFromTemplate renderState, Function0<Unit> backAction) {
        return X(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.s(), renderState.getThemeSetId(), null, 2304, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    public final s0 O(com.withpersona.sdk2.inquiry.internal.m renderProps, final com.withpersona.sdk2.inquiry.internal.j.CreateInquirySession renderState, Function0<Unit> backAction) {
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.inquirySessionWorker.a(renderState.getInquiryId(), renderState.getInquirySessionDataWrapper()), new Function1() { // from class: vp.v
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.P(this.f35331a, renderState, (com.withpersona.sdk2.inquiry.internal.network.b) obj);
            }
        });
        return new u0(new np.a0.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 Q(final com.withpersona.sdk2.inquiry.internal.j.DocumentStepRunning renderState) {
        u2.e bVar;
        NextStep.Document.Config config = renderState.getDocumentStep().getConfig();
        String documentId = config.getDocumentId();
        int i10 = c.f35247d[config.getStartPage().ordinal()];
        if (i10 == 1) {
            bVar = u2.e.a.f26161a;
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            bVar = documentId != null ? new u2.e.Review(documentId) : u2.e.a.f26161a;
        }
        u2.e eVar = bVar;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        String title = config.getLocalizations().getPromptPage().getTitle();
        String prompt = config.getLocalizations().getPromptPage().getPrompt();
        String disclaimer = config.getLocalizations().getPromptPage().getDisclaimer();
        String btnSubmit = config.getLocalizations().getPromptPage().getBtnSubmit();
        String title2 = config.getLocalizations().getPendingPage().getTitle();
        String description = config.getLocalizations().getPendingPage().getDescription();
        String fieldKeyDocument = config.getFieldKeyDocument();
        String kind = config.getKind();
        int documentFileLimit = config.getDocumentFileLimit();
        Boolean backStepEnabled = config.getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = config.getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String cameraPermissionsTitle = config.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = config.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = config.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = config.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String largeFileErrorPrompt = config.getLocalizations().getPromptPage().getLargeFileErrorPrompt();
        StepStyles.DocumentStepStyle styles = renderState.getStyles();
        no.n pages = renderState.getPages();
        NextStep.Document.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.Document.AssetConfig(null, null, 3, null);
        }
        PendingPageTextPosition pendingPageTextVerticalPosition = config.getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        String navBarTitle = config.getLocalizations().getPromptPage().getNavBarTitle();
        NextStep.Document.CheckPage checkPage = config.getLocalizations().getCheckPage();
        u2.Input bVar2 = new u2.Input(sessionToken, inquiryId, fromStep, fromComponent, title, prompt, disclaimer, btnSubmit, title2, description, fieldKeyDocument, kind, documentId, eVar, pages, documentFileLimit, zBooleanValue, zBooleanValue2, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, largeFileErrorPrompt, styles, assetConfig, pendingPageTextVerticalPosition, navBarTitle, checkPage != null ? checkPage.getNavBarTitle() : null, config.getLocalizations().getPendingPage().getNavBarTitle(), renderState.getCustomPendingPage());
        Function1 function1 = new Function1() { // from class: vp.a0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.R(this.f35197a, renderState, (u2.c) obj);
            }
        };
        if (this.featureFlagManager.a(to.w.f32636a)) {
            return new vp.b(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), bVar2, renderState.getFromStep(), renderState.getDidGoBack(), function1);
        }
        return new vp.d(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), this.documentWorkflow, bVar2, renderState.getFromStep(), renderState.getDidGoBack(), function1);
    }

    public final s0 S(com.withpersona.sdk2.inquiry.internal.m renderProps, final com.withpersona.sdk2.inquiry.internal.j.ExchangeOneTimeCode renderState, Function0<Unit> backAction) {
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.exchangeOneTimeCodeWorkerFactory.create(renderState.getOneTimeLinkCode()), new Function1() { // from class: vp.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.T(this.f35302a, renderState, (com.withpersona.sdk2.inquiry.internal.network.d) obj);
            }
        });
        return new u0(new np.a0.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 U(com.withpersona.sdk2.inquiry.internal.m renderProps, final com.withpersona.sdk2.inquiry.internal.j.GovernmentIdStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> listF = renderState.F();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Id id2 = (Id) it.next();
            String countryCode2 = renderState.getCountryCode();
            IdConfig idConfigO = vo.h.o(id2, countryCode2 != null ? countryCode2 : "US", renderState.getManualCaptureButtonDelayMs());
            if (idConfigO != null) {
                arrayList.add(idConfigO);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> listD = renderState.D();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        String countryCode3 = renderState.getCountryCode();
        String str = countryCode3 != null ? countryCode3 : "US";
        List<NextStep.GovernmentId.LocalizationOverride> listO = renderState.O();
        d2.a.Strings bVarL = up.a.l(localizations, str, listO != null ? CollectionsKt.E0(listO) : null);
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> listC = renderState.C();
        List<NextStep.GovernmentId.VideoCaptureMethod> listZ = renderState.Z();
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(listZ, 10));
        Iterator<T> it2 = listZ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zn.a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(0L, listC, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        NextStep.GovernmentId.AssetConfig assetConfig2 = assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig;
        com.withpersona.sdk2.inquiry.internal.w transitionStatus = renderState.getTransitionStatus();
        com.withpersona.sdk2.inquiry.internal.w.c cVar = com.withpersona.sdk2.inquiry.internal.w.c.f10906a;
        d2.a aVar = new d2.a(sessionToken, countryCode, arrayList, inquiryId, fromStep, fromComponent, backStepEnabled, cancelButtonEnabled, listD, styles, bVarL, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig2, !Intrinsics.c(transitionStatus, cVar), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig(), renderState.getStaticCaptureTipsEnabled(), renderState.getHolographicTorchEnabledDurationMs(), renderState.getDesignVersion(), renderState.getFlowWatermarkText(), renderState.getCustomPendingPage());
        if (this.featureFlagManager.a(to.w.f32636a)) {
            return new vp.f(!Intrinsics.c(renderState.getTransitionStatus(), cVar), aVar, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: vp.x
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.V(this.f35338a, renderState, (d2.b) obj);
                }
            });
        }
        return new h(!Intrinsics.c(renderState.getTransitionStatus(), cVar), this.governmentIdWorkflow, aVar, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: vp.y
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.W(this.f35344a, renderState, (d2.b) obj);
            }
        });
    }

    public final s0 X(com.withpersona.sdk2.inquiry.internal.m renderProps, final InquiryAttributes attributes, StepStyle styles, boolean didGoBack, Function0<Unit> backAction) {
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.createInquiryWorker.a(attributes), new Function1() { // from class: vp.w
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.Y(this.f35336a, attributes, (com.withpersona.sdk2.inquiry.internal.network.a) obj);
            }
        });
        return new u0(new np.a0.a(styles, true, backAction), didGoBack);
    }

    public final s0 Z(com.withpersona.sdk2.inquiry.internal.m renderProps, final com.withpersona.sdk2.inquiry.internal.j.IntegrationStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String strY = renderState.y();
        String type = renderState.getType();
        String flowUrl = renderState.getFlowUrl();
        String redirectPath = renderState.getRedirectPath();
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = renderState.getIntegrationStepBrowserType();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        StepStyles.IntegrationStepStyle styles = renderState.getStyles();
        InternalErrorInfo transitionError = renderState.getTransitionError();
        lp.g integrationPage = renderState.getIntegrationPage();
        com.withpersona.sdk2.inquiry.internal.w transitionStatus = renderState.getTransitionStatus();
        boolean z10 = false;
        if (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) {
            int i10 = c.f35246c[((com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zt.l();
                }
                z10 = true;
            }
        } else if ((transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.Transitioning) || Intrinsics.c(transitionStatus, com.withpersona.sdk2.inquiry.internal.w.c.f10906a) || (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession)) {
            z10 = true;
        } else if (transitionStatus != null) {
            throw new zt.l();
        }
        lp.v.Input bVar = new lp.v.Input(inquiryId, sessionToken, strY, type, flowUrl, redirectPath, integrationStepBrowserType, backStepEnabled, cancelButtonEnabled, inquirySessionConfig, styles, transitionError, integrationPage, z10);
        if (this.featureFlagManager.a(to.w.f32636a)) {
            return new o0(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), bVar, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: vp.c0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.a0(this.f35209a, renderState, (lp.v.c) obj);
                }
            });
        }
        return new q0(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), this.integrationWorkflow, bVar, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: vp.d0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.b0(this.f35220a, renderState, (lp.v.c) obj);
            }
        });
    }

    public final s0 c0(final com.withpersona.sdk2.inquiry.internal.j.LoadFeatureFlagSession renderState, Function0<Unit> backAction) {
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.featureFlagWorkerFactory.create(renderState.getSessionToken()), new Function1() { // from class: vp.z
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.d0(this.f35346a, renderState, (uo.c.b) obj);
            }
        });
        return new u0(new np.a0.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 e0(com.withpersona.sdk2.inquiry.internal.m renderProps, final com.withpersona.sdk2.inquiry.internal.j.RedeemRelaySession renderState, Function0<Unit> backAction) {
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.redeemRelaySessionWorkerFactory.create(renderState.getRelaySessionToken()), new Function1() { // from class: vp.b0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.f0(this.f35206a, renderState, (com.withpersona.sdk2.inquiry.internal.network.g) obj);
            }
        });
        return new u0(new np.a0.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 g0(com.withpersona.sdk2.inquiry.internal.m renderProps, com.withpersona.sdk2.inquiry.internal.j.ResumeFallbackInquiry renderState, Function0<Unit> backAction) {
        return X(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, null, 4067, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    public final s0 h0(com.withpersona.sdk2.inquiry.internal.m renderProps, final com.withpersona.sdk2.inquiry.internal.j.SelfieStepRunning renderState, Function0<Unit> backAction) {
        List listD;
        List<PoseInfo> listH;
        List<NextStep.Selfie.SelfiePose> listG = renderState.G();
        if (listG == null || listG.isEmpty()) {
            int i10 = c.f35245a[renderState.getSelfieType().ordinal()];
            if (i10 == 1) {
                listD = p001kotlin.collections.o.d(xn.a.Center);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new zt.l();
                }
                listD = p001kotlin.collections.p.n(xn.a.Center, xn.a.Left, xn.a.Right);
            }
        } else {
            List<NextStep.Selfie.SelfiePose> listG2 = renderState.G();
            listD = new ArrayList(p001kotlin.collections.q.u(listG2, 10));
            Iterator<T> it = listG2.iterator();
            while (it.hasNext()) {
                listD.add(mq.m0.c((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        List<PoseInfo> listH2 = renderState.H();
        if (listH2 == null || listH2.isEmpty()) {
            Iterable<IndexedValue> iterableS0 = CollectionsKt.S0(listD);
            ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(iterableS0, 10));
            for (IndexedValue indexedValue : iterableS0) {
                int index = indexedValue.getIndex();
                arrayList.add(new PoseInfo(index, (xn.a) indexedValue.b(), index == p001kotlin.collections.p.m(listD), null));
            }
            listH = arrayList;
        } else {
            listH = renderState.H();
        }
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromComponent = renderState.getFromComponent();
        String fromStep = renderState.getFromStep();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        String fieldKeySelfie = renderState.getFieldKeySelfie();
        boolean requireStrictSelfieCapture = renderState.getRequireStrictSelfieCapture();
        boolean skipPromptPage = renderState.getSkipPromptPage();
        q5.Input.Strings c0465bH = up.a.h(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        mq.z0 z0VarA = mq.a1.a(renderState.getSelfieType());
        List<PoseInfo> listH3 = renderState.H();
        Long poseTimeoutMs = renderState.getPoseTimeoutMs();
        String cameraPermissionsTitle = renderState.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnCancel();
        StepStyles.SelfieStepStyle styles = renderState.getStyles();
        NextStep.Selfie.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.Selfie.AssetConfig(null, null, 3, null);
        }
        NextStep.Selfie.AssetConfig assetConfig2 = assetConfig;
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getPendingPageTextVerticalPosition();
        List<NextStep.Selfie.CaptureFileType> listY = renderState.y();
        List<NextStep.Selfie.VideoCaptureMethod> listU = renderState.U();
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(listU, 10));
        Iterator<T> it2 = listU.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zn.a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig videoCaptureConfig = new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(0L, listY, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        PoseConfigs poseConfigs = renderState.getPoseConfigs();
        int i11 = c.b[renderState.getDesignVersion().ordinal()];
        mq.c designVersion = (i11 == 1 || i11 == 2) ? this.featureFlagManager.a(to.y.f32640a) ? mq.c.V1 : mq.c.V0 : renderState.getDesignVersion();
        String fileUploadUrl = renderState.getFileUploadUrl();
        String flowWatermarkText = renderState.getFlowWatermarkText();
        List<PoseInfo> listH4 = renderState.H();
        q5.Input bVar = new q5.Input(sessionToken, inquiryId, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, c0465bH, z0VarA, listH, listH3, poseTimeoutMs, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, videoCaptureConfig, assetConfig2, pendingPageTextVerticalPosition, poseConfigs, designVersion, fileUploadUrl, flowWatermarkText, !(listH4 == null || listH4.isEmpty()), renderState.getCustomPendingPage());
        if (this.featureFlagManager.a(to.w.f32636a)) {
            return new v0(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), bVar, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: vp.s
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.i0(this.f35325a, renderState, (q5.c) obj);
                }
            });
        }
        return new x0(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), this.selfieWorkflow, bVar, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: vp.t
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.j0(this.f35326a, renderState, (q5.c) obj);
            }
        });
    }

    public final s0 k0(com.withpersona.sdk2.inquiry.internal.m renderProps, com.withpersona.sdk2.inquiry.internal.j.ShowLoadingSpinner renderState, Function0<Unit> backAction) {
        ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
        return new u0(new np.a0.a(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction), renderState.getDidGoBack());
    }

    public final s0 l0(com.withpersona.sdk2.inquiry.internal.m renderProps, com.withpersona.sdk2.inquiry.internal.j.UiStepRunning renderState, Function0<Unit> backAction) {
        final com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning;
        s0 c1Var;
        NextStep.Ui.PromptPage promptPage;
        NextStep.Ui.PromptPage promptPage2;
        NextStep.Ui.PromptPage promptPage3;
        NextStep.Ui.PromptPage promptPage4;
        NextStep.Ui.PromptPage promptPage5;
        NextStep.Ui.PromptPage promptPage6;
        NextStep.Ui.PromptPage promptPage7;
        NextStep.Ui.PromptPage promptPage8;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        List<UiComponentConfig> components = renderState.getComponents();
        String stepName = renderState.getStepName();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        boolean finalStep = renderState.getFinalStep();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        NextStep.Ui.Localizations localizations = renderState.getLocalizations();
        String gpsPermissionsTitle = (localizations == null || (promptPage8 = localizations.getPromptPage()) == null) ? null : promptPage8.getGpsPermissionsTitle();
        NextStep.Ui.Localizations localizations2 = renderState.getLocalizations();
        String gpsPermissionsPrompt = (localizations2 == null || (promptPage7 = localizations2.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsPrompt();
        NextStep.Ui.Localizations localizations3 = renderState.getLocalizations();
        String gpsPermissionsAllowButtonText = (localizations3 == null || (promptPage6 = localizations3.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsAllowButtonText();
        NextStep.Ui.Localizations localizations4 = renderState.getLocalizations();
        String gpsPermissionsBtnCancel = (localizations4 == null || (promptPage5 = localizations4.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsBtnCancel();
        NextStep.Ui.Localizations localizations5 = renderState.getLocalizations();
        String gpsFeatureTitle = (localizations5 == null || (promptPage4 = localizations5.getPromptPage()) == null) ? null : promptPage4.getGpsFeatureTitle();
        NextStep.Ui.Localizations localizations6 = renderState.getLocalizations();
        String gpsFeaturePrompt = (localizations6 == null || (promptPage3 = localizations6.getPromptPage()) == null) ? null : promptPage3.getGpsFeaturePrompt();
        NextStep.Ui.Localizations localizations7 = renderState.getLocalizations();
        String gpsFeatureTurnOnText = (localizations7 == null || (promptPage2 = localizations7.getPromptPage()) == null) ? null : promptPage2.getGpsFeatureTurnOnText();
        StepStyles.UiStepStyle styles = renderState.getStyles();
        List<g2> listZ = renderState.z();
        com.withpersona.sdk2.inquiry.internal.w transitionStatus = renderState.getTransitionStatus();
        String str = gpsPermissionsTitle;
        boolean z10 = false;
        if (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) {
            int i10 = c.f35246c[((com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zt.l();
                }
                z10 = true;
            }
        } else if ((transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.Transitioning) || Intrinsics.c(transitionStatus, com.withpersona.sdk2.inquiry.internal.w.c.f10906a) || (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession)) {
            z10 = true;
        } else if (transitionStatus != null) {
            throw new zt.l();
        }
        InternalErrorInfo transitionError = renderState.getTransitionError();
        boolean isRestoringState = renderState.getIsRestoringState();
        NextStep.Ui.Localizations localizations8 = renderState.getLocalizations();
        s6.Input bVar = new s6.Input(sessionToken, inquiryId, components, stepName, backStepEnabled, cancelButtonEnabled, finalStep, inquirySessionConfig, str, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, styles, listZ, z10, transitionError, isRestoringState, (localizations8 == null || (promptPage = localizations8.getPromptPage()) == null) ? null : promptPage.getNavBarTitle());
        to.e eVar = this.featureFlagManager;
        to.w wVar = to.w.f32636a;
        if (eVar.a(wVar)) {
            uiStepRunning = renderState;
            c1Var = new a1(!Intrinsics.c(renderState.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), bVar, renderState.getClientSideKey(), renderState.getDidGoBack(), new Function1() { // from class: vp.k
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.m0(this.f35296a, uiStepRunning, (s6.c) obj);
                }
            });
        } else {
            uiStepRunning = renderState;
            c1Var = new c1(!Intrinsics.c(uiStepRunning.getTransitionStatus(), com.withpersona.sdk2.inquiry.internal.w.c.f10906a), this.uiWorkflow, bVar, uiStepRunning.getClientSideKey(), uiStepRunning.getDidGoBack(), new Function1() { // from class: vp.l
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.n0(this.f35298a, uiStepRunning, (s6.c) obj);
                }
            });
        }
        if (uiStepRunning.getIsRestoringState()) {
            d().n(this.restoreUiStepStateWorkerFactory.a(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName()), new Function1() { // from class: vp.m
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.o0(this.f35300a, uiStepRunning, (com.withpersona.sdk2.inquiry.internal.r.b) obj);
                }
            });
            if (!this.featureFlagManager.a(wVar)) {
                return new u0(new np.a0.a(uiStepRunning.getStyles(), true, backAction), uiStepRunning.getDidGoBack());
            }
        } else if (uiStepRunning.getTransitionError() != null) {
            d().m(np.t.a(uiStepRunning.getTransitionError()).name(), new f(null));
        }
        return c1Var;
    }

    public final com.withpersona.sdk2.inquiry.internal.j.ShowLoadingSpinner p0(np.o0 stepState) {
        return new com.withpersona.sdk2.inquiry.internal.j.ShowLoadingSpinner(stepState.A(), stepState.i(), null, stepState.g(), stepState.getStyles(), true, stepState.a(), 4, null);
    }

    public final void q0(final com.withpersona.sdk2.inquiry.internal.j renderState, ls.g<com.withpersona.sdk2.inquiry.internal.j> context) {
        final String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        final com.withpersona.sdk2.inquiry.internal.w transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.n(this.transitionWorkerFactory.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, b().getValue().getShareToken(), b().getValue().f1(), renderState.getInquirySessionConfig(), ((com.withpersona.sdk2.inquiry.internal.w.Transitioning) transitionStatus).getTransitionData()), new Function1() { // from class: vp.o
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.s0(this.f35305a, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.x.b) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.UpdateInquirySession) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.n(this.updateInquirySessionWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig()), new Function1() { // from class: vp.p
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.t0(this.f35311a, sessionToken, transitionStatus, (com.withpersona.sdk2.inquiry.internal.network.i) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState aVar = (com.withpersona.sdk2.inquiry.internal.w.CheckingForNextState) transitionStatus;
            context.n(this.pollingWorker.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, aVar.getPollingMode(), renderState.getInquirySessionConfig(), aVar.getCanReuseWorkflow()), new Function1() { // from class: vp.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.u0(this.f35314a, transitionStatus, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.n.c) obj);
                }
            });
            return;
        }
        if (!Intrinsics.c(transitionStatus, com.withpersona.sdk2.inquiry.internal.w.c.f10906a)) {
            if (transitionStatus != null) {
                throw new zt.l();
            }
        } else {
            if (sessionToken == null || inquiryId == null || fromStep == null) {
                return;
            }
            context.n(this.transitionBackWorker.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, fromStep, renderState.getInquirySessionConfig()), new Function1() { // from class: vp.r
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.v0(this.f35322a, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.network.h) obj);
                }
            });
        }
    }

    public final void w0() {
        com.withpersona.sdk2.inquiry.internal.j jVar = (com.withpersona.sdk2.inquiry.internal.j) d().i();
        if (jVar != null && (jVar instanceof com.withpersona.sdk2.inquiry.internal.j.UiStepRunning)) {
            com.withpersona.sdk2.inquiry.internal.j.UiStepRunning uiStepRunning = (com.withpersona.sdk2.inquiry.internal.j.UiStepRunning) jVar;
            this.uiStepSavedStateHelper.e(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName(), uiStepRunning.getComponents());
        }
    }

    public final void x0(String sessionToken, InternalErrorInfo error, String errorMessage) {
        if (errorMessage == null) {
            errorMessage = np.t.b(error);
        }
        z0(new com.withpersona.sdk2.inquiry.internal.l.Error(errorMessage, np.t.a(error), error, sessionToken));
    }

    public void z0(@NotNull com.withpersona.sdk2.inquiry.internal.l output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof com.withpersona.sdk2.inquiry.internal.l.Cancel) {
            com.withpersona.sdk2.inquiry.internal.l.Cancel cancel = (com.withpersona.sdk2.inquiry.internal.l.Cancel) output;
            if (cancel.getRedirectUri() == null) {
                output = com.withpersona.sdk2.inquiry.internal.l.Cancel.f(cancel, null, null, null, null, null, null, null, false, false, (String) this.savedStateHandle.b("redirect_uri"), 511, null);
            }
        }
        super.e(output);
    }
}
