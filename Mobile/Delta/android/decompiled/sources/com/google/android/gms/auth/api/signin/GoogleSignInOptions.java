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
    public static final GoogleSignInOptions f5700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f5701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public static final Scope f5702s = new Scope("profile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public static final Scope f5703t = new Scope("email");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public static final Scope f5704u = new Scope("openid");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public static final Scope f5705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public static final Scope f5706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Comparator f5707x;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f5710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f5716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f5718p;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f5705v = scope;
        f5706w = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f5700q = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f5701r = aVar2.a();
        CREATOR = new h();
        f5707x = new f();
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
        return this.f5711i;
    }

    public boolean B3() {
        return this.f5712j;
    }

    public Account H2() {
        return this.f5710h;
    }

    @NonNull
    public final String H3() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5709g, f5707x);
            ArrayList arrayList = this.f5709g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((Scope) obj).v3());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f5710h;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f5711i);
            jSONObject.put("forceCodeForRefreshToken", this.f5713k);
            jSONObject.put("serverAuthRequested", this.f5712j);
            if (!TextUtils.isEmpty(this.f5714l)) {
                jSONObject.put("serverClientId", this.f5714l);
            }
            if (!TextUtils.isEmpty(this.f5715m)) {
                jSONObject.put("hostedDomain", this.f5715m);
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
            if (this.f5716n.isEmpty() && googleSignInOptions.f5716n.isEmpty() && this.f5709g.size() == googleSignInOptions.x3().size() && this.f5709g.containsAll(googleSignInOptions.x3())) {
                Account account = this.f5710h;
                if (account == null) {
                    if (googleSignInOptions.H2() == null) {
                        if (TextUtils.isEmpty(this.f5714l)) {
                            if (TextUtils.isEmpty(googleSignInOptions.y3())) {
                                if (this.f5713k != googleSignInOptions.z3() && this.f5711i == googleSignInOptions.A3() && this.f5712j == googleSignInOptions.B3() && TextUtils.equals(this.f5717o, googleSignInOptions.w3())) {
                                    return true;
                                }
                            }
                        } else if (!this.f5714l.equals(googleSignInOptions.y3())) {
                            if (this.f5713k != googleSignInOptions.z3()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.H2())) {
                    if (TextUtils.isEmpty(this.f5714l)) {
                        if (TextUtils.isEmpty(googleSignInOptions.y3())) {
                            if (this.f5713k != googleSignInOptions.z3()) {
                            }
                        }
                    } else if (!this.f5714l.equals(googleSignInOptions.y3())) {
                        if (this.f5713k != googleSignInOptions.z3()) {
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
        ArrayList arrayList2 = this.f5709g;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).v3());
        }
        Collections.sort(arrayList);
        d9.a aVar = new d9.a();
        aVar.a(arrayList);
        aVar.a(this.f5710h);
        aVar.a(this.f5714l);
        aVar.c(this.f5713k);
        aVar.c(this.f5711i);
        aVar.c(this.f5712j);
        aVar.a(this.f5717o);
        return aVar.b();
    }

    @NonNull
    public ArrayList<GoogleSignInOptionsExtensionParcelable> v3() {
        return this.f5716n;
    }

    public String w3() {
        return this.f5717o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5708f;
        int iA = b.a(parcel);
        b.n(parcel, 1, i11);
        b.z(parcel, 2, x3(), false);
        b.t(parcel, 3, H2(), i10, false);
        b.c(parcel, 4, A3());
        b.c(parcel, 5, B3());
        b.c(parcel, 6, z3());
        b.v(parcel, 7, y3(), false);
        b.v(parcel, 8, this.f5715m, false);
        b.z(parcel, 9, v3(), false);
        b.v(parcel, 10, w3(), false);
        b.b(parcel, iA);
    }

    @NonNull
    public ArrayList<Scope> x3() {
        return new ArrayList<>(this.f5709g);
    }

    public String y3() {
        return this.f5714l;
    }

    public boolean z3() {
        return this.f5713k;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f5719a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f5722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Account f5723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f5724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f5725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f5726i;

        public a() {
            this.f5719a = new HashSet();
            this.f5725h = new HashMap();
        }

        @NonNull
        public GoogleSignInOptions a() {
            if (this.f5719a.contains(GoogleSignInOptions.f5706w)) {
                Set set = this.f5719a;
                Scope scope = GoogleSignInOptions.f5705v;
                if (set.contains(scope)) {
                    this.f5719a.remove(scope);
                }
            }
            if (this.f5721d && (this.f5723f == null || !this.f5719a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f5719a), this.f5723f, this.f5721d, this.b, this.f5720c, this.f5722e, this.f5724g, this.f5725h, this.f5726i);
        }

        @NonNull
        public a b() {
            this.f5719a.add(GoogleSignInOptions.f5704u);
            return this;
        }

        @NonNull
        public a c() {
            this.f5719a.add(GoogleSignInOptions.f5702s);
            return this;
        }

        @NonNull
        public a d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f5719a.add(scope);
            this.f5719a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f5726i = str;
            return this;
        }

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f5719a = new HashSet();
            this.f5725h = new HashMap();
            m.l(googleSignInOptions);
            this.f5719a = new HashSet(googleSignInOptions.f5709g);
            this.b = googleSignInOptions.f5712j;
            this.f5720c = googleSignInOptions.f5713k;
            this.f5721d = googleSignInOptions.f5711i;
            this.f5722e = googleSignInOptions.f5714l;
            this.f5723f = googleSignInOptions.f5710h;
            this.f5724g = googleSignInOptions.f5715m;
            this.f5725h = GoogleSignInOptions.O3(googleSignInOptions.f5716n);
            this.f5726i = googleSignInOptions.f5717o;
        }
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, O3(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f5708f = i10;
        this.f5709g = arrayList;
        this.f5710h = account;
        this.f5711i = z10;
        this.f5712j = z11;
        this.f5713k = z12;
        this.f5714l = str;
        this.f5715m = str2;
        this.f5716n = new ArrayList(map.values());
        this.f5718p = map;
        this.f5717o = str3;
    }
}
