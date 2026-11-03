package rg;

import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lrg/r;", "", "<init>", "()V", "", "c", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f30596a = new r();

    @nt.f(c = "com.roblox.client.BaselineProfileVerifier$logCompilationStatus$1", f = "BaselineProfileVerifier.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30597t;

        public a(lt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f30597t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                androidx.profileinstaller.d.c cVar = androidx.profileinstaller.d.a().get();
                ek.q.h("rbx.baselineprofile", "Baseline profile status: resultCode=" + cVar.a() + ", compiledWithProfile=" + cVar.c() + ", enqueuedForCompilation=" + cVar.b());
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                ek.q.k("rbx.baselineprofile", "Interrupted reading baseline profile compilation status: " + e10);
            } catch (ExecutionException e11) {
                ek.q.k("rbx.baselineprofile", "Failed to read baseline profile compilation status: " + e11);
            }
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"rg/r$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements androidx.p000lifecycle.f {
        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onCreate(androidx.p000lifecycle.s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onDestroy(androidx.p000lifecycle.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onPause(androidx.p000lifecycle.s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onResume(androidx.p000lifecycle.s sVar) {
            super.onResume(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            androidx.p000lifecycle.h0.INSTANCE.a().a().d(this);
            r.f30596a.b();
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onStop(androidx.p000lifecycle.s sVar) {
            super.onStop(sVar);
        }
    }

    public static final void c() {
        if (rh.h.a().A4()) {
            androidx.p000lifecycle.h0.INSTANCE.a().a().a(new b());
        }
    }

    public final void b() {
        iu.k.d(iu.q0.a(iu.g1.b()), null, null, new a(null), 3, null);
    }
}
