package p024b4;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0900c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: b4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1218d implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f5091a;

    /* JADX INFO: renamed from: b */
    public C0900c.f f5092b;

    /* JADX INFO: renamed from: b4.d$a */
    public static class a extends C0900c.f {

        /* JADX INFO: renamed from: a */
        public final Reference<TextView> f5093a;

        /* JADX INFO: renamed from: b */
        public final Reference<C1218d> f5094b;

        public a(TextView textView, C1218d c1218d) {
            this.f5093a = new WeakReference(textView);
            this.f5094b = new WeakReference(c1218d);
        }

        @Override // androidx.emoji2.text.C0900c.f
        /* JADX INFO: renamed from: b */
        public void mo1890b() {
            CharSequence text;
            CharSequence charSequenceM4283p;
            super.mo1890b();
            TextView textView = this.f5093a.get();
            if (m6842c(textView, this.f5094b.get()) && textView.isAttachedToWindow() && text != (charSequenceM4283p = C0900c.m4270c().m4283p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceM4283p);
                int selectionEnd = Selection.getSelectionEnd(charSequenceM4283p);
                textView.setText(charSequenceM4283p);
                if (charSequenceM4283p instanceof Spannable) {
                    C1218d.m6840b((Spannable) charSequenceM4283p, selectionStart, selectionEnd);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m6842c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1218d(@NonNull TextView textView) {
        this.f5091a = textView;
    }

    /* JADX INFO: renamed from: b */
    public static void m6840b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0900c.f m6841a() {
        if (this.f5092b == null) {
            this.f5092b = new a(this.f5091a, this);
        }
        return this.f5092b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f5091a.isInEditMode()) {
            return charSequence;
        }
        int iM4276e = C0900c.m4270c().m4276e();
        if (iM4276e != 0) {
            if (iM4276e == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f5091a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return C0900c.m4270c().m4284q(charSequence, 0, charSequence.length());
            }
            if (iM4276e != 3) {
                return charSequence;
            }
        }
        C0900c.m4270c().m4287t(m6841a());
        return charSequence;
    }
}
