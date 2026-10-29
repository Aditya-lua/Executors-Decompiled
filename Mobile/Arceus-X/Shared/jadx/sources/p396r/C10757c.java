package p396r;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: r.c */
/* JADX INFO: loaded from: classes.dex */
public class C10757c extends AbstractC10759e {

    /* JADX INFO: renamed from: c */
    public static volatile C10757c f38329c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public static final Executor f38330d = new Executor() { // from class: r.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C10757c.m40964g().mo40967c(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    @NonNull
    public static final Executor f38331e = new Executor() { // from class: r.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C10757c.m40964g().mo40965a(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    @NonNull
    public AbstractC10759e f38332a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AbstractC10759e f38333b;

    public C10757c() {
        C10758d c10758d = new C10758d();
        this.f38333b = c10758d;
        this.f38332a = c10758d;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Executor m40963f() {
        return f38331e;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static C10757c m40964g() {
        if (f38329c != null) {
            return f38329c;
        }
        synchronized (C10757c.class) {
            try {
                if (f38329c == null) {
                    f38329c = new C10757c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f38329c;
    }

    @Override // p396r.AbstractC10759e
    /* JADX INFO: renamed from: a */
    public void mo40965a(@NonNull Runnable runnable) {
        this.f38332a.mo40965a(runnable);
    }

    @Override // p396r.AbstractC10759e
    /* JADX INFO: renamed from: b */
    public boolean mo40966b() {
        return this.f38332a.mo40966b();
    }

    @Override // p396r.AbstractC10759e
    /* JADX INFO: renamed from: c */
    public void mo40967c(@NonNull Runnable runnable) {
        this.f38332a.mo40967c(runnable);
    }
}
