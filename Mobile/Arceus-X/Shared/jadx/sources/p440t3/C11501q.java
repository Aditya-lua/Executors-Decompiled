package p440t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lt3/q;", "T", "Lt3/n;", "Lt3/k0;", "Ljava/io/File;", "file", "Lt3/a0;", "serializer", "<init>", "(Ljava/io/File;Lt3/a0;)V", "value", "", "b", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11501q<T> extends C11498n<T> implements InterfaceC11495k0<T> {

    /* JADX INFO: renamed from: t3.q$a */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.FileWriteScope", m39664f = "FileStorage.kt", m39665l = {MlKitException.CODE_SCANNER_CANCELLED}, m39666m = "writeData")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40768t;

        /* JADX INFO: renamed from: u */
        public Object f40769u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40770v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11501q<T> f40771w;

        /* JADX INFO: renamed from: x */
        public int f40772x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11501q<T> c11501q, InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
            this.f40771w = c11501q;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40770v = obj;
            this.f40772x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f40771w.mo43046b(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11501q(@NotNull File file, @NotNull InterfaceC11475a0<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p440t3.InterfaceC11495k0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo43046b(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f40772x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f40772x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(this, interfaceC9557b);
            }
        } else {
            aVar = new a(this, interfaceC9557b);
        }
        Object obj = aVar.f40770v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f40772x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            m43053f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getFile());
            try {
                InterfaceC11475a0<T> interfaceC11475a0M43055h = m43055h();
                C11491i0 c11491i0 = new C11491i0(fileOutputStream2);
                aVar.f40768t = fileOutputStream2;
                aVar.f40769u = fileOutputStream2;
                aVar.f40772x = 1;
                if (interfaceC11475a0M43055h.writeTo(t8, c11491i0, aVar) == objM38805e) {
                    return objM38805e;
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
            fileOutputStream = (FileOutputStream) aVar.f40769u;
            closeable = (Closeable) aVar.f40768t;
            try {
                C7348o.m30470b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C11958c.m44629a(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.f29331a;
        C11958c.m44629a(closeable, null);
        return Unit.f29331a;
    }
}
