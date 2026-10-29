package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class k<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f30588a = new n0();

    public k() {
    }

    @NonNull
    public Task<TResult> a() {
        return this.f30588a;
    }

    public void b(@NonNull Exception exc) {
        this.f30588a.p(exc);
    }

    public void c(TResult tresult) {
        this.f30588a.q(tresult);
    }

    public boolean d(@NonNull Exception exc) {
        return this.f30588a.s(exc);
    }

    public boolean e(TResult tresult) {
        return this.f30588a.t(tresult);
    }

    public k(@NonNull a aVar) {
        aVar.b(new j0(this));
    }
}
