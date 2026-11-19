package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.f;
import d9.h;
import e9.b;
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
import o9.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends p9.a implements l9.a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f6071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f6072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public static final Scope f6073s = new Scope("profile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public static final Scope f6074t = new Scope("email");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public static final Scope f6075u = new Scope("openid");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public static final Scope f6076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public static final Scope f6077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Comparator f6078x;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f6081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f6085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f6087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f6089p;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f6076v = scope;
        f6077w = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f6071q = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f6072r = aVar2.a();
        CREATOR = new h();
        f6078x = new f();
    }

    public static GoogleSignInOptions I3(String str) throws JSONException {
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

    public static Map T3(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e9.a aVar = (e9.a) it.next();
                map.put(Integer.valueOf(aVar.getType()), aVar);
            }
        }
        return map;
    }

    @NonNull
    public ArrayList<e9.a> A3() {
        return this.f6087n;
    }

    public String B3() {
        return this.f6088o;
    }

    @NonNull
    public ArrayList<Scope> C3() {
        return new ArrayList<>(this.f6080g);
    }

    public String D3() {
        return this.f6085l;
    }

    public boolean E3() {
        return this.f6084k;
    }

    public boolean F3() {
        return this.f6082i;
    }

    public boolean G3() {
        return this.f6083j;
    }

    public Account K2() {
        return this.f6081h;
    }

    @NonNull
    public final String M3() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f6080g, f6078x);
            ArrayList arrayList = this.f6080g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((Scope) obj).A3());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f6081h;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f6082i);
            jSONObject.put("forceCodeForRefreshToken", this.f6084k);
            jSONObject.put("serverAuthRequested", this.f6083j);
            if (!TextUtils.isEmpty(this.f6085l)) {
                jSONObject.put("serverClientId", this.f6085l);
            }
            if (!TextUtils.isEmpty(this.f6086m)) {
                jSONObject.put("hostedDomain", this.f6086m);
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
            if (this.f6087n.isEmpty() && googleSignInOptions.f6087n.isEmpty() && this.f6080g.size() == googleSignInOptions.C3().size() && this.f6080g.containsAll(googleSignInOptions.C3())) {
                Account account = this.f6081h;
                if (account == null) {
                    if (googleSignInOptions.K2() == null) {
                        if (TextUtils.isEmpty(this.f6085l)) {
                            if (TextUtils.isEmpty(googleSignInOptions.D3())) {
                                if (this.f6084k != googleSignInOptions.E3() && this.f6082i == googleSignInOptions.F3() && this.f6083j == googleSignInOptions.G3() && TextUtils.equals(this.f6088o, googleSignInOptions.B3())) {
                                    return true;
                                }
                            }
                        } else if (!this.f6085l.equals(googleSignInOptions.D3())) {
                            if (this.f6084k != googleSignInOptions.E3()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.K2())) {
                    if (TextUtils.isEmpty(this.f6085l)) {
                        if (TextUtils.isEmpty(googleSignInOptions.D3())) {
                            if (this.f6084k != googleSignInOptions.E3()) {
                            }
                        }
                    } else if (!this.f6085l.equals(googleSignInOptions.D3())) {
                        if (this.f6084k != googleSignInOptions.E3()) {
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
        ArrayList arrayList2 = this.f6080g;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).A3());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.f6081h);
        bVar.a(this.f6085l);
        bVar.c(this.f6084k);
        bVar.c(this.f6082i);
        bVar.c(this.f6083j);
        bVar.a(this.f6088o);
        return bVar.b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f6079f;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.z(parcel, 2, C3(), false);
        c.t(parcel, 3, K2(), i10, false);
        c.c(parcel, 4, F3());
        c.c(parcel, 5, G3());
        c.c(parcel, 6, E3());
        c.v(parcel, 7, D3(), false);
        c.v(parcel, 8, this.f6086m, false);
        c.z(parcel, 9, A3(), false);
        c.v(parcel, 10, B3(), false);
        c.b(parcel, iA);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f6090a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f6093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Account f6094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f6095g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f6096h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f6097i;

        public a() {
            this.f6090a = new HashSet();
            this.f6096h = new HashMap();
        }

        @NonNull
        public GoogleSignInOptions a() {
            if (this.f6090a.contains(GoogleSignInOptions.f6077w)) {
                Set set = this.f6090a;
                Scope scope = GoogleSignInOptions.f6076v;
                if (set.contains(scope)) {
                    this.f6090a.remove(scope);
                }
            }
            if (this.f6092d && (this.f6094f == null || !this.f6090a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f6090a), this.f6094f, this.f6092d, this.b, this.f6091c, this.f6093e, this.f6095g, this.f6096h, this.f6097i);
        }

        @NonNull
        public a b() {
            this.f6090a.add(GoogleSignInOptions.f6075u);
            return this;
        }

        @NonNull
        public a c() {
            this.f6090a.add(GoogleSignInOptions.f6073s);
            return this;
        }

        @NonNull
        public a d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f6090a.add(scope);
            this.f6090a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f6097i = str;
            return this;
        }

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f6090a = new HashSet();
            this.f6096h = new HashMap();
            s.l(googleSignInOptions);
            this.f6090a = new HashSet(googleSignInOptions.f6080g);
            this.b = googleSignInOptions.f6083j;
            this.f6091c = googleSignInOptions.f6084k;
            this.f6092d = googleSignInOptions.f6082i;
            this.f6093e = googleSignInOptions.f6085l;
            this.f6094f = googleSignInOptions.f6081h;
            this.f6095g = googleSignInOptions.f6086m;
            this.f6096h = GoogleSignInOptions.T3(googleSignInOptions.f6087n);
            this.f6097i = googleSignInOptions.f6088o;
        }
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, T3(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f6079f = i10;
        this.f6080g = arrayList;
        this.f6081h = account;
        this.f6082i = z10;
        this.f6083j = z11;
        this.f6084k = z12;
        this.f6085l = str;
        this.f6086m = str2;
        this.f6087n = new ArrayList(map.values());
        this.f6089p = map;
        this.f6088o = str3;
    }
}
