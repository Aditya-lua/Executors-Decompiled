package p074db;

/* JADX INFO: renamed from: db.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4536r {
    /* JADX INFO: renamed from: a */
    public static Object m22507a(Class cls, String str, C4535q... c4535qArr) {
        return m22508b(cls, "isIsolated", null, false, c4535qArr);
    }

    /* JADX INFO: renamed from: b */
    public static Object m22508b(Class cls, String str, Object obj, boolean z10, C4535q... c4535qArr) {
        int length = c4535qArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Object obj2 = null;
        if (c4535qArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
        }
        C4535q c4535q = c4535qArr[0];
        obj2.getClass();
        throw null;
    }
}
