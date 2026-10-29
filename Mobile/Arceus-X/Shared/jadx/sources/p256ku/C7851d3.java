package p256ku;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;

/* JADX INFO: renamed from: ku.d3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, m31665d2 = {"Lku/d3;", "Lku/i2;", "<init>", "()V", "Lku/d2;", "job", "", "C", "(Lku/d2;)V", "z", "", "cause", "x", "(Ljava/lang/Throwable;)V", "", "state", "", "B", "(I)Ljava/lang/Void;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "e", "Ljava/lang/Thread;", "targetThread", "Lku/i1;", "f", "Lku/i1;", "cancelHandle", "", "w", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7851d3 extends AbstractC7875i2 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29702g = AtomicIntegerFieldUpdater.newUpdater(C7851d3.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Thread targetThread = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7874i1 cancelHandle;

    /* JADX INFO: renamed from: B */
    public final Void m32609B(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    /* JADX INFO: renamed from: C */
    public final void m32610C(@NotNull InterfaceC7850d2 job) {
        int i10;
        this.cancelHandle = C7870h2.m32674j(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29702g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                m32609B(i10);
                throw new C7334d();
            }
        } while (!f29702g.compareAndSet(this, i10, 0));
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: w */
    public boolean mo32574w() {
        return true;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: x */
    public void mo32575x(@Nullable Throwable cause) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29702g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                m32609B(i10);
                throw new C7334d();
            }
        } while (!f29702g.compareAndSet(this, i10, 2));
        this.targetThread.interrupt();
        f29702g.set(this, 3);
    }

    /* JADX INFO: renamed from: z */
    public final void m32611z() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29702g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m32609B(i10);
                        throw new C7334d();
                    }
                }
            } else if (f29702g.compareAndSet(this, i10, 1)) {
                InterfaceC7874i1 interfaceC7874i1 = this.cancelHandle;
                if (interfaceC7874i1 != null) {
                    interfaceC7874i1.mo32664a();
                    return;
                }
                return;
            }
        }
    }
}
