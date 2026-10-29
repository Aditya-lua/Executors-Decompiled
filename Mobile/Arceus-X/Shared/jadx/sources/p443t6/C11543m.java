package p443t6;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4878x;
import p229jt.C7328a;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p239k6.C7466h0;
import p239k6.InterfaceC7479s;
import p287m6.C8446t;
import p287m6.EnumC8432f;
import p287m6.InterfaceC8445s;
import p302n6.InterfaceC8887a;
import p315nt.InterfaceC9557b;
import p323o6.InterfaceC9701i;
import p323o6.InterfaceC9702j;
import p323o6.SourceFetchResult;
import p344ot.C10047c;
import p460u6.C11804b;
import p460u6.C11805c;
import p460u6.C11807e;
import p460u6.C11808f;
import p537x6.Options;
import p560xu.AbstractC12938l;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.C12931h0;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t6.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JB\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00020\u001d2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0006\u0012\u0004\u0018\u00010(0&H\u0082@¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u0004\u0018\u00010\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020.*\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u00020.*\u000201H\u0082@¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u00020.*\u000204H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, m31665d2 = {"Lt6/m;", "Lo6/j;", "", "url", "Lx6/p;", "options", "Ljt/h;", "Lt6/i;", "networkClient", "Ln6/a;", "diskCache", "Lt6/b;", "cacheStrategy", "Lt6/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Lx6/p;Ljt/h;Ljt/h;Ljt/h;Lt6/d;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "contentType", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ln6/a$c;", "m", "()Ln6/a$c;", "snapshot", "Lt6/q;", "cacheResponse", "Lt6/o;", "networkRequest", "networkResponse", "r", "(Ln6/a$c;Lt6/q;Lt6/o;Lt6/q;Lnt/b;)Ljava/lang/Object;", "l", "()Lt6/o;", "T", "request", "Lkotlin/Function2;", "Lnt/b;", "", "block", "h", "(Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "q", "(Ln6/a$c;)Lt6/q;", "Lm6/s;", "o", "(Ln6/a$c;)Lm6/s;", "Lt6/r;", "n", "(Lt6/r;Lnt/b;)Ljava/lang/Object;", "Lxu/e;", "p", "(Lxu/e;)Lm6/s;", "Ljava/lang/String;", "b", "Lx6/p;", "c", "Ljt/h;", "d", "e", "f", "Lt6/d;", "i", "()Ljava/lang/String;", "diskCacheKey", "Lxu/l;", "j", "()Lxu/l;", "fileSystem", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11543m implements InterfaceC9702j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC11539i> networkClient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC8887a> diskCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC11532b> cacheStrategy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11534d connectivityChecker;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: t6.m$b */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m31665d2 = {"T", "Lt6/q;", Payload.RESPONSE, "<anonymous>"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", m39664f = "NetworkFetcher.kt", m39665l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m39666m = "invokeSuspend")
    public static final class b<T> extends AbstractC10351m implements Function2<NetworkResponse, InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40836t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40837u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function2<NetworkResponse, InterfaceC9557b<? super T>, Object> f40838v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super t6.q, ? super nt.b<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super NetworkResponse, ? super InterfaceC9557b<? super T>, ? extends Object> function2, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40838v = function2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f40838v, interfaceC9557b);
            bVar.f40837u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f40837u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40836t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            int code = networkResponse.getCode();
            if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
                throw new C11537g(networkResponse);
            }
            Function2<NetworkResponse, InterfaceC9557b<? super T>, Object> function2 = this.f40838v;
            this.f40837u = C10350l.m39676a(networkResponse);
            this.f40836t = 1;
            Object objInvoke = function2.invoke(networkResponse, this);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, InterfaceC9557b<? super T> interfaceC9557b) {
            return ((b) create(networkResponse, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t6.m$c */
    @InterfaceC10344f(m39663c = "coil3.network.NetworkFetcher", m39664f = "NetworkFetcher.kt", m39665l = {61, 74, 102}, m39666m = "fetch")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f40839A;

        /* JADX INFO: renamed from: t */
        public Object f40840t;

        /* JADX INFO: renamed from: u */
        public Object f40841u;

        /* JADX INFO: renamed from: v */
        public Object f40842v;

        /* JADX INFO: renamed from: w */
        public Object f40843w;

        /* JADX INFO: renamed from: x */
        public Object f40844x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f40845y;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40845y = obj;
            this.f40839A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11543m.this.mo38310a(this);
        }
    }

    /* JADX INFO: renamed from: t6.m$d */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lt6/q;", Payload.RESPONSE, "Lo6/o;", "<anonymous>", "(Lt6/q;)Lo6/o;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.network.NetworkFetcher$fetch$2", m39664f = "NetworkFetcher.kt", m39665l = {104}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<NetworkResponse, InterfaceC9557b<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: t */
        public int f40847t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f40848u;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            d dVar = C11543m.this.new d(interfaceC9557b);
            dVar.f40848u = obj;
            return dVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse = (NetworkResponse) this.f40848u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40847t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C11543m c11543m = C11543m.this;
                InterfaceC11548r interfaceC11548rM44164f = C11807e.m44164f(networkResponse);
                this.f40848u = networkResponse;
                this.f40847t = 1;
                obj = c11543m.m43132n(interfaceC11548rM44164f, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C11543m c11543m2 = C11543m.this;
            return new SourceFetchResult((InterfaceC8445s) obj, c11543m2.m43129k(c11543m2.url, networkResponse.getHeaders().m43149c("Content-Type")), EnumC8432f.NETWORK);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, InterfaceC9557b<? super SourceFetchResult> interfaceC9557b) {
            return ((d) create(networkResponse, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t6.m$e */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lt6/q;", Payload.RESPONSE, "Lo6/o;", "<anonymous>", "(Lt6/q;)Lo6/o;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", m39664f = "NetworkFetcher.kt", m39665l = {76, 87}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<NetworkResponse, InterfaceC9557b<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40850t;

        /* JADX INFO: renamed from: u */
        public int f40851u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40852v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C7729c0<InterfaceC8887a.c> f40853w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C11543m f40854x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C7729c0<NetworkResponse> f40855y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ NetworkRequest f40856z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7729c0<InterfaceC8887a.c> c7729c0, C11543m c11543m, C7729c0<NetworkResponse> c7729c1, NetworkRequest networkRequest, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f40853w = c7729c0;
            this.f40854x = c11543m;
            this.f40855y = c7729c1;
            this.f40856z = networkRequest;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = new e(this.f40853w, this.f40854x, this.f40855y, this.f40856z, interfaceC9557b);
            eVar.f40852v = obj;
            return eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v17, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: T */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        
            if (r12 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v9, types: [T, t6.q] */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            e eVar;
            C7729c0<InterfaceC8887a.c> c7729c0;
            T t8;
            Object objM44163e;
            NetworkHeaders headers;
            Object obj2;
            NetworkResponse networkResponse = (NetworkResponse) this.f40852v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40851u;
            String strM43149c = null;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C7729c0<InterfaceC8887a.c> c7729c1 = this.f40853w;
                C11543m c11543m = this.f40854x;
                InterfaceC8887a.c cVar = c7729c1.f29425a;
                NetworkResponse networkResponse2 = this.f40855y.f29425a;
                NetworkRequest networkRequest = this.f40856z;
                this.f40852v = networkResponse;
                this.f40850t = c7729c1;
                this.f40851u = 1;
                eVar = this;
                Object objM43136r = c11543m.m43136r(cVar, networkResponse2, networkRequest, networkResponse, eVar);
                if (objM43136r != objM38805e) {
                    c7729c0 = c7729c1;
                    t8 = objM43136r;
                }
                obj2 = objM44163e;
                return objM38805e;
            }
            if (i10 == 1) {
                c7729c0 = (C7729c0) this.f40850t;
                C7348o.m30470b(obj);
                eVar = this;
                t8 = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                eVar = this;
                obj2 = obj;
            }
            obj2 = objM44163e;
            C12924e c12924e = (C12924e) obj2;
            if (c12924e.getSize() <= 0) {
                return null;
            }
            InterfaceC8445s interfaceC8445sM43134p = eVar.f40854x.m43134p(c12924e);
            C11543m c11543m2 = eVar.f40854x;
            return new SourceFetchResult(interfaceC8445sM43134p, c11543m2.m43129k(c11543m2.url, networkResponse.getHeaders().m43149c("Content-Type")), EnumC8432f.NETWORK);
            c7729c0.f29425a = t8;
            InterfaceC8887a.c cVar2 = eVar.f40853w.f29425a;
            if (cVar2 != null) {
                C7729c0<NetworkResponse> c7729c2 = eVar.f40855y;
                C11543m c11543m3 = eVar.f40854x;
                Intrinsics.checkNotNull(cVar2);
                c7729c2.f29425a = c11543m3.m43135q(cVar2);
                C11543m c11543m4 = eVar.f40854x;
                InterfaceC8887a.c cVar3 = eVar.f40853w.f29425a;
                Intrinsics.checkNotNull(cVar3);
                InterfaceC8445s interfaceC8445sM43133o = c11543m4.m43133o(cVar3);
                C11543m c11543m5 = eVar.f40854x;
                String str = c11543m5.url;
                NetworkResponse networkResponse3 = eVar.f40855y.f29425a;
                if (networkResponse3 != null && (headers = networkResponse3.getHeaders()) != null) {
                    strM43149c = headers.m43149c("Content-Type");
                }
                return new SourceFetchResult(interfaceC8445sM43133o, c11543m5.m43129k(str, strM43149c), EnumC8432f.NETWORK);
            }
            InterfaceC11548r interfaceC11548rM44164f = C11807e.m44164f(networkResponse);
            eVar.f40852v = networkResponse;
            eVar.f40850t = null;
            eVar.f40851u = 2;
            objM44163e = C11807e.m44163e(interfaceC11548rM44164f, this);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, InterfaceC9557b<? super SourceFetchResult> interfaceC9557b) {
            return ((e) create(networkResponse, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: t6.m$f */
    @InterfaceC10344f(m39663c = "coil3.network.NetworkFetcher", m39664f = "NetworkFetcher.kt", m39665l = {245}, m39666m = "toImageSource")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40857t;

        /* JADX INFO: renamed from: u */
        public Object f40858u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40859v;

        /* JADX INFO: renamed from: x */
        public int f40861x;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40859v = obj;
            this.f40861x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11543m.this.m43132n(null, this);
        }
    }

    /* JADX INFO: renamed from: t6.m$g */
    @InterfaceC10344f(m39663c = "coil3.network.NetworkFetcher", m39664f = "NetworkFetcher.kt", m39665l = {138, 153}, m39666m = "writeToDiskCache")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f40862A;

        /* JADX INFO: renamed from: C */
        public int f40864C;

        /* JADX INFO: renamed from: t */
        public Object f40865t;

        /* JADX INFO: renamed from: u */
        public Object f40866u;

        /* JADX INFO: renamed from: v */
        public Object f40867v;

        /* JADX INFO: renamed from: w */
        public Object f40868w;

        /* JADX INFO: renamed from: x */
        public Object f40869x;

        /* JADX INFO: renamed from: y */
        public Object f40870y;

        /* JADX INFO: renamed from: z */
        public Object f40871z;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40862A = obj;
            this.f40864C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11543m.this.m43136r(null, null, null, null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: jt.h<? extends t6.i> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: jt.h<? extends n6.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: jt.h<? extends t6.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11543m(@NotNull String str, @NotNull Options options, @NotNull InterfaceC7341h<? extends InterfaceC11539i> interfaceC7341h, @NotNull InterfaceC7341h<? extends InterfaceC8887a> interfaceC7341h2, @NotNull InterfaceC7341h<? extends InterfaceC11532b> interfaceC7341h3, @NotNull InterfaceC11534d interfaceC11534d) {
        this.url = str;
        this.options = options;
        this.networkClient = interfaceC7341h;
        this.diskCache = interfaceC7341h2;
        this.cacheStrategy = interfaceC7341h3;
        this.connectivityChecker = interfaceC11534d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: T */
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
    @Override // p323o6.InterfaceC9702j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo38310a(@NotNull InterfaceC9557b<? super InterfaceC9701i> interfaceC9557b) throws Exception {
        c cVar;
        C7729c0 c7729c0;
        C7729c0 c7729c1;
        C7729c0 c7729c2;
        InterfaceC11532b.ReadResult readResult;
        C7729c0 c7729c3;
        Exception exc;
        C7729c0 c7729c4;
        NetworkRequest request;
        NetworkRequest networkRequest;
        C7729c0 c7729c5;
        C7729c0 c7729c6;
        NetworkRequest networkRequest2;
        SourceFetchResult sourceFetchResult;
        InterfaceC8887a.c cVar2;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f40839A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f40839A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object objM43126h = cVar.f40845y;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f40839A;
        if (i11 == 0) {
            C7348o.m30470b(objM43126h);
            C7729c0 c7729c7 = new C7729c0();
            c7729c7.f29425a = m43131m();
            try {
                c7729c1 = new C7729c0();
                if (c7729c7.f29425a != 0) {
                    Long size = m43128j().metadata(((InterfaceC8887a.c) c7729c7.f29425a).getMetadata()).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new SourceFetchResult(m43133o((InterfaceC8887a.c) c7729c7.f29425a), m43129k(this.url, null), EnumC8432f.DISK);
                    }
                    ?? M43135q = m43135q((InterfaceC8887a.c) c7729c7.f29425a);
                    c7729c1.f29425a = M43135q;
                    if (M43135q != 0) {
                        InterfaceC11532b value = this.cacheStrategy.getValue();
                        NetworkResponse networkResponse = (NetworkResponse) c7729c1.f29425a;
                        NetworkRequest networkRequestM43130l = m43130l();
                        Options options = this.options;
                        cVar.f40840t = c7729c7;
                        cVar.f40841u = c7729c1;
                        cVar.f40839A = 1;
                        Object objMo43107b = value.mo43107b(networkResponse, networkRequestM43130l, options, cVar);
                        if (objMo43107b != objM38805e) {
                            c7729c3 = c7729c7;
                            objM43126h = objMo43107b;
                        }
                    }
                    return objM38805e;
                }
                c7729c2 = c7729c7;
                readResult = null;
                c7729c4 = c7729c1;
                if (readResult != null) {
                    request = m43130l();
                    networkRequest = request;
                    e eVar = new e(c7729c2, this, c7729c4, networkRequest, null);
                    cVar.f40840t = c7729c2;
                    cVar.f40841u = C10350l.m39676a(readResult);
                    cVar.f40842v = C10350l.m39676a(c7729c4);
                    cVar.f40843w = C10350l.m39676a(networkRequest);
                    cVar.f40839A = 2;
                    objM43126h = m43126h(networkRequest, eVar, cVar);
                    if (objM43126h != objM38805e) {
                        c7729c5 = c7729c2;
                        c7729c6 = c7729c4;
                        networkRequest2 = networkRequest;
                        sourceFetchResult = (SourceFetchResult) objM43126h;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestM43130l2 = m43130l();
                        d dVar = new d(null);
                        cVar.f40840t = c7729c5;
                        cVar.f40841u = C10350l.m39676a(readResult);
                        cVar.f40842v = C10350l.m39676a(c7729c6);
                        cVar.f40843w = C10350l.m39676a(networkRequest2);
                        cVar.f40844x = C10350l.m39676a(sourceFetchResult);
                        cVar.f40839A = 3;
                        objM43126h = m43126h(networkRequestM43130l2, dVar, cVar);
                        if (objM43126h != objM38805e) {
                            c7729c0 = c7729c5;
                            return (SourceFetchResult) objM43126h;
                        }
                    }
                    return objM38805e;
                }
                try {
                    request = readResult.getRequest();
                    if (request == null) {
                        try {
                            request = m43130l();
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            c7729c0 = c7729c2;
                            cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                            if (cVar2 == null) {
                                throw exc;
                            }
                            C11807e.m44161c(cVar2);
                            throw exc;
                        }
                    }
                    networkRequest = request;
                    try {
                        e eVar2 = new e(c7729c2, this, c7729c4, networkRequest, null);
                        cVar.f40840t = c7729c2;
                        cVar.f40841u = C10350l.m39676a(readResult);
                        cVar.f40842v = C10350l.m39676a(c7729c4);
                        cVar.f40843w = C10350l.m39676a(networkRequest);
                        cVar.f40839A = 2;
                        objM43126h = m43126h(networkRequest, eVar2, cVar);
                        if (objM43126h != objM38805e) {
                            c7729c5 = c7729c2;
                            c7729c6 = c7729c4;
                            networkRequest2 = networkRequest;
                            sourceFetchResult = (SourceFetchResult) objM43126h;
                            if (sourceFetchResult != null) {
                                return sourceFetchResult;
                            }
                            NetworkRequest networkRequestM43130l3 = m43130l();
                            d dVar2 = new d(null);
                            cVar.f40840t = c7729c5;
                            cVar.f40841u = C10350l.m39676a(readResult);
                            cVar.f40842v = C10350l.m39676a(c7729c6);
                            cVar.f40843w = C10350l.m39676a(networkRequest2);
                            cVar.f40844x = C10350l.m39676a(sourceFetchResult);
                            cVar.f40839A = 3;
                            objM43126h = m43126h(networkRequestM43130l3, dVar2, cVar);
                            if (objM43126h != objM38805e) {
                                c7729c0 = c7729c5;
                                return (SourceFetchResult) objM43126h;
                            }
                        }
                        return objM38805e;
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        c7729c0 = c7729c2;
                        cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        C11807e.m44161c(cVar2);
                        throw exc;
                    }
                } catch (Exception e12) {
                    exc = e12;
                    c7729c0 = c7729c2;
                    cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    C11807e.m44161c(cVar2);
                    throw exc;
                }
            } catch (Exception e13) {
                e = e13;
                c7729c0 = c7729c7;
                exc = e;
                cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                if (cVar2 == null) {
                    throw exc;
                }
                C11807e.m44161c(cVar2);
                throw exc;
            }
            cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
            if (cVar2 == null) {
                throw exc;
            }
            C11807e.m44161c(cVar2);
            throw exc;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                networkRequest2 = (NetworkRequest) cVar.f40843w;
                c7729c6 = (C7729c0) cVar.f40842v;
                readResult = (InterfaceC11532b.ReadResult) cVar.f40841u;
                c7729c5 = (C7729c0) cVar.f40840t;
                try {
                    C7348o.m30470b(objM43126h);
                    try {
                        sourceFetchResult = (SourceFetchResult) objM43126h;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestM43130l4 = m43130l();
                        d dVar3 = new d(null);
                        cVar.f40840t = c7729c5;
                        cVar.f40841u = C10350l.m39676a(readResult);
                        cVar.f40842v = C10350l.m39676a(c7729c6);
                        cVar.f40843w = C10350l.m39676a(networkRequest2);
                        cVar.f40844x = C10350l.m39676a(sourceFetchResult);
                        cVar.f40839A = 3;
                        objM43126h = m43126h(networkRequestM43130l4, dVar3, cVar);
                        if (objM43126h != objM38805e) {
                            c7729c0 = c7729c5;
                        }
                        return objM38805e;
                    } catch (Exception e14) {
                        exc = e14;
                        c7729c0 = c7729c5;
                        cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        C11807e.m44161c(cVar2);
                        throw exc;
                    }
                } catch (Exception e15) {
                    exc = e15;
                    c7729c0 = c7729c5;
                    cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    C11807e.m44161c(cVar2);
                    throw exc;
                }
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7729c0 = (C7729c0) cVar.f40840t;
            try {
                C7348o.m30470b(objM43126h);
            } catch (Exception e16) {
                exc = e16;
            }
            try {
                return (SourceFetchResult) objM43126h;
            } catch (Exception e17) {
                e = e17;
                exc = e;
                cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
                if (cVar2 == null) {
                    throw exc;
                }
                C11807e.m44161c(cVar2);
                throw exc;
            }
        }
        c7729c1 = (C7729c0) cVar.f40841u;
        c7729c3 = (C7729c0) cVar.f40840t;
        try {
            C7348o.m30470b(objM43126h);
        } catch (Exception e18) {
            exc = e18;
            c7729c0 = c7729c3;
        }
        InterfaceC11532b.ReadResult readResult2 = (InterfaceC11532b.ReadResult) objM43126h;
        if (readResult2.getResponse() != null) {
            return new SourceFetchResult(m43133o((InterfaceC8887a.c) c7729c3.f29425a), m43129k(this.url, readResult2.getResponse().getHeaders().m43149c("Content-Type")), EnumC8432f.DISK);
        }
        c7729c2 = c7729c3;
        readResult = readResult2;
        c7729c4 = c7729c1;
        if (readResult != null) {
            request = m43130l();
            networkRequest = request;
            e eVar3 = new e(c7729c2, this, c7729c4, networkRequest, null);
            cVar.f40840t = c7729c2;
            cVar.f40841u = C10350l.m39676a(readResult);
            cVar.f40842v = C10350l.m39676a(c7729c4);
            cVar.f40843w = C10350l.m39676a(networkRequest);
            cVar.f40839A = 2;
            objM43126h = m43126h(networkRequest, eVar3, cVar);
            if (objM43126h != objM38805e) {
                c7729c5 = c7729c2;
                c7729c6 = c7729c4;
                networkRequest2 = networkRequest;
                sourceFetchResult = (SourceFetchResult) objM43126h;
                if (sourceFetchResult != null) {
                    return sourceFetchResult;
                }
                NetworkRequest networkRequestM43130l5 = m43130l();
                d dVar4 = new d(null);
                cVar.f40840t = c7729c5;
                cVar.f40841u = C10350l.m39676a(readResult);
                cVar.f40842v = C10350l.m39676a(c7729c6);
                cVar.f40843w = C10350l.m39676a(networkRequest2);
                cVar.f40844x = C10350l.m39676a(sourceFetchResult);
                cVar.f40839A = 3;
                objM43126h = m43126h(networkRequestM43130l5, dVar4, cVar);
                if (objM43126h != objM38805e) {
                    c7729c0 = c7729c5;
                    return (SourceFetchResult) objM43126h;
                }
            }
            return objM38805e;
        }
        request = readResult.getRequest();
        if (request == null) {
            request = m43130l();
        }
        networkRequest = request;
        e eVar4 = new e(c7729c2, this, c7729c4, networkRequest, null);
        cVar.f40840t = c7729c2;
        cVar.f40841u = C10350l.m39676a(readResult);
        cVar.f40842v = C10350l.m39676a(c7729c4);
        cVar.f40843w = C10350l.m39676a(networkRequest);
        cVar.f40839A = 2;
        objM43126h = m43126h(networkRequest, eVar4, cVar);
        if (objM43126h != objM38805e) {
            c7729c5 = c7729c2;
            c7729c6 = c7729c4;
            networkRequest2 = networkRequest;
            sourceFetchResult = (SourceFetchResult) objM43126h;
            if (sourceFetchResult != null) {
                return sourceFetchResult;
            }
            NetworkRequest networkRequestM43130l6 = m43130l();
            d dVar5 = new d(null);
            cVar.f40840t = c7729c5;
            cVar.f40841u = C10350l.m39676a(readResult);
            cVar.f40842v = C10350l.m39676a(c7729c6);
            cVar.f40843w = C10350l.m39676a(networkRequest2);
            cVar.f40844x = C10350l.m39676a(sourceFetchResult);
            cVar.f40839A = 3;
            objM43126h = m43126h(networkRequestM43130l6, dVar5, cVar);
            if (objM43126h != objM38805e) {
                c7729c0 = c7729c5;
                return (SourceFetchResult) objM43126h;
            }
        }
        return objM38805e;
        cVar2 = (InterfaceC8887a.c) c7729c0.f29425a;
        if (cVar2 == null) {
            throw exc;
        }
        C11807e.m44161c(cVar2);
        throw exc;
    }

    /* JADX INFO: renamed from: h */
    public final <T> Object m43126h(NetworkRequest networkRequest, Function2<? super NetworkResponse, ? super InterfaceC9557b<? super T>, ? extends Object> function2, InterfaceC9557b<? super T> interfaceC9557b) {
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            C11808f.m44165a();
        }
        return this.networkClient.getValue().mo43118a(networkRequest, new b(function2, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: i */
    public final String m43127i() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC12938l m43128j() {
        AbstractC12938l fileSystem;
        InterfaceC8887a value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final String m43129k(@NotNull String url, @Nullable String contentType) {
        String strM23501b;
        if ((contentType == null || C7797x.m32309T(contentType, "text/plain", false, 2, null)) && (strM23501b = C4878x.f19580a.m23501b(url)) != null) {
            return strM23501b;
        }
        if (contentType != null) {
            return StringsKt.m32169i1(contentType, ';', null, 2, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final NetworkRequest m43130l() {
        NetworkHeaders.a aVarM43150d = C11538h.m43116b(this.options).m43150d();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z10 = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.mo43111c();
        if (!z10 && readEnabled) {
            aVarM43150d.m43153c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z10 || readEnabled) {
            if (!z10 && !readEnabled) {
                aVarM43150d.m43153c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            aVarM43150d.m43153c("Cache-Control", "no-cache");
        } else {
            aVarM43150d.m43153c("Cache-Control", "no-cache, no-store");
        }
        return new NetworkRequest(this.url, C11538h.m43117c(this.options), aVarM43150d.m43152b(), C11538h.m43115a(this.options), this.options.getExtras());
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC8887a.c m43131m() {
        InterfaceC8887a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.mo35763b(m43127i());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m43132n(InterfaceC11548r interfaceC11548r, InterfaceC9557b<? super InterfaceC8445s> interfaceC9557b) {
        f fVar;
        C12924e c12924e;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i10 = fVar.f40861x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f40861x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        Object obj = fVar.f40859v;
        Object objM38805e = C10047c.m38805e();
        int i11 = fVar.f40861x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C12924e c12924e2 = new C12924e();
            fVar.f40857t = C10350l.m39676a(interfaceC11548r);
            fVar.f40858u = c12924e2;
            fVar.f40861x = 1;
            if (interfaceC11548r.mo43168x(c12924e2, fVar) == objM38805e) {
                return objM38805e;
            }
            c12924e = c12924e2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12924e = (C12924e) fVar.f40858u;
            C7348o.m30470b(obj);
        }
        return m43134p(c12924e);
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC8445s m43133o(InterfaceC8887a.c cVar) {
        return C8446t.m34220d(cVar.getData(), m43128j(), m43127i(), cVar, null, 16, null);
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC8445s m43134p(C12924e c12924e) {
        return C8446t.m34219c(c12924e, m43128j(), null, 4, null);
    }

    /* JADX INFO: renamed from: q */
    public final NetworkResponse m43135q(InterfaceC8887a.c cVar) throws Throwable {
        Throwable th2;
        NetworkResponse networkResponseM43104a;
        try {
            InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(m43128j().source(cVar.getMetadata()));
            try {
                networkResponseM43104a = C11531a.f40808a.m43104a(interfaceC12928gM47961c);
                if (interfaceC12928gM47961c != null) {
                    try {
                        interfaceC12928gM47961c.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (interfaceC12928gM47961c != null) {
                    try {
                        interfaceC12928gM47961c.close();
                    } catch (Throwable th5) {
                        C7328a.m30429a(th4, th5);
                    }
                }
                th2 = th4;
                networkResponseM43104a = null;
            }
            if (th2 == null) {
                return networkResponseM43104a;
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
    
        if (r0.mo43167I2(r3, r4, r6) == r7) goto L63;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43136r(InterfaceC8887a.c cVar, NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, InterfaceC9557b<? super InterfaceC8887a.c> interfaceC9557b) throws Exception {
        g gVar;
        NetworkResponse networkResponse3;
        NetworkRequest networkRequest2;
        NetworkResponse networkResponse4;
        InterfaceC8887a.b bVar;
        InterfaceC8887a.b bVarMo35762a;
        NetworkResponse networkResponse5;
        NetworkResponse networkResponse6;
        Exception exc;
        InterfaceC8887a.b bVar2;
        InterfaceC12926f interfaceC12926fM47960b;
        InterfaceC11548r body;
        InterfaceC11548r body2;
        InterfaceC11548r body3;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f40864C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f40864C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        g gVar2 = gVar;
        Object objMo43106a = gVar2.f40862A;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar2.f40864C;
        Throwable th2 = null;
        if (i11 == 0) {
            C7348o.m30470b(objMo43106a);
            if (!this.options.getDiskCachePolicy().getWriteEnabled()) {
                if (cVar != null) {
                    C11807e.m44161c(cVar);
                }
                return null;
            }
            InterfaceC11532b value = this.cacheStrategy.getValue();
            Options options = this.options;
            gVar2.f40865t = cVar;
            gVar2.f40866u = C10350l.m39676a(networkResponse);
            gVar2.f40867v = C10350l.m39676a(networkRequest);
            gVar2.f40868w = networkResponse2;
            gVar2.f40864C = 1;
            objMo43106a = value.mo43106a(networkResponse, networkRequest, networkResponse2, options, gVar2);
            if (objMo43106a != objM38805e) {
                networkResponse3 = networkResponse;
                networkRequest2 = networkRequest;
                networkResponse4 = networkResponse2;
            }
            return objM38805e;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (InterfaceC8887a.b) gVar2.f40871z;
            networkResponse6 = (NetworkResponse) gVar2.f40870y;
            networkResponse5 = (NetworkResponse) gVar2.f40868w;
            try {
                C7348o.m30470b(objMo43106a);
                return bVar2.mo35767a();
            } catch (Exception e10) {
                exc = e10;
                C11807e.m44159a(bVar2);
                body2 = networkResponse5.getBody();
                if (body2 != null) {
                    C11807e.m44161c(body2);
                }
                body3 = networkResponse6.getBody();
                if (body3 != null) {
                    throw exc;
                }
                C11807e.m44161c(body3);
                throw exc;
            }
        }
        networkResponse4 = (NetworkResponse) gVar2.f40868w;
        networkRequest2 = (NetworkRequest) gVar2.f40867v;
        networkResponse3 = (NetworkResponse) gVar2.f40866u;
        cVar = (InterfaceC8887a.c) gVar2.f40865t;
        C7348o.m30470b(objMo43106a);
        InterfaceC11532b.WriteResult writeResult = (InterfaceC11532b.WriteResult) objMo43106a;
        NetworkResponse response = writeResult.getResponse();
        if (response == null) {
            return null;
        }
        if (cVar == null) {
            InterfaceC8887a value2 = this.diskCache.getValue();
            if (value2 != null) {
                bVarMo35762a = value2.mo35762a(m43127i());
            } else {
                bVar = null;
            }
            if (bVar == null) {
                return null;
            }
            try {
                interfaceC12926fM47960b = C12919b0.m47960b(m43128j().sink(bVar.getMetadata(), false));
                try {
                    C11531a.f40808a.m43105b(response, interfaceC12926fM47960b);
                    Unit unit = Unit.f29331a;
                    if (interfaceC12926fM47960b != null) {
                        try {
                            interfaceC12926fM47960b.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (interfaceC12926fM47960b != null) {
                        try {
                            interfaceC12926fM47960b.close();
                        } catch (Throwable th5) {
                            C7328a.m30429a(th2, th5);
                        }
                    }
                }
                if (th2 == null) {
                    throw th2;
                }
                body = response.getBody();
                if (body != null) {
                    AbstractC12938l abstractC12938lM43128j = m43128j();
                    C12931h0 data = bVar.getData();
                    gVar2.f40865t = C10350l.m39676a(cVar);
                    gVar2.f40866u = C10350l.m39676a(networkResponse3);
                    gVar2.f40867v = C10350l.m39676a(networkRequest2);
                    gVar2.f40868w = networkResponse4;
                    gVar2.f40869x = C10350l.m39676a(writeResult);
                    gVar2.f40870y = response;
                    gVar2.f40871z = bVar;
                    gVar2.f40864C = 2;
                }
                networkResponse5 = networkResponse4;
                networkResponse6 = response;
                bVar2 = bVar;
                return bVar2.mo35767a();
            } catch (Exception e11) {
                networkResponse5 = networkResponse4;
                networkResponse6 = response;
                exc = e11;
                bVar2 = bVar;
                C11807e.m44159a(bVar2);
                body2 = networkResponse5.getBody();
                if (body2 != null) {
                    C11807e.m44161c(body2);
                }
                body3 = networkResponse6.getBody();
                if (body3 != null) {
                    throw exc;
                }
                C11807e.m44161c(body3);
                throw exc;
            }
        }
        bVarMo35762a = cVar.mo35768s2();
        bVar = bVarMo35762a;
        if (bVar == null) {
            return null;
        }
        interfaceC12926fM47960b = C12919b0.m47960b(m43128j().sink(bVar.getMetadata(), false));
        C11531a.f40808a.m43105b(response, interfaceC12926fM47960b);
        Unit unit2 = Unit.f29331a;
        if (interfaceC12926fM47960b != null) {
            interfaceC12926fM47960b.close();
        }
        if (th2 == null) {
            throw th2;
        }
        body = response.getBody();
        if (body != null) {
            AbstractC12938l abstractC12938lM43128j2 = m43128j();
            C12931h0 data2 = bVar.getData();
            gVar2.f40865t = C10350l.m39676a(cVar);
            gVar2.f40866u = C10350l.m39676a(networkResponse3);
            gVar2.f40867v = C10350l.m39676a(networkRequest2);
            gVar2.f40868w = networkResponse4;
            gVar2.f40869x = C10350l.m39676a(writeResult);
            gVar2.f40870y = response;
            gVar2.f40871z = bVar;
            gVar2.f40864C = 2;
        }
        networkResponse5 = networkResponse4;
        networkResponse6 = response;
        bVar2 = bVar;
        return bVar2.mo35767a();
    }

    /* JADX INFO: renamed from: t6.m$a */
    @Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m31665d2 = {"Lt6/m$a;", "Lo6/j$a;", "Lk6/h0;", "Lkotlin/Function0;", "Lt6/i;", "networkClient", "Lt6/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lt6/d;", "connectivityChecker", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "data", "", "g", "(Lk6/h0;)Z", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "e", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "Ljt/h;", "a", "Ljt/h;", "networkClientLazy", "b", "cacheStrategyLazy", "Lu6/b;", "c", "Lu6/b;", "connectivityCheckerLazy", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9702j.a<C7466h0> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7341h<InterfaceC11539i> networkClientLazy;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7341h<InterfaceC11532b> cacheStrategyLazy;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final C11804b<Context, InterfaceC11534d> connectivityCheckerLazy;

        /* JADX INFO: renamed from: t6.m$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14258a extends C7744k implements Function1<Context, InterfaceC11534d> {

            /* JADX INFO: renamed from: a */
            public static final C14258a f40835a = new C14258a();

            public C14258a() {
                super(1, C11536f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final InterfaceC11534d invoke(Context context) {
                return C11536f.m43114a(context);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(@NotNull Function0<? extends InterfaceC11539i> function0, @NotNull Function0<? extends InterfaceC11532b> function1, @NotNull Function1<? super Context, ? extends InterfaceC11534d> function2) {
            this.networkClientLazy = C7342i.m30456b(function0);
            this.cacheStrategyLazy = C7342i.m30456b(function1);
            this.connectivityCheckerLazy = C11805c.m44158a(function2);
        }

        /* JADX INFO: renamed from: d */
        public static final InterfaceC11532b m43139d() {
            return InterfaceC11532b.f40810b;
        }

        /* JADX INFO: renamed from: f */
        public static final InterfaceC8887a m43140f(InterfaceC7479s interfaceC7479s) {
            return interfaceC7479s.mo31066b();
        }

        /* JADX INFO: renamed from: g */
        private final boolean m43141g(C7466h0 data) {
            return Intrinsics.m31980c(data.getScheme(), "http") || Intrinsics.m31980c(data.getScheme(), "https");
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j; */
        @Override // p323o6.InterfaceC9702j.a
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC9702j mo38311a(@NotNull C7466h0 data, @NotNull Options options, @NotNull final InterfaceC7479s imageLoader) {
            if (m43141g(data)) {
                return new C11543m(data.getData(), options, this.networkClientLazy, C7342i.m30456b(new Function0() { // from class: t6.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C11543m.a.m43140f(imageLoader);
                    }
                }), this.cacheStrategyLazy, this.connectivityCheckerLazy.m44157a(options.getContext()));
            }
            return null;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
          (r1v0 kotlin.jvm.functions.Function0)
          (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:5) call: t6.l.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function0))
          (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0009: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function1:0x000d: SGET  A[WRAPPED] (LINE:6) t6.m.a.a.a t6.m$a$a) : (r3v0 kotlin.jvm.functions.Function1))
         A[MD:(kotlin.jvm.functions.Function0<? extends t6.i>, kotlin.jvm.functions.Function0<? extends t6.b>, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends t6.d>):void (m)] (LINE:7) call: t6.m.a.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void type: THIS */
        public /* synthetic */ a(Function0 function0, Function0 function1, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i10 & 2) != 0 ? new Function0() { // from class: t6.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11543m.a.m43139d();
                }
            } : function1, (i10 & 4) != 0 ? C14258a.f40835a : function2);
        }
    }
}
