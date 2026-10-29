package p160h5;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145g5.C6007b;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6009d;
import p209j5.C7031a;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.InterfaceC7341h;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: h5.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003\u0017\u0013\u0015B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0016\u0010%\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0015\u0010**\u0004\b+\u0010,¨\u0006/"}, m31665d2 = {"Lh5/g;", "Lg5/d;", "Landroid/content/Context;", "context", "", "name", "Lg5/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lg5/d$a;ZZ)V", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lg5/d$a;", "d", "Z", "e", "Ljt/h;", "Lh5/g$c;", "f", "Ljt/h;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lg5/c;", "t2", "()Lg5/c;", "writableDatabase", "()Lh5/g$c;", "getDelegate$delegate", "(Lh5/g;)Ljava/lang/Object;", "delegate", "h", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6286g implements InterfaceC6009d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6009d.a callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean useNoBackupDirectory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean allowDataLossOnRecovery;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<c> lazyDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean writeAheadLoggingEnabled;

    /* JADX INFO: renamed from: h5.g$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, m31665d2 = {"Lh5/g$b;", "", "Lh5/e;", "db", "<init>", "(Lh5/e;)V", "a", "Lh5/e;", "()Lh5/e;", "b", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public C6284e db;

        public b(@Nullable C6284e c6284e) {
            this.db = c6284e;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C6284e getDb() {
            return this.db;
        }

        /* JADX INFO: renamed from: b */
        public final void m27560b(@Nullable C6284e c6284e) {
            this.db = c6284e;
        }
    }

    /* JADX INFO: renamed from: h5.g$c */
    @Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 <2\u00020\u0001:\u0003(,\u0010B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0019J'\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00103R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00108R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103¨\u0006="}, m31665d2 = {"Lh5/g$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Lh5/g$b;", "dbRef", "Lg5/d$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lh5/g$b;Lg5/d$a;Z)V", "writable", "Lg5/c;", "c", "(Z)Lg5/c;", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lh5/e;", "d", "(Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "f", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "e", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lh5/g$b;", "getDbRef", "()Lh5/g$b;", "Lg5/d$a;", "getCallback", "()Lg5/d$a;", "Z", "getAllowDataLossOnRecovery", "()Z", "migrated", "Lj5/a;", "Lj5/a;", "lock", "g", "opened", "h", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final b dbRef;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC6009d.a callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean allowDataLossOnRecovery;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean migrated;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final C7031a lock;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean opened;

        /* JADX INFO: renamed from: h5.g$c$a */
        @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lh5/g$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lh5/g$c$b;", "callbackName", "", "cause", "<init>", "(Lh5/g$c$b;Ljava/lang/Throwable;)V", "a", "Lh5/g$c$b;", "()Lh5/g$c$b;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final b callbackName;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @NotNull
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: h5.g$c$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lh5/g$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN;


            /* JADX INFO: renamed from: g */
            public static final /* synthetic */ InterfaceC10707a f23868g = C10708b.m40805a(m27568a());
        }

        /* JADX INFO: renamed from: h5.g$c$c, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lh5/g$c$c;", "", "<init>", "()V", "Lh5/g$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lh5/e;", "a", "(Lh5/g$b;Landroid/database/sqlite/SQLiteDatabase;)Lh5/e;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: h5.g.c.c.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final C6284e m27569a(@NotNull b refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                C6284e db2 = refHolder.getDb();
                if (db2 != null && db2.m27551m(sqLiteDatabase)) {
                    return db2;
                }
                C6284e c6284e = new C6284e(sqLiteDatabase);
                refHolder.m27560b(c6284e);
                return c6284e;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX INFO: renamed from: h5.g$c$d */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f23869a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f23869a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Context context, @Nullable String str, @NotNull final b dbRef, @NotNull final InterfaceC6009d.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: h5.h
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C6286g.c.m27562b(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            } else {
                string = str;
            }
            this.lock = new C7031a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: renamed from: b */
        public static final void m27562b(InterfaceC6009d.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            Companion companion = INSTANCE;
            Intrinsics.checkNotNull(sQLiteDatabase);
            aVar.m26782c(companion.m27569a(bVar, sQLiteDatabase));
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final InterfaceC6008c m27563c(boolean writable) {
            InterfaceC6008c interfaceC6008cM27564d;
            try {
                this.lock.m29713b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseM27566f = m27566f(writable);
                if (this.migrated) {
                    close();
                    interfaceC6008cM27564d = m27563c(writable);
                } else {
                    interfaceC6008cM27564d = m27564d(sQLiteDatabaseM27566f);
                }
                return interfaceC6008cM27564d;
            } finally {
                this.lock.m29714d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C7031a.m29712c(this.lock, false, 1, null);
                super.close();
                this.dbRef.m27560b(null);
                this.opened = false;
            } finally {
                this.lock.m29714d();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C6284e m27564d(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.m27569a(this.dbRef, sqLiteDatabase);
        }

        /* JADX INFO: renamed from: e */
        public final SQLiteDatabase m27565e(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNull(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNull(readableDatabase);
            return readableDatabase;
        }

        /* JADX INFO: renamed from: f */
        public final SQLiteDatabase m27566f(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z10 = this.opened;
            if (databaseName != null && !z10 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m27565e(writable);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m27565e(writable);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        Throwable cause = aVar.getCause();
                        int i10 = d.f23869a[aVar.getCallbackName().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                            throw cause;
                        }
                        if (i10 != 5) {
                            throw new C7345l();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return m27565e(writable);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.migrated && this.callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.m26781b(m27564d(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.mo26783d(m27564d(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@NotNull SQLiteDatabase db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.migrated = true;
            try {
                this.callback.mo26784e(m27564d(db2), oldVersion, newVersion);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.migrated) {
                try {
                    this.callback.mo26785f(m27564d(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.mo26786g(m27564d(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    public C6286g(@NotNull Context context, @Nullable String str, @NotNull InterfaceC6009d.a callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z10;
        this.allowDataLossOnRecovery = z11;
        this.lazyDelegate = C7342i.m30456b(new Function0() { // from class: h5.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6286g.m27557c(this.f23842a);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final c m27557c(C6286g c6286g) {
        c cVar;
        if (c6286g.name == null || !c6286g.useNoBackupDirectory) {
            cVar = new c(c6286g.context, c6286g.name, new b(null), c6286g.callback, c6286g.allowDataLossOnRecovery);
        } else {
            cVar = new c(c6286g.context, new File(C6007b.m26778a(c6286g.context), c6286g.name).getAbsolutePath(), new b(null), c6286g.callback, c6286g.allowDataLossOnRecovery);
        }
        cVar.setWriteAheadLoggingEnabled(c6286g.writeAheadLoggingEnabled);
        return cVar;
    }

    /* JADX INFO: renamed from: b */
    public final c m27558b() {
        return this.lazyDelegate.getValue();
    }

    @Override // p145g5.InterfaceC6009d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            m27558b().close();
        }
    }

    @Override // p145g5.InterfaceC6009d
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // p145g5.InterfaceC6009d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.isInitialized()) {
            m27558b().setWriteAheadLoggingEnabled(enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }

    @Override // p145g5.InterfaceC6009d
    @NotNull
    /* JADX INFO: renamed from: t2 */
    public InterfaceC6008c mo6885t2() {
        return m27558b().m27563c(true);
    }
}
