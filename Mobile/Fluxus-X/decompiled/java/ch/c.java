package ch;

import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.s;
import av.g1;
import av.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import gu.m;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u000f\u0018\u0000 \u00072\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lch/c;", BuildConfig.FLAVOR, "Lav/l0;", "mainDispatcher", "<init>", "(Lav/l0;)V", BuildConfig.FLAVOR, "d", "(Leu/b;)Ljava/lang/Object;", "a", "Lav/l0;", BuildConfig.FLAVOR, "b", "Z", "registered", "ch/c$c", "c", "Lch/c$c;", "observer", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile boolean registered;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C0103c observer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallScheduler$ensureScheduledOnBackground$2", f = "GmaSdkBackgroundInstallScheduler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5138t;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5138t != 0) {
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
            return Unit.f21506a;
        }
    }

    /* JADX INFO: renamed from: ch.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ch/c$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onStop", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0103c implements androidx.p000lifecycle.f {
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
            if (ai.h.k("gmasdk")) {
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
        this.observer = new C0103c();
    }

    @Nullable
    public final Object d(@NotNull eu.b<? super Unit> bVar) {
        Object objG = av.i.g(this.mainDispatcher, new b(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    public /* synthetic */ c(l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.c().getImmediate() : l0Var);
    }
}
