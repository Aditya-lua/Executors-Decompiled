package p589z;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001a0.C0013f;
import p001a0.C0034p0;
import p140g0.C5933s;
import p140g0.C5953x;
import p296n0.AbstractC8724b;
import p397r0.C10773n;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.q2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001d"}, m31665d2 = {"Lz/q2;", "Ln0/b;", "", "", "initialCameraIds", "La0/p0;", "cameraManager", "Ljava/util/concurrent/Executor;", "systemCallbackExecutor", "<init>", "(Ljava/util/List;La0/p0;Ljava/util/concurrent/Executor;)V", "", "g", "()V", "h", "Lne/x;", "Lg0/s;", "b", "()Lne/x;", "q", "(Lne/x;)V", "f", "La0/p0;", "Ljava/util/concurrent/Executor;", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "systemAvailabilityCallback", "i", "a", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C13605q2 extends AbstractC8724b {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C0034p0 cameraManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Executor systemCallbackExecutor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public CameraManager.AvailabilityCallback systemAvailabilityCallback;

    /* JADX INFO: renamed from: z.q2$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"z/q2$b", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "", "cameraId", "", "onCameraAvailable", "(Ljava/lang/String;)V", "onCameraUnavailable", "onCameraAccessPrioritiesChanged", "()V", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b extends CameraManager.AvailabilityCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
            C13605q2 c13605q2 = C13605q2.this;
            c13605q2.m49573q(c13605q2.mo34017b());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String cameraId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraAvailable: " + cameraId);
            C13605q2 c13605q2 = C13605q2.this;
            c13605q2.m49573q(c13605q2.mo34017b());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String cameraId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraUnavailable: " + cameraId);
            C13605q2 c13605q2 = C13605q2.this;
            c13605q2.m49573q(c13605q2.mo34017b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13605q2(@NotNull List<String> initialCameraIds, @NotNull C0034p0 cameraManager, @NotNull Executor systemCallbackExecutor) {
        super(initialCameraIds);
        Intrinsics.checkNotNullParameter(initialCameraIds, "initialCameraIds");
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(systemCallbackExecutor, "systemCallbackExecutor");
        this.cameraManager = cameraManager;
        this.systemCallbackExecutor = systemCallbackExecutor;
    }

    /* JADX INFO: renamed from: o */
    public static final Object m49571o(final C13605q2 c13605q2, final C12997c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        c13605q2.systemCallbackExecutor.execute(new Runnable() { // from class: z.o2
            @Override // java.lang.Runnable
            public final void run() {
                C13605q2.m49572p(this.f47578a, completer);
            }
        });
        return "FetchData for CameraAvailability";
    }

    /* JADX INFO: renamed from: p */
    public static final void m49572p(C13605q2 c13605q2, C12997c.a aVar) {
        try {
            String[] strArrM65d = c13605q2.cameraManager.m65d();
            Intrinsics.checkNotNullExpressionValue(strArrM65d, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList(strArrM65d.length);
            for (String str : strArrM65d) {
                C5933s.Companion companion = C5933s.INSTANCE;
                Intrinsics.checkNotNull(str);
                arrayList.add(C5933s.Companion.m26577d(companion, str, null, null, 6, null));
            }
            Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + CollectionsKt.m31715m0(arrayList, null, null, null, 0, null, null, 63, null));
            c13605q2.m35004i(arrayList);
            aVar.m48314c(arrayList);
        } catch (C0013f e10) {
            Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e10);
            C5953x c5953xM49169a = C13479a3.m49169a(e10);
            Intrinsics.checkNotNullExpressionValue(c5953xM49169a, "createFrom(...)");
            c13605q2.m35005j(c5953xM49169a);
            aVar.m48317f(c5953xM49169a);
        }
    }

    @Override // p296n0.InterfaceC8722a3
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceFutureC9440x<List<C5933s>> mo34017b() {
        InterfaceFutureC9440x<List<C5933s>> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: z.p2
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13605q2.m49571o(this.f47592a, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM48311a, "getFuture(...)");
        return interfaceFutureC9440xM48311a;
    }

    @Override // p296n0.AbstractC8724b
    /* JADX INFO: renamed from: g */
    public void mo35002g() {
        if (this.systemAvailabilityCallback != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            mo35003h();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        b bVar = new b();
        this.systemAvailabilityCallback = bVar;
        C0034p0 c0034p0 = this.cameraManager;
        Executor executor = this.systemCallbackExecutor;
        Intrinsics.checkNotNull(bVar);
        c0034p0.m68g(executor, bVar);
        m49573q(mo34017b());
    }

    @Override // p296n0.AbstractC8724b
    /* JADX INFO: renamed from: h */
    public void mo35003h() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        CameraManager.AvailabilityCallback availabilityCallback = this.systemAvailabilityCallback;
        if (availabilityCallback != null) {
            try {
                try {
                    this.cameraManager.m69h(availabilityCallback);
                    Unit unit = Unit.f29331a;
                } catch (Exception e10) {
                    Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e10);
                }
            } finally {
                this.systemAvailabilityCallback = null;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m49573q(InterfaceFutureC9440x<?> interfaceFutureC9440x) {
        C10773n.m41003z(interfaceFutureC9440x);
    }
}
