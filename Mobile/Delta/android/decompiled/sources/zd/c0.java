package zd;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37456a;

    public c0(@NonNull Context context) {
        this.f37456a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (c0.class) {
            try {
                hashSet = e().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void b() {
        synchronized (c0.class) {
            e().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final void c(Collection collection) {
        synchronized (c0.class) {
            HashSet hashSet = new HashSet(a());
            Iterator it = collection.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add((String) it.next());
            }
            if (zAdd) {
                try {
                    e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void d(Collection collection) {
        synchronized (c0.class) {
            Set<String> setA = a();
            HashSet hashSet = new HashSet();
            boolean z10 = false;
            for (String str : setA) {
                if (collection.contains(str)) {
                    z10 = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z10) {
                try {
                    e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final SharedPreferences e() {
        return this.f37456a.getSharedPreferences("playcore_split_install_internal", 0);
    }
}
