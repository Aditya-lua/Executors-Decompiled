package p395qu;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.InterfaceC10743q0;

/* JADX INFO: renamed from: qu.p0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR$\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, m31665d2 = {"Lqu/p0;", "Lqu/q0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "f", "()Lqu/q0;", "j", "node", "", "h", "(Lqu/q0;)Z", "b", "", "index", "i", "(I)Lqu/q0;", "", "a", "(Lqu/q0;)V", "m", "(I)V", "l", "", "g", "()[Lqu/q0;", "n", "(II)V", "[Lqu/q0;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C10741p0<T extends InterfaceC10743q0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38307b = AtomicIntegerFieldUpdater.newUpdater(C10741p0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    @Nullable
    public T[] a;

    /* JADX INFO: renamed from: a */
    public final void m40911a(@NotNull T node) {
        node.mo32842b(this);
        InterfaceC10743q0[] interfaceC10743q0ArrM40916g = m40916g();
        int iM40913c = m40913c();
        m40920k(iM40913c + 1);
        interfaceC10743q0ArrM40916g[iM40913c] = node;
        node.setIndex(iM40913c);
        m40922m(iM40913c);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m40912b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m40913c() {
        return f38307b.get(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m40914e() {
        return m40913c() == 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final T m40915f() {
        T t8;
        synchronized (this) {
            t8 = (T) m40912b();
        }
        return t8;
    }

    /* JADX INFO: renamed from: g */
    public final T[] m40916g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC10743q0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (m40913c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, m40913c() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((InterfaceC10743q0[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m40917h(@NotNull T node) {
        boolean z10;
        synchronized (this) {
            if (node.mo32843d() == null) {
                z10 = false;
            } else {
                m40918i(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @NotNull
    /* JADX INFO: renamed from: i */
    public final T m40918i(int index) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        m40920k(m40913c() - 1);
        if (index < m40913c()) {
            m40923n(index, m40913c());
            int i10 = (index - 1) / 2;
            if (index > 0) {
                T t8 = tArr[index];
                Intrinsics.checkNotNull(t8);
                T t10 = tArr[i10];
                Intrinsics.checkNotNull(t10);
                if (((Comparable) t8).compareTo(t10) < 0) {
                    m40923n(index, i10);
                    m40922m(i10);
                } else {
                    m40921l(index);
                }
            } else {
                m40921l(index);
            }
        }
        T t11 = tArr[m40913c()];
        Intrinsics.checkNotNull(t11);
        t11.mo32842b(null);
        t11.setIndex(-1);
        tArr[m40913c()] = null;
        return t11;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final T m40919j() {
        T t8;
        synchronized (this) {
            t8 = m40913c() > 0 ? (T) m40918i(0) : null;
        }
        return t8;
    }

    /* JADX INFO: renamed from: k */
    public final void m40920k(int i10) {
        f38307b.set(this, i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: l */
    public final void m40921l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= m40913c()) {
                return;
            }
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i13 = i11 + 2;
            if (i13 < m40913c()) {
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
            m40923n(i10, i13);
            i10 = i13;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m40922m(int i10) {
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
            m40923n(i10, i11);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m40923n(int i10, int j10) {
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
