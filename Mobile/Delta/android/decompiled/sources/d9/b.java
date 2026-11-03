package d9;

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
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lock f14469c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f14470d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f14471a = new ReentrantLock();
    public final SharedPreferences b;

    public b(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    public static b b(@NonNull Context context) {
        n9.m.l(context);
        f14469c.lock();
        try {
            if (f14470d == null) {
                f14470d = new b(context.getApplicationContext());
            }
            return f14470d;
        } finally {
            f14469c.unlock();
        }
    }

    public static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f14471a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.f14471a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.E3(strG);
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
                return GoogleSignInOptions.D3(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        n9.m.l(googleSignInAccount);
        n9.m.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.F3());
        n9.m.l(googleSignInAccount);
        n9.m.l(googleSignInOptions);
        String strF3 = googleSignInAccount.F3();
        h(i("googleSignInAccount", strF3), googleSignInAccount.G3());
        h(i("googleSignInOptions", strF3), googleSignInOptions.H3());
    }

    public final String g(@NonNull String str) {
        this.f14471a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.f14471a.unlock();
        }
    }

    public final void h(@NonNull String str, @NonNull String str2) {
        this.f14471a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.f14471a.unlock();
        }
    }
}
