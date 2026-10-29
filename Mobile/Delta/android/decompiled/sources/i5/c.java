package i5;

import android.database.Cursor;
import g5.f;
import g5.g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import jt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \t2\u00020\u0001:\u0005\u000b\u0017\u000e\t\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Li5/c;", "Lf5/d;", "Lg5/c;", "db", "", "sql", "<init>", "(Lg5/c;Ljava/lang/String;)V", "", "d", "()V", "a", "Lg5/c;", "()Lg5/c;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "", "c", "Z", "isClosed", "()Z", "(Z)V", "e", "Li5/c$b;", "Li5/c$c;", "Li5/c$d;", "Li5/c$e;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c implements f5.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g5.c db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sql;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: i5.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Li5/c$a;", "", "<init>", "()V", "Lg5/c;", "db", "", "sql", "Li5/c;", "a", "(Lg5/c;Ljava/lang/String;)Li5/c;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "prefix", "Li5/c$a$b;", "e", "(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$b;", "Li5/c$a$a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$a;", "", "f", "(Ljava/lang/String;)Z", "s", "", "d", "(Ljava/lang/String;)I", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i5.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Li5/c$a$a;", "", "<init>", "()V", "a", "Li5/c$a$a$a;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class AbstractC0358a {

            /* JADX INFO: renamed from: i5.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/c$a$a$a;", "Li5/c$a$a;", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0359a extends AbstractC0358a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0359a f20265a = new C0359a();

                public C0359a() {
                    super(null);
                }
            }

            public /* synthetic */ AbstractC0358a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public AbstractC0358a() {
            }
        }

        /* JADX INFO: renamed from: i5.c$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Li5/c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            END,
            ROLLBACK,
            BEGIN_EXCLUSIVE,
            BEGIN_IMMEDIATE,
            BEGIN_DEFERRED;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ qt.a f20271g = qt.b.a(a());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull g5.c db2, @NotNull String sql) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            String upperCase = StringsKt.p1(sql).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strC = c(upperCase);
            if (strC == null) {
                return new C0360c(db2, sql);
            }
            b bVarE = e(strC, upperCase);
            if (bVarE != null) {
                return new e(db2, sql, bVarE);
            }
            if (b(strC, upperCase) instanceof AbstractC0358a.C0359a) {
                return new b(db2, sql, new d(db2, sql));
            }
            return f(strC) ? new d(db2, sql) : new C0360c(db2, sql);
        }

        public final AbstractC0358a b(String prefix, String sql) {
            if (Intrinsics.c(prefix, "PRA")) {
                String lowerCase = sql.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.a0(StringsKt.Z0(lowerCase, "journal_mode", ""), "=", false, 2, null)) {
                    return AbstractC0358a.C0359a.f20265a;
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
        
            return i5.c.Companion.b.f20266a;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final i5.c.Companion.b e(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                int r0 = r5.hashCode()
                r1 = 2
                r2 = 0
                r3 = 0
                switch(r0) {
                    case 65636: goto L35;
                    case 66913: goto L29;
                    case 68795: goto L20;
                    case 81327: goto Lb;
                    default: goto La;
                }
            La:
                goto L3d
            Lb:
                java.lang.String r0 = "ROL"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L14
                goto L3d
            L14:
                java.lang.String r5 = " TO "
                boolean r5 = kotlin.text.StringsKt.a0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L1d
                return r3
            L1d:
                i5.c$a$b r5 = i5.c.Companion.b.ROLLBACK
                return r5
            L20:
                java.lang.String r6 = "END"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L32
                goto L3d
            L29:
                java.lang.String r6 = "COM"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L32
                goto L3d
            L32:
                i5.c$a$b r5 = i5.c.Companion.b.END
                return r5
            L35:
                java.lang.String r0 = "BEG"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L3e
            L3d:
                return r3
            L3e:
                java.lang.String r5 = "EXCLUSIVE"
                boolean r5 = kotlin.text.StringsKt.a0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L49
                i5.c$a$b r5 = i5.c.Companion.b.BEGIN_EXCLUSIVE
                return r5
            L49:
                java.lang.String r5 = "IMMEDIATE"
                boolean r5 = kotlin.text.StringsKt.a0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L54
                i5.c$a$b r5 = i5.c.Companion.b.BEGIN_IMMEDIATE
                return r5
            L54:
                i5.c$a$b r5 = i5.c.Companion.b.BEGIN_DEFERRED
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.c.Companion.e(java.lang.String, java.lang.String):i5.c$a$b");
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

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b*\u0010(R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Li5/c$b;", "Li5/c;", "Lf5/d;", "Lg5/c;", "db", "", "sql", "delegate", "<init>", "(Lg5/c;Ljava/lang/String;Li5/c;)V", "", "g3", "()Z", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "a2", "(I)Z", "E2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "reset", "()V", "E", "close", "e", "Li5/c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c implements f5.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull g5.c db2, @NotNull String sql, @NotNull c delegate) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.A(index, value);
        }

        @Override // f5.d
        public void C(int index) {
            this.delegate.C(index);
        }

        @Override // f5.d
        public void E() {
            this.delegate.E();
        }

        @Override // f5.d
        @NotNull
        public String E2(int index) {
            return this.delegate.E2(index);
        }

        @Override // f5.d
        public boolean a2(int index) {
            return this.delegate.a2(index);
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // f5.d
        public boolean g3() {
            boolean zG3 = this.delegate.g3();
            if (x.E(E2(0), "wal", true)) {
                getDb().p0();
                return zG3;
            }
            getDb().Q();
            return zG3;
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // f5.d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // f5.d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // f5.d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // f5.d
        public void k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.k0(index, value);
        }

        @Override // f5.d
        public void reset() {
            this.delegate.reset();
        }

        @Override // f5.d
        public void z(int index, long value) {
            this.delegate.z(index, value);
        }
    }

    /* JADX INFO: renamed from: i5.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010%R\u0018\u0010,\u001a\u00060(j\u0002`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Li5/c$c;", "Li5/c;", "Lg5/c;", "db", "", "sql", "<init>", "(Lg5/c;Ljava/lang/String;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "Lg5/g;", "Landroidx/sqlite/driver/SupportStatement;", "e", "Lg5/g;", "delegate", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0360c extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0360c(@NotNull g5.c db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.delegate = db2.T1(sql);
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            this.delegate.A(index, value);
        }

        @Override // f5.d
        public void C(int index) {
            d();
            this.delegate.C(index);
        }

        @Override // f5.d
        public void E() {
            d();
            this.delegate.E();
        }

        @Override // f5.d
        @NotNull
        public String E2(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            c(true);
        }

        @Override // f5.d
        public boolean g3() {
            d();
            this.delegate.execute();
            return false;
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public long getLong(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public boolean isNull(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public void k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            this.delegate.L1(index, value);
        }

        @Override // f5.d
        public void reset() {
            d();
        }

        @Override // f5.d
        public void z(int index, long value) {
            d();
            this.delegate.z(index, value);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001IB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010%J\u001f\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010%J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020,2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Li5/c$d;", "Li5/c;", "Lg5/c;", "db", "", "sql", "<init>", "(Lg5/c;Ljava/lang/String;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "columnType", "l", "(II)V", "m", "Landroid/database/Cursor;", "o", "()Landroid/database/Cursor;", "c", "n", "(Landroid/database/Cursor;I)V", "", "e", "[I", "bindingTypes", "", "f", "[J", "longBindings", "", "g", "[D", "doubleBindings", "", "h", "[Ljava/lang/String;", "stringBindings", "i", "[[B", "blobBindings", "j", "Landroid/database/Cursor;", "cursor", "k", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"i5/c$d$b", "Lg5/f;", "Lg5/e;", "statement", "", "b", "(Lg5/e;)V", "", "a", "()Ljava/lang/String;", "sql", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements f {
            public b() {
            }

            @Override // g5.f
            public String a() {
                return d.this.getSql();
            }

            @Override // g5.f
            public void b(g5.e statement) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                int length = d.this.bindingTypes.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = d.this.bindingTypes[i10];
                    if (i11 == 1) {
                        statement.z(i10, d.this.longBindings[i10]);
                    } else if (i11 == 2) {
                        statement.c0(i10, d.this.doubleBindings[i10]);
                    } else if (i11 == 3) {
                        String str = d.this.stringBindings[i10];
                        Intrinsics.checkNotNull(str);
                        statement.L1(i10, str);
                    } else if (i11 == 4) {
                        byte[] bArr = d.this.blobBindings[i10];
                        Intrinsics.checkNotNull(bArr);
                        statement.A(i10, bArr);
                    } else if (i11 == 5) {
                        statement.C(i10);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull g5.c db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            l(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // f5.d
        public void C(int index) {
            d();
            l(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // f5.d
        public void E() {
            d();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // f5.d
        @NotNull
        public String E2(int index) {
            d();
            Cursor cursorO = o();
            n(cursorO, index);
            String string = cursorO.getString(index);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                E();
                reset();
            }
            c(true);
        }

        @Override // f5.d
        public boolean g3() {
            d();
            m();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            d();
            Cursor cursorO = o();
            n(cursorO, index);
            byte[] blob = cursorO.getBlob(index);
            Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
            return blob;
        }

        @Override // f5.d
        public int getColumnCount() {
            d();
            m();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            d();
            m();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            n(cursor, index);
            String columnName = cursor.getColumnName(index);
            Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // f5.d
        public long getLong(int index) {
            d();
            Cursor cursorO = o();
            n(cursorO, index);
            return cursorO.getLong(index);
        }

        @Override // f5.d
        public boolean isNull(int index) {
            d();
            Cursor cursorO = o();
            n(cursorO, index);
            return cursorO.isNull(index);
        }

        @Override // f5.d
        public void k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            l(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        public final void l(int columnType, int index) {
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

        public final void m() {
            if (this.cursor == null) {
                this.cursor = getDb().U1(new b());
            }
        }

        public final void n(Cursor c10, int index) {
            if (index < 0 || index >= c10.getColumnCount()) {
                f5.a.b(25, "column index out of range");
                throw new jt.d();
            }
        }

        public final Cursor o() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public void reset() {
            d();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // f5.d
        public void z(int index, long value) {
            d();
            l(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Li5/c$e;", "Li5/c;", "Lg5/c;", "db", "", "sql", "Li5/c$a$b;", "operation", "<init>", "(Lg5/c;Ljava/lang/String;Li5/c$a$b;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "e", "Li5/c$a$b;", "getOperation", "()Li5/c$a$b;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Companion.b operation;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20283a;

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
                f20283a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull g5.c db2, @NotNull String sql, @NotNull Companion.b operation) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            f5.a.b(25, "column index out of range");
            throw new jt.d();
        }

        @Override // f5.d
        public void C(int index) {
            d();
            f5.a.b(25, "column index out of range");
            throw new jt.d();
        }

        @Override // f5.d
        public void E() {
            d();
        }

        @Override // f5.d
        @NotNull
        public String E2(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() {
            c(true);
        }

        @Override // f5.d
        public boolean g3() {
            int i10 = a.f20283a[this.operation.ordinal()];
            if (i10 == 1) {
                getDb().q0();
                getDb().G0();
                return false;
            }
            if (i10 == 2) {
                getDb().G0();
                return false;
            }
            if (i10 == 3) {
                getDb().G();
                return false;
            }
            if (i10 == 4) {
                getDb().u0();
                return false;
            }
            if (i10 != 5) {
                throw new l();
            }
            getDb().Y1();
            return false;
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public int getColumnCount() {
            d();
            return 0;
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public long getLong(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public boolean isNull(int index) {
            d();
            f5.a.b(21, "no row");
            throw new jt.d();
        }

        @Override // f5.d
        public void k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            d();
            f5.a.b(25, "column index out of range");
            throw new jt.d();
        }

        @Override // f5.d
        public void reset() {
            d();
        }

        @Override // f5.d
        public void z(int index, long value) {
            d();
            f5.a.b(25, "column index out of range");
            throw new jt.d();
        }
    }

    public /* synthetic */ c(g5.c cVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g5.c getDb() {
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
            f5.a.b(21, "statement is closed");
            throw new jt.d();
        }
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public c(g5.c cVar, String str) {
        this.db = cVar;
        this.sql = str;
    }
}
