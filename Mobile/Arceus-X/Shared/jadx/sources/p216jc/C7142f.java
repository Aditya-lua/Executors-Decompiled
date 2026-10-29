package p216jc;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: jc.f */
/* JADX INFO: loaded from: classes2.dex */
public class C7142f extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a */
    public final Matrix f27793a;

    public C7142f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f27793a = new Matrix();
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(@NonNull ImageView imageView) {
        this.f27793a.set(imageView.getImageMatrix());
        return this.f27793a;
    }

    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
