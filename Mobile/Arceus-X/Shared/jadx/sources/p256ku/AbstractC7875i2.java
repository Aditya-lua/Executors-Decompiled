package p256ku;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10740p;

/* JADX INFO: renamed from: ku.i2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001e¨\u0006 "}, m31665d2 = {"Lku/i2;", "Lqu/p;", "Lku/i1;", "Lku/y1;", "<init>", "()V", "", "a", "", "toString", "()Ljava/lang/String;", "", "cause", "x", "(Ljava/lang/Throwable;)V", "Lku/j2;", "d", "Lku/j2;", "v", "()Lku/j2;", "y", "(Lku/j2;)V", "job", "", "w", "()Z", "onCancelling", "b", "isActive", "Lku/o2;", "()Lku/o2;", "list", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7875i2 extends C10740p implements InterfaceC7874i1, InterfaceC7943y1 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C7880j2 job;

    @Override // p256ku.InterfaceC7874i1
    /* JADX INFO: renamed from: a */
    public void mo32664a() {
        m32687v().m32719H0(this);
    }

    @Override // p256ku.InterfaceC7943y1
    /* JADX INFO: renamed from: b */
    public boolean getIsActive() {
        return true;
    }

    @Override // p256ku.InterfaceC7943y1
    @Nullable
    /* JADX INFO: renamed from: d */
    public C7904o2 getList() {
        return null;
    }

    @Override // p395qu.C10740p
    @NotNull
    public String toString() {
        return C7922t0.m32908a(this) + '@' + C7922t0.m32909b(this) + "[job@" + C7922t0.m32909b(m32687v()) + ']';
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final C7880j2 m32687v() {
        C7880j2 c7880j2 = this.job;
        if (c7880j2 != null) {
            return c7880j2;
        }
        Intrinsics.m31998u("job");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo32574w();

    /* JADX INFO: renamed from: x */
    public abstract void mo32575x(@Nullable Throwable cause);

    /* JADX INFO: renamed from: y */
    public final void m32688y(@NotNull C7880j2 c7880j2) {
        this.job = c7880j2;
    }
}
