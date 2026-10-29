package k6;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g2;
import ku.p0;
import ku.q0;
import ku.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.SuccessResult;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b2\u0010;*\u0004\b<\u0010=R\u001d\u0010B\u001a\u0004\u0018\u00010?8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b(\u0010@*\u0004\bA\u0010=R\u000b\u0010\u000f\u001a\u00020C8\u0002X\u0082\u0004¨\u0006D"}, d2 = {"Lk6/w;", "Lk6/s;", "Lk6/w$a;", "options", "<init>", "(Lk6/w$a;)V", "Lx6/g;", "request", "Lx6/d;", "c", "(Lx6/g;)Lx6/d;", "Lx6/k;", "d", "(Lx6/g;Lnt/b;)Ljava/lang/Object;", "", "shutdown", "()V", "initialRequest", "", Payload.TYPE, "g", "(Lx6/g;ILnt/b;)Ljava/lang/Object;", "Lx6/t;", "result", "Lb7/c;", "target", "Lk6/j;", "eventListener", "l", "(Lx6/t;Lb7/c;Lk6/j;)V", "Lx6/e;", "k", "(Lx6/e;Lb7/c;Lk6/j;)V", "j", "(Lx6/g;Lk6/j;)V", "a", "Lk6/w$a;", "h", "()Lk6/w$a;", "Lku/p0;", "b", "Lku/p0;", "scope", "Le7/d0;", "Le7/d0;", "systemCallbacks", "Lx6/r;", "Lx6/r;", "requestService", "Lk6/h;", "e", "Lk6/h;", "getComponents", "()Lk6/h;", "components", "Lx6/g$b;", "()Lx6/g$b;", "defaults", "Ls6/d;", "()Ls6/d;", "getMemoryCache$delegate", "(Lk6/w;)Ljava/lang/Object;", "memoryCache", "Ln6/a;", "()Ln6/a;", "getDiskCache$delegate", "diskCache", "Lkotlinx/atomicfu/AtomicBoolean;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22223g = AtomicIntegerFieldUpdater.newUpdater(w.class, "f");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e7.d0 systemCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x6.r requestService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h components;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile /* synthetic */ int f22228f;

    /* JADX INFO: renamed from: k6.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b#\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"Lk6/w$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Lx6/g$b;", "defaults", "Ljt/h;", "Lkotlin/coroutines/CoroutineContext;", "mainCoroutineContextLazy", "Ls6/d;", "memoryCacheLazy", "Ln6/a;", "diskCacheLazy", "Lk6/j$c;", "eventListenerFactory", "Lk6/h;", "componentRegistry", "Le7/u;", "logger", "<init>", "(Landroid/content/Context;Lx6/g$b;Ljt/h;Ljt/h;Ljt/h;Lk6/j$c;Lk6/h;Le7/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lx6/g$b;", "c", "()Lx6/g$b;", "Ljt/h;", "g", "()Ljt/h;", "d", "h", "e", "f", "Lk6/j$c;", "()Lk6/j$c;", "Lk6/h;", "()Lk6/h;", "Le7/u;", "()Le7/u;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Options {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Context application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final ImageRequest.Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final jt.h<CoroutineContext> mainCoroutineContextLazy;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final jt.h<s6.d> memoryCacheLazy;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final jt.h<n6.a> diskCacheLazy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final j.c eventListenerFactory;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final h componentRegistry;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final e7.u logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Options(@NotNull Context context, @NotNull ImageRequest.Defaults defaults, @NotNull jt.h<? extends CoroutineContext> hVar, @NotNull jt.h<? extends s6.d> hVar2, @NotNull jt.h<? extends n6.a> hVar3, @NotNull j.c cVar, @NotNull h hVar4, @Nullable e7.u uVar) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = hVar;
            this.memoryCacheLazy = hVar2;
            this.diskCacheLazy = hVar3;
            this.eventListenerFactory = cVar;
            this.componentRegistry = hVar4;
            this.logger = uVar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getComponentRegistry() {
            return this.componentRegistry;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        @NotNull
        public final jt.h<n6.a> d() {
            return this.diskCacheLazy;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final j.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.c(this.application, options.application) && Intrinsics.c(this.defaults, options.defaults) && Intrinsics.c(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && Intrinsics.c(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.c(this.diskCacheLazy, options.diskCacheLazy) && Intrinsics.c(this.eventListenerFactory, options.eventListenerFactory) && Intrinsics.c(this.componentRegistry, options.componentRegistry) && Intrinsics.c(this.logger, options.logger);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final e7.u getLogger() {
            return this.logger;
        }

        @NotNull
        public final jt.h<CoroutineContext> g() {
            return this.mainCoroutineContextLazy;
        }

        @NotNull
        public final jt.h<s6.d> h() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.mainCoroutineContextLazy.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            e7.u uVar = this.logger;
            return iHashCode + (uVar == null ? 0 : uVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {67}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<p0, nt.b<? super x6.k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22236t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f22238v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageRequest imageRequest, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f22238v = imageRequest;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return w.this.new b(this.f22238v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f22236t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            w wVar = w.this;
            ImageRequest imageRequest = this.f22238v;
            this.f22236t = 1;
            Object objG = wVar.g(imageRequest, 0, this);
            return objG == objE ? objE : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super x6.k> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<p0, nt.b<? super x6.k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22239t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22240u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22241v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f22243x;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<p0, nt.b<? super x6.k>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f22244t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f22245u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ImageRequest f22246v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, ImageRequest imageRequest, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f22245u = wVar;
                this.f22246v = imageRequest;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f22245u, this.f22246v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f22244t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                w wVar = this.f22245u;
                ImageRequest imageRequest = this.f22246v;
                this.f22244t = 1;
                Object objG = wVar.g(imageRequest, 1, this);
                return objG == objE ? objE : objG;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super x6.k> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageRequest imageRequest, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f22243x = imageRequest;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = w.this.new c(this.f22243x, bVar);
            cVar.f22241v = obj;
            return cVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f22241v;
            Object objE = ot.c.e();
            int i10 = this.f22240u;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            w0 w0VarB = ku.k.b(p0Var, w.this.getOptions().g().getValue(), null, new a(w.this, this.f22243x, null), 2, null);
            w0<x6.k> w0VarB2 = a0.c(this.f22243x, w0VarB).b();
            this.f22241v = pt.l.a(p0Var);
            this.f22239t = pt.l.a(w0VarB);
            this.f22240u = 1;
            Object objB = w0VarB2.B(this);
            return objB == objE ? objE : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super x6.k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22247t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22248u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f22249v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f22250w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f22251x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f22252y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f22253z;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return w.this.g(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<p0, nt.b<? super x6.k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22254t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f22255u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ w f22256v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Size f22257w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j f22258x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ n f22259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageRequest imageRequest, w wVar, Size size, j jVar, n nVar, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f22255u = imageRequest;
            this.f22256v = wVar;
            this.f22257w = size;
            this.f22258x = jVar;
            this.f22259y = nVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f22255u, this.f22256v, this.f22257w, this.f22258x, this.f22259y, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f22254t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            p6.e eVar = new p6.e(this.f22255u, this.f22256v.getComponents().g(), 0, this.f22255u, this.f22257w, this.f22258x, this.f22259y != null);
            this.f22254t = 1;
            Object objG = eVar.g(this);
            return objG == objE ? objE : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super x6.k> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public w(@NotNull Options options) {
        this.options = options;
        this.scope = z.c(options.getLogger());
        e7.d0 d0VarA = e7.e0.a(this);
        this.systemCallbacks = d0VarA;
        x6.r rVarA = x6.s.a(this, d0VarA, options.getLogger());
        this.requestService = rVarA;
        options.h();
        options.d();
        this.components = z.e(c0.a(b0.a(a0.a(z.f(options.getComponentRegistry().k(), options), options), options), options)).i(new p6.a(this, d0VarA, rVarA, options.getLogger())).p();
    }

    @Override // k6.s
    @NotNull
    public ImageRequest.Defaults a() {
        return this.options.getDefaults();
    }

    @Override // k6.s
    @Nullable
    public n6.a b() {
        return this.options.d().getValue();
    }

    @Override // k6.s
    @NotNull
    public x6.d c(@NotNull ImageRequest request) {
        return a0.c(request, ku.k.b(this.scope, this.options.g().getValue(), null, new b(request, null), 2, null));
    }

    @Override // k6.s
    @Nullable
    public Object d(@NotNull ImageRequest imageRequest, @NotNull nt.b<? super x6.k> bVar) {
        return !a0.d(imageRequest) ? g(imageRequest, 1, bVar) : q0.g(new c(imageRequest, null), bVar);
    }

    @Override // k6.s
    @Nullable
    public s6.d e() {
        return this.options.h().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object g(ImageRequest imageRequest, int i10, nt.b<? super x6.k> bVar) {
        d dVar;
        x6.q qVarA;
        ImageRequest imageRequestB;
        j jVarA;
        x6.q qVar;
        j jVar;
        x6.q qVar2;
        int i11;
        ImageRequest imageRequest2;
        j jVar2;
        ImageRequest imageRequest3;
        x6.q qVar3;
        n nVar;
        y6.i iVar;
        s6.d dVarE;
        s6.d.Value valueA;
        x6.k kVar;
        ImageRequest imageRequest4 = imageRequest;
        int i12 = i10;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i13 = dVar.D;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.D = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        d dVar2 = dVar;
        Object objG = dVar2.B;
        Object objE = ot.c.e();
        int i14 = dVar2.D;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = dVar2.A;
                jVar = (j) dVar2.f22250w;
                imageRequestB = (ImageRequest) dVar2.f22249v;
                qVar2 = (x6.q) dVar2.f22248u;
                ImageRequest imageRequest5 = (ImageRequest) dVar2.f22247t;
                try {
                    jt.o.b(objG);
                    i12 = i15;
                    imageRequest4 = imageRequest5;
                    jVarA = jVar;
                    qVarA = qVar2;
                } catch (Throwable th2) {
                    th = th2;
                    qVar = qVar2;
                }
            } else if (i14 == 2) {
                int i16 = dVar2.A;
                y6.i iVar2 = (y6.i) dVar2.f22252y;
                n nVar2 = (n) dVar2.f22251x;
                j jVar3 = (j) dVar2.f22250w;
                ImageRequest imageRequest6 = (ImageRequest) dVar2.f22249v;
                x6.q qVar4 = (x6.q) dVar2.f22248u;
                ImageRequest imageRequest7 = (ImageRequest) dVar2.f22247t;
                try {
                    jt.o.b(objG);
                    nVar = nVar2;
                    jVar2 = jVar3;
                    qVar3 = qVar4;
                    imageRequest3 = imageRequest7;
                    i11 = i16;
                    iVar = iVar2;
                    imageRequest2 = imageRequest6;
                    try {
                        Size size = (Size) objG;
                        jVar2.m(imageRequest2, size);
                        CoroutineContext interceptorCoroutineContext = imageRequest2.getInterceptorCoroutineContext();
                        e eVar = new e(imageRequest2, this, size, jVar2, nVar, null);
                        dVar2.f22247t = pt.l.a(imageRequest3);
                        dVar2.f22248u = qVar3;
                        dVar2.f22249v = imageRequest2;
                        dVar2.f22250w = jVar2;
                        dVar2.f22251x = pt.l.a(nVar);
                        dVar2.f22252y = pt.l.a(iVar);
                        dVar2.f22253z = pt.l.a(size);
                        dVar2.A = i11;
                        dVar2.D = 3;
                        objG = ku.i.g(interceptorCoroutineContext, eVar, dVar2);
                        if (objG != objE) {
                            j jVar4 = jVar2;
                            imageRequestB = imageRequest2;
                            jVar = jVar4;
                            qVar = qVar3;
                            kVar = (x6.k) objG;
                            if (kVar instanceof SuccessResult) {
                                l((SuccessResult) kVar, imageRequestB.getTarget(), jVar);
                            } else {
                                if (!(kVar instanceof ErrorResult)) {
                                    throw new jt.l();
                                }
                                k((ErrorResult) kVar, imageRequestB.getTarget(), jVar);
                            }
                            qVar.e();
                            return kVar;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        j jVar5 = jVar2;
                        imageRequestB = imageRequest2;
                        jVar = jVar5;
                        qVar = qVar3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    jVar = jVar3;
                    imageRequestB = imageRequest6;
                    qVar = qVar4;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) dVar2.f22250w;
                imageRequestB = (ImageRequest) dVar2.f22249v;
                qVar = (x6.q) dVar2.f22248u;
                try {
                    jt.o.b(objG);
                    kVar = (x6.k) objG;
                    if (kVar instanceof SuccessResult) {
                        l((SuccessResult) kVar, imageRequestB.getTarget(), jVar);
                    } else {
                        if (!(kVar instanceof ErrorResult)) {
                            throw new jt.l();
                        }
                        k((ErrorResult) kVar, imageRequestB.getTarget(), jVar);
                    }
                    qVar.e();
                    return kVar;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            try {
                if (th instanceof CancellationException) {
                    j(imageRequestB, jVar);
                    throw th;
                }
                ErrorResult errorResultC = e7.h0.c(imageRequestB, th);
                k(errorResultC, imageRequestB.getTarget(), jVar);
                qVar.e();
                return errorResultC;
            } catch (Throwable th6) {
                qVar.e();
                throw th6;
            }
        }
        jt.o.b(objG);
        qVarA = this.requestService.a(imageRequest4, g2.h(dVar2.getContext()), i12 == 0);
        qVarA.b();
        imageRequestB = this.requestService.b(imageRequest4);
        jVarA = this.options.getEventListenerFactory().a(imageRequestB);
        try {
            if (Intrinsics.c(imageRequestB.getData(), x6.m.f35127a)) {
                throw new x6.n();
            }
            qVarA.start();
            if (i12 == 0) {
                dVar2.f22247t = pt.l.a(imageRequest4);
                dVar2.f22248u = qVarA;
                dVar2.f22249v = imageRequestB;
                dVar2.f22250w = jVarA;
                dVar2.A = i12;
                dVar2.D = 1;
                if (qVarA.c(dVar2) != objE) {
                    qVar2 = qVarA;
                    qVarA = qVar2;
                }
            }
            return objE;
        } catch (Throwable th7) {
            th = th7;
            qVar = qVarA;
            jVar = jVarA;
        }
        s6.d.Key placeholderMemoryCacheKey = imageRequestB.getPlaceholderMemoryCacheKey();
        n image = null;
        if (placeholderMemoryCacheKey != null && (dVarE = e()) != null && (valueA = dVarE.a(placeholderMemoryCacheKey)) != null) {
            image = valueA.getImage();
        }
        b7.c target = imageRequestB.getTarget();
        if (target != null) {
            target.b(image == null ? imageRequestB.B() : image);
        }
        jVarA.a(imageRequestB);
        ImageRequest.d listener = imageRequestB.getListener();
        if (listener != null) {
            listener.a(imageRequestB);
        }
        y6.i sizeResolver = imageRequestB.getSizeResolver();
        jVarA.n(imageRequestB, sizeResolver);
        dVar2.f22247t = pt.l.a(imageRequest4);
        dVar2.f22248u = qVarA;
        dVar2.f22249v = imageRequestB;
        dVar2.f22250w = jVarA;
        dVar2.f22251x = image;
        dVar2.f22252y = pt.l.a(sizeResolver);
        dVar2.A = i12;
        dVar2.D = 2;
        Object objA = sizeResolver.a(dVar2);
        if (objA != objE) {
            j jVar6 = jVarA;
            i11 = i12;
            imageRequest2 = imageRequestB;
            jVar2 = jVar6;
            imageRequest3 = imageRequest4;
            qVar3 = qVarA;
            objG = objA;
            nVar = image;
            iVar = sizeResolver;
            Size size2 = (Size) objG;
            jVar2.m(imageRequest2, size2);
            CoroutineContext interceptorCoroutineContext2 = imageRequest2.getInterceptorCoroutineContext();
            e eVar2 = new e(imageRequest2, this, size2, jVar2, nVar, null);
            dVar2.f22247t = pt.l.a(imageRequest3);
            dVar2.f22248u = qVar3;
            dVar2.f22249v = imageRequest2;
            dVar2.f22250w = jVar2;
            dVar2.f22251x = pt.l.a(nVar);
            dVar2.f22252y = pt.l.a(iVar);
            dVar2.f22253z = pt.l.a(size2);
            dVar2.A = i11;
            dVar2.D = 3;
            objG = ku.i.g(interceptorCoroutineContext2, eVar2, dVar2);
            if (objG != objE) {
                j jVar7 = jVar2;
                imageRequestB = imageRequest2;
                jVar = jVar7;
                qVar = qVar3;
                kVar = (x6.k) objG;
                if (kVar instanceof SuccessResult) {
                    l((SuccessResult) kVar, imageRequestB.getTarget(), jVar);
                } else {
                    if (!(kVar instanceof ErrorResult)) {
                        throw new jt.l();
                    }
                    k((ErrorResult) kVar, imageRequestB.getTarget(), jVar);
                }
                qVar.e();
                return kVar;
            }
        }
        return objE;
    }

    @Override // k6.s
    @NotNull
    public h getComponents() {
        return this.components;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    public final void j(ImageRequest request, j eventListener) {
        e7.u logger = this.options.getLogger();
        if (logger != null) {
            e7.u.a aVar = e7.u.a.Info;
            if (logger.a().compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, "🏗 Cancelled - " + request.getData(), null);
            }
        }
        eventListener.d(request);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.d(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    public final void k(ErrorResult result, b7.c target, j eventListener) {
        ImageRequest request = result.getRequest();
        e7.u logger = this.options.getLogger();
        if (logger != null) {
            Throwable throwable = result.getThrowable();
            e7.u.a aVarA = logger.a();
            e7.u.a aVar = e7.u.a.Error;
            if (aVarA.compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, "🚨 Failed - " + request.getData(), throwable);
            }
        }
        if (target instanceof d7.e) {
            d7.d dVarA = x6.j.o(result.getRequest()).a((d7.e) target, result);
            if (dVarA instanceof d7.c) {
                target.a(result.getImage());
            } else {
                eventListener.r(result.getRequest(), dVarA);
                dVarA.a();
                eventListener.q(result.getRequest(), dVarA);
            }
        } else if (target != null) {
            target.a(result.getImage());
        }
        eventListener.c(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.c(request, result);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    public final void l(SuccessResult result, b7.c target, j eventListener) {
        ImageRequest request = result.getRequest();
        m6.f dataSource = result.getDataSource();
        e7.u logger = this.options.getLogger();
        if (logger != null) {
            e7.u.a aVar = e7.u.a.Info;
            if (logger.a().compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, e7.h0.l(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
            }
        }
        if (target instanceof d7.e) {
            d7.d dVarA = x6.j.o(result.getRequest()).a((d7.e) target, result);
            if (dVarA instanceof d7.c) {
                target.c(result.getImage());
            } else {
                eventListener.r(result.getRequest(), dVarA);
                dVarA.a();
                eventListener.q(result.getRequest(), dVarA);
            }
        } else if (target != null) {
            target.c(result.getImage());
        }
        eventListener.b(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.b(request, result);
        }
    }

    @Override // k6.s
    public void shutdown() {
        if (f22223g.getAndSet(this, 1) == 1) {
            return;
        }
        q0.f(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        s6.d dVarE = e();
        if (dVarE != null) {
            dVarE.clear();
        }
    }
}
