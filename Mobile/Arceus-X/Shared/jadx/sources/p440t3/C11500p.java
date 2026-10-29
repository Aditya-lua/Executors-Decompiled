package p440t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
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
import p229jt.C7328a;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102.\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001b\u001a\u00020\n2(\u0010\u0016\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006."}, m31665d2 = {"Lt3/p;", "T", "Lt3/f0;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "Lt3/t;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Lt3/a0;Lt3/t;Lkotlin/jvm/functions/Function0;)V", "f", "()V", "R", "Lkotlin/Function3;", "Lt3/y;", "", "Lnt/b;", "", "block", "d", "(Lzt/n;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lt3/k0;", "c", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "close", "g", "(Ljava/io/File;)V", "a", "Ljava/io/File;", "b", "Lt3/a0;", "Lt3/t;", "e", "()Lt3/t;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Luu/a;", "Luu/a;", "transactionMutex", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11500p<T> implements InterfaceC11485f0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11475a0<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11504t coordinator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a transactionMutex;

    /* JADX INFO: renamed from: t3.p$a */
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.FileStorageConnection", m39664f = "FileStorage.kt", m39665l = {101}, m39666m = "readScope")
    public static final class a<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40755t;

        /* JADX INFO: renamed from: u */
        public Object f40756u;

        /* JADX INFO: renamed from: v */
        public boolean f40757v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f40758w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C11500p<T> f40759x;

        /* JADX INFO: renamed from: y */
        public int f40760y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11500p<T> c11500p, InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40759x = c11500p;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40758w = obj;
            this.f40760y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40759x.mo42978d(null, this);
        }
    }

    /* JADX INFO: renamed from: t3.p$b */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.FileStorageConnection", m39664f = "FileStorage.kt", m39665l = {214, 118}, m39666m = "writeScope")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40761t;

        /* JADX INFO: renamed from: u */
        public Object f40762u;

        /* JADX INFO: renamed from: v */
        public Object f40763v;

        /* JADX INFO: renamed from: w */
        public Object f40764w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f40765x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C11500p<T> f40766y;

        /* JADX INFO: renamed from: z */
        public int f40767z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11500p<T> c11500p, InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40766y = c11500p;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40765x = obj;
            this.f40767z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40766y.mo42977c(null, this);
        }
    }

    public C11500p(@NotNull File file, @NotNull InterfaceC11475a0<T> serializer, @NotNull InterfaceC11504t coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = C11976g.m44697b(false, 1, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m43062f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x010b */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v3, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v6, resolved type: java.io.File */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, uu.a] */
    @Override // p440t3.InterfaceC11485f0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo42977c(@NotNull Function2<? super InterfaceC11495k0<T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws IOException {
        b bVar;
        File file;
        C11500p<T> c11500p;
        InterfaceC11970a interfaceC11970a;
        C11501q c11501q;
        Throwable th2;
        InterfaceC11478c interfaceC11478c;
        File file2;
        C11500p<T> c11500p2;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f40767z;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f40767z = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(this, interfaceC9557b);
            }
        } else {
            bVar = new b(this, interfaceC9557b);
        }
        Object obj = bVar.f40765x;
        Object objM38805e = C10047c.m38805e();
        ?? r8 = bVar.f40767z;
        try {
            try {
                try {
                    try {
                        if (r8 == 0) {
                            C7348o.m30470b(obj);
                            m43062f();
                            m43063g(this.file);
                            InterfaceC11970a interfaceC11970a2 = this.transactionMutex;
                            bVar.f40761t = this;
                            bVar.f40762u = function2;
                            bVar.f40763v = interfaceC11970a2;
                            bVar.f40767z = 1;
                            if (interfaceC11970a2.mo44674f(null, bVar) != objM38805e) {
                                c11500p = this;
                                interfaceC11970a = interfaceC11970a2;
                            }
                            return objM38805e;
                        }
                        if (r8 != 1) {
                            if (r8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC11478c = (InterfaceC11478c) bVar.f40764w;
                            File file3 = (File) bVar.f40763v;
                            interfaceC11970a = (InterfaceC11970a) bVar.f40762u;
                            c11500p2 = (C11500p) bVar.f40761t;
                            try {
                                C7348o.m30470b(obj);
                                file2 = file3;
                                Unit unit = Unit.f29331a;
                                try {
                                    interfaceC11478c.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !C11497m.m43050a(file2, c11500p2.file)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + c11500p2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit2 = Unit.f29331a;
                                interfaceC11970a.mo44673e(null);
                                return Unit.f29331a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    interfaceC11478c.close();
                                } catch (Throwable th5) {
                                    C7328a.m30429a(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) bVar.f40763v;
                        Function2<? super InterfaceC11495k0<T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function3 = (Function2) bVar.f40762u;
                        c11500p = (C11500p) bVar.f40761t;
                        C7348o.m30470b(obj);
                        interfaceC11970a = interfaceC11970a3;
                        function2 = function3;
                        bVar.f40761t = c11500p;
                        bVar.f40762u = interfaceC11970a;
                        bVar.f40763v = file;
                        bVar.f40764w = c11501q;
                        bVar.f40767z = 2;
                        if (function2.invoke(c11501q, bVar) != objM38805e) {
                            file2 = file;
                            c11500p2 = c11500p;
                            interfaceC11478c = c11501q;
                            Unit unit3 = Unit.f29331a;
                            interfaceC11478c.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + c11500p2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            Unit unit4 = Unit.f29331a;
                            interfaceC11970a.mo44673e(null);
                            return Unit.f29331a;
                        }
                        return objM38805e;
                    } catch (Throwable th6) {
                        th2 = th6;
                        interfaceC11478c = c11501q;
                        interfaceC11478c.close();
                        throw th2;
                    }
                    c11501q = new C11501q(file, c11500p.serializer);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(c11500p.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                r8.mo44673e(null);
                throw th7;
            }
        } catch (IOException e11) {
            e = e11;
            file = objM38805e;
        }
    }

    @Override // p440t3.InterfaceC11478c
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0034 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x007c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0022 */
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
    @Override // p440t3.InterfaceC11485f0
    @Nullable
    /* JADX INFO: renamed from: d */
    public <R> Object mo42978d(@NotNull InterfaceC14057n<? super InterfaceC11509y<T>, ? super Boolean, ? super InterfaceC9557b<? super R>, ? extends Object> interfaceC14057n, @NotNull InterfaceC9557b<? super R> interfaceC9557b) throws Throwable {
        ?? aVar;
        Throwable th2;
        InterfaceC11478c interfaceC11478c;
        ?? r8;
        ?? r10;
        if (interfaceC9557b instanceof a) {
            a aVar2 = (a) interfaceC9557b;
            int i10 = aVar2.f40760y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar2.f40760y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                aVar = aVar2;
            } else {
                aVar = new a(this, interfaceC9557b);
            }
        } else {
            aVar = new a(this, interfaceC9557b);
        }
        Object obj = aVar.f40758w;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f40760y;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC14057n = (InterfaceC14057n<? super InterfaceC11509y<T>, ? super Boolean, ? super InterfaceC9557b<? super R>, ? extends Object>) aVar.f40757v;
                interfaceC11478c = (InterfaceC11478c) aVar.f40756u;
                aVar = (C11500p) aVar.f40755t;
                try {
                    C7348o.m30470b(obj);
                    r10 = aVar;
                    r8 = interfaceC14057n;
                    try {
                        interfaceC11478c.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        InterfaceC11970a.a.m44677c(r10.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        interfaceC11478c.close();
                    } catch (Throwable th5) {
                        C7328a.m30429a(th2, th5);
                    }
                    throw th2;
                }
            }
            C7348o.m30470b(obj);
            m43062f();
            boolean zM44676b = InterfaceC11970a.a.m44676b(this.transactionMutex, null, 1, null);
            try {
                C11498n c11498n = new C11498n(this.file, this.serializer);
                try {
                    Boolean boolM39658a = C10340b.m39658a(zM44676b);
                    aVar.f40755t = this;
                    aVar.f40756u = c11498n;
                    aVar.f40757v = zM44676b;
                    aVar.f40760y = 1;
                    Object objInvoke = interfaceC14057n.invoke(c11498n, boolM39658a, aVar);
                    if (objInvoke == objM38805e) {
                        return objM38805e;
                    }
                    obj = objInvoke;
                    r8 = zM44676b;
                    r10 = this;
                    interfaceC11478c = c11498n;
                    interfaceC11478c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        InterfaceC11970a.a.m44677c(r10.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    interfaceC14057n = zM44676b;
                    aVar = this;
                    interfaceC11478c = c11498n;
                    interfaceC11478c.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                interfaceC14057n = zM44676b;
                aVar = this;
                if (interfaceC14057n != 0) {
                    InterfaceC11970a.a.m44677c(aVar.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (interfaceC14057n != 0) {
                InterfaceC11970a.a.m44677c(aVar.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }

    @Override // p440t3.InterfaceC11485f0
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public InterfaceC11504t getCoordinator() {
        return this.coordinator;
    }

    /* JADX INFO: renamed from: g */
    public final void m43063g(File file) throws IOException {
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
