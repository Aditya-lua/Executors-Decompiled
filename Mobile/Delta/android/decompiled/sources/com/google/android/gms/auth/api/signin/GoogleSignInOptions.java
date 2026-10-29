package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import c9.f;
import c9.h;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n9.m;
import o9.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements k9.a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f5627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f5628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public static final Scope f5629s = new Scope("profile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public static final Scope f5630t = new Scope("email");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public static final Scope f5631u = new Scope("openid");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public static final Scope f5632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public static final Scope f5633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Comparator f5634x;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f5637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f5643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f5645p;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f5632v = scope;
        f5633w = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f5627q = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f5628r = aVar2.a();
        CREATOR = new h();
        f5634x = new f();
    }

    public static GoogleSignInOptions D3(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public static Map O3(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public boolean A3() {
        return this.f5638i;
    }

    public boolean B3() {
        return this.f5639j;
    }

    public Account G2() {
        return this.f5637h;
    }

    @NonNull
    public final String H3() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5636g, f5634x);
            ArrayList arrayList = this.f5636g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((Scope) obj).v3());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f5637h;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f5638i);
            jSONObject.put("forceCodeForRefreshToken", this.f5640k);
            jSONObject.put("serverAuthRequested", this.f5639j);
            if (!TextUtils.isEmpty(this.f5641l)) {
                jSONObject.put("serverClientId", this.f5641l);
            }
            if (!TextUtils.isEmpty(this.f5642m)) {
                jSONObject.put("hostedDomain", this.f5642m);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f5643n.isEmpty() && googleSignInOptions.f5643n.isEmpty() && this.f5636g.size() == googleSignInOptions.x3().size() && this.f5636g.containsAll(googleSignInOptions.x3())) {
                Account account = this.f5637h;
                if (account == null) {
                    if (googleSignInOptions.G2() == null) {
                        if (TextUtils.isEmpty(this.f5641l)) {
                            if (TextUtils.isEmpty(googleSignInOptions.y3())) {
                                if (this.f5640k != googleSignInOptions.z3() && this.f5638i == googleSignInOptions.A3() && this.f5639j == googleSignInOptions.B3() && TextUtils.equals(this.f5644o, googleSignInOptions.w3())) {
                                    return true;
                                }
                            }
                        } else if (!this.f5641l.equals(googleSignInOptions.y3())) {
                            if (this.f5640k != googleSignInOptions.z3()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.G2())) {
                    if (TextUtils.isEmpty(this.f5641l)) {
                        if (TextUtils.isEmpty(googleSignInOptions.y3())) {
                            if (this.f5640k != googleSignInOptions.z3()) {
                            }
                        }
                    } else if (!this.f5641l.equals(googleSignInOptions.y3())) {
                        if (this.f5640k != googleSignInOptions.z3()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5636g;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).v3());
        }
        Collections.sort(arrayList);
        d9.a aVar = new d9.a();
        aVar.a(arrayList);
        aVar.a(this.f5637h);
        aVar.a(this.f5641l);
        aVar.c(this.f5640k);
        aVar.c(this.f5638i);
        aVar.c(this.f5639j);
        aVar.a(this.f5644o);
        return aVar.b();
    }

    @NonNull
    public ArrayList<GoogleSignInOptionsExtensionParcelable> v3() {
        return this.f5643n;
    }

    public String w3() {
        return this.f5644o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5635f;
        int iA = b.a(parcel);
        b.n(parcel, 1, i11);
        b.z(parcel, 2, x3(), false);
        b.t(parcel, 3, G2(), i10, false);
        b.c(parcel, 4, A3());
        b.c(parcel, 5, B3());
        b.c(parcel, 6, z3());
        b.v(parcel, 7, y3(), false);
        b.v(parcel, 8, this.f5642m, false);
        b.z(parcel, 9, v3(), false);
        b.v(parcel, 10, w3(), false);
        b.b(parcel, iA);
    }

    @NonNull
    public ArrayList<Scope> x3() {
        return new ArrayList<>(this.f5636g);
    }

    public String y3() {
        return this.f5641l;
    }

    public boolean z3() {
        return this.f5640k;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f5646a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f5649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Account f5650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f5651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f5652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f5653i;

        public a() {
            this.f5646a = new HashSet();
            this.f5652h = new HashMap();
        }

        @NonNull
        public GoogleSignInOptions a() {
            if (this.f5646a.contains(GoogleSignInOptions.f5633w)) {
                Set set = this.f5646a;
                Scope scope = GoogleSignInOptions.f5632v;
                if (set.contains(scope)) {
                    this.f5646a.remove(scope);
                }
            }
            if (this.f5648d && (this.f5650f == null || !this.f5646a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f5646a), this.f5650f, this.f5648d, this.b, this.f5647c, this.f5649e, this.f5651g, this.f5652h, this.f5653i);
        }

        @NonNull
        public a b() {
            this.f5646a.add(GoogleSignInOptions.f5631u);
            return this;
        }

        @NonNull
        public a c() {
            this.f5646a.add(GoogleSignInOptions.f5629s);
            return this;
        }

        @NonNull
        public a d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f5646a.add(scope);
            this.f5646a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f5653i = str;
            return this;
        }

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f5646a = new HashSet();
            this.f5652h = new HashMap();
            m.l(googleSignInOptions);
            this.f5646a = new HashSet(googleSignInOptions.f5636g);
            this.b = googleSignInOptions.f5639j;
            this.f5647c = googleSignInOptions.f5640k;
            this.f5648d = googleSignInOptions.f5638i;
            this.f5649e = googleSignInOptions.f5641l;
            this.f5650f = googleSignInOptions.f5637h;
            this.f5651g = googleSignInOptions.f5642m;
            this.f5652h = GoogleSignInOptions.O3(googleSignInOptions.f5643n);
            this.f5653i = googleSignInOptions.f5644o;
        }
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, O3(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f5635f = i10;
        this.f5636g = arrayList;
        this.f5637h = account;
        this.f5638i = z10;
        this.f5639j = z11;
        this.f5640k = z12;
        this.f5641l = str;
        this.f5642m = str2;
        this.f5643n = new ArrayList(map.values());
        this.f5645p = map;
        this.f5644o = str3;
    }
}
