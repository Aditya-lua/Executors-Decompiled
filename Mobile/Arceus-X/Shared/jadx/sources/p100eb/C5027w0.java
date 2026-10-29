package p100eb;

/* JADX INFO: renamed from: eb.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5027w0 {
    /* JADX INFO: renamed from: a */
    public static void m23713a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
