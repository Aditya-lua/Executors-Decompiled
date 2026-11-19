package com.withpersona.sdk2.inquiry.document.network;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import dv.i;
import gu.l;
import gu.m;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0017\u0010B1\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lpo/c;", "service", "documentKind", BuildConfig.FLAVOR, "fileLimit", "fieldKeyDocument", "<init>", "(Ljava/lang/String;Lpo/c;Ljava/lang/String;ILjava/lang/String;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Ljava/lang/String;", "Lpo/c;", "d", "f", "()Ljava/lang/String;", "e", "I", "h", "()I", "g", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentKind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int fileLimit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldKeyDocument;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$a;", BuildConfig.FLAVOR, "Lpo/c;", "service", "<init>", "(Lpo/c;)V", BuildConfig.FLAVOR, "sessionToken", "documentKind", "fieldKeyDocument", BuildConfig.FLAVOR, "fileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lpo/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0164a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final po.c service;

        public C0164a(@NotNull po.c service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String documentKind, @NotNull String fieldKeyDocument, int fileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentKind, "documentKind");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            return new a(sessionToken, this.service, documentKind, fileLimit, fieldKeyDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo.NetworkErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo.NetworkErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo.NetworkErrorInfo getCause() {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", BuildConfig.FLAVOR, "documentId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0166b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0166b(@NotNull String documentId) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                this.documentId = documentId;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker$run$1", f = "DocumentCreateWorker.kt", l = {29, RequestError.NETWORK_FAILURE, 42}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9912t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9913u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9914v;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f9914v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L22;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f9914v;
            Object objE = fu.c.e();
            int i10 = this.f9913u;
            if (i10 != 0) {
                if (i10 == 1) {
                    zt.o.b(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            po.c cVar = a.this.service;
            String str = a.this.sessionToken;
            CreateDocumentRequest createDocumentRequestA = CreateDocumentRequest.INSTANCE.a("document", a.this.getDocumentKind(), a.this.getFileLimit(), a.this.getFieldKeyDocument());
            this.f9914v = iVar;
            this.f9913u = 1;
            obj = cVar.c(str, createDocumentRequestA, this);
            if (obj != objE) {
            }
            return objE;
            x xVar = (x) obj;
            if (xVar.g()) {
                Object objA = xVar.a();
                Intrinsics.checkNotNull(objA);
                b.C0166b c0166b = new b.C0166b(((CreateDocumentResponse) objA).getData().getId());
                this.f9914v = l.a(iVar);
                this.f9912t = l.a(xVar);
                this.f9913u = 2;
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(xVar));
                this.f9914v = l.a(iVar);
                this.f9912t = l.a(xVar);
                this.f9913u = 3;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ a(String str, po.c cVar, String str2, int i10, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, i10, str3);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.fieldKeyDocument, aVar.fieldKeyDocument);
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
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.fieldKeyDocument, aVar.fieldKeyDocument);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentKind() {
        return this.documentKind;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFieldKeyDocument() {
        return this.fieldKeyDocument;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getFileLimit() {
        return this.fileLimit;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }

    public a(String str, po.c cVar, String str2, int i10, String str3) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentKind = str2;
        this.fileLimit = i10;
        this.fieldKeyDocument = str3;
    }
}
