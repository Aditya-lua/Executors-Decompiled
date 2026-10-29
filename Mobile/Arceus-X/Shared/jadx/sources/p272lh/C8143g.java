package p272lh;

import androidx.core.app.NotificationCompat;
import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p041c5.C1534j;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.AbstractC12658e;
import p535x4.AbstractC12660f;
import p535x4.AbstractC12682u;

/* JADX INFO: renamed from: lh.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, m31665d2 = {"Llh/g;", "Llh/a;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "", "Lmh/a;", "events", "", "g", "([Lmh/a;Lnt/b;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "k", "(Lmh/a;Lnt/b;)Ljava/lang/Object;", "", "m", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "", "f", "(Lnt/b;)Ljava/lang/Object;", "batchSize", "l", "(ILnt/b;)Ljava/lang/Object;", "b", "Lx4/u;", "Lx4/f;", "c", "Lx4/f;", "__insertAdapterOfAnalyticEvent", "Lx4/e;", "d", "Lx4/e;", "__deleteAdapterOfAnalyticEvent", "e", "__updateAdapterOfAnalyticEvent", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8143g implements InterfaceC8137a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<AnalyticEvent> __insertAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12658e<AnalyticEvent> __deleteAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12658e<AnalyticEvent> __updateAdapterOfAnalyticEvent;

    /* JADX INFO: renamed from: lh.g$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"lh/g$a", "Lx4/f;", "Lmh/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lmh/a;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<AnalyticEvent> {
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR ABORT INTO `analytic_event` (`id`,`serialized_event`,`event_name`,`event_context`,`serialized_params`,`retry_attempt_count`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24706z(1, entity.getId());
            statement.mo24705k0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.mo24700C(3);
            } else {
                statement.mo24705k0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.mo24700C(4);
            } else {
                statement.mo24705k0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.mo24700C(5);
            } else {
                statement.mo24705k0(5, serializedParams);
            }
            Integer retryAttemptCount = entity.getRetryAttemptCount();
            if (retryAttemptCount == null) {
                statement.mo24700C(6);
            } else {
                statement.mo24706z(6, retryAttemptCount.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: lh.g$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"lh/g$b", "Lx4/e;", "Lmh/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Lmh/a;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC12658e<AnalyticEvent> {
        @Override // p535x4.AbstractC12658e
        /* JADX INFO: renamed from: b */
        public String mo24868b() {
            return "DELETE FROM `analytic_event` WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12658e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo24867a(InterfaceC5361d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24706z(1, entity.getId());
        }
    }

    /* JADX INFO: renamed from: lh.g$c */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"lh/g$c", "Lx4/e;", "Lmh/a;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Lmh/a;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC12658e<AnalyticEvent> {
        @Override // p535x4.AbstractC12658e
        /* JADX INFO: renamed from: b */
        public String mo24868b() {
            return "UPDATE OR ABORT `analytic_event` SET `id` = ?,`serialized_event` = ?,`event_name` = ?,`event_context` = ?,`serialized_params` = ?,`retry_attempt_count` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12658e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo24867a(InterfaceC5361d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24706z(1, entity.getId());
            statement.mo24705k0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.mo24700C(3);
            } else {
                statement.mo24705k0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.mo24700C(4);
            } else {
                statement.mo24705k0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.mo24700C(5);
            } else {
                statement.mo24705k0(5, serializedParams);
            }
            Integer retryAttemptCount = entity.getRetryAttemptCount();
            if (retryAttemptCount == null) {
                statement.mo24700C(6);
            } else {
                statement.mo24706z(6, retryAttemptCount.intValue());
            }
            statement.mo24706z(7, entity.getId());
        }
    }

    /* JADX INFO: renamed from: lh.g$d, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Llh/g$d;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: lh.g.d.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m33383a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C8143g(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfAnalyticEvent = new a();
        this.__deleteAdapterOfAnalyticEvent = new b();
        this.__updateAdapterOfAnalyticEvent = new c();
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m33375s(C8143g c8143g, AnalyticEvent analyticEvent, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c8143g.__deleteAdapterOfAnalyticEvent.m47165c(_connection, analyticEvent);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final List m33376t(String str, int i10, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, i10);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "serialized_event");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "event_name");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "event_context");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "serialized_params");
            int iM8099c6 = C1534j.m8099c(interfaceC5361dMo24696r3, "retry_attempt_count");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                arrayList.add(new AnalyticEvent((int) interfaceC5361dMo24696r3.getLong(iM8099c), interfaceC5361dMo24696r3.mo24702E2(iM8099c2), interfaceC5361dMo24696r3.isNull(iM8099c3) ? null : interfaceC5361dMo24696r3.mo24702E2(iM8099c3), interfaceC5361dMo24696r3.isNull(iM8099c4) ? null : interfaceC5361dMo24696r3.mo24702E2(iM8099c4), interfaceC5361dMo24696r3.isNull(iM8099c5) ? null : interfaceC5361dMo24696r3.mo24702E2(iM8099c5), interfaceC5361dMo24696r3.isNull(iM8099c6) ? null : Integer.valueOf((int) interfaceC5361dMo24696r3.getLong(iM8099c6))));
            }
            return arrayList;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final int m33377u(String str, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            return interfaceC5361dMo24696r3.mo24704g3() ? (int) interfaceC5361dMo24696r3.getLong(0) : 0;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m33378v(C8143g c8143g, AnalyticEvent[] analyticEventArr, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c8143g.__insertAdapterOfAnalyticEvent.m47172e(_connection, analyticEventArr);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m33379w(C8143g c8143g, List list, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c8143g.__updateAdapterOfAnalyticEvent.m47166d(_connection, list);
        return Unit.f29331a;
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ Object mo33357a(int i10, @NotNull InterfaceC9557b<? super List<AnalyticEvent>> interfaceC9557b) {
        return super.mo33357a(i10, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: d */
    public /* bridge */ Object mo33358d(@NotNull AnalyticEvent analyticEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return super.mo33358d(analyticEvent, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo33359f(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        final String str = "SELECT COUNT(*) FROM analytic_event";
        return C1525a.m8067e(this.__db, true, false, new Function1() { // from class: lh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C8143g.m33377u(str, (InterfaceC5359b) obj));
            }
        }, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo33360g(@NotNull final AnalyticEvent[] analyticEventArr, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM8067e = C1525a.m8067e(this.__db, false, true, new Function1() { // from class: lh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8143g.m33378v(this.f30185a, analyticEventArr, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
        return objM8067e == C10047c.m38805e() ? objM8067e : Unit.f29331a;
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: h */
    public /* bridge */ Object mo33361h(@NotNull List<AnalyticEvent> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return super.mo33361h(list, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: i */
    public /* bridge */ Object mo33362i(@NotNull AnalyticEvent[] analyticEventArr, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return super.mo33362i(analyticEventArr, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo33363k(@NotNull final AnalyticEvent analyticEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM8067e = C1525a.m8067e(this.__db, false, true, new Function1() { // from class: lh.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8143g.m33375s(this.f30183a, analyticEvent, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
        return objM8067e == C10047c.m38805e() ? objM8067e : Unit.f29331a;
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo33364l(final int i10, @NotNull InterfaceC9557b<? super List<AnalyticEvent>> interfaceC9557b) {
        final String str = "SELECT * FROM analytic_event LIMIT ?";
        return C1525a.m8067e(this.__db, true, false, new Function1() { // from class: lh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8143g.m33376t(str, i10, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
    }

    @Override // p272lh.InterfaceC8137a
    @Nullable
    /* JADX INFO: renamed from: m */
    public Object mo33365m(@NotNull final List<AnalyticEvent> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM8067e = C1525a.m8067e(this.__db, false, true, new Function1() { // from class: lh.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8143g.m33379w(this.f30181a, list, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
        return objM8067e == C10047c.m38805e() ? objM8067e : Unit.f29331a;
    }
}
