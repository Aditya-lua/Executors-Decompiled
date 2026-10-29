package okhttp3.internal.connection;

import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu.b0;
import xu.f;
import xu.g;
import xu.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Lxu/q0;", "(Lxu/q0;)Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BufferedSocketKt {
    @NotNull
    public static final BufferedSocket asBufferedSocket(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return asBufferedSocket(b0.h(socket));
    }

    @NotNull
    public static final BufferedSocket asBufferedSocket(@NotNull q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        return new BufferedSocket(q0Var) { // from class: okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket.1
            private final q0 delegate;
            private final f sink;
            private final g source;

            {
                this.delegate = q0Var;
                this.source = b0.c(q0Var.getSource());
                this.sink = b0.b(q0Var.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, xu.q0
            public void cancel() {
                this.delegate.cancel();
            }

            @Override // okhttp3.internal.connection.BufferedSocket, xu.q0
            public f getSink() {
                return this.sink;
            }

            @Override // okhttp3.internal.connection.BufferedSocket, xu.q0
            public g getSource() {
                return this.source;
            }
        };
    }
}
