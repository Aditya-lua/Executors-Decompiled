package xk;

import kv.o;
import kv.s;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    @o("/v1/users/{requesterUserId}/decline-friend-request")
    hv.d<ResponseBody> a(@s("requesterUserId") long j10);

    @o("/v1/users/{requesterUserId}/accept-friend-request")
    hv.d<ResponseBody> b(@s("requesterUserId") long j10);
}
