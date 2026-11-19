package sw;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import mv.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f31951a;

    public class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f31952a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.f31952a = type;
            this.b = executor;
        }

        @Override // sw.e
        public Type a() {
            return this.f31952a;
        }

        @Override // sw.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    public static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f31954a;
        public final d<T> b;

        public class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f31955a;

            public a(f fVar) {
                this.f31955a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, x xVar) {
                if (b.this.b.m()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, xVar);
                }
            }

            @Override // sw.f
            public void a(d<T> dVar, final Throwable th2) {
                Executor executor = b.this.f31954a;
                final f fVar = this.f31955a;
                executor.execute(new Runnable() { // from class: sw.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(i.b.this, th2);
                    }
                });
            }

            @Override // sw.f
            public void b(d<T> dVar, final x<T> xVar) {
                Executor executor = b.this.f31954a;
                final f fVar = this.f31955a;
                executor.execute(new Runnable() { // from class: sw.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.d(this.f31956a, fVar, xVar);
                    }
                });
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.f31954a = executor;
            this.b = dVar;
        }

        @Override // sw.d
        public void L(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.b.L(new a(fVar));
        }

        @Override // sw.d
        public void cancel() {
            this.b.cancel();
        }

        @Override // sw.d
        public f0 h() {
            return this.b.h();
        }

        @Override // sw.d
        public x<T> j() {
            return this.b.j();
        }

        @Override // sw.d
        public boolean m() {
            return this.b.m();
        }

        @Override // sw.d
        public d<T> clone() {
            return new b(this.f31954a, this.b.clone());
        }
    }

    public i(Executor executor) {
        this.f31951a = executor;
    }

    @Override // sw.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c0.g(0, (ParameterizedType) type), c0.l(annotationArr, a0.class) ? null : this.f31951a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
