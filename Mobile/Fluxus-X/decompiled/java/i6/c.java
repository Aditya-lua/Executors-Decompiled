package i6;

import android.os.Handler;
import android.os.Looper;
import av.l0;
import av.v1;
import h6.y;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f19131a;
    public final l0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f19132c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f19133d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f19132c.post(runnable);
        }
    }

    public c(Executor executor) {
        y yVar = new y(executor);
        this.f19131a = yVar;
        this.b = v1.b(yVar);
    }

    @Override // i6.b
    public Executor a() {
        return this.f19133d;
    }

    @Override // i6.b
    public l0 b() {
        return this.b;
    }

    @Override // i6.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public y c() {
        return this.f19131a;
    }
}
