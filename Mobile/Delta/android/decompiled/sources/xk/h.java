package xk;

import com.roblox.client.shortcuts.PinShortcutHandler;
import kv.o;
import kv.s;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface h {
    @o("/v1/games/sessions/report/{placeId}/{eventType}")
    hv.d<ResponseBody> a(@s(PinShortcutHandler.EXTRA_PLACE_ID) long j10, @s("eventType") String str);
}
