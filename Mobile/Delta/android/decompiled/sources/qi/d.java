package qi;

import android.content.Context;
import android.content.SharedPreferences;
import gk.y;

/* JADX INFO: loaded from: classes2.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29409a;

    public d(Context context) {
        this.f29409a = context.getApplicationContext();
    }

    @Override // qi.c
    public void a(String str) {
        i("PREF_NAME_UGC_LOCALE", str);
    }

    @Override // qi.c
    public f b() {
        return f.b(g().getString("DEFAULT_LOCALE_VALUE", null));
    }

    @Override // qi.c
    public void c(f fVar) {
        if (fVar == null) {
            return;
        }
        h(fVar.d());
    }

    @Override // qi.c
    public f d() {
        return f.b(g().getString("PREF_NAME_UGC_LOCALE", null));
    }

    @Override // qi.c
    public void e(f fVar) {
        if (fVar == null) {
            return;
        }
        j(fVar.d());
    }

    @Override // qi.c
    public f f() {
        return f.b(g().getString("PREF_NAME_SELECTED_LOCALE", null));
    }

    public final SharedPreferences g() {
        return y.a(this.f29409a, "LocaleSettingsPreferences");
    }

    public void h(String str) {
        i("DEFAULT_LOCALE_VALUE", str);
    }

    public final void i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = g().edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public void j(String str) {
        i("PREF_NAME_SELECTED_LOCALE", str);
    }
}
