package sr;

import com.github.luben.zstd.BuildConfig;
import dv.c0;
import dv.r0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0011\"\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lsr/o;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "initialValue", "<init>", "(Ljava/util/Set;)V", "Ldv/c0;", "a", "Ldv/c0;", "_stringSetValue", "Ldv/h;", "b", "Ldv/h;", "()Ldv/h;", "onChanged", "value", "()Ljava/util/Set;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Set<String>> _stringSetValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dv.h<Set<String>> onChanged;

    public o(@NotNull Set<String> initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        c0<Set<String>> c0VarA = r0.a(initialValue);
        this._stringSetValue = c0VarA;
        this.onChanged = dv.j.n(c0VarA, 1);
    }

    @NotNull
    public final dv.h<Set<String>> a() {
        return this.onChanged;
    }

    @NotNull
    public final Set<String> b() {
        return this._stringSetValue.getValue();
    }

    public final void c(@NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._stringSetValue.setValue(value);
    }
}
