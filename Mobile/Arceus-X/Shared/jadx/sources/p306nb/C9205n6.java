package p306nb;

import com.roblox.client.personasdk.BuildConfig;
import p511w9.C12326b;
import p511w9.C12327c;

/* JADX INFO: renamed from: nb.n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9205n6 {

    /* JADX INFO: renamed from: a */
    public final C9094g7 f33261a;

    public C9205n6(C9197me c9197me) {
        this.f33261a = c9197me.m36543g0();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36593a() {
        try {
            C9094g7 c9094g7 = this.f33261a;
            C12326b c12326bM46181a = C12327c.m46181a(c9094g7.mo36324d());
            if (c12326bM46181a != null) {
                return c12326bM46181a.m46178e(BuildConfig.STORE_PACKAGE, 128).versionCode >= 80837300;
            }
            c9094g7.mo36321a().m37011w().m36911a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f33261a.mo36321a().m37011w().m36912b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
