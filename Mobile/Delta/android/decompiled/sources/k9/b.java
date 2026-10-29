package k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public final Status f22269a;

    public b(@NonNull Status status) {
        int iX3 = status.x3();
        String strY3 = status.y3() != null ? status.y3() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(iX3).length() + 2 + String.valueOf(strY3).length());
        sb2.append(iX3);
        sb2.append(": ");
        sb2.append(strY3);
        super(sb2.toString());
        this.f22269a = status;
    }

    @NonNull
    public Status a() {
        return this.f22269a;
    }

    public int b() {
        return this.f22269a.x3();
    }
}
