package ei;

import android.content.Context;
import jv.x;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    public class a implements jv.f<ResponseBody> {
        @Override // jv.f
        public void a(jv.d<ResponseBody> dVar, x<ResponseBody> xVar) {
        }

        @Override // jv.f
        public void b(jv.d<ResponseBody> dVar, Throwable th2) {
        }
    }

    public static void a(Context context, String str) {
        vk.g.d().g().e(new al.a(new jj.x().a(context, jj.r.k().n(context)), str)).B(new a());
    }
}
