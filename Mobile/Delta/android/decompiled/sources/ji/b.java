package ji;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b extends tk.b {

    public class a implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            String strOptString = aVar.f().optString("placeID");
            if (strOptString == null) {
                aVar.a(false, null);
                return;
            }
            gk.p.i("rbx.hybrid", "ShareGameToChat.execute() " + strOptString);
            aVar.a(true, null);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: ji.b$b, reason: collision with other inner class name */
    public class C0381b implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
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
                fv.c.d().j(new ph.f(-1L, ((Long) arrayList.get(0)).longValue()));
                aVar.a(true, null);
            }
        }

        public C0381b() {
        }
    }

    public b() {
        super("Chat");
        d("startChatConversation", new C0381b());
        d("shareGameToChat", new a());
    }
}
