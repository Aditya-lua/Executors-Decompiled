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
    public final Map f26033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6 f26034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h6 f26035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h6 f26036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h6 f26037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h6 f26038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h6 f26039j;

    public vc(me meVar) {
        super(meVar);
        this.f26033d = new HashMap();
        k6 k6VarX = this.f25625a.x();
        Objects.requireNonNull(k6VarX);
        this.f26034e = new h6(k6VarX, "last_delete_stale", 0L);
        k6 k6VarX2 = this.f25625a.x();
        Objects.requireNonNull(k6VarX2);
        this.f26035f = new h6(k6VarX2, "last_delete_stale_batch", 0L);
        k6 k6VarX3 = this.f25625a.x();
        Objects.requireNonNull(k6VarX3);
        this.f26036g = new h6(k6VarX3, "backoff", 0L);
        k6 k6VarX4 = this.f25625a.x();
        Objects.requireNonNull(k6VarX4);
        this.f26037h = new h6(k6VarX4, "last_upload", 0L);
        k6 k6VarX5 = this.f25625a.x();
        Objects.requireNonNull(k6VarX5);
        this.f26038i = new h6(k6VarX5, "last_upload_attempt", 0L);
        k6 k6VarX6 = this.f25625a.x();
        Objects.requireNonNull(k6VarX6);
        this.f26039j = new h6(k6VarX6, "midnight_offset", 0L);
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
        q8.a.C0515a c0515aA;
        h();
        g7 g7Var = this.f25625a;
        long jB = g7Var.e().b();
        uc ucVar2 = (uc) this.f26033d.get(str);
        if (ucVar2 != null && jB < ucVar2.f26017c) {
            return new Pair(ucVar2.f26016a, Boolean.valueOf(ucVar2.b));
        }
        q8.a.b(true);
        long jD = g7Var.w().D(str, z4.b) + jB;
        try {
            try {
                c0515aA = q8.a.a(g7Var.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0515aA = null;
                if (ucVar2 != null && jB < ucVar2.f26017c + this.f25625a.w().D(str, z4.f26154c)) {
                    return new Pair(ucVar2.f26016a, Boolean.valueOf(ucVar2.b));
                }
            }
            if (c0515aA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strA = c0515aA.a();
            ucVar = strA != null ? new uc(strA, c0515aA.b(), jD) : new uc("", c0515aA.b(), jD);
            this.f26033d.put(str, ucVar);
            q8.a.b(false);
            return new Pair(ucVar.f26016a, Boolean.valueOf(ucVar.b));
        } catch (Exception e10) {
            this.f25625a.a().v().b("Unable to get advertising id", e10);
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
