package p558xs;

import android.text.Spannable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: xs.j */
/* JADX INFO: loaded from: classes3.dex */
public class C12913j {

    /* JADX INFO: renamed from: a */
    public final WeakReference<TextView> f45801a;

    public C12913j(@NonNull TextView textView) {
        this.f45801a = new WeakReference<>(textView);
    }

    /* JADX INFO: renamed from: a */
    public static void m47940a(@NonNull Spannable spannable, @NonNull TextView textView) {
        C12913j[] c12913jArr = (C12913j[]) spannable.getSpans(0, spannable.length(), C12913j.class);
        if (c12913jArr != null) {
            for (C12913j c12913j : c12913jArr) {
                spannable.removeSpan(c12913j);
            }
        }
        spannable.setSpan(new C12913j(textView), 0, spannable.length(), 18);
    }
}
