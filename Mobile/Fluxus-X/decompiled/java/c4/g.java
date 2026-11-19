package c4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f4783a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.emoji2.text.c.f f4784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4785d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4786e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4787f = true;

    public static class a extends androidx.emoji2.text.c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<EditText> f4788a;

        public a(EditText editText) {
            this.f4788a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            super.b();
            g.b(this.f4788a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f4783a = editText;
        this.b = z10;
    }

    public static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final androidx.emoji2.text.c.f a() {
        if (this.f4784c == null) {
            this.f4784c = new a(this.f4783a);
        }
        return this.f4784c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f4787f != z10) {
            if (this.f4784c != null) {
                androidx.emoji2.text.c.c().u(this.f4784c);
            }
            this.f4787f = z10;
            if (z10) {
                b(this.f4783a, androidx.emoji2.text.c.c().e());
            }
        }
    }

    public final boolean d() {
        if (this.f4787f) {
            return (this.b || androidx.emoji2.text.c.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f4783a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.c.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.c.c().s((Spannable) charSequence, i10, i10 + i12, this.f4785d, this.f4786e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.c().t(a());
    }
}
