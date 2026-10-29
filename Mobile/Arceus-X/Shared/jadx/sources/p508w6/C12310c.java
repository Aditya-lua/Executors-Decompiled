package p508w6;

import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.InterfaceC7897n;

/* JADX INFO: renamed from: w6.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lw6/c;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/CompletionHandler;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lku/n;", "Lokhttp3/Response;", "continuation", "<init>", "(Lokhttp3/Call;Lku/n;)V", Payload.RESPONSE, "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "Lokio/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "cause", "a", "(Ljava/lang/Throwable;)V", "Lokhttp3/Call;", "b", "Lku/n;", "coil-network-okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12310c implements Callback, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Call call;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7897n<Response> continuation;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super okhttp3.Response> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12310c(@NotNull Call call, @NotNull InterfaceC7897n<? super Response> interfaceC7897n) {
        this.call = call;
        this.continuation = interfaceC7897n;
    }

    /* JADX INFO: renamed from: a */
    public void m45765a(@Nullable Throwable cause) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        m45765a(th2);
        return Unit.f29331a;
    }

    @Override // okhttp3.Callback
    public void onFailure(@NotNull Call call, @NotNull IOException e10) {
        if (call.getCanceled()) {
            return;
        }
        InterfaceC7897n<Response> interfaceC7897n = this.continuation;
        C7347n.Companion companion = C7347n.INSTANCE;
        interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(e10)));
    }

    @Override // okhttp3.Callback
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        this.continuation.resumeWith(C7347n.m30460b(response));
    }
}
