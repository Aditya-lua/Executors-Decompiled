package mu;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku.k3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.b0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J!\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0001\u0010\u0010R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016038\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lmu/m;", "E", "Lqu/b0;", "", "id", "prev", "Lmu/e;", "channel", "", "pointers", "<init>", "(JLmu/m;Lmu/e;I)V", "index", "element", "", "G", "(ILjava/lang/Object;)V", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "", "B", "value", "F", "from", "to", "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", "C", "(IZ)V", "e", "Lmu/e;", "_channel", "y", "()Lmu/e;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<E> extends b0<m<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final e<E> _channel;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f24565f;

    public m(long j10, @Nullable m<E> mVar, @Nullable e<E> eVar, int i10) {
        super(j10, mVar, i10);
        this._channel = eVar;
        this.f24565f = new AtomicReferenceArray(f.b * 2);
    }

    public final E A(int index) {
        return (E) getF24565f().get(index * 2);
    }

    @Nullable
    public final Object B(int index) {
        return getF24565f().get((index * 2) + 1);
    }

    public final void C(int index, boolean receiver) {
        if (receiver) {
            y().w1((this.id * ((long) f.b)) + ((long) index));
        }
        t();
    }

    public final E D(int index) {
        E eA = A(index);
        w(index);
        return eA;
    }

    public final void E(int index, Object value) {
        getF24565f().set(index * 2, value);
    }

    public final void F(int index, @Nullable Object value) {
        getF24565f().set((index * 2) + 1, value);
    }

    public final void G(int index, E element) {
        E(index, element);
    }

    @Override // qu.b0
    public int r() {
        return f.b;
    }

    @Override // qu.b0
    public void s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i10 = f.b;
        boolean z10 = index >= i10;
        if (z10) {
            index -= i10;
        }
        E eA = A(index);
        while (true) {
            Object objB = B(index);
            if ((objB instanceof k3) || (objB instanceof WaiterEB)) {
                if (v(index, objB, z10 ? f.f24548j : f.f24549k)) {
                    w(index);
                    C(index, !z10);
                    if (!z10 || (function1 = y().onUndeliveredElement) == null) {
                        return;
                    }
                    qu.x.a(function1, eA, context);
                    return;
                }
            } else {
                if (objB == f.f24548j || objB == f.f24549k) {
                    break;
                }
                if (objB != f.f24545g && objB != f.f24544f) {
                    if (objB == f.f24547i || objB == f.f24542d || objB == f.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(index);
        if (!z10 || (function2 = y().onUndeliveredElement) == null) {
            return;
        }
        qu.x.a(function2, eA, context);
    }

    public final boolean v(int index, @Nullable Object from, @Nullable Object to2) {
        return l.a(getF24565f(), (index * 2) + 1, from, to2);
    }

    public final void w(int index) {
        E(index, null);
    }

    @Nullable
    public final Object x(int index, @Nullable Object update) {
        return getF24565f().getAndSet((index * 2) + 1, update);
    }

    @NotNull
    public final e<E> y() {
        e<E> eVar = this._channel;
        Intrinsics.checkNotNull(eVar);
        return eVar;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF24565f() {
        return this.f24565f;
    }
}
