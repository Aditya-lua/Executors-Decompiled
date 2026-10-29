package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b<T> {
    @NonNull
    T create(@NonNull Context context);

    @NonNull
    List<Class<? extends b<?>>> dependencies();
}
