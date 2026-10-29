package ve;

import af.C0204a0;
import af.C0226j0;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import p076df.C4594p;
import pe.InterfaceC10238s;

/* JADX INFO: renamed from: ve.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C12163e implements InterfaceC10238s {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences.Editor f42795a;

    /* JADX INFO: renamed from: b */
    public final String f42796b;

    public C12163e(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f42796b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f42795a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f42795a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // pe.InterfaceC10238s
    /* JADX INFO: renamed from: a */
    public void mo39304a(C0226j0 c0226j0) throws IOException {
        if (!this.f42795a.putString(this.f42796b, C4594p.m22710b(c0226j0.m13375n())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // pe.InterfaceC10238s
    /* JADX INFO: renamed from: b */
    public void mo39305b(C0204a0 c0204a0) throws IOException {
        if (!this.f42795a.putString(this.f42796b, C4594p.m22710b(c0204a0.m13375n())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
