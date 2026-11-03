package kh;

import gt.o;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bg\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lkh/a;", "", "", "l", "(Llt/b;)Ljava/lang/Object;", "batchSize", "", "Llh/a;", "e", "(ILlt/b;)Ljava/lang/Object;", "i", "", "events", "", "c", "([Llh/a;Llt/b;)Ljava/lang/Object;", "", "k", "f", "(Ljava/util/List;Llt/b;)Ljava/lang/Object;", "d", "event", "b", "(Llh/a;Llt/b;)Ljava/lang/Object;", "g", "a", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f22665a;

    /* JADX INFO: renamed from: kh.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkh/a$a;", "", "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22665a = new Companion();
    }

    @nt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeDeleteEvent$2", f = "AnalyticEventDao.kt", l = {42}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22666t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent f22668v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnalyticEvent analyticEvent, lt.b<? super b> bVar) {
            super(1, bVar);
            this.f22668v = analyticEvent;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return a.this.new b(this.f22668v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22666t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent analyticEvent = this.f22668v;
                this.f22666t = 1;
                if (aVar.b(analyticEvent, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeGetEventsBatch$2", f = "AnalyticEventDao.kt", l = {24}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Llh/a;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function1<lt.b<? super List<? extends AnalyticEvent>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22669t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f22671v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, lt.b<? super c> bVar) {
            super(1, bVar);
            this.f22671v = i10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return a.this.new c(this.f22671v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22669t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            int i11 = this.f22671v;
            this.f22669t = 1;
            Object objE2 = aVar.e(i11, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super List<AnalyticEvent>> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeInsertEvents$2", f = "AnalyticEventDao.kt", l = {30}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22672t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent[] f22674v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnalyticEvent[] analyticEventArr, lt.b<? super d> bVar) {
            super(1, bVar);
            this.f22674v = analyticEventArr;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return a.this.new d(this.f22674v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22672t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent[] analyticEventArr = this.f22674v;
                AnalyticEvent[] analyticEventArr2 = (AnalyticEvent[]) Arrays.copyOf(analyticEventArr, analyticEventArr.length);
                this.f22672t = 1;
                if (aVar.c(analyticEventArr2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeUpdateEvents$2", f = "AnalyticEventDao.kt", l = {36}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22675t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<AnalyticEvent> f22677v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<AnalyticEvent> list, lt.b<? super e> bVar) {
            super(1, bVar);
            this.f22677v = list;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return a.this.new e(this.f22677v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22675t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<AnalyticEvent> list = this.f22677v;
                this.f22675t = 1;
                if (aVar.f(list, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    static /* synthetic */ Object a(a aVar, AnalyticEvent[] analyticEventArr, lt.b<? super Boolean> bVar) {
        return h.b("AnalyticEventDao", aVar.new d(analyticEventArr, null), bVar);
    }

    static /* synthetic */ Object h(a aVar, List<AnalyticEvent> list, lt.b<? super Unit> bVar) {
        Object objC = h.c("AnalyticEventDao", aVar.new e(list, null), bVar);
        return objC == mt.c.e() ? objC : Unit.f22938a;
    }

    static /* synthetic */ Object j(a aVar, int i10, lt.b<? super List<AnalyticEvent>> bVar) {
        return h.a("AnalyticEventDao", aVar.new c(i10, null), bVar);
    }

    static /* synthetic */ Object m(a aVar, AnalyticEvent analyticEvent, lt.b<? super Unit> bVar) {
        Object objC = h.c("AnalyticEventDao", aVar.new b(analyticEvent, null), bVar);
        return objC == mt.c.e() ? objC : Unit.f22938a;
    }

    @Nullable
    Object b(@NotNull AnalyticEvent analyticEvent, @NotNull lt.b<? super Unit> bVar);

    @Nullable
    Object c(@NotNull AnalyticEvent[] analyticEventArr, @NotNull lt.b<? super Unit> bVar);

    @Nullable
    default Object d(@NotNull List<AnalyticEvent> list, @NotNull lt.b<? super Unit> bVar) {
        return h(this, list, bVar);
    }

    @Nullable
    Object e(int i10, @NotNull lt.b<? super List<AnalyticEvent>> bVar);

    @Nullable
    Object f(@NotNull List<AnalyticEvent> list, @NotNull lt.b<? super Unit> bVar);

    @Nullable
    default Object g(@NotNull AnalyticEvent analyticEvent, @NotNull lt.b<? super Unit> bVar) {
        return m(this, analyticEvent, bVar);
    }

    @Nullable
    default Object i(int i10, @NotNull lt.b<? super List<AnalyticEvent>> bVar) {
        return j(this, i10, bVar);
    }

    @Nullable
    default Object k(@NotNull AnalyticEvent[] analyticEventArr, @NotNull lt.b<? super Boolean> bVar) {
        return a(this, analyticEventArr, bVar);
    }

    @Nullable
    Object l(@NotNull lt.b<? super Integer> bVar);
}
