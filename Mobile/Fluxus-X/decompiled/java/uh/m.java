package uh;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import vh.NotificationId;
import y4.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u001a"}, d2 = {"Luh/m;", "Luh/i;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", BuildConfig.FLAVOR, "Lvh/b;", "notificationIds", BuildConfig.FLAVOR, "b", "([Lvh/b;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "maxRowsCount", "a", "(ILeu/b;)Ljava/lang/Object;", "Ly4/u;", "Ly4/f;", "Ly4/f;", "__insertAdapterOfNotificationId", "d", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.f<NotificationId> __insertAdapterOfNotificationId;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"uh/m$a", "Ly4/f;", "Lvh/b;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lvh/b;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends y4.f<NotificationId> {
        @Override // y4.f
        public String b() {
            return "INSERT OR REPLACE INTO `notification_id` (`notification_id`,`last_received_timestamp_ms`) VALUES (?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, NotificationId entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.getNotificationId());
            statement.B(2, entity.getLastReceivedTimestampMs());
        }
    }

    /* JADX INFO: renamed from: uh.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luh/m$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<xu.c<?>> a() {
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

    public static final int i(String str, int i10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, i10);
            dVarW3.n3();
            return d5.i.b(_connection);
        } finally {
            dVarW3.close();
        }
    }

    public static final boolean j(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            boolean z10 = false;
            if (dVarW3.n3()) {
                z10 = ((int) dVarW3.getLong(0)) != 0;
            }
            return z10;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit k(m mVar, NotificationId[] notificationIdArr, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        mVar.__insertAdapterOfNotificationId.e(_connection, notificationIdArr);
        return Unit.f21506a;
    }

    @Override // uh.i
    @Nullable
    public Object a(final int i10, @NotNull eu.b<? super Integer> bVar) {
        final String str = "\n        DELETE FROM notification_id\n        WHERE notification_id IN (\n            SELECT notification_id\n            FROM notification_id\n            ORDER BY last_received_timestamp_ms DESC\n            LIMIT -1 OFFSET ?\n        )\n    ";
        return d5.a.e(this.__db, false, true, new Function1() { // from class: uh.k
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(m.i(str, i10, (g5.b) obj));
            }
        }, bVar);
    }

    @Override // uh.i
    @Nullable
    public Object b(@NotNull final NotificationId[] notificationIdArr, @NotNull eu.b<? super Unit> bVar) {
        Object objE = d5.a.e(this.__db, false, true, new Function1() { // from class: uh.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.k(this.f33322a, notificationIdArr, (g5.b) obj);
            }
        }, bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }

    @Override // uh.i
    @Nullable
    public Object c(@NotNull final String str, @NotNull eu.b<? super Boolean> bVar) {
        final String str2 = "SELECT COUNT(*) > 0 FROM notification_id WHERE notification_id = ?";
        return d5.a.e(this.__db, true, false, new Function1() { // from class: uh.j
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.j(str2, str, (g5.b) obj));
            }
        }, bVar);
    }

    @Override // uh.i
    @Nullable
    public /* bridge */ Object e(@NotNull NotificationId[] notificationIdArr, @NotNull eu.b<? super Boolean> bVar) {
        return super.e(notificationIdArr, bVar);
    }
}
