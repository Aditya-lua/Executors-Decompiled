package e9;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;
import k9.g;

/* JADX INFO: loaded from: classes.dex */
public interface b extends g<k9.a.d.c> {
    @NonNull
    Task<RetrieveBytesResponse> e(@NonNull RetrieveBytesRequest retrieveBytesRequest);

    @NonNull
    Task<Integer> h(@NonNull StoreBytesData storeBytesData);

    @NonNull
    Task<Boolean> i(@NonNull DeleteBytesRequest deleteBytesRequest);

    @NonNull
    Task<Boolean> p();
}
