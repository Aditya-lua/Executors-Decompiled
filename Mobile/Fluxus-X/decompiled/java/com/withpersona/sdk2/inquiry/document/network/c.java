package com.withpersona.sdk2.inquiry.document.network;

import av.g1;
import av.h2;
import av.p0;
import av.q0;
import av.w0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import dv.i;
import gu.l;
import gu.m;
import hn.w;
import java.io.File;
import java.util.List;
import ln.o;
import ls.j;
import mv.b0;
import mv.c0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;
import xq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002!\u0012B9\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lpo/c;", "service", "documentId", "Lno/e$a;", "localDocument", "Lxq/k;", "fileHelper", BuildConfig.FLAVOR, "isSingleFileLimit", "<init>", "(Ljava/lang/String;Lpo/c;Ljava/lang/String;Lno/e$a;Lxq/k;Z)V", "otherWorker", "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "n", "(Leu/b;)Ljava/lang/Object;", "documentFileId", BuildConfig.FLAVOR, "m", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "Lpo/c;", "d", "e", "Lno/e$a;", "f", "Lxq/k;", "g", "Z", "Lav/p0;", "h", "Lav/p0;", "serviceCoroutineScope", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.c service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String documentId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.e.Local localDocument;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k fileHelper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isSingleFileLimit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceCoroutineScope;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$a;", BuildConfig.FLAVOR, "Lpo/c;", "service", "Lxq/k;", "fileHelper", "<init>", "(Lpo/c;Lxq/k;)V", BuildConfig.FLAVOR, "sessionToken", "documentId", "Lno/e$a;", "localDocument", BuildConfig.FLAVOR, "isSingleFileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Lno/e$a;Z)Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lpo/c;", "b", "Lxq/k;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final po.c service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final k fileHelper;

        public a(@NotNull po.c service, @NotNull k fileHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            this.service = service;
            this.fileHelper = fileHelper;
        }

        @NotNull
        public final c a(@NotNull String sessionToken, @NotNull String documentId, @NotNull no.e.Local localDocument, boolean isSingleFileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(localDocument, "localDocument");
            return new c(sessionToken, this.service, documentId, localDocument, this.fileHelper, isSingleFileLimit, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "d", "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0167b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0167b(@NotNull InternalErrorInfo cause) {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", BuildConfig.FLAVOR, "progressPercentage", "<init>", "(I)V", "a", "I", "()I", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0168c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int progressPercentage;

            public C0168c(int i10) {
                super(null);
                this.progressPercentage = i10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lno/e$a;", "oldLocalDocument", "Lno/e$b;", "newRemoteDocument", "<init>", "(Lno/e$a;Lno/e$b;)V", "a", "Lno/e$a;", "b", "()Lno/e$a;", "Lno/e$b;", "()Lno/e$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final no.e.Local oldLocalDocument;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final no.e.Remote newRemoteDocument;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull no.e.Local oldLocalDocument, @NotNull no.e.Remote newRemoteDocument) {
                super(null);
                Intrinsics.checkNotNullParameter(oldLocalDocument, "oldLocalDocument");
                Intrinsics.checkNotNullParameter(newRemoteDocument, "newRemoteDocument");
                this.oldLocalDocument = oldLocalDocument;
                this.newRemoteDocument = newRemoteDocument;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final no.e.Remote getNewRemoteDocument() {
                return this.newRemoteDocument;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final no.e.Local getOldLocalDocument() {
                return this.oldLocalDocument;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsw/x;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$deleteFile$2", f = "DocumentFileUploadWorker.kt", l = {208}, m = "invokeSuspend")
    public static final class C0169c extends m implements Function1<eu.b<? super x<?>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9928t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9930v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0169c(String str, eu.b<? super C0169c> bVar) {
            super(1, bVar);
            this.f9930v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return c.this.new C0169c(this.f9930v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9928t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            po.c cVar = c.this.service;
            String str = c.this.sessionToken;
            String str2 = this.f9930v;
            this.f9928t = 1;
            Object objB = cVar.b(str, str2, this);
            return objB == objE ? objE : objB;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super x<?>> bVar) {
            return ((C0169c) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker", f = "DocumentFileUploadWorker.kt", l = {191}, m = "fetchCurrentDocuments")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9931t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9933v;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9931t = obj;
            this.f9933v |= Integer.MIN_VALUE;
            return c.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$fetchCurrentDocuments$result$1", f = "DocumentFileUploadWorker.kt", l = {192}, m = "invokeSuspend")
    public static final class e extends m implements Function1<eu.b<? super x<CreateDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9934t;

        public e(eu.b<? super e> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return c.this.new e(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9934t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            po.c cVar = c.this.service;
            String str = c.this.sessionToken;
            String str2 = c.this.documentId;
            this.f9934t = 1;
            Object objD = cVar.d(str, str2, this);
            return objD == objE ? objE : objD;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super x<CreateDocumentResponse>> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", f = "DocumentFileUploadWorker.kt", l = {66, 69, 177}, m = "invokeSuspend")
    public static final class f extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9936t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9937u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9938v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9939w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9940x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9941y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f9942z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<b> f9943a;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", f = "DocumentFileUploadWorker.kt", l = {178}, m = "emit")
            public static final class C0170a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f9944t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f9945u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ a<T> f9946v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f9947w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0170a(a<? super T> aVar, eu.b<? super C0170a> bVar) {
                    super(bVar);
                    this.f9946v = aVar;
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f9945u = obj;
                    this.f9947w |= Integer.MIN_VALUE;
                    return this.f9946v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super b> iVar) {
                this.f9943a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, eu.b<? super Unit> bVar2) {
                C0170a c0170a;
                if (bVar2 instanceof C0170a) {
                    c0170a = (C0170a) bVar2;
                    int i10 = c0170a.f9947w;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0170a.f9947w = i10 - Integer.MIN_VALUE;
                    } else {
                        c0170a = new C0170a(this, bVar2);
                    }
                } else {
                    c0170a = new C0170a(this, bVar2);
                }
                Object obj = c0170a.f9945u;
                Object objE = fu.c.e();
                int i11 = c0170a.f9947w;
                if (i11 == 0) {
                    zt.o.b(obj);
                    i<b> iVar = this.f9943a;
                    c0170a.f9944t = bVar;
                    c0170a.f9947w = 1;
                    if (iVar.emit(bVar, c0170a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) c0170a.f9944t;
                    zt.o.b(obj);
                }
                if ((bVar instanceof b.a) || (bVar instanceof b.C0167b)) {
                    h2.d(c0170a.getContext(), null, 1, null);
                }
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1", f = "DocumentFileUploadWorker.kt", l = {169, 173}, m = "invokeSuspend")
        public static final class b extends m implements Function2<i<? super b.C0168c>, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9948t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f9949u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ po.e f9950v;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1$1", f = "DocumentFileUploadWorker.kt", l = {}, m = "invokeSuspend")
            public static final class a extends m implements Function2<Integer, eu.b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f9951t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ int f9952u;

                public a(eu.b<? super a> bVar) {
                    super(2, bVar);
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    a aVar = new a(bVar);
                    aVar.f9952u = ((Number) obj).intValue();
                    return aVar;
                }

                @Override // p001kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, eu.b<? super Boolean> bVar) {
                    return m(num.intValue(), bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    int i10 = this.f9952u;
                    fu.c.e();
                    if (this.f9951t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return gu.b.a(i10 < 100);
                }

                public final Object m(int i10, eu.b<? super Boolean> bVar) {
                    return ((a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0171b<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i<b.C0168c> f9953a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0171b(i<? super b.C0168c> iVar) {
                    this.f9953a = iVar;
                }

                public final Object b(int i10, eu.b<? super Unit> bVar) {
                    Object objEmit = this.f9953a.emit(new b.C0168c(i10), bVar);
                    return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
                }

                @Override // dv.i
                public /* bridge */ /* synthetic */ Object emit(Object obj, eu.b bVar) {
                    return b(((Number) obj).intValue(), bVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(po.e eVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f9950v = eVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                b bVar2 = new b(this.f9950v, bVar);
                bVar2.f9949u = obj;
                return bVar2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            
                if (r0.emit(r7, r6) == r1) goto L15;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                i iVar = (i) this.f9949u;
                Object objE = fu.c.e();
                int i10 = this.f9948t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        zt.o.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return Unit.f21506a;
                }
                zt.o.b(obj);
                dv.h hVarO = dv.j.O(this.f9950v.i(), new a(null));
                C0171b c0171b = new C0171b(iVar);
                this.f9949u = iVar;
                this.f9948t = 1;
                if (hVarO.collect(c0171b, this) != objE) {
                }
                return objE;
                b.C0168c c0168c = new b.C0168c(100);
                this.f9949u = l.a(iVar);
                this.f9948t = 2;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b.C0168c> iVar, eu.b<? super Unit> bVar) {
                return ((b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "(Lav/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", f = "DocumentFileUploadWorker.kt", l = {80}, m = "invokeSuspend")
        public static final class C0172c extends m implements Function2<p0, eu.b<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9954t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f9955u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ po.e f9956v;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", f = "DocumentFileUploadWorker.kt", l = {81}, m = "invokeSuspend")
            public static final class a extends m implements Function1<eu.b<? super x<DocumentFileUploadResponse>>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f9957t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ c f9958u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ po.e f9959v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(c cVar, po.e eVar, eu.b<? super a> bVar) {
                    super(1, bVar);
                    this.f9958u = cVar;
                    this.f9959v = eVar;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new a(this.f9958u, this.f9959v, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = fu.c.e();
                    int i10 = this.f9957t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                        return obj;
                    }
                    zt.o.b(obj);
                    po.c cVar = this.f9958u.service;
                    String str = this.f9958u.sessionToken;
                    c0.c.Companion companion = c0.c.INSTANCE;
                    c0.c cVarB = companion.b("data[type]", "document-file");
                    c0.c cVarB2 = companion.b("data[attributes][document-id]", this.f9958u.documentId);
                    c0.c cVarB3 = companion.b("data[attributes][capture-method]", this.f9958u.localDocument.getCaptureMethod().getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String());
                    c0.c cVarC = companion.c("data[attributes][originals][]", this.f9958u.localDocument.getAbsoluteFilePath(), this.f9959v);
                    String name = new File(this.f9958u.localDocument.getAbsoluteFilePath()).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    List<c0.c> listN = p.n(cVarB, cVarB2, cVarB3, cVarC, companion.b("data[attributes][name]", name));
                    this.f9957t = 1;
                    Object objE2 = cVar.e(str, listN, this);
                    return objE2 == objE ? objE : objE2;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super x<DocumentFileUploadResponse>> bVar) {
                    return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0172c(c cVar, po.e eVar, eu.b<? super C0172c> bVar) {
                super(2, bVar);
                this.f9955u = cVar;
                this.f9956v = eVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0172c(this.f9955u, this.f9956v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super NetworkCallResult<DocumentFileUploadResponse>> bVar) {
                return ((C0172c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f9954t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                a aVar = new a(this.f9955u, this.f9956v, null);
                this.f9954t = 1;
                Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                return objEnqueueVerificationRequestWithRetry == objE ? objE : objEnqueueVerificationRequestWithRetry;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", f = "DocumentFileUploadWorker.kt", l = {106, 110, 122, 147, 149, 156, 162}, m = "invokeSuspend")
        public static final class d extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {
            public final /* synthetic */ w0<NetworkCallResult<DocumentFileUploadResponse>> A;
            public final /* synthetic */ c B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f9960t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f9961u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f9962v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f9963w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f9964x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f9965y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f9966z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(w0<? extends NetworkCallResult<DocumentFileUploadResponse>> w0Var, c cVar, eu.b<? super d> bVar) {
                super(2, bVar);
                this.A = w0Var;
                this.B = cVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                d dVar = new d(this.A, this.B, bVar);
                dVar.f9966z = obj;
                return dVar;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0058  */
            /* JADX WARN: Code duplicated, block: B:24:0x007c  */
            /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:37:0x0105  */
            /* JADX WARN: Code duplicated, block: B:52:0x01ad  */
            /* JADX WARN: Code duplicated, block: B:55:0x01da  */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x01a4, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x01d7, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x01fa, code lost:
            
                if (r0.emit(r5, r13) == r1) goto L57;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                NetworkCallResult networkCallResult;
                DocumentFileUploadResponse documentFileUploadResponse;
                DocumentFileData.RemoteDocumentFile remoteDocumentFile;
                b.a aVar;
                DocumentFileData data;
                DocumentFileData.Attributes attributes;
                List<DocumentFileData.RemoteDocumentFile> listA;
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
                i iVar = (i) this.f9966z;
                Object objE = fu.c.e();
                GenericFileUploadErrorResponse genericFileUploadErrorResponse = null;
                switch (this.f9965y) {
                    case 0:
                        zt.o.b(obj);
                        w0<NetworkCallResult<DocumentFileUploadResponse>> w0Var = this.A;
                        this.f9966z = iVar;
                        this.f9965y = 1;
                        obj = w0Var.y(this);
                        if (obj != objE) {
                            networkCallResult = (NetworkCallResult) obj;
                            c cVar = this.B;
                            if (networkCallResult instanceof NetworkCallResult.Success) {
                                documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                                if (documentFileUploadResponse != null || (data = documentFileUploadResponse.getData()) == null || (attributes = data.getAttributes()) == null || (listA = attributes.a()) == null) {
                                    remoteDocumentFile = null;
                                } else {
                                    remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) CollectionsKt.firstOrNull(listA);
                                }
                                if (documentFileUploadResponse != null || remoteDocumentFile == null) {
                                    aVar = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.f9966z = iVar;
                                    this.f9960t = networkCallResult;
                                    this.f9961u = l.a(documentFileUploadResponse);
                                    this.f9962v = l.a(remoteDocumentFile);
                                    this.f9963w = 0;
                                    this.f9964x = 0;
                                    this.f9965y = 3;
                                    if (iVar.emit(aVar, this) != objE) {
                                    }
                                } else {
                                    b.d dVar = new b.d(cVar.localDocument, new no.e.Remote(cVar.localDocument.getAbsoluteFilePath(), remoteDocumentFile.getFilename(), remoteDocumentFile.getUrl(), documentFileUploadResponse.getData().getId()));
                                    this.f9966z = iVar;
                                    this.f9960t = networkCallResult;
                                    this.f9961u = l.a(documentFileUploadResponse);
                                    this.f9962v = l.a(remoteDocumentFile);
                                    this.f9963w = 0;
                                    this.f9964x = 0;
                                    this.f9965y = 2;
                                    if (iVar.emit(dVar, this) != objE) {
                                    }
                                }
                            }
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                                networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                if (!networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                                    ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                                    Intrinsics.d(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError");
                                    i0 errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                                    if (errorBody != null) {
                                        try {
                                            genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new w.b().a(GenericFileUploadErrorResponse.Companion.getAdapter()).d().c(GenericFileUploadErrorResponse.class).fromJson(errorBody.getSource());
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (genericFileUploadErrorResponse == null) {
                                        b.a aVar2 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                        this.f9966z = l.a(iVar);
                                        this.f9960t = networkCallResult;
                                        this.f9961u = l.a(networkErrorInfo);
                                        this.f9962v = l.a(genericFileUploadErrorResponse);
                                        this.f9963w = 0;
                                        this.f9964x = 0;
                                        this.f9965y = 5;
                                    } else {
                                        b.a aVar3 = new b.a(genericFileUploadErrorResponse.getErrors().get(0));
                                        this.f9966z = l.a(iVar);
                                        this.f9960t = networkCallResult;
                                        this.f9961u = l.a(networkErrorInfo);
                                        this.f9962v = l.a(genericFileUploadErrorResponse);
                                        this.f9963w = 0;
                                        this.f9964x = 0;
                                        this.f9965y = 4;
                                    }
                                } else if (!networkErrorInfo.isRecoverable()) {
                                    b.C0167b c0167b = new b.C0167b(networkErrorInfo);
                                    this.f9966z = l.a(iVar);
                                    this.f9960t = networkCallResult;
                                    this.f9961u = l.a(networkErrorInfo);
                                    this.f9962v = null;
                                    this.f9963w = 0;
                                    this.f9964x = 0;
                                    this.f9965y = 7;
                                } else {
                                    b.a aVar4 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.f9966z = l.a(iVar);
                                    this.f9960t = networkCallResult;
                                    this.f9961u = l.a(networkErrorInfo);
                                    this.f9962v = null;
                                    this.f9963w = 0;
                                    this.f9964x = 0;
                                    this.f9965y = 6;
                                }
                                break;
                            }
                            return Unit.f21506a;
                        }
                        return objE;
                    case 1:
                        zt.o.b(obj);
                        networkCallResult = (NetworkCallResult) obj;
                        c cVar2 = this.B;
                        if (networkCallResult instanceof NetworkCallResult.Success) {
                            documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                            if (documentFileUploadResponse != null) {
                                remoteDocumentFile = null;
                            } else {
                                remoteDocumentFile = null;
                            }
                            if (documentFileUploadResponse != null) {
                                aVar = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f9966z = iVar;
                                this.f9960t = networkCallResult;
                                this.f9961u = l.a(documentFileUploadResponse);
                                this.f9962v = l.a(remoteDocumentFile);
                                this.f9963w = 0;
                                this.f9964x = 0;
                                this.f9965y = 3;
                                if (iVar.emit(aVar, this) != objE) {
                                }
                            } else {
                                aVar = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f9966z = iVar;
                                this.f9960t = networkCallResult;
                                this.f9961u = l.a(documentFileUploadResponse);
                                this.f9962v = l.a(remoteDocumentFile);
                                this.f9963w = 0;
                                this.f9964x = 0;
                                this.f9965y = 3;
                                if (iVar.emit(aVar, this) != objE) {
                                }
                            }
                            return objE;
                        }
                        if (networkCallResult instanceof NetworkCallResult.Failure) {
                            networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                            if (!networkErrorInfo.isRecoverable()) {
                            }
                            if (!networkErrorInfo.isRecoverable()) {
                                b.C0167b c0167b2 = new b.C0167b(networkErrorInfo);
                                this.f9966z = l.a(iVar);
                                this.f9960t = networkCallResult;
                                this.f9961u = l.a(networkErrorInfo);
                                this.f9962v = null;
                                this.f9963w = 0;
                                this.f9964x = 0;
                                this.f9965y = 7;
                            } else {
                                b.a aVar5 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f9966z = l.a(iVar);
                                this.f9960t = networkCallResult;
                                this.f9961u = l.a(networkErrorInfo);
                                this.f9962v = null;
                                this.f9963w = 0;
                                this.f9964x = 0;
                                this.f9965y = 6;
                            }
                            break;
                        }
                        return Unit.f21506a;
                    case 2:
                    case 3:
                        networkCallResult = (NetworkCallResult) this.f9960t;
                        zt.o.b(obj);
                        if (networkCallResult instanceof NetworkCallResult.Failure) {
                            networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                            if (!networkErrorInfo.isRecoverable()) {
                            }
                            if (!networkErrorInfo.isRecoverable()) {
                                b.C0167b c0167b3 = new b.C0167b(networkErrorInfo);
                                this.f9966z = l.a(iVar);
                                this.f9960t = networkCallResult;
                                this.f9961u = l.a(networkErrorInfo);
                                this.f9962v = null;
                                this.f9963w = 0;
                                this.f9964x = 0;
                                this.f9965y = 7;
                            } else {
                                b.a aVar6 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f9966z = l.a(iVar);
                                this.f9960t = networkCallResult;
                                this.f9961u = l.a(networkErrorInfo);
                                this.f9962v = null;
                                this.f9963w = 0;
                                this.f9964x = 0;
                                this.f9965y = 6;
                            }
                            break;
                        }
                        return Unit.f21506a;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        zt.o.b(obj);
                        return Unit.f21506a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
                return ((d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public f(eu.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            f fVar = c.this.new f(bVar);
            fVar.f9942z = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00ab A[PHI: r3
          0x00ab: PHI (r3v5 java.lang.String) = 
          (r3v3 java.lang.String)
          (r3v4 java.lang.String)
          (r3v4 java.lang.String)
          (r3v4 java.lang.String)
          (r3v11 java.lang.String)
         binds: [B:13:0x006b, B:18:0x0082, B:20:0x0088, B:23:0x00a7, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x012c, code lost:
        
            if (r5.collect(r6, r16) == r2) goto L27;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String strA;
            Object objN;
            List list;
            i iVar = (i) this.f9942z;
            Object objE = fu.c.e();
            int i10 = this.f9941y;
            if (i10 == 0) {
                zt.o.b(obj);
                strA = c.this.fileHelper.a(c.this.localDocument.getAbsoluteFilePath());
                if (c.this.isSingleFileLimit) {
                    c cVar = c.this;
                    this.f9942z = iVar;
                    this.f9936t = strA;
                    this.f9941y = 1;
                    objN = cVar.n(this);
                    if (objN != objE) {
                        List list2 = (List) objN;
                        list = list2;
                        if (list != null) {
                            po.e eVar = new po.e(new File(c.this.localDocument.getAbsoluteFilePath()), b0.INSTANCE.b(strA));
                            w0 w0VarB = av.k.b(c.this.serviceCoroutineScope, g1.b(), null, new C0172c(c.this, eVar, null), 2, null);
                            dv.h hVarW = dv.j.w(new d(w0VarB, c.this, null));
                            dv.h hVarW2 = dv.j.w(new b(eVar, null));
                            dv.h hVarC = dv.j.C(hVarW, hVarW2);
                            a aVar = new a(iVar);
                            this.f9942z = l.a(iVar);
                            this.f9936t = l.a(strA);
                            this.f9937u = l.a(eVar);
                            this.f9938v = l.a(w0VarB);
                            this.f9939w = l.a(hVarW);
                            this.f9940x = l.a(hVarW2);
                            this.f9941y = 3;
                        } else {
                            po.e eVar2 = new po.e(new File(c.this.localDocument.getAbsoluteFilePath()), b0.INSTANCE.b(strA));
                            w0 w0VarB2 = av.k.b(c.this.serviceCoroutineScope, g1.b(), null, new C0172c(c.this, eVar2, null), 2, null);
                            dv.h hVarW3 = dv.j.w(new d(w0VarB2, c.this, null));
                            dv.h hVarW4 = dv.j.w(new b(eVar2, null));
                            dv.h hVarC2 = dv.j.C(hVarW3, hVarW4);
                            a aVar2 = new a(iVar);
                            this.f9942z = l.a(iVar);
                            this.f9936t = l.a(strA);
                            this.f9937u = l.a(eVar2);
                            this.f9938v = l.a(w0VarB2);
                            this.f9939w = l.a(hVarW3);
                            this.f9940x = l.a(hVarW4);
                            this.f9941y = 3;
                        }
                    }
                } else {
                    po.e eVar3 = new po.e(new File(c.this.localDocument.getAbsoluteFilePath()), b0.INSTANCE.b(strA));
                    w0 w0VarB3 = av.k.b(c.this.serviceCoroutineScope, g1.b(), null, new C0172c(c.this, eVar3, null), 2, null);
                    dv.h hVarW5 = dv.j.w(new d(w0VarB3, c.this, null));
                    dv.h hVarW6 = dv.j.w(new b(eVar3, null));
                    dv.h hVarC3 = dv.j.C(hVarW5, hVarW6);
                    a aVar3 = new a(iVar);
                    this.f9942z = l.a(iVar);
                    this.f9936t = l.a(strA);
                    this.f9937u = l.a(eVar3);
                    this.f9938v = l.a(w0VarB3);
                    this.f9939w = l.a(hVarW5);
                    this.f9940x = l.a(hVarW6);
                    this.f9941y = 3;
                }
                return objE;
            }
            if (i10 == 1) {
                strA = (String) this.f9936t;
                zt.o.b(obj);
                objN = obj;
                List list3 = (List) objN;
                list = list3;
                if (list != null || list.isEmpty()) {
                    po.e eVar4 = new po.e(new File(c.this.localDocument.getAbsoluteFilePath()), b0.INSTANCE.b(strA));
                    w0 w0VarB4 = av.k.b(c.this.serviceCoroutineScope, g1.b(), null, new C0172c(c.this, eVar4, null), 2, null);
                    dv.h hVarW7 = dv.j.w(new d(w0VarB4, c.this, null));
                    dv.h hVarW8 = dv.j.w(new b(eVar4, null));
                    dv.h hVarC4 = dv.j.C(hVarW7, hVarW8);
                    a aVar4 = new a(iVar);
                    this.f9942z = l.a(iVar);
                    this.f9936t = l.a(strA);
                    this.f9937u = l.a(eVar4);
                    this.f9938v = l.a(w0VarB4);
                    this.f9939w = l.a(hVarW7);
                    this.f9940x = l.a(hVarW8);
                    this.f9941y = 3;
                } else {
                    c cVar2 = c.this;
                    String id2 = ((DocumentFileData) CollectionsKt.d0(list3)).getId();
                    this.f9942z = iVar;
                    this.f9936t = strA;
                    this.f9937u = l.a(list3);
                    this.f9941y = 2;
                    if (cVar2.m(id2, this) != objE) {
                        po.e eVar5 = new po.e(new File(c.this.localDocument.getAbsoluteFilePath()), b0.INSTANCE.b(strA));
                        w0 w0VarB5 = av.k.b(c.this.serviceCoroutineScope, g1.b(), null, new C0172c(c.this, eVar5, null), 2, null);
                        dv.h hVarW9 = dv.j.w(new d(w0VarB5, c.this, null));
                        dv.h hVarW10 = dv.j.w(new b(eVar5, null));
                        dv.h hVarC5 = dv.j.C(hVarW9, hVarW10);
                        a aVar5 = new a(iVar);
                        this.f9942z = l.a(iVar);
                        this.f9936t = l.a(strA);
                        this.f9937u = l.a(eVar5);
                        this.f9938v = l.a(w0VarB5);
                        this.f9939w = l.a(hVarW9);
                        this.f9940x = l.a(hVarW10);
                        this.f9941y = 3;
                    }
                }
                return objE;
            }
            if (i10 == 2) {
                strA = (String) this.f9936t;
                zt.o.b(obj);
                po.e eVar6 = new po.e(new File(c.this.localDocument.getAbsoluteFilePath()), b0.INSTANCE.b(strA));
                w0 w0VarB6 = av.k.b(c.this.serviceCoroutineScope, g1.b(), null, new C0172c(c.this, eVar6, null), 2, null);
                dv.h hVarW11 = dv.j.w(new d(w0VarB6, c.this, null));
                dv.h hVarW12 = dv.j.w(new b(eVar6, null));
                dv.h hVarC6 = dv.j.C(hVarW11, hVarW12);
                a aVar6 = new a(iVar);
                this.f9942z = l.a(iVar);
                this.f9936t = l.a(strA);
                this.f9937u = l.a(eVar6);
                this.f9938v = l.a(w0VarB6);
                this.f9939w = l.a(hVarW11);
                this.f9940x = l.a(hVarW12);
                this.f9941y = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public /* synthetic */ c(String str, po.c cVar, String str2, no.e.Local local, k kVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, local, kVar, z10);
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.sessionToken, cVar.sessionToken) && Intrinsics.c(this.localDocument, cVar.localDocument);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.sessionToken, cVar.sessionToken) && Intrinsics.c(this.localDocument, cVar.localDocument);
    }

    public final Object m(String str, eu.b<? super Unit> bVar) {
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(new C0169c(str, null), bVar);
        return objEnqueueRetriableRequestWithRetry == fu.c.e() ? objEnqueueRetriableRequestWithRetry : Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(eu.b<? super List<DocumentFileData>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f9933v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f9933v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objEnqueueRetriableRequestWithRetry = dVar.f9931t;
        Object objE = fu.c.e();
        int i11 = dVar.f9933v;
        if (i11 == 0) {
            zt.o.b(objEnqueueRetriableRequestWithRetry);
            e eVar = new e(null);
            dVar.f9933v = 1;
            objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(eVar, dVar);
            if (objEnqueueRetriableRequestWithRetry == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objEnqueueRetriableRequestWithRetry);
        }
        NetworkCallResult networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            return null;
        }
        if (!(networkCallResult instanceof NetworkCallResult.Success)) {
            throw new zt.l();
        }
        CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
        if (createDocumentResponse != null) {
            return createDocumentResponse.b();
        }
        return null;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new f(null));
    }

    public c(String str, po.c cVar, String str2, no.e.Local local, k kVar, boolean z10) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = kVar;
        this.isSingleFileLimit = z10;
        this.serviceCoroutineScope = q0.a(g1.a().plus(h2.b(null, 1, null)));
    }
}
