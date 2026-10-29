package k9;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.a f22270a;

    public c(@NonNull w1.a aVar) {
        this.f22270a = aVar;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (l9.b bVar : this.f22270a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) n9.m.l((ConnectionResult) this.f22270a.get(bVar));
            z10 &= !connectionResult.A3();
            arrayList.add(bVar.b() + ": " + String.valueOf(connectionResult));
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
