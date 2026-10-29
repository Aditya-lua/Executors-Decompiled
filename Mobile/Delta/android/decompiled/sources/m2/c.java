package m2;

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
import k2.r;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f23870a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent[] f23872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComponentName f23873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f23874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f23875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f23876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f23877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r[] f23878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<String> f23879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l2.d f23880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PersistableBundle f23883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f23884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UserHandle f23885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f23888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23890v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23891w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23893y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23894z;

    public static class a {
        public static void a(ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    public static List<c> b(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).a());
        }
        return arrayList;
    }

    public static l2.d h(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return i(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return l2.d.d(shortcutInfo.getLocusId());
    }

    public static l2.d i(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new l2.d(string);
    }

    public static r[] k(PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i10 = persistableBundle.getInt("extraPersonCount");
        r[] rVarArr = new r[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("extraPerson_");
            int i12 = i11 + 1;
            sb2.append(i12);
            rVarArr[i11] = r.a(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return rVarArr;
    }

    public final PersistableBundle a() {
        if (this.f23883o == null) {
            this.f23883o = new PersistableBundle();
        }
        r[] rVarArr = this.f23878j;
        if (rVarArr != null && rVarArr.length > 0) {
            this.f23883o.putInt("extraPersonCount", rVarArr.length);
            int i10 = 0;
            while (i10 < this.f23878j.length) {
                PersistableBundle persistableBundle = this.f23883o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f23878j[i10].k());
                i10 = i11;
            }
        }
        l2.d dVar = this.f23880l;
        if (dVar != null) {
            this.f23883o.putString("extraLocusId", dVar.a());
        }
        this.f23883o.putBoolean("extraLongLived", this.f23881m);
        return this.f23883o;
    }

    public Set<String> c() {
        return this.f23879k;
    }

    public PersistableBundle d() {
        return this.f23883o;
    }

    public IconCompat e() {
        return this.f23877i;
    }

    public String f() {
        return this.b;
    }

    public Intent g() {
        Intent[] intentArr = this.f23872d;
        return intentArr[intentArr.length - 1];
    }

    public CharSequence j() {
        return this.f23875g;
    }

    public int l() {
        return this.f23882n;
    }

    public CharSequence m() {
        return this.f23874f;
    }

    public boolean n(int i10) {
        return (i10 & this.f23894z) != 0;
    }

    public ShortcutInfo o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f23870a, this.b).setShortLabel(this.f23874f).setIntents(this.f23872d);
        IconCompat iconCompat = this.f23877i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.p(this.f23870a));
        }
        if (!TextUtils.isEmpty(this.f23875g)) {
            intents.setLongLabel(this.f23875g);
        }
        if (!TextUtils.isEmpty(this.f23876h)) {
            intents.setDisabledMessage(this.f23876h);
        }
        ComponentName componentName = this.f23873e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f23879k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f23882n);
        PersistableBundle persistableBundle = this.f23883o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r[] rVarArr = this.f23878j;
            if (rVarArr != null && rVarArr.length > 0) {
                int length = rVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f23878j[i10].i();
                }
                intents.setPersons(personArr);
            }
            l2.d dVar = this.f23880l;
            if (dVar != null) {
                intents.setLocusId(dVar.c());
            }
            intents.setLongLived(this.f23881m);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.f23894z);
        }
        return intents.build();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f23895a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<String> f23896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, Map<String, List<String>>> f23897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Uri f23898e;

        public b(Context context, String str) {
            c cVar = new c();
            this.f23895a = cVar;
            cVar.f23870a = context;
            cVar.b = str;
        }

        public c a() {
            if (TextUtils.isEmpty(this.f23895a.f23874f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            c cVar = this.f23895a;
            Intent[] intentArr = cVar.f23872d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.b) {
                if (cVar.f23880l == null) {
                    cVar.f23880l = new l2.d(cVar.b);
                }
                this.f23895a.f23881m = true;
            }
            if (this.f23896c != null) {
                c cVar2 = this.f23895a;
                if (cVar2.f23879k == null) {
                    cVar2.f23879k = new HashSet();
                }
                this.f23895a.f23879k.addAll(this.f23896c);
            }
            if (this.f23897d != null) {
                c cVar3 = this.f23895a;
                if (cVar3.f23883o == null) {
                    cVar3.f23883o = new PersistableBundle();
                }
                for (String str : this.f23897d.keySet()) {
                    Map<String, List<String>> map = this.f23897d.get(str);
                    this.f23895a.f23883o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f23895a.f23883o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f23898e != null) {
                c cVar4 = this.f23895a;
                if (cVar4.f23883o == null) {
                    cVar4.f23883o = new PersistableBundle();
                }
                this.f23895a.f23883o.putString("extraSliceUri", t2.b.a(this.f23898e));
            }
            return this.f23895a;
        }

        public b b(ComponentName componentName) {
            this.f23895a.f23873e = componentName;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f23895a.f23877i = iconCompat;
            return this;
        }

        public b d(Intent intent) {
            return e(new Intent[]{intent});
        }

        public b e(Intent[] intentArr) {
            this.f23895a.f23872d = intentArr;
            return this;
        }

        public b f(boolean z10) {
            this.f23895a.f23881m = z10;
            return this;
        }

        public b g(int i10) {
            this.f23895a.f23882n = i10;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f23895a.f23874f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            c cVar = new c();
            this.f23895a = cVar;
            cVar.f23870a = context;
            cVar.b = shortcutInfo.getId();
            cVar.f23871c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            cVar.f23872d = (Intent[]) Arrays.copyOf(intents, intents.length);
            cVar.f23873e = shortcutInfo.getActivity();
            cVar.f23874f = shortcutInfo.getShortLabel();
            cVar.f23875g = shortcutInfo.getLongLabel();
            cVar.f23876h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                cVar.f23893y = shortcutInfo.getDisabledReason();
            } else {
                cVar.f23893y = shortcutInfo.isEnabled() ? 0 : 3;
            }
            cVar.f23879k = shortcutInfo.getCategories();
            cVar.f23878j = c.k(shortcutInfo.getExtras());
            cVar.f23885q = shortcutInfo.getUserHandle();
            cVar.f23884p = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                cVar.f23886r = shortcutInfo.isCached();
            }
            cVar.f23887s = shortcutInfo.isDynamic();
            cVar.f23888t = shortcutInfo.isPinned();
            cVar.f23889u = shortcutInfo.isDeclaredInManifest();
            cVar.f23890v = shortcutInfo.isImmutable();
            cVar.f23891w = shortcutInfo.isEnabled();
            cVar.f23892x = shortcutInfo.hasKeyFieldsOnly();
            cVar.f23880l = c.h(shortcutInfo);
            cVar.f23882n = shortcutInfo.getRank();
            cVar.f23883o = shortcutInfo.getExtras();
        }
    }
}
