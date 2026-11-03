package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import hv.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001d\u0018BO\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "Ltr/h;", "", "sessionToken", "Lzn/c;", "service", "inquiryId", "fromStep", "fromComponent", "Lco/a;", "fallbackModeManager", "Lkq/a;", "dataCollector", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/lang/String;Lzn/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/a;Lkq/a;Ljava/util/List;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "b", "Ljava/lang/String;", "Lzn/c;", "d", "e", "f", "g", "Lco/a;", "h", "Lkq/a;", "i", "Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements o<b>, tr.h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zn.c service;

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
    public final co.a fallbackModeManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.a dataCollector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<DocumentFile> documents;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "", "Lzn/c;", "service", "Lco/a;", "fallbackModeManager", "Lkq/a;", "dataCollector", "<init>", "(Lzn/c;Lco/a;Lkq/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/document/network/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/g;", "Lzn/c;", "b", "Lco/a;", "c", "Lkq/a;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.c service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final co.a fallbackModeManager;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kq.a dataCollector;

        public a(@NotNull zn.c service, @NotNull co.a fallbackModeManager, @NotNull kq.a dataCollector) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
            Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
            this.service = service;
            this.fallbackModeManager = fallbackModeManager;
            this.dataCollector = dataCollector;
        }

        @NotNull
        public final g a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull List<? extends DocumentFile> documents) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(documents, "documents");
            return new g(sessionToken, this.service, inquiryId, fromStep, fromComponent, this.fallbackModeManager, this.dataCollector, documents, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public static final class C0192b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0192b f10438a = new C0192b();

            public C0192b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1", f = "DocumentSubmitWorker.kt", l = {43, 64, 66}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/g$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<i<? super b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10439t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10440u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f10441v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10442w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f10443x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f10444y;

        @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1$1", f = "DocumentSubmitWorker.kt", l = {46, 54}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<? extends Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10446t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g f10447u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f10447u = gVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f10447u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
            
                if (r8 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
            
                if (r8 == r0) goto L19;
             */
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r7.f10446t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    gt.o.b(r8)
                    goto L84
                L12:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1a:
                    gt.o.b(r8)
                    goto L54
                L1e:
                    gt.o.b(r8)
                    com.withpersona.sdk2.inquiry.document.network.g r8 = r7.f10447u
                    co.a r8 = com.withpersona.sdk2.inquiry.document.network.g.f(r8)
                    boolean r8 = r8.b()
                    if (r8 == 0) goto L57
                    com.withpersona.sdk2.inquiry.document.network.g r8 = r7.f10447u
                    co.a r8 = com.withpersona.sdk2.inquiry.document.network.g.f(r8)
                    com.withpersona.sdk2.inquiry.document.network.g r1 = r7.f10447u
                    java.lang.String r1 = com.withpersona.sdk2.inquiry.document.network.g.k(r1)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$a r2 = com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.INSTANCE
                    com.withpersona.sdk2.inquiry.document.network.g r4 = r7.f10447u
                    java.lang.String r4 = com.withpersona.sdk2.inquiry.document.network.g.h(r4)
                    com.withpersona.sdk2.inquiry.document.network.g r5 = r7.f10447u
                    java.lang.String r5 = com.withpersona.sdk2.inquiry.document.network.g.g(r5)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest r2 = r2.a(r4, r5)
                    r7.f10446t = r3
                    java.lang.Object r8 = r8.a(r1, r2, r7)
                    if (r8 != r0) goto L54
                    goto L83
                L54:
                    hv.x r8 = (hv.x) r8
                    return r8
                L57:
                    com.withpersona.sdk2.inquiry.document.network.g r8 = r7.f10447u
                    zn.c r8 = com.withpersona.sdk2.inquiry.document.network.g.j(r8)
                    com.withpersona.sdk2.inquiry.document.network.g r1 = r7.f10447u
                    java.lang.String r1 = com.withpersona.sdk2.inquiry.document.network.g.k(r1)
                    com.withpersona.sdk2.inquiry.document.network.g r3 = r7.f10447u
                    java.lang.String r3 = com.withpersona.sdk2.inquiry.document.network.g.i(r3)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$a r4 = com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.INSTANCE
                    com.withpersona.sdk2.inquiry.document.network.g r5 = r7.f10447u
                    java.lang.String r5 = com.withpersona.sdk2.inquiry.document.network.g.h(r5)
                    com.withpersona.sdk2.inquiry.document.network.g r6 = r7.f10447u
                    java.lang.String r6 = com.withpersona.sdk2.inquiry.document.network.g.g(r6)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest r4 = r4.a(r5, r6)
                    r7.f10446t = r2
                    java.lang.Object r8 = r8.b(r1, r3, r4, r7)
                    if (r8 != r0) goto L84
                L83:
                    return r0
                L84:
                    hv.x r8 = (hv.x) r8
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.g.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<? extends Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = g.this.new c(bVar);
            cVar.f10444y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0092  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
        
            if (r0.emit(r4, r9) == r1) goto L24;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f10444y
                lu.i r0 = (lu.i) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r9.f10443x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L37
                if (r2 == r5) goto L33
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r0 = r9.f10440u
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r9.f10439t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                gt.o.b(r10)
                goto Lb9
            L23:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2b:
                java.lang.Object r2 = r9.f10439t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                gt.o.b(r10)
                goto L8e
            L33:
                gt.o.b(r10)
                goto L67
            L37:
                gt.o.b(r10)
                com.withpersona.sdk2.inquiry.document.network.g r10 = com.withpersona.sdk2.inquiry.document.network.g.this
                kq.a r10 = com.withpersona.sdk2.inquiry.document.network.g.d(r10)
                com.withpersona.sdk2.inquiry.document.network.DocumentStepData r2 = new com.withpersona.sdk2.inquiry.document.network.DocumentStepData
                com.withpersona.sdk2.inquiry.document.network.g r7 = com.withpersona.sdk2.inquiry.document.network.g.this
                java.lang.String r7 = com.withpersona.sdk2.inquiry.document.network.g.h(r7)
                com.withpersona.sdk2.inquiry.document.network.g r8 = com.withpersona.sdk2.inquiry.document.network.g.this
                java.util.List r8 = com.withpersona.sdk2.inquiry.document.network.g.e(r8)
                r2.<init>(r7, r8)
                r10.a(r2)
                com.withpersona.sdk2.inquiry.document.network.g$c$a r10 = new com.withpersona.sdk2.inquiry.document.network.g$c$a
                com.withpersona.sdk2.inquiry.document.network.g r2 = com.withpersona.sdk2.inquiry.document.network.g.this
                r7 = 0
                r10.<init>(r2, r7)
                r9.f10444y = r0
                r9.f10443x = r5
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r10, r9)
                if (r10 != r1) goto L67
                goto Lb8
            L67:
                r2 = r10
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                boolean r10 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r10 == 0) goto L8e
                r10 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r10 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r10
                java.lang.Object r10 = r10.getResponse()
                com.withpersona.sdk2.inquiry.document.network.g$b$b r5 = com.withpersona.sdk2.inquiry.document.network.g.b.C0192b.f10438a
                r9.f10444y = r0
                r9.f10439t = r2
                java.lang.Object r10 = nt.l.a(r10)
                r9.f10440u = r10
                r9.f10441v = r6
                r9.f10442w = r6
                r9.f10443x = r4
                java.lang.Object r10 = r0.emit(r5, r9)
                if (r10 != r1) goto L8e
                goto Lb8
            L8e:
                boolean r10 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r10 == 0) goto Lb9
                r10 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r10 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r10
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r10 = r10.getNetworkErrorInfo()
                com.withpersona.sdk2.inquiry.document.network.g$b$a r4 = new com.withpersona.sdk2.inquiry.document.network.g$b$a
                r4.<init>(r10)
                java.lang.Object r5 = nt.l.a(r0)
                r9.f10444y = r5
                r9.f10439t = r2
                java.lang.Object r10 = nt.l.a(r10)
                r9.f10440u = r10
                r9.f10441v = r6
                r9.f10442w = r6
                r9.f10443x = r3
                java.lang.Object r10 = r0.emit(r4, r9)
                if (r10 != r1) goto Lb9
            Lb8:
                return r1
            Lb9:
                kotlin.Unit r10 = kotlin.Unit.f22938a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public /* synthetic */ g(String str, zn.c cVar, String str2, String str3, String str4, co.a aVar, kq.a aVar2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, str3, str4, aVar, aVar2, list);
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof g) && Intrinsics.c(this.sessionToken, ((g) otherWorker).sessionToken);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof g) && Intrinsics.c(this.sessionToken, ((g) otherWorker).sessionToken);
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<b> run() {
        return j.w(new c(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(String str, zn.c cVar, String str2, String str3, String str4, co.a aVar, kq.a aVar2, List<? extends DocumentFile> list) {
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
