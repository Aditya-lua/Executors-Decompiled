package gn;

import com.google.mlkit.vision.common.InputImage;
import kotlin.Metadata;
import nr.InterfaceC9553a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gn.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m31665d2 = {"Lgn/n;", "Lnr/a;", "Lcom/google/mlkit/vision/common/InputImage;", "inputImage", "Ljt/n;", "Lgn/a;", "b", "(Lcom/google/mlkit/vision/common/InputImage;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC6150n extends InterfaceC9553a {
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m27143b(@NotNull InputImage inputImage, @NotNull InterfaceC9557b<? super C7347n<? extends AbstractC6137a>> interfaceC9557b);

    void close();
}
