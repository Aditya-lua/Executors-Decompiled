package tn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import sn.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ltn/d;", "Ltn/e;", BuildConfig.FLAVOR, "analyzeViewfinderRegionOnly", "<init>", "(Z)V", "Lsn/l0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lzt/n;", "Ltn/a;", "a", "(Lsn/l0;Landroid/graphics/Rect;Leu/b;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "original", "e", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Z", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "b", "Lzt/h;", "d", "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final float[] f32577d = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean analyzeViewfinderRegionOnly;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zt.h barcodeDetector = zt.i.a(new Function0() { // from class: tn.c
        @Override // p001kotlin.jvm.functions.Function0
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

    @Override // tn.e
    @Nullable
    public Object a(@NotNull l0 l0Var, @Nullable Rect rect, @NotNull eu.b<? super zt.n<? extends a>> bVar) {
        Bitmap bitmapA = l0Var.a();
        if (bitmapA == null) {
            zt.n.Companion companion = zt.n.INSTANCE;
            return zt.n.b(a.b.f32571a);
        }
        Bitmap bitmapE = e(bitmapA);
        if (bitmapE != null) {
            bitmapA = bitmapE;
        }
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmapA, l0Var.c().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
        Task<List<Barcode>> taskProcess = d().process(inputImageFromBitmap);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            List<Barcode> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Barcode barcode = (Barcode) CollectionsKt.f0(result, 0);
            if (barcode == null) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                return zt.n.b(a.b.f32571a);
            }
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                zt.n.Companion companion3 = zt.n.INSTANCE;
                return zt.n.b(a.b.f32571a);
            }
            if (barcode.getFormat() != 2048) {
                zt.n.Companion companion4 = zt.n.INSTANCE;
                return zt.n.b(a.b.f32571a);
            }
            sn.g.Pdf417BarcodeInfo pdf417BarcodeInfo = new sn.g.Pdf417BarcodeInfo(rawValue);
            Rect rectA = f.a(l0Var, rect, this.analyzeViewfinderRegionOnly);
            Rect boundingBox = barcode.getBoundingBox();
            if (boundingBox == null) {
                zt.n.Companion companion5 = zt.n.INSTANCE;
                return zt.n.b(a.b.f32571a);
            }
            rectA.inset(1, 1);
            if (rectA.contains(boundingBox)) {
                zt.n.Companion companion6 = zt.n.INSTANCE;
                return zt.n.b(new a.C0655a(pdf417BarcodeInfo));
            }
            zt.n.Companion companion7 = zt.n.INSTANCE;
            return zt.n.b(a.b.f32571a);
        } catch (ExecutionException unused) {
            zt.n.Companion companion8 = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(new b.C0656b()));
        }
    }

    public final BarcodeScanner d() {
        return (BarcodeScanner) this.barcodeDetector.getValue();
    }

    public final Bitmap e(Bitmap original) {
        try {
            return Toolkit.b(Toolkit.f8295a, original, f32577d, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
