package androidx.work;

import androidx.work.C1116b;
import hu.InterfaceC6567c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7687j;
import kotlin.collections.C7689k;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477ut.C11958c;
import p536x5.AbstractC12732w;
import p536x5.C12698f;

/* JADX INFO: renamed from: androidx.work.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 *2\u00020\u0001:\u0002%*B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u00192\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001f\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m31665d2 = {"Landroidx/work/b;", "", "other", "<init>", "(Landroidx/work/b;)V", "", "", "values", "(Ljava/util/Map;)V", "key", "", "defaultValue", "c", "(Ljava/lang/String;Z)Z", "", "d", "(Ljava/lang/String;I)I", "", "f", "(Ljava/lang/String;J)J", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "j", "()[B", "T", "Ljava/lang/Class;", "klass", "h", "(Ljava/lang/String;Ljava/lang/Class;)Z", "i", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "keyValueMap", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1116b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C1116b f4581c = new a().m6322a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> values;

    /* JADX INFO: renamed from: androidx.work.b$a */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u0018R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Landroidx/work/b$a;", "", "<init>", "()V", "", "key", "", "value", "f", "(Ljava/lang/String;I)Landroidx/work/b$a;", "", "g", "(Ljava/lang/String;J)Landroidx/work/b$a;", "h", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;", "Landroidx/work/b;", "data", "c", "(Landroidx/work/b;)Landroidx/work/b$a;", "", "values", "d", "(Ljava/util/Map;)Landroidx/work/b$a;", "b", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;", "a", "()Landroidx/work/b;", "e", "", "Ljava/util/Map;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> values = new LinkedHashMap();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1116b m6322a() {
            C1116b c1116b = new C1116b((Map<String, ?>) this.values);
            C1116b.INSTANCE.m6337e(c1116b);
            return c1116b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m6323b(@NotNull String key, @Nullable Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                InterfaceC6567c interfaceC6567cM32002b = C7731d0.m32002b(value.getClass());
                if (!Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Boolean.TYPE)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Byte.TYPE)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Integer.TYPE)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Long.TYPE)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Float.TYPE)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Double.TYPE)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(String.class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Boolean[].class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Byte[].class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Integer[].class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Long[].class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Float[].class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Double[].class)) && !Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(String[].class))) {
                    if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(boolean[].class))) {
                        value = C12698f.m47365h((boolean[]) value);
                    } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(byte[].class))) {
                        value = C12698f.m47366i((byte[]) value);
                    } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(int[].class))) {
                        value = C12698f.m47369l((int[]) value);
                    } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(long[].class))) {
                        value = C12698f.m47370m((long[]) value);
                    } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(float[].class))) {
                        value = C12698f.m47368k((float[]) value);
                    } else {
                        if (!Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + interfaceC6567cM32002b);
                        }
                        value = C12698f.m47367j((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m6324c(@NotNull C1116b data) {
            Intrinsics.checkNotNullParameter(data, "data");
            m6325d(data.values);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m6325d(@NotNull Map<String, ? extends Object> values) {
            Intrinsics.checkNotNullParameter(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                m6323b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final a m6326e(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m6327f(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return m6326e(key, Integer.valueOf(value));
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m6328g(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return m6326e(key, Long.valueOf(value));
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final a m6329h(@NotNull String key, @Nullable String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return m6326e(key, value);
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, m31665d2 = {"Landroidx/work/b$b;", "", "<init>", "()V", "Landroidx/work/b;", "data", "", "e", "(Landroidx/work/b;)[B", "bytes", "a", "([B)Landroidx/work/b;", "EMPTY", "Landroidx/work/b;", "", "MAX_DATA_BYTES", "I", "", "TYPE_NULL", "B", "TYPE_BOOLEAN", "TYPE_BYTE", "TYPE_INTEGER", "TYPE_LONG", "TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE_ARRAY", "TYPE_INTEGER_ARRAY", "TYPE_LONG_ARRAY", "TYPE_FLOAT_ARRAY", "TYPE_DOUBLE_ARRAY", "TYPE_STRING_ARRAY", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.b.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static final boolean m6330b(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b = (byte) (-21267);
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        /* JADX INFO: renamed from: c */
        public static final void m6331c(DataInputStream dataInputStream) throws IOException {
            short s8 = dataInputStream.readShort();
            if (s8 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s8)).toString());
            }
            short s10 = dataInputStream.readShort();
            if (s10 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s10)).toString());
        }

        /* JADX INFO: renamed from: d */
        public static final Object m6332d(DataInputStream dataInputStream, byte b) throws IOException {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b == 8) {
                int i11 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i11];
                while (i10 < i11) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            }
            if (b == 9) {
                int i12 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i12];
                while (i10 < i12) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            }
            if (b == 10) {
                int i13 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i13];
                while (i10 < i13) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            }
            if (b == 11) {
                int i14 = dataInputStream.readInt();
                Long[] lArr = new Long[i14];
                while (i10 < i14) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            }
            if (b == 12) {
                int i15 = dataInputStream.readInt();
                Float[] fArr = new Float[i15];
                while (i10 < i15) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            }
            if (b == 13) {
                int i16 = dataInputStream.readInt();
                Double[] dArr = new Double[i16];
                while (i10 < i16) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            }
            if (b != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b));
            }
            int i17 = dataInputStream.readInt();
            String[] strArr = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.m31980c(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i10] = utf;
                i10++;
            }
            return strArr;
        }

        /* JADX INFO: renamed from: f */
        public static final void m6333f(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i10;
            InterfaceC6567c interfaceC6567cM32002b = C7731d0.m32002b(objArr.getClass());
            if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Boolean[].class))) {
                i10 = 8;
            } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Byte[].class))) {
                i10 = 9;
            } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Integer[].class))) {
                i10 = 10;
            } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Long[].class))) {
                i10 = 11;
            } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Float[].class))) {
                i10 = 12;
            } else if (Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(Double[].class))) {
                i10 = 13;
            } else {
                if (!Intrinsics.m31980c(interfaceC6567cM32002b, C7731d0.m32002b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + C7731d0.m32002b(objArr.getClass()).mo28426f());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l10 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f10 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                } else if (i10 == 13) {
                    Double d10 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i10 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static final void m6334g(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + C7731d0.m32002b(obj.getClass()).mo28427g());
                }
                m6333f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        /* JADX INFO: renamed from: h */
        public static final void m6335h(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1116b m6336a(@NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return C1116b.f4581c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i10 = 0;
                if (m6330b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i11 = objectInputStream.readInt();
                        while (i10 < i11) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i10++;
                        }
                        C11958c.m44629a(objectInputStream, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C11958c.m44629a(objectInputStream, th2);
                            throw th3;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        m6331c(dataInputStream);
                        int i12 = dataInputStream.readInt();
                        while (i10 < i12) {
                            linkedHashMap.put(dataInputStream.readUTF(), m6332d(dataInputStream, dataInputStream.readByte()));
                            i10++;
                        }
                        C11958c.m44629a(dataInputStream, null);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            C11958c.m44629a(dataInputStream, th4);
                            throw th5;
                        }
                    }
                }
            } catch (IOException e10) {
                AbstractC12732w.m47441e().mo47447d(C12698f.f45250a, "Error in Data#fromByteArray: ", e10);
            } catch (ClassNotFoundException e11) {
                AbstractC12732w.m47441e().mo47447d(C12698f.f45250a, "Error in Data#fromByteArray: ", e11);
            }
            return new C1116b(linkedHashMap);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final byte[] m6337e(@NotNull C1116b data) {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    m6335h(dataOutputStream);
                    dataOutputStream.writeInt(data.m6320i());
                    for (Map.Entry entry : data.values.entrySet()) {
                        m6334g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C11958c.m44629a(dataOutputStream, null);
                    Intrinsics.checkNotNull(byteArray);
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(dataOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                AbstractC12732w.m47441e().mo47447d(C12698f.f45250a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1116b(@NotNull C1116b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.values = new HashMap(other.values);
    }

    /* JADX INFO: renamed from: k */
    public static final CharSequence m6313k(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
        }
        sb2.append(value);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6314c(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Boolean.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m6315d(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Integer.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<String, Object> m6316e() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public boolean equals(@Nullable Object other) {
        boolean zM31980c;
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.m31980c(C1116b.class, other.getClass())) {
            return false;
        }
        C1116b c1116b = (C1116b) other;
        Set<String> setKeySet = this.values.keySet();
        if (!Intrinsics.m31980c(setKeySet, c1116b.values.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.values.get(str);
            Object obj2 = c1116b.values.get(str);
            if (obj == null || obj2 == null) {
                zM31980c = obj == obj2;
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (obj2 instanceof Object[]) {
                    zM31980c = C7689k.m31794d(objArr, (Object[]) obj2);
                } else {
                    zM31980c = Intrinsics.m31980c(obj, obj2);
                }
            } else {
                zM31980c = Intrinsics.m31980c(obj, obj2);
            }
            if (!zM31980c) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final long m6317f(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Long.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m6318g(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final <T> boolean m6319h(@NotNull String key, @NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ C7687j.m31785b((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    /* JADX INFO: renamed from: i */
    public final int m6320i() {
        return this.values.size();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final byte[] m6321j() {
        return INSTANCE.m6337e(this);
    }

    @NotNull
    public String toString() {
        return "Data {" + CollectionsKt.m31715m0(this.values.entrySet(), null, null, null, 0, null, new Function1() { // from class: x5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C1116b.m6313k((Map.Entry) obj);
            }
        }, 31, null) + "}";
    }

    public C1116b(@NotNull Map<String, ?> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = new HashMap(values);
    }
}
