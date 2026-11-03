package en;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import dn.z;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Len/d;", "Len/e;", "", "analyzeViewfinderRegionOnly", "<init>", "(Z)V", "Ldn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lgt/n;", "Len/a;", "a", "(Ldn/z;Landroid/graphics/Rect;Llt/b;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "original", "e", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Z", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "b", "Lgt/h;", "d", "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final float[] f16157d = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean analyzeViewfinderRegionOnly;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h barcodeDetector = gt.i.b(new Function0() { // from class: en.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.c();
        }
    });

    public d(boolean z10) {
        this.analyzeViewfinderRegionOnly = z10;
    }

    public static final BarcodeScanner c() {
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_PDF417, new int[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // en.e
    @Nullable
    public Object a(@NotNull z zVar, @Nullable Rect rect, @NotNull lt.b<? super gt.n<? extends a>> bVar) {
        Bitmap bitmapE = zVar.e();
        if (bitmapE == null) {
            gt.n.Companion companion = gt.n.INSTANCE;
            return gt.n.b(a.b.f16151a);
        }
        Bitmap bitmapE2 = e(bitmapE);
        if (bitmapE2 != null) {
            bitmapE = bitmapE2;
        }
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmapE, zVar.g().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
        Task<List<Barcode>> taskProcess = d().process(inputImageFromBitmap);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            List<Barcode> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Barcode barcode = (Barcode) CollectionsKt.f0(result, 0);
            if (barcode == null) {
                gt.n.Companion companion2 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16151a);
            }
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                gt.n.Companion companion3 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16151a);
            }
            if (barcode.getFormat() != 2048) {
                gt.n.Companion companion4 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16151a);
            }
            dn.e.Pdf417BarcodeInfo pdf417BarcodeInfo = new dn.e.Pdf417BarcodeInfo(rawValue);
            Rect rectA = f.a(zVar, rect, this.analyzeViewfinderRegionOnly);
            Rect boundingBox = barcode.getBoundingBox();
            if (boundingBox == null) {
                gt.n.Companion companion5 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16151a);
            }
            rectA.inset(1, 1);
            if (rectA.contains(boundingBox)) {
                gt.n.Companion companion6 = gt.n.INSTANCE;
                return gt.n.b(new a.C0299a(pdf417BarcodeInfo));
            }
            gt.n.Companion companion7 = gt.n.INSTANCE;
            return gt.n.b(a.b.f16151a);
        } catch (ExecutionException unused) {
            gt.n.Companion companion8 = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(new b.C0300b()));
        }
    }

    public final BarcodeScanner d() {
        return (BarcodeScanner) this.barcodeDetector.getValue();
    }

    public final Bitmap e(Bitmap original) {
        try {
            return Toolkit.b(Toolkit.f8455a, original, f16157d, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
