package sr;

import com.github.luben.zstd.BuildConfig;
import dv.c0;
import dv.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lsr/k;", BuildConfig.FLAVOR, "Lzp/o;", "initialValue", "<init>", "(Lzp/o;)V", "Ldv/c0;", "a", "Ldv/c0;", "_scanResult", "Ldv/h;", "b", "Ldv/h;", "()Ldv/h;", "onChanged", "value", "()Lzp/o;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<zp.o> _scanResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dv.h<zp.o> onChanged;

    public k(@Nullable zp.o oVar) {
        c0<zp.o> c0VarA = r0.a(oVar);
        this._scanResult = c0VarA;
        this.onChanged = dv.j.n(c0VarA, 1);
    }

    @NotNull
    public final dv.h<zp.o> a() {
        return this.onChanged;
    }

    @Nullable
    public final zp.o b() {
        return this._scanResult.getValue();
    }

    public final void c(@Nullable zp.o oVar) {
        this._scanResult.setValue(oVar);
    }
}
