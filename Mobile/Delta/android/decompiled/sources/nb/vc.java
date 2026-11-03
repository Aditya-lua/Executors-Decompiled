package nb;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vc extends xd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6 f26855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h6 f26856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6 f26857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h6 f26858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h6 f26859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h6 f26860j;

    public vc(me meVar) {
        super(meVar);
        this.f26854d = new HashMap();
        k6 k6VarX = this.f26446a.x();
        Objects.requireNonNull(k6VarX);
        this.f26855e = new h6(k6VarX, "last_delete_stale", 0L);
        k6 k6VarX2 = this.f26446a.x();
        Objects.requireNonNull(k6VarX2);
        this.f26856f = new h6(k6VarX2, "last_delete_stale_batch", 0L);
        k6 k6VarX3 = this.f26446a.x();
        Objects.requireNonNull(k6VarX3);
        this.f26857g = new h6(k6VarX3, "backoff", 0L);
        k6 k6VarX4 = this.f26446a.x();
        Objects.requireNonNull(k6VarX4);
        this.f26858h = new h6(k6VarX4, "last_upload", 0L);
        k6 k6VarX5 = this.f26446a.x();
        Objects.requireNonNull(k6VarX5);
        this.f26859i = new h6(k6VarX5, "last_upload_attempt", 0L);
        k6 k6VarX6 = this.f26446a.x();
        Objects.requireNonNull(k6VarX6);
        this.f26860j = new h6(k6VarX6, "midnight_offset", 0L);
    }

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final Pair m(String str, q8 q8Var) {
        return q8Var.o(p8.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final Pair n(String str) {
        uc ucVar;
        q8.a.C0514a c0514aA;
        h();
        g7 g7Var = this.f26446a;
        long jB = g7Var.e().b();
        uc ucVar2 = (uc) this.f26854d.get(str);
        if (ucVar2 != null && jB < ucVar2.f26838c) {
            return new Pair(ucVar2.f26837a, Boolean.valueOf(ucVar2.b));
        }
        q8.a.b(true);
        long jD = g7Var.w().D(str, z4.b) + jB;
        try {
            try {
                c0514aA = q8.a.a(g7Var.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0514aA = null;
                if (ucVar2 != null && jB < ucVar2.f26838c + this.f26446a.w().D(str, z4.f26975c)) {
                    return new Pair(ucVar2.f26837a, Boolean.valueOf(ucVar2.b));
                }
            }
            if (c0514aA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strA = c0514aA.a();
            ucVar = strA != null ? new uc(strA, c0514aA.b(), jD) : new uc("", c0514aA.b(), jD);
            this.f26854d.put(str, ucVar);
            q8.a.b(false);
            return new Pair(ucVar.f26837a, Boolean.valueOf(ucVar.b));
        } catch (Exception e10) {
            this.f26446a.a().v().b("Unable to get advertising id", e10);
            ucVar = new uc("", false, jD);
        }
    }

    @Deprecated
    public final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestC = ve.C();
        if (messageDigestC == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestC.digest(str2.getBytes())));
    }
}
