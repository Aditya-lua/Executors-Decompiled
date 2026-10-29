package p066d3;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0591d;
import androidx.core.view.InterfaceC0646z;

/* JADX INFO: renamed from: d3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4432j implements InterfaceC0646z {
    /* JADX INFO: renamed from: b */
    public static CharSequence m22339b(Context context, ClipData.Item item, int i10) {
        if ((i10 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    /* JADX INFO: renamed from: c */
    public static void m22340c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC0646z
    /* JADX INFO: renamed from: a */
    public C0591d mo3236a(View view, C0591d c0591d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0591d);
        }
        if (c0591d.m2830d() == 2) {
            return c0591d;
        }
        ClipData clipDataM2828b = c0591d.m2828b();
        int iM2829c = c0591d.m2829c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < clipDataM2828b.getItemCount(); i10++) {
            CharSequence charSequenceM22339b = m22339b(context, clipDataM2828b.getItemAt(i10), iM2829c);
            if (charSequenceM22339b != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM22339b);
                } else {
                    m22340c(editable, charSequenceM22339b);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
