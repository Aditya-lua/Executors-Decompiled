package l9;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    <T extends i> T d(@NonNull String str, @NonNull Class<T> cls);

    Activity f();

    void g(@NonNull String str, @NonNull i iVar);

    void startActivityForResult(@NonNull Intent intent, int i10);
}
