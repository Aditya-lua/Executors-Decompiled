package p395qu;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7916r2;
import p395qu.AbstractC10713b0;

/* JADX INFO: renamed from: qu.b0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, m31665d2 = {"Lqu/b0;", "S", "Lqu/c;", "Lku/r2;", "", "id", "prev", "", "pointers", "<init>", "(JLqu/b0;I)V", "", "u", "()Z", "p", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "t", "()V", "c", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC10713b0<S extends AbstractC10713b0<S>> extends AbstractC10714c<S> implements InterfaceC7916r2 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38267d = AtomicIntegerFieldUpdater.newUpdater(AbstractC10713b0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long id;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC10713b0(long j10, @Nullable S s8, int i10) {
        super(s8);
        this.id = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p395qu.AbstractC10714c
    /* JADX INFO: renamed from: k */
    public boolean mo40815k() {
        return f38267d.get(this) == mo34950r() && !m40828l();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m40816p() {
        return f38267d.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo34950r() && !m40828l();
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo34950r();

    /* JADX INFO: renamed from: s */
    public abstract void mo34951s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context);

    /* JADX INFO: renamed from: t */
    public final void m40817t() {
        if (f38267d.incrementAndGet(this) == mo34950r()) {
            m40830n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m40818u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38267d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == mo34950r() && !m40828l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
