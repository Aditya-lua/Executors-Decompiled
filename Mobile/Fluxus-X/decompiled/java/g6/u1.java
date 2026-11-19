package g6;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Lg6/u1;", "Lg6/q1;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", "Lg6/p1;", "workTag", BuildConfig.FLAVOR, "c", "(Lg6/p1;)V", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)Ljava/util/List;", "b", "(Ljava/lang/String;)V", "Ly4/u;", "Ly4/f;", "Ly4/f;", "__insertAdapterOfWorkTag", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 implements q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final y4.f<p1> __insertAdapterOfWorkTag;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g6/u1$a", "Ly4/f;", "Lg6/p1;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lg6/p1;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends y4.f<p1> {
        @Override // y4.f
        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, p1 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.getTag());
            statement.m0(2, entity.getWorkSpecId());
        }
    }

    /* JADX INFO: renamed from: g6.u1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg6/u1$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public u1(@NotNull y4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkTag = new a();
    }

    public static final Unit h(String str, String str2, g5.b _connection) {
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

    public static final List i(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
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

    public static final Unit j(u1 u1Var, p1 p1Var, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        u1Var.__insertAdapterOfWorkTag.d(_connection, p1Var);
        return Unit.f21506a;
    }

    @Override // g6.q1
    @NotNull
    public List<String> a(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        return (List) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.r1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u1.i(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.q1
    public void b(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "DELETE FROM worktag WHERE work_spec_id=?";
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.t1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u1.h(str, id2, (g5.b) obj);
            }
        });
    }

    @Override // g6.q1
    public void c(@NotNull final p1 workTag) {
        Intrinsics.checkNotNullParameter(workTag, "workTag");
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.s1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u1.j(this.f17391a, workTag, (g5.b) obj);
            }
        });
    }
}
