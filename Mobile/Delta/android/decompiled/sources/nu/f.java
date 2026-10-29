package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnu/f;", "T", "Lou/e;", "Lkotlin/Function2;", "Lmu/v;", "Lnt/b;", "", "", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "scope", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f<T> extends p001ou.e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<mu.v<? super T>, nt.b<? super Unit>, Object> block;

    public /* synthetic */ f(Function2 function2, CoroutineContext coroutineContext, int i10, mu.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.e.f22525a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? mu.a.SUSPEND : aVar);
    }

    public static /* synthetic */ <T> Object n(f<T> fVar, mu.v<? super T> vVar, nt.b<? super Unit> bVar) {
        Object objInvoke = fVar.block.invoke(vVar, bVar);
        return objInvoke == ot.c.e() ? objInvoke : Unit.f22483a;
    }

    @Override // p001ou.e
    @Nullable
    public Object d(@NotNull mu.v<? super T> vVar, @NotNull nt.b<? super Unit> bVar) {
        return n(this, vVar, bVar);
    }

    @Override // p001ou.e
    @NotNull
    public p001ou.e<T> f(@NotNull CoroutineContext context, int capacity, @NotNull mu.a onBufferOverflow) {
        return new f(this.block, context, capacity, onBufferOverflow);
    }

    @Override // p001ou.e
    @NotNull
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function2<? super mu.v<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull mu.a aVar) {
        super(coroutineContext, i10, aVar);
        this.block = function2;
    }
}
