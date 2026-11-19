package li;

import android.content.SharedPreferences;
import android.util.Log;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import gm.t;
import lg.u;
import ok.c0;
import ok.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lli/m;", BuildConfig.FLAVOR, "Landroid/content/SharedPreferences;", "sharedPref", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", BuildConfig.FLAVOR, "streakIntervalMs", "Lok/c0;", "clock", "<init>", "(Landroid/content/SharedPreferences;Lkotlin/coroutines/CoroutineContext;JLok/c0;)V", BuildConfig.FLAVOR, "i", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "m", "l", "Lli/c;", "j", BuildConfig.FLAVOR, "streakKey", "k", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "elapsedTimeStreak", "currentTimeNow", "h", "(Lli/c;J)Lli/c;", "g", "()J", "a", "Landroid/content/SharedPreferences;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "J", "d", "Lok/c0;", "e", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

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
    public final c0 clock;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)I"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.StreakTracker$getStreak$2", f = "StreakTracker.kt", l = {39}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22250t;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return m.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            int iG;
            Object objE = fu.c.e();
            int i10 = this.f22250t;
            if (i10 == 0) {
                o.b(obj);
                m mVar = m.this;
                this.f22250t = 1;
                obj = mVar.j(this);
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
                m mVar2 = m.this;
                iG = ((int) ((mVar2.g() - loginStreak.getStreakStartTimestamp()) / mVar2.streakIntervalMs)) + 1;
            } else {
                iG = 0;
            }
            return gu.b.c(iG);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lli/c;", "<anonymous>", "(Lav/p0;)Lli/c;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.StreakTracker$readStreak$3", f = "StreakTracker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super LoginStreak>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22252t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f22254v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f22254v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return m.this.new c(this.f22254v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super LoginStreak> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f22252t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String string = m.this.sharedPref.getString(this.f22254v, null);
            if (string != null) {
                try {
                    return n.b().h(string, LoginStreak.class);
                } catch (u e10) {
                    Log.e("rbx.achievements.streak_tracker", "Failed to parse login streak from shared preferences", e10);
                }
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.StreakTracker$updateLastActive$2", f = "StreakTracker.kt", l = {99}, m = "invokeSuspend", v = 1)
    public static final class d extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f22255t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22256u;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return m.this.new d(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            long jG;
            Object objE = fu.c.e();
            int i10 = this.f22256u;
            if (i10 == 0) {
                o.b(obj);
                jG = m.this.g();
                m mVar = m.this;
                this.f22255t = jG;
                this.f22256u = 1;
                obj = mVar.j(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f22255t;
                o.b(obj);
                jG = j10;
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                Log.i("rbx.achievements.streak_tracker", "Continuing existing streak started at " + loginStreak.getStreakStartTimestamp());
                LoginStreak loginStreakB = LoginStreak.b(loginStreak, 0L, jG, 1, null);
                SharedPreferences.Editor editorEdit = m.this.sharedPref.edit();
                editorEdit.putString("login_streak_current_time", n.c(loginStreakB));
                editorEdit.apply();
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.StreakTracker$updateStreak$2", f = "StreakTracker.kt", l = {52, 55}, m = "invokeSuspend", v = 1)
    public static final class e extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f22258t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22259u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22260v;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return m.this.new e(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0184  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        
            if (r2 == r1) goto L18;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jG;
            Object objJ;
            long j10;
            Pair pairA;
            Object objK;
            boolean zBooleanValue;
            SharedPreferences.Editor editorEdit;
            Object objE = fu.c.e();
            int i10 = this.f22260v;
            if (i10 == 0) {
                o.b(obj);
                jG = m.this.g();
                m mVar = m.this;
                this.f22258t = jG;
                this.f22260v = 1;
                objJ = mVar.j(this);
                if (objJ != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                jG = this.f22258t;
                o.b(obj);
                objJ = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.f22258t;
                o.b(obj);
                j10 = j11;
                objK = obj;
            }
            LoginStreak loginStreak = (LoginStreak) objK;
            LoginStreak loginStreakH = loginStreak != null ? m.this.h(loginStreak, j10) : null;
            if (loginStreakH != null) {
                if (bi.h.a().C()) {
                    t.f17799a.p("migrated");
                }
                Log.i("rbx.achievements.streak_tracker", "Continuing migrated streak started at " + loginStreakH.getStreakStartTimestamp() + ". now is " + j10);
                pairA = s.a(loginStreakH, gu.b.a(true));
            } else {
                if (bi.h.a().C()) {
                    t.f17799a.p("new");
                }
                Log.i("rbx.achievements.streak_tracker", "Starting a new current time streak at " + j10);
                pairA = s.a(new LoginStreak(j10, j10), gu.b.a(false));
            }
            LoginStreak loginStreak2 = (LoginStreak) pairA.a();
            zBooleanValue = ((Boolean) pairA.b()).booleanValue();
            editorEdit = m.this.sharedPref.edit();
            editorEdit.putString("login_streak_current_time", n.c(loginStreak2));
            if (zBooleanValue) {
                editorEdit.remove("login_streak");
            }
            editorEdit.apply();
            return Unit.f21506a;
            j10 = jG;
            LoginStreak loginStreak3 = (LoginStreak) objJ;
            if (loginStreak3 == null) {
                m mVar2 = m.this;
                this.f22259u = gu.l.a(loginStreak3);
                this.f22258t = j10;
                this.f22260v = 2;
                objK = mVar2.k("login_streak", this);
            } else if (j10 - loginStreak3.getLastActiveTimestamp() > m.this.streakIntervalMs) {
                if (bi.h.a().C()) {
                    t.f17799a.p("new");
                }
                Log.i("rbx.achievements.streak_tracker", "Starting a new streak at " + j10);
                pairA = s.a(new LoginStreak(j10, j10), gu.b.a(false));
            } else {
                if (bi.h.a().C()) {
                    t.f17799a.p("continued");
                }
                Log.i("rbx.achievements.streak_tracker", "Continuing existing streak started at " + loginStreak3.getStreakStartTimestamp() + ". now is " + j10);
                pairA = s.a(LoginStreak.b(loginStreak3, 0L, j10, 1, null), gu.b.a(false));
            }
            LoginStreak loginStreak4 = (LoginStreak) pairA.a();
            zBooleanValue = ((Boolean) pairA.b()).booleanValue();
            editorEdit = m.this.sharedPref.edit();
            editorEdit.putString("login_streak_current_time", n.c(loginStreak4));
            if (zBooleanValue) {
                editorEdit.remove("login_streak");
            }
            editorEdit.apply();
            return Unit.f21506a;
        }
    }

    public m(@NotNull SharedPreferences sharedPref, @NotNull CoroutineContext coroutineContext, long j10, @NotNull c0 clock) {
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
    public final Object i(@NotNull eu.b<? super Integer> bVar) {
        return av.i.g(this.coroutineContext, new b(null), bVar);
    }

    public final Object j(eu.b<? super LoginStreak> bVar) {
        return k("login_streak_current_time", bVar);
    }

    public final Object k(String str, eu.b<? super LoginStreak> bVar) {
        return av.i.g(this.coroutineContext, new c(str, null), bVar);
    }

    @Nullable
    public final Object l(@NotNull eu.b<? super Unit> bVar) {
        Object objG = av.i.g(this.coroutineContext, new d(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    @Nullable
    public final Object m(@NotNull eu.b<? super Unit> bVar) {
        Object objG = av.i.g(this.coroutineContext, new e(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }
}
