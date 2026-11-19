package js;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import dv.h;
import dv.i;
import gu.f;
import gu.l;
import gu.m;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\r\u0011B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ljs/b;", "Lln/o;", "Ljs/b$b;", "Lls/j;", "Ljs/a;", "service", BuildConfig.FLAVOR, "jwt", "<init>", "(Ljs/a;Ljava/lang/String;)V", "Ldv/h;", "run", "()Ldv/h;", "b", "Ljs/a;", "c", "Ljava/lang/String;", "a", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<AbstractC0389b>, j<AbstractC0389b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final js.a service;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String jwt;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljs/b$a;", BuildConfig.FLAVOR, "Ljs/a;", "service", "<init>", "(Ljs/a;)V", BuildConfig.FLAVOR, "jwt", "Ljs/b;", "a", "(Ljava/lang/String;)Ljs/b;", "Ljs/a;", "b", "()Ljs/a;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final js.a service;

        public a(@NotNull js.a service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final b a(@Nullable String jwt) {
            return new b(this.service, jwt);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final js.a getService() {
            return this.service;
        }
    }

    /* JADX INFO: renamed from: js.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ljs/b$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Ljs/b$b$a;", "Ljs/b$b$b;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC0389b {

        /* JADX INFO: renamed from: js.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljs/b$b$a;", "Ljs/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends AbstractC0389b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: js.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ljs/b$b$b;", "Ljs/b$b;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0390b extends AbstractC0389b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AuthorizeWebRtcResponse result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0390b(@NotNull AuthorizeWebRtcResponse result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AuthorizeWebRtcResponse getResult() {
                return this.result;
            }
        }

        public /* synthetic */ AbstractC0389b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0389b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Ljs/b$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1", f = "WebRtcWorker.kt", l = {37, RequestError.NO_DEV_KEY, 43, 54}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super AbstractC0389b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f20912t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f20913u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f20914v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f20915w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f20916x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f20917y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1", f = "WebRtcWorker.kt", l = {38}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<AuthorizeWebRtcResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f20919t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f20920u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, eu.b<? super a> bVar2) {
                super(1, bVar2);
                this.f20920u = bVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f20920u, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f20919t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                js.a aVar = this.f20920u.service;
                String str = this.f20920u.jwt;
                this.f20919t = 1;
                Object objA = aVar.a(str, this);
                return objA == objE ? objE : objA;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<AuthorizeWebRtcResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = b.this.new c(bVar);
            cVar.f20917y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
        
            if (r1.emit(r6, r16) == r2) goto L30;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objEnqueueRetriableRequestWithRetry;
            NetworkCallResult networkCallResult;
            i iVar = (i) this.f20917y;
            Object objE = fu.c.e();
            int i10 = this.f20916x;
            if (i10 == 0) {
                zt.o.b(obj);
                a aVar = new a(b.this, null);
                this.f20917y = iVar;
                this.f20916x = 1;
                objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
                if (objEnqueueRetriableRequestWithRetry != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            } else if (i10 == 2 || i10 == 3) {
                networkCallResult = (NetworkCallResult) this.f20912t;
                zt.o.b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    AbstractC0389b.Error error = new AbstractC0389b.Error(networkErrorInfo);
                    this.f20917y = l.a(iVar);
                    this.f20912t = networkCallResult;
                    this.f20913u = l.a(networkErrorInfo);
                    this.f20914v = 0;
                    this.f20915w = 0;
                    this.f20916x = 4;
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
                AuthorizeWebRtcResponse authorizeWebRtcResponse = (AuthorizeWebRtcResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (authorizeWebRtcResponse != null) {
                    AbstractC0389b.C0390b c0390b = new AbstractC0389b.C0390b(authorizeWebRtcResponse);
                    this.f20917y = iVar;
                    this.f20912t = networkCallResult;
                    this.f20913u = l.a(authorizeWebRtcResponse);
                    this.f20914v = 0;
                    this.f20915w = 0;
                    this.f20916x = 2;
                    if (iVar.emit(c0390b, this) != objE) {
                    }
                } else {
                    AbstractC0389b.Error error2 = new AbstractC0389b.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null.", false, null, 8, null));
                    this.f20917y = iVar;
                    this.f20912t = networkCallResult;
                    this.f20913u = l.a(authorizeWebRtcResponse);
                    this.f20914v = 0;
                    this.f20915w = 0;
                    this.f20916x = 3;
                    if (iVar.emit(error2, this) != objE) {
                    }
                }
                return objE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                AbstractC0389b.Error error3 = new AbstractC0389b.Error(networkErrorInfo2);
                this.f20917y = l.a(iVar);
                this.f20912t = networkCallResult;
                this.f20913u = l.a(networkErrorInfo2);
                this.f20914v = 0;
                this.f20915w = 0;
                this.f20916x = 4;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super AbstractC0389b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public b(@NotNull js.a service, @Nullable String str) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.jwt = str;
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
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
    public h<AbstractC0389b> run() {
        return dv.j.w(new c(null));
    }
}
