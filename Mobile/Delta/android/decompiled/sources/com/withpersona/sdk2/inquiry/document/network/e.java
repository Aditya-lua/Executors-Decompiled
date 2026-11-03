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
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0014\u000fB!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "Ltr/h;", "", "sessionToken", "Lzn/c;", "service", "documentId", "<init>", "(Ljava/lang/String;Lzn/c;Ljava/lang/String;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "b", "Ljava/lang/String;", "Lzn/c;", "d", "f", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements o<b>, tr.h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zn.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "", "Lzn/c;", "service", "<init>", "(Lzn/c;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/network/e;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/e;", "Lzn/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.c service;

        public a(@NotNull zn.c service) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0191b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<DocumentFile> documents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0191b(@NotNull List<? extends DocumentFile> documents) {
                super(null);
                Intrinsics.checkNotNullParameter(documents, "documents");
                this.documents = documents;
            }

            @NotNull
            public final List<DocumentFile> a() {
                return this.documents;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1", f = "DocumentLoadWorker.kt", l = {32, 49, 51, 62}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/e$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<i<? super b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10418t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10419u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10420v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10421w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f10422x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10423y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f10424z;

        @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1", f = "DocumentLoadWorker.kt", l = {33}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<CreateDocumentResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10425t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ e f10426u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f10426u = eVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f10426u, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f10425t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                zn.c cVar = this.f10426u.service;
                String str = this.f10426u.sessionToken;
                String documentId = this.f10426u.getDocumentId();
                this.f10425t = 1;
                Object objC = cVar.c(str, documentId, this);
                return objC == objE ? objE : objC;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<CreateDocumentResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = e.this.new c(bVar);
            cVar.f10424z = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x010d  */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
        
            if (r1.emit(r6, r17) == r2) goto L47;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public /* synthetic */ e(String str, zn.c cVar, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2);
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof e)) {
            return false;
        }
        e eVar = (e) otherWorker;
        return Intrinsics.c(this.sessionToken, eVar.sessionToken) && Intrinsics.c(this.documentId, eVar.documentId);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
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

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<b> run() {
        return j.w(new c(null));
    }

    public e(String str, zn.c cVar, String str2) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
    }
}
