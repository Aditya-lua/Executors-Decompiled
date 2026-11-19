package l9;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.a f21994a;

    public d(@NonNull w1.a aVar) {
        this.f21994a = aVar;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (m9.b bVar : this.f21994a.keySet()) {
            k9.b bVar2 = (k9.b) o9.s.l((k9.b) this.f21994a.get(bVar));
            z10 &= !bVar2.F3();
            arrayList.add(bVar.b() + ": " + String.valueOf(bVar2));
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
