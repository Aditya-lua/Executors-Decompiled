package w6;

import iu.p;
import kotlin.Metadata;
import nt.h;
import okhttp3.Call;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", "a", "(Lokhttp3/Call;Llt/b;)Ljava/lang/Object;", "coil-network-okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    @Nullable
    public static final Object a(@NotNull Call call, @NotNull lt.b<? super Response> bVar) {
        p pVar = new p(mt.b.c(bVar), 1);
        pVar.H();
        c cVar = new c(call, pVar);
        call.enqueue(cVar);
        pVar.o(cVar);
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            h.c(bVar);
        }
        return objA;
    }
}
