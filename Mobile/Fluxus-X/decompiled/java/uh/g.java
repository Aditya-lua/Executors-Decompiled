package uh;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import vh.AnalyticEvent;
import y4.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006#"}, d2 = {"Luh/g;", "Luh/a;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", BuildConfig.FLAVOR, "Lvh/a;", "events", BuildConfig.FLAVOR, "h", "([Lvh/a;Leu/b;)Ljava/lang/Object;", "event", "i", "(Lvh/a;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "e", "(Ljava/util/List;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "l", "(Leu/b;)Ljava/lang/Object;", "batchSize", "f", "(ILeu/b;)Ljava/lang/Object;", "b", "Ly4/u;", "Ly4/f;", "c", "Ly4/f;", "__insertAdapterOfAnalyticEvent", "Ly4/e;", "d", "Ly4/e;", "__deleteAdapterOfAnalyticEvent", "__updateAdapterOfAnalyticEvent", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements uh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.f<AnalyticEvent> __insertAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.e<AnalyticEvent> __deleteAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.e<AnalyticEvent> __updateAdapterOfAnalyticEvent;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"uh/g$a", "Ly4/f;", "Lvh/a;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lvh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends y4.f<AnalyticEvent> {
        @Override // y4.f
        public String b() {
            return "INSERT OR ABORT INTO `analytic_event` (`id`,`serialized_event`,`event_name`,`event_context`,`serialized_params`,`retry_attempt_count`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.B(1, entity.getId());
            statement.m0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.F(3);
            } else {
                statement.m0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.F(4);
            } else {
                statement.m0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.F(5);
            } else {
                statement.m0(5, serializedParams);
            }
            Integer retryAttemptCount = entity.getRetryAttemptCount();
            if (retryAttemptCount == null) {
                statement.F(6);
            } else {
                statement.B(6, retryAttemptCount.intValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"uh/g$b", "Ly4/e;", "Lvh/a;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "e", "(Lg5/d;Lvh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends y4.e<AnalyticEvent> {
        @Override // y4.e
        public String b() {
            return "DELETE FROM `analytic_event` WHERE `id` = ?";
        }

        @Override // y4.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.B(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"uh/g$c", "Ly4/e;", "Lvh/a;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "e", "(Lg5/d;Lvh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends y4.e<AnalyticEvent> {
        @Override // y4.e
        public String b() {
            return "UPDATE OR ABORT `analytic_event` SET `id` = ?,`serialized_event` = ?,`event_name` = ?,`event_context` = ?,`serialized_params` = ?,`retry_attempt_count` = ? WHERE `id` = ?";
        }

        @Override // y4.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.B(1, entity.getId());
            statement.m0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.F(3);
            } else {
                statement.m0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.F(4);
            } else {
                statement.m0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.F(5);
            } else {
                statement.m0(5, serializedParams);
            }
            Integer retryAttemptCount = entity.getRetryAttemptCount();
            if (retryAttemptCount == null) {
                statement.F(6);
            } else {
                statement.B(6, retryAttemptCount.intValue());
            }
            statement.B(7, entity.getId());
        }
    }

    /* JADX INFO: renamed from: uh.g$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luh/g$d;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public g(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfAnalyticEvent = new a();
        this.__deleteAdapterOfAnalyticEvent = new b();
        this.__updateAdapterOfAnalyticEvent = new c();
    }

    public static final Unit s(g gVar, AnalyticEvent analyticEvent, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__deleteAdapterOfAnalyticEvent.c(_connection, analyticEvent);
        return Unit.f21506a;
    }

    public static final List t(String str, int i10, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, i10);
            int iC = d5.j.c(dVarW3, "id");
            int iC2 = d5.j.c(dVarW3, "serialized_event");
            int iC3 = d5.j.c(dVarW3, "event_name");
            int iC4 = d5.j.c(dVarW3, "event_context");
            int iC5 = d5.j.c(dVarW3, "serialized_params");
            int iC6 = d5.j.c(dVarW3, "retry_attempt_count");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                arrayList.add(new AnalyticEvent((int) dVarW3.getLong(iC), dVarW3.I2(iC2), dVarW3.isNull(iC3) ? null : dVarW3.I2(iC3), dVarW3.isNull(iC4) ? null : dVarW3.I2(iC4), dVarW3.isNull(iC5) ? null : dVarW3.I2(iC5), dVarW3.isNull(iC6) ? null : Integer.valueOf((int) dVarW3.getLong(iC6))));
            }
            return arrayList;
        } finally {
            dVarW3.close();
        }
    }

    public static final int u(String str, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            return dVarW3.n3() ? (int) dVarW3.getLong(0) : 0;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit v(g gVar, AnalyticEvent[] analyticEventArr, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__insertAdapterOfAnalyticEvent.e(_connection, analyticEventArr);
        return Unit.f21506a;
    }

    public static final Unit w(g gVar, List list, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__updateAdapterOfAnalyticEvent.d(_connection, list);
        return Unit.f21506a;
    }

    @Override // uh.a
    @Nullable
    public /* bridge */ Object b(int i10, @NotNull eu.b<? super List<AnalyticEvent>> bVar) {
        return super.b(i10, bVar);
    }

    @Override // uh.a
    @Nullable
    public /* bridge */ Object c(@NotNull List<AnalyticEvent> list, @NotNull eu.b<? super Unit> bVar) {
        return super.c(list, bVar);
    }

    @Override // uh.a
    @Nullable
    public /* bridge */ Object d(@NotNull AnalyticEvent[] analyticEventArr, @NotNull eu.b<? super Boolean> bVar) {
        return super.d(analyticEventArr, bVar);
    }

    @Override // uh.a
    @Nullable
    public Object e(@NotNull final List<AnalyticEvent> list, @NotNull eu.b<? super Unit> bVar) {
        Object objE = d5.a.e(this.__db, false, true, new Function1() { // from class: uh.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.w(this.f33296a, list, (g5.b) obj);
            }
        }, bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }

    @Override // uh.a
    @Nullable
    public Object f(final int i10, @NotNull eu.b<? super List<AnalyticEvent>> bVar) {
        final String str = "SELECT * FROM analytic_event LIMIT ?";
        return d5.a.e(this.__db, true, false, new Function1() { // from class: uh.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.t(str, i10, (g5.b) obj);
            }
        }, bVar);
    }

    @Override // uh.a
    @Nullable
    public Object h(@NotNull final AnalyticEvent[] analyticEventArr, @NotNull eu.b<? super Unit> bVar) {
        Object objE = d5.a.e(this.__db, false, true, new Function1() { // from class: uh.f
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.v(this.f33298a, analyticEventArr, (g5.b) obj);
            }
        }, bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }

    @Override // uh.a
    @Nullable
    public Object i(@NotNull final AnalyticEvent analyticEvent, @NotNull eu.b<? super Unit> bVar) {
        Object objE = d5.a.e(this.__db, false, true, new Function1() { // from class: uh.e
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.s(this.f33297a, analyticEvent, (g5.b) obj);
            }
        }, bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }

    @Override // uh.a
    @Nullable
    public /* bridge */ Object j(@NotNull AnalyticEvent analyticEvent, @NotNull eu.b<? super Unit> bVar) {
        return super.j(analyticEvent, bVar);
    }

    @Override // uh.a
    @Nullable
    public Object l(@NotNull eu.b<? super Integer> bVar) {
        final String str = "SELECT COUNT(*) FROM analytic_event";
        return d5.a.e(this.__db, true, false, new Function1() { // from class: uh.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(g.u(str, (g5.b) obj));
            }
        }, bVar);
    }
}
