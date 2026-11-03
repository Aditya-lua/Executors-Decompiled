package e7;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/l;", "", "a", "(Landroidx/lifecycle/l;Llt/b;)Ljava/lang/Object;", "Landroidx/lifecycle/r;", "observer", "b", "(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @nt.f(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {42}, m = "awaitStarted")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15816t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15817u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15818v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f15819w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f15820x;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15819w = obj;
            this.f15820x |= Integer.MIN_VALUE;
            return s.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"e7/s$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iu.n<Unit> f15821a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(iu.n<? super Unit> nVar) {
            this.f15821a = nVar;
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s owner) {
            iu.n<Unit> nVar = this.f15821a;
            gt.n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(Unit.f22938a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, e7.s$b, java.lang.Object] */
    @Nullable
    public static final Object a(@NotNull androidx.p000lifecycle.l lVar, @NotNull lt.b<? super Unit> bVar) throws Throwable {
        a aVar;
        androidx.p000lifecycle.l lVar2;
        kotlin.jvm.internal.c0 c0Var;
        Throwable th2;
        androidx.p000lifecycle.r rVar;
        androidx.p000lifecycle.r rVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f15820x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15820x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f15819w;
        Object objE = mt.c.e();
        int i11 = aVar.f15820x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) aVar.f15817u;
            lVar2 = (androidx.p000lifecycle.l) aVar.f15816t;
            try {
                gt.o.b(obj);
                rVar2 = (androidx.p000lifecycle.r) c0Var.f23007a;
                if (rVar2 != null) {
                    lVar2.d(rVar2);
                }
                return Unit.f22938a;
            } catch (Throwable th3) {
                th2 = th3;
                rVar = (androidx.p000lifecycle.r) c0Var.f23007a;
                if (rVar != null) {
                    lVar2.d(rVar);
                }
                throw th2;
            }
        }
        gt.o.b(obj);
        if (lVar.getState().b(androidx.lifecycle.l.b.STARTED)) {
            return Unit.f22938a;
        }
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        try {
            aVar.f15816t = lVar;
            aVar.f15817u = c0Var2;
            aVar.f15818v = 0;
            aVar.f15820x = 1;
            iu.p pVar = new iu.p(mt.b.c(aVar), 1);
            pVar.H();
            ?? bVar2 = new b(pVar);
            c0Var2.f23007a = bVar2;
            Intrinsics.checkNotNull(bVar2);
            lVar.a((androidx.p000lifecycle.r) bVar2);
            Object objA = pVar.A();
            if (objA == mt.c.e()) {
                nt.h.c(aVar);
            }
            if (objA == objE) {
                return objE;
            }
            lVar2 = lVar;
            c0Var = c0Var2;
            rVar2 = (androidx.p000lifecycle.r) c0Var.f23007a;
            if (rVar2 != null) {
                lVar2.d(rVar2);
            }
            return Unit.f22938a;
        } catch (Throwable th4) {
            lVar2 = lVar;
            c0Var = c0Var2;
            th2 = th4;
            rVar = (androidx.p000lifecycle.r) c0Var.f23007a;
            if (rVar != null) {
                lVar2.d(rVar);
            }
            throw th2;
        }
    }

    public static final void b(@NotNull androidx.p000lifecycle.l lVar, @NotNull androidx.p000lifecycle.r rVar) {
        lVar.d(rVar);
        lVar.a(rVar);
    }
}
