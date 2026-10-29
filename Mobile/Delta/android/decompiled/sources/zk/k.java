package zk;

import mv.o;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface k {
    @o("/platform-chat-api/v1/send-messages")
    jv.d<ResponseBody> a(@mv.a bl.d dVar);

    @o("/platform-chat-api/v1/mark-conversations")
    jv.d<ResponseBody> b(@mv.a bl.b bVar);

    @o("/platform-chat-api/v1/mark-conversations")
    jv.d<ResponseBody> c(@mv.a bl.a aVar);

    @o("/platform-chat-api/v1/send-messages")
    jv.d<ResponseBody> d(@mv.a bl.c cVar);
}
