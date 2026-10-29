package p231jv;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: renamed from: jv.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7381i extends InterfaceC7377e.a {

    /* JADX INFO: renamed from: a */
    public final Executor f28301a;

    /* JADX INFO: renamed from: jv.i$a */
    public class a implements InterfaceC7377e<Object, InterfaceC7376d<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f28302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f28303b;

        public a(Type type, Executor executor) {
            this.f28302a = type;
            this.f28303b = executor;
        }

        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: a */
        public Type mo30572a() {
            return this.f28302a;
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljv/d;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7376d<Object> mo30573b(InterfaceC7376d<Object> interfaceC7376d) {
            Executor executor = this.f28303b;
            return executor == null ? interfaceC7376d : new b(executor, interfaceC7376d);
        }
    }

    /* JADX INFO: renamed from: jv.i$b */
    public static final class b<T> implements InterfaceC7376d<T> {

        /* JADX INFO: renamed from: a */
        public final Executor f28305a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7376d<T> f28306b;

        /* JADX INFO: renamed from: jv.i$b$a */
        public class a implements InterfaceC7378f<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7378f f28307a;

            public a(InterfaceC7378f interfaceC7378f) {
                this.f28307a = interfaceC7378f;
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ void m30584d(a aVar, InterfaceC7378f interfaceC7378f, C7396x c7396x) {
                if (b.this.f28306b.isCanceled()) {
                    interfaceC7378f.mo23949b(b.this, new IOException("Canceled"));
                } else {
                    interfaceC7378f.mo23948a(b.this, c7396x);
                }
            }

            @Override // p231jv.InterfaceC7378f
            /* JADX INFO: renamed from: a */
            public void mo23948a(InterfaceC7376d<T> interfaceC7376d, final C7396x<T> c7396x) {
                Executor executor = b.this.f28305a;
                final InterfaceC7378f interfaceC7378f = this.f28307a;
                executor.execute(new Runnable() { // from class: jv.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7381i.b.a.m30584d(this.f28309a, interfaceC7378f, c7396x);
                    }
                });
            }

            @Override // p231jv.InterfaceC7378f
            /* JADX INFO: renamed from: b */
            public void mo23949b(InterfaceC7376d<T> interfaceC7376d, final Throwable th2) {
                Executor executor = b.this.f28305a;
                final InterfaceC7378f interfaceC7378f = this.f28307a;
                executor.execute(new Runnable() { // from class: jv.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC7378f.mo23949b(C7381i.b.this, th2);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC7376d<T> interfaceC7376d) {
            this.f28305a = executor;
            this.f28306b = interfaceC7376d;
        }

        @Override // p231jv.InterfaceC7376d
        /* JADX INFO: renamed from: B */
        public void mo30571B(InterfaceC7378f<T> interfaceC7378f) {
            Objects.requireNonNull(interfaceC7378f, "callback == null");
            this.f28306b.mo30571B(new a(interfaceC7378f));
        }

        @Override // p231jv.InterfaceC7376d
        public void cancel() {
            this.f28306b.cancel();
        }

        @Override // p231jv.InterfaceC7376d
        public C7396x<T> execute() {
            return this.f28306b.execute();
        }

        @Override // p231jv.InterfaceC7376d
        public boolean isCanceled() {
            return this.f28306b.isCanceled();
        }

        @Override // p231jv.InterfaceC7376d
        public Request request() {
            return this.f28306b.request();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7376d
        public InterfaceC7376d<T> clone() {
            return new b(this.f28305a, this.f28306b.clone());
        }
    }

    public C7381i(Executor executor) {
        this.f28301a = executor;
    }

    @Override // p231jv.InterfaceC7377e.a
    /* JADX INFO: renamed from: a */
    public InterfaceC7377e<?, ?> mo30576a(Type type, Annotation[] annotationArr, C7397y c7397y) {
        if (InterfaceC7377e.a.m30575c(type) != InterfaceC7376d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(C7375c0.m30556g(0, (ParameterizedType) type), C7375c0.m30561l(annotationArr, InterfaceC7371a0.class) ? null : this.f28301a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
