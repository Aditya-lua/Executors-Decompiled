package p119f5;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f5.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J!\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0003H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0016H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H&¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m31665d2 = {"Lf5/d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "", "a2", "(I)Z", "E2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "sqlite"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC5361d extends AutoCloseable {
    /* JADX INFO: renamed from: A */
    void mo24699A(int index, @NotNull byte[] value);

    /* JADX INFO: renamed from: C */
    void mo24700C(int index);

    /* JADX INFO: renamed from: E */
    void mo24701E();

    @NotNull
    /* JADX INFO: renamed from: E2 */
    String mo24702E2(int index);

    /* JADX INFO: renamed from: a2 */
    default boolean mo24703a2(int index) {
        return getLong(index) != 0;
    }

    @Override // java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: g3 */
    boolean mo24704g3();

    @NotNull
    byte[] getBlob(int index);

    int getColumnCount();

    @NotNull
    String getColumnName(int index);

    long getLong(int index);

    boolean isNull(int index);

    /* JADX INFO: renamed from: k0 */
    void mo24705k0(int index, @NotNull String value);

    void reset();

    /* JADX INFO: renamed from: z */
    void mo24706z(int index, long value);
}
