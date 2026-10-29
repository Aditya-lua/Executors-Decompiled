package p493vk;

import android.content.Context;
import android.os.Build;
import okhttp3.OkHttpClient;
import p107el.C5160a;
import p520wk.C12481c;
import p520wk.C12489k;
import p520wk.InterfaceC12479a;
import p520wk.InterfaceC12484f;

/* JADX INFO: renamed from: vk.g */
/* JADX INFO: loaded from: classes2.dex */
public class C12225g {

    /* JADX INFO: renamed from: a */
    public static String f43093a;

    /* JADX INFO: renamed from: b */
    public static C12220b f43094b;

    /* JADX INFO: renamed from: c */
    public static OkHttpClient f43095c;

    /* JADX INFO: renamed from: d */
    public static InterfaceC12484f f43096d;

    /* JADX INFO: renamed from: e */
    public static InterfaceC12224f f43097e = new C12219a();

    /* JADX INFO: renamed from: f */
    public static InterfaceC12222d f43098f;

    /* JADX INFO: renamed from: a */
    public static String m45323a(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new C12227i().m45346m(C5160a.m23999c(context)).m45348o(C5160a.m24006j(context)).m45340g(C5160a.m24003g(context)).m45339f(C5160a.m24002f(context)).m45337d(C5160a.m23998b(z10)).m45334a(Build.VERSION.RELEASE).m45350q(str2).m45349p(str).m45338e(str3).m45335b(str4).m45345l(z10).m45343j(z11).m45342i(z12).m45344k(z13).m45336c();
    }

    /* JADX INFO: renamed from: b */
    public static OkHttpClient m45324b() {
        if (f43095c == null) {
            synchronized (C12225g.class) {
                try {
                    if (f43095c == null) {
                        if (f43096d == null) {
                            f43096d = new C12481c();
                        }
                        f43095c = f43096d.mo46742a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f43095c;
    }

    /* JADX INFO: renamed from: c */
    public static C12220b m45325c() {
        return f43094b;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC12222d m45326d() {
        if (f43098f == null) {
            synchronized (C12225g.class) {
                try {
                    if (f43098f == null) {
                        f43098f = f43097e.mo45312a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f43098f;
    }

    /* JADX INFO: renamed from: e */
    public static String m45327e() {
        return f43093a;
    }

    /* JADX INFO: renamed from: f */
    public static void m45328f(InterfaceC12479a interfaceC12479a) {
        C12489k.m46787b(interfaceC12479a);
    }

    /* JADX INFO: renamed from: g */
    public static void m45329g(C12220b c12220b) {
        f43094b = c12220b;
    }

    /* JADX INFO: renamed from: h */
    public static void m45330h(InterfaceC12484f interfaceC12484f) {
        f43096d = interfaceC12484f;
    }

    /* JADX INFO: renamed from: i */
    public static void m45331i(InterfaceC12224f interfaceC12224f) {
        f43097e = interfaceC12224f;
        synchronized (C12225g.class) {
            f43098f = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m45332j(String str) {
        f43093a = str;
    }
}
