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

/* JADX INFO: renamed from: gl.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6134a extends IPlatformBugReporter {

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f23466a;

    /* JADX INFO: renamed from: b */
    public final Executor f23467b;

    /* JADX INFO: renamed from: c */
    public Activity$ScreenCaptureCallback f23468c;

    /* JADX INFO: renamed from: d */
    public boolean f23469d;

    /* JADX INFO: renamed from: e */
    public IBugReporterCore f23470e;

    /* JADX INFO: renamed from: gl.a$a */
    public class a implements Activity$ScreenCaptureCallback {
        public a() {
        }

        public void onScreenCaptured() {
            C6134a.this.m27113c(BugReporterTriggerType.SCREENSHOT);
        }
    }

    /* JADX INFO: renamed from: gl.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C6134a f23472a = new C6134a();
    }

    /* JADX INFO: renamed from: b */
    public static C6134a m27112b() {
        return b.f23472a;
    }

    /* JADX INFO: renamed from: c */
    public final void m27113c(BugReporterTriggerType bugReporterTriggerType) {
        IBugReporterCore iBugReporterCore = this.f23470e;
        if (iBugReporterCore != null) {
            iBugReporterCore.requestBugReport(bugReporterTriggerType);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m27114d(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f23469d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Already started.");
                return;
            }
            this.f23466a = new WeakReference<>(activity);
            a aVar = new a();
            this.f23468c = aVar;
            activity.registerScreenCaptureCallback(this.f23467b, aVar);
            this.f23469d = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m27115e() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (!this.f23469d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Not started.");
                return;
            }
            this.f23469d = false;
            Activity activity = this.f23466a.get();
            if (activity != null) {
                activity.unregisterScreenCaptureCallback(this.f23468c);
            } else {
                Log.w("BugReporterProtocolV2", "Could not stop listening. Activity is null");
            }
            this.f23468c = null;
            this.f23466a = null;
        }
    }

    @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter
    public boolean isAvailable() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6134a() {
        this.f23467b = Executors.newSingleThreadExecutor();
        this.f23469d = false;
        this.f23470e = null;
        this.f23470e = IBugReporterCore.setPlatformImpl(this);
    }
}
