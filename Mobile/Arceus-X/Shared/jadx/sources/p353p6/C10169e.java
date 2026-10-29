package p353p6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p239k6.AbstractC7469j;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p537x6.C12752m;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import p568y6.Size;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: p6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b*\u0010.¨\u0006/"}, m31665d2 = {"Lp6/e;", "Lp6/d$a;", "Lx6/g;", "initialRequest", "", "Lp6/d;", "interceptors", "", "index", "request", "Ly6/g;", "size", "Lk6/j;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lx6/g;Ljava/util/List;ILx6/g;Ly6/g;Lk6/j;Z)V", "Lx6/k;", "g", "(Lnt/b;)Ljava/lang/Object;", "interceptor", "", "b", "(Lx6/g;Lp6/d;)V", "c", "(ILx6/g;Ly6/g;)Lp6/e;", "a", "Lx6/g;", "getInitialRequest", "()Lx6/g;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "I", "getIndex", "()I", "d", "e", "Ly6/g;", "i", "()Ly6/g;", "f", "Lk6/j;", "()Lk6/j;", "Z", "()Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10169e implements InterfaceC10168d.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImageRequest initialRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC10168d> interceptors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ImageRequest request;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7469j eventListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean isPlaceholderCached;

    /* JADX INFO: renamed from: p6.e$a */
    @InterfaceC10344f(m39663c = "coil3.intercept.RealInterceptorChain", m39664f = "RealInterceptorChain.kt", m39665l = {31}, m39666m = "proceed")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f36733t;

        /* JADX INFO: renamed from: u */
        public Object f36734u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f36735v;

        /* JADX INFO: renamed from: x */
        public int f36737x;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36735v = obj;
            this.f36737x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C10169e.this.m39182g(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends p6.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10169e(@NotNull ImageRequest imageRequest, @NotNull List<? extends InterfaceC10168d> list, int i10, @NotNull ImageRequest imageRequest2, @NotNull Size size, @NotNull AbstractC7469j abstractC7469j, boolean z10) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i10;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = abstractC7469j;
        this.isPlaceholderCached = z10;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C10169e m39177d(C10169e c10169e, int i10, ImageRequest imageRequest, Size size, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c10169e.index;
        }
        if ((i11 & 2) != 0) {
            imageRequest = c10169e.getRequest();
        }
        if ((i11 & 4) != 0) {
            size = c10169e.getSize();
        }
        return c10169e.m39179c(i10, imageRequest, size);
    }

    @Override // p353p6.InterfaceC10168d.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: b */
    public final void m39178b(ImageRequest request, InterfaceC10168d interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == C12752m.f45468a) {
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

    /* JADX INFO: renamed from: c */
    public final C10169e m39179c(int index, ImageRequest request, Size size) {
        return new C10169e(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC7469j getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object m39182g(@NotNull InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
        a aVar;
        InterfaceC10168d interfaceC10168d;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f36737x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f36737x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f36735v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f36737x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC10168d interfaceC10168d2 = this.interceptors.get(this.index);
            InterfaceC10168d.a aVarM39177d = m39177d(this, this.index + 1, null, null, 6, null);
            aVar.f36733t = interfaceC10168d2;
            aVar.f36734u = C10350l.m39676a(aVarM39177d);
            aVar.f36737x = 1;
            Object objMo39163a = interfaceC10168d2.mo39163a(aVarM39177d, aVar);
            if (objMo39163a == objM38805e) {
                return objM38805e;
            }
            interfaceC10168d = interfaceC10168d2;
            obj = objMo39163a;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC10168d = (InterfaceC10168d) aVar.f36733t;
            C7348o.m30470b(obj);
        }
        InterfaceC12750k interfaceC12750k = (InterfaceC12750k) obj;
        m39178b(interfaceC12750k.getRequest(), interfaceC10168d);
        return interfaceC12750k;
    }

    @Override // p353p6.InterfaceC10168d.a
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public Size getSize() {
        return this.size;
    }
}
