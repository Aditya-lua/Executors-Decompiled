package p120f6;

import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p041c5.C1534j;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p535x4.AbstractC12660f;
import p535x4.AbstractC12682u;

/* JADX INFO: renamed from: f6.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lf6/u;", "Lf6/p;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/o;", "systemIdInfo", "", "a", "(Lf6/o;)V", "", "workSpecId", "", "generation", "b", "(Ljava/lang/String;I)Lf6/o;", "", "c", "()Ljava/util/List;", "e", "(Ljava/lang/String;)V", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfSystemIdInfo", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5422u implements InterfaceC5407p {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<SystemIdInfo> __insertAdapterOfSystemIdInfo;

    /* JADX INFO: renamed from: f6.u$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"f6/u$a", "Lx4/f;", "Lf6/o;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/o;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<SystemIdInfo> {
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, SystemIdInfo entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.workSpecId);
            statement.mo24706z(2, entity.getGeneration());
            statement.mo24706z(3, entity.systemId);
        }
    }

    /* JADX INFO: renamed from: f6.u$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lf6/u$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: f6.u.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m24893a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C5422u(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSystemIdInfo = new a();
    }

    /* JADX INFO: renamed from: j */
    public static final SystemIdInfo m24888j(String str, String str2, int i10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24706z(2, i10);
            return interfaceC5361dMo24696r3.mo24704g3() ? new SystemIdInfo(interfaceC5361dMo24696r3.mo24702E2(C1534j.m8099c(interfaceC5361dMo24696r3, "work_spec_id")), (int) interfaceC5361dMo24696r3.getLong(C1534j.m8099c(interfaceC5361dMo24696r3, "generation")), (int) interfaceC5361dMo24696r3.getLong(C1534j.m8099c(interfaceC5361dMo24696r3, "system_id"))) : null;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final List m24889k(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                arrayList.add(interfaceC5361dMo24696r3.mo24702E2(0));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m24890l(C5422u c5422u, SystemIdInfo systemIdInfo, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c5422u.__insertAdapterOfSystemIdInfo.m47171d(_connection, systemIdInfo);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m24891m(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    @Override // p120f6.InterfaceC5407p
    /* JADX INFO: renamed from: a */
    public void mo24873a(@NotNull final SystemIdInfo systemIdInfo) {
        Intrinsics.checkNotNullParameter(systemIdInfo, "systemIdInfo");
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5422u.m24890l(this.f20967a, systemIdInfo, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5407p
    @Nullable
    /* JADX INFO: renamed from: b */
    public SystemIdInfo mo24874b(@NotNull final String workSpecId, final int generation) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (SystemIdInfo) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5422u.m24888j(str, workSpecId, generation, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5407p
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<String> mo24875c() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5422u.m24889k(str, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5407p
    /* JADX INFO: renamed from: e */
    public void mo24877e(@NotNull final String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5422u.m24891m(str, workSpecId, (InterfaceC5359b) obj);
            }
        });
    }
}
