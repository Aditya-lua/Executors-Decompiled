package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Set;
import p593z3.AbstractC13694e;
import p593z3.C13697h;
import p593z3.C13698i;
import p593z3.C13700k;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0901d {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final C0900c.j f3206a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C0903f f3207b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public C0900c.e f3208c;

    /* JADX INFO: renamed from: d */
    public final boolean f3209d;

    /* JADX INFO: renamed from: e */
    public final int[] f3210e;

    /* JADX INFO: renamed from: androidx.emoji2.text.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static int m4306a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        /* JADX INFO: renamed from: b */
        public static int m4307b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$b */
    public static class b implements c<C13700k> {

        /* JADX INFO: renamed from: a */
        public C13700k f3211a;

        /* JADX INFO: renamed from: b */
        public final C0900c.j f3212b;

        public b(C13700k c13700k, C0900c.j jVar) {
            this.f3211a = c13700k;
            this.f3212b = jVar;
        }

        @Override // androidx.emoji2.text.C0901d.c
        /* JADX INFO: renamed from: a */
        public boolean mo4308a(@NonNull CharSequence charSequence, int i10, int i11, C13698i c13698i) {
            if (c13698i.m50050k()) {
                return true;
            }
            if (this.f3211a == null) {
                this.f3211a = new C13700k(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f3211a.setSpan(this.f3212b.mo4296a(c13698i), i10, i11, 33);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: b()Ljava/lang/Object; */
        @Override // androidx.emoji2.text.C0901d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C13700k mo4309b() {
            return this.f3211a;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$c */
    public interface c<T> {
        /* JADX INFO: renamed from: a */
        boolean mo4308a(@NonNull CharSequence charSequence, int i10, int i11, C13698i c13698i);

        /* JADX INFO: renamed from: b */
        T mo4309b();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d */
    public static class d implements c<d> {

        /* JADX INFO: renamed from: a */
        public final String f3213a;

        public d(String str) {
            this.f3213a = str;
        }

        @Override // androidx.emoji2.text.C0901d.c
        /* JADX INFO: renamed from: a */
        public boolean mo4308a(@NonNull CharSequence charSequence, int i10, int i11, C13698i c13698i) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f3213a)) {
                return true;
            }
            c13698i.m50051l(true);
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: b()Ljava/lang/Object; */
        @Override // androidx.emoji2.text.C0901d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d mo4309b() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public int f3214a = 1;

        /* JADX INFO: renamed from: b */
        public final C0903f.a f3215b;

        /* JADX INFO: renamed from: c */
        public C0903f.a f3216c;

        /* JADX INFO: renamed from: d */
        public C0903f.a f3217d;

        /* JADX INFO: renamed from: e */
        public int f3218e;

        /* JADX INFO: renamed from: f */
        public int f3219f;

        /* JADX INFO: renamed from: g */
        public final boolean f3220g;

        /* JADX INFO: renamed from: h */
        public final int[] f3221h;

        public e(C0903f.a aVar, boolean z10, int[] iArr) {
            this.f3215b = aVar;
            this.f3216c = aVar;
            this.f3220g = z10;
            this.f3221h = iArr;
        }

        /* JADX INFO: renamed from: d */
        public static boolean m4312d(int i10) {
            return i10 == 65039;
        }

        /* JADX INFO: renamed from: f */
        public static boolean m4313f(int i10) {
            return i10 == 65038;
        }

        /* JADX INFO: renamed from: a */
        public int m4314a(int i10) {
            C0903f.a aVarM4337a = this.f3216c.m4337a(i10);
            int iM4318g = 2;
            if (this.f3214a != 2) {
                if (aVarM4337a == null) {
                    iM4318g = m4318g();
                } else {
                    this.f3214a = 2;
                    this.f3216c = aVarM4337a;
                    this.f3219f = 1;
                }
            } else if (aVarM4337a != null) {
                this.f3216c = aVarM4337a;
                this.f3219f++;
            } else if (m4313f(i10)) {
                iM4318g = m4318g();
            } else if (!m4312d(i10)) {
                if (this.f3216c.m4338b() != null) {
                    iM4318g = 3;
                    if (this.f3219f != 1 || m4319h()) {
                        this.f3217d = this.f3216c;
                        m4318g();
                    } else {
                        iM4318g = m4318g();
                    }
                } else {
                    iM4318g = m4318g();
                }
            }
            this.f3218e = i10;
            return iM4318g;
        }

        /* JADX INFO: renamed from: b */
        public C13698i m4315b() {
            return this.f3216c.m4338b();
        }

        /* JADX INFO: renamed from: c */
        public C13698i m4316c() {
            return this.f3217d.m4338b();
        }

        /* JADX INFO: renamed from: e */
        public boolean m4317e() {
            if (this.f3214a != 2 || this.f3216c.m4338b() == null) {
                return false;
            }
            return this.f3219f > 1 || m4319h();
        }

        /* JADX INFO: renamed from: g */
        public final int m4318g() {
            this.f3214a = 1;
            this.f3216c = this.f3215b;
            this.f3219f = 0;
            return 1;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m4319h() {
            if (this.f3216c.m4338b().m50049j() || m4312d(this.f3218e)) {
                return true;
            }
            if (this.f3220g) {
                if (this.f3221h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3221h, this.f3216c.m4338b().m50041b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0901d(@NonNull C0903f c0903f, @NonNull C0900c.j jVar, @NonNull C0900c.e eVar, boolean z10, int[] iArr, @NonNull Set<int[]> set) {
        this.f3206a = jVar;
        this.f3207b = c0903f;
        this.f3208c = eVar;
        this.f3209d = z10;
        this.f3210e = iArr;
        m4303g(set);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4297a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z10) {
        AbstractC13694e[] abstractC13694eArr;
        if (m4301f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m4300e(selectionStart, selectionEnd) && (abstractC13694eArr = (AbstractC13694e[]) editable.getSpans(selectionStart, selectionEnd, AbstractC13694e.class)) != null && abstractC13694eArr.length > 0) {
            for (AbstractC13694e abstractC13694e : abstractC13694eArr) {
                int spanStart = editable.getSpanStart(abstractC13694e);
                int spanEnd = editable.getSpanEnd(abstractC13694e);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4298b(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m4300e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.m4306a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.m4307b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            AbstractC13694e[] abstractC13694eArr = (AbstractC13694e[]) editable.getSpans(iMax, iMin, AbstractC13694e.class);
            if (abstractC13694eArr != null && abstractC13694eArr.length > 0) {
                for (AbstractC13694e abstractC13694e : abstractC13694eArr) {
                    int spanStart = editable.getSpanStart(abstractC13694e);
                    int spanEnd = editable.getSpanEnd(abstractC13694e);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4299c(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        boolean zM4297a;
        if (i10 != 67) {
            zM4297a = i10 != 112 ? false : m4297a(editable, keyEvent, true);
        } else {
            zM4297a = m4297a(editable, keyEvent, false);
        }
        if (!zM4297a) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4300e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4301f(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4302d(CharSequence charSequence, int i10, int i11, C13698i c13698i) {
        if (c13698i.m50043d() == 0) {
            c13698i.m50052m(this.f3208c.mo4267a(charSequence, i10, i11, c13698i.m50047h()));
        }
        return c13698i.m50043d() == 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m4303g(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            m4305i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public CharSequence m4304h(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) throws Throwable {
        C13700k c13700k;
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        C13697h c13697h;
        AbstractC13694e[] abstractC13694eArr;
        int i15;
        int spanStart;
        boolean z11 = charSequence instanceof C13697h;
        if (z11) {
            ((C13697h) charSequence).m50029a();
        }
        if (z11) {
            c13700k = new C13700k((Spannable) charSequence);
            if (c13700k != null) {
                for (AbstractC13694e abstractC13694e : abstractC13694eArr) {
                    spanStart = c13700k.getSpanStart(abstractC13694e);
                    int spanEnd = c13700k.getSpanEnd(abstractC13694e);
                    if (spanStart != i11) {
                        c13700k.removeSpan(abstractC13694e);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                c13697h = (C13697h) charSequence2;
                c13697h.m50031d();
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                c13697h = (C13697h) charSequence2;
                c13697h.m50031d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c13700k = new C13700k((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((C13697h) charSequence2).m50031d();
                    throw th2;
                }
            } else {
                c13700k = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, AbstractC13694e.class) > i11) ? null : new C13700k(charSequence);
            }
            if (c13700k != null && (abstractC13694eArr = (AbstractC13694e[]) c13700k.getSpans(i10, i11, AbstractC13694e.class)) != null && abstractC13694eArr.length > 0) {
                while (i15 < r5) {
                    spanStart = c13700k.getSpanStart(abstractC13694e);
                    int spanEnd2 = c13700k.getSpanEnd(abstractC13694e);
                    if (spanStart != i11) {
                        c13700k.removeSpan(abstractC13694e);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14 && i13 < charSequence.length()) {
                if (i12 != Integer.MAX_VALUE && c13700k != null) {
                    i12 -= ((AbstractC13694e[]) c13700k.getSpans(0, c13700k.length(), AbstractC13694e.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    C13700k c13700k2 = (C13700k) m4305i(charSequence2, i13, i14, i12, z10, new b(c13700k, this.f3206a));
                    if (c13700k2 == null) {
                        if (z11) {
                            c13697h = (C13697h) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableM50058b = c13700k2.m50058b();
                    if (z11) {
                        ((C13697h) charSequence2).m50031d();
                    }
                    return spannableM50058b;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((C13697h) charSequence2).m50031d();
                    throw th2;
                }
            }
            charSequence2 = charSequence;
            if (!z11) {
                return charSequence2;
            }
            c13697h = (C13697h) charSequence2;
            c13697h.m50031d();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th2;
        }
        ((C13697h) charSequence2).m50031d();
        throw th2;
    }

    /* JADX INFO: renamed from: i */
    public final <T> T m4305i(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int iCharCount;
        e eVar = new e(this.f3207b.m4334f(), this.f3209d, this.f3210e);
        int i13 = 0;
        boolean zMo4308a = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (true) {
                if (i10 >= i11 || i13 >= i12 || !zMo4308a) {
                    break loop0;
                }
                int iM4314a = eVar.m4314a(iCodePointAt);
                if (iM4314a == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iM4314a == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iM4314a != 3) {
                }
            }
            if (z10 || !m4302d(charSequence, iCharCount, i10, eVar.m4316c())) {
                zMo4308a = cVar.mo4308a(charSequence, iCharCount, i10, eVar.m4316c());
                i13++;
            }
        }
        if (eVar.m4317e() && i13 < i12 && zMo4308a && (z10 || !m4302d(charSequence, iCharCount, i10, eVar.m4315b()))) {
            cVar.mo4308a(charSequence, iCharCount, i10, eVar.m4315b());
        }
        return cVar.mo4309b();
    }
}
