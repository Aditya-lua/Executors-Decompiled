package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import ar.C1147b;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3540c;
import com.withpersona.sdk2.inquiry.governmentid.C3544e;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3591b;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import hu.InterfaceC6567c;
import io.C6903p2;
import io.EnumC6852d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7724a;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.InterfaceC7738h;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5689j;
import p226jq.C7259g;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.InterfaceC7330b;
import p239k6.InterfaceC7479s;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p276ln.InterfaceC8169a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p361po.C10303c;
import p361po.EnumC10302b;
import p363pq.AbstractC10315i;
import p363pq.C10309c;
import p363pq.InterfaceC10314h;
import p389qo.C10643e;
import p473uo.C11905l;
import p473uo.EnumC11917x;
import p475uq.C11930a;
import p497vp.C12244g;
import p499vr.AbstractC12252c;
import p526wq.EnumC12529l;
import p581ym.InterfaceC13215h;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import ro.C10960i;
import ro.C10965j1;
import ro.C10972m0;
import ro.C10990v0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001fB\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00101J\u001b\u00104\u001a\u000203*\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020+¢\u0006\u0004\b?\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lk6/s;", "imageLoader", "Lpo/c$a;", "submitVerificationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "documentSelectWorker", "Lro/v0;", "localVideoCaptureRenderer", "Lro/j1;", "webRtcRenderer", "Lro/m0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lro/i;", "autoClassificationRenderer", "Lln/a;", "cameraStatsManager", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lk6/s;Lpo/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Lro/v0;Lro/j1;Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lro/i;Lln/a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lku/p0;)V", "renderProps", "renderState", "", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)Ljava/lang/Object;", "g0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "c0", "()V", "Z", "", "V0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "props", "a0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "f0", "(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "e0", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lk6/s;", "h", "Lpo/c$a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "j", "Lro/v0;", "k", "Lro/j1;", "l", "Lro/m0;", "m", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "n", "Lro/i;", "o", "Lln/a;", "p", "Luq/a;", "q", "Lpq/c;", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "Luo/l;", "t", "Luo/l;", "videoCaptureHelper", "Lhu/c;", "u", "Lhu/c;", "previousStateClass", "c", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3591b extends AbstractC12252c<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.AbstractC3503a, Screen> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C10303c.a submitVerificationWorkerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C3544e documentSelectWorker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C10990v0 localVideoCaptureRenderer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C10965j1 webRtcRenderer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C10972m0 captureRenderer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.C3563b autoClassifyWorkerFactory;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C10960i autoClassificationRenderer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final C4007a themeManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final C11905l videoCaptureHelper;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public InterfaceC6567c<? extends GovernmentIdState> previousStateClass;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$1$1", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {119}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14250t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdState f14252v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GovernmentIdState governmentIdState, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14252v = governmentIdState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3591b.this.new a(this.f14252v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14250t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C3591b c3591b = C3591b.this;
                GovernmentIdWorkflow.Input value = c3591b.m45395b().getValue();
                GovernmentIdState governmentIdState = this.f14252v;
                this.f14250t = 1;
                if (c3591b.m17897d0(value, governmentIdState, this) == objM38805e) {
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$2", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {123}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14253t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3591b f14255a;

            public a(C3591b c3591b) {
                this.f14255a = c3591b;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(GovernmentIdWorkflow.Input input, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object objM17897d0;
                C3591b c3591b = this.f14255a;
                GovernmentIdState governmentIdState = (GovernmentIdState) c3591b.m45397d().m45411i();
                return (governmentIdState != null && (objM17897d0 = c3591b.m17897d0(input, governmentIdState, interfaceC9557b)) == C10047c.m38805e()) ? objM17897d0 : Unit.f29331a;
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3591b.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14253t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<GovernmentIdWorkflow.Input> interfaceC9566c0M45395b = C3591b.this.m45395b();
                a aVar = new a(C3591b.this);
                this.f14253t = 1;
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$c */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface c {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3591b mo17902a(@NotNull GovernmentIdWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14256a;

        static {
            int[] iArr = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.EnumC3514b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.EnumC3514b.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.EnumC3514b.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.EnumC3514b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14256a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$2", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {223}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14257t;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3591b.this.new e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14257t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5689j c5689j = C5689j.f21847a;
                Context context = C3591b.this.applicationContext;
                this.f14257t = 1;
                if (c5689j.m25813b(context, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C3591b.this.videoCaptureHelper.m44494a();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$f */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$3", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14259t;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3591b.this.new f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f14259t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C3591b.this.m45398e(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$4", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {241}, m39666m = "invokeSuspend")
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14261t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Screen f14263v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Screen screen, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14263v = screen;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3591b.this.new g(this.f14263v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14261t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<Screen> interfaceC9566c0M45396c = C3591b.this.m45396c();
                Screen screen = this.f14263v;
                this.f14261t = 1;
                if (interfaceC9566c0M45396c.emit(screen, this) == objM38805e) {
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
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$h */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class h implements InterfaceC13215h, InterfaceC7738h {
        public h() {
        }

        @Override // kotlin.jvm.internal.InterfaceC7738h
        /* JADX INFO: renamed from: b */
        public final InterfaceC7330b<?> mo15683b() {
            return new C7744k(1, C3591b.this, C3591b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p581ym.InterfaceC13215h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void mo17905a(GovernmentIdWorkflow.AbstractC3503a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            C3591b.this.m45398e(p8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC13215h) && (obj instanceof InterfaceC7738h)) {
                return Intrinsics.m31980c(mo15683b(), ((InterfaceC7738h) obj).mo15683b());
            }
            return false;
        }

        public final int hashCode() {
            return mo15683b().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$i */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class i implements InterfaceC13215h, InterfaceC7738h {
        public i() {
        }

        @Override // kotlin.jvm.internal.InterfaceC7738h
        /* JADX INFO: renamed from: b */
        public final InterfaceC7330b<?> mo15683b() {
            return new C7744k(1, C3591b.this, C3591b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p581ym.InterfaceC13215h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void mo17905a(GovernmentIdWorkflow.AbstractC3503a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            C3591b.this.m45398e(p8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC13215h) && (obj instanceof InterfaceC7738h)) {
                return Intrinsics.m31980c(mo15683b(), ((InterfaceC7738h) obj).mo15683b());
            }
            return false;
        }

        public final int hashCode() {
            return mo15683b().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$j */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class j extends C7744k implements Function1<GovernmentIdWorkflow.AbstractC3503a, Unit> {
        public j(Object obj) {
            super(1, obj, C3591b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m17908d(GovernmentIdWorkflow.AbstractC3503a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((C3591b) this.receiver).m45398e(p8);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GovernmentIdWorkflow.AbstractC3503a abstractC3503a) {
            m17908d(abstractC3503a);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$k */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$1", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class k extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14266t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ GovernmentIdWorkflow.Input f14267u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdState f14268v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C3591b f14269w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, C3591b c3591b, InterfaceC9557b<? super k> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f14267u = input;
            this.f14268v = governmentIdState;
            this.f14269w = c3591b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new k(this.f14267u, this.f14268v, this.f14269w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f14266t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (this.f14267u.m17184o().size() == 1) {
                GovernmentIdState governmentIdState = this.f14268v;
                C3591b c3591b = this.f14269w;
                GovernmentIdWorkflow.Input input = this.f14267u;
                C3591b.m17846T0(governmentIdState, c3591b, input, (IdConfig) CollectionsKt.m31706d0(input.m17184o()), false);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((k) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$l */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class l extends C7744k implements Function1<GovernmentIdWorkflow.AbstractC3503a, Unit> {
        public l(Object obj) {
            super(1, obj, C3591b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m17910d(GovernmentIdWorkflow.AbstractC3503a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((C3591b) this.receiver).m45398e(p8);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GovernmentIdWorkflow.AbstractC3503a abstractC3503a) {
            m17910d(abstractC3503a);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$m */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class m extends C7724a implements Function1<IdConfig, Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ GovernmentIdState f14270h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C3591b f14271i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ GovernmentIdWorkflow.Input f14272j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(GovernmentIdState governmentIdState, C3591b c3591b, GovernmentIdWorkflow.Input input) {
            super(1, Intrinsics.C7723a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepStateManager;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f14270h = governmentIdState;
            this.f14271i = c3591b;
            this.f14272j = input;
        }

        /* JADX INFO: renamed from: a */
        public final void m17911a(IdConfig p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            C3591b.m17848U0(this.f14270h, this.f14271i, this.f14272j, p8, false, 16, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            m17911a(idConfig);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$n */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$42", m39664f = "GovernmentIdStepStateManager.kt", m39665l = {899}, m39666m = "invokeSuspend")
    public static final class n extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14273t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdState f14275v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(GovernmentIdState governmentIdState, InterfaceC9557b<? super n> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f14275v = governmentIdState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3591b.this.new n(this.f14275v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14273t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5689j c5689j = C5689j.f21847a;
                Context context = C3591b.this.applicationContext;
                this.f14273t = 1;
                if (c5689j.m25813b(context, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C3591b.this.videoCaptureHelper.m44494a();
            C3591b.this.m45397d().m45417p(this.f14275v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((n) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3591b(@NotNull GovernmentIdWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle, @NotNull Context applicationContext, @NotNull InterfaceC7479s imageLoader, @NotNull C10303c.a submitVerificationWorkerFactory, @NotNull C3544e documentSelectWorker, @NotNull C10990v0 localVideoCaptureRenderer, @NotNull C10965j1 webRtcRenderer, @NotNull C10972m0 captureRenderer, @NotNull AutoClassifyWorker.C3563b autoClassifyWorkerFactory, @NotNull C10960i autoClassificationRenderer, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C11930a navigationStateManager, @NotNull C10309c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C4007a themeManager, @NotNull final InterfaceC7906p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSelectWorker, "documentSelectWorker");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(webRtcRenderer, "webRtcRenderer");
        Intrinsics.checkNotNullParameter(captureRenderer, "captureRenderer");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(autoClassificationRenderer, "autoClassificationRenderer");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.imageLoader = imageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorkerFactory;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = autoClassifyWorkerFactory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.themeManager = themeManager;
        this.videoCaptureHelper = new C11905l(null, 1, null);
        if (m45397d().m45411i() == null) {
            m45399f(m17895a0(m45395b().getValue()));
        }
        m45397d().m45416o(new Function1() { // from class: qo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3591b.m17845T(coroutineScope, this, (GovernmentIdState) obj);
            }
        });
        C7882k.m32780d(coroutineScope, C7864g1.m32646d(), null, new b(null), 2, null);
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m17808A0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m17810B0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m17812C0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m17814D0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m17816E0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m17818F0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m17820G0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m17822H0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m17824I0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Unit m17826J0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m17828K0(C3591b c3591b) {
        c3591b.m17896c0();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m17830L0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m17832M0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m17834N0(C3591b c3591b) {
        c3591b.m17894Z();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m17836O0(C3591b c3591b, GovernmentIdState governmentIdState) {
        c3591b.m45399f(GovernmentIdState.ShowInstructions.m17035J((GovernmentIdState.ShowInstructions) governmentIdState, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m17838P0(C3591b c3591b, GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, C3544e.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3544e.a.c) {
            C3544e.a.c cVar = (C3544e.a.c) it;
            m17844S0(sideIdPart, governmentIdState, c3591b, cVar.getAbsoluteFilePath(), cVar.getFileName());
        } else if (Intrinsics.m31980c(it, C3544e.a.C14125a.f14058a)) {
            c3591b.m45399f(GovernmentIdState.ChooseCaptureMethod.m16978J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 447, null));
        } else {
            if (!(it instanceof C3544e.a.b)) {
                throw new C7345l();
            }
            c3591b.m45398e(new GovernmentIdWorkflow.AbstractC3503a.c(((C3544e.a.b) it).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m17840Q0(final C3591b c3591b, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input) {
        WorkflowState workflowStateM45411i = c3591b.m45397d().m45411i();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = workflowStateM45411i instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) workflowStateM45411i : null;
        if (chooseCaptureMethod == null) {
            return Unit.f29331a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        c3591b.m45399f(new GovernmentIdState.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.mo16956E(), chooseCaptureMethod2.getCaptureConfig(), C3555n.m17609O(input, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.mo16955D(), chooseCaptureMethod.getPartIndex(), C10643e.m40734e(c3591b.m45397d(), false), EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: qo.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3591b.m17842R0(this.f38186a);
            }
        }, 11776, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m17842R0(C3591b c3591b) {
        WorkflowState workflowStateM45411i = c3591b.m45397d().m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture != null) {
            c3591b.m45399f(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c3591b.videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S0 */
    public static final void m17844S0(IdPart.SideIdPart sideIdPart, GovernmentIdState governmentIdState, C3591b c3591b, String str, String str2) {
        List listM31878d = C7697o.m31878d(new Frame(str, null, 2, null));
        GovernmentId.EnumC3486b enumC3486bM17630e0 = C3555n.m17630e0(sideIdPart.getSide());
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(listM31878d, enumC3486bM17630e0, C3540c.m17508b(chooseCaptureMethod.getCaptureConfig()), GovernmentId.EnumC3485a.f13533c, null, null, 32, null);
        WorkflowState workflowStateM45411i = c3591b.m45397d().m45411i();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = workflowStateM45411i instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) workflowStateM45411i : null;
        if (chooseCaptureMethod2 == null) {
            return;
        }
        c3591b.m45399f(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod.getCurrentPart(), chooseCaptureMethod.mo16956E(), chooseCaptureMethod.getCaptureConfig(), governmentIdImage, str2, chooseCaptureMethod2.mo16955D(), chooseCaptureMethod2.getPartIndex(), C10643e.m40734e(c3591b.m45397d(), false), null, null, false, chooseCaptureMethod.getCountryCode(), 1792, null));
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m17845T(InterfaceC7906p0 interfaceC7906p0, C3591b c3591b, GovernmentIdState governmentIdState) {
        if (governmentIdState == null) {
            return Unit.f29331a;
        }
        C7882k.m32780d(interfaceC7906p0, C7864g1.m32646d(), null, c3591b.new a(governmentIdState, null), 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m17846T0(GovernmentIdState governmentIdState, C3591b c3591b, GovernmentIdWorkflow.Input input, IdConfig idConfig, boolean z10) {
        C10643e.m40748s((GovernmentIdState.ShowInstructions) governmentIdState, c3591b.m45397d(), input, null, idConfig, c3591b.videoCaptureHelper, new CameraProperties(null, null, null, 0, 0, 31, null), z10, idConfig.m17272f(), 0, null, null, 3584, null);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m17848U0(GovernmentIdState governmentIdState, C3591b c3591b, GovernmentIdWorkflow.Input input, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        m17846T0(governmentIdState, c3591b, input, idConfig, z10);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m17853b0(C3591b c3591b) {
        WorkflowState workflowStateM45411i = c3591b.m45397d().m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture != null) {
            c3591b.m45399f(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c3591b.videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m17856h0(C3591b c3591b, GovernmentIdState governmentIdState) {
        c3591b.documentSelectWorker.m17534g();
        c3591b.m45399f(GovernmentIdState.ChooseCaptureMethod.m16978J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m17858i0(C3591b c3591b) {
        c3591b.m17896c0();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m17860j0(C3591b c3591b) {
        c3591b.m17894Z();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m17862k0(C3591b c3591b, GovernmentIdState governmentIdState) {
        c3591b.m45399f(GovernmentIdState.ChooseCaptureMethod.m16978J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m17864l0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m17866m0(C3591b c3591b, GovernmentIdWorkflow.AbstractC3503a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3591b.m45398e(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m17868n0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, C3591b c3591b) {
        C10643e.m40750u(input, (GovernmentIdState.ReviewImageState) governmentIdState, c3591b.m45397d(), c3591b.videoCaptureHelper, c3591b.trackingEventsLogger);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m17870o0(final C3591b c3591b, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, CaptureConfig captureConfig) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(c3591b.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        GovernmentIdState governmentIdState2 = (GovernmentIdState) c3591b.m45397d().m45411i();
        if (governmentIdState2 != null) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
            GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), governmentIdState2.mo16956E(), captureConfig, C3555n.m17609O(input, reviewCapturedImage.getCurrentPart().getSide()), governmentIdState2.mo16955D(), governmentIdState2.getPartIndex(), C10643e.m40734e(c3591b.m45397d(), false), c3591b.videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: qo.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17872p0(this.f38184a);
                }
            }, 11776, null);
            waitForAutocapture.m16957G(true);
            c3591b.m45399f(waitForAutocapture);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m17872p0(C3591b c3591b) {
        WorkflowState workflowStateM45411i = c3591b.m45397d().m45411i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateM45411i instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateM45411i : null;
        if (waitForAutocapture != null) {
            c3591b.m45399f(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c3591b.videoCaptureHelper.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m17874q0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m17876r0(C3591b c3591b, GovernmentIdState governmentIdState) {
        c3591b.m45399f(GovernmentIdState.ReviewCapturedImage.m17017O((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m17878s0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, C3591b c3591b) {
        C10643e.m40750u(input, (GovernmentIdState.ReviewImageState) governmentIdState, c3591b.m45397d(), c3591b.videoCaptureHelper, c3591b.trackingEventsLogger);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m17880t0(C3591b c3591b) {
        c3591b.m17896c0();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m17882u0(C3591b c3591b) {
        c3591b.m17896c0();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m17884v0(C3591b c3591b) {
        c3591b.m17894Z();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m17886w0(C3591b c3591b, GovernmentIdState governmentIdState) {
        c3591b.m45399f(GovernmentIdState.ReviewSelectedImage.m17028O((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m17888x0(C3591b c3591b, GovernmentIdState governmentIdState, C10303c.b it) {
        GovernmentIdState backState;
        String string;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C10303c.b.c) {
            c3591b.m45399f(GovernmentIdState.Submit.m17040J((GovernmentIdState.Submit) governmentIdState, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
            c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.d.f13793a);
        } else {
            if (it instanceof C10303c.b.C14231b) {
                C10303c.b.C14231b c14231b = (C10303c.b.C14231b) it;
                if (c14231b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                    string = c3591b.applicationContext.getString(C12244g.f43264t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c14231b.getCause()).getDetails().getMinDimensionSize()));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = c3591b.applicationContext.getString(C12244g.f43265u);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                GovernmentIdState governmentIdState2 = (GovernmentIdState) c3591b.m45397d().m45411i();
                backState = governmentIdState2 != null ? governmentIdState2.getBackState() : null;
                if (backState != null) {
                    c3591b.m45399f(backState.m16958u(string));
                }
            } else {
                if (!(it instanceof C10303c.b.a)) {
                    throw new C7345l();
                }
                GovernmentIdState governmentIdState3 = (GovernmentIdState) c3591b.m45397d().m45411i();
                backState = governmentIdState3 != null ? governmentIdState3.getBackState() : null;
                C10303c.b.a aVar = (C10303c.b.a) it;
                if ((aVar.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar.getCause()).isRecoverable() && backState != null) {
                    String string2 = c3591b.applicationContext.getString(C12244g.f43217B);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    c3591b.m45399f(backState.m16958u(string2));
                } else {
                    c3591b.m45399f(GovernmentIdState.Submit.m17040J((GovernmentIdState.Submit) governmentIdState, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
                    c3591b.m45398e(new GovernmentIdWorkflow.AbstractC3503a.c(aVar.getCause()));
                }
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m17890y0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m17892z0(C3591b c3591b) {
        c3591b.m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m17893V0(GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return true;
        }
        if (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) {
            return this.videoCaptureHelper.m44496c(input) && input.getAutoClassificationConfig().getIsEnabled();
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return false;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: Z */
    public final void m17894Z() {
        m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final GovernmentIdState m17895a0(@NotNull GovernmentIdWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (!props.getAutoClassificationConfig().getIsEnabled()) {
            return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
        }
        if (props.m17190u()) {
            return new GovernmentIdState.ChooseCaptureMethod(new IdPart.SideIdPart(IdConfig.EnumC3514b.Front), C7699p.m31892k(), C7699p.m31892k(), 0, props.getCountryCode(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
        }
        return new GovernmentIdState.WaitForAutocapture(new IdPart.SideIdPart(IdConfig.EnumC3514b.Front), C7699p.m31892k(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == EnumC6852d.K0000 ? Screen.C3527b.a.Hidden : Screen.C3527b.a.Enabled, C7699p.m31892k(), 0, null, EnumC11917x.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, new Function0() { // from class: qo.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3591b.m17853b0(this.f38181a);
            }
        }, 11776, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17896c0() {
        GovernmentIdState governmentIdState = (GovernmentIdState) m45397d().m45411i();
        GovernmentIdState backState = governmentIdState != null ? governmentIdState.getBackState() : null;
        this.videoCaptureHelper.m44494a();
        if (backState != null) {
            backState.m16957G(true);
            m45399f(backState);
        } else if (m45395b().getValue().getBackStepEnabled()) {
            m45398e(GovernmentIdWorkflow.AbstractC3503a.a.f13790a);
        } else {
            m45398e(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final Object m17897d0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Screen screenM17900g0 = m17900g0(input, governmentIdState);
        if (!m17893V0(governmentIdState, input)) {
            m45397d().m45414m("close_camera", new e(null));
        }
        if (!this.videoCaptureHelper.m44499f(input) && C7259g.m30271e(this.applicationContext)) {
            m45397d().m45414m("output_webrtc_error", new f(null));
        }
        Object objM32684g = C7872i.m32684g(C7864g1.m32645c(), new g(screenM17900g0, null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m17898e0() {
        this.videoCaptureHelper.m44494a();
        this.cameraStatsManager.mo33441a();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m17899f0(@NotNull File file, @NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        WorkflowState workflowStateM45411i = m45397d().m45411i();
        GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateM45411i instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) workflowStateM45411i : null;
        if (finalizeLocalVideoCapture == null) {
            return;
        }
        GovernmentIdWorkflow.Input value = m45395b().getValue();
        TrackingEventsLogger.logVideoStopEvent$default(this.trackingEventsLogger, value.getFromStep(), "Upload", null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        List<GovernmentId> listMo16956E = finalizeLocalVideoCapture.mo16956E();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16956E, 10));
        Iterator<T> it = listMo16956E.iterator();
        while (it.hasNext()) {
            arrayList.add(((GovernmentId) it.next()).getSide());
        }
        GovernmentId.EnumC3486b enumC3486b = GovernmentId.EnumC3486b.FRONT;
        boolean zContains = arrayList.contains(enumC3486b);
        GovernmentId.EnumC3486b enumC3486b2 = GovernmentId.EnumC3486b.BACK;
        boolean zContains2 = arrayList.contains(enumC3486b2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List listM31878d = C7697o.m31878d(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            enumC3486b = GovernmentId.EnumC3486b.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            enumC3486b = enumC3486b2;
        }
        C10643e.m40748s(finalizeLocalVideoCapture, m45397d(), value, new GovernmentId.GovernmentIdVideo(listM31878d, enumC3486b, finalizeLocalVideoCapture.getId().getIdClassKey(), GovernmentId.EnumC3485a.f13532b), finalizeLocalVideoCapture.getId(), this.videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    /* JADX INFO: renamed from: g0 */
    public final Screen m17900g0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState) {
        InterfaceC10314h takePhoto;
        final GovernmentIdWorkflow.Input input;
        boolean z10;
        int i10;
        InterfaceC6567c<? extends GovernmentIdState> interfaceC6567cM32002b = C7731d0.m32002b(renderState.getClass());
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit), false, 8, null);
        boolean z11 = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z11) {
            takePhoto = InterfaceC10314h.a.f37118a;
        } else if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = InterfaceC10314h.b.f37119a;
        } else if (renderState instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = InterfaceC10314h.h.f37125a;
        } else if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new InterfaceC10314h.Prompt(((GovernmentIdState.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof GovernmentIdState.WaitForAutocapture) || (renderState instanceof GovernmentIdState.CountdownToCapture) || (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (renderState instanceof GovernmentIdState.FinalizeWebRtc) || (renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            takePhoto = new InterfaceC10314h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new InterfaceC10314h.Check(((GovernmentIdState.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new InterfaceC10314h.CheckUpload(((GovernmentIdState.ReviewSelectedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.Submit) {
            takePhoto = InterfaceC10314h.e.f37122a;
        } else {
            if (!(renderState instanceof GovernmentIdState.RestartStep)) {
                throw new C7345l();
            }
            takePhoto = InterfaceC10314h.g.f37124a;
        }
        this.externalEventLogger.m39607c(new AbstractC10315i.c(renderProps.getFromStep(), takePhoto));
        RemoteImage idFrontPictograph = null;
        if (!Intrinsics.m31980c(this.previousStateClass, interfaceC6567cM32002b)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.EnumC3514b enumC3514bM17611Q = C3555n.m17611Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, enumC3514bM17611Q != null ? C3555n.m17628d0(enumC3514bM17611Q) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = interfaceC6567cM32002b;
        }
        EnumC12529l enumC12529l = renderState.getDidGoBack() ? EnumC12529l.SLIDE_OUT : EnumC12529l.SLIDE_IN;
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            m45397d().m45414m("check_if_single_id_class", new k(renderProps, renderState, this, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> listM40742m = C10643e.m40742m(renderProps);
            m mVar = new m(renderState, this, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            return new Screen.C3530e(title, prompt, choose, instructionsDisclaimer, listM40742m, this.navigationStateManager.m44528b(), mVar, renderProps.getStyles(), selectPage, renderProps.getIsEnabled(), new Function0() { // from class: qo.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17828K0(this.f38115a);
                }
            }, new Function0() { // from class: qo.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17834N0(this.f38180a);
                }
            }, ((GovernmentIdState.ShowInstructions) renderState).getError(), new Function0() { // from class: qo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17836O0(this.f38147a, renderState);
                }
            }, this.themeManager.m20413a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
            final IdPart.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                m45397d().m45415n(this.documentSelectWorker, new Function1() { // from class: qo.l0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3591b.m17838P0(this.f38159a, renderState, currentPart, (C3544e.a) obj);
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> listM17183n = renderProps.m17183n();
            String strM40739j = C10643e.m40739j(renderProps.getStrings(), currentPart.getSide(), C3540c.m17508b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String strM40738i = C10643e.m40738i(renderProps.getStrings(), currentPart.getSide(), C3540c.m17508b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
            Function0 function0 = new Function0() { // from class: qo.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17840Q0(this.f38165a, renderState, renderProps);
                }
            };
            Function0 function1 = new Function0() { // from class: qo.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17856h0(this.f38168a, renderState);
                }
            };
            Function0 function2 = new Function0() { // from class: qo.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17858i0(this.f38170a);
                }
            };
            Function0 function3 = new Function0() { // from class: qo.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17860j0(this.f38173a);
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function4 = new Function0() { // from class: qo.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17862k0(this.f38175a, renderState);
                }
            };
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            IdConfig.EnumC3514b side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = d.f14256a;
            int i11 = iArr[side.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new C7345l();
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                        }
                    }
                } else if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdBackPictograph();
                }
            } else if (C3540c.m17507a(chooseCaptureMethod.getCaptureConfig()) == EnumC10302b.Passport) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                }
            } else if (promptPage != null) {
                idFrontPictograph = promptPage.getIdFrontPictograph();
            }
            RemoteImage remoteImage = idFrontPictograph;
            int i12 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            if (i12 != 1) {
                i10 = (i12 == 2 || i12 == 4) ? C6903p2.f27129d : C6903p2.f27130e;
            } else {
                i10 = C3540c.m17507a(chooseCaptureMethod.getCaptureConfig()) == EnumC10302b.Passport ? C6903p2.f27131f : C6903p2.f27130e;
            }
            int i13 = i10;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.C3528c(listM17183n, strM40739j, strM40738i, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, navigationStateM44528b, function0, function1, function2, function3, error, function4, styles, remoteImage, i13, requestPageNavBarTitle, enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
            return this.captureRenderer.m41649Q(this.applicationContext, renderProps, (GovernmentIdState.WaitForAutocapture) renderState, m45397d(), this.videoCaptureHelper, new h(), new Function1() { // from class: qo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17864l0(this.f38179a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            }, enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.CountdownToCapture) {
            return this.captureRenderer.m41647E(renderProps, (GovernmentIdState.CountdownToCapture) renderState, m45397d(), this.videoCaptureHelper, new i(), new Function1() { // from class: qo.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17866m0(this.f38163a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            }, enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, C3555n.m17628d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.m31706d0(reviewCapturedImage.getIdForReview().mo16936d3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                z10 = true;
                C10643e.m40751v(renderProps, (GovernmentIdState.ReviewImageState) renderState, m45397d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new j(this));
                input = renderProps;
            } else {
                input = renderProps;
                z10 = true;
            }
            return new Screen.C3533h(this.imageLoader, C10643e.m40740k(input.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), C3540c.m17508b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), input.getStrings().getCaptureDisclaimer(), idSideConfigM17510d.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), C3540c.m17507a(captureConfig), this.navigationStateManager.m44528b(), new Function0() { // from class: qo.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17868n0(input, renderState, this);
                }
            }, input.getStrings().getButtonSubmit(), new Function0() { // from class: qo.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17870o0(this.f38192a, renderState, input, captureConfig);
                }
            }, input.getStrings().getButtonRetake(), C10643e.m40741l(input.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), C3540c.m17508b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: qo.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17874q0(this.f38197a);
                }
            }, input.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: qo.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17876r0(this.f38199a, renderState);
                }
            }, input.getAssetConfig().getCapturePage(), (!input.getIsEnabled() || reviewCapturedImage.getSubmittingForAutoClassification()) ? false : z10, reviewCapturedImage.getSubmittingForAutoClassification(), input.getReviewCaptureButtonsAxis(), input.getDesignVersion(), (this.videoCaptureHelper.m44496c(input) && input.getAutoClassificationConfig().getIsEnabled()) ? z10 : false, input.getStrings().getCheckPageNavBarTitle(), enumC12529l);
        }
        final GovernmentIdWorkflow.Input input2 = renderProps;
        if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, C3555n.m17628d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            IdPart.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
            if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                C10643e.m40751v(renderProps, (GovernmentIdState.ReviewImageState) renderState, m45397d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new l(this));
                input2 = renderProps;
            }
            InterfaceC7479s interfaceC7479s = this.imageLoader;
            String strM40744o = C10643e.m40744o(input2.getStrings(), currentPart2.getSide());
            String strM40743n = C10643e.m40743n(input2.getStrings(), currentPart2.getSide());
            String reviewSelectedImageConfirmButton = input2.getStrings().getReviewSelectedImageConfirmButton();
            String reviewSelectedImageChooseAnotherButton = input2.getStrings().getReviewSelectedImageChooseAnotherButton();
            String absoluteFilePath = ((Frame) CollectionsKt.m31706d0(reviewSelectedImage.getIdForReview().mo16936d3())).getAbsoluteFilePath();
            String mimeType = ((Frame) CollectionsKt.m31706d0(reviewSelectedImage.getIdForReview().mo16936d3())).getMimeType();
            String fileName = reviewSelectedImage.getFileName();
            NavigationState navigationStateM44528b2 = this.navigationStateManager.m44528b();
            String error2 = reviewSelectedImage.getError();
            boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
            StepStyles.GovernmentIdStepStyle styles2 = input2.getStyles();
            String reviewUploadPageNavBarTitle = input2.getStrings().getReviewUploadPageNavBarTitle();
            if (reviewUploadPageNavBarTitle == null) {
                reviewUploadPageNavBarTitle = input2.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.C3534i(interfaceC7479s, strM40744o, strM40743n, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, navigationStateM44528b2, new Function0() { // from class: qo.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17878s0(input2, renderState, this);
                }
            }, new Function0() { // from class: qo.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17880t0(this.f38116a);
                }
            }, new Function0() { // from class: qo.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17882u0(this.f38123a);
                }
            }, new Function0() { // from class: qo.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17884v0(this.f38174a);
                }
            }, error2, new Function0() { // from class: qo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17886w0(this.f38177a, renderState);
                }
            }, styles2, submittingForAutoClassification, reviewUploadPageNavBarTitle, enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.Submit) {
            GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
            if (!submit.getHasSubmitted()) {
                m45397d().m45415n(this.submitVerificationWorkerFactory.mo39594a(input2.getSessionToken(), input2.getInquiryId(), input2.getFromComponent(), input2.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), new Function1() { // from class: qo.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3591b.m17888x0(this.f38182a, renderState, (C10303c.b) obj);
                    }
                });
            }
            C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = input2.getCustomPendingPage();
            return customPendingPage != null ? new Screen.C3531f(C1147b.m6492a(customPendingPage), this.navigationStateManager.m44528b(), input2.getStyles(), new Function0() { // from class: qo.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17890y0(this.f38185a);
                }
            }, new Function0() { // from class: qo.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17892z0(this.f38187a);
                }
            }, input2.getStrings().getPendingPageNavBarTitle(), false, enumC12529l, 64, null) : new Screen.C3535j(input2.getStrings().getProcessingTitle(), input2.getStrings().getProcessingDescription(), input2.getStyles(), input2.getAssetConfig().getPendingPage(), this.navigationStateManager.m44528b(), new Function0() { // from class: qo.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17808A0(this.f38191a);
                }
            }, new Function0() { // from class: qo.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17810B0(this.f38196a);
                }
            }, input2.getPendingPageTextVerticalPosition(), false, input2.getStrings().getPendingPageNavBarTitle(), enumC12529l, 256, null);
        }
        if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
            if (!input2.getAutoClassificationConfig().getIsEnabled()) {
                return this.localVideoCaptureRenderer.m41671i(input2, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, m45397d(), this.videoCaptureHelper, new Function1() { // from class: qo.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3591b.m17820G0(this.f38143a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                    }
                }, enumC12529l);
            }
            C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage2 = input2.getCustomPendingPage();
            return customPendingPage2 != null ? new Screen.C3531f(C1147b.m6492a(customPendingPage2), this.navigationStateManager.m44528b(), input2.getStyles(), new Function0() { // from class: qo.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17812C0(this.f38198a);
                }
            }, new Function0() { // from class: qo.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17814D0(this.f38109a);
                }
            }, input2.getStrings().getPendingPageNavBarTitle(), true, enumC12529l) : new Screen.C3535j(input2.getStrings().getProcessingTitle(), input2.getStrings().getProcessingDescription(), input2.getStyles(), input2.getAssetConfig().getPendingPage(), this.navigationStateManager.m44528b(), new Function0() { // from class: qo.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17816E0(this.f38122a);
                }
            }, new Function0() { // from class: qo.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3591b.m17818F0(this.f38127a);
                }
            }, input2.getPendingPageTextVerticalPosition(), true, input2.getStrings().getPendingPageNavBarTitle(), enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
            return renderProps.getAutoClassificationConfig().getIsEnabled() ? this.webRtcRenderer.m41584u(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, m45397d(), this.videoCaptureHelper, new Function1() { // from class: qo.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17822H0(this.f38152a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            }, enumC12529l) : this.webRtcRenderer.m41583m(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, m45397d(), this.videoCaptureHelper, new Function1() { // from class: qo.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17824I0(this.f38154a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            }, enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.HolographicTorchDelay) {
            return this.captureRenderer.m41648M(renderProps, (GovernmentIdState.HolographicTorchDelay) renderState, m45397d(), this.videoCaptureHelper, new Function1() { // from class: qo.i0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17826J0(this.f38156a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            });
        }
        if (z11) {
            return this.autoClassificationRenderer.m41555i(renderProps, (GovernmentIdState.AutoClassificationError) renderState, m45397d(), this.videoCaptureHelper, new Function1() { // from class: qo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17830L0(this.f38157a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            }, enumC12529l);
        }
        if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            return this.autoClassificationRenderer.m41556m(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, m45397d(), this.videoCaptureHelper, new Function1() { // from class: qo.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3591b.m17832M0(this.f38158a, (GovernmentIdWorkflow.AbstractC3503a) obj);
                }
            }, enumC12529l);
        }
        if (!(renderState instanceof GovernmentIdState.RestartStep)) {
            throw new C7345l();
        }
        m45397d().m45414m("restart_step", new n(m17895a0(renderProps), null));
        return new Screen.C3532g(null, 1, null);
    }
}
