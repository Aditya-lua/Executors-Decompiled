package hv;

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
        public final Type f19849a;

        /* JADX INFO: renamed from: hv.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0352a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f19850a;

            public C0352a(CompletableFuture<R> completableFuture) {
                this.f19850a = completableFuture;
            }

            @Override // hv.f
            public void a(d<R> dVar, x<R> xVar) {
                if (xVar.g()) {
                    this.f19850a.complete(xVar.a());
                } else {
                    this.f19850a.completeExceptionally(new m(xVar));
                }
            }

            @Override // hv.f
            public void b(d<R> dVar, Throwable th2) {
                this.f19850a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f19849a = type;
        }

        @Override // hv.e
        public Type a() {
            return this.f19849a;
        }

        @Override // hv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.m(new C0352a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<?> f19851a;

        public b(d<?> dVar) {
            this.f19851a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f19851a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements e<R, CompletableFuture<x<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f19852a;

        @IgnoreJRERequirement
        public class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<x<R>> f19853a;

            public a(CompletableFuture<x<R>> completableFuture) {
                this.f19853a = completableFuture;
            }

            @Override // hv.f
            public void a(d<R> dVar, x<R> xVar) {
                this.f19853a.complete(xVar);
            }

            @Override // hv.f
            public void b(d<R> dVar, Throwable th2) {
                this.f19853a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f19852a = type;
        }

        @Override // hv.e
        public Type a() {
            return this.f19852a;
        }

        @Override // hv.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<x<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.m(new a(bVar));
            return bVar;
        }
    }

    @Override // hv.e.a
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
