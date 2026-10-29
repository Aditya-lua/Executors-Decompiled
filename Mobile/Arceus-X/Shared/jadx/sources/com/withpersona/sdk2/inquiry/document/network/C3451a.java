package com.withpersona.sdk2.inquiry.document.network;

import androidx.core.app.NotificationCompat;
import bo.InterfaceC1477c;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0010!B1\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b \u0010\u001b¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lvr/h;", "", "sessionToken", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "documentKind", "", "fileLimit", "fieldKeyDocument", "<init>", "(Ljava/lang/String;Lbo/c;Ljava/lang/String;ILjava/lang/String;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Ljava/lang/String;", "Lbo/c;", "d", "f", "()Ljava/lang/String;", "e", "I", "h", "()I", "g", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3451a implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1477c service;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String documentKind;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int fileLimit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String fieldKeyDocument;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lbo/c;)V", "", "sessionToken", "documentKind", "fieldKeyDocument", "", "fileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lbo/c;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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
        public final C3451a m16704a(@NotNull String sessionToken, @NotNull String documentKind, @NotNull String fieldKeyDocument, int fileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentKind, "documentKind");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            return new C3451a(sessionToken, this.service, documentKind, fileLimit, fieldKeyDocument, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14119b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14119b(@NotNull String documentId) {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.a.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker$run$1", m39664f = "DocumentCreateWorker.kt", m39665l = {29, 40, 42}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f13333t;

        /* JADX INFO: renamed from: u */
        public int f13334u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f13335v;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3451a.this.new c(interfaceC9557b);
            cVar.f13335v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
        
            if (r0.emit(r2, r11) == r1) goto L22;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13335v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13334u;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            InterfaceC1477c interfaceC1477c = C3451a.this.service;
            String str = C3451a.this.sessionToken;
            CreateDocumentRequest createDocumentRequestM16653a = CreateDocumentRequest.INSTANCE.m16653a("document", C3451a.this.getDocumentKind(), C3451a.this.getFileLimit(), C3451a.this.getFieldKeyDocument());
            this.f13335v = interfaceC9577i;
            this.f13334u = 1;
            obj = interfaceC1477c.m7585c(str, createDocumentRequestM16653a, this);
            if (obj != objM38805e) {
            }
            return objM38805e;
            C7396x c7396x = (C7396x) obj;
            if (c7396x.m30657g()) {
                Object objM30653a = c7396x.m30653a();
                Intrinsics.checkNotNull(objM30653a);
                b.C14119b c14119b = new b.C14119b(((CreateDocumentResponse) objM30653a).getData().getId());
                this.f13335v = C10350l.m39676a(interfaceC9577i);
                this.f13333t = C10350l.m39676a(c7396x);
                this.f13334u = 2;
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(c7396x));
                this.f13335v = C10350l.m39676a(interfaceC9577i);
                this.f13333t = C10350l.m39676a(c7396x);
                this.f13334u = 3;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 bo.c), (r3v0 java.lang.String), (r4v0 int), (r5v0 java.lang.String) A[MD:(java.lang.String, bo.c, java.lang.String, int, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.a.<init>(java.lang.String, bo.c, java.lang.String, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3451a(String str, InterfaceC1477c interfaceC1477c, String str2, int i10, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC1477c, str2, i10, str3);
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
        if (!(otherWorker instanceof C3451a)) {
            return false;
        }
        C3451a c3451a = (C3451a) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3451a.sessionToken) && Intrinsics.m31980c(this.fieldKeyDocument, c3451a.fieldKeyDocument);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3451a)) {
            return false;
        }
        C3451a c3451a = (C3451a) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3451a.sessionToken) && Intrinsics.m31980c(this.fieldKeyDocument, c3451a.fieldKeyDocument);
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

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3451a(String str, InterfaceC1477c interfaceC1477c, String str2, int i10, String str3) {
        this.sessionToken = str;
        this.service = interfaceC1477c;
        this.documentKind = str2;
        this.fileLimit = i10;
        this.fieldKeyDocument = str3;
    }
}
