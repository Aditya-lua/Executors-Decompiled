package vq;

import an.ViewEnvironmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvq/b;", "Lan/z;", "Lvq/a;", "<init>", "()V", "b", "()Lvq/a;", "default", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends ViewEnvironmentKey<a> {

    @NotNull
    public static final b b = new b();

    public b() {
        super(d0.b(a.class));
    }

    @Override // an.ViewEnvironmentKey
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a() {
        throw new IllegalStateException("Unset");
    }
}
