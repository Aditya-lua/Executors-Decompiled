package m9;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    <T extends i> T d(@NonNull String str, @NonNull Class<T> cls);

    void f(@NonNull String str, @NonNull i iVar);

    Activity g();

    void startActivityForResult(@NonNull Intent intent, int i10);
}
