package p440t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lt3/n;", "T", "Lt3/y;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "<init>", "(Ljava/io/File;Lt3/a0;)V", "a", "(Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "f", "Ljava/io/File;", "g", "()Ljava/io/File;", "b", "Lt3/a0;", "h", "()Lt3/a0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public class C11498n<T> implements InterfaceC11509y<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11475a0<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean closed;

    /* JADX INFO: renamed from: t3.n$a */
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.core.FileReadScope", m39664f = "FileStorage.kt", m39665l = {169, 178}, m39666m = "readData$suspendImpl")
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40736t;

        /* JADX INFO: renamed from: u */
        public Object f40737u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40738v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11498n<T> f40739w;

        /* JADX INFO: renamed from: x */
        public int f40740x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11498n<T> c11498n, InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40739w = c11498n;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40738v = obj;
            this.f40740x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11498n.m43051i(this.f40739w, this);
        }
    }

    public C11498n(@NotNull File file, @NotNull InterfaceC11475a0<T> serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0049 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0023 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [t3.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ <T> Object m43051i(C11498n<T> c11498n, InterfaceC9557b<? super T> interfaceC9557b) {
        a aVar;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f40740x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f40740x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(c11498n, interfaceC9557b);
            }
        } else {
            aVar = new a(c11498n, interfaceC9557b);
        }
        Object obj = aVar.f40738v;
        Object objM38805e = C10047c.m38805e();
        ?? r8 = aVar.f40740x;
        try {
            if (r8 != 0) {
                if (r8 == 1) {
                    closeable2 = (Closeable) aVar.f40737u;
                    r8 = (C11498n) aVar.f40736t;
                    try {
                        C7348o.m30470b(obj);
                        C11958c.m44629a(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            C11958c.m44629a(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f40736t;
                try {
                    C7348o.m30470b(obj);
                    C11958c.m44629a(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        C11958c.m44629a(closeable, th2);
                        throw th7;
                    }
                }
            }
            C7348o.m30470b(obj);
            c11498n.m43053f();
            try {
                FileInputStream fileInputStream = new FileInputStream(c11498n.file);
                try {
                    InterfaceC11475a0<T> interfaceC11475a0 = c11498n.serializer;
                    aVar.f40736t = c11498n;
                    aVar.f40737u = fileInputStream;
                    aVar.f40740x = 1;
                    Object from = interfaceC11475a0.readFrom(fileInputStream, aVar);
                    if (from != objM38805e) {
                        closeable2 = fileInputStream;
                        obj = from;
                        C11958c.m44629a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    r8 = c11498n;
                    closeable2 = fileInputStream;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (!c11498n.file.exists()) {
                    return c11498n.serializer.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(c11498n.file);
                try {
                    InterfaceC11475a0<T> interfaceC11475a1 = c11498n.serializer;
                    aVar.f40736t = fileInputStream2;
                    aVar.f40737u = null;
                    aVar.f40740x = 2;
                    Object from2 = interfaceC11475a1.readFrom(fileInputStream2, aVar);
                    if (from2 != objM38805e) {
                        obj = from2;
                        closeable = fileInputStream2;
                        C11958c.m44629a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream2;
                    throw th2;
                }
            }
            return objM38805e;
        } catch (FileNotFoundException unused2) {
            c11498n = (C11498n<T>) r8;
        }
    }

    @Override // p440t3.InterfaceC11509y
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo43052a(@NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return m43051i(this, interfaceC9557b);
    }

    @Override // p440t3.InterfaceC11478c
    public void close() {
        this.closed.set(true);
    }

    /* JADX INFO: renamed from: f */
    public final void m43053f() {
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
    /* JADX INFO: renamed from: h */
    public final InterfaceC11475a0<T> m43055h() {
        return this.serializer;
    }
}
