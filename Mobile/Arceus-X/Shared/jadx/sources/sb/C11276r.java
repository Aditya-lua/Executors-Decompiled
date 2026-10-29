package sb;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: sb.r */
/* JADX INFO: loaded from: classes.dex */
public final class C11276r<T> implements InterfaceC11275q<T> {

    /* JADX INFO: renamed from: a */
    public final Object f39594a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f39595b;

    /* JADX INFO: renamed from: c */
    public final C11271n0 f39596c;

    /* JADX INFO: renamed from: d */
    public int f39597d;

    /* JADX INFO: renamed from: e */
    public int f39598e;

    /* JADX INFO: renamed from: f */
    public int f39599f;

    /* JADX INFO: renamed from: g */
    public Exception f39600g;

    /* JADX INFO: renamed from: h */
    public boolean f39601h;

    public C11276r(int i10, C11271n0 c11271n0) {
        this.f39595b = i10;
        this.f39596c = c11271n0;
    }

    /* JADX INFO: renamed from: b */
    private final void m42354b() {
        if (this.f39597d + this.f39598e + this.f39599f == this.f39595b) {
            if (this.f39600g == null) {
                if (this.f39601h) {
                    this.f39596c.m42345r();
                    return;
                } else {
                    this.f39596c.m42344q(null);
                    return;
                }
            }
            this.f39596c.m42343p(new ExecutionException(this.f39598e + " out of " + this.f39595b + " underlying tasks failed", this.f39600g));
        }
    }

    @Override // sb.InterfaceC11252e
    /* JADX INFO: renamed from: a */
    public final void mo42318a() {
        synchronized (this.f39594a) {
            this.f39599f++;
            this.f39601h = true;
            m42354b();
        }
    }

    @Override // sb.InterfaceC11254f
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f39594a) {
            this.f39598e++;
            this.f39600g = exc;
            m42354b();
        }
    }

    @Override // sb.InterfaceC11256g
    public final void onSuccess(T t8) {
        synchronized (this.f39594a) {
            this.f39597d++;
            m42354b();
        }
    }
}
