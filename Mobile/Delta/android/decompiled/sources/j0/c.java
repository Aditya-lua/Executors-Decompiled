package j0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import b1.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.a2;
import g0.f1;
import g0.w2;
import java.util.Iterator;
import jt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n0.g2;
import n0.i4;
import n0.j4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u001f\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lj0/c;", "", "Ljava/lang/Class;", "surfaceClass", "", "defaultImageFormat", "<init>", "(Ljava/lang/String;ILjava/lang/Class;I)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "I", "getDefaultImageFormat", "()I", "c", "d", "e", "f", "g", "h", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum c {
    PREVIEW(SurfaceHolder.class, 34),
    IMAGE_CAPTURE(null, Barcode.FORMAT_QR_CODE),
    VIDEO_CAPTURE(MediaCodec.class, 34),
    STREAM_SHARING(SurfaceTexture.class, 34),
    UNDEFINED(null, 34);


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Class<?> surfaceClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int defaultImageFormat;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ qt.a f21023j = qt.b.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lj0/c$a;", "", "<init>", "()V", "Lg0/w2;", "Lj0/c;", "b", "(Lg0/w2;)Lj0/c;", "Ln0/i4;", "c", "(Ln0/i4;)Lj0/c;", "Lk0/b;", "a", "(Lg0/w2;)Lk0/b;", "useCase", "", "d", "(Lk0/b;Lg0/w2;)Z", "e", "(Lg0/w2;)Z", "f", "h", "g", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C0373a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21025a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[j4.b.values().length];
                try {
                    iArr[j4.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j4.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j4.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j4.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f21025a = iArr;
                int[] iArr2 = new int[k0.b.values().length];
                try {
                    iArr2[k0.b.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[k0.b.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[k0.b.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[k0.b.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final k0.b a(@NotNull w2 w2Var) {
            k0.b next;
            Intrinsics.checkNotNullParameter(w2Var, "<this>");
            Iterator<k0.b> it = k0.b.b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (c.INSTANCE.d(next, w2Var)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        @NotNull
        public final c b(@NotNull w2 w2Var) {
            Intrinsics.checkNotNullParameter(w2Var, "<this>");
            if (w2Var instanceof a2) {
                return c.PREVIEW;
            }
            if (w2Var instanceof f1) {
                return c.IMAGE_CAPTURE;
            }
            if (f.e0(w2Var)) {
                return c.VIDEO_CAPTURE;
            }
            return w2Var instanceof g ? c.STREAM_SHARING : c.UNDEFINED;
        }

        @NotNull
        public final c c(@NotNull i4<?> i4Var) {
            Intrinsics.checkNotNullParameter(i4Var, "<this>");
            int i10 = C0373a.f21025a[i4Var.X().ordinal()];
            if (i10 == 1) {
                return c.IMAGE_CAPTURE;
            }
            if (i10 == 2) {
                return c.PREVIEW;
            }
            if (i10 != 3) {
                return i10 != 4 ? c.UNDEFINED : c.STREAM_SHARING;
            }
            return c.VIDEO_CAPTURE;
        }

        public final boolean d(k0.b bVar, w2 w2Var) {
            int i10 = C0373a.b[bVar.ordinal()];
            if (i10 == 1) {
                return e(w2Var);
            }
            if (i10 == 2) {
                return f(w2Var);
            }
            if (i10 == 3) {
                return h(w2Var);
            }
            if (i10 == 4) {
                return g(w2Var);
            }
            throw new l();
        }

        public final boolean e(w2 w2Var) {
            return w2Var.e().Q();
        }

        public final boolean f(w2 w2Var) {
            return w2Var.e().f0();
        }

        public final boolean g(w2 w2Var) {
            return w2Var.e().a(g2.U);
        }

        public final boolean h(w2 w2Var) {
            return w2Var.e().a(i4.H) || w2Var.e().a(i4.I);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21026a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.STREAM_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21026a = iArr;
        }
    }

    c(Class cls, int i10) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i10;
    }

    @Nullable
    public final Class<?> b() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i10 = b.f21026a[ordinal()];
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
        throw new l();
    }
}
