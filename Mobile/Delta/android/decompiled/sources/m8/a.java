package m8;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
import y7.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<e> f24040a = new SparseArray<>();
    public static HashMap<e, Integer> b;

    static {
        HashMap<e, Integer> map = new HashMap<>();
        b = map;
        map.put(e.DEFAULT, 0);
        b.put(e.VERY_LOW, 1);
        b.put(e.HIGHEST, 2);
        for (e eVar : b.keySet()) {
            f24040a.append(b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(@NonNull e eVar) {
        Integer num = b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    @NonNull
    public static e b(int i10) {
        e eVar = f24040a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
