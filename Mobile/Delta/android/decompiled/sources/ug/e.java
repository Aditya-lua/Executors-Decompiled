package ug;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import backtraceio.library.events.OnBeforeSendEventListener;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceExceptionHandler;
import backtraceio.library.watchdog.BacktraceWatchdogTimeoutException;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
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
import nb.qe;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile j6.a f32836a;
    public volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f32837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UUID f32838d;

    public class a extends ArrayList<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32839a;

        public a(String str) {
            this.f32839a = str;
            add(str);
        }
    }

    public class b implements OnApplicationNotRespondingEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j6.a f32840a;

        public b(j6.a aVar) {
            this.f32840a = aVar;
        }

        public static String a(boolean z10) {
            if (a1.q0()) {
                return z10 ? "Quest-Backtrace-ANRException-Sent" : "Quest-Backtrace-ANRException-NotSent";
            }
            return z10 ? "Android-Backtrace-ANRException-Sent" : "Android-Backtrace-ANRException-NotSent";
        }

        public final boolean b() {
            int iRandom = (int) (Math.random() * 100.0d);
            e.b(e.this);
            return iRandom < e.this.f32837c;
        }

        public final void c(boolean z10) {
            ti.g.b().q(a(z10));
            if (a1.f0()) {
                return;
            }
            ti.g.b().q(a(z10) + "-Channel-" + a1.W());
        }

        @Override // backtraceio.library.watchdog.OnApplicationNotRespondingEvent
        public void onEvent(BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException) {
            ek.q.b("rbx.backtrace", "OnApplicationNotRespondingEvent()");
            try {
                String[] activeShaders = NativeGLInterface.getActiveShaders();
                if (activeShaders != null) {
                    for (int i10 = 0; i10 < activeShaders.length; i10++) {
                        String str = activeShaders[i10];
                        if (str != null && !str.isEmpty()) {
                            this.f32840a.getAttributes().put(String.format("GfxActiveShader%d", Integer.valueOf(i10)), activeShaders[i10]);
                        }
                    }
                }
            } catch (Throwable th2) {
                ek.q.k("rbx.backtrace", "Skipping active shaders due to " + th2);
            }
            if (!b()) {
                c(false);
            } else {
                c(true);
                this.f32840a.g(backtraceWatchdogTimeoutException);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32841a = new e();
    }

    public static final class d extends et.a {
    }

    /* JADX INFO: renamed from: ug.e$e, reason: collision with other inner class name */
    public class C0593e implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Thread.UncaughtExceptionHandler f32842a = Thread.getDefaultUncaughtExceptionHandler();
        public final Thread.UncaughtExceptionHandler b;

        public C0593e(j6.a aVar) {
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
            e.b(e.this);
            return iRandom < e.this.b;
        }

        public final void d(Throwable th2) {
            try {
                qm.c.i(new qm.c.a("clientcrash", qe.a(new Object[]{TelemetryBackend.EVENT_INGEST})).d(), new qm.c.b().b("crash_uploader", "backtrace_android_java").b("rbx_crash_reason", th2.getClass().getSimpleName()).b("ixp_enrolled_experiments", e.m(new ug.b())).b("rollout_flags_in_variant", e.m(new ug.c())).b("rollout_flags_in_control", e.m(new ug.d())).h(TelemetryStandardizedField.ADD_OS_INFO).l());
            } catch (Throwable th3) {
                ek.q.k("rbx.backtrace", "Failed to report client crash telemetry: " + th3);
            }
        }

        public final void e(boolean z10) {
            ti.g.b().q(a(z10));
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
                ek.q.b("rbx.backtrace", "Suppressing known exception " + th2.getClass().getName());
                return;
            }
            if (rh.h.a().w4()) {
                d(th2);
            }
            if (c() && b(th2)) {
                ek.q.b("rbx.backtrace", "uncaughtException() using the custom handler: " + this.b);
                e(true);
                this.b.uncaughtException(thread, th2);
                return;
            }
            ek.q.b("rbx.backtrace", "uncaughtException() using the default handler: " + this.f32842a);
            if (this.f32842a != null) {
                e(false);
                this.f32842a.uncaughtException(thread, th2);
            }
        }
    }

    public static /* bridge */ /* synthetic */ d b(e eVar) {
        eVar.getClass();
        return null;
    }

    public static e h() {
        return c.f32841a;
    }

    public static String m(Supplier<String> supplier) {
        try {
            String str = supplier.get();
            return str != null ? str : "";
        } catch (Throwable unused) {
        }
    }

    public final void f(Context context) {
        try {
            Process processStart = new ProcessBuilder("logcat", "-t", rh.h.a().z2(), "-v", "time").start();
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
            ek.q.k("rbx.backtrace", "Bypass Java log due to " + e10);
        }
    }

    public j6.a g() {
        return this.f32836a;
    }

    public void i(Context context) {
        j(context, rh.h.a().R4(), rh.h.a().C2(), rh.h.a().y4(), rh.h.a().g4(), rh.h.a().O());
    }

    public final synchronized void j(final Context context, String str, String str2, int i10, int i11, int i12) {
        try {
            if (this.f32836a == null) {
                this.b = i11;
                this.f32837c = i12;
                j6.a aVar = new j6.a(context, new j6.b(str, str2), new a(context.getCacheDir() + "/androidLog.txt"));
                if (this.f32838d != null) {
                    aVar.enableProguard();
                }
                aVar.b(i10, new b(aVar));
                aVar.setOnBeforeSendEventListener(new OnBeforeSendEventListener() { // from class: ug.a
                    @Override // backtraceio.library.events.OnBeforeSendEventListener
                    public final BacktraceData onEvent(BacktraceData backtraceData) {
                        return this.f32795a.l(context, backtraceData);
                    }
                });
                Thread.setDefaultUncaughtExceptionHandler(new C0593e(aVar));
                this.f32836a = aVar;
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
        backtraceData.attributes.put("UserId", Long.toString(dk.c.c().j()));
        backtraceData.attributes.put("IsInGame", Boolean.toString(rg.y.h().f().i()));
        backtraceData.attributes.put("BuildVariant", ek.h.a());
        backtraceData.attributes.put("BuildId", a1.K());
        backtraceData.attributes.put("RobloxChannel", a1.W());
        backtraceData.attributes.put("IxpEnrolledExperiments", m(new ug.b()));
        backtraceData.attributes.put("RolloutFlagsInVariant", m(new ug.c()));
        backtraceData.attributes.put("RolloutFlagsInControl", m(new ug.d()));
        UUID uuid = this.f32838d;
        if (uuid != null) {
            backtraceData.attributes.put("symbolication_id", uuid.toString());
        }
        f(context);
        return backtraceData;
    }

    public e() {
        this.f32838d = null;
        if (TextUtils.isEmpty("")) {
            ek.q.h("rbx.backtrace", "No symbolication ID provided.");
            return;
        }
        try {
            this.f32838d = UUID.fromString("");
        } catch (IllegalArgumentException unused) {
            ek.q.h("rbx.backtrace", "Could not parse provided symbolication ID.");
        }
    }
}
