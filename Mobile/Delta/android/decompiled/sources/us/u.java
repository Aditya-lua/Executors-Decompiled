package us;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u implements Appendable, CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f32619a;
    public final Deque<a> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f32620a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f32622d;

        public a(@NonNull Object obj, int i10, int i11, int i12) {
            this.f32620a = obj;
            this.b = i10;
            this.f32621c = i11;
            this.f32622d = i12;
        }
    }

    public static class b extends SpannableStringBuilder {
        public b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public u() {
        this("");
    }

    public static boolean g(int i10, int i11, int i12) {
        return i12 > i11 && i11 >= 0 && i12 <= i10;
    }

    public static void j(@NonNull u uVar, Object obj, int i10, int i11) {
        if (obj == null || !g(uVar.length(), i10, i11)) {
            return;
        }
        k(uVar, obj, i10, i11);
    }

    public static void k(@NonNull u uVar, Object obj, int i10, int i11) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                uVar.i(obj, i10, i11, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                k(uVar, obj2, i10, i11);
            }
        }
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u append(char c10) {
        this.f32619a.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u append(@NonNull CharSequence charSequence) {
        e(length(), charSequence);
        this.f32619a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u append(CharSequence charSequence, int i10, int i11) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
        e(length(), charSequenceSubSequence);
        this.f32619a.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f32619a.charAt(i10);
    }

    @NonNull
    public u d(@NonNull String str) {
        this.f32619a.append(str);
        return this;
    }

    public final void e(int i10, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z10) {
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj = spans[i11];
                        i(obj, spanned.getSpanStart(obj) + i10, spanned.getSpanEnd(obj) + i10, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i12 = length - 1; i12 >= 0; i12--) {
                    Object obj2 = spans[i12];
                    i(obj2, spanned.getSpanStart(obj2) + i10, spanned.getSpanEnd(obj2) + i10, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    @NonNull
    public List<a> f(int i10, int i11) {
        int i12;
        int length = length();
        if (!g(length, i10, i11)) {
            return Collections.EMPTY_LIST;
        }
        if (i10 == 0 && length == i11) {
            ArrayList arrayList = new ArrayList(this.b);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i13 = next.b;
            if ((i13 >= i10 && i13 < i11) || (((i12 = next.f32621c) <= i11 && i12 > i10) || (i13 < i10 && i12 > i11))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char h() {
        return this.f32619a.charAt(length() - 1);
    }

    @NonNull
    public u i(@NonNull Object obj, int i10, int i11, int i12) {
        this.b.push(new a(obj, i10, i11, i12));
        return this;
    }

    @NonNull
    public SpannableStringBuilder l() {
        b bVar = new b(this.f32619a);
        for (a aVar : this.b) {
            bVar.setSpan(aVar.f32620a, aVar.b, aVar.f32621c, aVar.f32622d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f32619a.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        List<a> listF = f(i10, i11);
        if (listF.isEmpty()) {
            return this.f32619a.subSequence(i10, i11);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f32619a.subSequence(i10, i11));
        int length = spannableStringBuilder.length();
        for (a aVar : listF) {
            int iMax = Math.max(0, aVar.b - i10);
            spannableStringBuilder.setSpan(aVar.f32620a, iMax, Math.min(length, (aVar.f32621c - aVar.b) + iMax), aVar.f32622d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f32619a.toString();
    }

    public u(@NonNull CharSequence charSequence) {
        this.b = new ArrayDeque(8);
        this.f32619a = new StringBuilder(charSequence);
        e(0, charSequence);
    }
}
