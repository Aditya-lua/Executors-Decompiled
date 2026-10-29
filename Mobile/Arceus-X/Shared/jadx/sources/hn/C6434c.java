package hn;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.InterfaceC3404d;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5683g;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p476ur.InterfaceC11932a;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hn.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0096@¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 H\u0096@¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0+*\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010:R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020=0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010FR\u0014\u0010\r\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010IR\u0014\u0010L\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010KR\u0014\u0010N\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010M¨\u0006O"}, m31665d2 = {"Lhn/c;", "Lfn/g;", "Lhn/b0$a;", "camera2ManagerFactoryFactory", "Lhn/i0;", "cameraChoiceHelper", "Lku/p0;", "coroutineScope", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Lhn/b0$a;Lhn/i0;Lku/p0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)V", "", "h", "()V", "destroy", "enable", "c", "(Z)V", "e", "Ljt/n;", "Ljava/io/File;", "k", "(Lnt/b;)Ljava/lang/Object;", "j", "i", "enableAnalyzer", "f", "z", "Lnu/p0;", "Lhn/s$d;", "Lnu/h;", "w", "(Lnu/p0;)Lnu/h;", "y", "a", "Lhn/b0$a;", "b", "Lhn/i0;", "Lku/p0;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lhn/b0;", "Lhn/b0;", "camera2ManagerFactory", "Lhn/s;", "Lhn/s;", "currentManager", "Lnu/c0;", "Lcom/withpersona/sdk2/camera/d;", "g", "Lnu/c0;", "_previewState", "Z", "recordingOngoing", "Lku/d2;", "Lku/d2;", "currentStateCollectJob", "()Lnu/p0;", "cameraState", "Landroid/view/View;", "()Landroid/view/View;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "()Z", "isRecordingLocally", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6434c implements InterfaceC5683g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C6433b0.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6447i0 cameraChoiceHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C6433b0 camera2ManagerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public C6466s currentManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public InterfaceC9566c0<InterfaceC3404d> _previewState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean recordingOngoing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 currentStateCollectJob;

    /* JADX INFO: renamed from: hn.c$a */
    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m31665d2 = {"Lhn/c$a;", "", "Lhn/k0;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "Lhn/c;", "a", "(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C6434c mo28063a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull InterfaceC6442g analyzer, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a webRtcManager, boolean isAudioRequired);
    }

    /* JADX INFO: renamed from: hn.c$b */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lnu/i;", "Lhn/s$d;", "state", "", "<anonymous>", "(Lnu/i;Lhn/s$d;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", m39664f = "Camera2Controller.kt", m39665l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements InterfaceC14057n<InterfaceC9577i<? super C6466s.d>, C6466s.d, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24399t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f24400u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f24401v;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(3, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f24400u;
            C6466s.d dVar = (C6466s.d) this.f24401v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24399t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f24400u = C10350l.m39676a(interfaceC9577i);
                this.f24401v = dVar;
                this.f24399t = 1;
                if (interfaceC9577i.emit(dVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return C10340b.m39658a(!Intrinsics.m31980c(dVar, C6466s.d.b.f24572a));
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super C6466s.d> interfaceC9577i, C6466s.d dVar, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            b bVar = new b(interfaceC9557b);
            bVar.f24400u = interfaceC9577i;
            bVar.f24401v = dVar;
            return bVar.invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.c$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$2", m39664f = "Camera2Controller.kt", m39665l = {98}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24402t;

        /* JADX INFO: renamed from: hn.c$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C6434c f24404a;

            public a(C6434c c6434c) {
                this.f24404a = c6434c;
            }

            /* JADX INFO: renamed from: d */
            public static final String m28066d(C6434c c6434c) {
                return "First frame received for camera choice " + c6434c.currentManager.getCameraChoice();
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(C6466s.d dVar, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (!Intrinsics.m31980c(dVar, C6466s.d.a.f24571a)) {
                    if (dVar instanceof C6466s.d.Started) {
                        C6466s.d.Started c14177d = (C6466s.d.Started) dVar;
                        if (c14177d.getFirstFrameReceived()) {
                            TrackingEventsLogger trackingEventsLogger = this.f24404a.trackingEventsLogger;
                            final C6434c c6434c = this.f24404a;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: hn.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C6434c.c.a.m28066d(c6434c);
                                }
                            }, false, 4, null);
                        }
                        this.f24404a._previewState.setValue(new InterfaceC3404d.Ready(c14177d.getFirstFrameReceived()));
                    } else if (Intrinsics.m31980c(dVar, C6466s.d.b.f24572a)) {
                        this.f24404a._previewState.setValue(new InterfaceC3404d.Closed(this.f24404a.recordingOngoing, false));
                        C6434c c6434c2 = this.f24404a;
                        c6434c2.currentManager = c6434c2.camera2ManagerFactory.m28044h();
                        this.f24404a.recordingOngoing = false;
                    } else {
                        if (!(dVar instanceof C6466s.d.Error)) {
                            throw new C7345l();
                        }
                        C6466s.c cVarM28215a = ((C6466s.d.Error) dVar).getError();
                        if (cVarM28215a instanceof C6466s.c.a) {
                            this.f24404a.m28062z();
                        } else {
                            if (!(cVarM28215a instanceof C6466s.c.b)) {
                                throw new C7345l();
                            }
                            this.f24404a._previewState.setValue(InterfaceC3404d.c.f12931a);
                        }
                    }
                }
                return Unit.f29331a;
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6434c.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24402t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C6434c c6434c = C6434c.this;
                InterfaceC9575h interfaceC9575hM37788e = C9579j.m37788e(c6434c.m28060w(c6434c.currentManager.m28202e0()));
                a aVar = new a(C6434c.this);
                this.f24402t = 1;
                if (interfaceC9575hM37788e.collect(aVar, this) == objM38805e) {
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

    /* JADX INFO: renamed from: hn.c$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", m39664f = "Camera2Controller.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24405t;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6434c.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f24405t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C6434c.this._previewState.setValue(new InterfaceC3404d.Closed(true, true));
            C6434c.this._previewState.setValue(InterfaceC3404d.c.f12931a);
            C6434c.this.mo16224h();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.c$e */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", m39664f = "Camera2Controller.kt", m39665l = {159}, m39666m = "startVideo-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f24407t;

        /* JADX INFO: renamed from: v */
        public int f24409v;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24407t = obj;
            this.f24409v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo16226j = C6434c.this.mo16226j(this);
            return objMo16226j == C10047c.m38805e() ? objMo16226j : C7347n.m30459a(objMo16226j);
        }
    }

    /* JADX INFO: renamed from: hn.c$f */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", m39664f = "Camera2Controller.kt", m39665l = {170}, m39666m = "stopVideo-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f24410t;

        /* JADX INFO: renamed from: v */
        public int f24412v;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24410t = obj;
            this.f24412v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo16225i = C6434c.this.mo16225i(this);
            return objMo16225i == C10047c.m38805e() ? objMo16225i : C7347n.m30459a(objMo16225i);
        }
    }

    /* JADX INFO: renamed from: hn.c$g */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", m39664f = "Camera2Controller.kt", m39665l = {152}, m39666m = "takePicture-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f24413t;

        /* JADX INFO: renamed from: v */
        public int f24415v;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24413t = obj;
            this.f24415v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo16227k = C6434c.this.mo16227k(this);
            return objMo16227k == C10047c.m38805e() ? objMo16227k : C7347n.m30459a(objMo16227k);
        }
    }

    public C6434c(@NotNull C6433b0.a camera2ManagerFactoryFactory, @NotNull C6447i0 cameraChoiceHelper, @NotNull InterfaceC7906p0 coroutineScope, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull InterfaceC6442g analyzer, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z10) {
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
        this._previewState = C9596r0.m37859a(InterfaceC3404d.c.f12931a);
        C6433b0 c6433b0Mo28046a = camera2ManagerFactoryFactory.mo28046a(cameraChoices, previewView, analyzer, videoCaptureMethod, interfaceC11932a, z10);
        this.camera2ManagerFactory = c6433b0Mo28046a;
        this.currentManager = c6433b0Mo28046a.m28044h();
    }

    /* JADX INFO: renamed from: A */
    public static final String m28047A() {
        return "All camera choices exhausted. Emitting CameraState.Error, which surfaces as the \"Unsupported device.\" error.";
    }

    /* JADX INFO: renamed from: x */
    public static final String m28059x(C6434c c6434c) {
        return "Attempting camera choice " + c6434c.currentManager.getCameraChoice();
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: a */
    public CameraProperties mo16217a() {
        return this.currentManager.getCameraProperties();
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC9592p0<InterfaceC3404d> mo16218b() {
        return this._previewState;
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: c */
    public void mo16219c(boolean enable) {
        this.currentManager.m28197Z(enable);
    }

    @Override // p132fn.InterfaceC5683g
    @NotNull
    /* JADX INFO: renamed from: d */
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override // p132fn.InterfaceC5683g
    public void destroy() {
        this.currentManager.m28196Y();
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: e */
    public void mo16221e() {
        this.currentManager.m28198a0();
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: f */
    public void mo16222f(boolean enableAnalyzer) {
        this.currentManager.m28210q0(enableAnalyzer);
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingOngoing;
    }

    @Override // p132fn.InterfaceC5683g
    /* JADX INFO: renamed from: h */
    public void mo16224h() {
        if (Intrinsics.m31980c(this._previewState.getValue(), InterfaceC3404d.c.f12931a) || (this._previewState.getValue() instanceof InterfaceC3404d.Closed)) {
            InterfaceC7850d2 interfaceC7850d2 = this.currentStateCollectJob;
            if (interfaceC7850d2 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            }
            this._previewState.setValue(InterfaceC3404d.d.f12932a);
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6434c.m28059x(this.f24373a);
                }
            }, false, 4, null);
            this.currentStateCollectJob = C7882k.m32780d(this.coroutineScope, null, null, new c(null), 3, null);
            this.currentManager.m28211r0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo16225i(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        f fVar;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i10 = fVar.f24412v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f24412v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        Object obj = fVar.f24410t;
        Object objM38805e = C10047c.m38805e();
        int i11 = fVar.f24412v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return ((C7347n) obj).getValue();
        }
        C7348o.m30470b(obj);
        this.recordingOngoing = false;
        C6466s c6466s = this.currentManager;
        fVar.f24412v = 1;
        Object objM28213z0 = c6466s.m28213z0(fVar);
        return objM28213z0 == objM38805e ? objM38805e : objM28213z0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo16226j(@NotNull InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
        e eVar;
        Object objM28212x0;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i10 = eVar.f24409v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f24409v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object obj = eVar.f24407t;
        Object objM38805e = C10047c.m38805e();
        int i11 = eVar.f24409v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            if (!(this._previewState.getValue() instanceof InterfaceC3404d.Ready)) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(C10340b.m39658a(false));
            }
            C6466s c6466s = this.currentManager;
            eVar.f24409v = 1;
            objM28212x0 = c6466s.m28212x0(eVar);
            if (objM28212x0 == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            objM28212x0 = ((C7347n) obj).getValue();
        }
        if (Intrinsics.m31980c(C7347n.m30465g(objM28212x0) ? null : objM28212x0, C10340b.m39658a(true))) {
            this.recordingOngoing = true;
        }
        return objM28212x0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p132fn.InterfaceC5683g
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo16227k(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        g gVar;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f24415v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f24415v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object obj = gVar.f24413t;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar.f24415v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return ((C7347n) obj).getValue();
        }
        C7348o.m30470b(obj);
        C6466s c6466s = this.currentManager;
        gVar.f24415v = 1;
        Object objM28208o0 = c6466s.m28208o0(gVar);
        return objM28208o0 == objM38805e ? objM38805e : objM28208o0;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC9575h<C6466s.d> m28060w(InterfaceC9592p0<? extends C6466s.d> interfaceC9592p0) {
        return C9579j.m37783T(interfaceC9592p0, new b(null));
    }

    /* JADX INFO: renamed from: y */
    public final void m28061y() {
        this.currentManager = this.camera2ManagerFactory.m28044h();
        C7882k.m32780d(this.coroutineScope, C7864g1.m32645c(), null, new d(null), 2, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m28062z() {
        this.camera2ManagerFactory.m28043f();
        if (!this.camera2ManagerFactory.m28045i()) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6434c.m28047A();
                }
            }, false, 4, null);
            this._previewState.setValue(InterfaceC3404d.b.f12930a);
        } else {
            InterfaceC7850d2 interfaceC7850d2 = this.currentStateCollectJob;
            if (interfaceC7850d2 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            }
            m28061y();
        }
    }
}
