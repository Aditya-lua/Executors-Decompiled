package f6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, d2 = {"Lf6/g;", "Lf6/b;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/a;", "dependency", "", "c", "(Lf6/a;)V", "", "id", "", "b", "(Ljava/lang/String;)Z", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "d", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfDependency", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final x4.f<f6.a> __insertAdapterOfDependency;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f6/g$a", "Lx4/f;", "Lf6/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends x4.f<f6.a> {
        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, f6.a entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.getWorkSpecId());
            statement.k0(2, entity.getPrerequisiteId());
        }
    }

    /* JADX INFO: renamed from: f6.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf6/g$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public g(@NotNull x4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfDependency = new a();
    }

    public static final List i(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
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

    public static final boolean j(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            boolean z10 = false;
            if (dVarR3.g3()) {
                z10 = ((int) dVarR3.getLong(0)) != 0;
            }
            return z10;
        } finally {
            dVarR3.close();
        }
    }

    public static final boolean k(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            boolean z10 = false;
            if (dVarR3.g3()) {
                z10 = ((int) dVarR3.getLong(0)) != 0;
            }
            return z10;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit l(g gVar, f6.a aVar, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__insertAdapterOfDependency.d(_connection, aVar);
        return Unit.f22483a;
    }

    @Override // f6.b
    @NotNull
    public List<String> a(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.i(str, id2, (f5.b) obj);
            }
        });
    }

    @Override // f6.b
    public boolean b(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(g.j(str, id2, (f5.b) obj));
            }
        })).booleanValue();
    }

    @Override // f6.b
    public void c(@NotNull final f6.a dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        c5.a.c(this.__db, false, true, new Function1() { // from class: f6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.l(this.f16219a, dependency, (f5.b) obj);
            }
        });
    }

    @Override // f6.b
    public boolean d(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) c5.a.c(this.__db, true, false, new Function1() { // from class: f6.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(g.k(str, id2, (f5.b) obj));
            }
        })).booleanValue();
    }
}
