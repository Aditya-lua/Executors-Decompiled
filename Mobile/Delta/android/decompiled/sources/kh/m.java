package kh;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.NotificationId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkh/m;", "Lkh/i;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "", "Llh/b;", "notificationIds", "", "a", "([Llh/b;Llt/b;)Ljava/lang/Object;", "", "notificationId", "", "e", "(Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "", "maxRowsCount", "d", "(ILlt/b;)Ljava/lang/Object;", "b", "Lx4/u;", "Lx4/f;", "c", "Lx4/f;", "__insertAdapterOfNotificationId", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.f<NotificationId> __insertAdapterOfNotificationId;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/m$a", "Lx4/f;", "Llh/b;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Llh/b;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends x4.f<NotificationId> {
        @Override // x4.f
        public String b() {
            return "INSERT OR REPLACE INTO `notification_id` (`notification_id`,`last_received_timestamp_ms`) VALUES (?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, NotificationId entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.h0(1, entity.getNotificationId());
            statement.y(2, entity.getLastReceivedTimestampMs());
        }
    }

    /* JADX INFO: renamed from: kh.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkh/m$b;", "", "<init>", "()V", "", "Lfu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<fu.c<?>> a() {
            return p.k();
        }

        public Companion() {
        }
    }

    public m(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfNotificationId = new a();
    }

    public static final int i(String str, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.y(1, i10);
            dVarR3.i3();
            return c5.i.b(_connection);
        } finally {
            dVarR3.close();
        }
    }

    public static final boolean j(String str, String str2, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.h0(1, str2);
            boolean z10 = false;
            if (dVarR3.i3()) {
                z10 = ((int) dVarR3.getLong(0)) != 0;
            }
            return z10;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit k(m mVar, NotificationId[] notificationIdArr, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        mVar.__insertAdapterOfNotificationId.e(_connection, notificationIdArr);
        return Unit.f22938a;
    }

    @Override // kh.i
    @Nullable
    public Object a(@NotNull final NotificationId[] notificationIdArr, @NotNull lt.b<? super Unit> bVar) {
        Object objE = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.k(this.f22706a, notificationIdArr, (f5.b) obj);
            }
        }, bVar);
        return objE == mt.c.e() ? objE : Unit.f22938a;
    }

    @Override // kh.i
    @Nullable
    public /* bridge */ Object b(@NotNull NotificationId[] notificationIdArr, @NotNull lt.b<? super Boolean> bVar) {
        return super.b(notificationIdArr, bVar);
    }

    @Override // kh.i
    @Nullable
    public Object d(final int i10, @NotNull lt.b<? super Integer> bVar) {
        final String str = "\n        DELETE FROM notification_id\n        WHERE notification_id IN (\n            SELECT notification_id\n            FROM notification_id\n            ORDER BY last_received_timestamp_ms DESC\n            LIMIT -1 OFFSET ?\n        )\n    ";
        return c5.a.e(this.__db, false, true, new Function1() { // from class: kh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(m.i(str, i10, (f5.b) obj));
            }
        }, bVar);
    }

    @Override // kh.i
    @Nullable
    public Object e(@NotNull final String str, @NotNull lt.b<? super Boolean> bVar) {
        final String str2 = "SELECT COUNT(*) > 0 FROM notification_id WHERE notification_id = ?";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: kh.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.j(str2, str, (f5.b) obj));
            }
        }, bVar);
    }
}
