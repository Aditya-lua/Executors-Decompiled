package u6;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import ew.b0;
import ew.v;
import java.io.IOException;
import l6.h0;
import n6.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;
import p6.SourceFetchResult;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JB\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00020\u001d2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0006\u0012\u0004\u0018\u00010(0&H\u0082@¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u0004\u0018\u00010\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020.*\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u00020.*\u000201H\u0082@¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u00020.*\u000204H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lu6/m;", "Lp6/j;", BuildConfig.FLAVOR, "url", "Ly6/p;", "options", "Lzt/h;", "Lu6/i;", "networkClient", "Lo6/a;", "diskCache", "Lu6/b;", "cacheStrategy", "Lu6/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Ly6/p;Lzt/h;Lzt/h;Lzt/h;Lu6/d;)V", "Lp6/i;", "a", "(Leu/b;)Ljava/lang/Object;", "contentType", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lo6/a$c;", "m", "()Lo6/a$c;", "snapshot", "Lu6/q;", "cacheResponse", "Lu6/o;", "networkRequest", "networkResponse", "r", "(Lo6/a$c;Lu6/q;Lu6/o;Lu6/q;Leu/b;)Ljava/lang/Object;", "l", "()Lu6/o;", "T", "request", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "block", "h", "(Lu6/o;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "q", "(Lo6/a$c;)Lu6/q;", "Ln6/s;", "p", "(Lo6/a$c;)Ln6/s;", "Lu6/r;", "n", "(Lu6/r;Leu/b;)Ljava/lang/Object;", "Lew/e;", "o", "(Lew/e;)Ln6/s;", "Ljava/lang/String;", "b", "Ly6/p;", "c", "Lzt/h;", "d", "e", "f", "Lu6/d;", "i", "()Ljava/lang/String;", "diskCacheKey", "Lew/k;", "j", "()Lew/k;", "fileSystem", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements p6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h<i> networkClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h<o6.a> diskCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h<u6.b> cacheStrategy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u6.d connectivityChecker;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lu6/q;", Payload.RESPONSE, "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend")
    public static final class b<T> extends gu.m implements Function2<NetworkResponse, eu.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33191t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33192u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<NetworkResponse, eu.b<? super T>, Object> f33193v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super NetworkResponse, ? super eu.b<? super T>, ? extends Object> function2, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f33193v = function2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.f33193v, bVar);
            bVar2.f33192u = obj;
            return bVar2;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f33192u;
            Object objE = fu.c.e();
            int i10 = this.f33191t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            int code = networkResponse.getCode();
            if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
                throw new u6.g(networkResponse);
            }
            Function2<NetworkResponse, eu.b<? super T>, Object> function2 = this.f33193v;
            this.f33192u = gu.l.a(networkResponse);
            this.f33191t = 1;
            Object objInvoke = function2.invoke(networkResponse, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, eu.b<? super T> bVar) {
            return ((b) create(networkResponse, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, MlKitException.MODEL_HASH_MISMATCH}, m = "fetch")
    public static final class c extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33194t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33195u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33196v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33197w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f33198x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f33199y;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33199y = obj;
            this.A |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu6/q;", Payload.RESPONSE, "Lp6/o;", "<anonymous>", "(Lu6/q;)Lp6/o;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<NetworkResponse, eu.b<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33201t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33202u;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = m.this.new d(bVar);
            dVar.f33202u = obj;
            return dVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f33202u;
            Object objE = fu.c.e();
            int i10 = this.f33201t;
            if (i10 == 0) {
                zt.o.b(obj);
                m mVar = m.this;
                r rVarF = v6.e.f(networkResponse);
                this.f33202u = networkResponse;
                this.f33201t = 1;
                obj = mVar.n(rVarF, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            m mVar2 = m.this;
            return new SourceFetchResult((n6.s) obj, mVar2.k(mVar2.url, networkResponse.getHeaders().c("Content-Type")), n6.f.NETWORK);
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, eu.b<? super SourceFetchResult> bVar) {
            return ((d) create(networkResponse, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu6/q;", Payload.RESPONSE, "Lp6/o;", "<anonymous>", "(Lu6/q;)Lp6/o;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<NetworkResponse, eu.b<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33204t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33205u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33206v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<o6.a.c> f33207w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ m f33208x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ c0<NetworkResponse> f33209y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ NetworkRequest f33210z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0<o6.a.c> c0Var, m mVar, c0<NetworkResponse> c0Var2, NetworkRequest networkRequest, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f33207w = c0Var;
            this.f33208x = mVar;
            this.f33209y = c0Var2;
            this.f33210z = networkRequest;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = new e(this.f33207w, this.f33208x, this.f33209y, this.f33210z, bVar);
            eVar.f33206v = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        
            if (r12 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v9, types: [T, u6.q] */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            e eVar;
            c0<o6.a.c> c0Var;
            T t8;
            NetworkHeaders headers;
            Object obj2;
            NetworkResponse networkResponse = (NetworkResponse) this.f33206v;
            Object objE = fu.c.e();
            int i10 = this.f33205u;
            String strC = null;
            if (i10 == 0) {
                zt.o.b(obj);
                c0<o6.a.c> c0Var2 = this.f33207w;
                m mVar = this.f33208x;
                o6.a.c cVar = c0Var2.f21575a;
                NetworkResponse networkResponse2 = this.f33209y.f21575a;
                NetworkRequest networkRequest = this.f33210z;
                this.f33206v = networkResponse;
                this.f33204t = c0Var2;
                this.f33205u = 1;
                eVar = this;
                Object objR = mVar.r(cVar, networkResponse2, networkRequest, networkResponse, eVar);
                if (objR != objE) {
                    c0Var = c0Var2;
                    t8 = objR;
                }
                return objE;
            }
            if (i10 == 1) {
                c0Var = (c0) this.f33204t;
                zt.o.b(obj);
                eVar = this;
                t8 = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                eVar = this;
                obj2 = obj;
            }
            ew.e eVar2 = (ew.e) obj2;
            if (eVar2.getSize() <= 0) {
                return null;
            }
            n6.s sVarO = eVar.f33208x.o(eVar2);
            m mVar2 = eVar.f33208x;
            return new SourceFetchResult(sVarO, mVar2.k(mVar2.url, networkResponse.getHeaders().c("Content-Type")), n6.f.NETWORK);
            c0Var.f21575a = t8;
            o6.a.c cVar2 = eVar.f33207w.f21575a;
            if (cVar2 != null) {
                c0<NetworkResponse> c0Var3 = eVar.f33209y;
                m mVar3 = eVar.f33208x;
                Intrinsics.checkNotNull(cVar2);
                c0Var3.f21575a = mVar3.q(cVar2);
                m mVar4 = eVar.f33208x;
                o6.a.c cVar3 = eVar.f33207w.f21575a;
                Intrinsics.checkNotNull(cVar3);
                n6.s sVarP = mVar4.p(cVar3);
                m mVar5 = eVar.f33208x;
                String str = mVar5.url;
                NetworkResponse networkResponse3 = eVar.f33209y.f21575a;
                if (networkResponse3 != null && (headers = networkResponse3.getHeaders()) != null) {
                    strC = headers.c("Content-Type");
                }
                return new SourceFetchResult(sVarP, mVar5.k(str, strC), n6.f.NETWORK);
            }
            r rVarF = v6.e.f(networkResponse);
            eVar.f33206v = networkResponse;
            eVar.f33204t = null;
            eVar.f33205u = 2;
            Object objE2 = v6.e.e(rVarF, this);
            obj2 = objE2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, eu.b<? super SourceFetchResult> bVar) {
            return ((e) create(networkResponse, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
    public static final class f extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33211t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33212u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33213v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33215x;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33213v = obj;
            this.f33215x |= Integer.MIN_VALUE;
            return m.this.n(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
    public static final class g extends gu.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33216t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33217u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33218v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33219w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f33220x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f33221y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f33222z;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return m.this.r(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull String str, @NotNull Options options, @NotNull zt.h<? extends i> hVar, @NotNull zt.h<? extends o6.a> hVar2, @NotNull zt.h<? extends u6.b> hVar3, @NotNull u6.d dVar) {
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
    /* JADX WARN: Type inference failed for: r2v1, types: [T, o6.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, u6.q] */
    @Override // p6.j
    @Nullable
    public Object a(@NotNull eu.b<? super p6.i> bVar) throws Exception {
        c cVar;
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        u6.b.ReadResult readResult;
        c0 c0Var4;
        Exception exc;
        c0 c0Var5;
        NetworkRequest request;
        NetworkRequest networkRequest;
        c0 c0Var6;
        c0 c0Var7;
        NetworkRequest networkRequest2;
        SourceFetchResult sourceFetchResult;
        o6.a.c cVar2;
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
        Object objH = cVar.f33199y;
        Object objE = fu.c.e();
        int i11 = cVar.A;
        if (i11 == 0) {
            zt.o.b(objH);
            c0 c0Var8 = new c0();
            c0Var8.f21575a = m();
            try {
                c0Var2 = new c0();
                if (c0Var8.f21575a != 0) {
                    Long size = j().o(((o6.a.c) c0Var8.f21575a).getMetadata()).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new SourceFetchResult(p((o6.a.c) c0Var8.f21575a), k(this.url, null), n6.f.DISK);
                    }
                    ?? Q = q((o6.a.c) c0Var8.f21575a);
                    c0Var2.f21575a = Q;
                    if (Q != 0) {
                        u6.b value = this.cacheStrategy.getValue();
                        NetworkResponse networkResponse = (NetworkResponse) c0Var2.f21575a;
                        NetworkRequest networkRequestL = l();
                        Options options = this.options;
                        cVar.f33194t = c0Var8;
                        cVar.f33195u = c0Var2;
                        cVar.A = 1;
                        Object objA = value.a(networkResponse, networkRequestL, options, cVar);
                        if (objA != objE) {
                            c0Var4 = c0Var8;
                            objH = objA;
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
                    cVar.f33194t = c0Var3;
                    cVar.f33195u = gu.l.a(readResult);
                    cVar.f33196v = gu.l.a(c0Var5);
                    cVar.f33197w = gu.l.a(networkRequest);
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
                        cVar.f33194t = c0Var6;
                        cVar.f33195u = gu.l.a(readResult);
                        cVar.f33196v = gu.l.a(c0Var7);
                        cVar.f33197w = gu.l.a(networkRequest2);
                        cVar.f33198x = gu.l.a(sourceFetchResult);
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
                            cVar2 = (o6.a.c) c0Var.f21575a;
                            if (cVar2 == null) {
                                throw exc;
                            }
                            v6.e.c(cVar2);
                            throw exc;
                        }
                    }
                    networkRequest = request;
                    try {
                        e eVar2 = new e(c0Var3, this, c0Var5, networkRequest, null);
                        cVar.f33194t = c0Var3;
                        cVar.f33195u = gu.l.a(readResult);
                        cVar.f33196v = gu.l.a(c0Var5);
                        cVar.f33197w = gu.l.a(networkRequest);
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
                            cVar.f33194t = c0Var6;
                            cVar.f33195u = gu.l.a(readResult);
                            cVar.f33196v = gu.l.a(c0Var7);
                            cVar.f33197w = gu.l.a(networkRequest2);
                            cVar.f33198x = gu.l.a(sourceFetchResult);
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
                        cVar2 = (o6.a.c) c0Var.f21575a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        v6.e.c(cVar2);
                        throw exc;
                    }
                } catch (Exception e12) {
                    exc = e12;
                    c0Var = c0Var3;
                    cVar2 = (o6.a.c) c0Var.f21575a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    v6.e.c(cVar2);
                    throw exc;
                }
            } catch (Exception e13) {
                e = e13;
                c0Var = c0Var8;
                exc = e;
                cVar2 = (o6.a.c) c0Var.f21575a;
                if (cVar2 == null) {
                    throw exc;
                }
                v6.e.c(cVar2);
                throw exc;
            }
            cVar2 = (o6.a.c) c0Var.f21575a;
            if (cVar2 == null) {
                throw exc;
            }
            v6.e.c(cVar2);
            throw exc;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                networkRequest2 = (NetworkRequest) cVar.f33197w;
                c0Var7 = (c0) cVar.f33196v;
                readResult = (u6.b.ReadResult) cVar.f33195u;
                c0Var6 = (c0) cVar.f33194t;
                try {
                    zt.o.b(objH);
                    try {
                        sourceFetchResult = (SourceFetchResult) objH;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestL4 = l();
                        d dVar3 = new d(null);
                        cVar.f33194t = c0Var6;
                        cVar.f33195u = gu.l.a(readResult);
                        cVar.f33196v = gu.l.a(c0Var7);
                        cVar.f33197w = gu.l.a(networkRequest2);
                        cVar.f33198x = gu.l.a(sourceFetchResult);
                        cVar.A = 3;
                        objH = h(networkRequestL4, dVar3, cVar);
                        if (objH != objE) {
                            c0Var = c0Var6;
                        }
                        return objE;
                    } catch (Exception e14) {
                        exc = e14;
                        c0Var = c0Var6;
                        cVar2 = (o6.a.c) c0Var.f21575a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        v6.e.c(cVar2);
                        throw exc;
                    }
                } catch (Exception e15) {
                    exc = e15;
                    c0Var = c0Var6;
                    cVar2 = (o6.a.c) c0Var.f21575a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    v6.e.c(cVar2);
                    throw exc;
                }
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) cVar.f33194t;
            try {
                zt.o.b(objH);
            } catch (Exception e16) {
                exc = e16;
            }
            try {
                return (SourceFetchResult) objH;
            } catch (Exception e17) {
                e = e17;
                exc = e;
                cVar2 = (o6.a.c) c0Var.f21575a;
                if (cVar2 == null) {
                    throw exc;
                }
                v6.e.c(cVar2);
                throw exc;
            }
        }
        c0Var2 = (c0) cVar.f33195u;
        c0Var4 = (c0) cVar.f33194t;
        try {
            zt.o.b(objH);
        } catch (Exception e18) {
            exc = e18;
            c0Var = c0Var4;
        }
        u6.b.ReadResult readResult2 = (u6.b.ReadResult) objH;
        if (readResult2.getResponse() != null) {
            return new SourceFetchResult(p((o6.a.c) c0Var4.f21575a), k(this.url, readResult2.getResponse().getHeaders().c("Content-Type")), n6.f.DISK);
        }
        c0Var3 = c0Var4;
        readResult = readResult2;
        c0Var5 = c0Var2;
        if (readResult != null) {
            request = l();
            networkRequest = request;
            e eVar3 = new e(c0Var3, this, c0Var5, networkRequest, null);
            cVar.f33194t = c0Var3;
            cVar.f33195u = gu.l.a(readResult);
            cVar.f33196v = gu.l.a(c0Var5);
            cVar.f33197w = gu.l.a(networkRequest);
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
                cVar.f33194t = c0Var6;
                cVar.f33195u = gu.l.a(readResult);
                cVar.f33196v = gu.l.a(c0Var7);
                cVar.f33197w = gu.l.a(networkRequest2);
                cVar.f33198x = gu.l.a(sourceFetchResult);
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
        cVar.f33194t = c0Var3;
        cVar.f33195u = gu.l.a(readResult);
        cVar.f33196v = gu.l.a(c0Var5);
        cVar.f33197w = gu.l.a(networkRequest);
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
            cVar.f33194t = c0Var6;
            cVar.f33195u = gu.l.a(readResult);
            cVar.f33196v = gu.l.a(c0Var7);
            cVar.f33197w = gu.l.a(networkRequest2);
            cVar.f33198x = gu.l.a(sourceFetchResult);
            cVar.A = 3;
            objH = h(networkRequestL6, dVar5, cVar);
            if (objH != objE) {
                c0Var = c0Var6;
                return (SourceFetchResult) objH;
            }
        }
        return objE;
        cVar2 = (o6.a.c) c0Var.f21575a;
        if (cVar2 == null) {
            throw exc;
        }
        v6.e.c(cVar2);
        throw exc;
    }

    public final <T> Object h(NetworkRequest networkRequest, Function2<? super NetworkResponse, ? super eu.b<? super T>, ? extends Object> function2, eu.b<? super T> bVar) {
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            v6.f.a();
        }
        return this.networkClient.getValue().a(networkRequest, new b(function2, null), bVar);
    }

    public final String i() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    public final ew.k j() {
        ew.k fileSystem;
        o6.a value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    @Nullable
    public final String k(@NotNull String url, @Nullable String contentType) {
        String strB;
        if ((contentType == null || x.T(contentType, "text/plain", false, 2, null)) && (strB = f7.x.f15671a.b(url)) != null) {
            return strB;
        }
        if (contentType != null) {
            return StringsKt.g1(contentType, ';', null, 2, null);
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

    public final o6.a.c m() {
        o6.a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.b(i());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(r rVar, eu.b<? super n6.s> bVar) {
        f fVar;
        ew.e eVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f33215x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f33215x = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f33213v;
        Object objE = fu.c.e();
        int i11 = fVar.f33215x;
        if (i11 == 0) {
            zt.o.b(obj);
            ew.e eVar2 = new ew.e();
            fVar.f33211t = gu.l.a(rVar);
            fVar.f33212u = eVar2;
            fVar.f33215x = 1;
            if (rVar.D(eVar2, fVar) == objE) {
                return objE;
            }
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (ew.e) fVar.f33212u;
            zt.o.b(obj);
        }
        return o(eVar);
    }

    public final n6.s o(ew.e eVar) {
        return t.c(eVar, j(), null, 4, null);
    }

    public final n6.s p(o6.a.c cVar) {
        return t.d(cVar.getData(), j(), i(), cVar, null, 16, null);
    }

    public final NetworkResponse q(o6.a.c cVar) throws Throwable {
        Throwable th2;
        NetworkResponse networkResponseA;
        try {
            ew.g gVarC = v.c(j().w(cVar.getMetadata()));
            try {
                networkResponseA = u6.a.f33170a.a(gVarC);
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
                        zt.a.a(th4, th5);
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
    
        if (r0.P(r3, r4, r6) == r7) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(o6.a.c cVar, NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, eu.b<? super o6.a.c> bVar) throws Exception {
        g gVar;
        NetworkResponse networkResponse3;
        NetworkRequest networkRequest2;
        NetworkResponse networkResponse4;
        o6.a.b bVar2;
        o6.a.b bVarA;
        NetworkResponse networkResponse5;
        NetworkResponse networkResponse6;
        Exception exc;
        o6.a.b bVar3;
        ew.f fVarB;
        r body;
        r body2;
        r body3;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.C = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        g gVar2 = gVar;
        Object objB = gVar2.A;
        Object objE = fu.c.e();
        int i11 = gVar2.C;
        Throwable th2 = null;
        if (i11 == 0) {
            zt.o.b(objB);
            if (!this.options.getDiskCachePolicy().getWriteEnabled()) {
                if (cVar != null) {
                    v6.e.c(cVar);
                }
                return null;
            }
            u6.b value = this.cacheStrategy.getValue();
            Options options = this.options;
            gVar2.f33216t = cVar;
            gVar2.f33217u = gu.l.a(networkResponse);
            gVar2.f33218v = gu.l.a(networkRequest);
            gVar2.f33219w = networkResponse2;
            gVar2.C = 1;
            objB = value.b(networkResponse, networkRequest, networkResponse2, options, gVar2);
            if (objB != objE) {
                networkResponse3 = networkResponse;
                networkRequest2 = networkRequest;
                networkResponse4 = networkResponse2;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar3 = (o6.a.b) gVar2.f33222z;
            networkResponse6 = (NetworkResponse) gVar2.f33221y;
            networkResponse5 = (NetworkResponse) gVar2.f33219w;
            try {
                zt.o.b(objB);
                return bVar3.b();
            } catch (Exception e10) {
                exc = e10;
                v6.e.a(bVar3);
                body2 = networkResponse5.getBody();
                if (body2 != null) {
                    v6.e.c(body2);
                }
                body3 = networkResponse6.getBody();
                if (body3 != null) {
                    throw exc;
                }
                v6.e.c(body3);
                throw exc;
            }
        }
        networkResponse4 = (NetworkResponse) gVar2.f33219w;
        networkRequest2 = (NetworkRequest) gVar2.f33218v;
        networkResponse3 = (NetworkResponse) gVar2.f33217u;
        cVar = (o6.a.c) gVar2.f33216t;
        zt.o.b(objB);
        u6.b.WriteResult writeResult = (u6.b.WriteResult) objB;
        NetworkResponse response = writeResult.getResponse();
        if (response == null) {
            return null;
        }
        if (cVar == null) {
            o6.a value2 = this.diskCache.getValue();
            if (value2 != null) {
                bVarA = value2.a(i());
            } else {
                bVar2 = null;
            }
            if (bVar2 == null) {
                return null;
            }
            try {
                fVarB = v.b(j().u(bVar2.getMetadata(), false));
                try {
                    u6.a.f33170a.b(response, fVarB);
                    Unit unit = Unit.f21506a;
                    if (fVarB != null) {
                        try {
                            fVarB.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (fVarB != null) {
                        try {
                            fVarB.close();
                        } catch (Throwable th5) {
                            zt.a.a(th2, th5);
                        }
                    }
                }
                if (th2 == null) {
                    throw th2;
                }
                body = response.getBody();
                if (body != null) {
                    ew.k kVarJ = j();
                    b0 data = bVar2.getData();
                    gVar2.f33216t = gu.l.a(cVar);
                    gVar2.f33217u = gu.l.a(networkResponse3);
                    gVar2.f33218v = gu.l.a(networkRequest2);
                    gVar2.f33219w = networkResponse4;
                    gVar2.f33220x = gu.l.a(writeResult);
                    gVar2.f33221y = response;
                    gVar2.f33222z = bVar2;
                    gVar2.C = 2;
                }
                networkResponse5 = networkResponse4;
                networkResponse6 = response;
                bVar3 = bVar2;
                return bVar3.b();
            } catch (Exception e11) {
                networkResponse5 = networkResponse4;
                networkResponse6 = response;
                exc = e11;
                bVar3 = bVar2;
                v6.e.a(bVar3);
                body2 = networkResponse5.getBody();
                if (body2 != null) {
                    v6.e.c(body2);
                }
                body3 = networkResponse6.getBody();
                if (body3 != null) {
                    throw exc;
                }
                v6.e.c(body3);
                throw exc;
            }
        }
        bVarA = cVar.v2();
        bVar2 = bVarA;
        if (bVar2 == null) {
            return null;
        }
        fVarB = v.b(j().u(bVar2.getMetadata(), false));
        u6.a.f33170a.b(response, fVarB);
        Unit unit2 = Unit.f21506a;
        if (fVarB != null) {
            fVarB.close();
        }
        if (th2 == null) {
            throw th2;
        }
        body = response.getBody();
        if (body != null) {
            ew.k kVarJ2 = j();
            b0 data2 = bVar2.getData();
            gVar2.f33216t = gu.l.a(cVar);
            gVar2.f33217u = gu.l.a(networkResponse3);
            gVar2.f33218v = gu.l.a(networkRequest2);
            gVar2.f33219w = networkResponse4;
            gVar2.f33220x = gu.l.a(writeResult);
            gVar2.f33221y = response;
            gVar2.f33222z = bVar2;
            gVar2.C = 2;
        }
        networkResponse5 = networkResponse4;
        networkResponse6 = response;
        bVar3 = bVar2;
        return bVar3.b();
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lu6/m$a;", "Lp6/j$a;", "Ll6/h0;", "Lkotlin/Function0;", "Lu6/i;", "networkClient", "Lu6/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lu6/d;", "connectivityChecker", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "data", BuildConfig.FLAVOR, "g", "(Ll6/h0;)Z", "Ly6/p;", "options", "Ll6/s;", "imageLoader", "Lp6/j;", "e", "(Ll6/h0;Ly6/p;Ll6/s;)Lp6/j;", "Lzt/h;", "a", "Lzt/h;", "networkClientLazy", "b", "cacheStrategyLazy", "Lv6/b;", "c", "Lv6/b;", "connectivityCheckerLazy", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements p6.j.a<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zt.h<i> networkClientLazy;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final zt.h<u6.b> cacheStrategyLazy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final v6.b<Context, u6.d> connectivityCheckerLazy;

        /* JADX INFO: renamed from: u6.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0670a extends p001kotlin.jvm.internal.k implements Function1<Context, u6.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0670a f33190a = new C0670a();

            public C0670a() {
                super(1, u6.f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final u6.d invoke(Context context) {
                return u6.f.a(context);
            }
        }

        public a(@NotNull Function0<? extends i> function0, @NotNull Function0<? extends u6.b> function1, @NotNull Function1<? super Context, ? extends u6.d> function2) {
            this.networkClientLazy = zt.i.a(function0);
            this.cacheStrategyLazy = zt.i.a(function1);
            this.connectivityCheckerLazy = v6.c.a(function2);
        }

        public static final u6.b d() {
            return u6.b.b;
        }

        public static final o6.a f(l6.s sVar) {
            return sVar.c();
        }

        private final boolean g(h0 data) {
            return Intrinsics.c(data.getScheme(), "http") || Intrinsics.c(data.getScheme(), "https");
        }

        @Override // p6.j.a
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p6.j a(@NotNull h0 data, @NotNull Options options, @NotNull final l6.s imageLoader) {
            if (g(data)) {
                return new m(data.getData(), options, this.networkClientLazy, zt.i.a(new Function0() { // from class: u6.k
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.a.f(imageLoader);
                    }
                }), this.cacheStrategyLazy, this.connectivityCheckerLazy.a(options.getContext()));
            }
            return null;
        }

        public /* synthetic */ a(Function0 function0, Function0 function1, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i10 & 2) != 0 ? new Function0() { // from class: u6.l
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.a.d();
                }
            } : function1, (i10 & 4) != 0 ? C0670a.f33190a : function2);
        }
    }
}
