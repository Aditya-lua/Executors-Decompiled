package p075dd;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: dd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C4541a {
    /* JADX INFO: renamed from: a */
    public float m22516a(@NonNull ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
