package p221ji;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p138fv.C5840c;
import p151gk.C6124q;
import ph.C10257f;
import tk.AbstractC11666a;
import tk.C11667b;

/* JADX INFO: renamed from: ji.b */
/* JADX INFO: loaded from: classes2.dex */
public class C7159b extends C11667b {

    /* JADX INFO: renamed from: ji.b$a */
    public class a implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            String strOptString = abstractC11666a.m43816f().optString("placeID");
            if (strOptString == null) {
                abstractC11666a.mo43811a(false, null);
                return;
            }
            C6124q.m27064i("rbx.hybrid", "ShareGameToChat.execute() " + strOptString);
            abstractC11666a.mo43811a(true, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: ji.b$b */
    public class b implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            JSONObject jSONObjectOptJSONObject;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectM43816f = abstractC11666a.m43816f();
            if (jSONObjectM43816f != null && (jSONObjectOptJSONObject = jSONObjectM43816f.optJSONObject("params")) != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("userIds");
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    long jOptLong = jSONArrayOptJSONArray.optLong(i10, -1L);
                    if (jOptLong != -1) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            if (arrayList.size() <= 0) {
                abstractC11666a.mo43811a(false, null);
            } else {
                C5840c.m26204d().m26211j(new C10257f(-1L, ((Long) arrayList.get(0)).longValue()));
                abstractC11666a.mo43811a(true, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    public C7159b() {
        super("Chat");
        m43823d("startChatConversation", new b());
        m43823d("shareGameToChat", new a());
    }
}
