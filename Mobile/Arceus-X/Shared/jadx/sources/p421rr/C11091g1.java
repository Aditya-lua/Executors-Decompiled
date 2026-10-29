package p421rr;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.C3828b;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.p057ui.C4149b;
import com.withpersona.sdk2.inquiry.p057ui.C4151d;
import com.withpersona.sdk2.inquiry.p057ui.C4158k;
import com.withpersona.sdk2.inquiry.p057ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.p057ui.UiState;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import cr.C4263k;
import cr.InterfaceC4248h2;
import er.C5199h;
import er.C5201j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import nu.C9579j;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152go.C6159e;
import p152go.C6174t;
import p226jq.C7259g;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p278lp.C8228j;
import p278lp.C8231m;
import p278lp.C8232n;
import p278lp.JpMyNumberNfcValidOperation;
import p315nt.InterfaceC9557b;
import p342or.C9859b4;
import p344ot.C10047c;
import p363pq.AbstractC10315i;
import p363pq.C10309c;
import p390qp.EnumC10688b;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p475uq.C11930a;
import p497vp.C12244g;
import p499vr.AbstractC12252c;
import p499vr.C12255f;
import p525wp.C12504c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: rr.g1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 l2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002mRB\u0087\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b3\u00104J-\u00109\u001a\u00020'*\b\u0012\u0004\u0012\u000206052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020'07H\u0002¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020'2\u0006\u0010;\u001a\u0002062\u0006\u0010=\u001a\u00020<2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020'2\u0006\u0010A\u001a\u00020@2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020'2\u0006\u0010A\u001a\u00020D2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020<2\u0006\u0010A\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010K\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020'¢\u0006\u0004\bP\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, m31665d2 = {"Lrr/g1;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Llp/n$a;", "scanJpMyNumberNfcWorkerFactory", "Lwp/c;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "verifyReusablePersonaWorkerFactory", "Luq/a;", "navigationStateManager", "Lrr/e0;", "componentWorkHelper", "Lpq/c;", "externalEventLogger", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorkerFactory", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Llp/n$a;Lwp/c;Lcom/withpersona/sdk2/inquiry/ui/d$a;Lcom/withpersona/sdk2/inquiry/ui/k$a;Luq/a;Lrr/e0;Lpq/c;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lku/p0;)V", "renderProps", "renderState", "", "S", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "m0", "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "k0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "p0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "P", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "n0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "w0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "O", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "N", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "j0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "s0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;)V", "props", "M", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "l0", "()V", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "h", "Llp/n$a;", "i", "Lwp/c;", "j", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "k", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "l", "Luq/a;", "m", "Lrr/e0;", "n", "Lpq/c;", "o", "Lgo/e;", "p", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "q", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "r", "d", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11091g1 extends AbstractC12252c<UiWorkflow.Input, UiState, UiWorkflow.InterfaceC4141b, UiWorkflow.AbstractC4142c> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C3828b.a nfcScanWorkerFactory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C8232n.a scanJpMyNumberNfcWorkerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C4151d.a createReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C4158k.a verifyReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C11084e0 componentWorkHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final C3875e.a permissionRequestWorkerFactory;

    /* JADX INFO: renamed from: rr.g1$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$1$1", m39664f = "UiStepStateManager.kt", m39665l = {132}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39162t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiState f39164v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UiState uiState, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f39164v = uiState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11091g1.this.new a(this.f39164v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f39162t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C11091g1 c11091g1 = C11091g1.this;
                UiWorkflow.Input value = c11091g1.m45395b().getValue();
                UiState uiState = this.f39164v;
                this.f39162t = 1;
                if (c11091g1.m41877S(value, uiState, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: rr.g1$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$2", m39664f = "UiStepStateManager.kt", m39665l = {136}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39165t;

        /* JADX INFO: renamed from: rr.g1$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11091g1 f39167a;

            public a(C11091g1 c11091g1) {
                this.f39167a = c11091g1;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UiWorkflow.Input input, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object objM41877S;
                C11091g1 c11091g1 = this.f39167a;
                UiState uiState = (UiState) c11091g1.m45397d().m45411i();
                return (uiState != null && (objM41877S = c11091g1.m41877S(input, uiState, interfaceC9557b)) == C10047c.m38805e()) ? objM41877S : Unit.f29331a;
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11091g1.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f39165t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<UiWorkflow.Input> interfaceC9566c0M45395b = C11091g1.this.m45395b();
                a aVar = new a(C11091g1.this);
                this.f39165t = 1;
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

    /* JADX INFO: renamed from: rr.g1$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3", m39664f = "UiStepStateManager.kt", m39665l = {144}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39168t;

        /* JADX INFO: renamed from: rr.g1$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11091g1 f39170a;

            public a(C11091g1 c11091g1) {
                this.f39170a = c11091g1;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC9557b<? super Unit> interfaceC9557b) {
                UiState uiState = (UiState) this.f39170a.m45397d().m45411i();
                if (uiState == null) {
                    return Unit.f29331a;
                }
                C11091g1 c11091g1 = this.f39170a;
                c11091g1.m41879k0(c11091g1.m45395b().getValue(), uiState);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: rr.g1$c$b */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC9575h<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f39171a;

            /* JADX INFO: renamed from: rr.g1$c$b$a */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 2, 0})
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f39172a;

                /* JADX INFO: renamed from: rr.g1$c$b$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3$invokeSuspend$$inlined$map$1$2", m39664f = "UiStepStateManager.kt", m39665l = {223}, m39666m = "emit")
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14239a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public int f39173A;

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f39174t;

                    /* JADX INFO: renamed from: u */
                    public int f39175u;

                    /* JADX INFO: renamed from: v */
                    public Object f39176v;

                    /* JADX INFO: renamed from: x */
                    public Object f39178x;

                    /* JADX INFO: renamed from: y */
                    public Object f39179y;

                    /* JADX INFO: renamed from: z */
                    public Object f39180z;

                    public C14239a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f39174t = obj;
                        this.f39175u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i) {
                    this.f39172a = interfaceC9577i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.InterfaceC9577i
                @Nullable
                public final Object emit(Object obj, @NotNull InterfaceC9557b interfaceC9557b) {
                    C14239a c14239a;
                    if (interfaceC9557b instanceof C14239a) {
                        c14239a = (C14239a) interfaceC9557b;
                        int i10 = c14239a.f39175u;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14239a.f39175u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14239a = new C14239a(interfaceC9557b);
                        }
                    } else {
                        c14239a = new C14239a(interfaceC9557b);
                    }
                    Object obj2 = c14239a.f39174t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14239a.f39175u;
                    if (i11 == 0) {
                        C7348o.m30470b(obj2);
                        InterfaceC9577i interfaceC9577i = this.f39172a;
                        String stepName = ((UiWorkflow.Input) obj).getStepName();
                        c14239a.f39176v = C10350l.m39676a(obj);
                        c14239a.f39178x = C10350l.m39676a(c14239a);
                        c14239a.f39179y = C10350l.m39676a(obj);
                        c14239a.f39180z = C10350l.m39676a(interfaceC9577i);
                        c14239a.f39173A = 0;
                        c14239a.f39175u = 1;
                        if (interfaceC9577i.emit(stepName, c14239a) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
            }

            public b(InterfaceC9575h interfaceC9575h) {
                this.f39171a = interfaceC9575h;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
            @Override // nu.InterfaceC9575h
            @Nullable
            public Object collect(@NotNull InterfaceC9577i<? super String> interfaceC9577i, @NotNull InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f39171a.collect(new a(interfaceC9577i), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11091g1.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f39168t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37796m = C9579j.m37796m(new b(C11091g1.this.m45395b()));
                a aVar = new a(C11091g1.this);
                this.f39168t = 1;
                if (interfaceC9575hM37796m.collect(aVar, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: rr.g1$e */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lrr/g1$e;", "", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lrr/g1;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lrr/g1;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface e {
        @NotNull
        /* JADX INFO: renamed from: a */
        C11091g1 mo41888a(@NotNull UiWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX INFO: renamed from: rr.g1$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39181a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39182b;

        static {
            int[] iArr = new int[EnumC11028j1.values().length];
            try {
                iArr[EnumC11028j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11028j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11028j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39181a = iArr;
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f39182b = iArr2;
        }
    }

    /* JADX INFO: renamed from: rr.g1$g */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g implements Function1<HelpBottomSheetComponent, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final g f39183a = new g();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HelpBottomSheetComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: rr.g1$h */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class h extends C7744k implements Function1<UiWorkflow.InterfaceC4141b, Unit> {
        public h(Object obj) {
            super(1, obj, C11091g1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m41890d(UiWorkflow.InterfaceC4141b p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((C11091g1) this.receiver).m45398e(p8);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UiWorkflow.InterfaceC4141b interfaceC4141b) {
            m41890d(interfaceC4141b);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: rr.g1$i */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$5$1", m39664f = "UiStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class i extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39184t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiState f39186v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ ButtonComponent f39187w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UiState uiState, ButtonComponent buttonComponent, InterfaceC9557b<? super i> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f39186v = uiState;
            this.f39187w = buttonComponent;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11091g1.this.new i(this.f39186v, this.f39187w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            String strM32303N;
            C10047c.m38805e();
            if (this.f39184t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C11091g1 c11091g1 = C11091g1.this;
            UiState.Displaying displaying = (UiState.Displaying) this.f39186v;
            ButtonComponent buttonComponent = this.f39187w;
            Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int iIntValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = this.f39187w.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = this.f39187w.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                strM32303N = C7797x.m32303N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                strM32303N = null;
            }
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, iIntValue, strM32303N), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((i) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: rr.g1$j */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$6$1", m39664f = "UiStepStateManager.kt", m39665l = {296}, m39666m = "invokeSuspend")
    public static final class j extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39188t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ UiState.Displaying.AutoSubmit f39189u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11091g1 f39190v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ UiState f39191w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UiState.Displaying.AutoSubmit autoSubmit, C11091g1 c11091g1, UiState uiState, InterfaceC9557b<? super j> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f39189u = autoSubmit;
            this.f39190v = c11091g1;
            this.f39191w = uiState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new j(this.f39189u, this.f39190v, this.f39191w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f39188t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f39188t = 1;
                if (C7946z0.m32938b(1000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            int countdown = this.f39189u.getCountdown() - 1;
            C11091g1 c11091g1 = this.f39190v;
            UiState.Displaying displaying = (UiState.Displaying) this.f39191w;
            AutoSubmitableComponent component = this.f39189u.getComponent();
            String autoSubmitCountdownText = this.f39189u.getComponent().getAutoSubmitCountdownText();
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? C7797x.m32303N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: rr.g1$k */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$7", m39664f = "UiStepStateManager.kt", m39665l = {456}, m39666m = "invokeSuspend")
    public static final class k extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f39192t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiWorkflow.AbstractC4142c.a f39194v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UiWorkflow.AbstractC4142c.a aVar, InterfaceC9557b<? super k> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f39194v = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11091g1.this.new k(this.f39194v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f39192t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<UiWorkflow.AbstractC4142c> interfaceC9566c0M45396c = C11091g1.this.m45396c();
                UiWorkflow.AbstractC4142c.a aVar = this.f39194v;
                this.f39192t = 1;
                if (interfaceC9566c0M45396c.emit(aVar, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((k) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: rr.g1$l */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$runGovIdNfcWork$1", m39664f = "UiStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class l extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ UiState.Displaying f39195A;

        /* JADX INFO: renamed from: t */
        public int f39196t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f39197u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11091g1 f39198v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f39199w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Date f39200x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Date f39201y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ UiState.Displaying.NfcScan f39202z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GovernmentIdNfcScan.Attributes attributes, C11091g1 c11091g1, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, InterfaceC9557b<? super l> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f39197u = attributes;
            this.f39198v = c11091g1;
            this.f39199w = str;
            this.f39200x = date;
            this.f39201y = date2;
            this.f39202z = nfcScan;
            this.f39195A = displaying;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new l(this.f39197u, this.f39198v, this.f39199w, this.f39200x, this.f39201y, this.f39202z, this.f39195A, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            String string;
            C10047c.m38805e();
            if (this.f39196t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            GovernmentIdNfcScan.Attributes attributes = this.f39197u;
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = this.f39198v.applicationContext.getString(C12244g.f43221F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.m32182p0(this.f39199w)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (this.f39200x == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (this.f39201y == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            this.f39198v.m45399f(UiState.Displaying.m20990v(this.f39195A, null, null, C7697o.m31878d(new UiComponentErrorInfo(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.f39202z.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((l) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11091g1(@NotNull UiWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle, @NotNull Context applicationContext, @NotNull C3828b.a nfcScanWorkerFactory, @NotNull C8232n.a scanJpMyNumberNfcWorkerFactory, @NotNull C12504c sandboxFlags, @NotNull C4151d.a createReusablePersonaWorkerFactory, @NotNull C4158k.a verifyReusablePersonaWorkerFactory, @NotNull C11930a navigationStateManager, @NotNull C11084e0 componentWorkHelper, @NotNull C10309c externalEventLogger, @NotNull C6159e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C3875e.a permissionRequestWorkerFactory, @NotNull final InterfaceC7906p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(nfcScanWorkerFactory, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(scanJpMyNumberNfcWorkerFactory, "scanJpMyNumberNfcWorkerFactory");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(componentWorkHelper, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.nfcScanWorkerFactory = nfcScanWorkerFactory;
        this.scanJpMyNumberNfcWorkerFactory = scanJpMyNumberNfcWorkerFactory;
        this.sandboxFlags = sandboxFlags;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorkerFactory;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorkerFactory;
        this.navigationStateManager = navigationStateManager;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        if (m45397d().m45411i() == null) {
            m45399f(m41873M(m45395b().getValue()));
        }
        m45397d().m45416o(new Function1() { // from class: rr.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41822G(coroutineScope, this, (UiState) obj);
            }
        });
        C7882k.m32780d(coroutineScope, C7864g1.m32646d(), null, new b(null), 2, null);
        C7882k.m32780d(coroutineScope, C7864g1.m32646d(), null, new c(null), 2, null);
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m41822G(InterfaceC7906p0 interfaceC7906p0, C11091g1 c11091g1, UiState uiState) {
        if (uiState == null) {
            return Unit.f29331a;
        }
        C7882k.m32780d(interfaceC7906p0, C7864g1.m32646d(), null, c11091g1.new a(uiState, null), 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m41828Q(UiState.PendingAction pendingAction, C11091g1 c11091g1, UiState.Displaying displaying, C4151d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        if (createReusablePersona.getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            c11091g1.m45398e(UiWorkflow.InterfaceC4141b.c.f17597a);
            return Unit.f29331a;
        }
        if (Intrinsics.m31980c(it, C4151d.b.a.f17671a)) {
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.m20557f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        } else {
            if (!(it instanceof C4151d.b.Error)) {
                throw new C7345l();
            }
            c11091g1.m45399f(((C4151d.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.m20990v(displaying, null, null, null, null, c11091g1.applicationContext.getString(C12244g.f43217B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.m20557f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m41829R(C11091g1 c11091g1, UiState.Displaying displaying, C4158k.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C4158k.b.a.f17755a)) {
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
            c11091g1.m45398e(new UiWorkflow.InterfaceC4141b.FinishedWithTransition(true));
        } else {
            if (!(it instanceof C4158k.b.Error)) {
                throw new C7345l();
            }
            c11091g1.m45399f(((C4158k.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.m20990v(displaying, null, null, null, null, c11091g1.applicationContext.getString(C12244g.f43217B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m41830T(C11091g1 c11091g1, UiState uiState, UiWorkflow.Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(c11091g1.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        c11091g1.m45398e(input.getFinalStep() ? UiWorkflow.InterfaceC4141b.c.f17597a : UiWorkflow.InterfaceC4141b.b.f17596a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m41831U(C11091g1 c11091g1, UiState uiState, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        c11091g1.m41875O(component, (UiState.Displaying) uiState);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m41832V(C11091g1 c11091g1, UiState uiState, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        c11091g1.m41874N(component, (UiState.Displaying) uiState);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m41833W(HelpBottomSheetComponent helpBottomSheetComponent, C11091g1 c11091g1, UiState uiState) {
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            c11091g1.m41875O((GovernmentIdNfcScanComponent) helpBottomSheetComponent, (UiState.Displaying) uiState);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m41834X(HelpBottomSheetComponent helpBottomSheetComponent, C11091g1 c11091g1, UiState uiState) {
        String unableToScanTransitionComponentName;
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) helpBottomSheetComponent;
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.m32182p0(unableToScanTransitionComponentName))) {
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                c11091g1.m41885w0(helpBottomSheetComponent, true, displaying);
                UiState.Displaying displayingM20990v = UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null);
                GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScanComponent.getConfig().getAttributes();
                c11091g1.m45399f(C4149b.m21349b(displayingM20990v, attributes2 != null ? attributes2.getUnableToScanTransitionComponentName() : null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m41835Y(C11091g1 c11091g1, UiState uiState, VerifyPersonaButtonComponent component, Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        c11091g1.m41885w0(component, true, displaying);
        c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(component, componentParams), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m41836Z(C11091g1 c11091g1) {
        c11091g1.m45398e(UiWorkflow.InterfaceC4141b.a.f17595a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m41837a0(C11091g1 c11091g1, UiState uiState, InputAddressComponent component, String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        c11091g1.m45399f(UiState.Displaying.m20990v(displaying, C4086b.m20896m(displaying.getComponents(), component, component.m20628V(addressId).m20625S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m41838b0(C11091g1 c11091g1, UiState uiState) {
        c11091g1.m45399f(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m41839c0(C11091g1 c11091g1, UiWorkflow.Input input, UiState uiState, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        c11091g1.componentWorkHelper.m41812H(input, (UiState.Displaying) uiState, c11091g1.m45397d(), component, new h(c11091g1));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m41840d0(C11091g1 c11091g1, UiState uiState, CreatePersonaSheetComponent createReusablePersonaComponent, UiComponent buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        ButtonComponent buttonComponent = buttonClicked instanceof ButtonComponent ? (ButtonComponent) buttonClicked : null;
        if (buttonComponent != null) {
            buttonComponent.mo20533b(true);
        }
        Unit unit = Unit.f29331a;
        c11091g1.m45399f(UiState.Displaying.m20990v(displaying, C4086b.m20896m(components, createReusablePersonaComponent, C4263k.m21790b(createReusablePersonaComponent, buttonClicked, buttonClicked)), null, null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createReusablePersonaComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m41841e0(C11091g1 c11091g1, UiState uiState) {
        c11091g1.m45399f(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m41842f0(C11091g1 c11091g1, boolean z10, UiState uiState, C3875e.b it) {
        UiState.Displaying displaying;
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = f.f39181a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            WorkflowState workflowStateM45411i = c11091g1.m45397d().m45411i();
            displaying = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
            if (displaying == null) {
                return Unit.f29331a;
            }
            c11091g1.m41881m0(displaying);
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new C7345l();
            }
            c11091g1.m45399f(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        } else if (z10) {
            WorkflowState workflowStateM45411i2 = c11091g1.m45397d().m45411i();
            displaying = workflowStateM45411i2 instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i2 : null;
            if (displaying == null) {
                return Unit.f29331a;
            }
            c11091g1.m41881m0(displaying);
        } else {
            c11091g1.m45399f(UiState.Displaying.m20990v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final boolean m41844g0(ButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m41846h0(C11091g1 c11091g1, UiState uiState, UiWorkflow.Input input, UiComponent uiComponent, boolean z10, Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType uiStepButtonTypeM38753a = C9859b4.m38753a(uiComponent);
        if (uiStepButtonTypeM38753a != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(c11091g1.trackingEventsLogger, uiStepButtonTypeM38753a, uiComponent.getName(), ((UiState.Displaying) uiState).getStepName(), false, 8, null);
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        c11091g1.m41885w0(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.NONE || displaying.getHasRequestedGpsPermissions()) {
            WorkflowState workflowStateM45411i = c11091g1.m45397d().m45411i();
            UiState.Displaying displaying2 = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
            if (displaying2 == null) {
                return Unit.f29331a;
            }
            UiState.Displaying displayingM20990v = UiState.Displaying.m20990v(displaying2, null, null, null, null, null, null, null, null, null, false, false, componentParams, uiComponent, null, false, 0, null, 0, 255999, null);
            c11091g1.m45399f(displayingM20990v);
            c11091g1.m41881m0(displayingM20990v);
        } else {
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, true, componentParams, uiComponent, null, false, 0, null, 0, 254975, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m41848i0(C11091g1 c11091g1, UiState uiState) {
        TrackingEventsLogger.logUiStepButtonEvent$default(c11091g1.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        c11091g1.m45398e(UiWorkflow.InterfaceC4141b.c.f17597a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m41855o0(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m41858q0(C11091g1 c11091g1, UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, PassportNfcReaderOutput output) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.m31980c(output, PassportNfcReaderOutput.Cancel.f15691a)) {
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        } else if (output instanceof PassportNfcReaderOutput.Error) {
            String name = nfcScan.getComponent().getName();
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
                scanDocumentError = "";
            }
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, C7697o.m31878d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", scanDocumentError), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        } else if (output instanceof PassportNfcReaderOutput.Success) {
            WorkflowState workflowStateM45411i = c11091g1.m45397d().m45411i();
            UiState.Displaying displaying2 = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
            if (displaying2 == null) {
                return Unit.f29331a;
            }
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) C5199h.m24125a(displaying2.getComponents(), C7731d0.m32002b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: rr.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C11091g1.m41860r0(nfcScan, (GovernmentIdNfcScanComponent) obj));
                }
            });
            if (governmentIdNfcScanComponent2 == null) {
                return Unit.f29331a;
            }
            PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) output;
            governmentIdNfcScanComponent2.getNfcDataController().m24136c(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
            c11091g1.m45399f(C4149b.m21349b(displaying, success.getSubmitButtonComponentName()));
        } else if (output instanceof PassportNfcReaderOutput.ShowTroubleshootingTips) {
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        } else {
            if (!(output instanceof PassportNfcReaderOutput.ReenterDetails)) {
                throw new C7345l();
            }
            c11091g1.m45399f(C4149b.m21349b(displaying, ((PassportNfcReaderOutput.ReenterDetails) output).getButtonComponentName()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final boolean m41860r0(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), nfcScan.getComponent().getName());
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m41863t0(C11091g1 c11091g1, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcReaderOutput output) {
        UiState.Displaying displaying2;
        C5201j c5201jM20804j;
        C5201j c5201jM20804j2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof JpMyNumberNfcReaderOutput.Success) {
            WorkflowState workflowStateM45411i = c11091g1.m45397d().m45411i();
            displaying2 = workflowStateM45411i instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i : null;
            if (displaying2 == null) {
                return Unit.f29331a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) C5199h.m24125a(displaying2.getComponents(), C7731d0.m32002b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: rr.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C11091g1.m41865u0(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
                }
            });
            if (jpMyNumberNfcScanComponent2 != null && (c5201jM20804j2 = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
                c5201jM20804j2.m24139c(((JpMyNumberNfcReaderOutput.Success) output).getResult());
            }
            c11091g1.m45399f(C4149b.m21349b(displaying, ((JpMyNumberNfcReaderOutput.Success) output).getTransitionComponentName()));
        } else if (output instanceof JpMyNumberNfcReaderOutput.Failed) {
            WorkflowState workflowStateM45411i2 = c11091g1.m45397d().m45411i();
            displaying2 = workflowStateM45411i2 instanceof UiState.Displaying ? (UiState.Displaying) workflowStateM45411i2 : null;
            if (displaying2 == null) {
                return Unit.f29331a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent3 = (JpMyNumberNfcScanComponent) C5199h.m24125a(displaying2.getComponents(), C7731d0.m32002b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: rr.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C11091g1.m41867v0(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
                }
            });
            if (jpMyNumberNfcScanComponent3 != null && (c5201jM20804j = jpMyNumberNfcScanComponent3.getScanResultController()) != null) {
                c5201jM20804j.m24139c(((JpMyNumberNfcReaderOutput.Failed) output).getResult());
            }
            String transitionComponentName = ((JpMyNumberNfcReaderOutput.Failed) output).getTransitionComponentName();
            if (transitionComponentName == null || transitionComponentName.length() == 0) {
                c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
            } else {
                c11091g1.m45399f(C4149b.m21349b(displaying, transitionComponentName));
            }
        } else {
            if (!Intrinsics.m31980c(output, JpMyNumberNfcReaderOutput.Cancel.f15627a)) {
                throw new C7345l();
            }
            c11091g1.m45399f(UiState.Displaying.m20990v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final boolean m41865u0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    /* JADX INFO: renamed from: v0 */
    public static final boolean m41867v0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.m31980c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m41870x0(boolean z10, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InterfaceC4248h2) {
            ((InterfaceC4248h2) it).mo20533b(z10 ? Intrinsics.m31980c(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final UiState m41873M(@NotNull UiWorkflow.Input props) {
        List<UiComponent> listM31892k;
        Intrinsics.checkNotNullParameter(props, "props");
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listM31892k = C4086b.m20892i(components)) == null) {
            listM31892k = C7699p.m31892k();
        }
        if (!this.featureFlagManager.m27145a(C6174t.f23549a)) {
            listM31892k = C4149b.m21351d(listM31892k);
        }
        List<UiComponent> list = listM31892k;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentErrorInfo> listM21168s = props.m21168s();
        if (listM21168s == null) {
            listM21168s = C7699p.m31892k();
        }
        return new UiState.Displaying(list, stepName, listM21168s, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m41874N(JpMyNumberNfcScanComponent component, UiState.Displaying renderState) {
        String enableNfcPrompt;
        if (component.getValidOperation() == null) {
            return;
        }
        if (!m41878j0(component)) {
            m41885w0(component, true, renderState);
            m45399f(UiState.Displaying.m20990v(renderState, null, null, C7699p.m31892k(), null, null, null, new UiState.Displaying.JpMyNumberNfcScan(component), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
            return;
        }
        String name = component.getName();
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = "";
        }
        m45399f(UiState.Displaying.m20990v(renderState, null, null, C7697o.m31878d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", enableNfcPrompt), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
    }

    /* JADX INFO: renamed from: O */
    public final void m41875O(GovernmentIdNfcScanComponent component, UiState.Displaying renderState) {
        m41885w0(component, true, renderState);
        m45399f(UiState.Displaying.m20990v(renderState, null, null, null, null, null, new UiState.Displaying.NfcScan(component), null, null, null, false, false, null, null, null, false, renderState.getNfcScanAttemptCount() + 1, null, 0, 212959, null));
    }

    /* JADX INFO: renamed from: P */
    public final void m41876P(UiWorkflow.Input renderProps, final UiState.Displaying renderState) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            C12255f<UiState> c12255fM45397d = m45397d();
            C4151d.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c12255fM45397d.m45415n(aVar.mo21362a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), new Function1() { // from class: rr.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11091g1.m41828Q(pendingAction, this, renderState, (C4151d.b) obj);
                }
            });
            return;
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new C7345l();
            }
            return;
        }
        C12255f<UiState> c12255fM45397d2 = m45397d();
        C4158k.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c12255fM45397d2.m45415n(aVar2.mo21521a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.m21024a()), new Function1() { // from class: rr.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41829R(this.f39289a, renderState, (C4158k.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final Object m41877S(final UiWorkflow.Input input, final UiState uiState, InterfaceC9557b<? super Unit> interfaceC9557b) {
        boolean z10;
        UiWorkflow.AbstractC4142c.a.AutoSubmit autoSubmit;
        if (input.getIsRestoringState()) {
            return Unit.f29331a;
        }
        if (!(uiState instanceof UiState.Displaying)) {
            throw new C7345l();
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        m41876P(input, displaying);
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) C5199h.m24125a(displaying.getComponents(), C7731d0.m32002b(HelpBottomSheetComponent.class), g.f39183a);
        this.navigationStateManager.m44529c(input.getBackStepEnabled(), input.getCancelButtonEnabled(), displaying.getPendingAction() == null && !input.getIsSubmitting(), helpBottomSheetComponent != null && helpBottomSheetComponent.isEnabled());
        m41882n0(displaying.getComponents(), new Function1() { // from class: rr.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41839c0(this.f39277a, input, uiState, (UiComponent) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            m41883p0(input, displaying, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            m41884s0(input, displaying, displaying.getJpMyNumberNfcScan());
        }
        EnumC11024i0 enumC11024i0 = input.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.ROUGH ? EnumC11024i0.RoughLocation : EnumC11024i0.PreciseLocation;
        final boolean z11 = input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.OPTIONAL;
        if (displaying.getIsRequestingGpsPermissions()) {
            C12255f<UiState> c12255fM45397d = m45397d();
            C3875e.a aVar = this.permissionRequestWorkerFactory;
            String gpsPermissionsTitle = input.getGpsPermissionsTitle();
            if (gpsPermissionsTitle == null) {
                gpsPermissionsTitle = "";
            }
            String gpsPermissionsRationale = input.getGpsPermissionsRationale();
            if (gpsPermissionsRationale == null) {
                gpsPermissionsRationale = "Gps permission are required to verify your identity";
            }
            Context context = this.applicationContext;
            String string = context.getString(C12244g.f43247c0, C7259g.m30268b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String gpsFeatureModalPositiveButton = input.getGpsFeatureModalPositiveButton();
            if (gpsFeatureModalPositiveButton == null) {
                gpsFeatureModalPositiveButton = this.applicationContext.getString(C12244g.f43219D);
                Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
            }
            String gpsPermissionsModalNegativeButton = input.getGpsPermissionsModalNegativeButton();
            if (gpsPermissionsModalNegativeButton == null) {
                gpsPermissionsModalNegativeButton = this.applicationContext.getString(C12244g.f43219D);
                Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
            }
            c12255fM45397d.m45415n(aVar.mo19201a(new PermissionRequestWorkflow.Props(enumC11024i0, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, input.getGpsFeatureTitle(), input.getGpsFeatureRationale(), input.getGpsPermissionsModalNegativeButton(), input.getStyles())), new Function1() { // from class: rr.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11091g1.m41842f0(this.f39130a, z11, uiState, (C3875e.b) obj);
                }
            });
        } else {
            displaying = displaying;
        }
        String error = displaying.getError();
        if (error == null && input.getTransitionError() != null) {
            error = this.applicationContext.getString(C12244g.f43217B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) C5199h.m24125a(displaying.getComponents(), C7731d0.m32002b(ButtonComponent.class), new Function1() { // from class: rr.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C11091g1.m41844g0((ButtonComponent) obj));
                }
            });
            if (buttonComponent != null) {
                m45397d().m45414m("begin_countdown", new i(uiState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 != null) {
            z10 = true;
            if (autoSubmit2.getCountdown() >= 1) {
                m45397d().m45414m("countdown_" + autoSubmit2.getCountdown(), new j(autoSubmit2, this, uiState, null));
            }
        } else {
            z10 = true;
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = input.getComponents();
        List<UiComponentErrorInfo> listM21006x = displaying.m21006x();
        List<UiComponentErrorInfo> listM21168s = input.m21168s();
        if (listM21168s == null) {
            listM21168s = C7699p.m31892k();
        }
        List listW0 = CollectionsKt.m31725w0(listM21006x, listM21168s);
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        String navBarTitle = input.getNavBarTitle();
        if (input.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new UiWorkflow.AbstractC4142c.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0 ? z10 : false);
        }
        Object objM32684g = C7872i.m32684g(C7864g1.m32645c(), new k(new UiWorkflow.AbstractC4142c.a(components, components2, listW0, navigationStateM44528b, navBarTitle, new InterfaceC14057n() { // from class: rr.h0
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C11091g1.m41846h0(this.f39206a, uiState, input, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        }, new Function0() { // from class: rr.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41848i0(this.f39225a, uiState);
            }
        }, new Function0() { // from class: rr.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41830T(this.f39231a, uiState, input);
            }
        }, new Function1() { // from class: rr.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41831U(this.f39237a, uiState, (GovernmentIdNfcScanComponent) obj);
            }
        }, new Function1() { // from class: rr.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41832V(this.f39241a, uiState, (JpMyNumberNfcScanComponent) obj);
            }
        }, new Function0() { // from class: rr.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41833W(helpBottomSheetComponent, this, uiState);
            }
        }, new Function0() { // from class: rr.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41834X(helpBottomSheetComponent, this, uiState);
            }
        }, new Function2() { // from class: rr.y0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C11091g1.m41835Y(this.f39311a, uiState, (VerifyPersonaButtonComponent) obj, (Map) obj2);
            }
        }, autoSubmit, new Function0() { // from class: rr.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41836Z(this.f39316a);
            }
        }, new Function2() { // from class: rr.a1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C11091g1.m41837a0(this.f39090a, uiState, (InputAddressComponent) obj, (String) obj2);
            }
        }, (displaying.getPendingAction() != null || input.getIsSubmitting()) ? z10 : false, displaying.getStyles(), str, new Function0() { // from class: rr.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41838b0(this.f39100a, uiState);
            }
        }, new Function2() { // from class: rr.c1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C11091g1.m41840d0(this.f39110a, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
            }
        }, helpBottomSheetComponent != null ? helpBottomSheetComponent.mo20595p1(displaying.getNfcScanAttemptCount()) : null, displaying.getShowHelpBottomSheet(), new Function0() { // from class: rr.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11091g1.m41841e0(this.f39119a, uiState);
            }
        }), null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m41878j0(JpMyNumberNfcScanComponent component) {
        List<String> listM33577d;
        if (!this.sandboxFlags.m46822c()) {
            return !C8228j.f30508a.m33573c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean zM31980c = attributes != null ? Intrinsics.m31980c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationM20805k = component.getValidOperation();
        return !zM31980c && C8231m.f30517a.m33579a((jpMyNumberNfcValidOperationM20805k == null || (listM33577d = jpMyNumberNfcValidOperationM20805k.m33577d()) == null) ? null : (String) CollectionsKt.firstOrNull(listM33577d));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m41879k0(UiWorkflow.Input renderProps, UiState renderState) {
        AbstractC10315i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new C7345l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new AbstractC10315i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new C7345l();
                }
                dVar = new AbstractC10315i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new AbstractC10315i.d(renderProps.getStepName()) : new AbstractC10315i.f(renderProps.getStepName());
        }
        this.externalEventLogger.m39607c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m41880l0() {
    }

    /* JADX INFO: renamed from: m0 */
    public final void m41881m0(UiState.Displaying renderState) {
        UiComponent triggeringComponent = renderState.getTriggeringComponent();
        Map<String, ComponentParam> mapM21007z = renderState.m21007z();
        if (triggeringComponent == null || mapM21007z == null) {
            return;
        }
        m45398e(new UiWorkflow.InterfaceC4141b.FinishedWithoutTransition(triggeringComponent, mapM21007z, renderState.getStepName()));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m41882n0(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                m41882n0(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: rr.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C11091g1.m41855o0(function1, (UiComponent) obj);
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m41883p0(UiWorkflow.Input renderProps, final UiState.Displaying renderState, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends EnumC10688b> listM31895n;
        String str;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError;
        String authenticationErrorPrompt;
        String connectionLostPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        EnumC10688b enumC10688b;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strMo1450b = component.getCardAccessNumberController().mo1450b();
        String strMo1450b2 = component.getDocumentNumberController().mo1450b();
        Date dateM24117b = component.getDateOfBirthController().m24117b();
        Date dateM24117b2 = component.getExpirationDateController().m24117b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.m32182p0(strMo1450b2) || dateM24117b == null || dateM24117b2 == null) {
            m45397d().m45414m("client_side_nfc_form_validation", new l(attributes, this, strMo1450b2, dateM24117b, dateM24117b2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strMo1450b2, dateM24117b2, dateM24117b);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listM31895n = C7699p.m31895n(EnumC10688b.Dg1, EnumC10688b.Dg2, EnumC10688b.Sod);
        } else {
            listM31895n = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = f.f39182b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i10 == 1) {
                    enumC10688b = EnumC10688b.Dg1;
                } else if (i10 == 2) {
                    enumC10688b = EnumC10688b.Dg2;
                } else if (i10 != 3) {
                    enumC10688b = i10 != 4 ? null : EnumC10688b.Sod;
                } else {
                    enumC10688b = EnumC10688b.Dg14;
                }
                if (enumC10688b != null) {
                    listM31895n.add(enumC10688b);
                }
            }
        }
        C12255f<UiState> c12255fM45397d = m45397d();
        C3828b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
        Context context = this.applicationContext;
        int i11 = C12244g.f43218C;
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(C12244g.f43219D);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes == null || (connectionLostPrompt = attributes.getConnectionLostPrompt()) == null) {
            String scanDocumentError2 = attributes != null ? attributes.getScanDocumentError() : null;
            str = scanDocumentError2 == null ? "" : scanDocumentError2;
        } else {
            str = connectionLostPrompt;
        }
        Context context2 = this.applicationContext;
        int i12 = C12244g.f43221F;
        String string4 = context2.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str11 = (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str12 = (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError;
        String string6 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        c12255fM45397d.m45415n(aVar.mo18997a(strMo1450b, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes == null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes == null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes == null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes == null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes == null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes == null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes == null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes == null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes == null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes == null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes == null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes == null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes == null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes == null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes == null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes == null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), listM31895n, renderProps.getStyles(), null, component.getConfig().getStyles()), new Function1() { // from class: rr.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41858q0(this.f39259a, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m41884s0(UiWorkflow.Input renderProps, final UiState.Displaying renderState, UiState.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationM20805k = component.getValidOperation();
        if (jpMyNumberNfcValidOperationM20805k == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        m45397d().m45415n(this.scanJpMyNumberNfcWorkerFactory.mo33591a(jpMyNumberNfcValidOperationM20805k, JpMyNumberNfcStrings.INSTANCE.m18927a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), new Function1() { // from class: rr.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41863t0(this.f39267a, renderState, component, (JpMyNumberNfcReaderOutput) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m41885w0(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        m41882n0(renderState.getComponents(), new Function1() { // from class: rr.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11091g1.m41870x0(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
            }
        });
    }
}
