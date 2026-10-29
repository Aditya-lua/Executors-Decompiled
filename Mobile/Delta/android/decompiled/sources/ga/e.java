package ga;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface e extends IInterface {
    void D0(DataHolder dataHolder);

    void I(DataHolder dataHolder);

    void J1(int i10, String str);

    void K0(DataHolder dataHolder);

    void O0(DataHolder dataHolder);

    void O1(DataHolder dataHolder);

    void Q1(DataHolder dataHolder, Contents contents);

    void R1(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3);

    void U1(Status status, String str, List list);

    void W0(int i10, String str);

    void X0(Status status, String str);

    void a1(DataHolder dataHolder);

    void c0(DataHolder dataHolder, DataHolder dataHolder2);

    void e();

    void k2(DataHolder dataHolder);

    void n(DataHolder dataHolder);

    void o1(DataHolder dataHolder);

    void t0(DataHolder dataHolder);
}
