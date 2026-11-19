package xe;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import cf.a0;
import cf.j0;
import ff.p;
import java.io.IOException;
import re.s;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f36665a;
    public final String b;

    public e(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f36665a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f36665a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // re.s
    public void a(j0 j0Var) throws IOException {
        if (!this.f36665a.putString(this.b, p.b(j0Var.n())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // re.s
    public void b(a0 a0Var) throws IOException {
        if (!this.f36665a.putString(this.b, p.b(a0Var.n())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
