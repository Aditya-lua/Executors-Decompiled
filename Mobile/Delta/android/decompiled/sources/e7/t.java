package e7;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Le7/t;", "Le7/o;", "Le7/u;", "logger", "<init>", "(Le7/u;)V", "Ly6/g;", "size", "", "b", "(Ly6/g;)Z", "a", "()Z", "Le7/u;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final u logger;

    public t(@Nullable u uVar) {
        this.logger = uVar;
    }

    @Override // e7.o
    /* JADX INFO: renamed from: a */
    public boolean getAllowHardware() {
        return k.f15196a.b(this.logger);
    }

    @Override // e7.o
    public boolean b(@NotNull Size size) {
        y6.a aVarD = size.d();
        if ((aVarD instanceof y6.a.C0655a ? ((y6.a.C0655a) aVarD).getPx() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        y6.a aVarC = size.c();
        return (aVarC instanceof y6.a.C0655a ? ((y6.a.C0655a) aVarC).getPx() : Integer.MAX_VALUE) > 100;
    }
}
