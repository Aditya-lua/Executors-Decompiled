package e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lock f13241c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f13242d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f13243a = new ReentrantLock();
    public final SharedPreferences b;

    public c(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    public static c b(@NonNull Context context) {
        o9.s.l(context);
        f13241c.lock();
        try {
            if (f13242d == null) {
                f13242d = new c(context.getApplicationContext());
            }
            return f13242d;
        } finally {
            f13241c.unlock();
        }
    }

    public static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f13243a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.f13243a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.J3(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInOptions", strG2))) != null) {
            try {
                return GoogleSignInOptions.I3(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        o9.s.l(googleSignInAccount);
        o9.s.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.K3());
        o9.s.l(googleSignInAccount);
        o9.s.l(googleSignInOptions);
        String strK3 = googleSignInAccount.K3();
        h(i("googleSignInAccount", strK3), googleSignInAccount.L3());
        h(i("googleSignInOptions", strK3), googleSignInOptions.M3());
    }

    public final String g(@NonNull String str) {
        this.f13243a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.f13243a.unlock();
        }
    }

    public final void h(@NonNull String str, @NonNull String str2) {
        this.f13243a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.f13243a.unlock();
        }
    }
}
