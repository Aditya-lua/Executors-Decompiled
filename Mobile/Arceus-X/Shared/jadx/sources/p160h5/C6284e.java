package p160h5;

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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145g5.C6006a;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6011f;
import p145g5.InterfaceC6012g;
import p229jt.C7342i;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: h5.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010(\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010&\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0011J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0011J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0019R\u0016\u0010:\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R(\u0010A\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0>\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, m31665d2 = {"Lh5/e;", "Lg5/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "", "l", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "", "sql", "Lg5/g;", "T1", "(Ljava/lang/String;)Lg5/g;", "G", "()V", "u0", "Y1", "h", "G0", "q0", "", "D", "()Z", "Lg5/f;", "query", "Landroid/database/Cursor;", "U1", "(Lg5/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "r2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "R", "(Ljava/lang/String;)V", "bindArgs", "s0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "p0", "Q", "close", "sqLiteDatabase", "m", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "b3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "b", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6284e implements InterfaceC6008c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String[] f23837c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String[] f23838d = new String[0];

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC7341h<Method> f23839e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC7341h<Method> f23840f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SQLiteDatabase delegate;

    /* JADX INFO: renamed from: h5.e$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lh5/e$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Ljt/h;", "d", "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "c", "beginTransactionMethod", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: h5.e.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final Method m27554c() {
            return (Method) C6284e.f23840f.getValue();
        }

        /* JADX INFO: renamed from: d */
        public final Method m27555d() {
            return (Method) C6284e.f23839e.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    static {
        EnumC7344k enumC7344k = EnumC7344k.PUBLICATION;
        f23839e = C7342i.m30455a(enumC7344k, new Function0() { // from class: h5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6284e.m27546j();
            }
        });
        f23840f = C7342i.m30455a(enumC7344k, new Function0() { // from class: h5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6284e.m27545g();
            }
        });
    }

    public C6284e(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: g */
    public static final Method m27545g() {
        Class<?> returnType;
        try {
            Method methodM27555d = INSTANCE.m27555d();
            if (methodM27555d == null || (returnType = methodM27555d.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Method m27546j() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final SQLiteCursor m27547n(InterfaceC6011f interfaceC6011f, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNull(sQLiteQuery);
        interfaceC6011f.mo26794b(new C6289j(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: renamed from: o */
    public static final Cursor m27548o(InterfaceC14058o interfaceC14058o, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) interfaceC14058o.mo1397e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: D */
    public boolean mo6894D() {
        return this.delegate.inTransaction();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: G */
    public void mo6895G() {
        this.delegate.beginTransaction();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: G0 */
    public void mo6896G0() {
        this.delegate.endTransaction();
    }

    @Override // p145g5.InterfaceC6008c
    @Nullable
    /* JADX INFO: renamed from: N */
    public List<Pair<String, String>> mo6897N() {
        return this.delegate.getAttachedDbs();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: Q */
    public void mo6898Q() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: R */
    public void mo6899R(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // p145g5.InterfaceC6008c
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public InterfaceC6012g mo6900T1(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new C6290k(sQLiteStatementCompileStatement);
    }

    @Override // p145g5.InterfaceC6008c
    @NotNull
    /* JADX INFO: renamed from: U1 */
    public Cursor mo6901U1(@NotNull final InterfaceC6011f query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final InterfaceC14058o interfaceC14058o = new InterfaceC14058o() { // from class: h5.c
            @Override // p615zt.InterfaceC14058o
            /* JADX INFO: renamed from: e */
            public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6284e.m27547n(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: h5.d
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C6284e.m27548o(interfaceC14058o, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.mo26793a(), f23838d, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: Y1 */
    public void mo26779Y1() throws IllegalAccessException, InvocationTargetException {
        m27550l(null);
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: b3 */
    public boolean mo6902b3() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // p145g5.InterfaceC6008c
    @Nullable
    public String getPath() {
        return this.delegate.getPath();
    }

    /* JADX INFO: renamed from: h */
    public void m27549h(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // p145g5.InterfaceC6008c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: l */
    public final void m27550l(SQLiteTransactionListener transactionListener) throws IllegalAccessException, InvocationTargetException {
        Companion companion = INSTANCE;
        if (companion.m27554c() == null || companion.m27555d() == null) {
            if (transactionListener != null) {
                m27549h(transactionListener);
                return;
            } else {
                mo6895G();
                return;
            }
        }
        Method methodM27554c = companion.m27554c();
        Intrinsics.checkNotNull(methodM27554c);
        Method methodM27555d = companion.m27555d();
        Intrinsics.checkNotNull(methodM27555d);
        Object objInvoke = methodM27555d.invoke(this.delegate, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodM27554c.invoke(objInvoke, 0, transactionListener, 0, null);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m27551m(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.m31980c(this.delegate, sqLiteDatabase);
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: p0 */
    public boolean mo6904p0() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: q0 */
    public void mo6905q0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: r2 */
    public int mo6906r2(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
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
        sb2.append(f23837c[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
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
        InterfaceC6012g interfaceC6012gMo6900T1 = mo6900T1(sb2.toString());
        C6006a.INSTANCE.m26777b(interfaceC6012gMo6900T1, objArr);
        return interfaceC6012gMo6900T1.mo6920W();
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: s0 */
    public void mo6907s0(@NotNull String sql, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // p145g5.InterfaceC6008c
    /* JADX INFO: renamed from: u0 */
    public void mo6908u0() {
        this.delegate.beginTransactionNonExclusive();
    }
}
