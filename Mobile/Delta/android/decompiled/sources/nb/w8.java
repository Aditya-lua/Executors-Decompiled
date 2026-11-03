package nb;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w8 implements o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g7 f26892a;

    public w8(x8 x8Var, g7 g7Var) {
        this.f26892a = g7Var;
        Objects.requireNonNull(x8Var);
    }

    @Override // nb.o5
    public final boolean zza() {
        return Log.isLoggable(this.f26892a.a().z(), 3);
    }
}
