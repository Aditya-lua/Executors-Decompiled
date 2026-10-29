package p001ou;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.j0;
import mu.v;
import nt.b;
import nu.h;
import nu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lou/g;", "S", "T", "Lou/e;", "Lnu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lnu/h;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lnu/i;", "collector", "", "q", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "Lmu/v;", "scope", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "newContext", "p", "(Lnu/i;Lkotlin/coroutines/CoroutineContext;Lnt/b;)Ljava/lang/Object;", "Lnu/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g<S, T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<S> flow;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lnu/i;", "it", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    public static final class a extends m implements Function2<i<? super T>, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27959t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27960u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g<S, T> f27961v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<S, T> gVar, b<? super a> bVar) {
            super(2, bVar);
            this.f27961v = gVar;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f27961v, bVar);
            aVar.f27960u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f27959t;
            if (i10 == 0) {
                o.b(obj);
                i<? super T> iVar = (i) this.f27960u;
                g<S, T> gVar = this.f27961v;
                this.f27959t = 1;
                if (gVar.q(iVar, this) == objE) {
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
        public final Object invoke(i<? super T> iVar, b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull h<? extends S> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull mu.a aVar) {
        super(coroutineContext, i10, aVar);
        this.flow = hVar;
    }

    public static /* synthetic */ <S, T> Object n(g<S, T> gVar, i<? super T> iVar, b<? super Unit> bVar) {
        if (gVar.capacity == -3) {
            CoroutineContext context = bVar.getContext();
            CoroutineContext coroutineContextJ = j0.j(context, gVar.context);
            if (Intrinsics.c(coroutineContextJ, context)) {
                Object objQ = gVar.q(iVar, bVar);
                return objQ == c.e() ? objQ : Unit.f22483a;
            }
            d.Companion companion = d.INSTANCE;
            if (Intrinsics.c(coroutineContextJ.get(companion), context.get(companion))) {
                Object objP = gVar.p(iVar, coroutineContextJ, bVar);
                return objP == c.e() ? objP : Unit.f22483a;
            }
        }
        Object objCollect = super.collect(iVar, bVar);
        return objCollect == c.e() ? objCollect : Unit.f22483a;
    }

    public static /* synthetic */ <S, T> Object o(g<S, T> gVar, v<? super T> vVar, b<? super Unit> bVar) {
        Object objQ = gVar.q(new z(vVar), bVar);
        return objQ == c.e() ? objQ : Unit.f22483a;
    }

    @Override // p001ou.e, nu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull b<? super Unit> bVar) {
        return n(this, iVar, bVar);
    }

    @Override // p001ou.e
    @Nullable
    public Object d(@NotNull v<? super T> vVar, @NotNull b<? super Unit> bVar) {
        return o(this, vVar, bVar);
    }

    public final Object p(i<? super T> iVar, CoroutineContext coroutineContext, b<? super Unit> bVar) {
        return f.d(coroutineContext, f.e(iVar, bVar.getContext()), null, new a(this, null), bVar, 4, null);
    }

    @Nullable
    public abstract Object q(@NotNull i<? super T> iVar, @NotNull b<? super Unit> bVar);

    @Override // p001ou.e
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
