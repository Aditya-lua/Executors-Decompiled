package c5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0016\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lc5/g;", "Lh5/d;", "Ly4/d;", "delegate", "Lc5/b;", "autoCloser", "<init>", "(Lh5/d;Lc5/b;)V", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "Lh5/d;", "()Lh5/d;", "b", "Lc5/b;", "()Lc5/b;", "Lc5/g$a;", "c", "Lc5/g$a;", "autoClosingDb", "Lh5/c;", "w2", "()Lh5/c;", "writableDatabase", BuildConfig.FLAVOR, "getDatabaseName", "()Ljava/lang/String;", "databaseName", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements h5.d, y4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h5.d delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final c5.b autoCloser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a autoClosingDb;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0012\u0010\"\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010'\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0014J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0014R\u0016\u00102\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0014R(\u00109\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lc5/g$a;", "Lh5/c;", "Lc5/b;", "autoCloser", "<init>", "(Lc5/b;)V", BuildConfig.FLAVOR, "g", "()V", BuildConfig.FLAVOR, "sql", "Lh5/g;", "X1", "(Ljava/lang/String;)Lh5/g;", "J", "u0", "H0", "r0", BuildConfig.FLAVOR, "G", "()Z", "Lh5/f;", "query", "Landroid/database/Cursor;", "C0", "(Lh5/f;)Landroid/database/Cursor;", "table", BuildConfig.FLAVOR, "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "whereArgs", "u2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "V", "(Ljava/lang/String;)V", "bindArgs", "t0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "q0", "U", "close", "a", "Lc5/b;", "isOpen", "x", "()Ljava/lang/String;", "path", "g3", "isWriteAheadLoggingEnabled", BuildConfig.FLAVOR, "Landroid/util/Pair;", "R", "()Ljava/util/List;", "attachedDbs", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c5.b autoCloser;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<h5.c, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f4812a = new b();

            public b() {
                super(1, h5.c.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(h5.c p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return Boolean.valueOf(p8.G());
            }
        }

        public a(@NotNull c5.b autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        public static final Unit e(String str, h5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.V(str);
            return Unit.f21506a;
        }

        public static final Unit f(String str, Object[] objArr, h5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.t0(str, objArr);
            return Unit.f21506a;
        }

        public static final Object h(h5.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }

        public static final int k(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, h5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.u2(str, i10, contentValues, str2, objArr);
        }

        @Override // h5.c
        @NotNull
        public Cursor C0(@NotNull h5.f query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.autoCloser.j().C0(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // h5.c
        public boolean G() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.h(b.f4812a)).booleanValue();
        }

        @Override // h5.c
        public void H0() {
            try {
                h5.c delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.H0();
            } finally {
                this.autoCloser.g();
            }
        }

        @Override // h5.c
        public void J() {
            try {
                this.autoCloser.j().J();
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // h5.c
        @Nullable
        public List<Pair<String, String>> R() {
            return (List) this.autoCloser.h(new u() { // from class: c5.g.a.a
                @Override // p001kotlin.jvm.internal.u, xu.j
                public Object get(Object obj) {
                    return ((h5.c) obj).R();
                }
            });
        }

        @Override // h5.c
        public void U() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // h5.c
        public void V(@NotNull final String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.h(new Function1() { // from class: c5.d
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.e(sql, (h5.c) obj);
                }
            });
        }

        @Override // h5.c
        @NotNull
        public h5.g X1(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.autoCloser.f();
        }

        public final void g() {
            this.autoCloser.h(new Function1() { // from class: c5.f
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.h((h5.c) obj);
                }
            });
        }

        @Override // h5.c
        public boolean g3() {
            return ((Boolean) this.autoCloser.h(new u() { // from class: c5.g.a.c
                @Override // p001kotlin.jvm.internal.u, xu.j
                public Object get(Object obj) {
                    return Boolean.valueOf(((h5.c) obj).g3());
                }
            })).booleanValue();
        }

        @Override // h5.c
        public boolean isOpen() {
            return this.autoCloser.m();
        }

        @Override // h5.c
        public boolean q0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // h5.c
        public void r0() {
            h5.c delegateDatabase = this.autoCloser.getDelegateDatabase();
            Intrinsics.checkNotNull(delegateDatabase);
            delegateDatabase.r0();
        }

        @Override // h5.c
        public void t0(@NotNull final String sql, @NotNull final Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.h(new Function1() { // from class: c5.e
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.a.f(sql, bindArgs, (h5.c) obj);
                }
            });
        }

        @Override // h5.c
        public void u0() {
            try {
                this.autoCloser.j().u0();
            } catch (Throwable th2) {
                this.autoCloser.g();
                throw th2;
            }
        }

        @Override // h5.c
        public int u2(@NotNull final String table, final int conflictAlgorithm, @NotNull final ContentValues values, @Nullable final String whereClause, @Nullable final Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.h(new Function1() { // from class: c5.c
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(g.a.k(table, conflictAlgorithm, values, whereClause, whereArgs, (h5.c) obj));
                }
            })).intValue();
        }

        @Override // h5.c
        @Nullable
        public String x() {
            return (String) this.autoCloser.h(new u() { // from class: c5.g.a.d
                @Override // p001kotlin.jvm.internal.u, xu.j
                public Object get(Object obj) {
                    return ((h5.c) obj).x();
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\nJ)\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00107R\u001e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lc5/g$b;", "Lh5/g;", BuildConfig.FLAVOR, "sql", "Lc5/b;", "autoCloser", "<init>", "(Ljava/lang/String;Lc5/b;)V", BuildConfig.FLAVOR, "close", "()V", "j", BuildConfig.FLAVOR, "Z", "()I", "index", "F", "(I)V", BuildConfig.FLAVOR, "value", "B", "(IJ)V", BuildConfig.FLAVOR, "g0", "(ID)V", "N1", "(ILjava/lang/String;)V", BuildConfig.FLAVOR, "C", "(I[B)V", "H", "T", "Lkotlin/Function1;", "block", "h", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "columnType", "e", "(II)V", "Lh5/e;", "query", "d", "(Lh5/e;)V", "a", "Ljava/lang/String;", "b", "Lc5/b;", BuildConfig.FLAVOR, "c", "[I", "bindingTypes", BuildConfig.FLAVOR, "[J", "longBindings", BuildConfig.FLAVOR, "[D", "doubleBindings", BuildConfig.FLAVOR, "f", "[Ljava/lang/String;", "stringBindings", "g", "[[B", "blobBindings", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements h5.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sql;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final c5.b autoCloser;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public int[] bindingTypes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public long[] longBindings;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public double[] doubleBindings;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String[] stringBindings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public byte[][] blobBindings;

        public b(@NotNull String sql, @NotNull c5.b autoCloser) {
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

        public static final Unit f(h5.g statement) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            statement.j();
            return Unit.f21506a;
        }

        public static final int g(h5.g obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.Z();
        }

        public static final Object k(b bVar, Function1 function1, h5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            h5.g gVarX1 = db2.X1(bVar.sql);
            bVar.d(gVarX1);
            return function1.invoke(gVarX1);
        }

        @Override // h5.e
        public void B(int index, long value) {
            e(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // h5.e
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // h5.e
        public void F(int index) {
            e(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // h5.e
        public void H() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // h5.e
        public void N1(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // h5.g
        public int Z() {
            return ((Number) h(new Function1() { // from class: c5.h
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(g.b.g((h5.g) obj));
                }
            })).intValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            H();
        }

        public final void d(h5.e query) {
            int length = this.bindingTypes.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.bindingTypes[i10];
                if (i11 == 1) {
                    query.B(i10, this.longBindings[i10]);
                } else if (i11 == 2) {
                    query.g0(i10, this.doubleBindings[i10]);
                } else if (i11 == 3) {
                    String str = this.stringBindings[i10];
                    Intrinsics.checkNotNull(str);
                    query.N1(i10, str);
                } else if (i11 == 4) {
                    byte[] bArr = this.blobBindings[i10];
                    Intrinsics.checkNotNull(bArr);
                    query.C(i10, bArr);
                } else if (i11 == 5) {
                    query.F(i10);
                }
            }
        }

        public final void e(int columnType, int index) {
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

        @Override // h5.e
        public void g0(int index, double value) {
            e(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        public final <T> T h(final Function1<? super h5.g, ? extends T> block) {
            return (T) this.autoCloser.h(new Function1() { // from class: c5.j
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.b.k(this.f4821a, block, (h5.c) obj);
                }
            });
        }

        @Override // h5.g
        public void j() {
            h(new Function1() { // from class: c5.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.b.f((h5.g) obj);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0014J \u0010\u001e\u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"J6\u0010$\u001a(\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0014\u0012\u000e\b\u0001\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b&\u0010\fJ \u0010(\u001a\n \u001d*\u0004\u0018\u00010'0'2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b(\u0010)J \u0010*\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010\"J(\u0010-\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u00103J\u0018\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b>\u0010\u0011J\u0010\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b?\u0010\tJ\u0010\u0010@\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b@\u0010\u0014J\u0010\u0010A\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bA\u0010\u0014J \u0010C\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010B0BH\u0096\u0001¢\u0006\u0004\bE\u0010DJ \u0010G\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010F0FH\u0096\u0001¢\u0006\u0004\bI\u0010HJ0\u0010L\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010J0J2\u000e\u0010,\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n \u001d*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\bP\u0010\u0014J \u0010R\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\n \u001d*\u0004\u0018\u00010Q0Q2\u000e\u0010\u000e\u001a\n \u001d*\u0004\u0018\u00010Q0QH\u0096\u0001¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lc5/g$c;", "Landroid/database/Cursor;", "delegate", "Lc5/b;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lc5/b;)V", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "getCount", "()I", "getPosition", "p0", BuildConfig.FLAVOR, "move", "(I)Z", "moveToPosition", "moveToFirst", "()Z", "moveToLast", "moveToNext", "moveToPrevious", "isFirst", "isLast", "isBeforeFirst", "isAfterLast", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "getColumnNames", "()[Ljava/lang/String;", "getColumnCount", BuildConfig.FLAVOR, "getBlob", "(I)[B", "getString", "Landroid/database/CharArrayBuffer;", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", BuildConfig.FLAVOR, "getShort", "(I)S", "getInt", "(I)I", BuildConfig.FLAVOR, "getLong", "(I)J", BuildConfig.FLAVOR, "getFloat", "(I)F", BuildConfig.FLAVOR, "getDouble", "(I)D", "getType", "isNull", "deactivate", "requery", "isClosed", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "unregisterContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "unregisterDataSetObserver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "getNotificationUri", "()Landroid/net/Uri;", "getWantsAllOnMoveCalls", "Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "a", "Landroid/database/Cursor;", "b", "Lc5/b;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Cursor delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final c5.b autoCloser;

        public c(@NotNull Cursor delegate, @NotNull c5.b autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.g();
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

    public g(@NotNull h5.d delegate, @NotNull c5.b autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new a(autoCloser);
        autoCloser.l(getDelegate());
    }

    @Override // y4.d
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public h5.d getDelegate() {
        return this.delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c5.b getAutoCloser() {
        return this.autoCloser;
    }

    @Override // h5.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // h5.d
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // h5.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    @Override // h5.d
    @NotNull
    public h5.c w2() {
        this.autoClosingDb.g();
        return this.autoClosingDb;
    }
}
