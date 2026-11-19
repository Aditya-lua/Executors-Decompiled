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
    public Context f22880a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent[] f22882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComponentName f22883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f22884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f22885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f22886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f22887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r[] f22888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<String> f22889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l2.d f22890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PersistableBundle f22893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f22894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UserHandle f22895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22899u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22901w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22903y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f22904z;

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
        if (this.f22893o == null) {
            this.f22893o = new PersistableBundle();
        }
        r[] rVarArr = this.f22888j;
        if (rVarArr != null && rVarArr.length > 0) {
            this.f22893o.putInt("extraPersonCount", rVarArr.length);
            int i10 = 0;
            while (i10 < this.f22888j.length) {
                PersistableBundle persistableBundle = this.f22893o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f22888j[i10].k());
                i10 = i11;
            }
        }
        l2.d dVar = this.f22890l;
        if (dVar != null) {
            this.f22893o.putString("extraLocusId", dVar.a());
        }
        this.f22893o.putBoolean("extraLongLived", this.f22891m);
        return this.f22893o;
    }

    public Set<String> c() {
        return this.f22889k;
    }

    public PersistableBundle d() {
        return this.f22893o;
    }

    public IconCompat e() {
        return this.f22887i;
    }

    public String f() {
        return this.b;
    }

    public Intent g() {
        Intent[] intentArr = this.f22882d;
        return intentArr[intentArr.length - 1];
    }

    public CharSequence j() {
        return this.f22885g;
    }

    public int l() {
        return this.f22892n;
    }

    public CharSequence m() {
        return this.f22884f;
    }

    public boolean n(int i10) {
        return (i10 & this.f22904z) != 0;
    }

    public ShortcutInfo o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f22880a, this.b).setShortLabel(this.f22884f).setIntents(this.f22882d);
        IconCompat iconCompat = this.f22887i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.p(this.f22880a));
        }
        if (!TextUtils.isEmpty(this.f22885g)) {
            intents.setLongLabel(this.f22885g);
        }
        if (!TextUtils.isEmpty(this.f22886h)) {
            intents.setDisabledMessage(this.f22886h);
        }
        ComponentName componentName = this.f22883e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f22889k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f22892n);
        PersistableBundle persistableBundle = this.f22893o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r[] rVarArr = this.f22888j;
            if (rVarArr != null && rVarArr.length > 0) {
                int length = rVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f22888j[i10].i();
                }
                intents.setPersons(personArr);
            }
            l2.d dVar = this.f22890l;
            if (dVar != null) {
                intents.setLocusId(dVar.c());
            }
            intents.setLongLived(this.f22891m);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.f22904z);
        }
        return intents.build();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f22905a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<String> f22906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, Map<String, List<String>>> f22907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Uri f22908e;

        public b(Context context, String str) {
            c cVar = new c();
            this.f22905a = cVar;
            cVar.f22880a = context;
            cVar.b = str;
        }

        public c a() {
            if (TextUtils.isEmpty(this.f22905a.f22884f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            c cVar = this.f22905a;
            Intent[] intentArr = cVar.f22882d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.b) {
                if (cVar.f22890l == null) {
                    cVar.f22890l = new l2.d(cVar.b);
                }
                this.f22905a.f22891m = true;
            }
            if (this.f22906c != null) {
                c cVar2 = this.f22905a;
                if (cVar2.f22889k == null) {
                    cVar2.f22889k = new HashSet();
                }
                this.f22905a.f22889k.addAll(this.f22906c);
            }
            if (this.f22907d != null) {
                c cVar3 = this.f22905a;
                if (cVar3.f22893o == null) {
                    cVar3.f22893o = new PersistableBundle();
                }
                for (String str : this.f22907d.keySet()) {
                    Map<String, List<String>> map = this.f22907d.get(str);
                    this.f22905a.f22893o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f22905a.f22893o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f22908e != null) {
                c cVar4 = this.f22905a;
                if (cVar4.f22893o == null) {
                    cVar4.f22893o = new PersistableBundle();
                }
                this.f22905a.f22893o.putString("extraSliceUri", t2.b.a(this.f22908e));
            }
            return this.f22905a;
        }

        public b b(ComponentName componentName) {
            this.f22905a.f22883e = componentName;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f22905a.f22887i = iconCompat;
            return this;
        }

        public b d(Intent intent) {
            return e(new Intent[]{intent});
        }

        public b e(Intent[] intentArr) {
            this.f22905a.f22882d = intentArr;
            return this;
        }

        public b f(boolean z10) {
            this.f22905a.f22891m = z10;
            return this;
        }

        public b g(int i10) {
            this.f22905a.f22892n = i10;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f22905a.f22884f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            c cVar = new c();
            this.f22905a = cVar;
            cVar.f22880a = context;
            cVar.b = shortcutInfo.getId();
            cVar.f22881c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            cVar.f22882d = (Intent[]) Arrays.copyOf(intents, intents.length);
            cVar.f22883e = shortcutInfo.getActivity();
            cVar.f22884f = shortcutInfo.getShortLabel();
            cVar.f22885g = shortcutInfo.getLongLabel();
            cVar.f22886h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                cVar.f22903y = shortcutInfo.getDisabledReason();
            } else {
                cVar.f22903y = shortcutInfo.isEnabled() ? 0 : 3;
            }
            cVar.f22889k = shortcutInfo.getCategories();
            cVar.f22888j = c.k(shortcutInfo.getExtras());
            cVar.f22895q = shortcutInfo.getUserHandle();
            cVar.f22894p = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                cVar.f22896r = shortcutInfo.isCached();
            }
            cVar.f22897s = shortcutInfo.isDynamic();
            cVar.f22898t = shortcutInfo.isPinned();
            cVar.f22899u = shortcutInfo.isDeclaredInManifest();
            cVar.f22900v = shortcutInfo.isImmutable();
            cVar.f22901w = shortcutInfo.isEnabled();
            cVar.f22902x = shortcutInfo.hasKeyFieldsOnly();
            cVar.f22890l = c.h(shortcutInfo);
            cVar.f22892n = shortcutInfo.getRank();
            cVar.f22893o = shortcutInfo.getExtras();
        }
    }
}
