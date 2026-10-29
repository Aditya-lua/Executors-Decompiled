package c5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf5/b;", "connection", "", "a", "(Lf5/b;)J", "", "b", "(Lf5/b;)I", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final long a(@NotNull f5.b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (b(connection) == 0) {
            return -1L;
        }
        f5.d dVarR3 = connection.r3("SELECT last_insert_rowid()");
        try {
            dVarR3.g3();
            long j10 = dVarR3.getLong(0);
            xt.a.a(dVarR3, null);
            return j10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public static final int b(@NotNull f5.b connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        f5.d dVarR3 = connection.r3("SELECT changes()");
        try {
            dVarR3.g3();
            int i10 = (int) dVarR3.getLong(0);
            xt.a.a(dVarR3, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }
}
