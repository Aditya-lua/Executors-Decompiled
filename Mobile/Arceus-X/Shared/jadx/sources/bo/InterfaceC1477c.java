package bo;

import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadResponse;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import java.util.List;
import kotlin.Metadata;
import mv.InterfaceC8692a;
import mv.InterfaceC8693b;
import mv.InterfaceC8697f;
import mv.InterfaceC8700i;
import mv.InterfaceC8702k;
import mv.InterfaceC8703l;
import mv.InterfaceC8706o;
import mv.InterfaceC8708q;
import mv.InterfaceC8710s;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: bo.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\fJ2\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, m31665d2 = {"Lbo/c;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "request", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;Lnt/b;)Ljava/lang/Object;", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "document", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "a", "(Ljava/lang/String;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "fileId", "d", "inquiryId", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;Lnt/b;)Ljava/lang/Object;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC1477c {
    @InterfaceC8706o("/api/internal/verify/v1/document-files")
    @Nullable
    @InterfaceC8702k({"Accept: multipart/form-data"})
    @InterfaceC8703l
    /* JADX INFO: renamed from: a */
    Object m7583a(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8708q @NotNull List<MultipartBody.Part> list, @NotNull InterfaceC9557b<? super C7396x<DocumentFileUploadResponse>> interfaceC9557b);

    @InterfaceC8697f("/api/internal/verify/v1/documents/{documentId}")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m7584b(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("documentId") @NotNull String str2, @NotNull InterfaceC9557b<? super C7396x<CreateDocumentResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/documents")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m7585c(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8692a @NotNull CreateDocumentRequest createDocumentRequest, @NotNull InterfaceC9557b<? super C7396x<CreateDocumentResponse>> interfaceC9557b);

    @InterfaceC8693b("/api/internal/verify/v1/document-files/{fileId}")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m7586d(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("fileId") @NotNull String str2, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m7587e(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("inquiryId") @NotNull String str2, @InterfaceC8692a @NotNull SubmitDocumentRequest submitDocumentRequest, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b);
}
