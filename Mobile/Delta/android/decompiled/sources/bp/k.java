package bp;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<l0> f4393a;

    public k(dt.i<l0> iVar) {
        this.f4393a = iVar;
    }

    public static k a(dt.i<l0> iVar) {
        return new k(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.fallbackmode.i c(List<? extends NextStep> list, String str, l0 l0Var) {
        return new com.withpersona.sdk2.inquiry.internal.fallbackmode.i(list, str, l0Var);
    }

    public com.withpersona.sdk2.inquiry.internal.fallbackmode.i b(List<? extends NextStep> list, String str) {
        return c(list, str, this.f4393a.get());
    }
}
