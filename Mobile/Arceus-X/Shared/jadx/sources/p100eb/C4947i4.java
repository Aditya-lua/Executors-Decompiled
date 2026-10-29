package p100eb;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: eb.i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4947i4 {

    /* JADX INFO: renamed from: a */
    public final Deque f19670a = new ArrayDeque(16);

    public C4947i4(boolean z10) {
    }

    /* JADX INFO: renamed from: a */
    public static C4947i4 m23634a() {
        return new C4947i4(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m23635b() throws IOException {
        if (!this.f19670a.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.f19670a.size()), Long.valueOf(m23641h())));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23636c() throws IOException {
        long jM23641h = m23641h();
        if (jM23641h >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", Long.valueOf(jM23641h)));
        }
        if (jM23641h == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.f19670a.pop();
    }

    /* JADX INFO: renamed from: d */
    public final void m23637d() throws IOException {
        long jM23641h = m23641h();
        if (jM23641h != -1) {
            if (jM23641h != -2) {
                return;
            } else {
                jM23641h = -2;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", Long.valueOf(jM23641h)));
    }

    /* JADX INFO: renamed from: e */
    public final void m23638e(long j10) throws IOException {
        long jM23641h = m23641h();
        if (jM23641h != j10) {
            if (jM23641h != -1) {
                if (jM23641h != -2) {
                    return;
                } else {
                    jM23641h = -2;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", Long.valueOf(j10), Long.valueOf(jM23641h)));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m23639f() {
        long jM23641h = m23641h();
        if (jM23641h == 1) {
            this.f19670a.pop();
            return;
        }
        if (jM23641h > 1) {
            m23642i(jM23641h - 1);
        } else if (jM23641h == -4) {
            m23642i(-5L);
        } else if (jM23641h == -5) {
            m23642i(-4L);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23640g(long j10) {
        this.f19670a.push(Long.valueOf(j10));
    }

    /* JADX INFO: renamed from: h */
    public final long m23641h() {
        if (this.f19670a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.f19670a.peek()).longValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m23642i(long j10) {
        this.f19670a.pop();
        this.f19670a.push(Long.valueOf(j10));
    }
}
