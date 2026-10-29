package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.t */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lku/t;", "Lku/i2;", "Lku/p;", "child", "<init>", "(Lku/p;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lku/p;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7921t extends AbstractC7875i2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C7905p<?> child;

    public C7921t(@NotNull C7905p<?> c7905p) {
        this.child = c7905p;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: w */
    public boolean mo32574w() {
        return true;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: x */
    public void mo32575x(@Nullable Throwable cause) {
        C7905p<?> c7905p = this.child;
        c7905p.m32866P(c7905p.mo32762y(m32687v()));
    }
}
