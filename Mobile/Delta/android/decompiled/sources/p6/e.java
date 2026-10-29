package p6;

import java.util.List;
import jt.o;
import k6.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.l;
import x6.ImageRequest;
import x6.k;
import x6.m;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b*\u0010.¨\u0006/"}, d2 = {"Lp6/e;", "Lp6/d$a;", "Lx6/g;", "initialRequest", "", "Lp6/d;", "interceptors", "", "index", "request", "Ly6/g;", "size", "Lk6/j;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lx6/g;Ljava/util/List;ILx6/g;Ly6/g;Lk6/j;Z)V", "Lx6/k;", "g", "(Lnt/b;)Ljava/lang/Object;", "interceptor", "", "b", "(Lx6/g;Lp6/d;)V", "c", "(ILx6/g;Ly6/g;)Lp6/e;", "a", "Lx6/g;", "getInitialRequest", "()Lx6/g;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "I", "getIndex", "()I", "d", "e", "Ly6/g;", "i", "()Ly6/g;", "f", "Lk6/j;", "()Lk6/j;", "Z", "()Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageRequest initialRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageRequest request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j eventListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isPlaceholderCached;

    @f(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {31}, m = "proceed")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28371t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28372u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f28373v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f28375x;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28373v = obj;
            this.f28375x |= Integer.MIN_VALUE;
            return e.this.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull ImageRequest imageRequest, @NotNull List<? extends d> list, int i10, @NotNull ImageRequest imageRequest2, @NotNull Size size, @NotNull j jVar, boolean z10) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i10;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = jVar;
        this.isPlaceholderCached = z10;
    }

    public static /* synthetic */ e d(e eVar, int i10, ImageRequest imageRequest, Size size, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = eVar.index;
        }
        if ((i11 & 2) != 0) {
            imageRequest = eVar.getRequest();
        }
        if ((i11 & 4) != 0) {
            size = eVar.getSize();
        }
        return eVar.c(i10, imageRequest, size);
    }

    @Override // p6.d.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    public final void b(ImageRequest request, d interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == m.f35127a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (request.getTarget() != this.initialRequest.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (request.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final e c(int index, ImageRequest request, Size size) {
        return new e(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object g(@NotNull nt.b<? super k> bVar) {
        a aVar;
        d dVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f28375x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28375x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f28373v;
        Object objE = ot.c.e();
        int i11 = aVar.f28375x;
        if (i11 == 0) {
            o.b(obj);
            d dVar2 = this.interceptors.get(this.index);
            d.a aVarD = d(this, this.index + 1, null, null, 6, null);
            aVar.f28371t = dVar2;
            aVar.f28372u = l.a(aVarD);
            aVar.f28375x = 1;
            Object objA = dVar2.a(aVarD, aVar);
            if (objA == objE) {
                return objE;
            }
            dVar = dVar2;
            obj = objA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) aVar.f28371t;
            o.b(obj);
        }
        k kVar = (k) obj;
        b(kVar.getRequest(), dVar);
        return kVar;
    }

    @Override // p6.d.a
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public Size getSize() {
        return this.size;
    }
}
