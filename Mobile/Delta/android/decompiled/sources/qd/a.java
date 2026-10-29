package qd;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import od.b;
import od.d;
import od.e;
import sb.m;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public od.a f29307a;
    public e b;

    @Override // od.b
    @NonNull
    public Task<e> a(@NonNull d dVar) {
        od.a aVar = this.f29307a;
        if (aVar != null) {
            return m.e(aVar);
        }
        e eVar = this.b;
        return eVar != null ? m.f(eVar) : m.e(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    public void b(@NonNull e eVar) {
        this.f29307a = null;
        this.b = eVar;
    }
}
