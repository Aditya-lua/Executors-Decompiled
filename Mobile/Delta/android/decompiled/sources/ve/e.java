package ve;

import af.a0;
import af.j0;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import df.p;
import java.io.IOException;
import pe.s;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f33498a;
    public final String b;

    public e(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f33498a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f33498a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // pe.s
    public void a(j0 j0Var) throws IOException {
        if (!this.f33498a.putString(this.b, p.b(j0Var.n())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // pe.s
    public void b(a0 a0Var) throws IOException {
        if (!this.f33498a.putString(this.b, p.b(a0Var.n())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
