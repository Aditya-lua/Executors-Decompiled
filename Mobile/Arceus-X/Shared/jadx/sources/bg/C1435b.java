package bg;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p128ff.C5590e;

/* JADX INFO: renamed from: bg.b */
/* JADX INFO: loaded from: classes2.dex */
public class C1435b {

    /* JADX INFO: renamed from: c */
    public static final String[] f5622c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f5623a;

    /* JADX INFO: renamed from: b */
    public final String f5624b;

    public C1435b(@NonNull C5590e c5590e) {
        this.f5623a = c5590e.m25268j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f5624b = m7410b(c5590e);
    }

    /* JADX INFO: renamed from: b */
    public static String m7410b(C5590e c5590e) {
        String strM25286d = c5590e.m25270n().m25286d();
        if (strM25286d != null) {
            return strM25286d;
        }
        String strM25285c = c5590e.m25270n().m25285c();
        if (!strM25285c.startsWith("1:") && !strM25285c.startsWith("2:")) {
            return strM25285c;
        }
        String[] strArrSplit = strM25285c.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static String m7411c(@NonNull PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7412a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* JADX INFO: renamed from: d */
    public final String m7413d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final PublicKey m7414e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m7415f() {
        synchronized (this.f5623a) {
            try {
                String strM7416g = m7416g();
                if (strM7416g != null) {
                    return strM7416g;
                }
                return m7417h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m7416g() {
        String string;
        synchronized (this.f5623a) {
            string = this.f5623a.getString("|S|id", null);
        }
        return string;
    }

    /* JADX INFO: renamed from: h */
    public final String m7417h() {
        synchronized (this.f5623a) {
            try {
                String string = this.f5623a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyM7414e = m7414e(string);
                if (publicKeyM7414e == null) {
                    return null;
                }
                return m7411c(publicKeyM7414e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public String m7418i() {
        synchronized (this.f5623a) {
            try {
                for (String str : f5622c) {
                    String string = this.f5623a.getString(m7412a(this.f5624b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m7413d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
