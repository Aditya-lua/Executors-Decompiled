package jv;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class g extends e.a {

    @IgnoreJRERequirement
    public static final class a<R> implements e<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f21839a;

        /* JADX INFO: renamed from: jv.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0386a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f21840a;

            public C0386a(CompletableFuture<R> completableFuture) {
                this.f21840a = completableFuture;
            }

            @Override // jv.f
            public void a(d<R> dVar, x<R> xVar) {
                if (xVar.g()) {
                    this.f21840a.complete(xVar.a());
                } else {
                    this.f21840a.completeExceptionally(new m(xVar));
                }
            }

            @Override // jv.f
            public void b(d<R> dVar, Throwable th2) {
                this.f21840a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f21839a = type;
        }

        @Override // jv.e
        public Type a() {
            return this.f21839a;
        }

        @Override // jv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.B(new C0386a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<?> f21841a;

        public b(d<?> dVar) {
            this.f21841a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f21841a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements e<R, CompletableFuture<x<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f21842a;

        @IgnoreJRERequirement
        public class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<x<R>> f21843a;

            public a(CompletableFuture<x<R>> completableFuture) {
                this.f21843a = completableFuture;
            }

            @Override // jv.f
            public void a(d<R> dVar, x<R> xVar) {
                this.f21843a.complete(xVar);
            }

            @Override // jv.f
            public void b(d<R> dVar, Throwable th2) {
                this.f21843a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f21842a = type;
        }

        @Override // jv.e
        public Type a() {
            return this.f21842a;
        }

        @Override // jv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<x<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.B(new a(bVar));
            return bVar;
        }
    }

    @Override // jv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(typeB) != x.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
