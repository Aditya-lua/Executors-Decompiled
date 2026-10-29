package p187i5;

import android.database.Cursor;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.C5358a;
import p119f5.InterfaceC5361d;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6010e;
import p145g5.InterfaceC6011f;
import p145g5.InterfaceC6012g;
import p229jt.C7334d;
import p229jt.C7345l;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: i5.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \t2\u00020\u0001:\u0005\u000b\u0017\u000e\t\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m31665d2 = {"Li5/c;", "Lf5/d;", "Lg5/c;", "db", "", "sql", "<init>", "(Lg5/c;Ljava/lang/String;)V", "", "d", "()V", "a", "Lg5/c;", "()Lg5/c;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "", "c", "Z", "isClosed", "()Z", "(Z)V", "e", "Li5/c$b;", "Li5/c$c;", "Li5/c$d;", "Li5/c$e;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC6641c implements InterfaceC5361d {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6008c db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sql;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: i5.c$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Li5/c$a;", "", "<init>", "()V", "Lg5/c;", "db", "", "sql", "Li5/c;", "a", "(Lg5/c;Ljava/lang/String;)Li5/c;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "prefix", "Li5/c$a$b;", "e", "(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$b;", "Li5/c$a$a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Li5/c$a$a;", "", "f", "(Ljava/lang/String;)Z", "s", "", "d", "(Ljava/lang/String;)I", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i5.c$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Li5/c$a$a;", "", "<init>", "()V", "a", "Li5/c$a$a$a;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static abstract class AbstractC14183a {

            /* JADX INFO: renamed from: i5.c$a$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Li5/c$a$a$a;", "Li5/c$a$a;", "<init>", "()V", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14184a extends AbstractC14183a {

                /* JADX INFO: renamed from: a */
                @NotNull
                public static final C14184a f25602a = new C14184a();

                public C14184a() {
                    super(null);
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: i5.c.a.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ AbstractC14183a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public AbstractC14183a() {
            }
        }

        /* JADX INFO: renamed from: i5.c$a$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Li5/c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public enum b {
            END,
            ROLLBACK,
            BEGIN_EXCLUSIVE,
            BEGIN_IMMEDIATE,
            BEGIN_DEFERRED;


            /* JADX INFO: renamed from: g */
            public static final /* synthetic */ InterfaceC10707a f25609g = C10708b.m40805a(m28646a());
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: i5.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC6641c m28640a(@NotNull InterfaceC6008c db2, @NotNull String sql) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            String upperCase = StringsKt.m32183p1(sql).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strM28642c = m28642c(upperCase);
            if (strM28642c == null) {
                return new c(db2, sql);
            }
            b bVarM28644e = m28644e(strM28642c, upperCase);
            if (bVarM28644e != null) {
                return new e(db2, sql, bVarM28644e);
            }
            if (m28641b(strM28642c, upperCase) instanceof AbstractC14183a.C14184a) {
                return new b(db2, sql, new d(db2, sql));
            }
            return m28645f(strM28642c) ? new d(db2, sql) : new c(db2, sql);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC14183a m28641b(String prefix, String sql) {
            if (Intrinsics.m31980c(prefix, "PRA")) {
                String lowerCase = sql.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.m32152a0(StringsKt.m32151Z0(lowerCase, "journal_mode", ""), "=", false, 2, null)) {
                    return AbstractC14183a.C14184a.f25602a;
                }
            }
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m28642c(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            int iM28643d = m28643d(sql);
            if (iM28643d < 0 || iM28643d > sql.length()) {
                return null;
            }
            String strSubstring = sql.substring(iM28643d, Math.min(iM28643d + 3, sql.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: d */
        public final int m28643d(String s8) {
            String str;
            int i10;
            int length = s8.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = s8.charAt(i11);
                if (Intrinsics.m31983f(cCharAt, 32) <= 0) {
                    i11++;
                } else {
                    if (cCharAt != '-') {
                        str = s8;
                        if (cCharAt == '/') {
                            int iM0 = i11 + 1;
                            if (str.charAt(iM0) == '*') {
                                do {
                                    String str2 = str;
                                    iM0 = StringsKt.m32176m0(str2, '*', iM0 + 1, false, 4, null);
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
                    int iM1 = StringsKt.m32176m0(str, '\n', i11 + 2, false, 4, null);
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
        
            return p187i5.AbstractC6641c.Companion.b.f25603a;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b m28644e(String prefix, String sql) {
            switch (prefix.hashCode()) {
                case 65636:
                    if (prefix.equals("BEG")) {
                        if (StringsKt.m32152a0(sql, "EXCLUSIVE", false, 2, null)) {
                            return b.BEGIN_EXCLUSIVE;
                        }
                        return StringsKt.m32152a0(sql, "IMMEDIATE", false, 2, null) ? b.BEGIN_IMMEDIATE : b.BEGIN_DEFERRED;
                    }
                    return null;
                case 66913:
                    break;
                case 68795:
                    break;
                case 81327:
                    if (prefix.equals("ROL") && !StringsKt.m32152a0(sql, " TO ", false, 2, null)) {
                        return b.ROLLBACK;
                    }
                    return null;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m28645f(String prefix) {
            int iHashCode = prefix.hashCode();
            if (iHashCode == 79487) {
                return prefix.equals("PRA");
            }
            if (iHashCode != 81978) {
                return iHashCode == 85954 && prefix.equals("WIT");
            }
            return prefix.equals("SEL");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: i5.c$b */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b*\u0010(R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m31665d2 = {"Li5/c$b;", "Li5/c;", "Lf5/d;", "Lg5/c;", "db", "", "sql", "delegate", "<init>", "(Lg5/c;Ljava/lang/String;Li5/c;)V", "", "g3", "()Z", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "a2", "(I)Z", "E2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "reset", "()V", "E", "close", "e", "Li5/c;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends AbstractC6641c implements InterfaceC5361d {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final AbstractC6641c delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull InterfaceC6008c db2, @NotNull String sql, @NotNull AbstractC6641c delegate) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: A */
        public void mo24699A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo24699A(index, value);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: C */
        public void mo24700C(int index) {
            this.delegate.mo24700C(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: E */
        public void mo24701E() {
            this.delegate.mo24701E();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        /* JADX INFO: renamed from: E2 */
        public String mo24702E2(int index) {
            return this.delegate.mo24702E2(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: a2 */
        public boolean mo24703a2(int index) {
            return this.delegate.mo24703a2(index);
        }

        @Override // p119f5.InterfaceC5361d, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: g3 */
        public boolean mo24704g3() {
            boolean zMo24704g3 = this.delegate.mo24704g3();
            if (C7797x.m32294E(mo24702E2(0), "wal", true)) {
                getDb().mo6904p0();
                return zMo24704g3;
            }
            getDb().mo6898Q();
            return zMo24704g3;
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // p119f5.InterfaceC5361d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // p119f5.InterfaceC5361d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // p119f5.InterfaceC5361d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: k0 */
        public void mo24705k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo24705k0(index, value);
        }

        @Override // p119f5.InterfaceC5361d
        public void reset() {
            this.delegate.reset();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: z */
        public void mo24706z(int index, long value) {
            this.delegate.mo24706z(index, value);
        }
    }

    /* JADX INFO: renamed from: i5.c$c */
    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010%R\u0018\u0010,\u001a\u00060(j\u0002`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m31665d2 = {"Li5/c$c;", "Li5/c;", "Lg5/c;", "db", "", "sql", "<init>", "(Lg5/c;Ljava/lang/String;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "Lg5/g;", "Landroidx/sqlite/driver/SupportStatement;", "e", "Lg5/g;", "delegate", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c extends AbstractC6641c {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC6012g delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull InterfaceC6008c db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.delegate = db2.mo6900T1(sql);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: A */
        public void mo24699A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m28639d();
            this.delegate.mo6916A(index, value);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: C */
        public void mo24700C(int index) {
            m28639d();
            this.delegate.mo6917C(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: E */
        public void mo24701E() {
            m28639d();
            this.delegate.mo6918E();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        /* JADX INFO: renamed from: E2 */
        public String mo24702E2(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            m28638c(true);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: g3 */
        public boolean mo24704g3() {
            m28639d();
            this.delegate.execute();
            return false;
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public byte[] getBlob(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public int getColumnCount() {
            m28639d();
            return 0;
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public String getColumnName(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public long getLong(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public boolean isNull(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: k0 */
        public void mo24705k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m28639d();
            this.delegate.mo6919L1(index, value);
        }

        @Override // p119f5.InterfaceC5361d
        public void reset() {
            m28639d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: z */
        public void mo24706z(int index, long value) {
            m28639d();
            this.delegate.mo6925z(index, value);
        }
    }

    /* JADX INFO: renamed from: i5.c$d */
    @Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001IB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010%J\u001f\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010%J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020,2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, m31665d2 = {"Li5/c$d;", "Li5/c;", "Lg5/c;", "db", "", "sql", "<init>", "(Lg5/c;Ljava/lang/String;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "columnType", "l", "(II)V", "m", "Landroid/database/Cursor;", "o", "()Landroid/database/Cursor;", "c", "n", "(Landroid/database/Cursor;I)V", "", "e", "[I", "bindingTypes", "", "f", "[J", "longBindings", "", "g", "[D", "doubleBindings", "", "h", "[Ljava/lang/String;", "stringBindings", "i", "[[B", "blobBindings", "j", "Landroid/database/Cursor;", "cursor", "k", "a", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d extends AbstractC6641c {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public int[] bindingTypes;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public long[] longBindings;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public double[] doubleBindings;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public String[] stringBindings;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public byte[][] blobBindings;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public Cursor cursor;

        /* JADX INFO: renamed from: i5.c$d$b */
        @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"i5/c$d$b", "Lg5/f;", "Lg5/e;", "statement", "", "b", "(Lg5/e;)V", "", "a", "()Ljava/lang/String;", "sql", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class b implements InterfaceC6011f {
            public b() {
            }

            @Override // p145g5.InterfaceC6011f
            /* JADX INFO: renamed from: a */
            public String mo26793a() {
                return d.this.getSql();
            }

            @Override // p145g5.InterfaceC6011f
            /* JADX INFO: renamed from: b */
            public void mo26794b(InterfaceC6010e statement) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                int length = d.this.bindingTypes.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = d.this.bindingTypes[i10];
                    if (i11 == 1) {
                        statement.mo6925z(i10, d.this.longBindings[i10]);
                    } else if (i11 == 2) {
                        statement.mo6921c0(i10, d.this.doubleBindings[i10]);
                    } else if (i11 == 3) {
                        String str = d.this.stringBindings[i10];
                        Intrinsics.checkNotNull(str);
                        statement.mo6919L1(i10, str);
                    } else if (i11 == 4) {
                        byte[] bArr = d.this.blobBindings[i10];
                        Intrinsics.checkNotNull(bArr);
                        statement.mo6916A(i10, bArr);
                    } else if (i11 == 5) {
                        statement.mo6917C(i10);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull InterfaceC6008c db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: A */
        public void mo24699A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m28639d();
            m28652l(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: C */
        public void mo24700C(int index) {
            m28639d();
            m28652l(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: E */
        public void mo24701E() {
            m28639d();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        /* JADX INFO: renamed from: E2 */
        public String mo24702E2(int index) {
            m28639d();
            Cursor cursorM28655o = m28655o();
            m28654n(cursorM28655o, index);
            String string = cursorM28655o.getString(index);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // p119f5.InterfaceC5361d, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                mo24701E();
                reset();
            }
            m28638c(true);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: g3 */
        public boolean mo24704g3() {
            m28639d();
            m28653m();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public byte[] getBlob(int index) {
            m28639d();
            Cursor cursorM28655o = m28655o();
            m28654n(cursorM28655o, index);
            byte[] blob = cursorM28655o.getBlob(index);
            Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
            return blob;
        }

        @Override // p119f5.InterfaceC5361d
        public int getColumnCount() {
            m28639d();
            m28653m();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public String getColumnName(int index) {
            m28639d();
            m28653m();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            m28654n(cursor, index);
            String columnName = cursor.getColumnName(index);
            Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // p119f5.InterfaceC5361d
        public long getLong(int index) {
            m28639d();
            Cursor cursorM28655o = m28655o();
            m28654n(cursorM28655o, index);
            return cursorM28655o.getLong(index);
        }

        @Override // p119f5.InterfaceC5361d
        public boolean isNull(int index) {
            m28639d();
            Cursor cursorM28655o = m28655o();
            m28654n(cursorM28655o, index);
            return cursorM28655o.isNull(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: k0 */
        public void mo24705k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m28639d();
            m28652l(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        /* JADX INFO: renamed from: l */
        public final void m28652l(int columnType, int index) {
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

        /* JADX INFO: renamed from: m */
        public final void m28653m() {
            if (this.cursor == null) {
                this.cursor = getDb().mo6901U1(new b());
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m28654n(Cursor c10, int index) {
            if (index < 0 || index >= c10.getColumnCount()) {
                C5358a.m24694b(25, "column index out of range");
                throw new C7334d();
            }
        }

        /* JADX INFO: renamed from: o */
        public final Cursor m28655o() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public void reset() {
            m28639d();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: z */
        public void mo24706z(int index, long value) {
            m28639d();
            m28652l(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }
    }

    /* JADX INFO: renamed from: i5.c$e */
    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m31665d2 = {"Li5/c$e;", "Li5/c;", "Lg5/c;", "db", "", "sql", "Li5/c$a$b;", "operation", "<init>", "(Lg5/c;Ljava/lang/String;Li5/c$a$b;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "e", "Li5/c$a$b;", "getOperation", "()Li5/c$a$b;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class e extends AbstractC6641c {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Companion.b operation;

        /* JADX INFO: renamed from: i5.c$e$a */
        @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f25621a;

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
                f25621a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull InterfaceC6008c db2, @NotNull String sql, @NotNull Companion.b operation) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: A */
        public void mo24699A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m28639d();
            C5358a.m24694b(25, "column index out of range");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: C */
        public void mo24700C(int index) {
            m28639d();
            C5358a.m24694b(25, "column index out of range");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: E */
        public void mo24701E() {
            m28639d();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        /* JADX INFO: renamed from: E2 */
        public String mo24702E2(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d, java.lang.AutoCloseable
        public void close() {
            m28638c(true);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: g3 */
        public boolean mo24704g3() {
            int i10 = a.f25621a[this.operation.ordinal()];
            if (i10 == 1) {
                getDb().mo6905q0();
                getDb().mo6896G0();
                return false;
            }
            if (i10 == 2) {
                getDb().mo6896G0();
                return false;
            }
            if (i10 == 3) {
                getDb().mo6895G();
                return false;
            }
            if (i10 == 4) {
                getDb().mo6908u0();
                return false;
            }
            if (i10 != 5) {
                throw new C7345l();
            }
            getDb().mo26779Y1();
            return false;
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public byte[] getBlob(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public int getColumnCount() {
            m28639d();
            return 0;
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public String getColumnName(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public long getLong(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public boolean isNull(int index) {
            m28639d();
            C5358a.m24694b(21, "no row");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: k0 */
        public void mo24705k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m28639d();
            C5358a.m24694b(25, "column index out of range");
            throw new C7334d();
        }

        @Override // p119f5.InterfaceC5361d
        public void reset() {
            m28639d();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: z */
        public void mo24706z(int index, long value) {
            m28639d();
            C5358a.m24694b(25, "column index out of range");
            throw new C7334d();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 g5.c), (r2v0 java.lang.String) A[MD:(g5.c, java.lang.String):void (m)] (LINE:1) call: i5.c.<init>(g5.c, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC6641c(InterfaceC6008c interfaceC6008c, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6008c, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC6008c getDb() {
        return this.db;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSql() {
        return this.sql;
    }

    /* JADX INFO: renamed from: c */
    public final void m28638c(boolean z10) {
        this.isClosed = z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m28639d() {
        if (this.isClosed) {
            C5358a.m24694b(21, "statement is closed");
            throw new C7334d();
        }
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC6641c(InterfaceC6008c interfaceC6008c, String str) {
        this.db = interfaceC6008c;
        this.sql = str;
    }
}
