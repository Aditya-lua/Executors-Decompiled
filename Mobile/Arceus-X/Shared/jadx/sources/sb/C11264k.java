package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: sb.k */
/* JADX INFO: loaded from: classes.dex */
public class C11264k<TResult> {

    /* JADX INFO: renamed from: a */
    public final C11271n0 f39579a = new C11271n0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11264k() {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<TResult> m42326a() {
        return this.f39579a;
    }

    /* JADX INFO: renamed from: b */
    public void m42327b(@NonNull Exception exc) {
        this.f39579a.m42343p(exc);
    }

    /* JADX INFO: renamed from: c */
    public void m42328c(TResult tresult) {
        this.f39579a.m42344q(tresult);
    }

    /* JADX INFO: renamed from: d */
    public boolean m42329d(@NonNull Exception exc) {
        return this.f39579a.m42346s(exc);
    }

    /* JADX INFO: renamed from: e */
    public boolean m42330e(TResult tresult) {
        return this.f39579a.m42347t(tresult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11264k(@NonNull AbstractC11244a abstractC11244a) {
        abstractC11244a.mo42309b(new C11263j0(this));
    }
}
