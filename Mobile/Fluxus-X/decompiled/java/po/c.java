package po;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadResponse;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import java.util.List;
import mv.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import sw.x;
import vw.f;
import vw.i;
import vw.k;
import vw.l;
import vw.o;
import vw.q;
import vw.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\fJ2\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lpo/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "request", "Lsw/x;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;Leu/b;)Ljava/lang/Object;", "documentId", "d", "(Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lmv/c0$c;", "document", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "e", "(Ljava/lang/String;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "fileId", "b", "inquiryId", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;Leu/b;)Ljava/lang/Object;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @Nullable
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object a(@i("Authorization") @NotNull String str, @NotNull @s("inquiryId") String str2, @vw.a @NotNull SubmitDocumentRequest submitDocumentRequest, @NotNull eu.b<? super x<?>> bVar);

    @vw.b("/api/internal/verify/v1/document-files/{fileId}")
    @Nullable
    Object b(@i("Authorization") @NotNull String str, @NotNull @s("fileId") String str2, @NotNull eu.b<? super x<?>> bVar);

    @Nullable
    @o("/api/internal/verify/v1/documents")
    Object c(@i("Authorization") @NotNull String str, @vw.a @NotNull CreateDocumentRequest createDocumentRequest, @NotNull eu.b<? super x<CreateDocumentResponse>> bVar);

    @f("/api/internal/verify/v1/documents/{documentId}")
    @Nullable
    Object d(@i("Authorization") @NotNull String str, @NotNull @s("documentId") String str2, @NotNull eu.b<? super x<CreateDocumentResponse>> bVar);

    @Nullable
    @o("/api/internal/verify/v1/document-files")
    @l
    @k({"Accept: multipart/form-data"})
    Object e(@i("Authorization") @NotNull String str, @q @NotNull List<c0.c> list, @NotNull eu.b<? super x<DocumentFileUploadResponse>> bVar);
}
