package p169he;

import java.util.Arrays;

/* JADX INFO: renamed from: he.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C6380j extends AbstractC6375e {
    /* JADX INFO: renamed from: a */
    public static boolean m27910a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m27911b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
