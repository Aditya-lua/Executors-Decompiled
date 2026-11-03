package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31146a = new Object();
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f31147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Exception f31151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31152h;

    public r(int i10, n0 n0Var) {
        this.b = i10;
        this.f31147c = n0Var;
    }

    private final void b() {
        if (this.f31148d + this.f31149e + this.f31150f == this.b) {
            if (this.f31151g == null) {
                if (this.f31152h) {
                    this.f31147c.r();
                    return;
                } else {
                    this.f31147c.q(null);
                    return;
                }
            }
            this.f31147c.p(new ExecutionException(this.f31149e + " out of " + this.b + " underlying tasks failed", this.f31151g));
        }
    }

    @Override // sb.e
    public final void a() {
        synchronized (this.f31146a) {
            this.f31150f++;
            this.f31152h = true;
            b();
        }
    }

    @Override // sb.f
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f31146a) {
            this.f31149e++;
            this.f31151g = exc;
            b();
        }
    }

    @Override // sb.g
    public final void onSuccess(T t8) {
        synchronized (this.f31146a) {
            this.f31148d++;
            b();
        }
    }
}
