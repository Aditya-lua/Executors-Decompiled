package lh;

import java.util.Arrays;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, d2 = {"Llh/a;", "", "", "f", "(Lnt/b;)Ljava/lang/Object;", "batchSize", "", "Lmh/a;", "l", "(ILnt/b;)Ljava/lang/Object;", "a", "", "events", "", "g", "([Lmh/a;Lnt/b;)Ljava/lang/Object;", "", "i", "m", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "h", "event", "k", "(Lmh/a;Lnt/b;)Ljava/lang/Object;", "d", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f23222a;

    /* JADX INFO: renamed from: lh.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llh/a$a;", "", "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f23222a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeDeleteEvent$2", f = "AnalyticEventDao.kt", l = {42}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23223t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent f23225v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnalyticEvent analyticEvent, nt.b<? super b> bVar) {
            super(1, bVar);
            this.f23225v = analyticEvent;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return a.this.new b(this.f23225v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23223t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent analyticEvent = this.f23225v;
                this.f23223t = 1;
                if (aVar.k(analyticEvent, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lmh/a;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeGetEventsBatch$2", f = "AnalyticEventDao.kt", l = {24}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function1<nt.b<? super List<? extends AnalyticEvent>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23226t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f23228v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, nt.b<? super c> bVar) {
            super(1, bVar);
            this.f23228v = i10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return a.this.new c(this.f23228v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23226t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            int i11 = this.f23228v;
            this.f23226t = 1;
            Object objL = aVar.l(i11, this);
            return objL == objE ? objE : objL;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super List<AnalyticEvent>> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeInsertEvents$2", f = "AnalyticEventDao.kt", l = {30}, m = "invokeSuspend", v = 1)
    public static final class d extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23229t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent[] f23231v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnalyticEvent[] analyticEventArr, nt.b<? super d> bVar) {
            super(1, bVar);
            this.f23231v = analyticEventArr;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return a.this.new d(this.f23231v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23229t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent[] analyticEventArr = this.f23231v;
                AnalyticEvent[] analyticEventArr2 = (AnalyticEvent[]) Arrays.copyOf(analyticEventArr, analyticEventArr.length);
                this.f23229t = 1;
                if (aVar.g(analyticEventArr2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeUpdateEvents$2", f = "AnalyticEventDao.kt", l = {36}, m = "invokeSuspend", v = 1)
    public static final class e extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23232t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<AnalyticEvent> f23234v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<AnalyticEvent> list, nt.b<? super e> bVar) {
            super(1, bVar);
            this.f23234v = list;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return a.this.new e(this.f23234v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f23232t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<AnalyticEvent> list = this.f23234v;
                this.f23232t = 1;
                if (aVar.m(list, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static /* synthetic */ Object b(a aVar, AnalyticEvent analyticEvent, nt.b<? super Unit> bVar) {
        Object objC = h.c("AnalyticEventDao", aVar.new b(analyticEvent, null), bVar);
        return objC == ot.c.e() ? objC : Unit.f22483a;
    }

    static /* synthetic */ Object c(a aVar, AnalyticEvent[] analyticEventArr, nt.b<? super Boolean> bVar) {
        return h.b("AnalyticEventDao", aVar.new d(analyticEventArr, null), bVar);
    }

    static /* synthetic */ Object e(a aVar, List<AnalyticEvent> list, nt.b<? super Unit> bVar) {
        Object objC = h.c("AnalyticEventDao", aVar.new e(list, null), bVar);
        return objC == ot.c.e() ? objC : Unit.f22483a;
    }

    static /* synthetic */ Object j(a aVar, int i10, nt.b<? super List<AnalyticEvent>> bVar) {
        return h.a("AnalyticEventDao", aVar.new c(i10, null), bVar);
    }

    @Nullable
    default Object a(int i10, @NotNull nt.b<? super List<AnalyticEvent>> bVar) {
        return j(this, i10, bVar);
    }

    @Nullable
    default Object d(@NotNull AnalyticEvent analyticEvent, @NotNull nt.b<? super Unit> bVar) {
        return b(this, analyticEvent, bVar);
    }

    @Nullable
    Object f(@NotNull nt.b<? super Integer> bVar);

    @Nullable
    Object g(@NotNull AnalyticEvent[] analyticEventArr, @NotNull nt.b<? super Unit> bVar);

    @Nullable
    default Object h(@NotNull List<AnalyticEvent> list, @NotNull nt.b<? super Unit> bVar) {
        return e(this, list, bVar);
    }

    @Nullable
    default Object i(@NotNull AnalyticEvent[] analyticEventArr, @NotNull nt.b<? super Boolean> bVar) {
        return c(this, analyticEventArr, bVar);
    }

    @Nullable
    Object k(@NotNull AnalyticEvent analyticEvent, @NotNull nt.b<? super Unit> bVar);

    @Nullable
    Object l(int i10, @NotNull nt.b<? super List<AnalyticEvent>> bVar);

    @Nullable
    Object m(@NotNull List<AnalyticEvent> list, @NotNull nt.b<? super Unit> bVar);
}
