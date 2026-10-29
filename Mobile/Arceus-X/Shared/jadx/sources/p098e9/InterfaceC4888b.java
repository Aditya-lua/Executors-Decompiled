package p098e9;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;
import p242k9.C7491a;
import p242k9.InterfaceC7497g;

/* JADX INFO: renamed from: e9.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4888b extends InterfaceC7497g<C7491a.d.c> {
    @NonNull
    /* JADX INFO: renamed from: e */
    Task<RetrieveBytesResponse> mo303e(@NonNull RetrieveBytesRequest retrieveBytesRequest);

    @NonNull
    /* JADX INFO: renamed from: h */
    Task<Integer> mo304h(@NonNull StoreBytesData storeBytesData);

    @NonNull
    /* JADX INFO: renamed from: i */
    Task<Boolean> mo305i(@NonNull DeleteBytesRequest deleteBytesRequest);

    @NonNull
    /* JADX INFO: renamed from: p */
    Task<Boolean> mo306p();
}
