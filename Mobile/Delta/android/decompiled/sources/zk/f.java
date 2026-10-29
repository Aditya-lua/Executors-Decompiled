package zk;

import mv.o;
import mv.s;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    @o("/v1/users/{requesterUserId}/decline-friend-request")
    jv.d<ResponseBody> a(@s("requesterUserId") long j10);

    @o("/v1/users/{requesterUserId}/accept-friend-request")
    jv.d<ResponseBody> b(@s("requesterUserId") long j10);
}
