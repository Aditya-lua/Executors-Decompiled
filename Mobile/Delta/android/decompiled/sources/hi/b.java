package hi;

import ek.q;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b extends rk.b {

    public class a implements rk.b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            String strOptString = aVar.f().optString("placeID");
            if (strOptString == null) {
                aVar.a(false, null);
                return;
            }
            q.i("rbx.hybrid", "ShareGameToChat.execute() " + strOptString);
            aVar.a(true, null);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: hi.b$b, reason: collision with other inner class name */
    public class C0344b implements rk.b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject jSONObjectOptJSONObject;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null && (jSONObjectOptJSONObject = jSONObjectF.optJSONObject("params")) != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("userIds");
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    long jOptLong = jSONArrayOptJSONArray.optLong(i10, -1L);
                    if (jOptLong != -1) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            if (arrayList.size() <= 0) {
                aVar.a(false, null);
            } else {
                dv.c.d().j(new oh.f(-1L, ((Long) arrayList.get(0)).longValue()));
                aVar.a(true, null);
            }
        }

        public C0344b() {
        }
    }

    public b() {
        super("Chat");
        d("startChatConversation", new C0344b());
        d("shareGameToChat", new a());
    }
}
