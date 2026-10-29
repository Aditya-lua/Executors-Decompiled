package f6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lf6/u;", "Lf6/p;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/o;", "systemIdInfo", "", "a", "(Lf6/o;)V", "", "workSpecId", "", "generation", "b", "(Ljava/lang/String;I)Lf6/o;", "", "c", "()Ljava/util/List;", "e", "(Ljava/lang/String;)V", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfSystemIdInfo", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final x4.f<SystemIdInfo> __insertAdapterOfSystemIdInfo;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/u$a", "Lx4/f;", "Lf6/o;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/o;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends x4.f<SystemIdInfo> {
        @Override // x4.f
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, SystemIdInfo entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.workSpecId);
            statement.z(2, entity.getGeneration());
            statement.z(3, entity.systemId);
        }
    }

    /* JADX INFO: renamed from: f6.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf6/u$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public u(@NotNull x4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSystemIdInfo = new a();
    }

    public static final SystemIdInfo j(String str, String str2, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            dVarR3.z(2, i10);
            return dVarR3.g3() ? new SystemIdInfo(dVarR3.E2(c5.j.c(dVarR3, "work_spec_id")), (int) dVarR3.getLong(c5.j.c(dVarR3, "generation")), (int) dVarR3.getLong(c5.j.c(dVarR3, "system_id"))) : null;
        } finally {
            dVarR3.close();
        }
    }

    public static final List k(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                arrayList.add(dVarR3.E2(0));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final Unit l(u uVar, SystemIdInfo systemIdInfo, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        uVar.__insertAdapterOfSystemIdInfo.d(_connection, systemIdInfo);
        return Unit.f22483a;
    }

    public static final Unit m(String str, String str2, f5.b _connection) {
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

    @Override // f6.p
    public void a(@NotNull final SystemIdInfo systemIdInfo) {
        Intrinsics.checkNotNullParameter(systemIdInfo, "systemIdInfo");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.l(this.f16303a, systemIdInfo, (f5.b) obj);
            }
        });
    }

    @Override // f6.p
    @Nullable
    public SystemIdInfo b(@NotNull final String workSpecId, final int generation) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (SystemIdInfo) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.j(str, workSpecId, generation, (f5.b) obj);
            }
        });
    }

    @Override // f6.p
    @NotNull
    public List<String> c() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.k(str, (f5.b) obj);
            }
        });
    }

    @Override // f6.p
    public void e(@NotNull final String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.m(str, workSpecId, (f5.b) obj);
            }
        });
    }
}
