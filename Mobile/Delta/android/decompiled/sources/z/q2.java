package z;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001d"}, d2 = {"Lz/q2;", "Ln0/b;", "", "", "initialCameraIds", "La0/p0;", "cameraManager", "Ljava/util/concurrent/Executor;", "systemCallbackExecutor", "<init>", "(Ljava/util/List;La0/p0;Ljava/util/concurrent/Executor;)V", "", "g", "()V", "h", "Lme/x;", "Lg0/s;", "b", "()Lme/x;", "q", "(Lme/x;)V", "f", "La0/p0;", "Ljava/util/concurrent/Executor;", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "systemAvailabilityCallback", "i", "a", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q2 extends n0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0.p0 cameraManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor systemCallbackExecutor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraManager.AvailabilityCallback systemAvailabilityCallback;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"z/q2$b", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "", "cameraId", "", "onCameraAvailable", "(Ljava/lang/String;)V", "onCameraUnavailable", "onCameraAccessPrioritiesChanged", "()V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends CameraManager.AvailabilityCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
            q2 q2Var = q2.this;
            q2Var.q(q2Var.b());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String cameraId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraAvailable: " + cameraId);
            q2 q2Var = q2.this;
            q2Var.q(q2Var.b());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String cameraId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraUnavailable: " + cameraId);
            q2 q2Var = q2.this;
            q2Var.q(q2Var.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(@NotNull List<String> initialCameraIds, @NotNull a0.p0 cameraManager, @NotNull Executor systemCallbackExecutor) {
        super(initialCameraIds);
        Intrinsics.checkNotNullParameter(initialCameraIds, "initialCameraIds");
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(systemCallbackExecutor, "systemCallbackExecutor");
        this.cameraManager = cameraManager;
        this.systemCallbackExecutor = systemCallbackExecutor;
    }

    public static final Object o(final q2 q2Var, final y1.c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        q2Var.systemCallbackExecutor.execute(new Runnable() { // from class: z.o2
            @Override // java.lang.Runnable
            public final void run() {
                q2.p(this.f36737a, completer);
            }
        });
        return "FetchData for CameraAvailability";
    }

    public static final void p(q2 q2Var, y1.c.a aVar) {
        try {
            String[] strArrD = q2Var.cameraManager.d();
            Intrinsics.checkNotNullExpressionValue(strArrD, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList(strArrD.length);
            for (String str : strArrD) {
                g0.s.Companion companion = g0.s.INSTANCE;
                Intrinsics.checkNotNull(str);
                arrayList.add(g0.s.Companion.d(companion, str, null, null, 6, null));
            }
            Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + CollectionsKt.m0(arrayList, null, null, null, 0, null, null, 63, null));
            q2Var.i(arrayList);
            aVar.c(arrayList);
        } catch (a0.f e10) {
            Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e10);
            g0.x xVarA = a3.a(e10);
            Intrinsics.checkNotNullExpressionValue(xVarA, "createFrom(...)");
            q2Var.j(xVarA);
            aVar.f(xVarA);
        }
    }

    @Override // n0.a3
    @NotNull
    public me.x<List<g0.s>> b() {
        me.x<List<g0.s>> xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.p2
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return q2.o(this.f36747a, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xVarA, "getFuture(...)");
        return xVarA;
    }

    @Override // n0.b
    public void g() {
        if (this.systemAvailabilityCallback != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            h();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        b bVar = new b();
        this.systemAvailabilityCallback = bVar;
        a0.p0 p0Var = this.cameraManager;
        Executor executor = this.systemCallbackExecutor;
        Intrinsics.checkNotNull(bVar);
        p0Var.g(executor, bVar);
        q(b());
    }

    @Override // n0.b
    public void h() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        CameraManager.AvailabilityCallback availabilityCallback = this.systemAvailabilityCallback;
        if (availabilityCallback != null) {
            try {
                try {
                    this.cameraManager.h(availabilityCallback);
                    Unit unit = Unit.f22483a;
                } catch (Exception e10) {
                    Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e10);
                }
            } finally {
                this.systemAvailabilityCallback = null;
            }
        }
    }

    public final void q(me.x<?> xVar) {
        r0.n.z(xVar);
    }
}
