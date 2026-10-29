package p306nb;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p374q8.C10480a;

/* JADX INFO: renamed from: nb.vc */
/* JADX INFO: loaded from: classes.dex */
public final class C9339vc extends AbstractC9372xd {

    /* JADX INFO: renamed from: d */
    public final Map f33567d;

    /* JADX INFO: renamed from: e */
    public final C9109h6 f33568e;

    /* JADX INFO: renamed from: f */
    public final C9109h6 f33569f;

    /* JADX INFO: renamed from: g */
    public final C9109h6 f33570g;

    /* JADX INFO: renamed from: h */
    public final C9109h6 f33571h;

    /* JADX INFO: renamed from: i */
    public final C9109h6 f33572i;

    /* JADX INFO: renamed from: j */
    public final C9109h6 f33573j;

    public C9339vc(C9197me c9197me) {
        super(c9197me);
        this.f33567d = new HashMap();
        C9157k6 c9157k6M36339x = this.f33067a.m36339x();
        Objects.requireNonNull(c9157k6M36339x);
        this.f33568e = new C9109h6(c9157k6M36339x, "last_delete_stale", 0L);
        C9157k6 c9157k6M36339x2 = this.f33067a.m36339x();
        Objects.requireNonNull(c9157k6M36339x2);
        this.f33569f = new C9109h6(c9157k6M36339x2, "last_delete_stale_batch", 0L);
        C9157k6 c9157k6M36339x3 = this.f33067a.m36339x();
        Objects.requireNonNull(c9157k6M36339x3);
        this.f33570g = new C9109h6(c9157k6M36339x3, "backoff", 0L);
        C9157k6 c9157k6M36339x4 = this.f33067a.m36339x();
        Objects.requireNonNull(c9157k6M36339x4);
        this.f33571h = new C9109h6(c9157k6M36339x4, "last_upload", 0L);
        C9157k6 c9157k6M36339x5 = this.f33067a.m36339x();
        Objects.requireNonNull(c9157k6M36339x5);
        this.f33572i = new C9109h6(c9157k6M36339x5, "last_upload_attempt", 0L);
        C9157k6 c9157k6M36339x6 = this.f33067a.m36339x();
        Objects.requireNonNull(c9157k6M36339x6);
        this.f33573j = new C9109h6(c9157k6M36339x6, "midnight_offset", 0L);
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final Pair m36919m(String str, C9255q8 c9255q8) {
        return c9255q8.m36656o(EnumC9239p8.AD_STORAGE) ? m36920n(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public final Pair m36920n(String str) {
        C9323uc c9323uc;
        C10480a.a aVarM40279a;
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        long jMo44176b = c9094g7.mo36325e().mo44176b();
        C9323uc c9323uc2 = (C9323uc) this.f33567d.get(str);
        if (c9323uc2 != null && jMo44176b < c9323uc2.f33546c) {
            return new Pair(c9323uc2.f33544a, Boolean.valueOf(c9323uc2.f33545b));
        }
        C10480a.m40280b(true);
        long jM36402D = c9094g7.m36338w().m36402D(str, C9395z4.f33760b) + jMo44176b;
        try {
            try {
                aVarM40279a = C10480a.m40279a(c9094g7.mo36324d());
            } catch (PackageManager.NameNotFoundException unused) {
                aVarM40279a = null;
                if (c9323uc2 != null && jMo44176b < c9323uc2.f33546c + this.f33067a.m36338w().m36402D(str, C9395z4.f33763c)) {
                    return new Pair(c9323uc2.f33544a, Boolean.valueOf(c9323uc2.f33545b));
                }
            }
            if (aVarM40279a == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strM40286a = aVarM40279a.m40286a();
            c9323uc = strM40286a != null ? new C9323uc(strM40286a, aVarM40279a.m40287b(), jM36402D) : new C9323uc("", aVarM40279a.m40287b(), jM36402D);
            this.f33567d.put(str, c9323uc);
            C10480a.m40280b(false);
            return new Pair(c9323uc.f33544a, Boolean.valueOf(c9323uc.f33545b));
        } catch (Exception e10) {
            this.f33067a.mo36321a().m37010v().m36912b("Unable to get advertising id", e10);
            c9323uc = new C9323uc("", false, jM36402D);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public final String m36921o(String str, boolean z10) {
        mo36088h();
        String str2 = z10 ? (String) m36920n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM36922C = C9341ve.m36922C();
        if (messageDigestM36922C == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM36922C.digest(str2.getBytes())));
    }
}
