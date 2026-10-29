package com.withpersona.sdk2.inquiry.document.network;

import androidx.core.app.NotificationCompat;
import bo.InterfaceC1477c;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\r\u0019B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "Lvr/h;", "", "sessionToken", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "documentId", "<init>", "(Ljava/lang/String;Lbo/c;Ljava/lang/String;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Ljava/lang/String;", "Lbo/c;", "d", "f", "()Ljava/lang/String;", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3455e implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1477c service;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String documentId;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lbo/c;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/network/e;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/e;", "Lbo/c;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC1477c service;

        public a(@NotNull InterfaceC1477c service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3455e m16743a(@NotNull String sessionToken, @NotNull String documentId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new C3455e(sessionToken, this.service, documentId, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14123b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<DocumentFile> documents;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14123b(@NotNull List<? extends DocumentFile> documents) {
                super(null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                this.documents = documents;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<DocumentFile> m16745a() {
                return this.documents;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.e.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1", m39664f = "DocumentLoadWorker.kt", m39665l = {32, 49, 51, 62}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f13403t;

        /* JADX INFO: renamed from: u */
        public Object f13404u;

        /* JADX INFO: renamed from: v */
        public Object f13405v;

        /* JADX INFO: renamed from: w */
        public int f13406w;

        /* JADX INFO: renamed from: x */
        public int f13407x;

        /* JADX INFO: renamed from: y */
        public int f13408y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f13409z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.e$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1", m39664f = "DocumentLoadWorker.kt", m39665l = {33}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<CreateDocumentResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f13410t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3455e f13411u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3455e c3455e, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f13411u = c3455e;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f13411u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f13410t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC1477c interfaceC1477c = this.f13411u.service;
                String str = this.f13411u.sessionToken;
                String documentId = this.f13411u.getDocumentId();
                this.f13410t = 1;
                Object objM7584b = interfaceC1477c.m7584b(str, documentId, this);
                return objM7584b == objM38805e ? objM38805e : objM7584b;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<CreateDocumentResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3455e.this.new c(interfaceC9557b);
            cVar.f13409z = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x010d  */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
        
            if (r1.emit(r6, r17) == r2) goto L47;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objEnqueueRetriableRequestWithRetry;
            NetworkCallResult networkCallResult;
            List listM31892k;
            List<DocumentFileData.RemoteDocumentFile> listM16671a;
            DocumentFileData.RemoteDocumentFile remoteDocumentFile;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13409z;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13408y;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                a aVar = new a(C3455e.this, null);
                this.f13409z = interfaceC9577i;
                this.f13408y = 1;
                objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
                if (objEnqueueRetriableRequestWithRetry != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                networkCallResult = (NetworkCallResult) this.f13403t;
                C7348o.m30470b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.a aVar2 = new b.a(networkErrorInfo);
                    this.f13409z = C10350l.m39676a(interfaceC9577i);
                    this.f13403t = networkCallResult;
                    this.f13404u = C10350l.m39676a(networkErrorInfo);
                    this.f13405v = null;
                    this.f13406w = 0;
                    this.f13407x = 0;
                    this.f13408y = 4;
                }
            } else {
                C7348o.m30470b(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            }
            return Unit.f29331a;
            networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (createDocumentResponse != null) {
                    List<DocumentFileData> listM16663b = createDocumentResponse.m16663b();
                    if (listM16663b != null) {
                        listM31892k = new ArrayList();
                        for (DocumentFileData documentFileData : listM16663b) {
                            DocumentFileData.Attributes attributes = documentFileData.getAttributes();
                            DocumentFile.Remote remote = (attributes == null || (listM16671a = attributes.m16671a()) == null || (remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) CollectionsKt.m31706d0(listM16671a)) == null) ? null : new DocumentFile.Remote(null, remoteDocumentFile.getFilename(), remoteDocumentFile.getUrl(), documentFileData.getId());
                            if (remote != null) {
                                listM31892k.add(remote);
                            }
                        }
                    } else {
                        listM31892k = C7699p.m31892k();
                    }
                    b.C14123b c14123b = new b.C14123b(listM31892k);
                    this.f13409z = interfaceC9577i;
                    this.f13403t = networkCallResult;
                    this.f13404u = C10350l.m39676a(createDocumentResponse);
                    this.f13405v = C10350l.m39676a(listM31892k);
                    this.f13406w = 0;
                    this.f13407x = 0;
                    this.f13408y = 2;
                    if (interfaceC9577i.emit(c14123b, this) != objM38805e) {
                    }
                } else {
                    b.a aVar3 = new b.a(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null", false, null, 8, null));
                    this.f13409z = interfaceC9577i;
                    this.f13403t = networkCallResult;
                    this.f13404u = C10350l.m39676a(createDocumentResponse);
                    this.f13406w = 0;
                    this.f13407x = 0;
                    this.f13408y = 3;
                    if (interfaceC9577i.emit(aVar3, this) != objM38805e) {
                    }
                }
                return objM38805e;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.a aVar4 = new b.a(networkErrorInfo2);
                this.f13409z = C10350l.m39676a(interfaceC9577i);
                this.f13403t = networkCallResult;
                this.f13404u = C10350l.m39676a(networkErrorInfo2);
                this.f13405v = null;
                this.f13406w = 0;
                this.f13407x = 0;
                this.f13408y = 4;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 bo.c), (r3v0 java.lang.String) A[MD:(java.lang.String, bo.c, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.e.<init>(java.lang.String, bo.c, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3455e(String str, InterfaceC1477c interfaceC1477c, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC1477c, str2);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3455e)) {
            return false;
        }
        C3455e c3455e = (C3455e) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3455e.sessionToken) && Intrinsics.m31980c(this.documentId, c3455e.documentId);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3455e)) {
            return false;
        }
        C3455e c3455e = (C3455e) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3455e.sessionToken) && Intrinsics.m31980c(this.documentId, c3455e.documentId);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3455e(String str, InterfaceC1477c interfaceC1477c, String str2) {
        this.sessionToken = str;
        this.service = interfaceC1477c;
        this.documentId = str2;
    }
}
