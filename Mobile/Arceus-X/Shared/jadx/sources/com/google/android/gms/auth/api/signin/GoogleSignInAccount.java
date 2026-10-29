package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p045c9.C1572e;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11817h;
import p462u9.InterfaceC11814e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1572e();

    /* JADX INFO: renamed from: s */
    @NonNull
    public static final InterfaceC11814e f7288s = C11817h.m44180c();

    /* JADX INFO: renamed from: f */
    public final int f7289f;

    /* JADX INFO: renamed from: g */
    public final String f7290g;

    /* JADX INFO: renamed from: h */
    public final String f7291h;

    /* JADX INFO: renamed from: i */
    public final String f7292i;

    /* JADX INFO: renamed from: j */
    public final String f7293j;

    /* JADX INFO: renamed from: k */
    public final Uri f7294k;

    /* JADX INFO: renamed from: l */
    public String f7295l;

    /* JADX INFO: renamed from: m */
    public final long f7296m;

    /* JADX INFO: renamed from: n */
    public final String f7297n;

    /* JADX INFO: renamed from: o */
    public final List f7298o;

    /* JADX INFO: renamed from: p */
    public final String f7299p;

    /* JADX INFO: renamed from: q */
    public final String f7300q;

    /* JADX INFO: renamed from: r */
    public final Set f7301r = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f7289f = i10;
        this.f7290g = str;
        this.f7291h = str2;
        this.f7292i = str3;
        this.f7293j = str4;
        this.f7294k = uri;
        this.f7295l = str5;
        this.f7296m = j10;
        this.f7297n = str6;
        this.f7298o = list;
        this.f7299p = str7;
        this.f7300q = str8;
    }

    @NonNull
    /* JADX INFO: renamed from: D3 */
    public static GoogleSignInAccount m9063D3(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), C8953m.m36041f(str7), new ArrayList((Collection) C8953m.m36047l(set)), str5, str6);
    }

    /* JADX INFO: renamed from: E3 */
    public static GoogleSignInAccount m9064E3(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountM9063D3 = m9063D3(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM9063D3.f7295l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountM9063D3;
    }

    /* JADX INFO: renamed from: A3 */
    public Uri m9065A3() {
        return this.f7294k;
    }

    @NonNull
    /* JADX INFO: renamed from: B3 */
    public Set<Scope> m9066B3() {
        HashSet hashSet = new HashSet(this.f7298o);
        hashSet.addAll(this.f7301r);
        return hashSet;
    }

    /* JADX INFO: renamed from: C3 */
    public String m9067C3() {
        return this.f7295l;
    }

    @NonNull
    /* JADX INFO: renamed from: F3 */
    public final String m9068F3() {
        return this.f7297n;
    }

    /* JADX INFO: renamed from: G2 */
    public Account m9069G2() {
        String str = this.f7292i;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @NonNull
    /* JADX INFO: renamed from: G3 */
    public final String m9070G3() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m9075y3() != null) {
                jSONObject.put("id", m9075y3());
            }
            if (m9076z3() != null) {
                jSONObject.put("tokenId", m9076z3());
            }
            if (m9072v3() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, m9072v3());
            }
            if (m9071l() != null) {
                jSONObject.put("displayName", m9071l());
            }
            if (m9074x3() != null) {
                jSONObject.put("givenName", m9074x3());
            }
            if (m9073w3() != null) {
                jSONObject.put("familyName", m9073w3());
            }
            Uri uriM9065A3 = m9065A3();
            if (uriM9065A3 != null) {
                jSONObject.put("photoUrl", uriM9065A3.toString());
            }
            if (m9067C3() != null) {
                jSONObject.put("serverAuthCode", m9067C3());
            }
            jSONObject.put("expirationTime", this.f7296m);
            jSONObject.put("obfuscatedIdentifier", this.f7297n);
            JSONArray jSONArray = new JSONArray();
            List list = this.f7298o;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: c9.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).m9162v3().compareTo(((Scope) obj2).m9162v3());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m9162v3());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f7297n.equals(this.f7297n) && googleSignInAccount.m9066B3().equals(m9066B3());
    }

    public int hashCode() {
        return ((this.f7297n.hashCode() + 527) * 31) + m9066B3().hashCode();
    }

    /* JADX INFO: renamed from: l */
    public String m9071l() {
        return this.f7293j;
    }

    /* JADX INFO: renamed from: v3 */
    public String m9072v3() {
        return this.f7292i;
    }

    /* JADX INFO: renamed from: w3 */
    public String m9073w3() {
        return this.f7300q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f7289f);
        C9718b.m38478v(parcel, 2, m9075y3(), false);
        C9718b.m38478v(parcel, 3, m9076z3(), false);
        C9718b.m38478v(parcel, 4, m9072v3(), false);
        C9718b.m38478v(parcel, 5, m9071l(), false);
        C9718b.m38476t(parcel, 6, m9065A3(), i10, false);
        C9718b.m38478v(parcel, 7, m9067C3(), false);
        C9718b.m38474r(parcel, 8, this.f7296m);
        C9718b.m38478v(parcel, 9, this.f7297n, false);
        C9718b.m38482z(parcel, 10, this.f7298o, false);
        C9718b.m38478v(parcel, 11, m9074x3(), false);
        C9718b.m38478v(parcel, 12, m9073w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public String m9074x3() {
        return this.f7299p;
    }

    /* JADX INFO: renamed from: y3 */
    public String m9075y3() {
        return this.f7290g;
    }

    /* JADX INFO: renamed from: z3 */
    public String m9076z3() {
        return this.f7291h;
    }
}
