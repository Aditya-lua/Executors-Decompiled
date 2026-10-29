package p031bl;

import com.roblox.platform.NoObfuscate;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: bl.c */
/* JADX INFO: loaded from: classes2.dex */
public class C1447c implements NoObfuscate {
    public final String conversation_id;
    public final Map<String, String>[] messages;

    public C1447c(String str, String[] strArr) {
        this.conversation_id = str;
        HashMap[] mapArr = new HashMap[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HashMap map = new HashMap();
            map.put("content", strArr[i10]);
            mapArr[i10] = map;
        }
        this.messages = mapArr;
    }
}
