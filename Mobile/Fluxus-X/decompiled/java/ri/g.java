package ri;

import android.text.TextUtils;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class g extends al.b {

    public class a implements al.b.a {
        public a() {
        }

        @Override // al.b.a
        public void a(al.a aVar) {
            b(aVar, mw.c.d());
        }

        public void b(al.a aVar, mw.c cVar) {
            q.i("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + aVar.f());
            String strOptString = aVar.f().optString("newRobloxLanguageValue");
            if (TextUtils.isEmpty(strOptString)) {
                aVar.a(false, null);
                return;
            }
            q.i("rbx.locale", "newRobloxLocaleValue " + strOptString);
            yi.f fVarB = yi.f.b(strOptString);
            if (fVarB != null) {
                cVar.j(new yh.a(fVarB));
            }
            aVar.a(true, null);
        }
    }

    public g() {
        super("Localization");
        d("languageChangeTrigger", new a());
    }
}
