package com.withpersona.sdk2.inquiry.network.upload;

import kotlin.Metadata;
import mv.InterfaceC8702k;
import mv.InterfaceC8703l;
import mv.InterfaceC8706o;
import mv.InterfaceC8708q;
import mv.InterfaceC8716y;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "", "", "url", "Lokhttp3/MultipartBody$Part;", "image", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "upload", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lnt/b;)Ljava/lang/Object;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface UploadService {
    @InterfaceC8706o
    @Nullable
    @InterfaceC8702k({"Accept: multipart/form-data"})
    @InterfaceC8703l
    Object upload(@InterfaceC8716y @NotNull String str, @InterfaceC8708q @NotNull MultipartBody.Part part, @NotNull InterfaceC9557b<? super C7396x<UploadResponse>> interfaceC9557b);
}
