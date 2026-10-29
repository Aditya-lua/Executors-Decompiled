package v6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import t6.i;
import t6.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt6/m$a;", "d", "()Lt6/m$a;", "Lokhttp3/Call$Factory;", "Lt6/i;", "c", "(Lokhttp3/Call$Factory;)Lt6/i;", "coil-network-okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final i b() {
        return c(new OkHttpClient());
    }

    @NotNull
    public static final i c(@NotNull Call.Factory factory) {
        return w6.a.b(w6.a.c(factory));
    }

    @NotNull
    public static final m.a d() {
        return new m.a(new Function0() { // from class: v6.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.b();
            }
        }, null, null, 6, null);
    }
}
