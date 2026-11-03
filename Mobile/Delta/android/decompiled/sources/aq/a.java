package aq;

import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequest;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse;
import hv.x;
import java.util.List;
import kotlin.Metadata;
import kv.i;
import kv.k;
import kv.l;
import kv.o;
import kv.q;
import kv.s;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Laq/a;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequest;", "request", "Lhv/x;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequest;Llt/b;)Ljava/lang/Object;", "inquiryId", "", "Lokhttp3/MultipartBody$Part;", "body", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llt/b;)Ljava/lang/Object;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/selfie-pose")
    @Nullable
    Object a(@i("Authorization") @NotNull String str, @kv.a @NotNull SelfiePoseStateRequest selfiePoseStateRequest, @NotNull lt.b<? super x<SelfiePoseStateResponse>> bVar);

    @k({"Accept: multipart/form-data"})
    @Nullable
    @l
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object b(@i("Authorization") @NotNull String str, @s("inquiryId") @NotNull String str2, @q @NotNull List<MultipartBody.Part> list, @NotNull lt.b<? super x<?>> bVar);
}
