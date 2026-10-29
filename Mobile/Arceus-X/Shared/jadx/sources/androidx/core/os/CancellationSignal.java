package androidx.core.os;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this) {
            z10 = this.mIsCanceled;
        }
        return z10;
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new OperationCanceledException();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0051 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void cancel() throws Throwable {
        synchronized (this) {
            try {
                if (this.mIsCanceled) {
                    return;
                }
                this.mIsCanceled = true;
                this.mCancelInProgress = true;
                OnCancelListener listener = this.mOnCancelListener;
                try {
                    Object obj = this.mCancellationSignalObj;
                    try {
                        if (listener != null) {
                            try {
                                listener.onCancel();
                            } catch (Throwable th2) {
                                synchronized (this) {
                                    this.mCancelInProgress = false;
                                    notifyAll();
                                    throw th2;
                                }
                            }
                        }
                        if (obj != null && Build.VERSION.SDK_INT >= 16) {
                            ((android.os.CancellationSignal) obj).cancel();
                        }
                        synchronized (this) {
                            this.mCancelInProgress = false;
                            notifyAll();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public void setOnCancelListener(OnCancelListener listener) {
        synchronized (this) {
            waitForCancelFinishedLocked();
            if (this.mOnCancelListener == listener) {
                return;
            }
            this.mOnCancelListener = listener;
            if (this.mIsCanceled && listener != null) {
                listener.onCancel();
            }
        }
    }

    public Object getCancellationSignalObject() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.mCancellationSignalObj == null) {
                android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
                this.mCancellationSignalObj = cancellationSignal;
                if (this.mIsCanceled) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.mCancellationSignalObj;
        }
        return obj;
    }

    private void waitForCancelFinishedLocked() {
        while (this.mCancelInProgress) {
            try {
                wait();
            } catch (InterruptedException e10) {
            }
        }
    }
}
