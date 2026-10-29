package hn;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "b", "(I)Ljava/lang/String;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e0 {
    public static final String b(int i10) {
        if (i10 == 1) {
            return "Camera in use";
        }
        if (i10 == 2) {
            return "Maximum cameras in use";
        }
        if (i10 == 3) {
            return "Device policy";
        }
        if (i10 != 4) {
            return i10 != 5 ? "Unknown" : "Fatal (service)";
        }
        return "Fatal (device)";
    }
}
