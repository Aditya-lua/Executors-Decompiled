package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
interface LocaleListInterface {
    boolean equals(Object obj);

    Locale get(int i10);

    @Nullable
    Locale getFirstMatch(String[] strArr);

    Object getLocaleList();

    int hashCode();

    @IntRange(from = -1)
    int indexOf(Locale locale);

    boolean isEmpty();

    void setLocaleList(@NonNull Locale... localeArr);

    @IntRange(from = 0)
    int size();

    String toLanguageTags();

    String toString();
}
