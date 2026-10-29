package p283m2;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p235k2.C7426r;
import p261l2.C7977d;
import p439t2.C11472b;

/* JADX INFO: renamed from: m2.c */
/* JADX INFO: loaded from: classes.dex */
public class C8410c {

    /* JADX INFO: renamed from: a */
    public Context f30971a;

    /* JADX INFO: renamed from: b */
    public String f30972b;

    /* JADX INFO: renamed from: c */
    public String f30973c;

    /* JADX INFO: renamed from: d */
    public Intent[] f30974d;

    /* JADX INFO: renamed from: e */
    public ComponentName f30975e;

    /* JADX INFO: renamed from: f */
    public CharSequence f30976f;

    /* JADX INFO: renamed from: g */
    public CharSequence f30977g;

    /* JADX INFO: renamed from: h */
    public CharSequence f30978h;

    /* JADX INFO: renamed from: i */
    public IconCompat f30979i;

    /* JADX INFO: renamed from: j */
    public C7426r[] f30980j;

    /* JADX INFO: renamed from: k */
    public Set<String> f30981k;

    /* JADX INFO: renamed from: l */
    public C7977d f30982l;

    /* JADX INFO: renamed from: m */
    public boolean f30983m;

    /* JADX INFO: renamed from: n */
    public int f30984n;

    /* JADX INFO: renamed from: o */
    public PersistableBundle f30985o;

    /* JADX INFO: renamed from: p */
    public long f30986p;

    /* JADX INFO: renamed from: q */
    public UserHandle f30987q;

    /* JADX INFO: renamed from: r */
    public boolean f30988r;

    /* JADX INFO: renamed from: s */
    public boolean f30989s;

    /* JADX INFO: renamed from: t */
    public boolean f30990t;

    /* JADX INFO: renamed from: u */
    public boolean f30991u;

    /* JADX INFO: renamed from: v */
    public boolean f30992v;

    /* JADX INFO: renamed from: w */
    public boolean f30993w = true;

    /* JADX INFO: renamed from: x */
    public boolean f30994x;

    /* JADX INFO: renamed from: y */
    public int f30995y;

    /* JADX INFO: renamed from: z */
    public int f30996z;

    /* JADX INFO: renamed from: m2.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m34084a(ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<C8410c> m34069b(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).m34085a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static C7977d m34070h(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return m34071i(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return C7977d.m33032d(shortcutInfo.getLocusId());
    }

    /* JADX INFO: renamed from: i */
    public static C7977d m34071i(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new C7977d(string);
    }

    /* JADX INFO: renamed from: k */
    public static C7426r[] m34072k(PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i10 = persistableBundle.getInt("extraPersonCount");
        C7426r[] c7426rArr = new C7426r[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("extraPerson_");
            int i12 = i11 + 1;
            sb2.append(i12);
            c7426rArr[i11] = C7426r.m30911a(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return c7426rArr;
    }

    /* JADX INFO: renamed from: a */
    public final PersistableBundle m34073a() {
        if (this.f30985o == null) {
            this.f30985o = new PersistableBundle();
        }
        C7426r[] c7426rArr = this.f30980j;
        if (c7426rArr != null && c7426rArr.length > 0) {
            this.f30985o.putInt("extraPersonCount", c7426rArr.length);
            int i10 = 0;
            while (i10 < this.f30980j.length) {
                PersistableBundle persistableBundle = this.f30985o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f30980j[i10].m30921k());
                i10 = i11;
            }
        }
        C7977d c7977d = this.f30982l;
        if (c7977d != null) {
            this.f30985o.putString("extraLocusId", c7977d.m33033a());
        }
        this.f30985o.putBoolean("extraLongLived", this.f30983m);
        return this.f30985o;
    }

    /* JADX INFO: renamed from: c */
    public Set<String> m34074c() {
        return this.f30981k;
    }

    /* JADX INFO: renamed from: d */
    public PersistableBundle m34075d() {
        return this.f30985o;
    }

    /* JADX INFO: renamed from: e */
    public IconCompat m34076e() {
        return this.f30979i;
    }

    /* JADX INFO: renamed from: f */
    public String m34077f() {
        return this.f30972b;
    }

    /* JADX INFO: renamed from: g */
    public Intent m34078g() {
        Intent[] intentArr = this.f30974d;
        return intentArr[intentArr.length - 1];
    }

    /* JADX INFO: renamed from: j */
    public CharSequence m34079j() {
        return this.f30977g;
    }

    /* JADX INFO: renamed from: l */
    public int m34080l() {
        return this.f30984n;
    }

    /* JADX INFO: renamed from: m */
    public CharSequence m34081m() {
        return this.f30976f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m34082n(int i10) {
        return (i10 & this.f30996z) != 0;
    }

    /* JADX INFO: renamed from: o */
    public ShortcutInfo m34083o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f30971a, this.f30972b).setShortLabel(this.f30976f).setIntents(this.f30974d);
        IconCompat iconCompat = this.f30979i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m2699p(this.f30971a));
        }
        if (!TextUtils.isEmpty(this.f30977g)) {
            intents.setLongLabel(this.f30977g);
        }
        if (!TextUtils.isEmpty(this.f30978h)) {
            intents.setDisabledMessage(this.f30978h);
        }
        ComponentName componentName = this.f30975e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f30981k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f30984n);
        PersistableBundle persistableBundle = this.f30985o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C7426r[] c7426rArr = this.f30980j;
            if (c7426rArr != null && c7426rArr.length > 0) {
                int length = c7426rArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f30980j[i10].m30919i();
                }
                intents.setPersons(personArr);
            }
            C7977d c7977d = this.f30982l;
            if (c7977d != null) {
                intents.setLocusId(c7977d.m33035c());
            }
            intents.setLongLived(this.f30983m);
        } else {
            intents.setExtras(m34073a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.m34084a(intents, this.f30996z);
        }
        return intents.build();
    }

    /* JADX INFO: renamed from: m2.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C8410c f30997a;

        /* JADX INFO: renamed from: b */
        public boolean f30998b;

        /* JADX INFO: renamed from: c */
        public Set<String> f30999c;

        /* JADX INFO: renamed from: d */
        public Map<String, Map<String, List<String>>> f31000d;

        /* JADX INFO: renamed from: e */
        public Uri f31001e;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(Context context, String str) {
            C8410c c8410c = new C8410c();
            this.f30997a = c8410c;
            c8410c.f30971a = context;
            c8410c.f30972b = str;
        }

        /* JADX INFO: renamed from: a */
        public C8410c m34085a() {
            if (TextUtils.isEmpty(this.f30997a.f30976f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            C8410c c8410c = this.f30997a;
            Intent[] intentArr = c8410c.f30974d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f30998b) {
                if (c8410c.f30982l == null) {
                    c8410c.f30982l = new C7977d(c8410c.f30972b);
                }
                this.f30997a.f30983m = true;
            }
            if (this.f30999c != null) {
                C8410c c8410c2 = this.f30997a;
                if (c8410c2.f30981k == null) {
                    c8410c2.f30981k = new HashSet();
                }
                this.f30997a.f30981k.addAll(this.f30999c);
            }
            if (this.f31000d != null) {
                C8410c c8410c3 = this.f30997a;
                if (c8410c3.f30985o == null) {
                    c8410c3.f30985o = new PersistableBundle();
                }
                for (String str : this.f31000d.keySet()) {
                    Map<String, List<String>> map = this.f31000d.get(str);
                    this.f30997a.f30985o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f30997a.f30985o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f31001e != null) {
                C8410c c8410c4 = this.f30997a;
                if (c8410c4.f30985o == null) {
                    c8410c4.f30985o = new PersistableBundle();
                }
                this.f30997a.f30985o.putString("extraSliceUri", C11472b.m42953a(this.f31001e));
            }
            return this.f30997a;
        }

        /* JADX INFO: renamed from: b */
        public b m34086b(ComponentName componentName) {
            this.f30997a.f30975e = componentName;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m34087c(IconCompat iconCompat) {
            this.f30997a.f30979i = iconCompat;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m34088d(Intent intent) {
            return m34089e(new Intent[]{intent});
        }

        /* JADX INFO: renamed from: e */
        public b m34089e(Intent[] intentArr) {
            this.f30997a.f30974d = intentArr;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m34090f(boolean z10) {
            this.f30997a.f30983m = z10;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m34091g(int i10) {
            this.f30997a.f30984n = i10;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m34092h(CharSequence charSequence) {
            this.f30997a.f30976f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            C8410c c8410c = new C8410c();
            this.f30997a = c8410c;
            c8410c.f30971a = context;
            c8410c.f30972b = shortcutInfo.getId();
            c8410c.f30973c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            c8410c.f30974d = (Intent[]) Arrays.copyOf(intents, intents.length);
            c8410c.f30975e = shortcutInfo.getActivity();
            c8410c.f30976f = shortcutInfo.getShortLabel();
            c8410c.f30977g = shortcutInfo.getLongLabel();
            c8410c.f30978h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                c8410c.f30995y = shortcutInfo.getDisabledReason();
            } else {
                c8410c.f30995y = shortcutInfo.isEnabled() ? 0 : 3;
            }
            c8410c.f30981k = shortcutInfo.getCategories();
            c8410c.f30980j = C8410c.m34072k(shortcutInfo.getExtras());
            c8410c.f30987q = shortcutInfo.getUserHandle();
            c8410c.f30986p = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                c8410c.f30988r = shortcutInfo.isCached();
            }
            c8410c.f30989s = shortcutInfo.isDynamic();
            c8410c.f30990t = shortcutInfo.isPinned();
            c8410c.f30991u = shortcutInfo.isDeclaredInManifest();
            c8410c.f30992v = shortcutInfo.isImmutable();
            c8410c.f30993w = shortcutInfo.isEnabled();
            c8410c.f30994x = shortcutInfo.hasKeyFieldsOnly();
            c8410c.f30982l = C8410c.m34070h(shortcutInfo);
            c8410c.f30984n = shortcutInfo.getRank();
            c8410c.f30985o = shortcutInfo.getExtras();
        }
    }
}
