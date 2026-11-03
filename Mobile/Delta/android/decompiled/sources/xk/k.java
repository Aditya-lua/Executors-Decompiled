package xk;

import kv.o;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface k {
    @o("/platform-chat-api/v1/mark-conversations")
    hv.d<ResponseBody> a(@kv.a zk.a aVar);

    @o("/platform-chat-api/v1/send-messages")
    hv.d<ResponseBody> b(@kv.a zk.c cVar);

    @o("/platform-chat-api/v1/send-messages")
    hv.d<ResponseBody> c(@kv.a zk.d dVar);

    @o("/platform-chat-api/v1/mark-conversations")
    hv.d<ResponseBody> d(@kv.a zk.b bVar);
}
