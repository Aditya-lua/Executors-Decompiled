package ce;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    @NonNull
    Task<Void> a(List<String> list);

    @NonNull
    Set<String> b();

    void c(@NonNull f fVar);

    Task<Integer> d(@NonNull d dVar);

    @NonNull
    Task<Void> e(List<String> list);

    void f(@NonNull f fVar);
}
