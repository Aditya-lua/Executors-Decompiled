package p272lh;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: lh.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, m31665d2 = {"Llh/a;", "", "", "f", "(Lnt/b;)Ljava/lang/Object;", "batchSize", "", "Lmh/a;", "l", "(ILnt/b;)Ljava/lang/Object;", "a", "", "events", "", "g", "([Lmh/a;Lnt/b;)Ljava/lang/Object;", "", "i", "m", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "h", NotificationCompat.CATEGORY_EVENT, "k", "(Lmh/a;Lnt/b;)Ljava/lang/Object;", "d", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC8137a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f30165a;

    /* JADX INFO: renamed from: lh.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Llh/a$a;", "", "<init>", "()V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f30165a = new Companion();
    }

    /* JADX INFO: renamed from: lh.a$b */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.AnalyticEventDao$safeDeleteEvent$2", m39664f = "AnalyticEventDao.kt", m39665l = {42}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30166t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AnalyticEvent f30168v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnalyticEvent analyticEvent, InterfaceC9557b<? super b> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f30168v = analyticEvent;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return InterfaceC8137a.this.new b(this.f30168v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30166t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC8137a interfaceC8137a = InterfaceC8137a.this;
                AnalyticEvent analyticEvent = this.f30168v;
                this.f30166t = 1;
                if (interfaceC8137a.mo33363k(analyticEvent, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lh.a$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"", "Lmh/a;", "<anonymous>", "()Ljava/util/List;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.AnalyticEventDao$safeGetEventsBatch$2", m39664f = "AnalyticEventDao.kt", m39665l = {24}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function1<InterfaceC9557b<? super List<? extends AnalyticEvent>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30169t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f30171v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, InterfaceC9557b<? super c> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f30171v = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return InterfaceC8137a.this.new c(this.f30171v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30169t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC8137a interfaceC8137a = InterfaceC8137a.this;
            int i11 = this.f30171v;
            this.f30169t = 1;
            Object objMo33364l = interfaceC8137a.mo33364l(i11, this);
            return objMo33364l == objM38805e ? objM38805e : objMo33364l;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super List<AnalyticEvent>> interfaceC9557b) {
            return ((c) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lh.a$d */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.AnalyticEventDao$safeInsertEvents$2", m39664f = "AnalyticEventDao.kt", m39665l = {30}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30172t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AnalyticEvent[] f30174v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnalyticEvent[] analyticEventArr, InterfaceC9557b<? super d> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f30174v = analyticEventArr;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return InterfaceC8137a.this.new d(this.f30174v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30172t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC8137a interfaceC8137a = InterfaceC8137a.this;
                AnalyticEvent[] analyticEventArr = this.f30174v;
                AnalyticEvent[] analyticEventArr2 = (AnalyticEvent[]) Arrays.copyOf(analyticEventArr, analyticEventArr.length);
                this.f30172t = 1;
                if (interfaceC8137a.mo33360g(analyticEventArr2, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lh.a$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.AnalyticEventDao$safeUpdateEvents$2", m39664f = "AnalyticEventDao.kt", m39665l = {36}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30175t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ List<AnalyticEvent> f30177v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<AnalyticEvent> list, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f30177v = list;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return InterfaceC8137a.this.new e(this.f30177v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30175t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC8137a interfaceC8137a = InterfaceC8137a.this;
                List<AnalyticEvent> list = this.f30177v;
                this.f30175t = 1;
                if (interfaceC8137a.mo33365m(list, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m33353b(InterfaceC8137a interfaceC8137a, AnalyticEvent analyticEvent, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM33386c = C8144h.m33386c("AnalyticEventDao", interfaceC8137a.new b(analyticEvent, null), interfaceC9557b);
        return objM33386c == C10047c.m38805e() ? objM33386c : Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m33354c(InterfaceC8137a interfaceC8137a, AnalyticEvent[] analyticEventArr, InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return C8144h.m33385b("AnalyticEventDao", interfaceC8137a.new d(analyticEventArr, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Object m33355e(InterfaceC8137a interfaceC8137a, List<AnalyticEvent> list, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM33386c = C8144h.m33386c("AnalyticEventDao", interfaceC8137a.new e(list, null), interfaceC9557b);
        return objM33386c == C10047c.m38805e() ? objM33386c : Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ Object m33356j(InterfaceC8137a interfaceC8137a, int i10, InterfaceC9557b<? super List<AnalyticEvent>> interfaceC9557b) {
        return C8144h.m33384a("AnalyticEventDao", interfaceC8137a.new c(i10, null), interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    default Object mo33357a(int i10, @NotNull InterfaceC9557b<? super List<AnalyticEvent>> interfaceC9557b) {
        return m33356j(this, i10, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    default Object mo33358d(@NotNull AnalyticEvent analyticEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m33353b(this, analyticEvent, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    Object mo33359f(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: g */
    Object mo33360g(@NotNull AnalyticEvent[] analyticEventArr, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: h */
    default Object mo33361h(@NotNull List<AnalyticEvent> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m33355e(this, list, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    default Object mo33362i(@NotNull AnalyticEvent[] analyticEventArr, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return m33354c(this, analyticEventArr, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    Object mo33363k(@NotNull AnalyticEvent analyticEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: l */
    Object mo33364l(int i10, @NotNull InterfaceC9557b<? super List<AnalyticEvent>> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: m */
    Object mo33365m(@NotNull List<AnalyticEvent> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);
}
