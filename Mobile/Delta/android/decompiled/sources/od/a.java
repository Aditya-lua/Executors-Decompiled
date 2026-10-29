package od;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class a extends k9.b {
    public a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int c() {
        return super.b();
    }
}
