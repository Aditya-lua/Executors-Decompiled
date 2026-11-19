package tl;

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
    public WeakReference<Activity> f32527a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity$ScreenCaptureCallback f32528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBugReporterCore f32530e;

    /* JADX INFO: renamed from: tl.a$a, reason: collision with other inner class name */
    public class C0652a implements Activity$ScreenCaptureCallback {
        public C0652a() {
        }

        public void onScreenCaptured() {
            a.this.c(BugReporterTriggerType.SCREENSHOT);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32532a = new a();
    }

    public static a b() {
        return b.f32532a;
    }

    public final void c(BugReporterTriggerType bugReporterTriggerType) {
        IBugReporterCore iBugReporterCore = this.f32530e;
        if (iBugReporterCore != null) {
            iBugReporterCore.requestBugReport(bugReporterTriggerType);
        }
    }

    public void d(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f32529d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Already started.");
                return;
            }
            this.f32527a = new WeakReference<>(activity);
            C0652a c0652a = new C0652a();
            this.f32528c = c0652a;
            activity.registerScreenCaptureCallback(this.b, c0652a);
            this.f32529d = true;
        }
    }

    public void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (!this.f32529d) {
                Log.w("BugReporterProtocolV2", "Unbalanced calls to start and stop. Not started.");
                return;
            }
            this.f32529d = false;
            Activity activity = this.f32527a.get();
            if (activity != null) {
                activity.unregisterScreenCaptureCallback(this.f32528c);
            } else {
                Log.w("BugReporterProtocolV2", "Could not stop listening. Activity is null");
            }
            this.f32528c = null;
            this.f32527a = null;
        }
    }

    @Override // com.roblox.protocols.bugreporterplatforminterface.generated.IPlatformBugReporter
    public boolean isAvailable() {
        return true;
    }

    public a() {
        this.b = Executors.newSingleThreadExecutor();
        this.f32529d = false;
        this.f32530e = null;
        this.f32530e = IBugReporterCore.setPlatformImpl(this);
    }
}
