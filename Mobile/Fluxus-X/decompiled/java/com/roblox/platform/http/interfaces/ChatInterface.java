package com.roblox.platform.http.interfaces;

import il.b;
import mv.i0;
import sw.d;
import vw.a;
import vw.o;

/* JADX INFO: loaded from: classes2.dex */
public interface ChatInterface {
    @o("/v2/mark-as-read")
    d<i0> markAsRead(@a il.a aVar);

    @o("/v2/send-message")
    d<i0> sendMessage(@a b bVar);
}
