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

/* JADX INFO: renamed from: us.u */
/* JADX INFO: loaded from: classes3.dex */
public class C11955u implements Appendable, CharSequence {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f42384a;

    /* JADX INFO: renamed from: b */
    public final Deque<a> f42385b;

    /* JADX INFO: renamed from: us.u$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Object f42386a;

        /* JADX INFO: renamed from: b */
        public int f42387b;

        /* JADX INFO: renamed from: c */
        public int f42388c;

        /* JADX INFO: renamed from: d */
        public final int f42389d;

        public a(@NonNull Object obj, int i10, int i11, int i12) {
            this.f42386a = obj;
            this.f42387b = i10;
            this.f42388c = i11;
            this.f42389d = i12;
        }
    }

    /* JADX INFO: renamed from: us.u$b */
    public static class b extends SpannableStringBuilder {
        public b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11955u() {
        this("");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m44614g(int i10, int i11, int i12) {
        return i12 > i11 && i11 >= 0 && i12 <= i10;
    }

    /* JADX INFO: renamed from: j */
    public static void m44615j(@NonNull C11955u c11955u, Object obj, int i10, int i11) {
        if (obj == null || !m44614g(c11955u.length(), i10, i11)) {
            return;
        }
        m44616k(c11955u, obj, i10, i11);
    }

    /* JADX INFO: renamed from: k */
    public static void m44616k(@NonNull C11955u c11955u, Object obj, int i10, int i11) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c11955u.m44624i(obj, i10, i11, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                m44616k(c11955u, obj2, i10, i11);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: append(C)Ljava/lang/Appendable; */
    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C11955u append(char c10) {
        this.f42384a.append(c10);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Ljava/lang/Appendable; */
    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11955u append(@NonNull CharSequence charSequence) {
        m44621e(length(), charSequence);
        this.f42384a.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable; */
    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C11955u append(CharSequence charSequence, int i10, int i11) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
        m44621e(length(), charSequenceSubSequence);
        this.f42384a.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f42384a.charAt(i10);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C11955u m44620d(@NonNull String str) {
        this.f42384a.append(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m44621e(int i10, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z10) {
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj = spans[i11];
                        m44624i(obj, spanned.getSpanStart(obj) + i10, spanned.getSpanEnd(obj) + i10, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i12 = length - 1; i12 >= 0; i12--) {
                    Object obj2 = spans[i12];
                    m44624i(obj2, spanned.getSpanStart(obj2) + i10, spanned.getSpanEnd(obj2) + i10, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<a> m44622f(int i10, int i11) {
        int i12;
        int length = length();
        if (!m44614g(length, i10, i11)) {
            return Collections.EMPTY_LIST;
        }
        if (i10 == 0 && length == i11) {
            ArrayList arrayList = new ArrayList(this.f42385b);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.f42385b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i13 = next.f42387b;
            if ((i13 >= i10 && i13 < i11) || (((i12 = next.f42388c) <= i11 && i12 > i10) || (i13 < i10 && i12 > i11))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: h */
    public char m44623h() {
        return this.f42384a.charAt(length() - 1);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C11955u m44624i(@NonNull Object obj, int i10, int i11, int i12) {
        this.f42385b.push(new a(obj, i10, i11, i12));
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder m44625l() {
        b bVar = new b(this.f42384a);
        for (a aVar : this.f42385b) {
            bVar.setSpan(aVar.f42386a, aVar.f42387b, aVar.f42388c, aVar.f42389d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f42384a.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        List<a> listM44622f = m44622f(i10, i11);
        if (listM44622f.isEmpty()) {
            return this.f42384a.subSequence(i10, i11);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f42384a.subSequence(i10, i11));
        int length = spannableStringBuilder.length();
        for (a aVar : listM44622f) {
            int iMax = Math.max(0, aVar.f42387b - i10);
            spannableStringBuilder.setSpan(aVar.f42386a, iMax, Math.min(length, (aVar.f42388c - aVar.f42387b) + iMax), aVar.f42389d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f42384a.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11955u(@NonNull CharSequence charSequence) {
        this.f42385b = new ArrayDeque(8);
        this.f42384a = new StringBuilder(charSequence);
        m44621e(0, charSequence);
    }
}
