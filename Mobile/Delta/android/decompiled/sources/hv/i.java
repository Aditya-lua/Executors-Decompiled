package hv;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f19854a;

    public class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f19855a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.f19855a = type;
            this.b = executor;
        }

        @Override // hv.e
        public Type a() {
            return this.f19855a;
        }

        @Override // hv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    public static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f19857a;
        public final d<T> b;

        public class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f19858a;

            public a(f fVar) {
                this.f19858a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, x xVar) {
                if (b.this.b.isCanceled()) {
                    fVar.b(b.this, new IOException("Canceled"));
                } else {
                    fVar.a(b.this, xVar);
                }
            }

            @Override // hv.f
            public void a(d<T> dVar, final x<T> xVar) {
                Executor executor = b.this.f19857a;
                final f fVar = this.f19858a;
                executor.execute(new Runnable() { // from class: hv.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.d(this.f19859a, fVar, xVar);
                    }
                });
            }

            @Override // hv.f
            public void b(d<T> dVar, final Throwable th2) {
                Executor executor = b.this.f19857a;
                final f fVar = this.f19858a;
                executor.execute(new Runnable() { // from class: hv.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.b(i.b.this, th2);
                    }
                });
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.f19857a = executor;
            this.b = dVar;
        }

        @Override // hv.d
        public void cancel() {
            this.b.cancel();
        }

        @Override // hv.d
        public x<T> execute() {
            return this.b.execute();
        }

        @Override // hv.d
        public boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // hv.d
        public void m(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.b.m(new a(fVar));
        }

        @Override // hv.d
        public Request request() {
            return this.b.request();
        }

        @Override // hv.d
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public d<T> m72clone() {
            return new b(this.f19857a, this.b.m225clone());
        }
    }

    public i(Executor executor) {
        this.f19854a = executor;
    }

    @Override // hv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c0.g(0, (ParameterizedType) type), c0.l(annotationArr, a0.class) ? null : this.f19854a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
