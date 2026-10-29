package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0547d;

/* JADX INFO: renamed from: androidx.emoji2.text.b */
/* JADX INFO: loaded from: classes.dex */
public class C0899b implements C0900c.e {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<StringBuilder> f3170b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final TextPaint f3171a;

    public C0899b() {
        TextPaint textPaint = new TextPaint();
        this.f3171a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m4266b() {
        ThreadLocal<StringBuilder> threadLocal = f3170b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.C0900c.e
    /* JADX INFO: renamed from: a */
    public boolean mo4267a(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbM4266b = m4266b();
        sbM4266b.setLength(0);
        while (i10 < i11) {
            sbM4266b.append(charSequence.charAt(i10));
            i10++;
        }
        return C0547d.m2679a(this.f3171a, sbM4266b.toString());
    }
}
