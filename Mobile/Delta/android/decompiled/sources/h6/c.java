package h6;

import android.os.Handler;
import android.os.Looper;
import g6.y;
import java.util.concurrent.Executor;
import ku.l0;
import ku.v1;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f18574a;
    public final l0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f18575c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f18576d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f18575c.post(runnable);
        }
    }

    public c(Executor executor) {
        y yVar = new y(executor);
        this.f18574a = yVar;
        this.b = v1.b(yVar);
    }

    @Override // h6.b
    public Executor a() {
        return this.f18576d;
    }

    @Override // h6.b
    public l0 b() {
        return this.b;
    }

    @Override // h6.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public y c() {
        return this.f18574a;
    }
}
