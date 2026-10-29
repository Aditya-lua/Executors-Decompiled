package p025b5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.C7754u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6009d;
import p145g5.InterfaceC6010e;
import p145g5.InterfaceC6011f;
import p145g5.InterfaceC6012g;
import p535x4.InterfaceC12656d;

/* JADX INFO: renamed from: b5.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0016\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m31665d2 = {"Lb5/g;", "Lg5/d;", "Lx4/d;", "delegate", "Lb5/b;", "autoCloser", "<init>", "(Lg5/d;Lb5/b;)V", "", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "Lg5/d;", "()Lg5/d;", "b", "Lb5/b;", "()Lb5/b;", "Lb5/g$a;", "c", "Lb5/g$a;", "autoClosingDb", "Lg5/c;", "t2", "()Lg5/c;", "writableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1229g implements InterfaceC6009d, InterfaceC12656d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6009d delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1224b autoCloser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final a autoClosingDb;

    /* JADX INFO: renamed from: b5.g$a */
    @Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0012\u0010\"\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010'\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0014J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0014R\u0016\u00102\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0014R(\u00109\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m31665d2 = {"Lb5/g$a;", "Lg5/c;", "Lb5/b;", "autoCloser", "<init>", "(Lb5/b;)V", "", "g", "()V", "", "sql", "Lg5/g;", "T1", "(Ljava/lang/String;)Lg5/g;", "G", "u0", "G0", "q0", "", "D", "()Z", "Lg5/f;", "query", "Landroid/database/Cursor;", "U1", "(Lg5/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "r2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "R", "(Ljava/lang/String;)V", "bindArgs", "s0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "p0", "Q", "close", "a", "Lb5/b;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "b3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements InterfaceC6008c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C1224b autoCloser;

        /* JADX INFO: renamed from: b5.g$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<InterfaceC6008c, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final b f5137a = new b();

            public b() {
                super(1, InterfaceC6008c.class, "inTransaction", "inTransaction()Z", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC6008c p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return Boolean.valueOf(p8.mo6894D());
            }
        }

        public a(@NotNull C1224b autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m6890e(String str, InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.mo6899R(str);
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m6891f(String str, Object[] objArr, InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.mo6907s0(str, objArr);
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: h */
        public static final Object m6892h(InterfaceC6008c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }

        /* JADX INFO: renamed from: j */
        public static final int m6893j(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.mo6906r2(str, i10, contentValues, str2, objArr);
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: D */
        public boolean mo6894D() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.m6876h(b.f5137a)).booleanValue();
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: G */
        public void mo6895G() {
            try {
                this.autoCloser.m6878j().mo6895G();
            } catch (Throwable th2) {
                this.autoCloser.m6875g();
                throw th2;
            }
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: G0 */
        public void mo6896G0() {
            try {
                InterfaceC6008c delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.mo6896G0();
            } finally {
                this.autoCloser.m6875g();
            }
        }

        @Override // p145g5.InterfaceC6008c
        @Nullable
        /* JADX INFO: renamed from: N */
        public List<Pair<String, String>> mo6897N() {
            return (List) this.autoCloser.m6876h(new C7754u() { // from class: b5.g.a.a
                @Override // kotlin.jvm.internal.C7754u, hu.InterfaceC6574j
                public Object get(Object obj) {
                    return ((InterfaceC6008c) obj).mo6897N();
                }
            });
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: Q */
        public void mo6898Q() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: R */
        public void mo6899R(@NotNull final String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.m6876h(new Function1() { // from class: b5.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1229g.a.m6890e(sql, (InterfaceC6008c) obj);
                }
            });
        }

        @Override // p145g5.InterfaceC6008c
        @NotNull
        /* JADX INFO: renamed from: T1 */
        public InterfaceC6012g mo6900T1(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        @Override // p145g5.InterfaceC6008c
        @NotNull
        /* JADX INFO: renamed from: U1 */
        public Cursor mo6901U1(@NotNull InterfaceC6011f query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.autoCloser.m6878j().mo6901U1(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.m6875g();
                throw th2;
            }
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: b3 */
        public boolean mo6902b3() {
            return ((Boolean) this.autoCloser.m6876h(new C7754u() { // from class: b5.g.a.c
                @Override // kotlin.jvm.internal.C7754u, hu.InterfaceC6574j
                public Object get(Object obj) {
                    return Boolean.valueOf(((InterfaceC6008c) obj).mo6902b3());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.m6874f();
        }

        /* JADX INFO: renamed from: g */
        public final void m6903g() {
            this.autoCloser.m6876h(new Function1() { // from class: b5.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1229g.a.m6892h((InterfaceC6008c) obj);
                }
            });
        }

        @Override // p145g5.InterfaceC6008c
        @Nullable
        public String getPath() {
            return (String) this.autoCloser.m6876h(new C7754u() { // from class: b5.g.a.d
                @Override // kotlin.jvm.internal.C7754u, hu.InterfaceC6574j
                public Object get(Object obj) {
                    return ((InterfaceC6008c) obj).getPath();
                }
            });
        }

        @Override // p145g5.InterfaceC6008c
        public boolean isOpen() {
            return this.autoCloser.m6881m();
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: p0 */
        public boolean mo6904p0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: q0 */
        public void mo6905q0() {
            InterfaceC6008c delegateDatabase = this.autoCloser.getDelegateDatabase();
            Intrinsics.checkNotNull(delegateDatabase);
            delegateDatabase.mo6905q0();
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: r2 */
        public int mo6906r2(@NotNull final String table, final int conflictAlgorithm, @NotNull final ContentValues values, @Nullable final String whereClause, @Nullable final Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.m6876h(new Function1() { // from class: b5.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(C1229g.a.m6893j(table, conflictAlgorithm, values, whereClause, whereArgs, (InterfaceC6008c) obj));
                }
            })).intValue();
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: s0 */
        public void mo6907s0(@NotNull final String sql, @NotNull final Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.m6876h(new Function1() { // from class: b5.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1229g.a.m6891f(sql, bindArgs, (InterfaceC6008c) obj);
                }
            });
        }

        @Override // p145g5.InterfaceC6008c
        /* JADX INFO: renamed from: u0 */
        public void mo6908u0() {
            try {
                this.autoCloser.m6878j().mo6908u0();
            } catch (Throwable th2) {
                this.autoCloser.m6875g();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b5.g$b */
    @Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\nJ)\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00107R\u001e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m31665d2 = {"Lb5/g$b;", "Lg5/g;", "", "sql", "Lb5/b;", "autoCloser", "<init>", "(Ljava/lang/String;Lb5/b;)V", "", "close", "()V", "execute", "", "W", "()I", "index", "C", "(I)V", "", "value", "z", "(IJ)V", "", "c0", "(ID)V", "L1", "(ILjava/lang/String;)V", "", "A", "(I[B)V", "E", "T", "Lkotlin/Function1;", "block", "h", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "columnType", "e", "(II)V", "Lg5/e;", "query", "d", "(Lg5/e;)V", "a", "Ljava/lang/String;", "b", "Lb5/b;", "", "c", "[I", "bindingTypes", "", "[J", "longBindings", "", "[D", "doubleBindings", "", "f", "[Ljava/lang/String;", "stringBindings", "g", "[[B", "blobBindings", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements InterfaceC6012g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String sql;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C1224b autoCloser;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public int[] bindingTypes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public long[] longBindings;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public double[] doubleBindings;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public String[] stringBindings;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public byte[][] blobBindings;

        public b(@NotNull String sql, @NotNull C1224b autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m6913f(InterfaceC6012g statement) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            statement.execute();
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: g */
        public static final int m6914g(InterfaceC6012g obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.mo6920W();
        }

        /* JADX INFO: renamed from: j */
        public static final Object m6915j(b bVar, Function1 function1, InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            InterfaceC6012g interfaceC6012gMo6900T1 = db2.mo6900T1(bVar.sql);
            bVar.m6922d(interfaceC6012gMo6900T1);
            return function1.invoke(interfaceC6012gMo6900T1);
        }

        @Override // p145g5.InterfaceC6010e
        /* JADX INFO: renamed from: A */
        public void mo6916A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m6923e(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // p145g5.InterfaceC6010e
        /* JADX INFO: renamed from: C */
        public void mo6917C(int index) {
            m6923e(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // p145g5.InterfaceC6010e
        /* JADX INFO: renamed from: E */
        public void mo6918E() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // p145g5.InterfaceC6010e
        /* JADX INFO: renamed from: L1 */
        public void mo6919L1(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m6923e(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // p145g5.InterfaceC6012g
        /* JADX INFO: renamed from: W */
        public int mo6920W() {
            return ((Number) m6924h(new Function1() { // from class: b5.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(C1229g.b.m6914g((InterfaceC6012g) obj));
                }
            })).intValue();
        }

        @Override // p145g5.InterfaceC6010e
        /* JADX INFO: renamed from: c0 */
        public void mo6921c0(int index, double value) {
            m6923e(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            mo6918E();
        }

        /* JADX INFO: renamed from: d */
        public final void m6922d(InterfaceC6010e query) {
            int length = this.bindingTypes.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.bindingTypes[i10];
                if (i11 == 1) {
                    query.mo6925z(i10, this.longBindings[i10]);
                } else if (i11 == 2) {
                    query.mo6921c0(i10, this.doubleBindings[i10]);
                } else if (i11 == 3) {
                    String str = this.stringBindings[i10];
                    Intrinsics.checkNotNull(str);
                    query.mo6919L1(i10, str);
                } else if (i11 == 4) {
                    byte[] bArr = this.blobBindings[i10];
                    Intrinsics.checkNotNull(bArr);
                    query.mo6916A(i10, bArr);
                } else if (i11 == 5) {
                    query.mo6917C(i10);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m6923e(int columnType, int index) {
            int i10 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i10) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i10) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
                    Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i10) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
                    Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i10) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i10);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i10) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i10);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        @Override // p145g5.InterfaceC6012g
        public void execute() {
            m6924h(new Function1() { // from class: b5.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1229g.b.m6913f((InterfaceC6012g) obj);
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public final <T> T m6924h(final Function1<? super InterfaceC6012g, ? extends T> block) {
            return (T) this.autoCloser.m6876h(new Function1() { // from class: b5.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1229g.b.m6915j(this.f5150a, block, (InterfaceC6008c) obj);
                }
            });
        }

        @Override // p145g5.InterfaceC6010e
        /* JADX INFO: renamed from: z */
        public void mo6925z(int index, long value) {
            m6923e(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }
    }

    /* JADX INFO: renamed from: b5.g$c */
    @Metadata(m31664d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0014J \u0010\u001e\u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"J6\u0010$\u001a(\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0014\u0012\u000e\b\u0001\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b&\u0010\fJ \u0010(\u001a\n \u001d*\u0004\u0018\u00010'0'2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010\"J(\u0010-\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u00103J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b>\u0010\u0011J\u0010\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b?\u0010\tJ\u0010\u0010@\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b@\u0010\u0014J\u0010\u0010A\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bA\u0010\u0014J \u0010C\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bE\u0010DJ \u0010G\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bI\u0010HJ0\u0010L\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010J0J2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bP\u0010\u0014J \u0010R\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\n \u001d*\u0004\u0018\u00010Q0Q2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, m31665d2 = {"Lb5/g$c;", "Landroid/database/Cursor;", "delegate", "Lb5/b;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lb5/b;)V", "", "close", "()V", "", "getCount", "()I", "getPosition", "p0", "", "move", "(I)Z", "moveToPosition", "moveToFirst", "()Z", "moveToLast", "moveToNext", "moveToPrevious", "isFirst", "isLast", "isBeforeFirst", "isAfterLast", "", "kotlin.jvm.PlatformType", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getColumnCount", "", "getBlob", "(I)[B", "getString", "Landroid/database/CharArrayBuffer;", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "", "getShort", "(I)S", "getInt", "(I)I", "", "getLong", "(I)J", "", "getFloat", "(I)F", "", "getDouble", "(I)D", "getType", "isNull", "deactivate", "requery", "isClosed", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "unregisterContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "unregisterDataSetObserver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "getNotificationUri", "()Landroid/net/Uri;", "getWantsAllOnMoveCalls", "Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "a", "Landroid/database/Cursor;", "b", "Lb5/b;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Cursor delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C1224b autoCloser;

        public c(@NotNull Cursor delegate, @NotNull C1224b autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.m6875g();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p8, CharArrayBuffer p10) {
            this.delegate.copyStringToBuffer(p8, p10);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p8) {
            return this.delegate.getBlob(p8);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p8) {
            return this.delegate.getColumnIndex(p8);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p8) {
            return this.delegate.getColumnIndexOrThrow(p8);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p8) {
            return this.delegate.getColumnName(p8);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p8) {
            return this.delegate.getDouble(p8);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p8) {
            return this.delegate.getFloat(p8);
        }

        @Override // android.database.Cursor
        public int getInt(int p8) {
            return this.delegate.getInt(p8);
        }

        @Override // android.database.Cursor
        public long getLong(int p8) {
            return this.delegate.getLong(p8);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p8) {
            return this.delegate.getShort(p8);
        }

        @Override // android.database.Cursor
        public String getString(int p8) {
            return this.delegate.getString(p8);
        }

        @Override // android.database.Cursor
        public int getType(int p8) {
            return this.delegate.getType(p8);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p8) {
            return this.delegate.isNull(p8);
        }

        @Override // android.database.Cursor
        public boolean move(int p8) {
            return this.delegate.move(p8);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p8) {
            return this.delegate.moveToPosition(p8);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p8) {
            this.delegate.registerContentObserver(p8);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p8) {
            this.delegate.registerDataSetObserver(p8);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p8) {
            return this.delegate.respond(p8);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle p8) {
            this.delegate.setExtras(p8);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p8, Uri p10) {
            this.delegate.setNotificationUri(p8, p10);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p8) {
            this.delegate.unregisterContentObserver(p8);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p8) {
            this.delegate.unregisterDataSetObserver(p8);
        }
    }

    public C1229g(@NotNull InterfaceC6009d delegate, @NotNull C1224b autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new a(autoCloser);
        autoCloser.m6880l(getDelegate());
    }

    @Override // p535x4.InterfaceC12656d
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC6009d getDelegate() {
        return this.delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1224b getAutoCloser() {
        return this.autoCloser;
    }

    @Override // p145g5.InterfaceC6009d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // p145g5.InterfaceC6009d
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // p145g5.InterfaceC6009d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    @Override // p145g5.InterfaceC6009d
    @NotNull
    /* JADX INFO: renamed from: t2 */
    public InterfaceC6008c mo6885t2() {
        this.autoClosingDb.m6903g();
        return this.autoClosingDb;
    }
}
