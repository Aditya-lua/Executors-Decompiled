package p278lp;

import android.content.Context;
import android.nfc.NfcAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lp.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Llp/j;", "", "<init>", "()V", "", "b", "()Z", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Z", "Ljava/lang/Class;", "cachedActivityClass", "Z", "checkedActivityClass", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8228j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8228j f30508a = new C8228j();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile Class<?> cachedActivityClass;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static volatile boolean checkedActivityClass;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Class<?> m33571a() {
        Class<?> cls;
        if (!checkedActivityClass) {
            try {
                cls = Class.forName("com.withpersona.sdk2.inquiry.jpmynumber.impl.JpMyNumberNfcReaderActivity");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            cachedActivityClass = cls;
            checkedActivityClass = true;
        }
        return cachedActivityClass;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33572b() {
        return m33571a() != null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33573c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }
}
