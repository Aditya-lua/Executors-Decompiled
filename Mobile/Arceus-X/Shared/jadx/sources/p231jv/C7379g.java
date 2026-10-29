package p231jv;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: jv.g */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class C7379g extends InterfaceC7377e.a {

    /* JADX INFO: renamed from: jv.g$a */
    @IgnoreJRERequirement
    public static final class a<R> implements InterfaceC7377e<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a */
        public final Type f28294a;

        /* JADX INFO: renamed from: jv.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C14194a implements InterfaceC7378f<R> {

            /* JADX INFO: renamed from: a */
            public final CompletableFuture<R> f28295a;

            public C14194a(CompletableFuture<R> completableFuture) {
                this.f28295a = completableFuture;
            }

            @Override // p231jv.InterfaceC7378f
            /* JADX INFO: renamed from: a */
            public void mo23948a(InterfaceC7376d<R> interfaceC7376d, C7396x<R> c7396x) {
                if (c7396x.m30657g()) {
                    this.f28295a.complete(c7396x.m30653a());
                } else {
                    this.f28295a.completeExceptionally(new C7385m(c7396x));
                }
            }

            @Override // p231jv.InterfaceC7378f
            /* JADX INFO: renamed from: b */
            public void mo23949b(InterfaceC7376d<R> interfaceC7376d, Throwable th2) {
                this.f28295a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f28294a = type;
        }

        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: a */
        public Type mo30572a() {
            return this.f28294a;
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljv/d;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> mo30573b(InterfaceC7376d<R> interfaceC7376d) {
            b bVar = new b(interfaceC7376d);
            interfaceC7376d.mo30571B(new C14194a(bVar));
            return bVar;
        }
    }

    /* JADX INFO: renamed from: jv.g$b */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7376d<?> f28297a;

        public b(InterfaceC7376d<?> interfaceC7376d) {
            this.f28297a = interfaceC7376d;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f28297a.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* JADX INFO: renamed from: jv.g$c */
    @IgnoreJRERequirement
    public static final class c<R> implements InterfaceC7377e<R, CompletableFuture<C7396x<R>>> {

        /* JADX INFO: renamed from: a */
        public final Type f28298a;

        /* JADX INFO: renamed from: jv.g$c$a */
        @IgnoreJRERequirement
        public class a implements InterfaceC7378f<R> {

            /* JADX INFO: renamed from: a */
            public final CompletableFuture<C7396x<R>> f28299a;

            public a(CompletableFuture<C7396x<R>> completableFuture) {
                this.f28299a = completableFuture;
            }

            @Override // p231jv.InterfaceC7378f
            /* JADX INFO: renamed from: a */
            public void mo23948a(InterfaceC7376d<R> interfaceC7376d, C7396x<R> c7396x) {
                this.f28299a.complete(c7396x);
            }

            @Override // p231jv.InterfaceC7378f
            /* JADX INFO: renamed from: b */
            public void mo23949b(InterfaceC7376d<R> interfaceC7376d, Throwable th2) {
                this.f28299a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f28298a = type;
        }

        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: a */
        public Type mo30572a() {
            return this.f28298a;
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljv/d;)Ljava/lang/Object; */
        @Override // p231jv.InterfaceC7377e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<C7396x<R>> mo30573b(InterfaceC7376d<R> interfaceC7376d) {
            b bVar = new b(interfaceC7376d);
            interfaceC7376d.mo30571B(new a(bVar));
            return bVar;
        }
    }

    @Override // p231jv.InterfaceC7377e.a
    /* JADX INFO: renamed from: a */
    public InterfaceC7377e<?, ?> mo30576a(Type type, Annotation[] annotationArr, C7397y c7397y) {
        if (InterfaceC7377e.a.m30575c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM30574b = InterfaceC7377e.a.m30574b(0, (ParameterizedType) type);
        if (InterfaceC7377e.a.m30575c(typeM30574b) != C7396x.class) {
            return new a(typeM30574b);
        }
        if (typeM30574b instanceof ParameterizedType) {
            return new c(InterfaceC7377e.a.m30574b(0, (ParameterizedType) typeM30574b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
