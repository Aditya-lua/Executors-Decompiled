package p383qi;

import android.content.Context;
import android.content.SharedPreferences;
import p151gk.C6133z;

/* JADX INFO: renamed from: qi.d */
/* JADX INFO: loaded from: classes2.dex */
public class C10585d implements InterfaceC10584c {

    /* JADX INFO: renamed from: a */
    public final Context f37988a;

    public C10585d(Context context) {
        this.f37988a = context.getApplicationContext();
    }

    @Override // p383qi.InterfaceC10584c
    /* JADX INFO: renamed from: a */
    public void mo40593a(String str) {
        m40601i("PREF_NAME_UGC_LOCALE", str);
    }

    @Override // p383qi.InterfaceC10584c
    /* JADX INFO: renamed from: b */
    public C10587f mo40594b() {
        return C10587f.m40605b(m40599g().getString("DEFAULT_LOCALE_VALUE", null));
    }

    @Override // p383qi.InterfaceC10584c
    /* JADX INFO: renamed from: c */
    public void mo40595c(C10587f c10587f) {
        if (c10587f == null) {
            return;
        }
        m40600h(c10587f.m40607d());
    }

    @Override // p383qi.InterfaceC10584c
    /* JADX INFO: renamed from: d */
    public C10587f mo40596d() {
        return C10587f.m40605b(m40599g().getString("PREF_NAME_UGC_LOCALE", null));
    }

    @Override // p383qi.InterfaceC10584c
    /* JADX INFO: renamed from: e */
    public void mo40597e(C10587f c10587f) {
        if (c10587f == null) {
            return;
        }
        m40602j(c10587f.m40607d());
    }

    @Override // p383qi.InterfaceC10584c
    /* JADX INFO: renamed from: f */
    public C10587f mo40598f() {
        return C10587f.m40605b(m40599g().getString("PREF_NAME_SELECTED_LOCALE", null));
    }

    /* JADX INFO: renamed from: g */
    public final SharedPreferences m40599g() {
        return C6133z.m27104a(this.f37988a, "LocaleSettingsPreferences");
    }

    /* JADX INFO: renamed from: h */
    public void m40600h(String str) {
        m40601i("DEFAULT_LOCALE_VALUE", str);
    }

    /* JADX INFO: renamed from: i */
    public final void m40601i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = m40599g().edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: j */
    public void m40602j(String str) {
        m40601i("PREF_NAME_SELECTED_LOCALE", str);
    }
}
