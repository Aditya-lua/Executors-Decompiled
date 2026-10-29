package p121f7;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import p211j7.C7037c;
import p211j7.InterfaceC7036b;
import p354p7.C10171b;
import p354p7.C10176g;
import p354p7.C10177h;
import p354p7.InterfaceC10174e;
import p354p7.InterfaceC10175f;
import p431s7.C11191g;

/* JADX INFO: renamed from: f7.e */
/* JADX INFO: loaded from: classes3.dex */
public class C5444e {

    /* JADX INFO: renamed from: a */
    public static boolean f21031a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f21032b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f21033c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f21034d = true;

    /* JADX INFO: renamed from: f */
    public static InterfaceC10175f f21036f;

    /* JADX INFO: renamed from: g */
    public static InterfaceC10174e f21037g;

    /* JADX INFO: renamed from: h */
    public static volatile C10177h f21038h;

    /* JADX INFO: renamed from: i */
    public static volatile C10176g f21039i;

    /* JADX INFO: renamed from: j */
    public static ThreadLocal<C11191g> f21040j;

    /* JADX INFO: renamed from: e */
    public static EnumC5436a f21035e = EnumC5436a.AUTOMATIC;

    /* JADX INFO: renamed from: k */
    public static InterfaceC7036b f21041k = new C7037c();

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (wrap java.io.File:0x0002: INVOKE (r2v0 android.content.Context) VIRTUAL call: android.content.Context.getCacheDir():java.io.File A[MD:():java.io.File (c), WRAPPED])
      ("lottie_network_cache")
     A[MD:(java.io.File, java.lang.String):void (c)] call: java.io.File.<init>(java.io.File, java.lang.String):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ File m24922a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    /* JADX INFO: renamed from: b */
    public static void m24923b(String str) {
        if (f21032b) {
            m24928g().m42155a(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m24924c(String str) {
        if (f21032b) {
            return m24928g().m42156b(str);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC5436a m24925d() {
        return f21035e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24926e() {
        return f21034d;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC7036b m24927f() {
        return f21041k;
    }

    /* JADX INFO: renamed from: g */
    public static C11191g m24928g() {
        C11191g c11191g = f21040j.get();
        if (c11191g != null) {
            return c11191g;
        }
        C11191g c11191g2 = new C11191g();
        f21040j.set(c11191g2);
        return c11191g2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24929h() {
        return f21032b;
    }

    /* JADX INFO: renamed from: i */
    public static C10176g m24930i(@NonNull Context context) {
        C10176g c10176g;
        if (!f21033c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        C10176g c10176g2 = f21039i;
        if (c10176g2 != null) {
            return c10176g2;
        }
        synchronized (C10176g.class) {
            try {
                c10176g = f21039i;
                if (c10176g == null) {
                    InterfaceC10174e interfaceC10174e = f21037g;
                    if (interfaceC10174e == null) {
                        interfaceC10174e = new InterfaceC10174e() { // from class: f7.d
                            @Override // p354p7.InterfaceC10174e
                            /* JADX INFO: renamed from: a */
                            public final File mo24921a() {
                                return C5444e.m24922a(applicationContext);
                            }
                        };
                    }
                    c10176g = new C10176g(interfaceC10174e);
                    f21039i = c10176g;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10176g;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static C10177h m24931j(@NonNull Context context) {
        C10177h c10177h;
        C10177h c10177h2 = f21038h;
        if (c10177h2 != null) {
            return c10177h2;
        }
        synchronized (C10177h.class) {
            try {
                c10177h = f21038h;
                if (c10177h == null) {
                    C10176g c10176gM24930i = m24930i(context);
                    InterfaceC10175f c10171b = f21036f;
                    if (c10171b == null) {
                        c10171b = new C10171b();
                    }
                    c10177h = new C10177h(c10176gM24930i, c10171b);
                    f21038h = c10177h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10177h;
    }
}
