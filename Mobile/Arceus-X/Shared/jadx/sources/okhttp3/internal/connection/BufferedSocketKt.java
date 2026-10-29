package okhttp3.internal.connection;

import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.C12919b0;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12949q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Lxu/q0;", "(Lxu/q0;)Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class BufferedSocketKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public static final BufferedSocket asBufferedSocket(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return asBufferedSocket(C12919b0.m47966h(socket));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NotNull
    public static final BufferedSocket asBufferedSocket(@NotNull InterfaceC12949q0 interfaceC12949q0) {
        Intrinsics.checkNotNullParameter(interfaceC12949q0, "<this>");
        return new BufferedSocket(interfaceC12949q0) { // from class: okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket.1
            private final InterfaceC12949q0 delegate;
            private final InterfaceC12926f sink;
            private final InterfaceC12928g source;

            {
                this.delegate = interfaceC12949q0;
                this.source = C12919b0.m47961c(interfaceC12949q0.getSource());
                this.sink = C12919b0.m47960b(interfaceC12949q0.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, p560xu.InterfaceC12949q0
            public void cancel() {
                this.delegate.cancel();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getSink()Lxu/p0; */
            @Override // okhttp3.internal.connection.BufferedSocket, p560xu.InterfaceC12949q0
            public InterfaceC12926f getSink() {
                return this.sink;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getSource()Lxu/r0; */
            @Override // okhttp3.internal.connection.BufferedSocket, p560xu.InterfaceC12949q0
            public InterfaceC12928g getSource() {
                return this.source;
            }
        };
    }
}
