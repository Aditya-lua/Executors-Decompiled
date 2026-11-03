package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class k<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f31135a = new n0();

    public k() {
    }

    @NonNull
    public Task<TResult> a() {
        return this.f31135a;
    }

    public void b(@NonNull Exception exc) {
        this.f31135a.p(exc);
    }

    public void c(TResult tresult) {
        this.f31135a.q(tresult);
    }

    public boolean d(@NonNull Exception exc) {
        return this.f31135a.s(exc);
    }

    public boolean e(TResult tresult) {
        return this.f31135a.t(tresult);
    }

    public k(@NonNull a aVar) {
        aVar.b(new j0(this));
    }
}
