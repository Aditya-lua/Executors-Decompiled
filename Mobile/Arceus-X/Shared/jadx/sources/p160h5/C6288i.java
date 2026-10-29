package p160h5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145g5.InterfaceC6009d;

/* JADX INFO: renamed from: h5.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lh5/i;", "Lg5/d$c;", "<init>", "()V", "Lg5/d$b;", "configuration", "Lg5/d;", "a", "(Lg5/d$b;)Lg5/d;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6288i implements InterfaceC6009d.c {
    @Override // p145g5.InterfaceC6009d.c
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC6009d mo6926a(@NotNull InterfaceC6009d.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C6286g(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
