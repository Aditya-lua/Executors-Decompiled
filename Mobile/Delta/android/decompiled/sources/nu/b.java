package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnu/b;", "T", "Lnu/f;", "Lkotlin/Function2;", "Lmu/v;", "Lnt/b;", "", "", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "scope", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "Lou/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "e", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> extends f<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<mu.v<? super T>, nt.b<? super Unit>, Object> block;

    @pt.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26679t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26680u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b<T> f26681v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26682w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, nt.b<? super a> bVar2) {
            super(bVar2);
            this.f26681v = bVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26680u = obj;
            this.f26682w |= Integer.MIN_VALUE;
            return this.f26681v.d(null, this);
        }
    }

    public /* synthetic */ b(Function2 function2, CoroutineContext coroutineContext, int i10, mu.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.e.f22525a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? mu.a.SUSPEND : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nu.f, p001ou.e
    @Nullable
    public Object d(@NotNull mu.v<? super T> vVar, @NotNull nt.b<? super Unit> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f26682w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f26682w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, bVar);
            }
        } else {
            aVar = new a(this, bVar);
        }
        Object obj = aVar.f26680u;
        Object objE = ot.c.e();
        int i11 = aVar.f26682w;
        if (i11 == 0) {
            jt.o.b(obj);
            aVar.f26679t = vVar;
            aVar.f26682w = 1;
            if (super.d(vVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (mu.v) aVar.f26679t;
            jt.o.b(obj);
        }
        if (vVar.I()) {
            return Unit.f22483a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // nu.f, p001ou.e
    @NotNull
    public p001ou.e<T> f(@NotNull CoroutineContext context, int capacity, @NotNull mu.a onBufferOverflow) {
        return new b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function2<? super mu.v<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull mu.a aVar) {
        super(function2, coroutineContext, i10, aVar);
        this.block = function2;
    }
}
