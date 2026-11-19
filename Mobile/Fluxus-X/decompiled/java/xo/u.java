package xo;

import android.content.Context;
import android.view.View;
import av.d2;
import av.g1;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import java.io.File;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sn.a1;
import sn.h0;
import sn.j1;
import sn.t0;
import sn.z0;
import vo.IdConfig;
import vo.OverlayAssets;
import vo.b3;
import vo.g3;
import vo.j0;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u0010:\u001a\u0016\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0012\u0018\u000105j\u0004\u0018\u0001`78\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010.R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010=¨\u0006N"}, d2 = {"Lxo/u;", "Lnn/k;", "Lvo/y3$b;", "Landroid/content/Context;", "context", "Lxo/w;", "viewController", "Lsn/i;", "cameraController", "Lsn/h0;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lxo/w;Lsn/i;Lsn/h0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "t", "(Lvo/y3$b;Lnn/z;)V", BuildConfig.FLAVOR, "maxRecordingLengthMs", "A", "(Lvo/y3$b;J)V", "Landroidx/lifecycle/m;", "lifecycleScope", "s", "(Lvo/y3$b;Landroidx/lifecycle/m;J)V", "r", "()V", BuildConfig.FLAVOR, "q", "()Z", "b", "Landroid/content/Context;", "c", "Lxo/w;", "d", "Lsn/i;", "e", "Lsn/h0;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lav/d2;", "g", "Lav/d2;", "currentCaptureJob", "h", "maxRecordingLimitJob", "i", "Z", "currentHolographicTorchEnabled", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "j", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "l", "cameraStateListenerJob", BuildConfig.FLAVOR, "m", "Ljava/lang/Integer;", "lastAutoCaptureRulesId", "Lvo/d3$e;", "n", "Lvo/d3$e;", "lastLoggedIdleSide", "o", "I", "statusBarColor", "p", "currentPermissionChangedHandler", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements nn.k<y3.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w viewController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.i cameraController;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 governmentIdFeed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 currentCaptureJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean currentHolographicTorchEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer lastAutoCaptureRulesId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IdConfig.e lastLoggedIdleSide;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int statusBarColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> currentPermissionChangedHandler;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"xo/u$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onResume", "(Landroidx/lifecycle/s;)V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements androidx.p000lifecycle.f {
        public a() {
        }

        public static final void b(u uVar) {
            Function0 function0 = uVar.currentPermissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            uVar.r();
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(androidx.p000lifecycle.s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(androidx.p000lifecycle.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(androidx.p000lifecycle.s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            View root = u.this.viewController.getRoot();
            final u uVar = u.this;
            root.post(new Runnable() { // from class: xo.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.b(uVar);
                }
            });
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(androidx.p000lifecycle.s sVar) {
            super.onStop(sVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"xo/u$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", BuildConfig.FLAVOR, "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v8) {
            Intrinsics.checkNotNullParameter(v8, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v8) {
            Intrinsics.checkNotNullParameter(v8, "v");
            d2 d2Var = u.this.maxRecordingLimitJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            u.this.maxRecordingLimitJob = null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36902a;

        static {
            int[] iArr = new int[vo.i.values().length];
            try {
                iArr[vo.i.K0000.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f36902a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {363}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36903t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f36905a;

            public a(u uVar) {
                this.f36905a = uVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(sn.y yVar, eu.b<? super Unit> bVar) {
                Function1 function1;
                if (yVar instanceof sn.y.Ready) {
                    TrackingEventsLogger.logCameraInfoEvent$default(this.f36905a.trackingEventsLogger, sn.w.a(this.f36905a.cameraController.f()), false, 2, null);
                } else if (Intrinsics.c(yVar, sn.y.b.f31746a)) {
                    Function1 function2 = this.f36905a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new j1());
                    }
                } else if (yVar instanceof sn.y.Closed) {
                    sn.y.Closed closed = (sn.y.Closed) yVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f36905a.currentErrorHandler) != null) {
                        function1.invoke(new z0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f21506a;
            }
        }

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return u.this.new d(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f36903t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h<sn.y> hVarA = sn.j.a(u.this.cameraController.b());
                a aVar = new a(u.this);
                this.f36903t = 1;
                if (hVarA.collect(aVar, this) == objE) {
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1", f = "CameraScreenRunner.kt", l = {329, 337}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36906t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f36907u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f36908v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ y3.b f36909w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, u uVar, y3.b bVar, eu.b<? super e> bVar2) {
            super(2, bVar2);
            this.f36907u = j10;
            this.f36908v = uVar;
            this.f36909w = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f36907u, this.f36908v, this.f36909w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x009f  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Function1 function1;
            u uVar;
            y3.b bVar;
            u uVar2;
            y3.b bVar2;
            Throwable thE;
            Object objE = fu.c.e();
            int i10 = this.f36906t;
            if (i10 == 0) {
                zt.o.b(obj);
                long j10 = this.f36907u;
                this.f36906t = 1;
                if (av.z0.b(j10, this) != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                value = ((zt.n) obj).getValue();
            }
            uVar = this.f36908v;
            bVar = this.f36909w;
            if (zt.n.h(value)) {
                ((File) value).delete();
                TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, 124, null);
            }
            uVar2 = this.f36908v;
            bVar2 = this.f36909w;
            thE = zt.n.e(value);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, zt.a.b(thE), false, 20, null);
            }
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.f36908v.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, b3.d0(this.f36909w.getCaptureSide()), null, 8, null), false, 2, null);
            function1 = this.f36908v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new a1());
            }
            return Unit.f21506a;
            this.f36908v.maxRecordingLimitJob = null;
            if (this.f36908v.cameraController.b().getValue() instanceof sn.y.Closed) {
                return Unit.f21506a;
            }
            if (this.f36909w.getVideoCaptureMethod() == zn.a.Upload) {
                sn.i iVar = this.f36908v.cameraController;
                this.f36906t = 2;
                Object objK = iVar.k(this);
                if (objK != objE) {
                    value = objK;
                    uVar = this.f36908v;
                    bVar = this.f36909w;
                    if (zt.n.h(value)) {
                        ((File) value).delete();
                        TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, 124, null);
                    }
                    uVar2 = this.f36908v;
                    bVar2 = this.f36909w;
                    thE = zt.n.e(value);
                    if (thE != null) {
                        TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, zt.a.b(thE), false, 20, null);
                    }
                }
                return objE;
            }
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.f36908v.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, b3.d0(this.f36909w.getCaptureSide()), null, 8, null), false, 2, null);
            function1 = this.f36908v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new a1());
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$2$1", f = "CameraScreenRunner.kt", l = {209}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {
        public Object A;
        public int B;
        public final /* synthetic */ y3.b C;
        public final /* synthetic */ u D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36910t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f36911u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f36912v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f36913w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f36914x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f36915y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f36916z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y3.b bVar, u uVar, eu.b<? super f> bVar2) {
            super(2, bVar2);
            this.C = bVar;
            this.D = uVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.C, this.D, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:13:0x0067  */
        /* JADX WARN: Code duplicated, block: B:16:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:14:0x0068). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r10.B
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 != r3) goto L2a
                int r1 = r10.f36911u
                int r4 = r10.f36910t
                java.lang.Object r5 = r10.A
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Object r6 = r10.f36916z
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r7 = r10.f36915y
                vo.y3$b r7 = (vo.y3.b) r7
                java.lang.Object r8 = r10.f36914x
                xo.u r8 = (xo.u) r8
                zt.o.b(r11)
                zt.n r11 = (zt.n) r11
                java.lang.Object r11 = r11.getValue()
                goto L68
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L32:
                zt.o.b(r11)
                vo.y3$b r11 = r10.C
                int r11 = r11.getRemainingCaptureCount()
                xo.u r1 = r10.D
                vo.y3$b r4 = r10.C
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r11)
                r8 = r1
                r1 = r2
                r7 = r4
                r4 = r11
            L48:
                if (r1 >= r4) goto L8b
                sn.i r11 = xo.u.h(r8)
                r10.f36914x = r8
                r10.f36915y = r7
                r10.f36916z = r5
                r10.A = r5
                r10.f36910t = r4
                r10.f36911u = r1
                r10.f36912v = r1
                r10.f36913w = r2
                r10.B = r3
                java.lang.Object r11 = r11.g(r10)
                if (r11 != r0) goto L67
                return r0
            L67:
                r6 = r5
            L68:
                java.lang.Throwable r9 = zt.n.e(r11)
                if (r9 != 0) goto L7a
                java.io.File r11 = (java.io.File) r11
                java.lang.String r11 = r11.getAbsolutePath()
                r5.add(r11)
                int r1 = r1 + r3
                r5 = r6
                goto L48
            L7a:
                boolean r11 = r9 instanceof un.o0
                if (r11 == 0) goto L81
                kotlin.Unit r11 = p001kotlin.Unit.f21506a
                return r11
            L81:
                kotlin.jvm.functions.Function1 r11 = r7.E()
                r11.invoke(r9)
                kotlin.Unit r11 = p001kotlin.Unit.f21506a
                return r11
            L8b:
                xo.u r11 = r10.D
                xo.w r11 = xo.u.m(r11)
                r11.f()
                vo.y3$b r11 = r10.C
                kotlin.jvm.functions.Function2 r11 = r11.y()
                xo.u r0 = r10.D
                sn.i r0 = xo.u.h(r0)
                sn.v r0 = r0.f()
                r11.invoke(r5, r0)
                kotlin.Unit r11 = p001kotlin.Unit.f21506a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.u.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$6", f = "CameraScreenRunner.kt", l = {249, 257}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {
        public int A;
        public final /* synthetic */ y3.b B;
        public final /* synthetic */ u C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36917t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f36918u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f36919v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f36920w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f36921x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f36922y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f36923z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y3.b bVar, u uVar, eu.b<? super g> bVar2) {
            super(2, bVar2);
            this.B = bVar;
            this.C = uVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.B, this.C, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004f  */
        /* JADX WARN: Code duplicated, block: B:15:0x006a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0074  */
        /* JADX WARN: Code duplicated, block: B:19:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006a -> B:16:0x006e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r11.A
                r2 = 0
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r0 = r11.f36921x
                java.util.List r0 = (java.util.List) r0
                zt.o.b(r12)
                goto La2
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                int r1 = r11.f36918u
                int r6 = r11.f36917t
                java.lang.Object r7 = r11.f36923z
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.lang.Object r8 = r11.f36922y
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r9 = r11.f36921x
                xo.u r9 = (xo.u) r9
                zt.o.b(r12)
                zt.n r12 = (zt.n) r12
                java.lang.Object r12 = r12.getValue()
                goto L6e
            L3b:
                zt.o.b(r12)
                vo.y3$b r12 = r11.B
                int r12 = r12.getRemainingCaptureCount()
                xo.u r1 = r11.C
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r12)
                r9 = r1
                r1 = r2
            L4d:
                if (r1 >= r12) goto L83
                sn.i r7 = xo.u.h(r9)
                r11.f36921x = r9
                r11.f36922y = r6
                r11.f36923z = r6
                r11.f36917t = r12
                r11.f36918u = r1
                r11.f36919v = r1
                r11.f36920w = r2
                r11.A = r5
                java.lang.Object r7 = r7.g(r11)
                if (r7 != r0) goto L6a
                goto La0
            L6a:
                r8 = r6
                r6 = r12
                r12 = r7
                r7 = r8
            L6e:
                java.lang.Throwable r10 = zt.n.e(r12)
                if (r10 != 0) goto L7b
                java.io.File r12 = (java.io.File) r12
                java.lang.String r12 = r12.getAbsolutePath()
                goto L7c
            L7b:
                r12 = r4
            L7c:
                r7.add(r12)
                int r1 = r1 + r5
                r12 = r6
                r6 = r8
                goto L4d
            L83:
                xo.u r12 = r11.C
                xo.w r12 = xo.u.m(r12)
                r12.f()
                xo.u r12 = r11.C
                xo.w r12 = xo.u.m(r12)
                r11.f36921x = r6
                r11.f36922y = r4
                r11.f36923z = r4
                r11.A = r3
                java.lang.Object r12 = r12.d(r11)
                if (r12 != r0) goto La1
            La0:
                return r0
            La1:
                r0 = r6
            La2:
                vo.y3$b r12 = r11.B
                kotlin.jvm.functions.Function2 r12 = r12.d()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = p001kotlin.collections.CollectionsKt.a0(r0)
                xo.u r1 = r11.C
                sn.i r1 = xo.u.h(r1)
                sn.v r1 = r1.f()
                r12.invoke(r0, r1)
                kotlin.Unit r12 = p001kotlin.Unit.f21506a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.u.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$8", f = "CameraScreenRunner.kt", l = {271}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36924t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y3.b f36926v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(y3.b bVar, eu.b<? super h> bVar2) {
            super(2, bVar2);
            this.f36926v = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return u.this.new h(this.f36926v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objE = fu.c.e();
            int i10 = this.f36924t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = u.this.cameraController;
                this.f36924t = 1;
                Object objK = iVar.k(this);
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
            y3.b bVar = this.f36926v;
            u uVar = u.this;
            if (zt.n.h(value)) {
                bVar.F().invoke((File) value, uVar.cameraController.f());
                TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, 124, null);
            }
            u uVar2 = u.this;
            y3.b bVar2 = this.f36926v;
            Throwable thE = zt.n.e(value);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, zt.a.b(thE), false, 20, null);
                if (!(thE instanceof t0)) {
                    bVar2.D().invoke(thE);
                }
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1", f = "CameraScreenRunner.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36927t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y3.b f36929v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.m f36930w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f36931x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(y3.b bVar, androidx.p000lifecycle.m mVar, long j10, eu.b<? super i> bVar2) {
            super(2, bVar2);
            this.f36929v = bVar;
            this.f36930w = mVar;
            this.f36931x = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return u.this.new i(this.f36929v, this.f36930w, this.f36931x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objI;
            Object objE = fu.c.e();
            int i10 = this.f36927t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = u.this.cameraController;
                this.f36927t = 1;
                objI = iVar.i(this);
                if (objI == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                objI = ((zt.n) obj).getValue();
            }
            u uVar = u.this;
            y3.b bVar = this.f36929v;
            androidx.p000lifecycle.m mVar = this.f36930w;
            long j10 = this.f36931x;
            if (zt.n.h(objI)) {
                if (((Boolean) objI).booleanValue()) {
                    uVar.s(bVar, mVar, j10);
                }
                TrackingEventsLogger.logVideoStartEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, false, 12, null);
            }
            u uVar2 = u.this;
            y3.b bVar2 = this.f36929v;
            Throwable thE = zt.n.e(objI);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, zt.a.b(thE), false, 20, null);
            }
            return Unit.f21506a;
        }
    }

    public u(@NotNull Context context, @NotNull w viewController, @NotNull sn.i cameraController, @NotNull h0 governmentIdFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.context = context;
        this.viewController = viewController;
        this.cameraController = cameraController;
        this.governmentIdFeed = governmentIdFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.statusBarColor = l2.b.c(context, jq.b.f20845a);
        viewController.a();
        xq.g.i(context).a().a(new a());
        r();
        viewController.getRoot().addOnAttachStateChangeListener(new b());
    }

    public static final Unit u(u uVar, boolean z10) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        uVar.cameraController.a(z10);
        return Unit.f21506a;
    }

    public static final Unit v(u uVar, y3.b bVar, androidx.p000lifecycle.m mVar) {
        boolean zQ = uVar.q();
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        if (!zQ) {
            uVar.A(bVar, bVar.getMaxRecordingLengthMs());
            bVar.x().invoke();
            uVar.currentCaptureJob = av.k.d(mVar, g1.c(), null, new f(bVar, uVar, null), 2, null);
        }
        return Unit.f21506a;
    }

    public static final Unit w(u uVar) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CAPTURE_TIPS, null, 2, null), false, 2, null);
        return Unit.f21506a;
    }

    public static final Unit x(u uVar) {
        uVar.cameraController.d();
        return Unit.f21506a;
    }

    public static final void y(u uVar, View view) {
        uVar.cameraController.d();
    }

    public static final Unit z(u uVar) {
        wn.b.a(uVar.governmentIdFeed, uVar.cameraController, uVar.viewController.b());
        return Unit.f21506a;
    }

    public final void A(y3.b rendering, long maxRecordingLengthMs) {
        if (rendering.getVideoCaptureMethod() == zn.a.Upload) {
            androidx.p000lifecycle.m mVarA = androidx.p000lifecycle.t.a(xq.g.i(this.context));
            av.k.d(mVarA, g1.c(), null, new i(rendering, mVarA, maxRecordingLengthMs, null), 2, null);
        }
    }

    public final boolean q() {
        d2 d2Var = this.currentCaptureJob;
        return d2Var != null && d2Var.b();
    }

    public final void r() {
        d2 d2Var = this.cameraStateListenerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.cameraStateListenerJob = av.k.d(androidx.p000lifecycle.t.a(xq.g.i(this.context)), null, null, new d(null), 3, null);
    }

    public final void s(y3.b rendering, androidx.p000lifecycle.m lifecycleScope, long maxRecordingLengthMs) {
        d2 d2Var = this.maxRecordingLimitJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.maxRecordingLimitJob = av.k.d(lifecycleScope, g1.b(), null, new e(maxRecordingLengthMs, this, rendering, null), 2, null);
    }

    @Override // nn.k
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final y3.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        d2 d2Var;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final androidx.p000lifecycle.m mVarA = androidx.p000lifecycle.t.a(xq.g.i(this.context));
        if (this.lastLoggedIdleSide != rendering.getCaptureSide()) {
            this.lastLoggedIdleSide = rendering.getCaptureSide();
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.IDLE, null, b3.d0(rendering.getCaptureSide()), null, 8, null), false, 2, null);
        }
        this.cameraController.j();
        if (rendering.getHolographicTorchEnabled() != this.currentHolographicTorchEnabled) {
            this.currentHolographicTorchEnabled = rendering.getHolographicTorchEnabled();
            this.cameraController.a(rendering.getHolographicTorchEnabled());
        }
        if (x.b(rendering)) {
            s(rendering, mVarA, rendering.getMaxRecordingLengthMs());
        }
        this.cameraController.e(rendering.getEnableAnalyzer());
        jr.c.b(viewEnvironment, this.context, this.statusBarColor);
        Integer num = this.lastAutoCaptureRulesId;
        int autoCaptureRulesId = rendering.getAutoCaptureRulesId();
        if (num == null || num.intValue() != autoCaptureRulesId) {
            this.governmentIdFeed.o(v.b(rendering.getCaptureSide()), rendering.e(), p001kotlin.collections.o.d(new tn.k()), c.f36902a[rendering.getDesignVersion().ordinal()] == 1);
            this.lastAutoCaptureRulesId = Integer.valueOf(rendering.getAutoCaptureRulesId());
        }
        this.currentErrorHandler = rendering.D();
        this.permissionChangedHandler = rendering.n();
        w wVar = this.viewController;
        String message = rendering.getMessage();
        String scanInstructions = rendering.getScanInstructions();
        String disclaimer = rendering.getDisclaimer();
        String str = rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        String description = rendering.getDescription();
        String hintText = rendering.getHintText();
        y3.b.a captureButtonState = (rendering.getCaptureButtonState() != y3.b.a.Enabled || rendering.getIsEnabled()) ? rendering.getCaptureButtonState() : y3.b.a.Disabled;
        IdConfig.e captureSide = rendering.getCaptureSide();
        y3.f overlay = rendering.getOverlay();
        OverlayAssets overlayAssetsB = g3.b(this.context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        wVar.e(message, scanInstructions, disclaimer, str, description, hintText, captureButtonState, captureSide, overlay, overlayAssetsB, assetConfig != null ? vo.a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, x.a(rendering), rendering.getShowFinalizeUi(), rendering.getNavigationState(), rendering.getNavBarTitle(), rendering.getCaptureTips(), rendering.getAssetConfig(), rendering.getPlaySideTransition(), rendering.h(), rendering.o(), new Function1() { // from class: xo.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.u(this.f36878a, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: xo.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.v(this.f36879a, rendering, mVarA);
            }
        }, new Function0() { // from class: xo.p
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.w(this.f36881a);
            }
        }, new Function0() { // from class: xo.q
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.x(this.f36882a);
            }
        }, rendering.getStyles(), rendering.getWatermarkText());
        this.cameraController.getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: xo.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.y(this.f36883a, view);
            }
        });
        if (rendering.getAutoCapturing() && !q()) {
            A(rendering, rendering.getMaxRecordingLengthMs());
            this.currentCaptureJob = av.k.d(mVarA, g1.c(), null, new g(rendering, this, null), 2, null);
        }
        kr.a0.b(this.cameraController.getPreviewView(), new Function0() { // from class: xo.s
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.z(this.f36884a);
            }
        });
        if (((rendering.getState() instanceof j0.f) || rendering.getFinalizeLocalVideo()) && (d2Var = this.maxRecordingLimitJob) != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        if (rendering.getFinalizeLocalVideo()) {
            av.k.d(mVarA, g1.c(), null, new h(rendering, null), 2, null);
        }
    }
}
