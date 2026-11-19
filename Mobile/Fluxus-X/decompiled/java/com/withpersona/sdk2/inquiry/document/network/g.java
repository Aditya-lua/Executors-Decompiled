package com.withpersona.sdk2.inquiry.document.network;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import dv.i;
import gu.l;
import gu.m;
import java.util.List;
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
import po.DocumentStepData;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001d\u0016BO\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lpo/c;", "service", "inquiryId", "fromStep", "fromComponent", "Lso/a;", "fallbackModeManager", "Lar/a;", "dataCollector", BuildConfig.FLAVOR, "Lno/e;", "documents", "<init>", "(Ljava/lang/String;Lpo/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lso/a;Lar/a;Ljava/util/List;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Ljava/lang/String;", "Lpo/c;", "d", "e", "f", "g", "Lso/a;", "h", "Lar/a;", "i", "Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so.a fallbackModeManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ar.a dataCollector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<no.e> documents;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$a;", BuildConfig.FLAVOR, "Lpo/c;", "service", "Lso/a;", "fallbackModeManager", "Lar/a;", "dataCollector", "<init>", "(Lpo/c;Lso/a;Lar/a;)V", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromStep", "fromComponent", BuildConfig.FLAVOR, "Lno/e;", "documents", "Lcom/withpersona/sdk2/inquiry/document/network/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/g;", "Lpo/c;", "b", "Lso/a;", "c", "Lar/a;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final po.c service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final so.a fallbackModeManager;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ar.a dataCollector;

        public a(@NotNull po.c service, @NotNull so.a fallbackModeManager, @NotNull ar.a dataCollector) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
            Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
            this.service = service;
            this.fallbackModeManager = fallbackModeManager;
            this.dataCollector = dataCollector;
        }

        @NotNull
        public final g a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull List<? extends no.e> documents) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(documents, "documents");
            return new g(sessionToken, this.service, inquiryId, fromStep, fromComponent, this.fallbackModeManager, this.dataCollector, documents, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0174b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0174b f9993a = new C0174b();

            public C0174b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1", f = "DocumentSubmitWorker.kt", l = {43, Barcode.FORMAT_EAN_8, 66}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9994t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9995u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9996v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9997w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9998x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9999y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", BuildConfig.FLAVOR, "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1$1", f = "DocumentSubmitWorker.kt", l = {46, 54}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10001t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g f10002u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f10002u = gVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f10002u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
            
                if (r8 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
            
                if (r8 == r0) goto L19;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f10001t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        zt.o.b(obj);
                        return (x) obj;
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return (x) obj;
                }
                zt.o.b(obj);
                if (this.f10002u.fallbackModeManager.b()) {
                    so.a aVar = this.f10002u.fallbackModeManager;
                    String str = this.f10002u.sessionToken;
                    SubmitDocumentRequest submitDocumentRequestA = SubmitDocumentRequest.INSTANCE.a(this.f10002u.fromStep, this.f10002u.fromComponent);
                    this.f10001t = 1;
                    obj = aVar.a(str, submitDocumentRequestA, this);
                } else {
                    po.c cVar = this.f10002u.service;
                    String str2 = this.f10002u.sessionToken;
                    String str3 = this.f10002u.inquiryId;
                    SubmitDocumentRequest submitDocumentRequestA2 = SubmitDocumentRequest.INSTANCE.a(this.f10002u.fromStep, this.f10002u.fromComponent);
                    this.f10001t = 2;
                    obj = cVar.a(str2, str3, submitDocumentRequestA2, this);
                }
                return objE;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = g.this.new c(bVar);
            cVar.f9999y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0092  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
        
            if (r0.emit(r4, r9) == r1) goto L24;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NetworkCallResult networkCallResult;
            i iVar = (i) this.f9999y;
            Object objE = fu.c.e();
            int i10 = this.f9998x;
            if (i10 == 0) {
                zt.o.b(obj);
                g.this.dataCollector.c(new DocumentStepData(g.this.fromStep, g.this.documents));
                a aVar = new a(g.this, null);
                this.f9999y = iVar;
                this.f9998x = 1;
                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
            } else if (i10 == 2) {
                networkCallResult = (NetworkCallResult) this.f9994t;
                zt.o.b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.Error error = new b.Error(networkErrorInfo);
                    this.f9999y = l.a(iVar);
                    this.f9994t = networkCallResult;
                    this.f9995u = l.a(networkErrorInfo);
                    this.f9996v = 0;
                    this.f9997w = 0;
                    this.f9998x = 3;
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
                b.C0174b c0174b = b.C0174b.f9993a;
                this.f9999y = iVar;
                this.f9994t = networkCallResult;
                this.f9995u = l.a(response);
                this.f9996v = 0;
                this.f9997w = 0;
                this.f9998x = 2;
                if (iVar.emit(c0174b, this) != objE) {
                }
                return objE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.Error error2 = new b.Error(networkErrorInfo2);
                this.f9999y = l.a(iVar);
                this.f9994t = networkCallResult;
                this.f9995u = l.a(networkErrorInfo2);
                this.f9996v = 0;
                this.f9997w = 0;
                this.f9998x = 3;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ g(String str, po.c cVar, String str2, String str3, String str4, so.a aVar, ar.a aVar2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, str3, str4, aVar, aVar2, list);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof g) && Intrinsics.c(this.sessionToken, ((g) otherWorker).sessionToken);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof g) && Intrinsics.c(this.sessionToken, ((g) otherWorker).sessionToken);
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(String str, po.c cVar, String str2, String str3, String str4, so.a aVar, ar.a aVar2, List<? extends no.e> list) {
        this.sessionToken = str;
        this.service = cVar;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.fallbackModeManager = aVar;
        this.dataCollector = aVar2;
        this.documents = list;
    }
}
