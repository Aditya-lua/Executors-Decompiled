package f6;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf6/h0;", "Lf6/d0;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/c0;", "progress", "", "b", "(Lf6/c0;)V", "", "workSpecId", "a", "(Ljava/lang/String;)V", "c", "()V", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfWorkProgress", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final x4.f<c0> __insertAdapterOfWorkProgress;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/h0$a", "Lx4/f;", "Lf6/c0;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/c0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends x4.f<c0> {
        @Override // x4.f
        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, c0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.getWorkSpecId());
            statement.A(2, androidx.work.b.INSTANCE.e(entity.getProgress()));
        }
    }

    /* JADX INFO: renamed from: f6.h0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf6/h0$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<hu.c<?>> a() {
            return kotlin.collections.p.k();
        }

        public Companion() {
        }
    }

    public h0(@NotNull x4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkProgress = new a();
    }

    public static final Unit g(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit h(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit i(h0 h0Var, c0 c0Var, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        h0Var.__insertAdapterOfWorkProgress.d(_connection, c0Var);
        return Unit.f22483a;
    }

    @Override // f6.d0
    public void a(@NotNull final String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "DELETE from WorkProgress where work_spec_id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.g(str, workSpecId, (f5.b) obj);
            }
        });
    }

    @Override // f6.d0
    public void b(@NotNull final c0 progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.i(this.f16232a, progress, (f5.b) obj);
            }
        });
    }

    @Override // f6.d0
    public void c() {
        final String str = "DELETE FROM WorkProgress";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.h(str, (f5.b) obj);
            }
        });
    }
}
