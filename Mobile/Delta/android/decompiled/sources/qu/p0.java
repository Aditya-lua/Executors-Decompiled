package qu;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR$\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, d2 = {"Lqu/p0;", "Lqu/q0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "f", "()Lqu/q0;", "j", "node", "", "h", "(Lqu/q0;)Z", "b", "", "index", "i", "(I)Lqu/q0;", "", "a", "(Lqu/q0;)V", "m", "(I)V", "l", "", "g", "()[Lqu/q0;", "n", "(II)V", "[Lqu/q0;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p0<T extends q0 & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    @Nullable
    public T[] a;

    public final void a(@NotNull T node) {
        node.b(this);
        q0[] q0VarArrG = g();
        int iC = c();
        k(iC + 1);
        q0VarArrG[iC] = node;
        node.setIndex(iC);
        m(iC);
    }

    @Nullable
    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    @Nullable
    public final T f() {
        T t8;
        synchronized (this) {
            t8 = (T) b();
        }
        return t8;
    }

    public final T[] g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new q0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((q0[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    public final boolean h(@NotNull T node) {
        boolean z10;
        synchronized (this) {
            if (node.d() == null) {
                z10 = false;
            } else {
                i(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @NotNull
    public final T i(int index) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        k(c() - 1);
        if (index < c()) {
            n(index, c());
            int i10 = (index - 1) / 2;
            if (index > 0) {
                T t8 = tArr[index];
                Intrinsics.checkNotNull(t8);
                T t10 = tArr[i10];
                Intrinsics.checkNotNull(t10);
                if (((Comparable) t8).compareTo(t10) < 0) {
                    n(index, i10);
                    m(i10);
                } else {
                    l(index);
                }
            } else {
                l(index);
            }
        }
        T t11 = tArr[c()];
        Intrinsics.checkNotNull(t11);
        t11.b(null);
        t11.setIndex(-1);
        tArr[c()] = null;
        return t11;
    }

    @Nullable
    public final T j() {
        T t8;
        synchronized (this) {
            t8 = c() > 0 ? (T) i(0) : null;
        }
        return t8;
    }

    public final void k(int i10) {
        b.set(this, i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final void l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= c()) {
                return;
            }
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i13 = i11 + 2;
            if (i13 < c()) {
                T t8 = tArr[i13];
                Intrinsics.checkNotNull(t8);
                T t10 = tArr[i12];
                Intrinsics.checkNotNull(t10);
                if (((Comparable) t8).compareTo(t10) >= 0) {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            T t11 = tArr[i10];
            Intrinsics.checkNotNull(t11);
            T t12 = tArr[i13];
            Intrinsics.checkNotNull(t12);
            if (((Comparable) t11).compareTo(t12) <= 0) {
                return;
            }
            n(i10, i13);
            i10 = i13;
        }
    }

    public final void m(int i10) {
        while (i10 > 0) {
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t8 = tArr[i11];
            Intrinsics.checkNotNull(t8);
            T t10 = tArr[i10];
            Intrinsics.checkNotNull(t10);
            if (((Comparable) t8).compareTo(t10) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    public final void n(int i10, int j10) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        T t8 = tArr[j10];
        Intrinsics.checkNotNull(t8);
        T t10 = tArr[i10];
        Intrinsics.checkNotNull(t10);
        tArr[i10] = t8;
        tArr[j10] = t10;
        t8.setIndex(i10);
        t10.setIndex(j10);
    }
}
