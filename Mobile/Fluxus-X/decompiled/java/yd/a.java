package yd;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class a extends l9.b {
    public a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), ae.a.a(i10))));
    }

    public int c() {
        return super.b();
    }
}
