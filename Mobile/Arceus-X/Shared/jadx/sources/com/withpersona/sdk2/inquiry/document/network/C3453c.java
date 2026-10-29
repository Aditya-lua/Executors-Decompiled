package com.withpersona.sdk2.inquiry.document.network;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import bo.C1478d;
import bo.InterfaceC1477c;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.io.File;
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
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.InterfaceC7267k;
import p229jt.C7345l;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.C7864g1;
import p256ku.C7870h2;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p471um.C11888w;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012.B9\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lvr/h;", "", "sessionToken", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "Ljq/k;", "fileHelper", "", "isSingleFileLimit", "<init>", "(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljq/k;Z)V", "otherWorker", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "n", "(Lnt/b;)Ljava/lang/Object;", "documentFileId", "", "m", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "Lbo/c;", "d", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "f", "Ljq/k;", "g", "Z", "Lku/p0;", "h", "Lku/p0;", "serviceCoroutineScope", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3453c implements InterfaceC13222o<b>, InterfaceC12257h<b> {

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
    public final DocumentFile.Local localDocument;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7267k fileHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean isSingleFileLimit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 serviceCoroutineScope;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$a */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "", "Lbo/c;", NotificationCompat.CATEGORY_SERVICE, "Ljq/k;", "fileHelper", "<init>", "(Lbo/c;Ljq/k;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "", "isSingleFileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Z)Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lbo/c;", "b", "Ljq/k;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC1477c service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7267k fileHelper;

        public a(@NotNull InterfaceC1477c service, @NotNull InterfaceC7267k fileHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            this.service = service;
            this.fileHelper = fileHelper;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3453c m16722a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Local localDocument, boolean isSingleFileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(localDocument, "localDocument");
            return new C3453c(sessionToken, this.service, documentId, localDocument, this.fileHelper, isSingleFileLimit, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<init>", "()V", "d", "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14120b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14120b(@NotNull InternalErrorInfo cause) {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "progressPercentage", "<init>", "(I)V", "a", "I", "()I", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final int progressPercentage;

            public c(int i10) {
                super(null);
                this.progressPercentage = i10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$d */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "oldLocalDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "newRemoteDocument", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "b", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.c.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$c */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Ljv/x;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$deleteFile$2", m39664f = "DocumentFileUploadWorker.kt", m39665l = {208}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<?>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13352t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f13354v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC9557b<? super c> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f13354v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3453c.this.new c(this.f13354v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13352t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC1477c interfaceC1477c = C3453c.this.service;
            String str = C3453c.this.sessionToken;
            String str2 = this.f13354v;
            this.f13352t = 1;
            Object objM7586d = interfaceC1477c.m7586d(str, str2, this);
            return objM7586d == objM38805e ? objM38805e : objM7586d;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
            return ((c) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker", m39664f = "DocumentFileUploadWorker.kt", m39665l = {191}, m39666m = "fetchCurrentDocuments")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f13355t;

        /* JADX INFO: renamed from: v */
        public int f13357v;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13355t = obj;
            this.f13357v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3453c.this.m16721n(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$fetchCurrentDocuments$result$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {192}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<CreateDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13358t;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3453c.this.new e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13358t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC1477c interfaceC1477c = C3453c.this.service;
            String str = C3453c.this.sessionToken;
            String str2 = C3453c.this.documentId;
            this.f13358t = 1;
            Object objM7584b = interfaceC1477c.m7584b(str, str2, this);
            return objM7584b == objM38805e ? objM38805e : objM7584b;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super C7396x<CreateDocumentResponse>> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {66, 69, 177}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f13361t;

        /* JADX INFO: renamed from: u */
        public Object f13362u;

        /* JADX INFO: renamed from: v */
        public Object f13363v;

        /* JADX INFO: renamed from: w */
        public Object f13364w;

        /* JADX INFO: renamed from: x */
        public Object f13365x;

        /* JADX INFO: renamed from: y */
        public int f13366y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f13367z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i<b> f13368a;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {178}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14121a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public Object f13369t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f13370u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ a<T> f13371v;

                /* JADX INFO: renamed from: w */
                public int f13372w;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.withpersona.sdk2.inquiry.document.network.c$f$a<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C14121a(a<? super T> aVar, InterfaceC9557b<? super C14121a> interfaceC9557b) {
                    super(interfaceC9557b);
                    this.f13371v = aVar;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f13370u = obj;
                    this.f13372w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f13371v.emit(null, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super com.withpersona.sdk2.inquiry.document.network.c$b> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC9577i<? super b> interfaceC9577i) {
                this.f13368a = interfaceC9577i;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14121a c14121a;
                if (interfaceC9557b instanceof C14121a) {
                    c14121a = (C14121a) interfaceC9557b;
                    int i10 = c14121a.f13372w;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14121a.f13372w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14121a = new C14121a(this, interfaceC9557b);
                    }
                } else {
                    c14121a = new C14121a(this, interfaceC9557b);
                }
                Object obj = c14121a.f13370u;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14121a.f13372w;
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9577i<b> interfaceC9577i = this.f13368a;
                    c14121a.f13369t = bVar;
                    c14121a.f13372w = 1;
                    if (interfaceC9577i.emit(bVar, c14121a) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) c14121a.f13369t;
                    C7348o.m30470b(obj);
                }
                if ((bVar instanceof b.a) || (bVar instanceof b.C14120b)) {
                    C7870h2.m32668d(c14121a.getContext(), null, 1, null);
                }
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {169, 173}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super b.c>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f13373t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f13374u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C1478d f13375v;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$b$a */
            @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m31665d2 = {"<anonymous>", "", "it", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
            public static final class a extends AbstractC10351m implements Function2<Integer, InterfaceC9557b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t */
                public int f13376t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ int f13377u;

                public a(InterfaceC9557b<? super a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    a aVar = new a(interfaceC9557b);
                    aVar.f13377u = ((Number) obj).intValue();
                    return aVar;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                    return m16733q(num.intValue(), interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    int i10 = this.f13377u;
                    C10047c.m38805e();
                    if (this.f13376t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return C10340b.m39658a(i10 < 100);
                }

                /* JADX INFO: renamed from: q */
                public final Object m16733q(int i10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                    return ((a) create(Integer.valueOf(i10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$b$b, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14122b<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i<b.c> f13378a;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super com.withpersona.sdk2.inquiry.document.network.c$b$c> */
                /* JADX WARN: Multi-variable type inference failed */
                public C14122b(InterfaceC9577i<? super b.c> interfaceC9577i) {
                    this.f13378a = interfaceC9577i;
                }

                /* JADX INFO: renamed from: b */
                public final Object m16734b(int i10, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    Object objEmit = this.f13378a.emit(new b.c(i10), interfaceC9557b);
                    return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
                }

                @Override // nu.InterfaceC9577i
                public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                    return m16734b(((Number) obj).intValue(), interfaceC9557b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C1478d c1478d, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f13375v = c1478d;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                b bVar = new b(this.f13375v, interfaceC9557b);
                bVar.f13374u = obj;
                return bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            
                if (r0.emit(r7, r6) == r1) goto L15;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13374u;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f13373t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37777N = C9579j.m37777N(this.f13375v.m7588a(), new a(null));
                C14122b c14122b = new C14122b(interfaceC9577i);
                this.f13374u = interfaceC9577i;
                this.f13373t = 1;
                if (interfaceC9575hM37777N.collect(c14122b, this) != objM38805e) {
                }
                return objM38805e;
                b.c cVar = new b.c(100);
                this.f13374u = C10350l.m39676a(interfaceC9577i);
                this.f13373t = 2;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9577i<? super b.c> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {80}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f13379t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3453c f13380u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C1478d f13381v;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$c$a */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {81}, m39666m = "invokeSuspend")
            public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<DocumentFileUploadResponse>>, Object> {

                /* JADX INFO: renamed from: t */
                public int f13382t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C3453c f13383u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C1478d f13384v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C3453c c3453c, C1478d c1478d, InterfaceC9557b<? super a> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f13383u = c3453c;
                    this.f13384v = c1478d;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new a(this.f13383u, this.f13384v, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f13382t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                        return obj;
                    }
                    C7348o.m30470b(obj);
                    InterfaceC1477c interfaceC1477c = this.f13383u.service;
                    String str = this.f13383u.sessionToken;
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    MultipartBody.Part partCreateFormData = companion.createFormData("data[type]", "document-file");
                    MultipartBody.Part partCreateFormData2 = companion.createFormData("data[attributes][document-id]", this.f13383u.documentId);
                    MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][capture-method]", this.f13383u.localDocument.getCaptureMethod().getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String());
                    MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][originals][]", this.f13383u.localDocument.getAbsoluteFilePath(), this.f13384v);
                    String name = new File(this.f13383u.localDocument.getAbsoluteFilePath()).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    List<MultipartBody.Part> listM31895n = C7699p.m31895n(partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, companion.createFormData("data[attributes][name]", name));
                    this.f13382t = 1;
                    Object objM7583a = interfaceC1477c.m7583a(str, listM31895n, this);
                    return objM7583a == objM38805e ? objM38805e : objM7583a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super C7396x<DocumentFileUploadResponse>> interfaceC9557b) {
                    return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C3453c c3453c, C1478d c1478d, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f13380u = c3453c;
                this.f13381v = c1478d;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new c(this.f13380u, this.f13381v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f13379t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                a aVar = new a(this.f13380u, this.f13381v, null);
                this.f13379t = 1;
                Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                return objEnqueueVerificationRequestWithRetry == objM38805e ? objM38805e : objEnqueueVerificationRequestWithRetry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<DocumentFileUploadResponse>> interfaceC9557b) {
                return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$f$d */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", m39664f = "DocumentFileUploadWorker.kt", m39665l = {106, 110, 122, 147, 149, 156, 162}, m39666m = "invokeSuspend")
        public static final class d extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: A */
            public final /* synthetic */ InterfaceC7934w0<NetworkCallResult<DocumentFileUploadResponse>> f13385A;

            /* JADX INFO: renamed from: B */
            public final /* synthetic */ C3453c f13386B;

            /* JADX INFO: renamed from: t */
            public Object f13387t;

            /* JADX INFO: renamed from: u */
            public Object f13388u;

            /* JADX INFO: renamed from: v */
            public Object f13389v;

            /* JADX INFO: renamed from: w */
            public int f13390w;

            /* JADX INFO: renamed from: x */
            public int f13391x;

            /* JADX INFO: renamed from: y */
            public int f13392y;

            /* JADX INFO: renamed from: z */
            public /* synthetic */ Object f13393z;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.w0<? extends com.withpersona.sdk2.inquiry.network.core.NetworkCallResult<com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadResponse>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(InterfaceC7934w0<? extends NetworkCallResult<DocumentFileUploadResponse>> interfaceC7934w0, C3453c c3453c, InterfaceC9557b<? super d> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f13385A = interfaceC7934w0;
                this.f13386B = c3453c;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                d dVar = new d(this.f13385A, this.f13386B, interfaceC9557b);
                dVar.f13393z = obj;
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
            @Override // pt.AbstractC10339a
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
                List<DocumentFileData.RemoteDocumentFile> listM16671a;
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
                InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13393z;
                Object objM38805e = C10047c.m38805e();
                GenericFileUploadErrorResponse genericFileUploadErrorResponse = null;
                switch (this.f13392y) {
                    case 0:
                        C7348o.m30470b(obj);
                        InterfaceC7934w0<NetworkCallResult<DocumentFileUploadResponse>> interfaceC7934w0 = this.f13385A;
                        this.f13393z = interfaceC9577i;
                        this.f13392y = 1;
                        obj = interfaceC7934w0.mo32927B(this);
                        if (obj != objM38805e) {
                            networkCallResult = (NetworkCallResult) obj;
                            C3453c c3453c = this.f13386B;
                            if (networkCallResult instanceof NetworkCallResult.Success) {
                                documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                                if (documentFileUploadResponse != null || (data = documentFileUploadResponse.getData()) == null || (attributes = data.getAttributes()) == null || (listM16671a = attributes.m16671a()) == null) {
                                    remoteDocumentFile = null;
                                } else {
                                    remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) CollectionsKt.firstOrNull(listM16671a);
                                }
                                if (documentFileUploadResponse != null || remoteDocumentFile == null) {
                                    aVar = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.f13393z = interfaceC9577i;
                                    this.f13387t = networkCallResult;
                                    this.f13388u = C10350l.m39676a(documentFileUploadResponse);
                                    this.f13389v = C10350l.m39676a(remoteDocumentFile);
                                    this.f13390w = 0;
                                    this.f13391x = 0;
                                    this.f13392y = 3;
                                    if (interfaceC9577i.emit(aVar, this) != objM38805e) {
                                    }
                                } else {
                                    b.d dVar = new b.d(c3453c.localDocument, new DocumentFile.Remote(c3453c.localDocument.getAbsoluteFilePath(), remoteDocumentFile.getFilename(), remoteDocumentFile.getUrl(), documentFileUploadResponse.getData().getId()));
                                    this.f13393z = interfaceC9577i;
                                    this.f13387t = networkCallResult;
                                    this.f13388u = C10350l.m39676a(documentFileUploadResponse);
                                    this.f13389v = C10350l.m39676a(remoteDocumentFile);
                                    this.f13390w = 0;
                                    this.f13391x = 0;
                                    this.f13392y = 2;
                                    if (interfaceC9577i.emit(dVar, this) != objM38805e) {
                                    }
                                }
                            }
                            if (networkCallResult instanceof NetworkCallResult.Failure) {
                                networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                                if (!networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                                    ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                                    Intrinsics.m31981d(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError");
                                    ResponseBody errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                                    if (errorBody != null) {
                                        try {
                                            genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new C11888w.b().m44444c(GenericFileUploadErrorResponse.Companion.getAdapter()).m44445d().m44436c(GenericFileUploadErrorResponse.class).fromJson(errorBody.getSource());
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (genericFileUploadErrorResponse == null) {
                                        b.a aVar2 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                        this.f13393z = C10350l.m39676a(interfaceC9577i);
                                        this.f13387t = networkCallResult;
                                        this.f13388u = C10350l.m39676a(networkErrorInfo);
                                        this.f13389v = C10350l.m39676a(genericFileUploadErrorResponse);
                                        this.f13390w = 0;
                                        this.f13391x = 0;
                                        this.f13392y = 5;
                                    } else {
                                        b.a aVar3 = new b.a(genericFileUploadErrorResponse.getErrors().get(0));
                                        this.f13393z = C10350l.m39676a(interfaceC9577i);
                                        this.f13387t = networkCallResult;
                                        this.f13388u = C10350l.m39676a(networkErrorInfo);
                                        this.f13389v = C10350l.m39676a(genericFileUploadErrorResponse);
                                        this.f13390w = 0;
                                        this.f13391x = 0;
                                        this.f13392y = 4;
                                    }
                                } else if (!networkErrorInfo.isRecoverable()) {
                                    b.C14120b c14120b = new b.C14120b(networkErrorInfo);
                                    this.f13393z = C10350l.m39676a(interfaceC9577i);
                                    this.f13387t = networkCallResult;
                                    this.f13388u = C10350l.m39676a(networkErrorInfo);
                                    this.f13389v = null;
                                    this.f13390w = 0;
                                    this.f13391x = 0;
                                    this.f13392y = 7;
                                } else {
                                    b.a aVar4 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                    this.f13393z = C10350l.m39676a(interfaceC9577i);
                                    this.f13387t = networkCallResult;
                                    this.f13388u = C10350l.m39676a(networkErrorInfo);
                                    this.f13389v = null;
                                    this.f13390w = 0;
                                    this.f13391x = 0;
                                    this.f13392y = 6;
                                }
                                break;
                            }
                            return Unit.f29331a;
                        }
                        return objM38805e;
                    case 1:
                        C7348o.m30470b(obj);
                        networkCallResult = (NetworkCallResult) obj;
                        C3453c c3453c2 = this.f13386B;
                        if (networkCallResult instanceof NetworkCallResult.Success) {
                            documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                            if (documentFileUploadResponse != null) {
                                remoteDocumentFile = null;
                            } else {
                                remoteDocumentFile = null;
                            }
                            if (documentFileUploadResponse != null) {
                                aVar = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f13393z = interfaceC9577i;
                                this.f13387t = networkCallResult;
                                this.f13388u = C10350l.m39676a(documentFileUploadResponse);
                                this.f13389v = C10350l.m39676a(remoteDocumentFile);
                                this.f13390w = 0;
                                this.f13391x = 0;
                                this.f13392y = 3;
                                if (interfaceC9577i.emit(aVar, this) != objM38805e) {
                                }
                            } else {
                                aVar = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f13393z = interfaceC9577i;
                                this.f13387t = networkCallResult;
                                this.f13388u = C10350l.m39676a(documentFileUploadResponse);
                                this.f13389v = C10350l.m39676a(remoteDocumentFile);
                                this.f13390w = 0;
                                this.f13391x = 0;
                                this.f13392y = 3;
                                if (interfaceC9577i.emit(aVar, this) != objM38805e) {
                                }
                            }
                            return objM38805e;
                        }
                        if (networkCallResult instanceof NetworkCallResult.Failure) {
                            networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                            if (!networkErrorInfo.isRecoverable()) {
                            }
                            if (!networkErrorInfo.isRecoverable()) {
                                b.C14120b c14120b2 = new b.C14120b(networkErrorInfo);
                                this.f13393z = C10350l.m39676a(interfaceC9577i);
                                this.f13387t = networkCallResult;
                                this.f13388u = C10350l.m39676a(networkErrorInfo);
                                this.f13389v = null;
                                this.f13390w = 0;
                                this.f13391x = 0;
                                this.f13392y = 7;
                            } else {
                                b.a aVar5 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f13393z = C10350l.m39676a(interfaceC9577i);
                                this.f13387t = networkCallResult;
                                this.f13388u = C10350l.m39676a(networkErrorInfo);
                                this.f13389v = null;
                                this.f13390w = 0;
                                this.f13391x = 0;
                                this.f13392y = 6;
                            }
                            break;
                        }
                        return Unit.f29331a;
                    case 2:
                    case 3:
                        networkCallResult = (NetworkCallResult) this.f13387t;
                        C7348o.m30470b(obj);
                        if (networkCallResult instanceof NetworkCallResult.Failure) {
                            networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                            if (!networkErrorInfo.isRecoverable()) {
                            }
                            if (!networkErrorInfo.isRecoverable()) {
                                b.C14120b c14120b3 = new b.C14120b(networkErrorInfo);
                                this.f13393z = C10350l.m39676a(interfaceC9577i);
                                this.f13387t = networkCallResult;
                                this.f13388u = C10350l.m39676a(networkErrorInfo);
                                this.f13389v = null;
                                this.f13390w = 0;
                                this.f13391x = 0;
                                this.f13392y = 7;
                            } else {
                                b.a aVar6 = new b.a(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                                this.f13393z = C10350l.m39676a(interfaceC9577i);
                                this.f13387t = networkCallResult;
                                this.f13388u = C10350l.m39676a(networkErrorInfo);
                                this.f13389v = null;
                                this.f13390w = 0;
                                this.f13391x = 0;
                                this.f13392y = 6;
                            }
                            break;
                        }
                        return Unit.f29331a;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        C7348o.m30470b(obj);
                        return Unit.f29331a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            f fVar = C3453c.this.new f(interfaceC9557b);
            fVar.f13367z = obj;
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String strMo30293a;
            Object objM16721n;
            List list;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13367z;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13366y;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                strMo30293a = C3453c.this.fileHelper.mo30293a(C3453c.this.localDocument.getAbsoluteFilePath());
                if (C3453c.this.isSingleFileLimit) {
                    C3453c c3453c = C3453c.this;
                    this.f13367z = interfaceC9577i;
                    this.f13361t = strMo30293a;
                    this.f13366y = 1;
                    objM16721n = c3453c.m16721n(this);
                    if (objM16721n != objM38805e) {
                        List list2 = (List) objM16721n;
                        list = list2;
                        if (list != null) {
                            C1478d c1478d = new C1478d(new File(C3453c.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(strMo30293a));
                            InterfaceC7934w0 interfaceC7934w0M32778b = C7882k.m32778b(C3453c.this.serviceCoroutineScope, C7864g1.m32644b(), null, new c(C3453c.this, c1478d, null), 2, null);
                            InterfaceC9575h interfaceC9575hM37806w = C9579j.m37806w(new d(interfaceC7934w0M32778b, C3453c.this, null));
                            InterfaceC9575h interfaceC9575hM37806w2 = C9579j.m37806w(new b(c1478d, null));
                            InterfaceC9575h interfaceC9575hM37766C = C9579j.m37766C(interfaceC9575hM37806w, interfaceC9575hM37806w2);
                            a aVar = new a(interfaceC9577i);
                            this.f13367z = C10350l.m39676a(interfaceC9577i);
                            this.f13361t = C10350l.m39676a(strMo30293a);
                            this.f13362u = C10350l.m39676a(c1478d);
                            this.f13363v = C10350l.m39676a(interfaceC7934w0M32778b);
                            this.f13364w = C10350l.m39676a(interfaceC9575hM37806w);
                            this.f13365x = C10350l.m39676a(interfaceC9575hM37806w2);
                            this.f13366y = 3;
                        } else {
                            C1478d c1478d2 = new C1478d(new File(C3453c.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(strMo30293a));
                            InterfaceC7934w0 interfaceC7934w0M32778b2 = C7882k.m32778b(C3453c.this.serviceCoroutineScope, C7864g1.m32644b(), null, new c(C3453c.this, c1478d2, null), 2, null);
                            InterfaceC9575h interfaceC9575hM37806w3 = C9579j.m37806w(new d(interfaceC7934w0M32778b2, C3453c.this, null));
                            InterfaceC9575h interfaceC9575hM37806w4 = C9579j.m37806w(new b(c1478d2, null));
                            InterfaceC9575h interfaceC9575hM37766C2 = C9579j.m37766C(interfaceC9575hM37806w3, interfaceC9575hM37806w4);
                            a aVar2 = new a(interfaceC9577i);
                            this.f13367z = C10350l.m39676a(interfaceC9577i);
                            this.f13361t = C10350l.m39676a(strMo30293a);
                            this.f13362u = C10350l.m39676a(c1478d2);
                            this.f13363v = C10350l.m39676a(interfaceC7934w0M32778b2);
                            this.f13364w = C10350l.m39676a(interfaceC9575hM37806w3);
                            this.f13365x = C10350l.m39676a(interfaceC9575hM37806w4);
                            this.f13366y = 3;
                        }
                    }
                } else {
                    C1478d c1478d3 = new C1478d(new File(C3453c.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(strMo30293a));
                    InterfaceC7934w0 interfaceC7934w0M32778b3 = C7882k.m32778b(C3453c.this.serviceCoroutineScope, C7864g1.m32644b(), null, new c(C3453c.this, c1478d3, null), 2, null);
                    InterfaceC9575h interfaceC9575hM37806w5 = C9579j.m37806w(new d(interfaceC7934w0M32778b3, C3453c.this, null));
                    InterfaceC9575h interfaceC9575hM37806w6 = C9579j.m37806w(new b(c1478d3, null));
                    InterfaceC9575h interfaceC9575hM37766C3 = C9579j.m37766C(interfaceC9575hM37806w5, interfaceC9575hM37806w6);
                    a aVar3 = new a(interfaceC9577i);
                    this.f13367z = C10350l.m39676a(interfaceC9577i);
                    this.f13361t = C10350l.m39676a(strMo30293a);
                    this.f13362u = C10350l.m39676a(c1478d3);
                    this.f13363v = C10350l.m39676a(interfaceC7934w0M32778b3);
                    this.f13364w = C10350l.m39676a(interfaceC9575hM37806w5);
                    this.f13365x = C10350l.m39676a(interfaceC9575hM37806w6);
                    this.f13366y = 3;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                strMo30293a = (String) this.f13361t;
                C7348o.m30470b(obj);
                objM16721n = obj;
                List list3 = (List) objM16721n;
                list = list3;
                if (list != null || list.isEmpty()) {
                    C1478d c1478d4 = new C1478d(new File(C3453c.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(strMo30293a));
                    InterfaceC7934w0 interfaceC7934w0M32778b4 = C7882k.m32778b(C3453c.this.serviceCoroutineScope, C7864g1.m32644b(), null, new c(C3453c.this, c1478d4, null), 2, null);
                    InterfaceC9575h interfaceC9575hM37806w7 = C9579j.m37806w(new d(interfaceC7934w0M32778b4, C3453c.this, null));
                    InterfaceC9575h interfaceC9575hM37806w8 = C9579j.m37806w(new b(c1478d4, null));
                    InterfaceC9575h interfaceC9575hM37766C4 = C9579j.m37766C(interfaceC9575hM37806w7, interfaceC9575hM37806w8);
                    a aVar4 = new a(interfaceC9577i);
                    this.f13367z = C10350l.m39676a(interfaceC9577i);
                    this.f13361t = C10350l.m39676a(strMo30293a);
                    this.f13362u = C10350l.m39676a(c1478d4);
                    this.f13363v = C10350l.m39676a(interfaceC7934w0M32778b4);
                    this.f13364w = C10350l.m39676a(interfaceC9575hM37806w7);
                    this.f13365x = C10350l.m39676a(interfaceC9575hM37806w8);
                    this.f13366y = 3;
                } else {
                    C3453c c3453c2 = C3453c.this;
                    String id2 = ((DocumentFileData) CollectionsKt.m31706d0(list3)).getId();
                    this.f13367z = interfaceC9577i;
                    this.f13361t = strMo30293a;
                    this.f13362u = C10350l.m39676a(list3);
                    this.f13366y = 2;
                    if (c3453c2.m16720m(id2, this) != objM38805e) {
                        C1478d c1478d5 = new C1478d(new File(C3453c.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(strMo30293a));
                        InterfaceC7934w0 interfaceC7934w0M32778b5 = C7882k.m32778b(C3453c.this.serviceCoroutineScope, C7864g1.m32644b(), null, new c(C3453c.this, c1478d5, null), 2, null);
                        InterfaceC9575h interfaceC9575hM37806w9 = C9579j.m37806w(new d(interfaceC7934w0M32778b5, C3453c.this, null));
                        InterfaceC9575h interfaceC9575hM37806w10 = C9579j.m37806w(new b(c1478d5, null));
                        InterfaceC9575h interfaceC9575hM37766C5 = C9579j.m37766C(interfaceC9575hM37806w9, interfaceC9575hM37806w10);
                        a aVar5 = new a(interfaceC9577i);
                        this.f13367z = C10350l.m39676a(interfaceC9577i);
                        this.f13361t = C10350l.m39676a(strMo30293a);
                        this.f13362u = C10350l.m39676a(c1478d5);
                        this.f13363v = C10350l.m39676a(interfaceC7934w0M32778b5);
                        this.f13364w = C10350l.m39676a(interfaceC9575hM37806w9);
                        this.f13365x = C10350l.m39676a(interfaceC9575hM37806w10);
                        this.f13366y = 3;
                    }
                }
                return objM38805e;
            }
            if (i10 == 2) {
                strMo30293a = (String) this.f13361t;
                C7348o.m30470b(obj);
                C1478d c1478d6 = new C1478d(new File(C3453c.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(strMo30293a));
                InterfaceC7934w0 interfaceC7934w0M32778b6 = C7882k.m32778b(C3453c.this.serviceCoroutineScope, C7864g1.m32644b(), null, new c(C3453c.this, c1478d6, null), 2, null);
                InterfaceC9575h interfaceC9575hM37806w11 = C9579j.m37806w(new d(interfaceC7934w0M32778b6, C3453c.this, null));
                InterfaceC9575h interfaceC9575hM37806w12 = C9579j.m37806w(new b(c1478d6, null));
                InterfaceC9575h interfaceC9575hM37766C6 = C9579j.m37766C(interfaceC9575hM37806w11, interfaceC9575hM37806w12);
                a aVar6 = new a(interfaceC9577i);
                this.f13367z = C10350l.m39676a(interfaceC9577i);
                this.f13361t = C10350l.m39676a(strMo30293a);
                this.f13362u = C10350l.m39676a(c1478d6);
                this.f13363v = C10350l.m39676a(interfaceC7934w0M32778b6);
                this.f13364w = C10350l.m39676a(interfaceC9575hM37806w11);
                this.f13365x = C10350l.m39676a(interfaceC9575hM37806w12);
                this.f13366y = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 bo.c)
      (r3v0 java.lang.String)
      (r4v0 com.withpersona.sdk2.inquiry.document.DocumentFile$Local)
      (r5v0 jq.k)
      (r6v0 boolean)
     A[MD:(java.lang.String, bo.c, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentFile$Local, jq.k, boolean):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.c.<init>(java.lang.String, bo.c, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentFile$Local, jq.k, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3453c(String str, InterfaceC1477c interfaceC1477c, String str2, DocumentFile.Local local, InterfaceC7267k interfaceC7267k, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC1477c, str2, local, interfaceC7267k, z10);
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
        if (!(otherWorker instanceof C3453c)) {
            return false;
        }
        C3453c c3453c = (C3453c) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3453c.sessionToken) && Intrinsics.m31980c(this.localDocument, c3453c.localDocument);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof C3453c)) {
            return false;
        }
        C3453c c3453c = (C3453c) otherWorker;
        return Intrinsics.m31980c(this.sessionToken, c3453c.sessionToken) && Intrinsics.m31980c(this.localDocument, c3453c.localDocument);
    }

    /* JADX INFO: renamed from: m */
    public final Object m16720m(String str, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(new c(str, null), interfaceC9557b);
        return objEnqueueRetriableRequestWithRetry == C10047c.m38805e() ? objEnqueueRetriableRequestWithRetry : Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m16721n(InterfaceC9557b<? super List<DocumentFileData>> interfaceC9557b) {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f13357v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f13357v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object objEnqueueRetriableRequestWithRetry = dVar.f13355t;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f13357v;
        if (i11 == 0) {
            C7348o.m30470b(objEnqueueRetriableRequestWithRetry);
            e eVar = new e(null);
            dVar.f13357v = 1;
            objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(eVar, dVar);
            if (objEnqueueRetriableRequestWithRetry == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objEnqueueRetriableRequestWithRetry);
        }
        NetworkCallResult networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            return null;
        }
        if (!(networkCallResult instanceof NetworkCallResult.Success)) {
            throw new C7345l();
        }
        CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
        if (createDocumentResponse != null) {
            return createDocumentResponse.m16663b();
        }
        return null;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new f(null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3453c(String str, InterfaceC1477c interfaceC1477c, String str2, DocumentFile.Local local, InterfaceC7267k interfaceC7267k, boolean z10) {
        this.sessionToken = str;
        this.service = interfaceC1477c;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = interfaceC7267k;
        this.isSingleFileLimit = z10;
        this.serviceCoroutineScope = C7910q0.m32885a(C7864g1.m32643a().plus(C7870h2.m32666b(null, 1, null)));
    }
}
