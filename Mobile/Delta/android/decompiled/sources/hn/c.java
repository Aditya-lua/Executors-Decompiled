package hn;

import android.view.View;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0096@¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0+*\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010:R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020=0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010FR\u0014\u0010\r\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010IR\u0014\u0010L\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010KR\u0014\u0010N\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010M¨\u0006O"}, d2 = {"Lhn/c;", "Lfn/g;", "Lhn/b0$a;", "camera2ManagerFactoryFactory", "Lhn/i0;", "cameraChoiceHelper", "Lku/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Lhn/b0$a;Lhn/i0;Lku/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)V", "", "h", "()V", "destroy", "enable", "c", "(Z)V", "e", "Ljt/n;", "Ljava/io/File;", "k", "(Lnt/b;)Ljava/lang/Object;", "j", "i", "enableAnalyzer", "f", "z", "Lnu/p0;", "Lhn/s$d;", "Lnu/h;", "w", "(Lnu/p0;)Lnu/h;", "y", "a", "Lhn/b0$a;", "b", "Lhn/i0;", "Lku/p0;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lhn/b0;", "Lhn/b0;", "camera2ManagerFactory", "Lhn/s;", "Lhn/s;", "currentManager", "Lnu/c0;", "Lcom/withpersona/sdk2/camera/d;", "g", "Lnu/c0;", "_previewState", "Z", "recordingOngoing", "Lku/d2;", "Lku/d2;", "currentStateCollectJob", "()Lnu/p0;", "cameraState", "Landroid/view/View;", "()Landroid/view/View;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements fn.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.p0 coroutineScope;

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
    public nu.c0<com.withpersona.sdk2.camera.d> _previewState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean recordingOngoing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 currentStateCollectJob;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lhn/c$a;", "", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "Lhn/c;", "a", "(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull hn.g analyzer, @NotNull mn.a videoCaptureMethod, @Nullable ur.a webRtcManager, boolean isAudioRequired);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnu/i;", "Lhn/s$d;", "state", "", "<anonymous>", "(Lnu/i;Lhn/s$d;)Z"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", f = "Camera2Controller.kt", l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED}, m = "invokeSuspend")
    public static final class b extends pt.m implements zt.n<nu.i<? super s.d>, s.d, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19370t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f19371u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f19372v;

        public b(nt.b<? super b> bVar) {
            super(3, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            nu.i iVar = (nu.i) this.f19371u;
            s.d dVar = (s.d) this.f19372v;
            Object objE = ot.c.e();
            int i10 = this.f19370t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f19371u = pt.l.a(iVar);
                this.f19372v = dVar;
                this.f19370t = 1;
                if (iVar.emit(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return pt.b.a(!Intrinsics.c(dVar, s.d.b.f19507a));
        }

        @Override // zt.n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nu.i<? super s.d> iVar, s.d dVar, nt.b<? super Boolean> bVar) {
            b bVar2 = new b(bVar);
            bVar2.f19371u = iVar;
            bVar2.f19372v = dVar;
            return bVar2.invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: hn.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$2", f = "Camera2Controller.kt", l = {98}, m = "invokeSuspend")
    public static final class C0344c extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19373t;

        /* JADX INFO: renamed from: hn.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f19375a;

            public a(c cVar) {
                this.f19375a = cVar;
            }

            public static final String d(c cVar) {
                return "First frame received for camera choice " + cVar.currentManager.getCameraChoice();
            }

            @Override // nu.i
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(s.d dVar, nt.b<? super Unit> bVar) {
                if (!Intrinsics.c(dVar, s.d.a.f19506a)) {
                    if (dVar instanceof s.d.Started) {
                        s.d.Started c0347d = (s.d.Started) dVar;
                        if (c0347d.getFirstFrameReceived()) {
                            TrackingEventsLogger trackingEventsLogger = this.f19375a.trackingEventsLogger;
                            final c cVar = this.f19375a;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: hn.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c.C0344c.a.d(cVar);
                                }
                            }, false, 4, null);
                        }
                        this.f19375a._previewState.setValue(new com.withpersona.sdk2.camera.d.Ready(c0347d.getFirstFrameReceived()));
                    } else if (Intrinsics.c(dVar, s.d.b.f19507a)) {
                        this.f19375a._previewState.setValue(new com.withpersona.sdk2.camera.d.Closed(this.f19375a.recordingOngoing, false));
                        c cVar2 = this.f19375a;
                        cVar2.currentManager = cVar2.camera2ManagerFactory.h();
                        this.f19375a.recordingOngoing = false;
                    } else {
                        if (!(dVar instanceof s.d.Error)) {
                            throw new jt.l();
                        }
                        s.c cVarA = ((s.d.Error) dVar).getError();
                        if (cVarA instanceof s.c.a) {
                            this.f19375a.z();
                        } else {
                            if (!(cVarA instanceof s.c.b)) {
                                throw new jt.l();
                            }
                            this.f19375a._previewState.setValue(com.withpersona.sdk2.camera.d.c.f9941a);
                        }
                    }
                }
                return Unit.f22483a;
            }
        }

        public C0344c(nt.b<? super C0344c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new C0344c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19373t;
            if (i10 == 0) {
                jt.o.b(obj);
                c cVar = c.this;
                nu.h hVarE = nu.j.e(cVar.w(cVar.currentManager.e0()));
                a aVar = new a(c.this);
                this.f19373t = 1;
                if (hVarE.collect(aVar, this) == objE) {
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
            return ((C0344c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", f = "Camera2Controller.kt", l = {}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19376t;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f19376t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            c.this._previewState.setValue(new com.withpersona.sdk2.camera.d.Closed(true, true));
            c.this._previewState.setValue(com.withpersona.sdk2.camera.d.c.f9941a);
            c.this.h();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {159}, m = "startVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f19378t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19380v;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19378t = obj;
            this.f19380v |= Integer.MIN_VALUE;
            Object objJ = c.this.j(this);
            return objJ == ot.c.e() ? objJ : jt.n.a(objJ);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {170}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f19381t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19383v;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19381t = obj;
            this.f19383v |= Integer.MIN_VALUE;
            Object objI = c.this.i(this);
            return objI == ot.c.e() ? objI : jt.n.a(objI);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", l = {152}, m = "takePicture-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f19384t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19386v;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19384t = obj;
            this.f19386v |= Integer.MIN_VALUE;
            Object objK = c.this.k(this);
            return objK == ot.c.e() ? objK : jt.n.a(objK);
        }
    }

    public c(@NotNull b0.a camera2ManagerFactoryFactory, @NotNull i0 cameraChoiceHelper, @NotNull ku.p0 coroutineScope, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull hn.g analyzer, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar, boolean z10) {
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
        this._previewState = nu.r0.a(com.withpersona.sdk2.camera.d.c.f9941a);
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

    @Override // fn.g
    @NotNull
    public CameraProperties a() {
        return this.currentManager.getCameraProperties();
    }

    @Override // fn.g
    @NotNull
    public nu.p0<com.withpersona.sdk2.camera.d> b() {
        return this._previewState;
    }

    @Override // fn.g
    public void c(boolean enable) {
        this.currentManager.Z(enable);
    }

    @Override // fn.g
    @NotNull
    /* JADX INFO: renamed from: d */
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override // fn.g
    public void destroy() {
        this.currentManager.Y();
    }

    @Override // fn.g
    public void e() {
        this.currentManager.a0();
    }

    @Override // fn.g
    public void f(boolean enableAnalyzer) {
        this.currentManager.q0(enableAnalyzer);
    }

    @Override // fn.g
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingOngoing;
    }

    @Override // fn.g
    public void h() {
        if (Intrinsics.c(this._previewState.getValue(), com.withpersona.sdk2.camera.d.c.f9941a) || (this._previewState.getValue() instanceof com.withpersona.sdk2.camera.d.Closed)) {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this._previewState.setValue(com.withpersona.sdk2.camera.d.C0162d.f9942a);
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.x(this.f19346a);
                }
            }, false, 4, null);
            this.currentStateCollectJob = ku.k.d(this.coroutineScope, null, null, new C0344c(null), 3, null);
            this.currentManager.r0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fn.g
    @Nullable
    public Object i(@NotNull nt.b<? super jt.n<? extends File>> bVar) {
        f fVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f19383v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f19383v = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f19381t;
        Object objE = ot.c.e();
        int i11 = fVar.f19383v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return ((jt.n) obj).getValue();
        }
        jt.o.b(obj);
        this.recordingOngoing = false;
        s sVar = this.currentManager;
        fVar.f19383v = 1;
        Object objZ0 = sVar.z0(fVar);
        return objZ0 == objE ? objE : objZ0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fn.g
    @Nullable
    public Object j(@NotNull nt.b<? super jt.n<Boolean>> bVar) {
        e eVar;
        Object objX0;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f19380v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f19380v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f19378t;
        Object objE = ot.c.e();
        int i11 = eVar.f19380v;
        if (i11 == 0) {
            jt.o.b(obj);
            if (!(this._previewState.getValue() instanceof com.withpersona.sdk2.camera.d.Ready)) {
                jt.n.Companion companion = jt.n.INSTANCE;
                return jt.n.b(pt.b.a(false));
            }
            s sVar = this.currentManager;
            eVar.f19380v = 1;
            objX0 = sVar.x0(eVar);
            if (objX0 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            objX0 = ((jt.n) obj).getValue();
        }
        if (Intrinsics.c(jt.n.g(objX0) ? null : objX0, pt.b.a(true))) {
            this.recordingOngoing = true;
        }
        return objX0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fn.g
    @Nullable
    public Object k(@NotNull nt.b<? super jt.n<? extends File>> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f19386v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f19386v = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f19384t;
        Object objE = ot.c.e();
        int i11 = gVar.f19386v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return ((jt.n) obj).getValue();
        }
        jt.o.b(obj);
        s sVar = this.currentManager;
        gVar.f19386v = 1;
        Object objO0 = sVar.o0(gVar);
        return objO0 == objE ? objE : objO0;
    }

    public final nu.h<s.d> w(nu.p0<? extends s.d> p0Var) {
        return nu.j.T(p0Var, new b(null));
    }

    public final void y() {
        this.currentManager = this.camera2ManagerFactory.h();
        ku.k.d(this.coroutineScope, g1.c(), null, new d(null), 2, null);
    }

    public final void z() {
        this.camera2ManagerFactory.f();
        if (!this.camera2ManagerFactory.i()) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.A();
                }
            }, false, 4, null);
            this._previewState.setValue(com.withpersona.sdk2.camera.d.b.f9940a);
        } else {
            d2 d2Var = this.currentStateCollectJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            y();
        }
    }
}
