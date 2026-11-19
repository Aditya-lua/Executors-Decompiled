package q4;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lq4/a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "()I", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29773a = new a();

    /* JADX INFO: renamed from: q4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq4/a$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0581a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0581a f29774a = new C0581a();

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq4/a$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f29775a = new b();

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f29775a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0581a.f29774a.a();
        }
        return 0;
    }
}
