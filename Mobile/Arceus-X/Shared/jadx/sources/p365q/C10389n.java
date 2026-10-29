package p365q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import p024b4.C1220f;
import p181i.C6598j;

/* JADX INFO: renamed from: q.n */
/* JADX INFO: loaded from: classes.dex */
public class C10389n {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TextView f37379a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C1220f f37380b;

    public C10389n(@NonNull TextView textView) {
        this.f37379a = textView;
        this.f37380b = new C1220f(textView, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public InputFilter[] m39924a(@NonNull InputFilter[] inputFilterArr) {
        return this.f37380b.m6844a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m39925b() {
        return this.f37380b.m6845b();
    }

    /* JADX INFO: renamed from: c */
    public void m39926c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f37379a.getContext().obtainStyledAttributes(attributeSet, C6598j.f25367i0, i10, 0);
        try {
            int i11 = C6598j.f25437w0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m39928e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m39927d(boolean z10) {
        this.f37380b.m6846c(z10);
    }

    /* JADX INFO: renamed from: e */
    public void m39928e(boolean z10) {
        this.f37380b.m6847d(z10);
    }

    /* JADX INFO: renamed from: f */
    public TransformationMethod m39929f(TransformationMethod transformationMethod) {
        return this.f37380b.m6848e(transformationMethod);
    }
}
