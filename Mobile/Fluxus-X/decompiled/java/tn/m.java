package tn;

import android.graphics.Rect;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
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
import sn.MrzExtraction;
import sn.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ltn/m;", "Ltn/e;", "<init>", "()V", "Lsn/l0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lzt/n;", "Ltn/a;", "a", "(Lsn/l0;Landroid/graphics/Rect;Leu/b;)Ljava/lang/Object;", "Lcom/google/mlkit/vision/text/TextRecognizer;", "Lzt/h;", "c", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h textDetector = zt.i.a(new Function0() { // from class: tn.l
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.d();
        }
    });

    private final TextRecognizer c() {
        return (TextRecognizer) this.textDetector.getValue();
    }

    public static final TextRecognizer d() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // tn.e
    @Nullable
    public Object a(@NotNull l0 l0Var, @Nullable Rect rect, @NotNull eu.b<? super zt.n<? extends a>> bVar) {
        Task<Text> taskProcess = c().process(l0Var.c());
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            String text = taskProcess.getResult().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (Intrinsics.c(text, BuildConfig.FLAVOR)) {
                zt.n.Companion companion = zt.n.INSTANCE;
                return zt.n.b(a.b.f32571a);
            }
            MrzExtraction s0VarE = MrzExtraction.INSTANCE.e(text);
            if (s0VarE == null) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                return zt.n.b(a.b.f32571a);
            }
            zt.n.Companion companion3 = zt.n.INSTANCE;
            return zt.n.b(new a.C0655a(new sn.g.MrzBarcodeInfo(s0VarE.getRawText(), s0VarE.getIdentificationNumber(), s0VarE.getBirthdate(), s0VarE.getExpirationDate())));
        } catch (ExecutionException unused) {
            zt.n.Companion companion4 = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(new b.C0656b()));
        }
    }
}
