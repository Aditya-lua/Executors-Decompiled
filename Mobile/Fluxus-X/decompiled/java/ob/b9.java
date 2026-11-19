package ob;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b9 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l7 f27120a;

    public b9(c9 c9Var, l7 l7Var) {
        this.f27120a = l7Var;
        Objects.requireNonNull(c9Var);
    }

    @Override // ob.t5
    public final boolean zza() {
        return Log.isLoggable(this.f27120a.a().z(), 3);
    }
}
