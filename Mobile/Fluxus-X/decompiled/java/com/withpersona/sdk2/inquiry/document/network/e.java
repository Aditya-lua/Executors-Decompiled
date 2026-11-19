package com.withpersona.sdk2.inquiry.document.network;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import dv.i;
import gu.l;
import gu.m;
import java.util.ArrayList;
import java.util.List;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0014\rB!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lpo/c;", "service", "documentId", "<init>", "(Ljava/lang/String;Lpo/c;Ljava/lang/String;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Ljava/lang/String;", "Lpo/c;", "d", "f", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$a;", BuildConfig.FLAVOR, "Lpo/c;", "service", "<init>", "(Lpo/c;)V", BuildConfig.FLAVOR, "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/network/e;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/e;", "Lpo/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final po.c service;

        public a(@NotNull po.c service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final e a(@NotNull String sessionToken, @NotNull String documentId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new e(sessionToken, this.service, documentId, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InternalErrorInfo cause) {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", BuildConfig.FLAVOR, "Lno/e;", "documents", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0173b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<no.e> documents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0173b(@NotNull List<? extends no.e> documents) {
                super(null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                this.documents = documents;
            }

            @NotNull
            public final List<no.e> a() {
                return this.documents;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1", f = "DocumentLoadWorker.kt", l = {Barcode.FORMAT_EAN_13, 49, 51, 62}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9973t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9974u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9975v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9976w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9977x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9978y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f9979z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1", f = "DocumentLoadWorker.kt", l = {33}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<CreateDocumentResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9980t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ e f9981u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f9981u = eVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f9981u, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f9980t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                po.c cVar = this.f9981u.service;
                String str = this.f9981u.sessionToken;
                String documentId = this.f9981u.getDocumentId();
                this.f9980t = 1;
                Object objD = cVar.d(str, documentId, this);
                return objD == objE ? objE : objD;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<CreateDocumentResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = e.this.new c(bVar);
            cVar.f9979z = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x010d  */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
        
            if (r1.emit(r6, r17) == r2) goto L47;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objEnqueueRetriableRequestWithRetry;
            NetworkCallResult networkCallResult;
            List listK;
            List<DocumentFileData.RemoteDocumentFile> listA;
            DocumentFileData.RemoteDocumentFile remoteDocumentFile;
            i iVar = (i) this.f9979z;
            Object objE = fu.c.e();
            int i10 = this.f9978y;
            if (i10 == 0) {
                zt.o.b(obj);
                a aVar = new a(e.this, null);
                this.f9979z = iVar;
                this.f9978y = 1;
                objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
                if (objEnqueueRetriableRequestWithRetry != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                networkCallResult = (NetworkCallResult) this.f9973t;
                zt.o.b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.a aVar2 = new b.a(networkErrorInfo);
                    this.f9979z = l.a(iVar);
                    this.f9973t = networkCallResult;
                    this.f9974u = l.a(networkErrorInfo);
                    this.f9975v = null;
                    this.f9976w = 0;
                    this.f9977x = 0;
                    this.f9978y = 4;
                }
            } else {
                zt.o.b(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            }
            return Unit.f21506a;
            networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (createDocumentResponse != null) {
                    List<DocumentFileData> listB = createDocumentResponse.b();
                    if (listB != null) {
                        listK = new ArrayList();
                        for (DocumentFileData documentFileData : listB) {
                            DocumentFileData.Attributes attributes = documentFileData.getAttributes();
                            no.e.Remote remote = (attributes == null || (listA = attributes.a()) == null || (remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) CollectionsKt.d0(listA)) == null) ? null : new no.e.Remote(null, remoteDocumentFile.getFilename(), remoteDocumentFile.getUrl(), documentFileData.getId());
                            if (remote != null) {
                                listK.add(remote);
                            }
                        }
                    } else {
                        listK = p.k();
                    }
                    b.C0173b c0173b = new b.C0173b(listK);
                    this.f9979z = iVar;
                    this.f9973t = networkCallResult;
                    this.f9974u = l.a(createDocumentResponse);
                    this.f9975v = l.a(listK);
                    this.f9976w = 0;
                    this.f9977x = 0;
                    this.f9978y = 2;
                    if (iVar.emit(c0173b, this) != objE) {
                    }
                } else {
                    b.a aVar3 = new b.a(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null", false, null, 8, null));
                    this.f9979z = iVar;
                    this.f9973t = networkCallResult;
                    this.f9974u = l.a(createDocumentResponse);
                    this.f9976w = 0;
                    this.f9977x = 0;
                    this.f9978y = 3;
                    if (iVar.emit(aVar3, this) != objE) {
                    }
                }
                return objE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.a aVar4 = new b.a(networkErrorInfo2);
                this.f9979z = l.a(iVar);
                this.f9973t = networkCallResult;
                this.f9974u = l.a(networkErrorInfo2);
                this.f9975v = null;
                this.f9976w = 0;
                this.f9977x = 0;
                this.f9978y = 4;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ e(String str, po.c cVar, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(this.sessionToken, eVar.sessionToken) && Intrinsics.c(this.documentId, eVar.documentId);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(this.sessionToken, eVar.sessionToken) && Intrinsics.c(this.documentId, eVar.documentId);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }

    public e(String str, po.c cVar, String str2) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
    }
}
