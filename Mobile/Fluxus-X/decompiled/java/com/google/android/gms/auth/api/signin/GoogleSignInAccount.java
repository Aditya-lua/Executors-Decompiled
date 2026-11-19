package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o9.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.c;
import v9.h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends p9.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public static final v9.e f6057s = h.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f6064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f6067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f6070r = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f6058f = i10;
        this.f6059g = str;
        this.f6060h = str2;
        this.f6061i = str3;
        this.f6062j = str4;
        this.f6063k = uri;
        this.f6064l = str5;
        this.f6065m = j10;
        this.f6066n = str6;
        this.f6067o = list;
        this.f6068p = str7;
        this.f6069q = str8;
    }

    @NonNull
    public static GoogleSignInAccount I3(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), s.f(str7), new ArrayList((Collection) s.l(set)), str5, str6);
    }

    public static GoogleSignInAccount J3(String str) throws JSONException {
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
        GoogleSignInAccount googleSignInAccountI3 = I3(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountI3.f6064l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountI3;
    }

    public String A3() {
        return this.f6061i;
    }

    public String B3() {
        return this.f6069q;
    }

    public String C3() {
        return this.f6068p;
    }

    public String D3() {
        return this.f6059g;
    }

    public String E3() {
        return this.f6060h;
    }

    public Uri F3() {
        return this.f6063k;
    }

    @NonNull
    public Set<Scope> G3() {
        HashSet hashSet = new HashSet(this.f6067o);
        hashSet.addAll(this.f6070r);
        return hashSet;
    }

    public String H3() {
        return this.f6064l;
    }

    public Account K2() {
        String str = this.f6061i;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @NonNull
    public final String K3() {
        return this.f6066n;
    }

    @NonNull
    public final String L3() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (D3() != null) {
                jSONObject.put("id", D3());
            }
            if (E3() != null) {
                jSONObject.put("tokenId", E3());
            }
            if (A3() != null) {
                jSONObject.put("email", A3());
            }
            if (m() != null) {
                jSONObject.put("displayName", m());
            }
            if (C3() != null) {
                jSONObject.put("givenName", C3());
            }
            if (B3() != null) {
                jSONObject.put("familyName", B3());
            }
            Uri uriF3 = F3();
            if (uriF3 != null) {
                jSONObject.put("photoUrl", uriF3.toString());
            }
            if (H3() != null) {
                jSONObject.put("serverAuthCode", H3());
            }
            jSONObject.put("expirationTime", this.f6065m);
            jSONObject.put("obfuscatedIdentifier", this.f6066n);
            JSONArray jSONArray = new JSONArray();
            List list = this.f6067o;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: d9.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).A3().compareTo(((Scope) obj2).A3());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.A3());
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
        return googleSignInAccount.f6066n.equals(this.f6066n) && googleSignInAccount.G3().equals(G3());
    }

    public int hashCode() {
        return ((this.f6066n.hashCode() + 527) * 31) + G3().hashCode();
    }

    public String m() {
        return this.f6062j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f6058f);
        c.v(parcel, 2, D3(), false);
        c.v(parcel, 3, E3(), false);
        c.v(parcel, 4, A3(), false);
        c.v(parcel, 5, m(), false);
        c.t(parcel, 6, F3(), i10, false);
        c.v(parcel, 7, H3(), false);
        c.r(parcel, 8, this.f6065m);
        c.v(parcel, 9, this.f6066n, false);
        c.z(parcel, 10, this.f6067o, false);
        c.v(parcel, 11, C3(), false);
        c.v(parcel, 12, B3(), false);
        c.b(parcel, iA);
    }
}
