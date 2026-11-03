package hi;

import android.text.TextUtils;
import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class g extends rk.b {

    public class a implements rk.b.a {
        public a() {
        }

        @Override // rk.b.a
        public void a(rk.a aVar) {
            b(aVar, dv.c.d());
        }

        public void b(rk.a aVar, dv.c cVar) {
            q.i("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + aVar.f());
            String strOptString = aVar.f().optString("newRobloxLanguageValue");
            if (TextUtils.isEmpty(strOptString)) {
                aVar.a(false, null);
                return;
            }
            q.i("rbx.locale", "newRobloxLocaleValue " + strOptString);
            oi.f fVarB = oi.f.b(strOptString);
            if (fVarB != null) {
                cVar.j(new oh.a(fVarB));
            }
            aVar.a(true, null);
        }
    }

    public g() {
        super("Localization");
        d("languageChangeTrigger", new a());
    }
}
