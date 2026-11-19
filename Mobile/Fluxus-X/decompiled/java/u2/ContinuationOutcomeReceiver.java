package u2;

import android.os.OutcomeReceiver;
import com.github.luben.zstd.BuildConfig;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: renamed from: u2.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu2/g;", "R", BuildConfig.FLAVOR, "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Leu/b;", "continuation", "<init>", "(Leu/b;)V", "result", BuildConfig.FLAVOR, "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Leu/b;", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final eu.b<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(@NotNull eu.b<? super R> bVar) {
        super(false);
        this.continuation = bVar;
    }

    public void onError(@NotNull E error) {
        if (compareAndSet(false, true)) {
            eu.b<R> bVar = this.continuation;
            zt.n.Companion companion = zt.n.INSTANCE;
            bVar.resumeWith(zt.n.b(zt.o.a(error)));
        }
    }

    public void onResult(R result) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(zt.n.b(result));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
