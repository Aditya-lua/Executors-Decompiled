package zd;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class a extends k9.b {
    public a(int i10) {
        super(new Status(i10, String.format("Split Install Error(%d): %s", Integer.valueOf(i10), be.a.b(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int c() {
        return super.b();
    }
}
