package com.withpersona.sdk2.inquiry.document.network;

import androidx.core.app.NotificationCompat;
import bo.InterfaceC1477c;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import fo.InterfaceC5720a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mq.InterfaceC8644a;
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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016(BO\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "Lvr/h;", "", "sessionToken", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "inquiryId", "fromStep", "fromComponent", "Lfo/a;", "fallbackModeManager", "Lmq/a;", "dataCollector", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/lang/String;Lbo/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo/a;Lmq/a;Ljava/util/List;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Ljava/lang/String;", "Lbo/c;", "d", "e", "f", "g", "Lfo/a;", "h", "Lmq/a;", "i", "Ljava/util/List;", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3457g implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1477c service;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5720a fallbackModeManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8644a dataCollector;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final List<DocumentFile> documents;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$a */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "Lfo/a;", "fallbackModeManager", "Lmq/a;", "dataCollector", "<init>", "(Lbo/c;Lfo/a;Lmq/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/document/network/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/g;", "Lbo/c;", "b", "Lfo/a;", "c", "Lmq/a;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC1477c service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5720a fallbackModeManager;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC8644a dataCollector;

        public a(@NotNull InterfaceC1477c service, @NotNull InterfaceC5720a fallbackModeManager, @NotNull InterfaceC8644a dataCollector) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
            Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
            this.service = service;
            this.fallbackModeManager = fallbackModeManager;
            this.dataCollector = dataCollector;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3457g m16759a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull List<? extends DocumentFile> documents) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(documents, "documents");
            return new C3457g(sessionToken, this.service, inquiryId, fromStep, fromComponent, this.fallbackModeManager, this.dataCollector, documents, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "<init>", "()V", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14124b extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14124b f13425a = new C14124b();

            public C14124b() {
                super(null);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.g.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1", m39664f = "DocumentSubmitWorker.kt", m39665l = {43, 64, 66}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f13426t;

        /* JADX INFO: renamed from: u */
        public Object f13427u;

        /* JADX INFO: renamed from: v */
        public int f13428v;

        /* JADX INFO: renamed from: w */
        public int f13429w;

        /* JADX INFO: renamed from: x */
        public int f13430x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f13431y;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1$1", m39664f = "DocumentSubmitWorker.kt", m39665l = {46, 54}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f13433t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3457g f13434u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3457g c3457g, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f13434u = c3457g;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f13434u, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
            
                if (r8 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
            
                if (r8 == r0) goto L19;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f13433t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                        return (C7396x) obj;
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return (C7396x) obj;
                }
                C7348o.m30470b(obj);
                if (this.f13434u.fallbackModeManager.mo22892b()) {
                    InterfaceC5720a interfaceC5720a = this.f13434u.fallbackModeManager;
                    String str = this.f13434u.sessionToken;
                    SubmitDocumentRequest submitDocumentRequestM16692a = SubmitDocumentRequest.INSTANCE.m16692a(this.f13434u.fromStep, this.f13434u.fromComponent);
                    this.f13433t = 1;
                    obj = interfaceC5720a.mo22891a(str, submitDocumentRequestM16692a, this);
                } else {
                    InterfaceC1477c interfaceC1477c = this.f13434u.service;
                    String str2 = this.f13434u.sessionToken;
                    String str3 = this.f13434u.inquiryId;
                    SubmitDocumentRequest submitDocumentRequestM16692a2 = SubmitDocumentRequest.INSTANCE.m16692a(this.f13434u.fromStep, this.f13434u.fromComponent);
                    this.f13433t = 2;
                    obj = interfaceC1477c.m7587e(str2, str3, submitDocumentRequestM16692a2, this);
                }
                return objM38805e;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<? extends Object>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3457g.this.new c(interfaceC9557b);
            cVar.f13431y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0092  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
        
            if (r0.emit(r4, r9) == r1) goto L24;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NetworkCallResult networkCallResult;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13431y;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13430x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C3457g.this.dataCollector.mo34720a(new DocumentStepData(C3457g.this.fromStep, C3457g.this.documents));
                a aVar = new a(C3457g.this, null);
                this.f13431y = interfaceC9577i;
                this.f13430x = 1;
                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else if (i10 == 2) {
                networkCallResult = (NetworkCallResult) this.f13426t;
                C7348o.m30470b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.Error error = new b.Error(networkErrorInfo);
                    this.f13431y = C10350l.m39676a(interfaceC9577i);
                    this.f13426t = networkCallResult;
                    this.f13427u = C10350l.m39676a(networkErrorInfo);
                    this.f13428v = 0;
                    this.f13429w = 0;
                    this.f13430x = 3;
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
                b.C14124b c14124b = b.C14124b.f13425a;
                this.f13431y = interfaceC9577i;
                this.f13426t = networkCallResult;
                this.f13427u = C10350l.m39676a(response);
                this.f13428v = 0;
                this.f13429w = 0;
                this.f13430x = 2;
                if (interfaceC9577i.emit(c14124b, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.Error error2 = new b.Error(networkErrorInfo2);
                this.f13431y = C10350l.m39676a(interfaceC9577i);
                this.f13426t = networkCallResult;
                this.f13427u = C10350l.m39676a(networkErrorInfo2);
                this.f13428v = 0;
                this.f13429w = 0;
                this.f13430x = 3;
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
      (r4v0 java.lang.String)
      (r5v0 java.lang.String)
      (r6v0 fo.a)
      (r7v0 mq.a)
      (r8v0 java.util.List)
     A[MD:(java.lang.String, bo.c, java.lang.String, java.lang.String, java.lang.String, fo.a, mq.a, java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile>):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.g.<init>(java.lang.String, bo.c, java.lang.String, java.lang.String, java.lang.String, fo.a, mq.a, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3457g(String str, InterfaceC1477c interfaceC1477c, String str2, String str3, String str4, InterfaceC5720a interfaceC5720a, InterfaceC8644a interfaceC8644a, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC1477c, str2, str3, str4, interfaceC5720a, interfaceC8644a, list);
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
        return (otherWorker instanceof C3457g) && Intrinsics.m31980c(this.sessionToken, ((C3457g) otherWorker).sessionToken);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C3457g) && Intrinsics.m31980c(this.sessionToken, ((C3457g) otherWorker).sessionToken);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.DocumentFile> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3457g(String str, InterfaceC1477c interfaceC1477c, String str2, String str3, String str4, InterfaceC5720a interfaceC5720a, InterfaceC8644a interfaceC8644a, List<? extends DocumentFile> list) {
        this.sessionToken = str;
        this.service = interfaceC1477c;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.fallbackModeManager = interfaceC5720a;
        this.dataCollector = interfaceC8644a;
        this.documents = list;
    }
}
