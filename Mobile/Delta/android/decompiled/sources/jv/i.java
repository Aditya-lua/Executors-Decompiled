package jv;

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
    public final Executor f21844a;

    public class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f21845a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.f21845a = type;
            this.b = executor;
        }

        @Override // jv.e
        public Type a() {
            return this.f21845a;
        }

        @Override // jv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    public static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f21847a;
        public final d<T> b;

        public class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f21848a;

            public a(f fVar) {
                this.f21848a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, x xVar) {
                if (b.this.b.isCanceled()) {
                    fVar.b(b.this, new IOException("Canceled"));
                } else {
                    fVar.a(b.this, xVar);
                }
            }

            @Override // jv.f
            public void a(d<T> dVar, final x<T> xVar) {
                Executor executor = b.this.f21847a;
                final f fVar = this.f21848a;
                executor.execute(new Runnable() { // from class: jv.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.d(this.f21849a, fVar, xVar);
                    }
                });
            }

            @Override // jv.f
            public void b(d<T> dVar, final Throwable th2) {
                Executor executor = b.this.f21847a;
                final f fVar = this.f21848a;
                executor.execute(new Runnable() { // from class: jv.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.b(i.b.this, th2);
                    }
                });
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.f21847a = executor;
            this.b = dVar;
        }

        @Override // jv.d
        public void B(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.b.B(new a(fVar));
        }

        @Override // jv.d
        public void cancel() {
            this.b.cancel();
        }

        @Override // jv.d
        public x<T> execute() {
            return this.b.execute();
        }

        @Override // jv.d
        public boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // jv.d
        public Request request() {
            return this.b.request();
        }

        @Override // jv.d
        public d<T> clone() {
            return new b(this.f21847a, this.b.clone());
        }
    }

    public i(Executor executor) {
        this.f21844a = executor;
    }

    @Override // jv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c0.g(0, (ParameterizedType) type), c0.l(annotationArr, a0.class) ? null : this.f21844a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
