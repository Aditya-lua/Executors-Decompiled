package p296n0;

import android.util.Size;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p503w0.C12274d;

/* JADX INFO: renamed from: n0.w3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0004\u001b'#\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006+"}, m31665d2 = {"Ln0/w3;", "", "Ln0/w3$d;", "configType", "Ln0/w3$b;", "configSize", "Ln0/u3;", "streamUseCase", "<init>", "(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)V", "other", "", "j", "(Ln0/w3;)Z", "Ln0/x3;", "definition", "Landroid/util/Size;", "h", "(Ln0/x3;)Landroid/util/Size;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ln0/w3$d;", "getConfigType", "()Ln0/w3$d;", "b", "Ln0/w3$b;", "e", "()Ln0/w3$b;", "c", "Ln0/u3;", "i", "()Ln0/u3;", "d", "I", "g", "imageFormat", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class SurfaceConfig {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final EnumC8832u3 f32153f = EnumC8832u3.DEFAULT;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final b[] f32154g = {b.f32163e, b.f32165g, b.f32166h, b.f32168j, b.f32169k, b.f32162d};

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Map<d, Integer> f32155h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Map<Integer, d> f32156i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final d configType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final b configSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC8832u3 streamUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int imageFormat;

    /* JADX INFO: renamed from: n0.w3$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, m31665d2 = {"Ln0/w3$a;", "", "<init>", "()V", "Ln0/w3$d;", Payload.TYPE, "Ln0/w3$b;", "size", "Ln0/u3;", "streamUseCase", "Ln0/w3;", "b", "(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)Ln0/w3;", "", "imageFormat", "d", "(I)Ln0/w3$d;", "Landroid/util/Size;", "Ln0/x3;", "surfaceSizeDefinition", "cameraMode", "Ln0/w3$c;", "configSource", "f", "(ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;)Ln0/w3;", "DEFAULT_STREAM_USE_CASE", "Ln0/u3;", "", "FEATURE_COMBO_QUERY_SUPPORTED_SIZES", "[Ln0/w3$b;", "", "IMAGE_FORMATS_BY_CONFIG_TYPE", "Ljava/util/Map;", "CONFIG_TYPES_BY_IMAGE_FORMAT", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: n0.w3.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ SurfaceConfig m35486c(Companion companion, d dVar, b bVar, EnumC8832u3 enumC8832u3, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                enumC8832u3 = SurfaceConfig.f32153f;
            }
            return companion.m35489b(dVar, bVar, enumC8832u3);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ SurfaceConfig m35487g(Companion companion, int i10, Size size, AbstractC8847x3 abstractC8847x3, int i11, c cVar, EnumC8832u3 enumC8832u3, int i12, Object obj) {
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            int i13 = i11;
            if ((i12 & 16) != 0) {
                cVar = c.CAPTURE_SESSION_TABLES;
            }
            c cVar2 = cVar;
            if ((i12 & 32) != 0) {
                enumC8832u3 = SurfaceConfig.f32153f;
            }
            return companion.m35492f(i10, size, abstractC8847x3, i13, cVar2, enumC8832u3);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final SurfaceConfig m35488a(@NotNull d type, @NotNull b size) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            return m35486c(this, type, size, null, 4, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final SurfaceConfig m35489b(@NotNull d type, @NotNull b size, @NotNull EnumC8832u3 streamUseCase) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
            return new SurfaceConfig(type, size, streamUseCase);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final d m35490d(int imageFormat) {
            d dVar = (d) SurfaceConfig.f32156i.get(Integer.valueOf(imageFormat));
            return dVar == null ? d.PRIV : dVar;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final SurfaceConfig m35491e(int i10, @NotNull Size size, @NotNull AbstractC8847x3 surfaceSizeDefinition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            return m35487g(this, i10, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final SurfaceConfig m35492f(int imageFormat, @NotNull Size size, @NotNull AbstractC8847x3 surfaceSizeDefinition, int cameraMode, @NotNull c configSource, @NotNull EnumC8832u3 streamUseCase) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            Intrinsics.checkNotNullParameter(configSource, "configSource");
            Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
            d dVarM35490d = m35490d(imageFormat);
            b bVar = b.f32175q;
            int iM45571c = C12274d.m45571c(size);
            if (cameraMode == 1) {
                if (iM45571c <= C12274d.m45571c(surfaceSizeDefinition.m35513m(imageFormat))) {
                    bVar = b.f32163e;
                } else if (iM45571c <= C12274d.m45571c(surfaceSizeDefinition.m35512k(imageFormat))) {
                    bVar = b.f32167i;
                }
            } else if (configSource == c.FEATURE_COMBINATION_TABLE) {
                Size sizeM35511g = surfaceSizeDefinition.m35511g(imageFormat);
                for (b bVar2 : SurfaceConfig.f32154g) {
                    if (Intrinsics.m31980c(size, bVar2.getRelatedFixedSize())) {
                        bVar = bVar2;
                        break;
                    }
                }
                if (bVar == b.f32175q && Intrinsics.m31980c(size, sizeM35511g)) {
                    bVar = b.f32171m;
                }
            } else if (iM45571c <= C12274d.m45571c(surfaceSizeDefinition.mo35415b())) {
                bVar = b.f32161c;
            } else if (iM45571c <= C12274d.m45571c(surfaceSizeDefinition.mo35419i())) {
                bVar = b.f32164f;
            } else if (iM45571c <= C12274d.m45571c(surfaceSizeDefinition.mo35420j())) {
                bVar = b.f32170l;
            } else {
                Size sizeM35511g2 = surfaceSizeDefinition.m35511g(imageFormat);
                Size sizeM35514o = surfaceSizeDefinition.m35514o(imageFormat);
                if ((sizeM35511g2 == null || iM45571c <= C12274d.m45571c(sizeM35511g2)) && cameraMode != 2) {
                    bVar = b.f32171m;
                } else if (sizeM35514o != null && iM45571c <= C12274d.m45571c(sizeM35514o)) {
                    bVar = b.f32174p;
                }
            }
            return m35489b(dVarM35490d, bVar, streamUseCase);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m31665d2 = {"Ln0/w3$b;", "", "", "id", "Landroid/util/Size;", "relatedFixedSize", "<init>", "(Ljava/lang/String;IILandroid/util/Size;)V", "a", "I", "b", "()I", "Landroid/util/Size;", "c", "()Landroid/util/Size;", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: f */
        public static final b f32164f;

        /* JADX INFO: renamed from: l */
        public static final b f32170l;

        /* JADX INFO: renamed from: r */
        public static final /* synthetic */ b[] f32176r;

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ InterfaceC10707a f32177s;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Size relatedFixedSize;

        /* JADX INFO: renamed from: c */
        public static final b f32161c = new b("VGA", 0, 0, new Size(640, 480));

        /* JADX INFO: renamed from: d */
        public static final b f32162d = new b("X_VGA", 1, 1, new Size(1024, 768));

        /* JADX INFO: renamed from: e */
        public static final b f32163e = new b("S720P_16_9", 2, 2, new Size(1280, 720));

        /* JADX INFO: renamed from: g */
        public static final b f32165g = new b("S1080P_4_3", 4, 4, new Size(1440, 1080));

        /* JADX INFO: renamed from: h */
        public static final b f32166h = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));

        /* JADX INFO: renamed from: i */
        public static final b f32167i = new b("S1440P_4_3", 6, 6, new Size(1920, 1440));

        /* JADX INFO: renamed from: j */
        public static final b f32168j = new b("S1440P_16_9", 7, 7, new Size(2560, 1440));

        /* JADX INFO: renamed from: k */
        public static final b f32169k = new b("UHD", 8, 8, new Size(3840, 2160));

        /* JADX INFO: renamed from: m */
        public static final b f32171m = new b("MAXIMUM", 10, 10, null, 2, null);

        /* JADX INFO: renamed from: n */
        public static final b f32172n = new b("MAXIMUM_4_3", 11, 11, null, 2, null);

        /* JADX INFO: renamed from: o */
        public static final b f32173o = new b("MAXIMUM_16_9", 12, 12, null, 2, null);

        /* JADX INFO: renamed from: p */
        public static final b f32174p = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);

        /* JADX INFO: renamed from: q */
        public static final b f32175q = new b("NOT_SUPPORT", 14, 14, null, 2, null);

        static {
            int i10 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Size size = null;
            f32164f = new b("PREVIEW", 3, 3, size, i10, defaultConstructorMarker);
            f32170l = new b("RECORD", 9, 9, size, i10, defaultConstructorMarker);
            b[] bVarArrM35493a = m35493a();
            f32176r = bVarArrM35493a;
            f32177s = C10708b.m40805a(bVarArrM35493a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str, int i10, int i11, Size size) {
            super(str, i10);
            this.id = i11;
            this.relatedFixedSize = size;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b[] m35493a() {
            return new b[]{f32161c, f32162d, f32163e, f32164f, f32165g, f32166h, f32167i, f32168j, f32169k, f32170l, f32171m, f32172n, f32173o, f32174p, f32175q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f32176r.clone();
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 int)
          (r3v0 int)
          (wrap android.util.Size:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.Size) : (r4v0 android.util.Size))
         A[MD:(java.lang.String, int, int, android.util.Size):void (m)] (LINE:2) call: n0.w3.b.<init>(java.lang.String, int, int, android.util.Size):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ b(String str, int i10, int i11, Size size, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, i11, (i12 & 2) != 0 ? null : size);
        }
    }

    /* JADX INFO: renamed from: n0.w3$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Ln0/w3$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public enum c {
        FEATURE_COMBINATION_TABLE,
        CAPTURE_SESSION_TABLES;


        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC10707a f32183d = C10708b.m40805a(m35496a());
    }

    /* JADX INFO: renamed from: n0.w3$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Ln0/w3$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public enum d {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW;


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC10707a f32190g = C10708b.m40805a(m35497a());
    }

    /* JADX INFO: renamed from: n0.w3$e */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32191a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f32164f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f32170l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f32171m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f32172n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f32173o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f32174p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f32175q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f32191a = iArr;
        }
    }

    static {
        Map<d, Integer> mapM31798m = C7690k0.m31798m(C7352s.m30477a(d.YUV, 35), C7352s.m30477a(d.JPEG, 256), C7352s.m30477a(d.JPEG_R, 4101), C7352s.m30477a(d.RAW, 32), C7352s.m30477a(d.PRIV, 34));
        f32155h = mapM31798m;
        Set<Map.Entry<d, Integer>> setEntrySet = mapM31798m.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f32156i = linkedHashMap;
    }

    public SurfaceConfig(@NotNull d configType, @NotNull b configSize, @NotNull EnumC8832u3 streamUseCase) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configSize, "configSize");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        this.configType = configType;
        this.configSize = configSize;
        this.streamUseCase = streamUseCase;
        Integer num = f32155h.get(configType);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SurfaceConfig m35476c(@NotNull d dVar, @NotNull b bVar) {
        return INSTANCE.m35488a(dVar, bVar);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SurfaceConfig m35477d(@NotNull d dVar, @NotNull b bVar, @NotNull EnumC8832u3 enumC8832u3) {
        return INSTANCE.m35489b(dVar, bVar, enumC8832u3);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final d m35478f(int i10) {
        return INSTANCE.m35490d(i10);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final SurfaceConfig m35479k(int i10, @NotNull Size size, @NotNull AbstractC8847x3 abstractC8847x3) {
        return INSTANCE.m35491e(i10, size, abstractC8847x3);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final SurfaceConfig m35480l(int i10, @NotNull Size size, @NotNull AbstractC8847x3 abstractC8847x3, int i11, @NotNull c cVar, @NotNull EnumC8832u3 enumC8832u3) {
        return INSTANCE.m35492f(i10, size, abstractC8847x3, i11, cVar, enumC8832u3);
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
    /* JADX INFO: renamed from: h */
    public final Size m35483h(@NotNull AbstractC8847x3 definition) {
        Size sizeMo35419i;
        Intrinsics.checkNotNullParameter(definition, "definition");
        switch (e.f32191a[this.configSize.ordinal()]) {
            case 1:
                sizeMo35419i = definition.mo35419i();
                break;
            case 2:
                sizeMo35419i = definition.mo35420j();
                break;
            case 3:
                sizeMo35419i = definition.m35511g(this.imageFormat);
                break;
            case 4:
                sizeMo35419i = definition.m35510e(this.imageFormat);
                break;
            case 5:
                sizeMo35419i = definition.m35509c(this.imageFormat);
                break;
            case 6:
                sizeMo35419i = definition.m35514o(this.imageFormat);
                break;
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                sizeMo35419i = this.configSize.getRelatedFixedSize();
                break;
        }
        Intrinsics.checkNotNull(sizeMo35419i);
        return sizeMo35419i;
    }

    public int hashCode() {
        return (((this.configType.hashCode() * 31) + this.configSize.hashCode()) * 31) + this.streamUseCase.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC8832u3 getStreamUseCase() {
        return this.streamUseCase;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m35485j(@NotNull SurfaceConfig other) {
        EnumC8832u3 enumC8832u3;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.configSize.getId() > this.configSize.getId() || other.configType != this.configType) {
            return false;
        }
        EnumC8832u3 enumC8832u4 = this.streamUseCase;
        EnumC8832u3 enumC8832u5 = EnumC8832u3.DEFAULT;
        return enumC8832u4 == enumC8832u5 || (enumC8832u3 = other.streamUseCase) == enumC8832u5 || enumC8832u3 == enumC8832u4;
    }

    @NotNull
    public String toString() {
        return "SurfaceConfig(configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + ')';
    }
}
