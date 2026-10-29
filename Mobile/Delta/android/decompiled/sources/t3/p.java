package t3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102.\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001b\u001a\u00020\n2(\u0010\u0016\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006."}, d2 = {"Lt3/p;", "T", "Lt3/f0;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "Lt3/t;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Lt3/a0;Lt3/t;Lkotlin/jvm/functions/Function0;)V", "f", "()V", "R", "Lkotlin/Function3;", "Lt3/y;", "", "Lnt/b;", "", "block", "d", "(Lzt/n;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lt3/k0;", "c", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "close", "g", "(Ljava/io/File;)V", "a", "Ljava/io/File;", "b", "Lt3/a0;", "Lt3/t;", "e", "()Lt3/t;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Luu/a;", "Luu/a;", "transactionMutex", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a0<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t coordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClose;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a transactionMutex;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
    public static final class a<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31561t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31562u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f31563v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31564w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ p<T> f31565x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p<T> pVar, nt.b<? super a> bVar) {
            super(bVar);
            this.f31565x = pVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31564w = obj;
            this.f31566y |= Integer.MIN_VALUE;
            return this.f31565x.d(null, this);
        }
    }

    @pt.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31567t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31568u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31569v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31570w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f31571x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ p<T> f31572y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f31573z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p<T> pVar, nt.b<? super b> bVar) {
            super(bVar);
            this.f31572y = pVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31571x = obj;
            this.f31573z |= Integer.MIN_VALUE;
            return this.f31572y.c(null, this);
        }
    }

    public p(@NotNull File file, @NotNull a0<T> serializer, @NotNull t coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = uu.g.b(false, 1, null);
    }

    private final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, uu.a] */
    @Override // t3.f0
    @Nullable
    public Object c(@NotNull Function2<? super k0<T>, ? super nt.b<? super Unit>, ? extends Object> function2, @NotNull nt.b<? super Unit> bVar) throws IOException {
        b bVar2;
        File file;
        p<T> pVar;
        uu.a aVar;
        q qVar;
        Throwable th2;
        c cVar;
        File file2;
        p<T> pVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f31573z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f31573z = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(this, bVar);
            }
        } else {
            bVar2 = new b(this, bVar);
        }
        Object obj = bVar2.f31571x;
        Object objE = ot.c.e();
        ?? r8 = bVar2.f31573z;
        try {
            try {
                try {
                    try {
                        if (r8 == 0) {
                            jt.o.b(obj);
                            f();
                            g(this.file);
                            uu.a aVar2 = this.transactionMutex;
                            bVar2.f31567t = this;
                            bVar2.f31568u = function2;
                            bVar2.f31569v = aVar2;
                            bVar2.f31573z = 1;
                            if (aVar2.f(null, bVar2) != objE) {
                                pVar = this;
                                aVar = aVar2;
                            }
                            return objE;
                        }
                        if (r8 != 1) {
                            if (r8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar = (c) bVar2.f31570w;
                            File file3 = (File) bVar2.f31569v;
                            aVar = (uu.a) bVar2.f31568u;
                            pVar2 = (p) bVar2.f31567t;
                            try {
                                jt.o.b(obj);
                                file2 = file3;
                                Unit unit = Unit.f22483a;
                                try {
                                    cVar.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !m.a(file2, pVar2.file)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + pVar2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit2 = Unit.f22483a;
                                aVar.e(null);
                                return Unit.f22483a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    cVar.close();
                                } catch (Throwable th5) {
                                    jt.a.a(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        uu.a aVar3 = (uu.a) bVar2.f31569v;
                        Function2<? super k0<T>, ? super nt.b<? super Unit>, ? extends Object> function3 = (Function2) bVar2.f31568u;
                        pVar = (p) bVar2.f31567t;
                        jt.o.b(obj);
                        aVar = aVar3;
                        function2 = function3;
                        bVar2.f31567t = pVar;
                        bVar2.f31568u = aVar;
                        bVar2.f31569v = file;
                        bVar2.f31570w = qVar;
                        bVar2.f31573z = 2;
                        if (function2.invoke(qVar, bVar2) != objE) {
                            file2 = file;
                            pVar2 = pVar;
                            cVar = qVar;
                            Unit unit3 = Unit.f22483a;
                            cVar.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + pVar2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            Unit unit4 = Unit.f22483a;
                            aVar.e(null);
                            return Unit.f22483a;
                        }
                        return objE;
                    } catch (Throwable th6) {
                        th2 = th6;
                        cVar = qVar;
                        cVar.close();
                        throw th2;
                    }
                    qVar = new q(file, pVar.serializer);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(pVar.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                r8.e(null);
                throw th7;
            }
        } catch (IOException e11) {
            e = e11;
            file = objE;
        }
    }

    @Override // t3.c
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [t3.p] */
    /* JADX WARN: Type inference failed for: r0v14, types: [t3.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t3.p$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [t3.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [zt.n, zt.n<? super t3.y<T>, ? super java.lang.Boolean, ? super nt.b<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // t3.f0
    @Nullable
    public <R> Object d(@NotNull zt.n<? super y<T>, ? super Boolean, ? super nt.b<? super R>, ? extends Object> nVar, @NotNull nt.b<? super R> bVar) throws Throwable {
        ?? aVar;
        Throwable th2;
        c cVar;
        ?? r8;
        ?? r10;
        if (bVar instanceof a) {
            a aVar2 = (a) bVar;
            int i10 = aVar2.f31566y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f31566y = i10 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new a(this, bVar);
            }
        } else {
            aVar = new a(this, bVar);
        }
        Object obj = aVar.f31564w;
        Object objE = ot.c.e();
        int i11 = aVar.f31566y;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (zt.n<? super y<T>, ? super Boolean, ? super nt.b<? super R>, ? extends Object>) aVar.f31563v;
                cVar = (c) aVar.f31562u;
                aVar = (p) aVar.f31561t;
                try {
                    jt.o.b(obj);
                    r10 = aVar;
                    r8 = nVar;
                    try {
                        cVar.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        uu.a.C0590a.c(r10.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        cVar.close();
                    } catch (Throwable th5) {
                        jt.a.a(th2, th5);
                    }
                    throw th2;
                }
            }
            jt.o.b(obj);
            f();
            boolean zB = uu.a.C0590a.b(this.transactionMutex, null, 1, null);
            try {
                n nVar2 = new n(this.file, this.serializer);
                try {
                    Boolean boolA = pt.b.a(zB);
                    aVar.f31561t = this;
                    aVar.f31562u = nVar2;
                    aVar.f31563v = zB;
                    aVar.f31566y = 1;
                    Object objInvoke = nVar.invoke(nVar2, boolA, aVar);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    obj = objInvoke;
                    r8 = zB;
                    r10 = this;
                    cVar = nVar2;
                    cVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        uu.a.C0590a.c(r10.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    nVar = zB;
                    aVar = this;
                    cVar = nVar2;
                    cVar.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                nVar = zB;
                aVar = this;
                if (nVar != 0) {
                    uu.a.C0590a.c(aVar.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (nVar != 0) {
                uu.a.C0590a.c(aVar.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    @Override // t3.f0
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public t getCoordinator() {
        return this.coordinator;
    }

    public final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }
}
