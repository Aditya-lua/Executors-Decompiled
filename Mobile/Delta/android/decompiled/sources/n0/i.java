package n0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f24683a;
    public final Handler b;

    public i(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f24683a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    @Override // n0.h1
    public Executor b() {
        return this.f24683a;
    }

    @Override // n0.h1
    public Handler c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (this.f24683a.equals(h1Var.b()) && this.b.equals(h1Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24683a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f24683a + ", schedulerHandler=" + this.b + "}";
    }
}
