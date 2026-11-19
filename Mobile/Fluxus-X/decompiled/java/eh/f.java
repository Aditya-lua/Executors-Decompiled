package eh;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import backtraceio.library.events.OnBeforeSendEventListener;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceExceptionHandler;
import backtraceio.library.watchdog.BacktraceWatchdogTimeoutException;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Supplier;
import javax.net.ssl.SSLException;
import ob.ze;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile k6.a f13516a;
    public volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UUID f13518d;

    public class a extends ArrayList<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13519a;

        public a(String str) {
            this.f13519a = str;
            add(str);
        }
    }

    public class b implements OnApplicationNotRespondingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k6.a f13520a;

        public b(k6.a aVar) {
            this.f13520a = aVar;
        }

        public static String a(boolean z10) {
            if (a1.q0()) {
                return z10 ? "Quest-Backtrace-ANRException-Sent" : "Quest-Backtrace-ANRException-NotSent";
            }
            return z10 ? "Android-Backtrace-ANRException-Sent" : "Android-Backtrace-ANRException-NotSent";
        }

        public final boolean b() {
            int iRandom = (int) (Math.random() * 100.0d);
            f.b(f.this);
            return iRandom < f.this.f13517c;
        }

        public final void c(boolean z10) {
            dj.g.b().q(a(z10));
            if (a1.f0()) {
                return;
            }
            dj.g.b().q(a(z10) + "-Channel-" + a1.W());
        }

        @Override // backtraceio.library.watchdog.OnApplicationNotRespondingEvent
        public void onEvent(BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException) {
            ok.q.b("rbx.backtrace", "OnApplicationNotRespondingEvent()");
            try {
                String[] activeShaders = NativeGLInterface.getActiveShaders();
                if (activeShaders != null) {
                    for (int i10 = 0; i10 < activeShaders.length; i10++) {
                        String str = activeShaders[i10];
                        if (str != null && !str.isEmpty()) {
                            this.f13520a.getAttributes().put(String.format("GfxActiveShader%d", Integer.valueOf(i10)), activeShaders[i10]);
                        }
                    }
                }
            } catch (Throwable th2) {
                ok.q.k("rbx.backtrace", "Skipping active shaders due to " + th2);
            }
            if (!b()) {
                c(false);
            } else {
                c(true);
                this.f13520a.g(backtraceWatchdogTimeoutException);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f13521a = new f();
    }

    public static final class d extends xt.a {
    }

    public class e implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Thread.UncaughtExceptionHandler f13522a = Thread.getDefaultUncaughtExceptionHandler();
        public final Thread.UncaughtExceptionHandler b;

        public e(k6.a aVar) {
            BacktraceExceptionHandler.enable(aVar);
            this.b = Thread.getDefaultUncaughtExceptionHandler();
        }

        public static String a(boolean z10) {
            if (a1.q0()) {
                return z10 ? "Quest-Backtrace-UnhandledException-Sent" : "Quest-Backtrace-UnhandledException-NotSent";
            }
            return z10 ? "Android-Backtrace-UnhandledException-Sent" : "Android-Backtrace-UnhandledException-NotSent";
        }

        public final boolean b(Throwable th2) {
            return this.b != null && (th2 instanceof Exception);
        }

        public final boolean c() {
            int iRandom = (int) (Math.random() * 100.0d);
            f.b(f.this);
            return iRandom < f.this.b;
        }

        public final void d(Throwable th2) {
            try {
                fn.c.i(new fn.c.a("clientcrash", ze.a(new Object[]{TelemetryBackend.EVENT_INGEST})).d(), new fn.c.b().b("crash_uploader", "backtrace_android_java").b("rbx_crash_reason", th2.getClass().getSimpleName()).b("ixp_enrolled_experiments", f.m(new eh.c())).b("rollout_flags_in_variant", f.m(new eh.d())).b("rollout_flags_in_control", f.m(new eh.e())).h(TelemetryStandardizedField.ADD_OS_INFO).l());
            } catch (Throwable th3) {
                ok.q.k("rbx.backtrace", "Failed to report client crash telemetry: " + th3);
            }
        }

        public final void e(boolean z10) {
            dj.g.b().q(a(z10));
        }

        public final boolean f(Throwable th2) {
            String name = th2.getClass().getName();
            if (Build.VERSION.SDK_INT == 33 && "android.app.RemoteServiceException$CannotDeliverBroadcastException".equals(name)) {
                return true;
            }
            if (!(th2 instanceof RuntimeException)) {
                return false;
            }
            Throwable cause = ((RuntimeException) th2).getCause();
            return (cause instanceof SSLException) && "Unable to create application data".equals(((SSLException) cause).getMessage());
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (f(th2)) {
                ok.q.b("rbx.backtrace", "Suppressing known exception " + th2.getClass().getName());
                return;
            }
            if (bi.h.a().x4()) {
                d(th2);
            }
            if (c() && b(th2)) {
                ok.q.b("rbx.backtrace", "uncaughtException() using the custom handler: " + this.b);
                e(true);
                this.b.uncaughtException(thread, th2);
                return;
            }
            ok.q.b("rbx.backtrace", "uncaughtException() using the default handler: " + this.f13522a);
            if (this.f13522a != null) {
                e(false);
                this.f13522a.uncaughtException(thread, th2);
            }
        }
    }

    public static /* bridge */ /* synthetic */ d b(f fVar) {
        fVar.getClass();
        return null;
    }

    public static f h() {
        return c.f13521a;
    }

    public static String m(Supplier<String> supplier) {
        try {
            String str = supplier.get();
            return str != null ? str : BuildConfig.FLAVOR;
        } catch (Throwable unused) {
        }
    }

    public final void f(Context context) {
        try {
            Process processStart = new ProcessBuilder("logcat", "-t", bi.h.a().B2(), "-v", "time").start();
            File file = new File(context.getCacheDir(), "androidLog.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    bufferedWriter.close();
                    processStart.destroy();
                    return;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e10) {
            ok.q.k("rbx.backtrace", "Bypass Java log due to " + e10);
        }
    }

    public k6.a g() {
        return this.f13516a;
    }

    public void i(Context context) {
        j(context, bi.h.a().R4(), bi.h.a().E2(), bi.h.a().z4(), bi.h.a().j4(), bi.h.a().Q());
    }

    public final synchronized void j(final Context context, String str, String str2, int i10, int i11, int i12) {
        try {
            if (this.f13516a == null) {
                this.b = i11;
                this.f13517c = i12;
                k6.a aVar = new k6.a(context, new k6.b(str, str2), new a(context.getCacheDir() + "/androidLog.txt"));
                if (this.f13518d != null) {
                    aVar.enableProguard();
                }
                aVar.b(i10, new b(aVar));
                aVar.setOnBeforeSendEventListener(new OnBeforeSendEventListener() { // from class: eh.b
                    @Override // backtraceio.library.events.OnBeforeSendEventListener
                    public final BacktraceData onEvent(BacktraceData backtraceData) {
                        return this.f13477a.l(context, backtraceData);
                    }
                });
                Thread.setDefaultUncaughtExceptionHandler(new e(aVar));
                this.f13516a = aVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void k(Context context, BacktraceInitValues backtraceInitValues) {
        j(context, backtraceInitValues.getUploadUrl(), backtraceInitValues.getUploadToken(), backtraceInitValues.getAnrMaximumTimeout(), backtraceInitValues.getJavaCrashUploadPercentage(), backtraceInitValues.getJavaAnrUploadPercentage());
    }

    public final /* synthetic */ BacktraceData l(Context context, BacktraceData backtraceData) {
        backtraceData.attributes.put("BaseUrl", a1.g());
        backtraceData.attributes.put("UserId", Long.toString(nk.c.c().j()));
        backtraceData.attributes.put("IsInGame", Boolean.toString(bh.y.h().f().i()));
        backtraceData.attributes.put("BuildVariant", ok.h.a());
        backtraceData.attributes.put("BuildId", a1.K());
        backtraceData.attributes.put("RobloxChannel", a1.W());
        backtraceData.attributes.put("IxpEnrolledExperiments", m(new eh.c()));
        backtraceData.attributes.put("RolloutFlagsInVariant", m(new eh.d()));
        backtraceData.attributes.put("RolloutFlagsInControl", m(new eh.e()));
        UUID uuid = this.f13518d;
        if (uuid != null) {
            backtraceData.attributes.put("symbolication_id", uuid.toString());
        }
        f(context);
        return backtraceData;
    }

    public f() {
        this.f13518d = null;
        if (TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            ok.q.h("rbx.backtrace", "No symbolication ID provided.");
            return;
        }
        try {
            this.f13518d = UUID.fromString(BuildConfig.FLAVOR);
        } catch (IllegalArgumentException unused) {
            ok.q.h("rbx.backtrace", "Could not parse provided symbolication ID.");
        }
    }
}
