package p104ei;

import al.C0356a;
import android.content.Context;
import okhttp3.ResponseBody;
import p222jj.C7193r;
import p222jj.C7199x;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7378f;
import p493vk.C12225g;

/* JADX INFO: renamed from: ei.p */
/* JADX INFO: loaded from: classes2.dex */
public class C5138p {

    /* JADX INFO: renamed from: ei.p$a */
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
    public static void m23950a(Context context, String str) {
        C12225g.m45326d().mo45321g().m50314e(new C0356a(new C7199x().m30120a(context, C7193r.m30069k().m30083n(context)), str)).mo30571B(new a());
    }
}
