package h5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh5/i;", "Lg5/d$c;", "<init>", "()V", "Lg5/d$b;", "configuration", "Lg5/d;", "a", "(Lg5/d$b;)Lg5/d;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements g5.d.c {
    @Override // g5.d.c
    @NotNull
    public g5.d a(@NotNull g5.d.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new g(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
