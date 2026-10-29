package hn;

import kotlin.Metadata;

/* JADX INFO: renamed from: hn.e0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "", "b", "(I)Ljava/lang/String;", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6439e0 {
    /* JADX INFO: renamed from: b */
    public static final String m28076b(int i10) {
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
