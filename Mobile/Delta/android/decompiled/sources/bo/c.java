package bo;

import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadResponse;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import java.util.List;
import jv.x;
import kotlin.Metadata;
import mv.f;
import mv.i;
import mv.k;
import mv.l;
import mv.o;
import mv.q;
import mv.s;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\fJ2\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lbo/c;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "request", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;Lnt/b;)Ljava/lang/Object;", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "document", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "a", "(Ljava/lang/String;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "fileId", "d", "inquiryId", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;Lnt/b;)Ljava/lang/Object;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @o("/api/internal/verify/v1/document-files")
    @Nullable
    @k({"Accept: multipart/form-data"})
    @l
    Object a(@i("Authorization") @NotNull String str, @q @NotNull List<MultipartBody.Part> list, @NotNull nt.b<? super x<DocumentFileUploadResponse>> bVar);

    @f("/api/internal/verify/v1/documents/{documentId}")
    @Nullable
    Object b(@i("Authorization") @NotNull String str, @s("documentId") @NotNull String str2, @NotNull nt.b<? super x<CreateDocumentResponse>> bVar);

    @o("/api/internal/verify/v1/documents")
    @Nullable
    Object c(@i("Authorization") @NotNull String str, @mv.a @NotNull CreateDocumentRequest createDocumentRequest, @NotNull nt.b<? super x<CreateDocumentResponse>> bVar);

    @mv.b("/api/internal/verify/v1/document-files/{fileId}")
    @Nullable
    Object d(@i("Authorization") @NotNull String str, @s("fileId") @NotNull String str2, @NotNull nt.b<? super x<?>> bVar);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    Object e(@i("Authorization") @NotNull String str, @s("inquiryId") @NotNull String str2, @mv.a @NotNull SubmitDocumentRequest submitDocumentRequest, @NotNull nt.b<? super x<?>> bVar);
}
