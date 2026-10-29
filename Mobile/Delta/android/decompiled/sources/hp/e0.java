package hp;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
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
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.model.UiFramework;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import gp.InquiryAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\b\u0000\u0018\u0000 ¿\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004À\u0001Á\u0001Bç\u0001\b\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\b\b\u0001\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@J-\u0010F\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020K2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020N2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00052\u0006\u0010C\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00052\u0006\u0010C\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ-\u0010[\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020Z2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b[\u0010\\J-\u0010^\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020]2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b^\u0010_J-\u0010a\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020`2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\ba\u0010bJ%\u0010d\u001a\u00020\u00052\u0006\u0010C\u001a\u00020c2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bd\u0010eJ-\u0010g\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020i2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bj\u0010kJ?\u0010r\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010m\u001a\u00020l2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00032\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00030tH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020>H\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020B2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u0014\u0010\u007f\u001a\u00020p*\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J5\u0010\u0085\u0001\u001a\u00020>2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020~2\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020>2\u0007\u0010\u0087\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020>¢\u0006\u0005\b\u008c\u0001\u0010yR\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0016\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001¨\u0006Â\u0001"}, d2 = {"Lhp/e0;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Lhp/s0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "updateInquirySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "exchangeOneTimeCodeWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/m$a;", "redeemRelaySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "governmentIdWorkflow", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "selfieWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "uiWorkflow", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "documentWorkflow", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "integrationWorkflow", "Lpq/e;", "externalInquiryController", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/o$a;", "restoreUiStepStateWorkerFactory", "Lho/b$a;", "featureFlagWorkerFactory", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "trackingMetadataProvider", "Lcom/withpersona/sdk2/inquiry/internal/q;", "silentNetworkAuthenticationManager", "Lzo/f;", "deviceMetricsOrchestrator", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/internal/c$a;Lcom/withpersona/sdk2/inquiry/internal/a$a;Lcom/withpersona/sdk2/inquiry/internal/k$b;Lcom/withpersona/sdk2/inquiry/internal/r$a;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;Lcom/withpersona/sdk2/inquiry/internal/v$a;Lcom/withpersona/sdk2/inquiry/internal/f$a;Lcom/withpersona/sdk2/inquiry/internal/m$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lpq/e;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lcom/withpersona/sdk2/inquiry/internal/o$a;Lho/b$a;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lcom/withpersona/sdk2/inquiry/internal/q;Lzo/f;Lku/p0;)V", "state", "", "G", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "renderState", "Lkotlin/Function0;", "backAction", "k0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "U", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "h0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "l0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Q", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "M", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Z", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "O", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "S", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "e0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "c0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "N", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "g0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "didGoBack", "X", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lgp/e;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)Lhp/s0;", "Lvr/f;", "context", "q0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Lvr/f;)V", "w0", "()V", "Lzo/m0;", "stepState", "p0", "(Lzo/m0;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "K", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "", "sessionToken", "error", "errorMessage", "x0", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "output", "z0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V", "F", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "L", "e", "Landroidx/lifecycle/l0;", "f", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "g", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "h", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "i", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "j", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "k", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "l", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "m", "Lcom/withpersona/sdk2/inquiry/internal/m$a;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "o", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "p", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "q", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "r", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "s", "Lpq/e;", "t", "Luq/a;", "u", "Lpq/c;", "v", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "w", "Lcom/withpersona/sdk2/inquiry/internal/o$a;", "x", "Lho/b$a;", "y", "Lgo/e;", "z", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "A", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "B", "Lcom/withpersona/sdk2/inquiry/internal/q;", "C", "Lzo/f;", "D", "a", "b", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends vr.c<InquiryWorkflow$Props, InquiryState, InquiryWorkflow$Output, s0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final TrackingMetadataProvider trackingMetadataProvider;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.q silentNetworkAuthenticationManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final zo.f deviceMetricsOrchestrator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.c.a createInquiryWorker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a inquirySessionWorker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.k.b pollingWorker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.r.a transitionBackWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransitionWorker.a transitionWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.v.a updateInquirySessionWorkerFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.f.a exchangeOneTimeCodeWorkerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.m.a redeemRelaySessionWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdWorkflow governmentIdWorkflow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelfieWorkflow selfieWorkflow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiWorkflow uiWorkflow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentWorkflow documentWorkflow;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntegrationWorkflow integrationWorkflow;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.e externalInquiryController;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.o.a restoreUiStepStateWorkerFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ho.b.a featureFlagWorkerFactory;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lhp/e0$b;", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lhp/e0;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lhp/e0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        e0 a(@NotNull InquiryWorkflow$Props props, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19628a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f19629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f19630d;

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
            f19628a = iArr;
            int[] iArr2 = new int[yp.a.values().length];
            try {
                iArr2[yp.a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[yp.a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[zo.a0.values().length];
            try {
                iArr3[zo.a0.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[zo.a0.Blocking.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f19629c = iArr3;
            int[] iArr4 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr4[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f19630d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$handleState$5", f = "InquiryStateManager.kt", l = {211}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19631t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f19633a;

            public a(e0 e0Var) {
                this.f19633a = e0Var;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(pq.a aVar, nt.b<? super Unit> bVar) {
                if (!(aVar instanceof pq.a.CancelRequest)) {
                    throw new jt.l();
                }
                pq.a.CancelRequest cancelRequest = (pq.a.CancelRequest) aVar;
                e0.I(this.f19633a, cancelRequest.getForce(), cancelRequest.getSkipBackendCall());
                return Unit.f22483a;
            }
        }

        public d(nt.b<? super d> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return e0.this.new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19631t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h<pq.a> hVarC = e0.this.externalInquiryController.c();
                a aVar = new a(e0.this);
                this.f19631t = 1;
                if (hVarC.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderComplete$1", f = "InquiryStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19634t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryState.Complete f19636v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InquiryState.Complete complete, nt.b<? super e> bVar) {
            super(1, bVar);
            this.f19636v = complete;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return e0.this.new e(this.f19636v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f19634t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            e0.this.z0(new InquiryWorkflow$Output.Complete(this.f19636v.getInquiryId(), this.f19636v.getInquiryStatus(), this.f19636v.s(), this.f19636v.getSessionToken(), this.f19636v.getRedirectUri()));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderUiStep$2", f = "InquiryStateManager.kt", l = {846}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19637t;

        public f(nt.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return e0.this.new f(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19637t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f19637t = 1;
                if (ku.z0.b(2000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            WorkflowState workflowStateI = e0.this.d().i();
            InquiryState.UiStepRunning uiStepRunning = workflowStateI instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateI : null;
            if (uiStepRunning == null) {
                return Unit.f22483a;
            }
            e0.this.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 1966079, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull InquiryWorkflow$Props props, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull com.withpersona.sdk2.inquiry.internal.c.a createInquiryWorker, @NotNull com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a inquirySessionWorker, @NotNull com.withpersona.sdk2.inquiry.internal.k.b pollingWorker, @NotNull com.withpersona.sdk2.inquiry.internal.r.a transitionBackWorker, @NotNull TransitionWorker.a transitionWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.internal.v.a updateInquirySessionWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.internal.f.a exchangeOneTimeCodeWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.internal.m.a redeemRelaySessionWorkerFactory, @NotNull GovernmentIdWorkflow governmentIdWorkflow, @NotNull SelfieWorkflow selfieWorkflow, @NotNull UiWorkflow uiWorkflow, @NotNull DocumentWorkflow documentWorkflow, @NotNull IntegrationWorkflow integrationWorkflow, @NotNull pq.e externalInquiryController, @NotNull uq.a navigationStateManager, @NotNull pq.c externalEventLogger, @NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull com.withpersona.sdk2.inquiry.internal.o.a restoreUiStepStateWorkerFactory, @NotNull ho.b.a featureFlagWorkerFactory, @NotNull go.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull com.withpersona.sdk2.inquiry.internal.q silentNetworkAuthenticationManager, @NotNull zo.f deviceMetricsOrchestrator, @NotNull ku.p0 coroutineScope) {
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
            InquiryState inquiryState = (InquiryState) d().i();
            if (inquiryState instanceof InquiryState.UiStepRunning) {
                f(InquiryState.UiStepRunning.r((InquiryState.UiStepRunning) inquiryState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, true, null, 1572863, null));
            }
        }
        d().o(new Function1() { // from class: hp.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.B(this.f19677a, (InquiryState) obj);
            }
        });
    }

    public static final Unit B(e0 e0Var, InquiryState inquiryState) {
        if (inquiryState == null) {
            return Unit.f22483a;
        }
        e0Var.G(inquiryState);
        return Unit.f22483a;
    }

    public static final Unit H(e0 e0Var) {
        J(e0Var, false, false, 4, null);
        return Unit.f22483a;
    }

    public static final void I(e0 e0Var, boolean z10, boolean z11) {
        InquiryState inquiryState = (InquiryState) e0Var.d().i();
        if (inquiryState == null) {
            return;
        }
        String inquiryId = inquiryState.getInquiryId();
        String sessionToken = inquiryState.getSessionToken();
        StepStyle styles = inquiryState.getStyles();
        NextStep.CancelDialog cancelDialog = inquiryState.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = inquiryState.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = inquiryState.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = inquiryState.getCancelDialog();
        e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z10, z11, null, Barcode.FORMAT_UPC_A, null));
    }

    public static /* synthetic */ void J(e0 e0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        I(e0Var, z10, z11);
    }

    public static final Unit P(e0 e0Var, InquiryState.CreateInquirySession createInquirySession, com.withpersona.sdk2.inquiry.internal.network.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.b.Success) {
            com.withpersona.sdk2.inquiry.internal.network.b.Success success = (com.withpersona.sdk2.inquiry.internal.network.b.Success) it;
            e0Var.f(new InquiryState.LoadFeatureFlagSession(createInquirySession.getInquiryId(), success.getSessionToken(), success.getTrackingEventsUrl(), success.getInquirySessionConfig()));
            e0Var.externalEventLogger.b(new InquiryEvent.StartEvent(createInquirySession.getInquiryId(), com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(success.getSessionToken())));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.b.Error)) {
                throw new jt.l();
            }
            y0(e0Var, createInquirySession.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.b.Error) it).getCause(), null, 4, null);
        }
        return Unit.f22483a;
    }

    public static final Unit R(e0 e0Var, InquiryState.DocumentStepRunning documentStepRunning, DocumentWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, DocumentWorkflow.b.C0165b.f10088a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, DocumentWorkflow.b.a.f10087a)) {
            e0Var.f(InquiryState.DocumentStepRunning.r(documentStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, null, null, null, null, 16375, null));
        } else if (it instanceof DocumentWorkflow.b.Errored) {
            DocumentWorkflow.b.Errored cVar = (DocumentWorkflow.b.Errored) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(documentStepRunning));
            } else {
                y0(e0Var, documentStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else {
            if (!Intrinsics.c(it, DocumentWorkflow.b.d.f10090a)) {
                throw new jt.l();
            }
            e0Var.f(InquiryState.DocumentStepRunning.r(documentStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, null, 16375, null));
        }
        return Unit.f22483a;
    }

    public static final Unit T(e0 e0Var, InquiryState.ExchangeOneTimeCode exchangeOneTimeCode, com.withpersona.sdk2.inquiry.internal.network.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.d.Success) {
            com.withpersona.sdk2.inquiry.internal.network.d.Success success = (com.withpersona.sdk2.inquiry.internal.network.d.Success) it;
            if (success.getSessionToken() == null) {
                e0Var.f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                String trackingEventsUrl = success.getTrackingEventsUrl();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.a();
                }
                e0Var.f(new InquiryState.LoadFeatureFlagSession(inquiryId, sessionToken, trackingEventsUrl, inquirySessionConfig));
            }
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.d.Error)) {
                throw new jt.l();
            }
            y0(e0Var, exchangeOneTimeCode.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.d.Error) it).getCause(), null, 4, null);
        }
        return Unit.f22483a;
    }

    public static final Unit V(e0 e0Var, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, GovernmentIdWorkflow.a.b.f10661a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof GovernmentIdWorkflow.a.c) {
            GovernmentIdWorkflow.a.c cVar = (GovernmentIdWorkflow.a.c) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(governmentIdStepRunning));
            } else {
                y0(e0Var, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.c(it, GovernmentIdWorkflow.a.d.f10663a)) {
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.c(it, GovernmentIdWorkflow.a.C0192a.f10660a)) {
                throw new jt.l();
            }
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f22483a;
    }

    public static final Unit W(e0 e0Var, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, GovernmentIdWorkflow.a.b.f10661a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof GovernmentIdWorkflow.a.c) {
            GovernmentIdWorkflow.a.c cVar = (GovernmentIdWorkflow.a.c) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(governmentIdStepRunning));
            } else {
                y0(e0Var, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.c(it, GovernmentIdWorkflow.a.d.f10663a)) {
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.c(it, GovernmentIdWorkflow.a.C0192a.f10660a)) {
                throw new jt.l();
            }
            e0Var.f(InquiryState.GovernmentIdStepRunning.r(governmentIdStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f22483a;
    }

    public static final Unit Y(e0 e0Var, InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.a.Success) {
            com.withpersona.sdk2.inquiry.internal.network.a.Success success = (com.withpersona.sdk2.inquiry.internal.network.a.Success) it;
            String redirectUri = success.getRedirectUri();
            if (redirectUri != null) {
                e0Var.savedStateHandle.i("redirect_uri", redirectUri);
            }
            if (jq.j.e(success.getInquiryId())) {
                e0Var.z0(new InquiryWorkflow$Output.ReinitializeWithFallbackMode(success.getInquiryId(), success.getFallbackSessionToken()));
            } else {
                e0Var.f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, success.getInquirySession(), 2, null));
            }
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.a.Error)) {
                throw new jt.l();
            }
            com.withpersona.sdk2.inquiry.internal.network.a.Error error = (com.withpersona.sdk2.inquiry.internal.network.a.Error) it;
            e0Var.x0(inquiryAttributes.getSessionToken(), error.getCause(), error.getDebugMessage());
        }
        return Unit.f22483a;
    }

    public static final Unit a0(e0 e0Var, InquiryState.IntegrationStepRunning integrationStepRunning, IntegrationWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.c(it, IntegrationWorkflow.b.c.f11129a)) {
            if (Intrinsics.c(it, IntegrationWorkflow.b.d.f11130a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.c(it, IntegrationWorkflow.b.a.f11127a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.c(it, IntegrationWorkflow.b.C0203b.f11128a)) {
                    throw new jt.l();
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
                e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit b0(e0 e0Var, InquiryState.IntegrationStepRunning integrationStepRunning, IntegrationWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.c(it, IntegrationWorkflow.b.c.f11129a)) {
            if (Intrinsics.c(it, IntegrationWorkflow.b.d.f11130a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.c(it, IntegrationWorkflow.b.a.f11127a)) {
                e0Var.f(InquiryState.IntegrationStepRunning.r(integrationStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.c(it, IntegrationWorkflow.b.C0203b.f11128a)) {
                    throw new jt.l();
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
                e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit d0(e0 e0Var, InquiryState.LoadFeatureFlagSession loadFeatureFlagSession, ho.b.AbstractC0349b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof ho.b.AbstractC0349b.Success) && !(it instanceof ho.b.AbstractC0349b.a)) {
            throw new jt.l();
        }
        e0Var.trackingEventsLogger.setIsEnabled(!e0Var.b().getValue().M());
        e0Var.trackingMetadataProvider.setFeatureFlags(e0Var.featureFlagManager.b());
        TrackingEventsLogger.logInquiryStartEvent$default(e0Var.trackingEventsLogger, com.withpersona.sdk2.inquiry.internal.j.a(e0Var.b().getValue(), e0Var.featureFlagManager.a(go.w.f18318a) ? UiFramework.PersonaWorkflow : UiFramework.SquareWorkflow), false, 2, null);
        if (e0Var.featureFlagManager.a(go.b.f18286a)) {
            e0Var.deviceMetricsOrchestrator.a(loadFeatureFlagSession.getSessionToken());
        }
        e0Var.f(new InquiryState.ShowLoadingSpinner(loadFeatureFlagSession.getSessionToken(), loadFeatureFlagSession.getTrackingEventsUrl(), null, loadFeatureFlagSession.getInquiryId(), null, true, loadFeatureFlagSession.getInquirySessionConfig(), 4, null));
        return Unit.f22483a;
    }

    public static final Unit f0(e0 e0Var, InquiryState.RedeemRelaySession redeemRelaySession, com.withpersona.sdk2.inquiry.internal.network.g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.g.Success) {
            com.withpersona.sdk2.inquiry.internal.network.g.Success success = (com.withpersona.sdk2.inquiry.internal.network.g.Success) it;
            if (success.getSessionToken() == null) {
                e0Var.f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.a();
                }
                e0Var.f(new InquiryState.LoadFeatureFlagSession(inquiryId, sessionToken, null, inquirySessionConfig, 4, null));
            }
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.g.Error)) {
                throw new jt.l();
            }
            y0(e0Var, redeemRelaySession.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.g.Error) it).getCause(), null, 4, null);
        }
        return Unit.f22483a;
    }

    public static final Unit i0(e0 e0Var, InquiryState.SelfieStepRunning selfieStepRunning, SelfieWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, SelfieWorkflow.b.C0231b.f12634a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.d.f12636a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.a.f12633a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof SelfieWorkflow.b.Error)) {
                throw new jt.l();
            }
            SelfieWorkflow.b.Error cVar = (SelfieWorkflow.b.Error) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(selfieStepRunning));
            } else {
                y0(e0Var, selfieStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        }
        return Unit.f22483a;
    }

    public static final Unit j0(e0 e0Var, InquiryState.SelfieStepRunning selfieStepRunning, SelfieWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, SelfieWorkflow.b.C0231b.f12634a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.d.f12636a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.c(it, SelfieWorkflow.b.a.f12633a)) {
            e0Var.f(InquiryState.SelfieStepRunning.r(selfieStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof SelfieWorkflow.b.Error)) {
                throw new jt.l();
            }
            SelfieWorkflow.b.Error cVar = (SelfieWorkflow.b.Error) it;
            if (e0Var.K(cVar.getCause())) {
                e0Var.f(e0Var.p0(selfieStepRunning));
            } else {
                y0(e0Var, selfieStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        }
        return Unit.f22483a;
    }

    public static final Unit m0(e0 e0Var, InquiryState.UiStepRunning uiStepRunning, UiWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, UiWorkflow.b.C0250b.f13771a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof UiWorkflow.b.d) {
            UiWorkflow.b.d dVar = (UiWorkflow.b.d) it;
            if (e0Var.K(dVar.getCause())) {
                e0Var.f(e0Var.p0(uiStepRunning));
            } else {
                e0Var.x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof UiWorkflow.b.FinishedWithoutTransition) {
            UiWorkflow.b.FinishedWithoutTransition fVar = (UiWorkflow.b.FinishedWithoutTransition) it;
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(fVar.getFromComponent(), fVar.a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.FinishedWithTransition) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, ((UiWorkflow.b.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.a) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof UiWorkflow.b.c)) {
                throw new jt.l();
            }
            e0Var.z0(new InquiryWorkflow$Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f22483a;
    }

    public static final Unit n0(e0 e0Var, InquiryState.UiStepRunning uiStepRunning, UiWorkflow.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, UiWorkflow.b.C0250b.f13771a)) {
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
            e0Var.z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof UiWorkflow.b.d) {
            UiWorkflow.b.d dVar = (UiWorkflow.b.d) it;
            if (e0Var.K(dVar.getCause())) {
                e0Var.f(e0Var.p0(uiStepRunning));
            } else {
                e0Var.x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof UiWorkflow.b.FinishedWithoutTransition) {
            UiWorkflow.b.FinishedWithoutTransition fVar = (UiWorkflow.b.FinishedWithoutTransition) it;
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(fVar.getFromComponent(), fVar.a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.FinishedWithTransition) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, ((UiWorkflow.b.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.b.a) {
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, TransitionStatus.TransitioningBack.f11381a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof UiWorkflow.b.c)) {
                throw new jt.l();
            }
            e0Var.z0(new InquiryWorkflow$Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f22483a;
    }

    public static final Unit o0(e0 e0Var, InquiryState.UiStepRunning uiStepRunning, com.withpersona.sdk2.inquiry.internal.o.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.internal.o.b.a.f12057a)) {
            if (!(e0Var.d().i() instanceof InquiryState.UiStepRunning)) {
                return Unit.f22483a;
            }
            e0Var.f(e0Var.p0(uiStepRunning));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.o.b.C0220b)) {
                throw new jt.l();
            }
            WorkflowState workflowStateI = e0Var.d().i();
            InquiryState.UiStepRunning uiStepRunning2 = workflowStateI instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateI : null;
            if (uiStepRunning2 == null) {
                return Unit.f22483a;
            }
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning2, null, null, null, null, null, null, null, null, null, ((com.withpersona.sdk2.inquiry.internal.o.b.C0220b) it).a(), false, false, false, null, null, null, null, null, null, false, null, 1572351, null));
        }
        return Unit.f22483a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r0(e0 e0Var, InquiryState inquiryState, String str, InternalErrorInfo internalErrorInfo) {
        Collection<UiComponentError> collectionValues;
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (!(internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                throw new jt.l();
            }
            y0(e0Var, str, internalErrorInfo, null, 4, null);
            return;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        arrayList = null;
        ArrayList arrayList = null;
        if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
            WorkflowState workflowStateI = e0Var.d().i();
            InquiryState.UiStepRunning uiStepRunning = workflowStateI instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateI : null;
            if (uiStepRunning == null) {
                return;
            }
            Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
            if (details != null && (collectionValues = details.values()) != null) {
                Collection<UiComponentError> collection = collectionValues;
                arrayList = new ArrayList(kotlin.collections.q.u(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(new UiComponentErrorInfo((UiComponentError) it.next(), 0L, 2, null));
                }
            }
            e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, arrayList, null, null, false, null, 2031607, null));
            return;
        }
        if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
            if (inquiryState instanceof zo.m0) {
                e0Var.f(e0Var.p0((zo.m0) inquiryState));
                return;
            } else {
                y0(e0Var, str, internalErrorInfo, null, 4, null);
                return;
            }
        }
        if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
            throw new jt.l();
        }
        if (!networkErrorInfo.isRecoverable()) {
            y0(e0Var, str, internalErrorInfo, null, 4, null);
            return;
        }
        WorkflowState workflowStateI2 = e0Var.d().i();
        InquiryState.UiStepRunning uiStepRunning2 = workflowStateI2 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateI2 : null;
        if (uiStepRunning2 == null) {
            return;
        }
        e0Var.f(InquiryState.UiStepRunning.r(uiStepRunning2, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, networkErrorInfo, null, false, null, 1966071, null));
    }

    public static final Unit s0(e0 e0Var, InquiryState inquiryState, String str, TransitionWorker.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof TransitionWorker.b.Error) {
            r0(e0Var, inquiryState, str, ((TransitionWorker.b.Error) it).getCause());
        } else {
            if (!(it instanceof TransitionWorker.b.Success)) {
                throw new jt.l();
            }
            InquiryState inquiryState2 = (InquiryState) e0Var.d().i();
            if (inquiryState2 == null) {
                return Unit.f22483a;
            }
            e0Var.f(inquiryState2.p(new TransitionStatus.UpdateInquirySession(((TransitionWorker.b.Success) it).getNextState(), false)));
        }
        return Unit.f22483a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit t0(e0 e0Var, String str, TransitionStatus transitionStatus, com.withpersona.sdk2.inquiry.internal.network.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.i.Error) {
            y0(e0Var, str, ((com.withpersona.sdk2.inquiry.internal.network.i.Error) it).getCause(), null, 4, null);
        } else {
            if (!Intrinsics.c(it, com.withpersona.sdk2.inquiry.internal.network.i.b.f12051a)) {
                throw new jt.l();
            }
            InquiryState inquiryState = (InquiryState) e0Var.d().i();
            if (inquiryState == null) {
                return Unit.f22483a;
            }
            TransitionStatus.UpdateInquirySession updateInquirySession = (TransitionStatus.UpdateInquirySession) transitionStatus;
            if (updateInquirySession.getNextStep() != null) {
                e0Var.f(updateInquirySession.getNextStep());
            } else {
                e0Var.f(inquiryState.p(new TransitionStatus.CheckingForNextState(null, updateInquirySession.getCanReuseWorkflow(), 1, 0 == true ? 1 : 0)));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit u0(e0 e0Var, TransitionStatus transitionStatus, InquiryState inquiryState, String str, com.withpersona.sdk2.inquiry.internal.k.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.k.c.Success) {
            e0Var.f(((com.withpersona.sdk2.inquiry.internal.k.c.Success) it).a((InquiryState) e0Var.d().i(), ((TransitionStatus.CheckingForNextState) transitionStatus).getCanReuseWorkflow()));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.k.c.Error)) {
                throw new jt.l();
            }
            r0(e0Var, inquiryState, str, ((com.withpersona.sdk2.inquiry.internal.k.c.Error) it).getCause());
        }
        return Unit.f22483a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit v0(e0 e0Var, InquiryState inquiryState, String str, com.withpersona.sdk2.inquiry.internal.network.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.h.Success) {
            com.withpersona.sdk2.inquiry.internal.network.h.Success success = (com.withpersona.sdk2.inquiry.internal.network.h.Success) it;
            success.getNextState().o(true);
            e0Var.f(success.getNextState());
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.internal.network.h.Error)) {
                throw new jt.l();
            }
            com.withpersona.sdk2.inquiry.internal.network.h.Error error = (com.withpersona.sdk2.inquiry.internal.network.h.Error) it;
            if (e0Var.K(error.getCause()) && (inquiryState instanceof zo.m0)) {
                e0Var.f(e0Var.p0((zo.m0) inquiryState));
            } else {
                y0(e0Var, str, error.getCause(), null, 4, null);
            }
        }
        return Unit.f22483a;
    }

    public static /* synthetic */ void y0(e0 e0Var, String str, InternalErrorInfo internalErrorInfo, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        e0Var.x0(str, internalErrorInfo, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InquiryState F(@NotNull InquiryWorkflow$Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (props instanceof InquiryWorkflow$Props.TemplateProps) {
            InquiryWorkflow$Props.TemplateProps templateProps = (InquiryWorkflow$Props.TemplateProps) props;
            return new InquiryState.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.g(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate(), null, templateProps.getRedirectUri(), Barcode.FORMAT_QR_CODE, null);
        }
        int i10 = 2;
        InquirySessionConfig inquirySessionConfig = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (props instanceof InquiryWorkflow$Props.OneTimeCodeProps) {
            return new InquiryState.ExchangeOneTimeCode(((InquiryWorkflow$Props.OneTimeCodeProps) props).getOneTimeLinkCode(), inquirySessionConfig, i10, objArr3 == true ? 1 : 0);
        }
        if (props instanceof InquiryWorkflow$Props.RelaySessionProps) {
            return new InquiryState.RedeemRelaySession(((InquiryWorkflow$Props.RelaySessionProps) props).getRelaySessionToken(), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        if (!(props instanceof InquiryWorkflow$Props.InquiryProps)) {
            throw new jt.l();
        }
        InquiryWorkflow$Props.InquiryProps inquiryProps = (InquiryWorkflow$Props.InquiryProps) props;
        if (jq.j.e(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new InquiryState.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, 4, null);
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken != null && sessionToken.length() != 0) {
            return new InquiryState.LoadFeatureFlagSession(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, InquirySessionConfig.INSTANCE.a(), 4, null);
        }
        return new InquiryState.CreateInquirySession(inquiryProps.getInquiryId(), null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(InquiryState state) {
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
        zo.m0 m0Var = state instanceof zo.m0 ? (zo.m0) state : null;
        if (m0Var != null && (redirectUri = m0Var.getRedirectUri()) != null) {
            this.savedStateHandle.i("redirect_uri", redirectUri);
        }
        q0(state, d());
        this.silentNetworkAuthenticationManager.d(state);
        TransitionStatus transitionStatus = state.getTransitionStatus();
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.f11381a;
        if (Intrinsics.c(transitionStatus, transitioningBack)) {
            this.silentNetworkAuthenticationManager.b();
        }
        this.navigationStateManager.e(Intrinsics.c(state.getTransitionStatus(), transitioningBack));
        Function0<Unit> function0 = new Function0() { // from class: hp.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e0.H(this.f19711a);
            }
        };
        d().m("controllerRequestCollector", new d(null));
        InquiryWorkflow$Props value = b().getValue();
        if (state instanceof InquiryState.CreateInquiryFromTemplate) {
            s0VarC0 = N(value, (InquiryState.CreateInquiryFromTemplate) state, function0);
        } else if (state instanceof InquiryState.ResumeFallbackInquiry) {
            s0VarC0 = g0(value, (InquiryState.ResumeFallbackInquiry) state, function0);
        } else if (state instanceof InquiryState.CreateInquirySession) {
            s0VarC0 = O(value, (InquiryState.CreateInquirySession) state, function0);
        } else if (state instanceof InquiryState.ExchangeOneTimeCode) {
            s0VarC0 = S(value, (InquiryState.ExchangeOneTimeCode) state, function0);
        } else if (state instanceof InquiryState.RedeemRelaySession) {
            s0VarC0 = e0(value, (InquiryState.RedeemRelaySession) state, function0);
        } else if (state instanceof InquiryState.ShowLoadingSpinner) {
            s0VarC0 = k0(value, (InquiryState.ShowLoadingSpinner) state, function0);
        } else if (state instanceof InquiryState.GovernmentIdStepRunning) {
            s0VarC0 = U(value, (InquiryState.GovernmentIdStepRunning) state);
        } else if (state instanceof InquiryState.SelfieStepRunning) {
            s0VarC0 = h0(value, (InquiryState.SelfieStepRunning) state, function0);
        } else if (state instanceof InquiryState.UiStepRunning) {
            s0VarC0 = l0(value, (InquiryState.UiStepRunning) state, function0);
        } else if (state instanceof InquiryState.DocumentStepRunning) {
            s0VarC0 = Q((InquiryState.DocumentStepRunning) state);
        } else if (state instanceof InquiryState.Complete) {
            s0VarC0 = M((InquiryState.Complete) state);
        } else if (state instanceof InquiryState.IntegrationStepRunning) {
            s0VarC0 = Z(value, (InquiryState.IntegrationStepRunning) state);
        } else {
            if (!(state instanceof InquiryState.LoadFeatureFlagSession)) {
                throw new jt.l();
            }
            s0VarC0 = c0((InquiryState.LoadFeatureFlagSession) state, function0);
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

    public final s0 M(InquiryState.Complete renderState) {
        d().m("complete", new e(renderState, null));
        return new a();
    }

    public final s0 N(InquiryWorkflow$Props renderProps, InquiryState.CreateInquiryFromTemplate renderState, Function0<Unit> backAction) {
        return X(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.s(), renderState.getThemeSetId(), null, 2304, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    public final s0 O(InquiryWorkflow$Props renderProps, final InquiryState.CreateInquirySession renderState, Function0<Unit> backAction) {
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.inquirySessionWorker.a(renderState.getInquiryId(), renderState.getInquirySessionDataWrapper()), new Function1() { // from class: hp.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.P(this.f19714a, renderState, (com.withpersona.sdk2.inquiry.internal.network.b) obj);
            }
        });
        return new u0(new zo.y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 Q(final InquiryState.DocumentStepRunning renderState) {
        DocumentWorkflow.StartPage review;
        NextStep.Document.Config config = renderState.getDocumentStep().getConfig();
        String documentId = config.getDocumentId();
        int i10 = c.f19630d[config.getStartPage().ordinal()];
        if (i10 == 1) {
            review = DocumentWorkflow.StartPage.Prompt.f10038a;
        } else {
            if (i10 != 2) {
                throw new jt.l();
            }
            review = documentId != null ? new DocumentWorkflow.StartPage.Review(documentId) : DocumentWorkflow.StartPage.Prompt.f10038a;
        }
        DocumentWorkflow.StartPage startPage = review;
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
        DocumentPages pages = renderState.getPages();
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
        DocumentWorkflow.Input input = new DocumentWorkflow.Input(sessionToken, inquiryId, fromStep, fromComponent, title, prompt, disclaimer, btnSubmit, title2, description, fieldKeyDocument, kind, documentId, startPage, pages, documentFileLimit, zBooleanValue, zBooleanValue2, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, largeFileErrorPrompt, styles, assetConfig, pendingPageTextVerticalPosition, navBarTitle, checkPage != null ? checkPage.getNavBarTitle() : null, config.getLocalizations().getPendingPage().getNavBarTitle(), renderState.getCustomPendingPage());
        Function1 function1 = new Function1() { // from class: hp.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.R(this.f19580a, renderState, (DocumentWorkflow.b) obj);
            }
        };
        if (this.featureFlagManager.a(go.w.f18318a)) {
            return new hp.b(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), input, renderState.getFromStep(), renderState.getDidGoBack(), function1);
        }
        return new hp.d(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), this.documentWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), function1);
    }

    public final s0 S(InquiryWorkflow$Props renderProps, final InquiryState.ExchangeOneTimeCode renderState, Function0<Unit> backAction) {
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.exchangeOneTimeCodeWorkerFactory.create(renderState.getOneTimeLinkCode()), new Function1() { // from class: hp.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.T(this.f19685a, renderState, (com.withpersona.sdk2.inquiry.internal.network.d) obj);
            }
        });
        return new u0(new zo.y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 U(InquiryWorkflow$Props renderProps, final InquiryState.GovernmentIdStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> listG = renderState.G();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listG.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Id id2 = (Id) it.next();
            String countryCode2 = renderState.getCountryCode();
            IdConfig idConfigO = com.withpersona.sdk2.inquiry.governmentid.d.o(id2, countryCode2 != null ? countryCode2 : "US", renderState.getManualCaptureButtonDelayMs());
            if (idConfigO != null) {
                arrayList.add(idConfigO);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> listE = renderState.E();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        String countryCode3 = renderState.getCountryCode();
        String str = countryCode3 != null ? countryCode3 : "US";
        List<NextStep.GovernmentId.LocalizationOverride> listP = renderState.P();
        GovernmentIdWorkflow.Input.Strings stringsJ = gp.a.j(localizations, str, listP != null ? CollectionsKt.E0(listP) : null);
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> listD = renderState.D();
        List<NextStep.GovernmentId.VideoCaptureMethod> listD0 = renderState.d0();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(listD0, 10));
        Iterator<T> it2 = listD0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(mn.a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(0L, listD, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        NextStep.GovernmentId.AssetConfig assetConfig2 = assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig;
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.f11381a;
        GovernmentIdWorkflow.Input input = new GovernmentIdWorkflow.Input(sessionToken, countryCode, arrayList, inquiryId, fromStep, fromComponent, backStepEnabled, cancelButtonEnabled, listE, styles, stringsJ, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig2, !Intrinsics.c(transitionStatus, transitioningBack), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig(), renderState.getStaticCaptureTipsEnabled(), renderState.getHolographicTorchEnabledDurationMs(), renderState.getDesignVersion(), renderState.getFlowWatermarkText(), renderState.getCustomPendingPage());
        if (this.featureFlagManager.a(go.w.f18318a)) {
            return new hp.f(!Intrinsics.c(renderState.getTransitionStatus(), transitioningBack), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.V(this.f19721a, renderState, (GovernmentIdWorkflow.a) obj);
                }
            });
        }
        return new h(!Intrinsics.c(renderState.getTransitionStatus(), transitioningBack), this.governmentIdWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.W(this.f19727a, renderState, (GovernmentIdWorkflow.a) obj);
            }
        });
    }

    public final s0 X(InquiryWorkflow$Props renderProps, final InquiryAttributes attributes, StepStyle styles, boolean didGoBack, Function0<Unit> backAction) {
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.createInquiryWorker.a(attributes), new Function1() { // from class: hp.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.Y(this.f19719a, attributes, (com.withpersona.sdk2.inquiry.internal.network.a) obj);
            }
        });
        return new u0(new zo.y.a(styles, true, backAction), didGoBack);
    }

    public final s0 Z(InquiryWorkflow$Props renderProps, final InquiryState.IntegrationStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String strZ = renderState.z();
        String type = renderState.getType();
        String flowUrl = renderState.getFlowUrl();
        String redirectPath = renderState.getRedirectPath();
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = renderState.getIntegrationStepBrowserType();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        StepStyles.IntegrationStepStyle styles = renderState.getStyles();
        InternalErrorInfo transitionError = renderState.getTransitionError();
        IntegrationPage integrationPage = renderState.getIntegrationPage();
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        boolean z10 = false;
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            int i10 = c.f19629c[((TransitionStatus.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new jt.l();
                }
                z10 = true;
            }
        } else if ((transitionStatus instanceof TransitionStatus.Transitioning) || Intrinsics.c(transitionStatus, TransitionStatus.TransitioningBack.f11381a) || (transitionStatus instanceof TransitionStatus.UpdateInquirySession)) {
            z10 = true;
        } else if (transitionStatus != null) {
            throw new jt.l();
        }
        IntegrationWorkflow.Input input = new IntegrationWorkflow.Input(inquiryId, sessionToken, strZ, type, flowUrl, redirectPath, integrationStepBrowserType, backStepEnabled, cancelButtonEnabled, inquirySessionConfig, styles, transitionError, integrationPage, z10);
        if (this.featureFlagManager.a(go.w.f18318a)) {
            return new o0(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.a0(this.f19592a, renderState, (IntegrationWorkflow.b) obj);
                }
            });
        }
        return new q0(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), this.integrationWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.b0(this.f19603a, renderState, (IntegrationWorkflow.b) obj);
            }
        });
    }

    public final s0 c0(final InquiryState.LoadFeatureFlagSession renderState, Function0<Unit> backAction) {
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.featureFlagWorkerFactory.create(renderState.getSessionToken()), new Function1() { // from class: hp.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.d0(this.f19729a, renderState, (ho.b.AbstractC0349b) obj);
            }
        });
        return new u0(new zo.y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 e0(InquiryWorkflow$Props renderProps, final InquiryState.RedeemRelaySession renderState, Function0<Unit> backAction) {
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        d().n(this.redeemRelaySessionWorkerFactory.create(renderState.getRelaySessionToken()), new Function1() { // from class: hp.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.f0(this.f19589a, renderState, (com.withpersona.sdk2.inquiry.internal.network.g) obj);
            }
        });
        return new u0(new zo.y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    public final s0 g0(InquiryWorkflow$Props renderProps, InquiryState.ResumeFallbackInquiry renderState, Function0<Unit> backAction) {
        return X(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, null, 4067, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    public final s0 h0(InquiryWorkflow$Props renderProps, final InquiryState.SelfieStepRunning renderState, Function0<Unit> backAction) {
        List listD;
        List<PoseInfo> listJ;
        List<NextStep.Selfie.SelfiePose> listI = renderState.I();
        if (listI == null || listI.isEmpty()) {
            int i10 = c.f19628a[renderState.getSelfieType().ordinal()];
            if (i10 == 1) {
                listD = kotlin.collections.o.d(kn.a.Center);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new jt.l();
                }
                listD = kotlin.collections.p.n(kn.a.Center, kn.a.Left, kn.a.Right);
            }
        } else {
            List<NextStep.Selfie.SelfiePose> listI2 = renderState.I();
            listD = new ArrayList(kotlin.collections.q.u(listI2, 10));
            Iterator<T> it = listI2.iterator();
            while (it.hasNext()) {
                listD.add(com.withpersona.sdk2.inquiry.selfie.i.c((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        List<PoseInfo> listJ2 = renderState.J();
        if (listJ2 == null || listJ2.isEmpty()) {
            Iterable<IndexedValue> iterableS0 = CollectionsKt.S0(listD);
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(iterableS0, 10));
            for (IndexedValue indexedValue : iterableS0) {
                int index = indexedValue.getIndex();
                arrayList.add(new PoseInfo(index, (kn.a) indexedValue.b(), index == kotlin.collections.p.m(listD), null));
            }
            listJ = arrayList;
        } else {
            listJ = renderState.J();
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
        SelfieWorkflow.Input.Strings stringsL = gp.a.l(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        SelfieType selfieTypeA = com.withpersona.sdk2.inquiry.selfie.m.a(renderState.getSelfieType());
        List<PoseInfo> listJ3 = renderState.J();
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
        List<NextStep.Selfie.CaptureFileType> listZ = renderState.z();
        List<NextStep.Selfie.VideoCaptureMethod> listU = renderState.U();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(listU, 10));
        Iterator<T> it2 = listU.iterator();
        while (it2.hasNext()) {
            arrayList2.add(mn.a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig videoCaptureConfig = new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(0L, listZ, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        PoseConfigs poseConfigs = renderState.getPoseConfigs();
        int i11 = c.b[renderState.getDesignVersion().ordinal()];
        yp.a designVersion = (i11 == 1 || i11 == 2) ? this.featureFlagManager.a(go.y.f18322a) ? yp.a.V1 : yp.a.V0 : renderState.getDesignVersion();
        String fileUploadUrl = renderState.getFileUploadUrl();
        String flowWatermarkText = renderState.getFlowWatermarkText();
        List<PoseInfo> listJ4 = renderState.J();
        SelfieWorkflow.Input input = new SelfieWorkflow.Input(sessionToken, inquiryId, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, stringsL, selfieTypeA, listJ, listJ3, poseTimeoutMs, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, videoCaptureConfig, assetConfig2, pendingPageTextVerticalPosition, poseConfigs, designVersion, fileUploadUrl, flowWatermarkText, !(listJ4 == null || listJ4.isEmpty()), renderState.getCustomPendingPage());
        if (this.featureFlagManager.a(go.w.f18318a)) {
            return new v0(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.i0(this.f19708a, renderState, (SelfieWorkflow.b) obj);
                }
            });
        }
        return new x0(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), this.selfieWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e0.j0(this.f19709a, renderState, (SelfieWorkflow.b) obj);
            }
        });
    }

    public final s0 k0(InquiryWorkflow$Props renderProps, InquiryState.ShowLoadingSpinner renderState, Function0<Unit> backAction) {
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        return new u0(new zo.y.a(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction), renderState.getDidGoBack());
    }

    public final s0 l0(InquiryWorkflow$Props renderProps, InquiryState.UiStepRunning renderState, Function0<Unit> backAction) {
        final InquiryState.UiStepRunning uiStepRunning;
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
        List<UiComponentErrorInfo> listA = renderState.A();
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        String str = gpsPermissionsTitle;
        boolean z10 = false;
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            int i10 = c.f19629c[((TransitionStatus.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new jt.l();
                }
                z10 = true;
            }
        } else if ((transitionStatus instanceof TransitionStatus.Transitioning) || Intrinsics.c(transitionStatus, TransitionStatus.TransitioningBack.f11381a) || (transitionStatus instanceof TransitionStatus.UpdateInquirySession)) {
            z10 = true;
        } else if (transitionStatus != null) {
            throw new jt.l();
        }
        InternalErrorInfo transitionError = renderState.getTransitionError();
        boolean isRestoringState = renderState.getIsRestoringState();
        NextStep.Ui.Localizations localizations8 = renderState.getLocalizations();
        UiWorkflow.Input input = new UiWorkflow.Input(sessionToken, inquiryId, components, stepName, backStepEnabled, cancelButtonEnabled, finalStep, inquirySessionConfig, str, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, styles, listA, z10, transitionError, isRestoringState, (localizations8 == null || (promptPage = localizations8.getPromptPage()) == null) ? null : promptPage.getNavBarTitle());
        go.e eVar = this.featureFlagManager;
        go.w wVar = go.w.f18318a;
        if (eVar.a(wVar)) {
            uiStepRunning = renderState;
            c1Var = new a1(!Intrinsics.c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), input, renderState.getClientSideKey(), renderState.getDidGoBack(), new Function1() { // from class: hp.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.m0(this.f19679a, uiStepRunning, (UiWorkflow.b) obj);
                }
            });
        } else {
            uiStepRunning = renderState;
            c1Var = new c1(!Intrinsics.c(uiStepRunning.getTransitionStatus(), TransitionStatus.TransitioningBack.f11381a), this.uiWorkflow, input, uiStepRunning.getClientSideKey(), uiStepRunning.getDidGoBack(), new Function1() { // from class: hp.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.n0(this.f19681a, uiStepRunning, (UiWorkflow.b) obj);
                }
            });
        }
        if (uiStepRunning.getIsRestoringState()) {
            d().n(this.restoreUiStepStateWorkerFactory.a(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName()), new Function1() { // from class: hp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.o0(this.f19683a, uiStepRunning, (com.withpersona.sdk2.inquiry.internal.o.b) obj);
                }
            });
            if (!this.featureFlagManager.a(wVar)) {
                return new u0(new zo.y.a(uiStepRunning.getStyles(), true, backAction), uiStepRunning.getDidGoBack());
            }
        } else if (uiStepRunning.getTransitionError() != null) {
            d().m(zo.t.a(uiStepRunning.getTransitionError()).name(), new f(null));
        }
        return c1Var;
    }

    public final InquiryState.ShowLoadingSpinner p0(zo.m0 stepState) {
        return new InquiryState.ShowLoadingSpinner(stepState.y(), stepState.i(), null, stepState.g(), stepState.getStyles(), true, stepState.a(), 4, null);
    }

    public final void q0(final InquiryState renderState, vr.f<InquiryState> context) {
        final String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        final TransitionStatus transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof TransitionStatus.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.n(this.transitionWorkerFactory.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, b().getValue().getShareToken(), b().getValue().g1(), renderState.getInquirySessionConfig(), ((TransitionStatus.Transitioning) transitionStatus).getTransitionData()), new Function1() { // from class: hp.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.s0(this.f19688a, renderState, sessionToken, (TransitionWorker.b) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof TransitionStatus.UpdateInquirySession) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.n(this.updateInquirySessionWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig()), new Function1() { // from class: hp.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.t0(this.f19694a, sessionToken, transitionStatus, (com.withpersona.sdk2.inquiry.internal.network.i) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            TransitionStatus.CheckingForNextState checkingForNextState = (TransitionStatus.CheckingForNextState) transitionStatus;
            context.n(this.pollingWorker.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, checkingForNextState.getPollingMode(), renderState.getInquirySessionConfig(), checkingForNextState.getCanReuseWorkflow()), new Function1() { // from class: hp.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.u0(this.f19697a, transitionStatus, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.k.c) obj);
                }
            });
            return;
        }
        if (!Intrinsics.c(transitionStatus, TransitionStatus.TransitioningBack.f11381a)) {
            if (transitionStatus != null) {
                throw new jt.l();
            }
        } else {
            if (sessionToken == null || inquiryId == null || fromStep == null) {
                return;
            }
            context.n(this.transitionBackWorker.a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, fromStep, renderState.getInquirySessionConfig()), new Function1() { // from class: hp.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.v0(this.f19705a, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.network.h) obj);
                }
            });
        }
    }

    public final void w0() {
        InquiryState inquiryState = (InquiryState) d().i();
        if (inquiryState != null && (inquiryState instanceof InquiryState.UiStepRunning)) {
            InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) inquiryState;
            this.uiStepSavedStateHelper.e(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName(), uiStepRunning.getComponents());
        }
    }

    public final void x0(String sessionToken, InternalErrorInfo error, String errorMessage) {
        if (errorMessage == null) {
            errorMessage = zo.t.b(error);
        }
        z0(new InquiryWorkflow$Output.Error(errorMessage, zo.t.a(error), error, sessionToken));
    }

    public void z0(@NotNull InquiryWorkflow$Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof InquiryWorkflow$Output.Cancel) {
            InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) output;
            if (cancel.getRedirectUri() == null) {
                output = InquiryWorkflow$Output.Cancel.f(cancel, null, null, null, null, null, null, null, false, false, (String) this.savedStateHandle.b("redirect_uri"), 511, null);
            }
        }
        super.e(output);
    }
}
