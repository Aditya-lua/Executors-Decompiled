package ae;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ae.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0156c0 {

    /* JADX INFO: renamed from: a */
    public final Context f526a;

    public C0156c0(@NonNull Context context) {
        this.f526a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Set m490a() {
        Set<String> hashSet;
        synchronized (C0156c0.class) {
            try {
                hashSet = m494e().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m491b() {
        synchronized (C0156c0.class) {
            m494e().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m492c(Collection collection) {
        synchronized (C0156c0.class) {
            HashSet hashSet = new HashSet(m490a());
            Iterator it = collection.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add((String) it.next());
            }
            if (zAdd) {
                try {
                    m494e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m493d(Collection collection) {
        synchronized (C0156c0.class) {
            Set<String> setM490a = m490a();
            HashSet hashSet = new HashSet();
            boolean z10 = false;
            for (String str : setM490a) {
                if (collection.contains(str)) {
                    z10 = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z10) {
                try {
                    m494e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final SharedPreferences m494e() {
        return this.f526a.getSharedPreferences("playcore_split_install_internal", 0);
    }
}
