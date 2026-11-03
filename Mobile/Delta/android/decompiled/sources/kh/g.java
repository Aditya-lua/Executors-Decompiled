package kh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006!"}, d2 = {"Lkh/g;", "Lkh/a;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "", "Llh/a;", "events", "", "c", "([Llh/a;Llt/b;)Ljava/lang/Object;", "event", "b", "(Llh/a;Llt/b;)Ljava/lang/Object;", "", "f", "(Ljava/util/List;Llt/b;)Ljava/lang/Object;", "", "l", "(Llt/b;)Ljava/lang/Object;", "batchSize", "e", "(ILlt/b;)Ljava/lang/Object;", "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfAnalyticEvent", "Lx4/e;", "d", "Lx4/e;", "__deleteAdapterOfAnalyticEvent", "__updateAdapterOfAnalyticEvent", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements kh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.f<AnalyticEvent> __insertAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.e<AnalyticEvent> __deleteAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.e<AnalyticEvent> __updateAdapterOfAnalyticEvent;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/g$a", "Lx4/f;", "Llh/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Llh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends x4.f<AnalyticEvent> {
        @Override // x4.f
        public String b() {
            return "INSERT OR ABORT INTO `analytic_event` (`id`,`serialized_event`,`event_name`,`event_context`,`serialized_params`,`retry_attempt_count`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.y(1, entity.getId());
            statement.h0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.B(3);
            } else {
                statement.h0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.B(4);
            } else {
                statement.h0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.B(5);
            } else {
                statement.h0(5, serializedParams);
            }
            Integer retryAttemptCount = entity.getRetryAttemptCount();
            if (retryAttemptCount == null) {
                statement.B(6);
            } else {
                statement.y(6, retryAttemptCount.intValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/g$b", "Lx4/e;", "Llh/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Llh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends x4.e<AnalyticEvent> {
        @Override // x4.e
        public String b() {
            return "DELETE FROM `analytic_event` WHERE `id` = ?";
        }

        @Override // x4.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.y(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/g$c", "Lx4/e;", "Llh/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Llh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x4.e<AnalyticEvent> {
        @Override // x4.e
        public String b() {
            return "UPDATE OR ABORT `analytic_event` SET `id` = ?,`serialized_event` = ?,`event_name` = ?,`event_context` = ?,`serialized_params` = ?,`retry_attempt_count` = ? WHERE `id` = ?";
        }

        @Override // x4.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.y(1, entity.getId());
            statement.h0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.B(3);
            } else {
                statement.h0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.B(4);
            } else {
                statement.h0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.B(5);
            } else {
                statement.h0(5, serializedParams);
            }
            Integer retryAttemptCount = entity.getRetryAttemptCount();
            if (retryAttemptCount == null) {
                statement.B(6);
            } else {
                statement.y(6, retryAttemptCount.intValue());
            }
            statement.y(7, entity.getId());
        }
    }

    /* JADX INFO: renamed from: kh.g$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkh/g$d;", "", "<init>", "()V", "", "Lfu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public g(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfAnalyticEvent = new a();
        this.__deleteAdapterOfAnalyticEvent = new b();
        this.__updateAdapterOfAnalyticEvent = new c();
    }

    public static final Unit s(g gVar, AnalyticEvent analyticEvent, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__deleteAdapterOfAnalyticEvent.c(_connection, analyticEvent);
        return Unit.f22938a;
    }

    public static final List t(String str, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.y(1, i10);
            int iC = c5.j.c(dVarR3, "id");
            int iC2 = c5.j.c(dVarR3, "serialized_event");
            int iC3 = c5.j.c(dVarR3, "event_name");
            int iC4 = c5.j.c(dVarR3, "event_context");
            int iC5 = c5.j.c(dVarR3, "serialized_params");
            int iC6 = c5.j.c(dVarR3, "retry_attempt_count");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.i3()) {
                arrayList.add(new AnalyticEvent((int) dVarR3.getLong(iC), dVarR3.F2(iC2), dVarR3.isNull(iC3) ? null : dVarR3.F2(iC3), dVarR3.isNull(iC4) ? null : dVarR3.F2(iC4), dVarR3.isNull(iC5) ? null : dVarR3.F2(iC5), dVarR3.isNull(iC6) ? null : Integer.valueOf((int) dVarR3.getLong(iC6))));
            }
            return arrayList;
        } finally {
            dVarR3.close();
        }
    }

    public static final int u(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            return dVarR3.i3() ? (int) dVarR3.getLong(0) : 0;
        } finally {
            dVarR3.close();
        }
    }

    public static final Unit v(g gVar, AnalyticEvent[] analyticEventArr, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__insertAdapterOfAnalyticEvent.e(_connection, analyticEventArr);
        return Unit.f22938a;
    }

    public static final Unit w(g gVar, List list, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__updateAdapterOfAnalyticEvent.d(_connection, list);
        return Unit.f22938a;
    }

    @Override // kh.a
    @Nullable
    public Object b(@NotNull final AnalyticEvent analyticEvent, @NotNull lt.b<? super Unit> bVar) {
        Object objE = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.s(this.f22681a, analyticEvent, (f5.b) obj);
            }
        }, bVar);
        return objE == mt.c.e() ? objE : Unit.f22938a;
    }

    @Override // kh.a
    @Nullable
    public Object c(@NotNull final AnalyticEvent[] analyticEventArr, @NotNull lt.b<? super Unit> bVar) {
        Object objE = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.v(this.f22682a, analyticEventArr, (f5.b) obj);
            }
        }, bVar);
        return objE == mt.c.e() ? objE : Unit.f22938a;
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object d(@NotNull List<AnalyticEvent> list, @NotNull lt.b<? super Unit> bVar) {
        return super.d(list, bVar);
    }

    @Override // kh.a
    @Nullable
    public Object e(final int i10, @NotNull lt.b<? super List<AnalyticEvent>> bVar) {
        final String str = "SELECT * FROM analytic_event LIMIT ?";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: kh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.t(str, i10, (f5.b) obj);
            }
        }, bVar);
    }

    @Override // kh.a
    @Nullable
    public Object f(@NotNull final List<AnalyticEvent> list, @NotNull lt.b<? super Unit> bVar) {
        Object objE = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.w(this.f22680a, list, (f5.b) obj);
            }
        }, bVar);
        return objE == mt.c.e() ? objE : Unit.f22938a;
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object g(@NotNull AnalyticEvent analyticEvent, @NotNull lt.b<? super Unit> bVar) {
        return super.g(analyticEvent, bVar);
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object i(int i10, @NotNull lt.b<? super List<AnalyticEvent>> bVar) {
        return super.i(i10, bVar);
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object k(@NotNull AnalyticEvent[] analyticEventArr, @NotNull lt.b<? super Boolean> bVar) {
        return super.k(analyticEventArr, bVar);
    }

    @Override // kh.a
    @Nullable
    public Object l(@NotNull lt.b<? super Integer> bVar) {
        final String str = "SELECT COUNT(*) FROM analytic_event";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: kh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(g.u(str, (f5.b) obj));
            }
        }, bVar);
    }
}
