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
    public Context f24520a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent[] f24522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComponentName f24523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f24524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f24525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f24526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f24527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r[] f24528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<String> f24529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l2.d f24530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PersistableBundle f24533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f24534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UserHandle f24535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f24538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24541w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24544z;

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
        if (this.f24533o == null) {
            this.f24533o = new PersistableBundle();
        }
        r[] rVarArr = this.f24528j;
        if (rVarArr != null && rVarArr.length > 0) {
            this.f24533o.putInt("extraPersonCount", rVarArr.length);
            int i10 = 0;
            while (i10 < this.f24528j.length) {
                PersistableBundle persistableBundle = this.f24533o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f24528j[i10].k());
                i10 = i11;
            }
        }
        l2.d dVar = this.f24530l;
        if (dVar != null) {
            this.f24533o.putString("extraLocusId", dVar.a());
        }
        this.f24533o.putBoolean("extraLongLived", this.f24531m);
        return this.f24533o;
    }

    public Set<String> c() {
        return this.f24529k;
    }

    public PersistableBundle d() {
        return this.f24533o;
    }

    public IconCompat e() {
        return this.f24527i;
    }

    public String f() {
        return this.b;
    }

    public Intent g() {
        Intent[] intentArr = this.f24522d;
        return intentArr[intentArr.length - 1];
    }

    public CharSequence j() {
        return this.f24525g;
    }

    public int l() {
        return this.f24532n;
    }

    public CharSequence m() {
        return this.f24524f;
    }

    public boolean n(int i10) {
        return (i10 & this.f24544z) != 0;
    }

    public ShortcutInfo o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f24520a, this.b).setShortLabel(this.f24524f).setIntents(this.f24522d);
        IconCompat iconCompat = this.f24527i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.p(this.f24520a));
        }
        if (!TextUtils.isEmpty(this.f24525g)) {
            intents.setLongLabel(this.f24525g);
        }
        if (!TextUtils.isEmpty(this.f24526h)) {
            intents.setDisabledMessage(this.f24526h);
        }
        ComponentName componentName = this.f24523e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f24529k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f24532n);
        PersistableBundle persistableBundle = this.f24533o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r[] rVarArr = this.f24528j;
            if (rVarArr != null && rVarArr.length > 0) {
                int length = rVarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f24528j[i10].i();
                }
                intents.setPersons(personArr);
            }
            l2.d dVar = this.f24530l;
            if (dVar != null) {
                intents.setLocusId(dVar.c());
            }
            intents.setLongLived(this.f24531m);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.f24544z);
        }
        return intents.build();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f24545a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<String> f24546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, Map<String, List<String>>> f24547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Uri f24548e;

        public b(Context context, String str) {
            c cVar = new c();
            this.f24545a = cVar;
            cVar.f24520a = context;
            cVar.b = str;
        }

        public c a() {
            if (TextUtils.isEmpty(this.f24545a.f24524f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            c cVar = this.f24545a;
            Intent[] intentArr = cVar.f24522d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.b) {
                if (cVar.f24530l == null) {
                    cVar.f24530l = new l2.d(cVar.b);
                }
                this.f24545a.f24531m = true;
            }
            if (this.f24546c != null) {
                c cVar2 = this.f24545a;
                if (cVar2.f24529k == null) {
                    cVar2.f24529k = new HashSet();
                }
                this.f24545a.f24529k.addAll(this.f24546c);
            }
            if (this.f24547d != null) {
                c cVar3 = this.f24545a;
                if (cVar3.f24533o == null) {
                    cVar3.f24533o = new PersistableBundle();
                }
                for (String str : this.f24547d.keySet()) {
                    Map<String, List<String>> map = this.f24547d.get(str);
                    this.f24545a.f24533o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f24545a.f24533o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f24548e != null) {
                c cVar4 = this.f24545a;
                if (cVar4.f24533o == null) {
                    cVar4.f24533o = new PersistableBundle();
                }
                this.f24545a.f24533o.putString("extraSliceUri", t2.b.a(this.f24548e));
            }
            return this.f24545a;
        }

        public b b(ComponentName componentName) {
            this.f24545a.f24523e = componentName;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f24545a.f24527i = iconCompat;
            return this;
        }

        public b d(Intent intent) {
            return e(new Intent[]{intent});
        }

        public b e(Intent[] intentArr) {
            this.f24545a.f24522d = intentArr;
            return this;
        }

        public b f(boolean z10) {
            this.f24545a.f24531m = z10;
            return this;
        }

        public b g(int i10) {
            this.f24545a.f24532n = i10;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f24545a.f24524f = charSequence;
            return this;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            c cVar = new c();
            this.f24545a = cVar;
            cVar.f24520a = context;
            cVar.b = shortcutInfo.getId();
            cVar.f24521c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            cVar.f24522d = (Intent[]) Arrays.copyOf(intents, intents.length);
            cVar.f24523e = shortcutInfo.getActivity();
            cVar.f24524f = shortcutInfo.getShortLabel();
            cVar.f24525g = shortcutInfo.getLongLabel();
            cVar.f24526h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                cVar.f24543y = shortcutInfo.getDisabledReason();
            } else {
                cVar.f24543y = shortcutInfo.isEnabled() ? 0 : 3;
            }
            cVar.f24529k = shortcutInfo.getCategories();
            cVar.f24528j = c.k(shortcutInfo.getExtras());
            cVar.f24535q = shortcutInfo.getUserHandle();
            cVar.f24534p = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                cVar.f24536r = shortcutInfo.isCached();
            }
            cVar.f24537s = shortcutInfo.isDynamic();
            cVar.f24538t = shortcutInfo.isPinned();
            cVar.f24539u = shortcutInfo.isDeclaredInManifest();
            cVar.f24540v = shortcutInfo.isImmutable();
            cVar.f24541w = shortcutInfo.isEnabled();
            cVar.f24542x = shortcutInfo.hasKeyFieldsOnly();
            cVar.f24530l = c.h(shortcutInfo);
            cVar.f24532n = shortcutInfo.getRank();
            cVar.f24533o = shortcutInfo.getExtras();
        }
    }
}
