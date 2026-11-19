package ob;

import com.roblox.protocols.calling.CallingHandler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q9 extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va f27740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(va vaVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(vaVar);
        this.f27740e = vaVar;
    }

    @Override // ob.z
    public final void a() {
        va vaVar = this.f27740e;
        if (vaVar.f27641a.n()) {
            vaVar.c0().b(CallingHandler.AVATAR_TIMEOUT_MS);
        }
    }
}
