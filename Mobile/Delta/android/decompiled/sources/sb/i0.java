package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30585a = new Object();
    public Queue b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30586c;

    public final void a(@NonNull h0 h0Var) {
        synchronized (this.f30585a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(h0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NonNull Task task) {
        h0 h0Var;
        synchronized (this.f30585a) {
            if (this.b != null && !this.f30586c) {
                this.f30586c = true;
                while (true) {
                    synchronized (this.f30585a) {
                        try {
                            h0Var = (h0) this.b.poll();
                            if (h0Var == null) {
                                this.f30586c = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    h0Var.b(task);
                }
            }
        }
    }
}
