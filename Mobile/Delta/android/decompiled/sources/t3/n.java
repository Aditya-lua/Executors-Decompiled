package t3;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt3/n;", "T", "Lt3/y;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "<init>", "(Ljava/io/File;Lt3/a0;)V", "a", "(Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "f", "Ljava/io/File;", "g", "()Ljava/io/File;", "b", "Lt3/a0;", "h", "()Lt3/a0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class n<T> implements y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a0<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
    public static final class a<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31544t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31545u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31546v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ n<T> f31547w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31548x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n<T> nVar, nt.b<? super a> bVar) {
            super(bVar);
            this.f31547w = nVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31546v = obj;
            this.f31548x |= Integer.MIN_VALUE;
            return n.i(this.f31547w, this);
        }
    }

    public n(@NotNull File file, @NotNull a0<T> serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [t3.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v21 */
    public static /* synthetic */ <T> Object i(n<T> nVar, nt.b<? super T> bVar) {
        a aVar;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f31548x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31548x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(nVar, bVar);
            }
        } else {
            aVar = new a(nVar, bVar);
        }
        Object obj = aVar.f31546v;
        Object objE = ot.c.e();
        ?? r8 = aVar.f31548x;
        try {
            if (r8 != 0) {
                if (r8 == 1) {
                    closeable2 = (Closeable) aVar.f31545u;
                    r8 = (n) aVar.f31544t;
                    try {
                        jt.o.b(obj);
                        ut.c.a(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            ut.c.a(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f31544t;
                try {
                    jt.o.b(obj);
                    ut.c.a(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        ut.c.a(closeable, th2);
                        throw th7;
                    }
                }
            }
            jt.o.b(obj);
            nVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(nVar.file);
                try {
                    a0<T> a0Var = nVar.serializer;
                    aVar.f31544t = nVar;
                    aVar.f31545u = fileInputStream;
                    aVar.f31548x = 1;
                    Object from = a0Var.readFrom(fileInputStream, aVar);
                    if (from != objE) {
                        closeable2 = fileInputStream;
                        obj = from;
                        ut.c.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    r8 = nVar;
                    closeable2 = fileInputStream;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (!nVar.file.exists()) {
                    return nVar.serializer.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(nVar.file);
                try {
                    a0<T> a0Var2 = nVar.serializer;
                    aVar.f31544t = fileInputStream2;
                    aVar.f31545u = null;
                    aVar.f31548x = 2;
                    Object from2 = a0Var2.readFrom(fileInputStream2, aVar);
                    if (from2 != objE) {
                        obj = from2;
                        closeable = fileInputStream2;
                        ut.c.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream2;
                    throw th2;
                }
            }
            return objE;
        } catch (FileNotFoundException unused2) {
            nVar = (n<T>) r8;
        }
    }

    @Override // t3.y
    @Nullable
    public Object a(@NotNull nt.b<? super T> bVar) {
        return i(this, bVar);
    }

    @Override // t3.c
    public void close() {
        this.closed.set(true);
    }

    public final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final a0<T> h() {
        return this.serializer;
    }
}
