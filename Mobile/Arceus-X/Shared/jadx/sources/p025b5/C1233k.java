package p025b5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145g5.InterfaceC6009d;

/* JADX INFO: renamed from: b5.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lb5/k;", "Lg5/d$c;", "delegate", "Lb5/b;", "autoCloser", "<init>", "(Lg5/d$c;Lb5/b;)V", "Lg5/d$b;", "configuration", "Lb5/g;", "b", "(Lg5/d$b;)Lb5/g;", "a", "Lg5/d$c;", "Lb5/b;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1233k implements InterfaceC6009d.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6009d.c delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1224b autoCloser;

    public C1233k(@NotNull InterfaceC6009d.c delegate, @NotNull C1224b autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Lg5/d$b;)Lg5/d; */
    @Override // p145g5.InterfaceC6009d.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1229g mo6926a(@NotNull InterfaceC6009d.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C1229g(this.delegate.mo6926a(configuration), this.autoCloser);
    }
}
