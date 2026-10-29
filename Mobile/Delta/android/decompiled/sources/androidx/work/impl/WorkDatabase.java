package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f6.d0;
import f6.k0;
import f6.p;
import f6.q1;
import f6.y;
import g5.d;
import h5.i;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x4.n;
import x4.u;
import x5.b;
import y5.c;
import y5.f;
import y5.g;
import y5.g1;
import y5.h;
import y5.j;
import y5.k;
import y5.l;
import y5.m;
import y5.o;
import y5.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lx4/u;", "<init>", "()V", "Lf6/k0;", "c0", "()Lf6/k0;", "Lf6/b;", "X", "()Lf6/b;", "Lf6/q1;", "d0", "()Lf6/q1;", "Lf6/p;", "Z", "()Lf6/p;", "Lf6/y;", "a0", "()Lf6/y;", "Lf6/d0;", "b0", "()Lf6/d0;", "Lf6/i;", "Y", "()Lf6/i;", "o", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WorkDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Lx5/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lx5/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final d c(Context context, d.b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            d.b.a aVarA = d.b.INSTANCE.a(context);
            aVarA.d(configuration.name).c(configuration.callback).e(true).a(true);
            return new i().a(aVarA.b());
        }

        @NotNull
        public final WorkDatabase b(@NotNull final Context context, @NotNull Executor queryExecutor, @NotNull b clock, boolean useTestDatabase) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (useTestDatabase ? n.b(context, WorkDatabase.class).c() : n.a(context, WorkDatabase.class, "androidx.work.workdb").f(new d.c() { // from class: y5.g0
                @Override // g5.d.c
                public final g5.d a(g5.d.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).g(queryExecutor).a(new c(clock)).b(j.f35637c).b(new t(context, 2, 3)).b(k.f35641c).b(l.f35642c).b(new t(context, 5, 6)).b(m.f35650c).b(y5.n.f35651c).b(o.f35653c).b(new g1(context)).b(new t(context, 10, 11)).b(f.f35603c).b(g.f35627c).b(h.f35630c).b(y5.i.f35633c).b(new t(context, 21, 22)).e(true).d();
        }

        public Companion() {
        }
    }

    @NotNull
    public abstract f6.b X();

    @NotNull
    public abstract f6.i Y();

    @NotNull
    public abstract p Z();

    @NotNull
    public abstract y a0();

    @NotNull
    public abstract d0 b0();

    @NotNull
    public abstract k0 c0();

    @NotNull
    public abstract q1 d0();
}
