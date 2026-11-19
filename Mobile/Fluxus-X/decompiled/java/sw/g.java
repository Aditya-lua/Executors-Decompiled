package sw;

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
        public final Type f31946a;

        /* JADX INFO: renamed from: sw.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0640a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f31947a;

            public C0640a(CompletableFuture<R> completableFuture) {
                this.f31947a = completableFuture;
            }

            @Override // sw.f
            public void a(d<R> dVar, Throwable th2) {
                this.f31947a.completeExceptionally(th2);
            }

            @Override // sw.f
            public void b(d<R> dVar, x<R> xVar) {
                if (xVar.g()) {
                    this.f31947a.complete(xVar.a());
                } else {
                    this.f31947a.completeExceptionally(new m(xVar));
                }
            }
        }

        public a(Type type) {
            this.f31946a = type;
        }

        @Override // sw.e
        public Type a() {
            return this.f31946a;
        }

        @Override // sw.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.L(new C0640a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<?> f31948a;

        public b(d<?> dVar) {
            this.f31948a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f31948a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements e<R, CompletableFuture<x<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f31949a;

        @IgnoreJRERequirement
        public class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<x<R>> f31950a;

            public a(CompletableFuture<x<R>> completableFuture) {
                this.f31950a = completableFuture;
            }

            @Override // sw.f
            public void a(d<R> dVar, Throwable th2) {
                this.f31950a.completeExceptionally(th2);
            }

            @Override // sw.f
            public void b(d<R> dVar, x<R> xVar) {
                this.f31950a.complete(xVar);
            }
        }

        public c(Type type) {
            this.f31949a = type;
        }

        @Override // sw.e
        public Type a() {
            return this.f31949a;
        }

        @Override // sw.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<x<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.L(new a(bVar));
            return bVar;
        }
    }

    @Override // sw.e.a
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
