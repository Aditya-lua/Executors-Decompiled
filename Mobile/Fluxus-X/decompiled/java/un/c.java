package un;

import android.view.View;
import av.d2;
import av.g1;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001dBg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0096@¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0+*\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010>R\u0016\u0010B\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020=0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010FR\u0014\u0010\r\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010IR\u0014\u0010L\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010KR\u0014\u0010N\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010M¨\u0006O"}, d2 = {"Lun/c;", "Lsn/i;", "Lun/b0$a;", "camera2ManagerFactoryFactory", "Lun/i0;", "cameraChoiceHelper", "Lav/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lun/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lun/g;", "analyzer", "Lzn/a;", "videoCaptureMethod", "Lks/a;", "webRtcManager", BuildConfig.FLAVOR, "isAudioRequired", "<init>", "(Lun/b0$a;Lun/i0;Lav/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)V", BuildConfig.FLAVOR, "j", "()V", "destroy", "enable", "a", "(Z)V", "d", "Lzt/n;", "Ljava/io/File;", "g", "(Leu/b;)Ljava/lang/Object;", "i", "k", "enableAnalyzer", "e", "z", "Ldv/p0;", "Lun/s$d;", "Ldv/h;", "w", "(Ldv/p0;)Ldv/h;", "y", "Lun/b0$a;", "b", "Lun/i0;", "c", "Lav/p0;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lun/b0;", "Lun/b0;", "camera2ManagerFactory", "Lun/s;", "f", "Lun/s;", "currentManager", "Ldv/c0;", "Lsn/y;", "Ldv/c0;", "_previewState", "h", "Z", "recordingOngoing", "Lav/d2;", "Lav/d2;", "currentStateCollectJob", "()Ldv/p0;", "cameraState", "Landroid/view/View;", "()Landroid/view/View;", "Lsn/v;", "()Lsn/v;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements sn.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final av.p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 camera2ManagerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public s currentManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public dv.c0<sn.y> _previewState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean recordingOngoing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 currentStateCollectJob;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lun/c$a;", BuildConfig.FLAVOR, "Lun/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lun/g;", "analyzer", "Lzn/a;", "videoCaptureMethod", "Lks/a;", "webRtcManager", BuildConfig.FLAVOR, "isAudioRequired", "Lun/c;", "a", "(Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull un.g analyzer, @NotNull zn.a videoCaptureMethod, @Nullable ks.a webRtcManager, boolean isAudioRequired);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldv/i;", "Lun/s$d;", "state", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;Lun/s$d;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", f = "Camera2Controller.kt", l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED}, m = "invokeSuspend")
    public static final class b extends gu.m implements pu.n<dv.i<? super s.d>, s.d, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33585t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33586u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33587v;

        public b(eu.b<? super b> bVar) {
            super(3, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f33586u;
            s.d dVar = (s.d) this.f33587v;
            Object objE = fu.c.e();
            int i10 = this.f33585t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f33586u = gu.l.a(iVar);
                this.f33587v = dVar;
                this.f33585t = 1;
                if (iVar.emit(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return gu.b.a(!Intrinsics.c(dVar, s.d.b.f33722a));
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super s.d> iVar, s.d dVar, eu.b<? super Boolean> bVar) {
            b bVar2 = new b(bVar);
            bVar2.f33586u = iVar;
            bVar2.f33587v = dVar;
            return bVar2.invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: renamed from: un.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$2", f = "Camera2Controller.kt", l = {98}, m = "invokeSuspend")
    public static final class C0683c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33588t;

        /* JADX INFO: renamed from: un.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f33590a;

            public a(c cVar) {
                this.f33590a = cVar;
            }

            public static final String d(c cVar) {
                return "First frame received for camera choice " + cVar.currentManager.getCameraChoice();
            }

            @Override // dv.i
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(s.d dVar, eu.b<? super Unit> bVar) {
                if (!Intrinsics.c(dVar, s.d.a.f33721a)) {
                    if (dVar instanceof s.d.Started) {
                        s.d.Started c0686d = (s.d.Started) dVar;
                        if (c0686d.getFirstFrameReceived()) {
                            TrackingEventsLogger trackingEventsLogger = this.f33590a.trackingEventsLogger;
                            final c cVar = this.f33590a;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: un.d
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c.C0683c.a.d(cVar);
                                }
                            }, false, 4, null);
                        }
                        this.f33590a._previewState.setValue(new sn.y.Ready(c0686d.getFirstFrameReceived()));
                    } else if (Intrinsics.c(dVar, s.d.b.f33722a)) {
                        this.f33590a._previewState.setValue(new sn.y.Closed(this.f33590a.recordingOngoing, false));
                        c cVar2 = this.f33590a;
                        cVar2.currentManager = cVar2.camera2ManagerFactory.h();
                        this.f33590a.recordingOngoing = false;
                    } else {
                        if (!(dVar instanceof s.d.Error)) {
                            throw new zt.l();
                        }
                        s.c cVarA = ((s.d.Error) dVar).getError();
                        if (cVarA instanceof s.c.a) {
                            this.f33590a.z();
                        } else {
                            if (!(cVarA instanceof s.c.b)) {
                                throw new zt.l();
                            }
                            this.f33590a._previewState.setValue(sn.y.c.f31747a);
                        }
                    }
                }
                return Unit.f21506a;
            }
        }

        public C0683c(eu.b<? super C0683c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new C0683c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C0683c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33588t;
            if (i10 == 0) {
                zt.o.b(obj);
                c cVar = c.this;
                dv.h hVarE = dv.j.e(cVar.w(cVar.currentManager.e0()));
                a aVar = new a(c.this);
                this.f33588t = 1;
                if (hVarE.collect(aVar, this) == objE) {
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
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", f = "Camera2Controller.kt", l = {}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33591t;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new d(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f33591t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            c.this._previewState.setValue(new sn.y.Closed(true, true));
            c.this._previewState.setValue(sn.y.c.f31747a);
            c.this.j();
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {159}, m = "startVideo-IoAF18A")
    public static final class e extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f33593t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33595v;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33593t = obj;
            this.f33595v |= Integer.MIN_VALUE;
            Object objI = c.this.i(this);
            return objI == fu.c.e() ? objI : zt.n.a(objI);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {170}, m = "stopVideo-IoAF18A")
    public static final class f extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f33596t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33598v;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33596t = obj;
            this.f33598v |= Integer.MIN_VALUE;
            Object objK = c.this.k(this);
            return objK == fu.c.e() ? objK : zt.n.a(objK);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {152}, m = "takePicture-IoAF18A")
    public static final class g extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f33599t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33601v;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33599t = obj;
            this.f33601v |= Integer.MIN_VALUE;
            Object objG = c.this.g(this);
            return objG == fu.c.e() ? objG : zt.n.a(objG);
        }
    }

    public c(@NotNull b0.a camera2ManagerFactoryFactory, @NotNull i0 cameraChoiceHelper, @NotNull av.p0 coroutineScope, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull un.g analyzer, @NotNull zn.a videoCaptureMethod, @Nullable ks.a aVar, boolean z10) {
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(cameraChoices, "cameraChoices");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.coroutineScope = coroutineScope;
        this.trackingEventsLogger = trackingEventsLogger;
        this._previewState = dv.r0.a(sn.y.c.f31747a);
        b0 b0VarA = camera2ManagerFactoryFactory.a(cameraChoices, previewView, analyzer, videoCaptureMethod, aVar, z10);
        this.camera2ManagerFactory = b0VarA;
        this.currentManager = b0VarA.h();
    }

    public static final String A() {
        return "All camera choices exhausted. Emitting CameraState.Error, which surfaces as the \"Unsupported device.\" error.";
    }

    public static final String x(c cVar) {
        return "Attempting camera choice " + cVar.currentManager.getCameraChoice();
    }

    @Override // sn.i
    public void a(boolean enable) {
        this.currentManager.Z(enable);
    }

    @Override // sn.i
    @NotNull
    public dv.p0<sn.y> b() {
        return this._previewState;
    }

    @Override // sn.i
    @NotNull
    /* JADX INFO: renamed from: c */
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override // sn.i
    public void d() {
        this.currentManager.a0();
    }

    @Override // sn.i
    public void destroy() {
        this.currentManager.Y();
    }

    @Override // sn.i
    public void e(boolean enableAnalyzer) {
        this.currentManager.q0(enableAnalyzer);
    }

    @Override // sn.i
    @NotNull
    public sn.v f() {
        return this.currentManager.getCameraProperties();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn.i
    @Nullable
    public Object g(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f33601v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f33601v = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f33599t;
        Object objE = fu.c.e();
        int i11 = gVar.f33601v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return ((zt.n) obj).getValue();
        }
        zt.o.b(obj);
        s sVar = this.currentManager;
        gVar.f33601v = 1;
        Object objO0 = sVar.o0(gVar);
        return objO0 == objE ? objE : objO0;
    }

    @Override // sn.i
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingOngoing;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn.i
    @Nullable
    public Object i(@NotNull eu.b<? super zt.n<Boolean>> bVar) {
        e eVar;
        Object objX0;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f33595v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f33595v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f33593t;
        Object objE = fu.c.e();
        int i11 = eVar.f33595v;
        if (i11 == 0) {
            zt.o.b(obj);
            if (!(this._previewState.getValue() instanceof sn.y.Ready)) {
                zt.n.Companion companion = zt.n.INSTANCE;
                return zt.n.b(gu.b.a(false));
            }
            s sVar = this.currentManager;
            eVar.f33595v = 1;
            objX0 = sVar.x0(eVar);
            if (objX0 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            objX0 = ((zt.n) obj).getValue();
        }
        if (Intrinsics.c(zt.n.g(objX0) ? null : objX0, gu.b.a(true))) {
            this.recordingOngoing = true;
        }
        return objX0;
    }

    @Override // sn.i
    public void j() {
        if (Intrinsics.c(this._previewState.getValue(), sn.y.c.f31747a) || (this._previewState.getValue() instanceof sn.y.Closed)) {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this._previewState.setValue(sn.y.d.f31748a);
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.a
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.x(this.f33561a);
                }
            }, false, 4, null);
            this.currentStateCollectJob = av.k.d(this.coroutineScope, null, null, new C0683c(null), 3, null);
            this.currentManager.r0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sn.i
    @Nullable
    public Object k(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        f fVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f33598v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f33598v = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f33596t;
        Object objE = fu.c.e();
        int i11 = fVar.f33598v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return ((zt.n) obj).getValue();
        }
        zt.o.b(obj);
        this.recordingOngoing = false;
        s sVar = this.currentManager;
        fVar.f33598v = 1;
        Object objZ0 = sVar.z0(fVar);
        return objZ0 == objE ? objE : objZ0;
    }

    public final dv.h<s.d> w(dv.p0<? extends s.d> p0Var) {
        return dv.j.U(p0Var, new b(null));
    }

    public final void y() {
        this.currentManager = this.camera2ManagerFactory.h();
        av.k.d(this.coroutineScope, g1.c(), null, new d(null), 2, null);
    }

    public final void z() {
        this.camera2ManagerFactory.f();
        if (!this.camera2ManagerFactory.i()) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.b
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.A();
                }
            }, false, 4, null);
            this._previewState.setValue(sn.y.b.f31746a);
        } else {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            y();
        }
    }
}
