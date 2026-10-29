package p024b4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0900c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: b4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1221g implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f5102a;

    /* JADX INFO: renamed from: b */
    public final boolean f5103b;

    /* JADX INFO: renamed from: c */
    public C0900c.f f5104c;

    /* JADX INFO: renamed from: d */
    public int f5105d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f5106e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f5107f = true;

    /* JADX INFO: renamed from: b4.g$a */
    public static class a extends C0900c.f {

        /* JADX INFO: renamed from: a */
        public final Reference<EditText> f5108a;

        public a(EditText editText) {
            this.f5108a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C0900c.f
        /* JADX INFO: renamed from: b */
        public void mo1890b() {
            super.mo1890b();
            C1221g.m6863b(this.f5108a.get(), 1);
        }
    }

    public C1221g(EditText editText, boolean z10) {
        this.f5102a = editText;
        this.f5103b = z10;
    }

    /* JADX INFO: renamed from: b */
    public static void m6863b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0900c.m4270c().m4283p(editableText);
            C1218d.m6840b(editableText, selectionStart, selectionEnd);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0900c.f m6864a() {
        if (this.f5104c == null) {
            this.f5104c = new a(this.f5102a);
        }
        return this.f5104c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX INFO: renamed from: c */
    public void m6865c(boolean z10) {
        if (this.f5107f != z10) {
            if (this.f5104c != null) {
                C0900c.m4270c().m4288u(this.f5104c);
            }
            this.f5107f = z10;
            if (z10) {
                m6863b(this.f5102a, C0900c.m4270c().m4276e());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6866d() {
        if (this.f5107f) {
            return (this.f5103b || C0900c.m4274i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f5102a.isInEditMode() || m6866d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM4276e = C0900c.m4270c().m4276e();
        if (iM4276e != 0) {
            if (iM4276e == 1) {
                C0900c.m4270c().m4286s((Spannable) charSequence, i10, i10 + i12, this.f5105d, this.f5106e);
                return;
            } else if (iM4276e != 3) {
                return;
            }
        }
        C0900c.m4270c().m4287t(m6864a());
    }
}
