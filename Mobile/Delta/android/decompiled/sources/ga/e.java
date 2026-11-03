package ga;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface e extends IInterface {
    void F0(DataHolder dataHolder);

    void G(DataHolder dataHolder);

    void J1(int i10, String str);

    void K0(DataHolder dataHolder);

    void O1(DataHolder dataHolder);

    void Q1(DataHolder dataHolder, Contents contents);

    void R1(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3);

    void T0(int i10, String str);

    void U0(Status status, String str);

    void U1(Status status, String str, List list);

    void X0(DataHolder dataHolder);

    void a0(DataHolder dataHolder, DataHolder dataHolder2);

    void e();

    void k1(DataHolder dataHolder);

    void k2(DataHolder dataHolder);

    void n(DataHolder dataHolder);

    void r0(DataHolder dataHolder);

    void z0(DataHolder dataHolder);
}
