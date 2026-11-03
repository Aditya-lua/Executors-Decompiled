package jc;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class e extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f21818a;

    public e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f21818a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
