package va;

import android.content.Context;
import com.google.android.gms.internal.appindex.zzk;
import com.google.android.gms.tasks.Task;
import p487v8.AbstractC12107h;
import p487v8.C12103d;
import p487v8.InterfaceC12100a;
import sb.C11268m;

/* JADX INFO: renamed from: va.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12115c extends AbstractC12107h {

    /* JADX INFO: renamed from: b */
    public final C12150t0 f42732b;

    public C12115c(Context context) {
        this.f42732b = new C12150t0(context);
    }

    @Override // p487v8.AbstractC12107h
    /* JADX INFO: renamed from: a */
    public final Task<Void> mo44947a(InterfaceC12100a interfaceC12100a) {
        return m44955c(interfaceC12100a);
    }

    /* JADX INFO: renamed from: c */
    public final Task m44955c(InterfaceC12100a interfaceC12100a) {
        zzk[] zzkVarArr = new zzk[1];
        if (interfaceC12100a != null) {
            if (!(interfaceC12100a instanceof zzk)) {
                return C11268m.m42335e(new C12103d("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
            }
            zzkVarArr[0] = (zzk) interfaceC12100a;
        }
        return this.f42732b.m31136D(new C12146r0(this, zzkVarArr));
    }
}
