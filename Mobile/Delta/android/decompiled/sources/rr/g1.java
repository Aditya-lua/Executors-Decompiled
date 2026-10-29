package rr;

import android.content.Context;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import cr.h2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lp.JpMyNumberNfcValidOperation;
import or.b4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rp.j1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 l2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002mRB\u0087\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b3\u00104J-\u00109\u001a\u00020'*\b\u0012\u0004\u0012\u000206052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020'07H\u0002¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020'2\u0006\u0010;\u001a\u0002062\u0006\u0010=\u001a\u00020<2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020'2\u0006\u0010A\u001a\u00020@2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020'2\u0006\u0010A\u001a\u00020D2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020<2\u0006\u0010A\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010K\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020'¢\u0006\u0004\bP\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lrr/g1;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Llp/n$a;", "scanJpMyNumberNfcWorkerFactory", "Lwp/c;", "sandboxFlags", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "verifyReusablePersonaWorkerFactory", "Luq/a;", "navigationStateManager", "Lrr/e0;", "componentWorkHelper", "Lpq/c;", "externalEventLogger", "Lgo/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorkerFactory", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Llp/n$a;Lwp/c;Lcom/withpersona/sdk2/inquiry/ui/d$a;Lcom/withpersona/sdk2/inquiry/ui/k$a;Luq/a;Lrr/e0;Lpq/c;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lku/p0;)V", "renderProps", "renderState", "", "S", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "m0", "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "k0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "p0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "P", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "n0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "w0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "O", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "N", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "j0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;", "jpMyNumberNfcScan", "s0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;)V", "props", "M", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "l0", "()V", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "h", "Llp/n$a;", "i", "Lwp/c;", "j", "Lcom/withpersona/sdk2/inquiry/ui/d$a;", "k", "Lcom/withpersona/sdk2/inquiry/ui/k$a;", "l", "Luq/a;", "m", "Lrr/e0;", "n", "Lpq/c;", "o", "Lgo/e;", "p", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "q", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "r", "d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g1 extends vr.c<UiWorkflow.Input, UiState, UiWorkflow.b, UiWorkflow.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.nfc.b.a nfcScanWorkerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.n.a scanJpMyNumberNfcWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wp.c sandboxFlags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.ui.d.a createReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.ui.k.a verifyReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0 componentWorkHelper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$1$1", f = "UiStepStateManager.kt", l = {132}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30266t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiState f30268v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UiState uiState, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f30268v = uiState;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return g1.this.new a(this.f30268v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f30266t;
            if (i10 == 0) {
                jt.o.b(obj);
                g1 g1Var = g1.this;
                UiWorkflow.Input value = g1Var.b().getValue();
                UiState uiState = this.f30268v;
                this.f30266t = 1;
                if (g1Var.S(value, uiState, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$2", f = "UiStepStateManager.kt", l = {136}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30269t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1 f30271a;

            public a(g1 g1Var) {
                this.f30271a = g1Var;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UiWorkflow.Input input, nt.b<? super Unit> bVar) {
                Object objS;
                g1 g1Var = this.f30271a;
                UiState uiState = (UiState) g1Var.d().i();
                return (uiState != null && (objS = g1Var.S(input, uiState, bVar)) == ot.c.e()) ? objS : Unit.f22483a;
            }
        }

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return g1.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f30269t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.c0<UiWorkflow.Input> c0VarB = g1.this.b();
                a aVar = new a(g1.this);
                this.f30269t = 1;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3", f = "UiStepStateManager.kt", l = {144}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30272t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1 f30274a;

            public a(g1 g1Var) {
                this.f30274a = g1Var;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, nt.b<? super Unit> bVar) {
                UiState uiState = (UiState) this.f30274a.d().i();
                if (uiState == null) {
                    return Unit.f22483a;
                }
                g1 g1Var = this.f30274a;
                g1Var.k0(g1Var.b().getValue(), uiState);
                return Unit.f22483a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements nu.h<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.h f30275a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
            public static final class a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ nu.i f30276a;

                /* JADX INFO: renamed from: rr.g1$c$b$a$a, reason: collision with other inner class name */
                @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3$invokeSuspend$$inlined$map$1$2", f = "UiStepStateManager.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0537a extends pt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f30277t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f30278u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f30279v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f30281x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f30282y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f30283z;

                    public C0537a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f30277t = obj;
                        this.f30278u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(nu.i iVar) {
                    this.f30276a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.i
                @Nullable
                public final Object emit(Object obj, @NotNull nt.b bVar) {
                    C0537a c0537a;
                    if (bVar instanceof C0537a) {
                        c0537a = (C0537a) bVar;
                        int i10 = c0537a.f30278u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0537a.f30278u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0537a = new C0537a(bVar);
                        }
                    } else {
                        c0537a = new C0537a(bVar);
                    }
                    Object obj2 = c0537a.f30277t;
                    Object objE = ot.c.e();
                    int i11 = c0537a.f30278u;
                    if (i11 == 0) {
                        jt.o.b(obj2);
                        nu.i iVar = this.f30276a;
                        String stepName = ((UiWorkflow.Input) obj).getStepName();
                        c0537a.f30279v = pt.l.a(obj);
                        c0537a.f30281x = pt.l.a(c0537a);
                        c0537a.f30282y = pt.l.a(obj);
                        c0537a.f30283z = pt.l.a(iVar);
                        c0537a.A = 0;
                        c0537a.f30278u = 1;
                        if (iVar.emit(stepName, c0537a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj2);
                    }
                    return Unit.f22483a;
                }
            }

            public b(nu.h hVar) {
                this.f30275a = hVar;
            }

            @Override // nu.h
            @Nullable
            public Object collect(@NotNull nu.i<? super String> iVar, @NotNull nt.b bVar) {
                Object objCollect = this.f30275a.collect(new a(iVar), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return g1.this.new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f30272t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h hVarM = nu.j.m(new b(g1.this.b()));
                a aVar = new a(g1.this);
                this.f30272t = 1;
                if (hVarM.collect(aVar, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lrr/g1$e;", "", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lrr/g1;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lrr/g1;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e {
        @NotNull
        g1 a(@NotNull UiWorkflow.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30284a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30284a = iArr;
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
            b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function1<HelpBottomSheetComponent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f30285a = new g();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(HelpBottomSheetComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h extends kotlin.jvm.internal.k implements Function1<UiWorkflow.b, Unit> {
        public h(Object obj) {
            super(1, obj, g1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(UiWorkflow.b p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((g1) this.receiver).e(p8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UiWorkflow.b bVar) {
            d(bVar);
            return Unit.f22483a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$5$1", f = "UiStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class i extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30286t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiState f30288v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ButtonComponent f30289w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UiState uiState, ButtonComponent buttonComponent, nt.b<? super i> bVar) {
            super(1, bVar);
            this.f30288v = uiState;
            this.f30289w = buttonComponent;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return g1.this.new i(this.f30288v, this.f30289w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            String strN;
            ot.c.e();
            if (this.f30286t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            g1 g1Var = g1.this;
            UiState.Displaying displaying = (UiState.Displaying) this.f30288v;
            ButtonComponent buttonComponent = this.f30289w;
            Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int iIntValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = this.f30289w.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = this.f30289w.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                strN = kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                strN = null;
            }
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, iIntValue, strN), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$6$1", f = "UiStepStateManager.kt", l = {296}, m = "invokeSuspend")
    public static final class j extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30290t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ UiState.Displaying.AutoSubmit f30291u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g1 f30292v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiState f30293w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UiState.Displaying.AutoSubmit autoSubmit, g1 g1Var, UiState uiState, nt.b<? super j> bVar) {
            super(1, bVar);
            this.f30291u = autoSubmit;
            this.f30292v = g1Var;
            this.f30293w = uiState;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new j(this.f30291u, this.f30292v, this.f30293w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f30290t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f30290t = 1;
                if (ku.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            int countdown = this.f30291u.getCountdown() - 1;
            g1 g1Var = this.f30292v;
            UiState.Displaying displaying = (UiState.Displaying) this.f30293w;
            AutoSubmitableComponent component = this.f30291u.getComponent();
            String autoSubmitCountdownText = this.f30291u.getComponent().getAutoSubmitCountdownText();
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$7", f = "UiStepStateManager.kt", l = {456}, m = "invokeSuspend")
    public static final class k extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30294t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiWorkflow.c.a f30296v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UiWorkflow.c.a aVar, nt.b<? super k> bVar) {
            super(2, bVar);
            this.f30296v = aVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return g1.this.new k(this.f30296v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f30294t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.c0<UiWorkflow.c> c0VarC = g1.this.c();
                UiWorkflow.c.a aVar = this.f30296v;
                this.f30294t = 1;
                if (c0VarC.emit(aVar, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$runGovIdNfcWork$1", f = "UiStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class l extends pt.m implements Function1<nt.b<? super Unit>, Object> {
        public final /* synthetic */ UiState.Displaying A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30297t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f30298u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g1 f30299v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f30300w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Date f30301x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f30302y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ UiState.Displaying.NfcScan f30303z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GovernmentIdNfcScan.Attributes attributes, g1 g1Var, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, nt.b<? super l> bVar) {
            super(1, bVar);
            this.f30298u = attributes;
            this.f30299v = g1Var;
            this.f30300w = str;
            this.f30301x = date;
            this.f30302y = date2;
            this.f30303z = nfcScan;
            this.A = displaying;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new l(this.f30298u, this.f30299v, this.f30300w, this.f30301x, this.f30302y, this.f30303z, this.A, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            String string;
            ot.c.e();
            if (this.f30297t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            GovernmentIdNfcScan.Attributes attributes = this.f30298u;
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = this.f30299v.applicationContext.getString(vp.g.F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.p0(this.f30300w)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (this.f30301x == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (this.f30302y == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            this.f30299v.f(UiState.Displaying.v(this.A, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.f30303z.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(@NotNull UiWorkflow.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.nfc.b.a nfcScanWorkerFactory, @NotNull lp.n.a scanJpMyNumberNfcWorkerFactory, @NotNull wp.c sandboxFlags, @NotNull com.withpersona.sdk2.inquiry.ui.d.a createReusablePersonaWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.ui.k.a verifyReusablePersonaWorkerFactory, @NotNull uq.a navigationStateManager, @NotNull e0 componentWorkHelper, @NotNull pq.c externalEventLogger, @NotNull go.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorkerFactory, @NotNull final ku.p0 coroutineScope) {
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
        if (d().i() == null) {
            f(M(b().getValue()));
        }
        d().o(new Function1() { // from class: rr.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.G(coroutineScope, this, (UiState) obj);
            }
        });
        ku.k.d(coroutineScope, ku.g1.d(), null, new b(null), 2, null);
        ku.k.d(coroutineScope, ku.g1.d(), null, new c(null), 2, null);
    }

    public static final Unit G(ku.p0 p0Var, g1 g1Var, UiState uiState) {
        if (uiState == null) {
            return Unit.f22483a;
        }
        ku.k.d(p0Var, ku.g1.d(), null, g1Var.new a(uiState, null), 2, null);
        return Unit.f22483a;
    }

    public static final Unit Q(UiState.PendingAction pendingAction, g1 g1Var, UiState.Displaying displaying, com.withpersona.sdk2.inquiry.ui.d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
        if (createReusablePersona.getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            g1Var.e(UiWorkflow.b.c.f13772a);
            return Unit.f22483a;
        }
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.ui.d.b.a.f13836a)) {
            g1Var.f(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.ui.d.b.Error)) {
                throw new jt.l();
            }
            g1Var.f(((com.withpersona.sdk2.inquiry.ui.d.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.v(displaying, null, null, null, null, g1Var.applicationContext.getString(vp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        }
        return Unit.f22483a;
    }

    public static final Unit R(g1 g1Var, UiState.Displaying displaying, com.withpersona.sdk2.inquiry.ui.k.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.ui.k.b.a.f13913a)) {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
            g1Var.e(new UiWorkflow.b.FinishedWithTransition(true));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.ui.k.b.Error)) {
                throw new jt.l();
            }
            g1Var.f(((com.withpersona.sdk2.inquiry.ui.k.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.v(displaying, null, null, null, null, g1Var.applicationContext.getString(vp.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        }
        return Unit.f22483a;
    }

    public static final Unit T(g1 g1Var, UiState uiState, UiWorkflow.Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        g1Var.e(input.getFinalStep() ? UiWorkflow.b.c.f13772a : UiWorkflow.b.C0250b.f13771a);
        return Unit.f22483a;
    }

    public static final Unit U(g1 g1Var, UiState uiState, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.O(component, (UiState.Displaying) uiState);
        return Unit.f22483a;
    }

    public static final Unit V(g1 g1Var, UiState uiState, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.N(component, (UiState.Displaying) uiState);
        return Unit.f22483a;
    }

    public static final Unit W(HelpBottomSheetComponent helpBottomSheetComponent, g1 g1Var, UiState uiState) {
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            g1Var.O((GovernmentIdNfcScanComponent) helpBottomSheetComponent, (UiState.Displaying) uiState);
        }
        return Unit.f22483a;
    }

    public static final Unit X(HelpBottomSheetComponent helpBottomSheetComponent, g1 g1Var, UiState uiState) {
        String unableToScanTransitionComponentName;
        if (helpBottomSheetComponent != null && (helpBottomSheetComponent instanceof GovernmentIdNfcScanComponent)) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) helpBottomSheetComponent;
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.p0(unableToScanTransitionComponentName))) {
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                g1Var.w0(helpBottomSheetComponent, true, displaying);
                UiState.Displaying displayingV = UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null);
                GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScanComponent.getConfig().getAttributes();
                g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displayingV, attributes2 != null ? attributes2.getUnableToScanTransitionComponentName() : null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit Y(g1 g1Var, UiState uiState, VerifyPersonaButtonComponent component, Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        g1Var.w0(component, true, displaying);
        g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona(component, componentParams), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f22483a;
    }

    public static final Unit Z(g1 g1Var) {
        g1Var.e(UiWorkflow.b.a.f13770a);
        return Unit.f22483a;
    }

    public static final Unit a0(g1 g1Var, UiState uiState, InputAddressComponent component, String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        g1Var.f(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), component, component.V(addressId).S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22483a;
    }

    public static final Unit b0(g1 g1Var, UiState uiState) {
        g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f22483a;
    }

    public static final Unit c0(g1 g1Var, UiWorkflow.Input input, UiState uiState, UiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.componentWorkHelper.H(input, (UiState.Displaying) uiState, g1Var.d(), component, new h(g1Var));
        return Unit.f22483a;
    }

    public static final Unit d0(g1 g1Var, UiState uiState, CreatePersonaSheetComponent createReusablePersonaComponent, UiComponent buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        List<UiComponent> components = displaying.getComponents();
        ButtonComponent buttonComponent = buttonClicked instanceof ButtonComponent ? (ButtonComponent) buttonClicked : null;
        if (buttonComponent != null) {
            buttonComponent.b(true);
        }
        Unit unit = Unit.f22483a;
        g1Var.f(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(components, createReusablePersonaComponent, cr.k.b(createReusablePersonaComponent, buttonClicked, buttonClicked)), null, null, null, null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createReusablePersonaComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f22483a;
    }

    public static final Unit e0(g1 g1Var, UiState uiState) {
        g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f22483a;
    }

    public static final Unit f0(g1 g1Var, boolean z10, UiState uiState, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        UiState.Displaying displaying;
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = f.f30284a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            WorkflowState workflowStateI = g1Var.d().i();
            displaying = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
            if (displaying == null) {
                return Unit.f22483a;
            }
            g1Var.m0(displaying);
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new jt.l();
            }
            g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        } else if (z10) {
            WorkflowState workflowStateI2 = g1Var.d().i();
            displaying = workflowStateI2 instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI2 : null;
            if (displaying == null) {
                return Unit.f22483a;
            }
            g1Var.m0(displaying);
        } else {
            g1Var.f(UiState.Displaying.v((UiState.Displaying) uiState, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        }
        return Unit.f22483a;
    }

    public static final boolean g0(ButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    public static final Unit h0(g1 g1Var, UiState uiState, UiWorkflow.Input input, UiComponent uiComponent, boolean z10, Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType uiStepButtonTypeA = b4.a(uiComponent);
        if (uiStepButtonTypeA != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, uiStepButtonTypeA, uiComponent.getName(), ((UiState.Displaying) uiState).getStepName(), false, 8, null);
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        g1Var.w0(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.NONE || displaying.getHasRequestedGpsPermissions()) {
            WorkflowState workflowStateI = g1Var.d().i();
            UiState.Displaying displaying2 = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
            if (displaying2 == null) {
                return Unit.f22483a;
            }
            UiState.Displaying displayingV = UiState.Displaying.v(displaying2, null, null, null, null, null, null, null, null, null, false, false, componentParams, uiComponent, null, false, 0, null, 0, 255999, null);
            g1Var.f(displayingV);
            g1Var.m0(displayingV);
        } else {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, true, componentParams, uiComponent, null, false, 0, null, 0, 254975, null));
        }
        return Unit.f22483a;
    }

    public static final Unit i0(g1 g1Var, UiState uiState) {
        TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).getStepName(), false, 10, null);
        g1Var.e(UiWorkflow.b.c.f13772a);
        return Unit.f22483a;
    }

    public static final Unit o0(Function1 function1, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f22483a;
    }

    public static final Unit q0(g1 g1Var, UiState.Displaying displaying, final UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, PassportNfcReaderOutput output) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.c(output, PassportNfcReaderOutput.Cancel.f12191a)) {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        } else if (output instanceof PassportNfcReaderOutput.Error) {
            String name = nfcScan.getComponent().getName();
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
                scanDocumentError = "";
            }
            g1Var.f(UiState.Displaying.v(displaying, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", scanDocumentError), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        } else if (output instanceof PassportNfcReaderOutput.Success) {
            WorkflowState workflowStateI = g1Var.d().i();
            UiState.Displaying displaying2 = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
            if (displaying2 == null) {
                return Unit.f22483a;
            }
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) er.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: rr.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.r0(nfcScan, (GovernmentIdNfcScanComponent) obj));
                }
            });
            if (governmentIdNfcScanComponent2 == null) {
                return Unit.f22483a;
            }
            PassportNfcReaderOutput.Success success = (PassportNfcReaderOutput.Success) output;
            governmentIdNfcScanComponent2.getNfcDataController().c(new GovernmentIdNfcData(success.getDg1Uri(), success.getDg2Uri(), success.getSodUri(), success.getChipAuthenticationStatus()));
            g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, success.getSubmitButtonComponentName()));
        } else if (output instanceof PassportNfcReaderOutput.ShowTroubleshootingTips) {
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        } else {
            if (!(output instanceof PassportNfcReaderOutput.ReenterDetails)) {
                throw new jt.l();
            }
            g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((PassportNfcReaderOutput.ReenterDetails) output).getButtonComponentName()));
        }
        return Unit.f22483a;
    }

    public static final boolean r0(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), nfcScan.getComponent().getName());
    }

    public static final Unit t0(g1 g1Var, UiState.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcReaderOutput output) {
        UiState.Displaying displaying2;
        er.j jVarJ;
        er.j jVarJ2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof JpMyNumberNfcReaderOutput.Success) {
            WorkflowState workflowStateI = g1Var.d().i();
            displaying2 = workflowStateI instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI : null;
            if (displaying2 == null) {
                return Unit.f22483a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) er.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: rr.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.u0(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
                }
            });
            if (jpMyNumberNfcScanComponent2 != null && (jVarJ2 = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
                jVarJ2.c(((JpMyNumberNfcReaderOutput.Success) output).getResult());
            }
            g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, ((JpMyNumberNfcReaderOutput.Success) output).getTransitionComponentName()));
        } else if (output instanceof JpMyNumberNfcReaderOutput.Failed) {
            WorkflowState workflowStateI2 = g1Var.d().i();
            displaying2 = workflowStateI2 instanceof UiState.Displaying ? (UiState.Displaying) workflowStateI2 : null;
            if (displaying2 == null) {
                return Unit.f22483a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent3 = (JpMyNumberNfcScanComponent) er.h.a(displaying2.getComponents(), kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: rr.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.v0(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
                }
            });
            if (jpMyNumberNfcScanComponent3 != null && (jVarJ = jpMyNumberNfcScanComponent3.getScanResultController()) != null) {
                jVarJ.c(((JpMyNumberNfcReaderOutput.Failed) output).getResult());
            }
            String transitionComponentName = ((JpMyNumberNfcReaderOutput.Failed) output).getTransitionComponentName();
            if (transitionComponentName == null || transitionComponentName.length() == 0) {
                g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
            } else {
                g1Var.f(com.withpersona.sdk2.inquiry.ui.b.b(displaying, transitionComponentName));
            }
        } else {
            if (!Intrinsics.c(output, JpMyNumberNfcReaderOutput.Cancel.f12147a)) {
                throw new jt.l();
            }
            g1Var.f(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        }
        return Unit.f22483a;
    }

    public static final boolean u0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final boolean v0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit x0(boolean z10, UiComponent uiComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof h2) {
            ((h2) it).b(z10 ? Intrinsics.c(it.getName(), uiComponent.getName()) : true);
        }
        return Unit.f22483a;
    }

    @NotNull
    public final UiState M(@NotNull UiWorkflow.Input props) {
        List<UiComponent> listK;
        Intrinsics.checkNotNullParameter(props, "props");
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listK = com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components)) == null) {
            listK = kotlin.collections.p.k();
        }
        if (!this.featureFlagManager.a(go.t.f18312a)) {
            listK = com.withpersona.sdk2.inquiry.ui.b.d(listK);
        }
        List<UiComponent> list = listK;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentErrorInfo> listS = props.s();
        if (listS == null) {
            listS = kotlin.collections.p.k();
        }
        return new UiState.Displaying(list, stepName, listS, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    public final void N(JpMyNumberNfcScanComponent component, UiState.Displaying renderState) {
        String enableNfcPrompt;
        if (component.getValidOperation() == null) {
            return;
        }
        if (!j0(component)) {
            w0(component, true, renderState);
            f(UiState.Displaying.v(renderState, null, null, kotlin.collections.p.k(), null, null, null, new UiState.Displaying.JpMyNumberNfcScan(component), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
            return;
        }
        String name = component.getName();
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = "";
        }
        f(UiState.Displaying.v(renderState, null, null, kotlin.collections.o.d(new UiComponentErrorInfo(new UiComponentError.UiInputComponentError(name, "", enableNfcPrompt), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
    }

    public final void O(GovernmentIdNfcScanComponent component, UiState.Displaying renderState) {
        w0(component, true, renderState);
        f(UiState.Displaying.v(renderState, null, null, null, null, null, new UiState.Displaying.NfcScan(component), null, null, null, false, false, null, null, null, false, renderState.getNfcScanAttemptCount() + 1, null, 0, 212959, null));
    }

    public final void P(UiWorkflow.Input renderProps, final UiState.Displaying renderState) {
        final UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            vr.f<UiState> fVarD = d();
            com.withpersona.sdk2.inquiry.ui.d.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            fVarD.n(aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), new Function1() { // from class: rr.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g1.Q(pendingAction, this, renderState, (com.withpersona.sdk2.inquiry.ui.d.b) obj);
                }
            });
            return;
        }
        if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new jt.l();
            }
            return;
        }
        vr.f<UiState> fVarD2 = d();
        com.withpersona.sdk2.inquiry.ui.k.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        fVarD2.n(aVar2.a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.a()), new Function1() { // from class: rr.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.R(this.f30364a, renderState, (com.withpersona.sdk2.inquiry.ui.k.b) obj);
            }
        });
    }

    public final Object S(final UiWorkflow.Input input, final UiState uiState, nt.b<? super Unit> bVar) {
        boolean z10;
        UiWorkflow.c.a.AutoSubmit autoSubmit;
        if (input.getIsRestoringState()) {
            return Unit.f22483a;
        }
        if (!(uiState instanceof UiState.Displaying)) {
            throw new jt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        P(input, displaying);
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) er.h.a(displaying.getComponents(), kotlin.jvm.internal.d0.b(HelpBottomSheetComponent.class), g.f30285a);
        this.navigationStateManager.c(input.getBackStepEnabled(), input.getCancelButtonEnabled(), displaying.getPendingAction() == null && !input.getIsSubmitting(), helpBottomSheetComponent != null && helpBottomSheetComponent.isEnabled());
        n0(displaying.getComponents(), new Function1() { // from class: rr.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.c0(this.f30356a, input, uiState, (UiComponent) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            p0(input, displaying, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            s0(input, displaying, displaying.getJpMyNumberNfcScan());
        }
        rp.i0 i0Var = input.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.ROUGH ? rp.i0.RoughLocation : rp.i0.PreciseLocation;
        final boolean z11 = input.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.OPTIONAL;
        if (displaying.getIsRequestingGpsPermissions()) {
            vr.f<UiState> fVarD = d();
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar = this.permissionRequestWorkerFactory;
            String gpsPermissionsTitle = input.getGpsPermissionsTitle();
            if (gpsPermissionsTitle == null) {
                gpsPermissionsTitle = "";
            }
            String gpsPermissionsRationale = input.getGpsPermissionsRationale();
            if (gpsPermissionsRationale == null) {
                gpsPermissionsRationale = "Gps permission are required to verify your identity";
            }
            Context context = this.applicationContext;
            String string = context.getString(vp.g.f33388c0, jq.g.b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String gpsFeatureModalPositiveButton = input.getGpsFeatureModalPositiveButton();
            if (gpsFeatureModalPositiveButton == null) {
                gpsFeatureModalPositiveButton = this.applicationContext.getString(vp.g.D);
                Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
            }
            String gpsPermissionsModalNegativeButton = input.getGpsPermissionsModalNegativeButton();
            if (gpsPermissionsModalNegativeButton == null) {
                gpsPermissionsModalNegativeButton = this.applicationContext.getString(vp.g.D);
                Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
            }
            fVarD.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, input.getGpsFeatureTitle(), input.getGpsFeatureRationale(), input.getGpsPermissionsModalNegativeButton(), input.getStyles())), new Function1() { // from class: rr.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g1.f0(this.f30239a, z11, uiState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                }
            });
        } else {
            displaying = displaying;
        }
        String error = displaying.getError();
        if (error == null && input.getTransitionError() != null) {
            error = this.applicationContext.getString(vp.g.B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) er.h.a(displaying.getComponents(), kotlin.jvm.internal.d0.b(ButtonComponent.class), new Function1() { // from class: rr.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.g0((ButtonComponent) obj));
                }
            });
            if (buttonComponent != null) {
                d().m("begin_countdown", new i(uiState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 != null) {
            z10 = true;
            if (autoSubmit2.getCountdown() >= 1) {
                d().m("countdown_" + autoSubmit2.getCountdown(), new j(autoSubmit2, this, uiState, null));
            }
        } else {
            z10 = true;
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentConfig> components2 = input.getComponents();
        List<UiComponentErrorInfo> listX = displaying.x();
        List<UiComponentErrorInfo> listS = input.s();
        if (listS == null) {
            listS = kotlin.collections.p.k();
        }
        List listW0 = CollectionsKt.w0(listX, listS);
        NavigationState navigationStateB = this.navigationStateManager.b();
        String navBarTitle = input.getNavBarTitle();
        if (input.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new UiWorkflow.c.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0 ? z10 : false);
        }
        Object objG = ku.i.g(ku.g1.c(), new k(new UiWorkflow.c.a(components, components2, listW0, navigationStateB, navBarTitle, new zt.n() { // from class: rr.h0
            @Override // zt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return g1.h0(this.f30306a, uiState, input, (UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        }, new Function0() { // from class: rr.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.i0(this.f30322a, uiState);
            }
        }, new Function0() { // from class: rr.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.T(this.f30326a, uiState, input);
            }
        }, new Function1() { // from class: rr.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.U(this.f30330a, uiState, (GovernmentIdNfcScanComponent) obj);
            }
        }, new Function1() { // from class: rr.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.V(this.f30332a, uiState, (JpMyNumberNfcScanComponent) obj);
            }
        }, new Function0() { // from class: rr.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.W(helpBottomSheetComponent, this, uiState);
            }
        }, new Function0() { // from class: rr.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.X(helpBottomSheetComponent, this, uiState);
            }
        }, new Function2() { // from class: rr.y0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1.Y(this.f30380a, uiState, (VerifyPersonaButtonComponent) obj, (Map) obj2);
            }
        }, autoSubmit, new Function0() { // from class: rr.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.Z(this.f30383a);
            }
        }, new Function2() { // from class: rr.a1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1.a0(this.f30211a, uiState, (InputAddressComponent) obj, (String) obj2);
            }
        }, (displaying.getPendingAction() != null || input.getIsSubmitting()) ? z10 : false, displaying.getStyles(), str, new Function0() { // from class: rr.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.b0(this.f30218a, uiState);
            }
        }, new Function2() { // from class: rr.c1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1.d0(this.f30225a, uiState, (CreatePersonaSheetComponent) obj, (UiComponent) obj2);
            }
        }, helpBottomSheetComponent != null ? helpBottomSheetComponent.o1(displaying.getNfcScanAttemptCount()) : null, displaying.getShowHelpBottomSheet(), new Function0() { // from class: rr.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.e0(this.f30231a, uiState);
            }
        }), null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    public final boolean j0(JpMyNumberNfcScanComponent component) {
        List<String> listD;
        if (!this.sandboxFlags.c()) {
            return !lp.j.f23505a.c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean zC = attributes != null ? Intrinsics.c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        return !zC && lp.m.f23512a.a((jpMyNumberNfcValidOperationK == null || (listD = jpMyNumberNfcValidOperationK.d()) == null) ? null : (String) CollectionsKt.firstOrNull(listD));
    }

    public final void k0(UiWorkflow.Input renderProps, UiState renderState) {
        pq.i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new jt.l();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new pq.i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new jt.l();
                }
                dVar = new pq.i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new pq.i.d(renderProps.getStepName()) : new pq.i.f(renderProps.getStepName());
        }
        this.externalEventLogger.c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    public final void l0() {
    }

    public final void m0(UiState.Displaying renderState) {
        UiComponent triggeringComponent = renderState.getTriggeringComponent();
        Map<String, ComponentParam> mapZ = renderState.z();
        if (triggeringComponent == null || mapZ == null) {
            return;
        }
        e(new UiWorkflow.b.FinishedWithoutTransition(triggeringComponent, mapZ, renderState.getStepName()));
    }

    public final void n0(List<? extends UiComponent> list, final Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                n0(((UiComponentGroup) uiComponent).getChildren(), new Function1() { // from class: rr.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g1.o0(function1, (UiComponent) obj);
                    }
                });
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    public final void p0(UiWorkflow.Input renderProps, final UiState.Displaying renderState, final UiState.Displaying.NfcScan nfcScan) {
        List<? extends qp.b> listN;
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
        qp.b bVar;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strB = component.getCardAccessNumberController().b();
        String strB2 = component.getDocumentNumberController().b();
        Date dateB = component.getDateOfBirthController().b();
        Date dateB2 = component.getExpirationDateController().b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.p0(strB2) || dateB == null || dateB2 == null) {
            d().m("client_side_nfc_form_validation", new l(attributes, this, strB2, dateB, dateB2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strB2, dateB2, dateB);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listN = kotlin.collections.p.n(qp.b.Dg1, qp.b.Dg2, qp.b.Sod);
        } else {
            listN = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = f.b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i10 == 1) {
                    bVar = qp.b.Dg1;
                } else if (i10 == 2) {
                    bVar = qp.b.Dg2;
                } else if (i10 != 3) {
                    bVar = i10 != 4 ? null : qp.b.Sod;
                } else {
                    bVar = qp.b.Dg14;
                }
                if (bVar != null) {
                    listN.add(bVar);
                }
            }
        }
        vr.f<UiState> fVarD = d();
        com.withpersona.sdk2.inquiry.nfc.b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
        Context context = this.applicationContext;
        int i11 = vp.g.C;
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(vp.g.D);
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
        int i12 = vp.g.F;
        String string4 = context2.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str11 = (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str12 = (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError;
        String string6 = this.applicationContext.getString(i12);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        fVarD.n(aVar.a(strB, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes == null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes == null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes == null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes == null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes == null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes == null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes == null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes == null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes == null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes == null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes == null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes == null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes == null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes == null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes == null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes == null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), listN, renderProps.getStyles(), null, component.getConfig().getStyles()), new Function1() { // from class: rr.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.q0(this.f30344a, renderState, nfcScan, component, (PassportNfcReaderOutput) obj);
            }
        });
    }

    public final void s0(UiWorkflow.Input renderProps, final UiState.Displaying renderState, UiState.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        if (jpMyNumberNfcValidOperationK == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        d().n(this.scanJpMyNumberNfcWorkerFactory.a(jpMyNumberNfcValidOperationK, JpMyNumberNfcStrings.INSTANCE.a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), new Function1() { // from class: rr.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.t0(this.f30350a, renderState, component, (JpMyNumberNfcReaderOutput) obj);
            }
        });
    }

    public final void w0(final UiComponent tappedUiComponent, final boolean isTappedComponentVisible, UiState.Displaying renderState) {
        n0(renderState.getComponents(), new Function1() { // from class: rr.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.x0(isTappedComponentVisible, tappedUiComponent, (UiComponent) obj);
            }
        });
    }
}
