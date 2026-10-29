package hg;

import android.content.ContentProvider;
import androidx.annotation.NonNull;
import ef.l;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l f19315a = l.e();

    @NonNull
    public static AtomicBoolean b = new AtomicBoolean(false);

    public static l a() {
        return f19315a;
    }

    public static boolean b() {
        return b.get();
    }
}
