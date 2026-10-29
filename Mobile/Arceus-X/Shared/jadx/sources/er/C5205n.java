package er;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: er.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0011\"\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m31665d2 = {"Ler/n;", "", "", "", "initialValue", "<init>", "(Ljava/util/Set;)V", "Lnu/c0;", "a", "Lnu/c0;", "_stringSetValue", "Lnu/h;", "b", "Lnu/h;", "()Lnu/h;", "onChanged", "value", "()Ljava/util/Set;", "c", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5205n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<Set<String>> _stringSetValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<Set<String>> onChanged;

    public C5205n(@NotNull Set<String> initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        InterfaceC9566c0<Set<String>> interfaceC9566c0M37859a = C9596r0.m37859a(initialValue);
        this._stringSetValue = interfaceC9566c0M37859a;
        this.onChanged = C9579j.m37797n(interfaceC9566c0M37859a, 1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC9575h<Set<String>> m24148a() {
        return this.onChanged;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Set<String> m24149b() {
        return this._stringSetValue.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m24150c(@NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._stringSetValue.setValue(value);
    }
}
