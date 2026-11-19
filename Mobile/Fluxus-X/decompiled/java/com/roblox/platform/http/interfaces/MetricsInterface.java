package com.roblox.platform.http.interfaces;

import com.roblox.client.shortcuts.PinShortcutHandler;
import mv.i0;
import sw.d;
import vw.o;
import vw.s;

/* JADX INFO: loaded from: classes2.dex */
public interface MetricsInterface {
    @o("/v1/games/sessions/report/{placeId}/{eventType}")
    d<i0> postSessionReport(@s(PinShortcutHandler.EXTRA_PLACE_ID) long j10, @s("eventType") String str);
}
