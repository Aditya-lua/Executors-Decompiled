package kd;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class w extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f22625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f22626g;

    public w(@NonNull com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f22624e = ic.e.f20670a;
        this.f22626g = new View.OnClickListener() { // from class: kd.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.v(this.f22623a, view);
            }
        };
        if (i10 != 0) {
            this.f22624e = i10;
        }
    }

    public static /* synthetic */ void v(w wVar, View view) {
        EditText editText = wVar.f22625f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (wVar.w()) {
            wVar.f22625f.setTransformationMethod(null);
        } else {
            wVar.f22625f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            wVar.f22625f.setSelection(selectionEnd);
        }
        wVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // kd.r
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // kd.r
    public int c() {
        return ic.i.f20751v;
    }

    @Override // kd.r
    public int d() {
        return this.f22624e;
    }

    @Override // kd.r
    public View.OnClickListener f() {
        return this.f22626g;
    }

    @Override // kd.r
    public boolean l() {
        return true;
    }

    @Override // kd.r
    public boolean m() {
        return !w();
    }

    @Override // kd.r
    public void n(EditText editText) {
        this.f22625f = editText;
        r();
    }

    @Override // kd.r
    public void s() {
        if (x(this.f22625f)) {
            this.f22625f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // kd.r
    public void u() {
        EditText editText = this.f22625f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f22625f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
