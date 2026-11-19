package q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f29576a;

    @NonNull
    public final c4.f b;

    public n(@NonNull TextView textView) {
        this.f29576a = textView;
        this.b = new c4.f(textView, false);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public boolean b() {
        return this.b.b();
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f29576a.getContext().obtainStyledAttributes(attributeSet, i.j.f18901i0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i.j.f18971w0) ? typedArrayObtainStyledAttributes.getBoolean(i.j.f18971w0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void d(boolean z10) {
        this.b.c(z10);
    }

    public void e(boolean z10) {
        this.b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.b.e(transformationMethod);
    }
}
