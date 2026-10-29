package p079di;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0959h0;
import androidx.p616lifecycle.C0963j0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.C1759R;
import com.google.android.gms.tasks.Task;
import com.roblox.client.RobloxApplication;
import com.roblox.universalapp.achievement.C3346b;
import fk.C5656e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.p336ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p073da.C4499c;
import p073da.C4503g;
import p073da.C4504h;
import p073da.InterfaceC4497a;
import p073da.InterfaceC4501e;
import p093e4.ActivityC4831q;
import p151gk.C6110d0;
import p203j.ActivityC6992b;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sl.Achievement;
import sl.C11410t;
import sl.C11413w;
import sl.InterfaceC11392b;
import sl.LocalAchievement;
import th.C11659h;
import vu.C12264b;

/* JADX INFO: renamed from: di.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b*\u0010&R!\u00101\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m31665d2 = {"Ldi/i;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "l", "(Landroid/content/Context;)Z", "", "q", "(Landroid/content/Context;)V", "", "btid", "n", "(Landroid/content/Context;J)V", "m", "Le4/q;", "activity", "o", "(Le4/q;)V", "p", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "Lsl/w;", "replicator", "", "r", "(Lsl/w;Lnt/b;)Ljava/lang/Object;", "Lda/e;", "signInClient", "Ljt/n;", "k", "(Lda/e;Lnt/b;)Ljava/lang/Object;", "t", "(Lnt/b;)Ljava/lang/Object;", "s", "()Z", "i", "v", "Ldi/m;", "b", "Ljt/h;", "j", "()Ldi/m;", "getStreakTracker$annotations", "streakTracker", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasUnlockedAllStreaks", "d", "Z", "observerAttached", "Lku/d2;", "e", "Lku/d2;", "achievementsInitJob", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4617i implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4617i f18890a = new C4617i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h streakTracker = C7342i.m30456b(new Function0() { // from class: di.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4617i.m22798u();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean hasUnlockedAllStreaks = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean observerAttached;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC7850d2 achievementsInitJob;

    /* JADX INFO: renamed from: di.i$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$checkUnlockedAllStreaks$2", m39664f = "PlayGamesIntegration.kt", m39665l = {258}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f18895t;

        /* JADX INFO: renamed from: u */
        public int f18896u;

        /* JADX INFO: renamed from: v */
        public int f18897v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18897v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (C4617i.hasUnlockedAllStreaks.get()) {
                    Log.i("rbx.achievements.playgames", "Already unlocked all streak achievements, skipping check");
                    return Unit.f29331a;
                }
                InterfaceC11392b interfaceC11392bM15964a = C3346b.f12730a.m15964a();
                if (interfaceC11392bM15964a != null) {
                    this.f18895t = C10350l.m39676a(interfaceC11392bM15964a);
                    this.f18896u = 0;
                    this.f18897v = 1;
                    obj = interfaceC11392bM15964a.mo15952g(this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                }
                return Unit.f29331a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((Achievement) it.next()).getCodeName());
            }
            Set setQ0 = CollectionsKt.m31691Q0(arrayList);
            List<Achievement> listM22763a = C4610b.m22763a();
            ArrayList arrayList2 = new ArrayList(C7701q.m31905u(listM22763a, 10));
            Iterator<T> it2 = listM22763a.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Achievement) it2.next()).getRobloxId());
            }
            List listU0 = CollectionsKt.m31723u0(arrayList2, setQ0);
            Log.i("rbx.achievements.playgames", "Locked streak achievements: " + listU0);
            C4617i.hasUnlockedAllStreaks.set(listU0.isEmpty());
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration", m39664f = "PlayGamesIntegration.kt", m39665l = {231}, m39666m = "isPgsAuthenticated-gIAlu-s", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f18898t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f18899u;

        /* JADX INFO: renamed from: w */
        public int f18901w;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18899u = obj;
            this.f18901w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM22801k = C4617i.this.m22801k(null, this);
            return objM22801k == C10047c.m38805e() ? objM22801k : C7347n.m30459a(objM22801k);
        }
    }

    /* JADX INFO: renamed from: di.i$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$isPgsAuthenticated$2", m39664f = "PlayGamesIntegration.kt", m39665l = {233}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f18902t;

        /* JADX INFO: renamed from: u */
        public int f18903u;

        /* JADX INFO: renamed from: v */
        public int f18904v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f18905w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ InterfaceC4501e f18906x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4501e interfaceC4501e, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18906x = interfaceC4501e;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = new c(this.f18906x, interfaceC9557b);
            cVar.f18905w = obj;
            return cVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Boolean>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<Boolean>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f18905w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18904v;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC4501e interfaceC4501e = this.f18906x;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    Task<C4499c> taskMo22462a = interfaceC4501e.mo22462a();
                    Intrinsics.checkNotNullExpressionValue(taskMo22462a, "isAuthenticated(...)");
                    this.f18905w = C10350l.m39676a(interfaceC7906p0);
                    this.f18902t = C10350l.m39676a(interfaceC7906p0);
                    this.f18903u = 0;
                    this.f18904v = 1;
                    obj = C12264b.m45512a(taskMo22462a, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                objM30460b = C7347n.m30460b(C10340b.m39658a(((C4499c) obj).m22458a()));
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            C7347n c7347nM30459a = C7347n.m30459a(objM30460b);
            Object value = c7347nM30459a.getValue();
            if (C7347n.m30465g(value)) {
                value = null;
            }
            Boolean bool = (Boolean) value;
            Log.i("rbx.achievements.playgames", "PGS isAuthenticated: " + (bool != null ? bool.booleanValue() : false));
            return c7347nM30459a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onAppCreate$1", m39664f = "PlayGamesIntegration.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18907t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f18908u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18908u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f18908u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f18907t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Context context = this.f18908u;
            Intrinsics.checkNotNull(context);
            C3346b.m15963b(context);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1", m39664f = "PlayGamesIntegration.kt", m39665l = {163}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18909t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC6992b f18910u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC11392b f18911v;

        /* JADX INFO: renamed from: di.i$e$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1", m39664f = "PlayGamesIntegration.kt", m39665l = {164, 197}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: A */
            public final /* synthetic */ ActivityC6992b f18912A;

            /* JADX INFO: renamed from: B */
            public final /* synthetic */ InterfaceC11392b f18913B;

            /* JADX INFO: renamed from: t */
            public Object f18914t;

            /* JADX INFO: renamed from: u */
            public Object f18915u;

            /* JADX INFO: renamed from: v */
            public Object f18916v;

            /* JADX INFO: renamed from: w */
            public boolean f18917w;

            /* JADX INFO: renamed from: x */
            public int f18918x;

            /* JADX INFO: renamed from: y */
            public int f18919y;

            /* JADX INFO: renamed from: z */
            public /* synthetic */ Object f18920z;

            /* JADX INFO: renamed from: di.i$e$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$1", m39664f = "PlayGamesIntegration.kt", m39665l = {182, 193}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class C14158a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public Object f18921t;

                /* JADX INFO: renamed from: u */
                public Object f18922u;

                /* JADX INFO: renamed from: v */
                public int f18923v;

                /* JADX INFO: renamed from: w */
                public int f18924w;

                /* JADX INFO: renamed from: x */
                public /* synthetic */ Object f18925x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ C11413w f18926y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14158a(C11413w c11413w, InterfaceC9557b<? super C14158a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f18926y = c11413w;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    C14158a c14158a = new C14158a(this.f18926y, interfaceC9557b);
                    c14158a.f18925x = obj;
                    return c14158a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
                
                    if (r5.m22799i(r9) == r1) goto L33;
                 */
                @Override // pt.AbstractC10339a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objM30460b;
                    InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f18925x;
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f18924w;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                C7348o.m30470b(obj);
                            } else {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7348o.m30470b(obj);
                            }
                            return Unit.f29331a;
                        }
                        C7348o.m30470b(obj);
                        Log.i("rbx.achievements.playgames", "starting one time remote to local sync");
                        C11413w c11413w = this.f18926y;
                        C7347n.Companion companion = C7347n.INSTANCE;
                        this.f18925x = C10350l.m39676a(interfaceC7906p0);
                        this.f18921t = C10350l.m39676a(interfaceC7906p0);
                        this.f18923v = 0;
                        this.f18924w = 1;
                        obj = c11413w.m42753d(this);
                        if (obj == objM38805e) {
                        }
                        return objM38805e;
                        objM30460b = C7347n.m30460b((Serializable) obj);
                    } catch (Throwable th2) {
                        C7347n.Companion companion2 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
                    }
                    Throwable thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        Log.w("rbx.achievements.playgames", "unable to sync remote to local", thM30463e);
                        if (C11659h.m43403a().mo43425D()) {
                            C11410t.f40318a.m42742o("local", false);
                        }
                    }
                    if (C7347n.m30466h(objM30460b)) {
                        Serializable serializable = (Serializable) objM30460b;
                        Log.i("rbx.achievements.playgames", "remote to local sync completed");
                        if (C11659h.m43403a().mo43425D()) {
                            C11410t.f40318a.m42742o("local", true);
                        }
                        C4617i c4617i = C4617i.f18890a;
                        this.f18925x = C10350l.m39676a(interfaceC7906p0);
                        this.f18921t = objM30460b;
                        this.f18922u = C10350l.m39676a(serializable);
                        this.f18923v = 0;
                        this.f18924w = 2;
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14158a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: di.i$e$a$b */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2", m39664f = "PlayGamesIntegration.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f18927t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f18928u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C11413w f18929v;

                /* JADX INFO: renamed from: di.i$e$a$b$a, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
                @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2$1", m39664f = "PlayGamesIntegration.kt", m39665l = {198}, m39666m = "invokeSuspend", m39667v = 1)
                public static final class C14159a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                    /* JADX INFO: renamed from: t */
                    public int f18930t;

                    /* JADX INFO: renamed from: u */
                    public final /* synthetic */ C11413w f18931u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C14159a(C11413w c11413w, InterfaceC9557b<? super C14159a> interfaceC9557b) {
                        super(2, interfaceC9557b);
                        this.f18931u = c11413w;
                    }

                    @Override // pt.AbstractC10339a
                    public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                        return new C14159a(this.f18931u, interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        Object objM38805e = C10047c.m38805e();
                        int i10 = this.f18930t;
                        if (i10 == 0) {
                            C7348o.m30470b(obj);
                            C4617i c4617i = C4617i.f18890a;
                            C11413w c11413w = this.f18931u;
                            this.f18930t = 1;
                            if (c4617i.m22802r(c11413w, this) == objM38805e) {
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

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                        return ((C14159a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C11413w c11413w, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f18929v = c11413w;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    b bVar = new b(this.f18929v, interfaceC9557b);
                    bVar.f18928u = obj;
                    return bVar;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f18928u;
                    C10047c.m38805e();
                    if (this.f18927t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    C7882k.m32780d(interfaceC7906p0, null, null, new C14159a(this.f18929v, null), 3, null);
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityC6992b activityC6992b, InterfaceC11392b interfaceC11392b, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f18912A = activityC6992b;
                this.f18913B = interfaceC11392b;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f18912A, this.f18913B, interfaceC9557b);
                aVar.f18920z = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM22801k;
                Object obj2;
                Throwable thM30463e;
                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f18920z;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f18919y;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C4617i c4617i = C4617i.f18890a;
                    InterfaceC4501e interfaceC4501eM22466b = C4503g.m22466b(this.f18912A);
                    Intrinsics.checkNotNullExpressionValue(interfaceC4501eM22466b, "getGamesSignInClient(...)");
                    this.f18920z = interfaceC7906p0;
                    this.f18919y = 1;
                    objM22801k = c4617i.m22801k(interfaceC4501eM22466b, this);
                    if (objM22801k != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                    objM22801k = ((C7347n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f18914t;
                    C7348o.m30470b(obj);
                }
                objM22801k = obj2;
                thM30463e = C7347n.m30463e(objM22801k);
                if (thM30463e != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thM30463e);
                }
                return Unit.f29331a;
                ActivityC6992b activityC6992b = this.f18912A;
                InterfaceC11392b interfaceC11392b = this.f18913B;
                if (C7347n.m30466h(objM22801k)) {
                    boolean zBooleanValue = ((Boolean) objM22801k).booleanValue();
                    if (C11659h.m43403a().mo43425D()) {
                        C11410t.f40318a.m42740m(zBooleanValue, C4615g.m22783a(activityC6992b));
                    }
                    if (zBooleanValue) {
                        InterfaceC4497a interfaceC4497aM22465a = C4503g.m22465a(activityC6992b);
                        Intrinsics.checkNotNullExpressionValue(interfaceC4497aM22465a, "getAchievementsClient(...)");
                        C4619k c4619k = new C4619k(interfaceC4497aM22465a);
                        C11413w c11413w = new C11413w(interfaceC11392b, c4619k);
                        C7882k.m32780d(interfaceC7906p0, null, null, new C14158a(c11413w, null), 3, null);
                        AbstractC0966l.b bVar = AbstractC0966l.b.RESUMED;
                        b bVar2 = new b(c11413w, null);
                        this.f18920z = C10350l.m39676a(interfaceC7906p0);
                        this.f18914t = objM22801k;
                        this.f18915u = C10350l.m39676a(c4619k);
                        this.f18916v = C10350l.m39676a(c11413w);
                        this.f18917w = zBooleanValue;
                        this.f18918x = 0;
                        this.f18919y = 2;
                        if (C0963j0.m4921b(activityC6992b, bVar, bVar2, this) != objM38805e) {
                            obj2 = objM22801k;
                            objM22801k = obj2;
                        }
                        return objM38805e;
                    }
                    C10340b.m39661d(Log.w("rbx.achievements.playgames", "PGS is not authenticated."));
                }
                thM30463e = C7347n.m30463e(objM22801k);
                if (thM30463e != null) {
                    Log.w("rbx.achievements.playgames", "GooglePlayGames signIn failed exceptionally", thM30463e);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ActivityC6992b activityC6992b, InterfaceC11392b interfaceC11392b, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18910u = activityC6992b;
            this.f18911v = interfaceC11392b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f18910u, this.f18911v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18909t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                ActivityC6992b activityC6992b = this.f18910u;
                AbstractC0966l.b bVar = AbstractC0966l.b.CREATED;
                a aVar = new a(activityC6992b, this.f18911v, null);
                this.f18909t = 1;
                if (C0963j0.m4921b(activityC6992b, bVar, aVar, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageInteractive$1", m39664f = "PlayGamesIntegration.kt", m39665l = {C1759R.styleable.AppCompatTheme_windowMinWidthMajor}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18932t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC4831q f18933u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ActivityC4831q activityC4831q, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18933u = activityC4831q;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new f(this.f18933u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18932t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7850d2 interfaceC7850d2 = C4617i.achievementsInitJob;
                if (interfaceC7850d2 != null) {
                    this.f18932t = 1;
                    if (interfaceC7850d2.mo32596L(this) == objM38805e) {
                        return objM38805e;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f18933u.mo4656a().mo4935a(C4617i.f18890a);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageLoaded$1", m39664f = "PlayGamesIntegration.kt", m39665l = {148}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18934t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC4831q f18935u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ActivityC4831q activityC4831q, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18935u = activityC4831q;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new g(this.f18935u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18934t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7850d2 interfaceC7850d2 = C4617i.achievementsInitJob;
                if (interfaceC7850d2 != null) {
                    this.f18934t = 1;
                    if (interfaceC7850d2.mo32596L(this) == objM38805e) {
                        return objM38805e;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f18935u.mo4656a().mo4935a(C4617i.f18890a);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onStop$1", m39664f = "PlayGamesIntegration.kt", m39665l = {212}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18936t;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new h(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18936t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C4621m c4621mM22800j = C4617i.f18890a.m22800j();
                this.f18936t = 1;
                if (c4621mM22800j.m22840l(this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$i */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$repeatOnResumed$2", m39664f = "PlayGamesIntegration.kt", m39665l = {219, 220}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class i extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Object>, Object> {

        /* JADX INFO: renamed from: t */
        public int f18937t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C11413w f18938u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C11413w c11413w, InterfaceC9557b<? super i> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18938u = c11413w;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new i(this.f18938u, interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Object> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<Object>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18937t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C4617i c4617i = C4617i.f18890a;
                    this.f18937t = 1;
                    if (c4617i.m22804t(this) == objM38805e) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                C11413w c11413w = this.f18938u;
                this.f18937t = 2;
                Object objM42752c = c11413w.m42752c(this);
                return objM42752c == objM38805e ? objM38805e : objM42752c;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                Log.w("rbx.achievements.playgames", "unable to continue achievement sync", e11);
                if (C11659h.m43403a().mo43425D()) {
                    C11410t.f40318a.m42742o("remote", false);
                }
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<Object> interfaceC9557b) {
            return ((i) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.i$j */
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration", m39664f = "PlayGamesIntegration.kt", m39665l = {241, 244}, m39666m = "startStreakTracker", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class j extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public long f18939t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f18940u;

        /* JADX INFO: renamed from: w */
        public int f18942w;

        public j(InterfaceC9557b<? super j> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18940u = obj;
            this.f18942w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4617i.this.m22804t(this);
        }
    }

    /* JADX INFO: renamed from: di.i$k */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayGamesIntegration$updateAndGrantStreak$2", m39664f = "PlayGamesIntegration.kt", m39665l = {273, 275, 279, 283, 287}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class k extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f18943t;

        /* JADX INFO: renamed from: u */
        public int f18944u;

        /* JADX INFO: renamed from: v */
        public int f18945v;

        /* JADX INFO: renamed from: w */
        public int f18946w;

        public k(InterfaceC9557b<? super k> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new k(interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00da  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ff A[PHI: r1 r4 r5
          0x00ff: PHI (r1v9 int) = (r1v8 int), (r1v10 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]
          0x00ff: PHI (r5v4 sl.b) = (r5v3 sl.b), (r5v5 sl.b) binds: [B:36:0x00d8, B:41:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0103  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
        
            if (r1.mo15951f(r9, r12) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
        
            if (r5.mo15951f(r13, r12) == r0) goto L46;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10;
            InterfaceC11392b interfaceC11392b;
            int iIntValue;
            InterfaceC11392b interfaceC11392b2;
            int i11;
            LocalAchievement localAchievement;
            int i12;
            InterfaceC11392b interfaceC11392b3;
            Object objM38805e = C10047c.m38805e();
            int i13 = this.f18946w;
            if (i13 == 0) {
                C7348o.m30470b(obj);
                C4617i c4617i = C4617i.f18890a;
                if (!c4617i.m22803s()) {
                    Log.i("rbx.achievements.playgames", "Skip updating and granting streak achievements");
                    return Unit.f29331a;
                }
                C4621m c4621mM22800j = c4617i.m22800j();
                this.f18946w = 1;
                if (c4621mM22800j.m22841m(this) != objM38805e) {
                }
                return objM38805e;
            }
            if (i13 == 1) {
                C7348o.m30470b(obj);
            } else {
                if (i13 == 2) {
                    int i14 = this.f18944u;
                    InterfaceC11392b interfaceC11392b4 = (InterfaceC11392b) this.f18943t;
                    C7348o.m30470b(obj);
                    i10 = i14;
                    interfaceC11392b = interfaceC11392b4;
                    iIntValue = ((Number) obj).intValue();
                    Log.i("rbx.achievements.playgames", "Current login streak: " + iIntValue);
                    if (iIntValue >= 3) {
                        Log.i("rbx.achievements.playgames", "Granting 3 day streak achievement");
                        LocalAchievement localAchievement2 = new LocalAchievement(C4610b.m22765c().getRobloxId(), null, 2, null);
                        this.f18943t = interfaceC11392b;
                        this.f18944u = i10;
                        this.f18945v = iIntValue;
                        this.f18946w = 3;
                    }
                    interfaceC11392b2 = interfaceC11392b;
                    i11 = iIntValue;
                    if (i11 >= 10) {
                        Log.i("rbx.achievements.playgames", "Granting 10 day streak achievement");
                        localAchievement = new LocalAchievement(C4610b.m22764b().getRobloxId(), null, 2, null);
                        this.f18943t = interfaceC11392b2;
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 4;
                        if (interfaceC11392b2.mo15951f(localAchievement, this) != objM38805e) {
                            i12 = i10;
                            interfaceC11392b3 = interfaceC11392b2;
                            interfaceC11392b2 = interfaceC11392b3;
                            i10 = i12;
                            if (i11 >= 20) {
                                Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                                LocalAchievement localAchievement3 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                                this.f18943t = C10350l.m39676a(interfaceC11392b2);
                                this.f18944u = i10;
                                this.f18945v = i11;
                                this.f18946w = 5;
                            }
                        }
                    } else if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement4 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                        this.f18943t = C10350l.m39676a(interfaceC11392b2);
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 5;
                    }
                    return objM38805e;
                }
                if (i13 == 3) {
                    i11 = this.f18945v;
                    i10 = this.f18944u;
                    interfaceC11392b2 = (InterfaceC11392b) this.f18943t;
                    C7348o.m30470b(obj);
                    if (i11 >= 10) {
                        Log.i("rbx.achievements.playgames", "Granting 10 day streak achievement");
                        localAchievement = new LocalAchievement(C4610b.m22764b().getRobloxId(), null, 2, null);
                        this.f18943t = interfaceC11392b2;
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 4;
                        if (interfaceC11392b2.mo15951f(localAchievement, this) != objM38805e) {
                            i12 = i10;
                            interfaceC11392b3 = interfaceC11392b2;
                            interfaceC11392b2 = interfaceC11392b3;
                            i10 = i12;
                            if (i11 >= 20) {
                                Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                                LocalAchievement localAchievement5 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                                this.f18943t = C10350l.m39676a(interfaceC11392b2);
                                this.f18944u = i10;
                                this.f18945v = i11;
                                this.f18946w = 5;
                            }
                        }
                    } else if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement6 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                        this.f18943t = C10350l.m39676a(interfaceC11392b2);
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 5;
                    }
                    return objM38805e;
                }
                if (i13 == 4) {
                    i11 = this.f18945v;
                    i12 = this.f18944u;
                    interfaceC11392b3 = (InterfaceC11392b) this.f18943t;
                    C7348o.m30470b(obj);
                    interfaceC11392b2 = interfaceC11392b3;
                    i10 = i12;
                    if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement7 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                        this.f18943t = C10350l.m39676a(interfaceC11392b2);
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 5;
                    }
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
            }
            return Unit.f29331a;
            InterfaceC11392b interfaceC11392bM15964a = C3346b.f12730a.m15964a();
            if (interfaceC11392bM15964a != null) {
                C4621m c4621mM22800j2 = C4617i.f18890a.m22800j();
                this.f18943t = interfaceC11392bM15964a;
                i10 = 0;
                this.f18944u = 0;
                this.f18946w = 2;
                Object objM22837i = c4621mM22800j2.m22837i(this);
                if (objM22837i != objM38805e) {
                    interfaceC11392b = interfaceC11392bM15964a;
                    obj = objM22837i;
                    iIntValue = ((Number) obj).intValue();
                    Log.i("rbx.achievements.playgames", "Current login streak: " + iIntValue);
                    if (iIntValue >= 3) {
                        Log.i("rbx.achievements.playgames", "Granting 3 day streak achievement");
                        LocalAchievement localAchievement8 = new LocalAchievement(C4610b.m22765c().getRobloxId(), null, 2, null);
                        this.f18943t = interfaceC11392b;
                        this.f18944u = i10;
                        this.f18945v = iIntValue;
                        this.f18946w = 3;
                    }
                    interfaceC11392b2 = interfaceC11392b;
                    i11 = iIntValue;
                    if (i11 >= 10) {
                        Log.i("rbx.achievements.playgames", "Granting 10 day streak achievement");
                        localAchievement = new LocalAchievement(C4610b.m22764b().getRobloxId(), null, 2, null);
                        this.f18943t = interfaceC11392b2;
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 4;
                        if (interfaceC11392b2.mo15951f(localAchievement, this) != objM38805e) {
                            i12 = i10;
                            interfaceC11392b3 = interfaceC11392b2;
                            interfaceC11392b2 = interfaceC11392b3;
                            i10 = i12;
                            if (i11 >= 20) {
                                Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                                LocalAchievement localAchievement9 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                                this.f18943t = C10350l.m39676a(interfaceC11392b2);
                                this.f18944u = i10;
                                this.f18945v = i11;
                                this.f18946w = 5;
                            }
                        }
                    } else if (i11 >= 20) {
                        Log.i("rbx.achievements.playgames", "Granting 20 day streak achievement");
                        LocalAchievement localAchievement10 = new LocalAchievement(C4610b.m22766d().getRobloxId(), null, 2, null);
                        this.f18943t = C10350l.m39676a(interfaceC11392b2);
                        this.f18944u = i10;
                        this.f18945v = i11;
                        this.f18946w = 5;
                    }
                }
                return objM38805e;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((k) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m22792l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C11659h.m43403a().mo43514P5()) {
            return true;
        }
        if (C11659h.m43403a().mo43462I1() && C4614f.f18888a.m22780b(context)) {
            return true;
        }
        if (C11659h.m43403a().mo43758y0() && C11659h.m43403a().mo43712r3()) {
            return C4612d.m22771e(context);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final void m22793m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!m22792l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onAppCreate");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        achievementsInitJob = C7882k.m32780d(C0982t.m4979a(C0959h0.INSTANCE.m4917a()), C7864g1.m32644b(), null, new d(applicationContext, null), 2, null);
        C4504h.m22467a(applicationContext);
    }

    /* JADX INFO: renamed from: n */
    public static final void m22794n(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!m22792l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onBtidObtained");
        } else if (C11659h.m43403a().mo43758y0()) {
            C4612d.m22772f(context, btid);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m22795o(@NotNull ActivityC4831q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!m22792l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageInteractive");
        } else {
            observerAttached = true;
            C7882k.m32780d(C0982t.m4979a(activity), null, null, new f(activity, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m22796p(@NotNull ActivityC4831q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!m22792l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageLoaded");
        } else if (observerAttached) {
            C7882k.m32780d(C0982t.m4979a(activity), null, null, new g(activity, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m22797q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!m22792l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onSettingsLoaded");
            return;
        }
        if (C11659h.m43403a().mo43758y0()) {
            C4612d.m22773g(context);
        }
        m22793m(context);
    }

    /* JADX INFO: renamed from: u */
    public static final C4621m m22798u() {
        SharedPreferences sharedPreferences = RobloxApplication.m14834f().getSharedPreferences("play_games_streak", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return new C4621m(sharedPreferences, C7864g1.m32644b(), C11659h.m43403a().mo43704q2() ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : 86400000L, new C6110d0());
    }

    /* JADX INFO: renamed from: i */
    public final Object m22799i(InterfaceC9557b<? super Unit> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new a(null), interfaceC9557b);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final C4621m m22800j() {
        return (C4621m) streakTracker.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m22801k(InterfaceC4501e interfaceC4501e, InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f18901w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f18901w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM32684g = bVar.f18899u;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f18901w;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            c cVar = new c(interfaceC4501e, null);
            bVar.f18898t = C10350l.m39676a(interfaceC4501e);
            bVar.f18901w = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, cVar, bVar);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        return ((C7347n) objM32684g).getValue();
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ActivityC6992b activityC6992b = owner instanceof ActivityC6992b ? (ActivityC6992b) owner : null;
        if (activityC6992b == null) {
            return;
        }
        InterfaceC11392b interfaceC11392bM15964a = C3346b.f12730a.m15964a();
        if (interfaceC11392bM15964a == null) {
            Log.w("rbx.achievements.playgames", "no local achievement storage - google play games disabled");
        } else {
            C7882k.m32780d(C0982t.m4979a(activityC6992b), null, null, new e(activityC6992b, interfaceC11392bM15964a, null), 3, null);
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onDestroy(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onDestroy(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onResume(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onResume(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStop(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C7882k.m32780d(C0982t.m4979a(owner), null, null, new h(null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m22802r(@NotNull C11413w c11413w, @NotNull InterfaceC9557b<Object> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new i(c11413w, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22803s() {
        return !hasUnlockedAllStreaks.get() && C5656e.f21712a.m25694b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m22804t(InterfaceC9557b<? super Unit> interfaceC9557b) {
        j jVar;
        if (interfaceC9557b instanceof j) {
            jVar = (j) interfaceC9557b;
            int i10 = jVar.f18942w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                jVar.f18942w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                jVar = new j(interfaceC9557b);
            }
        } else {
            jVar = new j(interfaceC9557b);
        }
        Object objM25693a = jVar.f18940u;
        Object objM38805e = C10047c.m38805e();
        int i11 = jVar.f18942w;
        if (i11 == 0) {
            C7348o.m30470b(objM25693a);
            Log.i("rbx.achievements.playgames", "Waiting for valid user id to update streak");
            C5656e c5656e = C5656e.f21712a;
            jVar.f18942w = 1;
            objM25693a = c5656e.m25693a(jVar);
            if (objM25693a != objM38805e) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM25693a);
            return objM25693a;
        }
        C7348o.m30470b(objM25693a);
        long jLongValue = ((Number) objM25693a).longValue();
        Log.i("rbx.achievements.playgames", "User id " + jLongValue + " signed in, updating streak");
        jVar.f18939t = jLongValue;
        jVar.f18942w = 2;
        Object objM22805v = m22805v(jVar);
        return objM22805v == objM38805e ? objM38805e : objM22805v;
    }

    /* JADX INFO: renamed from: v */
    public final Object m22805v(InterfaceC9557b<? super Unit> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new k(null), interfaceC9557b);
    }
}
