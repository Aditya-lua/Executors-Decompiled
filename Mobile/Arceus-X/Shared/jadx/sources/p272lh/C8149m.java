package p272lh;

import hu.InterfaceC6567c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mh.NotificationId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p041c5.C1533i;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.AbstractC12660f;
import p535x4.AbstractC12682u;

/* JADX INFO: renamed from: lh.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Llh/m;", "Llh/i;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "", "Lmh/b;", "notificationIds", "", "e", "([Lmh/b;Lnt/b;)Ljava/lang/Object;", "", "notificationId", "", "c", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "maxRowsCount", "d", "(ILnt/b;)Ljava/lang/Object;", "b", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfNotificationId", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8149m implements InterfaceC8145i {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<NotificationId> __insertAdapterOfNotificationId;

    /* JADX INFO: renamed from: lh.m$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"lh/m$a", "Lx4/f;", "Lmh/b;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lmh/b;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<NotificationId> {
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR REPLACE INTO `notification_id` (`notification_id`,`last_received_timestamp_ms`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, NotificationId entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.getNotificationId());
            statement.mo24706z(2, entity.getLastReceivedTimestampMs());
        }
    }

    /* JADX INFO: renamed from: lh.m$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Llh/m$b;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: lh.m.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m33400a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C8149m(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfNotificationId = new a();
    }

    /* JADX INFO: renamed from: i */
    public static final int m33396i(String str, int i10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, i10);
            interfaceC5361dMo24696r3.mo24704g3();
            return C1533i.m8096b(_connection);
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m33397j(String str, String str2, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            boolean z10 = false;
            if (interfaceC5361dMo24696r3.mo24704g3()) {
                z10 = ((int) interfaceC5361dMo24696r3.getLong(0)) != 0;
            }
            return z10;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m33398k(C8149m c8149m, NotificationId[] notificationIdArr, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c8149m.__insertAdapterOfNotificationId.m47172e(_connection, notificationIdArr);
        return Unit.f29331a;
    }

    @Override // p272lh.InterfaceC8145i
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ Object mo33388b(@NotNull NotificationId[] notificationIdArr, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return super.mo33388b(notificationIdArr, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8145i
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo33389c(@NotNull final String str, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        final String str2 = "SELECT COUNT(*) > 0 FROM notification_id WHERE notification_id = ?";
        return C1525a.m8067e(this.__db, true, false, new Function1() { // from class: lh.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C8149m.m33397j(str2, str, (InterfaceC5359b) obj));
            }
        }, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8145i
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo33390d(final int i10, @NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        final String str = "\n        DELETE FROM notification_id\n        WHERE notification_id IN (\n            SELECT notification_id\n            FROM notification_id\n            ORDER BY last_received_timestamp_ms DESC\n            LIMIT -1 OFFSET ?\n        )\n    ";
        return C1525a.m8067e(this.__db, false, true, new Function1() { // from class: lh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C8149m.m33396i(str, i10, (InterfaceC5359b) obj));
            }
        }, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8145i
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo33391e(@NotNull final NotificationId[] notificationIdArr, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM8067e = C1525a.m8067e(this.__db, false, true, new Function1() { // from class: lh.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8149m.m33398k(this.f30213a, notificationIdArr, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
        return objM8067e == C10047c.m38805e() ? objM8067e : Unit.f29331a;
    }
}
