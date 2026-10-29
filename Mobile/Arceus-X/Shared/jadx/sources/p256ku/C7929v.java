package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lku/v;", "Lku/i2;", "Lku/u;", "Lku/w;", "childJob", "<init>", "(Lku/w;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "", "c", "(Ljava/lang/Throwable;)Z", "e", "Lku/w;", "Lku/d2;", "getParent", "()Lku/d2;", "parent", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7929v extends AbstractC7875i2 implements InterfaceC7925u {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7933w childJob;

    public C7929v(@NotNull InterfaceC7933w interfaceC7933w) {
        this.childJob = interfaceC7933w;
    }

    @Override // p256ku.InterfaceC7925u
    /* JADX INFO: renamed from: c */
    public boolean mo32898c(@NotNull Throwable cause) {
        return m32687v().mo32738Y(cause);
    }

    @Override // p256ku.InterfaceC7925u
    @NotNull
    public InterfaceC7850d2 getParent() {
        return m32687v();
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: w */
    public boolean mo32574w() {
        return true;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: x */
    public void mo32575x(@Nullable Throwable cause) {
        this.childJob.mo32747j(m32687v());
    }
}
