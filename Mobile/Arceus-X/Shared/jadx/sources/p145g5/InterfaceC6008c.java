package p145g5;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: g5.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001cH&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH&¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\u0007H&¢\u0006\u0004\b'\u0010\tR\u0014\u0010(\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R(\u00102\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020/\u0018\u00010.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, m31665d2 = {"Lg5/c;", "Ljava/io/Closeable;", "", "sql", "Lg5/g;", "T1", "(Ljava/lang/String;)Lg5/g;", "", "G", "()V", "u0", "Y1", "G0", "q0", "", "D", "()Z", "Lg5/f;", "query", "Landroid/database/Cursor;", "U1", "(Lg5/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "r2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "R", "(Ljava/lang/String;)V", "bindArgs", "s0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "p0", "Q", "isOpen", "getPath", "()Ljava/lang/String;", "path", "b3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "sqlite"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC6008c extends Closeable {
    /* JADX INFO: renamed from: D */
    boolean mo6894D();

    /* JADX INFO: renamed from: G */
    void mo6895G();

    /* JADX INFO: renamed from: G0 */
    void mo6896G0();

    @Nullable
    /* JADX INFO: renamed from: N */
    List<Pair<String, String>> mo6897N();

    /* JADX INFO: renamed from: Q */
    void mo6898Q();

    /* JADX INFO: renamed from: R */
    void mo6899R(@NotNull String sql);

    @NotNull
    /* JADX INFO: renamed from: T1 */
    InterfaceC6012g mo6900T1(@NotNull String sql);

    @NotNull
    /* JADX INFO: renamed from: U1 */
    Cursor mo6901U1(@NotNull InterfaceC6011f query);

    /* JADX INFO: renamed from: Y1 */
    default void mo26779Y1() {
        mo6895G();
    }

    /* JADX INFO: renamed from: b3 */
    boolean mo6902b3();

    @Nullable
    String getPath();

    boolean isOpen();

    /* JADX INFO: renamed from: p0 */
    boolean mo6904p0();

    /* JADX INFO: renamed from: q0 */
    void mo6905q0();

    /* JADX INFO: renamed from: r2 */
    int mo6906r2(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs);

    /* JADX INFO: renamed from: s0 */
    void mo6907s0(@NotNull String sql, @NotNull Object[] bindArgs);

    /* JADX INFO: renamed from: u0 */
    void mo6908u0();
}
