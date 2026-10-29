package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;
import p395qu.C10711a0;

/* JADX INFO: renamed from: ku.f3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lku/f3;", "U", "T", "Lqu/a0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lnt/b;", "uCont", "<init>", "(JLnt/b;)V", "", "run", "()V", "", "y0", "()Ljava/lang/String;", "e", "J", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class RunnableC7861f3<U, T extends U> extends C10711a0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long time;

    public RunnableC7861f3(long j10, @NotNull InterfaceC9557b<? super U> interfaceC9557b) {
        super(interfaceC9557b.getContext(), interfaceC9557b);
        this.time = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        m32732S(C7866g3.m32658a(this.time, C7946z0.m32940d(getContext()), this));
    }

    @Override // p256ku.AbstractC7832a, p256ku.C7880j2
    @NotNull
    /* JADX INFO: renamed from: y0 */
    public String mo32558y0() {
        return super.mo32558y0() + "(timeMillis=" + this.time + ')';
    }
}
