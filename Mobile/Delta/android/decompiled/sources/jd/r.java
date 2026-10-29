package jd;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f21302a;
    public final com.google.android.material.textfield.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f21303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f21304d;

    public r(@NonNull com.google.android.material.textfield.a aVar) {
        this.f21302a = aVar.f8282a;
        this.b = aVar;
        this.f21303c = aVar.getContext();
        this.f21304d = aVar.r();
    }

    public void a(Editable editable) {
    }

    public void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public y2.c.a h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public void n(EditText editText) {
    }

    public void o(View view, @NonNull y2.p pVar) {
    }

    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void q(boolean z10) {
    }

    public final void r() {
        this.b.L(false);
    }

    public void s() {
    }

    public boolean t() {
        return false;
    }

    public void u() {
    }
}
