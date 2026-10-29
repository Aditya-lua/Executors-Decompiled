package p204j0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021b1.C1196g;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p229jt.C7345l;
import p233k0.EnumC7401b;
import p296n0.C8757g2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p424s0.C11145f;

/* JADX INFO: renamed from: j0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u001f\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m31665d2 = {"Lj0/c;", "", "Ljava/lang/Class;", "surfaceClass", "", "defaultImageFormat", "<init>", "(Ljava/lang/String;ILjava/lang/Class;I)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "I", "getDefaultImageFormat", "()I", "c", "d", "e", "f", "g", "h", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public enum EnumC7013c {
    PREVIEW(SurfaceHolder.class, 34),
    IMAGE_CAPTURE(null, 256),
    VIDEO_CAPTURE(MediaCodec.class, 34),
    STREAM_SHARING(SurfaceTexture.class, 34),
    UNDEFINED(null, 34);


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Class<?> surfaceClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int defaultImageFormat;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ InterfaceC10707a f27466j = C10708b.m40805a(m29681a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0.c$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m31665d2 = {"Lj0/c$a;", "", "<init>", "()V", "Lg0/w2;", "Lj0/c;", "b", "(Lg0/w2;)Lj0/c;", "Ln0/i4;", "c", "(Ln0/i4;)Lj0/c;", "Lk0/b;", "a", "(Lg0/w2;)Lk0/b;", "useCase", "", "d", "(Lk0/b;Lg0/w2;)Z", "e", "(Lg0/w2;)Z", "f", "h", "g", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j0.c$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
        public /* synthetic */ class C14192a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f27469a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f27470b;

            static {
                int[] iArr = new int[InterfaceC8777j4.b.values().length];
                try {
                    iArr[InterfaceC8777j4.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InterfaceC8777j4.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InterfaceC8777j4.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InterfaceC8777j4.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f27469a = iArr;
                int[] iArr2 = new int[EnumC7401b.values().length];
                try {
                    iArr2[EnumC7401b.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EnumC7401b.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[EnumC7401b.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EnumC7401b.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f27470b = iArr2;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: j0.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final EnumC7401b m29683a(@NotNull AbstractC5952w2 abstractC5952w2) {
            EnumC7401b next;
            Intrinsics.checkNotNullParameter(abstractC5952w2, "<this>");
            Iterator<EnumC7401b> it = EnumC7401b.m30682b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (EnumC7013c.INSTANCE.m29686d(next, abstractC5952w2)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final EnumC7013c m29684b(@NotNull AbstractC5952w2 abstractC5952w2) {
            Intrinsics.checkNotNullParameter(abstractC5952w2, "<this>");
            if (abstractC5952w2 instanceof C5864a2) {
                return EnumC7013c.PREVIEW;
            }
            if (abstractC5952w2 instanceof C5883f1) {
                return EnumC7013c.IMAGE_CAPTURE;
            }
            if (C11145f.m41959e0(abstractC5952w2)) {
                return EnumC7013c.VIDEO_CAPTURE;
            }
            return abstractC5952w2 instanceof C1196g ? EnumC7013c.STREAM_SHARING : EnumC7013c.UNDEFINED;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final EnumC7013c m29685c(@NotNull InterfaceC8771i4<?> interfaceC8771i4) {
            Intrinsics.checkNotNullParameter(interfaceC8771i4, "<this>");
            int i10 = C14192a.f27469a[interfaceC8771i4.mo35207X().ordinal()];
            if (i10 == 1) {
                return EnumC7013c.IMAGE_CAPTURE;
            }
            if (i10 == 2) {
                return EnumC7013c.PREVIEW;
            }
            if (i10 != 3) {
                return i10 != 4 ? EnumC7013c.UNDEFINED : EnumC7013c.STREAM_SHARING;
            }
            return EnumC7013c.VIDEO_CAPTURE;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m29686d(EnumC7401b enumC7401b, AbstractC5952w2 abstractC5952w2) {
            int i10 = C14192a.f27470b[enumC7401b.ordinal()];
            if (i10 == 1) {
                return m29687e(abstractC5952w2);
            }
            if (i10 == 2) {
                return m29688f(abstractC5952w2);
            }
            if (i10 == 3) {
                return m29690h(abstractC5952w2);
            }
            if (i10 == 4) {
                return m29689g(abstractC5952w2);
            }
            throw new C7345l();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m29687e(AbstractC5952w2 abstractC5952w2) {
            return abstractC5952w2.m26698e().m35144Q();
        }

        /* JADX INFO: renamed from: f */
        public final boolean m29688f(AbstractC5952w2 abstractC5952w2) {
            return abstractC5952w2.m26698e().m35209f0();
        }

        /* JADX INFO: renamed from: g */
        public final boolean m29689g(AbstractC5952w2 abstractC5952w2) {
            return abstractC5952w2.m26698e().mo35023a(C8757g2.f31835U);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m29690h(AbstractC5952w2 abstractC5952w2) {
            return abstractC5952w2.m26698e().mo35023a(InterfaceC8771i4.f31903H) || abstractC5952w2.m26698e().mo35023a(InterfaceC8771i4.f31904I);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: j0.c$b */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27471a;

        static {
            int[] iArr = new int[EnumC7013c.values().length];
            try {
                iArr[EnumC7013c.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7013c.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7013c.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7013c.STREAM_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7013c.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27471a = iArr;
        }
    }

    EnumC7013c(Class cls, int i10) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i10;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Class<?> m29682b() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i10 = b.f27471a[ordinal()];
        if (i10 == 1) {
            return "Preview";
        }
        if (i10 == 2) {
            return "ImageCapture";
        }
        if (i10 == 3) {
            return "VideoCapture";
        }
        if (i10 == 4) {
            return "StreamSharing";
        }
        if (i10 == 5) {
            return "Undefined";
        }
        throw new C7345l();
    }
}
