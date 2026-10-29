package cd;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public float a(@NonNull ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
