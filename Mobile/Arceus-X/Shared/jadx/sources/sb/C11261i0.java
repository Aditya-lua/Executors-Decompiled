package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: sb.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11261i0 {

    /* JADX INFO: renamed from: a */
    public final Object f39575a = new Object();

    /* JADX INFO: renamed from: b */
    public Queue f39576b;

    /* JADX INFO: renamed from: c */
    public boolean f39577c;

    /* JADX INFO: renamed from: a */
    public final void m42323a(@NonNull InterfaceC11259h0 interfaceC11259h0) {
        synchronized (this.f39575a) {
            try {
                if (this.f39576b == null) {
                    this.f39576b = new ArrayDeque();
                }
                this.f39576b.add(interfaceC11259h0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42324b(@NonNull Task task) {
        InterfaceC11259h0 interfaceC11259h0;
        synchronized (this.f39575a) {
            if (this.f39576b != null && !this.f39577c) {
                this.f39577c = true;
                while (true) {
                    synchronized (this.f39575a) {
                        try {
                            interfaceC11259h0 = (InterfaceC11259h0) this.f39576b.poll();
                            if (interfaceC11259h0 == null) {
                                this.f39577c = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    interfaceC11259h0.mo42312b(task);
                }
            }
        }
    }
}
