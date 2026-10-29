package p031bl;

import com.roblox.platform.NoObfuscate;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: bl.d */
/* JADX INFO: loaded from: classes2.dex */
public class C1448d implements NoObfuscate {
    public final long conversation_id;
    public final Map<String, String>[] messages;

    @Deprecated
    public C1448d(long j10, String[] strArr) {
        this.conversation_id = j10;
        HashMap[] mapArr = new HashMap[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HashMap map = new HashMap();
            map.put("content", strArr[i10]);
            mapArr[i10] = map;
        }
        this.messages = mapArr;
    }
}
