package uh;

import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import vh.AnalyticEvent;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bg\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Luh/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "l", "(Leu/b;)Ljava/lang/Object;", "batchSize", BuildConfig.FLAVOR, "Lvh/a;", "f", "(ILeu/b;)Ljava/lang/Object;", "b", BuildConfig.FLAVOR, "events", BuildConfig.FLAVOR, "h", "([Lvh/a;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "d", "e", "(Ljava/util/List;Leu/b;)Ljava/lang/Object;", "c", "event", "i", "(Lvh/a;Leu/b;)Ljava/lang/Object;", "j", "a", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f33281a;

    /* JADX INFO: renamed from: uh.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luh/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f33281a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeDeleteEvent$2", f = "AnalyticEventDao.kt", l = {42}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33282t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent f33284v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnalyticEvent analyticEvent, eu.b<? super b> bVar) {
            super(1, bVar);
            this.f33284v = analyticEvent;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return a.this.new b(this.f33284v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33282t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent analyticEvent = this.f33284v;
                this.f33282t = 1;
                if (aVar.i(analyticEvent, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "Lvh/a;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeGetEventsBatch$2", f = "AnalyticEventDao.kt", l = {24}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function1<eu.b<? super List<? extends AnalyticEvent>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33285t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f33287v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, eu.b<? super c> bVar) {
            super(1, bVar);
            this.f33287v = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return a.this.new c(this.f33287v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33285t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            int i11 = this.f33287v;
            this.f33285t = 1;
            Object objF = aVar.f(i11, this);
            return objF == objE ? objE : objF;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super List<AnalyticEvent>> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeInsertEvents$2", f = "AnalyticEventDao.kt", l = {BacktraceMetrics.defaultTimeIntervalInMin}, m = "invokeSuspend", v = 1)
    public static final class d extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33288t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent[] f33290v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnalyticEvent[] analyticEventArr, eu.b<? super d> bVar) {
            super(1, bVar);
            this.f33290v = analyticEventArr;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return a.this.new d(this.f33290v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33288t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent[] analyticEventArr = this.f33290v;
                AnalyticEvent[] analyticEventArr2 = (AnalyticEvent[]) Arrays.copyOf(analyticEventArr, analyticEventArr.length);
                this.f33288t = 1;
                if (aVar.h(analyticEventArr2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeUpdateEvents$2", f = "AnalyticEventDao.kt", l = {36}, m = "invokeSuspend", v = 1)
    public static final class e extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33291t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<AnalyticEvent> f33293v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<AnalyticEvent> list, eu.b<? super e> bVar) {
            super(1, bVar);
            this.f33293v = list;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return a.this.new e(this.f33293v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33291t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<AnalyticEvent> list = this.f33293v;
                this.f33291t = 1;
                if (aVar.e(list, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    static /* synthetic */ Object a(a aVar, AnalyticEvent[] analyticEventArr, eu.b<? super Boolean> bVar) {
        return h.b("AnalyticEventDao", aVar.new d(analyticEventArr, null), bVar);
    }

    static /* synthetic */ Object g(a aVar, int i10, eu.b<? super List<AnalyticEvent>> bVar) {
        return h.a("AnalyticEventDao", aVar.new c(i10, null), bVar);
    }

    static /* synthetic */ Object k(a aVar, AnalyticEvent analyticEvent, eu.b<? super Unit> bVar) {
        Object objC = h.c("AnalyticEventDao", aVar.new b(analyticEvent, null), bVar);
        return objC == fu.c.e() ? objC : Unit.f21506a;
    }

    static /* synthetic */ Object m(a aVar, List<AnalyticEvent> list, eu.b<? super Unit> bVar) {
        Object objC = h.c("AnalyticEventDao", aVar.new e(list, null), bVar);
        return objC == fu.c.e() ? objC : Unit.f21506a;
    }

    @Nullable
    default Object b(int i10, @NotNull eu.b<? super List<AnalyticEvent>> bVar) {
        return g(this, i10, bVar);
    }

    @Nullable
    default Object c(@NotNull List<AnalyticEvent> list, @NotNull eu.b<? super Unit> bVar) {
        return m(this, list, bVar);
    }

    @Nullable
    default Object d(@NotNull AnalyticEvent[] analyticEventArr, @NotNull eu.b<? super Boolean> bVar) {
        return a(this, analyticEventArr, bVar);
    }

    @Nullable
    Object e(@NotNull List<AnalyticEvent> list, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    Object f(int i10, @NotNull eu.b<? super List<AnalyticEvent>> bVar);

    @Nullable
    Object h(@NotNull AnalyticEvent[] analyticEventArr, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    Object i(@NotNull AnalyticEvent analyticEvent, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    default Object j(@NotNull AnalyticEvent analyticEvent, @NotNull eu.b<? super Unit> bVar) {
        return k(this, analyticEvent, bVar);
    }

    @Nullable
    Object l(@NotNull eu.b<? super Integer> bVar);
}
