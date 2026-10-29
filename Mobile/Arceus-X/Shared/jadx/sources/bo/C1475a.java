package bo;

import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: bo.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u001fB)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m31665d2 = {"Lbo/a;", "Lym/o;", "Lbo/a$b;", "Lvr/h;", "", "sessionToken", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "<init>", "(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Ljava/lang/String;", "Lbo/c;", "d", "getDocumentId", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "f", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1475a implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1477c service;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String documentId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final DocumentFile.Remote remoteDocument;

    /* JADX INFO: renamed from: bo.a$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lbo/a$a;", "", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lbo/c;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "Lbo/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lbo/a;", "Lbo/c;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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
        public final C1475a m7576a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Remote remoteDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(remoteDocument, "remoteDocument");
            return new C1475a(sessionToken, this.service, documentId, remoteDocument, null);
        }
    }

    /* JADX INFO: renamed from: bo.a$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lbo/a$b;", "", "<init>", "()V", "b", "a", "Lbo/a$b$a;", "Lbo/a$b$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: bo.a$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lbo/a$b$a;", "Lbo/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
                return (other instanceof Error) && Intrinsics.m31980c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: bo.a$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lbo/a$b$b;", "Lbo/a$b;", "<init>", "()V", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14096b extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14096b f5731a = new C14096b();

            public C14096b() {
                super(null);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: bo.a.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: bo.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lbo/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1", m39664f = "DocumentFileDeleteWorker.kt", m39665l = {32, 38, 40}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f5732t;

        /* JADX INFO: renamed from: u */
        public Object f5733u;

        /* JADX INFO: renamed from: v */
        public int f5734v;

        /* JADX INFO: renamed from: w */
        public int f5735w;

        /* JADX INFO: renamed from: x */
        public int f5736x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f5737y;

        /* JADX INFO: renamed from: bo.a$c$a */
        @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Ljv/x;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1", m39664f = "DocumentFileDeleteWorker.kt", m39665l = {33}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<?>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f5739t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C1475a f5740u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1475a c1475a, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f5740u = c1475a;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f5740u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f5739t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC1477c interfaceC1477c = this.f5740u.service;
                String str = this.f5740u.sessionToken;
                String documentFileId = this.f5740u.getRemoteDocument().getDocumentFileId();
                this.f5739t = 1;
                Object objM7586d = interfaceC1477c.m7586d(str, documentFileId, this);
                return objM7586d == objM38805e ? objM38805e : objM7586d;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C1475a.this.new c(interfaceC9557b);
            cVar.f5737y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NetworkCallResult networkCallResult;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f5737y;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f5736x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                a aVar = new a(C1475a.this, null);
                this.f5737y = interfaceC9577i;
                this.f5736x = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else if (i10 == 2) {
                networkCallResult = (NetworkCallResult) this.f5732t;
                C7348o.m30470b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.Error error = new b.Error(networkErrorInfo);
                    this.f5737y = C10350l.m39676a(interfaceC9577i);
                    this.f5732t = networkCallResult;
                    this.f5733u = C10350l.m39676a(networkErrorInfo);
                    this.f5734v = 0;
                    this.f5735w = 0;
                    this.f5736x = 3;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            networkCallResult = (NetworkCallResult) obj;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                Object response = ((NetworkCallResult.Success) networkCallResult).getResponse();
                b.C14096b c14096b = b.C14096b.f5731a;
                this.f5737y = interfaceC9577i;
                this.f5732t = networkCallResult;
                this.f5733u = C10350l.m39676a(response);
                this.f5734v = 0;
                this.f5735w = 0;
                this.f5736x = 2;
                if (interfaceC9577i.emit(c14096b, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.Error error2 = new b.Error(networkErrorInfo2);
                this.f5737y = C10350l.m39676a(interfaceC9577i);
                this.f5732t = networkCallResult;
                this.f5733u = C10350l.m39676a(networkErrorInfo2);
                this.f5734v = 0;
                this.f5735w = 0;
                this.f5736x = 3;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 bo.c)
      (r3v0 java.lang.String)
      (r4v0 com.withpersona.sdk2.inquiry.document.DocumentFile$Remote)
     A[MD:(java.lang.String, bo.c, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentFile$Remote):void (m)] (LINE:1) call: bo.a.<init>(java.lang.String, bo.c, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentFile$Remote):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1475a(String str, InterfaceC1477c interfaceC1477c, String str2, DocumentFile.Remote remote, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC1477c, str2, remote);
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
        if (!(otherWorker instanceof C1475a)) {
            return false;
        }
        C1475a c1475a = (C1475a) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c1475a.sessionToken) && Intrinsics.m31980c(this.remoteDocument, c1475a.remoteDocument);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C1475a)) {
            return false;
        }
        C1475a c1475a = (C1475a) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c1475a.sessionToken) && Intrinsics.m31980c(this.remoteDocument, c1475a.remoteDocument);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final DocumentFile.Remote getRemoteDocument() {
        return this.remoteDocument;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1475a(String str, InterfaceC1477c interfaceC1477c, String str2, DocumentFile.Remote remote) {
        this.sessionToken = str;
        this.service = interfaceC1477c;
        this.documentId = str2;
        this.remoteDocument = remote;
    }
}
