package zd;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    void a(@NonNull f fVar);

    Task<Integer> b(@NonNull d dVar);

    void c(@NonNull f fVar);

    @NonNull
    Task<Void> d(List<String> list);

    @NonNull
    Set<String> e();

    @NonNull
    Task<Void> f(List<String> list);
}
