package po;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016\u000fB)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lpo/a;", "Lln/o;", "Lpo/a$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lpo/c;", "service", "documentId", "Lno/e$b;", "remoteDocument", "<init>", "(Ljava/lang/String;Lpo/c;Ljava/lang/String;Lno/e$b;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Ljava/lang/String;", "Lpo/c;", "d", "getDocumentId", "()Ljava/lang/String;", "e", "Lno/e$b;", "f", "()Lno/e$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.e.Remote remoteDocument;

    /* JADX INFO: renamed from: po.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpo/a$a;", BuildConfig.FLAVOR, "Lpo/c;", "service", "<init>", "(Lpo/c;)V", BuildConfig.FLAVOR, "sessionToken", "documentId", "Lno/e$b;", "remoteDocument", "Lpo/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lno/e$b;)Lpo/a;", "Lpo/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0563a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final po.c service;

        public C0563a(@NotNull po.c service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String documentId, @NotNull no.e.Remote remoteDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(remoteDocument, "remoteDocument");
            return new a(sessionToken, this.service, documentId, remoteDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lpo/a$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lpo/a$b$a;", "Lpo/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: po.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpo/a$b$a;", "Lpo/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
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

        /* JADX INFO: renamed from: po.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpo/a$b$b;", "Lpo/a$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0565b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0565b f29237a = new C0565b();

            public C0565b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lpo/a$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1", f = "DocumentFileDeleteWorker.kt", l = {Barcode.FORMAT_EAN_13, 38, RequestError.NETWORK_FAILURE}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29238t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29239u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f29240v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f29241w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f29242x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f29243y;

        /* JADX INFO: renamed from: po.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsw/x;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1", f = "DocumentFileDeleteWorker.kt", l = {33}, m = "invokeSuspend")
        public static final class C0566a extends m implements Function1<eu.b<? super x<?>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f29245t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f29246u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0566a(a aVar, eu.b<? super C0566a> bVar) {
                super(1, bVar);
                this.f29246u = aVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new C0566a(this.f29246u, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f29245t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                po.c cVar = this.f29246u.service;
                String str = this.f29246u.sessionToken;
                String documentFileId = this.f29246u.getRemoteDocument().getDocumentFileId();
                this.f29245t = 1;
                Object objB = cVar.b(str, documentFileId, this);
                return objB == objE ? objE : objB;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<?>> bVar) {
                return ((C0566a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f29243y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NetworkCallResult networkCallResult;
            i iVar = (i) this.f29243y;
            Object objE = fu.c.e();
            int i10 = this.f29242x;
            if (i10 == 0) {
                zt.o.b(obj);
                C0566a c0566a = new C0566a(a.this, null);
                this.f29243y = iVar;
                this.f29242x = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c0566a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
            } else if (i10 == 2) {
                networkCallResult = (NetworkCallResult) this.f29238t;
                zt.o.b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.Error error = new b.Error(networkErrorInfo);
                    this.f29243y = l.a(iVar);
                    this.f29238t = networkCallResult;
                    this.f29239u = l.a(networkErrorInfo);
                    this.f29240v = 0;
                    this.f29241w = 0;
                    this.f29242x = 3;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
            networkCallResult = (NetworkCallResult) obj;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                Object response = ((NetworkCallResult.Success) networkCallResult).getResponse();
                b.C0565b c0565b = b.C0565b.f29237a;
                this.f29243y = iVar;
                this.f29238t = networkCallResult;
                this.f29239u = l.a(response);
                this.f29240v = 0;
                this.f29241w = 0;
                this.f29242x = 2;
                if (iVar.emit(c0565b, this) != objE) {
                }
                return objE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.Error error2 = new b.Error(networkErrorInfo2);
                this.f29243y = l.a(iVar);
                this.f29238t = networkCallResult;
                this.f29239u = l.a(networkErrorInfo2);
                this.f29240v = 0;
                this.f29241w = 0;
                this.f29242x = 3;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ a(String str, po.c cVar, String str2, no.e.Remote remote, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, remote);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.remoteDocument, aVar.remoteDocument);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.remoteDocument, aVar.remoteDocument);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final no.e.Remote getRemoteDocument() {
        return this.remoteDocument;
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<b> run() {
        return dv.j.w(new c(null));
    }

    public a(String str, po.c cVar, String str2, no.e.Remote remote) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
        this.remoteDocument = remote;
    }
}
