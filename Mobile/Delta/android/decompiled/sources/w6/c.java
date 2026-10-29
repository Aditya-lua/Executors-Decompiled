package w6;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ku.n;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lw6/c;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/CompletionHandler;", "Lokhttp3/Call;", "call", "Lku/n;", "Lokhttp3/Response;", "continuation", "<init>", "(Lokhttp3/Call;Lku/n;)V", Payload.RESPONSE, "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "Lokio/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "cause", "a", "(Ljava/lang/Throwable;)V", "Lokhttp3/Call;", "b", "Lku/n;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements Callback, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Call call;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<Response> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Call call, @NotNull n<? super Response> nVar) {
        this.call = call;
        this.continuation = nVar;
    }

    public void a(@Nullable Throwable cause) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        a(th2);
        return Unit.f22483a;
    }

    @Override // okhttp3.Callback
    public void onFailure(@NotNull Call call, @NotNull IOException e10) {
        if (call.getCanceled()) {
            return;
        }
        n<Response> nVar = this.continuation;
        jt.n.Companion companion = jt.n.INSTANCE;
        nVar.resumeWith(jt.n.b(o.a(e10)));
    }

    @Override // okhttp3.Callback
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        this.continuation.resumeWith(jt.n.b(response));
    }
}
