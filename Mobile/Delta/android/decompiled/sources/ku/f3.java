package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lku/f3;", "U", "T", "Lqu/a0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lnt/b;", "uCont", "<init>", "(JLnt/b;)V", "", "run", "()V", "", "y0", "()Ljava/lang/String;", "e", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f3<U, T extends U> extends qu.a0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long time;

    public f3(long j10, @NotNull nt.b<? super U> bVar) {
        super(bVar.getContext(), bVar);
        this.time = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        S(g3.a(this.time, z0.d(getContext()), this));
    }

    @Override // ku.a, ku.j2
    @NotNull
    public String y0() {
        return super.y0() + "(timeMillis=" + this.time + ')';
    }
}
