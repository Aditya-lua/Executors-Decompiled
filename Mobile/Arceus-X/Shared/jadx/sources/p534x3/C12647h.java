package p534x3;

import androidx.datastore.preferences.protobuf.AbstractC0840g;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p315nt.InterfaceC9557b;
import p440t3.C11480d;
import p440t3.InterfaceC11475a0;
import p506w3.C12300d;
import p506w3.C12302f;
import p506w3.C12303g;
import p506w3.C12304h;

/* JADX INFO: renamed from: x3.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lx3/h;", "Lt3/a0;", "Lx3/f;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lnt/b;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "d", "(Lx3/f;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object;", "", "value", "Lw3/h;", "c", "(Ljava/lang/Object;)Lw3/h;", "", "name", "Lx3/c;", "mutablePreferences", "a", "(Ljava/lang/String;Lw3/h;Lx3/c;)V", "b", "()Lx3/f;", "defaultValue", "datastore-preferences-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12647h implements InterfaceC11475a0<AbstractC12645f> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12647h f44973a = new C12647h();

    /* JADX INFO: renamed from: x3.h$a */
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44974a;

        static {
            int[] iArr = new int[C12304h.b.values().length];
            try {
                iArr[C12304h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C12304h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C12304h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C12304h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C12304h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C12304h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C12304h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C12304h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C12304h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f44974a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m47108a(String name, C12304h value, C12642c mutablePreferences) throws C11480d {
        C12304h.b bVarM45730m0 = value.m45730m0();
        switch (bVarM45730m0 == null ? -1 : a.f44974a[bVarM45730m0.ordinal()]) {
            case -1:
                throw new C11480d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C7345l();
            case 1:
                mutablePreferences.m47094i(C12648i.m47112a(name), Boolean.valueOf(value.m45722d0()));
                return;
            case 2:
                mutablePreferences.m47094i(C12648i.m47115d(name), Float.valueOf(value.m45725h0()));
                return;
            case 3:
                mutablePreferences.m47094i(C12648i.m47114c(name), Double.valueOf(value.m45724g0()));
                return;
            case 4:
                mutablePreferences.m47094i(C12648i.m47116e(name), Integer.valueOf(value.m45726i0()));
                return;
            case 5:
                mutablePreferences.m47094i(C12648i.m47117f(name), Long.valueOf(value.m45727j0()));
                return;
            case 6:
                AbstractC12645f.a<String> aVarM47118g = C12648i.m47118g(name);
                String strM45728k0 = value.m45728k0();
                Intrinsics.checkNotNullExpressionValue(strM45728k0, "value.string");
                mutablePreferences.m47094i(aVarM47118g, strM45728k0);
                return;
            case 7:
                AbstractC12645f.a<Set<String>> aVarM47119h = C12648i.m47119h(name);
                List<String> listM45709Z = value.m45729l0().m45709Z();
                Intrinsics.checkNotNullExpressionValue(listM45709Z, "value.stringSet.stringsList");
                mutablePreferences.m47094i(aVarM47119h, CollectionsKt.m31691Q0(listM45709Z));
                return;
            case 8:
                AbstractC12645f.a<byte[]> aVarM47113b = C12648i.m47113b(name);
                byte[] bArrM3457x = value.m45723e0().m3457x();
                Intrinsics.checkNotNullExpressionValue(bArrM3457x, "value.bytes.toByteArray()");
                mutablePreferences.m47094i(aVarM47113b, bArrM3457x);
                return;
            case 9:
                throw new C11480d("Value not set.", null, 2, null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getDefaultValue()Ljava/lang/Object; */
    @Override // p440t3.InterfaceC11475a0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC12645f getDefaultValue() {
        return C12646g.m47106a();
    }

    /* JADX INFO: renamed from: c */
    public final C12304h m47110c(Object value) {
        if (value instanceof Boolean) {
            C12304h c12304hBuild = C12304h.m45721n0().m45739E(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild, "newBuilder().setBoolean(value).build()");
            return c12304hBuild;
        }
        if (value instanceof Float) {
            C12304h c12304hBuild2 = C12304h.m45721n0().m45742K(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild2, "newBuilder().setFloat(value).build()");
            return c12304hBuild2;
        }
        if (value instanceof Double) {
            C12304h c12304hBuild3 = C12304h.m45721n0().m45741J(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild3, "newBuilder().setDouble(value).build()");
            return c12304hBuild3;
        }
        if (value instanceof Integer) {
            C12304h c12304hBuild4 = C12304h.m45721n0().m45743N(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild4, "newBuilder().setInteger(value).build()");
            return c12304hBuild4;
        }
        if (value instanceof Long) {
            C12304h c12304hBuild5 = C12304h.m45721n0().m45744O(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild5, "newBuilder().setLong(value).build()");
            return c12304hBuild5;
        }
        if (value instanceof String) {
            C12304h c12304hBuild6 = C12304h.m45721n0().m45745P((String) value).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild6, "newBuilder().setString(value).build()");
            return c12304hBuild6;
        }
        if (value instanceof Set) {
            C12304h.a aVarM45721n0 = C12304h.m45721n0();
            C12303g.a aVarM45706a0 = C12303g.m45706a0();
            Intrinsics.m31981d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            C12304h c12304hBuild7 = aVarM45721n0.m45746Q(aVarM45706a0.m45710E((Set) value)).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild7, "newBuilder()\n           …                 .build()");
            return c12304hBuild7;
        }
        if (value instanceof byte[]) {
            C12304h c12304hBuild8 = C12304h.m45721n0().m45740G(AbstractC0840g.m3443e((byte[]) value)).build();
            Intrinsics.checkNotNullExpressionValue(c12304hBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return c12304hBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    /* JADX DEBUG: Method merged with bridge method: writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object; */
    @Override // p440t3.InterfaceC11475a0
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(@NotNull AbstractC12645f abstractC12645f, @NotNull OutputStream outputStream, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Map<AbstractC12645f.a<?>, Object> mapMo47088a = abstractC12645f.mo47088a();
        C12302f.a aVarM45696a0 = C12302f.m45696a0();
        for (Map.Entry<AbstractC12645f.a<?>, Object> entry : mapMo47088a.entrySet()) {
            aVarM45696a0.m45702E(entry.getKey().getName(), m47110c(entry.getValue()));
        }
        aVarM45696a0.build().m3332p(outputStream);
        return Unit.f29331a;
    }

    @Override // p440t3.InterfaceC11475a0
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) throws C11480d {
        C12302f c12302fM45693a = C12300d.INSTANCE.m45693a(inputStream);
        C12642c c12642cM47107b = C12646g.m47107b(new AbstractC12645f.b[0]);
        Map<String, C12304h> mapM45699X = c12302fM45693a.m45699X();
        Intrinsics.checkNotNullExpressionValue(mapM45699X, "preferencesProto.preferencesMap");
        for (Map.Entry<String, C12304h> entry : mapM45699X.entrySet()) {
            String name = entry.getKey();
            C12304h value = entry.getValue();
            C12647h c12647h = f44973a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            c12647h.m47108a(name, value, c12642cM47107b);
        }
        return c12642cM47107b.m47102d();
    }
}
