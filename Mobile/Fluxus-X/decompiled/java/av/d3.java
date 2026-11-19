package av;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lav/d3;", "Lav/i2;", "<init>", "()V", "Lav/d2;", "job", BuildConfig.FLAVOR, "C", "(Lav/d2;)V", "z", BuildConfig.FLAVOR, "cause", "x", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "state", BuildConfig.FLAVOR, "B", "(I)Ljava/lang/Void;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "e", "Ljava/lang/Thread;", "targetThread", "Lav/i1;", "f", "Lav/i1;", "cancelHandle", BuildConfig.FLAVOR, "w", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d3 extends i2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3391g = AtomicIntegerFieldUpdater.newUpdater(d3.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Thread targetThread = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public i1 cancelHandle;

    public final Void B(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    public final void C(@NotNull d2 job) {
        int i10;
        this.cancelHandle = h2.l(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3391g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                B(i10);
                throw new zt.d();
            }
        } while (!f3391g.compareAndSet(this, i10, 0));
    }

    @Override // av.i2
    public boolean w() {
        return true;
    }

    @Override // av.i2
    public void x(@Nullable Throwable cause) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3391g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                B(i10);
                throw new zt.d();
            }
        } while (!f3391g.compareAndSet(this, i10, 2));
        this.targetThread.interrupt();
        f3391g.set(this, 3);
    }

    public final void z() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3391g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        B(i10);
                        throw new zt.d();
                    }
                }
            } else if (f3391g.compareAndSet(this, i10, 1)) {
                i1 i1Var = this.cancelHandle;
                if (i1Var != null) {
                    i1Var.a();
                    return;
                }
                return;
            }
        }
    }
}
