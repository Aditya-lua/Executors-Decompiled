package vg;

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
import fk.C5654c;
import gt.AbstractC6240a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Supplier;
import javax.net.ssl.SSLException;
import p151gk.C6115h;
import p151gk.C6124q;
import p210j6.C7032a;
import p210j6.C7033b;
import p306nb.C9261qe;
import sg.C11295a1;
import sg.C11370y;
import sm.C11416c;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: renamed from: vg.e */
/* JADX INFO: loaded from: classes2.dex */
public class C12175e {

    /* JADX INFO: renamed from: a */
    public volatile C7032a f42845a;

    /* JADX INFO: renamed from: b */
    public volatile int f42846b;

    /* JADX INFO: renamed from: c */
    public volatile int f42847c;

    /* JADX INFO: renamed from: d */
    public UUID f42848d;

    /* JADX INFO: renamed from: vg.e$a */
    public class a extends ArrayList<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f42849a;

        public a(String str) {
            this.f42849a = str;
            add(str);
        }
    }

    /* JADX INFO: renamed from: vg.e$b */
    public class b implements OnApplicationNotRespondingEvent {

        /* JADX INFO: renamed from: a */
        public final C7032a f42851a;

        public b(C7032a c7032a) {
            this.f42851a = c7032a;
        }

        /* JADX INFO: renamed from: a */
        public static String m45065a(boolean z10) {
            if (C11295a1.m42471q0()) {
                return z10 ? "Quest-Backtrace-ANRException-Sent" : "Quest-Backtrace-ANRException-NotSent";
            }
            return z10 ? "Android-Backtrace-ANRException-Sent" : "Android-Backtrace-ANRException-NotSent";
        }

        /* JADX INFO: renamed from: b */
        public final boolean m45066b() {
            int iRandom = (int) (Math.random() * 100.0d);
            C12175e.m45053b(C12175e.this);
            return iRandom < C12175e.this.f42847c;
        }

        /* JADX INFO: renamed from: c */
        public final void m45067c(boolean z10) {
            C12216g.m45228b().m45278q(m45065a(z10));
            if (C11295a1.m42449f0()) {
                return;
            }
            C12216g.m45228b().m45278q(m45065a(z10) + "-Channel-" + C11295a1.m42426W());
        }

        @Override // backtraceio.library.watchdog.OnApplicationNotRespondingEvent
        public void onEvent(BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException) {
            C6124q.m27057b("rbx.backtrace", "OnApplicationNotRespondingEvent()");
            try {
                String[] activeShaders = NativeGLInterface.getActiveShaders();
                if (activeShaders != null) {
                    for (int i10 = 0; i10 < activeShaders.length; i10++) {
                        String str = activeShaders[i10];
                        if (str != null && !str.isEmpty()) {
                            this.f42851a.getAttributes().put(String.format("GfxActiveShader%d", Integer.valueOf(i10)), activeShaders[i10]);
                        }
                    }
                }
            } catch (Throwable th2) {
                C6124q.m27066k("rbx.backtrace", "Skipping active shaders due to " + th2);
            }
            if (!m45066b()) {
                m45067c(false);
            } else {
                m45067c(true);
                this.f42851a.m29723g(backtraceWatchdogTimeoutException);
            }
        }
    }

    /* JADX INFO: renamed from: vg.e$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C12175e f42853a = new C12175e();
    }

    /* JADX INFO: renamed from: vg.e$d */
    public static final class d extends AbstractC6240a {
    }

    /* JADX INFO: renamed from: vg.e$e */
    public class e implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a */
        public final Thread.UncaughtExceptionHandler f42854a = Thread.getDefaultUncaughtExceptionHandler();

        /* JADX INFO: renamed from: b */
        public final Thread.UncaughtExceptionHandler f42855b;

        public e(C7032a c7032a) {
            BacktraceExceptionHandler.enable(c7032a);
            this.f42855b = Thread.getDefaultUncaughtExceptionHandler();
        }

        /* JADX INFO: renamed from: a */
        public static String m45069a(boolean z10) {
            if (C11295a1.m42471q0()) {
                return z10 ? "Quest-Backtrace-UnhandledException-Sent" : "Quest-Backtrace-UnhandledException-NotSent";
            }
            return z10 ? "Android-Backtrace-UnhandledException-Sent" : "Android-Backtrace-UnhandledException-NotSent";
        }

        /* JADX INFO: renamed from: b */
        public final boolean m45070b(Throwable th2) {
            return this.f42855b != null && (th2 instanceof Exception);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m45071c() {
            int iRandom = (int) (Math.random() * 100.0d);
            C12175e.m45053b(C12175e.this);
            return iRandom < C12175e.this.f42846b;
        }

        /* JADX INFO: renamed from: d */
        public final void m45072d(Throwable th2) {
            try {
                C11416c.m42773i(new C11416c.a("clientcrash", C9261qe.m36724a(new Object[]{TelemetryBackend.EVENT_INGEST})).m42774d(), new C11416c.b().mo42758b("crash_uploader", "backtrace_android_java").mo42758b("rbx_crash_reason", th2.getClass().getSimpleName()).mo42758b("ixp_enrolled_experiments", C12175e.m45058m(new C12170b())).mo42758b("rollout_flags_in_variant", C12175e.m45058m(new C12172c())).mo42758b("rollout_flags_in_control", C12175e.m45058m(new C12174d())).mo42764h(TelemetryStandardizedField.ADD_OS_INFO).m42785l());
            } catch (Throwable th3) {
                C6124q.m27066k("rbx.backtrace", "Failed to report client crash telemetry: " + th3);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m45073e(boolean z10) {
            C12216g.m45228b().m45278q(m45069a(z10));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m45074f(Throwable th2) {
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
            if (m45074f(th2)) {
                C6124q.m27057b("rbx.backtrace", "Suppressing known exception " + th2.getClass().getName());
                return;
            }
            if (C11659h.m43403a().mo43706q4()) {
                m45072d(th2);
            }
            if (m45071c() && m45070b(th2)) {
                C6124q.m27057b("rbx.backtrace", "uncaughtException() using the custom handler: " + this.f42855b);
                m45073e(true);
                this.f42855b.uncaughtException(thread, th2);
                return;
            }
            C6124q.m27057b("rbx.backtrace", "uncaughtException() using the default handler: " + this.f42854a);
            if (this.f42854a != null) {
                m45073e(false);
                this.f42854a.uncaughtException(thread, th2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ d m45053b(C12175e c12175e) {
        c12175e.getClass();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static C12175e m45057h() {
        return c.f42853a;
    }

    /* JADX INFO: renamed from: m */
    public static String m45058m(Supplier<String> supplier) {
        try {
            String str = supplier.get();
            return str != null ? str : "";
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m45059f(Context context) {
        try {
            Process processStart = new ProcessBuilder("logcat", "-t", C11659h.m43403a().mo43725t2(), "-v", "time").start();
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
            C6124q.m27066k("rbx.backtrace", "Bypass Java log due to " + e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public C7032a m45060g() {
        return this.f42845a;
    }

    /* JADX INFO: renamed from: i */
    public void m45061i(Context context) {
        m45062j(context, C11659h.m43403a().mo43479K4(), C11659h.m43403a().mo43746w2(), C11659h.m43403a().mo43720s4(), C11659h.m43403a().mo43589a4(), C11659h.m43403a().mo43508P());
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m45062j(final Context context, String str, String str2, int i10, int i11, int i12) {
        try {
            if (this.f42845a == null) {
                this.f42846b = i11;
                this.f42847c = i12;
                C7032a c7032a = new C7032a(context, new C7033b(str, str2), new a(context.getCacheDir() + "/androidLog.txt"));
                if (this.f42848d != null) {
                    c7032a.enableProguard();
                }
                c7032a.m29718b(i10, new b(c7032a));
                c7032a.setOnBeforeSendEventListener(new OnBeforeSendEventListener() { // from class: vg.a
                    @Override // backtraceio.library.events.OnBeforeSendEventListener
                    public final BacktraceData onEvent(BacktraceData backtraceData) {
                        return this.f42799a.m45064l(context, backtraceData);
                    }
                });
                Thread.setDefaultUncaughtExceptionHandler(new e(c7032a));
                this.f42845a = c7032a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m45063k(Context context, BacktraceInitValues backtraceInitValues) {
        m45062j(context, backtraceInitValues.getUploadUrl(), backtraceInitValues.getUploadToken(), backtraceInitValues.getAnrMaximumTimeout(), backtraceInitValues.getJavaCrashUploadPercentage(), backtraceInitValues.getJavaAnrUploadPercentage());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ BacktraceData m45064l(Context context, BacktraceData backtraceData) {
        backtraceData.attributes.put("BaseUrl", C11295a1.m42450g());
        backtraceData.attributes.put("UserId", Long.toString(C5654c.m25669c().m25678j()));
        backtraceData.attributes.put("IsInGame", Boolean.toString(C11370y.m42581h().m42587f().m15275i()));
        backtraceData.attributes.put("BuildVariant", C6115h.m27036a());
        backtraceData.attributes.put("BuildId", C11295a1.m42402K());
        backtraceData.attributes.put("RobloxChannel", C11295a1.m42426W());
        backtraceData.attributes.put("IxpEnrolledExperiments", m45058m(new C12170b()));
        backtraceData.attributes.put("RolloutFlagsInVariant", m45058m(new C12172c()));
        backtraceData.attributes.put("RolloutFlagsInControl", m45058m(new C12174d()));
        UUID uuid = this.f42848d;
        if (uuid != null) {
            backtraceData.attributes.put("symbolication_id", uuid.toString());
        }
        m45059f(context);
        return backtraceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12175e() {
        this.f42848d = null;
        if (TextUtils.isEmpty("")) {
            C6124q.m27063h("rbx.backtrace", "No symbolication ID provided.");
            return;
        }
        try {
            this.f42848d = UUID.fromString("");
        } catch (IllegalArgumentException unused) {
            C6124q.m27063h("rbx.backtrace", "Could not parse provided symbolication ID.");
        }
    }
}
