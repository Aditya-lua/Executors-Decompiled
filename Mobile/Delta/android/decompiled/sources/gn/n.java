package gn;

import com.google.mlkit.vision.common.InputImage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lgn/n;", "Lnr/a;", "Lcom/google/mlkit/vision/common/InputImage;", "inputImage", "Ljt/n;", "Lgn/a;", "b", "(Lcom/google/mlkit/vision/common/InputImage;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends nr.a {
    @Nullable
    Object b(@NotNull InputImage inputImage, @NotNull nt.b<? super jt.n<? extends a>> bVar);

    void close();
}
