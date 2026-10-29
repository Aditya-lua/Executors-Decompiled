package mu;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7886k3;
import p395qu.AbstractC10713b0;
import p395qu.C10752x;

/* JADX INFO: renamed from: mu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J!\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0001\u0010\u0010R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016038\u0002X\u0082\u0004¨\u00065"}, m31665d2 = {"Lmu/m;", "E", "Lqu/b0;", "", "id", "prev", "Lmu/e;", "channel", "", "pointers", "<init>", "(JLmu/m;Lmu/e;I)V", "index", "element", "", "G", "(ILjava/lang/Object;)V", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "", "B", "value", "F", "from", "to", "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", "C", "(IZ)V", "e", "Lmu/e;", "_channel", "y", "()Lmu/e;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8678m<E> extends AbstractC10713b0<C8678m<E>> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final C8670e<E> _channel;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f31717f;

    public C8678m(long j10, @Nullable C8678m<E> c8678m, @Nullable C8670e<E> c8670e, int i10) {
        super(j10, c8678m, i10);
        this._channel = c8670e;
        this.f31717f = new AtomicReferenceArray(C8671f.f31689b * 2);
    }

    /* JADX INFO: renamed from: A */
    public final E m34943A(int index) {
        return (E) getF31717f().get(index * 2);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m34944B(int index) {
        return getF31717f().get((index * 2) + 1);
    }

    /* JADX INFO: renamed from: C */
    public final void m34945C(int index, boolean receiver) {
        if (receiver) {
            m34955y().m34871w1((this.id * ((long) C8671f.f31689b)) + ((long) index));
        }
        m40817t();
    }

    /* JADX INFO: renamed from: D */
    public final E m34946D(int index) {
        E eM34943A = m34943A(index);
        m34953w(index);
        return eM34943A;
    }

    /* JADX INFO: renamed from: E */
    public final void m34947E(int index, Object value) {
        getF31717f().set(index * 2, value);
    }

    /* JADX INFO: renamed from: F */
    public final void m34948F(int index, @Nullable Object value) {
        getF31717f().set((index * 2) + 1, value);
    }

    /* JADX INFO: renamed from: G */
    public final void m34949G(int index, E element) {
        m34947E(index, element);
    }

    @Override // p395qu.AbstractC10713b0
    /* JADX INFO: renamed from: r */
    public int mo34950r() {
        return C8671f.f31689b;
    }

    @Override // p395qu.AbstractC10713b0
    /* JADX INFO: renamed from: s */
    public void mo34951s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i10 = C8671f.f31689b;
        boolean z10 = index >= i10;
        if (z10) {
            index -= i10;
        }
        E eM34943A = m34943A(index);
        while (true) {
            Object objM34944B = m34944B(index);
            if ((objM34944B instanceof InterfaceC7886k3) || (objM34944B instanceof WaiterEB)) {
                if (m34952v(index, objM34944B, z10 ? C8671f.f31697j : C8671f.f31698k)) {
                    m34953w(index);
                    m34945C(index, !z10);
                    if (!z10 || (function1 = m34955y().onUndeliveredElement) == null) {
                        return;
                    }
                    C10752x.m40955a(function1, eM34943A, context);
                    return;
                }
            } else {
                if (objM34944B == C8671f.f31697j || objM34944B == C8671f.f31698k) {
                    break;
                }
                if (objM34944B != C8671f.f31694g && objM34944B != C8671f.f31693f) {
                    if (objM34944B == C8671f.f31696i || objM34944B == C8671f.f31691d || objM34944B == C8671f.m34920z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM34944B).toString());
                }
            }
        }
        m34953w(index);
        if (!z10 || (function2 = m34955y().onUndeliveredElement) == null) {
            return;
        }
        C10752x.m40955a(function2, eM34943A, context);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m34952v(int index, @Nullable Object from, @Nullable Object to2) {
        return C8677l.m34942a(getF31717f(), (index * 2) + 1, from, to2);
    }

    /* JADX INFO: renamed from: w */
    public final void m34953w(int index) {
        m34947E(index, null);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m34954x(int index, @Nullable Object update) {
        return getF31717f().getAndSet((index * 2) + 1, update);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final C8670e<E> m34955y() {
        C8670e<E> c8670e = this._channel;
        Intrinsics.checkNotNull(c8670e);
        return c8670e;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF31717f() {
        return this.f31717f;
    }
}
