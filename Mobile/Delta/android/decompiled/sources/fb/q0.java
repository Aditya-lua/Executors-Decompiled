package fb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends k9.a.AbstractC0392a {
    public /* synthetic */ q0(byte[] bArr) {
    }

    @Override // k9.a.AbstractC0392a
    public final /* bridge */ /* synthetic */ k9.a.f b(Context context, Looper looper, n9.d dVar, Object obj, l9.e eVar, l9.n nVar) {
        da.o oVarD = (da.o) obj;
        if (oVarD == null) {
            oVarD = da.o.a().d();
        }
        da.o oVar = oVarD;
        ga.c cVar = new ga.c(context, looper, dVar, oVar, eVar, nVar, ga.j.a());
        if (oVar.f14533o.a()) {
            AtomicReference atomicReference = ga.o.f17966g;
            cVar.l(ga.o.a((Application) context.getApplicationContext()));
        }
        return cVar;
    }
}
