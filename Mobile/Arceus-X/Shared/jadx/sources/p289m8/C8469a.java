package p289m8;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
import p569y7.EnumC13118e;

/* JADX INFO: renamed from: m8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8469a {

    /* JADX INFO: renamed from: a */
    public static SparseArray<EnumC13118e> f31180a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<EnumC13118e, Integer> f31181b;

    static {
        HashMap<EnumC13118e, Integer> map = new HashMap<>();
        f31181b = map;
        map.put(EnumC13118e.DEFAULT, 0);
        f31181b.put(EnumC13118e.VERY_LOW, 1);
        f31181b.put(EnumC13118e.HIGHEST, 2);
        for (EnumC13118e enumC13118e : f31181b.keySet()) {
            f31180a.append(f31181b.get(enumC13118e).intValue(), enumC13118e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m34255a(@NonNull EnumC13118e enumC13118e) {
        Integer num = f31181b.get(enumC13118e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC13118e);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static EnumC13118e m34256b(int i10) {
        EnumC13118e enumC13118e = f31180a.get(i10);
        if (enumC13118e != null) {
            return enumC13118e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
