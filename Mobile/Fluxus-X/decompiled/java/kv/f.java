package kv;

import av.k3;
import av.l0;
import av.p;
import av.r;
import av.t0;
import com.github.luben.zstd.BuildConfig;
import gv.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import pu.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015RR\u0010\u001f\u001a@\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u00180\u0018j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¨\u0006%"}, d2 = {"Lkv/f;", "Lkv/j;", "Lkv/a;", BuildConfig.FLAVOR, "locked", "<init>", "(Z)V", BuildConfig.FLAVOR, "owner", BuildConfig.FLAVOR, "d", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Z", "f", "(Ljava/lang/Object;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "A", "(Ljava/lang/Object;)I", "D", "G", "Lkotlin/Function3;", "Ljv/l;", BuildConfig.FLAVOR, "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "Lpu/n;", "onSelectCancellationUnlockConstructor", "B", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends j implements kv.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21806i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<jv.l<?>, Object, Object, n<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u001fj\u0002` H\u0096\u0001¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020\u00022\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u00020\u0002*\u00020*2\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b-\u0010.J\u001e\u00101\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0096\u0001¢\u0006\u0004\b1\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00106R\u0014\u00109\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lkv/f$a;", "Lav/n;", BuildConfig.FLAVOR, "Lav/k3;", "Lav/p;", "cont", BuildConfig.FLAVOR, "owner", "<init>", "(Lkv/f;Lav/p;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", BuildConfig.FLAVOR, "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "k", "(Lkotlin/Unit;Ljava/lang/Object;Lpu/n;)Ljava/lang/Object;", "f", "(Lkotlin/Unit;Lpu/n;)V", "exception", "l", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "L", "(Ljava/lang/Object;)V", "cause", BuildConfig.FLAVOR, "t", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "j", "(Lkotlin/jvm/functions/Function1;)V", "Lgv/b0;", "segment", BuildConfig.FLAVOR, "index", "c", "(Lgv/b0;I)V", "Lav/l0;", "h", "(Lav/l0;Lkotlin/Unit;)V", "i", "(Lav/l0;Ljava/lang/Throwable;)V", "Lzt/n;", "result", "resumeWith", "a", "Lav/p;", "b", "Ljava/lang/Object;", "()Z", "isActive", "d", "isCompleted", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements av.n<Unit>, k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final p<Unit> cont;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable p<? super Unit> pVar, Object obj) {
            this.cont = pVar;
            this.owner = obj;
        }

        public static final Unit g(f fVar, a aVar, Throwable th2) {
            fVar.f(aVar.owner);
            return Unit.f21506a;
        }

        public static final Unit m(f fVar, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            f.z().set(fVar, aVar.owner);
            fVar.f(aVar.owner);
            return Unit.f21506a;
        }

        @Override // av.n
        public void L(@NotNull Object token) {
            this.cont.L(token);
        }

        @Override // av.n
        public boolean b() {
            return this.cont.b();
        }

        @Override // av.k3
        public void c(@NotNull b0<?> segment, int index) {
            this.cont.c(segment, index);
        }

        @Override // av.n
        public boolean d() {
            return this.cont.d();
        }

        @Override // av.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void C(@NotNull R value, @Nullable n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            f.z().set(f.this, this.owner);
            p<Unit> pVar = this.cont;
            final f fVar = f.this;
            pVar.S(value, new Function1() { // from class: kv.e
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.g(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // eu.b
        @NotNull
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // av.n
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void D(@NotNull l0 l0Var, @NotNull Unit unit) {
            this.cont.D(l0Var, unit);
        }

        @Override // av.n
        public void i(@NotNull l0 l0Var, @NotNull Throwable th2) {
            this.cont.i(l0Var, th2);
        }

        @Override // av.n
        public void j(@NotNull Function1<? super Throwable, Unit> handler) {
            this.cont.j(handler);
        }

        @Override // av.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object J(@NotNull R value, @Nullable Object idempotent, @Nullable n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            final f fVar = f.this;
            Object objJ = this.cont.J(value, idempotent, new n() { // from class: kv.d
                @Override // pu.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return f.a.m(fVar, this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                }
            });
            if (objJ != null) {
                f.z().set(f.this, this.owner);
            }
            return objJ;
        }

        @Override // av.n
        @Nullable
        public Object l(@NotNull Throwable exception) {
            return this.cont.l(exception);
        }

        @Override // eu.b
        public void resumeWith(@NotNull Object result) {
            this.cont.resumeWith(result);
        }

        @Override // av.n
        public boolean t(@Nullable Throwable cause) {
            return this.cont.t(cause);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f21810a;
        this.onSelectCancellationUnlockConstructor = new n() { // from class: kv.b
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.E(this.f21802a, (jv.l) obj, obj2, obj3);
            }
        };
    }

    public static /* synthetic */ Object C(f fVar, Object obj, eu.b<? super Unit> bVar) {
        Object objD;
        return (!fVar.e(obj) && (objD = fVar.D(obj, bVar)) == fu.c.e()) ? objD : Unit.f21506a;
    }

    public static final n E(final f fVar, jv.l lVar, final Object obj, Object obj2) {
        return new n() { // from class: kv.c
            @Override // pu.n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.F(this.f21803a, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    public static final Unit F(f fVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        fVar.f(obj);
        return Unit.f21506a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f21806i;
    }

    public final int A(Object owner) {
        while (B()) {
            Object obj = f21806i.get(this);
            if (obj != g.f21810a) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    public boolean B() {
        return b() == 0;
    }

    public final Object D(Object obj, eu.b<? super Unit> bVar) {
        p pVarB = r.b(fu.b.c(bVar));
        try {
            i(new a(pVarB, obj));
            Object objY = pVarB.y();
            if (objY == fu.c.e()) {
                gu.h.c(bVar);
            }
            return objY == fu.c.e() ? objY : Unit.f21506a;
        } catch (Throwable th2) {
            pVarB.Q();
            throw th2;
        }
    }

    public final int G(Object owner) {
        while (!t()) {
            if (owner == null) {
                return 1;
            }
            int iA = A(owner);
            if (iA == 1) {
                return 2;
            }
            if (iA == 2) {
                return 1;
            }
        }
        f21806i.set(this, owner);
        return 0;
    }

    @Override // kv.a
    @Nullable
    public Object d(@Nullable Object obj, @NotNull eu.b<? super Unit> bVar) {
        return C(this, obj, bVar);
    }

    @Override // kv.a
    public boolean e(@Nullable Object owner) {
        int iG = G(owner);
        if (iG == 0) {
            return true;
        }
        if (iG == 1) {
            return false;
        }
        if (iG != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    @Override // kv.a
    public void f(@Nullable Object owner) {
        while (B()) {
            Object obj = f21806i.get(this);
            if (obj != g.f21810a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (y1.b.a(f21806i, this, obj, g.f21810a)) {
                    a();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @NotNull
    public String toString() {
        return "Mutex@" + t0.b(this) + "[isLocked=" + B() + ",owner=" + f21806i.get(this) + ']';
    }
}
