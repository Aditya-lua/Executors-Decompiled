package p246kd;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C2862a;
import com.google.android.material.textfield.TextInputLayout;
import p564y2.C13004c;
import p564y2.C13017p;

/* JADX INFO: renamed from: kd.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7560r {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f28955a;

    /* JADX INFO: renamed from: b */
    public final C2862a f28956b;

    /* JADX INFO: renamed from: c */
    public final Context f28957c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f28958d;

    public AbstractC7560r(@NonNull C2862a c2862a) {
        this.f28955a = c2862a.f10634a;
        this.f28956b = c2862a;
        this.f28957c = c2862a.getContext();
        this.f28958d = c2862a.m13241r();
    }

    /* JADX INFO: renamed from: a */
    public void mo31206a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    public void mo31250b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX INFO: renamed from: c */
    public int mo31207c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo31208d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo31209e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo31210f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo31211g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public C13004c.a mo31240h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo31241i(int i10) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo31242j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo31243k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo31244l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo31245m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void mo31212n(EditText editText) {
    }

    /* JADX INFO: renamed from: o */
    public void mo31246o(View view, @NonNull C13017p c13017p) {
    }

    /* JADX INFO: renamed from: p */
    public void mo31247p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: q */
    public void mo31213q(boolean z10) {
    }

    /* JADX INFO: renamed from: r */
    public final void m31251r() {
        this.f28956b.m13198L(false);
    }

    /* JADX INFO: renamed from: s */
    public void mo31214s() {
    }

    /* JADX INFO: renamed from: t */
    public boolean mo31248t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void mo31215u() {
    }
}
