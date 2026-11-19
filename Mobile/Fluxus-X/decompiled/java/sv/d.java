package sv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.k0;
import ew.l0;
import java.io.IOException;
import mv.f0;
import mv.h0;
import mv.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import rv.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'À\u0006\u0003"}, d2 = {"Lsv/d;", BuildConfig.FLAVOR, "Lmv/f0;", "request", BuildConfig.FLAVOR, "contentLength", "Lew/j0;", "j", "(Lmv/f0;J)Lew/j0;", BuildConfig.FLAVOR, "a", "(Lmv/f0;)V", "g", "()V", "b", BuildConfig.FLAVOR, "expectContinue", "Lmv/h0$a;", "e", "(Z)Lmv/h0$a;", "Lmv/h0;", Payload.RESPONSE, "f", "(Lmv/h0;)J", "Lew/l0;", "d", "(Lmv/h0;)Lew/l0;", "cancel", "Lsv/d$a;", "i", "()Lsv/d$a;", "carrier", "c", "()Z", "isResponseComplete", "Lew/k0;", "h", "()Lew/k0;", "socket", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lsv/d$a;", BuildConfig.FLAVOR, "Lrv/m;", "call", "Ljava/io/IOException;", "e", BuildConfig.FLAVOR, "g", "(Lrv/m;Ljava/io/IOException;)V", "d", "()V", "cancel", "Lmv/j0;", "f", "()Lmv/j0;", "route", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void cancel();

        void d();

        @NotNull
        /* JADX INFO: renamed from: f */
        j0 getRoute();

        void g(@NotNull m call, @Nullable IOException e10);
    }

    void a(@NotNull f0 request);

    void b();

    boolean c();

    void cancel();

    @NotNull
    l0 d(@NotNull h0 response);

    @Nullable
    h0.a e(boolean expectContinue);

    long f(@NotNull h0 response);

    void g();

    @NotNull
    k0 h();

    @NotNull
    /* JADX INFO: renamed from: i */
    a getCarrier();

    @NotNull
    ew.j0 j(@NotNull f0 request, long contentLength);
}
