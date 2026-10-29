package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import c9.e;
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
import n9.m;
import o9.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u9.h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public static final u9.e f5613s = h.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f5618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f5619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f5621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f5623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f5624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f5626r = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f5614f = i10;
        this.f5615g = str;
        this.f5616h = str2;
        this.f5617i = str3;
        this.f5618j = str4;
        this.f5619k = uri;
        this.f5620l = str5;
        this.f5621m = j10;
        this.f5622n = str6;
        this.f5623o = list;
        this.f5624p = str7;
        this.f5625q = str8;
    }

    @NonNull
    public static GoogleSignInAccount D3(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), m.f(str7), new ArrayList((Collection) m.l(set)), str5, str6);
    }

    public static GoogleSignInAccount E3(String str) throws JSONException {
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
        GoogleSignInAccount googleSignInAccountD3 = D3(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountD3.f5620l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountD3;
    }

    public Uri A3() {
        return this.f5619k;
    }

    @NonNull
    public Set<Scope> B3() {
        HashSet hashSet = new HashSet(this.f5623o);
        hashSet.addAll(this.f5626r);
        return hashSet;
    }

    public String C3() {
        return this.f5620l;
    }

    @NonNull
    public final String F3() {
        return this.f5622n;
    }

    public Account G2() {
        String str = this.f5617i;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @NonNull
    public final String G3() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (y3() != null) {
                jSONObject.put("id", y3());
            }
            if (z3() != null) {
                jSONObject.put("tokenId", z3());
            }
            if (v3() != null) {
                jSONObject.put("email", v3());
            }
            if (l() != null) {
                jSONObject.put("displayName", l());
            }
            if (x3() != null) {
                jSONObject.put("givenName", x3());
            }
            if (w3() != null) {
                jSONObject.put("familyName", w3());
            }
            Uri uriA3 = A3();
            if (uriA3 != null) {
                jSONObject.put("photoUrl", uriA3.toString());
            }
            if (C3() != null) {
                jSONObject.put("serverAuthCode", C3());
            }
            jSONObject.put("expirationTime", this.f5621m);
            jSONObject.put("obfuscatedIdentifier", this.f5622n);
            JSONArray jSONArray = new JSONArray();
            List list = this.f5623o;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: c9.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).v3().compareTo(((Scope) obj2).v3());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.v3());
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
        return googleSignInAccount.f5622n.equals(this.f5622n) && googleSignInAccount.B3().equals(B3());
    }

    public int hashCode() {
        return ((this.f5622n.hashCode() + 527) * 31) + B3().hashCode();
    }

    public String l() {
        return this.f5618j;
    }

    public String v3() {
        return this.f5617i;
    }

    public String w3() {
        return this.f5625q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f5614f);
        b.v(parcel, 2, y3(), false);
        b.v(parcel, 3, z3(), false);
        b.v(parcel, 4, v3(), false);
        b.v(parcel, 5, l(), false);
        b.t(parcel, 6, A3(), i10, false);
        b.v(parcel, 7, C3(), false);
        b.r(parcel, 8, this.f5621m);
        b.v(parcel, 9, this.f5622n, false);
        b.z(parcel, 10, this.f5623o, false);
        b.v(parcel, 11, x3(), false);
        b.v(parcel, 12, w3(), false);
        b.b(parcel, iA);
    }

    public String x3() {
        return this.f5624p;
    }

    public String y3() {
        return this.f5615g;
    }

    public String z3() {
        return this.f5616h;
    }
}
