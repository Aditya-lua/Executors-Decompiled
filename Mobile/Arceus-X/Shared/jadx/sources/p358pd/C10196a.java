package p358pd;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p242k9.C7492b;

/* JADX INFO: renamed from: pd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10196a extends C7492b {
    public C10196a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    /* JADX INFO: renamed from: c */
    public int m39271c() {
        return super.m31131b();
    }
}
