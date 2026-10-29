package va;

import android.content.ContentResolver;
import java.util.Iterator;
import java.util.Map;
import p504w1.C12277a;

/* JADX INFO: renamed from: va.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12123g {

    /* JADX INFO: renamed from: b */
    public static final Map f42736b = new C12277a();

    /* JADX INFO: renamed from: c */
    public static final String[] f42737c = {"key", "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f42738a;

    /* JADX INFO: renamed from: a */
    public static synchronized void m44960a() {
        Map map = f42736b;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            ContentResolver contentResolver = ((C12123g) it.next()).f42738a;
            throw null;
        }
        map.clear();
    }
}
