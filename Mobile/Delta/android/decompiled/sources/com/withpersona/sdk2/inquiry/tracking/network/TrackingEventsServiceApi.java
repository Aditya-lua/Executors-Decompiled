package com.withpersona.sdk2.inquiry.tracking.network;

import jv.x;
import kotlin.Metadata;
import mv.f;
import mv.i;
import mv.o;
import nt.b;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "", "", "sessionToken", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "getPublicKey", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "request", "Lokhttp3/ResponseBody;", "sendEvents", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lnt/b;)Ljava/lang/Object;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrackingEventsServiceApi {
    @f("/public-key")
    @Nullable
    Object getPublicKey(@i("Authorization") @NotNull String str, @NotNull b<? super x<PublicKeyResponse>> bVar);

    @o("/v1/t")
    @Nullable
    Object sendEvents(@i("Authorization") @NotNull String str, @mv.a @NotNull EncryptedTrackingEventsRequest encryptedTrackingEventsRequest, @NotNull b<? super x<ResponseBody>> bVar);
}
