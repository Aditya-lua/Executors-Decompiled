package bh;

import android.content.Context;
import com.roblox.client.C3179d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bh.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lbh/b;", "", "", "enabled", "Lcom/roblox/client/d$e;", "upgradeCheckResult", "<init>", "(ZLcom/roblox/client/d$e;)V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "a", "Z", "()Z", "setEnabled", "(Z)V", "b", "Lcom/roblox/client/d$e;", "()Lcom/roblox/client/d$e;", "setUpgradeCheckResult", "(Lcom/roblox/client/d$e;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1439b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C3179d.e upgradeCheckResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C1439b() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C3179d.e getUpgradeCheckResult() {
        return this.upgradeCheckResult;
    }

    /* JADX INFO: renamed from: c */
    public final void m7440c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1439b(boolean z10, @NotNull C3179d.e upgradeCheckResult) {
        Intrinsics.checkNotNullParameter(upgradeCheckResult, "upgradeCheckResult");
        this.enabled = z10;
        this.upgradeCheckResult = upgradeCheckResult;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
      (wrap com.roblox.client.d$e:?: TERNARY null = ((wrap int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap com.roblox.client.d$e:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:4) call: com.roblox.client.d.e.<init>():void type: CONSTRUCTOR) : (r2v0 com.roblox.client.d$e))
     A[MD:(boolean, com.roblox.client.d$e):void (m)] (LINE:5) call: bh.b.<init>(boolean, com.roblox.client.d$e):void type: THIS */
    public /* synthetic */ C1439b(boolean z10, C3179d.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new C3179d.e() : eVar);
    }
}
