package p282m1;

import android.view.Surface;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p156h1.InterfaceC6262c;

/* JADX INFO: renamed from: m1.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8369l {

    /* JADX INFO: renamed from: m1.l$a */
    public interface a extends b, InterfaceC6262c<InterfaceC8359h1> {
    }

    /* JADX INFO: renamed from: m1.l$b */
    public interface b {
    }

    /* JADX INFO: renamed from: m1.l$c */
    public interface c extends b {

        /* JADX INFO: renamed from: m1.l$c$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo24320a(Surface surface);
        }

        /* JADX INFO: renamed from: a */
        void mo34042a(Executor executor, a aVar);
    }

    /* JADX INFO: renamed from: a */
    void mo33987a();

    /* JADX INFO: renamed from: b */
    b mo33989b();

    /* JADX INFO: renamed from: c */
    void mo33991c(InterfaceC8372m interfaceC8372m, Executor executor);

    /* JADX INFO: renamed from: d */
    void mo33993d(long j10);

    /* JADX INFO: renamed from: e */
    InterfaceC8353f1 mo33995e();

    /* JADX INFO: renamed from: f */
    InterfaceFutureC9440x<Void> mo33997f();

    /* JADX INFO: renamed from: g */
    void mo33998g();

    /* JADX INFO: renamed from: h */
    int mo34000h();

    void pause();

    void start();
}
