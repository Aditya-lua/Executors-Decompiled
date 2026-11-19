package gb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends l9.a.AbstractC0421a {
    public /* synthetic */ r0(byte[] bArr) {
    }

    @Override // l9.a.AbstractC0421a
    public final /* bridge */ /* synthetic */ l9.a.f b(Context context, Looper looper, o9.f fVar, Object obj, m9.e eVar, m9.n nVar) {
        ea.x xVarD = (ea.x) obj;
        if (xVarD == null) {
            xVarD = ea.x.a().d();
        }
        ea.x xVar = xVarD;
        ha.c cVar = new ha.c(context, looper, fVar, xVar, eVar, nVar, ha.j.a());
        if (xVar.f13304o.a()) {
            AtomicReference atomicReference = ha.o.f18142g;
            cVar.l(ha.o.a((Application) context.getApplicationContext()));
        }
        return cVar;
    }
}
