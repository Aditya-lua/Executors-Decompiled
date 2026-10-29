package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p120f6.InterfaceC5365b;
import p120f6.InterfaceC5372d0;
import p120f6.InterfaceC5386i;
import p120f6.InterfaceC5393k0;
import p120f6.InterfaceC5407p;
import p120f6.InterfaceC5412q1;
import p120f6.InterfaceC5432y;
import p145g5.InterfaceC6009d;
import p160h5.C6288i;
import p535x4.AbstractC12682u;
import p535x4.C12675n;
import p536x5.InterfaceC12690b;
import p567y5.C13037c;
import p567y5.C13046f;
import p567y5.C13049g;
import p567y5.C13051g1;
import p567y5.C13052h;
import p567y5.C13055i;
import p567y5.C13058j;
import p567y5.C13061k;
import p567y5.C13064l;
import p567y5.C13067m;
import p567y5.C13070n;
import p567y5.C13073o;
import p567y5.C13088t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m31665d2 = {"Landroidx/work/impl/WorkDatabase;", "Lx4/u;", "<init>", "()V", "Lf6/k0;", "c0", "()Lf6/k0;", "Lf6/b;", "X", "()Lf6/b;", "Lf6/q1;", "d0", "()Lf6/q1;", "Lf6/p;", "Z", "()Lf6/p;", "Lf6/y;", "a0", "()Lf6/y;", "Lf6/d0;", "b0", "()Lf6/d0;", "Lf6/i;", "Y", "()Lf6/i;", "o", "a", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class WorkDatabase extends AbstractC12682u {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Lx5/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lx5/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.impl.WorkDatabase.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final InterfaceC6009d m6353c(Context context, InterfaceC6009d.b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            InterfaceC6009d.b.a aVarM26792a = InterfaceC6009d.b.INSTANCE.m26792a(context);
            aVarM26792a.m26790d(configuration.name).m26789c(configuration.callback).m26791e(true).m26787a(true);
            return new C6288i().mo6926a(aVarM26792a.m26788b());
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final WorkDatabase m6354b(@NotNull final Context context, @NotNull Executor queryExecutor, @NotNull InterfaceC12690b clock, boolean useTestDatabase) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (useTestDatabase ? C12675n.m47229b(context, WorkDatabase.class).m47286c() : C12675n.m47228a(context, WorkDatabase.class, "androidx.work.workdb").m47289f(new InterfaceC6009d.c() { // from class: y5.g0
                @Override // p145g5.InterfaceC6009d.c
                /* JADX INFO: renamed from: a */
                public final InterfaceC6009d mo6926a(InterfaceC6009d.b bVar) {
                    return WorkDatabase.Companion.m6353c(context, bVar);
                }
            })).m47290g(queryExecutor).m47284a(new C13037c(clock)).m47285b(C13058j.f46220c).m47285b(new C13088t(context, 2, 3)).m47285b(C13061k.f46226c).m47285b(C13064l.f46227c).m47285b(new C13088t(context, 5, 6)).m47285b(C13067m.f46236c).m47285b(C13070n.f46237c).m47285b(C13073o.f46239c).m47285b(new C13051g1(context)).m47285b(new C13088t(context, 10, 11)).m47285b(C13046f.f46183c).m47285b(C13049g.f46209c).m47285b(C13052h.f46212c).m47285b(C13055i.f46215c).m47285b(new C13088t(context, 21, 22)).m47288e(true).m47287d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public abstract InterfaceC5365b mo6345X();

    @NotNull
    /* JADX INFO: renamed from: Y */
    public abstract InterfaceC5386i mo6346Y();

    @NotNull
    /* JADX INFO: renamed from: Z */
    public abstract InterfaceC5407p mo6347Z();

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public abstract InterfaceC5432y mo6348a0();

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public abstract InterfaceC5372d0 mo6349b0();

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public abstract InterfaceC5393k0 mo6350c0();

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public abstract InterfaceC5412q1 mo6351d0();
}
