package p216jc;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p194ic.C6742f;

/* JADX INFO: renamed from: jc.d */
/* JADX INFO: loaded from: classes2.dex */
public class C7140d extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a */
    public static final Property<ViewGroup, Float> f27790a = new C7140d("childrenAlpha");

    public C7140d(String str) {
        super(Float.class, str);
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(C6742f.f26012F);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f10) {
        float fFloatValue = f10.floatValue();
        viewGroup.setTag(C6742f.f26012F, f10);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
