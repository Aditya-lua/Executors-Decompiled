package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import androidx.p000lifecycle.l0;
import com.appsflyer.R;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
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
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import go.p2;
import gt.o;
import iu.g1;
import iu.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import lu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import po.j1;
import po.m0;
import po.v0;
import so.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001fB\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00101J\u001b\u00104\u001a\u000203*\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020+¢\u0006\u0004\b?\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lk6/s;", "imageLoader", "Lno/c$a;", "submitVerificationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "documentSelectWorker", "Lpo/v0;", "localVideoCaptureRenderer", "Lpo/j1;", "webRtcRenderer", "Lpo/m0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lpo/i;", "autoClassificationRenderer", "Ljn/a;", "cameraStatsManager", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "themeManager", "Liu/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lk6/s;Lno/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Lpo/v0;Lpo/j1;Lpo/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lpo/i;Ljn/a;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Liu/p0;)V", "renderProps", "renderState", "", "d0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Llt/b;)Ljava/lang/Object;", "g0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "c0", "()V", "Z", "", "V0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "props", "a0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "f0", "(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "e0", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lk6/s;", "h", "Lno/c$a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "j", "Lpo/v0;", "k", "Lpo/j1;", "l", "Lpo/m0;", "m", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "n", "Lpo/i;", "o", "Ljn/a;", "p", "Lsq/a;", "q", "Lnq/c;", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "Lso/l;", "t", "Lso/l;", "videoCaptureHelper", "Lfu/c;", "u", "Lfu/c;", "previousStateClass", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends tr.c<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.a, Screen> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.c.a submitVerificationWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.e documentSelectWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v0 localVideoCaptureRenderer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j1 webRtcRenderer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m0 captureRenderer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.b autoClassifyWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.i autoClassificationRenderer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.l videoCaptureHelper;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public fu.c<? extends GovernmentIdState> previousStateClass;

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$1$1", f = "GovernmentIdStepStateManager.kt", l = {119}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11124t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11126v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GovernmentIdState governmentIdState, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f11126v = governmentIdState;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return b.this.new a(this.f11126v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11124t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.this;
                GovernmentIdWorkflow.Input value = bVar.b().getValue();
                GovernmentIdState governmentIdState = this.f11126v;
                this.f11124t = 1;
                if (bVar.d0(value, governmentIdState, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$b, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$2", f = "GovernmentIdStepStateManager.kt", l = {123}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0204b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11127t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f11129a;

            public a(b bVar) {
                this.f11129a = bVar;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(GovernmentIdWorkflow.Input input, lt.b<? super Unit> bVar) {
                Object objD0;
                b bVar2 = this.f11129a;
                GovernmentIdState governmentIdState = (GovernmentIdState) bVar2.d().i();
                return (governmentIdState != null && (objD0 = bVar2.d0(input, governmentIdState, bVar)) == mt.c.e()) ? objD0 : Unit.f22938a;
            }
        }

        public C0204b(lt.b<? super C0204b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return b.this.new C0204b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((C0204b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11127t;
            if (i10 == 0) {
                o.b(obj);
                c0<GovernmentIdWorkflow.Input> c0VarB = b.this.b();
                a aVar = new a(b.this);
                this.f11127t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        b a(@NotNull GovernmentIdWorkflow.Input initialProps, @NotNull l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11130a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.b.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.b.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.b.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11130a = iArr;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$2", f = "GovernmentIdStepStateManager.kt", l = {223}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11131t;

        public e(lt.b<? super e> bVar) {
            super(1, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return b.this.new e(bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11131t;
            if (i10 == 0) {
                o.b(obj);
                dn.j jVar = dn.j.f15111a;
                Context context = b.this.applicationContext;
                this.f11131t = 1;
                if (jVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            b.this.videoCaptureHelper.a();
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$3", f = "GovernmentIdStepStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11133t;

        public f(lt.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return b.this.new f(bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f11133t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            b.this.e(new GovernmentIdWorkflow.a.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$4", f = "GovernmentIdStepStateManager.kt", l = {241}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11135t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen f11137v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Screen screen, lt.b<? super g> bVar) {
            super(2, bVar);
            this.f11137v = screen;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return b.this.new g(this.f11137v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11135t;
            if (i10 == 0) {
                o.b(obj);
                c0<Screen> c0VarC = b.this.c();
                Screen screen = this.f11137v;
                this.f11135t = 1;
                if (c0VarC.emit(screen, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h implements wm.h, kotlin.jvm.internal.h {
        public h() {
        }

        @Override // kotlin.jvm.internal.h
        public final gt.b<?> b() {
            return new kotlin.jvm.internal.k(1, b.this, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        @Override // wm.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(GovernmentIdWorkflow.a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            b.this.e(p8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wm.h) && (obj instanceof kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class i implements wm.h, kotlin.jvm.internal.h {
        public i() {
        }

        @Override // kotlin.jvm.internal.h
        public final gt.b<?> b() {
            return new kotlin.jvm.internal.k(1, b.this, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        @Override // wm.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(GovernmentIdWorkflow.a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            b.this.e(p8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wm.h) && (obj instanceof kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class j extends kotlin.jvm.internal.k implements Function1<GovernmentIdWorkflow.a, Unit> {
        public j(Object obj) {
            super(1, obj, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(GovernmentIdWorkflow.a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((b) this.receiver).e(p8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GovernmentIdWorkflow.a aVar) {
            d(aVar);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$1", f = "GovernmentIdStepStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11140t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f11141u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11142v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b f11143w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, b bVar, lt.b<? super k> bVar2) {
            super(1, bVar2);
            this.f11141u = input;
            this.f11142v = governmentIdState;
            this.f11143w = bVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new k(this.f11141u, this.f11142v, this.f11143w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f11140t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (this.f11141u.o().size() == 1) {
                GovernmentIdState governmentIdState = this.f11142v;
                b bVar = this.f11143w;
                GovernmentIdWorkflow.Input input = this.f11141u;
                b.T0(governmentIdState, bVar, input, (IdConfig) CollectionsKt.d0(input.o()), false);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class l extends kotlin.jvm.internal.k implements Function1<GovernmentIdWorkflow.a, Unit> {
        public l(Object obj) {
            super(1, obj, b.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(GovernmentIdWorkflow.a p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((b) this.receiver).e(p8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GovernmentIdWorkflow.a aVar) {
            d(aVar);
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class m extends kotlin.jvm.internal.a implements Function1<IdConfig, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11144h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b f11145i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdWorkflow.Input f11146j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(GovernmentIdState governmentIdState, b bVar, GovernmentIdWorkflow.Input input) {
            super(1, Intrinsics.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepStateManager;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f11144h = governmentIdState;
            this.f11145i = bVar;
            this.f11146j = input;
        }

        public final void a(IdConfig p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            b.U0(this.f11144h, this.f11145i, this.f11146j, p8, false, 16, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            a(idConfig);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$42", f = "GovernmentIdStepStateManager.kt", l = {899}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class n extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11147t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdState f11149v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(GovernmentIdState governmentIdState, lt.b<? super n> bVar) {
            super(1, bVar);
            this.f11149v = governmentIdState;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return b.this.new n(this.f11149v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11147t;
            if (i10 == 0) {
                o.b(obj);
                dn.j jVar = dn.j.f15111a;
                Context context = b.this.applicationContext;
                this.f11147t = 1;
                if (jVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            b.this.videoCaptureHelper.a();
            b.this.d().p(this.f11149v);
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull GovernmentIdWorkflow.Input initialProps, @NotNull l0 savedStateHandle, @NotNull Context applicationContext, @NotNull s imageLoader, @NotNull no.c.a submitVerificationWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.governmentid.e documentSelectWorker, @NotNull v0 localVideoCaptureRenderer, @NotNull j1 webRtcRenderer, @NotNull m0 captureRenderer, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull po.i autoClassificationRenderer, @NotNull jn.a cameraStatsManager, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.shared.inquiryTheme.a themeManager, @NotNull final p0 coroutineScope) {
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
        this.videoCaptureHelper = new so.l(null, 1, null);
        if (d().i() == null) {
            f(a0(b().getValue()));
        }
        d().o(new Function1() { // from class: oo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.T(coroutineScope, this, (GovernmentIdState) obj);
            }
        });
        iu.k.d(coroutineScope, g1.d(), null, new C0204b(null), 2, null);
    }

    public static final Unit A0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit B0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit C0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit D0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit E0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit F0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit G0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit H0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit I0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit J0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit K0(b bVar) {
        bVar.c0();
        return Unit.f22938a;
    }

    public static final Unit L0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit M0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit N0(b bVar) {
        bVar.Z();
        return Unit.f22938a;
    }

    public static final Unit O0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ShowInstructions.J((GovernmentIdState.ShowInstructions) governmentIdState, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f22938a;
    }

    public static final Unit P0(b bVar, GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, com.withpersona.sdk2.inquiry.governmentid.e.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.governmentid.e.a.c) {
            com.withpersona.sdk2.inquiry.governmentid.e.a.c cVar = (com.withpersona.sdk2.inquiry.governmentid.e.a.c) it;
            S0(sideIdPart, governmentIdState, bVar, cVar.getAbsoluteFilePath(), cVar.getFileName());
        } else if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.governmentid.e.a.C0198a.f10966a)) {
            bVar.f(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 447, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.governmentid.e.a.b)) {
                throw new gt.l();
            }
            bVar.e(new GovernmentIdWorkflow.a.c(((com.withpersona.sdk2.inquiry.governmentid.e.a.b) it).getCause()));
        }
        return Unit.f22938a;
    }

    public static final Unit Q0(final b bVar, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input) {
        WorkflowState workflowStateI = bVar.d().i();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = workflowStateI instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) workflowStateI : null;
        if (chooseCaptureMethod == null) {
            return Unit.f22938a;
        }
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        bVar.f(new GovernmentIdState.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.E(), chooseCaptureMethod2.getCaptureConfig(), com.withpersona.sdk2.inquiry.governmentid.n.O(input, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.D(), chooseCaptureMethod.getPartIndex(), oo.e.e(bVar.d(), false), x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: oo.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.R0(this.f28112a);
            }
        }, 11776, null));
        return Unit.f22938a;
    }

    public static final Unit R0(b bVar) {
        WorkflowState workflowStateI = bVar.d().i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture != null) {
            bVar.f(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, bVar.videoCaptureHelper.d() ? x.Connected : x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22938a;
    }

    public static final void S0(IdPart.SideIdPart sideIdPart, GovernmentIdState governmentIdState, b bVar, String str, String str2) {
        List listD = kotlin.collections.o.d(new Frame(str, null, 2, null));
        GovernmentId.b bVarE0 = com.withpersona.sdk2.inquiry.governmentid.n.e0(sideIdPart.getSide());
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
        GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(listD, bVarE0, com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), GovernmentId.a.f10531c, null, null, 32, null);
        WorkflowState workflowStateI = bVar.d().i();
        GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = workflowStateI instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) workflowStateI : null;
        if (chooseCaptureMethod2 == null) {
            return;
        }
        bVar.f(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod.getCurrentPart(), chooseCaptureMethod.E(), chooseCaptureMethod.getCaptureConfig(), governmentIdImage, str2, chooseCaptureMethod2.D(), chooseCaptureMethod2.getPartIndex(), oo.e.e(bVar.d(), false), null, null, false, chooseCaptureMethod.getCountryCode(), 1792, null));
    }

    public static final Unit T(p0 p0Var, b bVar, GovernmentIdState governmentIdState) {
        if (governmentIdState == null) {
            return Unit.f22938a;
        }
        iu.k.d(p0Var, g1.d(), null, bVar.new a(governmentIdState, null), 2, null);
        return Unit.f22938a;
    }

    public static final void T0(GovernmentIdState governmentIdState, b bVar, GovernmentIdWorkflow.Input input, IdConfig idConfig, boolean z10) {
        oo.e.s((GovernmentIdState.ShowInstructions) governmentIdState, bVar.d(), input, null, idConfig, bVar.videoCaptureHelper, new CameraProperties(null, null, null, 0, 0, 31, null), z10, idConfig.f(), 0, null, null, 3584, null);
    }

    public static /* synthetic */ void U0(GovernmentIdState governmentIdState, b bVar, GovernmentIdWorkflow.Input input, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        T0(governmentIdState, bVar, input, idConfig, z10);
    }

    public static final Unit b0(b bVar) {
        WorkflowState workflowStateI = bVar.d().i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture != null) {
            bVar.f(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, bVar.videoCaptureHelper.d() ? x.Connected : x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22938a;
    }

    public static final Unit h0(b bVar, GovernmentIdState governmentIdState) {
        bVar.documentSelectWorker.g();
        bVar.f(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f22938a;
    }

    public static final Unit i0(b bVar) {
        bVar.c0();
        return Unit.f22938a;
    }

    public static final Unit j0(b bVar) {
        bVar.Z();
        return Unit.f22938a;
    }

    public static final Unit k0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ChooseCaptureMethod.J((GovernmentIdState.ChooseCaptureMethod) governmentIdState, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f22938a;
    }

    public static final Unit l0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit m0(b bVar, GovernmentIdWorkflow.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.e(it);
        return Unit.f22938a;
    }

    public static final Unit n0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, b bVar) {
        oo.e.u(input, (GovernmentIdState.ReviewImageState) governmentIdState, bVar.d(), bVar.videoCaptureHelper, bVar.trackingEventsLogger);
        return Unit.f22938a;
    }

    public static final Unit o0(final b bVar, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, CaptureConfig captureConfig) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(bVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        GovernmentIdState governmentIdState2 = (GovernmentIdState) bVar.d().i();
        if (governmentIdState2 != null) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
            GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), governmentIdState2.E(), captureConfig, com.withpersona.sdk2.inquiry.governmentid.n.O(input, reviewCapturedImage.getCurrentPart().getSide()), governmentIdState2.D(), governmentIdState2.getPartIndex(), oo.e.e(bVar.d(), false), bVar.videoCaptureHelper.d() ? x.Connected : x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: oo.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.p0(this.f28110a);
                }
            }, 11776, null);
            waitForAutocapture.G(true);
            bVar.f(waitForAutocapture);
        }
        return Unit.f22938a;
    }

    public static final Unit p0(b bVar) {
        WorkflowState workflowStateI = bVar.d().i();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = workflowStateI instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) workflowStateI : null;
        if (waitForAutocapture != null) {
            bVar.f(GovernmentIdState.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, bVar.videoCaptureHelper.d() ? x.Connected : x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f22938a;
    }

    public static final Unit q0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit r0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ReviewCapturedImage.O((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f22938a;
    }

    public static final Unit s0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, b bVar) {
        oo.e.u(input, (GovernmentIdState.ReviewImageState) governmentIdState, bVar.d(), bVar.videoCaptureHelper, bVar.trackingEventsLogger);
        return Unit.f22938a;
    }

    public static final Unit t0(b bVar) {
        bVar.c0();
        return Unit.f22938a;
    }

    public static final Unit u0(b bVar) {
        bVar.c0();
        return Unit.f22938a;
    }

    public static final Unit v0(b bVar) {
        bVar.Z();
        return Unit.f22938a;
    }

    public static final Unit w0(b bVar, GovernmentIdState governmentIdState) {
        bVar.f(GovernmentIdState.ReviewSelectedImage.O((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f22938a;
    }

    public static final Unit x0(b bVar, GovernmentIdState governmentIdState, no.c.b it) {
        GovernmentIdState backState;
        String string;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof no.c.b.C0469c) {
            bVar.f(GovernmentIdState.Submit.J((GovernmentIdState.Submit) governmentIdState, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
            bVar.e(GovernmentIdWorkflow.a.d.f10744a);
        } else {
            if (it instanceof no.c.b.C0468b) {
                no.c.b.C0468b c0468b = (no.c.b.C0468b) it;
                if (c0468b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                    string = bVar.applicationContext.getString(tp.g.f32541t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c0468b.getCause()).getDetails().getMinDimensionSize()));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = bVar.applicationContext.getString(tp.g.f32542u);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                GovernmentIdState governmentIdState2 = (GovernmentIdState) bVar.d().i();
                backState = governmentIdState2 != null ? governmentIdState2.getBackState() : null;
                if (backState != null) {
                    bVar.f(backState.u(string));
                }
            } else {
                if (!(it instanceof no.c.b.a)) {
                    throw new gt.l();
                }
                GovernmentIdState governmentIdState3 = (GovernmentIdState) bVar.d().i();
                backState = governmentIdState3 != null ? governmentIdState3.getBackState() : null;
                no.c.b.a aVar = (no.c.b.a) it;
                if ((aVar.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar.getCause()).isRecoverable() && backState != null) {
                    String string2 = bVar.applicationContext.getString(tp.g.B);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    bVar.f(backState.u(string2));
                } else {
                    bVar.f(GovernmentIdState.Submit.J((GovernmentIdState.Submit) governmentIdState, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
                    bVar.e(new GovernmentIdWorkflow.a.c(aVar.getCause()));
                }
            }
        }
        return Unit.f22938a;
    }

    public static final Unit y0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public static final Unit z0(b bVar) {
        bVar.e(GovernmentIdWorkflow.a.b.f10742a);
        return Unit.f22938a;
    }

    public final boolean V0(GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input) {
        if ((governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            return true;
        }
        if (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) {
            return this.videoCaptureHelper.c(input) && input.getAutoClassificationConfig().getIsEnabled();
        }
        if ((governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) || (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) || (governmentIdState instanceof GovernmentIdState.ShowInstructions) || (governmentIdState instanceof GovernmentIdState.Submit) || (governmentIdState instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) || (governmentIdState instanceof GovernmentIdState.RestartStep)) {
            return false;
        }
        throw new gt.l();
    }

    public final void Z() {
        e(GovernmentIdWorkflow.a.b.f10742a);
    }

    @NotNull
    public final GovernmentIdState a0(@NotNull GovernmentIdWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (!props.getAutoClassificationConfig().getIsEnabled()) {
            return new GovernmentIdState.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
        }
        if (props.u()) {
            return new GovernmentIdState.ChooseCaptureMethod(new IdPart.SideIdPart(IdConfig.b.Front), p.k(), p.k(), 0, props.getCountryCode(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
        }
        return new GovernmentIdState.WaitForAutocapture(new IdPart.SideIdPart(IdConfig.b.Front), p.k(), new CaptureConfig.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == go.d.K0000 ? Screen.b.a.Hidden : Screen.b.a.Enabled, p.k(), 0, null, x.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, new Function0() { // from class: oo.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.b0(this.f28108a);
            }
        }, 11776, null);
    }

    public final void c0() {
        GovernmentIdState governmentIdState = (GovernmentIdState) d().i();
        GovernmentIdState backState = governmentIdState != null ? governmentIdState.getBackState() : null;
        this.videoCaptureHelper.a();
        if (backState != null) {
            backState.G(true);
            f(backState);
        } else if (b().getValue().getBackStepEnabled()) {
            e(GovernmentIdWorkflow.a.C0195a.f10741a);
        } else {
            e(GovernmentIdWorkflow.a.b.f10742a);
        }
    }

    public final Object d0(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, lt.b<? super Unit> bVar) {
        Screen screenG0 = g0(input, governmentIdState);
        if (!V0(governmentIdState, input)) {
            d().m("close_camera", new e(null));
        }
        if (!this.videoCaptureHelper.f(input) && hq.g.e(this.applicationContext)) {
            d().m("output_webrtc_error", new f(null));
        }
        Object objG = iu.i.g(g1.c(), new g(screenG0, null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }

    public final void e0() {
        this.videoCaptureHelper.a();
        this.cameraStatsManager.a();
    }

    public final void f0(@NotNull File file, @NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        WorkflowState workflowStateI = d().i();
        GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = workflowStateI instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) workflowStateI : null;
        if (finalizeLocalVideoCapture == null) {
            return;
        }
        GovernmentIdWorkflow.Input value = b().getValue();
        TrackingEventsLogger.logVideoStopEvent$default(this.trackingEventsLogger, value.getFromStep(), "Upload", null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
        List<GovernmentId> listE = finalizeLocalVideoCapture.E();
        ArrayList arrayList = new ArrayList(q.u(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(((GovernmentId) it.next()).getSide());
        }
        GovernmentId.b bVar = GovernmentId.b.FRONT;
        boolean zContains = arrayList.contains(bVar);
        GovernmentId.b bVar2 = GovernmentId.b.BACK;
        boolean zContains2 = arrayList.contains(bVar2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List listD = kotlin.collections.o.d(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            bVar = GovernmentId.b.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            bVar = bVar2;
        }
        oo.e.s(finalizeLocalVideoCapture, d(), value, new GovernmentId.GovernmentIdVideo(listD, bVar, finalizeLocalVideoCapture.getId().getIdClassKey(), GovernmentId.a.b), finalizeLocalVideoCapture.getId(), this.videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    public final Screen g0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState) {
        nq.h takePhoto;
        final GovernmentIdWorkflow.Input input;
        boolean z10;
        int i10;
        fu.c<? extends GovernmentIdState> cVarB = d0.b(renderState.getClass());
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof GovernmentIdState.Submit), false, 8, null);
        boolean z11 = renderState instanceof GovernmentIdState.AutoClassificationError;
        if (z11) {
            takePhoto = nq.h.a.f27414a;
        } else if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = nq.h.b.f27415a;
        } else if (renderState instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = nq.h.C0473h.f27421a;
        } else if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new nq.h.Prompt(((GovernmentIdState.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof GovernmentIdState.WaitForAutocapture) || (renderState instanceof GovernmentIdState.CountdownToCapture) || (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (renderState instanceof GovernmentIdState.FinalizeWebRtc) || (renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            takePhoto = new nq.h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new nq.h.Check(((GovernmentIdState.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new nq.h.CheckUpload(((GovernmentIdState.ReviewSelectedImage) renderState).getPartIndex());
        } else if (renderState instanceof GovernmentIdState.Submit) {
            takePhoto = nq.h.e.f27418a;
        } else {
            if (!(renderState instanceof GovernmentIdState.RestartStep)) {
                throw new gt.l();
            }
            takePhoto = nq.h.g.f27420a;
        }
        this.externalEventLogger.c(new nq.i.c(renderProps.getFromStep(), takePhoto));
        RemoteImage idFrontPictograph = null;
        if (!Intrinsics.c(this.previousStateClass, cVarB)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.c(cVarB, d0.b(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.b bVarQ = com.withpersona.sdk2.inquiry.governmentid.n.Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, bVarQ != null ? com.withpersona.sdk2.inquiry.governmentid.n.d0(bVarQ) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = cVarB;
        }
        uq.l lVar = renderState.getDidGoBack() ? uq.l.SLIDE_OUT : uq.l.SLIDE_IN;
        if (renderState instanceof GovernmentIdState.ShowInstructions) {
            d().m("check_if_single_id_class", new k(renderProps, renderState, this, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> listM = oo.e.m(renderProps);
            m mVar = new m(renderState, this, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            return new Screen.e(title, prompt, choose, instructionsDisclaimer, listM, this.navigationStateManager.b(), mVar, renderProps.getStyles(), selectPage, renderProps.getIsEnabled(), new Function0() { // from class: oo.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.K0(this.f28054a);
                }
            }, new Function0() { // from class: oo.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.N0(this.f28107a);
                }
            }, ((GovernmentIdState.ShowInstructions) renderState).getError(), new Function0() { // from class: oo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.O0(this.f28082a, renderState);
                }
            }, this.themeManager.a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), lVar);
        }
        if (renderState instanceof GovernmentIdState.ChooseCaptureMethod) {
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) renderState;
            final IdPart.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                d().n(this.documentSelectWorker, new Function1() { // from class: oo.l0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.P0(this.f28092a, renderState, currentPart, (com.withpersona.sdk2.inquiry.governmentid.e.a) obj);
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> listN = renderProps.n();
            String strJ = oo.e.j(renderProps.getStrings(), currentPart.getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String strI = oo.e.i(renderProps.getStrings(), currentPart.getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            NavigationState navigationStateB = this.navigationStateManager.b();
            Function0 function0 = new Function0() { // from class: oo.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.Q0(this.f28097a, renderState, renderProps);
                }
            };
            Function0 function1 = new Function0() { // from class: oo.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.h0(this.f28099a, renderState);
                }
            };
            Function0 function2 = new Function0() { // from class: oo.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.i0(this.f28100a);
                }
            };
            Function0 function3 = new Function0() { // from class: oo.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.j0(this.f28102a);
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function4 = new Function0() { // from class: oo.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.k0(this.f28104a, renderState);
                }
            };
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            IdConfig.b side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = d.f11130a;
            int i11 = iArr[side.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new gt.l();
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
            } else if (com.withpersona.sdk2.inquiry.governmentid.c.a(chooseCaptureMethod.getCaptureConfig()) == no.b.Passport) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                }
            } else if (promptPage != null) {
                idFrontPictograph = promptPage.getIdFrontPictograph();
            }
            RemoteImage remoteImage = idFrontPictograph;
            int i12 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            if (i12 != 1) {
                i10 = (i12 == 2 || i12 == 4) ? p2.f18830d : p2.f18831e;
            } else {
                i10 = com.withpersona.sdk2.inquiry.governmentid.c.a(chooseCaptureMethod.getCaptureConfig()) == no.b.Passport ? p2.f18832f : p2.f18831e;
            }
            int i13 = i10;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.c(listN, strJ, strI, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, navigationStateB, function0, function1, function2, function3, error, function4, styles, remoteImage, i13, requestPageNavBarTitle, lVar);
        }
        if (renderState instanceof GovernmentIdState.WaitForAutocapture) {
            return this.captureRenderer.Q(this.applicationContext, renderProps, (GovernmentIdState.WaitForAutocapture) renderState, d(), this.videoCaptureHelper, new h(), new Function1() { // from class: oo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.l0(this.f28106a, (GovernmentIdWorkflow.a) obj);
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.CountdownToCapture) {
            return this.captureRenderer.E(renderProps, (GovernmentIdState.CountdownToCapture) renderState, d(), this.videoCaptureHelper, new i(), new Function1() { // from class: oo.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.m0(this.f28095a, (GovernmentIdWorkflow.a) obj);
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.ReviewCapturedImage) {
            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final CaptureConfig captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig idSideConfigD = com.withpersona.sdk2.inquiry.governmentid.c.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.d0(reviewCapturedImage.getIdForReview().f3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                z10 = true;
                oo.e.v(renderProps, (GovernmentIdState.ReviewImageState) renderState, d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new j(this));
                input = renderProps;
            } else {
                input = renderProps;
                z10 = true;
            }
            return new Screen.h(this.imageLoader, oo.e.k(input.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), input.getStrings().getCaptureDisclaimer(), idSideConfigD.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.a(captureConfig), this.navigationStateManager.b(), new Function0() { // from class: oo.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.n0(input, renderState, this);
                }
            }, input.getStrings().getButtonSubmit(), new Function0() { // from class: oo.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.o0(this.f28117a, renderState, input, captureConfig);
                }
            }, input.getStrings().getButtonRetake(), oo.e.l(input.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), com.withpersona.sdk2.inquiry.governmentid.c.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: oo.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.q0(this.f28121a);
                }
            }, input.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: oo.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.r0(this.f28123a, renderState);
                }
            }, input.getAssetConfig().getCapturePage(), (!input.getIsEnabled() || reviewCapturedImage.getSubmittingForAutoClassification()) ? false : z10, reviewCapturedImage.getSubmittingForAutoClassification(), input.getReviewCaptureButtonsAxis(), input.getDesignVersion(), (this.videoCaptureHelper.c(input) && input.getAutoClassificationConfig().getIsEnabled()) ? z10 : false, input.getStrings().getCheckPageNavBarTitle(), lVar);
        }
        final GovernmentIdWorkflow.Input input2 = renderProps;
        if (renderState instanceof GovernmentIdState.ReviewSelectedImage) {
            GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            IdPart.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
            if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                oo.e.v(renderProps, (GovernmentIdState.ReviewImageState) renderState, d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new l(this));
                input2 = renderProps;
            }
            s sVar = this.imageLoader;
            String strO = oo.e.o(input2.getStrings(), currentPart2.getSide());
            String strN = oo.e.n(input2.getStrings(), currentPart2.getSide());
            String reviewSelectedImageConfirmButton = input2.getStrings().getReviewSelectedImageConfirmButton();
            String reviewSelectedImageChooseAnotherButton = input2.getStrings().getReviewSelectedImageChooseAnotherButton();
            String absoluteFilePath = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().f3())).getAbsoluteFilePath();
            String mimeType = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().f3())).getMimeType();
            String fileName = reviewSelectedImage.getFileName();
            NavigationState navigationStateB2 = this.navigationStateManager.b();
            String error2 = reviewSelectedImage.getError();
            boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
            StepStyles.GovernmentIdStepStyle styles2 = input2.getStyles();
            String reviewUploadPageNavBarTitle = input2.getStrings().getReviewUploadPageNavBarTitle();
            if (reviewUploadPageNavBarTitle == null) {
                reviewUploadPageNavBarTitle = input2.getStrings().getCapturePageNavBarTitle();
            }
            return new Screen.i(sVar, strO, strN, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, navigationStateB2, new Function0() { // from class: oo.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.s0(input2, renderState, this);
                }
            }, new Function0() { // from class: oo.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.t0(this.f28055a);
                }
            }, new Function0() { // from class: oo.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.u0(this.f28061a);
                }
            }, new Function0() { // from class: oo.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.v0(this.f28103a);
                }
            }, error2, new Function0() { // from class: oo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.w0(this.f28105a, renderState);
                }
            }, styles2, submittingForAutoClassification, reviewUploadPageNavBarTitle, lVar);
        }
        if (renderState instanceof GovernmentIdState.Submit) {
            GovernmentIdState.Submit submit = (GovernmentIdState.Submit) renderState;
            if (!submit.getHasSubmitted()) {
                d().n(this.submitVerificationWorkerFactory.a(input2.getSessionToken(), input2.getInquiryId(), input2.getFromComponent(), input2.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), new Function1() { // from class: oo.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.x0(this.f28109a, renderState, (no.c.b) obj);
                    }
                });
            }
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = input2.getCustomPendingPage();
            return customPendingPage != null ? new Screen.f(yq.b.a(customPendingPage), this.navigationStateManager.b(), input2.getStyles(), new Function0() { // from class: oo.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.y0(this.f28111a);
                }
            }, new Function0() { // from class: oo.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.z0(this.f28113a);
                }
            }, input2.getStrings().getPendingPageNavBarTitle(), false, lVar, 64, null) : new Screen.j(input2.getStrings().getProcessingTitle(), input2.getStrings().getProcessingDescription(), input2.getStyles(), input2.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: oo.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.A0(this.f28116a);
                }
            }, new Function0() { // from class: oo.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.B0(this.f28120a);
                }
            }, input2.getPendingPageTextVerticalPosition(), false, input2.getStrings().getPendingPageNavBarTitle(), lVar, Barcode.FORMAT_QR_CODE, null);
        }
        if (renderState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
            if (!input2.getAutoClassificationConfig().getIsEnabled()) {
                return this.localVideoCaptureRenderer.i(input2, (GovernmentIdState.FinalizeLocalVideoCapture) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.G0(this.f28079a, (GovernmentIdWorkflow.a) obj);
                    }
                }, lVar);
            }
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage2 = input2.getCustomPendingPage();
            return customPendingPage2 != null ? new Screen.f(yq.b.a(customPendingPage2), this.navigationStateManager.b(), input2.getStyles(), new Function0() { // from class: oo.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.C0(this.f28122a);
                }
            }, new Function0() { // from class: oo.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.D0(this.f28050a);
                }
            }, input2.getStrings().getPendingPageNavBarTitle(), true, lVar) : new Screen.j(input2.getStrings().getProcessingTitle(), input2.getStrings().getProcessingDescription(), input2.getStyles(), input2.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: oo.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.E0(this.f28060a);
                }
            }, new Function0() { // from class: oo.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.F0(this.f28064a);
                }
            }, input2.getPendingPageTextVerticalPosition(), true, input2.getStrings().getPendingPageNavBarTitle(), lVar);
        }
        if (renderState instanceof GovernmentIdState.FinalizeWebRtc) {
            return renderProps.getAutoClassificationConfig().getIsEnabled() ? this.webRtcRenderer.u(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.H0(this.f28085a, (GovernmentIdWorkflow.a) obj);
                }
            }, lVar) : this.webRtcRenderer.m(renderProps, (GovernmentIdState.FinalizeWebRtc) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.I0(this.f28087a, (GovernmentIdWorkflow.a) obj);
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.HolographicTorchDelay) {
            return this.captureRenderer.M(renderProps, (GovernmentIdState.HolographicTorchDelay) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.i0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.J0(this.f28089a, (GovernmentIdWorkflow.a) obj);
                }
            });
        }
        if (z11) {
            return this.autoClassificationRenderer.i(renderProps, (GovernmentIdState.AutoClassificationError) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.L0(this.f28090a, (GovernmentIdWorkflow.a) obj);
                }
            }, lVar);
        }
        if (renderState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            return this.autoClassificationRenderer.m(renderProps, (GovernmentIdState.AutoClassificationManualSelect) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: oo.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.M0(this.f28091a, (GovernmentIdWorkflow.a) obj);
                }
            }, lVar);
        }
        if (!(renderState instanceof GovernmentIdState.RestartStep)) {
            throw new gt.l();
        }
        d().m("restart_step", new n(a0(renderProps), null));
        return new Screen.g(null, 1, null);
    }
}
