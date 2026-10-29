package hm;

/* JADX INFO: renamed from: hm.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6427c {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m28033a(Object[] objArr, Class cls, String str) {
        String[] strArrSplit = str.length() == 0 ? new String[0] : str.split(";");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            sb2.append(strArrSplit[i10]);
            sb2.append("=");
            sb2.append(objArr[i10]);
            if (i10 != strArrSplit.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
