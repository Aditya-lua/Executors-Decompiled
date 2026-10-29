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
import z3.h;
import z3.i;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final androidx.emoji2.text.c.j f2439a;

    @NonNull
    public final f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public androidx.emoji2.text.c.e f2440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f2442e;

    public static final class a {
        public static int a(CharSequence charSequence, int i10, int i11) {
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

        public static int b(CharSequence charSequence, int i10, int i11) {
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

    public static class b implements c<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f2443a;
        public final androidx.emoji2.text.c.j b;

        public b(k kVar, androidx.emoji2.text.c.j jVar) {
            this.f2443a = kVar;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, i iVar) {
            if (iVar.k()) {
                return true;
            }
            if (this.f2443a == null) {
                this.f2443a = new k(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f2443a.setSpan(this.b.a(iVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k b() {
            return this.f2443a;
        }
    }

    public interface c<T> {
        boolean a(@NonNull CharSequence charSequence, int i10, int i11, i iVar);

        T b();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0037d implements c<C0037d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2444a;

        public C0037d(String str) {
            this.f2444a = str;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, i iVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f2444a)) {
                return true;
            }
            iVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0037d b() {
            return this;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2445a = 1;
        public final f.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.a f2446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f.a f2447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f2450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f2451h;

        public e(f.a aVar, boolean z10, int[] iArr) {
            this.b = aVar;
            this.f2446c = aVar;
            this.f2450g = z10;
            this.f2451h = iArr;
        }

        public static boolean d(int i10) {
            return i10 == 65039;
        }

        public static boolean f(int i10) {
            return i10 == 65038;
        }

        public int a(int i10) {
            f.a aVarA = this.f2446c.a(i10);
            int iG = 2;
            if (this.f2445a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f2445a = 2;
                    this.f2446c = aVarA;
                    this.f2449f = 1;
                }
            } else if (aVarA != null) {
                this.f2446c = aVarA;
                this.f2449f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f2446c.b() != null) {
                    iG = 3;
                    if (this.f2449f != 1 || h()) {
                        this.f2447d = this.f2446c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f2448e = i10;
            return iG;
        }

        public i b() {
            return this.f2446c.b();
        }

        public i c() {
            return this.f2447d.b();
        }

        public boolean e() {
            if (this.f2445a != 2 || this.f2446c.b() == null) {
                return false;
            }
            return this.f2449f > 1 || h();
        }

        public final int g() {
            this.f2445a = 1;
            this.f2446c = this.b;
            this.f2449f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f2446c.b().j() || d(this.f2448e)) {
                return true;
            }
            if (this.f2450g) {
                if (this.f2451h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2451h, this.f2446c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(@NonNull f fVar, @NonNull androidx.emoji2.text.c.j jVar, @NonNull androidx.emoji2.text.c.e eVar, boolean z10, int[] iArr, @NonNull Set<int[]> set) {
        this.f2439a = jVar;
        this.b = fVar;
        this.f2440c = eVar;
        this.f2441d = z10;
        this.f2442e = iArr;
        g(set);
    }

    public static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z10) {
        z3.e[] eVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (eVarArr = (z3.e[]) editable.getSpans(selectionStart, selectionEnd, z3.e.class)) != null && eVarArr.length > 0) {
            for (z3.e eVar : eVarArr) {
                int spanStart = editable.getSpanStart(eVar);
                int spanEnd = editable.getSpanEnd(eVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            z3.e[] eVarArr = (z3.e[]) editable.getSpans(iMax, iMin, z3.e.class);
            if (eVarArr != null && eVarArr.length > 0) {
                for (z3.e eVar : eVarArr) {
                    int spanStart = editable.getSpanStart(eVar);
                    int spanEnd = editable.getSpanEnd(eVar);
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

    public static boolean c(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        boolean zA;
        if (i10 != 67) {
            zA = i10 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    public static boolean f(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final boolean d(CharSequence charSequence, int i10, int i11, i iVar) {
        if (iVar.d() == 0) {
            iVar.m(this.f2440c.a(charSequence, i10, i11, iVar.h()));
        }
        return iVar.d() == 2;
    }

    public final void g(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new C0037d(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public CharSequence h(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) throws Throwable {
        k kVar;
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        h hVar;
        z3.e[] eVarArr;
        int i15;
        int spanStart;
        boolean z11 = charSequence instanceof h;
        if (z11) {
            ((h) charSequence).a();
        }
        if (z11) {
            kVar = new k((Spannable) charSequence);
            if (kVar != null) {
                for (z3.e eVar : eVarArr) {
                    spanStart = kVar.getSpanStart(eVar);
                    int spanEnd = kVar.getSpanEnd(eVar);
                    if (spanStart != i11) {
                        kVar.removeSpan(eVar);
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
                hVar = (h) charSequence2;
                hVar.d();
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                hVar = (h) charSequence2;
                hVar.d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    kVar = new k((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((h) charSequence2).d();
                    throw th2;
                }
            } else {
                kVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, z3.e.class) > i11) ? null : new k(charSequence);
            }
            if (kVar != null && (eVarArr = (z3.e[]) kVar.getSpans(i10, i11, z3.e.class)) != null && eVarArr.length > 0) {
                while (i15 < r5) {
                    spanStart = kVar.getSpanStart(eVar);
                    int spanEnd2 = kVar.getSpanEnd(eVar);
                    if (spanStart != i11) {
                        kVar.removeSpan(eVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14 && i13 < charSequence.length()) {
                if (i12 != Integer.MAX_VALUE && kVar != null) {
                    i12 -= ((z3.e[]) kVar.getSpans(0, kVar.length(), z3.e.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    k kVar2 = (k) i(charSequence2, i13, i14, i12, z10, new b(kVar, this.f2439a));
                    if (kVar2 == null) {
                        if (z11) {
                            hVar = (h) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = kVar2.b();
                    if (z11) {
                        ((h) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((h) charSequence2).d();
                    throw th2;
                }
            }
            charSequence2 = charSequence;
            if (!z11) {
                return charSequence2;
            }
            hVar = (h) charSequence2;
            hVar.d();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th2;
        }
        ((h) charSequence2).d();
        throw th2;
    }

    public final <T> T i(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int iCharCount;
        e eVar = new e(this.b.f(), this.f2441d, this.f2442e);
        int i13 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (true) {
                if (i10 >= i11 || i13 >= i12 || !zA) {
                    break loop0;
                }
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA != 3) {
                }
            }
            if (z10 || !d(charSequence, iCharCount, i10, eVar.c())) {
                zA = cVar.a(charSequence, iCharCount, i10, eVar.c());
                i13++;
            }
        }
        if (eVar.e() && i13 < i12 && zA && (z10 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.a(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.b();
    }
}
