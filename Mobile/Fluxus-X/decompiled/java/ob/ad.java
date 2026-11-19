package ob;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends ge {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f27082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m6 f27083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m6 f27084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m6 f27085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m6 f27086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m6 f27087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m6 f27088j;

    public ad(ve veVar) {
        super(veVar);
        this.f27082d = new HashMap();
        p6 p6VarX = this.f27641a.x();
        Objects.requireNonNull(p6VarX);
        this.f27083e = new m6(p6VarX, "last_delete_stale", 0L);
        p6 p6VarX2 = this.f27641a.x();
        Objects.requireNonNull(p6VarX2);
        this.f27084f = new m6(p6VarX2, "last_delete_stale_batch", 0L);
        p6 p6VarX3 = this.f27641a.x();
        Objects.requireNonNull(p6VarX3);
        this.f27085g = new m6(p6VarX3, "backoff", 0L);
        p6 p6VarX4 = this.f27641a.x();
        Objects.requireNonNull(p6VarX4);
        this.f27086h = new m6(p6VarX4, "last_upload", 0L);
        p6 p6VarX5 = this.f27641a.x();
        Objects.requireNonNull(p6VarX5);
        this.f27087i = new m6(p6VarX5, "last_upload_attempt", 0L);
        p6 p6VarX6 = this.f27641a.x();
        Objects.requireNonNull(p6VarX6);
        this.f27088j = new m6(p6VarX6, "midnight_offset", 0L);
    }

    @Override // ob.ge
    public final boolean l() {
        return false;
    }

    public final Pair m(String str, v8 v8Var) {
        return v8Var.o(u8.AD_STORAGE) ? n(str) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Deprecated
    public final Pair n(String str) {
        zc zcVar;
        r8.a.C0598a c0598aA;
        h();
        l7 l7Var = this.f27641a;
        long jB = l7Var.e().b();
        zc zcVar2 = (zc) this.f27082d.get(str);
        if (zcVar2 != null && jB < zcVar2.f28042c) {
            return new Pair(zcVar2.f28041a, Boolean.valueOf(zcVar2.b));
        }
        r8.a.b(true);
        long jD = l7Var.w().D(str, e5.b) + jB;
        try {
            try {
                c0598aA = r8.a.a(l7Var.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0598aA = null;
                if (zcVar2 != null && jB < zcVar2.f28042c + this.f27641a.w().D(str, e5.f27229c)) {
                    return new Pair(zcVar2.f28041a, Boolean.valueOf(zcVar2.b));
                }
            }
            if (c0598aA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strA = c0598aA.a();
            zcVar = strA != null ? new zc(strA, c0598aA.b(), jD) : new zc(BuildConfig.FLAVOR, c0598aA.b(), jD);
            this.f27082d.put(str, zcVar);
            r8.a.b(false);
            return new Pair(zcVar.f28041a, Boolean.valueOf(zcVar.b));
        } catch (Exception e10) {
            this.f27641a.a().v().b("Unable to get advertising id", e10);
            zcVar = new zc(BuildConfig.FLAVOR, false, jD);
        }
    }

    @Deprecated
    public final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestC = ff.C();
        if (messageDigestC == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestC.digest(str2.getBytes())));
    }
}
