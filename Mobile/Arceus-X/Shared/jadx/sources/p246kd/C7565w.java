package p246kd;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.C2862a;
import p194ic.C6741e;
import p194ic.C6745i;

/* JADX INFO: renamed from: kd.w */
/* JADX INFO: loaded from: classes2.dex */
public class C7565w extends AbstractC7560r {

    /* JADX INFO: renamed from: e */
    public int f28994e;

    /* JADX INFO: renamed from: f */
    public EditText f28995f;

    /* JADX INFO: renamed from: g */
    public final View.OnClickListener f28996g;

    public C7565w(@NonNull C2862a c2862a, int i10) {
        super(c2862a);
        this.f28994e = C6741e.f25994a;
        this.f28996g = new View.OnClickListener() { // from class: kd.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7565w.m31307v(this.f28993a, view);
            }
        };
        if (i10 != 0) {
            this.f28994e = i10;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m31307v(C7565w c7565w, View view) {
        EditText editText = c7565w.f28995f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (c7565w.m31309w()) {
            c7565w.f28995f.setTransformationMethod(null);
        } else {
            c7565w.f28995f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            c7565w.f28995f.setSelection(selectionEnd);
        }
        c7565w.m31251r();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m31308x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: b */
    public void mo31250b(CharSequence charSequence, int i10, int i11, int i12) {
        m31251r();
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: c */
    public int mo31207c() {
        return C6745i.f26103v;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: d */
    public int mo31208d() {
        return this.f28994e;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo31210f() {
        return this.f28996g;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: l */
    public boolean mo31244l() {
        return true;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: m */
    public boolean mo31245m() {
        return !m31309w();
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: n */
    public void mo31212n(EditText editText) {
        this.f28995f = editText;
        m31251r();
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: s */
    public void mo31214s() {
        if (m31308x(this.f28995f)) {
            this.f28995f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: u */
    public void mo31215u() {
        EditText editText = this.f28995f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m31309w() {
        EditText editText = this.f28995f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
