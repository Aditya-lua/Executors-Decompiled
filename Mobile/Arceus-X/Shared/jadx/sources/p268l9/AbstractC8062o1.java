package p268l9;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: l9.o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8062o1 {

    /* JADX INFO: renamed from: a */
    public final int f30065a;

    public AbstractC8062o1(int i10) {
        this.f30065a = i10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
      (19 int)
      (wrap java.lang.String:STR_CONCAT 
      (wrap java.lang.String:0x0009: INVOKE 
      (wrap java.lang.Class<?>:0x0005: INVOKE (r2v0 android.os.RemoteException) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[MD:():java.lang.Class<?> (c), WRAPPED])
     VIRTUAL call: java.lang.Class.getSimpleName():java.lang.String A[MD:():java.lang.String (c), WRAPPED])
      (": ")
      (wrap java.lang.String:0x0015: INVOKE (r2v0 android.os.RemoteException) VIRTUAL call: java.lang.Throwable.getLocalizedMessage():java.lang.String A[MD:():java.lang.String (c), WRAPPED])
     A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED])
     A[MD:(int, java.lang.String):void (m)] call: com.google.android.gms.common.api.Status.<init>(int, java.lang.String):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Status m33253e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo33184a(@NonNull Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo33185b(@NonNull Exception exc);

    /* JADX INFO: renamed from: c */
    public abstract void mo33186c(C8046j0 c8046j0);

    /* JADX INFO: renamed from: d */
    public abstract void mo33232d(@NonNull C8093z c8093z, boolean z10);
}
