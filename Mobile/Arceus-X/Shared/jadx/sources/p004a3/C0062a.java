package p004a3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p533x2.C12637g;

/* JADX INFO: renamed from: a3.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C0062a {

    /* JADX INFO: renamed from: a */
    public static final String[] f135a = new String[0];

    /* JADX INFO: renamed from: a3.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m135a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m128a(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m129b(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    /* JADX INFO: renamed from: c */
    public static void m130c(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    /* JADX INFO: renamed from: d */
    public static void m131d(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        C12637g.m47075g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m135a(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            m133f(editorInfo, null, 0, 0);
            return;
        }
        if (m129b(editorInfo.inputType)) {
            m133f(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m133f(editorInfo, charSequence, i13, i14);
        } else {
            m134g(editorInfo, charSequence, i13, i14);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m132e(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m135a(editorInfo, charSequence, 0);
        } else {
            m131d(editorInfo, charSequence, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m133f(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    /* JADX INFO: renamed from: g */
    public static void m134g(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int iMin = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int iMin2 = Math.min(i10, i14 - iMin);
        int i15 = i10 - iMin2;
        if (m128a(charSequence, i15, 0)) {
            i15++;
            iMin2--;
        }
        if (m128a(charSequence, (i11 + iMin) - 1, 1)) {
            iMin--;
        }
        m133f(editorInfo, i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i15, iMin2 + i13 + iMin + i15), iMin2, i13 + iMin2);
    }
}
