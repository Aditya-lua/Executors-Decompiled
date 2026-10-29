package gl;

import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.protocols.bugreporterplatforminterface.generated.BugReporterTriggerType;
import com.roblox.protocols.bugreporterplatforminterface.generated.IBugReporterCore;
import com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class a extends IPlatformBugReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f18246a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity$ScreenCaptureCallback f18247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBugReporterCore f18249e;

    /* JADX INFO: renamed from: gl.a$a, reason: collision with other inner class name */
    public class C0328a implements Activity$ScreenCaptureCallback {
        public C0328a() {
        }

        public void onScreenCaptured() {
            a.this.c(BugReporterTriggerType.SCREENSHOT);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18251a = new a();
    }

    public static a b() {
        return b.f18251a;
    }

    public final void c(BugReporterTriggerType bugReporterTriggerType) {
        IBugReporterCore iBugReporterCore = this.f18249e;
        if (iBugReporterCore != null) {
            iBugReporterCore.requestBugReport(bugReporterTriggerType);
        }
    }

    public void d(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f18248d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Already started.");
                return;
            }
            this.f18246a = new WeakReference<>(activity);
            C0328a c0328a = new C0328a();
            this.f18247c = c0328a;
            activity.registerScreenCaptureCallback(this.b, c0328a);
            this.f18248d = true;
        }
    }

    public void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (!this.f18248d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Not started.");
                return;
            }
            this.f18248d = false;
            Activity activity = this.f18246a.get();
            if (activity != null) {
                activity.unregisterScreenCaptureCallback(this.f18247c);
            } else {
                Log.w("BugReporterProtocolV2", "Could not stop listening. Activity is null");
            }
            this.f18247c = null;
            this.f18246a = null;
        }
    }

    @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter
    public boolean isAvailable() {
        return true;
    }

    public a() {
        this.b = Executors.newSingleThreadExecutor();
        this.f18248d = false;
        this.f18249e = null;
        this.f18249e = IBugReporterCore.setPlatformImpl(this);
    }
}
