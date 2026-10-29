package ko;

import an.ViewEnvironment;
import android.content.Context;
import android.view.View;
import com.appsflyer.R;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import fn.h0;
import fn.l0;
import fn.m0;
import fn.v0;
import io.OverlayAssets;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import ku.p0;
import ku.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u0010:\u001a\u0016\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0012\u0018\u000105j\u0004\u0018\u0001`78\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010.R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010=¨\u0006N"}, d2 = {"Lko/u;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Landroid/content/Context;", "context", "Lko/w;", "viewController", "Lfn/g;", "cameraController", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lko/w;Lfn/g;Lfn/x;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "rendering", "Lan/y;", "viewEnvironment", "", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;)V", "", "maxRecordingLengthMs", "A", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;J)V", "Landroidx/lifecycle/m;", "lifecycleScope", "s", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;J)V", "r", "()V", "", "q", "()Z", "b", "Landroid/content/Context;", "c", "Lko/w;", "d", "Lfn/g;", "e", "Lfn/x;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lku/d2;", "g", "Lku/d2;", "currentCaptureJob", "h", "maxRecordingLimitJob", "i", "Z", "currentHolographicTorchEnabled", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "j", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "l", "cameraStateListenerJob", "", "m", "Ljava/lang/Integer;", "lastAutoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "lastLoggedIdleSide", "o", "I", "statusBarColor", "p", "currentPermissionChangedHandler", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements an.k<Screen.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w viewController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fn.g cameraController;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fn.x governmentIdFeed;

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
    public IdConfig.b lastLoggedIdleSide;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int statusBarColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> currentPermissionChangedHandler;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ko/u$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            root.post(new Runnable() { // from class: ko.t
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ko/u$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
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
        public static final /* synthetic */ int[] f22443a;

        static {
            int[] iArr = new int[io.d.values().length];
            try {
                iArr[io.d.K0000.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22443a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {363}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22444t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f22446a;

            public a(u uVar) {
                this.f22446a = uVar;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.camera.d dVar, nt.b<? super Unit> bVar) {
                Function1 function1;
                if (dVar instanceof com.withpersona.sdk2.camera.d.Ready) {
                    TrackingEventsLogger.logCameraInfoEvent$default(this.f22446a.trackingEventsLogger, com.withpersona.sdk2.camera.c.a(this.f22446a.cameraController.a()), false, 2, null);
                } else if (Intrinsics.c(dVar, com.withpersona.sdk2.camera.d.b.f9940a)) {
                    Function1 function2 = this.f22446a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new v0());
                    }
                } else if (dVar instanceof com.withpersona.sdk2.camera.d.Closed) {
                    com.withpersona.sdk2.camera.d.Closed closed = (com.withpersona.sdk2.camera.d.Closed) dVar;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f22446a.currentErrorHandler) != null) {
                        function1.invoke(new l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f22483a;
            }
        }

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return u.this.new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f22444t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h<com.withpersona.sdk2.camera.d> hVarA = com.withpersona.sdk2.camera.a.a(u.this.cameraController.b());
                a aVar = new a(u.this);
                this.f22444t = 1;
                if (hVarA.collect(aVar, this) == objE) {
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
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1", f = "CameraScreenRunner.kt", l = {329, 337}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22447t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f22448u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f22449v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Screen.b f22450w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, u uVar, Screen.b bVar, nt.b<? super e> bVar2) {
            super(2, bVar2);
            this.f22448u = j10;
            this.f22449v = uVar;
            this.f22450w = bVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f22448u, this.f22449v, this.f22450w, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x009f  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Function1 function1;
            u uVar;
            Screen.b bVar;
            u uVar2;
            Screen.b bVar2;
            Throwable thE;
            Object objE = ot.c.e();
            int i10 = this.f22447t;
            if (i10 == 0) {
                jt.o.b(obj);
                long j10 = this.f22448u;
                this.f22447t = 1;
                if (z0.b(j10, this) != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                jt.o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                value = ((jt.n) obj).getValue();
            }
            uVar = this.f22449v;
            bVar = this.f22450w;
            if (jt.n.h(value)) {
                ((File) value).delete();
                TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            }
            uVar2 = this.f22449v;
            bVar2 = this.f22450w;
            thE = jt.n.e(value);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, jt.a.b(thE), false, 20, null);
            }
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.f22449v.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(this.f22450w.getCaptureSide()), null, 8, null), false, 2, null);
            function1 = this.f22449v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new m0());
            }
            return Unit.f22483a;
            this.f22449v.maxRecordingLimitJob = null;
            if (this.f22449v.cameraController.b().getValue() instanceof com.withpersona.sdk2.camera.d.Closed) {
                return Unit.f22483a;
            }
            if (this.f22450w.getVideoCaptureMethod() == mn.a.Upload) {
                fn.g gVar = this.f22449v.cameraController;
                this.f22447t = 2;
                Object objI = gVar.i(this);
                if (objI != objE) {
                    value = objI;
                    uVar = this.f22449v;
                    bVar = this.f22450w;
                    if (jt.n.h(value)) {
                        ((File) value).delete();
                        TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                    }
                    uVar2 = this.f22449v;
                    bVar2 = this.f22450w;
                    thE = jt.n.e(value);
                    if (thE != null) {
                        TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, jt.a.b(thE), false, 20, null);
                    }
                }
                return objE;
            }
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.f22449v.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(this.f22450w.getCaptureSide()), null, 8, null), false, 2, null);
            function1 = this.f22449v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new m0());
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$2$1", f = "CameraScreenRunner.kt", l = {209}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {
        public Object A;
        public int B;
        public final /* synthetic */ Screen.b C;
        public final /* synthetic */ u D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22451t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22452u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22453v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22454w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f22455x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f22456y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f22457z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Screen.b bVar, u uVar, nt.b<? super f> bVar2) {
            super(2, bVar2);
            this.C = bVar;
            this.D = uVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(this.C, this.D, bVar);
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r10.B
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 != r3) goto L2a
                int r1 = r10.f22452u
                int r4 = r10.f22451t
                java.lang.Object r5 = r10.A
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Object r6 = r10.f22457z
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r7 = r10.f22456y
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r7 = (com.withpersona.sdk2.inquiry.governmentid.Screen.b) r7
                java.lang.Object r8 = r10.f22455x
                ko.u r8 = (ko.u) r8
                jt.o.b(r11)
                jt.n r11 = (jt.n) r11
                java.lang.Object r11 = r11.getValue()
                goto L68
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L32:
                jt.o.b(r11)
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r11 = r10.C
                int r11 = r11.getRemainingCaptureCount()
                ko.u r1 = r10.D
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r4 = r10.C
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r11)
                r8 = r1
                r1 = r2
                r7 = r4
                r4 = r11
            L48:
                if (r1 >= r4) goto L8b
                fn.g r11 = ko.u.h(r8)
                r10.f22455x = r8
                r10.f22456y = r7
                r10.f22457z = r5
                r10.A = r5
                r10.f22451t = r4
                r10.f22452u = r1
                r10.f22453v = r1
                r10.f22454w = r2
                r10.B = r3
                java.lang.Object r11 = r11.k(r10)
                if (r11 != r0) goto L67
                return r0
            L67:
                r6 = r5
            L68:
                java.lang.Throwable r9 = jt.n.e(r11)
                if (r9 != 0) goto L7a
                java.io.File r11 = (java.io.File) r11
                java.lang.String r11 = r11.getAbsolutePath()
                r5.add(r11)
                int r1 = r1 + r3
                r5 = r6
                goto L48
            L7a:
                boolean r11 = r9 instanceof hn.o0
                if (r11 == 0) goto L81
                kotlin.Unit r11 = kotlin.Unit.f22483a
                return r11
            L81:
                kotlin.jvm.functions.Function1 r11 = r7.E()
                r11.invoke(r9)
                kotlin.Unit r11 = kotlin.Unit.f22483a
                return r11
            L8b:
                ko.u r11 = r10.D
                ko.w r11 = ko.u.m(r11)
                r11.e()
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r11 = r10.C
                kotlin.jvm.functions.Function2 r11 = r11.y()
                ko.u r0 = r10.D
                fn.g r0 = ko.u.h(r0)
                com.withpersona.sdk2.camera.CameraProperties r0 = r0.a()
                r11.invoke(r5, r0)
                kotlin.Unit r11 = kotlin.Unit.f22483a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.u.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$6", f = "CameraScreenRunner.kt", l = {249, 257}, m = "invokeSuspend")
    public static final class g extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {
        public int A;
        public final /* synthetic */ Screen.b B;
        public final /* synthetic */ u C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22458t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22459u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22460v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22461w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f22462x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f22463y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f22464z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Screen.b bVar, u uVar, nt.b<? super g> bVar2) {
            super(2, bVar2);
            this.B = bVar;
            this.C = uVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new g(this.B, this.C, bVar);
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r11.A
                r2 = 0
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r0 = r11.f22462x
                java.util.List r0 = (java.util.List) r0
                jt.o.b(r12)
                goto La2
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                int r1 = r11.f22459u
                int r6 = r11.f22458t
                java.lang.Object r7 = r11.f22464z
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.lang.Object r8 = r11.f22463y
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r9 = r11.f22462x
                ko.u r9 = (ko.u) r9
                jt.o.b(r12)
                jt.n r12 = (jt.n) r12
                java.lang.Object r12 = r12.getValue()
                goto L6e
            L3b:
                jt.o.b(r12)
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r12 = r11.B
                int r12 = r12.getRemainingCaptureCount()
                ko.u r1 = r11.C
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r12)
                r9 = r1
                r1 = r2
            L4d:
                if (r1 >= r12) goto L83
                fn.g r7 = ko.u.h(r9)
                r11.f22462x = r9
                r11.f22463y = r6
                r11.f22464z = r6
                r11.f22458t = r12
                r11.f22459u = r1
                r11.f22460v = r1
                r11.f22461w = r2
                r11.A = r5
                java.lang.Object r7 = r7.k(r11)
                if (r7 != r0) goto L6a
                goto La0
            L6a:
                r8 = r6
                r6 = r12
                r12 = r7
                r7 = r8
            L6e:
                java.lang.Throwable r10 = jt.n.e(r12)
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
                ko.u r12 = r11.C
                ko.w r12 = ko.u.m(r12)
                r12.e()
                ko.u r12 = r11.C
                ko.w r12 = ko.u.m(r12)
                r11.f22462x = r6
                r11.f22463y = r4
                r11.f22464z = r4
                r11.A = r3
                java.lang.Object r12 = r12.g(r11)
                if (r12 != r0) goto La1
            La0:
                return r0
            La1:
                r0 = r6
            La2:
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r12 = r11.B
                kotlin.jvm.functions.Function2 r12 = r12.d()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.a0(r0)
                ko.u r1 = r11.C
                fn.g r1 = ko.u.h(r1)
                com.withpersona.sdk2.camera.CameraProperties r1 = r1.a()
                r12.invoke(r0, r1)
                kotlin.Unit r12 = kotlin.Unit.f22483a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.u.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$8", f = "CameraScreenRunner.kt", l = {271}, m = "invokeSuspend")
    public static final class h extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22465t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen.b f22467v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Screen.b bVar, nt.b<? super h> bVar2) {
            super(2, bVar2);
            this.f22467v = bVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return u.this.new h(this.f22467v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objE = ot.c.e();
            int i10 = this.f22465t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.g gVar = u.this.cameraController;
                this.f22465t = 1;
                Object objI = gVar.i(this);
                if (objI == objE) {
                    return objE;
                }
                value = objI;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                value = ((jt.n) obj).getValue();
            }
            Screen.b bVar = this.f22467v;
            u uVar = u.this;
            if (jt.n.h(value)) {
                bVar.F().invoke((File) value, uVar.cameraController.a());
                TrackingEventsLogger.logVideoStopEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, null, null, null, false, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            }
            u uVar2 = u.this;
            Screen.b bVar2 = this.f22467v;
            Throwable thE = jt.n.e(value);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, jt.a.b(thE), false, 20, null);
                if (!(thE instanceof h0)) {
                    bVar2.D().invoke(thE);
                }
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1", f = "CameraScreenRunner.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend")
    public static final class i extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22468t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen.b f22470v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.m f22471w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f22472x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Screen.b bVar, androidx.p000lifecycle.m mVar, long j10, nt.b<? super i> bVar2) {
            super(2, bVar2);
            this.f22470v = bVar;
            this.f22471w = mVar;
            this.f22472x = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return u.this.new i(this.f22470v, this.f22471w, this.f22472x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Object objE = ot.c.e();
            int i10 = this.f22468t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.g gVar = u.this.cameraController;
                this.f22468t = 1;
                objJ = gVar.j(this);
                if (objJ == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                objJ = ((jt.n) obj).getValue();
            }
            u uVar = u.this;
            Screen.b bVar = this.f22470v;
            androidx.p000lifecycle.m mVar = this.f22471w;
            long j10 = this.f22472x;
            if (jt.n.h(objJ)) {
                if (((Boolean) objJ).booleanValue()) {
                    uVar.s(bVar, mVar, j10);
                }
                TrackingEventsLogger.logVideoStartEvent$default(uVar.trackingEventsLogger, "government-id", bVar.getVideoCaptureMethod().toString(), null, false, 12, null);
            }
            u uVar2 = u.this;
            Screen.b bVar2 = this.f22470v;
            Throwable thE = jt.n.e(objJ);
            if (thE != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(uVar2.trackingEventsLogger, "government-id", bVar2.getVideoCaptureMethod().toString(), null, jt.a.b(thE), false, 20, null);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public u(@NotNull Context context, @NotNull w viewController, @NotNull fn.g cameraController, @NotNull fn.x governmentIdFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
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
        this.statusBarColor = l2.b.c(context, vp.b.f33360a);
        viewController.a();
        jq.g.i(context).a().a(new a());
        r();
        viewController.getRoot().addOnAttachStateChangeListener(new b());
    }

    public static final Unit u(u uVar, boolean z10) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        uVar.cameraController.c(z10);
        return Unit.f22483a;
    }

    public static final Unit v(u uVar, Screen.b bVar, androidx.p000lifecycle.m mVar) {
        boolean zQ = uVar.q();
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        if (!zQ) {
            uVar.A(bVar, bVar.getMaxRecordingLengthMs());
            bVar.x().invoke();
            uVar.currentCaptureJob = ku.k.d(mVar, g1.c(), null, new f(bVar, uVar, null), 2, null);
        }
        return Unit.f22483a;
    }

    public static final Unit w(u uVar) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(uVar.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CAPTURE_TIPS, null, 2, null), false, 2, null);
        return Unit.f22483a;
    }

    public static final Unit x(u uVar) {
        uVar.cameraController.e();
        return Unit.f22483a;
    }

    public static final void y(u uVar, View view) {
        uVar.cameraController.e();
    }

    public static final Unit z(u uVar) {
        jn.b.a(uVar.governmentIdFeed, uVar.cameraController, uVar.viewController.b());
        return Unit.f22483a;
    }

    public final void A(Screen.b rendering, long maxRecordingLengthMs) {
        if (rendering.getVideoCaptureMethod() == mn.a.Upload) {
            androidx.p000lifecycle.m mVarA = androidx.p000lifecycle.t.a(jq.g.i(this.context));
            ku.k.d(mVarA, g1.c(), null, new i(rendering, mVarA, maxRecordingLengthMs, null), 2, null);
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
        this.cameraStateListenerJob = ku.k.d(androidx.p000lifecycle.t.a(jq.g.i(this.context)), null, null, new d(null), 3, null);
    }

    public final void s(Screen.b rendering, androidx.p000lifecycle.m lifecycleScope, long maxRecordingLengthMs) {
        d2 d2Var = this.maxRecordingLimitJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.maxRecordingLimitJob = ku.k.d(lifecycleScope, g1.b(), null, new e(maxRecordingLengthMs, this, rendering, null), 2, null);
    }

    @Override // an.k
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final Screen.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        d2 d2Var;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final androidx.p000lifecycle.m mVarA = androidx.p000lifecycle.t.a(jq.g.i(this.context));
        if (this.lastLoggedIdleSide != rendering.getCaptureSide()) {
            this.lastLoggedIdleSide = rendering.getCaptureSide();
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.IDLE, null, com.withpersona.sdk2.inquiry.governmentid.n.d0(rendering.getCaptureSide()), null, 8, null), false, 2, null);
        }
        this.cameraController.h();
        if (rendering.getHolographicTorchEnabled() != this.currentHolographicTorchEnabled) {
            this.currentHolographicTorchEnabled = rendering.getHolographicTorchEnabled();
            this.cameraController.c(rendering.getHolographicTorchEnabled());
        }
        if (x.b(rendering)) {
            s(rendering, mVarA, rendering.getMaxRecordingLengthMs());
        }
        this.cameraController.f(rendering.getEnableAnalyzer());
        vq.c.b(viewEnvironment, this.context, this.statusBarColor);
        Integer num = this.lastAutoCaptureRulesId;
        int autoCaptureRulesId = rendering.getAutoCaptureRulesId();
        if (num == null || num.intValue() != autoCaptureRulesId) {
            this.governmentIdFeed.o(v.b(rendering.getCaptureSide()), rendering.e(), kotlin.collections.o.d(new gn.k()), c.f22443a[rendering.getDesignVersion().ordinal()] == 1);
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
        Screen.b.a captureButtonState = (rendering.getCaptureButtonState() != Screen.b.a.Enabled || rendering.getIsEnabled()) ? rendering.getCaptureButtonState() : Screen.b.a.Disabled;
        IdConfig.b captureSide = rendering.getCaptureSide();
        Screen.Overlay overlay = rendering.getOverlay();
        OverlayAssets overlayAssetsB = com.withpersona.sdk2.inquiry.governmentid.o.b(this.context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        wVar.c(message, scanInstructions, disclaimer, str, description, hintText, captureButtonState, captureSide, overlay, overlayAssetsB, assetConfig != null ? com.withpersona.sdk2.inquiry.governmentid.a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, x.a(rendering), rendering.getShowFinalizeUi(), rendering.getNavigationState(), rendering.getNavBarTitle(), rendering.getCaptureTips(), rendering.getAssetConfig(), rendering.getPlaySideTransition(), rendering.h(), rendering.o(), new Function1() { // from class: ko.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.u(this.f22419a, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: ko.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.v(this.f22420a, rendering, mVarA);
            }
        }, new Function0() { // from class: ko.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.w(this.f22422a);
            }
        }, new Function0() { // from class: ko.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.x(this.f22423a);
            }
        }, rendering.getStyles(), rendering.getWatermarkText());
        this.cameraController.getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: ko.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.y(this.f22424a, view);
            }
        });
        if (rendering.getAutoCapturing() && !q()) {
            A(rendering, rendering.getMaxRecordingLengthMs());
            this.currentCaptureJob = ku.k.d(mVarA, g1.c(), null, new g(rendering, this, null), 2, null);
        }
        wq.z.b(this.cameraController.getPreviewView(), new Function0() { // from class: ko.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.z(this.f22425a);
            }
        });
        if (((rendering.getState() instanceof GovernmentIdState.FinalizeWebRtc) || rendering.getFinalizeLocalVideo()) && (d2Var = this.maxRecordingLimitJob) != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        if (rendering.getFinalizeLocalVideo()) {
            ku.k.d(mVarA, g1.c(), null, new h(rendering, null), 2, null);
        }
    }
}
