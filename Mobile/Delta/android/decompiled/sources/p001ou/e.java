package p001ou;

import java.util.ArrayList;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import ku.q0;
import ku.r0;
import ku.t0;
import mu.t;
import mu.v;
import mu.x;
import nu.h;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R6\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lou/e;", "T", "Lou/q;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lnu/h;", "h", "()Lnu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "Lmu/v;", "scope", "", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "Lku/p0;", "Lmu/x;", "m", "(Lku/p0;)Lmu/x;", "Lnu/i;", "collector", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "", "b", "()Ljava/lang/String;", "toString", "a", "Lkotlin/coroutines/CoroutineContext;", "I", "c", "Lmu/a;", "Lkotlin/Function2;", "Lnt/b;", "", "k", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "l", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.a onBufferOverflow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27951t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27952u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T> f27953v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ e<T> f27954w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar, e<T> eVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f27953v = iVar;
            this.f27954w = eVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f27953v, this.f27954w, bVar);
            aVar.f27952u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f27951t;
            if (i10 == 0) {
                o.b(obj);
                p0 p0Var = (p0) this.f27952u;
                i<T> iVar = this.f27953v;
                x<T> xVarM = this.f27954w.m(p0Var);
                this.f27951t = 1;
                if (j.p(iVar, xVarM, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lmu/v;", "it", "", "<anonymous>", "(Lmu/v;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    public static final class b extends m implements Function2<v<? super T>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27955t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27956u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e<T> f27957v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f27957v = eVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = new b(this.f27957v, bVar);
            bVar2.f27956u = obj;
            return bVar2;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f27955t;
            if (i10 == 0) {
                o.b(obj);
                v<? super T> vVar = (v) this.f27956u;
                e<T> eVar = this.f27957v;
                this.f27955t = 1;
                if (eVar.d(vVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super T> vVar, nt.b<? super Unit> bVar) {
            return ((b) create(vVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public e(@NotNull CoroutineContext coroutineContext, int i10, @NotNull mu.a aVar) {
        this.context = coroutineContext;
        this.capacity = i10;
        this.onBufferOverflow = aVar;
    }

    public static /* synthetic */ <T> Object c(e<T> eVar, i<? super T> iVar, nt.b<? super Unit> bVar) {
        Object objG = q0.g(new a(iVar, eVar, null), bVar);
        return objG == c.e() ? objG : Unit.f22483a;
    }

    @Nullable
    public String b() {
        return null;
    }

    @Override // nu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull nt.b<? super Unit> bVar) {
        return c(this, iVar, bVar);
    }

    @Nullable
    public abstract Object d(@NotNull v<? super T> vVar, @NotNull nt.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p001ou.q
    @NotNull
    public h<T> e(@NotNull CoroutineContext context, int capacity, @NotNull mu.a onBufferOverflow) {
        CoroutineContext coroutineContextPlus = context.plus(this.context);
        if (onBufferOverflow == mu.a.SUSPEND) {
            int i10 = this.capacity;
            if (i10 != -3) {
                if (capacity == -3) {
                    capacity = i10;
                } else if (i10 != -2) {
                    if (capacity == -2) {
                        capacity = i10;
                    } else {
                        capacity += i10;
                        if (capacity < 0) {
                            capacity = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (Intrinsics.c(coroutineContextPlus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : f(coroutineContextPlus, capacity, onBufferOverflow);
    }

    @NotNull
    public abstract e<T> f(@NotNull CoroutineContext context, int capacity, @NotNull mu.a onBufferOverflow);

    @Nullable
    public h<T> h() {
        return null;
    }

    @NotNull
    public final Function2<v<? super T>, nt.b<? super Unit>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @NotNull
    public x<T> m(@NotNull p0 scope) {
        return t.e(scope, this.context, l(), this.onBufferOverflow, r0.ATOMIC, null, k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        if (this.context != kotlin.coroutines.e.f22525a) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != mu.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return t0.a(this) + '[' + CollectionsKt.m0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
