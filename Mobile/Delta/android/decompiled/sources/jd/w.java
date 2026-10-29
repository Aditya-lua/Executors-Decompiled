package jd;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class w extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f21337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f21338g;

    public w(@NonNull com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f21336e = hc.e.f18848a;
        this.f21338g = new View.OnClickListener() { // from class: jd.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.v(this.f21335a, view);
            }
        };
        if (i10 != 0) {
            this.f21336e = i10;
        }
    }

    public static /* synthetic */ void v(w wVar, View view) {
        EditText editText = wVar.f21337f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (wVar.w()) {
            wVar.f21337f.setTransformationMethod(null);
        } else {
            wVar.f21337f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            wVar.f21337f.setSelection(selectionEnd);
        }
        wVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // jd.r
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // jd.r
    public int c() {
        return hc.i.f18929v;
    }

    @Override // jd.r
    public int d() {
        return this.f21336e;
    }

    @Override // jd.r
    public View.OnClickListener f() {
        return this.f21338g;
    }

    @Override // jd.r
    public boolean l() {
        return true;
    }

    @Override // jd.r
    public boolean m() {
        return !w();
    }

    @Override // jd.r
    public void n(EditText editText) {
        this.f21337f = editText;
        r();
    }

    @Override // jd.r
    public void s() {
        if (x(this.f21337f)) {
            this.f21337f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // jd.r
    public void u() {
        EditText editText = this.f21337f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f21337f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
