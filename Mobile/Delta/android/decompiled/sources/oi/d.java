package oi;

import android.content.Context;
import android.content.SharedPreferences;
import ek.z;

/* JADX INFO: loaded from: classes2.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27913a;

    public d(Context context) {
        this.f27913a = context.getApplicationContext();
    }

    @Override // oi.c
    public void a(String str) {
        i("PREF_NAME_UGC_LOCALE", str);
    }

    @Override // oi.c
    public void b(f fVar) {
        if (fVar == null) {
            return;
        }
        h(fVar.d());
    }

    @Override // oi.c
    public f c() {
        return f.b(g().getString("DEFAULT_LOCALE_VALUE", null));
    }

    @Override // oi.c
    public f d() {
        return f.b(g().getString("PREF_NAME_UGC_LOCALE", null));
    }

    @Override // oi.c
    public f e() {
        return f.b(g().getString("PREF_NAME_SELECTED_LOCALE", null));
    }

    @Override // oi.c
    public void f(f fVar) {
        if (fVar == null) {
            return;
        }
        j(fVar.d());
    }

    public final SharedPreferences g() {
        return z.a(this.f27913a, "LocaleSettingsPreferences");
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
