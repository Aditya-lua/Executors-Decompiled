package rv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.k0;
import java.net.Socket;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/net/Socket;", "Lrv/a;", "b", "(Ljava/net/Socket;)Lrv/a;", "Lew/k0;", "a", "(Lew/k0;)Lrv/a;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"rv/b$a", "Lrv/a;", BuildConfig.FLAVOR, "cancel", "()V", "Lew/k0;", "a", "Lew/k0;", "delegate", "Lew/g;", "b", "Lew/g;", "()Lew/g;", Payload.SOURCE, "Lew/f;", "c", "Lew/f;", "()Lew/f;", "sink", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements rv.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final k0 delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final ew.g source;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final ew.f sink;

        public a(k0 k0Var) {
            this.delegate = k0Var;
            this.source = ew.v.c(k0Var.getSource());
            this.sink = ew.v.b(k0Var.getSink());
        }

        @Override // ew.k0
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // ew.k0
        /* JADX INFO: renamed from: a, reason: from getter */
        public ew.g getSource() {
            return this.source;
        }

        @Override // ew.k0
        /* JADX INFO: renamed from: b, reason: from getter */
        public ew.f getSink() {
            return this.sink;
        }
    }

    @NotNull
    public static final rv.a a(@NotNull k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new a(k0Var);
    }

    @NotNull
    public static final rv.a b(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return a(ew.v.h(socket));
    }
}
