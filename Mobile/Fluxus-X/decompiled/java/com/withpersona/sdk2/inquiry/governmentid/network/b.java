package com.withpersona.sdk2.inquiry.governmentid.network;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import mv.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import sw.x;
import vw.i;
import vw.k;
import vw.l;
import vw.o;
import vw.q;
import vw.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\t\u0010\nJD\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "inquiryId", BuildConfig.FLAVOR, "Lmv/c0$c;", "body", "Lsw/x;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;Leu/b;)Ljava/lang/Object;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @Nullable
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/government-id-classification")
    @l
    @k({"Accept: multipart/form-data"})
    Object a(@i("Authorization") @NotNull String str, @NotNull @s("inquiryId") String str2, @q @NotNull List<c0.c> list, @q("data[attributes][files][][supplementary_data]") @NotNull AutoClassifyWorker.SupplementaryData supplementaryData, @NotNull eu.b<? super x<AutoClassifyResponse>> bVar);

    @Nullable
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @l
    @k({"Accept: multipart/form-data"})
    Object b(@i("Authorization") @NotNull String str, @NotNull @s("inquiryId") String str2, @q @NotNull List<c0.c> list, @NotNull eu.b<? super x<?>> bVar);
}
