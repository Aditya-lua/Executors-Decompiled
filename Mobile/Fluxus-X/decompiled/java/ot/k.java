package ot;

import android.text.Spannable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<TextView> f28548a;

    public k(@NonNull TextView textView) {
        this.f28548a = new WeakReference<>(textView);
    }

    public static void a(@NonNull Spannable spannable, @NonNull TextView textView) {
        k[] kVarArr = (k[]) spannable.getSpans(0, spannable.length(), k.class);
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                spannable.removeSpan(kVar);
            }
        }
        spannable.setSpan(new k(textView), 0, spannable.length(), 18);
    }
}
