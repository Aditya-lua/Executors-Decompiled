package p160h5;

import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145g5.InterfaceC6010e;

/* JADX INFO: renamed from: h5.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lh5/j;", "Lg5/e;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", "index", "", "C", "(I)V", "", "value", "z", "(IJ)V", "", "c0", "(ID)V", "", "L1", "(ILjava/lang/String;)V", "", "A", "(I[B)V", "E", "()V", "close", "a", "Landroid/database/sqlite/SQLiteProgram;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C6289j implements InterfaceC6010e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SQLiteProgram delegate;

    public C6289j(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // p145g5.InterfaceC6010e
    /* JADX INFO: renamed from: A */
    public void mo6916A(int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindBlob(index, value);
    }

    @Override // p145g5.InterfaceC6010e
    /* JADX INFO: renamed from: C */
    public void mo6917C(int index) {
        this.delegate.bindNull(index);
    }

    @Override // p145g5.InterfaceC6010e
    /* JADX INFO: renamed from: E */
    public void mo6918E() {
        this.delegate.clearBindings();
    }

    @Override // p145g5.InterfaceC6010e
    /* JADX INFO: renamed from: L1 */
    public void mo6919L1(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindString(index, value);
    }

    @Override // p145g5.InterfaceC6010e
    /* JADX INFO: renamed from: c0 */
    public void mo6921c0(int index, double value) {
        this.delegate.bindDouble(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // p145g5.InterfaceC6010e
    /* JADX INFO: renamed from: z */
    public void mo6925z(int index, long value) {
        this.delegate.bindLong(index, value);
    }
}
