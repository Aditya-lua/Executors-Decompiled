package gn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AbstractC5679e;
import p132fn.InterfaceC5719z;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gn.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m31665d2 = {"Lgn/d;", "Lgn/e;", "", "analyzeViewfinderRegionOnly", "<init>", "(Z)V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "original", "e", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Z", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "b", "Ljt/h;", "d", "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector", "c", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6140d implements InterfaceC6141e {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final float[] f23481d = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean analyzeViewfinderRegionOnly;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h barcodeDetector = C7342i.m30456b(new Function0() { // from class: gn.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C6140d.m27124c();
        }
    });

    public C6140d(boolean z10) {
        this.analyzeViewfinderRegionOnly = z10;
    }

    /* JADX INFO: renamed from: c */
    public static final BarcodeScanner m27124c() {
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(2048, new int[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // gn.InterfaceC6141e
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo27125a(@NotNull InterfaceC5719z interfaceC5719z, @Nullable Rect rect, @NotNull InterfaceC9557b<? super C7347n<? extends AbstractC6137a>> interfaceC9557b) {
        Bitmap bitmapMo25780e = interfaceC5719z.mo25780e();
        if (bitmapMo25780e == null) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(AbstractC6137a.b.f23474a);
        }
        Bitmap bitmapM27127e = m27127e(bitmapMo25780e);
        if (bitmapM27127e != null) {
            bitmapMo25780e = bitmapM27127e;
        }
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmapMo25780e, interfaceC5719z.mo25782g().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
        Task<List<Barcode>> taskProcess = m27126d().process(inputImageFromBitmap);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            List<Barcode> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Barcode barcode = (Barcode) CollectionsKt.m31708f0(result, 0);
            if (barcode == null) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            String rawValue = barcode.getRawValue();
            if (rawValue == null) {
                C7347n.Companion companion3 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            if (barcode.getFormat() != 2048) {
                C7347n.Companion companion4 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            AbstractC5679e.Pdf417BarcodeInfo pdf417BarcodeInfo = new AbstractC5679e.Pdf417BarcodeInfo(rawValue);
            Rect rectM27128a = C6142f.m27128a(interfaceC5719z, rect, this.analyzeViewfinderRegionOnly);
            Rect boundingBox = barcode.getBoundingBox();
            if (boundingBox == null) {
                C7347n.Companion companion5 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            rectM27128a.inset(1, 1);
            if (rectM27128a.contains(boundingBox)) {
                C7347n.Companion companion6 = C7347n.INSTANCE;
                return C7347n.m30460b(new AbstractC6137a.a(pdf417BarcodeInfo));
            }
            C7347n.Companion companion7 = C7347n.INSTANCE;
            return C7347n.m30460b(AbstractC6137a.b.f23474a);
        } catch (ExecutionException unused) {
            C7347n.Companion companion8 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new AbstractC6138b.b()));
        }
    }

    /* JADX INFO: renamed from: d */
    public final BarcodeScanner m27126d() {
        return (BarcodeScanner) this.barcodeDetector.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final Bitmap m27127e(Bitmap original) {
        try {
            return Toolkit.m13353b(Toolkit.f10772a, original, f23481d, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
