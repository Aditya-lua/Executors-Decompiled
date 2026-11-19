package com.roblox.platform.http.interfaces;

import ll.b;
import ll.c;
import mv.i0;
import sw.d;
import vw.a;
import vw.o;

/* JADX INFO: loaded from: classes2.dex */
public interface PlatformChatInterface {
    @o("/platform-chat-api/v1/mark-conversations")
    d<i0> markConversations(@a ll.a aVar);

    @o("/platform-chat-api/v1/mark-conversations")
    d<i0> markConversations(@a b bVar);

    @o("/platform-chat-api/v1/send-messages")
    d<i0> sendMessages(@a c cVar);

    @o("/platform-chat-api/v1/send-messages")
    d<i0> sendMessages(@a ll.d dVar);
}
