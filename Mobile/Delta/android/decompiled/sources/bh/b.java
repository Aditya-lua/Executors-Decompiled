package bh;

import android.content.Context;
import com.roblox.client.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbh/b;", "", "", "enabled", "Lcom/roblox/client/d$e;", "upgradeCheckResult", "<init>", "(ZLcom/roblox/client/d$e;)V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "a", "Z", "()Z", "setEnabled", "(Z)V", "b", "Lcom/roblox/client/d$e;", "()Lcom/roblox/client/d$e;", "setUpgradeCheckResult", "(Lcom/roblox/client/d$e;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public d.e upgradeCheckResult;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d.e getUpgradeCheckResult() {
        return this.upgradeCheckResult;
    }

    public final void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public b(boolean z10, @NotNull d.e upgradeCheckResult) {
        Intrinsics.checkNotNullParameter(upgradeCheckResult, "upgradeCheckResult");
        this.enabled = z10;
        this.upgradeCheckResult = upgradeCheckResult;
    }

    public /* synthetic */ b(boolean z10, d.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new d.e() : eVar);
    }
}
