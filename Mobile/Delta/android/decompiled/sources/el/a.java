package el;

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
    public WeakReference<Activity> f16144a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity$ScreenCaptureCallback f16145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBugReporterCore f16147e;

    /* JADX INFO: renamed from: el.a$a, reason: collision with other inner class name */
    public class C0298a implements Activity$ScreenCaptureCallback {
        public C0298a() {
        }

        public void onScreenCaptured() {
            a.this.c(BugReporterTriggerType.SCREENSHOT);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16149a = new a();
    }

    public static a b() {
        return b.f16149a;
    }

    public final void c(BugReporterTriggerType bugReporterTriggerType) {
        IBugReporterCore iBugReporterCore = this.f16147e;
        if (iBugReporterCore != null) {
            iBugReporterCore.requestBugReport(bugReporterTriggerType);
        }
    }

    public void d(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f16146d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Already started.");
                return;
            }
            this.f16144a = new WeakReference<>(activity);
            C0298a c0298a = new C0298a();
            this.f16145c = c0298a;
            activity.registerScreenCaptureCallback(this.b, c0298a);
            this.f16146d = true;
        }
    }

    public void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (!this.f16146d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Not started.");
                return;
            }
            this.f16146d = false;
            Activity activity = this.f16144a.get();
            if (activity != null) {
                activity.unregisterScreenCaptureCallback(this.f16145c);
            } else {
                Log.w("BugReporterProtocolV2", "Could not stop listening. Activity is null");
            }
            this.f16145c = null;
            this.f16144a = null;
        }
    }

    @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter
    public boolean isAvailable() {
        return true;
    }

    public a() {
        this.b = Executors.newSingleThreadExecutor();
        this.f16146d = false;
        this.f16147e = null;
        this.f16147e = IBugReporterCore.setPlatformImpl(this);
    }
}
