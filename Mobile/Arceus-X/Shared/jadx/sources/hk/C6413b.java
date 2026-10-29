package hk;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;
import p151gk.C6124q;

/* JADX INFO: renamed from: hk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C6413b {
    /* JADX INFO: renamed from: a */
    public static SpannableStringBuilder m28002a(SpannableStringBuilder spannableStringBuilder, String str, AbstractC6412a... abstractC6412aArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC6412a abstractC6412a : abstractC6412aArr) {
            try {
                if (str.contains(abstractC6412a.m27999a())) {
                    int iM28001c = abstractC6412a.m28001c();
                    int iM28000b = abstractC6412a.m28000b();
                    arrayList.add(abstractC6412a);
                    if (!m28004c(arrayList, str, iM28001c, iM28000b)) {
                        spannableStringBuilder.setSpan(abstractC6412a, iM28001c, iM28000b, 33);
                    }
                }
            } catch (NullPointerException e10) {
                C6124q.m27059d("NullPointer Exception in generateClickableString(): " + e10.getMessage());
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static void m28003b(TextView textView, String str, AbstractC6412a... abstractC6412aArr) {
        textView.setText(m28002a(new SpannableStringBuilder(str), str, abstractC6412aArr));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m28004c(ArrayList<AbstractC6412a> arrayList, String str, int i10, int i11) {
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            arrayList.get(i12).m27999a();
            int iM28001c = arrayList.get(i12).m28001c();
            int iM28000b = arrayList.get(i12).m28000b();
            if ((i10 >= iM28001c && i10 <= iM28000b) || (i11 >= iM28001c && i11 <= iM28000b)) {
                return true;
            }
        }
        return false;
    }
}
