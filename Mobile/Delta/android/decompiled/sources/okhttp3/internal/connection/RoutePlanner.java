package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner;", "", "", "isCanceled", "()Z", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/RealConnection;", "failedConnection", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "address", "Lkotlin/collections/i;", "getDeferredPlans", "()Lkotlin/collections/i;", "deferredPlans", "Plan", "ConnectResult", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RoutePlanner {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\u0000H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "isReady", "", "()Z", "connectTcp", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "handleSuccess", "Lokhttp3/internal/connection/RealConnection;", "cancel", "", "retry", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Plan {
        /* JADX INFO: renamed from: cancel */
        void mo217cancel();

        @NotNull
        /* JADX INFO: renamed from: connectTcp */
        ConnectResult mo221connectTcp();

        @NotNull
        /* JADX INFO: renamed from: connectTlsEtc */
        ConnectResult mo222connectTlsEtc();

        @NotNull
        /* JADX INFO: renamed from: handleSuccess */
        RealConnection mo218handleSuccess();

        boolean isReady();

        @Nullable
        /* JADX INFO: renamed from: retry */
        Plan mo219retry();
    }

    static /* synthetic */ boolean hasNext$default(RoutePlanner routePlanner, RealConnection realConnection, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            realConnection = null;
        }
        return routePlanner.hasNext(realConnection);
    }

    @NotNull
    Address getAddress();

    @NotNull
    i<Plan> getDeferredPlans();

    boolean hasNext(@Nullable RealConnection failedConnection);

    boolean isCanceled();

    @NotNull
    Plan plan();

    boolean sameHostAndPort(@NotNull HttpUrl url);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "", "plan", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "nextPlan", "throwable", "", "<init>", "(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/RoutePlanner$Plan;Ljava/lang/Throwable;)V", "getPlan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "getNextPlan", "getThrowable", "()Ljava/lang/Throwable;", "isSuccess", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectResult {

        @Nullable
        private final Plan nextPlan;

        @NotNull
        private final Plan plan;

        @Nullable
        private final Throwable throwable;

        public ConnectResult(@NotNull Plan plan, @Nullable Plan plan2, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.plan = plan;
            this.nextPlan = plan2;
            this.throwable = th2;
        }

        public static /* synthetic */ ConnectResult copy$default(ConnectResult connectResult, Plan plan, Plan plan2, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                plan = connectResult.plan;
            }
            if ((i10 & 2) != 0) {
                plan2 = connectResult.nextPlan;
            }
            if ((i10 & 4) != 0) {
                th2 = connectResult.throwable;
            }
            return connectResult.copy(plan, plan2, th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Plan getPlan() {
            return this.plan;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Plan getNextPlan() {
            return this.nextPlan;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final ConnectResult copy(@NotNull Plan plan, @Nullable Plan nextPlan, @Nullable Throwable throwable) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            return new ConnectResult(plan, nextPlan, throwable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) other;
            return Intrinsics.c(this.plan, connectResult.plan) && Intrinsics.c(this.nextPlan, connectResult.nextPlan) && Intrinsics.c(this.throwable, connectResult.throwable);
        }

        @Nullable
        public final Plan getNextPlan() {
            return this.nextPlan;
        }

        @NotNull
        public final Plan getPlan() {
            return this.plan;
        }

        @Nullable
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int iHashCode = this.plan.hashCode() * 31;
            Plan plan = this.nextPlan;
            int iHashCode2 = (iHashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th2 = this.throwable;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public final boolean isSuccess() {
            return this.nextPlan == null && this.throwable == null;
        }

        @NotNull
        public String toString() {
            return "ConnectResult(plan=" + this.plan + ", nextPlan=" + this.nextPlan + ", throwable=" + this.throwable + ')';
        }

        public /* synthetic */ ConnectResult(Plan plan, Plan plan2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(plan, (i10 & 2) != 0 ? null : plan2, (i10 & 4) != 0 ? null : th2);
        }
    }
}
