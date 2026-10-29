package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7707t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.C6988p;

/* JADX INFO: renamed from: xu.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010*J\u001f\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010.J\u001f\u00103\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020,H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00108\u001a\u0004\b\u0002\u00109¨\u0006:"}, m31665d2 = {"Lxu/n;", "Lxu/l;", "delegate", "<init>", "(Lxu/l;)V", "Lxu/h0;", "path", "", "functionName", "parameterName", "onPathParameter", "(Lxu/h0;Ljava/lang/String;Ljava/lang/String;)Lxu/h0;", "onPathResult", "(Lxu/h0;Ljava/lang/String;)Lxu/h0;", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "dir", "", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lxu/h0;Z)Lkotlin/sequences/Sequence;", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "close", "()V", "toString", "()Ljava/lang/String;", "Lxu/l;", "()Lxu/l;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC12942n extends AbstractC12938l {

    @NotNull
    private final AbstractC12938l delegate;

    public AbstractC12942n(@NotNull AbstractC12938l delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C12931h0 listRecursively$lambda$0(AbstractC12942n abstractC12942n, C12931h0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractC12942n.onPathResult(it, "listRecursively");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 appendingSink(@NotNull C12931h0 file, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), mustExist);
    }

    @Override // p560xu.AbstractC12938l
    public void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", Payload.SOURCE), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public C12931h0 canonicalize(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // p560xu.AbstractC12938l, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // p560xu.AbstractC12938l
    public void createDirectory(@NotNull C12931h0 dir, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), mustCreate);
    }

    @Override // p560xu.AbstractC12938l
    public void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", Payload.SOURCE), onPathParameter(target, "createSymlink", "target"));
    }

    @NotNull
    /* JADX INFO: renamed from: delegate, reason: from getter */
    public final AbstractC12938l getDelegate() {
        return this.delegate;
    }

    @Override // p560xu.AbstractC12938l
    public void delete(@NotNull C12931h0 path, boolean mustExist) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), mustExist);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public List<C12931h0> list(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<C12931h0> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((C12931h0) it.next(), "list"));
        }
        C7707t.m31918x(arrayList);
        return arrayList;
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public List<C12931h0> listOrNull(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<C12931h0> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((C12931h0) it.next(), "listOrNull"));
        }
        C7707t.m31918x(arrayList);
        return arrayList;
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public Sequence<C12931h0> listRecursively(@NotNull C12931h0 dir, boolean followSymlinks) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return C6988p.m29396x(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), followSymlinks), new Function1() { // from class: xu.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC12942n.listRecursively$lambda$0(this.f45871a, (C12931h0) obj);
            }
        });
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public C12936k metadataOrNull(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        C12936k c12936kMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (c12936kMetadataOrNull == null) {
            return null;
        }
        return c12936kMetadataOrNull.getSymlinkTarget() == null ? c12936kMetadataOrNull : C12936k.m48157b(c12936kMetadataOrNull, false, false, onPathResult(c12936kMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @NotNull
    public C12931h0 onPathParameter(@NotNull C12931h0 path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    @NotNull
    public C12931h0 onPathResult(@NotNull C12931h0 path, @NotNull String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadOnly(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadWrite(@NotNull C12931h0 file, boolean mustCreate, boolean mustExist) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), mustCreate, mustExist);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 sink(@NotNull C12931h0 file, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), mustCreate);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12951r0 source(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.source(onPathParameter(file, Payload.SOURCE, "file"));
    }

    @NotNull
    public String toString() {
        return C7731d0.m32002b(getClass()).mo28427g() + '(' + this.delegate + ')';
    }
}
