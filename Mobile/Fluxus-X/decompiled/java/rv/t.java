package rv;

import com.github.luben.zstd.BuildConfig;
import mv.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lrv/t;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "m", "()Z", "Lrv/t$b;", "d", "()Lrv/t$b;", "Lrv/n;", "failedConnection", "e", "(Lrv/n;)Z", "Lmv/z;", "url", "f", "(Lmv/z;)Z", "Lmv/a;", "a", "()Lmv/a;", "address", "Lkotlin/collections/i;", "c", "()Lkotlin/collections/i;", "deferredPlans", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lrv/t$b;", BuildConfig.FLAVOR, "Lrv/t$a;", "h", "()Lrv/t$a;", "e", "Lrv/n;", "c", "()Lrv/n;", BuildConfig.FLAVOR, "cancel", "()V", "b", "()Lrv/t$b;", BuildConfig.FLAVOR, "a", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        boolean a();

        @Nullable
        b b();

        @NotNull
        n c();

        void cancel();

        @NotNull
        ConnectResult e();

        @NotNull
        ConnectResult h();
    }

    static /* synthetic */ boolean b(t tVar, n nVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            nVar = null;
        }
        return tVar.e(nVar);
    }

    @NotNull
    mv.a a();

    @NotNull
    p001kotlin.collections.i<b> c();

    @NotNull
    b d();

    boolean e(@Nullable n failedConnection);

    boolean f(@NotNull z url);

    boolean m();

    /* JADX INFO: renamed from: rv.t$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001e\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lrv/t$a;", BuildConfig.FLAVOR, "Lrv/t$b;", "plan", "nextPlan", BuildConfig.FLAVOR, "throwable", "<init>", "(Lrv/t$b;Lrv/t$b;Ljava/lang/Throwable;)V", "a", "()Lrv/t$b;", "b", "()Ljava/lang/Throwable;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Lrv/t$b;", "d", "c", "Ljava/lang/Throwable;", "e", "f", "()Z", "isSuccess", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final b plan;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final b nextPlan;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Throwable throwable;

        public ConnectResult(@NotNull b plan, @Nullable b bVar, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.plan = plan;
            this.nextPlan = bVar;
            this.throwable = th2;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getNextPlan() {
            return this.nextPlan;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @Nullable
        public final b c() {
            return this.nextPlan;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getPlan() {
            return this.plan;
        }

        @Nullable
        public final Throwable e() {
            return this.throwable;
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

        public final boolean f() {
            return this.nextPlan == null && this.throwable == null;
        }

        public int hashCode() {
            int iHashCode = this.plan.hashCode() * 31;
            b bVar = this.nextPlan;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th2 = this.throwable;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConnectResult(plan=" + this.plan + ", nextPlan=" + this.nextPlan + ", throwable=" + this.throwable + ')';
        }

        public /* synthetic */ ConnectResult(b bVar, b bVar2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th2);
        }
    }
}
