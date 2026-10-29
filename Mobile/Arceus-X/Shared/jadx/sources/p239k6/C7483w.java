package p239k6;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027b7.InterfaceC1251c;
import p070d7.C4466c;
import p070d7.InterfaceC4467d;
import p070d7.InterfaceC4468e;
import p096e7.C4855e0;
import p096e7.C4861h0;
import p096e7.InterfaceC4853d0;
import p096e7.InterfaceC4875u;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.C7865g2;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p287m6.EnumC8432f;
import p302n6.InterfaceC8887a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p353p6.C10165a;
import p353p6.C10169e;
import p430s6.InterfaceC11178d;
import p537x6.C12749j;
import p537x6.C12752m;
import p537x6.C12753n;
import p537x6.C12758s;
import p537x6.ErrorResult;
import p537x6.ImageRequest;
import p537x6.InterfaceC12743d;
import p537x6.InterfaceC12750k;
import p537x6.InterfaceC12756q;
import p537x6.InterfaceC12757r;
import p537x6.SuccessResult;
import p568y6.InterfaceC13110i;
import p568y6.Size;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: k6.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010:8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b2\u0010;*\u0004\b<\u0010=R\u001d\u0010B\u001a\u0004\u0018\u00010?8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b(\u0010@*\u0004\bA\u0010=R\u000b\u0010\u000f\u001a\u00020C8\u0002X\u0082\u0004¨\u0006D"}, m31665d2 = {"Lk6/w;", "Lk6/s;", "Lk6/w$a;", "options", "<init>", "(Lk6/w$a;)V", "Lx6/g;", "request", "Lx6/d;", "c", "(Lx6/g;)Lx6/d;", "Lx6/k;", "d", "(Lx6/g;Lnt/b;)Ljava/lang/Object;", "", "shutdown", "()V", "initialRequest", "", Payload.TYPE, "g", "(Lx6/g;ILnt/b;)Ljava/lang/Object;", "Lx6/t;", "result", "Lb7/c;", "target", "Lk6/j;", "eventListener", "l", "(Lx6/t;Lb7/c;Lk6/j;)V", "Lx6/e;", "k", "(Lx6/e;Lb7/c;Lk6/j;)V", "j", "(Lx6/g;Lk6/j;)V", "a", "Lk6/w$a;", "h", "()Lk6/w$a;", "Lku/p0;", "b", "Lku/p0;", "scope", "Le7/d0;", "Le7/d0;", "systemCallbacks", "Lx6/r;", "Lx6/r;", "requestService", "Lk6/h;", "e", "Lk6/h;", "getComponents", "()Lk6/h;", "components", "Lx6/g$b;", "()Lx6/g$b;", "defaults", "Ls6/d;", "()Ls6/d;", "getMemoryCache$delegate", "(Lk6/w;)Ljava/lang/Object;", "memoryCache", "Ln6/a;", "()Ln6/a;", "getDiskCache$delegate", "diskCache", "Lkotlinx/atomicfu/AtomicBoolean;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7483w implements InterfaceC7479s {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28791g = AtomicIntegerFieldUpdater.newUpdater(C7483w.class, "f");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4853d0 systemCallbacks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12757r requestService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C7465h components;

    /* JADX INFO: renamed from: f */
    public volatile /* synthetic */ int f28797f;

    /* JADX INFO: renamed from: k6.w$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b#\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b-\u00103¨\u00064"}, m31665d2 = {"Lk6/w$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Lx6/g$b;", "defaults", "Ljt/h;", "Lkotlin/coroutines/CoroutineContext;", "mainCoroutineContextLazy", "Ls6/d;", "memoryCacheLazy", "Ln6/a;", "diskCacheLazy", "Lk6/j$c;", "eventListenerFactory", "Lk6/h;", "componentRegistry", "Le7/u;", "logger", "<init>", "(Landroid/content/Context;Lx6/g$b;Ljt/h;Ljt/h;Ljt/h;Lk6/j$c;Lk6/h;Le7/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lx6/g$b;", "c", "()Lx6/g$b;", "Ljt/h;", "g", "()Ljt/h;", "d", "h", "e", "f", "Lk6/j$c;", "()Lk6/j$c;", "Lk6/h;", "()Lk6/h;", "Le7/u;", "()Le7/u;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Options {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Context application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final ImageRequest.Defaults defaults;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC7341h<CoroutineContext> mainCoroutineContextLazy;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC7341h<InterfaceC11178d> memoryCacheLazy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC7341h<InterfaceC8887a> diskCacheLazy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @NotNull
        public final AbstractC7469j.c eventListenerFactory;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @NotNull
        public final C7465h componentRegistry;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @Nullable
        public final InterfaceC4875u logger;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: jt.h<? extends kotlin.coroutines.CoroutineContext> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: jt.h<? extends s6.d> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: jt.h<? extends n6.a> */
        /* JADX WARN: Multi-variable type inference failed */
        public Options(@NotNull Context context, @NotNull ImageRequest.Defaults defaults, @NotNull InterfaceC7341h<? extends CoroutineContext> interfaceC7341h, @NotNull InterfaceC7341h<? extends InterfaceC11178d> interfaceC7341h2, @NotNull InterfaceC7341h<? extends InterfaceC8887a> interfaceC7341h3, @NotNull AbstractC7469j.c cVar, @NotNull C7465h c7465h, @Nullable InterfaceC4875u interfaceC4875u) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = interfaceC7341h;
            this.memoryCacheLazy = interfaceC7341h2;
            this.diskCacheLazy = interfaceC7341h3;
            this.eventListenerFactory = cVar;
            this.componentRegistry = c7465h;
            this.logger = interfaceC4875u;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final C7465h getComponentRegistry() {
            return this.componentRegistry;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final InterfaceC7341h<InterfaceC8887a> m31103d() {
            return this.diskCacheLazy;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC7469j.c getEventListenerFactory() {
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
            return Intrinsics.m31980c(this.application, options.application) && Intrinsics.m31980c(this.defaults, options.defaults) && Intrinsics.m31980c(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && Intrinsics.m31980c(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.m31980c(this.diskCacheLazy, options.diskCacheLazy) && Intrinsics.m31980c(this.eventListenerFactory, options.eventListenerFactory) && Intrinsics.m31980c(this.componentRegistry, options.componentRegistry) && Intrinsics.m31980c(this.logger, options.logger);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC4875u getLogger() {
            return this.logger;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final InterfaceC7341h<CoroutineContext> m31106g() {
            return this.mainCoroutineContextLazy;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final InterfaceC7341h<InterfaceC11178d> m31107h() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.mainCoroutineContextLazy.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            InterfaceC4875u interfaceC4875u = this.logger;
            return iHashCode + (interfaceC4875u == null ? 0 : interfaceC4875u.hashCode());
        }

        @NotNull
        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ')';
        }
    }

    /* JADX INFO: renamed from: k6.w$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.RealImageLoader$enqueue$job$1", m39664f = "RealImageLoader.kt", m39665l = {67}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k>, Object> {

        /* JADX INFO: renamed from: t */
        public int f28806t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ImageRequest f28808v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageRequest imageRequest, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f28808v = imageRequest;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C7483w.this.new b(this.f28808v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f28806t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C7483w c7483w = C7483w.this;
            ImageRequest imageRequest = this.f28808v;
            this.f28806t = 1;
            Object objM31095g = c7483w.m31095g(imageRequest, 0, this);
            return objM31095g == objM38805e ? objM38805e : objM31095g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: k6.w$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.RealImageLoader$execute$2", m39664f = "RealImageLoader.kt", m39665l = {87}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f28809t;

        /* JADX INFO: renamed from: u */
        public int f28810u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f28811v;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ ImageRequest f28813x;

        /* JADX INFO: renamed from: k6.w$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "coil3.RealImageLoader$execute$2$job$1", m39664f = "RealImageLoader.kt", m39665l = {83}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k>, Object> {

            /* JADX INFO: renamed from: t */
            public int f28814t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C7483w f28815u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ ImageRequest f28816v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C7483w c7483w, ImageRequest imageRequest, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f28815u = c7483w;
                this.f28816v = imageRequest;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f28815u, this.f28816v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f28814t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                C7483w c7483w = this.f28815u;
                ImageRequest imageRequest = this.f28816v;
                this.f28814t = 1;
                Object objM31095g = c7483w.m31095g(imageRequest, 1, this);
                return objM31095g == objM38805e ? objM38805e : objM31095g;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageRequest imageRequest, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f28813x = imageRequest;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C7483w.this.new c(this.f28813x, interfaceC9557b);
            cVar.f28811v = obj;
            return cVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f28811v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f28810u;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC7934w0 interfaceC7934w0M32778b = C7882k.m32778b(interfaceC7906p0, C7483w.this.getOptions().m31106g().getValue(), null, new a(C7483w.this, this.f28813x, null), 2, null);
            InterfaceC7934w0<InterfaceC12750k> interfaceC7934w0Mo47490b = C7452a0.m30974c(this.f28813x, interfaceC7934w0M32778b).mo47490b();
            this.f28811v = C10350l.m39676a(interfaceC7906p0);
            this.f28809t = C10350l.m39676a(interfaceC7934w0M32778b);
            this.f28810u = 1;
            Object objMo32927B = interfaceC7934w0Mo47490b.mo32927B(this);
            return objMo32927B == objM38805e ? objM38805e : objMo32927B;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: k6.w$d */
    @InterfaceC10344f(m39663c = "coil3.RealImageLoader", m39664f = "RealImageLoader.kt", m39665l = {117, 129, 133}, m39666m = "execute")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f28817A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f28818B;

        /* JADX INFO: renamed from: D */
        public int f28820D;

        /* JADX INFO: renamed from: t */
        public Object f28821t;

        /* JADX INFO: renamed from: u */
        public Object f28822u;

        /* JADX INFO: renamed from: v */
        public Object f28823v;

        /* JADX INFO: renamed from: w */
        public Object f28824w;

        /* JADX INFO: renamed from: x */
        public Object f28825x;

        /* JADX INFO: renamed from: y */
        public Object f28826y;

        /* JADX INFO: renamed from: z */
        public Object f28827z;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28818B = obj;
            this.f28820D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C7483w.this.m31095g(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: k6.w$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.RealImageLoader$execute$result$1", m39664f = "RealImageLoader.kt", m39665l = {142}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k>, Object> {

        /* JADX INFO: renamed from: t */
        public int f28828t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ImageRequest f28829u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7483w f28830v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Size f28831w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC7469j f28832x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ InterfaceC7474n f28833y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageRequest imageRequest, C7483w c7483w, Size size, AbstractC7469j abstractC7469j, InterfaceC7474n interfaceC7474n, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f28829u = imageRequest;
            this.f28830v = c7483w;
            this.f28831w = size;
            this.f28832x = abstractC7469j;
            this.f28833y = interfaceC7474n;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f28829u, this.f28830v, this.f28831w, this.f28832x, this.f28833y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f28828t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C10169e c10169e = new C10169e(this.f28829u, this.f28830v.getComponents().m30991g(), 0, this.f28829u, this.f28831w, this.f28832x, this.f28833y != null);
            this.f28828t = 1;
            Object objM39182g = c10169e.m39182g(this);
            return objM39182g == objM38805e ? objM38805e : objM39182g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: k6.z.d(e7.u):ku.p0 */
    public C7483w(@NotNull Options options) {
        this.options = options;
        this.scope = C7486z.m31110c(options.getLogger());
        InterfaceC4853d0 interfaceC4853d0M23432a = C4855e0.m23432a(this);
        this.systemCallbacks = interfaceC4853d0M23432a;
        InterfaceC12757r interfaceC12757rM47620a = C12758s.m47620a(this, interfaceC4853d0M23432a, options.getLogger());
        this.requestService = interfaceC12757rM47620a;
        options.m31107h();
        options.m31103d();
        this.components = C7486z.m31112e(C7456c0.m30977a(C7454b0.m30976a(C7452a0.m30972a(C7486z.m31113f(options.getComponentRegistry().m30995k(), options), options), options), options)).m31008i(new C10165a(this, interfaceC4853d0M23432a, interfaceC12757rM47620a, options.getLogger())).m31013p();
    }

    @Override // p239k6.InterfaceC7479s
    @NotNull
    /* JADX INFO: renamed from: a */
    public ImageRequest.Defaults mo31065a() {
        return this.options.getDefaults();
    }

    @Override // p239k6.InterfaceC7479s
    @Nullable
    /* JADX INFO: renamed from: b */
    public InterfaceC8887a mo31066b() {
        return this.options.m31103d().getValue();
    }

    @Override // p239k6.InterfaceC7479s
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC12743d mo31067c(@NotNull ImageRequest request) {
        return C7452a0.m30974c(request, C7882k.m32778b(this.scope, this.options.m31106g().getValue(), null, new b(request, null), 2, null));
    }

    @Override // p239k6.InterfaceC7479s
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo31068d(@NotNull ImageRequest imageRequest, @NotNull InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
        return !C7452a0.m30975d(imageRequest) ? m31095g(imageRequest, 1, interfaceC9557b) : C7910q0.m32891g(new c(imageRequest, null), interfaceC9557b);
    }

    @Override // p239k6.InterfaceC7479s
    @Nullable
    /* JADX INFO: renamed from: e */
    public InterfaceC11178d mo31069e() {
        return this.options.m31107h().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: g */
    public final Object m31095g(ImageRequest imageRequest, int i10, InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
        d dVar;
        InterfaceC12756q interfaceC12756qMo47467a;
        ImageRequest imageRequestMo47468b;
        AbstractC7469j abstractC7469jMo31052a;
        InterfaceC12756q interfaceC12756q;
        AbstractC7469j abstractC7469j;
        InterfaceC12756q interfaceC12756q2;
        int i11;
        ImageRequest imageRequest2;
        AbstractC7469j abstractC7469j2;
        ImageRequest imageRequest3;
        InterfaceC12756q interfaceC12756q3;
        InterfaceC7474n interfaceC7474n;
        InterfaceC13110i interfaceC13110i;
        InterfaceC11178d interfaceC11178dMo31069e;
        InterfaceC11178d.Value valueMo42094a;
        InterfaceC12750k interfaceC12750k;
        ImageRequest imageRequest4 = imageRequest;
        int i12 = i10;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i13 = dVar.f28820D;
            if ((i13 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f28820D = i13 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        d dVar2 = dVar;
        Object objM32684g = dVar2.f28818B;
        Object objM38805e = C10047c.m38805e();
        int i14 = dVar2.f28820D;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = dVar2.f28817A;
                abstractC7469j = (AbstractC7469j) dVar2.f28824w;
                imageRequestMo47468b = (ImageRequest) dVar2.f28823v;
                interfaceC12756q2 = (InterfaceC12756q) dVar2.f28822u;
                ImageRequest imageRequest5 = (ImageRequest) dVar2.f28821t;
                try {
                    C7348o.m30470b(objM32684g);
                    i12 = i15;
                    imageRequest4 = imageRequest5;
                    abstractC7469jMo31052a = abstractC7469j;
                    interfaceC12756qMo47467a = interfaceC12756q2;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC12756q = interfaceC12756q2;
                }
            } else if (i14 == 2) {
                int i16 = dVar2.f28817A;
                InterfaceC13110i interfaceC13110i2 = (InterfaceC13110i) dVar2.f28826y;
                InterfaceC7474n interfaceC7474n2 = (InterfaceC7474n) dVar2.f28825x;
                AbstractC7469j abstractC7469j3 = (AbstractC7469j) dVar2.f28824w;
                ImageRequest imageRequest6 = (ImageRequest) dVar2.f28823v;
                InterfaceC12756q interfaceC12756q4 = (InterfaceC12756q) dVar2.f28822u;
                ImageRequest imageRequest7 = (ImageRequest) dVar2.f28821t;
                try {
                    C7348o.m30470b(objM32684g);
                    interfaceC7474n = interfaceC7474n2;
                    abstractC7469j2 = abstractC7469j3;
                    interfaceC12756q3 = interfaceC12756q4;
                    imageRequest3 = imageRequest7;
                    i11 = i16;
                    interfaceC13110i = interfaceC13110i2;
                    imageRequest2 = imageRequest6;
                    try {
                        Size size = (Size) objM32684g;
                        abstractC7469j2.m31044m(imageRequest2, size);
                        CoroutineContext interceptorCoroutineContext = imageRequest2.getInterceptorCoroutineContext();
                        e eVar = new e(imageRequest2, this, size, abstractC7469j2, interfaceC7474n, null);
                        dVar2.f28821t = C10350l.m39676a(imageRequest3);
                        dVar2.f28822u = interfaceC12756q3;
                        dVar2.f28823v = imageRequest2;
                        dVar2.f28824w = abstractC7469j2;
                        dVar2.f28825x = C10350l.m39676a(interfaceC7474n);
                        dVar2.f28826y = C10350l.m39676a(interfaceC13110i);
                        dVar2.f28827z = C10350l.m39676a(size);
                        dVar2.f28817A = i11;
                        dVar2.f28820D = 3;
                        objM32684g = C7872i.m32684g(interceptorCoroutineContext, eVar, dVar2);
                        if (objM32684g != objM38805e) {
                            AbstractC7469j abstractC7469j4 = abstractC7469j2;
                            imageRequestMo47468b = imageRequest2;
                            abstractC7469j = abstractC7469j4;
                            interfaceC12756q = interfaceC12756q3;
                            interfaceC12750k = (InterfaceC12750k) objM32684g;
                            if (interfaceC12750k instanceof SuccessResult) {
                                m31099l((SuccessResult) interfaceC12750k, imageRequestMo47468b.getTarget(), abstractC7469j);
                            } else {
                                if (!(interfaceC12750k instanceof ErrorResult)) {
                                    throw new C7345l();
                                }
                                m31098k((ErrorResult) interfaceC12750k, imageRequestMo47468b.getTarget(), abstractC7469j);
                            }
                            interfaceC12756q.mo47605e();
                            return interfaceC12750k;
                        }
                        return objM38805e;
                    } catch (Throwable th3) {
                        th = th3;
                        AbstractC7469j abstractC7469j5 = abstractC7469j2;
                        imageRequestMo47468b = imageRequest2;
                        abstractC7469j = abstractC7469j5;
                        interfaceC12756q = interfaceC12756q3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC7469j = abstractC7469j3;
                    imageRequestMo47468b = imageRequest6;
                    interfaceC12756q = interfaceC12756q4;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC7469j = (AbstractC7469j) dVar2.f28824w;
                imageRequestMo47468b = (ImageRequest) dVar2.f28823v;
                interfaceC12756q = (InterfaceC12756q) dVar2.f28822u;
                try {
                    C7348o.m30470b(objM32684g);
                    interfaceC12750k = (InterfaceC12750k) objM32684g;
                    if (interfaceC12750k instanceof SuccessResult) {
                        m31099l((SuccessResult) interfaceC12750k, imageRequestMo47468b.getTarget(), abstractC7469j);
                    } else {
                        if (!(interfaceC12750k instanceof ErrorResult)) {
                            throw new C7345l();
                        }
                        m31098k((ErrorResult) interfaceC12750k, imageRequestMo47468b.getTarget(), abstractC7469j);
                    }
                    interfaceC12756q.mo47605e();
                    return interfaceC12750k;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            try {
                if (th instanceof CancellationException) {
                    m31097j(imageRequestMo47468b, abstractC7469j);
                    throw th;
                }
                ErrorResult errorResultM23436c = C4861h0.m23436c(imageRequestMo47468b, th);
                m31098k(errorResultM23436c, imageRequestMo47468b.getTarget(), abstractC7469j);
                interfaceC12756q.mo47605e();
                return errorResultM23436c;
            } catch (Throwable th6) {
                interfaceC12756q.mo47605e();
                throw th6;
            }
        }
        C7348o.m30470b(objM32684g);
        interfaceC12756qMo47467a = this.requestService.mo47467a(imageRequest4, C7865g2.m32654h(dVar2.getContext()), i12 == 0);
        interfaceC12756qMo47467a.mo47619b();
        imageRequestMo47468b = this.requestService.mo47468b(imageRequest4);
        abstractC7469jMo31052a = this.options.getEventListenerFactory().mo31052a(imageRequestMo47468b);
        try {
            if (Intrinsics.m31980c(imageRequestMo47468b.getData(), C12752m.f45468a)) {
                throw new C12753n();
            }
            interfaceC12756qMo47467a.start();
            if (i12 == 0) {
                dVar2.f28821t = C10350l.m39676a(imageRequest4);
                dVar2.f28822u = interfaceC12756qMo47467a;
                dVar2.f28823v = imageRequestMo47468b;
                dVar2.f28824w = abstractC7469jMo31052a;
                dVar2.f28817A = i12;
                dVar2.f28820D = 1;
                if (interfaceC12756qMo47467a.mo47603c(dVar2) != objM38805e) {
                    interfaceC12756q2 = interfaceC12756qMo47467a;
                    interfaceC12756qMo47467a = interfaceC12756q2;
                }
            }
            return objM38805e;
        } catch (Throwable th7) {
            th = th7;
            interfaceC12756q = interfaceC12756qMo47467a;
            abstractC7469j = abstractC7469jMo31052a;
        }
        InterfaceC11178d.Key placeholderMemoryCacheKey = imageRequestMo47468b.getPlaceholderMemoryCacheKey();
        InterfaceC7474n image = null;
        if (placeholderMemoryCacheKey != null && (interfaceC11178dMo31069e = mo31069e()) != null && (valueMo42094a = interfaceC11178dMo31069e.mo42094a(placeholderMemoryCacheKey)) != null) {
            image = valueMo42094a.getImage();
        }
        InterfaceC1251c target = imageRequestMo47468b.getTarget();
        if (target != null) {
            target.mo6968b(image == null ? imageRequestMo47468b.m47495B() : image);
        }
        abstractC7469jMo31052a.mo31032a(imageRequestMo47468b);
        ImageRequest.d listener = imageRequestMo47468b.getListener();
        if (listener != null) {
            listener.mo31032a(imageRequestMo47468b);
        }
        InterfaceC13110i sizeResolver = imageRequestMo47468b.getSizeResolver();
        abstractC7469jMo31052a.m31045n(imageRequestMo47468b, sizeResolver);
        dVar2.f28821t = C10350l.m39676a(imageRequest4);
        dVar2.f28822u = interfaceC12756qMo47467a;
        dVar2.f28823v = imageRequestMo47468b;
        dVar2.f28824w = abstractC7469jMo31052a;
        dVar2.f28825x = image;
        dVar2.f28826y = C10350l.m39676a(sizeResolver);
        dVar2.f28817A = i12;
        dVar2.f28820D = 2;
        Object objMo48705a = sizeResolver.mo48705a(dVar2);
        if (objMo48705a != objM38805e) {
            AbstractC7469j abstractC7469j6 = abstractC7469jMo31052a;
            i11 = i12;
            imageRequest2 = imageRequestMo47468b;
            abstractC7469j2 = abstractC7469j6;
            imageRequest3 = imageRequest4;
            interfaceC12756q3 = interfaceC12756qMo47467a;
            objM32684g = objMo48705a;
            interfaceC7474n = image;
            interfaceC13110i = sizeResolver;
            Size size2 = (Size) objM32684g;
            abstractC7469j2.m31044m(imageRequest2, size2);
            CoroutineContext interceptorCoroutineContext2 = imageRequest2.getInterceptorCoroutineContext();
            e eVar2 = new e(imageRequest2, this, size2, abstractC7469j2, interfaceC7474n, null);
            dVar2.f28821t = C10350l.m39676a(imageRequest3);
            dVar2.f28822u = interfaceC12756q3;
            dVar2.f28823v = imageRequest2;
            dVar2.f28824w = abstractC7469j2;
            dVar2.f28825x = C10350l.m39676a(interfaceC7474n);
            dVar2.f28826y = C10350l.m39676a(interfaceC13110i);
            dVar2.f28827z = C10350l.m39676a(size2);
            dVar2.f28817A = i11;
            dVar2.f28820D = 3;
            objM32684g = C7872i.m32684g(interceptorCoroutineContext2, eVar2, dVar2);
            if (objM32684g != objM38805e) {
                AbstractC7469j abstractC7469j7 = abstractC7469j2;
                imageRequestMo47468b = imageRequest2;
                abstractC7469j = abstractC7469j7;
                interfaceC12756q = interfaceC12756q3;
                interfaceC12750k = (InterfaceC12750k) objM32684g;
                if (interfaceC12750k instanceof SuccessResult) {
                    m31099l((SuccessResult) interfaceC12750k, imageRequestMo47468b.getTarget(), abstractC7469j);
                } else {
                    if (!(interfaceC12750k instanceof ErrorResult)) {
                        throw new C7345l();
                    }
                    m31098k((ErrorResult) interfaceC12750k, imageRequestMo47468b.getTarget(), abstractC7469j);
                }
                interfaceC12756q.mo47605e();
                return interfaceC12750k;
            }
        }
        return objM38805e;
    }

    @Override // p239k6.InterfaceC7479s
    @NotNull
    public C7465h getComponents() {
        return this.components;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: j */
    public final void m31097j(ImageRequest request, AbstractC7469j eventListener) {
        InterfaceC4875u logger = this.options.getLogger();
        if (logger != null) {
            InterfaceC4875u.a aVar = InterfaceC4875u.a.Info;
            if (logger.m23484a().compareTo(aVar) <= 0) {
                logger.m23485b("RealImageLoader", aVar, "🏗 Cancelled - " + request.getData(), null);
            }
        }
        eventListener.mo31035d(request);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.mo31035d(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX INFO: renamed from: k */
    public final void m31098k(ErrorResult result, InterfaceC1251c target, AbstractC7469j eventListener) {
        ImageRequest request = result.getRequest();
        InterfaceC4875u logger = this.options.getLogger();
        if (logger != null) {
            Throwable throwable = result.getThrowable();
            InterfaceC4875u.a aVarM23484a = logger.m23484a();
            InterfaceC4875u.a aVar = InterfaceC4875u.a.Error;
            if (aVarM23484a.compareTo(aVar) <= 0) {
                logger.m23485b("RealImageLoader", aVar, "🚨 Failed - " + request.getData(), throwable);
            }
        }
        if (target instanceof InterfaceC4468e) {
            InterfaceC4467d interfaceC4467dMo22413a = C12749j.m47598o(result.getRequest()).mo22413a((InterfaceC4468e) target, result);
            if (interfaceC4467dMo22413a instanceof C4466c) {
                target.mo6967a(result.getImage());
            } else {
                eventListener.m31049r(result.getRequest(), interfaceC4467dMo22413a);
                interfaceC4467dMo22413a.mo22412a();
                eventListener.m31048q(result.getRequest(), interfaceC4467dMo22413a);
            }
        } else if (target != null) {
            target.mo6967a(result.getImage());
        }
        eventListener.mo31034c(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.mo31034c(request, result);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    /* JADX INFO: renamed from: l */
    public final void m31099l(SuccessResult result, InterfaceC1251c target, AbstractC7469j eventListener) {
        ImageRequest request = result.getRequest();
        EnumC8432f dataSource = result.getDataSource();
        InterfaceC4875u logger = this.options.getLogger();
        if (logger != null) {
            InterfaceC4875u.a aVar = InterfaceC4875u.a.Info;
            if (logger.m23484a().compareTo(aVar) <= 0) {
                logger.m23485b("RealImageLoader", aVar, C4861h0.m23445l(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
            }
        }
        if (target instanceof InterfaceC4468e) {
            InterfaceC4467d interfaceC4467dMo22413a = C12749j.m47598o(result.getRequest()).mo22413a((InterfaceC4468e) target, result);
            if (interfaceC4467dMo22413a instanceof C4466c) {
                target.mo6969c(result.getImage());
            } else {
                eventListener.m31049r(result.getRequest(), interfaceC4467dMo22413a);
                interfaceC4467dMo22413a.mo22412a();
                eventListener.m31048q(result.getRequest(), interfaceC4467dMo22413a);
            }
        } else if (target != null) {
            target.mo6969c(result.getImage());
        }
        eventListener.mo31033b(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.mo31033b(request, result);
        }
    }

    @Override // p239k6.InterfaceC7479s
    public void shutdown() {
        if (f28791g.getAndSet(this, 1) == 1) {
            return;
        }
        C7910q0.m32890f(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        InterfaceC11178d interfaceC11178dMo31069e = mo31069e();
        if (interfaceC11178dMo31069e != null) {
            interfaceC11178dMo31069e.clear();
        }
    }
}
