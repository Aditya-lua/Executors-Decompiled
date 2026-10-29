package p221ji;

import org.json.JSONObject;
import p138fv.C5840c;
import p151gk.C6124q;
import ph.C10258g;
import tk.AbstractC11666a;
import tk.C11667b;

/* JADX INFO: renamed from: ji.h */
/* JADX INFO: loaded from: classes2.dex */
public class C7165h extends C11667b {

    /* JADX INFO: renamed from: ji.h$a */
    public class a implements C11667b.a {
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            JSONObject jSONObjectOptJSONObject;
            String strOptString;
            String strOptString2;
            boolean z10;
            String strM29966b;
            JSONObject jSONObjectM43816f = abstractC11666a.m43816f();
            if (jSONObjectM43816f != null) {
                jSONObjectOptJSONObject = jSONObjectM43816f.optJSONObject("params");
                if (jSONObjectOptJSONObject != null) {
                    strOptString = jSONObjectOptJSONObject.optString("feature", null);
                    strOptString2 = jSONObjectOptJSONObject.optString("urlPath", null);
                } else {
                    strOptString = null;
                }
                C6124q.m27064i("Navigation", strOptString + " " + strOptString2);
                if (strOptString != null || (strM29966b = m29966b(strOptString)) == null) {
                    z10 = false;
                } else {
                    C10258g c10258g = new C10258g(strM29966b);
                    c10258g.m39416i(strOptString2);
                    if (jSONObjectOptJSONObject != null) {
                        c10258g.m39415h(jSONObjectOptJSONObject);
                    }
                    C5840c.m26204d().m26211j(c10258g);
                    z10 = true;
                }
                abstractC11666a.mo43811a(z10, null);
            }
            jSONObjectOptJSONObject = null;
            strOptString = null;
            strOptString2 = strOptString;
            C6124q.m27064i("Navigation", strOptString + " " + strOptString2);
            if (strOptString != null) {
                z10 = false;
            } else {
                z10 = false;
            }
            abstractC11666a.mo43811a(z10, null);
        }

        /* JADX INFO: renamed from: b */
        public final String m29966b(String str) {
            if ("Settings".equals(str)) {
                return "SETTINGS_TAG";
            }
            if ("Friends".equals(str)) {
                return "FRIENDS_TAG";
            }
            if ("Games".equals(str)) {
                return "GAMES_TAG";
            }
            if ("Home".equals(str)) {
                return "HOME_TAG";
            }
            if ("Messages".equals(str)) {
                return "MESSAGES_TAG";
            }
            if ("Avatar".equals(str)) {
                return "AVATAR_EDITOR_TAG";
            }
            if ("Abuse Report".equals(str)) {
                return "ABUSE_REPORT_TAG";
            }
            if ("Friend Finder".equals(str)) {
                return "FRIEND_FINDER_TAG";
            }
            if ("Universal Friends".equals(str)) {
                return "UNIVERSAL_FRIENDS_TAG";
            }
            if ("GameDetails".equals(str)) {
                return "GAME_DETAILS_TAG";
            }
            if ("CaptchaSuccess".equals(str)) {
                return "CAPTCHA_SUCCESS_TAG";
            }
            if ("CaptchaShown".equals(str)) {
                return "CAPTCHA_SHOWN_TAG";
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: ji.h$b */
    public class b implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            JSONObject jSONObjectM43816f = abstractC11666a.m43816f();
            if (jSONObjectM43816f != null) {
                long jOptLong = jSONObjectM43816f.optLong("userId", -1L);
                C10258g c10258g = new C10258g("PROFILE_TAG");
                c10258g.m39416i(C10258g.m39410c(jOptLong));
                C5840c.m26204d().m26211j(c10258g);
                abstractC11666a.mo43811a(true, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    public C7165h() {
        super("Navigation");
        m43823d("navigateToFeature", new a());
        m43823d("openUserProfile", new b());
    }
}
