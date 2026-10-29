package di;

import android.content.SharedPreferences;
import android.util.Log;
import gk.b0;
import jg.u;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ldi/l;", "", "Landroid/content/SharedPreferences;", "sharedPref", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "streakIntervalMs", "Lgk/b0;", "clock", "<init>", "(Landroid/content/SharedPreferences;Lkotlin/coroutines/CoroutineContext;JLgk/b0;)V", "", "i", "(Lnt/b;)Ljava/lang/Object;", "", "m", "l", "Ldi/c;", "k", "", "streakKey", "j", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "elapsedTimeStreak", "currentTimeNow", "h", "(Ldi/c;J)Ldi/c;", "g", "()J", "a", "Landroid/content/SharedPreferences;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "J", "d", "Lgk/b0;", "e", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPref;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long streakIntervalMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 clock;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.StreakTracker$getStreak$2", f = "StreakTracker.kt", l = {39}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14714t;

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return l.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            int iG;
            Object objE = ot.c.e();
            int i10 = this.f14714t;
            if (i10 == 0) {
                o.b(obj);
                l lVar = l.this;
                this.f14714t = 1;
                obj = lVar.k(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                l lVar2 = l.this;
                iG = ((int) ((lVar2.g() - loginStreak.getStreakStartTimestamp()) / lVar2.streakIntervalMs)) + 1;
            } else {
                iG = 0;
            }
            return pt.b.d(iG);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Ldi/c;", "<anonymous>", "(Lku/p0;)Ldi/c;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.StreakTracker$readStreak$3", f = "StreakTracker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super LoginStreak>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14716t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f14718v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f14718v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return l.this.new c(this.f14718v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f14716t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String string = l.this.sharedPref.getString(this.f14718v, null);
            if (string != null) {
                try {
                    return gk.m.b().j(string, LoginStreak.class);
                } catch (u e10) {
                    Log.e("rbx.achievements.streak_tracker", "Failed to parse login streak from shared preferences", e10);
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super LoginStreak> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.StreakTracker$updateLastActive$2", f = "StreakTracker.kt", l = {99}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f14719t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14720u;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return l.this.new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            long jG;
            Object objE = ot.c.e();
            int i10 = this.f14720u;
            if (i10 == 0) {
                o.b(obj);
                jG = l.this.g();
                l lVar = l.this;
                this.f14719t = jG;
                this.f14720u = 1;
                obj = lVar.k(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f14719t;
                o.b(obj);
                jG = j10;
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                Log.i("rbx.achievements.streak_tracker", "Continuing existing streak started at " + loginStreak.getStreakStartTimestamp());
                LoginStreak loginStreakB = LoginStreak.b(loginStreak, 0L, jG, 1, null);
                SharedPreferences.Editor editorEdit = l.this.sharedPref.edit();
                editorEdit.putString("login_streak_current_time", gk.m.c(loginStreakB));
                editorEdit.apply();
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.StreakTracker$updateStreak$2", f = "StreakTracker.kt", l = {52, 55}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f14722t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14723u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14724v;

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return l.this.new e(bVar);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0184  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        
            if (r2 == r1) goto L18;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 397
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: di.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public l(@NotNull SharedPreferences sharedPref, @NotNull CoroutineContext coroutineContext, long j10, @NotNull b0 clock) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.sharedPref = sharedPref;
        this.coroutineContext = coroutineContext;
        this.streakIntervalMs = j10;
        this.clock = clock;
    }

    public final long g() {
        return this.clock.a();
    }

    public final LoginStreak h(LoginStreak elapsedTimeStreak, long currentTimeNow) {
        long jB = this.clock.b();
        if (jB < elapsedTimeStreak.getLastActiveTimestamp() || jB > elapsedTimeStreak.getLastActiveTimestamp() + this.streakIntervalMs) {
            Log.i("rbx.achievements.streak_tracker", "Elapsed time streak invalid or expired");
            return null;
        }
        long streakStartTimestamp = jB - elapsedTimeStreak.getStreakStartTimestamp();
        Log.i("rbx.achievements.streak_tracker", "Migrating streak from elapsed time to current time at " + currentTimeNow + ", streak duration is " + streakStartTimestamp + "ms");
        return new LoginStreak(currentTimeNow - streakStartTimestamp, currentTimeNow);
    }

    @Nullable
    public final Object i(@NotNull nt.b<? super Integer> bVar) {
        return ku.i.g(this.coroutineContext, new b(null), bVar);
    }

    public final Object j(String str, nt.b<? super LoginStreak> bVar) {
        return ku.i.g(this.coroutineContext, new c(str, null), bVar);
    }

    public final Object k(nt.b<? super LoginStreak> bVar) {
        return j("login_streak_current_time", bVar);
    }

    @Nullable
    public final Object l(@NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(this.coroutineContext, new d(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    @Nullable
    public final Object m(@NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(this.coroutineContext, new e(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }
}
