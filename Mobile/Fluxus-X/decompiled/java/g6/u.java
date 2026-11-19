package g6;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lg6/u;", "Lg6/p;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", "Lg6/o;", "systemIdInfo", BuildConfig.FLAVOR, "b", "(Lg6/o;)V", BuildConfig.FLAVOR, "workSpecId", BuildConfig.FLAVOR, "generation", "c", "(Ljava/lang/String;I)Lg6/o;", BuildConfig.FLAVOR, "d", "()Ljava/util/List;", "e", "(Ljava/lang/String;)V", "a", "Ly4/u;", "Ly4/f;", "Ly4/f;", "__insertAdapterOfSystemIdInfo", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final y4.f<SystemIdInfo> __insertAdapterOfSystemIdInfo;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g6/u$a", "Ly4/f;", "Lg6/o;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lg6/o;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends y4.f<SystemIdInfo> {
        @Override // y4.f
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, SystemIdInfo entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.workSpecId);
            statement.B(2, entity.getGeneration());
            statement.B(3, entity.systemId);
        }
    }

    /* JADX INFO: renamed from: g6.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg6/u$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<xu.c<?>> a() {
            return p001kotlin.collections.p.k();
        }

        public Companion() {
        }
    }

    public u(@NotNull y4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSystemIdInfo = new a();
    }

    public static final SystemIdInfo j(String str, String str2, int i10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.B(2, i10);
            return dVarW3.n3() ? new SystemIdInfo(dVarW3.I2(d5.j.c(dVarW3, "work_spec_id")), (int) dVarW3.getLong(d5.j.c(dVarW3, "generation")), (int) dVarW3.getLong(d5.j.c(dVarW3, "system_id"))) : null;
        } finally {
            dVarW3.close();
        }
    }

    public static final List k(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                arrayList.add(dVarW3.I2(0));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final Unit l(u uVar, SystemIdInfo systemIdInfo, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        uVar.__insertAdapterOfSystemIdInfo.d(_connection, systemIdInfo);
        return Unit.f21506a;
    }

    public static final Unit m(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    @Override // g6.p
    public void b(@NotNull final SystemIdInfo systemIdInfo) {
        Intrinsics.checkNotNullParameter(systemIdInfo, "systemIdInfo");
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.q
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.l(this.f17382a, systemIdInfo, (g5.b) obj);
            }
        });
    }

    @Override // g6.p
    @Nullable
    public SystemIdInfo c(@NotNull final String workSpecId, final int generation) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (SystemIdInfo) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.s
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.j(str, workSpecId, generation, (g5.b) obj);
            }
        });
    }

    @Override // g6.p
    @NotNull
    public List<String> d() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.r
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.k(str, (g5.b) obj);
            }
        });
    }

    @Override // g6.p
    public void e(@NotNull final String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.t
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.m(str, workSpecId, (g5.b) obj);
            }
        });
    }
}
