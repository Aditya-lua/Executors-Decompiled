package p025b5;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145g5.InterfaceC6009d;

/* JADX INFO: renamed from: b5.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lb5/m;", "Lg5/d$c;", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "delegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lg5/d$c;)V", "Lg5/d$b;", "configuration", "Lg5/d;", "a", "(Lg5/d$b;)Lg5/d;", "Ljava/lang/String;", "b", "Ljava/io/File;", "c", "Ljava/util/concurrent/Callable;", "d", "Lg5/d$c;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1235m implements InterfaceC6009d.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final File copyFromFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6009d.c delegate;

    public C1235m(@Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, @NotNull InterfaceC6009d.c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.delegate = delegate;
    }

    @Override // p145g5.InterfaceC6009d.c
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC6009d mo6926a(@NotNull InterfaceC6009d.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C1234l(configuration.context, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, configuration.callback.version, this.delegate.mo6926a(configuration));
    }
}
