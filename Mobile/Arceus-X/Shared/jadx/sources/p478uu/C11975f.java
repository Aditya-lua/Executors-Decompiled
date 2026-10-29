package p478uu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7888l0;
import p256ku.C7905p;
import p256ku.C7913r;
import p256ku.C7922t0;
import p256ku.InterfaceC7886k3;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.AbstractC10713b0;
import p452tu.InterfaceC11760l;
import p563y1.C12996b;
import p615zt.InterfaceC14057n;
import pt.C10346h;

/* JADX INFO: renamed from: uu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015RR\u0010\u001f\u001a@\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u00180\u0018j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¨\u0006%"}, m31665d2 = {"Luu/f;", "Luu/j;", "Luu/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "f", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "A", "(Ljava/lang/Object;)I", "D", "G", "Lkotlin/Function3;", "Ltu/l;", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "Lzt/n;", "onSelectCancellationUnlockConstructor", "B", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "a", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C11975f extends C11979j implements InterfaceC11970a {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42426i = AtomicReferenceFieldUpdater.newUpdater(C11975f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14057n<InterfaceC11760l<?>, Object, Object, InterfaceC14057n<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: uu.f$a */
    @Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\"\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\u001fj\u0002` H\u0096\u0001¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u00020\u00022\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u00020\u0002*\u00020*2\u0006\u0010\u0015\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b-\u0010.J\u001e\u00101\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0096\u0001¢\u0006\u0004\b1\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00106R\u0014\u00109\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m31665d2 = {"Luu/f$a;", "Lku/n;", "", "Lku/k3;", "Lku/p;", "cont", "", "owner", "<init>", "(Luu/f;Lku/p;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "j", "(Lkotlin/Unit;Ljava/lang/Object;Lzt/n;)Ljava/lang/Object;", "g", "(Lkotlin/Unit;Lzt/n;)V", "exception", "o", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "J", "(Ljava/lang/Object;)V", "cause", "", "p", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "n", "(Lkotlin/jvm/functions/Function1;)V", "Lqu/b0;", "segment", "", "index", "e", "(Lqu/b0;I)V", "Lku/l0;", "i", "(Lku/l0;Lkotlin/Unit;)V", "f", "(Lku/l0;Ljava/lang/Throwable;)V", "Ljt/n;", "result", "resumeWith", "a", "Lku/p;", "b", "Ljava/lang/Object;", "()Z", "isActive", "d", "isCompleted", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a implements InterfaceC7897n<Unit>, InterfaceC7886k3 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C7905p<Unit> cont;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Object owner;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.p<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable C7905p<? super Unit> c7905p, Object obj) {
            this.cont = c7905p;
            this.owner = obj;
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m44691h(C11975f c11975f, a aVar, Throwable th2) {
            c11975f.mo44673e(aVar.owner);
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: l */
        public static final Unit m44692l(C11975f c11975f, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            C11975f.m44684z().set(c11975f, aVar.owner);
            c11975f.mo44673e(aVar.owner);
            return Unit.f29331a;
        }

        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: J */
        public void mo32810J(@NotNull Object token) {
            this.cont.mo32810J(token);
        }

        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: b */
        public boolean mo32811b() {
            return this.cont.mo32811b();
        }

        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: d */
        public boolean mo32812d() {
            return this.cont.mo32812d();
        }

        @Override // p256ku.InterfaceC7886k3
        /* JADX INFO: renamed from: e */
        public void mo32790e(@NotNull AbstractC10713b0<?> segment, int index) {
            this.cont.mo32790e(segment, index);
        }

        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: f */
        public void mo32813f(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull Throwable th2) {
            this.cont.mo32813f(abstractC7888l0, th2);
        }

        /* JADX DEBUG: Method merged with bridge method: k(Ljava/lang/Object;Lzt/n;)V */
        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void mo32814k(@NotNull R value, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            C11975f.m44684z().set(C11975f.this, this.owner);
            C7905p<Unit> c7905p = this.cont;
            final C11975f c11975f = C11975f.this;
            c7905p.m32869S(value, new Function1() { // from class: uu.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C11975f.a.m44691h(c11975f, this, (Throwable) obj);
                }
            });
        }

        @Override // p315nt.InterfaceC9557b
        @NotNull
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        /* JADX DEBUG: Method merged with bridge method: x(Lku/l0;Ljava/lang/Object;)V */
        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo32818x(@NotNull AbstractC7888l0 abstractC7888l0, @NotNull Unit unit) {
            this.cont.mo32818x(abstractC7888l0, unit);
        }

        /* JADX DEBUG: Method merged with bridge method: G(Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)Ljava/lang/Object; */
        @Override // p256ku.InterfaceC7897n
        @Nullable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object mo32809G(@NotNull R value, @Nullable Object idempotent, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            final C11975f c11975f = C11975f.this;
            Object objMo32809G = this.cont.mo32809G(value, idempotent, new InterfaceC14057n() { // from class: uu.d
                @Override // p615zt.InterfaceC14057n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C11975f.a.m44692l(c11975f, this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                }
            });
            if (objMo32809G != null) {
                C11975f.m44684z().set(C11975f.this, this.owner);
            }
            return objMo32809G;
        }

        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: n */
        public void mo32815n(@NotNull Function1<? super Throwable, Unit> handler) {
            this.cont.mo32815n(handler);
        }

        @Override // p256ku.InterfaceC7897n
        @Nullable
        /* JADX INFO: renamed from: o */
        public Object mo32816o(@NotNull Throwable exception) {
            return this.cont.mo32816o(exception);
        }

        @Override // p256ku.InterfaceC7897n
        /* JADX INFO: renamed from: p */
        public boolean mo32817p(@Nullable Throwable cause) {
            return this.cont.mo32817p(cause);
        }

        @Override // p315nt.InterfaceC9557b
        public void resumeWith(@NotNull Object result) {
            this.cont.resumeWith(result);
        }
    }

    public C11975f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : C11976g.f42431a;
        this.onSelectCancellationUnlockConstructor = new InterfaceC14057n() { // from class: uu.b
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C11975f.m44679E(this.f42419a, (InterfaceC11760l) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Object m44678C(C11975f c11975f, Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM44687D;
        return (!c11975f.mo44672d(obj) && (objM44687D = c11975f.m44687D(obj, interfaceC9557b)) == C10047c.m38805e()) ? objM44687D : Unit.f29331a;
    }

    /* JADX INFO: renamed from: E */
    public static final InterfaceC14057n m44679E(final C11975f c11975f, InterfaceC11760l interfaceC11760l, final Object obj, Object obj2) {
        return new InterfaceC14057n() { // from class: uu.c
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return C11975f.m44680F(this.f42420a, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m44680F(C11975f c11975f, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        c11975f.mo44673e(obj);
        return Unit.f29331a;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [uu.f.a.l(uu.f, uu.f$a, java.lang.Throwable, kotlin.Unit, kotlin.coroutines.CoroutineContext):kotlin.Unit, uu.f.a.g(R extends kotlin.Unit, zt.n<? super java.lang.Throwable, ? super R extends kotlin.Unit, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>):void, uu.f.a.j(R extends kotlin.Unit, java.lang.Object, zt.n<? super java.lang.Throwable, ? super R extends kotlin.Unit, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>):java.lang.Object] */
    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m44684z() {
        return f42426i;
    }

    /* JADX INFO: renamed from: A */
    public final int m44685A(Object owner) {
        while (m44686B()) {
            Object obj = f42426i.get(this);
            if (obj != C11976g.f42431a) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public boolean m44686B() {
        return m44712c() == 0;
    }

    /* JADX INFO: renamed from: D */
    public final Object m44687D(Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905pM32900b = C7913r.m32900b(C10046b.m38803c(interfaceC9557b));
        try {
            m44713i(new a(c7905pM32900b, obj));
            Object objM32857A = c7905pM32900b.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
        } catch (Throwable th2) {
            c7905pM32900b.m32867Q();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m44688G(Object owner) {
        while (!m44718t()) {
            if (owner == null) {
                return 1;
            }
            int iM44685A = m44685A(owner);
            if (iM44685A == 1) {
                return 2;
            }
            if (iM44685A == 2) {
                return 1;
            }
        }
        f42426i.set(this, owner);
        return 0;
    }

    @Override // p478uu.InterfaceC11970a
    /* JADX INFO: renamed from: d */
    public boolean mo44672d(@Nullable Object owner) {
        int iM44688G = m44688G(owner);
        if (iM44688G == 0) {
            return true;
        }
        if (iM44688G == 1) {
            return false;
        }
        if (iM44688G != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    @Override // p478uu.InterfaceC11970a
    /* JADX INFO: renamed from: e */
    public void mo44673e(@Nullable Object owner) {
        while (m44686B()) {
            Object obj = f42426i.get(this);
            if (obj != C11976g.f42431a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (C12996b.m48310a(f42426i, this, obj, C11976g.f42431a)) {
                    m44710a();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // p478uu.InterfaceC11970a
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo44674f(@Nullable Object obj, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m44678C(this, obj, interfaceC9557b);
    }

    @NotNull
    public String toString() {
        return "Mutex@" + C7922t0.m32909b(this) + "[isLocked=" + m44686B() + ",owner=" + f42426i.get(this) + ']';
    }
}
