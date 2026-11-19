package sn;

import android.graphics.BitmapFactory;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import java.util.concurrent.ExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsn/i1;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "imagePath", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/google/mlkit/vision/text/TextRecognizer;", "a", "Lzt/h;", "c", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h textDetector = zt.i.a(new Function0() { // from class: sn.h1
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i1.d();
        }
    });

    public static final TextRecognizer d() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Nullable
    public final String b(@NotNull String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        try {
            InputImage inputImageFromBitmap = InputImage.fromBitmap(BitmapFactory.decodeFile(imagePath), 0);
            Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
            Task<Text> taskProcess = c().process(inputImageFromBitmap);
            Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
            try {
                tb.m.a(taskProcess);
            } catch (ExecutionException unused) {
            }
            return taskProcess.getResult().getText();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final TextRecognizer c() {
        return (TextRecognizer) this.textDetector.getValue();
    }
}
