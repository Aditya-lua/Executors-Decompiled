package fp;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.os.Parcelable;
import android.util.Size;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import cp.GovernmentIdHintWorker;
import fq.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ls.TimerWorker;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import un.CameraChoices;
import vo.Frame;
import vo.GovernmentIdAnalyzeWorker;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J_\u0010,\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020+2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b,\u0010-JG\u0010/\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020.2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b/\u00100J7\u00103\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JM\u0010;\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u0002052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lfp/m0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lvo/o$a;", "governmentIdAnalyzeWorkerFactory", "Lcp/a$b;", "governmentIdHintWorkerFactory", "Ljs/b$a;", "webRtcWorkerFactory", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "Lir/b;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lhq/i$a;", "permissionRequestWorker", "<init>", "(Landroid/content/Context;Lvo/o$a;Lcp/a$b;Ljs/b$a;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhq/i$a;)V", "context", "Lvo/d2$a;", "renderProps", "Lvo/j0$n;", "renderState", "Lls/g;", "Lvo/j0;", "workflowContext", "Lip/l;", "videoCaptureHelper", "Lln/h;", "Lvo/d2$b;", "sink", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onOutput", "Lkr/l;", "transition", "Lvo/y3;", "Q", "(Landroid/content/Context;Lvo/d2$a;Lvo/j0$n;Lls/g;Lip/l;Lln/h;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;", "Lvo/j0$d;", "E", "(Lvo/d2$a;Lvo/j0$d;Lls/g;Lip/l;Lln/h;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;", "Lvo/j0$g;", "M", "(Lvo/d2$a;Lvo/j0$g;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;)Lvo/y3;", "Lks/a;", "webRtcManager", "c0", "(Lvo/d2$a;Lvo/j0$n;Lls/g;Lks/a;)V", "Lvo/f;", "captureConfig", "Lsn/v;", "cameraProperties", "Lvo/n$b;", "capturedId", "C", "(Lvo/d2$a;Lvo/j0;Lls/g;Lvo/f;Lip/l;Lsn/v;Lvo/n$b;)V", "a", "Landroid/content/Context;", "b", "Lvo/o$a;", "c", "Lcp/a$b;", "d", "Ljs/b$a;", "e", "Lsn/a0$a;", "f", "Lun/c$a;", "g", "Lir/b;", "h", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "i", "Lhq/i$a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final js.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.a0.a cameraXControllerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final un.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hq.i.a permissionRequestWorker;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16300a;

        static {
            int[] iArr = new int[s1.values().length];
            try {
                iArr[s1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s1.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s1.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16300a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$1", f = "GovIdCaptureRenderer.kt", l = {505}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16301t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ vo.j0.HolographicTorchDelay f16302u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ls.g<vo.j0> f16303v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vo.j0.HolographicTorchDelay holographicTorchDelay, ls.g<vo.j0> gVar, eu.b<? super b> bVar) {
            super(1, bVar);
            this.f16302u = holographicTorchDelay;
            this.f16303v = gVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new b(this.f16302u, this.f16303v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f16301t;
            if (i10 == 0) {
                zt.o.b(obj);
                p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                long jP = p001kotlin.time.b.p(this.f16302u.getTorchDurationMs(), zu.b.MILLISECONDS);
                this.f16301t = 1;
                if (av.z0.c(jP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            ls.h hVarI = this.f16303v.i();
            vo.j0.HolographicTorchDelay holographicTorchDelay = hVarI instanceof vo.j0.HolographicTorchDelay ? (vo.j0.HolographicTorchDelay) hVarI : null;
            if (holographicTorchDelay == null) {
                return Unit.f21506a;
            }
            this.f16303v.p(vo.j0.HolographicTorchDelay.H(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$renderHolographicTorchDelay$2", f = "GovIdCaptureRenderer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16304t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d2.a f16306v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ vo.j0.HolographicTorchDelay f16307w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ls.g<vo.j0> f16308x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ ip.l f16309y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d2.a aVar, vo.j0.HolographicTorchDelay holographicTorchDelay, ls.g<vo.j0> gVar, ip.l lVar, eu.b<? super c> bVar) {
            super(1, bVar);
            this.f16306v = aVar;
            this.f16307w = holographicTorchDelay;
            this.f16308x = gVar;
            this.f16309y = lVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return m0.this.new c(this.f16306v, this.f16307w, this.f16308x, this.f16309y, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f16304t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            m0 m0Var = m0.this;
            d2.a aVar = this.f16306v;
            vo.j0.HolographicTorchDelay holographicTorchDelay = this.f16307w;
            m0Var.C(aVar, holographicTorchDelay, this.f16308x, holographicTorchDelay.getCaptureConfig(), this.f16309y, this.f16307w.getCameraProperties(), this.f16307w.getCapturedImage());
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public m0(@NotNull Context applicationContext, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull js.b.a webRtcWorkerFactory, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull ir.b navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull hq.i.a permissionRequestWorker) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorker, "permissionRequestWorker");
        this.applicationContext = applicationContext;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker;
    }

    public static final Unit D(ls.g gVar, ip.l lVar) {
        ls.h hVarI = gVar.i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture != null) {
            gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit F(ls.g gVar, cp.d dVar) {
        ls.h hVarI = gVar.i();
        vo.j0.CountdownToCapture countdownToCapture = hVarI instanceof vo.j0.CountdownToCapture ? (vo.j0.CountdownToCapture) hVarI : null;
        if (countdownToCapture == null) {
            return Unit.f21506a;
        }
        gVar.p(vo.j0.CountdownToCapture.H(countdownToCapture, null, null, null, null, null, 0, null, null, dVar, 255, null));
        return Unit.f21506a;
    }

    public static final Unit G(ln.h hVar) {
        hVar.a(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit H(ls.g gVar, d2.a aVar, ip.l lVar, Function1 function1) {
        ep.e.p(gVar, aVar, lVar, function1);
        return Unit.f21506a;
    }

    public static final Unit I(vo.j0.CountdownToCapture countdownToCapture, m0 m0Var, d2.a aVar, ls.g gVar, ip.l lVar, List absolutePaths, sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> listJ3 = countdownToCapture.getIdForReview().j3();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listJ3, 10));
        Iterator<T> it = listJ3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List listW0 = CollectionsKt.w0(arrayList, absolutePaths);
        vo.f captureConfig = countdownToCapture.getCaptureConfig();
        vo.n.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = listW0;
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        m0Var.C(aVar, countdownToCapture, gVar, captureConfig, lVar, cameraProperties, vo.n.GovernmentIdImage.f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f21506a;
    }

    public static final Unit J(final ls.g gVar, vo.j0.CountdownToCapture countdownToCapture, d2.a aVar, final ip.l lVar, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ls.h hVarI = gVar.i();
        vo.j0.CountdownToCapture countdownToCapture2 = hVarI instanceof vo.j0.CountdownToCapture ? (vo.j0.CountdownToCapture) hVarI : null;
        if (countdownToCapture2 == null) {
            return Unit.f21506a;
        }
        gVar.p(new vo.j0.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.D(), countdownToCapture.getCaptureConfig(), b3.O(aVar, countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.C(), countdownToCapture2.getPartIndex(), ep.e.e(gVar, false), ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), error, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: fp.z
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m0.K(gVar, lVar);
            }
        }, 11264, null));
        return Unit.f21506a;
    }

    public static final Unit K(ls.g gVar, ip.l lVar) {
        ls.h hVarI = gVar.i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture != null) {
            gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, lVar.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit L(m0 m0Var, ls.g gVar, d2.a aVar, ip.l lVar) {
        ep.e.q(m0Var.applicationContext, gVar, aVar, lVar.c(aVar));
        return Unit.f21506a;
    }

    public static final Unit N(Function1 function1) {
        function1.invoke(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit O(ls.g gVar, d2.a aVar, ip.l lVar, Function1 function1) {
        ep.e.p(gVar, aVar, lVar, function1);
        return Unit.f21506a;
    }

    public static final Unit P(m0 m0Var, ls.g gVar, d2.a aVar) {
        ep.e.q(m0Var.applicationContext, gVar, aVar, true);
        return Unit.f21506a;
    }

    public static final Unit R(m0 m0Var, vo.j0.WaitForAutocapture waitForAutocapture, ls.g gVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(m0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, b3.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f21506a;
    }

    public static final Unit S(m0 m0Var, ls.g gVar, d2.a aVar, ip.l lVar) {
        ep.e.q(m0Var.applicationContext, gVar, aVar, lVar.c(aVar));
        return Unit.f21506a;
    }

    public static final Unit T(ls.g gVar, d2.a aVar, Function1 function1, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f16300a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            Parcelable parcelable = (vo.j0) gVar.i();
            if (parcelable != null && (parcelable instanceof vo.e)) {
                gVar.p(((vo.e) parcelable).r(false));
            }
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            ep.e.p(gVar, aVar, null, function1);
        }
        return Unit.f21506a;
    }

    public static final Unit U(ls.g gVar, d2.a aVar, Function1 function1, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f16300a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1 || i10 == 2) {
            Parcelable parcelable = (vo.j0) gVar.i();
            if (parcelable != null && (parcelable instanceof vo.b)) {
                gVar.p(((vo.b) parcelable).q(false));
            }
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            ep.e.p(gVar, aVar, null, function1);
        }
        return Unit.f21506a;
    }

    public static final Unit V(m0 m0Var, vo.j0.WaitForAutocapture waitForAutocapture, ls.g gVar, vo.f fVar, ln.h hVar, zt.n nVar) {
        List<vo.n> listK;
        Object value = nVar.getValue();
        Throwable thE = zt.n.e(value);
        if (thE == null) {
            vo.n.GovernmentIdImage governmentIdImage = (vo.n.GovernmentIdImage) value;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(m0Var.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, b3.d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            ls.h hVarI = gVar.i();
            vo.j0.WaitForAutocapture waitForAutocapture2 = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
            if (waitForAutocapture2 != null) {
                i3.SideIdPart currentPart = waitForAutocapture.getCurrentPart();
                vo.j0 j0Var = (vo.j0) gVar.i();
                if (j0Var == null || (listK = j0Var.D()) == null) {
                    listK = p001kotlin.collections.p.k();
                }
                gVar.p(new vo.j0.CountdownToCapture(currentPart, listK, fVar, governmentIdImage, waitForAutocapture2.C(), waitForAutocapture2.getPartIndex(), ep.e.e(gVar, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
            }
        } else {
            String message = thE.getMessage();
            if (message != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
                hVar.a(new d2.b.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            } else if (waitForAutocapture.getManualCapture() == y3.b.a.Hidden) {
                gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit W(ls.g gVar, cp.d dVar) {
        ls.h hVarI = gVar.i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture == null) {
            return Unit.f21506a;
        }
        gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, dVar, null, 24575, null));
        return Unit.f21506a;
    }

    public static final Unit X(vo.j0.WaitForAutocapture waitForAutocapture, ls.g gVar, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (waitForAutocapture.getManualCapture() == y3.b.a.Hidden) {
            gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f21506a;
    }

    public static final Unit Y(vo.j0.WaitForAutocapture waitForAutocapture, vo.f fVar, m0 m0Var, d2.a aVar, ls.g gVar, ip.l lVar, List absolutePaths, sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        m0Var.C(aVar, waitForAutocapture, gVar, waitForAutocapture.getCaptureConfig(), lVar, cameraProperties, new vo.n.GovernmentIdImage(arrayList, b3.e0(waitForAutocapture.getCurrentPart().getSide()), vo.g.b(fVar), vo.n.a.b, null, null, 32, null));
        return Unit.f21506a;
    }

    public static final Unit Z(ln.h hVar) {
        hVar.a(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit a0(ls.g gVar, d2.a aVar, ip.l lVar, Function1 function1) {
        ep.e.p(gVar, aVar, lVar, function1);
        return Unit.f21506a;
    }

    public static final Unit b0(ls.g gVar, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ls.h hVarI = gVar.i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture == null) {
            return Unit.f21506a;
        }
        gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, y3.b.a.Enabled, null, 0, null, null, null, error, false, false, null, null, null, 32247, null));
        return Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit d0(final m0 m0Var, final ls.g gVar, final ks.a aVar, final vo.j0.WaitForAutocapture waitForAutocapture, final d2.a aVar2, js.b.AbstractC0389b it) throws CameraAccessException {
        int i10;
        un.h0 primaryChoice;
        un.h0 primaryChoice2;
        un.h0 primaryChoice3;
        Size size;
        un.h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(it, "it");
        CameraChoices cameraChoicesB = un.f0.b(m0Var.applicationContext, un.m0.FRONT);
        if (it instanceof js.b.AbstractC0389b.C0390b) {
            Object objI = gVar.i();
            vo.j0.WaitForAutocapture waitForAutocapture2 = objI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) objI : null;
            if (waitForAutocapture2 != 0 && waitForAutocapture2.getWebRtcState() == ip.x.Connecting) {
                return Unit.f21506a;
            }
            if (waitForAutocapture2 != 0) {
                gVar.p(vo.j0.WaitForAutocapture.L(waitForAutocapture2, null, null, null, null, null, 0, null, ip.x.Connecting, null, null, false, false, null, null, null, 32639, null));
            }
            if (aVar != null) {
                aVar.b(m0Var.webRtcWorkerFactory.getService());
            }
            if (aVar != null) {
                aVar.i(m0Var.applicationContext);
            }
            int height = 0;
            int width = (cameraChoicesB == null || (primaryChoice4 = cameraChoicesB.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
            if (cameraChoicesB != null && (primaryChoice3 = cameraChoicesB.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
                height = size.getHeight();
            }
            if ((cameraChoicesB == null || (primaryChoice2 = cameraChoicesB.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoicesB == null || (primaryChoice = cameraChoicesB.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
                i10 = width;
            } else {
                i10 = height;
                height = width;
            }
            if (aVar != null) {
                js.b.AbstractC0389b.C0390b c0390b = (js.b.AbstractC0389b.C0390b) it;
                aVar.f(c0390b.getResult().getUsername(), c0390b.getResult().getCredential(), c0390b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i10, height, aVar2.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: fp.a0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.e0(this.f16225a, aVar2, waitForAutocapture);
                    }
                }, new Function0() { // from class: fp.b0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.f0(aVar, gVar);
                    }
                }, new Function0() { // from class: fp.c0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.g0(this.f16234a, aVar2);
                    }
                }, new Function1() { // from class: fp.d0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m0.h0(this.f16241a, (String) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof js.b.AbstractC0389b.Error)) {
                throw new zt.l();
            }
            ls.h hVarI = gVar.i();
            vo.j0.WaitForAutocapture waitForAutocapture3 = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
            if (waitForAutocapture3 == null || waitForAutocapture3.getWebRtcState() == ip.x.Connecting) {
                return Unit.f21506a;
            }
            if (aVar != null) {
                aVar.a();
            }
            vo.j0 j0Var = (vo.j0) gVar.i();
            gVar.p(new vo.j0.RestartStep(null, null, null, null, 0, j0Var != null ? j0Var.getCountryCode() : null, null, null, 223, null));
        }
        return Unit.f21506a;
    }

    public static final Unit e0(m0 m0Var, d2.a aVar, vo.j0.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(m0Var.trackingEventsLogger, aVar.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.U().invoke();
        return Unit.f21506a;
    }

    public static final Unit f0(ks.a aVar, ls.g gVar) {
        aVar.a();
        vo.j0 j0Var = (vo.j0) gVar.i();
        gVar.p(new vo.j0.RestartStep(null, null, null, null, 0, j0Var != null ? j0Var.getCountryCode() : null, null, null, 223, null));
        return Unit.f21506a;
    }

    public static final Unit g0(m0 m0Var, d2.a aVar) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(m0Var.trackingEventsLogger, aVar.getFromStep(), null, false, 6, null);
        return Unit.f21506a;
    }

    public static final Unit h0(m0 m0Var, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(m0Var.trackingEventsLogger, step, false, 2, null);
        return Unit.f21506a;
    }

    public final void C(d2.a renderProps, vo.j0 renderState, final ls.g<vo.j0> workflowContext, vo.f captureConfig, final ip.l videoCaptureHelper, sn.v cameraProperties, vo.n.GovernmentIdImage capturedId) {
        List<vo.n> listK;
        List<i3> listK2;
        if (!(renderState instanceof vo.j0.HolographicTorchDelay)) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            GovIdCaptureState govIdCaptureState = GovIdCaptureState.CAPTURED_PHOTO;
            GovIdCaptureMethod govIdCaptureMethodB = vo.x.b(capturedId.getCaptureMethod());
            IdConfig.e eVarQ = b3.Q(renderState.getCurrentPart());
            TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, govIdCaptureMethodB, eVarQ != null ? b3.d0(eVarQ) : null, null, 8, null), false, 2, null);
        }
        Integer holographicTorchEnabledDurationMs = renderProps.getHolographicTorchEnabledDurationMs();
        int iIntValue = holographicTorchEnabledDurationMs != null ? holographicTorchEnabledDurationMs.intValue() : 0;
        i3 currentPart = renderState.getCurrentPart();
        i3.SideIdPart sideIdPart = currentPart instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart : null;
        IdConfig idConfigC = vo.g.c(captureConfig);
        boolean z10 = videoCaptureHelper.c(renderProps) && iIntValue > 0 && renderState.D().isEmpty() && sideIdPart != null;
        if (!(renderState instanceof vo.j0.HolographicTorchDelay) && z10) {
            workflowContext.p(new vo.j0.HolographicTorchDelay(sideIdPart, renderState.D(), renderState.C(), renderState.getPartIndex(), renderState.getBackState(), renderState.getCountryCode(), captureConfig, cameraProperties, iIntValue, capturedId, false, Barcode.FORMAT_UPC_E, null));
            return;
        }
        i3.SideIdPart sideIdPart2 = sideIdPart;
        boolean z11 = videoCaptureHelper.c(renderProps) && !renderProps.getAutoClassificationConfig().getIsEnabled();
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (idConfigC != null && (z11 || shouldSkipReviewScreen)) {
            ep.e.s(renderState, workflowContext, renderProps, capturedId, idConfigC, videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
            return;
        }
        if (sideIdPart2 == null) {
            return;
        }
        vo.j0.WaitForAutocapture waitForAutocapture = new vo.j0.WaitForAutocapture(sideIdPart2, renderState.D(), captureConfig, b3.O(renderProps, sideIdPart2.getSide()), renderState.C(), renderState.getPartIndex(), renderState.getBackState(), ip.x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: fp.x
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m0.D(workflowContext, videoCaptureHelper);
            }
        }, 11776, null);
        i3 currentPart2 = renderState.getCurrentPart();
        i3.SideIdPart sideIdPart3 = currentPart2 instanceof i3.SideIdPart ? (i3.SideIdPart) currentPart2 : null;
        if (sideIdPart3 == null) {
            return;
        }
        vo.j0 j0Var = (vo.j0) workflowContext.i();
        if (j0Var == null || (listK = j0Var.D()) == null) {
            listK = p001kotlin.collections.p.k();
        }
        List<vo.n> list = listK;
        vo.j0 j0Var2 = (vo.j0) workflowContext.i();
        if (j0Var2 == null || (listK2 = j0Var2.C()) == null) {
            listK2 = p001kotlin.collections.p.k();
        }
        List<i3> list2 = listK2;
        vo.j0 j0Var3 = (vo.j0) workflowContext.i();
        int partIndex = j0Var3 != null ? j0Var3.getPartIndex() : 0;
        vo.j0 j0Var4 = (vo.j0) workflowContext.i();
        workflowContext.p(new vo.j0.ReviewCapturedImage(sideIdPart3, list, captureConfig, capturedId, list2, partIndex, waitForAutocapture, cameraProperties, null, false, j0Var4 != null ? j0Var4.getCountryCode() : null, 768, null));
    }

    @NotNull
    public final y3 E(@NotNull final d2.a renderProps, @NotNull final vo.j0.CountdownToCapture renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final ln.h<? super d2.b> sink, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        IdConfig.IdSideConfig idSideConfigD = vo.g.d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        workflowContext.n(this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), new Function1() { // from class: fp.f0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.F(workflowContext, (cp.d) obj);
            }
        });
        String strK = b3.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), vo.g.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String strJ = b3.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), vo.g.b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.e side = renderState.getCurrentPart().getSide();
        y3.b.a aVar = y3.b.a.Disabled;
        y3.f overlay = idSideConfigD.getOverlay();
        dp.e eVarA = vo.g.a(renderState.getCaptureConfig());
        ir.a aVarB = this.navigationStateManager.b();
        List<sn.e> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 function1G = ep.e.g(workflowContext, false, onOutput, 1, null);
        zn.a aVarE = videoCaptureHelper.e(renderProps);
        String strR = b3.R(renderProps.getStrings(), renderState.getHint());
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return vo.i0.f(renderProps, strK, strJ, capturing, aVar, overlay, eVarA, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014a: RETURN 
              (wrap vo.y3$b:0x0146: INVOKE 
              (r39v0 'renderProps' vo.d2$a)
              (r8v5 'strK' java.lang.String)
              (r9v6 'strJ' java.lang.String)
              (r10v5 'capturing' java.lang.String)
              (r12v1 'aVar' vo.y3$b$a)
              (r6v9 'overlay' vo.y3$f)
              (r14v1 'eVarA' dp.e)
              (r11v4 'side' vo.d3$e)
              (r6v11 'aVarB' ir.a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:0x00f9: CONSTRUCTOR (r43v0 'sink' ln.h<? super vo.d2$b> A[DONT_INLINE]) A[MD:(ln.h):void (m), WRAPPED] call: fp.g0.<init>(ln.h):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x0100: CONSTRUCTOR 
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE])
             A[MD:(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.h0.<init>(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              true
              (r13v3 'listA' java.util.List<sn.e>)
              (r40v0 'renderState' vo.j0$d)
              (r16v1 'partIndex' int)
              (wrap sn.a0$a:0x00f2: IGET (r38v0 'this' fp.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] fp.m0.e sn.a0$a)
              (wrap un.c$a:0x00f4: IGET (r38v0 'this' fp.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] fp.m0.f un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x0107: CONSTRUCTOR 
              (r40v0 'renderState' vo.j0$d A[DONT_INLINE])
              (r38v0 'this' fp.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(vo.j0$d, fp.m0, vo.d2$a, ls.g, ip.l):void (m), WRAPPED] call: fp.i0.<init>(vo.j0$d, fp.m0, vo.d2$a, ls.g, ip.l):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x0116: CONSTRUCTOR 
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r40v0 'renderState' vo.j0$d A[DONT_INLINE])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(ls.g, vo.j0$d, vo.d2$a, ip.l):void (m), WRAPPED] call: fp.j0.<init>(ls.g, vo.j0$d, vo.d2$a, ip.l):void type: CONSTRUCTOR))
              (r21v0 'function1G' kotlin.jvm.functions.Function1)
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (r22v0 'aVarE' zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap kotlin.jvm.functions.Function0:0x011d: CONSTRUCTOR 
              (r38v0 'this' fp.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r41v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r39v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r42v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(fp.m0, ls.g, vo.d2$a, ip.l):void (m), WRAPPED] call: fp.k0.<init>(fp.m0, ls.g, vo.d2$a, ip.l):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r39v0 'renderProps' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (r29v0 'imageCaptureCount' int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 'strR' java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (null zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (r32v0 'webRtcManager' ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (r45v0 'transition' kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m), WRAPPED])
             in method: fp.m0.E(vo.d2$a, vo.j0$d, ls.g<vo.j0>, ip.l, ln.h<? super vo.d2$b>, kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit>, kr.l):vo.y3, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: vo.d0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:315)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.m0.E(vo.d2$a, vo.j0$d, ls.g, ip.l, ln.h, kotlin.jvm.functions.Function1, kr.l):vo.y3");
    }

    @NotNull
    public final y3 M(@NotNull d2.a renderProps, @NotNull vo.j0.HolographicTorchDelay renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final Function1<? super d2.b, Unit> onOutput) {
        final m0 m0Var;
        final d2.a renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        workflowContext.m("holographic_torch_delay", new b(renderState, workflowContext, null));
        if (renderState.getHolographicTorchEnabled()) {
            m0Var = this;
        } else {
            c cVar = new c(renderProps2, renderState, workflowContext, videoCaptureHelper, null);
            m0Var = this;
            renderProps2 = renderProps2;
            workflowContext.m("holographic_torch_complete", cVar);
        }
        vo.f captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = vo.g.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = vo.g.b(captureConfig);
        IdConfig.e side = renderState.getCurrentPart().getSide();
        String strK = b3.K(renderProps2.getStrings(), side, strB, renderState.getCountryCode());
        String strJ = b3.J(renderProps2.getStrings(), side, strB, renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        y3.b.a aVar = y3.b.a.Disabled;
        y3.f overlay = idSideConfigD.getOverlay();
        dp.e eVarA = vo.g.a(captureConfig);
        ir.a aVarB = m0Var.navigationStateManager.b();
        List listK = p001kotlin.collections.p.k();
        int partIndex = renderState.getPartIndex();
        Function1 function1G = ep.e.g(workflowContext, false, onOutput, 1, null);
        zn.a aVarE = videoCaptureHelper.e(renderProps2);
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return vo.i0.f(renderProps2, strK, strJ, capturing, aVar, overlay, eVarA, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0100: RETURN 
              (wrap vo.y3$b:0x00fc: INVOKE 
              (r1v1 'renderProps2' vo.d2$a)
              (r10v1 'strK' java.lang.String)
              (r6v1 'strJ' java.lang.String)
              (r11v3 'capturing' java.lang.String)
              (r12v1 'aVar' vo.y3$b$a)
              (r3v3 'overlay' vo.y3$f)
              (r2v2 'eVarA' dp.e)
              (r9v1 'side' vo.d3$e)
              (r13v1 'aVarB' ir.a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:0x00bb: CONSTRUCTOR (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.l.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x00c2: CONSTRUCTOR 
              (r42v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r1v1 'renderProps2' vo.d2$a A[DONT_INLINE])
              (r43v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
              (r44v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE])
             A[MD:(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.w.<init>(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r14v0 'listK' java.util.List)
              (r41v0 'renderState' vo.j0$g)
              (r16v0 'partIndex' int)
              (wrap sn.a0$a:0x00b0: IGET (r0v8 'm0Var' fp.m0) A[WRAPPED] fp.m0.e sn.a0$a)
              (wrap un.c$a:0x00b2: IGET (r0v8 'm0Var' fp.m0) A[WRAPPED] fp.m0.f un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (r21v0 'function1G' kotlin.jvm.functions.Function1)
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (r22v0 'aVarE' zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap kotlin.jvm.functions.Function0:0x00c7: CONSTRUCTOR 
              (r0v8 'm0Var' fp.m0 A[DONT_INLINE])
              (r42v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r1v1 'renderProps2' vo.d2$a A[DONT_INLINE])
             A[MD:(fp.m0, ls.g, vo.d2$a):void (m), WRAPPED] call: fp.e0.<init>(fp.m0, ls.g, vo.d2$a):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r1v1 'renderProps2' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (null zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (r32v0 'webRtcManager' ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (wrap boolean:0x00b4: INVOKE (r41v0 'renderState' vo.j0$g) VIRTUAL call: vo.j0.g.N():boolean A[MD:():boolean (m), WRAPPED]))
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (null kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m), WRAPPED])
             in method: fp.m0.M(vo.d2$a, vo.j0$g, ls.g<vo.j0>, ip.l, kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit>):vo.y3, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: vo.d0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:315)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.m0.M(vo.d2$a, vo.j0$g, ls.g, ip.l, kotlin.jvm.functions.Function1):vo.y3");
    }

    @NotNull
    public final y3 Q(@NotNull Context context, @NotNull final d2.a renderProps, @NotNull final vo.j0.WaitForAutocapture renderState, @NotNull final ls.g<vo.j0> workflowContext, @NotNull final ip.l videoCaptureHelper, @NotNull final ln.h<? super d2.b> sink, @NotNull final Function1<? super d2.b, Unit> onOutput, @NotNull kr.l transition) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final vo.f captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigD = vo.g.d(captureConfig, renderState.getCurrentPart().getSide());
        String strB = vo.g.b(captureConfig);
        boolean z10 = captureConfig instanceof vo.f.AutoClassifyConfig;
        workflowContext.n(this.governmentIdAnalyzeWorkerFactory.a(renderState.getCurrentPart().getSide(), strB), new Function1() { // from class: fp.l0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.V(this.f16286a, renderState, workflowContext, captureConfig, sink, (zt.n) obj);
            }
        });
        workflowContext.n(this.governmentIdHintWorkerFactory.a(renderState.getCurrentPart().getSide()), new Function1() { // from class: fp.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.W(workflowContext, (cp.d) obj);
            }
        });
        zn.a aVarE = videoCaptureHelper.e(renderProps);
        zn.a aVar = zn.a.Stream;
        boolean z11 = aVarE == aVar && !videoCaptureHelper.d();
        if (idSideConfigD.getManualCaptureConfig().getIsEnabled() && !z11) {
            workflowContext.n(new TimerWorker(p001kotlin.ranges.d.d(idSideConfigD.getManualCaptureConfig().getDelayMs(), 0L)), new Function1() { // from class: fp.o
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m0.X(renderState, workflowContext, (Unit) obj);
                }
            });
        }
        String strK = b3.K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode());
        String strJ = b3.J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode());
        String strP = b3.P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strB, renderState.getCountryCode(), z10);
        IdConfig.e side = renderState.getCurrentPart().getSide();
        y3.b.a manualCapture = renderState.getManualCapture();
        y3.f overlay = idSideConfigD.getOverlay();
        dp.e eVarA = vo.g.a(captureConfig);
        ir.a aVarB = this.navigationStateManager.b();
        List<sn.e> listA = idSideConfigD.getAutoCaptureConfig().getRuleSet().a();
        int partIndex = renderState.getPartIndex();
        Function1 function1G = ep.e.g(workflowContext, false, onOutput, 1, null);
        zn.a aVarE2 = videoCaptureHelper.e(renderProps);
        String strR = b3.R(renderProps.getStrings(), renderState.getHint());
        zo.i iVarL = b3.L(renderProps, renderState.getCurrentPart().getSide());
        ks.a webRtcManager = videoCaptureHelper.getWebRtcManager();
        y3.b bVarF = vo.i0.f(renderProps, strK, strJ, strP, manualCapture, overlay, eVarA, side, aVarB, (1610874880 & Barcode.FORMAT_UPC_A) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b4: INVOKE (r4v3 'bVarF' vo.y3$b) = 
              (r47v0 'renderProps' vo.d2$a)
              (r10v1 'strK' java.lang.String)
              (r11v1 'strJ' java.lang.String)
              (r12v1 'strP' java.lang.String)
              (r12v2 'manualCapture' vo.y3$b$a)
              (r13v2 'overlay' vo.y3$f)
              (r14v4 'eVarA' dp.e)
              (r13v1 'side' vo.d3$e)
              (r22v0 'aVarB' ir.a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0002: ARITH (1610874880 int) & (wrap ??:SGET  A[WRAPPED] com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.d0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function2:0x0160: CONSTRUCTOR 
              (r48v0 'renderState' vo.j0$n A[DONT_INLINE])
              (r4v0 'captureConfig' vo.f A[DONT_INLINE])
              (r45v0 'this' fp.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r47v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r49v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(vo.j0$n, vo.f, fp.m0, vo.d2$a, ls.g, ip.l):void (m), WRAPPED] call: fp.p.<init>(vo.j0$n, vo.f, fp.m0, vo.d2$a, ls.g, ip.l):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x0168: CONSTRUCTOR (r51v0 'sink' ln.h<? super vo.d2$b> A[DONT_INLINE]) A[MD:(ln.h):void (m), WRAPPED] call: fp.q.<init>(ln.h):void type: CONSTRUCTOR)
              (wrap kotlin.jvm.functions.Function0:0x016d: CONSTRUCTOR 
              (r49v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r47v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
              (r52v0 'onOutput' kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit> A[DONT_INLINE])
             A[MD:(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void (m), WRAPPED] call: fp.r.<init>(ls.g, vo.d2$a, ip.l, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
              false
              (r17v4 'listA' java.util.List<sn.e>)
              (r48v0 'renderState' vo.j0$n)
              (r23v0 'partIndex' int)
              (wrap sn.a0$a:0x0151: IGET (r45v0 'this' fp.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] fp.m0.e sn.a0$a)
              (wrap un.c$a:0x0153: IGET (r45v0 'this' fp.m0 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] fp.m0.f un.c$a)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0011: ARITH (262144 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.e0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0020: ARITH (524288 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.f0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function1:0x0172: CONSTRUCTOR (r49v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE]) A[MD:(ls.g):void (m), WRAPPED] call: fp.s.<init>(ls.g):void type: CONSTRUCTOR))
              (r28v0 'function1G' kotlin.jvm.functions.Function1)
              (wrap zn.a:?: TERNARY null = ((wrap int:0x002f: ARITH (2097152 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0034: SGET  A[WRAPPED] zn.a.c zn.a) : (r29v0 'aVarE2' zn.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (4194304 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0046: ARITH (8388608 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap boolean:?: TERNARY null = ((wrap int:0x0051: ARITH (16777216 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x005b: ARITH (33554432 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.g0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x006a: ARITH (67108864 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0072: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: vo.h0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0179: CONSTRUCTOR 
              (r45v0 'this' fp.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r48v0 'renderState' vo.j0$n A[DONT_INLINE])
              (r49v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
             A[MD:(fp.m0, vo.j0$n, ls.g):void (m), WRAPPED] call: fp.t.<init>(fp.m0, vo.j0$n, ls.g):void type: CONSTRUCTOR))
              (wrap kotlin.jvm.functions.Function0:0x0180: CONSTRUCTOR 
              (r45v0 'this' fp.m0 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r49v0 'workflowContext' ls.g<vo.j0> A[DONT_INLINE])
              (r47v0 'renderProps' vo.d2$a A[DONT_INLINE])
              (r50v0 'videoCaptureHelper' ip.l A[DONT_INLINE])
             A[MD:(fp.m0, ls.g, vo.d2$a, ip.l):void (m), WRAPPED] call: fp.u.<init>(fp.m0, ls.g, vo.d2$a, ip.l):void type: CONSTRUCTOR)
              (wrap int:?: TERNARY null = ((wrap int:0x0079: ARITH (268435456 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0080: INVOKE (r47v0 'renderProps' vo.d2$a) VIRTUAL call: vo.d2.a.w():int A[MD:():int (m), WRAPPED]) : (0 int))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0087: ARITH (536870912 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 'strR' java.lang.String))
              (wrap zo.i:?: TERNARY null = ((wrap int:0x0092: ARITH (1073741824 int) & (1610874880 int) A[WRAPPED]) != (0 int)) ? (null zo.i) : (r38v0 'iVarL' zo.i))
              (wrap ks.a:?: TERNARY null = ((wrap int:0x009c: ARITH (1610874880 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null ks.a) : (r39v0 'webRtcManager' ks.a))
              (wrap boolean:?: TERNARY null = ((wrap int:0x00a4: ARITH (3 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap kr.l:?: TERNARY null = ((wrap int:0x00ad: ARITH (3 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x00b3: SGET  A[WRAPPED] kr.l.a kr.l) : (r53v0 'transition' kr.l))
             STATIC call: vo.i0.f(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b A[DECLARE_VAR, MD:(vo.d2$a, java.lang.String, java.lang.String, java.lang.String, vo.y3$b$a, vo.y3$f, dp.e, vo.d3$e, ir.a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.util.List<? extends sn.e>, vo.j0, int, sn.a0$a, un.c$a, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, zn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2<? super java.io.File, ? super sn.v, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, zo.i, ks.a, boolean, kr.l):vo.y3$b (m)] in method: fp.m0.Q(android.content.Context, vo.d2$a, vo.j0$n, ls.g<vo.j0>, ip.l, ln.h<? super vo.d2$b>, kotlin.jvm.functions.Function1<? super vo.d2$b, kotlin.Unit>, kr.l):vo.y3, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: vo.d0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:315)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.m0.Q(android.content.Context, vo.d2$a, vo.j0$n, ls.g, ip.l, ln.h, kotlin.jvm.functions.Function1, kr.l):vo.y3");
    }

    public final void c0(final d2.a renderProps, final vo.j0.WaitForAutocapture renderState, final ls.g<vo.j0> workflowContext, final ks.a webRtcManager) {
        workflowContext.n(this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), new Function1() { // from class: fp.y
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m0.d0(this.f16366a, workflowContext, webRtcManager, renderState, renderProps, (js.b.AbstractC0389b) obj);
            }
        });
    }
}
