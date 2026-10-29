package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.h0;
import xu.l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\r*\u00020\t2\n\u0010\f\u001a\u00060\nR\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0016\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u0010*\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxu/h0;", "file", "", "maxSize", "Lxu/l;", "fileSystem", "Lokhttp3/Cache;", "buildCache", "(Lxu/h0;JLxu/l;)Lokhttp3/Cache;", "Lokhttp3/Dispatcher;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "call", "", "finishedAccessor", "(Lokhttp3/Dispatcher;Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Lokhttp3/internal/connection/RealConnection;", "value", "getIdleAtNsAccessor", "(Lokhttp3/internal/connection/RealConnection;)J", "setIdleAtNsAccessor", "(Lokhttp3/internal/connection/RealConnection;J)V", "idleAtNsAccessor", "Lokhttp3/Response;", "Lokhttp3/internal/connection/Exchange;", "getExchangeAccessor", "(Lokhttp3/Response;)Lokhttp3/internal/connection/Exchange;", "exchangeAccessor", "getConnectionAccessor", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/connection/RealConnection;", "connectionAccessor", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class NativeImageTestsAccessorsKt {
    @NotNull
    public static final Cache buildCache(@NotNull h0 file, long j10, @NotNull l fileSystem) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        return new Cache(fileSystem, file, j10);
    }

    public static final void finishedAccessor(@NotNull Dispatcher dispatcher, @NotNull RealCall.AsyncCall call) {
        Intrinsics.checkNotNullParameter(dispatcher, "<this>");
        Intrinsics.checkNotNullParameter(call, "call");
        dispatcher.finished$okhttp(call);
    }

    @NotNull
    public static final RealConnection getConnectionAccessor(@NotNull Exchange exchange) {
        Intrinsics.checkNotNullParameter(exchange, "<this>");
        return exchange.getConnection$okhttp();
    }

    @Nullable
    public static final Exchange getExchangeAccessor(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.getExchange();
    }

    public static final long getIdleAtNsAccessor(@NotNull RealConnection realConnection) {
        Intrinsics.checkNotNullParameter(realConnection, "<this>");
        return realConnection.getIdleAtNs();
    }

    public static final void setIdleAtNsAccessor(@NotNull RealConnection realConnection, long j10) {
        Intrinsics.checkNotNullParameter(realConnection, "<this>");
        realConnection.setIdleAtNs(j10);
    }
}
