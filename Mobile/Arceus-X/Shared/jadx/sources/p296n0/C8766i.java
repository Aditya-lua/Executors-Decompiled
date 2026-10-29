package p296n0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8766i extends AbstractC8762h1 {

    /* JADX INFO: renamed from: a */
    public final Executor f31880a;

    /* JADX INFO: renamed from: b */
    public final Handler f31881b;

    public C8766i(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f31880a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f31881b = handler;
    }

    @Override // p296n0.AbstractC8762h1
    /* JADX INFO: renamed from: b */
    public Executor mo35141b() {
        return this.f31880a;
    }

    @Override // p296n0.AbstractC8762h1
    /* JADX INFO: renamed from: c */
    public Handler mo35142c() {
        return this.f31881b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8762h1) {
            AbstractC8762h1 abstractC8762h1 = (AbstractC8762h1) obj;
            if (this.f31880a.equals(abstractC8762h1.mo35141b()) && this.f31881b.equals(abstractC8762h1.mo35142c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31880a.hashCode() ^ 1000003) * 1000003) ^ this.f31881b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f31880a + ", schedulerHandler=" + this.f31881b + "}";
    }
}
