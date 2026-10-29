package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lku/n2;", "Lku/l0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "P", "(ILjava/lang/String;)Lku/l0;", "Y", "X", "()Lku/n2;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n2 extends l0 {
    @Override // ku.l0
    @NotNull
    public l0 P(int parallelism, @Nullable String name) {
        qu.m.a(parallelism);
        return qu.m.b(this, name);
    }

    @NotNull
    public abstract n2 X();

    @Nullable
    public final String Y() {
        n2 n2VarX;
        n2 n2VarC = g1.c();
        if (this == n2VarC) {
            return "Dispatchers.Main";
        }
        try {
            n2VarX = n2VarC.X();
        } catch (UnsupportedOperationException unused) {
            n2VarX = null;
        }
        if (this == n2VarX) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // ku.l0
    @NotNull
    public String toString() {
        String strY = Y();
        if (strY != null) {
            return strY;
        }
        return t0.a(this) + '@' + t0.b(this);
    }
}
