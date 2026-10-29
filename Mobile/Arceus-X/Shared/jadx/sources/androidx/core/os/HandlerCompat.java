package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class HandlerCompat {
    public static boolean postDelayed(@NonNull Handler handler, @NonNull Runnable r8, @Nullable Object token, long delayMillis) {
        if (Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(r8, token, delayMillis);
        }
        Message message = Message.obtain(handler, r8);
        message.obj = token;
        return handler.sendMessageDelayed(message, delayMillis);
    }

    private HandlerCompat() {
    }
}
