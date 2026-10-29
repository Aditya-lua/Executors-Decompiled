package ae;

import com.google.android.gms.common.api.Status;
import p047ce.C1628a;
import p242k9.C7492b;

/* JADX INFO: renamed from: ae.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0149a extends C7492b {
    public C0149a(int i10) {
        super(new Status(i10, String.format("Split Install Error(%d): %s", Integer.valueOf(i10), C1628a.m8226b(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    /* JADX INFO: renamed from: c */
    public int m466c() {
        return super.m31131b();
    }
}
