package p239k6;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4854e;
import p096e7.InterfaceC4875u;
import p229jt.C7342i;
import p229jt.C7343j;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p302n6.C8894h;
import p302n6.InterfaceC8887a;
import p315nt.InterfaceC9557b;
import p430s6.InterfaceC11178d;
import p537x6.ImageRequest;
import p537x6.InterfaceC12743d;
import p537x6.InterfaceC12750k;

/* JADX INFO: renamed from: k6.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m31665d2 = {"Lk6/s;", "", "Lx6/g;", "request", "Lx6/d;", "c", "(Lx6/g;)Lx6/d;", "Lx6/k;", "d", "(Lx6/g;Lnt/b;)Ljava/lang/Object;", "", "shutdown", "()V", "Lx6/g$b;", "a", "()Lx6/g$b;", "defaults", "Lk6/h;", "getComponents", "()Lk6/h;", "components", "Ls6/d;", "e", "()Ls6/d;", "memoryCache", "Ln6/a;", "b", "()Ln6/a;", "diskCache", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7479s {

    /* JADX INFO: renamed from: k6.s$a */
    @Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00064"}, m31665d2 = {"Lk6/s$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lk6/h;", "components", "h", "(Lk6/h;)Lk6/s$a;", "Ls6/d;", "memoryCache", "k", "(Ls6/d;)Lk6/s$a;", "Ln6/a;", "diskCache", "i", "(Ln6/a;)Lk6/s$a;", "Lk6/s;", "d", "()Lk6/s;", "a", "Landroid/content/Context;", "application", "Lx6/g$b;", "b", "Lx6/g$b;", "defaults", "Ljt/h;", "Lkotlin/coroutines/CoroutineContext;", "c", "Ljt/h;", "mainCoroutineContextLazy", "memoryCacheLazy", "e", "diskCacheLazy", "Lk6/j$c;", "f", "Lk6/j$c;", "eventListenerFactory", "g", "Lk6/h;", "componentRegistry", "Le7/u;", "Le7/u;", "logger", "Lk6/l$a;", "Lk6/l$a;", "j", "()Lk6/l$a;", "extras", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public ImageRequest.Defaults defaults = ImageRequest.Defaults.f45426p;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public InterfaceC7341h<? extends CoroutineContext> mainCoroutineContextLazy = null;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public InterfaceC7341h<? extends InterfaceC11178d> memoryCacheLazy = null;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public InterfaceC7341h<? extends InterfaceC8887a> diskCacheLazy = null;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public AbstractC7469j.c eventListenerFactory = null;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public C7465h componentRegistry = null;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public InterfaceC4875u logger = null;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final Extras.a extras = new Extras.a();

        public a(@NotNull Context context) {
            this.application = C4854e.m23426b(context);
        }

        /* JADX INFO: renamed from: e */
        public static final AbstractC7900n2 m31073e() {
            return C7864g1.m32645c().mo32847X();
        }

        /* JADX DEBUG: Class process forced to load method for inline: s6.d.a.d(s6.d$a, android.content.Context, double, int, java.lang.Object):s6.d$a */
        /* JADX INFO: renamed from: f */
        public static final InterfaceC11178d m31074f(a aVar) {
            return InterfaceC11178d.a.m42102d(new InterfaceC11178d.a(), aVar.application, 0.0d, 2, null).m42104b();
        }

        /* JADX INFO: renamed from: g */
        public static final InterfaceC8887a m31075g() {
            return C8894h.m35836d();
        }

        /* JADX DEBUG: Class process forced to load method for inline: x6.g.b.b(x6.g$b, xu.l, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, x6.c, x6.c, x6.c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, y6.i, y6.f, y6.c, k6.l, int, java.lang.Object):x6.g$b */
        @NotNull
        /* JADX INFO: renamed from: d */
        public final InterfaceC7479s m31076d() {
            Context context = this.application;
            ImageRequest.Defaults defaults = this.defaults;
            ImageRequest.Defaults defaultsM47545a = defaults.m47545a((8191 & 1) != 0 ? defaults.fileSystem : null, (8191 & 2) != 0 ? defaults.interceptorCoroutineContext : null, (8191 & 4) != 0 ? defaults.fetcherCoroutineContext : null, (8191 & 8) != 0 ? defaults.decoderCoroutineContext : null, (8191 & 16) != 0 ? defaults.memoryCachePolicy : null, (8191 & 32) != 0 ? defaults.diskCachePolicy : null, (8191 & 64) != 0 ? defaults.networkCachePolicy : null, (8191 & 128) != 0 ? defaults.placeholderFactory : null, (8191 & 256) != 0 ? defaults.errorFactory : null, (8191 & 512) != 0 ? defaults.fallbackFactory : null, (8191 & 1024) != 0 ? defaults.sizeResolver : null, (8191 & 2048) != 0 ? defaults.scale : null, (8191 & 4096) != 0 ? defaults.precision : null, (8191 & 8192) != 0 ? defaults.extras : this.extras.m31059a());
            InterfaceC7341h<? extends CoroutineContext> interfaceC7341hM30456b = this.mainCoroutineContextLazy;
            if (interfaceC7341hM30456b == null) {
                interfaceC7341hM30456b = C7342i.m30456b(new Function0() { // from class: k6.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC7479s.a.m31073e();
                    }
                });
            }
            InterfaceC7341h<? extends InterfaceC11178d> interfaceC7341hM30456b2 = this.memoryCacheLazy;
            if (interfaceC7341hM30456b2 == null) {
                interfaceC7341hM30456b2 = C7342i.m30456b(new Function0() { // from class: k6.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC7479s.a.m31074f(this.f28776a);
                    }
                });
            }
            InterfaceC7341h<? extends InterfaceC8887a> interfaceC7341hM30456b3 = this.diskCacheLazy;
            if (interfaceC7341hM30456b3 == null) {
                interfaceC7341hM30456b3 = C7342i.m30456b(new Function0() { // from class: k6.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC7479s.a.m31075g();
                    }
                });
            }
            AbstractC7469j.c cVar = this.eventListenerFactory;
            if (cVar == null) {
                cVar = AbstractC7469j.c.f28767b;
            }
            C7465h c7465h = this.componentRegistry;
            if (c7465h == null) {
                c7465h = new C7465h();
            }
            return new C7483w(new C7483w.Options(context, defaultsM47545a, interfaceC7341hM30456b, interfaceC7341hM30456b2, interfaceC7341hM30456b3, cVar, c7465h, this.logger));
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final a m31077h(@NotNull C7465h components) {
            this.componentRegistry = components;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final a m31078i(@Nullable InterfaceC8887a diskCache) {
            this.diskCacheLazy = C7343j.m30457c(diskCache);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final Extras.a getExtras() {
            return this.extras;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final a m31080k(@Nullable InterfaceC11178d memoryCache) {
            this.memoryCacheLazy = C7343j.m30457c(memoryCache);
            return this;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    ImageRequest.Defaults mo31065a();

    @Nullable
    /* JADX INFO: renamed from: b */
    InterfaceC8887a mo31066b();

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC12743d mo31067c(@NotNull ImageRequest request);

    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo31068d(@NotNull ImageRequest imageRequest, @NotNull InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: e */
    InterfaceC11178d mo31069e();

    @NotNull
    C7465h getComponents();

    void shutdown();
}
