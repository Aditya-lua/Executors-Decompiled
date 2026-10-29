package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30599a = new Object();
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f30600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Exception f30604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30605h;

    public r(int i10, n0 n0Var) {
        this.b = i10;
        this.f30600c = n0Var;
    }

    private final void b() {
        if (this.f30601d + this.f30602e + this.f30603f == this.b) {
            if (this.f30604g == null) {
                if (this.f30605h) {
                    this.f30600c.r();
                    return;
                } else {
                    this.f30600c.q(null);
                    return;
                }
            }
            this.f30600c.p(new ExecutionException(this.f30602e + " out of " + this.b + " underlying tasks failed", this.f30604g));
        }
    }

    @Override // sb.e
    public final void a() {
        synchronized (this.f30599a) {
            this.f30603f++;
            this.f30605h = true;
            b();
        }
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f30599a) {
            this.f30602e++;
            this.f30604g = exc;
            b();
        }
    }

    @Override // sb.g
    public final void onSuccess(T t8) {
        synchronized (this.f30599a) {
            this.f30601d++;
            b();
        }
    }
}
