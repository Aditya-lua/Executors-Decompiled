package sg;

import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.s;
import ek.q;
import gt.o;
import iu.g1;
import iu.l0;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u000f\u0018\u0000 \u00072\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsg/c;", "", "Liu/l0;", "mainDispatcher", "<init>", "(Liu/l0;)V", "", "d", "(Llt/b;)Ljava/lang/Object;", "a", "Liu/l0;", "", "b", "Z", "registered", "sg/c$c", "c", "Lsg/c$c;", "observer", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile boolean registered;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C0551c observer;

    @nt.f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallScheduler$ensureScheduledOnBackground$2", f = "GmaSdkBackgroundInstallScheduler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31196t;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31196t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            androidx.p000lifecycle.l lVarA = h0.INSTANCE.a().a();
            if (!lVarA.getState().b(androidx.lifecycle.l.b.STARTED)) {
                q.h("gmaads", "The App is already in background, trigger the gmasdk install worker");
                d.b();
            }
            if (!c.this.registered) {
                c.this.registered = true;
                q.h("gmaads", "Register the App lifecycle observer");
                lVarA.a(c.this.observer);
            }
            return Unit.f22938a;
        }
    }

    /* JADX INFO: renamed from: sg.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sg/c$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStop", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0551c implements androidx.p000lifecycle.f {
        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onDestroy(s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onResume(s sVar) {
            super.onResume(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (qh.g.j("gmasdk")) {
                q.h("gmaads", "gmasdk installed, remove the App lifecycle observer");
                h0.INSTANCE.a().a().d(this);
            } else {
                q.h("gmaads", "The App moved to background, trigger the gmasdk install worker");
                d.b();
            }
        }
    }

    public c(@NotNull l0 mainDispatcher) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.mainDispatcher = mainDispatcher;
        this.observer = new C0551c();
    }

    @Nullable
    public final Object d(@NotNull lt.b<? super Unit> bVar) {
        Object objG = iu.i.g(this.mainDispatcher, new b(null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }

    public /* synthetic */ c(l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.c().getImmediate() : l0Var);
    }
}
