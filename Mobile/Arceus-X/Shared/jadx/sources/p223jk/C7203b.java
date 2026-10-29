package p223jk;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043c7.AbstractC1553c;
import p315nt.InterfaceC9557b;
import p568y6.Size;

/* JADX INFO: renamed from: jk.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0013"}, m31665d2 = {"Ljk/b;", "Lc7/c;", "", "aspectRatio", "<init>", "(F)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "a", "F", "", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C7203b extends AbstractC1553c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float aspectRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7203b(float f10) {
        this.aspectRatio = f10;
        this.cacheKey = "RectangleCropTransformation";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m30128c(C7203b c7203b, Bitmap bitmap, Size size, InterfaceC9557b<? super Bitmap> interfaceC9557b) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return bitmap;
        }
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        float f13 = c7203b.aspectRatio;
        if (f12 > f13) {
            int i10 = (int) (f11 * f13);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (width - i10) / 2, 0, i10, height);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "let(...)");
            return bitmapCreateBitmap;
        }
        int i11 = (int) (f10 / f13);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, (height - i11) / 2, width, i11);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "let(...)");
        return bitmapCreateBitmap2;
    }

    @Override // p043c7.AbstractC1553c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // p043c7.AbstractC1553c
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo8145b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull InterfaceC9557b<? super Bitmap> interfaceC9557b) {
        return m30128c(this, bitmap, size, interfaceC9557b);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
      (wrap float:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1.7777778f float) : (r1v0 float))
     A[MD:(float):void (m)] (LINE:4) call: jk.b.<init>(float):void type: THIS */
    public /* synthetic */ C7203b(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.7777778f : f10);
    }
}
