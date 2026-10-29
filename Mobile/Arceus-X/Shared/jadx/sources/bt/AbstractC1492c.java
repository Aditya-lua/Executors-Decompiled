package bt;

import android.text.Spanned;

/* JADX INFO: renamed from: bt.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1492c {
    /* JADX INFO: renamed from: a */
    public static boolean m7618a(int i10, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i10;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7619b(int i10, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i10;
    }
}
