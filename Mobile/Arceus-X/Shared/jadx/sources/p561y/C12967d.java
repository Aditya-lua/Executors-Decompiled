package p561y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: y.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12967d {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR 
      (r1v0 int)
      (r2v0 java.util.List)
      (r3v0 java.util.concurrent.Executor)
      (r4v0 android.hardware.camera2.CameraCaptureSession$StateCallback)
     A[MD:(int, java.util.List<android.hardware.camera2.params.OutputConfiguration>, java.util.concurrent.Executor, android.hardware.camera2.CameraCaptureSession$StateCallback):void (c)] call: android.hardware.camera2.params.SessionConfiguration.<init>(int, java.util.List, java.util.concurrent.Executor, android.hardware.camera2.CameraCaptureSession$StateCallback):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SessionConfiguration m48225a(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i10, list, executor, stateCallback);
    }
}
