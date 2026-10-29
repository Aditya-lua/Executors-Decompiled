package p120f6;

import androidx.core.app.NotificationCompat;
import androidx.work.C1116b;
import hu.InterfaceC6567c;
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

/* JADX INFO: renamed from: f6.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lf6/h0;", "Lf6/d0;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lf6/c0;", NotificationCompat.CATEGORY_PROGRESS, "", "b", "(Lf6/c0;)V", "", "workSpecId", "a", "(Ljava/lang/String;)V", "c", "()V", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfWorkProgress", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5384h0 implements InterfaceC5372d0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<C5369c0> __insertAdapterOfWorkProgress;

    /* JADX INFO: renamed from: f6.h0$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"f6/h0$a", "Lx4/f;", "Lf6/c0;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lf6/c0;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<C5369c0> {
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, C5369c0 entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.getWorkSpecId());
            statement.mo24699A(2, C1116b.INSTANCE.m6337e(entity.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String()));
        }
    }

    /* JADX INFO: renamed from: f6.h0$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lf6/h0$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: f6.h0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m24745a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C5384h0(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkProgress = new a();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m24741g(String str, String str2, InterfaceC5359b _connection) {
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

    /* JADX INFO: renamed from: h */
    public static final Unit m24742h(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m24743i(C5384h0 c5384h0, C5369c0 c5369c0, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c5384h0.__insertAdapterOfWorkProgress.m47171d(_connection, c5369c0);
        return Unit.f29331a;
    }

    @Override // p120f6.InterfaceC5372d0
    /* JADX INFO: renamed from: a */
    public void mo24723a(@NotNull final String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        final String str = "DELETE from WorkProgress where work_spec_id=?";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5384h0.m24741g(str, workSpecId, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5372d0
    /* JADX INFO: renamed from: b */
    public void mo24724b(@NotNull final C5369c0 progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5384h0.m24743i(this.f20873a, progress, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // p120f6.InterfaceC5372d0
    /* JADX INFO: renamed from: c */
    public void mo24725c() {
        final String str = "DELETE FROM WorkProgress";
        C1525a.m8065c(this.__db, false, true, new Function1() { // from class: f6.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5384h0.m24742h(str, (InterfaceC5359b) obj);
            }
        });
    }
}
