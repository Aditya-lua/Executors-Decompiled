package p593z3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p533x2.C12637g;

/* JADX INFO: renamed from: z3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13697h extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Class<?> f48078a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final List<a> f48079b;

    /* JADX INFO: renamed from: z3.h$a */
    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        public final Object f48080a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f48081b = new AtomicInteger(0);

        public a(Object obj) {
            this.f48080a = obj;
        }

        /* JADX INFO: renamed from: a */
        public final void m50037a() {
            this.f48081b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f48080a).afterTextChanged(editable);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m50038b(Object obj) {
            return obj instanceof AbstractC13694e;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f48080a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        /* JADX INFO: renamed from: c */
        public final void m50039c() {
            this.f48081b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f48081b.get() <= 0 || !m50038b(obj)) {
                ((SpanWatcher) this.f48080a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f48081b.get() <= 0 || !m50038b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i14 = i10;
                    i15 = i12;
                } else {
                    if (i10 > i11) {
                        i10 = 0;
                    }
                    if (i12 > i13) {
                        i14 = i10;
                        i15 = 0;
                    } else {
                        i14 = i10;
                        i15 = i12;
                    }
                }
                ((SpanWatcher) this.f48080a).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f48081b.get() <= 0 || !m50038b(obj)) {
                ((SpanWatcher) this.f48080a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f48080a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13697h(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f48079b = new ArrayList();
        C12637g.m47076h(cls, "watcherClass cannot be null");
        this.f48078a = cls;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C13697h m50028c(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new C13697h(cls, charSequence);
    }

    /* JADX INFO: renamed from: a */
    public void m50029a() {
        m50030b();
    }

    /* JADX INFO: renamed from: b */
    public final void m50030b() {
        for (int i10 = 0; i10 < this.f48079b.size(); i10++) {
            this.f48079b.get(i10).m50037a();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m50031d() {
        m50036i();
        m50032e();
    }

    /* JADX INFO: renamed from: e */
    public final void m50032e() {
        for (int i10 = 0; i10 < this.f48079b.size(); i10++) {
            this.f48079b.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: f */
    public final a m50033f(Object obj) {
        for (int i10 = 0; i10 < this.f48079b.size(); i10++) {
            a aVar = this.f48079b.get(i10);
            if (aVar.f48080a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m50034g(@NonNull Class<?> cls) {
        return this.f48078a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarM50033f;
        if (m50035h(obj) && (aVarM50033f = m50033f(obj)) != null) {
            obj = aVarM50033f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarM50033f;
        if (m50035h(obj) && (aVarM50033f = m50033f(obj)) != null) {
            obj = aVarM50033f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarM50033f;
        if (m50035h(obj) && (aVarM50033f = m50033f(obj)) != null) {
            obj = aVarM50033f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, @NonNull Class<T> cls) {
        if (!m50034g(cls)) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f48080a;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m50035h(Object obj) {
        return obj != null && m50034g(obj.getClass());
    }

    /* JADX INFO: renamed from: i */
    public final void m50036i() {
        for (int i10 = 0; i10 < this.f48079b.size(); i10++) {
            this.f48079b.get(i10).m50039c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || m50034g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarM50033f;
        if (m50035h(obj)) {
            aVarM50033f = m50033f(obj);
            if (aVarM50033f != null) {
                obj = aVarM50033f;
            }
        } else {
            aVarM50033f = null;
        }
        super.removeSpan(obj);
        if (aVarM50033f != null) {
            this.f48079b.remove(aVarM50033f);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (m50035h(obj)) {
            a aVar = new a(obj);
            this.f48079b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new C13697h(this.f48078a, this, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: delete(II)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: insert(ILjava/lang/CharSequence;)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: replace(IILjava/lang/CharSequence;)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        m50030b();
        super.replace(i10, i11, charSequence);
        m50036i();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: insert(ILjava/lang/CharSequence;II)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public C13697h(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f48079b = new ArrayList();
        C12637g.m47076h(cls, "watcherClass cannot be null");
        this.f48078a = cls;
    }

    /* JADX DEBUG: Method merged with bridge method: replace(IILjava/lang/CharSequence;II)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        m50030b();
        super.replace(i10, i11, charSequence, i12, i13);
        m50036i();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Landroid/text/Editable; */
    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Ljava/lang/Appendable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(C)Landroid/text/Editable; */
    /* JADX DEBUG: Method merged with bridge method: append(C)Ljava/lang/Appendable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Landroid/text/Editable; */
    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
