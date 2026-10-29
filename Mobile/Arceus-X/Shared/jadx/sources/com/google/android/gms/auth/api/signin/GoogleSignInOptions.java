package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p045c9.C1573f;
import p045c9.C1575h;
import p072d9.C4473a;
import p242k9.C7491a;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements C7491a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: q */
    @NonNull
    public static final GoogleSignInOptions f7302q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public static final GoogleSignInOptions f7303r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public static final Scope f7304s = new Scope("profile");

    /* JADX INFO: renamed from: t */
    @NonNull
    public static final Scope f7305t = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* JADX INFO: renamed from: u */
    @NonNull
    public static final Scope f7306u = new Scope("openid");

    /* JADX INFO: renamed from: v */
    @NonNull
    public static final Scope f7307v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public static final Scope f7308w;

    /* JADX INFO: renamed from: x */
    public static final Comparator f7309x;

    /* JADX INFO: renamed from: f */
    public final int f7310f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7311g;

    /* JADX INFO: renamed from: h */
    public Account f7312h;

    /* JADX INFO: renamed from: i */
    public boolean f7313i;

    /* JADX INFO: renamed from: j */
    public final boolean f7314j;

    /* JADX INFO: renamed from: k */
    public final boolean f7315k;

    /* JADX INFO: renamed from: l */
    public String f7316l;

    /* JADX INFO: renamed from: m */
    public String f7317m;

    /* JADX INFO: renamed from: n */
    public ArrayList f7318n;

    /* JADX INFO: renamed from: o */
    public String f7319o;

    /* JADX INFO: renamed from: p */
    public Map f7320p;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f7307v = scope;
        f7308w = new Scope("https://www.googleapis.com/auth/games");
        C1885a c1885a = new C1885a();
        c1885a.m9099b();
        c1885a.m9100c();
        f7302q = c1885a.m9098a();
        C1885a c1885a2 = new C1885a();
        c1885a2.m9101d(scope, new Scope[0]);
        f7303r = c1885a2.m9098a();
        CREATOR = new C1575h();
        f7309x = new C1573f();
    }

    /* JADX INFO: renamed from: D3 */
    public static GoogleSignInOptions m9078D3(String str) throws JSONException {
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

    /* JADX INFO: renamed from: O3 */
    public static Map m9088O3(List list) {
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

    /* JADX INFO: renamed from: A3 */
    public boolean m9089A3() {
        return this.f7313i;
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m9090B3() {
        return this.f7314j;
    }

    /* JADX INFO: renamed from: G2 */
    public Account m9091G2() {
        return this.f7312h;
    }

    @NonNull
    /* JADX INFO: renamed from: H3 */
    public final String m9092H3() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f7311g, f7309x);
            ArrayList arrayList = this.f7311g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((Scope) obj).m9162v3());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f7312h;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f7313i);
            jSONObject.put("forceCodeForRefreshToken", this.f7315k);
            jSONObject.put("serverAuthRequested", this.f7314j);
            if (!TextUtils.isEmpty(this.f7316l)) {
                jSONObject.put("serverClientId", this.f7316l);
            }
            if (!TextUtils.isEmpty(this.f7317m)) {
                jSONObject.put("hostedDomain", this.f7317m);
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
            if (this.f7318n.isEmpty() && googleSignInOptions.f7318n.isEmpty() && this.f7311g.size() == googleSignInOptions.m9095x3().size() && this.f7311g.containsAll(googleSignInOptions.m9095x3())) {
                Account account = this.f7312h;
                if (account == null) {
                    if (googleSignInOptions.m9091G2() == null) {
                        if (TextUtils.isEmpty(this.f7316l)) {
                            if (TextUtils.isEmpty(googleSignInOptions.m9096y3())) {
                                if (this.f7315k != googleSignInOptions.m9097z3() && this.f7313i == googleSignInOptions.m9089A3() && this.f7314j == googleSignInOptions.m9090B3() && TextUtils.equals(this.f7319o, googleSignInOptions.m9094w3())) {
                                    return true;
                                }
                            }
                        } else if (!this.f7316l.equals(googleSignInOptions.m9096y3())) {
                            if (this.f7315k != googleSignInOptions.m9097z3()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.m9091G2())) {
                    if (TextUtils.isEmpty(this.f7316l)) {
                        if (TextUtils.isEmpty(googleSignInOptions.m9096y3())) {
                            if (this.f7315k != googleSignInOptions.m9097z3()) {
                            }
                        }
                    } else if (!this.f7316l.equals(googleSignInOptions.m9096y3())) {
                        if (this.f7315k != googleSignInOptions.m9097z3()) {
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
        ArrayList arrayList2 = this.f7311g;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).m9162v3());
        }
        Collections.sort(arrayList);
        C4473a c4473a = new C4473a();
        c4473a.m22420a(arrayList);
        c4473a.m22420a(this.f7312h);
        c4473a.m22420a(this.f7316l);
        c4473a.m22422c(this.f7315k);
        c4473a.m22422c(this.f7313i);
        c4473a.m22422c(this.f7314j);
        c4473a.m22420a(this.f7319o);
        return c4473a.m22421b();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m9093v3() {
        return this.f7318n;
    }

    /* JADX INFO: renamed from: w3 */
    public String m9094w3() {
        return this.f7319o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7310f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38482z(parcel, 2, m9095x3(), false);
        C9718b.m38476t(parcel, 3, m9091G2(), i10, false);
        C9718b.m38459c(parcel, 4, m9089A3());
        C9718b.m38459c(parcel, 5, m9090B3());
        C9718b.m38459c(parcel, 6, m9097z3());
        C9718b.m38478v(parcel, 7, m9096y3(), false);
        C9718b.m38478v(parcel, 8, this.f7317m, false);
        C9718b.m38482z(parcel, 9, m9093v3(), false);
        C9718b.m38478v(parcel, 10, m9094w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @NonNull
    /* JADX INFO: renamed from: x3 */
    public ArrayList<Scope> m9095x3() {
        return new ArrayList<>(this.f7311g);
    }

    /* JADX INFO: renamed from: y3 */
    public String m9096y3() {
        return this.f7316l;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m9097z3() {
        return this.f7315k;
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C1885a {

        /* JADX INFO: renamed from: a */
        public Set f7321a;

        /* JADX INFO: renamed from: b */
        public boolean f7322b;

        /* JADX INFO: renamed from: c */
        public boolean f7323c;

        /* JADX INFO: renamed from: d */
        public boolean f7324d;

        /* JADX INFO: renamed from: e */
        public String f7325e;

        /* JADX INFO: renamed from: f */
        public Account f7326f;

        /* JADX INFO: renamed from: g */
        public String f7327g;

        /* JADX INFO: renamed from: h */
        public Map f7328h;

        /* JADX INFO: renamed from: i */
        public String f7329i;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1885a() {
            this.f7321a = new HashSet();
            this.f7328h = new HashMap();
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public GoogleSignInOptions m9098a() {
            if (this.f7321a.contains(GoogleSignInOptions.f7308w)) {
                Set set = this.f7321a;
                Scope scope = GoogleSignInOptions.f7307v;
                if (set.contains(scope)) {
                    this.f7321a.remove(scope);
                }
            }
            if (this.f7324d && (this.f7326f == null || !this.f7321a.isEmpty())) {
                m9099b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f7321a), this.f7326f, this.f7324d, this.f7322b, this.f7323c, this.f7325e, this.f7327g, this.f7328h, this.f7329i);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1885a m9099b() {
            this.f7321a.add(GoogleSignInOptions.f7306u);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1885a m9100c() {
            this.f7321a.add(GoogleSignInOptions.f7304s);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1885a m9101d(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f7321a.add(scope);
            this.f7321a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C1885a m9102e(@NonNull String str) {
            this.f7329i = str;
            return this;
        }

        public C1885a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f7321a = new HashSet();
            this.f7328h = new HashMap();
            C8953m.m36047l(googleSignInOptions);
            this.f7321a = new HashSet(googleSignInOptions.f7311g);
            this.f7322b = googleSignInOptions.f7314j;
            this.f7323c = googleSignInOptions.f7315k;
            this.f7324d = googleSignInOptions.f7313i;
            this.f7325e = googleSignInOptions.f7316l;
            this.f7326f = googleSignInOptions.f7312h;
            this.f7327g = googleSignInOptions.f7317m;
            this.f7328h = GoogleSignInOptions.m9088O3(googleSignInOptions.f7318n);
            this.f7329i = googleSignInOptions.f7319o;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, m9088O3(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f7310f = i10;
        this.f7311g = arrayList;
        this.f7312h = account;
        this.f7313i = z10;
        this.f7314j = z11;
        this.f7315k = z12;
        this.f7316l = str;
        this.f7317m = str2;
        this.f7318n = new ArrayList(map.values());
        this.f7320p = map;
        this.f7319o = str3;
    }
}
