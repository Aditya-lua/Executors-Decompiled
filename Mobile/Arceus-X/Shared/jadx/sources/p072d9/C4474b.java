package p072d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p305n9.C8953m;

/* JADX INFO: renamed from: d9.b */
/* JADX INFO: loaded from: classes.dex */
public class C4474b {

    /* JADX INFO: renamed from: c */
    public static final Lock f18512c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static C4474b f18513d;

    /* JADX INFO: renamed from: a */
    public final Lock f18514a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f18515b;

    public C4474b(Context context) {
        this.f18515b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C4474b m22423b(@NonNull Context context) {
        C8953m.m36047l(context);
        f18512c.lock();
        try {
            if (f18513d == null) {
                f18513d = new C4474b(context.getApplicationContext());
            }
            return f18513d;
        } finally {
            f18512c.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final String m22424i(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: a */
    public void m22425a() {
        this.f18514a.lock();
        try {
            this.f18515b.edit().clear().apply();
        } finally {
            this.f18514a.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public GoogleSignInAccount m22426c() {
        String strM22430g;
        String strM22430g2 = m22430g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM22430g2) && (strM22430g = m22430g(m22424i("googleSignInAccount", strM22430g2))) != null) {
            try {
                return GoogleSignInAccount.m9064E3(strM22430g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public GoogleSignInOptions m22427d() {
        String strM22430g;
        String strM22430g2 = m22430g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM22430g2) && (strM22430g = m22430g(m22424i("googleSignInOptions", strM22430g2))) != null) {
            try {
                return GoogleSignInOptions.m9078D3(strM22430g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m22428e() {
        return m22430g("refreshToken");
    }

    /* JADX INFO: renamed from: f */
    public void m22429f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        C8953m.m36047l(googleSignInAccount);
        C8953m.m36047l(googleSignInOptions);
        m22431h("defaultGoogleSignInAccount", googleSignInAccount.m9068F3());
        C8953m.m36047l(googleSignInAccount);
        C8953m.m36047l(googleSignInOptions);
        String strM9068F3 = googleSignInAccount.m9068F3();
        m22431h(m22424i("googleSignInAccount", strM9068F3), googleSignInAccount.m9070G3());
        m22431h(m22424i("googleSignInOptions", strM9068F3), googleSignInOptions.m9092H3());
    }

    /* JADX INFO: renamed from: g */
    public final String m22430g(@NonNull String str) {
        this.f18514a.lock();
        try {
            return this.f18515b.getString(str, null);
        } finally {
            this.f18514a.unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22431h(@NonNull String str, @NonNull String str2) {
        this.f18514a.lock();
        try {
            this.f18515b.edit().putString(str, str2).apply();
        } finally {
            this.f18514a.unlock();
        }
    }
}
