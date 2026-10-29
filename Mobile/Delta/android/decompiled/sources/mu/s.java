package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.s0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lmu/s;", "E", "Lmu/e;", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILmu/a;Lkotlin/jvm/functions/Function1;)V", "element", "i", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lmu/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isSendOp", "z1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "y1", "m", "I", "n", "Lmu/a;", "C0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class s<E> extends e<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a onBufferOverflow;

    public s(int i10, @NotNull a aVar, @Nullable Function1<? super E, Unit> function1) {
        super(i10, function1);
        this.capacity = i10;
        this.onBufferOverflow = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + d0.b(e.class).g() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ <E> Object x1(s<E> sVar, E e10, nt.b<? super Unit> bVar) throws Throwable {
        s0 s0VarC;
        Object objZ1 = sVar.z1(e10, true);
        if (!(objZ1 instanceof k.Closed)) {
            return Unit.f22483a;
        }
        k.e(objZ1);
        Function1<E, Unit> function1 = sVar.onUndeliveredElement;
        if (function1 == null || (s0VarC = qu.x.c(function1, e10, null, 2, null)) == null) {
            throw sVar.p0();
        }
        jt.a.a(s0VarC, sVar.p0());
        throw s0VarC;
    }

    @Override // mu.e
    public boolean C0() {
        return this.onBufferOverflow == a.DROP_OLDEST;
    }

    @Override // mu.e, mu.y
    @Nullable
    public Object i(E e10, @NotNull nt.b<? super Unit> bVar) {
        return x1(this, e10, bVar);
    }

    @Override // mu.e, mu.y
    @NotNull
    public Object w(E element) {
        return z1(element, false);
    }

    public final Object y1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        s0 s0VarC;
        Object objW = super.w(element);
        if (k.i(objW) || k.h(objW)) {
            return objW;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (s0VarC = qu.x.c(function1, element, null, 2, null)) == null) {
            return k.INSTANCE.c(Unit.f22483a);
        }
        throw s0VarC;
    }

    public final Object z1(E element, boolean isSendOp) {
        return this.onBufferOverflow == a.DROP_LATEST ? y1(element, isSendOp) : n1(element);
    }
}
