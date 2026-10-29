package p177hp;

import androidx.core.app.FrameMetricsAggregator;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.C3541d;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.C3672a;
import com.withpersona.sdk2.inquiry.internal.C3674c;
import com.withpersona.sdk2.inquiry.internal.C3677f;
import com.withpersona.sdk2.inquiry.internal.C3689h;
import com.withpersona.sdk2.inquiry.internal.C3691j;
import com.withpersona.sdk2.inquiry.internal.C3692k;
import com.withpersona.sdk2.inquiry.internal.C3694m;
import com.withpersona.sdk2.inquiry.internal.C3712o;
import com.withpersona.sdk2.inquiry.internal.C3714q;
import com.withpersona.sdk2.inquiry.internal.C3715r;
import com.withpersona.sdk2.inquiry.internal.C3721v;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.network.AbstractC3702a;
import com.withpersona.sdk2.inquiry.internal.network.AbstractC3703b;
import com.withpersona.sdk2.inquiry.internal.network.AbstractC3705d;
import com.withpersona.sdk2.inquiry.internal.network.AbstractC3709h;
import com.withpersona.sdk2.inquiry.internal.network.AbstractC3710i;
import com.withpersona.sdk2.inquiry.internal.network.InterfaceC3708g;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.p057ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.selfie.C3957i;
import com.withpersona.sdk2.inquiry.selfie.C3961m;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.model.UiFramework;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import gp.C6181a;
import gp.InquiryAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mn.EnumC8598a;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p152go.C6154b;
import p152go.C6159e;
import p152go.C6177w;
import p152go.C6179y;
import p176ho.C6475b;
import p226jq.C7265j;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p363pq.C10309c;
import p363pq.InterfaceC10307a;
import p363pq.InterfaceC10311e;
import p475uq.C11930a;
import p499vr.AbstractC12252c;
import p499vr.C12255f;
import p584yp.EnumC13272a;
import p610zo.AbstractC13988y;
import p610zo.C13958f;
import p610zo.C13983t;
import p610zo.EnumC13949a0;
import p610zo.InterfaceC13973m0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hp.e0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\b\u0000\u0018\u0000 ¿\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004À\u0001Á\u0001Bç\u0001\b\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\b\b\u0001\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@J-\u0010F\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020K2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020N2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00052\u0006\u0010C\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00052\u0006\u0010C\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ-\u0010[\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020Z2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b[\u0010\\J-\u0010^\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020]2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\b^\u0010_J-\u0010a\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020`2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\ba\u0010bJ%\u0010d\u001a\u00020\u00052\u0006\u0010C\u001a\u00020c2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bd\u0010eJ-\u0010g\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010C\u001a\u00020i2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\bj\u0010kJ?\u0010r\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00022\u0006\u0010m\u001a\u00020l2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020>2\u0006\u0010C\u001a\u00020\u00032\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00030tH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020>H\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020B2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u0014\u0010\u007f\u001a\u00020p*\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J5\u0010\u0085\u0001\u001a\u00020>2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020~2\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020>2\u0007\u0010\u0087\u0001\u001a\u00020\u0004H\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020>¢\u0006\u0005\b\u008c\u0001\u0010yR\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0016\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001¨\u0006Â\u0001"}, m31665d2 = {"Lhp/e0;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Lhp/s0;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "updateInquirySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "exchangeOneTimeCodeWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/m$a;", "redeemRelaySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "governmentIdWorkflow", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "selfieWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "uiWorkflow", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "documentWorkflow", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "integrationWorkflow", "Lpq/e;", "externalInquiryController", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/o$a;", "restoreUiStepStateWorkerFactory", "Lho/b$a;", "featureFlagWorkerFactory", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "trackingMetadataProvider", "Lcom/withpersona/sdk2/inquiry/internal/q;", "silentNetworkAuthenticationManager", "Lzo/f;", "deviceMetricsOrchestrator", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/internal/c$a;Lcom/withpersona/sdk2/inquiry/internal/a$a;Lcom/withpersona/sdk2/inquiry/internal/k$b;Lcom/withpersona/sdk2/inquiry/internal/r$a;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;Lcom/withpersona/sdk2/inquiry/internal/v$a;Lcom/withpersona/sdk2/inquiry/internal/f$a;Lcom/withpersona/sdk2/inquiry/internal/m$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lpq/e;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lcom/withpersona/sdk2/inquiry/internal/o$a;Lho/b$a;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lcom/withpersona/sdk2/inquiry/internal/q;Lzo/f;Lku/p0;)V", "state", "", "G", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "renderState", "Lkotlin/Function0;", "backAction", "k0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "U", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "h0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "l0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Q", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "M", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Z", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "O", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "S", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "e0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "c0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "N", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "g0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;Lkotlin/jvm/functions/Function0;)Lhp/s0;", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "didGoBack", "X", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lgp/e;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)Lhp/s0;", "Lvr/f;", "context", "q0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Lvr/f;)V", "w0", "()V", "Lzo/m0;", "stepState", "p0", "(Lzo/m0;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "K", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "", "sessionToken", "error", "errorMessage", "x0", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "output", "z0", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V", "F", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "L", "e", "Landroidx/lifecycle/l0;", "f", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "g", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "h", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "i", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "j", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "k", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "l", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "m", "Lcom/withpersona/sdk2/inquiry/internal/m$a;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;", "o", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "p", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;", "q", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "r", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "s", "Lpq/e;", "t", "Luq/a;", "u", "Lpq/c;", "v", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "w", "Lcom/withpersona/sdk2/inquiry/internal/o$a;", "x", "Lho/b$a;", "y", "Lgo/e;", "z", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "A", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "B", "Lcom/withpersona/sdk2/inquiry/internal/q;", "C", "Lzo/f;", "D", "a", "b", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6491e0 extends AbstractC12252c<InquiryWorkflow$Props, InquiryState, InquiryWorkflow$Output, InterfaceC6520s0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final TrackingMetadataProvider trackingMetadataProvider;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final C3714q silentNetworkAuthenticationManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final C13958f deviceMetricsOrchestrator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C3674c.a createInquiryWorker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C3672a.a inquirySessionWorker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C3692k.b pollingWorker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C3715r.a transitionBackWorker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final TransitionWorker.InterfaceC3662a transitionWorkerFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C3721v.a updateInquirySessionWorkerFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C3677f.a exchangeOneTimeCodeWorkerFactory;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C3694m.a redeemRelaySessionWorkerFactory;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdWorkflow governmentIdWorkflow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final SelfieWorkflow selfieWorkflow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final UiWorkflow uiWorkflow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final DocumentWorkflow documentWorkflow;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final IntegrationWorkflow integrationWorkflow;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC10311e externalInquiryController;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final UiStepSavedStateHelper uiStepSavedStateHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final C3712o.a restoreUiStepStateWorkerFactory;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final C6475b.a featureFlagWorkerFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: hp.e0$b */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lhp/e0$b;", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "props", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lhp/e0;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lhp/e0;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        C6491e0 mo28320a(@NotNull InquiryWorkflow$Props props, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX INFO: renamed from: hp.e0$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24716a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24717b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f24718c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f24719d;

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
            f24716a = iArr;
            int[] iArr2 = new int[EnumC13272a.values().length];
            try {
                iArr2[EnumC13272a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC13272a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f24717b = iArr2;
            int[] iArr3 = new int[EnumC13949a0.values().length];
            try {
                iArr3[EnumC13949a0.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC13949a0.Blocking.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f24718c = iArr3;
            int[] iArr4 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr4[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f24719d = iArr4;
        }
    }

    /* JADX INFO: renamed from: hp.e0$d */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$handleState$5", m39664f = "InquiryStateManager.kt", m39665l = {211}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24720t;

        /* JADX INFO: renamed from: hp.e0$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C6491e0 f24722a;

            public a(C6491e0 c6491e0) {
                this.f24722a = c6491e0;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC10307a interfaceC10307a, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (!(interfaceC10307a instanceof InterfaceC10307a.CancelRequest)) {
                    throw new C7345l();
                }
                InterfaceC10307a.CancelRequest cancelRequest = (InterfaceC10307a.CancelRequest) interfaceC10307a;
                C6491e0.m28254I(this.f24722a, cancelRequest.getForce(), cancelRequest.getSkipBackendCall());
                return Unit.f29331a;
            }
        }

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C6491e0.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24720t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<InterfaceC10307a> interfaceC9575hMo18570c = C6491e0.this.externalInquiryController.mo18570c();
                a aVar = new a(C6491e0.this);
                this.f24720t = 1;
                if (interfaceC9575hMo18570c.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hp.e0$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderComplete$1", m39664f = "InquiryStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24723t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InquiryState.Complete f24725v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InquiryState.Complete complete, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f24725v = complete;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C6491e0.this.new e(this.f24725v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f24723t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C6491e0.this.m28319z0(new InquiryWorkflow$Output.Complete(this.f24725v.getInquiryId(), this.f24725v.getInquiryStatus(), this.f24725v.m18097s(), this.f24725v.getSessionToken(), this.f24725v.getRedirectUri()));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hp.e0$f */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderUiStep$2", m39664f = "InquiryStateManager.kt", m39665l = {846}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24726t;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C6491e0.this.new f(interfaceC9557b);
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.internal.InquiryState.UiStepRunning.r(com.withpersona.sdk2.inquiry.internal.InquiryState$UiStepRunning, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, java.lang.String, java.util.Map, java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, boolean, java.lang.String, int, java.lang.Object):com.withpersona.sdk2.inquiry.internal.InquiryState$UiStepRunning */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24726t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f24726t = 1;
                if (C7946z0.m32938b(2000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            WorkflowState workflowStateM45411i = C6491e0.this.m45397d().m45411i();
            InquiryState.UiStepRunning uiStepRunning = workflowStateM45411i instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateM45411i : null;
            if (uiStepRunning == null) {
                return Unit.f29331a;
            }
            C6491e0.this.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 1966079, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6491e0(@NotNull InquiryWorkflow$Props props, @NotNull C0967l0 savedStateHandle, @NotNull C3674c.a createInquiryWorker, @NotNull C3672a.a inquirySessionWorker, @NotNull C3692k.b pollingWorker, @NotNull C3715r.a transitionBackWorker, @NotNull TransitionWorker.InterfaceC3662a transitionWorkerFactory, @NotNull C3721v.a updateInquirySessionWorkerFactory, @NotNull C3677f.a exchangeOneTimeCodeWorkerFactory, @NotNull C3694m.a redeemRelaySessionWorkerFactory, @NotNull GovernmentIdWorkflow governmentIdWorkflow, @NotNull SelfieWorkflow selfieWorkflow, @NotNull UiWorkflow uiWorkflow, @NotNull DocumentWorkflow documentWorkflow, @NotNull IntegrationWorkflow integrationWorkflow, @NotNull InterfaceC10311e externalInquiryController, @NotNull C11930a navigationStateManager, @NotNull C10309c externalEventLogger, @NotNull UiStepSavedStateHelper uiStepSavedStateHelper, @NotNull C3712o.a restoreUiStepStateWorkerFactory, @NotNull C6475b.a featureFlagWorkerFactory, @NotNull C6159e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull TrackingMetadataProvider trackingMetadataProvider, @NotNull C3714q silentNetworkAuthenticationManager, @NotNull C13958f deviceMetricsOrchestrator, @NotNull InterfaceC7906p0 coroutineScope) {
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
        if (m45397d().m45411i() == null) {
            m45399f(m28297F(props));
        } else {
            InquiryState inquiryState = (InquiryState) m45397d().m45411i();
            if (inquiryState instanceof InquiryState.UiStepRunning) {
                m45399f(InquiryState.UiStepRunning.m18218r((InquiryState.UiStepRunning) inquiryState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, true, null, 1572863, null));
            }
        }
        m45397d().m45416o(new Function1() { // from class: hp.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28249B(this.f24773a, (InquiryState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m28249B(C6491e0 c6491e0, InquiryState inquiryState) {
        if (inquiryState == null) {
            return Unit.f29331a;
        }
        c6491e0.m28298G(inquiryState);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m28253H(C6491e0 c6491e0) {
        m28255J(c6491e0, false, false, 4, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I */
    public static final void m28254I(C6491e0 c6491e0, boolean z10, boolean z11) {
        InquiryState inquiryState = (InquiryState) c6491e0.m45397d().m45411i();
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
        c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z10, z11, null, 512, null));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m28255J(C6491e0 c6491e0, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        m28254I(c6491e0, z10, z11);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m28256P(C6491e0 c6491e0, InquiryState.CreateInquirySession createInquirySession, AbstractC3703b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AbstractC3703b.Success) {
            AbstractC3703b.Success success = (AbstractC3703b.Success) it;
            c6491e0.m45399f(new InquiryState.LoadFeatureFlagSession(createInquirySession.getInquiryId(), success.getSessionToken(), success.getTrackingEventsUrl(), success.getInquirySessionConfig()));
            c6491e0.externalEventLogger.m39606b(new InquiryEvent.StartEvent(createInquirySession.getInquiryId(), C3689h.INSTANCE.m18550a(success.getSessionToken())));
        } else {
            if (!(it instanceof AbstractC3703b.Error)) {
                throw new C7345l();
            }
            m28295y0(c6491e0, createInquirySession.getSessionToken(), ((AbstractC3703b.Error) it).getCause(), null, 4, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m28257R(C6491e0 c6491e0, InquiryState.DocumentStepRunning documentStepRunning, DocumentWorkflow.AbstractC3431b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, DocumentWorkflow.AbstractC3431b.b.f13098a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.m31980c(it, DocumentWorkflow.AbstractC3431b.a.f13097a)) {
            c6491e0.m45399f(InquiryState.DocumentStepRunning.m18113r(documentStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, null, null, null, null, 16375, null));
        } else if (it instanceof DocumentWorkflow.AbstractC3431b.Errored) {
            DocumentWorkflow.AbstractC3431b.Errored cVar = (DocumentWorkflow.AbstractC3431b.Errored) it;
            if (c6491e0.m28299K(cVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(documentStepRunning));
            } else {
                m28295y0(c6491e0, documentStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else {
            if (!Intrinsics.m31980c(it, DocumentWorkflow.AbstractC3431b.d.f13100a)) {
                throw new C7345l();
            }
            c6491e0.m45399f(InquiryState.DocumentStepRunning.m18113r(documentStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, null, 16375, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m28258T(C6491e0 c6491e0, InquiryState.ExchangeOneTimeCode exchangeOneTimeCode, AbstractC3705d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AbstractC3705d.Success) {
            AbstractC3705d.Success success = (AbstractC3705d.Success) it;
            if (success.getSessionToken() == null) {
                c6491e0.m45399f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                String trackingEventsUrl = success.getTrackingEventsUrl();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.m20427a();
                }
                c6491e0.m45399f(new InquiryState.LoadFeatureFlagSession(inquiryId, sessionToken, trackingEventsUrl, inquirySessionConfig));
            }
        } else {
            if (!(it instanceof AbstractC3705d.Error)) {
                throw new C7345l();
            }
            m28295y0(c6491e0, exchangeOneTimeCode.getSessionToken(), ((AbstractC3705d.Error) it).getCause(), null, 4, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m28259V(C6491e0 c6491e0, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, GovernmentIdWorkflow.AbstractC3503a.b.f13791a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof GovernmentIdWorkflow.AbstractC3503a.c) {
            GovernmentIdWorkflow.AbstractC3503a.c cVar = (GovernmentIdWorkflow.AbstractC3503a.c) it;
            if (c6491e0.m28299K(cVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(governmentIdStepRunning));
            } else {
                m28295y0(c6491e0, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.m31980c(it, GovernmentIdWorkflow.AbstractC3503a.d.f13793a)) {
            c6491e0.m45399f(InquiryState.GovernmentIdStepRunning.m18127r(governmentIdStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.m31980c(it, GovernmentIdWorkflow.AbstractC3503a.a.f13790a)) {
                throw new C7345l();
            }
            c6491e0.m45399f(InquiryState.GovernmentIdStepRunning.m18127r(governmentIdStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m28260W(C6491e0 c6491e0, InquiryState.GovernmentIdStepRunning governmentIdStepRunning, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, GovernmentIdWorkflow.AbstractC3503a.b.f13791a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof GovernmentIdWorkflow.AbstractC3503a.c) {
            GovernmentIdWorkflow.AbstractC3503a.c cVar = (GovernmentIdWorkflow.AbstractC3503a.c) it;
            if (c6491e0.m28299K(cVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(governmentIdStepRunning));
            } else {
                m28295y0(c6491e0, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        } else if (Intrinsics.m31980c(it, GovernmentIdWorkflow.AbstractC3503a.d.f13793a)) {
            c6491e0.m45399f(InquiryState.GovernmentIdStepRunning.m18127r(governmentIdStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        } else {
            if (!Intrinsics.m31980c(it, GovernmentIdWorkflow.AbstractC3503a.a.f13790a)) {
                throw new C7345l();
            }
            c6491e0.m45399f(InquiryState.GovernmentIdStepRunning.m18127r(governmentIdStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m28261Y(C6491e0 c6491e0, InquiryAttributes inquiryAttributes, AbstractC3702a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AbstractC3702a.Success) {
            AbstractC3702a.Success success = (AbstractC3702a.Success) it;
            String redirectUri = success.getRedirectUri();
            if (redirectUri != null) {
                c6491e0.savedStateHandle.m4954i("redirect_uri", redirectUri);
            }
            if (C7265j.m30289e(success.getInquiryId())) {
                c6491e0.m28319z0(new InquiryWorkflow$Output.ReinitializeWithFallbackMode(success.getInquiryId(), success.getFallbackSessionToken()));
            } else {
                c6491e0.m45399f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, success.getInquirySession(), 2, null));
            }
        } else {
            if (!(it instanceof AbstractC3702a.Error)) {
                throw new C7345l();
            }
            AbstractC3702a.Error error = (AbstractC3702a.Error) it;
            c6491e0.m28318x0(inquiryAttributes.getSessionToken(), error.getCause(), error.getDebugMessage());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m28262a0(C6491e0 c6491e0, InquiryState.IntegrationStepRunning integrationStepRunning, IntegrationWorkflow.InterfaceC3611b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.c.f14347a)) {
            if (Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.d.f14348a)) {
                c6491e0.m45399f(InquiryState.IntegrationStepRunning.m18161r(integrationStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.a.f14345a)) {
                c6491e0.m45399f(InquiryState.IntegrationStepRunning.m18161r(integrationStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.b.f14346a)) {
                    throw new C7345l();
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
                c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m28263b0(C6491e0 c6491e0, InquiryState.IntegrationStepRunning integrationStepRunning, IntegrationWorkflow.InterfaceC3611b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.c.f14347a)) {
            if (Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.d.f14348a)) {
                c6491e0.m45399f(InquiryState.IntegrationStepRunning.m18161r(integrationStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else if (Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.a.f14345a)) {
                c6491e0.m45399f(InquiryState.IntegrationStepRunning.m18161r(integrationStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null));
            } else {
                if (!Intrinsics.m31980c(it, IntegrationWorkflow.InterfaceC3611b.b.f14346a)) {
                    throw new C7345l();
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
                c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m28264d0(C6491e0 c6491e0, InquiryState.LoadFeatureFlagSession loadFeatureFlagSession, C6475b.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof C6475b.b.Success) && !(it instanceof C6475b.b.a)) {
            throw new C7345l();
        }
        c6491e0.trackingEventsLogger.setIsEnabled(!c6491e0.m45395b().getValue().mo18260M());
        c6491e0.trackingMetadataProvider.setFeatureFlags(c6491e0.featureFlagManager.m27146b());
        TrackingEventsLogger.logInquiryStartEvent$default(c6491e0.trackingEventsLogger, C3691j.m18579a(c6491e0.m45395b().getValue(), c6491e0.featureFlagManager.m27145a(C6177w.f23558a) ? UiFramework.PersonaWorkflow : UiFramework.SquareWorkflow), false, 2, null);
        if (c6491e0.featureFlagManager.m27145a(C6154b.f23517a)) {
            c6491e0.deviceMetricsOrchestrator.m50457a(loadFeatureFlagSession.getSessionToken());
        }
        c6491e0.m45399f(new InquiryState.ShowLoadingSpinner(loadFeatureFlagSession.getSessionToken(), loadFeatureFlagSession.getTrackingEventsUrl(), null, loadFeatureFlagSession.getInquiryId(), null, true, loadFeatureFlagSession.getInquirySessionConfig(), 4, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m28265f0(C6491e0 c6491e0, InquiryState.RedeemRelaySession redeemRelaySession, InterfaceC3708g it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InterfaceC3708g.Success) {
            InterfaceC3708g.Success success = (InterfaceC3708g.Success) it;
            if (success.getSessionToken() == null) {
                c6491e0.m45399f(new InquiryState.CreateInquirySession(success.getInquiryId(), null, null, 6, null));
            } else {
                String inquiryId = success.getInquiryId();
                String sessionToken = success.getSessionToken();
                InquirySessionConfig inquirySessionConfig = success.getInquirySessionConfig();
                if (inquirySessionConfig == null) {
                    inquirySessionConfig = InquirySessionConfig.INSTANCE.m20427a();
                }
                c6491e0.m45399f(new InquiryState.LoadFeatureFlagSession(inquiryId, sessionToken, null, inquirySessionConfig, 4, null));
            }
        } else {
            if (!(it instanceof InterfaceC3708g.Error)) {
                throw new C7345l();
            }
            m28295y0(c6491e0, redeemRelaySession.getSessionToken(), ((InterfaceC3708g.Error) it).getCause(), null, 4, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m28269i0(C6491e0 c6491e0, InquiryState.SelfieStepRunning selfieStepRunning, SelfieWorkflow.AbstractC3927b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, SelfieWorkflow.AbstractC3927b.b.f16224a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.m31980c(it, SelfieWorkflow.AbstractC3927b.d.f16226a)) {
            c6491e0.m45399f(InquiryState.SelfieStepRunning.m18184r(selfieStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.m31980c(it, SelfieWorkflow.AbstractC3927b.a.f16223a)) {
            c6491e0.m45399f(InquiryState.SelfieStepRunning.m18184r(selfieStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof SelfieWorkflow.AbstractC3927b.Error)) {
                throw new C7345l();
            }
            SelfieWorkflow.AbstractC3927b.Error cVar = (SelfieWorkflow.AbstractC3927b.Error) it;
            if (c6491e0.m28299K(cVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(selfieStepRunning));
            } else {
                m28295y0(c6491e0, selfieStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m28271j0(C6491e0 c6491e0, InquiryState.SelfieStepRunning selfieStepRunning, SelfieWorkflow.AbstractC3927b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, SelfieWorkflow.AbstractC3927b.b.f16224a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (Intrinsics.m31980c(it, SelfieWorkflow.AbstractC3927b.d.f16226a)) {
            c6491e0.m45399f(InquiryState.SelfieStepRunning.m18184r(selfieStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, false), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else if (Intrinsics.m31980c(it, SelfieWorkflow.AbstractC3927b.a.f16223a)) {
            c6491e0.m45399f(InquiryState.SelfieStepRunning.m18184r(selfieStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null));
        } else {
            if (!(it instanceof SelfieWorkflow.AbstractC3927b.Error)) {
                throw new C7345l();
            }
            SelfieWorkflow.AbstractC3927b.Error cVar = (SelfieWorkflow.AbstractC3927b.Error) it;
            if (c6491e0.m28299K(cVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(selfieStepRunning));
            } else {
                m28295y0(c6491e0, selfieStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m28275m0(C6491e0 c6491e0, InquiryState.UiStepRunning uiStepRunning, UiWorkflow.InterfaceC4141b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, UiWorkflow.InterfaceC4141b.b.f17596a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof UiWorkflow.InterfaceC4141b.d) {
            UiWorkflow.InterfaceC4141b.d dVar = (UiWorkflow.InterfaceC4141b.d) it;
            if (c6491e0.m28299K(dVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(uiStepRunning));
            } else {
                c6491e0.m28318x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof UiWorkflow.InterfaceC4141b.FinishedWithoutTransition) {
            UiWorkflow.InterfaceC4141b.FinishedWithoutTransition fVar = (UiWorkflow.InterfaceC4141b.FinishedWithoutTransition) it;
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(fVar.getFromComponent(), fVar.m21179a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.InterfaceC4141b.FinishedWithTransition) {
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, ((UiWorkflow.InterfaceC4141b.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.InterfaceC4141b.a) {
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof UiWorkflow.InterfaceC4141b.c)) {
                throw new C7345l();
            }
            c6491e0.m28319z0(new InquiryWorkflow$Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.m18227v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m28277n0(C6491e0 c6491e0, InquiryState.UiStepRunning uiStepRunning, UiWorkflow.InterfaceC4141b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, UiWorkflow.InterfaceC4141b.b.f17596a)) {
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
            c6491e0.m28319z0(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, false, null, 896, null));
        } else if (it instanceof UiWorkflow.InterfaceC4141b.d) {
            UiWorkflow.InterfaceC4141b.d dVar = (UiWorkflow.InterfaceC4141b.d) it;
            if (c6491e0.m28299K(dVar.getCause())) {
                c6491e0.m45399f(c6491e0.m28315p0(uiStepRunning));
            } else {
                c6491e0.m28318x0(uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
            }
        } else if (it instanceof UiWorkflow.InterfaceC4141b.FinishedWithoutTransition) {
            UiWorkflow.InterfaceC4141b.FinishedWithoutTransition fVar = (UiWorkflow.InterfaceC4141b.FinishedWithoutTransition) it;
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(fVar.getFromComponent(), fVar.m21179a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.InterfaceC4141b.FinishedWithTransition) {
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, new TransitionStatus.UpdateInquirySession(null, ((UiWorkflow.InterfaceC4141b.FinishedWithTransition) it).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else if (it instanceof UiWorkflow.InterfaceC4141b.a) {
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, TransitionStatus.TransitioningBack.f14658a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null));
        } else {
            if (!(it instanceof UiWorkflow.InterfaceC4141b.c)) {
                throw new C7345l();
            }
            c6491e0.m28319z0(new InquiryWorkflow$Output.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.m18227v(), uiStepRunning.getSessionToken(), uiStepRunning.getRedirectUri()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m28279o0(C6491e0 c6491e0, InquiryState.UiStepRunning uiStepRunning, C3712o.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C3712o.b.a.f15524a)) {
            if (!(c6491e0.m45397d().m45411i() instanceof InquiryState.UiStepRunning)) {
                return Unit.f29331a;
            }
            c6491e0.m45399f(c6491e0.m28315p0(uiStepRunning));
        } else {
            if (!(it instanceof C3712o.b.C14134b)) {
                throw new C7345l();
            }
            WorkflowState workflowStateM45411i = c6491e0.m45397d().m45411i();
            InquiryState.UiStepRunning uiStepRunning2 = workflowStateM45411i instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateM45411i : null;
            if (uiStepRunning2 == null) {
                return Unit.f29331a;
            }
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning2, null, null, null, null, null, null, null, null, null, ((C3712o.b.C14134b) it).m18788a(), false, false, false, null, null, null, null, null, null, false, null, 1572351, null));
        }
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public static final void m28283r0(C6491e0 c6491e0, InquiryState inquiryState, String str, InternalErrorInfo internalErrorInfo) {
        Collection<UiComponentError> collectionValues;
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (!(internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                throw new C7345l();
            }
            m28295y0(c6491e0, str, internalErrorInfo, null, 4, null);
            return;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        arrayList = null;
        ArrayList arrayList = null;
        if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
            WorkflowState workflowStateM45411i = c6491e0.m45397d().m45411i();
            InquiryState.UiStepRunning uiStepRunning = workflowStateM45411i instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateM45411i : null;
            if (uiStepRunning == null) {
                return;
            }
            Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
            if (details != null && (collectionValues = details.values()) != null) {
                Collection<UiComponentError> collection = collectionValues;
                arrayList = new ArrayList(C7701q.m31905u(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(new UiComponentErrorInfo((UiComponentError) it.next(), 0L, 2, null));
                }
            }
            c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, arrayList, null, null, false, null, 2031607, null));
            return;
        }
        if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
            if (inquiryState instanceof InterfaceC13973m0) {
                c6491e0.m45399f(c6491e0.m28315p0((InterfaceC13973m0) inquiryState));
                return;
            } else {
                m28295y0(c6491e0, str, internalErrorInfo, null, 4, null);
                return;
            }
        }
        if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
            throw new C7345l();
        }
        if (!networkErrorInfo.isRecoverable()) {
            m28295y0(c6491e0, str, internalErrorInfo, null, 4, null);
            return;
        }
        WorkflowState workflowStateM45411i2 = c6491e0.m45397d().m45411i();
        InquiryState.UiStepRunning uiStepRunning2 = workflowStateM45411i2 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) workflowStateM45411i2 : null;
        if (uiStepRunning2 == null) {
            return;
        }
        c6491e0.m45399f(InquiryState.UiStepRunning.m18218r(uiStepRunning2, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, networkErrorInfo, null, false, null, 1966071, null));
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m28285s0(C6491e0 c6491e0, InquiryState inquiryState, String str, TransitionWorker.AbstractC3663b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof TransitionWorker.AbstractC3663b.Error) {
            m28283r0(c6491e0, inquiryState, str, ((TransitionWorker.AbstractC3663b.Error) it).getCause());
        } else {
            if (!(it instanceof TransitionWorker.AbstractC3663b.Success)) {
                throw new C7345l();
            }
            InquiryState inquiryState2 = (InquiryState) c6491e0.m45397d().m45411i();
            if (inquiryState2 == null) {
                return Unit.f29331a;
            }
            c6491e0.m45399f(inquiryState2.m18092p(new TransitionStatus.UpdateInquirySession(((TransitionWorker.AbstractC3663b.Success) it).getNextState(), false)));
        }
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public static final Unit m28287t0(C6491e0 c6491e0, String str, TransitionStatus transitionStatus, AbstractC3710i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AbstractC3710i.Error) {
            m28295y0(c6491e0, str, ((AbstractC3710i.Error) it).getCause(), null, 4, null);
        } else {
            if (!Intrinsics.m31980c(it, AbstractC3710i.b.f15517a)) {
                throw new C7345l();
            }
            InquiryState inquiryState = (InquiryState) c6491e0.m45397d().m45411i();
            if (inquiryState == null) {
                return Unit.f29331a;
            }
            TransitionStatus.UpdateInquirySession updateInquirySession = (TransitionStatus.UpdateInquirySession) transitionStatus;
            if (updateInquirySession.getNextStep() != null) {
                c6491e0.m45399f(updateInquirySession.getNextStep());
            } else {
                c6491e0.m45399f(inquiryState.m18092p(new TransitionStatus.CheckingForNextState(null, updateInquirySession.getCanReuseWorkflow(), 1, 0 == true ? 1 : 0)));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m28289u0(C6491e0 c6491e0, TransitionStatus transitionStatus, InquiryState inquiryState, String str, C3692k.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3692k.c.Success) {
            c6491e0.m45399f(((C3692k.c.Success) it).m18596a((InquiryState) c6491e0.m45397d().m45411i(), ((TransitionStatus.CheckingForNextState) transitionStatus).getCanReuseWorkflow()));
        } else {
            if (!(it instanceof C3692k.c.Error)) {
                throw new C7345l();
            }
            m28283r0(c6491e0, inquiryState, str, ((C3692k.c.Error) it).getCause());
        }
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m28291v0(C6491e0 c6491e0, InquiryState inquiryState, String str, AbstractC3709h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AbstractC3709h.Success) {
            AbstractC3709h.Success success = (AbstractC3709h.Success) it;
            success.getNextState().m18091o(true);
            c6491e0.m45399f(success.getNextState());
        } else {
            if (!(it instanceof AbstractC3709h.Error)) {
                throw new C7345l();
            }
            AbstractC3709h.Error error = (AbstractC3709h.Error) it;
            if (c6491e0.m28299K(error.getCause()) && (inquiryState instanceof InterfaceC13973m0)) {
                c6491e0.m45399f(c6491e0.m28315p0((InterfaceC13973m0) inquiryState));
            } else {
                m28295y0(c6491e0, str, error.getCause(), null, 4, null);
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m28295y0(C6491e0 c6491e0, String str, InternalErrorInfo internalErrorInfo, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        c6491e0.m28318x0(str, internalErrorInfo, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: F */
    public final InquiryState m28297F(@NotNull InquiryWorkflow$Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (props instanceof InquiryWorkflow$Props.TemplateProps) {
            InquiryWorkflow$Props.TemplateProps templateProps = (InquiryWorkflow$Props.TemplateProps) props;
            return new InquiryState.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.m18276g(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate(), null, templateProps.getRedirectUri(), 256, null);
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
            throw new C7345l();
        }
        InquiryWorkflow$Props.InquiryProps inquiryProps = (InquiryWorkflow$Props.InquiryProps) props;
        if (C7265j.m30289e(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new InquiryState.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, 4, null);
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken != null && sessionToken.length() != 0) {
            return new InquiryState.LoadFeatureFlagSession(inquiryProps.getInquiryId(), inquiryProps.getSessionToken(), null, InquirySessionConfig.INSTANCE.m20427a(), 4, null);
        }
        return new InquiryState.CreateInquirySession(inquiryProps.getInquiryId(), null, null, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m28298G(InquiryState state) {
        InterfaceC6520s0 interfaceC6520s0M28309c0;
        String redirectUri;
        String sessionToken = state.getSessionToken();
        if (sessionToken != null) {
            if (StringsKt.m32182p0(sessionToken)) {
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
        InterfaceC13973m0 interfaceC13973m0 = state instanceof InterfaceC13973m0 ? (InterfaceC13973m0) state : null;
        if (interfaceC13973m0 != null && (redirectUri = interfaceC13973m0.getRedirectUri()) != null) {
            this.savedStateHandle.m4954i("redirect_uri", redirectUri);
        }
        m28316q0(state, m45397d());
        this.silentNetworkAuthenticationManager.m18794d(state);
        TransitionStatus transitionStatus = state.getTransitionStatus();
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.f14658a;
        if (Intrinsics.m31980c(transitionStatus, transitioningBack)) {
            this.silentNetworkAuthenticationManager.m18792b();
        }
        this.navigationStateManager.m44530e(Intrinsics.m31980c(state.getTransitionStatus(), transitioningBack));
        Function0<Unit> function0 = new Function0() { // from class: hp.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6491e0.m28253H(this.f24823a);
            }
        };
        m45397d().m45414m("controllerRequestCollector", new d(null));
        InquiryWorkflow$Props value = m45395b().getValue();
        if (state instanceof InquiryState.CreateInquiryFromTemplate) {
            interfaceC6520s0M28309c0 = m28302N(value, (InquiryState.CreateInquiryFromTemplate) state, function0);
        } else if (state instanceof InquiryState.ResumeFallbackInquiry) {
            interfaceC6520s0M28309c0 = m28311g0(value, (InquiryState.ResumeFallbackInquiry) state, function0);
        } else if (state instanceof InquiryState.CreateInquirySession) {
            interfaceC6520s0M28309c0 = m28303O(value, (InquiryState.CreateInquirySession) state, function0);
        } else if (state instanceof InquiryState.ExchangeOneTimeCode) {
            interfaceC6520s0M28309c0 = m28305S(value, (InquiryState.ExchangeOneTimeCode) state, function0);
        } else if (state instanceof InquiryState.RedeemRelaySession) {
            interfaceC6520s0M28309c0 = m28310e0(value, (InquiryState.RedeemRelaySession) state, function0);
        } else if (state instanceof InquiryState.ShowLoadingSpinner) {
            interfaceC6520s0M28309c0 = m28313k0(value, (InquiryState.ShowLoadingSpinner) state, function0);
        } else if (state instanceof InquiryState.GovernmentIdStepRunning) {
            interfaceC6520s0M28309c0 = m28306U(value, (InquiryState.GovernmentIdStepRunning) state);
        } else if (state instanceof InquiryState.SelfieStepRunning) {
            interfaceC6520s0M28309c0 = m28312h0(value, (InquiryState.SelfieStepRunning) state, function0);
        } else if (state instanceof InquiryState.UiStepRunning) {
            interfaceC6520s0M28309c0 = m28314l0(value, (InquiryState.UiStepRunning) state, function0);
        } else if (state instanceof InquiryState.DocumentStepRunning) {
            interfaceC6520s0M28309c0 = m28304Q((InquiryState.DocumentStepRunning) state);
        } else if (state instanceof InquiryState.Complete) {
            interfaceC6520s0M28309c0 = m28301M((InquiryState.Complete) state);
        } else if (state instanceof InquiryState.IntegrationStepRunning) {
            interfaceC6520s0M28309c0 = m28308Z(value, (InquiryState.IntegrationStepRunning) state);
        } else {
            if (!(state instanceof InquiryState.LoadFeatureFlagSession)) {
                throw new C7345l();
            }
            interfaceC6520s0M28309c0 = m28309c0((InquiryState.LoadFeatureFlagSession) state, function0);
        }
        m45396c().setValue(interfaceC6520s0M28309c0);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m28299K(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    /* JADX INFO: renamed from: L */
    public final void m28300L() {
        m28317w0();
        this.silentNetworkAuthenticationManager.m18793c();
        this.deviceMetricsOrchestrator.m50458b();
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC6520s0 m28301M(InquiryState.Complete renderState) {
        m45397d().m45414m("complete", new e(renderState, null));
        return new C6478a();
    }

    /* JADX INFO: renamed from: N */
    public final InterfaceC6520s0 m28302N(InquiryWorkflow$Props renderProps, InquiryState.CreateInquiryFromTemplate renderState, Function0<Unit> backAction) {
        return m28307X(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.m18103s(), renderState.getThemeSetId(), null, 2304, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    /* JADX DEBUG: Class process forced to load method for inline: uq.a.d(uq.a, boolean, boolean, boolean, boolean, int, java.lang.Object):void */
    /* JADX INFO: renamed from: O */
    public final InterfaceC6520s0 m28303O(InquiryWorkflow$Props renderProps, final InquiryState.CreateInquirySession renderState, Function0<Unit> backAction) {
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        m45397d().m45415n(this.inquirySessionWorker.mo18340a(renderState.getInquiryId(), renderState.getInquirySessionDataWrapper()), new Function1() { // from class: hp.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28256P(this.f24827a, renderState, (AbstractC3703b) obj);
            }
        });
        return new C6524u0(new AbstractC13988y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    /* JADX INFO: renamed from: Q */
    public final InterfaceC6520s0 m28304Q(final InquiryState.DocumentStepRunning renderState) {
        DocumentWorkflow.StartPage review;
        NextStep.Document.Config config = renderState.getDocumentStep().getConfig();
        String documentId = config.getDocumentId();
        int i10 = c.f24719d[config.getStartPage().ordinal()];
        if (i10 == 1) {
            review = DocumentWorkflow.StartPage.Prompt.f13045a;
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            review = documentId != null ? new DocumentWorkflow.StartPage.Review(documentId) : DocumentWorkflow.StartPage.Prompt.f13045a;
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
                return C6491e0.m28257R(this.f24652a, renderState, (DocumentWorkflow.AbstractC3431b) obj);
            }
        };
        if (this.featureFlagManager.m27145a(C6177w.f23558a)) {
            return new C6481b(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), input, renderState.getFromStep(), renderState.getDidGoBack(), function1);
        }
        return new C6487d(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), this.documentWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), function1);
    }

    /* JADX INFO: renamed from: S */
    public final InterfaceC6520s0 m28305S(InquiryWorkflow$Props renderProps, final InquiryState.ExchangeOneTimeCode renderState, Function0<Unit> backAction) {
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        m45397d().m45415n(this.exchangeOneTimeCodeWorkerFactory.create(renderState.getOneTimeLinkCode()), new Function1() { // from class: hp.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28258T(this.f24784a, renderState, (AbstractC3705d) obj);
            }
        });
        return new C6524u0(new AbstractC13988y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    /* JADX INFO: renamed from: U */
    public final InterfaceC6520s0 m28306U(InquiryWorkflow$Props renderProps, final InquiryState.GovernmentIdStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> listM18132G = renderState.m18132G();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM18132G.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Id id2 = (Id) it.next();
            String countryCode2 = renderState.getCountryCode();
            IdConfig idConfigM17526o = C3541d.m17526o(id2, countryCode2 != null ? countryCode2 : "US", renderState.getManualCaptureButtonDelayMs());
            if (idConfigM17526o != null) {
                arrayList.add(idConfigM17526o);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> listM18131E = renderState.m18131E();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        String countryCode3 = renderState.getCountryCode();
        String str = countryCode3 != null ? countryCode3 : "US";
        List<NextStep.GovernmentId.LocalizationOverride> listM18139P = renderState.m18139P();
        GovernmentIdWorkflow.Input.Strings stringsM27228j = C6181a.m27228j(localizations, str, listM18139P != null ? CollectionsKt.m31679E0(listM18139P) : null);
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> listM18130D = renderState.m18130D();
        List<NextStep.GovernmentId.VideoCaptureMethod> listM18149d0 = renderState.m18149d0();
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(listM18149d0, 10));
        Iterator<T> it2 = listM18149d0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(EnumC8598a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(0L, listM18130D, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        NextStep.GovernmentId.AssetConfig assetConfig2 = assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig;
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.f14658a;
        GovernmentIdWorkflow.Input input = new GovernmentIdWorkflow.Input(sessionToken, countryCode, arrayList, inquiryId, fromStep, fromComponent, backStepEnabled, cancelButtonEnabled, listM18131E, styles, stringsM27228j, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig2, !Intrinsics.m31980c(transitionStatus, transitioningBack), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig(), renderState.getStaticCaptureTipsEnabled(), renderState.getHolographicTorchEnabledDurationMs(), renderState.getDesignVersion(), renderState.getFlowWatermarkText(), renderState.getCustomPendingPage());
        if (this.featureFlagManager.m27145a(C6177w.f23558a)) {
            return new C6493f(!Intrinsics.m31980c(renderState.getTransitionStatus(), transitioningBack), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28259V(this.f24838a, renderState, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            });
        }
        return new C6497h(!Intrinsics.m31980c(renderState.getTransitionStatus(), transitioningBack), this.governmentIdWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28260W(this.f24846a, renderState, (GovernmentIdWorkflow.AbstractC3503a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final InterfaceC6520s0 m28307X(InquiryWorkflow$Props renderProps, final InquiryAttributes attributes, StepStyle styles, boolean didGoBack, Function0<Unit> backAction) {
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        m45397d().m45415n(this.createInquiryWorker.mo18345a(attributes), new Function1() { // from class: hp.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28261Y(this.f24834a, attributes, (AbstractC3702a) obj);
            }
        });
        return new C6524u0(new AbstractC13988y.a(styles, true, backAction), didGoBack);
    }

    /* JADX INFO: renamed from: Z */
    public final InterfaceC6520s0 m28308Z(InquiryWorkflow$Props renderProps, final InquiryState.IntegrationStepRunning renderState) {
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String strM18172z = renderState.m18172z();
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
            int i10 = c.f24718c[((TransitionStatus.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new C7345l();
                }
                z10 = true;
            }
        } else if ((transitionStatus instanceof TransitionStatus.Transitioning) || Intrinsics.m31980c(transitionStatus, TransitionStatus.TransitioningBack.f14658a) || (transitionStatus instanceof TransitionStatus.UpdateInquirySession)) {
            z10 = true;
        } else if (transitionStatus != null) {
            throw new C7345l();
        }
        IntegrationWorkflow.Input input = new IntegrationWorkflow.Input(inquiryId, sessionToken, strM18172z, type, flowUrl, redirectPath, integrationStepBrowserType, backStepEnabled, cancelButtonEnabled, inquirySessionConfig, styles, transitionError, integrationPage, z10);
        if (this.featureFlagManager.m27145a(C6177w.f23558a)) {
            return new C6512o0(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28262a0(this.f24670a, renderState, (IntegrationWorkflow.InterfaceC3611b) obj);
                }
            });
        }
        return new C6516q0(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), this.integrationWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28263b0(this.f24684a, renderState, (IntegrationWorkflow.InterfaceC3611b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final InterfaceC6520s0 m28309c0(final InquiryState.LoadFeatureFlagSession renderState, Function0<Unit> backAction) {
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        m45397d().m45415n(this.featureFlagWorkerFactory.create(renderState.getSessionToken()), new Function1() { // from class: hp.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28264d0(this.f24850a, renderState, (C6475b.b) obj);
            }
        });
        return new C6524u0(new AbstractC13988y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    /* JADX INFO: renamed from: e0 */
    public final InterfaceC6520s0 m28310e0(InquiryWorkflow$Props renderProps, final InquiryState.RedeemRelaySession renderState, Function0<Unit> backAction) {
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        m45397d().m45415n(this.redeemRelaySessionWorkerFactory.create(renderState.getRelaySessionToken()), new Function1() { // from class: hp.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28265f0(this.f24664a, renderState, (InterfaceC3708g) obj);
            }
        });
        return new C6524u0(new AbstractC13988y.a(renderState.getStyles(), true, backAction), renderState.getDidGoBack());
    }

    /* JADX INFO: renamed from: g0 */
    public final InterfaceC6520s0 m28311g0(InquiryWorkflow$Props renderProps, InquiryState.ResumeFallbackInquiry renderState, Function0<Unit> backAction) {
        return m28307X(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, null, 4067, null), renderState.getStyles(), renderState.getDidGoBack(), backAction);
    }

    /* JADX INFO: renamed from: h0 */
    public final InterfaceC6520s0 m28312h0(InquiryWorkflow$Props renderProps, final InquiryState.SelfieStepRunning renderState, Function0<Unit> backAction) {
        List listM31878d;
        List<PoseInfo> listM18191J;
        List<NextStep.Selfie.SelfiePose> listM18190I = renderState.m18190I();
        if (listM18190I == null || listM18190I.isEmpty()) {
            int i10 = c.f24716a[renderState.getSelfieType().ordinal()];
            if (i10 == 1) {
                listM31878d = C7697o.m31878d(EnumC7638a.Center);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new C7345l();
                }
                listM31878d = C7699p.m31895n(EnumC7638a.Center, EnumC7638a.Left, EnumC7638a.Right);
            }
        } else {
            List<NextStep.Selfie.SelfiePose> listM18190I2 = renderState.m18190I();
            listM31878d = new ArrayList(C7701q.m31905u(listM18190I2, 10));
            Iterator<T> it = listM18190I2.iterator();
            while (it.hasNext()) {
                listM31878d.add(C3957i.m20081c((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        List<PoseInfo> listM18191J2 = renderState.m18191J();
        if (listM18191J2 == null || listM18191J2.isEmpty()) {
            Iterable<IndexedValue> iterableS0 = CollectionsKt.m31693S0(listM31878d);
            ArrayList arrayList = new ArrayList(C7701q.m31905u(iterableS0, 10));
            for (IndexedValue indexedValue : iterableS0) {
                int index = indexedValue.getIndex();
                arrayList.add(new PoseInfo(index, (EnumC7638a) indexedValue.m31730b(), index == C7699p.m31894m(listM31878d), null));
            }
            listM18191J = arrayList;
        } else {
            listM18191J = renderState.m18191J();
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
        SelfieWorkflow.Input.Strings stringsM27230l = C6181a.m27230l(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        SelfieType selfieTypeM20114a = C3961m.m20114a(renderState.getSelfieType());
        List<PoseInfo> listM18191J3 = renderState.m18191J();
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
        List<NextStep.Selfie.CaptureFileType> listM18210z = renderState.m18210z();
        List<NextStep.Selfie.VideoCaptureMethod> listM18201U = renderState.m18201U();
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(listM18201U, 10));
        Iterator<T> it2 = listM18201U.iterator();
        while (it2.hasNext()) {
            arrayList2.add(EnumC8598a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig videoCaptureConfig = new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(0L, listM18210z, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        PoseConfigs poseConfigs = renderState.getPoseConfigs();
        int i11 = c.f24717b[renderState.getDesignVersion().ordinal()];
        EnumC13272a designVersion = (i11 == 1 || i11 == 2) ? this.featureFlagManager.m27145a(C6179y.f23564a) ? EnumC13272a.V1 : EnumC13272a.V0 : renderState.getDesignVersion();
        String fileUploadUrl = renderState.getFileUploadUrl();
        String flowWatermarkText = renderState.getFlowWatermarkText();
        List<PoseInfo> listM18191J4 = renderState.m18191J();
        SelfieWorkflow.Input input = new SelfieWorkflow.Input(sessionToken, inquiryId, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, stringsM27230l, selfieTypeM20114a, listM18191J, listM18191J3, poseTimeoutMs, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, videoCaptureConfig, assetConfig2, pendingPageTextVerticalPosition, poseConfigs, designVersion, fileUploadUrl, flowWatermarkText, !(listM18191J4 == null || listM18191J4.isEmpty()), renderState.getCustomPendingPage());
        if (this.featureFlagManager.m27145a(C6177w.f23558a)) {
            return new C6526v0(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28269i0(this.f24817a, renderState, (SelfieWorkflow.AbstractC3927b) obj);
                }
            });
        }
        return new C6530x0(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), this.selfieWorkflow, input, renderState.getFromStep(), renderState.getDidGoBack(), new Function1() { // from class: hp.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6491e0.m28271j0(this.f24819a, renderState, (SelfieWorkflow.AbstractC3927b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final InterfaceC6520s0 m28313k0(InquiryWorkflow$Props renderProps, InquiryState.ShowLoadingSpinner renderState, Function0<Unit> backAction) {
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        return new C6524u0(new AbstractC13988y.a(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction), renderState.getDidGoBack());
    }

    /* JADX INFO: renamed from: l0 */
    public final InterfaceC6520s0 m28314l0(InquiryWorkflow$Props renderProps, InquiryState.UiStepRunning renderState, Function0<Unit> backAction) {
        final InquiryState.UiStepRunning uiStepRunning;
        InterfaceC6520s0 c6486c1;
        NextStep.C3793Ui.PromptPage promptPage;
        NextStep.C3793Ui.PromptPage promptPage2;
        NextStep.C3793Ui.PromptPage promptPage3;
        NextStep.C3793Ui.PromptPage promptPage4;
        NextStep.C3793Ui.PromptPage promptPage5;
        NextStep.C3793Ui.PromptPage promptPage6;
        NextStep.C3793Ui.PromptPage promptPage7;
        NextStep.C3793Ui.PromptPage promptPage8;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        List<UiComponentConfig> components = renderState.getComponents();
        String stepName = renderState.getStepName();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        boolean finalStep = renderState.getFinalStep();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        NextStep.C3793Ui.Localizations localizations = renderState.getLocalizations();
        String gpsPermissionsTitle = (localizations == null || (promptPage8 = localizations.getPromptPage()) == null) ? null : promptPage8.getGpsPermissionsTitle();
        NextStep.C3793Ui.Localizations localizations2 = renderState.getLocalizations();
        String gpsPermissionsPrompt = (localizations2 == null || (promptPage7 = localizations2.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsPrompt();
        NextStep.C3793Ui.Localizations localizations3 = renderState.getLocalizations();
        String gpsPermissionsAllowButtonText = (localizations3 == null || (promptPage6 = localizations3.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsAllowButtonText();
        NextStep.C3793Ui.Localizations localizations4 = renderState.getLocalizations();
        String gpsPermissionsBtnCancel = (localizations4 == null || (promptPage5 = localizations4.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsBtnCancel();
        NextStep.C3793Ui.Localizations localizations5 = renderState.getLocalizations();
        String gpsFeatureTitle = (localizations5 == null || (promptPage4 = localizations5.getPromptPage()) == null) ? null : promptPage4.getGpsFeatureTitle();
        NextStep.C3793Ui.Localizations localizations6 = renderState.getLocalizations();
        String gpsFeaturePrompt = (localizations6 == null || (promptPage3 = localizations6.getPromptPage()) == null) ? null : promptPage3.getGpsFeaturePrompt();
        NextStep.C3793Ui.Localizations localizations7 = renderState.getLocalizations();
        String gpsFeatureTurnOnText = (localizations7 == null || (promptPage2 = localizations7.getPromptPage()) == null) ? null : promptPage2.getGpsFeatureTurnOnText();
        StepStyles.UiStepStyle styles = renderState.getStyles();
        List<UiComponentErrorInfo> listM18219A = renderState.m18219A();
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        String str = gpsPermissionsTitle;
        boolean z10 = false;
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            int i10 = c.f24718c[((TransitionStatus.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new C7345l();
                }
                z10 = true;
            }
        } else if ((transitionStatus instanceof TransitionStatus.Transitioning) || Intrinsics.m31980c(transitionStatus, TransitionStatus.TransitioningBack.f14658a) || (transitionStatus instanceof TransitionStatus.UpdateInquirySession)) {
            z10 = true;
        } else if (transitionStatus != null) {
            throw new C7345l();
        }
        InternalErrorInfo transitionError = renderState.getTransitionError();
        boolean isRestoringState = renderState.getIsRestoringState();
        NextStep.C3793Ui.Localizations localizations8 = renderState.getLocalizations();
        UiWorkflow.Input input = new UiWorkflow.Input(sessionToken, inquiryId, components, stepName, backStepEnabled, cancelButtonEnabled, finalStep, inquirySessionConfig, str, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, styles, listM18219A, z10, transitionError, isRestoringState, (localizations8 == null || (promptPage = localizations8.getPromptPage()) == null) ? null : promptPage.getNavBarTitle());
        C6159e c6159e = this.featureFlagManager;
        C6177w c6177w = C6177w.f23558a;
        if (c6159e.m27145a(c6177w)) {
            uiStepRunning = renderState;
            c6486c1 = new C6480a1(!Intrinsics.m31980c(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), input, renderState.getClientSideKey(), renderState.getDidGoBack(), new Function1() { // from class: hp.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28275m0(this.f24775a, uiStepRunning, (UiWorkflow.InterfaceC4141b) obj);
                }
            });
        } else {
            uiStepRunning = renderState;
            c6486c1 = new C6486c1(!Intrinsics.m31980c(uiStepRunning.getTransitionStatus(), TransitionStatus.TransitioningBack.f14658a), this.uiWorkflow, input, uiStepRunning.getClientSideKey(), uiStepRunning.getDidGoBack(), new Function1() { // from class: hp.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28277n0(this.f24778a, uiStepRunning, (UiWorkflow.InterfaceC4141b) obj);
                }
            });
        }
        if (uiStepRunning.getIsRestoringState()) {
            m45397d().m45415n(this.restoreUiStepStateWorkerFactory.mo18787a(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName()), new Function1() { // from class: hp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28279o0(this.f24781a, uiStepRunning, (C3712o.b) obj);
                }
            });
            if (!this.featureFlagManager.m27145a(c6177w)) {
                return new C6524u0(new AbstractC13988y.a(uiStepRunning.getStyles(), true, backAction), uiStepRunning.getDidGoBack());
            }
        } else if (uiStepRunning.getTransitionError() != null) {
            m45397d().m45414m(C13983t.m50527a(uiStepRunning.getTransitionError()).name(), new f(null));
        }
        return c6486c1;
    }

    /* JADX INFO: renamed from: p0 */
    public final InquiryState.ShowLoadingSpinner m28315p0(InterfaceC13973m0 stepState) {
        return new InquiryState.ShowLoadingSpinner(stepState.m50501y(), stepState.m50500i(), null, stepState.m50499g(), stepState.getStyles(), true, stepState.m50498a(), 4, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m28316q0(final InquiryState renderState, C12255f<InquiryState> context) {
        final String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        final TransitionStatus transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof TransitionStatus.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.m45415n(this.transitionWorkerFactory.mo18320a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, m45395b().getValue().getShareToken(), m45395b().getValue().mo18261h1(), renderState.getInquirySessionConfig(), ((TransitionStatus.Transitioning) transitionStatus).getTransitionData()), new Function1() { // from class: hp.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28285s0(this.f24789a, renderState, sessionToken, (TransitionWorker.AbstractC3663b) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof TransitionStatus.UpdateInquirySession) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            context.m45415n(this.updateInquirySessionWorkerFactory.mo18826a(sessionToken, inquiryId, renderState.getInquirySessionConfig()), new Function1() { // from class: hp.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28287t0(this.f24797a, sessionToken, transitionStatus, (AbstractC3710i) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            TransitionStatus.CheckingForNextState checkingForNextState = (TransitionStatus.CheckingForNextState) transitionStatus;
            context.m45415n(this.pollingWorker.mo18594a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, checkingForNextState.getPollingMode(), renderState.getInquirySessionConfig(), checkingForNextState.getCanReuseWorkflow()), new Function1() { // from class: hp.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28289u0(this.f24802a, transitionStatus, renderState, sessionToken, (C3692k.c) obj);
                }
            });
            return;
        }
        if (!Intrinsics.m31980c(transitionStatus, TransitionStatus.TransitioningBack.f14658a)) {
            if (transitionStatus != null) {
                throw new C7345l();
            }
        } else {
            if (sessionToken == null || inquiryId == null || fromStep == null) {
                return;
            }
            context.m45415n(this.transitionBackWorker.mo18805a(sessionToken, renderState.getTrackingEventsUrl(), inquiryId, fromStep, renderState.getInquirySessionConfig()), new Function1() { // from class: hp.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6491e0.m28291v0(this.f24812a, renderState, sessionToken, (AbstractC3709h) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m28317w0() {
        InquiryState inquiryState = (InquiryState) m45397d().m45411i();
        if (inquiryState != null && (inquiryState instanceof InquiryState.UiStepRunning)) {
            InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) inquiryState;
            this.uiStepSavedStateHelper.m18330e(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.getStepName(), uiStepRunning.getComponents());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m28318x0(String sessionToken, InternalErrorInfo error, String errorMessage) {
        if (errorMessage == null) {
            errorMessage = C13983t.m50528b(error);
        }
        m28319z0(new InquiryWorkflow$Output.Error(errorMessage, C13983t.m50527a(error), error, sessionToken));
    }

    /* JADX INFO: renamed from: z0 */
    public void m28319z0(@NotNull InquiryWorkflow$Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof InquiryWorkflow$Output.Cancel) {
            InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) output;
            if (cancel.getRedirectUri() == null) {
                output = InquiryWorkflow$Output.Cancel.m18234f(cancel, null, null, null, null, null, null, null, false, false, (String) this.savedStateHandle.m4947b("redirect_uri"), FrameMetricsAggregator.EVERY_DURATION, null);
            }
        }
        super.m45398e(output);
    }
}
