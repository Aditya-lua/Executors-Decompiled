package zk;

import com.roblox.client.shortcuts.PinShortcutHandler;
import mv.o;
import mv.s;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface h {
    @o("/v1/games/sessions/report/{placeId}/{eventType}")
    jv.d<ResponseBody> a(@s(PinShortcutHandler.EXTRA_PLACE_ID) long j10, @s("eventType") String str);
}
