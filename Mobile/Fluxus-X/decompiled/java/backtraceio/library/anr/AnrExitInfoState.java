package backtraceio.library.anr;

import android.content.Context;
import backtraceio.library.common.SharedPreferencesManager;

/* JADX INFO: loaded from: classes.dex */
public class AnrExitInfoState {
    private static final String PREFS_NAME = "ANR_APP_EXIT_INFO_STATE";
    private static final long TIMESTAMP_DEFAULT = 0;
    private static final String TIMESTAMP_PREF_KEY = "LAST_ANR_TIMESTAMP";
    private final SharedPreferencesManager sharedPreferencesManager;

    public AnrExitInfoState(Context context) {
        this.sharedPreferencesManager = new SharedPreferencesManager(context);
    }

    public long getLastTimestamp() {
        return this.sharedPreferencesManager.readLongFromSharedPreferences(PREFS_NAME, TIMESTAMP_PREF_KEY, Long.valueOf(TIMESTAMP_DEFAULT)).longValue();
    }

    public void saveTimestamp(long j10) {
        this.sharedPreferencesManager.saveLongToSharedPreferences(PREFS_NAME, TIMESTAMP_PREF_KEY, Long.valueOf(j10));
    }
}
