package va;

import android.content.ContentResolver;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Map b = new w1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f32885c = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f32886a;

    public static synchronized void a() {
        Map map = b;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            ContentResolver contentResolver = ((g) it.next()).f32886a;
            throw null;
        }
        map.clear();
    }
}
