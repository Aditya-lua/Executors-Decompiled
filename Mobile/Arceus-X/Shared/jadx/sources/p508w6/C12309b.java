package p508w6;

import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7905p;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.C10346h;

/* JADX INFO: renamed from: w6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", "a", "(Lokhttp3/Call;Lnt/b;)Ljava/lang/Object;", "coil-network-okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12309b {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m45764a(@NotNull Call call, @NotNull InterfaceC9557b<? super Response> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        C12310c c12310c = new C12310c(call, c7905p);
        call.enqueue(c12310c);
        c7905p.mo32815n(c12310c);
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }
}
