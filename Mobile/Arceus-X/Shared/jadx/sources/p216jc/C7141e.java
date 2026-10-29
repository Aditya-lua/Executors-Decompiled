package p216jc;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: jc.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7141e extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: b */
    public static final Property<Drawable, Integer> f27791b = new C7141e();

    /* JADX INFO: renamed from: a */
    public final WeakHashMap<Drawable, Integer> f27792a;

    public C7141e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f27792a = new WeakHashMap<>();
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
