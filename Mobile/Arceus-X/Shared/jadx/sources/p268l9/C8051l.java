package p268l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p305n9.C8953m;

/* JADX INFO: renamed from: l9.l */
/* JADX INFO: loaded from: classes.dex */
public class C8051l {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static <L> C8048k<L> m33233a(@NonNull L l10, @NonNull Looper looper, @NonNull String str) {
        C8953m.m36048m(l10, "Listener must not be null");
        C8953m.m36048m(looper, "Looper must not be null");
        C8953m.m36048m(str, "Listener type must not be null");
        return new C8048k<>(looper, l10, str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <L> C8048k<L> m33234b(@NonNull L l10, @NonNull Executor executor, @NonNull String str) {
        C8953m.m36048m(l10, "Listener must not be null");
        C8953m.m36048m(executor, "Executor must not be null");
        C8953m.m36048m(str, "Listener type must not be null");
        return new C8048k<>(executor, l10, str);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <L> C8048k.a<L> m33235c(@NonNull L l10, @NonNull String str) {
        C8953m.m36048m(l10, "Listener must not be null");
        C8953m.m36048m(str, "Listener type must not be null");
        C8953m.m36042g(str, "Listener type must not be empty");
        return new C8048k.a<>(l10, str);
    }
}
