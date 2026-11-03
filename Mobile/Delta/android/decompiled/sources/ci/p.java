package ci;

import android.content.Context;
import hv.x;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    public class a implements hv.f<ResponseBody> {
        @Override // hv.f
        public void a(hv.d<ResponseBody> dVar, x<ResponseBody> xVar) {
        }

        @Override // hv.f
        public void b(hv.d<ResponseBody> dVar, Throwable th2) {
        }
    }

    public static void a(Context context, String str) {
        tk.g.d().f().b(new yk.a(new hj.x().a(context, hj.r.k().n(context)), str)).m(new a());
    }
}
