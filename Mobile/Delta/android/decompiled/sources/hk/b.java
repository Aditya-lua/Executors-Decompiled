package hk;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import gk.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, String str, a... aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : aVarArr) {
            try {
                if (str.contains(aVar.a())) {
                    int iC = aVar.c();
                    int iB = aVar.b();
                    arrayList.add(aVar);
                    if (!c(arrayList, str, iC, iB)) {
                        spannableStringBuilder.setSpan(aVar, iC, iB, 33);
                    }
                }
            } catch (NullPointerException e10) {
                p.d("NullPointer Exception in generateClickableString(): " + e10.getMessage());
            }
        }
        return spannableStringBuilder;
    }

    public static void b(TextView textView, String str, a... aVarArr) {
        textView.setText(a(new SpannableStringBuilder(str), str, aVarArr));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean c(ArrayList<a> arrayList, String str, int i10, int i11) {
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            arrayList.get(i12).a();
            int iC = arrayList.get(i12).c();
            int iB = arrayList.get(i12).b();
            if ((i10 >= iC && i10 <= iB) || (i11 >= iC && i11 <= iB)) {
                return true;
            }
        }
        return false;
    }
}
