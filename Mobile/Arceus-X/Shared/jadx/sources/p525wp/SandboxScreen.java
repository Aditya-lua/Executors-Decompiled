package p525wp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wp.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u001f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006#"}, m31665d2 = {"Lwp/i;", "", "R", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "mainScreen", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "onFabClick", "Lwp/c$b;", "getCurrentForcedStatus", "d", "Z", "e", "()Z", "simulateGovIdNfc", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onSimulateGovIdNfcChanged", "sandbox_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class SandboxScreen<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final R mainScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function0<Unit> onFabClick;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function0<C12504c.b> getCurrentForcedStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean simulateGovIdNfc;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Boolean, Unit> onSimulateGovIdNfcChanged;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function0<C12504c.b> m46843a() {
        return this.getCurrentForcedStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final R m46844b() {
        return this.mainScreen;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function0<Unit> m46845c() {
        return this.onFabClick;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Function1<Boolean, Unit> m46846d() {
        return this.onSimulateGovIdNfcChanged;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSimulateGovIdNfc() {
        return this.simulateGovIdNfc;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SandboxScreen)) {
            return false;
        }
        SandboxScreen sandboxScreen = (SandboxScreen) other;
        return Intrinsics.m31980c(this.mainScreen, sandboxScreen.mainScreen) && Intrinsics.m31980c(this.onFabClick, sandboxScreen.onFabClick) && Intrinsics.m31980c(this.getCurrentForcedStatus, sandboxScreen.getCurrentForcedStatus) && this.simulateGovIdNfc == sandboxScreen.simulateGovIdNfc && Intrinsics.m31980c(this.onSimulateGovIdNfcChanged, sandboxScreen.onSimulateGovIdNfcChanged);
    }

    public int hashCode() {
        return (((((((this.mainScreen.hashCode() * 31) + this.onFabClick.hashCode()) * 31) + this.getCurrentForcedStatus.hashCode()) * 31) + Boolean.hashCode(this.simulateGovIdNfc)) * 31) + this.onSimulateGovIdNfcChanged.hashCode();
    }

    @NotNull
    public String toString() {
        return "SandboxScreen(mainScreen=" + this.mainScreen + ", onFabClick=" + this.onFabClick + ", getCurrentForcedStatus=" + this.getCurrentForcedStatus + ", simulateGovIdNfc=" + this.simulateGovIdNfc + ", onSimulateGovIdNfcChanged=" + this.onSimulateGovIdNfcChanged + ")";
    }
}
