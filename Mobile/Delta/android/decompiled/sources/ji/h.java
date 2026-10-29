package ji;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h extends tk.b {

    public class a implements tk.b.a {
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        @Override // tk.b.a
        public void a(tk.a aVar) {
            JSONObject jSONObjectOptJSONObject;
            String strOptString;
            String strOptString2;
            boolean z10;
            String strB;
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                jSONObjectOptJSONObject = jSONObjectF.optJSONObject("params");
                if (jSONObjectOptJSONObject != null) {
                    strOptString = jSONObjectOptJSONObject.optString("feature", null);
                    strOptString2 = jSONObjectOptJSONObject.optString("urlPath", null);
                } else {
                    strOptString = null;
                }
                gk.p.i("Navigation", strOptString + " " + strOptString2);
                if (strOptString != null || (strB = b(strOptString)) == null) {
                    z10 = false;
                } else {
                    ph.g gVar = new ph.g(strB);
                    gVar.i(strOptString2);
                    if (jSONObjectOptJSONObject != null) {
                        gVar.h(jSONObjectOptJSONObject);
                    }
                    fv.c.d().j(gVar);
                    z10 = true;
                }
                aVar.a(z10, null);
            }
            jSONObjectOptJSONObject = null;
            strOptString = null;
            strOptString2 = strOptString;
            gk.p.i("Navigation", strOptString + " " + strOptString2);
            if (strOptString != null) {
                z10 = false;
            } else {
                z10 = false;
            }
            aVar.a(z10, null);
        }

        public final String b(String str) {
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

        public a() {
        }
    }

    public class b implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                long jOptLong = jSONObjectF.optLong("userId", -1L);
                ph.g gVar = new ph.g("PROFILE_TAG");
                gVar.i(ph.g.c(jOptLong));
                fv.c.d().j(gVar);
                aVar.a(true, null);
            }
        }

        public b() {
        }
    }

    public h() {
        super("Navigation");
        d("navigateToFeature", new a());
        d("openUserProfile", new b());
    }
}
