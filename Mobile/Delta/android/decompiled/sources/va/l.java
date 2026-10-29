package va;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final Map b = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f32896a;

    public static synchronized void a() {
        Map map = b;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = ((l) it.next()).f32896a;
            throw null;
        }
        map.clear();
    }
}
