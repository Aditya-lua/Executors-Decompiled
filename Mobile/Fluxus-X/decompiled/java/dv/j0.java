package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ldv/j0;", "Lev/d;", "Ldv/h0;", "<init>", "()V", "flow", BuildConfig.FLAVOR, "c", "(Ldv/h0;)Z", BuildConfig.FLAVOR, "Leu/b;", BuildConfig.FLAVOR, "d", "(Ldv/h0;)[Leu/b;", BuildConfig.FLAVOR, "a", "J", "index", "b", "Leu/b;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends kotlin.d<h0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long index = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public eu.b<? super Unit> cont;

    @Override // kotlin.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull h0<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.X();
        return true;
    }

    @Override // kotlin.d
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public eu.b<Unit>[] b(@NotNull h0<?> flow) {
        long j10 = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.W(j10);
    }
}
