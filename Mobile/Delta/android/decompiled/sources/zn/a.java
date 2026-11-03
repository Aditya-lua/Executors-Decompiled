package zn;

import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import hv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.h;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016\u0011B)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lzn/a;", "Lwm/o;", "Lzn/a$b;", "Ltr/h;", "", "sessionToken", "Lzn/c;", "service", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "<init>", "(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "b", "Ljava/lang/String;", "Lzn/c;", "d", "getDocumentId", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "f", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<b>, h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zn.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentFile.Remote remoteDocument;

    /* JADX INFO: renamed from: zn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzn/a$a;", "", "Lzn/c;", "service", "<init>", "(Lzn/c;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "Lzn/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lzn/a;", "Lzn/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0693a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.c service;

        public C0693a(@NotNull zn.c service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.service = service;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Remote remoteDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(remoteDocument, "remoteDocument");
            return new a(sessionToken, this.service, documentId, remoteDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzn/a$b;", "", "<init>", "()V", "b", "a", "Lzn/a$b$a;", "Lzn/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: zn.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzn/a$b$a;", "Lzn/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: zn.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn/a$b$b;", "Lzn/a$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0695b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0695b f38204a = new C0695b();

            public C0695b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1", f = "DocumentFileDeleteWorker.kt", l = {32, 38, 40}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lzn/a$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<i<? super b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f38205t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f38206u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f38207v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f38208w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f38209x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f38210y;

        /* JADX INFO: renamed from: zn.a$c$a, reason: collision with other inner class name */
        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1", f = "DocumentFileDeleteWorker.kt", l = {33}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhv/x;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class C0696a extends m implements Function1<lt.b<? super x<?>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f38212t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f38213u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0696a(a aVar, lt.b<? super C0696a> bVar) {
                super(1, bVar);
                this.f38213u = aVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new C0696a(this.f38213u, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f38212t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                zn.c cVar = this.f38213u.service;
                String str = this.f38213u.sessionToken;
                String documentFileId = this.f38213u.getRemoteDocument().getDocumentFileId();
                this.f38212t = 1;
                Object objA = cVar.a(str, documentFileId, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<?>> bVar) {
                return ((C0696a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.f38210y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f38210y
                lu.i r0 = (lu.i) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r8.f38209x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L37
                if (r2 == r5) goto L33
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r0 = r8.f38206u
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r8.f38205t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                gt.o.b(r9)
                goto L9f
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                java.lang.Object r2 = r8.f38205t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                gt.o.b(r9)
                goto L74
            L33:
                gt.o.b(r9)
                goto L4d
            L37:
                gt.o.b(r9)
                zn.a$c$a r9 = new zn.a$c$a
                zn.a r2 = zn.a.this
                r7 = 0
                r9.<init>(r2, r7)
                r8.f38210y = r0
                r8.f38209x = r5
                java.lang.Object r9 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueRetriableRequestWithRetry(r9, r8)
                if (r9 != r1) goto L4d
                goto L9e
            L4d:
                r2 = r9
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                boolean r9 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r9 == 0) goto L74
                r9 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r9
                java.lang.Object r9 = r9.getResponse()
                zn.a$b$b r5 = zn.a.b.C0695b.f38204a
                r8.f38210y = r0
                r8.f38205t = r2
                java.lang.Object r9 = nt.l.a(r9)
                r8.f38206u = r9
                r8.f38207v = r6
                r8.f38208w = r6
                r8.f38209x = r4
                java.lang.Object r9 = r0.emit(r5, r8)
                if (r9 != r1) goto L74
                goto L9e
            L74:
                boolean r9 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r9 == 0) goto L9f
                r9 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r9
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r9 = r9.getNetworkErrorInfo()
                zn.a$b$a r4 = new zn.a$b$a
                r4.<init>(r9)
                java.lang.Object r5 = nt.l.a(r0)
                r8.f38210y = r5
                r8.f38205t = r2
                java.lang.Object r9 = nt.l.a(r9)
                r8.f38206u = r9
                r8.f38207v = r6
                r8.f38208w = r6
                r8.f38209x = r3
                java.lang.Object r9 = r0.emit(r4, r8)
                if (r9 != r1) goto L9f
            L9e:
                return r1
            L9f:
                kotlin.Unit r9 = kotlin.Unit.f22938a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: zn.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public /* synthetic */ a(String str, zn.c cVar, String str2, DocumentFile.Remote remote, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, remote);
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.remoteDocument, aVar.remoteDocument);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return Intrinsics.c(this.sessionToken, aVar.sessionToken) && Intrinsics.c(this.remoteDocument, aVar.remoteDocument);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final DocumentFile.Remote getRemoteDocument() {
        return this.remoteDocument;
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<b> run() {
        return j.w(new c(null));
    }

    public a(String str, zn.c cVar, String str2, DocumentFile.Remote remote) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
        this.remoteDocument = remote;
    }
}
