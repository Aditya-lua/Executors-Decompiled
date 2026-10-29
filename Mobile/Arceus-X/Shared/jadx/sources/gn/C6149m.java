package gn;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
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
import p132fn.AbstractC5679e;
import p132fn.InterfaceC5719z;
import p132fn.MrzExtraction;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gn.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lgn/m;", "Lgn/e;", "<init>", "()V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Lcom/google/mlkit/vision/text/TextRecognizer;", "Ljt/h;", "c", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6149m implements InterfaceC6141e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h textDetector = C7342i.m30456b(new Function0() { // from class: gn.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C6149m.m27142d();
        }
    });

    /* JADX INFO: renamed from: c */
    private final TextRecognizer m27141c() {
        return (TextRecognizer) this.textDetector.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final TextRecognizer m27142d() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // gn.InterfaceC6141e
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo27125a(@NotNull InterfaceC5719z interfaceC5719z, @Nullable Rect rect, @NotNull InterfaceC9557b<? super C7347n<? extends AbstractC6137a>> interfaceC9557b) {
        Task<Text> taskProcess = m27141c().process(interfaceC5719z.mo25782g());
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        try {
            String text = taskProcess.getResult().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (Intrinsics.m31980c(text, "")) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            MrzExtraction c5684g0M25808e = MrzExtraction.INSTANCE.m25808e(text);
            if (c5684g0M25808e == null) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(new AbstractC6137a.a(new AbstractC5679e.MrzBarcodeInfo(c5684g0M25808e.getRawText(), c5684g0M25808e.getIdentificationNumber(), c5684g0M25808e.getBirthdate(), c5684g0M25808e.getExpirationDate())));
        } catch (ExecutionException unused) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new AbstractC6138b.b()));
        }
    }
}
