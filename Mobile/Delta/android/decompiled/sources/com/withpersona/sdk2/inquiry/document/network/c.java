package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import gt.l;
import hq.k;
import hv.x;
import iu.g1;
import iu.h2;
import iu.p0;
import iu.q0;
import iu.w0;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.m;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002!\u0014B9\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Ltr/h;", "", "sessionToken", "Lzn/c;", "service", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "Lhq/k;", "fileHelper", "", "isSingleFileLimit", "<init>", "(Ljava/lang/String;Lzn/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lhq/k;Z)V", "otherWorker", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "n", "(Llt/b;)Ljava/lang/Object;", "documentFileId", "", "m", "(Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "Lzn/c;", "d", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "f", "Lhq/k;", "g", "Z", "Liu/p0;", "h", "Liu/p0;", "serviceCoroutineScope", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements o<b>, tr.h<b> {

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
    public final DocumentFile.Local localDocument;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k fileHelper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isSingleFileLimit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceCoroutineScope;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "", "Lzn/c;", "service", "Lhq/k;", "fileHelper", "<init>", "(Lzn/c;Lhq/k;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "", "isSingleFileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Z)Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lzn/c;", "b", "Lhq/k;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final zn.c service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final k fileHelper;

        public a(@NotNull zn.c service, @NotNull k fileHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            this.service = service;
            this.fileHelper = fileHelper;
        }

        @NotNull
        public final c a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Local localDocument, boolean isSingleFileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(localDocument, "localDocument");
            return new c(sessionToken, this.service, documentId, localDocument, this.fileHelper, isSingleFileLimit, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<init>", "()V", "d", "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public static final class C0185b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185b(@NotNull InternalErrorInfo cause) {
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
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "progressPercentage", "<init>", "(I)V", "a", "I", "()I", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0186c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int progressPercentage;

            public C0186c(int i10) {
                super(null);
                this.progressPercentage = i10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "oldLocalDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "newRemoteDocument", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "b", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final DocumentFile.Local oldLocalDocument;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final DocumentFile.Remote newRemoteDocument;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull DocumentFile.Local oldLocalDocument, @NotNull DocumentFile.Remote newRemoteDocument) {
                super(null);
                Intrinsics.checkNotNullParameter(oldLocalDocument, "oldLocalDocument");
                Intrinsics.checkNotNullParameter(newRemoteDocument, "newRemoteDocument");
                this.oldLocalDocument = oldLocalDocument;
                this.newRemoteDocument = newRemoteDocument;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final DocumentFile.Remote getNewRemoteDocument() {
                return this.newRemoteDocument;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final DocumentFile.Local getOldLocalDocument() {
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
    @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$deleteFile$2", f = "DocumentFileUploadWorker.kt", l = {208}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhv/x;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
    public static final class C0187c extends m implements Function1<lt.b<? super x<?>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10373t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10375v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0187c(String str, lt.b<? super C0187c> bVar) {
            super(1, bVar);
            this.f10375v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return c.this.new C0187c(this.f10375v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f10373t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            zn.c cVar = c.this.service;
            String str = c.this.sessionToken;
            String str2 = this.f10375v;
            this.f10373t = 1;
            Object objA = cVar.a(str, str2, this);
            return objA == objE ? objE : objA;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super x<?>> bVar) {
            return ((C0187c) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker", f = "DocumentFileUploadWorker.kt", l = {191}, m = "fetchCurrentDocuments")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f10376t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f10378v;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10376t = obj;
            this.f10378v |= Integer.MIN_VALUE;
            return c.this.n(this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$fetchCurrentDocuments$result$1", f = "DocumentFileUploadWorker.kt", l = {192}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function1<lt.b<? super x<CreateDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10379t;

        public e(lt.b<? super e> bVar) {
            super(1, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return c.this.new e(bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f10379t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            zn.c cVar = c.this.service;
            String str = c.this.sessionToken;
            String str2 = c.this.documentId;
            this.f10379t = 1;
            Object objC = cVar.c(str, str2, this);
            return objC == objE ? objE : objC;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super x<CreateDocumentResponse>> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", f = "DocumentFileUploadWorker.kt", l = {66, 69, 177}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends m implements Function2<i<? super b>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10381t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10382u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10383v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10384w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f10385x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10386y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f10387z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<b> f10388a;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", f = "DocumentFileUploadWorker.kt", l = {178}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0188a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f10389t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f10390u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ a<T> f10391v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f10392w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0188a(a<? super T> aVar, lt.b<? super C0188a> bVar) {
                    super(bVar);
                    this.f10391v = aVar;
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f10390u = obj;
                    this.f10392w |= Integer.MIN_VALUE;
                    return this.f10391v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super b> iVar) {
                this.f10388a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, lt.b<? super Unit> bVar2) {
                C0188a c0188a;
                if (bVar2 instanceof C0188a) {
                    c0188a = (C0188a) bVar2;
                    int i10 = c0188a.f10392w;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0188a.f10392w = i10 - Integer.MIN_VALUE;
                    } else {
                        c0188a = new C0188a(this, bVar2);
                    }
                } else {
                    c0188a = new C0188a(this, bVar2);
                }
                Object obj = c0188a.f10390u;
                Object objE = mt.c.e();
                int i11 = c0188a.f10392w;
                if (i11 == 0) {
                    gt.o.b(obj);
                    i<b> iVar = this.f10388a;
                    c0188a.f10389t = bVar;
                    c0188a.f10392w = 1;
                    if (iVar.emit(bVar, c0188a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) c0188a.f10389t;
                    gt.o.b(obj);
                }
                if ((bVar instanceof b.a) || (bVar instanceof b.C0185b)) {
                    h2.d(c0188a.getContext(), null, 1, null);
                }
                return Unit.f22938a;
            }
        }

        @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1", f = "DocumentFileUploadWorker.kt", l = {169, 173}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
        public static final class b extends m implements Function2<i<? super b.C0186c>, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10393t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f10394u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ zn.d f10395v;

            @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1$1", f = "DocumentFileUploadWorker.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a extends m implements Function2<Integer, lt.b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f10396t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ int f10397u;

                public a(lt.b<? super a> bVar) {
                    super(2, bVar);
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    a aVar = new a(bVar);
                    aVar.f10397u = ((Number) obj).intValue();
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, lt.b<? super Boolean> bVar) {
                    return m(num.intValue(), bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    int i10 = this.f10397u;
                    mt.c.e();
                    if (this.f10396t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return nt.b.a(i10 < 100);
                }

                public final Object m(int i10, lt.b<? super Boolean> bVar) {
                    return ((a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0189b<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i<b.C0186c> f10398a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0189b(i<? super b.C0186c> iVar) {
                    this.f10398a = iVar;
                }

                public final Object b(int i10, lt.b<? super Unit> bVar) {
                    Object objEmit = this.f10398a.emit(new b.C0186c(i10), bVar);
                    return objEmit == mt.c.e() ? objEmit : Unit.f22938a;
                }

                @Override // lu.i
                public /* bridge */ /* synthetic */ Object emit(Object obj, lt.b bVar) {
                    return b(((Number) obj).intValue(), bVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zn.d dVar, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f10395v = dVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                b bVar2 = new b(this.f10395v, bVar);
                bVar2.f10394u = obj;
                return bVar2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            
                if (r0.emit(r7, r6) == r1) goto L15;
             */
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.f10394u
                    lu.i r0 = (lu.i) r0
                    java.lang.Object r1 = mt.c.e()
                    int r2 = r6.f10393t
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L22
                    if (r2 == r4) goto L1e
                    if (r2 != r3) goto L16
                    gt.o.b(r7)
                    goto L5b
                L16:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1e:
                    gt.o.b(r7)
                    goto L45
                L22:
                    gt.o.b(r7)
                    zn.d r7 = r6.f10395v
                    lu.p0 r7 = r7.a()
                    com.withpersona.sdk2.inquiry.document.network.c$f$b$a r2 = new com.withpersona.sdk2.inquiry.document.network.c$f$b$a
                    r5 = 0
                    r2.<init>(r5)
                    lu.h r7 = lu.j.N(r7, r2)
                    com.withpersona.sdk2.inquiry.document.network.c$f$b$b r2 = new com.withpersona.sdk2.inquiry.document.network.c$f$b$b
                    r2.<init>(r0)
                    r6.f10394u = r0
                    r6.f10393t = r4
                    java.lang.Object r7 = r7.collect(r2, r6)
                    if (r7 != r1) goto L45
                    goto L5a
                L45:
                    com.withpersona.sdk2.inquiry.document.network.c$b$c r7 = new com.withpersona.sdk2.inquiry.document.network.c$b$c
                    r2 = 100
                    r7.<init>(r2)
                    java.lang.Object r2 = nt.l.a(r0)
                    r6.f10394u = r2
                    r6.f10393t = r3
                    java.lang.Object r7 = r0.emit(r7, r6)
                    if (r7 != r1) goto L5b
                L5a:
                    return r1
                L5b:
                    kotlin.Unit r7 = kotlin.Unit.f22938a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b.C0186c> iVar, lt.b<? super Unit> bVar) {
                return ((b) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c, reason: collision with other inner class name */
        @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", f = "DocumentFileUploadWorker.kt", l = {80}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "(Liu/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
        public static final class C0190c extends m implements Function2<p0, lt.b<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10399t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f10400u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ zn.d f10401v;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c$a */
            @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", f = "DocumentFileUploadWorker.kt", l = {81}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
            public static final class a extends m implements Function1<lt.b<? super x<DocumentFileUploadResponse>>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f10402t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ c f10403u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ zn.d f10404v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(c cVar, zn.d dVar, lt.b<? super a> bVar) {
                    super(1, bVar);
                    this.f10403u = cVar;
                    this.f10404v = dVar;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new a(this.f10403u, this.f10404v, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = mt.c.e();
                    int i10 = this.f10402t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                        return obj;
                    }
                    gt.o.b(obj);
                    zn.c cVar = this.f10403u.service;
                    String str = this.f10403u.sessionToken;
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    MultipartBody.Part partCreateFormData = companion.createFormData("data[type]", "document-file");
                    MultipartBody.Part partCreateFormData2 = companion.createFormData("data[attributes][document-id]", this.f10403u.documentId);
                    MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][capture-method]", this.f10403u.localDocument.getCaptureMethod().getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String());
                    MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][originals][]", this.f10403u.localDocument.getAbsoluteFilePath(), this.f10404v);
                    String name = new File(this.f10403u.localDocument.getAbsoluteFilePath()).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    List<MultipartBody.Part> listN = p.n(partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, companion.createFormData("data[attributes][name]", name));
                    this.f10402t = 1;
                    Object objE2 = cVar.e(str, listN, this);
                    return objE2 == objE ? objE : objE2;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super x<DocumentFileUploadResponse>> bVar) {
                    return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0190c(c cVar, zn.d dVar, lt.b<? super C0190c> bVar) {
                super(2, bVar);
                this.f10400u = cVar;
                this.f10401v = dVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0190c(this.f10400u, this.f10401v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super NetworkCallResult<DocumentFileUploadResponse>> bVar) {
                return ((C0190c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f10399t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                a aVar = new a(this.f10400u, this.f10401v, null);
                this.f10399t = 1;
                Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                return objEnqueueVerificationRequestWithRetry == objE ? objE : objEnqueueVerificationRequestWithRetry;
            }
        }

        @nt.f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", f = "DocumentFileUploadWorker.kt", l = {106, 110, 122, 147, 149, 156, 162}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
        public static final class d extends m implements Function2<i<? super b>, lt.b<? super Unit>, Object> {
            public final /* synthetic */ w0<NetworkCallResult<DocumentFileUploadResponse>> A;
            public final /* synthetic */ c B;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f10405t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f10406u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f10407v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f10408w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f10409x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f10410y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f10411z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(w0<? extends NetworkCallResult<DocumentFileUploadResponse>> w0Var, c cVar, lt.b<? super d> bVar) {
                super(2, bVar);
                this.A = w0Var;
                this.B = cVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                d dVar = new d(this.A, this.B, bVar);
                dVar.f10411z = obj;
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
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 532
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, lt.b<? super Unit> bVar) {
                return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public f(lt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            f fVar = c.this.new f(bVar);
            fVar.f10387z = obj;
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
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, lt.b<? super Unit> bVar) {
            return ((f) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public /* synthetic */ c(String str, zn.c cVar, String str2, DocumentFile.Local local, k kVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, str2, local, kVar, z10);
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.sessionToken, cVar.sessionToken) && Intrinsics.c(this.localDocument, cVar.localDocument);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return Intrinsics.c(this.sessionToken, cVar.sessionToken) && Intrinsics.c(this.localDocument, cVar.localDocument);
    }

    public final Object m(String str, lt.b<? super Unit> bVar) {
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(new C0187c(str, null), bVar);
        return objEnqueueRetriableRequestWithRetry == mt.c.e() ? objEnqueueRetriableRequestWithRetry : Unit.f22938a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(lt.b<? super List<DocumentFileData>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f10378v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f10378v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objEnqueueRetriableRequestWithRetry = dVar.f10376t;
        Object objE = mt.c.e();
        int i11 = dVar.f10378v;
        if (i11 == 0) {
            gt.o.b(objEnqueueRetriableRequestWithRetry);
            e eVar = new e(null);
            dVar.f10378v = 1;
            objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(eVar, dVar);
            if (objEnqueueRetriableRequestWithRetry == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objEnqueueRetriableRequestWithRetry);
        }
        NetworkCallResult networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            return null;
        }
        if (!(networkCallResult instanceof NetworkCallResult.Success)) {
            throw new l();
        }
        CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
        if (createDocumentResponse != null) {
            return createDocumentResponse.b();
        }
        return null;
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<b> run() {
        return j.w(new f(null));
    }

    public c(String str, zn.c cVar, String str2, DocumentFile.Local local, k kVar, boolean z10) {
        this.sessionToken = str;
        this.service = cVar;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = kVar;
        this.isSingleFileLimit = z10;
        this.serviceCoroutineScope = q0.a(g1.a().plus(h2.b(null, 1, null)));
    }
}
