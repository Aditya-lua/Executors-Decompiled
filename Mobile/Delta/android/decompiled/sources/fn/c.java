package fn;

import android.view.View;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import iu.d2;
import iu.g1;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0096@¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0+*\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010:R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010>R\u0016\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020=0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010FR\u0014\u0010\r\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010IR\u0014\u0010L\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010KR\u0014\u0010N\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010M¨\u0006O"}, d2 = {"Lfn/c;", "Ldn/g;", "Lfn/b0$a;", "camera2ManagerFactoryFactory", "Lfn/i0;", "cameraChoiceHelper", "Liu/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lfn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lfn/g;", "analyzer", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Lfn/b0$a;Lfn/i0;Liu/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)V", "", "j", "()V", "destroy", "enable", "c", "(Z)V", "f", "Lgt/n;", "Ljava/io/File;", "g", "(Llt/b;)Ljava/lang/Object;", "d", "k", "enableAnalyzer", "h", "z", "Llu/p0;", "Lfn/s$d;", "Llu/h;", "w", "(Llu/p0;)Llu/h;", "y", "a", "Lfn/b0$a;", "b", "Lfn/i0;", "Liu/p0;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lfn/b0;", "e", "Lfn/b0;", "camera2ManagerFactory", "Lfn/s;", "Lfn/s;", "currentManager", "Llu/c0;", "Lcom/withpersona/sdk2/camera/d;", "Llu/c0;", "_previewState", "Z", "recordingOngoing", "Liu/d2;", "i", "Liu/d2;", "currentStateCollectJob", "()Llu/p0;", "cameraState", "Landroid/view/View;", "()Landroid/view/View;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements dn.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iu.p0 coroutineScope;

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
    public lu.c0<com.withpersona.sdk2.camera.d> _previewState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean recordingOngoing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 currentStateCollectJob;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lfn/c$a;", "", "Lfn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lfn/g;", "analyzer", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "", "isAudioRequired", "Lfn/c;", "a", "(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull fn.g analyzer, @NotNull kn.a videoCaptureMethod, @Nullable sr.a webRtcManager, boolean isAudioRequired);
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", f = "Camera2Controller.kt", l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/i;", "Lfn/s$d;", "state", "", "<anonymous>", "(Llu/i;Lfn/s$d;)Z"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements xt.n<lu.i<? super s.d>, s.d, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17345t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f17346u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f17347v;

        public b(lt.b<? super b> bVar) {
            super(3, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            lu.i iVar = (lu.i) this.f17346u;
            s.d dVar = (s.d) this.f17347v;
            Object objE = mt.c.e();
            int i10 = this.f17345t;
            if (i10 == 0) {
                gt.o.b(obj);
                this.f17346u = nt.l.a(iVar);
                this.f17347v = dVar;
                this.f17345t = 1;
                if (iVar.emit(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return nt.b.a(!Intrinsics.c(dVar, s.d.b.f17482a));
        }

        @Override // xt.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super s.d> iVar, s.d dVar, lt.b<? super Boolean> bVar) {
            b bVar2 = new b(bVar);
            bVar2.f17346u = iVar;
            bVar2.f17347v = dVar;
            return bVar2.invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX INFO: renamed from: fn.c$c, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$2", f = "Camera2Controller.kt", l = {98}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0309c extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17348t;

        /* JADX INFO: renamed from: fn.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f17350a;

            public a(c cVar) {
                this.f17350a = cVar;
            }

            public static final String d(c cVar) {
                return "First frame received for camera choice " + cVar.currentManager.getCameraChoice();
            }

            @Override // lu.i
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(s.d dVar, lt.b<? super Unit> bVar) {
                if (!Intrinsics.c(dVar, s.d.a.f17481a)) {
                    if (dVar instanceof s.d.Started) {
                        s.d.Started c0312d = (s.d.Started) dVar;
                        if (c0312d.getFirstFrameReceived()) {
                            TrackingEventsLogger trackingEventsLogger = this.f17350a.trackingEventsLogger;
                            final c cVar = this.f17350a;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: fn.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c.C0309c.a.d(cVar);
                                }
                            }, false, 4, null);
                        }
                        this.f17350a._previewState.setValue(new com.withpersona.sdk2.camera.d.Ready(c0312d.getFirstFrameReceived()));
                    } else if (Intrinsics.c(dVar, s.d.b.f17482a)) {
                        this.f17350a._previewState.setValue(new com.withpersona.sdk2.camera.d.Closed(this.f17350a.recordingOngoing, false));
                        c cVar2 = this.f17350a;
                        cVar2.currentManager = cVar2.camera2ManagerFactory.h();
                        this.f17350a.recordingOngoing = false;
                    } else {
                        if (!(dVar instanceof s.d.Error)) {
                            throw new gt.l();
                        }
                        s.c cVarA = ((s.d.Error) dVar).getError();
                        if (cVarA instanceof s.c.a) {
                            this.f17350a.z();
                        } else {
                            if (!(cVarA instanceof s.c.b)) {
                                throw new gt.l();
                            }
                            this.f17350a._previewState.setValue(com.withpersona.sdk2.camera.d.c.f10022a);
                        }
                    }
                }
                return Unit.f22938a;
            }
        }

        public C0309c(lt.b<? super C0309c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new C0309c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((C0309c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17348t;
            if (i10 == 0) {
                gt.o.b(obj);
                c cVar = c.this;
                lu.h hVarE = lu.j.e(cVar.w(cVar.currentManager.e0()));
                a aVar = new a(c.this);
                this.f17348t = 1;
                if (hVarE.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", f = "Camera2Controller.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17351t;

        public d(lt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new d(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f17351t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            c.this._previewState.setValue(new com.withpersona.sdk2.camera.d.Closed(true, true));
            c.this._previewState.setValue(com.withpersona.sdk2.camera.d.c.f10022a);
            c.this.j();
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {159}, m = "startVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17353t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17355v;

        public e(lt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17353t = obj;
            this.f17355v |= Integer.MIN_VALUE;
            Object objD = c.this.d(this);
            return objD == mt.c.e() ? objD : gt.n.a(objD);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {170}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17356t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17358v;

        public f(lt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17356t = obj;
            this.f17358v |= Integer.MIN_VALUE;
            Object objK = c.this.k(this);
            return objK == mt.c.e() ? objK : gt.n.a(objK);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {152}, m = "takePicture-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17359t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17361v;

        public g(lt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17359t = obj;
            this.f17361v |= Integer.MIN_VALUE;
            Object objG = c.this.g(this);
            return objG == mt.c.e() ? objG : gt.n.a(objG);
        }
    }

    public c(@NotNull b0.a camera2ManagerFactoryFactory, @NotNull i0 cameraChoiceHelper, @NotNull iu.p0 coroutineScope, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull fn.g analyzer, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar, boolean z10) {
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
        this._previewState = lu.r0.a(com.withpersona.sdk2.camera.d.c.f10022a);
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

    @Override // dn.g
    @NotNull
    public CameraProperties a() {
        return this.currentManager.getCameraProperties();
    }

    @Override // dn.g
    @NotNull
    public lu.p0<com.withpersona.sdk2.camera.d> b() {
        return this._previewState;
    }

    @Override // dn.g
    public void c(boolean enable) {
        this.currentManager.Z(enable);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dn.g
    @Nullable
    public Object d(@NotNull lt.b<? super gt.n<Boolean>> bVar) {
        e eVar;
        Object objX0;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f17355v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f17355v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f17353t;
        Object objE = mt.c.e();
        int i11 = eVar.f17355v;
        if (i11 == 0) {
            gt.o.b(obj);
            if (!(this._previewState.getValue() instanceof com.withpersona.sdk2.camera.d.Ready)) {
                gt.n.Companion companion = gt.n.INSTANCE;
                return gt.n.b(nt.b.a(false));
            }
            s sVar = this.currentManager;
            eVar.f17355v = 1;
            objX0 = sVar.x0(eVar);
            if (objX0 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            objX0 = ((gt.n) obj).getValue();
        }
        if (Intrinsics.c(gt.n.g(objX0) ? null : objX0, nt.b.a(true))) {
            this.recordingOngoing = true;
        }
        return objX0;
    }

    @Override // dn.g
    public void destroy() {
        this.currentManager.Y();
    }

    @Override // dn.g
    @NotNull
    /* JADX INFO: renamed from: e */
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override // dn.g
    public void f() {
        this.currentManager.a0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dn.g
    @Nullable
    public Object g(@NotNull lt.b<? super gt.n<? extends File>> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f17361v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f17361v = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f17359t;
        Object objE = mt.c.e();
        int i11 = gVar.f17361v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return ((gt.n) obj).getValue();
        }
        gt.o.b(obj);
        s sVar = this.currentManager;
        gVar.f17361v = 1;
        Object objO0 = sVar.o0(gVar);
        return objO0 == objE ? objE : objO0;
    }

    @Override // dn.g
    public void h(boolean enableAnalyzer) {
        this.currentManager.q0(enableAnalyzer);
    }

    @Override // dn.g
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingOngoing;
    }

    @Override // dn.g
    public void j() {
        if (Intrinsics.c(this._previewState.getValue(), com.withpersona.sdk2.camera.d.c.f10022a) || (this._previewState.getValue() instanceof com.withpersona.sdk2.camera.d.Closed)) {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this._previewState.setValue(com.withpersona.sdk2.camera.d.C0165d.f10023a);
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.x(this.f17321a);
                }
            }, false, 4, null);
            this.currentStateCollectJob = iu.k.d(this.coroutineScope, null, null, new C0309c(null), 3, null);
            this.currentManager.r0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dn.g
    @Nullable
    public Object k(@NotNull lt.b<? super gt.n<? extends File>> bVar) {
        f fVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f17358v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f17358v = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f17356t;
        Object objE = mt.c.e();
        int i11 = fVar.f17358v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return ((gt.n) obj).getValue();
        }
        gt.o.b(obj);
        this.recordingOngoing = false;
        s sVar = this.currentManager;
        fVar.f17358v = 1;
        Object objZ0 = sVar.z0(fVar);
        return objZ0 == objE ? objE : objZ0;
    }

    public final lu.h<s.d> w(lu.p0<? extends s.d> p0Var) {
        return lu.j.T(p0Var, new b(null));
    }

    public final void y() {
        this.currentManager = this.camera2ManagerFactory.h();
        iu.k.d(this.coroutineScope, g1.c(), null, new d(null), 2, null);
    }

    public final void z() {
        this.camera2ManagerFactory.f();
        if (!this.camera2ManagerFactory.i()) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.A();
                }
            }, false, 4, null);
            this._previewState.setValue(com.withpersona.sdk2.camera.d.b.f10021a);
        } else {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            y();
        }
    }
}
