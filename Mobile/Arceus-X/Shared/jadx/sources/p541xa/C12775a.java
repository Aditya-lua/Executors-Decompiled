package p541xa;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: loaded from: classes.dex */
public class C12775a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f45507a;

    /* JADX INFO: renamed from: b */
    public final String f45508b;

    public C12775a(IBinder iBinder, String str) {
        this.f45507a = iBinder;
        this.f45508b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45507a;
    }
}
