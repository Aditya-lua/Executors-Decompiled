package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0002\u00101¨\u00062"}, d2 = {"Lew/l;", "Lew/k;", "delegate", "<init>", "(Lew/k;)V", "Lew/b0;", "path", BuildConfig.FLAVOR, "functionName", "parameterName", "y", "(Lew/b0;Ljava/lang/String;Ljava/lang/String;)Lew/b0;", "z", "(Lew/b0;Ljava/lang/String;)Lew/b0;", "Lew/j;", "p", "(Lew/b0;)Lew/j;", "dir", BuildConfig.FLAVOR, "n", "(Lew/b0;)Ljava/util/List;", "file", "Lew/i;", "r", "(Lew/b0;)Lew/i;", "Lew/l0;", "w", "(Lew/b0;)Lew/l0;", BuildConfig.FLAVOR, "mustCreate", "Lew/j0;", "u", "(Lew/b0;Z)Lew/j0;", "mustExist", "b", BuildConfig.FLAVOR, "f", "(Lew/b0;Z)V", Payload.SOURCE, "target", "c", "(Lew/b0;Lew/b0;)V", "k", "close", "()V", "toString", "()Ljava/lang/String;", "e", "Lew/k;", "()Lew/k;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k delegate;

    public l(@NotNull k delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // ew.k
    @NotNull
    public j0 b(@NotNull b0 file, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.b(y(file, "appendingSink", "file"), mustExist);
    }

    @Override // ew.k
    public void c(@NotNull b0 source, @NotNull b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.c(y(source, "atomicMove", Payload.SOURCE), y(target, "atomicMove", "target"));
    }

    @Override // ew.k, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // ew.k
    public void f(@NotNull b0 dir, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.delegate.f(y(dir, "createDirectory", "dir"), mustCreate);
    }

    @Override // ew.k
    public void k(@NotNull b0 path, boolean mustExist) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.delegate.k(y(path, "delete", "path"), mustExist);
    }

    @Override // ew.k
    @NotNull
    public List<b0> n(@NotNull b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<b0> listN = this.delegate.n(y(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(z((b0) it.next(), "list"));
        }
        p001kotlin.collections.t.x(arrayList);
        return arrayList;
    }

    @Override // ew.k
    @Nullable
    public j p(@NotNull b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        j jVarP = this.delegate.p(y(path, "metadataOrNull", "path"));
        if (jVarP == null) {
            return null;
        }
        return jVarP.getSymlinkTarget() == null ? jVarP : j.b(jVarP, false, false, z(jVarP.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // ew.k
    @NotNull
    public i r(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.r(y(file, "openReadOnly", "file"));
    }

    @NotNull
    public String toString() {
        return p001kotlin.jvm.internal.d0.b(getClass()).h() + '(' + this.delegate + ')';
    }

    @Override // ew.k
    @NotNull
    public j0 u(@NotNull b0 file, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.u(y(file, "sink", "file"), mustCreate);
    }

    @Override // ew.k
    @NotNull
    public l0 w(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.w(y(file, Payload.SOURCE, "file"));
    }

    @NotNull
    public b0 y(@NotNull b0 path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    @NotNull
    public b0 z(@NotNull b0 path, @NotNull String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }
}
