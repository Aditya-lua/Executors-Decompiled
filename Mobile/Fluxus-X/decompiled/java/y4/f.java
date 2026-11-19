package y4;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ly4/f;", "T", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "a", "(Lg5/d;Ljava/lang/Object;)V", "Lg5/b;", "connection", "d", "(Lg5/b;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "entities", "e", "(Lg5/b;[Ljava/lang/Object;)V", BuildConfig.FLAVOR, "c", "(Lg5/b;Ljava/lang/Iterable;)V", BuildConfig.FLAVOR, "f", "(Lg5/b;Ljava/lang/Object;)J", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f<T> {
    public abstract void a(@NotNull g5.d statement, T entity);

    @NotNull
    public abstract String b();

    public final void c(@NotNull g5.b connection, @Nullable Iterable<? extends T> entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        g5.d dVarW3 = connection.w3(b());
        try {
            for (T t8 : entities) {
                if (t8 != null) {
                    a(dVarW3, t8);
                    dVarW3.n3();
                    dVarW3.reset();
                }
            }
            Unit unit = Unit.f21506a;
            nu.a.a(dVarW3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(dVarW3, th2);
                throw th3;
            }
        }
    }

    public final void d(@NotNull g5.b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return;
        }
        g5.d dVarW3 = connection.w3(b());
        try {
            a(dVarW3, entity);
            dVarW3.n3();
            nu.a.a(dVarW3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(dVarW3, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull g5.b connection, @Nullable T[] entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        g5.d dVarW3 = connection.w3(b());
        try {
            Iterator itA = p001kotlin.jvm.internal.c.a(entities);
            while (itA.hasNext()) {
                Object next = itA.next();
                if (next != null) {
                    a(dVarW3, next);
                    dVarW3.n3();
                    dVarW3.reset();
                }
            }
            Unit unit = Unit.f21506a;
            nu.a.a(dVarW3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(dVarW3, th2);
                throw th3;
            }
        }
    }

    public final long f(@NotNull g5.b connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return -1L;
        }
        g5.d dVarW3 = connection.w3(b());
        try {
            a(dVarW3, entity);
            dVarW3.n3();
            nu.a.a(dVarW3, null);
            return d5.i.a(connection);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(dVarW3, th2);
                throw th3;
            }
        }
    }
}
