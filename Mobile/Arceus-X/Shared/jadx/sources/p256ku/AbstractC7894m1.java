package p256ku;

import kotlin.Metadata;
import kotlin.collections.C7685i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10734m;

/* JADX INFO: renamed from: ku.m1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\"\u0010%\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\t¨\u0006,"}, m31665d2 = {"Lku/m1;", "Lku/l0;", "<init>", "()V", "", "r0", "()J", "", "t0", "()Z", "x0", "Lku/d1;", "task", "", "a0", "(Lku/d1;)V", "unconfined", "e0", "(Z)V", "X", "", "parallelism", "", "name", "P", "(ILjava/lang/String;)Lku/l0;", "shutdown", "Z", "(Z)J", "c", "J", "useCount", "d", "shared", "Lkotlin/collections/i;", "e", "Lkotlin/collections/i;", "unconfinedQueue", "b0", "nextTime", "i0", "isUnconfinedLoopActive", "l0", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7894m1 extends AbstractC7888l0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long useCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C7685i<AbstractC7849d1<?>> unconfinedQueue;

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m32796Y(AbstractC7894m1 abstractC7894m1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC7894m1.m32798X(z10);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m32797f0(AbstractC7894m1 abstractC7894m1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC7894m1.m32802e0(z10);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public final AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        C10734m.m40890a(parallelism);
        return C10734m.m40891b(this, name);
    }

    /* JADX INFO: renamed from: X */
    public final void m32798X(boolean unconfined) {
        long jM32799Z = this.useCount - m32799Z(unconfined);
        this.useCount = jM32799Z;
        if (jM32799Z <= 0 && this.shared) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final long m32799Z(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m32800a0(@NotNull AbstractC7849d1<?> task) {
        C7685i<AbstractC7849d1<?>> c7685i = this.unconfinedQueue;
        if (c7685i == null) {
            c7685i = new C7685i<>();
            this.unconfinedQueue = c7685i;
        }
        c7685i.addLast(task);
    }

    /* JADX INFO: renamed from: b0 */
    public long mo32801b0() {
        C7685i<AbstractC7849d1<?>> c7685i = this.unconfinedQueue;
        return (c7685i == null || c7685i.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m32802e0(boolean unconfined) {
        this.useCount += m32799Z(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m32803i0() {
        return this.useCount >= m32799Z(true);
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m32804l0() {
        C7685i<AbstractC7849d1<?>> c7685i = this.unconfinedQueue;
        if (c7685i != null) {
            return c7685i.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public long mo32805r0() {
        return !m32806t0() ? Long.MAX_VALUE : 0L;
    }

    public void shutdown() {
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m32806t0() {
        AbstractC7849d1<?> abstractC7849d1M31779p;
        C7685i<AbstractC7849d1<?>> c7685i = this.unconfinedQueue;
        if (c7685i == null || (abstractC7849d1M31779p = c7685i.m31779p()) == null) {
            return false;
        }
        abstractC7849d1M31779p.run();
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m32807x0() {
        return false;
    }
}
