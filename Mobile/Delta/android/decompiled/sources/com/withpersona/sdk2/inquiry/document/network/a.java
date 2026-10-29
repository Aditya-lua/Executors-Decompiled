package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0010!B1\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b \u0010\u001b¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lvr/h;", "", "sessionToken", "Lbo/c;", "service", "documentKind", "", "fileLimit", "fieldKeyDocument", "<init>", "(Ljava/lang/String;Lbo/c;Ljava/lang/String;ILjava/lang/String;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Ljava/lang/String;", "Lbo/c;", "d", "f", "()Ljava/lang/String;", "e", "I", "h", "()I", "g", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<b>, vr.h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bo.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentKind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int fileLimit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldKeyDocument;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "", "Lbo/c;", "service", "<init>", "(Lbo/c;)V", "", "sessionToken", "documentKind", "fieldKeyDocument", "", "fileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lbo/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0179a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final bo.c service;

        public C0179a(@NotNull bo.c service) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0181b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0181b(@NotNull String documentId) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker$run$1", f = "DocumentCreateWorker.kt", l = {29, 40, 42}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10276t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10277u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10278v;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f10278v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L22;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f10278v
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r11.f10277u
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                java.lang.Object r0 = r11.f10276t
                jv.x r0 = (jv.x) r0
                jt.o.b(r12)
                goto Lb0
            L27:
                jt.o.b(r12)
                goto L5f
            L2b:
                jt.o.b(r12)
                com.withpersona.sdk2.inquiry.document.network.a r12 = com.withpersona.sdk2.inquiry.document.network.a.this
                bo.c r12 = com.withpersona.sdk2.inquiry.document.network.a.d(r12)
                com.withpersona.sdk2.inquiry.document.network.a r2 = com.withpersona.sdk2.inquiry.document.network.a.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.document.network.a.e(r2)
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest$a r6 = com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest.INSTANCE
                com.withpersona.sdk2.inquiry.document.network.a r7 = com.withpersona.sdk2.inquiry.document.network.a.this
                java.lang.String r7 = r7.getDocumentKind()
                com.withpersona.sdk2.inquiry.document.network.a r8 = com.withpersona.sdk2.inquiry.document.network.a.this
                int r8 = r8.getFileLimit()
                com.withpersona.sdk2.inquiry.document.network.a r9 = com.withpersona.sdk2.inquiry.document.network.a.this
                java.lang.String r9 = r9.getFieldKeyDocument()
                java.lang.String r10 = "document"
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest r6 = r6.a(r10, r7, r8, r9)
                r11.f10278v = r0
                r11.f10277u = r5
                java.lang.Object r12 = r12.c(r2, r6, r11)
                if (r12 != r1) goto L5f
                goto Laf
            L5f:
                jv.x r12 = (jv.x) r12
                boolean r2 = r12.g()
                if (r2 == 0) goto L92
                com.withpersona.sdk2.inquiry.document.network.a$b$b r2 = new com.withpersona.sdk2.inquiry.document.network.a$b$b
                java.lang.Object r3 = r12.a()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse r3 = (com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse) r3
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse$Data r3 = r3.getData()
                java.lang.String r3 = r3.getId()
                r2.<init>(r3)
                java.lang.Object r3 = pt.l.a(r0)
                r11.f10278v = r3
                java.lang.Object r12 = pt.l.a(r12)
                r11.f10276t = r12
                r11.f10277u = r4
                java.lang.Object r12 = r0.emit(r2, r11)
                if (r12 != r1) goto Lb0
                goto Laf
            L92:
                com.withpersona.sdk2.inquiry.document.network.a$b$a r2 = new com.withpersona.sdk2.inquiry.document.network.a$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r4 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r12)
                r2.<init>(r4)
                java.lang.Object r4 = pt.l.a(r0)
                r11.f10278v = r4
                java.lang.Object r12 = pt.l.a(r12)
                r11.f10276t = r12
                r11.f10277u = r3
                java.lang.Object r12 = r0.emit(r2, r11)
                if (r12 != r1) goto Lb0
            Laf:
                return r1
            Lb0:
                kotlin.Unit r12 = kotlin.Unit.f22483a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public /* synthetic */ a(String str, bo.c cVar, String str2, int i10, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, i10, str3);
    }

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.fieldKeyDocument, aVar.fieldKeyDocument);
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> otherWorker) {
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

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<b> run() {
        return j.w(new c(null));
    }

    public a(String str, bo.c cVar, String str2, int i10, String str3) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentKind = str2;
        this.fileLimit = i10;
        this.fieldKeyDocument = str3;
    }
}
