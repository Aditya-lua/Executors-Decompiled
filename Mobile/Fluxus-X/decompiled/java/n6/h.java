package n6;

import com.github.luben.zstd.BuildConfig;
import f7.h0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import z6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ln6/h;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Lz6/f;", "scale", "a", "(IIIILz6/f;)I", BuildConfig.FLAVOR, "d", "(IIIILz6/f;)D", BuildConfig.FLAVOR, "e", "(FFFFLz6/f;)F", "c", "(DDDDLz6/f;)D", "Lz6/g;", "targetSize", "maxSize", "Lf7/r;", "b", "(IILz6/g;Lz6/f;Lz6/g;)J", "Lz6/a;", "f", "(Lz6/a;Lz6/f;)I", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f25434a = new h();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25435a;

        static {
            int[] iArr = new int[z6.f.values().length];
            try {
                iArr[z6.f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z6.f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25435a = iArr;
        }
    }

    public static final int a(int srcWidth, int srcHeight, int dstWidth, int dstHeight, @NotNull z6.f scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i10 = a.f25435a[scale.ordinal()];
        if (i10 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return p001kotlin.ranges.d.c(iMin, 1);
    }

    public static final long b(int srcWidth, int srcHeight, @NotNull Size targetSize, @NotNull z6.f scale, @NotNull Size maxSize) {
        if (!z6.h.b(targetSize)) {
            h hVar = f25434a;
            int iF = hVar.f(targetSize.d(), scale);
            srcHeight = hVar.f(targetSize.c(), scale);
            srcWidth = iF;
        }
        if ((maxSize.d() instanceof z6.a.C0785a) && !h0.o(srcWidth)) {
            srcWidth = p001kotlin.ranges.d.f(srcWidth, ((z6.a.C0785a) maxSize.d()).getPx());
        }
        if ((maxSize.c() instanceof z6.a.C0785a) && !h0.o(srcHeight)) {
            srcHeight = p001kotlin.ranges.d.f(srcHeight, ((z6.a.C0785a) maxSize.c()).getPx());
        }
        return f7.r.a(srcWidth, srcHeight);
    }

    public static final double c(double srcWidth, double srcHeight, double dstWidth, double dstHeight, @NotNull z6.f scale) {
        double d10 = dstWidth / srcWidth;
        double d11 = dstHeight / srcHeight;
        int i10 = a.f25435a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d10, d11);
        }
        if (i10 == 2) {
            return Math.min(d10, d11);
        }
        throw new zt.l();
    }

    public static final double d(int srcWidth, int srcHeight, int dstWidth, int dstHeight, @NotNull z6.f scale) {
        double d10 = ((double) dstWidth) / ((double) srcWidth);
        double d11 = ((double) dstHeight) / ((double) srcHeight);
        int i10 = a.f25435a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d10, d11);
        }
        if (i10 == 2) {
            return Math.min(d10, d11);
        }
        throw new zt.l();
    }

    public static final float e(float srcWidth, float srcHeight, float dstWidth, float dstHeight, @NotNull z6.f scale) {
        float f10 = dstWidth / srcWidth;
        float f11 = dstHeight / srcHeight;
        int i10 = a.f25435a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(f10, f11);
        }
        if (i10 == 2) {
            return Math.min(f10, f11);
        }
        throw new zt.l();
    }

    public final int f(z6.a aVar, z6.f fVar) {
        if (aVar instanceof z6.a.C0785a) {
            return ((z6.a.C0785a) aVar).getPx();
        }
        int i10 = a.f25435a[fVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new zt.l();
    }
}
