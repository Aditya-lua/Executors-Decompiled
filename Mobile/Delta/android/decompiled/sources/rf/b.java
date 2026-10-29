package rf;

import androidx.annotation.NonNull;
import qf.e;
import rf.b;

/* JADX INFO: loaded from: classes2.dex */
public interface b<T extends b<T>> {
    @NonNull
    <U> T registerEncoder(@NonNull Class<U> cls, @NonNull e<? super U> eVar);
}
