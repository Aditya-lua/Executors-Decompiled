package p024b4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0900c;

/* JADX INFO: renamed from: b4.h */
/* JADX INFO: loaded from: classes.dex */
public class C1222h implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f5109a;

    public C1222h(TransformationMethod transformationMethod) {
        this.f5109a = transformationMethod;
    }

    /* JADX INFO: renamed from: a */
    public TransformationMethod m6867a() {
        return this.f5109a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f5109a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0900c.m4270c().m4276e() != 1) ? charSequence : C0900c.m4270c().m4283p(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f5109a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
