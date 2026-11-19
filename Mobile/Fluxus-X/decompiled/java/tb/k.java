package tb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class k<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f32296a = new n0();

    public k() {
    }

    @NonNull
    public Task<TResult> a() {
        return this.f32296a;
    }

    public void b(@NonNull Exception exc) {
        this.f32296a.p(exc);
    }

    public void c(TResult tresult) {
        this.f32296a.q(tresult);
    }

    public boolean d(@NonNull Exception exc) {
        return this.f32296a.s(exc);
    }

    public boolean e(TResult tresult) {
        return this.f32296a.t(tresult);
    }

    public k(@NonNull a aVar) {
        aVar.b(new j0(this));
    }
}
