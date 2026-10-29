package p607zk;

import mv.InterfaceC8706o;
import mv.InterfaceC8710s;
import okhttp3.ResponseBody;
import p231jv.InterfaceC7376d;

/* JADX INFO: renamed from: zk.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC13826f {
    @InterfaceC8706o("/v1/users/{requesterUserId}/decline-friend-request")
    /* JADX INFO: renamed from: a */
    InterfaceC7376d<ResponseBody> m50305a(@InterfaceC8710s("requesterUserId") long j10);

    @InterfaceC8706o("/v1/users/{requesterUserId}/accept-friend-request")
    /* JADX INFO: renamed from: b */
    InterfaceC7376d<ResponseBody> m50306b(@InterfaceC8710s("requesterUserId") long j10);
}
