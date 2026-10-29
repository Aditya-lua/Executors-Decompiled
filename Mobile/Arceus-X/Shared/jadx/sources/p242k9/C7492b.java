package p242k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: k9.b */
/* JADX INFO: loaded from: classes.dex */
public class C7492b extends Exception {

    /* JADX INFO: renamed from: a */
    @NonNull
    @Deprecated
    public final Status f28848a;

    public C7492b(@NonNull Status status) {
        int iM9166x3 = status.m9166x3();
        String strM9167y3 = status.m9167y3() != null ? status.m9167y3() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(iM9166x3).length() + 2 + String.valueOf(strM9167y3).length());
        sb2.append(iM9166x3);
        sb2.append(": ");
        sb2.append(strM9167y3);
        super(sb2.toString());
        this.f28848a = status;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Status m31130a() {
        return this.f28848a;
    }

    /* JADX INFO: renamed from: b */
    public int m31131b() {
        return this.f28848a.m9166x3();
    }
}
