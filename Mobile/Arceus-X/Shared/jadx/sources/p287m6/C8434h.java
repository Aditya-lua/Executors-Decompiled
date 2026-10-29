package p287m6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p096e7.C4861h0;
import p096e7.C4872r;
import p229jt.C7345l;
import p568y6.C13109h;
import p568y6.EnumC13107f;
import p568y6.InterfaceC13102a;
import p568y6.Size;

/* JADX INFO: renamed from: m6.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lm6/h;", "", "<init>", "()V", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Ly6/f;", "scale", "a", "(IIIILy6/f;)I", "", "d", "(IIIILy6/f;)D", "", "e", "(FFFFLy6/f;)F", "c", "(DDDDLy6/f;)D", "Ly6/g;", "targetSize", "maxSize", "Le7/r;", "b", "(IILy6/g;Ly6/f;Ly6/g;)J", "Ly6/a;", "f", "(Ly6/a;Ly6/f;)I", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8434h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8434h f31110a = new C8434h();

    /* JADX INFO: renamed from: m6.h$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31111a;

        static {
            int[] iArr = new int[EnumC13107f.values().length];
            try {
                iArr[EnumC13107f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13107f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31111a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m34193a(int srcWidth, int srcHeight, int dstWidth, int dstHeight, @NotNull EnumC13107f scale) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i10 = a.f31111a[scale.ordinal()];
        if (i10 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return C7764d.m32078c(iMin, 1);
    }

    /* JADX INFO: renamed from: b */
    public static final long m34194b(int srcWidth, int srcHeight, @NotNull Size targetSize, @NotNull EnumC13107f scale, @NotNull Size maxSize) {
        if (!C13109h.m48713b(targetSize)) {
            C8434h c8434h = f31110a;
            int iM34198f = c8434h.m34198f(targetSize.m48711d(), scale);
            srcHeight = c8434h.m34198f(targetSize.m48710c(), scale);
            srcWidth = iM34198f;
        }
        if ((maxSize.m48711d() instanceof InterfaceC13102a.a) && !C4861h0.m23448o(srcWidth)) {
            srcWidth = C7764d.m32081f(srcWidth, ((InterfaceC13102a.a) maxSize.m48711d()).getPx());
        }
        if ((maxSize.m48710c() instanceof InterfaceC13102a.a) && !C4861h0.m23448o(srcHeight)) {
            srcHeight = C7764d.m32081f(srcHeight, ((InterfaceC13102a.a) maxSize.m48710c()).getPx());
        }
        return C4872r.m23478a(srcWidth, srcHeight);
    }

    /* JADX INFO: renamed from: c */
    public static final double m34195c(double srcWidth, double srcHeight, double dstWidth, double dstHeight, @NotNull EnumC13107f scale) {
        double d10 = dstWidth / srcWidth;
        double d11 = dstHeight / srcHeight;
        int i10 = a.f31111a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d10, d11);
        }
        if (i10 == 2) {
            return Math.min(d10, d11);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: d */
    public static final double m34196d(int srcWidth, int srcHeight, int dstWidth, int dstHeight, @NotNull EnumC13107f scale) {
        double d10 = ((double) dstWidth) / ((double) srcWidth);
        double d11 = ((double) dstHeight) / ((double) srcHeight);
        int i10 = a.f31111a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(d10, d11);
        }
        if (i10 == 2) {
            return Math.min(d10, d11);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: e */
    public static final float m34197e(float srcWidth, float srcHeight, float dstWidth, float dstHeight, @NotNull EnumC13107f scale) {
        float f10 = dstWidth / srcWidth;
        float f11 = dstHeight / srcHeight;
        int i10 = a.f31111a[scale.ordinal()];
        if (i10 == 1) {
            return Math.max(f10, f11);
        }
        if (i10 == 2) {
            return Math.min(f10, f11);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: f */
    public final int m34198f(InterfaceC13102a interfaceC13102a, EnumC13107f enumC13107f) {
        if (interfaceC13102a instanceof InterfaceC13102a.a) {
            return ((InterfaceC13102a.a) interfaceC13102a).getPx();
        }
        int i10 = a.f31111a[enumC13107f.ordinal()];
        if (i10 == 1) {
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new C7345l();
    }
}
