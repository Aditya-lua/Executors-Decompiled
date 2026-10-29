package eb;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque f15281a = new ArrayDeque(16);

    public i4(boolean z10) {
    }

    public static i4 a() {
        return new i4(false);
    }

    public final void b() throws IOException {
        if (!this.f15281a.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.f15281a.size()), Long.valueOf(h())));
        }
    }

    public final void c() throws IOException {
        long jH = h();
        if (jH >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", Long.valueOf(jH)));
        }
        if (jH == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.f15281a.pop();
    }

    public final void d() throws IOException {
        long jH = h();
        if (jH != -1) {
            if (jH != -2) {
                return;
            } else {
                jH = -2;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", Long.valueOf(jH)));
    }

    public final void e(long j10) throws IOException {
        long jH = h();
        if (jH != j10) {
            if (jH != -1) {
                if (jH != -2) {
                    return;
                } else {
                    jH = -2;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", Long.valueOf(j10), Long.valueOf(jH)));
        }
    }

    public final void f() {
        long jH = h();
        if (jH == 1) {
            this.f15281a.pop();
            return;
        }
        if (jH > 1) {
            i(jH - 1);
        } else if (jH == -4) {
            i(-5L);
        } else if (jH == -5) {
            i(-4L);
        }
    }

    public final void g(long j10) {
        this.f15281a.push(Long.valueOf(j10));
    }

    public final long h() {
        if (this.f15281a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.f15281a.peek()).longValue();
    }

    public final void i(long j10) {
        this.f15281a.pop();
        this.f15281a.push(Long.valueOf(j10));
    }
}
