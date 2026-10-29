package p100eb;

/* JADX INFO: renamed from: eb.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5041y2 {
    /* JADX INFO: renamed from: a */
    public static byte[] m23726a(byte[]... bArr) {
        int i10 = 0;
        int length = 0;
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            length += bArr[i10].length;
            i10++;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length2);
            i11 += length2;
        }
        return bArr2;
    }
}
