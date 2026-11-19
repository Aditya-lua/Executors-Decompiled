package x6;

import av.n;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import mv.f;
import mv.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lx6/c;", "Lmv/f;", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkotlinx/coroutines/CompletionHandler;", "Lmv/e;", "call", "Lav/n;", "Lmv/h0;", "continuation", "<init>", "(Lmv/e;Lav/n;)V", Payload.RESPONSE, "onResponse", "(Lmv/e;Lmv/h0;)V", "Ljava/io/IOException;", "Lokio/IOException;", "e", "onFailure", "(Lmv/e;Ljava/io/IOException;)V", "cause", "a", "(Ljava/lang/Throwable;)V", "Lmv/e;", "b", "Lav/n;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv.e call;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<h0> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull mv.e eVar, @NotNull n<? super h0> nVar) {
        this.call = eVar;
        this.continuation = nVar;
    }

    public void a(@Nullable Throwable cause) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // p001kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        a(th2);
        return Unit.f21506a;
    }

    @Override // mv.f
    public void onFailure(@NotNull mv.e call, @NotNull IOException e10) {
        if (call.getCanceled()) {
            return;
        }
        n<h0> nVar = this.continuation;
        zt.n.Companion companion = zt.n.INSTANCE;
        nVar.resumeWith(zt.n.b(o.a(e10)));
    }

    @Override // mv.f
    public void onResponse(@NotNull mv.e call, @NotNull h0 response) {
        this.continuation.resumeWith(zt.n.b(response));
    }
}
