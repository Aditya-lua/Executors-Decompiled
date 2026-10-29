package z3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class k implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37148a = false;

    @NonNull
    public Spannable b;

    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof w2.e;
        }
    }

    public static class c extends b {
        @Override // z3.k.b
        public boolean a(CharSequence charSequence) {
            return w2.b.a(charSequence) || (charSequence instanceof w2.e);
        }
    }

    public k(@NonNull Spannable spannable) {
        this.b = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.b;
        if (!this.f37148a && c().a(spannable)) {
            this.b = new SpannableString(spannable);
        }
        this.f37148a = true;
    }

    public Spannable b() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream chars() {
        return a.a(this.b);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream codePoints() {
        return a.b(this.b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i10, int i11) {
        return this.b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.b.toString();
    }

    public k(@NonNull CharSequence charSequence) {
        this.b = new SpannableString(charSequence);
    }
}
