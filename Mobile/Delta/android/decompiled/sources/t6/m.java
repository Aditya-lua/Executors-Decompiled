package t6;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import k6.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.text.StringsKt;
import kotlin.text.x;
import m6.t;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import xu.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JB\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00020\u001d2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0006\u0012\u0004\u0018\u00010(0&H\u0082@¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u0004\u0018\u00010\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020.*\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u00020.*\u000201H\u0082@¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u00020.*\u000204H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lt6/m;", "Lo6/j;", "", "url", "Lx6/p;", "options", "Ljt/h;", "Lt6/i;", "networkClient", "Ln6/a;", "diskCache", "Lt6/b;", "cacheStrategy", "Lt6/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Lx6/p;Ljt/h;Ljt/h;Ljt/h;Lt6/d;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "contentType", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ln6/a$c;", "m", "()Ln6/a$c;", "snapshot", "Lt6/q;", "cacheResponse", "Lt6/o;", "networkRequest", "networkResponse", "r", "(Ln6/a$c;Lt6/q;Lt6/o;Lt6/q;Lnt/b;)Ljava/lang/Object;", "l", "()Lt6/o;", "T", "request", "Lkotlin/Function2;", "Lnt/b;", "", "block", "h", "(Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "q", "(Ln6/a$c;)Lt6/q;", "Lm6/s;", "o", "(Ln6/a$c;)Lm6/s;", "Lt6/r;", "n", "(Lt6/r;Lnt/b;)Ljava/lang/Object;", "Lxu/e;", "p", "(Lxu/e;)Lm6/s;", "Ljava/lang/String;", "b", "Lx6/p;", "c", "Ljt/h;", "d", "e", "f", "Lt6/d;", "i", "()Ljava/lang/String;", "diskCacheKey", "Lxu/l;", "j", "()Lxu/l;", "fileSystem", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements o6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h<i> networkClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h<n6.a> diskCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h<t6.b> cacheStrategy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t6.d connectivityChecker;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lt6/q;", Payload.RESPONSE, "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend")
    public static final class b<T> extends pt.m implements Function2<NetworkResponse, nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31625t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31626u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<NetworkResponse, nt.b<? super T>, Object> f31627v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super NetworkResponse, ? super nt.b<? super T>, ? extends Object> function2, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f31627v = function2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = new b(this.f31627v, bVar);
            bVar2.f31626u = obj;
            return bVar2;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f31626u;
            Object objE = ot.c.e();
            int i10 = this.f31625t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            int code = networkResponse.getCode();
            if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
                throw new t6.g(networkResponse);
            }
            Function2<NetworkResponse, nt.b<? super T>, Object> function2 = this.f31627v;
            this.f31626u = pt.l.a(networkResponse);
            this.f31625t = 1;
            Object objInvoke = function2.invoke(networkResponse, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, nt.b<? super T> bVar) {
            return ((b) create(networkResponse, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = "fetch")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31628t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31629u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31630v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31631w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f31632x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f31633y;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31633y = obj;
            this.A |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt6/q;", Payload.RESPONSE, "Lo6/o;", "<anonymous>", "(Lt6/q;)Lo6/o;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<NetworkResponse, nt.b<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31635t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31636u;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            d dVar = m.this.new d(bVar);
            dVar.f31636u = obj;
            return dVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f31636u;
            Object objE = ot.c.e();
            int i10 = this.f31635t;
            if (i10 == 0) {
                jt.o.b(obj);
                m mVar = m.this;
                r rVarF = u6.e.f(networkResponse);
                this.f31636u = networkResponse;
                this.f31635t = 1;
                obj = mVar.n(rVarF, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            m mVar2 = m.this;
            return new SourceFetchResult((m6.s) obj, mVar2.k(mVar2.url, networkResponse.getHeaders().c("Content-Type")), m6.f.NETWORK);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, nt.b<? super SourceFetchResult> bVar) {
            return ((d) create(networkResponse, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt6/q;", Payload.RESPONSE, "Lo6/o;", "<anonymous>", "(Lt6/q;)Lo6/o;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<NetworkResponse, nt.b<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31638t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f31639u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31640v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<n6.a.c> f31641w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ m f31642x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ c0<NetworkResponse> f31643y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ NetworkRequest f31644z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0<n6.a.c> c0Var, m mVar, c0<NetworkResponse> c0Var2, NetworkRequest networkRequest, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f31641w = c0Var;
            this.f31642x = mVar;
            this.f31643y = c0Var2;
            this.f31644z = networkRequest;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            e eVar = new e(this.f31641w, this.f31642x, this.f31643y, this.f31644z, bVar);
            eVar.f31640v = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        
            if (r12 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v9, types: [T, t6.q] */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t6.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, nt.b<? super SourceFetchResult> bVar) {
            return ((e) create(networkResponse, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31645t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31646u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31647v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31649x;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31647v = obj;
            this.f31649x |= Integer.MIN_VALUE;
            return m.this.n(null, this);
        }
    }

    @pt.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31650t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31651u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31652v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31653w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f31654x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f31655y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f31656z;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return m.this.r(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull String str, @NotNull Options options, @NotNull jt.h<? extends i> hVar, @NotNull jt.h<? extends n6.a> hVar2, @NotNull jt.h<? extends t6.b> hVar3, @NotNull t6.d dVar) {
        this.url = str;
        this.options = options;
        this.networkClient = hVar;
        this.diskCache = hVar2;
        this.cacheStrategy = hVar3;
        this.connectivityChecker = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:72:0x0177, B:74:0x017b), top: B:93:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x01bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, n6.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, t6.q] */
    @Override // o6.j
    @Nullable
    public Object a(@NotNull nt.b<? super o6.i> bVar) throws Exception {
        c cVar;
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        t6.b.ReadResult readResult;
        c0 c0Var4;
        Exception exc;
        c0 c0Var5;
        NetworkRequest request;
        NetworkRequest networkRequest;
        c0 c0Var6;
        c0 c0Var7;
        NetworkRequest networkRequest2;
        SourceFetchResult sourceFetchResult;
        n6.a.c cVar2;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.A = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objH = cVar.f31633y;
        Object objE = ot.c.e();
        int i11 = cVar.A;
        if (i11 == 0) {
            jt.o.b(objH);
            c0 c0Var8 = new c0();
            c0Var8.f22552a = m();
            try {
                c0Var2 = new c0();
                if (c0Var8.f22552a != 0) {
                    Long size = j().metadata(((n6.a.c) c0Var8.f22552a).getMetadata()).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new SourceFetchResult(o((n6.a.c) c0Var8.f22552a), k(this.url, null), m6.f.DISK);
                    }
                    ?? Q = q((n6.a.c) c0Var8.f22552a);
                    c0Var2.f22552a = Q;
                    if (Q != 0) {
                        t6.b value = this.cacheStrategy.getValue();
                        NetworkResponse networkResponse = (NetworkResponse) c0Var2.f22552a;
                        NetworkRequest networkRequestL = l();
                        Options options = this.options;
                        cVar.f31628t = c0Var8;
                        cVar.f31629u = c0Var2;
                        cVar.A = 1;
                        Object objB = value.b(networkResponse, networkRequestL, options, cVar);
                        if (objB != objE) {
                            c0Var4 = c0Var8;
                            objH = objB;
                        }
                    }
                    return objE;
                }
                c0Var3 = c0Var8;
                readResult = null;
                c0Var5 = c0Var2;
                if (readResult != null) {
                    request = l();
                    networkRequest = request;
                    e eVar = new e(c0Var3, this, c0Var5, networkRequest, null);
                    cVar.f31628t = c0Var3;
                    cVar.f31629u = pt.l.a(readResult);
                    cVar.f31630v = pt.l.a(c0Var5);
                    cVar.f31631w = pt.l.a(networkRequest);
                    cVar.A = 2;
                    objH = h(networkRequest, eVar, cVar);
                    if (objH != objE) {
                        c0Var6 = c0Var3;
                        c0Var7 = c0Var5;
                        networkRequest2 = networkRequest;
                        sourceFetchResult = (SourceFetchResult) objH;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestL2 = l();
                        d dVar = new d(null);
                        cVar.f31628t = c0Var6;
                        cVar.f31629u = pt.l.a(readResult);
                        cVar.f31630v = pt.l.a(c0Var7);
                        cVar.f31631w = pt.l.a(networkRequest2);
                        cVar.f31632x = pt.l.a(sourceFetchResult);
                        cVar.A = 3;
                        objH = h(networkRequestL2, dVar, cVar);
                        if (objH != objE) {
                            c0Var = c0Var6;
                            return (SourceFetchResult) objH;
                        }
                    }
                    return objE;
                }
                try {
                    request = readResult.getRequest();
                    if (request == null) {
                        try {
                            request = l();
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            c0Var = c0Var3;
                            cVar2 = (n6.a.c) c0Var.f22552a;
                            if (cVar2 == null) {
                                throw exc;
                            }
                            u6.e.c(cVar2);
                            throw exc;
                        }
                    }
                    networkRequest = request;
                    try {
                        e eVar2 = new e(c0Var3, this, c0Var5, networkRequest, null);
                        cVar.f31628t = c0Var3;
                        cVar.f31629u = pt.l.a(readResult);
                        cVar.f31630v = pt.l.a(c0Var5);
                        cVar.f31631w = pt.l.a(networkRequest);
                        cVar.A = 2;
                        objH = h(networkRequest, eVar2, cVar);
                        if (objH != objE) {
                            c0Var6 = c0Var3;
                            c0Var7 = c0Var5;
                            networkRequest2 = networkRequest;
                            sourceFetchResult = (SourceFetchResult) objH;
                            if (sourceFetchResult != null) {
                                return sourceFetchResult;
                            }
                            NetworkRequest networkRequestL3 = l();
                            d dVar2 = new d(null);
                            cVar.f31628t = c0Var6;
                            cVar.f31629u = pt.l.a(readResult);
                            cVar.f31630v = pt.l.a(c0Var7);
                            cVar.f31631w = pt.l.a(networkRequest2);
                            cVar.f31632x = pt.l.a(sourceFetchResult);
                            cVar.A = 3;
                            objH = h(networkRequestL3, dVar2, cVar);
                            if (objH != objE) {
                                c0Var = c0Var6;
                                return (SourceFetchResult) objH;
                            }
                        }
                        return objE;
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        c0Var = c0Var3;
                        cVar2 = (n6.a.c) c0Var.f22552a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        u6.e.c(cVar2);
                        throw exc;
                    }
                } catch (Exception e12) {
                    exc = e12;
                    c0Var = c0Var3;
                    cVar2 = (n6.a.c) c0Var.f22552a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    u6.e.c(cVar2);
                    throw exc;
                }
            } catch (Exception e13) {
                e = e13;
                c0Var = c0Var8;
                exc = e;
                cVar2 = (n6.a.c) c0Var.f22552a;
                if (cVar2 == null) {
                    throw exc;
                }
                u6.e.c(cVar2);
                throw exc;
            }
            cVar2 = (n6.a.c) c0Var.f22552a;
            if (cVar2 == null) {
                throw exc;
            }
            u6.e.c(cVar2);
            throw exc;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                networkRequest2 = (NetworkRequest) cVar.f31631w;
                c0Var7 = (c0) cVar.f31630v;
                readResult = (t6.b.ReadResult) cVar.f31629u;
                c0Var6 = (c0) cVar.f31628t;
                try {
                    jt.o.b(objH);
                    try {
                        sourceFetchResult = (SourceFetchResult) objH;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestL4 = l();
                        d dVar3 = new d(null);
                        cVar.f31628t = c0Var6;
                        cVar.f31629u = pt.l.a(readResult);
                        cVar.f31630v = pt.l.a(c0Var7);
                        cVar.f31631w = pt.l.a(networkRequest2);
                        cVar.f31632x = pt.l.a(sourceFetchResult);
                        cVar.A = 3;
                        objH = h(networkRequestL4, dVar3, cVar);
                        if (objH != objE) {
                            c0Var = c0Var6;
                        }
                        return objE;
                    } catch (Exception e14) {
                        exc = e14;
                        c0Var = c0Var6;
                        cVar2 = (n6.a.c) c0Var.f22552a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        u6.e.c(cVar2);
                        throw exc;
                    }
                } catch (Exception e15) {
                    exc = e15;
                    c0Var = c0Var6;
                    cVar2 = (n6.a.c) c0Var.f22552a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    u6.e.c(cVar2);
                    throw exc;
                }
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) cVar.f31628t;
            try {
                jt.o.b(objH);
            } catch (Exception e16) {
                exc = e16;
            }
            try {
                return (SourceFetchResult) objH;
            } catch (Exception e17) {
                e = e17;
                exc = e;
                cVar2 = (n6.a.c) c0Var.f22552a;
                if (cVar2 == null) {
                    throw exc;
                }
                u6.e.c(cVar2);
                throw exc;
            }
        }
        c0Var2 = (c0) cVar.f31629u;
        c0Var4 = (c0) cVar.f31628t;
        try {
            jt.o.b(objH);
        } catch (Exception e18) {
            exc = e18;
            c0Var = c0Var4;
        }
        t6.b.ReadResult readResult2 = (t6.b.ReadResult) objH;
        if (readResult2.getResponse() != null) {
            return new SourceFetchResult(o((n6.a.c) c0Var4.f22552a), k(this.url, readResult2.getResponse().getHeaders().c("Content-Type")), m6.f.DISK);
        }
        c0Var3 = c0Var4;
        readResult = readResult2;
        c0Var5 = c0Var2;
        if (readResult != null) {
            request = l();
            networkRequest = request;
            e eVar3 = new e(c0Var3, this, c0Var5, networkRequest, null);
            cVar.f31628t = c0Var3;
            cVar.f31629u = pt.l.a(readResult);
            cVar.f31630v = pt.l.a(c0Var5);
            cVar.f31631w = pt.l.a(networkRequest);
            cVar.A = 2;
            objH = h(networkRequest, eVar3, cVar);
            if (objH != objE) {
                c0Var6 = c0Var3;
                c0Var7 = c0Var5;
                networkRequest2 = networkRequest;
                sourceFetchResult = (SourceFetchResult) objH;
                if (sourceFetchResult != null) {
                    return sourceFetchResult;
                }
                NetworkRequest networkRequestL5 = l();
                d dVar4 = new d(null);
                cVar.f31628t = c0Var6;
                cVar.f31629u = pt.l.a(readResult);
                cVar.f31630v = pt.l.a(c0Var7);
                cVar.f31631w = pt.l.a(networkRequest2);
                cVar.f31632x = pt.l.a(sourceFetchResult);
                cVar.A = 3;
                objH = h(networkRequestL5, dVar4, cVar);
                if (objH != objE) {
                    c0Var = c0Var6;
                    return (SourceFetchResult) objH;
                }
            }
            return objE;
        }
        request = readResult.getRequest();
        if (request == null) {
            request = l();
        }
        networkRequest = request;
        e eVar4 = new e(c0Var3, this, c0Var5, networkRequest, null);
        cVar.f31628t = c0Var3;
        cVar.f31629u = pt.l.a(readResult);
        cVar.f31630v = pt.l.a(c0Var5);
        cVar.f31631w = pt.l.a(networkRequest);
        cVar.A = 2;
        objH = h(networkRequest, eVar4, cVar);
        if (objH != objE) {
            c0Var6 = c0Var3;
            c0Var7 = c0Var5;
            networkRequest2 = networkRequest;
            sourceFetchResult = (SourceFetchResult) objH;
            if (sourceFetchResult != null) {
                return sourceFetchResult;
            }
            NetworkRequest networkRequestL6 = l();
            d dVar5 = new d(null);
            cVar.f31628t = c0Var6;
            cVar.f31629u = pt.l.a(readResult);
            cVar.f31630v = pt.l.a(c0Var7);
            cVar.f31631w = pt.l.a(networkRequest2);
            cVar.f31632x = pt.l.a(sourceFetchResult);
            cVar.A = 3;
            objH = h(networkRequestL6, dVar5, cVar);
            if (objH != objE) {
                c0Var = c0Var6;
                return (SourceFetchResult) objH;
            }
        }
        return objE;
        cVar2 = (n6.a.c) c0Var.f22552a;
        if (cVar2 == null) {
            throw exc;
        }
        u6.e.c(cVar2);
        throw exc;
    }

    public final <T> Object h(NetworkRequest networkRequest, Function2<? super NetworkResponse, ? super nt.b<? super T>, ? extends Object> function2, nt.b<? super T> bVar) {
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            u6.f.a();
        }
        return this.networkClient.getValue().a(networkRequest, new b(function2, null), bVar);
    }

    public final String i() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    public final xu.l j() {
        xu.l fileSystem;
        n6.a value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    @Nullable
    public final String k(@NotNull String url, @Nullable String contentType) {
        String strB;
        if ((contentType == null || x.T(contentType, "text/plain", false, 2, null)) && (strB = e7.x.f15217a.b(url)) != null) {
            return strB;
        }
        if (contentType != null) {
            return StringsKt.i1(contentType, ';', null, 2, null);
        }
        return null;
    }

    public final NetworkRequest l() {
        NetworkHeaders.a aVarD = h.b(this.options).d();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z10 = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.c();
        if (!z10 && readEnabled) {
            aVarD.c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z10 || readEnabled) {
            if (!z10 && !readEnabled) {
                aVarD.c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            aVarD.c("Cache-Control", "no-cache");
        } else {
            aVarD.c("Cache-Control", "no-cache, no-store");
        }
        return new NetworkRequest(this.url, h.c(this.options), aVarD.b(), h.a(this.options), this.options.getExtras());
    }

    public final n6.a.c m() {
        n6.a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.b(i());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(r rVar, nt.b<? super m6.s> bVar) {
        f fVar;
        xu.e eVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f31649x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f31649x = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f31647v;
        Object objE = ot.c.e();
        int i11 = fVar.f31649x;
        if (i11 == 0) {
            jt.o.b(obj);
            xu.e eVar2 = new xu.e();
            fVar.f31645t = pt.l.a(rVar);
            fVar.f31646u = eVar2;
            fVar.f31649x = 1;
            if (rVar.x(eVar2, fVar) == objE) {
                return objE;
            }
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (xu.e) fVar.f31646u;
            jt.o.b(obj);
        }
        return p(eVar);
    }

    public final m6.s o(n6.a.c cVar) {
        return t.d(cVar.getData(), j(), i(), cVar, null, 16, null);
    }

    public final m6.s p(xu.e eVar) {
        return t.c(eVar, j(), null, 4, null);
    }

    public final NetworkResponse q(n6.a.c cVar) throws Throwable {
        Throwable th2;
        NetworkResponse networkResponseA;
        try {
            xu.g gVarC = b0.c(j().source(cVar.getMetadata()));
            try {
                networkResponseA = t6.a.f31604a.a(gVarC);
                if (gVarC != null) {
                    try {
                        gVarC.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (gVarC != null) {
                    try {
                        gVarC.close();
                    } catch (Throwable th5) {
                        jt.a.a(th4, th5);
                    }
                }
                th2 = th4;
                networkResponseA = null;
            }
            if (th2 == null) {
                return networkResponseA;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x010e A[Catch: Exception -> 0x0105, TryCatch #4 {Exception -> 0x0105, blocks: (B:42:0x00d7, B:59:0x010e, B:61:0x0114, B:67:0x014b, B:55:0x0101, B:52:0x00fc, B:43:0x00e8), top: B:83:0x00d7, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114 A[Catch: Exception -> 0x0105, TRY_LEAVE, TryCatch #4 {Exception -> 0x0105, blocks: (B:42:0x00d7, B:59:0x010e, B:61:0x0114, B:67:0x014b, B:55:0x0101, B:52:0x00fc, B:43:0x00e8), top: B:83:0x00d7, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014b A[Catch: Exception -> 0x0105, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0105, blocks: (B:42:0x00d7, B:59:0x010e, B:61:0x0114, B:67:0x014b, B:55:0x0101, B:52:0x00fc, B:43:0x00e8), top: B:83:0x00d7, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r0.I2(r3, r4, r6) == r7) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(n6.a.c r11, t6.NetworkResponse r12, t6.NetworkRequest r13, t6.NetworkResponse r14, nt.b<? super n6.a.c> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.r(n6.a$c, t6.q, t6.o, t6.q, nt.b):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lt6/m$a;", "Lo6/j$a;", "Lk6/h0;", "Lkotlin/Function0;", "Lt6/i;", "networkClient", "Lt6/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lt6/d;", "connectivityChecker", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "data", "", "g", "(Lk6/h0;)Z", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "e", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "Ljt/h;", "a", "Ljt/h;", "networkClientLazy", "b", "cacheStrategyLazy", "Lu6/b;", "c", "Lu6/b;", "connectivityCheckerLazy", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements o6.j.a<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final jt.h<i> networkClientLazy;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final jt.h<t6.b> cacheStrategyLazy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final u6.b<Context, t6.d> connectivityCheckerLazy;

        /* JADX INFO: renamed from: t6.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0565a extends kotlin.jvm.internal.k implements Function1<Context, t6.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0565a f31624a = new C0565a();

            public C0565a() {
                super(1, t6.f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final t6.d invoke(Context context) {
                return t6.f.a(context);
            }
        }

        public a(@NotNull Function0<? extends i> function0, @NotNull Function0<? extends t6.b> function1, @NotNull Function1<? super Context, ? extends t6.d> function2) {
            this.networkClientLazy = jt.i.b(function0);
            this.cacheStrategyLazy = jt.i.b(function1);
            this.connectivityCheckerLazy = u6.c.a(function2);
        }

        public static final t6.b d() {
            return t6.b.b;
        }

        public static final n6.a f(k6.s sVar) {
            return sVar.b();
        }

        private final boolean g(h0 data) {
            return Intrinsics.c(data.getScheme(), "http") || Intrinsics.c(data.getScheme(), "https");
        }

        @Override // o6.j.a
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public o6.j a(@NotNull h0 data, @NotNull Options options, @NotNull final k6.s imageLoader) {
            if (g(data)) {
                return new m(data.getData(), options, this.networkClientLazy, jt.i.b(new Function0() { // from class: t6.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.a.f(imageLoader);
                    }
                }), this.cacheStrategyLazy, this.connectivityCheckerLazy.a(options.getContext()));
            }
            return null;
        }

        public /* synthetic */ a(Function0 function0, Function0 function1, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i10 & 2) != 0 ? new Function0() { // from class: t6.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.a.d();
                }
            } : function1, (i10 & 4) != 0 ? C0565a.f31624a : function2);
        }
    }
}
