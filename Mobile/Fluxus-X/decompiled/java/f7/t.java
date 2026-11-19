package f7;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import z6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lf7/t;", "Lf7/o;", "Lf7/u;", "logger", "<init>", "(Lf7/u;)V", "Lz6/g;", "size", BuildConfig.FLAVOR, "a", "(Lz6/g;)Z", "b", "()Z", "Lf7/u;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final u logger;

    public t(@Nullable u uVar) {
        this.logger = uVar;
    }

    @Override // f7.o
    public boolean a(@NotNull Size size) {
        z6.a aVarD = size.d();
        if ((aVarD instanceof z6.a.C0785a ? ((z6.a.C0785a) aVarD).getPx() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        z6.a aVarC = size.c();
        return (aVarC instanceof z6.a.C0785a ? ((z6.a.C0785a) aVarC).getPx() : Integer.MAX_VALUE) > 100;
    }

    @Override // f7.o
    /* JADX INFO: renamed from: b */
    public boolean getAllowHardware() {
        return k.f15650a.b(this.logger);
    }
}
