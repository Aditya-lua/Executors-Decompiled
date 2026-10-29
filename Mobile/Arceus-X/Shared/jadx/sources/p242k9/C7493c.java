package p242k9;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import p268l9.C8021b;
import p305n9.C8953m;
import p504w1.C12277a;

/* JADX INFO: renamed from: k9.c */
/* JADX INFO: loaded from: classes.dex */
public class C7493c extends Exception {

    /* JADX INFO: renamed from: a */
    public final C12277a f28849a;

    public C7493c(@NonNull C12277a c12277a) {
        this.f28849a = c12277a;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C8021b c8021b : this.f28849a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C8953m.m36047l((ConnectionResult) this.f28849a.get(c8021b));
            z10 &= !connectionResult.m9138A3();
            arrayList.add(c8021b.m33116b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
