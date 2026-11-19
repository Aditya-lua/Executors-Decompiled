package td;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import rd.b;
import rd.d;
import rd.e;
import tb.m;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rd.a f32332a;
    public e b;

    @Override // rd.b
    @NonNull
    public Task<e> a(@NonNull d dVar) {
        rd.a aVar = this.f32332a;
        if (aVar != null) {
            return m.e(aVar);
        }
        e eVar = this.b;
        return eVar != null ? m.f(eVar) : m.e(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    public void b(@NonNull e eVar) {
        this.f32332a = null;
        this.b = eVar;
    }
}
