package p104ei;

import al.C0357b;
import okhttp3.ResponseBody;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7378f;
import p493vk.C12225g;

/* JADX INFO: renamed from: ei.o */
/* JADX INFO: loaded from: classes2.dex */
public class C5137o {

    /* JADX INFO: renamed from: ei.o$a */
    public class a implements InterfaceC7378f<ResponseBody> {
        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<ResponseBody> interfaceC7376d, C7396x<ResponseBody> c7396x) {
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<ResponseBody> interfaceC7376d, Throwable th2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23947a(String str, String str2, String str3) {
        C12225g.m45326d().mo45321g().m50318i(new C0357b(str, str2, str3)).mo30571B(new a());
    }
}
