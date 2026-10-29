package fn;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "width", "height", "a", "(II)I", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w0 {
    public static final int a(int i10, int i11) {
        int i12 = i10 * i11;
        if (i12 <= 172800) {
            return 400000;
        }
        if (i12 <= 409920) {
            return 600000;
        }
        if (i12 <= 921600) {
            return 1000000;
        }
        return i12 <= 2073600 ? 1500000 : 1800000;
    }
}
