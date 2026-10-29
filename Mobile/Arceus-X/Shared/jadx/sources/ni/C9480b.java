package ni;

import android.content.Context;
import fk.C5654c;
import okhttp3.ResponseBody;
import p151gk.C6124q;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7378f;
import p415rk.InterfaceC10891a;
import p493vk.C12225g;
import vi.C12217h;

/* JADX INFO: renamed from: ni.b */
/* JADX INFO: loaded from: classes2.dex */
public class C9480b implements InterfaceC10891a {

    /* JADX INFO: renamed from: a */
    public static String f34090a;

    /* JADX INFO: renamed from: ni.b$a */
    public class a implements InterfaceC7378f<ResponseBody> {
        public a() {
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<ResponseBody> interfaceC7376d, C7396x<ResponseBody> c7396x) {
            C6124q.m27057b("rbx.jni", "sendSessionReport() success:" + c7396x.m30657g());
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<ResponseBody> interfaceC7376d, Throwable th2) {
        }
    }

    public C9480b(Context context) {
        f34090a = context.getFilesDir().getAbsolutePath();
    }

    @Override // p415rk.InterfaceC10891a
    /* JADX INFO: renamed from: a */
    public String mo37346a() {
        return f34090a;
    }

    @Override // p415rk.InterfaceC10891a
    /* JADX INFO: renamed from: b */
    public void mo37347b(String str, String str2) {
        long j10;
        try {
            j10 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            C6124q.m27066k("rbx.jni", "sendSessionReport() could not parse placeId");
            j10 = -1;
        }
        C12225g.m45326d().mo45315a().m50308a(j10, str).mo30571B(new a());
    }

    @Override // p415rk.InterfaceC10891a
    /* JADX INFO: renamed from: c */
    public String mo37348c() {
        return Long.toString(C12217h.m45288e().m45296g());
    }

    @Override // p415rk.InterfaceC10891a
    /* JADX INFO: renamed from: d */
    public String mo37349d() {
        return C5654c.m25669c().m25679k();
    }

    @Override // p415rk.InterfaceC10891a
    /* JADX INFO: renamed from: e */
    public String mo37350e() {
        return "2.744.1081";
    }

    @Override // p415rk.InterfaceC10891a
    /* JADX INFO: renamed from: f */
    public void mo37351f(String str, String str2, String str3, long j10) {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
