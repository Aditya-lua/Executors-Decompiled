package com.withpersona.sdk2.inquiry.governmentid.network;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\t\u0010\nJD\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "", "", "sessionToken", "inquiryId", "", "Lokhttp3/MultipartBody$Part;", "body", "Lhv/x;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;Llt/b;)Ljava/lang/Object;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @k({"Accept: multipart/form-data"})
    @Nullable
    @l
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/government-id-classification")
    Object a(@i("Authorization") @NotNull String str, @s("inquiryId") @NotNull String str2, @q @NotNull List<MultipartBody.Part> list, @q("data[attributes][files][][supplementary_data]") @NotNull AutoClassifyWorker.SupplementaryData supplementaryData, @NotNull lt.b<? super x<AutoClassifyResponse>> bVar);

    @k({"Accept: multipart/form-data"})
    @Nullable
    @l
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object b(@i("Authorization") @NotNull String str, @s("inquiryId") @NotNull String str2, @q @NotNull List<MultipartBody.Part> list, @NotNull lt.b<? super x<?>> bVar);
}
