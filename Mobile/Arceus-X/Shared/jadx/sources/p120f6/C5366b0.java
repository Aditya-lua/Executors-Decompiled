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
import p041c5.C1525a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p535x4.AbstractC12660f;
import p535x4.AbstractC12682u;

/* JADX INFO: renamed from: f6.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, m31665d2 = {"Lf6/b0;", "Lf6/y;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/x;", "workName", "", "a", "(Lf6/x;)V", "", "workSpecId", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfWorkName", "c", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5366b0 implements InterfaceC5432y {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<C5430x> __insertAdapterOfWorkName;

    /* JADX INFO: renamed from: f6.b0$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"f6/b0$a", "Lx4/f;", "Lf6/x;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/x;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<C5430x> {
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, C5430x entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.getName());
            statement.mo24705k0(2, entity.getWorkSpecId());
        }
    }

    /* JADX INFO: renamed from: f6.b0$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lf6/b0$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: f6.b0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m24720a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C5366b0(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkName = new a();
    }

    /* JADX INFO: renamed from: e */
    public static final List m24715e(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
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

    /* JADX INFO: renamed from: f */
    public static final Unit m24716f(C5366b0 c5366b0, C5430x c5430x, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c5366b0.__insertAdapterOfWorkName.m47171d(_connection, c5430x);
        return Unit.f29331a;
    }

    @Override // p120f6.InterfaceC5432y
    /* JADX INFO: renamed from: a */
    public void mo24717a(@NotNull final C5430x workName) {
        Intrinsics.checkNotNullParameter(workName, "workName");
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5366b0.m24716f(this.f20841a, workName, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5432y
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<String> mo24718b(@NotNull final String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "SELECT name FROM workname WHERE work_spec_id=?";
        return (List) C1525a.m8065c(this.__db, true, false, new Function1() { // from class: f6.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5366b0.m24715e(str, workSpecId, (InterfaceC5359b) obj);
            }
        });
    }
}
