package j5;

import android.database.Cursor;
import com.github.luben.zstd.BuildConfig;
import h5.f;
import h5.g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;
import zt.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \t2\u00020\u0001:\u0005\u000b\u0017\u000e\t\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lj5/c;", "Lg5/d;", "Lh5/c;", "db", BuildConfig.FLAVOR, "sql", "<init>", "(Lh5/c;Ljava/lang/String;)V", BuildConfig.FLAVOR, "d", "()V", "a", "Lh5/c;", "()Lh5/c;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", BuildConfig.FLAVOR, "c", "Z", "isClosed", "()Z", "(Z)V", "e", "Lj5/c$b;", "Lj5/c$c;", "Lj5/c$d;", "Lj5/c$e;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c implements g5.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h5.c db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sql;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: j5.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lj5/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lh5/c;", "db", BuildConfig.FLAVOR, "sql", "Lj5/c;", "a", "(Lh5/c;Ljava/lang/String;)Lj5/c;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "prefix", "Lj5/c$a$b;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lj5/c$a$b;", "Lj5/c$a$a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lj5/c$a$a;", BuildConfig.FLAVOR, "f", "(Ljava/lang/String;)Z", "s", BuildConfig.FLAVOR, "d", "(Ljava/lang/String;)I", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j5.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lj5/c$a$a;", BuildConfig.FLAVOR, "<init>", "()V", "a", "Lj5/c$a$a$a;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class AbstractC0378a {

            /* JADX INFO: renamed from: j5.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj5/c$a$a$a;", "Lj5/c$a$a;", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0379a extends AbstractC0378a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0379a f20067a = new C0379a();

                public C0379a() {
                    super(null);
                }
            }

            public /* synthetic */ AbstractC0378a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public AbstractC0378a() {
            }
        }

        /* JADX INFO: renamed from: j5.c$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lj5/c$a$b;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            END,
            ROLLBACK,
            BEGIN_EXCLUSIVE,
            BEGIN_IMMEDIATE,
            BEGIN_DEFERRED;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ hu.a f20073g = hu.b.a(a());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull h5.c db2, @NotNull String sql) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            String upperCase = StringsKt.n1(sql).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strC = c(upperCase);
            if (strC == null) {
                return new C0380c(db2, sql);
            }
            b bVarE = e(strC, upperCase);
            if (bVarE != null) {
                return new e(db2, sql, bVarE);
            }
            if (b(strC, upperCase) instanceof AbstractC0378a.C0379a) {
                return new b(db2, sql, new d(db2, sql));
            }
            return f(strC) ? new d(db2, sql) : new C0380c(db2, sql);
        }

        public final AbstractC0378a b(String prefix, String sql) {
            if (Intrinsics.c(prefix, "PRA")) {
                String lowerCase = sql.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.a0(StringsKt.X0(lowerCase, "journal_mode", BuildConfig.FLAVOR), "=", false, 2, null)) {
                    return AbstractC0378a.C0379a.f20067a;
                }
            }
            return null;
        }

        @Nullable
        public final String c(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            int iD = d(sql);
            if (iD < 0 || iD > sql.length()) {
                return null;
            }
            String strSubstring = sql.substring(iD, Math.min(iD + 3, sql.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }

        public final int d(String s8) {
            String str;
            int i10;
            int length = s8.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = s8.charAt(i11);
                if (Intrinsics.f(cCharAt, 32) <= 0) {
                    i11++;
                } else {
                    if (cCharAt != '-') {
                        str = s8;
                        if (cCharAt == '/') {
                            int iM0 = i11 + 1;
                            if (str.charAt(iM0) == '*') {
                                do {
                                    String str2 = str;
                                    iM0 = StringsKt.m0(str2, '*', iM0 + 1, false, 4, null);
                                    str = str2;
                                    if (iM0 >= 0) {
                                        i10 = iM0 + 1;
                                        if (i10 >= length) {
                                            break;
                                        }
                                    } else {
                                        return -1;
                                    }
                                } while (str.charAt(i10) != '/');
                                i11 = iM0 + 2;
                                s8 = str;
                            }
                        }
                        return i11;
                    }
                    if (s8.charAt(i11 + 1) != '-') {
                        return i11;
                    }
                    str = s8;
                    int iM1 = StringsKt.m0(str, '\n', i11 + 2, false, 4, null);
                    if (iM1 < 0) {
                        return -1;
                    }
                    i11 = iM1 + 1;
                    s8 = str;
                }
            }
            return -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            if (r5.equals("END") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r5.equals("COM") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            return j5.c.Companion.b.f20068a;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b e(String prefix, String sql) {
            switch (prefix.hashCode()) {
                case 65636:
                    if (prefix.equals("BEG")) {
                        if (StringsKt.a0(sql, "EXCLUSIVE", false, 2, null)) {
                            return b.BEGIN_EXCLUSIVE;
                        }
                        return StringsKt.a0(sql, "IMMEDIATE", false, 2, null) ? b.BEGIN_IMMEDIATE : b.BEGIN_DEFERRED;
                    }
                    return null;
                case 66913:
                    break;
                case 68795:
                    break;
                case 81327:
                    if (prefix.equals("ROL") && !StringsKt.a0(sql, " TO ", false, 2, null)) {
                        return b.ROLLBACK;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final boolean f(String prefix) {
            int iHashCode = prefix.hashCode();
            if (iHashCode == 79487) {
                return prefix.equals("PRA");
            }
            if (iHashCode != 81978) {
                return iHashCode == 85954 && prefix.equals("WIT");
            }
            return prefix.equals("SEL");
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b*\u0010(R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lj5/c$b;", "Lj5/c;", "Lg5/d;", "Lh5/c;", "db", BuildConfig.FLAVOR, "sql", "delegate", "<init>", "(Lh5/c;Ljava/lang/String;Lj5/c;)V", BuildConfig.FLAVOR, "n3", "()Z", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "C", "(I[B)V", BuildConfig.FLAVOR, "B", "(IJ)V", "m0", "(ILjava/lang/String;)V", "F", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "d2", "(I)Z", "I2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "reset", "()V", "H", "close", "e", "Lj5/c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c implements g5.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull h5.c db2, @NotNull String sql, @NotNull c delegate) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // g5.d
        public void B(int index, long value) {
            this.delegate.B(index, value);
        }

        @Override // g5.d
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.C(index, value);
        }

        @Override // g5.d
        public void F(int index) {
            this.delegate.F(index);
        }

        @Override // g5.d
        public void H() {
            this.delegate.H();
        }

        @Override // g5.d
        @NotNull
        public String I2(int index) {
            return this.delegate.I2(index);
        }

        @Override // g5.d, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // g5.d
        public boolean d2(int index) {
            return this.delegate.d2(index);
        }

        @Override // g5.d
        @NotNull
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // g5.d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // g5.d
        @NotNull
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // g5.d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // g5.d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // g5.d
        public void m0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.m0(index, value);
        }

        @Override // g5.d
        public boolean n3() {
            boolean zN3 = this.delegate.n3();
            if (x.E(I2(0), "wal", true)) {
                getDb().q0();
                return zN3;
            }
            getDb().U();
            return zN3;
        }

        @Override // g5.d
        public void reset() {
            this.delegate.reset();
        }
    }

    /* JADX INFO: renamed from: j5.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010%R\u0018\u0010,\u001a\u00060(j\u0002`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lj5/c$c;", "Lj5/c;", "Lh5/c;", "db", BuildConfig.FLAVOR, "sql", "<init>", "(Lh5/c;Ljava/lang/String;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "C", "(I[B)V", BuildConfig.FLAVOR, "B", "(IJ)V", "m0", "(ILjava/lang/String;)V", "F", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "I2", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "n3", "()Z", "reset", "()V", "H", "close", "Lh5/g;", "Landroidx/sqlite/driver/SupportStatement;", "e", "Lh5/g;", "delegate", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0380c extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0380c(@NotNull h5.c db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.delegate = db2.X1(sql);
        }

        @Override // g5.d
        public void B(int index, long value) {
            d();
            this.delegate.B(index, value);
        }

        @Override // g5.d
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            this.delegate.C(index, value);
        }

        @Override // g5.d
        public void F(int index) {
            d();
            this.delegate.F(index);
        }

        @Override // g5.d
        public void H() {
            d();
            this.delegate.H();
        }

        @Override // g5.d
        @NotNull
        public String I2(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            c(true);
        }

        @Override // g5.d
        @NotNull
        public byte[] getBlob(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // g5.d
        @NotNull
        public String getColumnName(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public long getLong(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public boolean isNull(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public void m0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            this.delegate.N1(index, value);
        }

        @Override // g5.d
        public boolean n3() {
            d();
            this.delegate.j();
            return false;
        }

        @Override // g5.d
        public void reset() {
            d();
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001IB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010%J\u001f\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010%J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020,2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lj5/c$d;", "Lj5/c;", "Lh5/c;", "db", BuildConfig.FLAVOR, "sql", "<init>", "(Lh5/c;Ljava/lang/String;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "C", "(I[B)V", BuildConfig.FLAVOR, "B", "(IJ)V", "m0", "(ILjava/lang/String;)V", "F", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "I2", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "n3", "()Z", "reset", "()V", "H", "close", "columnType", "m", "(II)V", "n", "Landroid/database/Cursor;", "p", "()Landroid/database/Cursor;", "c", "o", "(Landroid/database/Cursor;I)V", BuildConfig.FLAVOR, "e", "[I", "bindingTypes", BuildConfig.FLAVOR, "f", "[J", "longBindings", BuildConfig.FLAVOR, "g", "[D", "doubleBindings", BuildConfig.FLAVOR, "h", "[Ljava/lang/String;", "stringBindings", "i", "[[B", "blobBindings", "j", "Landroid/database/Cursor;", "cursor", "k", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public int[] bindingTypes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public long[] longBindings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public double[] doubleBindings;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String[] stringBindings;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public byte[][] blobBindings;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Cursor cursor;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"j5/c$d$b", "Lh5/f;", "Lh5/e;", "statement", BuildConfig.FLAVOR, "a", "(Lh5/e;)V", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "sql", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements f {
            public b() {
            }

            @Override // h5.f
            public void a(h5.e statement) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                int length = d.this.bindingTypes.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = d.this.bindingTypes[i10];
                    if (i11 == 1) {
                        statement.B(i10, d.this.longBindings[i10]);
                    } else if (i11 == 2) {
                        statement.g0(i10, d.this.doubleBindings[i10]);
                    } else if (i11 == 3) {
                        String str = d.this.stringBindings[i10];
                        Intrinsics.checkNotNull(str);
                        statement.N1(i10, str);
                    } else if (i11 == 4) {
                        byte[] bArr = d.this.blobBindings[i10];
                        Intrinsics.checkNotNull(bArr);
                        statement.C(i10, bArr);
                    } else if (i11 == 5) {
                        statement.F(i10);
                    }
                }
            }

            @Override // h5.f
            public String b() {
                return d.this.getSql();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull h5.c db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // g5.d
        public void B(int index, long value) {
            d();
            m(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // g5.d
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            m(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // g5.d
        public void F(int index) {
            d();
            m(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // g5.d
        public void H() {
            d();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // g5.d
        @NotNull
        public String I2(int index) {
            d();
            Cursor cursorP = p();
            o(cursorP, index);
            String string = cursorP.getString(index);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // g5.d, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                H();
                reset();
            }
            c(true);
        }

        @Override // g5.d
        @NotNull
        public byte[] getBlob(int index) {
            d();
            Cursor cursorP = p();
            o(cursorP, index);
            byte[] blob = cursorP.getBlob(index);
            Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
            return blob;
        }

        @Override // g5.d
        public int getColumnCount() {
            d();
            n();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // g5.d
        @NotNull
        public String getColumnName(int index) {
            d();
            n();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            o(cursor, index);
            String columnName = cursor.getColumnName(index);
            Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // g5.d
        public long getLong(int index) {
            d();
            Cursor cursorP = p();
            o(cursorP, index);
            return cursorP.getLong(index);
        }

        @Override // g5.d
        public boolean isNull(int index) {
            d();
            Cursor cursorP = p();
            o(cursorP, index);
            return cursorP.isNull(index);
        }

        public final void m(int columnType, int index) {
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

        @Override // g5.d
        public void m0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            m(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        public final void n() {
            if (this.cursor == null) {
                this.cursor = getDb().C0(new b());
            }
        }

        @Override // g5.d
        public boolean n3() {
            d();
            n();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final void o(Cursor c10, int index) {
            if (index < 0 || index >= c10.getColumnCount()) {
                g5.a.b(25, "column index out of range");
                throw new zt.d();
            }
        }

        public final Cursor p() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public void reset() {
            d();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lj5/c$e;", "Lj5/c;", "Lh5/c;", "db", BuildConfig.FLAVOR, "sql", "Lj5/c$a$b;", "operation", "<init>", "(Lh5/c;Ljava/lang/String;Lj5/c$a$b;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "C", "(I[B)V", BuildConfig.FLAVOR, "B", "(IJ)V", "m0", "(ILjava/lang/String;)V", "F", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "I2", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "n3", "()Z", "reset", "()V", "H", "close", "e", "Lj5/c$a$b;", "getOperation", "()Lj5/c$a$b;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Companion.b operation;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20085a;

            static {
                int[] iArr = new int[Companion.b.values().length];
                try {
                    iArr[Companion.b.END.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Companion.b.ROLLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Companion.b.BEGIN_EXCLUSIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Companion.b.BEGIN_IMMEDIATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Companion.b.BEGIN_DEFERRED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f20085a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull h5.c db2, @NotNull String sql, @NotNull Companion.b operation) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @Override // g5.d
        public void B(int index, long value) {
            d();
            g5.a.b(25, "column index out of range");
            throw new zt.d();
        }

        @Override // g5.d
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            g5.a.b(25, "column index out of range");
            throw new zt.d();
        }

        @Override // g5.d
        public void F(int index) {
            d();
            g5.a.b(25, "column index out of range");
            throw new zt.d();
        }

        @Override // g5.d
        public void H() {
            d();
        }

        @Override // g5.d
        @NotNull
        public String I2(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d, java.lang.AutoCloseable
        public void close() {
            c(true);
        }

        @Override // g5.d
        @NotNull
        public byte[] getBlob(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // g5.d
        @NotNull
        public String getColumnName(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public long getLong(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public boolean isNull(int index) {
            d();
            g5.a.b(21, "no row");
            throw new zt.d();
        }

        @Override // g5.d
        public void m0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            g5.a.b(25, "column index out of range");
            throw new zt.d();
        }

        @Override // g5.d
        public boolean n3() {
            int i10 = a.f20085a[this.operation.ordinal()];
            if (i10 == 1) {
                getDb().r0();
                getDb().H0();
                return false;
            }
            if (i10 == 2) {
                getDb().H0();
                return false;
            }
            if (i10 == 3) {
                getDb().J();
                return false;
            }
            if (i10 == 4) {
                getDb().u0();
                return false;
            }
            if (i10 != 5) {
                throw new l();
            }
            getDb().b2();
            return false;
        }

        @Override // g5.d
        public void reset() {
            d();
        }
    }

    public /* synthetic */ c(h5.c cVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h5.c getDb() {
        return this.db;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSql() {
        return this.sql;
    }

    public final void c(boolean z10) {
        this.isClosed = z10;
    }

    public final void d() {
        if (this.isClosed) {
            g5.a.b(21, "statement is closed");
            throw new zt.d();
        }
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public c(h5.c cVar, String str) {
        this.db = cVar;
        this.sql = str;
    }
}
