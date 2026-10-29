package ab;

import android.os.IInterface;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface n extends IInterface {
    void d1(Status status, RetrieveBytesResponse retrieveBytesResponse);

    void u0(Status status, byte[] bArr);
}
