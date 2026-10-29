package p132fn;

import android.graphics.BitmapFactory;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sb.C11268m;

/* JADX INFO: renamed from: fn.u0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lfn/u0;", "", "<init>", "()V", "", "imagePath", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/google/mlkit/vision/text/TextRecognizer;", "a", "Ljt/h;", "c", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5712u0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h textDetector = C7342i.m30456b(new Function0() { // from class: fn.t0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C5712u0.m25886d();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final TextRecognizer m25886d() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m25887b(@NotNull String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        try {
            InputImage inputImageFromBitmap = InputImage.fromBitmap(BitmapFactory.decodeFile(imagePath), 0);
            Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
            Task<Text> taskProcess = m25888c().process(inputImageFromBitmap);
            Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
            try {
                C11268m.m42331a(taskProcess);
            } catch (ExecutionException unused) {
            }
            return taskProcess.getResult().getText();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final TextRecognizer m25888c() {
        return (TextRecognizer) this.textDetector.getValue();
    }
}
