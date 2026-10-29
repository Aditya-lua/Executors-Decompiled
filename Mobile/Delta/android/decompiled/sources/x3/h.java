package x3;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jt.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t3.a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lx3/h;", "Lt3/a0;", "Lx3/f;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lnt/b;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "d", "(Lx3/f;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object;", "", "value", "Lw3/h;", "c", "(Ljava/lang/Object;)Lw3/h;", "", "name", "Lx3/c;", "mutablePreferences", "a", "(Ljava/lang/String;Lw3/h;Lx3/c;)V", "b", "()Lx3/f;", "defaultValue", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements a0<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f34695a = new h();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34696a;

        static {
            int[] iArr = new int[w3.h.b.values().length];
            try {
                iArr[w3.h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w3.h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w3.h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w3.h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w3.h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w3.h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w3.h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w3.h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[w3.h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f34696a = iArr;
        }
    }

    public final void a(String name, w3.h value, c mutablePreferences) throws t3.d {
        w3.h.b bVarM0 = value.m0();
        switch (bVarM0 == null ? -1 : a.f34696a[bVarM0.ordinal()]) {
            case -1:
                throw new t3.d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new l();
            case 1:
                mutablePreferences.i(i.a(name), Boolean.valueOf(value.d0()));
                return;
            case 2:
                mutablePreferences.i(i.d(name), Float.valueOf(value.h0()));
                return;
            case 3:
                mutablePreferences.i(i.c(name), Double.valueOf(value.g0()));
                return;
            case 4:
                mutablePreferences.i(i.e(name), Integer.valueOf(value.i0()));
                return;
            case 5:
                mutablePreferences.i(i.f(name), Long.valueOf(value.j0()));
                return;
            case 6:
                f.a<String> aVarG = i.g(name);
                String strK0 = value.k0();
                Intrinsics.checkNotNullExpressionValue(strK0, "value.string");
                mutablePreferences.i(aVarG, strK0);
                return;
            case 7:
                f.a<Set<String>> aVarH = i.h(name);
                List<String> listZ = value.l0().Z();
                Intrinsics.checkNotNullExpressionValue(listZ, "value.stringSet.stringsList");
                mutablePreferences.i(aVarH, CollectionsKt.Q0(listZ));
                return;
            case 8:
                f.a<byte[]> aVarB = i.b(name);
                byte[] bArrX = value.e0().x();
                Intrinsics.checkNotNullExpressionValue(bArrX, "value.bytes.toByteArray()");
                mutablePreferences.i(aVarB, bArrX);
                return;
            case 9:
                throw new t3.d("Value not set.", null, 2, null);
        }
    }

    @Override // t3.a0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f getDefaultValue() {
        return g.a();
    }

    public final w3.h c(Object value) {
        if (value instanceof Boolean) {
            w3.h hVarBuild = w3.h.n0().E(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild, "newBuilder().setBoolean(value).build()");
            return hVarBuild;
        }
        if (value instanceof Float) {
            w3.h hVarBuild2 = w3.h.n0().K(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild2, "newBuilder().setFloat(value).build()");
            return hVarBuild2;
        }
        if (value instanceof Double) {
            w3.h hVarBuild3 = w3.h.n0().J(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild3, "newBuilder().setDouble(value).build()");
            return hVarBuild3;
        }
        if (value instanceof Integer) {
            w3.h hVarBuild4 = w3.h.n0().N(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild4, "newBuilder().setInteger(value).build()");
            return hVarBuild4;
        }
        if (value instanceof Long) {
            w3.h hVarBuild5 = w3.h.n0().O(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild5, "newBuilder().setLong(value).build()");
            return hVarBuild5;
        }
        if (value instanceof String) {
            w3.h hVarBuild6 = w3.h.n0().P((String) value).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild6, "newBuilder().setString(value).build()");
            return hVarBuild6;
        }
        if (value instanceof Set) {
            w3.h.a aVarN0 = w3.h.n0();
            w3.g.a aVarA0 = w3.g.a0();
            Intrinsics.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            w3.h hVarBuild7 = aVarN0.Q(aVarA0.E((Set) value)).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild7, "newBuilder()\n           …                 .build()");
            return hVarBuild7;
        }
        if (value instanceof byte[]) {
            w3.h hVarBuild8 = w3.h.n0().G(androidx.datastore.preferences.protobuf.g.e((byte[]) value)).build();
            Intrinsics.checkNotNullExpressionValue(hVarBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return hVarBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // t3.a0
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(@NotNull f fVar, @NotNull OutputStream outputStream, @NotNull nt.b<? super Unit> bVar) {
        Map<f.a<?>, Object> mapA = fVar.a();
        w3.f.a aVarA0 = w3.f.a0();
        for (Map.Entry<f.a<?>, Object> entry : mapA.entrySet()) {
            aVarA0.E(entry.getKey().getName(), c(entry.getValue()));
        }
        aVarA0.build().p(outputStream);
        return Unit.f22483a;
    }

    @Override // t3.a0
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull nt.b<? super f> bVar) throws t3.d {
        w3.f fVarA = w3.d.INSTANCE.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map<String, w3.h> mapX = fVarA.X();
        Intrinsics.checkNotNullExpressionValue(mapX, "preferencesProto.preferencesMap");
        for (Map.Entry<String, w3.h> entry : mapX.entrySet()) {
            String name = entry.getKey();
            w3.h value = entry.getValue();
            h hVar = f34695a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            hVar.a(name, value, cVarB);
        }
        return cVarB.d();
    }
}
