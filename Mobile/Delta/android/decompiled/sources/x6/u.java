package x6;

import android.view.View;
import kotlin.Metadata;
import ku.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lx6/u;", "Lx6/d;", "Landroid/view/View;", "view", "Lku/w0;", "Lx6/k;", "job", "<init>", "(Landroid/view/View;Lku/w0;)V", "", "a", "()V", "Landroid/view/View;", "b", "Lku/w0;", "()Lku/w0;", "d", "(Lku/w0;)V", "", "c", "()Z", "isDisposed", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile w0<? extends k> job;

    public u(@NotNull View view, @NotNull w0<? extends k> w0Var) {
        this.view = view;
        this.job = w0Var;
    }

    @Override // x6.d
    public void a() {
        if (c()) {
            return;
        }
        x.a(this.view).a();
    }

    @Override // x6.d
    @NotNull
    public w0<k> b() {
        return this.job;
    }

    public boolean c() {
        return x.a(this.view).c(this);
    }

    public void d(@NotNull w0<? extends k> w0Var) {
        this.job = w0Var;
    }
}
