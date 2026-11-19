package tb;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32307a = new Object();
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f32308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Exception f32312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32313h;

    public r(int i10, n0 n0Var) {
        this.b = i10;
        this.f32308c = n0Var;
    }

    private final void b() {
        if (this.f32309d + this.f32310e + this.f32311f == this.b) {
            if (this.f32312g == null) {
                if (this.f32313h) {
                    this.f32308c.r();
                    return;
                } else {
                    this.f32308c.q(null);
                    return;
                }
            }
            this.f32308c.p(new ExecutionException(this.f32310e + " out of " + this.b + " underlying tasks failed", this.f32312g));
        }
    }

    @Override // tb.e
    public final void a() {
        synchronized (this.f32307a) {
            this.f32311f++;
            this.f32313h = true;
            b();
        }
    }

    @Override // tb.f
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f32307a) {
            this.f32310e++;
            this.f32312g = exc;
            b();
        }
    }

    @Override // tb.g
    public final void onSuccess(T t8) {
        synchronized (this.f32307a) {
            this.f32309d++;
            b();
        }
    }
}
