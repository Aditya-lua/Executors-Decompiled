package x4;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lx4/f;", "T", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "a", "(Lf5/d;Ljava/lang/Object;)V", "Lf5/b;", "connection", "d", "(Lf5/b;Ljava/lang/Object;)V", "", "entities", "e", "(Lf5/b;[Ljava/lang/Object;)V", "", "c", "(Lf5/b;Ljava/lang/Iterable;)V", "", "f", "(Lf5/b;Ljava/lang/Object;)J", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f<T> {
    public abstract void a(@NotNull f5.d statement, T entity);

    @NotNull
    public abstract String b();

    public final void c(@NotNull f5.b connection, @Nullable Iterable<? extends T> entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        f5.d dVarR3 = connection.r3(b());
        try {
            for (T t8 : entities) {
                if (t8 != null) {
                    a(dVarR3, t8);
                    dVarR3.g3();
                    dVarR3.reset();
                }
            }
            Unit unit = Unit.f22483a;
            xt.a.a(dVarR3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public final void d(@NotNull f5.b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return;
        }
        f5.d dVarR3 = connection.r3(b());
        try {
            a(dVarR3, entity);
            dVarR3.g3();
            xt.a.a(dVarR3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull f5.b connection, @Nullable T[] entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        f5.d dVarR3 = connection.r3(b());
        try {
            Iterator itA = kotlin.jvm.internal.c.a(entities);
            while (itA.hasNext()) {
                Object next = itA.next();
                if (next != null) {
                    a(dVarR3, next);
                    dVarR3.g3();
                    dVarR3.reset();
                }
            }
            Unit unit = Unit.f22483a;
            xt.a.a(dVarR3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(dVarR3, th2);
                throw th3;
            }
        }
    }

    public final long f(@NotNull f5.b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return -1L;
        }
        f5.d dVarR3 = connection.r3(b());
        try {
            a(dVarR3, entity);
            dVarR3.g3();
            xt.a.a(dVarR3, null);
            return c5.i.a(connection);
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
