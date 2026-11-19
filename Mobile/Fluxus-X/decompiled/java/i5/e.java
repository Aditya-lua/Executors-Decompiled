package i5;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import pu.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010(\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010&\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0011J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0011J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0019R\u0016\u0010:\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R(\u0010A\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0>\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Li5/e;", "Lh5/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", BuildConfig.FLAVOR, "m", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", BuildConfig.FLAVOR, "sql", "Lh5/g;", "X1", "(Ljava/lang/String;)Lh5/g;", "J", "()V", "u0", "b2", "h", "H0", "r0", BuildConfig.FLAVOR, "G", "()Z", "Lh5/f;", "query", "Landroid/database/Cursor;", "C0", "(Lh5/f;)Landroid/database/Cursor;", "table", BuildConfig.FLAVOR, "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "whereArgs", "u2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "V", "(Ljava/lang/String;)V", "bindArgs", "t0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "q0", "U", "close", "sqLiteDatabase", "n", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "x", "()Ljava/lang/String;", "path", "g3", "isWriteAheadLoggingEnabled", BuildConfig.FLAVOR, "Landroid/util/Pair;", "R", "()Ljava/util/List;", "attachedDbs", "b", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements h5.c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[] f19100c = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String[] f19101d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final zt.h<Method> f19102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final zt.h<Method> f19103f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SQLiteDatabase delegate;

    /* JADX INFO: renamed from: i5.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Li5/e$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Lzt/h;", "d", "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "c", "beginTransactionMethod", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Method c() {
            return (Method) e.f19103f.getValue();
        }

        public final Method d() {
            return (Method) e.f19102e.getValue();
        }

        public Companion() {
        }
    }

    static {
        zt.k kVar = zt.k.PUBLICATION;
        f19102e = zt.i.b(kVar, new Function0() { // from class: i5.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.k();
            }
        });
        f19103f = zt.i.b(kVar, new Function0() { // from class: i5.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.g();
            }
        });
    }

    public e(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public static final Method g() {
        Class<?> returnType;
        try {
            Method methodD = INSTANCE.d();
            if (methodD == null || (returnType = methodD.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Method k() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final SQLiteCursor o(h5.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNull(sQLiteQuery);
        fVar.a(new j(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor p(o oVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) oVar.e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // h5.c
    @NotNull
    public Cursor C0(@NotNull final h5.f query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final o oVar = new o() { // from class: i5.c
            @Override // pu.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                return e.o(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: i5.d
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return e.p(oVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.b(), f19101d, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // h5.c
    public boolean G() {
        return this.delegate.inTransaction();
    }

    @Override // h5.c
    public void H0() {
        this.delegate.endTransaction();
    }

    @Override // h5.c
    public void J() {
        this.delegate.beginTransaction();
    }

    @Override // h5.c
    @Nullable
    public List<Pair<String, String>> R() {
        return this.delegate.getAttachedDbs();
    }

    @Override // h5.c
    public void U() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // h5.c
    public void V(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // h5.c
    @NotNull
    public h5.g X1(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new k(sQLiteStatementCompileStatement);
    }

    @Override // h5.c
    public void b2() throws IllegalAccessException, InvocationTargetException {
        m(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // h5.c
    public boolean g3() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    public void h(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // h5.c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final void m(SQLiteTransactionListener transactionListener) throws IllegalAccessException, InvocationTargetException {
        Companion companion = INSTANCE;
        if (companion.c() == null || companion.d() == null) {
            if (transactionListener != null) {
                h(transactionListener);
                return;
            } else {
                J();
                return;
            }
        }
        Method methodC = companion.c();
        Intrinsics.checkNotNull(methodC);
        Method methodD = companion.d();
        Intrinsics.checkNotNull(methodD);
        Object objInvoke = methodD.invoke(this.delegate, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodC.invoke(objInvoke, 0, transactionListener, 0, null);
    }

    public final boolean n(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.c(this.delegate, sqLiteDatabase);
    }

    @Override // h5.c
    public boolean q0() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // h5.c
    public void r0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // h5.c
    public void t0(@NotNull String sql, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // h5.c
    public void u0() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // h5.c
    public int u2(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f19100c[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? "," : BuildConfig.FLAVOR);
            sb2.append(str);
            objArr[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        if (whereArgs != null) {
            for (int i11 = size; i11 < length; i11++) {
                objArr[i11] = whereArgs[i11 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        h5.g gVarX1 = X1(sb2.toString());
        h5.a.INSTANCE.b(gVarX1, objArr);
        return gVarX1.Z();
    }

    @Override // h5.c
    @Nullable
    public String x() {
        return this.delegate.getPath();
    }
}
