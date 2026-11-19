package gs;

import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.ui.network.LocationData;
import dv.h;
import dv.i;
import gu.f;
import gu.l;
import gu.m;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012\u0010B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgs/a;", "Lln/o;", "Lgs/a$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "addressId", "Lgs/c;", "uiService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgs/c;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "b", "Ljava/lang/String;", "c", "d", "Lgs/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String addressId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gs.c uiService;

    /* JADX INFO: renamed from: gs.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lgs/a$a;", BuildConfig.FLAVOR, "Lgs/c;", "uiService", "<init>", "(Lgs/c;)V", BuildConfig.FLAVOR, "sessionToken", "addressId", "Lgs/a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lgs/a;", "Lgs/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0332a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final gs.c uiService;

        public C0332a(@NotNull gs.c uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String addressId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(addressId, "addressId");
            return new a(sessionToken, addressId, this.uiService, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgs/a$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lgs/a$b$a;", "Lgs/a$b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: gs.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lgs/a$b$a;", "Lgs/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0333a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0333a(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: gs.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lgs/a$b$b;", "Lgs/a$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0334b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LocationData result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0334b(@NotNull LocationData result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocationData getResult() {
                return this.result;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lgs/a$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1", f = "UiAddressDetailsWorker.kt", l = {20, 28, BacktraceMetrics.defaultTimeIntervalInMin, RequestError.NO_DEV_KEY}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17913t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17914u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f17915v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f17916w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f17917x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f17918y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f17919z;

        /* JADX INFO: renamed from: gs.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1$1", f = "UiAddressDetailsWorker.kt", l = {21}, m = "invokeSuspend")
        public static final class C0335a extends m implements Function1<eu.b<? super x<AddressDetailsResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f17920t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f17921u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0335a(a aVar, eu.b<? super C0335a> bVar) {
                super(1, bVar);
                this.f17921u = aVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new C0335a(this.f17921u, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f17920t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                gs.c cVar = this.f17921u.uiService;
                String str = this.f17921u.sessionToken;
                String str2 = this.f17921u.addressId;
                this.f17920t = 1;
                Object objC = cVar.c(str, str2, this);
                return objC == objE ? objE : objC;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<AddressDetailsResponse>> bVar) {
                return ((C0335a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f17919z = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
        
            if (r1.emit(r6, r18) == r2) goto L33;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objEnqueueRetriableRequestWithRetry;
            NetworkCallResult networkCallResult;
            i iVar = (i) this.f17919z;
            Object objE = fu.c.e();
            int i10 = this.f17918y;
            if (i10 == 0) {
                zt.o.b(obj);
                C0335a c0335a = new C0335a(a.this, null);
                this.f17919z = iVar;
                this.f17918y = 1;
                objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c0335a, this);
                if (objEnqueueRetriableRequestWithRetry != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            } else if (i10 == 2 || i10 == 3) {
                networkCallResult = (NetworkCallResult) this.f17913t;
                zt.o.b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.C0333a c0333a = new b.C0333a(networkErrorInfo);
                    this.f17919z = l.a(iVar);
                    this.f17913t = networkCallResult;
                    this.f17914u = l.a(networkErrorInfo);
                    this.f17915v = null;
                    this.f17916w = 0;
                    this.f17917x = 0;
                    this.f17918y = 4;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
            networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                AddressDetailsResponse addressDetailsResponse = (AddressDetailsResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                LocationData attributes = addressDetailsResponse != null ? addressDetailsResponse.getAttributes() : null;
                if (attributes != null) {
                    b.C0334b c0334b = new b.C0334b(attributes);
                    this.f17919z = iVar;
                    this.f17913t = networkCallResult;
                    this.f17914u = l.a(addressDetailsResponse);
                    this.f17915v = l.a(attributes);
                    this.f17916w = 0;
                    this.f17917x = 0;
                    this.f17918y = 2;
                    if (iVar.emit(c0334b, this) != objE) {
                    }
                } else {
                    b.C0333a c0333a2 = new b.C0333a(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body attributes to be non-null.", false, null, 8, null));
                    this.f17919z = iVar;
                    this.f17913t = networkCallResult;
                    this.f17914u = l.a(addressDetailsResponse);
                    this.f17915v = l.a(attributes);
                    this.f17916w = 0;
                    this.f17917x = 0;
                    this.f17918y = 3;
                    if (iVar.emit(c0333a2, this) != objE) {
                    }
                }
                return objE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.C0333a c0333a3 = new b.C0333a(networkErrorInfo2);
                this.f17919z = l.a(iVar);
                this.f17913t = networkCallResult;
                this.f17914u = l.a(networkErrorInfo2);
                this.f17915v = null;
                this.f17916w = 0;
                this.f17917x = 0;
                this.f17918y = 4;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ a(String str, String str2, gs.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, cVar);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && Intrinsics.c(this.addressId, ((a) otherWorker).addressId);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<b> run() {
        return dv.j.w(new c(null));
    }

    public a(String str, String str2, gs.c cVar) {
        this.sessionToken = str;
        this.addressId = str2;
        this.uiService = cVar;
    }
}
