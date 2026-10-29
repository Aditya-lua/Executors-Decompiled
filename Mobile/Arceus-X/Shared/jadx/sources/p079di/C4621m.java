package p079di;

import android.content.SharedPreferences;
import android.util.Log;
import kg.C7605u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6121n;
import p151gk.InterfaceC6108c0;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sl.C11410t;
import th.C11659h;

/* JADX INFO: renamed from: di.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m31665d2 = {"Ldi/m;", "", "Landroid/content/SharedPreferences;", "sharedPref", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "streakIntervalMs", "Lgk/c0;", "clock", "<init>", "(Landroid/content/SharedPreferences;Lkotlin/coroutines/CoroutineContext;JLgk/c0;)V", "", "i", "(Lnt/b;)Ljava/lang/Object;", "", "m", "l", "Ldi/c;", "k", "", "streakKey", "j", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "elapsedTimeStreak", "currentTimeNow", "h", "(Ldi/c;J)Ldi/c;", "g", "()J", "a", "Landroid/content/SharedPreferences;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "J", "d", "Lgk/c0;", "e", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4621m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPref;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long streakIntervalMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6108c0 clock;

    /* JADX INFO: renamed from: di.m$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.StreakTracker$getStreak$2", m39664f = "StreakTracker.kt", m39665l = {39}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18977t;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C4621m.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            int iM22835g;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18977t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C4621m c4621m = C4621m.this;
                this.f18977t = 1;
                obj = c4621m.m22839k(this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                C4621m c4621m2 = C4621m.this;
                iM22835g = ((int) ((c4621m2.m22835g() - loginStreak.getStreakStartTimestamp()) / c4621m2.streakIntervalMs)) + 1;
            } else {
                iM22835g = 0;
            }
            return C10340b.m39661d(iM22835g);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Integer> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.m$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Ldi/c;", "<anonymous>", "(Lku/p0;)Ldi/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.StreakTracker$readStreak$3", m39664f = "StreakTracker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super LoginStreak>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18979t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f18981v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18981v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C4621m.this.new c(this.f18981v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f18979t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            String string = C4621m.this.sharedPref.getString(this.f18981v, null);
            if (string != null) {
                try {
                    return C6121n.m27045b().m31410j(string, LoginStreak.class);
                } catch (C7605u e10) {
                    Log.e("rbx.achievements.streak_tracker", "Failed to parse login streak from shared preferences", e10);
                }
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super LoginStreak> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.m$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.StreakTracker$updateLastActive$2", m39664f = "StreakTracker.kt", m39665l = {99}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f18982t;

        /* JADX INFO: renamed from: u */
        public int f18983u;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C4621m.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            long jM22835g;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18983u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                jM22835g = C4621m.this.m22835g();
                C4621m c4621m = C4621m.this;
                this.f18982t = jM22835g;
                this.f18983u = 1;
                obj = c4621m.m22839k(this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f18982t;
                C7348o.m30470b(obj);
                jM22835g = j10;
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                Log.i("rbx.achievements.streak_tracker", "Continuing existing streak started at " + loginStreak.getStreakStartTimestamp());
                LoginStreak loginStreakM22767b = LoginStreak.m22767b(loginStreak, 0L, jM22835g, 1, null);
                SharedPreferences.Editor editorEdit = C4621m.this.sharedPref.edit();
                editorEdit.putString("login_streak_current_time", C6121n.m27046c(loginStreakM22767b));
                editorEdit.apply();
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.m$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.StreakTracker$updateStreak$2", m39664f = "StreakTracker.kt", m39665l = {52, 55}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f18985t;

        /* JADX INFO: renamed from: u */
        public Object f18986u;

        /* JADX INFO: renamed from: v */
        public int f18987v;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C4621m.this.new e(interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0184  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        
            if (r2 == r1) goto L18;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jM22835g;
            Object objM22839k;
            long j10;
            Pair pairM30477a;
            Object objM22838j;
            boolean zBooleanValue;
            SharedPreferences.Editor editorEdit;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18987v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                jM22835g = C4621m.this.m22835g();
                C4621m c4621m = C4621m.this;
                this.f18985t = jM22835g;
                this.f18987v = 1;
                objM22839k = c4621m.m22839k(this);
                if (objM22839k != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                jM22835g = this.f18985t;
                C7348o.m30470b(obj);
                objM22839k = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.f18985t;
                C7348o.m30470b(obj);
                j10 = j11;
                objM22838j = obj;
            }
            LoginStreak loginStreak = (LoginStreak) objM22838j;
            LoginStreak loginStreakM22836h = loginStreak != null ? C4621m.this.m22836h(loginStreak, j10) : null;
            if (loginStreakM22836h != null) {
                if (C11659h.m43403a().mo43425D()) {
                    C11410t.f40318a.m42743p("migrated");
                }
                Log.i("rbx.achievements.streak_tracker", "Continuing migrated streak started at " + loginStreakM22836h.getStreakStartTimestamp() + ". now is " + j10);
                pairM30477a = C7352s.m30477a(loginStreakM22836h, C10340b.m39658a(true));
            } else {
                if (C11659h.m43403a().mo43425D()) {
                    C11410t.f40318a.m42743p("new");
                }
                Log.i("rbx.achievements.streak_tracker", "Starting a new current time streak at " + j10);
                pairM30477a = C7352s.m30477a(new LoginStreak(j10, j10), C10340b.m39658a(false));
            }
            LoginStreak loginStreak2 = (LoginStreak) pairM30477a.m31671a();
            zBooleanValue = ((Boolean) pairM30477a.m31672b()).booleanValue();
            editorEdit = C4621m.this.sharedPref.edit();
            editorEdit.putString("login_streak_current_time", C6121n.m27046c(loginStreak2));
            if (zBooleanValue) {
                editorEdit.remove("login_streak");
            }
            editorEdit.apply();
            return Unit.f29331a;
            j10 = jM22835g;
            LoginStreak loginStreak3 = (LoginStreak) objM22839k;
            if (loginStreak3 == null) {
                C4621m c4621m2 = C4621m.this;
                this.f18986u = C10350l.m39676a(loginStreak3);
                this.f18985t = j10;
                this.f18987v = 2;
                objM22838j = c4621m2.m22838j("login_streak", this);
            } else if (j10 - loginStreak3.getLastActiveTimestamp() > C4621m.this.streakIntervalMs) {
                if (C11659h.m43403a().mo43425D()) {
                    C11410t.f40318a.m42743p("new");
                }
                Log.i("rbx.achievements.streak_tracker", "Starting a new streak at " + j10);
                pairM30477a = C7352s.m30477a(new LoginStreak(j10, j10), C10340b.m39658a(false));
            } else {
                if (C11659h.m43403a().mo43425D()) {
                    C11410t.f40318a.m42743p("continued");
                }
                Log.i("rbx.achievements.streak_tracker", "Continuing existing streak started at " + loginStreak3.getStreakStartTimestamp() + ". now is " + j10);
                pairM30477a = C7352s.m30477a(LoginStreak.m22767b(loginStreak3, 0L, j10, 1, null), C10340b.m39658a(false));
            }
            LoginStreak loginStreak4 = (LoginStreak) pairM30477a.m31671a();
            zBooleanValue = ((Boolean) pairM30477a.m31672b()).booleanValue();
            editorEdit = C4621m.this.sharedPref.edit();
            editorEdit.putString("login_streak_current_time", C6121n.m27046c(loginStreak4));
            if (zBooleanValue) {
                editorEdit.remove("login_streak");
            }
            editorEdit.apply();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C4621m(@NotNull SharedPreferences sharedPref, @NotNull CoroutineContext coroutineContext, long j10, @NotNull InterfaceC6108c0 clock) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.sharedPref = sharedPref;
        this.coroutineContext = coroutineContext;
        this.streakIntervalMs = j10;
        this.clock = clock;
    }

    /* JADX INFO: renamed from: g */
    public final long m22835g() {
        return this.clock.mo27016a();
    }

    /* JADX INFO: renamed from: h */
    public final LoginStreak m22836h(LoginStreak elapsedTimeStreak, long currentTimeNow) {
        long jMo27017b = this.clock.mo27017b();
        if (jMo27017b < elapsedTimeStreak.getLastActiveTimestamp() || jMo27017b > elapsedTimeStreak.getLastActiveTimestamp() + this.streakIntervalMs) {
            Log.i("rbx.achievements.streak_tracker", "Elapsed time streak invalid or expired");
            return null;
        }
        long streakStartTimestamp = jMo27017b - elapsedTimeStreak.getStreakStartTimestamp();
        Log.i("rbx.achievements.streak_tracker", "Migrating streak from elapsed time to current time at " + currentTimeNow + ", streak duration is " + streakStartTimestamp + "ms");
        return new LoginStreak(currentTimeNow - streakStartTimestamp, currentTimeNow);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m22837i(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        return C7872i.m32684g(this.coroutineContext, new b(null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: j */
    public final Object m22838j(String str, InterfaceC9557b<? super LoginStreak> interfaceC9557b) {
        return C7872i.m32684g(this.coroutineContext, new c(str, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: k */
    public final Object m22839k(InterfaceC9557b<? super LoginStreak> interfaceC9557b) {
        return m22838j("login_streak_current_time", interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m22840l(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(this.coroutineContext, new d(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m22841m(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(this.coroutineContext, new e(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }
}
