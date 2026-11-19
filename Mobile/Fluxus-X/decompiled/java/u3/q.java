package u3;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu3/q;", "T", "Lu3/n;", "Lu3/k0;", "Ljava/io/File;", "file", "Lu3/a0;", "serializer", "<init>", "(Ljava/io/File;Lu3/a0;)V", "value", BuildConfig.FLAVOR, "e", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q<T> extends n<T> implements k0<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {MlKitException.CODE_SCANNER_CANCELLED}, m = "writeData")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33140t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33141u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33142v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ q<T> f33143w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33144x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q<T> qVar, eu.b<? super a> bVar) {
            super(bVar);
            this.f33143w = qVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33142v = obj;
            this.f33144x |= Integer.MIN_VALUE;
            return this.f33143w.e(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull File file, @NotNull a0<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u3.k0
    @Nullable
    public Object e(T t8, @NotNull eu.b<? super Unit> bVar) {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f33144x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33144x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, bVar);
            }
        } else {
            aVar = new a(this, bVar);
        }
        Object obj = aVar.f33142v;
        Object objE = fu.c.e();
        int i11 = aVar.f33144x;
        if (i11 == 0) {
            zt.o.b(obj);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getFile());
            try {
                a0<T> a0VarH = h();
                i0 i0Var = new i0(fileOutputStream2);
                aVar.f33140t = fileOutputStream2;
                aVar.f33141u = fileOutputStream2;
                aVar.f33144x = 1;
                if (a0VarH.writeTo(t8, i0Var, aVar) == objE) {
                    return objE;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f33141u;
            closeable = (Closeable) aVar.f33140t;
            try {
                zt.o.b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    lu.c.a(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.f21506a;
        lu.c.a(closeable, null);
        return Unit.f21506a;
    }
}
