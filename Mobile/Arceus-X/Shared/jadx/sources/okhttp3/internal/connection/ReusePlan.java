package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0011"}, m31665d2 = {"Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "connection", "Lokhttp3/internal/connection/RealConnection;", "<init>", "(Lokhttp3/internal/connection/RealConnection;)V", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "isReady", "", "()Z", "connectTcp", "", "connectTlsEtc", "handleSuccess", "cancel", "retry", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ReusePlan implements RoutePlanner.Plan {

    @NotNull
    private final RealConnection connection;
    private final boolean isReady;

    public ReusePlan(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        this.isReady = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTcp, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.ConnectResult mo50955connectTcp() {
        return (RoutePlanner.ConnectResult) connectTcp();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTlsEtc, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RoutePlanner.ConnectResult mo50956connectTlsEtc() {
        return (RoutePlanner.ConnectResult) connectTlsEtc();
    }

    @NotNull
    public final RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* JADX INFO: renamed from: handleSuccess */
    public RealConnection mo50952handleSuccess() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: isReady, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: retry */
    public /* bridge */ /* synthetic */ RoutePlanner.Plan mo50953retry() {
        return (RoutePlanner.Plan) retry();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cancel()V */
    /* JADX DEBUG: Possible override for method okhttp3.internal.connection.RoutePlanner.Plan.cancel()V */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    @NotNull
    /* JADX INFO: renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public Void mo50951cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method okhttp3.internal.connection.RoutePlanner.Plan.connectTcp()Lokhttp3/internal/connection/RoutePlanner$ConnectResult; */
    @NotNull
    public Void connectTcp() {
        throw new IllegalStateException("already connected");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method okhttp3.internal.connection.RoutePlanner.Plan.connectTlsEtc()Lokhttp3/internal/connection/RoutePlanner$ConnectResult; */
    @NotNull
    public Void connectTlsEtc() {
        throw new IllegalStateException("already connected");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method okhttp3.internal.connection.RoutePlanner.Plan.retry()Lokhttp3/internal/connection/RoutePlanner$Plan; */
    @NotNull
    public Void retry() {
        throw new IllegalStateException("unexpected retry");
    }
}
