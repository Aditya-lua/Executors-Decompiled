package ji;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class g extends tk.b {

    public class a implements tk.b.a {
        public a() {
        }

        @Override // tk.b.a
        public void a(tk.a aVar) {
            b(aVar, fv.c.d());
        }

        public void b(tk.a aVar, fv.c cVar) {
            gk.p.i("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + aVar.f());
            String strOptString = aVar.f().optString("newRobloxLanguageValue");
            if (TextUtils.isEmpty(strOptString)) {
                aVar.a(false, null);
                return;
            }
            gk.p.i("rbx.locale", "newRobloxLocaleValue " + strOptString);
            qi.f fVarB = qi.f.b(strOptString);
            if (fVarB != null) {
                cVar.j(new ph.a(fVarB));
            }
            aVar.a(true, null);
        }
    }

    public g() {
        super("Localization");
        d("languageChangeTrigger", new a());
    }
}
