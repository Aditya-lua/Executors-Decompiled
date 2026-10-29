package p607zk;

import com.roblox.client.shortcuts.PinShortcutHandler;
import mv.InterfaceC8706o;
import mv.InterfaceC8710s;
import okhttp3.ResponseBody;
import p231jv.InterfaceC7376d;

/* JADX INFO: renamed from: zk.h */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC13828h {
    @InterfaceC8706o("/v1/games/sessions/report/{placeId}/{eventType}")
    /* JADX INFO: renamed from: a */
    InterfaceC7376d<ResponseBody> m50308a(@InterfaceC8710s(PinShortcutHandler.EXTRA_PLACE_ID) long j10, @InterfaceC8710s("eventType") String str);
}
