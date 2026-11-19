package l6;

import android.content.Context;
import av.g2;
import av.p0;
import av.q0;
import av.w0;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import y6.ErrorResult;
import y6.ImageRequest;
import y6.SuccessResult;
import z6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b2\u0010;*\u0004\b<\u0010=R\u001d\u0010B\u001a\u0004\u0018\u00010?8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010@*\u0004\bA\u0010=R\u000b\u0010\u000f\u001a\u00020C8\u0002X\u0082\u0004¨\u0006D"}, d2 = {"Ll6/w;", "Ll6/s;", "Ll6/w$a;", "options", "<init>", "(Ll6/w$a;)V", "Ly6/g;", "request", "Ly6/d;", "d", "(Ly6/g;)Ly6/d;", "Ly6/k;", "a", "(Ly6/g;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "shutdown", "()V", "initialRequest", BuildConfig.FLAVOR, Payload.TYPE, "g", "(Ly6/g;ILeu/b;)Ljava/lang/Object;", "Ly6/t;", "result", "Lc7/c;", "target", "Ll6/j;", "eventListener", "l", "(Ly6/t;Lc7/c;Ll6/j;)V", "Ly6/e;", "k", "(Ly6/e;Lc7/c;Ll6/j;)V", "j", "(Ly6/g;Ll6/j;)V", "Ll6/w$a;", "h", "()Ll6/w$a;", "Lav/p0;", "b", "Lav/p0;", "scope", "Lf7/d0;", "c", "Lf7/d0;", "systemCallbacks", "Ly6/r;", "Ly6/r;", "requestService", "Ll6/h;", "e", "Ll6/h;", "getComponents", "()Ll6/h;", "components", "Ly6/g$b;", "()Ly6/g$b;", "defaults", "Lt6/d;", "()Lt6/d;", "getMemoryCache$delegate", "(Ll6/w;)Ljava/lang/Object;", "memoryCache", "Lo6/a;", "()Lo6/a;", "getDiskCache$delegate", "diskCache", "Lkotlinx/atomicfu/AtomicBoolean;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21940g = AtomicIntegerFieldUpdater.newUpdater(w.class, "f");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f7.d0 systemCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y6.r requestService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h components;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile /* synthetic */ int f21945f;

    /* JADX INFO: renamed from: l6.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b#\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"Ll6/w$a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Ly6/g$b;", "defaults", "Lzt/h;", "Lkotlin/coroutines/CoroutineContext;", "mainCoroutineContextLazy", "Lt6/d;", "memoryCacheLazy", "Lo6/a;", "diskCacheLazy", "Ll6/j$c;", "eventListenerFactory", "Ll6/h;", "componentRegistry", "Lf7/u;", "logger", "<init>", "(Landroid/content/Context;Ly6/g$b;Lzt/h;Lzt/h;Lzt/h;Ll6/j$c;Ll6/h;Lf7/u;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Ly6/g$b;", "c", "()Ly6/g$b;", "Lzt/h;", "g", "()Lzt/h;", "d", "h", "e", "f", "Ll6/j$c;", "()Ll6/j$c;", "Ll6/h;", "()Ll6/h;", "Lf7/u;", "()Lf7/u;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Options {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Context application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final ImageRequest.Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final zt.h<CoroutineContext> mainCoroutineContextLazy;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final zt.h<t6.d> memoryCacheLazy;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final zt.h<o6.a> diskCacheLazy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final j.c eventListenerFactory;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final h componentRegistry;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final f7.u logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Options(@NotNull Context context, @NotNull ImageRequest.Defaults defaults, @NotNull zt.h<? extends CoroutineContext> hVar, @NotNull zt.h<? extends t6.d> hVar2, @NotNull zt.h<? extends o6.a> hVar3, @NotNull j.c cVar, @NotNull h hVar4, @Nullable f7.u uVar) {
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
        public final zt.h<o6.a> d() {
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
        public final f7.u getLogger() {
            return this.logger;
        }

        @NotNull
        public final zt.h<CoroutineContext> g() {
            return this.mainCoroutineContextLazy;
        }

        @NotNull
        public final zt.h<t6.d> h() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.mainCoroutineContextLazy.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            f7.u uVar = this.logger;
            return iHashCode + (uVar == null ? 0 : uVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly6/k;", "<anonymous>", "(Lav/p0;)Ly6/k;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {67}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<p0, eu.b<? super y6.k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21953t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f21955v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageRequest imageRequest, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f21955v = imageRequest;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return w.this.new b(this.f21955v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super y6.k> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f21953t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            w wVar = w.this;
            ImageRequest imageRequest = this.f21955v;
            this.f21953t = 1;
            Object objG = wVar.g(imageRequest, 0, this);
            return objG == objE ? objE : objG;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly6/k;", "<anonymous>", "(Lav/p0;)Ly6/k;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<p0, eu.b<? super y6.k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21956t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f21957u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f21958v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f21960x;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly6/k;", "<anonymous>", "(Lav/p0;)Ly6/k;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<p0, eu.b<? super y6.k>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f21961t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f21962u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ImageRequest f21963v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, ImageRequest imageRequest, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f21962u = wVar;
                this.f21963v = imageRequest;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f21962u, this.f21963v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super y6.k> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f21961t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                w wVar = this.f21962u;
                ImageRequest imageRequest = this.f21963v;
                this.f21961t = 1;
                Object objG = wVar.g(imageRequest, 1, this);
                return objG == objE ? objE : objG;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageRequest imageRequest, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f21960x = imageRequest;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = w.this.new c(this.f21960x, bVar);
            cVar.f21958v = obj;
            return cVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super y6.k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f21958v;
            Object objE = fu.c.e();
            int i10 = this.f21957u;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            w0 w0VarB = av.k.b(p0Var, w.this.getOptions().g().getValue(), null, new a(w.this, this.f21960x, null), 2, null);
            w0<y6.k> w0VarB2 = a0.c(this.f21960x, w0VarB).b();
            this.f21958v = gu.l.a(p0Var);
            this.f21956t = gu.l.a(w0VarB);
            this.f21957u = 1;
            Object objY = w0VarB2.y(this);
            return objY == objE ? objE : objY;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
    public static final class d extends gu.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21964t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f21965u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f21966v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f21967w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f21968x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f21969y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f21970z;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return w.this.g(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly6/k;", "<anonymous>", "(Lav/p0;)Ly6/k;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<p0, eu.b<? super y6.k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21971t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f21972u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ w f21973v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Size f21974w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ j f21975x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ n f21976y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageRequest imageRequest, w wVar, Size size, j jVar, n nVar, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f21972u = imageRequest;
            this.f21973v = wVar;
            this.f21974w = size;
            this.f21975x = jVar;
            this.f21976y = nVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f21972u, this.f21973v, this.f21974w, this.f21975x, this.f21976y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super y6.k> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f21971t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            q6.e eVar = new q6.e(this.f21972u, this.f21973v.getComponents().g(), 0, this.f21972u, this.f21974w, this.f21975x, this.f21976y != null);
            this.f21971t = 1;
            Object objG = eVar.g(this);
            return objG == objE ? objE : objG;
        }
    }

    public w(@NotNull Options options) {
        this.options = options;
        this.scope = z.c(options.getLogger());
        f7.d0 d0VarA = f7.e0.a(this);
        this.systemCallbacks = d0VarA;
        y6.r rVarA = y6.s.a(this, d0VarA, options.getLogger());
        this.requestService = rVarA;
        options.h();
        options.d();
        this.components = z.e(c0.a(b0.a(a0.a(z.f(options.getComponentRegistry().k(), options), options), options), options)).i(new q6.a(this, d0VarA, rVarA, options.getLogger())).p();
    }

    @Override // l6.s
    @Nullable
    public Object a(@NotNull ImageRequest imageRequest, @NotNull eu.b<? super y6.k> bVar) {
        return !a0.d(imageRequest) ? g(imageRequest, 1, bVar) : q0.g(new c(imageRequest, null), bVar);
    }

    @Override // l6.s
    @NotNull
    public ImageRequest.Defaults b() {
        return this.options.getDefaults();
    }

    @Override // l6.s
    @Nullable
    public o6.a c() {
        return this.options.d().getValue();
    }

    @Override // l6.s
    @NotNull
    public y6.d d(@NotNull ImageRequest request) {
        return a0.c(request, av.k.b(this.scope, this.options.g().getValue(), null, new b(request, null), 2, null));
    }

    @Override // l6.s
    @Nullable
    public t6.d e() {
        return this.options.h().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object g(ImageRequest imageRequest, int i10, eu.b<? super y6.k> bVar) {
        d dVar;
        y6.q qVarB;
        ImageRequest imageRequestD;
        j jVarB;
        y6.q qVar;
        j jVar;
        y6.q qVar2;
        int i11;
        ImageRequest imageRequest2;
        j jVar2;
        ImageRequest imageRequest3;
        y6.q qVar3;
        n nVar;
        z6.i iVar;
        t6.d dVarE;
        t6.d.Value valueA;
        y6.k kVar;
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
        Object objE = fu.c.e();
        int i14 = dVar2.D;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = dVar2.A;
                jVar = (j) dVar2.f21967w;
                imageRequestD = (ImageRequest) dVar2.f21966v;
                qVar2 = (y6.q) dVar2.f21965u;
                ImageRequest imageRequest5 = (ImageRequest) dVar2.f21964t;
                try {
                    zt.o.b(objG);
                    i12 = i15;
                    imageRequest4 = imageRequest5;
                    jVarB = jVar;
                    qVarB = qVar2;
                } catch (Throwable th2) {
                    th = th2;
                    qVar = qVar2;
                }
            } else if (i14 == 2) {
                int i16 = dVar2.A;
                z6.i iVar2 = (z6.i) dVar2.f21969y;
                n nVar2 = (n) dVar2.f21968x;
                j jVar3 = (j) dVar2.f21967w;
                ImageRequest imageRequest6 = (ImageRequest) dVar2.f21966v;
                y6.q qVar4 = (y6.q) dVar2.f21965u;
                ImageRequest imageRequest7 = (ImageRequest) dVar2.f21964t;
                try {
                    zt.o.b(objG);
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
                        dVar2.f21964t = gu.l.a(imageRequest3);
                        dVar2.f21965u = qVar3;
                        dVar2.f21966v = imageRequest2;
                        dVar2.f21967w = jVar2;
                        dVar2.f21968x = gu.l.a(nVar);
                        dVar2.f21969y = gu.l.a(iVar);
                        dVar2.f21970z = gu.l.a(size);
                        dVar2.A = i11;
                        dVar2.D = 3;
                        objG = av.i.g(interceptorCoroutineContext, eVar, dVar2);
                        if (objG != objE) {
                            j jVar4 = jVar2;
                            imageRequestD = imageRequest2;
                            jVar = jVar4;
                            qVar = qVar3;
                            kVar = (y6.k) objG;
                            if (kVar instanceof SuccessResult) {
                                l((SuccessResult) kVar, imageRequestD.getTarget(), jVar);
                            } else {
                                if (!(kVar instanceof ErrorResult)) {
                                    throw new zt.l();
                                }
                                k((ErrorResult) kVar, imageRequestD.getTarget(), jVar);
                            }
                            qVar.e();
                            return kVar;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        j jVar5 = jVar2;
                        imageRequestD = imageRequest2;
                        jVar = jVar5;
                        qVar = qVar3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    jVar = jVar3;
                    imageRequestD = imageRequest6;
                    qVar = qVar4;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) dVar2.f21967w;
                imageRequestD = (ImageRequest) dVar2.f21966v;
                qVar = (y6.q) dVar2.f21965u;
                try {
                    zt.o.b(objG);
                    kVar = (y6.k) objG;
                    if (kVar instanceof SuccessResult) {
                        l((SuccessResult) kVar, imageRequestD.getTarget(), jVar);
                    } else {
                        if (!(kVar instanceof ErrorResult)) {
                            throw new zt.l();
                        }
                        k((ErrorResult) kVar, imageRequestD.getTarget(), jVar);
                    }
                    qVar.e();
                    return kVar;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            try {
                if (th instanceof CancellationException) {
                    j(imageRequestD, jVar);
                    throw th;
                }
                ErrorResult errorResultC = f7.h0.c(imageRequestD, th);
                k(errorResultC, imageRequestD.getTarget(), jVar);
                qVar.e();
                return errorResultC;
            } catch (Throwable th6) {
                qVar.e();
                throw th6;
            }
        }
        zt.o.b(objG);
        qVarB = this.requestService.b(imageRequest4, g2.j(dVar2.getContext()), i12 == 0);
        qVarB.b();
        imageRequestD = this.requestService.d(imageRequest4);
        jVarB = this.options.getEventListenerFactory().b(imageRequestD);
        try {
            if (Intrinsics.c(imageRequestD.getData(), y6.m.f37671a)) {
                throw new y6.n();
            }
            qVarB.start();
            if (i12 == 0) {
                dVar2.f21964t = gu.l.a(imageRequest4);
                dVar2.f21965u = qVarB;
                dVar2.f21966v = imageRequestD;
                dVar2.f21967w = jVarB;
                dVar2.A = i12;
                dVar2.D = 1;
                if (qVarB.c(dVar2) != objE) {
                    qVar2 = qVarB;
                    qVarB = qVar2;
                }
            }
            return objE;
        } catch (Throwable th7) {
            th = th7;
            qVar = qVarB;
            jVar = jVarB;
        }
        t6.d.Key placeholderMemoryCacheKey = imageRequestD.getPlaceholderMemoryCacheKey();
        n image = null;
        if (placeholderMemoryCacheKey != null && (dVarE = e()) != null && (valueA = dVarE.a(placeholderMemoryCacheKey)) != null) {
            image = valueA.getImage();
        }
        c7.c target = imageRequestD.getTarget();
        if (target != null) {
            target.b(image == null ? imageRequestD.B() : image);
        }
        jVarB.c(imageRequestD);
        ImageRequest.d listener = imageRequestD.getListener();
        if (listener != null) {
            listener.c(imageRequestD);
        }
        z6.i sizeResolver = imageRequestD.getSizeResolver();
        jVarB.n(imageRequestD, sizeResolver);
        dVar2.f21964t = gu.l.a(imageRequest4);
        dVar2.f21965u = qVarB;
        dVar2.f21966v = imageRequestD;
        dVar2.f21967w = jVarB;
        dVar2.f21968x = image;
        dVar2.f21969y = gu.l.a(sizeResolver);
        dVar2.A = i12;
        dVar2.D = 2;
        Object objA = sizeResolver.a(dVar2);
        if (objA != objE) {
            j jVar6 = jVarB;
            i11 = i12;
            imageRequest2 = imageRequestD;
            jVar2 = jVar6;
            imageRequest3 = imageRequest4;
            qVar3 = qVarB;
            objG = objA;
            nVar = image;
            iVar = sizeResolver;
            Size size2 = (Size) objG;
            jVar2.m(imageRequest2, size2);
            CoroutineContext interceptorCoroutineContext2 = imageRequest2.getInterceptorCoroutineContext();
            e eVar2 = new e(imageRequest2, this, size2, jVar2, nVar, null);
            dVar2.f21964t = gu.l.a(imageRequest3);
            dVar2.f21965u = qVar3;
            dVar2.f21966v = imageRequest2;
            dVar2.f21967w = jVar2;
            dVar2.f21968x = gu.l.a(nVar);
            dVar2.f21969y = gu.l.a(iVar);
            dVar2.f21970z = gu.l.a(size2);
            dVar2.A = i11;
            dVar2.D = 3;
            objG = av.i.g(interceptorCoroutineContext2, eVar2, dVar2);
            if (objG != objE) {
                j jVar7 = jVar2;
                imageRequestD = imageRequest2;
                jVar = jVar7;
                qVar = qVar3;
                kVar = (y6.k) objG;
                if (kVar instanceof SuccessResult) {
                    l((SuccessResult) kVar, imageRequestD.getTarget(), jVar);
                } else {
                    if (!(kVar instanceof ErrorResult)) {
                        throw new zt.l();
                    }
                    k((ErrorResult) kVar, imageRequestD.getTarget(), jVar);
                }
                qVar.e();
                return kVar;
            }
        }
        return objE;
    }

    @Override // l6.s
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
        f7.u logger = this.options.getLogger();
        if (logger != null) {
            f7.u.a aVar = f7.u.a.Info;
            if (logger.a().compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, "🏗 Cancelled - " + request.getData(), null);
            }
        }
        eventListener.b(request);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.b(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    public final void k(ErrorResult result, c7.c target, j eventListener) {
        ImageRequest request = result.getRequest();
        f7.u logger = this.options.getLogger();
        if (logger != null) {
            Throwable throwable = result.getThrowable();
            f7.u.a aVarA = logger.a();
            f7.u.a aVar = f7.u.a.Error;
            if (aVarA.compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, "🚨 Failed - " + request.getData(), throwable);
            }
        }
        if (target instanceof e7.e) {
            e7.d dVarA = y6.j.o(result.getRequest()).a((e7.e) target, result);
            if (dVarA instanceof e7.c) {
                target.c(result.getImage());
            } else {
                eventListener.r(result.getRequest(), dVarA);
                dVarA.a();
                eventListener.q(result.getRequest(), dVarA);
            }
        } else if (target != null) {
            target.c(result.getImage());
        }
        eventListener.d(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.d(request, result);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    public final void l(SuccessResult result, c7.c target, j eventListener) {
        ImageRequest request = result.getRequest();
        n6.f dataSource = result.getDataSource();
        f7.u logger = this.options.getLogger();
        if (logger != null) {
            f7.u.a aVar = f7.u.a.Info;
            if (logger.a().compareTo(aVar) <= 0) {
                logger.b("RealImageLoader", aVar, f7.h0.l(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
            }
        }
        if (target instanceof e7.e) {
            e7.d dVarA = y6.j.o(result.getRequest()).a((e7.e) target, result);
            if (dVarA instanceof e7.c) {
                target.a(result.getImage());
            } else {
                eventListener.r(result.getRequest(), dVarA);
                dVarA.a();
                eventListener.q(result.getRequest(), dVarA);
            }
        } else if (target != null) {
            target.a(result.getImage());
        }
        eventListener.a(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.a(request, result);
        }
    }

    @Override // l6.s
    public void shutdown() {
        if (f21940g.getAndSet(this, 1) == 1) {
            return;
        }
        q0.f(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        t6.d dVarE = e();
        if (dVarE != null) {
            dVarE.clear();
        }
    }
}
