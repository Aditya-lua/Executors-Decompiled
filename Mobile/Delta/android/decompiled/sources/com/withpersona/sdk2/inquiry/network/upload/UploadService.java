package com.withpersona.sdk2.inquiry.network.upload;

import jv.x;
import kotlin.Metadata;
import mv.k;
import mv.l;
import mv.o;
import mv.q;
import mv.y;
import nt.b;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "", "", "url", "Lokhttp3/MultipartBody$Part;", "image", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "upload", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lnt/b;)Ljava/lang/Object;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UploadService {
    @o
    @Nullable
    @k({"Accept: multipart/form-data"})
    @l
    Object upload(@y @NotNull String str, @q @NotNull MultipartBody.Part part, @NotNull b<? super x<UploadResponse>> bVar);
}
