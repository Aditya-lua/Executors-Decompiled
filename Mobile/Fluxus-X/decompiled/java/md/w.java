package md;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class w extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f23203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f23204g;

    public w(@NonNull com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f23202e = jc.e.f20358a;
        this.f23204g = new View.OnClickListener() { // from class: md.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.v(this.f23201a, view);
            }
        };
        if (i10 != 0) {
            this.f23202e = i10;
        }
    }

    public static /* synthetic */ void v(w wVar, View view) {
        EditText editText = wVar.f23203f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (wVar.w()) {
            wVar.f23203f.setTransformationMethod(null);
        } else {
            wVar.f23203f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            wVar.f23203f.setSelection(selectionEnd);
        }
        wVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // md.r
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // md.r
    public int c() {
        return jc.i.f20439v;
    }

    @Override // md.r
    public int d() {
        return this.f23202e;
    }

    @Override // md.r
    public View.OnClickListener f() {
        return this.f23204g;
    }

    @Override // md.r
    public boolean l() {
        return true;
    }

    @Override // md.r
    public boolean m() {
        return !w();
    }

    @Override // md.r
    public void n(EditText editText) {
        this.f23203f = editText;
        r();
    }

    @Override // md.r
    public void s() {
        if (x(this.f23203f)) {
            this.f23203f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // md.r
    public void u() {
        EditText editText = this.f23203f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f23203f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
