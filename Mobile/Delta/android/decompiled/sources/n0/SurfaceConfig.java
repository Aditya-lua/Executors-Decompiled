package n0;

import android.util.Size;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n0.w3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0004\u001b'#\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006+"}, d2 = {"Ln0/w3;", "", "Ln0/w3$d;", "configType", "Ln0/w3$b;", "configSize", "Ln0/u3;", "streamUseCase", "<init>", "(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)V", "other", "", "j", "(Ln0/w3;)Z", "Ln0/x3;", "definition", "Landroid/util/Size;", "h", "(Ln0/x3;)Landroid/util/Size;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ln0/w3$d;", "getConfigType", "()Ln0/w3$d;", "b", "Ln0/w3$b;", "e", "()Ln0/w3$b;", "c", "Ln0/u3;", "i", "()Ln0/u3;", "d", "I", "g", "imageFormat", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SurfaceConfig {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final u3 f24901f = u3.DEFAULT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b[] f24902g = {b.f24910e, b.f24912g, b.f24913h, b.f24915j, b.f24916k, b.f24909d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Map<d, Integer> f24903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, d> f24904i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final d configType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final b configSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final u3 streamUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int imageFormat;

    /* JADX INFO: renamed from: n0.w3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Ln0/w3$a;", "", "<init>", "()V", "Ln0/w3$d;", Payload.TYPE, "Ln0/w3$b;", "size", "Ln0/u3;", "streamUseCase", "Ln0/w3;", "b", "(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)Ln0/w3;", "", "imageFormat", "d", "(I)Ln0/w3$d;", "Landroid/util/Size;", "Ln0/x3;", "surfaceSizeDefinition", "cameraMode", "Ln0/w3$c;", "configSource", "f", "(ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;)Ln0/w3;", "DEFAULT_STREAM_USE_CASE", "Ln0/u3;", "", "FEATURE_COMBO_QUERY_SUPPORTED_SIZES", "[Ln0/w3$b;", "", "IMAGE_FORMATS_BY_CONFIG_TYPE", "Ljava/util/Map;", "CONFIG_TYPES_BY_IMAGE_FORMAT", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SurfaceConfig c(Companion companion, d dVar, b bVar, u3 u3Var, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                u3Var = SurfaceConfig.f24901f;
            }
            return companion.b(dVar, bVar, u3Var);
        }

        public static /* synthetic */ SurfaceConfig g(Companion companion, int i10, Size size, x3 x3Var, int i11, c cVar, u3 u3Var, int i12, Object obj) {
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            int i13 = i11;
            if ((i12 & 16) != 0) {
                cVar = c.CAPTURE_SESSION_TABLES;
            }
            c cVar2 = cVar;
            if ((i12 & 32) != 0) {
                u3Var = SurfaceConfig.f24901f;
            }
            return companion.f(i10, size, x3Var, i13, cVar2, u3Var);
        }

        @NotNull
        public final SurfaceConfig a(@NotNull d type, @NotNull b size) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            return c(this, type, size, null, 4, null);
        }

        @NotNull
        public final SurfaceConfig b(@NotNull d type, @NotNull b size, @NotNull u3 streamUseCase) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
            return new SurfaceConfig(type, size, streamUseCase);
        }

        @NotNull
        public final d d(int imageFormat) {
            d dVar = (d) SurfaceConfig.f24904i.get(Integer.valueOf(imageFormat));
            return dVar == null ? d.PRIV : dVar;
        }

        @NotNull
        public final SurfaceConfig e(int i10, @NotNull Size size, @NotNull x3 surfaceSizeDefinition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            return g(this, i10, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        @NotNull
        public final SurfaceConfig f(int imageFormat, @NotNull Size size, @NotNull x3 surfaceSizeDefinition, int cameraMode, @NotNull c configSource, @NotNull u3 streamUseCase) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            Intrinsics.checkNotNullParameter(configSource, "configSource");
            Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
            d dVarD = d(imageFormat);
            b bVar = b.f24922q;
            int iC = w0.d.c(size);
            if (cameraMode == 1) {
                if (iC <= w0.d.c(surfaceSizeDefinition.m(imageFormat))) {
                    bVar = b.f24910e;
                } else if (iC <= w0.d.c(surfaceSizeDefinition.k(imageFormat))) {
                    bVar = b.f24914i;
                }
            } else if (configSource == c.FEATURE_COMBINATION_TABLE) {
                Size sizeG = surfaceSizeDefinition.g(imageFormat);
                for (b bVar2 : SurfaceConfig.f24902g) {
                    if (Intrinsics.c(size, bVar2.getRelatedFixedSize())) {
                        bVar = bVar2;
                        break;
                    }
                }
                if (bVar == b.f24922q && Intrinsics.c(size, sizeG)) {
                    bVar = b.f24918m;
                }
            } else if (iC <= w0.d.c(surfaceSizeDefinition.b())) {
                bVar = b.f24908c;
            } else if (iC <= w0.d.c(surfaceSizeDefinition.i())) {
                bVar = b.f24911f;
            } else if (iC <= w0.d.c(surfaceSizeDefinition.j())) {
                bVar = b.f24917l;
            } else {
                Size sizeG2 = surfaceSizeDefinition.g(imageFormat);
                Size sizeO = surfaceSizeDefinition.o(imageFormat);
                if ((sizeG2 == null || iC <= w0.d.c(sizeG2)) && cameraMode != 2) {
                    bVar = b.f24918m;
                } else if (sizeO != null && iC <= w0.d.c(sizeO)) {
                    bVar = b.f24921p;
                }
            }
            return b(dVarD, bVar, streamUseCase);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: n0.w3$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Ln0/w3$b;", "", "", "id", "Landroid/util/Size;", "relatedFixedSize", "<init>", "(Ljava/lang/String;IILandroid/util/Size;)V", "a", "I", "b", "()I", "Landroid/util/Size;", "c", "()Landroid/util/Size;", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f24911f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f24917l;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ b[] f24923r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ qt.a f24924s;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Size relatedFixedSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f24908c = new b("VGA", 0, 0, new Size(640, 480));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f24909d = new b("X_VGA", 1, 1, new Size(Barcode.FORMAT_UPC_E, 768));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f24910e = new b("S720P_16_9", 2, 2, new Size(1280, 720));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f24912g = new b("S1080P_4_3", 4, 4, new Size(1440, 1080));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f24913h = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f24914i = new b("S1440P_4_3", 6, 6, new Size(1920, 1440));

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f24915j = new b("S1440P_16_9", 7, 7, new Size(2560, 1440));

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f24916k = new b("UHD", 8, 8, new Size(3840, 2160));

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f24918m = new b("MAXIMUM", 10, 10, null, 2, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f24919n = new b("MAXIMUM_4_3", 11, 11, null, 2, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f24920o = new b("MAXIMUM_16_9", 12, 12, null, 2, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f24921p = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f24922q = new b("NOT_SUPPORT", 14, 14, null, 2, null);

        static {
            int i10 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Size size = null;
            f24911f = new b("PREVIEW", 3, 3, size, i10, defaultConstructorMarker);
            f24917l = new b("RECORD", 9, 9, size, i10, defaultConstructorMarker);
            b[] bVarArrA = a();
            f24923r = bVarArrA;
            f24924s = qt.b.a(bVarArrA);
        }

        public b(String str, int i10, int i11, Size size) {
            super(str, i10);
            this.id = i11;
            this.relatedFixedSize = size;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f24908c, f24909d, f24910e, f24911f, f24912g, f24913h, f24914i, f24915j, f24916k, f24917l, f24918m, f24919n, f24920o, f24921p, f24922q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24923r.clone();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Size getRelatedFixedSize() {
            return this.relatedFixedSize;
        }

        public /* synthetic */ b(String str, int i10, int i11, Size size, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, i11, (i12 & 2) != 0 ? null : size);
        }
    }

    /* JADX INFO: renamed from: n0.w3$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ln0/w3$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        FEATURE_COMBINATION_TABLE,
        CAPTURE_SESSION_TABLES;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ qt.a f24928d = qt.b.a(a());
    }

    /* JADX INFO: renamed from: n0.w3$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ln0/w3$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ qt.a f24934g = qt.b.a(a());
    }

    /* JADX INFO: renamed from: n0.w3$e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24935a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f24911f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f24917l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f24918m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f24919n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f24920o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f24921p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f24922q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f24935a = iArr;
        }
    }

    static {
        Map<d, Integer> mapM = kotlin.collections.k0.m(jt.s.a(d.YUV, 35), jt.s.a(d.JPEG, Integer.valueOf(Barcode.FORMAT_QR_CODE)), jt.s.a(d.JPEG_R, 4101), jt.s.a(d.RAW, 32), jt.s.a(d.PRIV, 34));
        f24903h = mapM;
        Set<Map.Entry<d, Integer>> setEntrySet = mapM.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(kotlin.collections.j0.f(kotlin.collections.q.u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f24904i = linkedHashMap;
    }

    public SurfaceConfig(@NotNull d configType, @NotNull b configSize, @NotNull u3 streamUseCase) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configSize, "configSize");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        this.configType = configType;
        this.configSize = configSize;
        this.streamUseCase = streamUseCase;
        Integer num = f24903h.get(configType);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    @NotNull
    public static final SurfaceConfig c(@NotNull d dVar, @NotNull b bVar) {
        return INSTANCE.a(dVar, bVar);
    }

    @NotNull
    public static final SurfaceConfig d(@NotNull d dVar, @NotNull b bVar, @NotNull u3 u3Var) {
        return INSTANCE.b(dVar, bVar, u3Var);
    }

    @NotNull
    public static final d f(int i10) {
        return INSTANCE.d(i10);
    }

    @NotNull
    public static final SurfaceConfig k(int i10, @NotNull Size size, @NotNull x3 x3Var) {
        return INSTANCE.e(i10, size, x3Var);
    }

    @NotNull
    public static final SurfaceConfig l(int i10, @NotNull Size size, @NotNull x3 x3Var, int i11, @NotNull c cVar, @NotNull u3 u3Var) {
        return INSTANCE.f(i10, size, x3Var, i11, cVar, u3Var);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getConfigSize() {
        return this.configSize;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) other;
        return this.configType == surfaceConfig.configType && this.configSize == surfaceConfig.configSize && this.streamUseCase == surfaceConfig.streamUseCase;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getImageFormat() {
        return this.imageFormat;
    }

    @NotNull
    public final Size h(@NotNull x3 definition) {
        Size sizeI;
        Intrinsics.checkNotNullParameter(definition, "definition");
        switch (e.f24935a[this.configSize.ordinal()]) {
            case 1:
                sizeI = definition.i();
                break;
            case 2:
                sizeI = definition.j();
                break;
            case 3:
                sizeI = definition.g(this.imageFormat);
                break;
            case 4:
                sizeI = definition.e(this.imageFormat);
                break;
            case 5:
                sizeI = definition.c(this.imageFormat);
                break;
            case 6:
                sizeI = definition.o(this.imageFormat);
                break;
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                sizeI = this.configSize.getRelatedFixedSize();
                break;
        }
        Intrinsics.checkNotNull(sizeI);
        return sizeI;
    }

    public int hashCode() {
        return (((this.configType.hashCode() * 31) + this.configSize.hashCode()) * 31) + this.streamUseCase.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final u3 getStreamUseCase() {
        return this.streamUseCase;
    }

    public final boolean j(@NotNull SurfaceConfig other) {
        u3 u3Var;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.configSize.getId() > this.configSize.getId() || other.configType != this.configType) {
            return false;
        }
        u3 u3Var2 = this.streamUseCase;
        u3 u3Var3 = u3.DEFAULT;
        return u3Var2 == u3Var3 || (u3Var = other.streamUseCase) == u3Var3 || u3Var == u3Var2;
    }

    @NotNull
    public String toString() {
        return "SurfaceConfig(configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + ')';
    }
}
