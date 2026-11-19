package ob;

import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f27787a;

    public s6(ve veVar) {
        this.f27787a = veVar.g0();
    }

    public final boolean a() {
        try {
            l7 l7Var = this.f27787a;
            x9.b bVarA = x9.c.a(l7Var.d());
            if (bVarA != null) {
                return bVarA.e("com.android.vending", Barcode.FORMAT_ITF).versionCode >= 80837300;
            }
            l7Var.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f27787a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
