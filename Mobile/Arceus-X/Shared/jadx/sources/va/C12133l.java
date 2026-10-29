package va;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import p504w1.C12277a;

/* JADX INFO: renamed from: va.l */
/* JADX INFO: loaded from: classes.dex */
public final class C12133l {

    /* JADX INFO: renamed from: b */
    public static final Map f42750b = new C12277a();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f42751a;

    /* JADX INFO: renamed from: a */
    public static synchronized void m44962a() {
        Map map = f42750b;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = ((C12133l) it.next()).f42751a;
            throw null;
        }
        map.clear();
    }
}
