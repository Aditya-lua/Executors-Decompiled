package p550xk;

import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Request;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7378f;

/* JADX INFO: renamed from: xk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C12855b<T> implements InterfaceC7376d<T> {

    /* JADX INFO: renamed from: a */
    public final Executor f45671a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7376d<T> f45672b;

    /* JADX INFO: renamed from: xk.b$a */
    public class a implements InterfaceC7378f<T> {

        /* JADX INFO: renamed from: a */
        public InterfaceC7378f<T> f45673a;

        /* JADX INFO: renamed from: b */
        public boolean f45674b;

        /* JADX INFO: renamed from: xk.b$a$a, reason: collision with other inner class name */
        public class RunnableC14285a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7396x f45676a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC14285a(C7396x c7396x) {
                this.f45676a = c7396x;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C12855b.this.f45672b.isCanceled()) {
                    a.this.f45673a.mo23949b(C12855b.this, new IOException("Canceled"));
                } else {
                    a.this.f45673a.mo23948a(C12855b.this, this.f45676a);
                }
            }
        }

        /* JADX INFO: renamed from: xk.b$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Throwable f45678a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public b(Throwable th2) {
                this.f45678a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f45673a.mo23949b(C12855b.this, this.f45678a);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(C12855b c12855b, InterfaceC7378f<T> interfaceC7378f) {
            this(interfaceC7378f, false);
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<T> interfaceC7376d, C7396x<T> c7396x) {
            if (c7396x.m30654b() != 403 || c7396x.m30656f().get("X-CSRF-TOKEN") == null || this.f45674b) {
                C12855b.this.f45671a.execute(new RunnableC14285a(c7396x));
            } else {
                C12855b.this.f45672b.clone().mo30571B(new a(this.f45673a, true));
            }
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<T> interfaceC7376d, Throwable th2) {
            C12855b.this.f45671a.execute(new b(th2));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(InterfaceC7378f<T> interfaceC7378f, boolean z10) {
            this.f45673a = interfaceC7378f;
            this.f45674b = z10;
        }
    }

    public C12855b(Executor executor, InterfaceC7376d<T> interfaceC7376d) {
        this.f45671a = executor;
        this.f45672b = interfaceC7376d;
    }

    @Override // p231jv.InterfaceC7376d
    /* JADX INFO: renamed from: B */
    public void mo30571B(InterfaceC7378f<T> interfaceC7378f) {
        if (interfaceC7378f == null) {
            throw new NullPointerException("callback == null");
        }
        this.f45672b.mo30571B(new a(this, interfaceC7378f));
    }

    @Override // p231jv.InterfaceC7376d
    public void cancel() {
        this.f45672b.cancel();
    }

    @Override // p231jv.InterfaceC7376d
    public C7396x<T> execute() {
        C7396x<T> c7396xExecute = this.f45672b.execute();
        return (c7396xExecute.m30654b() != 403 || c7396xExecute.m30656f().get("X-CSRF-TOKEN") == null) ? c7396xExecute : this.f45672b.clone().execute();
    }

    @Override // p231jv.InterfaceC7376d
    public boolean isCanceled() {
        return this.f45672b.isCanceled();
    }

    @Override // p231jv.InterfaceC7376d
    public Request request() {
        return this.f45672b.request();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // p231jv.InterfaceC7376d
    public InterfaceC7376d<T> clone() {
        return new C12855b(this.f45671a, this.f45672b.clone());
    }
}
