package fb;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16533a;

    public h(m mVar) {
        this.f16533a = mVar;
    }

    public static h a(Application application) {
        return new h(o.a(application));
    }

    public final Task b(final g gVar) {
        Objects.requireNonNull(gVar);
        return this.f16533a.a(new l() { // from class: fb.f
            @Override // fb.l
            public final /* synthetic */ Task a(k9.e eVar) {
                return gVar.a(eVar);
            }
        });
    }
}
