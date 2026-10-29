package backtraceio.library.common;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesManager {
    private final Context context;

    public SharedPreferencesManager(Context context) {
        this.context = context;
    }

    public Long readLongFromSharedPreferences(String str, String str2, Long l10) {
        return Long.valueOf(this.context.getSharedPreferences(str, 0).getLong(str2, l10.longValue()));
    }

    public void saveLongToSharedPreferences(String str, String str2, Long l10) {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(str, 0).edit();
        editorEdit.putLong(str2, l10.longValue());
        editorEdit.commit();
    }
}
