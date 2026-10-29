package p593z3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;
import p505w2.C12290b;
import p505w2.C12293e;

/* JADX INFO: renamed from: z3.k */
/* JADX INFO: loaded from: classes.dex */
public class C13700k implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f48088a = false;

    /* JADX INFO: renamed from: b */
    @NonNull
    public Spannable f48089b;

    /* JADX INFO: renamed from: z3.k$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static IntStream m50059a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* JADX INFO: renamed from: b */
        public static IntStream m50060b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: renamed from: z3.k$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public boolean mo50061a(CharSequence charSequence) {
            return charSequence instanceof C12293e;
        }
    }

    /* JADX INFO: renamed from: z3.k$c */
    public static class c extends b {
        @Override // p593z3.C13700k.b
        /* JADX INFO: renamed from: a */
        public boolean mo50061a(CharSequence charSequence) {
            return C12290b.m45666a(charSequence) || (charSequence instanceof C12293e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13700k(@NonNull Spannable spannable) {
        this.f48089b = spannable;
    }

    /* JADX INFO: renamed from: c */
    public static b m50056c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* JADX INFO: renamed from: a */
    public final void m50057a() {
        Spannable spannable = this.f48089b;
        if (!this.f48088a && m50056c().mo50061a(spannable)) {
            this.f48089b = new SpannableString(spannable);
        }
        this.f48088a = true;
    }

    /* JADX INFO: renamed from: b */
    public Spannable m50058b() {
        return this.f48089b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f48089b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream chars() {
        return a.m50059a(this.f48089b);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream codePoints() {
        return a.m50060b(this.f48089b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f48089b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f48089b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f48089b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f48089b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f48089b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f48089b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m50057a();
        this.f48089b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        m50057a();
        this.f48089b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i10, int i11) {
        return this.f48089b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f48089b.toString();
    }

    public C13700k(@NonNull CharSequence charSequence) {
        this.f48089b = new SpannableString(charSequence);
    }
}
