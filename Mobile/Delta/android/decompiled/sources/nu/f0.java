package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rR6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnu/f0;", "T", "Lnu/a;", "Lkotlin/Function2;", "Lnu/i;", "Lnt/b;", "", "", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "collector", "b", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<i<? super T>, nt.b<? super Unit>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@NotNull Function2<? super i<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2) {
        this.block = function2;
    }

    @Override // nu.a
    @Nullable
    public Object b(@NotNull i<? super T> iVar, @NotNull nt.b<? super Unit> bVar) {
        Object objInvoke = this.block.invoke(iVar, bVar);
        return objInvoke == ot.c.e() ? objInvoke : Unit.f22483a;
    }
}
